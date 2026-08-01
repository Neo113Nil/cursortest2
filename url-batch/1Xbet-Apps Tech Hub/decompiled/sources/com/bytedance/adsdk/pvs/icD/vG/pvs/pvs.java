package com.bytedance.adsdk.pvs.icD.vG.pvs;

import com.bytedance.adsdk.pvs.icD.icD.pvs.rCZ;
import java.util.Deque;

/* compiled from: CommaParser.java */
/* loaded from: classes.dex */
public class pvs extends sUS {
    @Override // com.bytedance.adsdk.pvs.icD.vG.pvs.sUS
    public int pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque, com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar) {
        if (',' != pvs(i, str)) {
            return pvsVar.pvs(str, i, deque);
        }
        deque.push(new rCZ(com.bytedance.adsdk.pvs.icD.Jd.Jd.COMMA));
        return i + 1;
    }
}
