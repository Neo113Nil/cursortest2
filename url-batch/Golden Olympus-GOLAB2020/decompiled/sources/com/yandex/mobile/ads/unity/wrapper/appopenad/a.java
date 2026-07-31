package com.yandex.mobile.ads.unity.wrapper.appopenad;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

/* loaded from: classes3.dex */
public class a implements AppOpenAdEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f35988a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private UnityAppOpenAdListener f35989b;

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAdEventListener
    public void onAdClicked() {
        if (this.f35989b == null) {
            return;
        }
        this.f35988a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.m
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a();
            }
        });
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAdEventListener
    public void onAdDismissed() {
        if (this.f35989b == null) {
            return;
        }
        this.f35988a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.q
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b();
            }
        });
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAdEventListener
    public void onAdFailedToShow(final AdError adError) {
        if (this.f35989b == null) {
            return;
        }
        this.f35988a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.p
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(adError);
            }
        });
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAdEventListener
    public void onAdImpression(final ImpressionData impressionData) {
        if (this.f35989b == null) {
            return;
        }
        this.f35988a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.o
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(impressionData);
            }
        });
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAdEventListener
    public void onAdShown() {
        if (this.f35989b == null) {
            return;
        }
        this.f35988a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.n
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        UnityAppOpenAdListener unityAppOpenAdListener = this.f35989b;
        if (unityAppOpenAdListener == null) {
            return;
        }
        unityAppOpenAdListener.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        UnityAppOpenAdListener unityAppOpenAdListener = this.f35989b;
        if (unityAppOpenAdListener == null) {
            return;
        }
        unityAppOpenAdListener.onAdDismissed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        UnityAppOpenAdListener unityAppOpenAdListener = this.f35989b;
        if (unityAppOpenAdListener == null) {
            return;
        }
        unityAppOpenAdListener.onAdShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdError adError) {
        UnityAppOpenAdListener unityAppOpenAdListener = this.f35989b;
        if (unityAppOpenAdListener == null) {
            return;
        }
        unityAppOpenAdListener.onAdFailedToShow(adError.getDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImpressionData impressionData) {
        if (this.f35989b == null) {
            return;
        }
        this.f35989b.onAdImpression(impressionData == null ? "" : impressionData.getRawData());
    }

    void a(UnityAppOpenAdListener unityAppOpenAdListener) {
        this.f35989b = unityAppOpenAdListener;
    }
}
