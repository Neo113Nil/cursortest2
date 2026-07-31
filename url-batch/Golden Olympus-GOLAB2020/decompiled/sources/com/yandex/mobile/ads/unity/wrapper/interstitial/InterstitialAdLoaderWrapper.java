package com.yandex.mobile.ads.unity.wrapper.interstitial;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import com.yandex.mobile.ads.unity.wrapper.a;

/* loaded from: classes3.dex */
public class InterstitialAdLoaderWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36056a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final b f36057b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.unity.wrapper.a f36058c;

    public InterstitialAdLoaderWrapper(final Context context) {
        this.f36058c = new com.yandex.mobile.ads.unity.wrapper.a(new a.InterfaceC0209a() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.g
            @Override // com.yandex.mobile.ads.unity.wrapper.a.InterfaceC0209a
            public final Object a() {
                InterstitialAdLoader a4;
                a4 = InterstitialAdLoaderWrapper.this.a(context);
                return a4;
            }
        });
    }

    public void cancelLoading() {
        this.f36056a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.h
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoaderWrapper.this.a();
            }
        });
    }

    public void clearUnityInterstitialListener() {
        this.f36056a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.e
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoaderWrapper.this.b();
            }
        });
    }

    public void loadAd(final AdRequestConfiguration adRequestConfiguration) {
        this.f36056a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.f
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoaderWrapper.this.a(adRequestConfiguration);
            }
        });
    }

    public void setUnityInterstitialAdLoadListener(final UnityInterstitialAdLoadListener unityInterstitialAdLoadListener) {
        this.f36056a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.d
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoaderWrapper.this.a(unityInterstitialAdLoadListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        com.yandex.mobile.ads.unity.wrapper.a aVar = this.f36058c;
        if (aVar == null) {
            return;
        }
        ((InterstitialAdLoader) aVar.a()).cancelLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f36057b.a((UnityInterstitialAdLoadListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequestConfiguration adRequestConfiguration) {
        com.yandex.mobile.ads.unity.wrapper.a aVar = this.f36058c;
        if (aVar == null) {
            return;
        }
        ((InterstitialAdLoader) aVar.a()).loadAd(adRequestConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterstitialAdLoader a(Context context) {
        return c.a(context, this.f36057b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(UnityInterstitialAdLoadListener unityInterstitialAdLoadListener) {
        this.f36057b.a(unityInterstitialAdLoadListener);
    }
}
