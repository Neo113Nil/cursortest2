package com.bytedance.sdk.openadsdk.component.so;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.icD.yiw;

/* compiled from: TTAppOpenVideoController.java */
/* loaded from: classes2.dex */
public class icD extends com.bytedance.sdk.openadsdk.core.video.vG.pvs {
    public icD(Context context, ViewGroup viewGroup, cR cRVar) {
        super(context, viewGroup, cRVar, null);
    }

    public void pvs(bNS.pvs pvsVar) {
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(this.sUS, pvsVar, (yiw) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.pvs
    public void cR() {
        bNS.pvs pvsVar = new bNS.pvs();
        pvsVar.pvs(NB());
        pvsVar.vG(so());
        pvsVar.icD(sUS());
        pvsVar.Jd(yiw());
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.NB(this.sUS, pvsVar);
    }
}
