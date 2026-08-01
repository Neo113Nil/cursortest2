package com.bytedance.sdk.component.adexpress.dynamic.Jd;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ComputeRuler.java */
/* loaded from: classes.dex */
public class icD {
    private Ju Mxy;
    private double NB;
    private int sUS;
    private String so;
    private double yiw;
    public Map<String, vG> pvs = new HashMap();
    public Map<String, vG> icD = new HashMap();
    public Map<String, vG> vG = new HashMap();
    private double Jd = Math.random();

    public icD(double d, int i, double d2, String str, Ju ju) {
        this.NB = d;
        this.sUS = i;
        this.yiw = d2;
        this.so = str;
        this.Mxy = ju;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vG pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar, float f, float f2) {
        float f3;
        if (TextUtils.isEmpty(soVar.Wyp().vG()) && soVar.Wyp().NB().Zm() == null) {
            return new vG(0.0f, 0.0f);
        }
        if (TextUtils.equals(soVar.Wyp().icD(), "creative-playable-bait")) {
            return new vG(0.0f, 0.0f);
        }
        float so = soVar.so();
        float Mxy = soVar.Mxy();
        com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB = soVar.Wyp().NB();
        String Gp = NB.Gp();
        String CvL = NB.CvL();
        float Ju = soVar.Ju();
        float IP = soVar.IP();
        float bNS = soVar.bNS();
        float mnm = soVar.mnm();
        if (TextUtils.equals(Gp, "fixed")) {
            f = Math.min(so, f);
            if (TextUtils.equals(CvL, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                f3 = icD(soVar, f - bNS, f2 - mnm).icD;
                Mxy = f3 + mnm;
            }
            if (TextUtils.equals(CvL, "scale")) {
                float round = Math.round((f - Ju) / Mxy) + IP;
                if (round > f2) {
                    f = Math.round((f2 - IP) * Mxy) + Ju;
                } else {
                    f2 = round;
                }
            } else if (TextUtils.equals(CvL, "fixed")) {
                f2 = Math.min(Mxy + IP, f2);
            } else if (!TextUtils.equals(CvL, "flex")) {
                f2 = Mxy;
            }
            vG vGVar = new vG();
            vGVar.pvs = f;
            vGVar.icD = f2;
            return vGVar;
        }
        if (TextUtils.equals(Gp, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            vG icD = icD(soVar, f - bNS, f2 - mnm);
            f = icD.pvs + bNS;
            if (TextUtils.equals(CvL, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                f3 = icD.icD;
                Mxy = f3 + mnm;
            }
            if (TextUtils.equals(CvL, "scale")) {
            }
            vG vGVar2 = new vG();
            vGVar2.pvs = f;
            vGVar2.icD = f2;
            return vGVar2;
        }
        if (!TextUtils.equals(Gp, "flex")) {
            f = so;
        } else if (TextUtils.equals(CvL, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            f3 = icD(soVar, f - bNS, f2 - mnm).icD;
            Mxy = f3 + mnm;
        }
        if (TextUtils.equals(CvL, "scale")) {
        }
        vG vGVar22 = new vG();
        vGVar22.pvs = f;
        vGVar22.icD = f2;
        return vGVar22;
    }

    public vG icD(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar, float f, float f2) {
        vG vGVar = new vG();
        if (soVar.Wyp().NB() == null) {
            return vGVar;
        }
        vG NB = NB(soVar, f, f2);
        float f3 = NB.pvs;
        float f4 = NB.icD;
        vGVar.pvs = Math.min(f3, f);
        vGVar.icD = Math.min(f4, f2);
        return vGVar;
    }

    private vG NB(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar, float f, float f2) {
        String str = soVar.vG() + "_" + f + "_" + f2;
        if (this.vG.containsKey(str)) {
            return this.vG.get(str);
        }
        vG sUS = sUS(soVar, f, f2);
        this.vG.put(str, sUS);
        return sUS;
    }

    private vG sUS(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar, float f, float f2) {
        new vG();
        com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB = soVar.Wyp().NB();
        soVar.Wyp().vG();
        NB.OyE();
        float cR = NB.cR();
        int cnN = NB.cnN();
        double BSi = NB.BSi();
        int joF = NB.joF();
        boolean SE = NB.SE();
        boolean thO = NB.thO();
        int yWX = NB.yWX();
        C0040icD c0040icD = new C0040icD();
        c0040icD.pvs = cR;
        c0040icD.icD = cnN;
        c0040icD.vG = joF;
        c0040icD.Jd = BSi;
        c0040icD.NB = f;
        return pvs(soVar.Wyp().vG(), c0040icD, SE, thO, yWX, soVar);
    }

    private vG pvs(String str, C0040icD c0040icD, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        return qh.pvs(str, soVar.Wyp().icD(), C0040icD.pvs(c0040icD).toString(), z, z2, i, soVar, this.NB, this.sUS, this.yiw, this.so, this.Mxy);
    }

    public vG vG(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar, float f, float f2) {
        if (soVar == null) {
            return null;
        }
        vG pvs2 = pvs(soVar);
        if (pvs2 != null && (pvs2.pvs != 0.0f || pvs2.icD != 0.0f)) {
            return pvs2;
        }
        vG Jd = Jd(soVar, f, f2);
        pvs(soVar, Jd);
        return Jd;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vG Jd(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar, float f, float f2) {
        float min;
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> it;
        vG vGVar = new vG();
        float f3 = 0.0f;
        if (f2 <= 0.0f || f <= 0.0f) {
            vGVar.pvs = 0.0f;
            vGVar.icD = 0.0f;
            return vGVar;
        }
        if (soVar.cR()) {
            return pvs(soVar, f, f2);
        }
        float so = soVar.so();
        float Mxy = soVar.Mxy();
        float bNS = soVar.bNS();
        float mnm = soVar.mnm();
        com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB = soVar.Wyp().NB();
        String Gp = NB.Gp();
        String CvL = NB.CvL();
        float min2 = ((TextUtils.equals(Gp, "flex") || TextUtils.equals(Gp, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) ? f : Math.min(so, f)) - bNS;
        if (TextUtils.equals(CvL, "scale")) {
            min = Math.round(min2 / Mxy) + mnm;
            if (min > f2) {
                min2 = Math.round((f2 - mnm) * Mxy);
                min = f2;
            }
            float f4 = min - mnm;
            List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> vA = soVar.vA();
            it = vA.iterator();
            float f5 = 0.0f;
            float f6 = 0.0f;
            while (it.hasNext()) {
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> it2 = it;
                List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> next = it.next();
                vG vGVar2 = vGVar;
                vG icD = icD(next, min2, f4);
                if (icD(next)) {
                    f3 += 1.0f;
                } else {
                    f5 = Math.max(f5, icD.pvs);
                }
                float f7 = f3;
                if (soVar.Wyp().icD().equals("carousel")) {
                    f6 = Math.max(soVar.Mxy(), icD.icD);
                } else {
                    f6 += icD.icD;
                }
                vGVar = vGVar2;
                it = it2;
                f3 = f7;
            }
            vG vGVar3 = vGVar;
            if (TextUtils.equals(Gp, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                if (f3 == vA.size()) {
                    min2 = f;
                } else {
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list : vA) {
                        vG(list);
                        icD(list, f5, f4);
                    }
                    min2 = f5;
                }
            }
            if (TextUtils.equals(CvL, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                if (f6 <= f2) {
                    f4 = f6;
                } else {
                    pvs(vA, min2, f4);
                }
            } else if ((TextUtils.equals(CvL, "fixed") || TextUtils.equals(CvL, "flex")) && f4 < f6) {
                pvs(vA, min2, f4);
            }
            vGVar3.pvs = Math.min(min2 + bNS, f);
            vGVar3.icD = Math.min(f4 + mnm, f2);
            return vGVar3;
        }
        if (!TextUtils.equals(CvL, DebugKt.DEBUG_PROPERTY_VALUE_AUTO) && !TextUtils.equals(CvL, "flex")) {
            min = Math.min(Mxy, f2);
            float f42 = min - mnm;
            List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> vA2 = soVar.vA();
            it = vA2.iterator();
            float f52 = 0.0f;
            float f62 = 0.0f;
            while (it.hasNext()) {
            }
            vG vGVar32 = vGVar;
            if (TextUtils.equals(Gp, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            }
            if (TextUtils.equals(CvL, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            }
            vGVar32.pvs = Math.min(min2 + bNS, f);
            vGVar32.icD = Math.min(f42 + mnm, f2);
            return vGVar32;
        }
        min = f2;
        float f422 = min - mnm;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> vA22 = soVar.vA();
        it = vA22.iterator();
        float f522 = 0.0f;
        float f622 = 0.0f;
        while (it.hasNext()) {
        }
        vG vGVar322 = vGVar;
        if (TextUtils.equals(Gp, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
        }
        if (TextUtils.equals(CvL, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
        }
        vGVar322.pvs = Math.min(min2 + bNS, f);
        vGVar322.icD = Math.min(f422 + mnm, f2);
        return vGVar322;
    }

    private void pvs(List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (pvs(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list2 : list) {
            pvs pvsVar = new pvs();
            boolean pvs2 = pvs(list2, !z);
            pvsVar.pvs = pvs2 ? 1.0f : icD(list2, f, f2).icD;
            pvsVar.icD = !pvs2;
            arrayList.add(pvsVar);
        }
        List<pvs> pvs3 = Wyp.pvs(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((pvs) arrayList.get(i)).pvs != pvs3.get(i).pvs) {
                List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list3 = list.get(i);
                vG(list3);
                icD(list3, f, pvs3.get(i).pvs);
            }
        }
    }

    private boolean icD(List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list) {
        boolean z;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> vA;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (TextUtils.equals(it.next().Wyp().NB().Gp(), "flex")) {
                z = true;
                break;
            }
        }
        if (z) {
            return true;
        }
        while (true) {
            boolean z2 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar : list) {
                if (TextUtils.equals(soVar.Wyp().NB().Gp(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO) && (vA = soVar.vA()) != null) {
                    int i = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list2 : vA) {
                        i++;
                        if (!icD(list2)) {
                            break;
                        }
                        if (i == list2.size()) {
                            z2 = true;
                        }
                    }
                }
            }
            return z2;
        }
    }

    private vG icD(List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list, float f, float f2) {
        vG pvs2 = pvs(list);
        if (pvs2 != null && (pvs2.pvs != 0.0f || pvs2.icD != 0.0f)) {
            return pvs2;
        }
        vG vG2 = vG(list, f, f2);
        pvs(list, vG2);
        return vG2;
    }

    private vG vG(List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list, float f, float f2) {
        float f3;
        Jd(list);
        vG vGVar = new vG();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB = soVar.Wyp().NB();
            if (NB.qd() == 1 || NB.qd() == 2) {
                arrayList.add(soVar);
            }
            if (NB.qd() != 1 && NB.qd() != 2) {
                arrayList2.add(soVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vG((com.bytedance.sdk.component.adexpress.dynamic.vG.so) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return vGVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(vG(it2.next(), f, f2).pvs));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar2 = arrayList2.get(i);
            String Gp = soVar2.Wyp().NB().Gp();
            float so = soVar2.so();
            boolean equals = TextUtils.equals(Gp, "flex");
            if (TextUtils.equals(Gp, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> vA = soVar2.vA();
                if (vA != null && vA.size() > 0) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> it3 = vA.iterator();
                    while (it3.hasNext()) {
                        if (icD(it3.next())) {
                            equals = true;
                            break;
                        }
                    }
                }
                equals = false;
            }
            pvs pvsVar = new pvs();
            if (!equals) {
                so = ((Float) arrayList3.get(i)).floatValue();
            }
            pvsVar.pvs = so;
            pvsVar.icD = !equals;
            if (equals) {
                f3 = ((Float) arrayList3.get(i)).floatValue();
            }
            pvsVar.vG = f3;
            arrayList4.add(pvsVar);
            i++;
        }
        pvs(arrayList4, f, arrayList2);
        List<pvs> pvs2 = Wyp.pvs(f, arrayList4);
        float f4 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f4 += pvs2.get(i2).pvs;
            if (((Float) arrayList3.get(i2)).floatValue() != pvs2.get(i2).pvs) {
                Jd(arrayList2.get(i2));
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it4 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i3++;
            if (!icD(it4.next())) {
                z = false;
                break;
            }
            if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        f3 = z ? f2 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar3 = arrayList2.get(i4);
            vG vG2 = vG(soVar3, pvs2.get(i4).pvs, f2);
            if (!icD(soVar3)) {
                f3 = Math.max(f3, vG2.icD);
            }
            arrayList5.add(vG2);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((vG) it5.next()).icD));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar4 = arrayList2.get(i5);
                if (icD(soVar4) && ((Float) arrayList6.get(i5)).floatValue() != f3) {
                    Jd(soVar4);
                    vG(soVar4, pvs2.get(i5).pvs, f3);
                }
            }
        }
        vGVar.pvs = f4;
        vGVar.icD = f3;
        return vGVar;
    }

    private boolean icD(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        if (soVar == null) {
            return false;
        }
        if (TextUtils.equals(soVar.Wyp().NB().CvL(), "flex")) {
            return true;
        }
        return vG(soVar);
    }

    private boolean vG(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> vA;
        if (!soVar.cR() && TextUtils.equals(soVar.Wyp().NB().CvL(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO) && (vA = soVar.vA()) != null && vA.size() > 0) {
            if (vA.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it = vA.get(0).iterator();
                while (it.hasNext()) {
                    if (!icD(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> it2 = vA.iterator();
            while (it2.hasNext()) {
                if (pvs(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean pvs(List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list, boolean z) {
        boolean z2;
        for (com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB = soVar.Wyp().NB();
            String CvL = NB.CvL();
            if (TextUtils.equals(CvL, "flex") || (z && ((TextUtils.equals(NB.Gp(), "flex") && TextUtils.equals(NB.CvL(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.vG.NB.pvs.get(soVar.Wyp().icD()).intValue() == 7) || TextUtils.equals(CvL, "flex")))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (z2) {
            return true;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it = list.iterator();
        while (it.hasNext()) {
            if (vG(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void pvs(List<pvs> list, float f, List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list2) {
        float f2 = 0.0f;
        for (pvs pvsVar : list) {
            if (pvsVar.icD) {
                f2 += pvsVar.pvs;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).icD && list2.get(i2).OT()) {
                    i++;
                }
            }
            if (i > 0) {
                float ceil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    pvs pvsVar2 = list.get(i3);
                    if (pvsVar2.icD && list2.get(i3).OT()) {
                        pvsVar2.pvs -= ceil;
                    }
                }
            }
        }
    }

    public void pvs() {
        this.vG.clear();
        this.pvs.clear();
        this.icD.clear();
    }

    public vG pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        return this.pvs.get(NB(soVar));
    }

    public vG pvs(List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list) {
        return this.icD.get(Jd(list));
    }

    private void Jd(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        this.pvs.remove(NB(soVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> vA = soVar.vA();
        if (vA == null || vA.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>> it = vA.iterator();
        while (it.hasNext()) {
            vG(it.next());
        }
    }

    private void vG(List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.icD.remove(Jd(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.so> it = list.iterator();
        while (it.hasNext()) {
            Jd(it.next());
        }
    }

    private String NB(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        return soVar.vG();
    }

    private String Jd(List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String vG2 = list.get(i).vG();
            if (i < list.size() - 1) {
                sb.append(vG2).append("-");
            } else {
                sb.append(vG2);
            }
        }
        return sb.toString();
    }

    private void pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar, vG vGVar) {
        this.pvs.put(NB(soVar), vGVar);
    }

    private void pvs(List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> list, vG vGVar) {
        this.icD.put(Jd(list), vGVar);
    }

    /* compiled from: ComputeRuler.java */
    static class vG {
        float icD;
        float pvs;

        public vG() {
        }

        public vG(float f, float f2) {
            this.pvs = f;
            this.icD = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.pvs + ", height=" + this.icD + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* compiled from: ComputeRuler.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.Jd.icD$icD, reason: collision with other inner class name */
    static class C0040icD {
        double Jd;
        float NB;
        int icD;
        float pvs;
        int vG;

        C0040icD() {
        }

        static JSONObject pvs(C0040icD c0040icD) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0040icD.pvs);
                jSONObject.put("letterSpacing", c0040icD.icD);
                jSONObject.put("lineHeight", c0040icD.Jd);
                jSONObject.put("maxWidth", c0040icD.NB);
                jSONObject.put("fontWeight", c0040icD.vG);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* compiled from: ComputeRuler.java */
    static class pvs implements Cloneable {
        boolean icD;
        float pvs;
        float vG;

        pvs() {
        }

        public Object clone() {
            try {
                return (pvs) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }
}
