package com.bytedance.adsdk.fs.zn.zn;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes10.dex */
public class fb extends zmn {
    private final Rect bvs;
    private final Rect iv;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Bitmap, Bitmap> klz;
    protected final com.bytedance.adsdk.fs.iv nps;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> rc;
    private final Paint zg;

    fb(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar) {
        super(bvsVar, btkVar);
        this.zg = new com.bytedance.adsdk.fs.zmn.zmn(3);
        this.bvs = new Rect();
        this.iv = new Rect();
        this.nps = bvsVar.hhw(btkVar.nps());
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public void fs(Canvas canvas, Matrix matrix, int i) {
        super.fs(canvas, matrix, i);
        Bitmap klz = klz();
        if (klz == null || klz.isRecycled() || this.nps == null) {
            return;
        }
        float zmn = com.bytedance.adsdk.fs.hhw.hhw.zmn();
        this.zg.setAlpha(i);
        com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> zmnVar = this.rc;
        if (zmnVar != null) {
            this.zg.setColorFilter(zmnVar.nps());
        }
        canvas.save();
        canvas.concat(matrix);
        this.bvs.set(0, 0, klz.getWidth(), klz.getHeight());
        if (this.fs.btk()) {
            this.iv.set(0, 0, (int) (this.nps.zmn() * zmn), (int) (this.nps.fs() * zmn));
        } else {
            this.iv.set(0, 0, (int) (klz.getWidth() * zmn), (int) (klz.getHeight() * zmn));
        }
        canvas.drawBitmap(klz, this.bvs, this.iv, this.zg);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn, com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        super.zmn(rectF, matrix, z);
        if (this.nps != null) {
            float zmn = com.bytedance.adsdk.fs.hhw.hhw.zmn();
            rectF.set(0.0f, 0.0f, this.nps.zmn() * zmn, this.nps.fs() * zmn);
            this.zmn.mapRect(rectF);
        }
    }

    private Bitmap klz() {
        Bitmap nps;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Bitmap, Bitmap> zmnVar = this.klz;
        if (zmnVar != null && (nps = zmnVar.nps()) != null) {
            return nps;
        }
        Bitmap btk = this.fs.btk(this.zn.nps());
        if (btk != null) {
            return btk;
        }
        com.bytedance.adsdk.fs.iv ivVar = this.nps;
        if (ivVar != null) {
            return ivVar.rc();
        }
        return null;
    }
}
