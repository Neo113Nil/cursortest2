package com.yandex.mobile.ads.unity.wrapper.appopenad;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes3.dex */
final class b implements AppOpenAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f35990a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private UnityAppOpenAdLoadListener f35991b;

    b() {
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener
    public void onAdFailedToLoad(final AdRequestError adRequestError) {
        if (this.f35991b == null) {
            return;
        }
        this.f35990a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.r
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(adRequestError);
            }
        });
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener
    public void onAdLoaded(final AppOpenAd appOpenAd) {
        if (this.f35991b == null) {
            return;
        }
        this.f35990a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.s
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(appOpenAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequestError adRequestError) {
        UnityAppOpenAdLoadListener unityAppOpenAdLoadListener = this.f35991b;
        if (unityAppOpenAdLoadListener == null) {
            return;
        }
        unityAppOpenAdLoadListener.onAdFailedToLoad(adRequestError.getDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppOpenAd appOpenAd) {
        if (this.f35991b == null) {
            return;
        }
        this.f35991b.onAdLoaded(new AppOpenAdWrapper(appOpenAd));
    }

    public void a(UnityAppOpenAdLoadListener unityAppOpenAdLoadListener) {
        this.f35991b = unityAppOpenAdLoadListener;
    }
}
