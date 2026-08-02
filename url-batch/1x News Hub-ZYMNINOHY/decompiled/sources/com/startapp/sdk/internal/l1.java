package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* loaded from: classes.dex */
public final class l1 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f4076b;

    public l1(m1 m1Var) {
        this.f4076b = m1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f4075a) {
            return;
        }
        this.f4075a = true;
        this.f4076b.f4124c.f3066b.removeOnAttachStateChangeListener(this);
        com.startapp.sdk.ads.banner.d dVar = this.f4076b.f4124c;
        BannerListener bannerListener = dVar.f3065a;
        if (bannerListener != null) {
            bannerListener.onReceiveAd(dVar.f3066b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
