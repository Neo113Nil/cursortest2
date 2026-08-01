package com.bytedance.adsdk.pvs.icD.vG.pvs;

import com.bytedance.adsdk.pvs.icD.icD.pvs.uc;
import java.util.Deque;

/* compiled from: ConstantStringParser.java */
/* loaded from: classes.dex */
public class icD extends sUS {
    @Override // com.bytedance.adsdk.pvs.icD.vG.pvs.sUS
    public int pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque, com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar) {
        if ('\'' != pvs(i, str)) {
            return pvsVar.pvs(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && pvs(i3, str) != '\'') {
            i3++;
        }
        if (pvs(i3, str) != '\'') {
            throw new com.bytedance.adsdk.pvs.pvs.pvs("String expression not surrounded by '", str.substring(i2 - 1));
        }
        deque.push(new uc(str.substring(i2, i3)));
        return i3 + 1;
    }
}
