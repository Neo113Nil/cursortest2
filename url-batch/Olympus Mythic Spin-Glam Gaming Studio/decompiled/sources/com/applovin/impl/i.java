package com.applovin.impl;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;

/* loaded from: classes12.dex */
public enum i {
    PUBLISHER_INITIATED("publisher_initiated"),
    SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
    REFRESH(ToolBar.REFRESH),
    EXPONENTIAL_RETRY("exponential_retry"),
    EXPIRED("expired"),
    NATIVE_AD_PLACER("native_ad_placer");

    private final String a;

    i(String str) {
        this.a = str;
    }

    public String b() {
        return this.a;
    }
}
