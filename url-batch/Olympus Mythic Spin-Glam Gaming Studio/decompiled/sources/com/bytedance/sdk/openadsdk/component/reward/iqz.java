package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* loaded from: classes4.dex */
class iqz implements TTClientBidding {
    private final iv zmn;

    iqz(Context context, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, AdSlot adSlot) {
        this.zmn = new iv(context, zmnVar, adSlot);
    }

    public iv zmn() {
        return this.zmn;
    }

    public void fs() {
        this.zmn.zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.zmn.win(d);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.zmn.loss(d, str, str2);
    }
}
