package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a31 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final t21 f23139a;

    /* renamed from: b, reason: collision with root package name */
    private final long f23140b;

    public a31(@NotNull t21 multiBannerAutoSwipeController, long j4) {
        Intrinsics.checkNotNullParameter(multiBannerAutoSwipeController, "multiBannerAutoSwipeController");
        this.f23139a = multiBannerAutoSwipeController;
        this.f23140b = j4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        this.f23139a.a(this.f23140b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        this.f23139a.b();
    }
}
