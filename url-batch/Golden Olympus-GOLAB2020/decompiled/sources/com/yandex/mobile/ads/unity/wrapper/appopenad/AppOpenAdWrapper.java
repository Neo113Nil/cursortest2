package com.yandex.mobile.ads.unity.wrapper.appopenad;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.appopenad.AppOpenAd;

/* loaded from: classes3.dex */
public class AppOpenAdWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f35985a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final a f35986b;

    /* renamed from: c, reason: collision with root package name */
    AppOpenAd f35987c;

    public AppOpenAdWrapper(AppOpenAd appOpenAd) {
        a aVar = new a();
        this.f35986b = aVar;
        this.f35987c = appOpenAd;
        appOpenAd.setAdEventListener(aVar);
    }

    public void clearUnityAppOpenAdListener() {
        this.f35985a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.l
            @Override // java.lang.Runnable
            public final void run() {
                AppOpenAdWrapper.this.a();
            }
        });
    }

    public void destroyAppOpenAd() {
        this.f35985a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.j
            @Override // java.lang.Runnable
            public final void run() {
                AppOpenAdWrapper.this.b();
            }
        });
    }

    public void setUnityAppOpenAdListener(final UnityAppOpenAdListener unityAppOpenAdListener) {
        this.f35985a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.k
            @Override // java.lang.Runnable
            public final void run() {
                AppOpenAdWrapper.this.a(unityAppOpenAdListener);
            }
        });
    }

    public void show(final Activity activity) {
        this.f35985a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.appopenad.i
            @Override // java.lang.Runnable
            public final void run() {
                AppOpenAdWrapper.this.a(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f35986b.a((UnityAppOpenAdListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f35987c == null) {
            return;
        }
        this.f35986b.a((UnityAppOpenAdListener) null);
        this.f35987c.setAdEventListener(null);
        this.f35987c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(UnityAppOpenAdListener unityAppOpenAdListener) {
        this.f35986b.a(unityAppOpenAdListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        AppOpenAd appOpenAd = this.f35987c;
        if (appOpenAd == null) {
            return;
        }
        appOpenAd.show(activity);
    }
}
