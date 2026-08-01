package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes2.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int pvs;

    public int getTimeout() {
        return this.pvs;
    }

    public void setTimeout(int i) {
        this.pvs = i;
    }
}
