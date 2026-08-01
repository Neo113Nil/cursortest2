package com.bytedance.sdk.component.sUS.pvs.pvs;

import com.bytedance.sdk.component.sUS.pvs.pvs.icD.yiw;
import com.bytedance.sdk.component.sUS.pvs.so;
import java.util.List;
import java.util.Queue;

/* compiled from: RealTimeMemoryCacheStrategy.java */
/* loaded from: classes.dex */
public class sUS implements Jd {
    private Queue<String> IP;
    private com.bytedance.sdk.component.sUS.pvs.pvs.icD.icD Jd;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Ju;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Mxy;
    private yiw NB;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Wyp;
    private com.bytedance.sdk.component.sUS.pvs.pvs.icD.NB icD;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs kj;
    NB pvs = so.yiw().Jd();
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs qh;
    private com.bytedance.sdk.component.sUS.pvs.pvs.icD.vG sUS;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs so;
    private com.bytedance.sdk.component.sUS.pvs.pvs.icD.pvs vG;
    private com.bytedance.sdk.component.sUS.pvs.pvs.icD.sUS yiw;

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public void pvs(int i, long j) {
    }

    public sUS(Queue<String> queue) {
        this.IP = queue;
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs()) {
            this.so = so.yiw().kj();
            this.icD = new com.bytedance.sdk.component.sUS.pvs.pvs.icD.NB(this.so, queue);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB()) {
            if (so.yiw().Wyp() != null) {
                this.Wyp = so.yiw().Wyp();
            } else {
                this.Wyp = so.yiw().Ju();
            }
            this.Jd = new com.bytedance.sdk.component.sUS.pvs.pvs.icD.icD(this.Wyp, queue);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD()) {
            this.Mxy = so.yiw().Ju();
            this.vG = new com.bytedance.sdk.component.sUS.pvs.pvs.icD.pvs(this.Mxy, queue);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG()) {
            this.qh = so.yiw().Ju();
            this.NB = new yiw(this.qh, queue);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd()) {
            this.kj = so.yiw().IP();
            this.sUS = new com.bytedance.sdk.component.sUS.pvs.pvs.icD.vG(this.kj, queue);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS()) {
            this.Ju = so.yiw().bNS();
            this.yiw = new com.bytedance.sdk.component.sUS.pvs.pvs.icD.sUS(this.Ju, queue);
        }
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, int i) {
        try {
            byte Jd = pvsVar.Jd();
            byte NB = pvsVar.NB();
            if (Jd == 0 && NB == 1 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs()) {
                this.icD.pvs(pvsVar);
                return;
            }
            if (Jd == 3 && NB == 2 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB()) {
                this.Jd.pvs(pvsVar);
                return;
            }
            if (Jd == 0 && NB == 2 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD()) {
                this.vG.pvs(pvsVar);
                return;
            }
            if (Jd == 1 && NB == 2 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG()) {
                this.NB.pvs(pvsVar);
                return;
            }
            if (Jd == 1 && NB == 3 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd()) {
                this.sUS.pvs(pvsVar);
            } else if (Jd == 2 && NB == 3 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS()) {
                this.yiw.pvs(pvsVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public void pvs(int i, List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar = list.get(0);
        byte NB = pvsVar.NB();
        byte Jd = pvsVar.Jd();
        if (Jd == 0 && NB == 1 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs()) {
            this.icD.pvs(i, list);
            return;
        }
        if (Jd == 3 && NB == 2 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB()) {
            this.Jd.pvs(i, list);
            return;
        }
        if (Jd == 0 && NB == 2 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD()) {
            this.vG.pvs(i, list);
            return;
        }
        if (Jd == 1 && NB == 2 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG()) {
            this.NB.pvs(i, list);
            return;
        }
        if (Jd == 1 && NB == 3 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd()) {
            this.sUS.pvs(i, list);
        } else if (Jd == 2 && NB == 3 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS()) {
            this.yiw.pvs(i, list);
        }
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs(int i, int i2, List<String> list) {
        List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs;
        List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs2;
        List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs3;
        List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs4;
        List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs5;
        List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs6;
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs() && this.icD.icD(i, i2) && (pvs6 = this.icD.pvs(i, i2)) != null && pvs6.size() != 0) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.cR(), 1);
            return pvs6;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB() && this.Jd.icD(i, i2) && (pvs5 = this.Jd.pvs(i, i2)) != null && pvs5.size() != 0) {
            return pvs5;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD() && this.vG.icD(i, i2) && (pvs4 = this.vG.pvs(i, i2)) != null && pvs4.size() != 0) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.zM(), 1);
            return pvs4;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG() && this.NB.icD(i, i2) && (pvs3 = this.NB.pvs(i, i2)) != null && pvs3.size() != 0) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.uc(), 1);
            return pvs3;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd() && this.sUS.icD(i, i2) && (pvs2 = this.sUS.pvs(i, i2)) != null && pvs2.size() != 0) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.rCZ(), 1);
            return pvs2;
        }
        if (!com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS() || !this.yiw.icD(i, i2) || (pvs = this.yiw.pvs(i, i2)) == null || pvs.size() == 0) {
            return null;
        }
        return pvs;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public boolean pvs(int i, boolean z) {
        com.bytedance.sdk.component.sUS.pvs.pvs.icD.sUS sus;
        com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar;
        com.bytedance.sdk.component.sUS.pvs.pvs.icD.vG vGVar;
        com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar2;
        yiw yiwVar;
        com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar3;
        com.bytedance.sdk.component.sUS.pvs.pvs.icD.pvs pvsVar4;
        com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar5;
        com.bytedance.sdk.component.sUS.pvs.pvs.icD.icD icd;
        com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar6;
        com.bytedance.sdk.component.sUS.pvs.pvs.icD.NB nb;
        com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar7;
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs() && (nb = this.icD) != null && (pvsVar7 = this.so) != null && nb.icD(i, pvsVar7.pvs())) {
            return true;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB() && (icd = this.Jd) != null && (pvsVar6 = this.Wyp) != null && icd.icD(i, pvsVar6.pvs())) {
            return true;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD() && (pvsVar4 = this.vG) != null && (pvsVar5 = this.Mxy) != null && pvsVar4.icD(i, pvsVar5.pvs())) {
            return true;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG() && (yiwVar = this.NB) != null && (pvsVar3 = this.qh) != null && yiwVar.icD(i, pvsVar3.pvs())) {
            return true;
        }
        if (!com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd() || (vGVar = this.sUS) == null || (pvsVar2 = this.kj) == null || !vGVar.icD(i, pvsVar2.pvs())) {
            return com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS() && (sus = this.yiw) != null && (pvsVar = this.Ju) != null && sus.icD(i, pvsVar.pvs());
        }
        return true;
    }
}
