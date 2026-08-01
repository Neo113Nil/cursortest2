package com.bytedance.adsdk.lottie.vG.vG;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: SolidLayer.java */
/* loaded from: classes.dex */
public class yiw extends pvs {
    private final float[] Mxy;
    private final Path Wyp;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> kj;
    private final Jd qh;
    private final Paint so;
    private final RectF yiw;

    yiw(com.bytedance.adsdk.lottie.so soVar, Jd jd) {
        super(soVar, jd);
        this.yiw = new RectF();
        com.bytedance.adsdk.lottie.pvs.pvs pvsVar = new com.bytedance.adsdk.lottie.pvs.pvs();
        this.so = pvsVar;
        this.Mxy = new float[8];
        this.Wyp = new Path();
        this.qh = jd;
        pvsVar.setAlpha(0);
        pvsVar.setStyle(Paint.Style.FILL);
        pvsVar.setColor(jd.mnm());
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs
    public void icD(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.qh.mnm());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.Jd.pvs() == null ? 100 : this.Jd.pvs().yiw().intValue())) / 100.0f) * 255.0f);
        this.so.setAlpha(intValue);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> pvsVar = this.kj;
        if (pvsVar != null) {
            this.so.setColorFilter(pvsVar.yiw());
        }
        if (intValue > 0) {
            float[] fArr = this.Mxy;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.qh.cR();
            float[] fArr2 = this.Mxy;
            fArr2[3] = 0.0f;
            fArr2[4] = this.qh.cR();
            this.Mxy[5] = this.qh.vA();
            float[] fArr3 = this.Mxy;
            fArr3[6] = 0.0f;
            fArr3[7] = this.qh.vA();
            matrix.mapPoints(this.Mxy);
            this.Wyp.reset();
            Path path = this.Wyp;
            float[] fArr4 = this.Mxy;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.Wyp;
            float[] fArr5 = this.Mxy;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.Wyp;
            float[] fArr6 = this.Mxy;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.Wyp;
            float[] fArr7 = this.Mxy;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.Wyp;
            float[] fArr8 = this.Mxy;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.Wyp.close();
            canvas.drawPath(this.Wyp, this.so);
        }
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs, com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        super.pvs(rectF, matrix, z);
        this.yiw.set(0.0f, 0.0f, this.qh.cR(), this.qh.vA());
        this.pvs.mapRect(this.yiw);
        rectF.set(this.yiw);
    }
}
