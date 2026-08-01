package com.bytedance.adsdk.pvs.icD.vG.pvs;

import java.util.Deque;

/* compiled from: MethodParser.java */
/* loaded from: classes.dex */
public class NB extends sUS {
    @Override // com.bytedance.adsdk.pvs.icD.vG.pvs.sUS
    public int pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque, com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar) {
        char pvs;
        int i2 = i;
        while (true) {
            pvs = pvs(i2, str);
            if (!com.bytedance.adsdk.pvs.icD.NB.pvs.icD(pvs) && !com.bytedance.adsdk.pvs.icD.NB.pvs.vG(pvs)) {
                break;
            }
            i2++;
        }
        if (pvs != '(') {
            return pvsVar.pvs(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.pvs.icD.icD.pvs.Wyp(str.substring(i, i2)));
        return i2 + 1;
    }
}
