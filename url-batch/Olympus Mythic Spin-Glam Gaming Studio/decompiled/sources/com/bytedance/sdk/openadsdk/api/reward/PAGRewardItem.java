package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes10.dex */
public class PAGRewardItem {
    private final String fs;
    private final int zmn;

    public PAGRewardItem(int i, String str) {
        this.zmn = i;
        this.fs = str;
    }

    public int getRewardAmount() {
        return this.zmn;
    }

    public String getRewardName() {
        return this.fs;
    }
}
