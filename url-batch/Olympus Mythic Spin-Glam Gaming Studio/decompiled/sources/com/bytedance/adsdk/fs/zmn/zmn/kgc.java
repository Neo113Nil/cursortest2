package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Path;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import com.bytedance.adsdk.fs.zn.fs.kw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class kgc implements zmn.InterfaceC0104zmn, mw {
    private final com.bytedance.adsdk.fs.zmn.fs.mw btk;
    private final com.bytedance.adsdk.fs.bvs fb;
    private final String fs;
    private boolean hhw;
    private final boolean zn;
    private final Path zmn = new Path();
    private final fs nps = new fs();

    public kgc(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.olo oloVar) {
        this.fs = oloVar.zmn();
        this.zn = oloVar.zn();
        this.fb = bvsVar;
        com.bytedance.adsdk.fs.zmn.fs.mw zmn = oloVar.fs().zmn();
        this.btk = zmn;
        zmnVar.zmn(zmn);
        zmn.zmn(this);
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        fs();
    }

    private void fs() {
        this.hhw = false;
        this.fb.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            zn znVar = list.get(i);
            if (znVar instanceof phc) {
                phc phcVar = (phc) znVar;
                if (phcVar.fs() == kw.zmn.SIMULTANEOUSLY) {
                    this.nps.zmn(phcVar);
                    phcVar.zmn(this);
                }
            }
            if (znVar instanceof kw) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((kw) znVar);
            }
        }
        this.btk.zmn((List<kw>) arrayList);
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.mw
    public Path fb() {
        if (this.hhw) {
            return this.zmn;
        }
        this.zmn.reset();
        if (this.zn) {
            this.hhw = true;
            return this.zmn;
        }
        Path nps = this.btk.nps();
        if (nps == null) {
            return this.zmn;
        }
        this.zmn.set(nps);
        this.zmn.setFillType(Path.FillType.EVEN_ODD);
        this.nps.zmn(this.zmn);
        this.hhw = true;
        return this.zmn;
    }
}
