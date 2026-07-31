package com.yandex.mobile.ads.unity.wrapper.appopenad;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoader;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.unity.wrapper.a;

/* loaded from: classes3.dex */
public class AppOpenAdLoaderWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f35982a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final b f35983b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.unity.wrapper.a f35984c;

    public AppOpenAdLoaderWrapper(final Context context) {
        this.f35984c = new com.yandex.mobile.ads.unity.wrapper.a(new a.InterfaceC0209a() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.h
            @Override // com.yandex.mobile.ads.unity.wrapper.a.InterfaceC0209a
            public final Object a() {
                AppOpenAdLoader a4;
                a4 = AppOpenAdLoaderWrapper.this.a(context);
                return a4;
            }
        });
    }

    public void cancelLoading() {
        this.f35982a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.d
            @Override // java.lang.Runnable
            public final void run() {
                AppOpenAdLoaderWrapper.this.a();
            }
        });
    }

    public void clearUnityAppOpenListener() {
        this.f35982a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.f
            @Override // java.lang.Runnable
            public final void run() {
                AppOpenAdLoaderWrapper.this.b();
            }
        });
    }

    public void loadAd(final AdRequestConfiguration adRequestConfiguration) {
        this.f35982a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.e
            @Override // java.lang.Runnable
            public final void run() {
                AppOpenAdLoaderWrapper.this.a(adRequestConfiguration);
            }
        });
    }

    public void setUnityAppOpenAdLoadListener(final UnityAppOpenAdLoadListener unityAppOpenAdLoadListener) {
        this.f35982a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.g
            @Override // java.lang.Runnable
            public final void run() {
                AppOpenAdLoaderWrapper.this.a(unityAppOpenAdLoadListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        com.yandex.mobile.ads.unity.wrapper.a aVar = this.f35984c;
        if (aVar == null) {
            return;
        }
        ((AppOpenAdLoader) aVar.a()).cancelLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f35983b.a((UnityAppOpenAdLoadListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequestConfiguration adRequestConfiguration) {
        com.yandex.mobile.ads.unity.wrapper.a aVar = this.f35984c;
        if (aVar == null) {
            return;
        }
        ((AppOpenAdLoader) aVar.a()).loadAd(adRequestConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AppOpenAdLoader a(Context context) {
        return c.a(context, this.f35983b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(UnityAppOpenAdLoadListener unityAppOpenAdLoadListener) {
        this.f35983b.a(unityAppOpenAdLoadListener);
    }
}
