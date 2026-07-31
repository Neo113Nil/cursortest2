package com.yandex.mobile.ads.unity.wrapper.interstitial;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;

/* loaded from: classes3.dex */
public class InterstitialAdWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36059a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final a f36060b;

    /* renamed from: c, reason: collision with root package name */
    InterstitialAd f36061c;

    public InterstitialAdWrapper(InterstitialAd interstitialAd) {
        a aVar = new a();
        this.f36060b = aVar;
        this.f36061c = interstitialAd;
        interstitialAd.setAdEventListener(aVar);
    }

    public void clearUnityInterstitialAdListener() {
        this.f36059a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.j
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdWrapper.this.a();
            }
        });
    }

    public void destroyInterstitialAd() {
        this.f36059a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.i
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdWrapper.this.b();
            }
        });
    }

    public AdInfo getInfo() {
        InterstitialAd interstitialAd = this.f36061c;
        if (interstitialAd == null) {
            return null;
        }
        return interstitialAd.getInfo();
    }

    public void setUnityInterstitialAdListener(final UnityInterstitialAdListener unityInterstitialAdListener) {
        this.f36059a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.k
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdWrapper.this.a(unityInterstitialAdListener);
            }
        });
    }

    public void show(final Activity activity) {
        this.f36059a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.interstitial.l
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdWrapper.this.a(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f36060b.a((UnityInterstitialAdListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f36061c == null) {
            return;
        }
        this.f36060b.a((UnityInterstitialAdListener) null);
        this.f36061c.setAdEventListener(null);
        this.f36061c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(UnityInterstitialAdListener unityInterstitialAdListener) {
        this.f36060b.a(unityInterstitialAdListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        InterstitialAd interstitialAd = this.f36061c;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.show(activity);
    }
}
