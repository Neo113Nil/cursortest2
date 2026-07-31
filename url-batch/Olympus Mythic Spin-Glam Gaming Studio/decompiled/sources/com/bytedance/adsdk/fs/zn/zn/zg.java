package com.bytedance.adsdk.fs.zn.zn;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes5.dex */
public class zg extends zmn {
    private final float[] bvs;
    private final Path iv;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> klz;
    private final RectF nps;
    private final btk rc;
    private final Paint zg;

    zg(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar) {
        super(bvsVar, btkVar);
        this.nps = new RectF();
        com.bytedance.adsdk.fs.zmn.zmn zmnVar = new com.bytedance.adsdk.fs.zmn.zmn();
        this.zg = zmnVar;
        this.bvs = new float[8];
        this.iv = new Path();
        this.rc = btkVar;
        zmnVar.setAlpha(0);
        zmnVar.setStyle(Paint.Style.FILL);
        zmnVar.setColor(btkVar.cyb());
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public void fs(Canvas canvas, Matrix matrix, int i) {
        super.fs(canvas, matrix, i);
        int alpha = Color.alpha(this.rc.cyb());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.fb.zmn() == null ? 100 : this.fb.zmn().nps().intValue())) / 100.0f) * 255.0f);
        this.zg.setAlpha(intValue);
        com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> zmnVar = this.klz;
        if (zmnVar != null) {
            this.zg.setColorFilter(zmnVar.nps());
        }
        if (intValue > 0) {
            float[] fArr = this.bvs;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.rc.kgc();
            float[] fArr2 = this.bvs;
            fArr2[3] = 0.0f;
            fArr2[4] = this.rc.kgc();
            this.bvs[5] = this.rc.olo();
            float[] fArr3 = this.bvs;
            fArr3[6] = 0.0f;
            fArr3[7] = this.rc.olo();
            matrix.mapPoints(this.bvs);
            this.iv.reset();
            Path path = this.iv;
            float[] fArr4 = this.bvs;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.iv;
            float[] fArr5 = this.bvs;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.iv;
            float[] fArr6 = this.bvs;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.iv;
            float[] fArr7 = this.bvs;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.iv;
            float[] fArr8 = this.bvs;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.iv.close();
            canvas.drawPath(this.iv, this.zg);
        }
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn, com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        super.zmn(rectF, matrix, z);
        this.nps.set(0.0f, 0.0f, this.rc.kgc(), this.rc.olo());
        this.zmn.mapRect(this.nps);
        rectF.set(this.nps);
    }
}
