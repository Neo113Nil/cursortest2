package com.facebook.ads.internal.adapters;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f5019a = {"com.flurry.android.FlurryAgent", "com.flurry.android.ads.FlurryAdErrorType", "com.flurry.android.ads.FlurryAdNative", "com.flurry.android.ads.FlurryAdNativeAsset", "com.flurry.android.ads.FlurryAdNativeListener"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f5020b = {"com.inmobi.ads.InMobiNative", "com.inmobi.sdk.InMobiSdk"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f5021c = {"com.google.android.gms.ads.formats.NativeAdView"};

    public static boolean a(g gVar) {
        String[] strArr;
        switch (gVar) {
            case AN:
                return true;
            case YAHOO:
                strArr = f5019a;
                break;
            case INMOBI:
                strArr = f5020b;
                break;
            case ADMOB:
                strArr = f5021c;
                break;
            default:
                return false;
        }
        return a(strArr);
    }

    private static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean a(String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (!a(str)) {
                return false;
            }
        }
        return true;
    }
}
