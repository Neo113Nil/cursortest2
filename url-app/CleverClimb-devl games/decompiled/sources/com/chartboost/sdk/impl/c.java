package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;
import com.mopub.common.AdType;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3806a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3807b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3808c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3809d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    private c(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.f3806a = i;
        this.f3807b = str;
        this.f3808c = str2;
        this.f3809d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
    }

    public static c a() {
        return new c(0, AdType.INTERSTITIAL, AdType.INTERSTITIAL, "/interstitial/get", "webview/%s/interstitial/get", "/interstitial/show", false, false);
    }

    public static c b() {
        return new c(1, "rewarded", "rewarded-video", "/reward/get", "webview/%s/reward/get", "/reward/show", true, false);
    }

    public static c c() {
        return new c(2, "inplay", null, "/inplay/get", "no webview endpoint", "/inplay/show", false, true);
    }

    public String a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = this.f3808c;
        objArr[1] = i == 1 ? "web" : TapjoyConstants.TJC_PLUGIN_NATIVE;
        return String.format("%s-%s", objArr);
    }

    public void a(String str) {
        if (com.chartboost.sdk.i.f3679c != null) {
            switch (this.f3806a) {
                case 0:
                    com.chartboost.sdk.i.f3679c.didClickInterstitial(str);
                    break;
                case 1:
                    com.chartboost.sdk.i.f3679c.didClickRewardedVideo(str);
                    break;
            }
        }
    }

    public void b(String str) {
        if (com.chartboost.sdk.i.f3679c != null) {
            switch (this.f3806a) {
                case 0:
                    com.chartboost.sdk.i.f3679c.didCloseInterstitial(str);
                    break;
                case 1:
                    com.chartboost.sdk.i.f3679c.didCloseRewardedVideo(str);
                    break;
            }
        }
    }

    public void c(String str) {
        if (com.chartboost.sdk.i.f3679c != null) {
            switch (this.f3806a) {
                case 0:
                    com.chartboost.sdk.i.f3679c.didDismissInterstitial(str);
                    break;
                case 1:
                    com.chartboost.sdk.i.f3679c.didDismissRewardedVideo(str);
                    break;
            }
        }
    }

    public void d(String str) {
        if (com.chartboost.sdk.i.f3679c != null) {
            switch (this.f3806a) {
                case 0:
                    com.chartboost.sdk.i.f3679c.didCacheInterstitial(str);
                    break;
                case 1:
                    com.chartboost.sdk.i.f3679c.didCacheRewardedVideo(str);
                    break;
                case 2:
                    com.chartboost.sdk.i.f3679c.didCacheInPlay(str);
                    break;
            }
        }
    }

    public void a(String str, CBError.CBImpressionError cBImpressionError) {
        if (com.chartboost.sdk.i.f3679c != null) {
            switch (this.f3806a) {
                case 0:
                    com.chartboost.sdk.i.f3679c.didFailToLoadInterstitial(str, cBImpressionError);
                    break;
                case 1:
                    com.chartboost.sdk.i.f3679c.didFailToLoadRewardedVideo(str, cBImpressionError);
                    break;
                case 2:
                    com.chartboost.sdk.i.f3679c.didFailToLoadInPlay(str, cBImpressionError);
                    break;
            }
        }
    }

    public void e(String str) {
        if (com.chartboost.sdk.i.f3679c != null) {
            switch (this.f3806a) {
                case 0:
                    com.chartboost.sdk.i.f3679c.didDisplayInterstitial(str);
                    break;
                case 1:
                    com.chartboost.sdk.i.f3679c.didDisplayRewardedVideo(str);
                    break;
            }
        }
    }

    public boolean f(String str) {
        if (com.chartboost.sdk.i.f3679c != null) {
            switch (this.f3806a) {
                case 0:
                    return com.chartboost.sdk.i.f3679c.shouldDisplayInterstitial(str);
                case 1:
                    return com.chartboost.sdk.i.f3679c.shouldDisplayRewardedVideo(str);
            }
        }
        return true;
    }

    public boolean g(String str) {
        if (com.chartboost.sdk.i.f3679c != null) {
            switch (this.f3806a) {
                case 0:
                    return com.chartboost.sdk.i.f3679c.shouldRequestInterstitial(str);
            }
        }
        return true;
    }

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final int f3811b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3812c;

        /* renamed from: d, reason: collision with root package name */
        private final CBError.CBImpressionError f3813d;

        public a(int i, String str, CBError.CBImpressionError cBImpressionError) {
            this.f3811b = i;
            this.f3812c = str;
            this.f3813d = cBImpressionError;
        }

        @Override // java.lang.Runnable
        public void run() {
            switch (this.f3811b) {
                case 0:
                    c.this.d(this.f3812c);
                    break;
                case 1:
                    c.this.a(this.f3812c);
                    break;
                case 2:
                    c.this.b(this.f3812c);
                    break;
                case 3:
                    c.this.c(this.f3812c);
                    break;
                case 4:
                    c.this.a(this.f3812c, this.f3813d);
                    break;
                case 5:
                    c.this.e(this.f3812c);
                    break;
            }
        }
    }
}
