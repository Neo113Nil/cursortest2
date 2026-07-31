package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes13.dex */
public final class PAGBannerSize {
    private int fb;
    private int fs;
    private int zmn;
    private int zn = 1;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, POBCommonConstants.DEFAULT_MIN_BITRATE);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.zmn = i;
        this.fs = i2;
    }

    public int getWidth() {
        return this.zmn;
    }

    public int getHeight() {
        return this.fs;
    }

    public int getType() {
        return this.zn;
    }

    public int getMaxHeight() {
        return this.fb;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        int zmn = zn.zmn(context, i, 0);
        if (zmn == zn.zmn) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, zmn);
        pAGBannerSize.zn = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int zmn = zn.zmn(context, 0);
        if (zmn == zn.zmn) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.fb = zmn;
        pAGBannerSize.zn = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.fb = i2;
        pAGBannerSize.zn = 3;
        return pAGBannerSize;
    }
}
