package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.common.nps;

/* loaded from: classes4.dex */
public interface PAGLoadListener<Ad> extends nps {
    @MainThread
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.nps
    @MainThread
    void onError(int i, String str);
}
