package com.bytedance.sdk.component.hhw.zmn.zmn;

import com.bytedance.sdk.component.hhw.zmn.zmn.fs.nps;
import java.util.List;
import java.util.Queue;

/* loaded from: classes11.dex */
public class hhw implements fb {
    private nps btk;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn bvs;
    private com.bytedance.sdk.component.hhw.zmn.zmn.fs.fs fb;
    private com.bytedance.sdk.component.hhw.zmn.zmn.fs.btk fs;
    private com.bytedance.sdk.component.hhw.zmn.zmn.fs.zn hhw;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn iv;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn klz;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn mw;
    private com.bytedance.sdk.component.hhw.zmn.zmn.fs.hhw nps;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn rc;
    private Queue<String> rt;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zg;
    btk zmn = com.bytedance.sdk.component.hhw.zmn.nps.hhw().zn();
    private com.bytedance.sdk.component.hhw.zmn.zmn.fs.zmn zn;

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public void zmn(int i, long j) {
    }

    public hhw(Queue<String> queue) {
        this.rt = queue;
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn()) {
            com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn rc = com.bytedance.sdk.component.hhw.zmn.nps.hhw().rc();
            this.zg = rc;
            this.fs = new com.bytedance.sdk.component.hhw.zmn.zmn.fs.btk(rc, queue);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk()) {
            if (com.bytedance.sdk.component.hhw.zmn.nps.hhw().bvs() != null) {
                this.iv = com.bytedance.sdk.component.hhw.zmn.nps.hhw().bvs();
            } else {
                this.iv = com.bytedance.sdk.component.hhw.zmn.nps.hhw().klz();
            }
            this.fb = new com.bytedance.sdk.component.hhw.zmn.zmn.fs.fs(this.iv, queue);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs()) {
            com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn klz = com.bytedance.sdk.component.hhw.zmn.nps.hhw().klz();
            this.bvs = klz;
            this.zn = new com.bytedance.sdk.component.hhw.zmn.zmn.fs.zmn(klz, queue);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn()) {
            com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn klz2 = com.bytedance.sdk.component.hhw.zmn.nps.hhw().klz();
            this.rc = klz2;
            this.btk = new nps(klz2, queue);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb()) {
            com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn mw = com.bytedance.sdk.component.hhw.zmn.nps.hhw().mw();
            this.klz = mw;
            this.hhw = new com.bytedance.sdk.component.hhw.zmn.zmn.fs.zn(mw, queue);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw()) {
            com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn rt = com.bytedance.sdk.component.hhw.zmn.nps.hhw().rt();
            this.mw = rt;
            this.nps = new com.bytedance.sdk.component.hhw.zmn.zmn.fs.hhw(rt, queue);
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar, int i) {
        try {
            byte fb = zmnVar.fb();
            byte btk = zmnVar.btk();
            if (fb == 0 && btk == 1 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn()) {
                this.fs.zmn(zmnVar);
                return;
            }
            if (fb == 3 && btk == 2 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk()) {
                this.fb.zmn(zmnVar);
                return;
            }
            if (fb == 0 && btk == 2 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs()) {
                this.zn.zmn(zmnVar);
                return;
            }
            if (fb == 1 && btk == 2 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn()) {
                this.btk.zmn(zmnVar);
                return;
            }
            if (fb == 1 && btk == 3 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb()) {
                this.hhw.zmn(zmnVar);
            } else if (fb == 2 && btk == 3 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw()) {
                this.nps.zmn(zmnVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public void zmn(int i, List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar = list.get(0);
        byte btk = zmnVar.btk();
        byte fb = zmnVar.fb();
        if (fb == 0 && btk == 1 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn()) {
            this.fs.zmn(i, list);
            return;
        }
        if (fb == 3 && btk == 2 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk()) {
            this.fb.zmn(i, list);
            return;
        }
        if (fb == 0 && btk == 2 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs()) {
            this.zn.zmn(i, list);
            return;
        }
        if (fb == 1 && btk == 2 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn()) {
            this.btk.zmn(i, list);
            return;
        }
        if (fb == 1 && btk == 3 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb()) {
            this.hhw.zmn(i, list);
        } else if (fb == 2 && btk == 3 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw()) {
            this.nps.zmn(i, list);
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn(int i, int i2, List<String> list) {
        List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn;
        List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn2;
        List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn3;
        List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn4;
        List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn5;
        List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn6;
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn() && this.fs.fs(i, i2) && (zmn6 = this.fs.zmn(i, i2)) != null && zmn6.size() != 0) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.kgc(), 1);
            return zmn6;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk() && this.fb.fs(i, i2) && (zmn5 = this.fb.zmn(i, i2)) != null && zmn5.size() != 0) {
            return zmn5;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs() && this.zn.fs(i, i2) && (zmn4 = this.zn.zmn(i, i2)) != null && zmn4.size() != 0) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.kw(), 1);
            return zmn4;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn() && this.btk.fs(i, i2) && (zmn3 = this.btk.zmn(i, i2)) != null && zmn3.size() != 0) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.iqz(), 1);
            return zmn3;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb() && this.hhw.fs(i, i2) && (zmn2 = this.hhw.zmn(i, i2)) != null && zmn2.size() != 0) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.phc(), 1);
            return zmn2;
        }
        if (!com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw() || !this.nps.fs(i, i2) || (zmn = this.nps.zmn(i, i2)) == null || zmn.size() == 0) {
            return null;
        }
        return zmn;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public boolean zmn(int i, boolean z) {
        com.bytedance.sdk.component.hhw.zmn.zmn.fs.hhw hhwVar;
        com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar;
        com.bytedance.sdk.component.hhw.zmn.zmn.fs.zn znVar;
        com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar2;
        nps npsVar;
        com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar3;
        com.bytedance.sdk.component.hhw.zmn.zmn.fs.zmn zmnVar4;
        com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar5;
        com.bytedance.sdk.component.hhw.zmn.zmn.fs.fs fsVar;
        com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar6;
        com.bytedance.sdk.component.hhw.zmn.zmn.fs.btk btkVar;
        com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar7;
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn() && (btkVar = this.fs) != null && (zmnVar7 = this.zg) != null && btkVar.fs(i, zmnVar7.zmn())) {
            return true;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk() && (fsVar = this.fb) != null && (zmnVar6 = this.iv) != null && fsVar.fs(i, zmnVar6.zmn())) {
            return true;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs() && (zmnVar4 = this.zn) != null && (zmnVar5 = this.bvs) != null && zmnVar4.fs(i, zmnVar5.zmn())) {
            return true;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn() && (npsVar = this.btk) != null && (zmnVar3 = this.rc) != null && npsVar.fs(i, zmnVar3.zmn())) {
            return true;
        }
        if (!com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb() || (znVar = this.hhw) == null || (zmnVar2 = this.klz) == null || !znVar.fs(i, zmnVar2.zmn())) {
            return com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw() && (hhwVar = this.nps) != null && (zmnVar = this.mw) != null && hhwVar.fs(i, zmnVar.zmn());
        }
        return true;
    }
}
