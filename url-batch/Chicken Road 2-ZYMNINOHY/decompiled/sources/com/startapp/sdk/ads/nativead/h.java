package com.startapp.sdk.ads.nativead;

import android.view.View;

/* loaded from: classes.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f6212a;

    public h(NativeAdDetails nativeAdDetails) {
        this.f6212a = nativeAdDetails;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6212a.startOmAdSession();
        this.f6212a.startCheckingVisibility();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6212a.stopCheckingVisibility();
        this.f6212a.finishOmAdSession();
    }
}
