package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.PointF;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes.dex */
public class vA implements pvs.InterfaceC0030pvs, zM {
    private com.bytedance.adsdk.lottie.vG.icD.IP Jd;
    private final String icD;
    private final com.bytedance.adsdk.lottie.so pvs;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> vG;

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
    }

    public vA(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.Ju ju) {
        this.pvs = soVar;
        this.icD = ju.pvs();
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs = ju.icD().pvs();
        this.vG = pvs;
        pvsVar.pvs(pvs);
        pvs.pvs(this);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        this.pvs.invalidateSelf();
    }

    public com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> icD() {
        return this.vG;
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.zM
    public com.bytedance.adsdk.lottie.vG.icD.IP pvs(com.bytedance.adsdk.lottie.vG.icD.IP ip) {
        List<com.bytedance.adsdk.lottie.vG.pvs> list;
        boolean z;
        List<com.bytedance.adsdk.lottie.vG.pvs> vG = ip.vG();
        if (vG.size() <= 2) {
            return ip;
        }
        float floatValue = this.vG.yiw().floatValue();
        if (floatValue == 0.0f) {
            return ip;
        }
        com.bytedance.adsdk.lottie.vG.icD.IP icD = icD(ip);
        icD.pvs(ip.pvs().x, ip.pvs().y);
        List<com.bytedance.adsdk.lottie.vG.pvs> vG2 = icD.vG();
        boolean icD2 = ip.icD();
        int i = 0;
        int i2 = 0;
        while (i < vG.size()) {
            com.bytedance.adsdk.lottie.vG.pvs pvsVar = vG.get(i);
            com.bytedance.adsdk.lottie.vG.pvs pvsVar2 = vG.get(pvs(i - 1, vG.size()));
            com.bytedance.adsdk.lottie.vG.pvs pvsVar3 = vG.get(pvs(i - 2, vG.size()));
            PointF vG3 = (i != 0 || icD2) ? pvsVar2.vG() : ip.pvs();
            PointF icD3 = (i != 0 || icD2) ? pvsVar2.icD() : vG3;
            PointF pvs = pvsVar.pvs();
            PointF vG4 = pvsVar3.vG();
            PointF vG5 = pvsVar.vG();
            boolean z2 = !ip.icD() && i == 0 && i == vG.size() + (-1);
            if (icD3.equals(vG3) && pvs.equals(vG3) && !z2) {
                float f = vG3.x - vG4.x;
                float f2 = vG3.y - vG4.y;
                float f3 = vG5.x - vG3.x;
                float f4 = vG5.y - vG3.y;
                list = vG;
                z = icD2;
                float hypot = (float) Math.hypot(f, f2);
                float hypot2 = (float) Math.hypot(f3, f4);
                float min = Math.min(floatValue / hypot, 0.5f);
                float min2 = Math.min(floatValue / hypot2, 0.5f);
                float f5 = vG3.x + ((vG4.x - vG3.x) * min);
                float f6 = vG3.y + ((vG4.y - vG3.y) * min);
                float f7 = vG3.x + ((vG5.x - vG3.x) * min2);
                float f8 = vG3.y + ((vG5.y - vG3.y) * min2);
                float f9 = f5 - ((f5 - vG3.x) * 0.5519f);
                float f10 = f6 - ((f6 - vG3.y) * 0.5519f);
                float f11 = f7 - ((f7 - vG3.x) * 0.5519f);
                float f12 = f8 - ((f8 - vG3.y) * 0.5519f);
                com.bytedance.adsdk.lottie.vG.pvs pvsVar4 = vG2.get(pvs(i2 - 1, vG2.size()));
                com.bytedance.adsdk.lottie.vG.pvs pvsVar5 = vG2.get(i2);
                pvsVar4.icD(f5, f6);
                pvsVar4.vG(f5, f6);
                if (i == 0) {
                    icD.pvs(f5, f6);
                }
                pvsVar5.pvs(f9, f10);
                i2++;
                com.bytedance.adsdk.lottie.vG.pvs pvsVar6 = vG2.get(i2);
                pvsVar5.icD(f11, f12);
                pvsVar5.vG(f7, f8);
                pvsVar6.pvs(f7, f8);
            } else {
                list = vG;
                z = icD2;
                com.bytedance.adsdk.lottie.vG.pvs pvsVar7 = vG2.get(pvs(i2 - 1, vG2.size()));
                com.bytedance.adsdk.lottie.vG.pvs pvsVar8 = vG2.get(i2);
                pvsVar7.icD(pvsVar2.icD().x, pvsVar2.icD().y);
                pvsVar7.vG(pvsVar2.vG().x, pvsVar2.vG().y);
                pvsVar8.pvs(pvsVar.pvs().x, pvsVar.pvs().y);
            }
            i2++;
            i++;
            vG = list;
            icD2 = z;
        }
        return icD;
    }

    private com.bytedance.adsdk.lottie.vG.icD.IP icD(com.bytedance.adsdk.lottie.vG.icD.IP ip) {
        List<com.bytedance.adsdk.lottie.vG.pvs> vG = ip.vG();
        boolean icD = ip.icD();
        int size = vG.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.bytedance.adsdk.lottie.vG.pvs pvsVar = vG.get(size);
            com.bytedance.adsdk.lottie.vG.pvs pvsVar2 = vG.get(pvs(size - 1, vG.size()));
            PointF vG2 = (size != 0 || icD) ? pvsVar2.vG() : ip.pvs();
            i = (((size != 0 || icD) ? pvsVar2.icD() : vG2).equals(vG2) && pvsVar.pvs().equals(vG2) && !(!ip.icD() && size == 0 && size == vG.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        com.bytedance.adsdk.lottie.vG.icD.IP ip2 = this.Jd;
        if (ip2 == null || ip2.vG().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new com.bytedance.adsdk.lottie.vG.pvs());
            }
            this.Jd = new com.bytedance.adsdk.lottie.vG.icD.IP(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.Jd.pvs(icD);
        return this.Jd;
    }

    private static int pvs(int i, int i2) {
        return i - (icD(i, i2) * i2);
    }

    private static int icD(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
