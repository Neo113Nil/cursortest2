package com.yandex.mobile.ads.unity.wrapper.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.unity.wrapper.a;

/* loaded from: classes3.dex */
public class BannerAdWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final e f36017a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f36018b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final a f36019c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.unity.wrapper.a f36020d;

    public BannerAdWrapper(final Context context, final String str, final BannerAdSize bannerAdSize, int i4) {
        this.f36020d = new com.yandex.mobile.ads.unity.wrapper.a(new a.InterfaceC0209a() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.h
            @Override // com.yandex.mobile.ads.unity.wrapper.a.InterfaceC0209a
            public final Object a() {
                BannerAdView a4;
                a4 = BannerAdWrapper.this.a(context, str, bannerAdSize);
                return a4;
            }
        });
        this.f36017a = c.a(context, i4);
    }

    public void clearUnityBannerListener() {
        this.f36018b.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.j
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdWrapper.this.b();
            }
        });
    }

    public void createView(final Activity activity) {
        this.f36018b.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.m
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdWrapper.this.a(activity);
            }
        });
    }

    public void destroyBanner() {
        this.f36018b.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.k
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdWrapper.this.c();
            }
        });
    }

    public void hideBanner() {
        this.f36018b.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.f
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdWrapper.this.d();
            }
        });
    }

    public void loadAd(final AdRequest adRequest) {
        this.f36018b.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.i
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdWrapper.this.a(adRequest);
            }
        });
    }

    public void setUnityBannerListener(final UnityBannerAdListener unityBannerAdListener) {
        this.f36018b.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.g
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdWrapper.this.a(unityBannerAdListener);
            }
        });
    }

    public void showBanner() {
        this.f36018b.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.banner.l
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdWrapper.this.e();
            }
        });
    }

    private ViewGroup.LayoutParams a() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f36019c.a((UnityBannerAdListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        BannerAdView bannerAdView = (BannerAdView) this.f36020d.a();
        bannerAdView.setBannerAdEventListener(null);
        bannerAdView.destroy();
        ViewParent parent = bannerAdView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(bannerAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f36017a.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f36017a.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        this.f36017a.addView((View) this.f36020d.a());
        activity.addContentView(this.f36017a, a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequest adRequest) {
        ((BannerAdView) this.f36020d.a()).loadAd(adRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BannerAdView a(Context context, String str, BannerAdSize bannerAdSize) {
        BannerAdView a4 = b.a(context, str, bannerAdSize);
        a4.setBannerAdEventListener(this.f36019c);
        return a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(UnityBannerAdListener unityBannerAdListener) {
        this.f36019c.a(unityBannerAdListener);
    }
}
