package com.startapp.sdk.ads.nativead;

import android.view.View;

/* loaded from: classes.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f3129a;

    public h(NativeAdDetails nativeAdDetails) {
        this.f3129a = nativeAdDetails;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3129a.startOmAdSession();
        this.f3129a.startCheckingVisibility();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3129a.stopCheckingVisibility();
        this.f3129a.finishOmAdSession();
    }
}
