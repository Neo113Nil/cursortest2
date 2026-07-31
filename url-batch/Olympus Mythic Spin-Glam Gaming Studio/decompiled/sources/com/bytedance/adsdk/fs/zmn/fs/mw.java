package com.bytedance.adsdk.fs.zmn.fs;

import android.graphics.Path;
import com.bytedance.adsdk.fs.zmn.zmn.kw;
import java.util.List;

/* loaded from: classes3.dex */
public class mw extends zmn<com.bytedance.adsdk.fs.zn.fs.rt, Path> {
    private final Path btk;
    private final com.bytedance.adsdk.fs.zn.fs.rt fb;
    private List<kw> hhw;

    public mw(List<com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.zn.fs.rt>> list) {
        super(list);
        this.fb = new com.bytedance.adsdk.fs.zn.fs.rt();
        this.btk = new Path();
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public Path zmn(com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.zn.fs.rt> zmnVar, float f) {
        this.fb.zmn(zmnVar.zmn, zmnVar.fs, f);
        com.bytedance.adsdk.fs.zn.fs.rt rtVar = this.fb;
        List<kw> list = this.hhw;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                rtVar = this.hhw.get(size).zmn(rtVar);
            }
        }
        com.bytedance.adsdk.fs.hhw.btk.zmn(rtVar, this.btk);
        return this.btk;
    }

    public void zmn(List<kw> list) {
        this.hhw = list;
    }
}
