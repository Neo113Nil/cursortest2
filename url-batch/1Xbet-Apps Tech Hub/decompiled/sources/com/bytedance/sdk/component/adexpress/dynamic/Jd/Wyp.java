package com.bytedance.sdk.component.adexpress.dynamic.Jd;

import com.bytedance.sdk.component.adexpress.dynamic.Jd.icD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FlexComputeRuler.java */
/* loaded from: classes.dex */
public class Wyp {
    public static float pvs(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    public static List<icD.pvs> pvs(float f, List<icD.pvs> list) {
        ArrayList<icD.pvs> arrayList = new ArrayList();
        Iterator<icD.pvs> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((icD.pvs) it.next().clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (icD.pvs pvsVar : arrayList) {
            if (pvsVar.icD) {
                i = (int) (i + pvsVar.pvs);
            } else {
                i2 = (int) (i2 + pvsVar.pvs);
                z = false;
            }
        }
        if (z && f > i) {
            return arrayList;
        }
        float f2 = i;
        float f3 = f < f2 ? f / f2 : 1.0f;
        float f4 = f > f2 ? (f - f2) / i2 : 0.0f;
        if (f4 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (icD.pvs pvsVar2 : arrayList) {
                if (!pvsVar2.icD && pvsVar2.vG != 0.0f && pvsVar2.pvs * f4 > pvsVar2.vG) {
                    pvsVar2.pvs = pvsVar2.vG;
                    pvsVar2.icD = true;
                    z2 = true;
                }
                arrayList2.add(pvsVar2);
            }
            if (z2) {
                return pvs(f, arrayList2);
            }
        }
        int i3 = 0;
        for (icD.pvs pvsVar3 : arrayList) {
            if (pvsVar3.icD) {
                pvsVar3.pvs = pvs(pvsVar3.pvs * f3);
            } else {
                pvsVar3.pvs = pvs(pvsVar3.pvs * f4);
            }
            i3 = (int) (i3 + pvsVar3.pvs);
        }
        float f5 = i3;
        if (f5 < f) {
            float f6 = f - f5;
            for (int i4 = 0; i4 < arrayList.size() && f6 > 0.0f; i4 = (i4 + 1) % arrayList.size()) {
                icD.pvs pvsVar4 = (icD.pvs) arrayList.get(i4);
                if ((f < f2 && pvsVar4.icD) || (f > f2 && !pvsVar4.icD)) {
                    pvsVar4.pvs += 0.0625f;
                    f6 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
