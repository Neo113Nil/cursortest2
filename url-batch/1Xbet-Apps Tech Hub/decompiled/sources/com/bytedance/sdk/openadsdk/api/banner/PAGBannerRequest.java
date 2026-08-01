package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes2.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize pvs;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.pvs = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.pvs;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.pvs = pAGBannerSize;
    }
}
