package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes3.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int zmn;

    public int getTimeout() {
        return this.zmn;
    }

    public void setTimeout(int i) {
        this.zmn = i;
    }
}
