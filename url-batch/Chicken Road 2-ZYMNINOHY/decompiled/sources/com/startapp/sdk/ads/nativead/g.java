package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.ads.nativead.StartAppNativeAd;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6211a;

    static {
        int[] iArr = new int[StartAppNativeAd.CampaignAction.values().length];
        f6211a = iArr;
        try {
            iArr[StartAppNativeAd.CampaignAction.OPEN_MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6211a[StartAppNativeAd.CampaignAction.LAUNCH_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
