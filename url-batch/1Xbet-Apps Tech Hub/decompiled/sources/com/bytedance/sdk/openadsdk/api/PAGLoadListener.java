package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.Jd;

/* loaded from: classes2.dex */
public interface PAGLoadListener<Ad> extends Jd {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.Jd
    void onError(int i, String str);
}
