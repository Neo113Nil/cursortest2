package com.bytedance.sdk.component.adexpress.dynamic.Jd;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.icD;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DynamicCanvas.java */
/* loaded from: classes.dex */
public class NB {
    private pvs Jd;
    protected icD icD;
    public com.bytedance.sdk.component.adexpress.dynamic.vG.icD pvs;
    private com.bytedance.sdk.component.adexpress.dynamic.vG.so vG;

    /* compiled from: DynamicCanvas.java */
    static class pvs {
        float icD;
        float pvs;
        float vG;

        pvs() {
        }
    }

    public NB(double d, int i, double d2, String str, Ju ju) {
        this.icD = new icD(d, i, d2, str, ju);
    }

    public void pvs(pvs pvsVar) {
        this.Jd = pvsVar;
    }

    public void pvs() {
        this.icD.pvs();
    }

    public void pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar, float f, float f2) {
        if (soVar != null) {
            this.vG = soVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar2 = this.vG;
        float so = soVar2.so();
        float Mxy = soVar2.Mxy();
        float f3 = TextUtils.equals(soVar2.Wyp().NB().CvL(), "fixed") ? Mxy : 65536.0f;
        this.icD.pvs();
        this.icD.vG(soVar2, so, f3);
        icD.vG pvs2 = this.icD.pvs(soVar2);
        com.bytedance.sdk.component.adexpress.dynamic.vG.icD icd = new com.bytedance.sdk.component.adexpress.dynamic.vG.icD();
        icd.pvs = f;
        icd.icD = f2;
        if (pvs2 != null) {
            so = pvs2.pvs;
        }
        icd.vG = so;
        if (pvs2 != null) {
            Mxy = pvs2.icD;
        }
        icd.Jd = Mxy;
        icd.NB = "root";
        icd.Mxy = 1280.0f;
        icd.sUS = soVar2;
        icd.sUS.vG(icd.pvs);
        icd.sUS.Jd(icd.icD);
        icd.sUS.NB(icd.vG);
        icd.sUS.sUS(icd.Jd);
        com.bytedance.sdk.component.adexpress.dynamic.vG.icD pvs3 = pvs(icd, 0.0f);
        this.pvs = pvs3;
        pvs(pvs3);
    }

    public void pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.icD icd) {
        if (icd == null) {
            return;
        }
        icd.sUS.Wyp().icD();
        float f = icd.vG;
        float f2 = icd.Jd;
        float f3 = icd.pvs;
        float f4 = icd.icD;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.icD>> list = icd.yiw;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.vG.icD> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.icD> it = list2.iterator();
                while (it.hasNext()) {
                    pvs(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.component.adexpress.dynamic.vG.icD pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.icD icd, float f) {
        float f2;
        float f3;
        int i;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> list;
        float f4;
        float f5;
        float f6;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it2;
        float f7;
        List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list2;
        float f8;
        com.bytedance.sdk.component.adexpress.dynamic.vG.icD icd2;
        com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy mxy;
        float f9;
        com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar;
        com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy mxy2;
        float f10;
        com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy mxy3;
        icD.vG pvs2;
        icD.vG pvs3;
        com.bytedance.sdk.component.adexpress.dynamic.vG.icD icd3 = icd;
        com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar2 = icd3.sUS;
        if (soVar2 == null) {
            return icd3;
        }
        soVar2.rCZ();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> vA = soVar2.vA();
        if (vA == null || vA.size() <= 0) {
            return icd3;
        }
        com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB = soVar2.Wyp().NB();
        float vA2 = NB.vA();
        float mnm = NB.mnm();
        float IP = NB.IP();
        float bNS = NB.bNS();
        float kj = NB.kj();
        String OhP = NB.OhP();
        String jhZ = NB.jhZ();
        float f11 = icd3.pvs + bNS;
        float f12 = icd3.icD + vA2;
        float f13 = kj * 2.0f;
        float f14 = ((icd3.vG - bNS) - mnm) - f13;
        float f15 = ((icd3.Jd - vA2) - IP) - f13;
        com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy mxy4 = new com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy(f11, f12);
        if (icd3.yiw == null) {
            icd3.yiw = new ArrayList();
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> it3 = vA.iterator();
        float f16 = 0.0f;
        while (it3.hasNext()) {
            icD.vG pvs4 = this.icD.pvs(it3.next());
            if (pvs4 != null) {
                f16 += pvs4.icD;
            }
        }
        String str = "space-between";
        String str2 = "space-around";
        if (f16 < f15) {
            if (TextUtils.equals(jhZ, "center")) {
                f3 = (f15 - f16) / 2.0f;
            } else if (TextUtils.equals(jhZ, "flex-end")) {
                f3 = f15 - f16;
            } else {
                if (TextUtils.equals(jhZ, "space-around")) {
                    f3 = Wyp.pvs((f15 - f16) / (vA.size() + 1));
                    f2 = f3;
                    mxy4.icD += f3;
                    float f17 = f;
                    i = 0;
                    while (i < vA.size()) {
                        List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list3 = vA.get(i);
                        i++;
                        if (i >= icd3.yiw.size()) {
                            int size = (i - icd3.yiw.size()) + 1;
                            list = vA;
                            int i2 = 0;
                            while (i2 < size) {
                                icd3.yiw.add(new ArrayList());
                                i2++;
                                size = size;
                                f17 = f17;
                            }
                        } else {
                            list = vA;
                        }
                        float f18 = f17;
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it4 = list3.iterator();
                        float f19 = 0.0f;
                        while (true) {
                            f4 = f2;
                            if (!it4.hasNext()) {
                                break;
                            }
                            com.bytedance.sdk.component.adexpress.dynamic.vG.so next = it4.next();
                            com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB2 = next.Wyp().NB();
                            String Gp = NB2.Gp();
                            Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it5 = it4;
                            int qd = NB2.qd();
                            if (!TextUtils.equals(Gp, "flex") && qd != 1 && qd != 2 && (pvs3 = this.icD.pvs(next)) != null) {
                                f19 += pvs3.pvs;
                            }
                            f2 = f4;
                            it4 = it5;
                        }
                        float max = Math.max(f14 - f19, 0.0f);
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it6 = list3.iterator();
                        float f20 = 0.0f;
                        while (it6.hasNext()) {
                            com.bytedance.sdk.component.adexpress.dynamic.vG.so next2 = it6.next();
                            com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB3 = next2.Wyp().NB();
                            Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it7 = it6;
                            if (NB3.qd() != 1 && NB3.qd() != 2 && (pvs2 = this.icD.pvs(next2)) != null) {
                                f20 += pvs2.pvs;
                            }
                            it6 = it7;
                        }
                        if (f20 < f14) {
                            if (TextUtils.equals(OhP, "center")) {
                                f5 = (f14 - f20) / 2.0f;
                            } else if (TextUtils.equals(OhP, "flex-end")) {
                                f5 = f14 - f20;
                            } else {
                                if (TextUtils.equals(OhP, str2)) {
                                    f5 = Wyp.pvs((f14 - f20) / (list3.size() + 1));
                                    f6 = f5;
                                } else if (TextUtils.equals(OhP, str) && list3.size() > 1) {
                                    f6 = Wyp.pvs((f14 - f20) / (list3.size() - 1.0f));
                                    f5 = 0.0f;
                                }
                                mxy4.pvs += f5;
                                it = list3.iterator();
                                float f21 = 0.0f;
                                while (it.hasNext()) {
                                    com.bytedance.sdk.component.adexpress.dynamic.vG.so next3 = it.next();
                                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it8 = it;
                                    float f22 = this.icD.pvs(next3) != null ? this.icD.pvs(next3).icD : 0.0f;
                                    com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB4 = next3.Wyp().NB();
                                    String str3 = str;
                                    f21 = Math.max(f21, (NB4.qd() == 1 || NB4.qd() == 2) ? 0.0f : f22);
                                    it = it8;
                                    str = str3;
                                }
                                String str4 = str;
                                it2 = list3.iterator();
                                f17 = f18;
                                while (it2.hasNext()) {
                                    com.bytedance.sdk.component.adexpress.dynamic.vG.so next4 = it2.next();
                                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it9 = it2;
                                    icD.vG pvs5 = this.icD.pvs(next4);
                                    String str5 = OhP;
                                    com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB5 = next4.Wyp().NB();
                                    float f23 = f17;
                                    float sq = NB5.sq();
                                    float f24 = f14;
                                    float CjQ = NB5.CjQ();
                                    String str6 = str2;
                                    float ea = NB5.ea();
                                    float f25 = f6;
                                    float ZsW = NB5.ZsW();
                                    com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy mxy5 = mxy4;
                                    float f26 = pvs5 == null ? 0.0f : pvs5.pvs;
                                    if (pvs5 == null) {
                                        list2 = list3;
                                        f7 = 0.0f;
                                    } else {
                                        f7 = pvs5.icD;
                                        list2 = list3;
                                    }
                                    com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar3 = soVar2;
                                    float f27 = TextUtils.equals(soVar2.vG(), "root") ? i : f23;
                                    int i3 = i;
                                    if (NB5.qd() == 1) {
                                        f8 = f27;
                                        icd2 = icd;
                                        mxy = pvs(icd2, NB5, (f26 - CjQ) - ZsW, (f7 - sq) - ea);
                                    } else {
                                        f8 = f27;
                                        icd2 = icd;
                                        mxy = mxy5;
                                    }
                                    com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy mxy6 = mxy;
                                    if (NB5.qd() == 2) {
                                        f9 = max;
                                        soVar = next4;
                                        mxy2 = pvs(NB5, this.icD.pvs(this.vG), new icD.vG((f26 - CjQ) - ZsW, (f7 - sq) - ea));
                                    } else {
                                        f9 = max;
                                        soVar = next4;
                                        mxy2 = mxy6;
                                    }
                                    String UYh = NB.UYh();
                                    if (f21 > f7 && !TextUtils.equals(UYh, "flex-start")) {
                                        UYh.hashCode();
                                        if (UYh.equals("center")) {
                                            f10 = (f21 - f7) / 2.0f;
                                        } else if (UYh.equals("flex-end")) {
                                            f10 = f21 - f7;
                                        }
                                        com.bytedance.sdk.component.adexpress.dynamic.vG.icD icd4 = new com.bytedance.sdk.component.adexpress.dynamic.vG.icD();
                                        icd4.pvs = mxy2.pvs + ZsW;
                                        icd4.icD = mxy2.icD + sq + f10;
                                        icd4.vG = (f26 - CjQ) - ZsW;
                                        icd4.Jd = (f7 - sq) - ea;
                                        icd4.NB = icd2.NB + "." + soVar.vG();
                                        icd4.so = icd2;
                                        icd4.sUS = soVar;
                                        max = f9;
                                        icd4.Mxy = max;
                                        list3 = list2;
                                        icd4.Wyp = list3;
                                        icd4.sUS.vG(icd4.pvs);
                                        icd4.sUS.Jd(icd4.icD);
                                        icd4.sUS.NB(icd4.vG);
                                        icd4.sUS.sUS(icd4.Jd);
                                        float f28 = f8;
                                        com.bytedance.sdk.component.adexpress.dynamic.vG.icD pvs6 = pvs(icd4, f28);
                                        i = i3;
                                        icd2.yiw.get(i).add(pvs6);
                                        if (NB5.qd() != 1) {
                                            mxy3 = mxy5;
                                        } else if (NB5.qd() != 2) {
                                            mxy3 = mxy5;
                                            mxy3.pvs += f26 + f25;
                                        } else {
                                            mxy3 = mxy5;
                                        }
                                        f17 = f28;
                                        mxy4 = mxy3;
                                        it2 = it9;
                                        OhP = str5;
                                        f14 = f24;
                                        str2 = str6;
                                        f6 = f25;
                                        soVar2 = soVar3;
                                    }
                                    f10 = 0.0f;
                                    com.bytedance.sdk.component.adexpress.dynamic.vG.icD icd42 = new com.bytedance.sdk.component.adexpress.dynamic.vG.icD();
                                    icd42.pvs = mxy2.pvs + ZsW;
                                    icd42.icD = mxy2.icD + sq + f10;
                                    icd42.vG = (f26 - CjQ) - ZsW;
                                    icd42.Jd = (f7 - sq) - ea;
                                    icd42.NB = icd2.NB + "." + soVar.vG();
                                    icd42.so = icd2;
                                    icd42.sUS = soVar;
                                    max = f9;
                                    icd42.Mxy = max;
                                    list3 = list2;
                                    icd42.Wyp = list3;
                                    icd42.sUS.vG(icd42.pvs);
                                    icd42.sUS.Jd(icd42.icD);
                                    icd42.sUS.NB(icd42.vG);
                                    icd42.sUS.sUS(icd42.Jd);
                                    float f282 = f8;
                                    com.bytedance.sdk.component.adexpress.dynamic.vG.icD pvs62 = pvs(icd42, f282);
                                    i = i3;
                                    icd2.yiw.get(i).add(pvs62);
                                    if (NB5.qd() != 1) {
                                    }
                                    f17 = f282;
                                    mxy4 = mxy3;
                                    it2 = it9;
                                    OhP = str5;
                                    f14 = f24;
                                    str2 = str6;
                                    f6 = f25;
                                    soVar2 = soVar3;
                                }
                                com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy mxy7 = mxy4;
                                mxy7.pvs = f11;
                                mxy7.icD += f21 + f4;
                                icd3 = icd;
                                vA = list;
                                f2 = f4;
                                str = str4;
                                soVar2 = soVar2;
                            }
                            f6 = 0.0f;
                            mxy4.pvs += f5;
                            it = list3.iterator();
                            float f212 = 0.0f;
                            while (it.hasNext()) {
                            }
                            String str42 = str;
                            it2 = list3.iterator();
                            f17 = f18;
                            while (it2.hasNext()) {
                            }
                            com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy mxy72 = mxy4;
                            mxy72.pvs = f11;
                            mxy72.icD += f212 + f4;
                            icd3 = icd;
                            vA = list;
                            f2 = f4;
                            str = str42;
                            soVar2 = soVar2;
                        }
                        f5 = 0.0f;
                        f6 = 0.0f;
                        mxy4.pvs += f5;
                        it = list3.iterator();
                        float f2122 = 0.0f;
                        while (it.hasNext()) {
                        }
                        String str422 = str;
                        it2 = list3.iterator();
                        f17 = f18;
                        while (it2.hasNext()) {
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy mxy722 = mxy4;
                        mxy722.pvs = f11;
                        mxy722.icD += f2122 + f4;
                        icd3 = icd;
                        vA = list;
                        f2 = f4;
                        str = str422;
                        soVar2 = soVar2;
                    }
                    return icd3;
                }
                if (TextUtils.equals(jhZ, "space-between") && vA.size() > 1) {
                    f2 = Wyp.pvs((f15 - f16) / (vA.size() - 1));
                    f3 = 0.0f;
                    mxy4.icD += f3;
                    float f172 = f;
                    i = 0;
                    while (i < vA.size()) {
                    }
                    return icd3;
                }
            }
            f2 = 0.0f;
            mxy4.icD += f3;
            float f1722 = f;
            i = 0;
            while (i < vA.size()) {
            }
            return icd3;
        }
        f2 = 0.0f;
        f3 = 0.0f;
        mxy4.icD += f3;
        float f17222 = f;
        i = 0;
        while (i < vA.size()) {
        }
        return icd3;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.sUS sus, icD.vG vGVar, icD.vG vGVar2) {
        float tCd = sus.tCd();
        float MY = sus.MY();
        float Wby = sus.Wby();
        float rcB = sus.rcB();
        boolean Cwg = sus.Cwg();
        boolean neB = sus.neB();
        boolean cGU = sus.cGU();
        boolean Ca = sus.Ca();
        if (!Cwg) {
            if (neB) {
                tCd = ((this.Jd.pvs != 0.0f ? Math.min(this.Jd.pvs, vGVar.pvs) : vGVar.pvs) - Wby) - vGVar2.pvs;
            } else {
                tCd = 0.0f;
            }
        }
        if (!cGU) {
            if (Ca) {
                MY = ((this.Jd.icD != 0.0f ? this.Jd.icD : vGVar.icD) - rcB) - vGVar2.icD;
            } else {
                MY = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy(tCd, MY);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.icD icd, com.bytedance.sdk.component.adexpress.dynamic.vG.sUS sus, float f, float f2) {
        float f3;
        float f4;
        float f5 = icd.pvs;
        float f6 = icd.icD;
        float tCd = sus.tCd();
        float MY = sus.MY();
        float Wby = sus.Wby();
        float rcB = sus.rcB();
        boolean Cwg = sus.Cwg();
        boolean neB = sus.neB();
        boolean cGU = sus.cGU();
        boolean Ca = sus.Ca();
        String rW = sus.rW();
        float f7 = icd.vG;
        float f8 = icd.Jd;
        if (TextUtils.equals(rW, "0")) {
            if (Cwg) {
                f5 = icd.pvs + tCd;
            } else if (neB) {
                f5 = ((icd.pvs + f7) - Wby) - f;
            }
            if (cGU) {
                f4 = icd.icD;
                f6 = f4 + MY;
            } else if (Ca) {
                f3 = icd.icD;
                f6 = ((f3 + f8) - rcB) - f2;
            }
        } else if (TextUtils.equals(rW, "1")) {
            f5 = icd.pvs + ((f7 - f) / 2.0f);
            if (cGU) {
                f4 = icd.icD;
                f6 = f4 + MY;
            } else if (Ca) {
                f3 = icd.icD;
                f6 = ((f3 + f8) - rcB) - f2;
            }
        } else if (TextUtils.equals(rW, ExifInterface.GPS_MEASUREMENT_2D)) {
            f6 = icd.icD + ((f8 - f2) / 2.0f);
            if (Cwg) {
                f5 = icd.pvs + tCd;
            } else if (neB) {
                f5 = ((icd.pvs + f7) - Wby) - f;
            }
        } else if (TextUtils.equals(rW, ExifInterface.GPS_MEASUREMENT_3D)) {
            f5 = icd.pvs + ((f7 - f) / 2.0f);
            f6 = icd.icD + ((f8 - f2) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.vG.Mxy(f5, f6);
    }
}
