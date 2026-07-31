package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h1 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f256a;
    public final /* synthetic */ BannerStandard b;
    public final /* synthetic */ com.startapp.sdk.ads.banner.b c;

    public h1(com.startapp.sdk.ads.banner.b bVar, BannerStandard bannerStandard) {
        this.c = bVar;
        this.b = bannerStandard;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f256a) {
            return;
        }
        this.f256a = true;
        this.b.removeOnAttachStateChangeListener(this);
        this.b.onReceiveAd(this.c.b.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
