package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.sUS;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public class GifView extends ImageView {
    private boolean IP;
    private int Jd;
    private volatile boolean Ju;
    private float Mxy;
    private AnimatedImageDrawable NB;
    private float Wyp;
    private boolean bNS;
    private Movie icD;
    private int kj;
    private int pvs;
    private int qh;
    private boolean sUS;
    private float so;
    private long vG;
    private boolean yiw;

    public GifView(Context context) {
        super(context);
        this.sUS = Build.VERSION.SDK_INT >= 28;
        this.yiw = false;
        this.IP = true;
        this.bNS = true;
        pvs();
    }

    void pvs() {
        if (this.sUS) {
            return;
        }
        setLayerType(1, null);
    }

    public void pvs(int i, boolean z) {
        this.Ju = z;
        this.pvs = i;
        if (i != -1) {
            if (!this.sUS) {
                this.icD = pvs(i);
            } else {
                this.NB = icD(i);
            }
        }
    }

    public void pvs(byte[] bArr, boolean z) {
        this.Ju = z;
        if (bArr != null) {
            if (!this.sUS) {
                this.icD = pvs(bArr);
            } else {
                this.NB = icD(bArr);
            }
            icD();
        }
    }

    public void setRepeatConfig(boolean z) {
        AnimatedImageDrawable animatedImageDrawable;
        this.bNS = z;
        if (z) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.NB) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e) {
            Ju.pvs("GifView", "setRepeatConfig error", e);
        }
    }

    private Movie pvs(int i) {
        try {
            return Movie.decodeStream(getResources().openRawResource(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    private Movie pvs(byte[] bArr) {
        try {
            return Movie.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    private AnimatedImageDrawable icD(int i) {
        if (i != -1 && Build.VERSION.SDK_INT >= 28) {
            return pvs(ImageDecoder.createSource(getResources(), i));
        }
        return null;
    }

    private AnimatedImageDrawable icD(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return pvs(vG(bArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r2 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ImageDecoder.Source vG(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            File pvs = pvs(getContext(), com.bytedance.sdk.openadsdk.multipro.icD.vG() ? "GIF_AD_CACHE/" : "/GIF_CACHE/", "TT_GIF_FILE");
            fileOutputStream = new FileOutputStream(pvs);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    ImageDecoder.Source createSource = ImageDecoder.createSource(pvs);
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    return createSource;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    Ju.pvs("GifView", "GifView  getSourceByFile fail : ", th);
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.close();
        } catch (Throwable unused3) {
        }
        return null;
    }

    private AnimatedImageDrawable pvs(ImageDecoder.Source source) {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source);
        setImageDrawable(decodeDrawable);
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) decodeDrawable;
            if (!this.Ju) {
                animatedImageDrawable.start();
            }
            return animatedImageDrawable;
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (this.sUS || (movie = this.icD) == null) {
            return;
        }
        int width = movie.width();
        int height = this.icD.height();
        float max = 1.0f / Math.max((View.MeasureSpec.getMode(i) == 0 || width <= (size2 = View.MeasureSpec.getSize(i))) ? 1.0f : width / size2, (View.MeasureSpec.getMode(i2) == 0 || height <= (size = View.MeasureSpec.getSize(i2))) ? 1.0f : height / size);
        this.Wyp = max;
        int i3 = (int) (width * max);
        this.qh = i3;
        int i4 = (int) (height * max);
        this.kj = i4;
        setMeasuredDimension(i3, i4);
    }

    public static File pvs(Context context, String str, String str2) {
        return sUS.pvs(context, com.bytedance.sdk.openadsdk.multipro.icD.vG(), str, str2);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.icD != null && !this.sUS) {
            this.so = (getWidth() - this.qh) / 2.0f;
            this.Mxy = (getHeight() - this.kj) / 2.0f;
        }
        this.IP = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.icD != null && !this.sUS) {
            try {
                if (!this.Ju) {
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
        if (this.icD == null || this.sUS || !this.IP) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void vG() {
        if (this.icD == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.vG == 0) {
            this.vG = uptimeMillis;
        }
        int duration = this.icD.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.bNS && Math.abs(duration - this.Jd) < 60) {
            this.Jd = duration;
            this.Ju = true;
        } else {
            this.Jd = (int) ((uptimeMillis - this.vG) % duration);
        }
    }

    private void pvs(Canvas canvas) {
        Movie movie = this.icD;
        if (movie == null) {
            return;
        }
        movie.setTime(this.Jd);
        float f = this.Wyp;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.icD.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.icD;
            float f2 = this.so;
            float f3 = this.Wyp;
            movie2.draw(canvas, f2 / f3, this.Mxy / f3);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.icD != null) {
            this.IP = i == 1;
            icD();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.icD != null) {
            this.IP = i == 0;
            icD();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.icD != null) {
            this.IP = i == 0;
            icD();
        }
    }
}
