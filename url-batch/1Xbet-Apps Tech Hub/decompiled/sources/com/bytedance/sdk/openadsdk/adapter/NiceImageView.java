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
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class NiceImageView extends PAGImageView {
    private final Xfermode IP;
    private int Jd;
    private int Ju;
    private int Mxy;
    private int NB;
    private final Paint OT;
    private int Wyp;
    private Path ZhG;
    private int bNS;
    private final float[] cR;
    private boolean icD;
    private int kj;
    private int mnm;
    private final Path ny;
    private final Context pvs;
    private int qh;
    private final RectF rCZ;
    private int sUS;
    private int so;
    private RectF uc;
    private float vA;
    private boolean vG;
    private int yiw;
    private final float[] zM;

    public NiceImageView(Context context) {
        this(context, null);
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.NB = -1;
        this.yiw = -1;
        this.pvs = context;
        this.so = Pj.icD(context, 10.0f);
        this.cR = new float[8];
        this.zM = new float[8];
        this.rCZ = new RectF();
        this.uc = new RectF();
        this.OT = new Paint();
        this.ny = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.IP = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.IP = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.ZhG = new Path();
        }
        vG();
        Jd();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bNS = i;
        this.mnm = i2;
        pvs();
        icD();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.uc, null, 31);
        if (!this.vG) {
            int i = this.bNS;
            int i2 = this.Jd;
            int i3 = this.sUS;
            int i4 = this.mnm;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.OT.reset();
        this.ny.reset();
        if (this.icD) {
            this.ny.addCircle(this.bNS / 2.0f, this.mnm / 2.0f, this.vA, Path.Direction.CCW);
        } else {
            this.ny.addRoundRect(this.uc, this.zM, Path.Direction.CCW);
        }
        this.OT.setAntiAlias(true);
        this.OT.setStyle(Paint.Style.FILL);
        this.OT.setXfermode(this.IP);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.ny, this.OT);
        } else {
            this.ZhG.addRect(this.uc, Path.Direction.CCW);
            this.ZhG.op(this.ny, Path.Op.DIFFERENCE);
            canvas.drawPath(this.ZhG, this.OT);
        }
        this.OT.setXfermode(null);
        int i5 = this.Ju;
        if (i5 != 0) {
            this.OT.setColor(i5);
            canvas.drawPath(this.ny, this.OT);
        }
        canvas.restore();
        pvs(canvas);
    }

    private void pvs(Canvas canvas) {
        if (this.icD) {
            int i = this.Jd;
            if (i > 0) {
                pvs(canvas, i, this.NB, this.vA - (i / 2.0f));
            }
            int i2 = this.sUS;
            if (i2 > 0) {
                pvs(canvas, i2, this.yiw, (this.vA - this.Jd) - (i2 / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.Jd;
        if (i3 > 0) {
            pvs(canvas, i3, this.NB, this.rCZ, this.cR);
        }
    }

    private void pvs(Canvas canvas, int i, int i2, float f) {
        pvs(i, i2);
        this.ny.addCircle(this.bNS / 2.0f, this.mnm / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.ny, this.OT);
    }

    private void pvs(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        pvs(i, i2);
        this.ny.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.ny, this.OT);
    }

    private void pvs(int i, int i2) {
        this.ny.reset();
        this.OT.setStrokeWidth(i);
        this.OT.setColor(i2);
        this.OT.setStyle(Paint.Style.STROKE);
    }

    private void pvs() {
        if (this.icD) {
            return;
        }
        RectF rectF = this.rCZ;
        int i = this.Jd;
        rectF.set(i / 2.0f, i / 2.0f, this.bNS - (i / 2.0f), this.mnm - (i / 2.0f));
    }

    private void icD() {
        if (this.icD) {
            float min = Math.min(this.bNS, this.mnm) / 2.0f;
            this.vA = min;
            RectF rectF = this.uc;
            int i = this.bNS;
            int i2 = this.mnm;
            rectF.set((i / 2.0f) - min, (i2 / 2.0f) - min, (i / 2.0f) + min, (i2 / 2.0f) + min);
            return;
        }
        this.uc.set(0.0f, 0.0f, this.bNS, this.mnm);
        if (this.vG) {
            this.uc = this.rCZ;
        }
    }

    private void vG() {
        if (this.icD) {
            return;
        }
        int i = 0;
        if (this.so <= 0) {
            float[] fArr = this.cR;
            int i2 = this.Mxy;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.Wyp;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.kj;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.qh;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.zM;
            int i6 = this.Jd;
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
            float[] fArr3 = this.cR;
            if (i >= fArr3.length) {
                return;
            }
            int i7 = this.so;
            fArr3[i] = i7;
            this.zM[i] = i7 - (this.Jd / 2.0f);
            i++;
        }
    }

    private void pvs(boolean z) {
        if (z) {
            this.so = 0;
        }
        vG();
        pvs();
        invalidate();
    }

    private void Jd() {
        if (this.icD) {
            return;
        }
        this.sUS = 0;
    }

    public void isCoverSrc(boolean z) {
        this.vG = z;
        icD();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.icD = z;
        Jd();
        icD();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.Jd = Pj.icD(this.pvs, i);
        pvs(false);
    }

    public void setBorderColor(int i) {
        this.NB = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.sUS = Pj.icD(this.pvs, i);
        Jd();
        invalidate();
    }

    public void setInnerBorderColor(int i) {
        this.yiw = i;
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.so = Pj.icD(this.pvs, i);
        pvs(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.Mxy = Pj.icD(this.pvs, i);
        pvs(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.Wyp = Pj.icD(this.pvs, i);
        pvs(true);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.qh = Pj.icD(this.pvs, i);
        pvs(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.kj = Pj.icD(this.pvs, i);
        pvs(true);
    }

    public void setMaskColor(int i) {
        this.Ju = i;
        invalidate();
    }
}
