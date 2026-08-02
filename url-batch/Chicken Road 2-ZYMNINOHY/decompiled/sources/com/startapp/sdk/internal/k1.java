package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;

/* loaded from: classes.dex */
public final class k1 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f7173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.b f7174c;

    public k1(com.startapp.sdk.ads.banner.b bVar, BannerStandard bannerStandard) {
        this.f7174c = bVar;
        this.f7173b = bannerStandard;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f7172a) {
            return;
        }
        this.f7172a = true;
        this.f7173b.removeOnAttachStateChangeListener(this);
        this.f7173b.onReceiveAd(this.f7174c.f6074b.f6144d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
