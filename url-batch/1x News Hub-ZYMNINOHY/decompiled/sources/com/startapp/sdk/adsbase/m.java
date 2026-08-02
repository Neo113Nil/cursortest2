package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.StartAppAd;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3351a;

    static {
        int[] iArr = new int[StartAppAd.AdMode.values().length];
        f3351a = iArr;
        try {
            iArr[StartAppAd.AdMode.FULLPAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3351a[StartAppAd.AdMode.OFFERWALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3351a[StartAppAd.AdMode.OVERLAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3351a[StartAppAd.AdMode.REWARDED_VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
