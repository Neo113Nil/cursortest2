package com.bytedance.adsdk.fs.zn.zn;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes6.dex */
public class hhw extends zmn {
    hhw(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar) {
        super(bvsVar, btkVar);
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public void fs(Canvas canvas, Matrix matrix, int i) {
        super.fs(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn, com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        super.zmn(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
