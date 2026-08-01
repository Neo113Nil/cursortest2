package com.bytedance.adsdk.pvs.icD.vG.pvs;

import com.bytedance.adsdk.pvs.icD.icD.pvs.bNS;
import java.util.Deque;

/* compiled from: NumberParser.java */
/* loaded from: classes.dex */
public class yiw extends sUS {
    private boolean pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque) {
        if ('-' == pvs(i, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.pvs.icD.Jd.vG.pvs(deque.peek().pvs())) {
                return false;
            }
            if (com.bytedance.adsdk.pvs.icD.NB.pvs.vG(pvs(i + 1, str))) {
                return true;
            }
            throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
        }
        return com.bytedance.adsdk.pvs.icD.NB.pvs.vG(pvs(i, str));
    }

    @Override // com.bytedance.adsdk.pvs.icD.vG.pvs.sUS
    public int pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque, com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar) {
        char pvs;
        if (!pvs(str, i, deque)) {
            return pvsVar.pvs(str, i, deque);
        }
        int i2 = pvs(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            pvs = pvs(i2, str);
            if (com.bytedance.adsdk.pvs.icD.NB.pvs.vG(pvs) || (!z && pvs == '.')) {
                i2++;
                if (pvs == '.') {
                    z = true;
                }
            }
        }
        if (pvs == '.') {
            throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
        }
        deque.push(new bNS(str.substring(i, i2)));
        return i2;
    }
}
