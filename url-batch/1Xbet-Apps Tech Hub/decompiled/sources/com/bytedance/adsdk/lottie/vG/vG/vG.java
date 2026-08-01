package com.bytedance.adsdk.lottie.vG.vG;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.Mxy;

/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public class vG extends pvs {
    private final Rect Mxy;
    private final Mxy Wyp;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Bitmap, Bitmap> kj;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> qh;
    private final Rect so;
    private final Paint yiw;

    vG(com.bytedance.adsdk.lottie.so soVar, Jd jd) {
        super(soVar, jd);
        this.yiw = new com.bytedance.adsdk.lottie.pvs.pvs(3);
        this.so = new Rect();
        this.Mxy = new Rect();
        this.Wyp = soVar.sUS(jd.yiw());
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs
    public void icD(Canvas canvas, Matrix matrix, int i) {
        Bitmap so = so();
        if (so == null || so.isRecycled() || this.Wyp == null) {
            return;
        }
        float pvs = com.bytedance.adsdk.lottie.sUS.sUS.pvs();
        this.yiw.setAlpha(i);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> pvsVar = this.qh;
        if (pvsVar != null) {
            this.yiw.setColorFilter(pvsVar.yiw());
        }
        canvas.save();
        canvas.concat(matrix);
        this.so.set(0, 0, so.getWidth(), so.getHeight());
        if (this.icD.Jd()) {
            this.Mxy.set(0, 0, (int) (this.Wyp.pvs() * pvs), (int) (this.Wyp.icD() * pvs));
        } else {
            this.Mxy.set(0, 0, (int) (so.getWidth() * pvs), (int) (so.getHeight() * pvs));
        }
        canvas.drawBitmap(so, this.so, this.Mxy, this.yiw);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs, com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        super.pvs(rectF, matrix, z);
        if (this.Wyp != null) {
            float pvs = com.bytedance.adsdk.lottie.sUS.sUS.pvs();
            rectF.set(0.0f, 0.0f, this.Wyp.pvs() * pvs, this.Wyp.icD() * pvs);
            this.pvs.mapRect(rectF);
        }
    }

    private Bitmap so() {
        Bitmap yiw;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Bitmap, Bitmap> pvsVar = this.kj;
        if (pvsVar != null && (yiw = pvsVar.yiw()) != null) {
            return yiw;
        }
        Bitmap NB = this.icD.NB(this.vG.yiw());
        if (NB != null) {
            return NB;
        }
        Mxy mxy = this.Wyp;
        if (mxy != null) {
            return mxy.sUS();
        }
        return null;
    }
}
