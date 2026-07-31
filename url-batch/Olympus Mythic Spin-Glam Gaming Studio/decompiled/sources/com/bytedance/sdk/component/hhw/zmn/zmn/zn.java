package com.bytedance.sdk.component.hhw.zmn.zmn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.nps;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class zn implements fb {
    private com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.hhw btk;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn bvs;
    private nps fb;
    private com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zmn fs;
    private com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.btk hhw;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn iv;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn klz;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn nps;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn rc;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zg;
    private com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.fb zmn;
    private com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.fs zn;

    public zn() {
        Context btk = com.bytedance.sdk.component.hhw.zmn.nps.hhw().btk();
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn()) {
            this.nps = com.bytedance.sdk.component.hhw.zmn.nps.hhw().rc();
            this.zmn = new com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.fb(btk, this.nps);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk()) {
            if (com.bytedance.sdk.component.hhw.zmn.nps.hhw().bvs() != null) {
                this.bvs = com.bytedance.sdk.component.hhw.zmn.nps.hhw().bvs();
            } else {
                this.bvs = com.bytedance.sdk.component.hhw.zmn.nps.hhw().klz();
            }
            this.zn = new com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.fs(btk, this.bvs);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs()) {
            this.zg = com.bytedance.sdk.component.hhw.zmn.nps.hhw().klz();
            this.fs = new com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zmn(btk, this.zg);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn()) {
            this.iv = com.bytedance.sdk.component.hhw.zmn.nps.hhw().klz();
            this.fb = new nps(btk, this.iv);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb()) {
            this.rc = com.bytedance.sdk.component.hhw.zmn.nps.hhw().mw();
            this.btk = new com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.hhw(btk, this.rc);
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw()) {
            this.klz = com.bytedance.sdk.component.hhw.zmn.nps.hhw().rt();
            this.hhw = new com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.btk(btk, this.klz);
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar, int i) {
        if (zmnVar == null) {
            return;
        }
        try {
            zmnVar.fs(System.currentTimeMillis());
            if (zmnVar.fb() == 0 && zmnVar.btk() == 1) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn()) {
                    this.zmn.zmn(zmnVar);
                    return;
                }
                return;
            }
            if (zmnVar.fb() == 3 && zmnVar.btk() == 2) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk()) {
                    this.zn.zmn(zmnVar);
                    return;
                }
                return;
            }
            if (zmnVar.fb() == 0 && zmnVar.btk() == 2) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs()) {
                    this.fs.zmn(zmnVar);
                    return;
                }
                return;
            }
            if (zmnVar.fb() == 1 && zmnVar.btk() == 2) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn()) {
                    this.fb.zmn(zmnVar);
                }
            } else if (zmnVar.fb() == 1 && zmnVar.btk() == 3) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb()) {
                    this.btk.zmn(zmnVar);
                }
            } else if (zmnVar.fb() == 2 && zmnVar.btk() == 3 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw()) {
                this.hhw.zmn(zmnVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.tf(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public void zmn(int i, List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar = list.get(0);
        if (i == 200 || i == -1) {
            com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn zmnVar2 = com.bytedance.sdk.component.hhw.zmn.fs.fb.fb;
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar2.tet(), list.size());
            if (i != 200) {
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar2.xrr(), list.size());
            }
            if (zmnVar.fb() == 0 && zmnVar.btk() == 1) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn()) {
                    this.zmn.fs(list);
                    return;
                }
                return;
            }
            if (zmnVar.fb() == 3 && zmnVar.btk() == 2) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk()) {
                    this.zn.fs(list);
                    return;
                }
                return;
            }
            if (zmnVar.fb() == 0 && zmnVar.btk() == 2) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs()) {
                    this.fs.fs(list);
                    return;
                }
                return;
            }
            if (zmnVar.fb() == 1 && zmnVar.btk() == 2) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn()) {
                    this.fb.fs(list);
                }
            } else if (zmnVar.fb() == 1 && zmnVar.btk() == 3) {
                if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb()) {
                    this.btk.fs(list);
                }
            } else if (zmnVar.fb() == 2 && zmnVar.btk() == 3 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw()) {
                this.hhw.fs(list);
            }
        }
    }

    public List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> fs(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar, int i) {
        if (zmnVar.fb() == 0 && zmnVar.btk() == 1 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn()) {
            if (this.nps.fs() <= i) {
                return null;
            }
            List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn = this.zmn.zmn(this.nps.fs() - i, "_id");
            if (zmn != null && zmn.size() != 0) {
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.kjb(), 1);
            }
            return zmn;
        }
        if (zmnVar.fb() == 3 && zmnVar.btk() == 2 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk()) {
            if (this.bvs.fs() > i) {
                return this.zn.zmn(this.bvs.fs() - i, "_id");
            }
        } else if (zmnVar.fb() == 0 && zmnVar.btk() == 2 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs()) {
            if (this.zg.fs() > i) {
                List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn2 = this.fs.zmn(this.zg.fs() - i, "_id");
                if (zmn2 != null && zmn2.size() != 0) {
                    com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.zak(), 1);
                }
                return zmn2;
            }
        } else if (zmnVar.fb() == 1 && zmnVar.btk() == 2 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn()) {
            if (this.iv.fs() > i) {
                List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn3 = this.fb.zmn(this.iv.fs() - i, "_id");
                if (zmn3 != null && zmn3.size() != 0) {
                    com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.am(), 1);
                }
                return zmn3;
            }
        } else if (zmnVar.fb() == 1 && zmnVar.btk() == 3 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb()) {
            if (this.rc.fs() > i) {
                List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn4 = this.btk.zmn(this.rc.fs() - i, "_id");
                if (zmn4 != null && zmn4.size() != 0) {
                    com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.yj(), 1);
                }
                return zmn4;
            }
        } else if (zmnVar.fb() == 2 && zmnVar.btk() == 3 && com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw() && this.klz.fs() > i) {
            return this.hhw.zmn(this.klz.fs() - i, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn(int i, int i2, List<String> list) {
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn()) {
            List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn = this.zmn.zmn("_id");
            if (zmn(zmn, list)) {
                zmn.size();
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.nqi(), 1);
                return zmn;
            }
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk()) {
            List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn2 = this.zn.zmn("_id");
            if (zmn(zmn2, list)) {
                zmn2.size();
                return zmn2;
            }
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs()) {
            List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn3 = this.fs.zmn("_id");
            if (zmn(zmn3, list)) {
                zmn3.size();
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.uqh(), 1);
                return zmn3;
            }
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn()) {
            List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> fs = this.fb.fs("_id");
            if (zmn(fs, list)) {
                fs.size();
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.bjh(), 1);
                return fs;
            }
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb()) {
            List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> fs2 = this.btk.fs("_id");
            if (zmn(fs2, list)) {
                fs2.size();
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.rp(), 1);
                return fs2;
            }
        }
        if (!com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw()) {
            return null;
        }
        List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> fs3 = this.hhw.fs("_id");
        if (!zmn(fs3, list)) {
            return null;
        }
        fs3.size();
        return fs3;
    }

    private boolean zmn(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.hhw.zmn.fb.zmn> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.hhw.zmn.fb.zmn next = it.next();
                    if (next != null) {
                        String zn = next.zn();
                        if (!TextUtils.isEmpty(zn) && list2.contains(zn)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public boolean zmn(int i, boolean z) {
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.btk btkVar;
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.hhw hhwVar;
        nps npsVar;
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zmn zmnVar;
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.fs fsVar;
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.fb fbVar;
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn() && (fbVar = this.zmn) != null && fbVar.zmn(i)) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.rt(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.btk() && (fsVar = this.zn) != null && fsVar.zmn(i)) {
            return true;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.fs() && (zmnVar = this.fs) != null && zmnVar.zmn(i)) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.cn(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.hhw.zmn.fs.zmn.zn() && (npsVar = this.fb) != null && npsVar.zmn(i)) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.cyb(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.hhw.zmn.fs.zmn.fb() || (hhwVar = this.btk) == null || !hhwVar.zmn(i)) {
            return com.bytedance.sdk.component.hhw.zmn.fs.zmn.hhw() && (btkVar = this.hhw) != null && btkVar.zmn(i);
        }
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.olo(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public void zmn(int i, long j) {
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.zmn(i, j);
        }
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.fs fsVar = this.zn;
        if (fsVar != null) {
            fsVar.zmn(i, j);
        }
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zmn zmnVar = this.fs;
        if (zmnVar != null) {
            zmnVar.zmn(i, j);
        }
        nps npsVar = this.fb;
        if (npsVar != null) {
            npsVar.zmn(i, j);
        }
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.hhw hhwVar = this.btk;
        if (hhwVar != null) {
            hhwVar.zmn(i, j);
        }
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.btk btkVar = this.hhw;
        if (btkVar != null) {
            btkVar.zmn(i, j);
        }
    }
}
