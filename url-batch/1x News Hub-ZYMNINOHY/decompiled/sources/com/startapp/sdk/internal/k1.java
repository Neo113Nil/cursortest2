package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;

/* loaded from: classes.dex */
public final class k1 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f4045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.b f4046c;

    public k1(com.startapp.sdk.ads.banner.b bVar, BannerStandard bannerStandard) {
        this.f4046c = bVar;
        this.f4045b = bannerStandard;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f4044a) {
            return;
        }
        this.f4044a = true;
        this.f4045b.removeOnAttachStateChangeListener(this);
        this.f4045b.onReceiveAd(this.f4046c.f2998b.f3064d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
