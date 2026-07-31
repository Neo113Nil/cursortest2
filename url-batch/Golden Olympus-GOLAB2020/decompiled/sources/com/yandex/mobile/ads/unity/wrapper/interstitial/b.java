package com.yandex.mobile.ads.unity.wrapper.interstitial;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* loaded from: classes3.dex */
final class b implements InterstitialAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36064a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private UnityInterstitialAdLoadListener f36065b;

    b() {
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    public void onAdFailedToLoad(final AdRequestError adRequestError) {
        if (this.f36065b == null) {
            return;
        }
        this.f36064a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.s
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(adRequestError);
            }
        });
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    public void onAdLoaded(final InterstitialAd interstitialAd) {
        if (this.f36065b == null) {
            return;
        }
        this.f36064a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.r
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(interstitialAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequestError adRequestError) {
        UnityInterstitialAdLoadListener unityInterstitialAdLoadListener = this.f36065b;
        if (unityInterstitialAdLoadListener == null) {
            return;
        }
        unityInterstitialAdLoadListener.onAdFailedToLoad(adRequestError.getDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterstitialAd interstitialAd) {
        if (this.f36065b == null) {
            return;
        }
        this.f36065b.onAdLoaded(new InterstitialAdWrapper(interstitialAd));
    }

    public void a(UnityInterstitialAdLoadListener unityInterstitialAdLoadListener) {
        this.f36065b = unityInterstitialAdLoadListener;
    }
}
