package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes3.dex */
public class PAGErrorModel {
    private final String fs;
    private final int zmn;

    public PAGErrorModel(int i, String str) {
        this.zmn = i;
        this.fs = str;
    }

    public int getErrorCode() {
        return this.zmn;
    }

    public String getErrorMessage() {
        return this.fs;
    }
}
