package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Path;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import com.bytedance.adsdk.lottie.vG.icD.zM;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public class cR implements pvs.InterfaceC0030pvs, Ju {
    private final com.bytedance.adsdk.lottie.so Jd;
    private final com.bytedance.adsdk.lottie.pvs.icD.Ju NB;
    private final String icD;
    private boolean sUS;
    private final boolean vG;
    private final Path pvs = new Path();
    private final icD yiw = new icD();

    public cR(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.vA vAVar) {
        this.icD = vAVar.pvs();
        this.vG = vAVar.vG();
        this.Jd = soVar;
        com.bytedance.adsdk.lottie.pvs.icD.Ju pvs = vAVar.icD().pvs();
        this.NB = pvs;
        pvsVar.pvs(pvs);
        pvs.pvs(this);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        icD();
    }

    private void icD() {
        this.sUS = false;
        this.Jd.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            vG vGVar = list.get(i);
            if (vGVar instanceof rCZ) {
                rCZ rcz = (rCZ) vGVar;
                if (rcz.icD() == zM.pvs.SIMULTANEOUSLY) {
                    this.yiw.pvs(rcz);
                    rcz.pvs(this);
                }
            }
            if (vGVar instanceof zM) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((zM) vGVar);
            }
        }
        this.NB.pvs((List<zM>) arrayList);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.Ju
    public Path Jd() {
        if (this.sUS) {
            return this.pvs;
        }
        this.pvs.reset();
        if (this.vG) {
            this.sUS = true;
            return this.pvs;
        }
        Path yiw = this.NB.yiw();
        if (yiw == null) {
            return this.pvs;
        }
        this.pvs.set(yiw);
        this.pvs.setFillType(Path.FillType.EVEN_ODD);
        this.yiw.pvs(this.pvs);
        this.sUS = true;
        return this.pvs;
    }
}
