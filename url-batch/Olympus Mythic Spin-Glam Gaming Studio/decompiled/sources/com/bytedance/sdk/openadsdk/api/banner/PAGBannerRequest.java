package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes11.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize zmn;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.zmn = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.zmn;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.zmn = pAGBannerSize;
    }
}
