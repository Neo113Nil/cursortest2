package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.hhw.fb;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class NiceImageView extends fb {
    private int btk;
    private int bvs;
    private int cn;
    private int cyb;
    private final Paint doe;
    private int fb;
    private boolean fs;
    private int hhw;
    private RectF iqz;
    private int iv;
    private final float[] kgc;
    private int klz;
    private final float[] kw;
    private int mw;
    private int nps;
    private final Path nqi;
    private float olo;
    private final RectF phc;
    private int rc;
    private final Xfermode rt;
    private Path uqh;
    private int zg;
    private final Context zmn;
    private boolean zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public NiceImageView(Context context) {
        this(context, null);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.btk = -1;
        this.nps = -1;
        this.zmn = context;
        this.zg = jy.fs(context, 10.0f);
        this.kgc = new float[8];
        this.kw = new float[8];
        this.phc = new RectF();
        this.iqz = new RectF();
        this.doe = new Paint();
        this.nqi = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.rt = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.rt = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.uqh = new Path();
        }
        zn();
        fb();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.cn = i;
        this.cyb = i2;
        zmn();
        fs();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.iqz, null, 31);
        if (!this.zn) {
            int i = this.cn;
            int i2 = this.fb;
            int i3 = this.hhw;
            int i4 = this.cyb;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.doe.reset();
        this.nqi.reset();
        if (this.fs) {
            this.nqi.addCircle(this.cn / 2.0f, this.cyb / 2.0f, this.olo, Path.Direction.CCW);
        } else {
            this.nqi.addRoundRect(this.iqz, this.kw, Path.Direction.CCW);
        }
        this.doe.setAntiAlias(true);
        this.doe.setStyle(Paint.Style.FILL);
        this.doe.setXfermode(this.rt);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.nqi, this.doe);
        } else {
            this.uqh.addRect(this.iqz, Path.Direction.CCW);
            this.uqh.op(this.nqi, Path.Op.DIFFERENCE);
            canvas.drawPath(this.uqh, this.doe);
        }
        this.doe.setXfermode(null);
        int i5 = this.mw;
        if (i5 != 0) {
            this.doe.setColor(i5);
            canvas.drawPath(this.nqi, this.doe);
        }
        canvas.restore();
        zmn(canvas);
    }

    private void zmn(Canvas canvas) {
        if (this.fs) {
            int i = this.fb;
            if (i > 0) {
                zmn(canvas, i, this.btk, this.olo - (i / 2.0f));
            }
            int i2 = this.hhw;
            if (i2 > 0) {
                zmn(canvas, i2, this.nps, (this.olo - this.fb) - (i2 / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.fb;
        if (i3 > 0) {
            zmn(canvas, i3, this.btk, this.phc, this.kgc);
        }
    }

    private void zmn(Canvas canvas, int i, int i2, float f) {
        zmn(i, i2);
        this.nqi.addCircle(this.cn / 2.0f, this.cyb / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.nqi, this.doe);
    }

    private void zmn(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        zmn(i, i2);
        this.nqi.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.nqi, this.doe);
    }

    private void zmn(int i, int i2) {
        this.nqi.reset();
        this.doe.setStrokeWidth(i);
        this.doe.setColor(i2);
        this.doe.setStyle(Paint.Style.STROKE);
    }

    private void zmn() {
        if (this.fs) {
            return;
        }
        RectF rectF = this.phc;
        int i = this.fb;
        rectF.set(i / 2.0f, i / 2.0f, this.cn - (i / 2.0f), this.cyb - (i / 2.0f));
    }

    private void fs() {
        if (this.fs) {
            float min = Math.min(this.cn, this.cyb) / 2.0f;
            this.olo = min;
            RectF rectF = this.iqz;
            int i = this.cn;
            int i2 = this.cyb;
            rectF.set((i / 2.0f) - min, (i2 / 2.0f) - min, (i / 2.0f) + min, (i2 / 2.0f) + min);
            return;
        }
        this.iqz.set(0.0f, 0.0f, this.cn, this.cyb);
        if (this.zn) {
            this.iqz = this.phc;
        }
    }

    private void zn() {
        if (this.fs) {
            return;
        }
        int i = 0;
        if (this.zg <= 0) {
            float[] fArr = this.kgc;
            int i2 = this.bvs;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.iv;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.klz;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.rc;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.kw;
            int i6 = this.fb;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.kgc;
            if (i >= fArr3.length) {
                return;
            }
            int i7 = this.zg;
            fArr3[i] = i7;
            this.kw[i] = i7 - (this.fb / 2.0f);
            i++;
        }
    }

    private void zmn(boolean z) {
        if (z) {
            this.zg = 0;
        }
        zn();
        zmn();
        invalidate();
    }

    private void fb() {
        if (this.fs) {
            return;
        }
        this.hhw = 0;
    }

    public void isCoverSrc(boolean z) {
        this.zn = z;
        fs();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.fs = z;
        fb();
        fs();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.fb = jy.fs(this.zmn, i);
        zmn(false);
    }

    public void setBorderColor(@ColorInt int i) {
        this.btk = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.hhw = jy.fs(this.zmn, i);
        fb();
        invalidate();
    }

    public void setInnerBorderColor(@ColorInt int i) {
        this.nps = i;
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.zg = jy.fs(this.zmn, i);
        zmn(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.bvs = jy.fs(this.zmn, i);
        zmn(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.iv = jy.fs(this.zmn, i);
        zmn(true);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.rc = jy.fs(this.zmn, i);
        zmn(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.klz = jy.fs(this.zmn, i);
        zmn(true);
    }

    public void setMaskColor(@ColorInt int i) {
        this.mw = i;
        invalidate();
    }
}
