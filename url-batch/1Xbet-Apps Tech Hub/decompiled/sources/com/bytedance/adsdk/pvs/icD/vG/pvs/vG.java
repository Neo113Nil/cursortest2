package com.bytedance.adsdk.pvs.icD.vG.pvs;

import com.bytedance.adsdk.pvs.icD.icD.pvs.OT;
import java.util.Deque;

/* compiled from: IdentifierParser.java */
/* loaded from: classes.dex */
public class vG extends sUS {
    @Override // com.bytedance.adsdk.pvs.icD.vG.pvs.sUS
    public int pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque, com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar) {
        if (!com.bytedance.adsdk.pvs.icD.NB.pvs.icD(pvs(i, str))) {
            return pvsVar.pvs(str, i, deque);
        }
        return pvs(str, i, deque);
    }

    private int pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char pvs = pvs(i2, str);
            if (!com.bytedance.adsdk.pvs.icD.NB.pvs.icD(pvs) && !com.bytedance.adsdk.pvs.icD.NB.pvs.vG(pvs) && '.' != pvs && '[' != pvs && ']' != pvs && '_' != pvs && '-' != pvs) {
                break;
            }
            i3++;
        }
        String substring = str.substring(i, i2);
        if (com.bytedance.adsdk.pvs.icD.Jd.pvs.pvs(substring) != null) {
            deque.push(new com.bytedance.adsdk.pvs.icD.icD.pvs.yiw(substring));
        } else {
            deque.push(new OT(substring));
        }
        return i2;
    }
}
