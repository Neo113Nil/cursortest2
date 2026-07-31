package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* loaded from: classes11.dex */
public class PAGBiddingRequest {
    private PAGBannerSize zmn = null;
    private String fs = null;
    private String zn = null;

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.zmn = pAGBannerSize;
    }

    public PAGBannerSize getBannerSize() {
        return this.zmn;
    }

    public void setSlotId(String str) {
        this.fs = str;
    }

    public String getSlotId() {
        return this.fs;
    }

    public String getAdxId() {
        return this.zn;
    }

    public void setAdxId(String str) {
        this.zn = str;
    }
}
