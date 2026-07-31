package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ah, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC1808ah implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener f23276a;

    public ViewOnAttachStateChangeListenerC1808ah(@NotNull ViewTreeObserver.OnGlobalLayoutListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f23276a = listener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        v4.getViewTreeObserver().addOnGlobalLayoutListener(this.f23276a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        v4.getViewTreeObserver().removeOnGlobalLayoutListener(this.f23276a);
    }
}
