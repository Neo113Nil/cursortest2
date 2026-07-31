package com.yandex.mobile.ads.unity.wrapper.banner;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;

/* loaded from: classes3.dex */
final class a implements BannerAdEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36021a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private UnityBannerAdListener f36022b;

    a() {
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onAdClicked() {
        if (this.f36022b == null) {
            return;
        }
        this.f36021a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.s
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a();
            }
        });
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onAdFailedToLoad(final AdRequestError adRequestError) {
        if (this.f36022b == null) {
            return;
        }
        this.f36021a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.n
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(adRequestError);
            }
        });
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onAdLoaded() {
        if (this.f36022b == null) {
            return;
        }
        this.f36021a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.q
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b();
            }
        });
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onImpression(final ImpressionData impressionData) {
        if (this.f36022b == null) {
            return;
        }
        this.f36021a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.p
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(impressionData);
            }
        });
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onLeftApplication() {
        if (this.f36022b == null) {
            return;
        }
        this.f36021a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.r
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c();
            }
        });
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onReturnedToApplication() {
        if (this.f36022b == null) {
            return;
        }
        this.f36021a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.o
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        UnityBannerAdListener unityBannerAdListener = this.f36022b;
        if (unityBannerAdListener == null) {
            return;
        }
        unityBannerAdListener.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        UnityBannerAdListener unityBannerAdListener = this.f36022b;
        if (unityBannerAdListener == null) {
            return;
        }
        unityBannerAdListener.onAdLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        UnityBannerAdListener unityBannerAdListener = this.f36022b;
        if (unityBannerAdListener == null) {
            return;
        }
        unityBannerAdListener.onLeftApplication();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        UnityBannerAdListener unityBannerAdListener = this.f36022b;
        if (unityBannerAdListener == null) {
            return;
        }
        unityBannerAdListener.onReturnedToApplication();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequestError adRequestError) {
        UnityBannerAdListener unityBannerAdListener = this.f36022b;
        if (unityBannerAdListener == null) {
            return;
        }
        unityBannerAdListener.onAdFailedToLoad(adRequestError.getDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImpressionData impressionData) {
        if (this.f36022b == null) {
            return;
        }
        this.f36022b.onImpression(impressionData == null ? "" : impressionData.getRawData());
    }

    void a(UnityBannerAdListener unityBannerAdListener) {
        this.f36022b = unityBannerAdListener;
    }
}
