package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* compiled from: TTRewardVideoAdImpl.java */
/* loaded from: classes2.dex */
class bNS implements TTClientBidding {
    private final so pvs;

    bNS(Context context, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, AdSlot adSlot) {
        this.pvs = new so(context, pvsVar, adSlot);
    }

    public so pvs() {
        return this.pvs;
    }

    public void icD() {
        this.pvs.pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.pvs.win(d);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.pvs.loss(d, str, str2);
    }
}
