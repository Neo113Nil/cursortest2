package com.bytedance.sdk.openadsdk.component.reward.icD;

import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.model.zM;

/* compiled from: RewardFullTypeFactory.java */
/* loaded from: classes2.dex */
public class sUS {
    public static icD pvs(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        cR cRVar = pvsVar.icD;
        if ((cRVar instanceof zM) && ((zM) cRVar).aSt()) {
            return new NB(pvsVar);
        }
        if (rCZ.qh(cRVar)) {
            return new Mxy(pvsVar);
        }
        if (yiw.vG(cRVar)) {
            return new yiw(pvsVar);
        }
        if (so.pvs(cRVar)) {
            return new so(pvsVar);
        }
        if (Mxy.pvs(cRVar)) {
            return new Mxy(pvsVar);
        }
        if (vG.pvs(cRVar)) {
            return new vG(pvsVar);
        }
        return new Jd(pvsVar);
    }
}
