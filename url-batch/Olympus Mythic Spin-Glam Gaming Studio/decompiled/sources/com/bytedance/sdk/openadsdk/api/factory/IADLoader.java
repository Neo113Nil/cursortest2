package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.nps;

/* loaded from: classes5.dex */
public interface IADLoader<R extends PAGRequest, L extends nps> {
    void loadAd(String str, R r, L l);
}
