package com.youappi.sdk.net.model;

import com.youappi.sdk.AdType;

/* loaded from: classes2.dex */
public class RewardedVideoItem extends VideoItem {
    @Override // com.youappi.sdk.net.model.VideoItem, com.youappi.sdk.net.model.AdItem
    public AdType getAdType() {
        return AdType.REWARDED_VIDEO;
    }
}
