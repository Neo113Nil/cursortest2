package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes2.dex */
public class PAGErrorModel {
    private final String icD;
    private final int pvs;

    public PAGErrorModel(int i, String str) {
        this.pvs = i;
        this.icD = str;
    }

    public int getErrorCode() {
        return this.pvs;
    }

    public String getErrorMessage() {
        return this.icD;
    }
}
