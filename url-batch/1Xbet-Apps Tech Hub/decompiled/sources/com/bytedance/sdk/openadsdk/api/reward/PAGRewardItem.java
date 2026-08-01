package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes2.dex */
public class PAGRewardItem {
    private final String icD;
    private final int pvs;

    public PAGRewardItem(int i, String str) {
        this.pvs = i;
        this.icD = str;
    }

    public int getRewardAmount() {
        return this.pvs;
    }

    public String getRewardName() {
        return this.icD;
    }
}
