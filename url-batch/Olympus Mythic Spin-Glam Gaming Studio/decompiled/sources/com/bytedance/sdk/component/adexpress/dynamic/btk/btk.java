package com.bytedance.sdk.component.adexpress.dynamic.btk;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.btk.fs;
import com.bytedance.sdk.component.adexpress.fs.mw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class btk {
    private zmn fb;
    protected fs fs;
    public com.bytedance.sdk.component.adexpress.dynamic.fb.fs zmn;
    private com.bytedance.sdk.component.adexpress.dynamic.fb.zg zn;

    static class zmn {
        float fs;
        float zmn;
        float zn;

        zmn() {
        }
    }

    public btk(double d, int i, double d2, String str, mw mwVar) {
        this.fs = new fs(d, i, d2, str, mwVar);
    }

    public void zmn(zmn zmnVar) {
        this.fb = zmnVar;
    }

    public void zmn() {
        this.fs.zmn();
    }

    public void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, float f, float f2) {
        if (zgVar != null) {
            this.zn = zgVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar2 = this.zn;
        float zg = zgVar2.zg();
        float bvs = zgVar2.bvs();
        float f3 = TextUtils.equals(zgVar2.iv().btk().kjb(), "fixed") ? bvs : 65536.0f;
        this.fs.zmn();
        this.fs.zn(zgVar2, zg, f3);
        fs.zn zmn2 = this.fs.zmn(zgVar2);
        com.bytedance.sdk.component.adexpress.dynamic.fb.fs fsVar = new com.bytedance.sdk.component.adexpress.dynamic.fb.fs();
        fsVar.zmn = f;
        fsVar.fs = f2;
        if (zmn2 != null) {
            zg = zmn2.zmn;
        }
        fsVar.zn = zg;
        if (zmn2 != null) {
            bvs = zmn2.fs;
        }
        fsVar.fb = bvs;
        fsVar.btk = "root";
        fsVar.bvs = 1280.0f;
        fsVar.hhw = zgVar2;
        zgVar2.zn(f);
        fsVar.hhw.fb(fsVar.fs);
        fsVar.hhw.btk(fsVar.zn);
        fsVar.hhw.hhw(fsVar.fb);
        com.bytedance.sdk.component.adexpress.dynamic.fb.fs zmn3 = zmn(fsVar, 0.0f);
        this.zmn = zmn3;
        zmn(zmn3);
    }

    public void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.fs fsVar) {
        if (fsVar == null) {
            return;
        }
        fsVar.hhw.iv().fs();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.fs>> list = fsVar.nps;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.fb.fs> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.fs> it = list2.iterator();
                while (it.hasNext()) {
                    zmn(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.component.adexpress.dynamic.fb.fs zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.fs fsVar, float f) {
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it2;
        float f9;
        List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list;
        float f10;
        com.bytedance.sdk.component.adexpress.dynamic.fb.fs fsVar2;
        com.bytedance.sdk.component.adexpress.dynamic.fb.bvs bvsVar;
        float f11;
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar;
        com.bytedance.sdk.component.adexpress.dynamic.fb.bvs bvsVar2;
        float f12;
        com.bytedance.sdk.component.adexpress.dynamic.fb.bvs bvsVar3;
        fs.zn zmn2;
        fs.zn zmn3;
        com.bytedance.sdk.component.adexpress.dynamic.fb.fs fsVar3 = fsVar;
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar2 = fsVar3.hhw;
        if (zgVar2 == null) {
            return fsVar3;
        }
        zgVar2.phc();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> olo = zgVar2.olo();
        if (olo == null || olo.size() <= 0) {
            return fsVar3;
        }
        com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk = zgVar2.iv().btk();
        float olo2 = btk.olo();
        float cyb = btk.cyb();
        float rt = btk.rt();
        float cn = btk.cn();
        float klz = btk.klz();
        String jy = btk.jy();
        String vlj = btk.vlj();
        float f13 = fsVar3.zmn + cn;
        float f14 = fsVar3.fs + olo2;
        float f15 = klz * 2.0f;
        float f16 = ((fsVar3.zn - cn) - cyb) - f15;
        float f17 = ((fsVar3.fb - olo2) - rt) - f15;
        com.bytedance.sdk.component.adexpress.dynamic.fb.bvs bvsVar4 = new com.bytedance.sdk.component.adexpress.dynamic.fb.bvs(f13, f14);
        if (fsVar3.nps == null) {
            fsVar3.nps = new ArrayList();
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> it3 = olo.iterator();
        float f18 = 0.0f;
        while (it3.hasNext()) {
            fs.zn zmn4 = this.fs.zmn(it3.next());
            if (zmn4 != null) {
                f18 += zmn4.fs;
            }
        }
        String str = "space-between";
        String str2 = "space-around";
        if (f18 < f17) {
            if (TextUtils.equals(vlj, "center")) {
                f3 = (f17 - f18) / 2.0f;
            } else if (TextUtils.equals(vlj, "flex-end")) {
                f3 = f17 - f18;
            } else {
                if (TextUtils.equals(vlj, "space-around")) {
                    f3 = iv.zmn((f17 - f18) / (olo.size() + 1));
                    f2 = f3;
                    bvsVar4.fs += f3;
                    float f19 = f;
                    i = 0;
                    while (i < olo.size()) {
                        List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list2 = olo.get(i);
                        i++;
                        List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> list3 = olo;
                        if (i >= fsVar3.nps.size()) {
                            int size = (i - fsVar3.nps.size()) + 1;
                            f5 = f19;
                            int i2 = 0;
                            while (i2 < size) {
                                fsVar3.nps.add(new ArrayList());
                                i2++;
                                size = size;
                                f2 = f2;
                            }
                            f4 = f2;
                        } else {
                            f4 = f2;
                            f5 = f19;
                        }
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it4 = list2.iterator();
                        float f20 = 0.0f;
                        while (true) {
                            f6 = f13;
                            if (!it4.hasNext()) {
                                break;
                            }
                            com.bytedance.sdk.component.adexpress.dynamic.fb.zg next = it4.next();
                            com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk2 = next.iv().btk();
                            String zak = btk2.zak();
                            Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it5 = it4;
                            int xrr = btk2.xrr();
                            if (!TextUtils.equals(zak, "flex") && xrr != 1 && xrr != 2 && (zmn3 = this.fs.zmn(next)) != null) {
                                f20 += zmn3.zmn;
                            }
                            f13 = f6;
                            it4 = it5;
                        }
                        float max = Math.max(f16 - f20, 0.0f);
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it6 = list2.iterator();
                        float f21 = 0.0f;
                        while (it6.hasNext()) {
                            com.bytedance.sdk.component.adexpress.dynamic.fb.zg next2 = it6.next();
                            com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk3 = next2.iv().btk();
                            Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it7 = it6;
                            if (btk3.xrr() != 1 && btk3.xrr() != 2 && (zmn2 = this.fs.zmn(next2)) != null) {
                                f21 += zmn2.zmn;
                            }
                            it6 = it7;
                        }
                        if (f21 < f16) {
                            if (TextUtils.equals(jy, "center")) {
                                f7 = (f16 - f21) / 2.0f;
                            } else if (TextUtils.equals(jy, "flex-end")) {
                                f7 = f16 - f21;
                            } else {
                                if (TextUtils.equals(jy, str2)) {
                                    f7 = iv.zmn((f16 - f21) / (list2.size() + 1));
                                    f8 = f7;
                                } else if (TextUtils.equals(jy, str) && list2.size() > 1) {
                                    f8 = iv.zmn((f16 - f21) / (list2.size() - 1.0f));
                                    f7 = 0.0f;
                                }
                                bvsVar4.zmn += f7;
                                it = list2.iterator();
                                float f22 = 0.0f;
                                while (it.hasNext()) {
                                    com.bytedance.sdk.component.adexpress.dynamic.fb.zg next3 = it.next();
                                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it8 = it;
                                    float f23 = this.fs.zmn(next3) != null ? this.fs.zmn(next3).fs : 0.0f;
                                    com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk4 = next3.iv().btk();
                                    float f24 = f16;
                                    f22 = Math.max(f22, (btk4.xrr() == 1 || btk4.xrr() == 2) ? 0.0f : f23);
                                    it = it8;
                                    f16 = f24;
                                }
                                float f25 = f16;
                                it2 = list2.iterator();
                                float f26 = f5;
                                while (it2.hasNext()) {
                                    com.bytedance.sdk.component.adexpress.dynamic.fb.zg next4 = it2.next();
                                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it9 = it2;
                                    fs.zn zmn5 = this.fs.zmn(next4);
                                    float f27 = f26;
                                    com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk5 = next4.iv().btk();
                                    String str3 = str;
                                    float cud = btk5.cud();
                                    String str4 = str2;
                                    float kra = btk5.kra();
                                    String str5 = jy;
                                    float gn = btk5.gn();
                                    float f28 = f8;
                                    float uqd = btk5.uqd();
                                    com.bytedance.sdk.component.adexpress.dynamic.fb.bvs bvsVar5 = bvsVar4;
                                    float f29 = zmn5 == null ? 0.0f : zmn5.zmn;
                                    if (zmn5 == null) {
                                        list = list2;
                                        f9 = 0.0f;
                                    } else {
                                        f9 = zmn5.fs;
                                        list = list2;
                                    }
                                    com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar3 = zgVar2;
                                    float f30 = TextUtils.equals(zgVar2.zn(), "root") ? i : f27;
                                    int i3 = i;
                                    if (btk5.xrr() == 1) {
                                        f10 = f30;
                                        fsVar2 = fsVar;
                                        bvsVar = zmn(fsVar2, btk5, (f29 - kra) - uqd, (f9 - cud) - gn);
                                    } else {
                                        f10 = f30;
                                        fsVar2 = fsVar;
                                        bvsVar = bvsVar5;
                                    }
                                    com.bytedance.sdk.component.adexpress.dynamic.fb.bvs bvsVar6 = bvsVar;
                                    if (btk5.xrr() == 2) {
                                        f11 = max;
                                        zgVar = next4;
                                        bvsVar2 = zmn(btk5, this.fs.zmn(this.zn), new fs.zn((f29 - kra) - uqd, (f9 - cud) - gn));
                                    } else {
                                        f11 = max;
                                        zgVar = next4;
                                        bvsVar2 = bvsVar6;
                                    }
                                    String nlz = btk.nlz();
                                    if (f22 > f9 && !TextUtils.equals(nlz, "flex-start")) {
                                        nlz.hashCode();
                                        if (nlz.equals("center")) {
                                            f12 = (f22 - f9) / 2.0f;
                                        } else if (nlz.equals("flex-end")) {
                                            f12 = f22 - f9;
                                        }
                                        com.bytedance.sdk.component.adexpress.dynamic.fb.fs fsVar4 = new com.bytedance.sdk.component.adexpress.dynamic.fb.fs();
                                        fsVar4.zmn = bvsVar2.zmn + uqd;
                                        fsVar4.fs = bvsVar2.fs + cud + f12;
                                        fsVar4.zn = (f29 - kra) - uqd;
                                        fsVar4.fb = (f9 - cud) - gn;
                                        fsVar4.btk = fsVar2.btk + "." + zgVar.zn();
                                        fsVar4.zg = fsVar2;
                                        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar4 = zgVar;
                                        fsVar4.hhw = zgVar4;
                                        float f31 = f11;
                                        fsVar4.bvs = f31;
                                        list2 = list;
                                        fsVar4.iv = list2;
                                        zgVar4.zn(fsVar4.zmn);
                                        fsVar4.hhw.fb(fsVar4.fs);
                                        fsVar4.hhw.btk(fsVar4.zn);
                                        fsVar4.hhw.hhw(fsVar4.fb);
                                        float f32 = f10;
                                        i = i3;
                                        fsVar2.nps.get(i).add(zmn(fsVar4, f32));
                                        if (btk5.xrr() != 1) {
                                            bvsVar3 = bvsVar5;
                                        } else if (btk5.xrr() != 2) {
                                            bvsVar3 = bvsVar5;
                                            bvsVar3.zmn += f29 + f28;
                                        } else {
                                            bvsVar3 = bvsVar5;
                                        }
                                        f26 = f32;
                                        max = f31;
                                        bvsVar4 = bvsVar3;
                                        str = str3;
                                        str2 = str4;
                                        jy = str5;
                                        f8 = f28;
                                        zgVar2 = zgVar3;
                                        it2 = it9;
                                    }
                                    f12 = 0.0f;
                                    com.bytedance.sdk.component.adexpress.dynamic.fb.fs fsVar42 = new com.bytedance.sdk.component.adexpress.dynamic.fb.fs();
                                    fsVar42.zmn = bvsVar2.zmn + uqd;
                                    fsVar42.fs = bvsVar2.fs + cud + f12;
                                    fsVar42.zn = (f29 - kra) - uqd;
                                    fsVar42.fb = (f9 - cud) - gn;
                                    fsVar42.btk = fsVar2.btk + "." + zgVar.zn();
                                    fsVar42.zg = fsVar2;
                                    com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar42 = zgVar;
                                    fsVar42.hhw = zgVar42;
                                    float f312 = f11;
                                    fsVar42.bvs = f312;
                                    list2 = list;
                                    fsVar42.iv = list2;
                                    zgVar42.zn(fsVar42.zmn);
                                    fsVar42.hhw.fb(fsVar42.fs);
                                    fsVar42.hhw.btk(fsVar42.zn);
                                    fsVar42.hhw.hhw(fsVar42.fb);
                                    float f322 = f10;
                                    i = i3;
                                    fsVar2.nps.get(i).add(zmn(fsVar42, f322));
                                    if (btk5.xrr() != 1) {
                                    }
                                    f26 = f322;
                                    max = f312;
                                    bvsVar4 = bvsVar3;
                                    str = str3;
                                    str2 = str4;
                                    jy = str5;
                                    f8 = f28;
                                    zgVar2 = zgVar3;
                                    it2 = it9;
                                }
                                com.bytedance.sdk.component.adexpress.dynamic.fb.bvs bvsVar7 = bvsVar4;
                                f13 = f6;
                                bvsVar7.zmn = f13;
                                bvsVar7.fs += f22 + f4;
                                fsVar3 = fsVar;
                                str = str;
                                olo = list3;
                                f2 = f4;
                                f19 = f26;
                                f16 = f25;
                                zgVar2 = zgVar2;
                            }
                            f8 = 0.0f;
                            bvsVar4.zmn += f7;
                            it = list2.iterator();
                            float f222 = 0.0f;
                            while (it.hasNext()) {
                            }
                            float f252 = f16;
                            it2 = list2.iterator();
                            float f262 = f5;
                            while (it2.hasNext()) {
                            }
                            com.bytedance.sdk.component.adexpress.dynamic.fb.bvs bvsVar72 = bvsVar4;
                            f13 = f6;
                            bvsVar72.zmn = f13;
                            bvsVar72.fs += f222 + f4;
                            fsVar3 = fsVar;
                            str = str;
                            olo = list3;
                            f2 = f4;
                            f19 = f262;
                            f16 = f252;
                            zgVar2 = zgVar2;
                        }
                        f7 = 0.0f;
                        f8 = 0.0f;
                        bvsVar4.zmn += f7;
                        it = list2.iterator();
                        float f2222 = 0.0f;
                        while (it.hasNext()) {
                        }
                        float f2522 = f16;
                        it2 = list2.iterator();
                        float f2622 = f5;
                        while (it2.hasNext()) {
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.fb.bvs bvsVar722 = bvsVar4;
                        f13 = f6;
                        bvsVar722.zmn = f13;
                        bvsVar722.fs += f2222 + f4;
                        fsVar3 = fsVar;
                        str = str;
                        olo = list3;
                        f2 = f4;
                        f19 = f2622;
                        f16 = f2522;
                        zgVar2 = zgVar2;
                    }
                    return fsVar3;
                }
                if (TextUtils.equals(vlj, "space-between") && olo.size() > 1) {
                    f2 = iv.zmn((f17 - f18) / (olo.size() - 1));
                    f3 = 0.0f;
                    bvsVar4.fs += f3;
                    float f192 = f;
                    i = 0;
                    while (i < olo.size()) {
                    }
                    return fsVar3;
                }
            }
            f2 = 0.0f;
            bvsVar4.fs += f3;
            float f1922 = f;
            i = 0;
            while (i < olo.size()) {
            }
            return fsVar3;
        }
        f2 = 0.0f;
        f3 = 0.0f;
        bvsVar4.fs += f3;
        float f19222 = f;
        i = 0;
        while (i < olo.size()) {
        }
        return fsVar3;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.fb.bvs zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.hhw hhwVar, fs.zn znVar, fs.zn znVar2) {
        float mpi = hhwVar.mpi();
        float ax = hhwVar.ax();
        float skn = hhwVar.skn();
        float obg = hhwVar.obg();
        boolean cd = hhwVar.cd();
        boolean lt = hhwVar.lt();
        boolean io2 = hhwVar.io();
        boolean lbc = hhwVar.lbc();
        if (!cd) {
            if (lt) {
                float f = this.fb.zmn;
                mpi = ((f != 0.0f ? Math.min(f, znVar.zmn) : znVar.zmn) - skn) - znVar2.zmn;
            } else {
                mpi = 0.0f;
            }
        }
        if (!io2) {
            if (lbc) {
                float f2 = this.fb.fs;
                if (f2 == 0.0f) {
                    f2 = znVar.fs;
                }
                ax = (f2 - obg) - znVar2.fs;
            } else {
                ax = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.fb.bvs(mpi, ax);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.fb.bvs zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.fs fsVar, com.bytedance.sdk.component.adexpress.dynamic.fb.hhw hhwVar, float f, float f2) {
        float f3;
        float f4;
        float f5 = fsVar.zmn;
        float f6 = fsVar.fs;
        float mpi = hhwVar.mpi();
        float ax = hhwVar.ax();
        float skn = hhwVar.skn();
        float obg = hhwVar.obg();
        boolean cd = hhwVar.cd();
        boolean lt = hhwVar.lt();
        boolean io2 = hhwVar.io();
        boolean lbc = hhwVar.lbc();
        String ve = hhwVar.ve();
        float f7 = fsVar.zn;
        float f8 = fsVar.fb;
        if (TextUtils.equals(ve, "0")) {
            if (cd) {
                f5 = fsVar.zmn + mpi;
            } else if (lt) {
                f5 = ((fsVar.zmn + f7) - skn) - f;
            }
            if (io2) {
                f4 = fsVar.fs;
                f6 = f4 + ax;
            } else if (lbc) {
                f3 = fsVar.fs;
                f6 = ((f3 + f8) - obg) - f2;
            }
        } else if (TextUtils.equals(ve, "1")) {
            f5 = fsVar.zmn + ((f7 - f) / 2.0f);
            if (io2) {
                f4 = fsVar.fs;
                f6 = f4 + ax;
            } else if (lbc) {
                f3 = fsVar.fs;
                f6 = ((f3 + f8) - obg) - f2;
            }
        } else if (TextUtils.equals(ve, "2")) {
            f6 = fsVar.fs + ((f8 - f2) / 2.0f);
            if (cd) {
                f5 = fsVar.zmn + mpi;
            } else if (lt) {
                f5 = ((fsVar.zmn + f7) - skn) - f;
            }
        } else if (TextUtils.equals(ve, "3")) {
            f5 = fsVar.zmn + ((f7 - f) / 2.0f);
            f6 = fsVar.fs + ((f8 - f2) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.fb.bvs(f5, f6);
    }
}
