package com.startapp.sdk.ads.nativead;

import android.view.View;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f100a;

    public h(NativeAdDetails nativeAdDetails) {
        this.f100a = nativeAdDetails;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f100a.startOmAdSession();
        this.f100a.startCheckingVisibility();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f100a.stopCheckingVisibility();
        this.f100a.finishOmAdSession();
    }
}
