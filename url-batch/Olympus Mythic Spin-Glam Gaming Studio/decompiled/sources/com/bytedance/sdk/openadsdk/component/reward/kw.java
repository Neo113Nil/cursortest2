package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* loaded from: classes6.dex */
class kw implements TTClientBidding {
    private final zg zmn;

    kw(Context context, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        this.zmn = new zg(context, zmnVar);
    }

    public zg zmn() {
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
