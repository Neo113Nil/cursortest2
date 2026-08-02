package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* loaded from: classes.dex */
public final class l1 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f7204b;

    public l1(m1 m1Var) {
        this.f7204b = m1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f7203a) {
            return;
        }
        this.f7203a = true;
        this.f7204b.f7252c.f6146b.removeOnAttachStateChangeListener(this);
        com.startapp.sdk.ads.banner.d dVar = this.f7204b.f7252c;
        BannerListener bannerListener = dVar.f6145a;
        if (bannerListener != null) {
            bannerListener.onReceiveAd(dVar.f6146b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
