package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* compiled from: TTFullScreenVideoAdImpl.java */
/* loaded from: classes2.dex */
class IP implements TTClientBidding {
    private final sUS pvs;

    IP(Context context, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar) {
        this.pvs = new sUS(context, pvsVar);
    }

    public sUS pvs() {
        return this.pvs;
    }

    public void pvs(boolean z) {
        this.pvs.pvs(z);
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
