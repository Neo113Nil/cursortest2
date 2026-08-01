package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.Ju;

/* loaded from: classes.dex */
public class GifView extends ImageView {
    private boolean IP;
    private AnimatedImageDrawable Jd;
    private boolean Ju;
    private float Mxy;
    private boolean NB;
    private int Wyp;
    private long icD;
    private volatile boolean kj;
    private Movie pvs;
    private int qh;
    private boolean sUS;
    private float so;
    private int vG;
    private float yiw;

    public GifView(Context context) {
        super(context);
        this.NB = Build.VERSION.SDK_INT >= 28;
        this.sUS = false;
        this.Ju = true;
        this.IP = true;
        pvs();
    }

    void pvs() {
        if (this.NB) {
            return;
        }
        setLayerType(1, null);
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
            this.Jd = animatedImageDrawable;
            if (!this.kj) {
                animatedImageDrawable.start();
            }
            if (!this.IP) {
                animatedImageDrawable.setRepeatCount(0);
            }
        }
        icD();
    }

    public void setRepeatConfig(boolean z) {
        AnimatedImageDrawable animatedImageDrawable;
        this.IP = z;
        if (z) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.Jd) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e) {
            Ju.pvs("GifView", "setRepeatConfig error", e);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (this.NB || (movie = this.pvs) == null) {
            return;
        }
        int width = movie.width();
        int height = this.pvs.height();
        float max = 1.0f / Math.max((View.MeasureSpec.getMode(i) == 0 || width <= (size2 = View.MeasureSpec.getSize(i))) ? 1.0f : width / size2, (View.MeasureSpec.getMode(i2) == 0 || height <= (size = View.MeasureSpec.getSize(i2))) ? 1.0f : height / size);
        this.Mxy = max;
        int i3 = (int) (width * max);
        this.Wyp = i3;
        int i4 = (int) (height * max);
        this.qh = i4;
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.pvs != null && !this.NB) {
            this.yiw = (getWidth() - this.Wyp) / 2.0f;
            this.so = (getHeight() - this.qh) / 2.0f;
        }
        this.Ju = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.pvs != null && !this.NB) {
            try {
                if (!this.kj) {
                    vG();
                    pvs(canvas);
                    icD();
                    return;
                }
                pvs(canvas);
                return;
            } catch (Throwable th) {
                Ju.pvs("GifView", "onDraw->Throwable->", th);
                return;
            }
        }
        super.onDraw(canvas);
    }

    private void icD() {
        if (this.pvs == null || this.NB || !this.Ju) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void vG() {
        if (this.pvs == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.icD == 0) {
            this.icD = uptimeMillis;
        }
        int duration = this.pvs.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.IP && Math.abs(duration - this.vG) < 60) {
            this.vG = duration;
            this.kj = true;
        } else {
            this.vG = (int) ((uptimeMillis - this.icD) % duration);
        }
    }

    private void pvs(Canvas canvas) {
        Movie movie = this.pvs;
        if (movie == null) {
            return;
        }
        movie.setTime(this.vG);
        float f = this.Mxy;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.pvs.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.pvs;
            float f2 = this.yiw;
            float f3 = this.Mxy;
            movie2.draw(canvas, f2 / f3, this.so / f3);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.pvs != null) {
            this.Ju = i == 1;
            icD();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.pvs != null) {
            this.Ju = i == 0;
            icD();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.pvs != null) {
            this.Ju = i == 0;
            icD();
        }
    }
}
