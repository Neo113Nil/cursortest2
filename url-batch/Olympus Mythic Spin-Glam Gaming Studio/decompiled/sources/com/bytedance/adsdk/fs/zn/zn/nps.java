package com.bytedance.adsdk.fs.zn.zn;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.fs.zn.fs.cyb;
import java.util.Collections;

/* loaded from: classes14.dex */
public class nps extends zmn {
    private final com.bytedance.adsdk.fs.zmn.zmn.fb nps;
    private final fs zg;

    nps(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar, fs fsVar, com.bytedance.adsdk.fs.nps npsVar) {
        super(bvsVar, btkVar);
        this.zg = fsVar;
        com.bytedance.adsdk.fs.zmn.zmn.fb fbVar = new com.bytedance.adsdk.fs.zmn.zmn.fb(bvsVar, this, new cyb("__container", btkVar.rt(), false), npsVar);
        this.nps = fbVar;
        fbVar.zmn(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public void fs(Canvas canvas, Matrix matrix, int i) {
        super.fs(canvas, matrix, i);
        this.nps.zmn(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn, com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        super.zmn(rectF, matrix, z);
        this.nps.zmn(rectF, this.zmn, z);
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public com.bytedance.adsdk.fs.zn.fs.zmn iv() {
        com.bytedance.adsdk.fs.zn.fs.zmn iv = super.iv();
        return iv != null ? iv : this.zg.iv();
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public com.bytedance.adsdk.fs.btk.iv rc() {
        com.bytedance.adsdk.fs.btk.iv rc = super.rc();
        return rc != null ? rc : this.zg.rc();
    }
}
