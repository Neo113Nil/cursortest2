package com.bytedance.sdk.component.sUS.pvs.pvs;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.yiw;
import com.bytedance.sdk.component.sUS.pvs.so;
import java.util.Iterator;
import java.util.List;

/* compiled from: DBCacheStrategy.java */
/* loaded from: classes.dex */
public class vG implements Jd {
    private yiw Jd;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Mxy;
    private com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.sUS NB;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Wyp;
    private com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.pvs icD;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs kj;
    private com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.Jd pvs;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs qh;
    private com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.NB sUS;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs so;
    private com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.icD vG;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs yiw;

    public vG() {
        Context sUS = so.yiw().sUS();
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs()) {
            this.yiw = so.yiw().kj();
            this.pvs = new com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.Jd(sUS, this.yiw);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB()) {
            if (so.yiw().Wyp() != null) {
                this.Mxy = so.yiw().Wyp();
            } else {
                this.Mxy = so.yiw().Ju();
            }
            this.vG = new com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.icD(sUS, this.Mxy);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD()) {
            this.so = so.yiw().Ju();
            this.icD = new com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.pvs(sUS, this.so);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG()) {
            this.Wyp = so.yiw().Ju();
            this.Jd = new yiw(sUS, this.Wyp);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd()) {
            this.qh = so.yiw().IP();
            this.NB = new com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.sUS(sUS, this.qh);
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS()) {
            this.kj = so.yiw().bNS();
            this.sUS = new com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.NB(sUS, this.kj);
        }
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, int i) {
        if (pvsVar == null) {
            return;
        }
        try {
            pvsVar.icD(System.currentTimeMillis());
            if (pvsVar.Jd() == 0 && pvsVar.NB() == 1) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs()) {
                    this.pvs.pvs(pvsVar);
                    return;
                }
                return;
            }
            if (pvsVar.Jd() == 3 && pvsVar.NB() == 2) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB()) {
                    this.vG.pvs(pvsVar);
                    return;
                }
                return;
            }
            if (pvsVar.Jd() == 0 && pvsVar.NB() == 2) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD()) {
                    this.icD.pvs(pvsVar);
                    return;
                }
                return;
            }
            if (pvsVar.Jd() == 1 && pvsVar.NB() == 2) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG()) {
                    this.Jd.pvs(pvsVar);
                }
            } else if (pvsVar.Jd() == 1 && pvsVar.NB() == 3) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd()) {
                    this.NB.pvs(pvsVar);
                }
            } else if (pvsVar.Jd() == 2 && pvsVar.NB() == 3 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS()) {
                this.sUS.pvs(pvsVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.Pj(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public void pvs(int i, List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar = list.get(0);
        if (i == 200 || i == -1) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.joF(), list.size());
            if (i != 200) {
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.qd(), list.size());
            }
            if (pvsVar.Jd() == 0 && pvsVar.NB() == 1) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs()) {
                    this.pvs.icD(list);
                    return;
                }
                return;
            }
            if (pvsVar.Jd() == 3 && pvsVar.NB() == 2) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB()) {
                    this.vG.icD(list);
                    return;
                }
                return;
            }
            if (pvsVar.Jd() == 0 && pvsVar.NB() == 2) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD()) {
                    this.icD.icD(list);
                    return;
                }
                return;
            }
            if (pvsVar.Jd() == 1 && pvsVar.NB() == 2) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG()) {
                    this.Jd.icD(list);
                }
            } else if (pvsVar.Jd() == 1 && pvsVar.NB() == 3) {
                if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd()) {
                    this.NB.icD(list);
                }
            } else if (pvsVar.Jd() == 2 && pvsVar.NB() == 3 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS()) {
                this.sUS.icD(list);
            }
        }
    }

    public List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> icD(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, int i) {
        if (pvsVar.Jd() == 0 && pvsVar.NB() == 1 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs()) {
            if (this.yiw.icD() <= i) {
                return null;
            }
            List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs = this.pvs.pvs(this.yiw.icD() - i, "_id");
            if (pvs != null && pvs.size() != 0) {
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.CvL(), 1);
            }
            return pvs;
        }
        if (pvsVar.Jd() == 3 && pvsVar.NB() == 2 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB()) {
            if (this.Mxy.icD() > i) {
                return this.vG.pvs(this.Mxy.icD() - i, "_id");
            }
        } else if (pvsVar.Jd() == 0 && pvsVar.NB() == 2 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD()) {
            if (this.so.icD() > i) {
                List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs2 = this.icD.pvs(this.so.icD() - i, "_id");
                if (pvs2 != null && pvs2.size() != 0) {
                    com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.Gp(), 1);
                }
                return pvs2;
            }
        } else if (pvsVar.Jd() == 1 && pvsVar.NB() == 2 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG()) {
            if (this.Wyp.icD() > i) {
                List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs3 = this.Jd.pvs(this.Wyp.icD() - i, "_id");
                if (pvs3 != null && pvs3.size() != 0) {
                    com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.ae(), 1);
                }
                return pvs3;
            }
        } else if (pvsVar.Jd() == 1 && pvsVar.NB() == 3 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd()) {
            if (this.qh.icD() > i) {
                List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs4 = this.NB.pvs(this.qh.icD() - i, "_id");
                if (pvs4 != null && pvs4.size() != 0) {
                    com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.gA(), 1);
                }
                return pvs4;
            }
        } else if (pvsVar.Jd() == 2 && pvsVar.NB() == 3 && com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS() && this.kj.icD() > i) {
            return this.sUS.pvs(this.kj.icD() - i, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs(int i, int i2, List<String> list) {
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs()) {
            List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs = this.pvs.pvs("_id");
            if (pvs(pvs, list)) {
                pvs.size();
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.ny(), 1);
                return pvs;
            }
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB()) {
            List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs2 = this.vG.pvs("_id");
            if (pvs(pvs2, list)) {
                pvs2.size();
                return pvs2;
            }
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD()) {
            List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs3 = this.icD.pvs("_id");
            if (pvs(pvs3, list)) {
                pvs3.size();
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.ZhG(), 1);
                return pvs3;
            }
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG()) {
            List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> icD = this.Jd.icD("_id");
            if (pvs(icD, list)) {
                icD.size();
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.dyT(), 1);
                return icD;
            }
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd()) {
            List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> icD2 = this.NB.icD("_id");
            if (pvs(icD2, list)) {
                icD2.size();
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.dX(), 1);
                return icD2;
            }
        }
        if (!com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS()) {
            return null;
        }
        List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> icD3 = this.sUS.icD("_id");
        if (!pvs(icD3, list)) {
            return null;
        }
        icD3.size();
        return icD3;
    }

    private boolean pvs(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.sUS.pvs.Jd.pvs next = it.next();
                    if (next != null) {
                        String vG = next.vG();
                        if (!TextUtils.isEmpty(vG) && list2.contains(vG)) {
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

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public boolean pvs(int i, boolean z) {
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.NB nb;
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.sUS sus;
        yiw yiwVar;
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.pvs pvsVar;
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.icD icd;
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.Jd jd;
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs() && (jd = this.pvs) != null && jd.pvs(i)) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.IP(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.NB() && (icd = this.vG) != null && icd.pvs(i)) {
            return true;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.icD() && (pvsVar = this.icD) != null && pvsVar.pvs(i)) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.bNS(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.sUS.pvs.icD.pvs.vG() && (yiwVar = this.Jd) != null && yiwVar.pvs(i)) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.mnm(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.sUS.pvs.icD.pvs.Jd() || (sus = this.NB) == null || !sus.pvs(i)) {
            return com.bytedance.sdk.component.sUS.pvs.icD.pvs.sUS() && (nb = this.sUS) != null && nb.pvs(i);
        }
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.vA(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public void pvs(int i, long j) {
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.Jd jd = this.pvs;
        if (jd != null) {
            jd.pvs(i, j);
        }
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.icD icd = this.vG;
        if (icd != null) {
            icd.pvs(i, j);
        }
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.pvs pvsVar = this.icD;
        if (pvsVar != null) {
            pvsVar.pvs(i, j);
        }
        yiw yiwVar = this.Jd;
        if (yiwVar != null) {
            yiwVar.pvs(i, j);
        }
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.sUS sus = this.NB;
        if (sus != null) {
            sus.pvs(i, j);
        }
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.NB nb = this.sUS;
        if (nb != null) {
            nb.pvs(i, j);
        }
    }
}
