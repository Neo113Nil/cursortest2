package com.bytedance.sdk.openadsdk.api.init;

/* loaded from: classes8.dex */
public class PAGBidError {
    private String fs;
    private int zmn;

    public PAGBidError(int i, String str) {
        this.zmn = i;
        this.fs = str;
    }

    public int getCode() {
        return this.zmn;
    }

    public String getMessage() {
        return this.fs;
    }
}
