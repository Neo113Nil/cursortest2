package com.yandex.mobile.ads.unity.wrapper.interstitial;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

/* loaded from: classes3.dex */
public class a implements InterstitialAdEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36062a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private UnityInterstitialAdListener f36063b;

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdClicked() {
        if (this.f36063b == null) {
            return;
        }
        this.f36062a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.q
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a();
            }
        });
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdDismissed() {
        if (this.f36063b == null) {
            return;
        }
        this.f36062a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.m
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b();
            }
        });
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdFailedToShow(final AdError adError) {
        if (this.f36063b == null) {
            return;
        }
        this.f36062a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.p
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(adError);
            }
        });
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdImpression(final ImpressionData impressionData) {
        if (this.f36063b == null) {
            return;
        }
        this.f36062a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.n
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(impressionData);
            }
        });
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdShown() {
        if (this.f36063b == null) {
            return;
        }
        this.f36062a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.o
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        UnityInterstitialAdListener unityInterstitialAdListener = this.f36063b;
        if (unityInterstitialAdListener == null) {
            return;
        }
        unityInterstitialAdListener.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        UnityInterstitialAdListener unityInterstitialAdListener = this.f36063b;
        if (unityInterstitialAdListener == null) {
            return;
        }
        unityInterstitialAdListener.onAdDismissed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        UnityInterstitialAdListener unityInterstitialAdListener = this.f36063b;
        if (unityInterstitialAdListener == null) {
            return;
        }
        unityInterstitialAdListener.onAdShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdError adError) {
        UnityInterstitialAdListener unityInterstitialAdListener = this.f36063b;
        if (unityInterstitialAdListener == null) {
            return;
        }
        unityInterstitialAdListener.onAdFailedToShow(adError.getDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImpressionData impressionData) {
        if (this.f36063b == null) {
            return;
        }
        this.f36063b.onAdImpression(impressionData == null ? "" : impressionData.getRawData());
    }

    void a(UnityInterstitialAdListener unityInterstitialAdListener) {
        this.f36063b = unityInterstitialAdListener;
    }
}
