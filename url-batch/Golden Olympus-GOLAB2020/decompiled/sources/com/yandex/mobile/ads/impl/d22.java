package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d22<T extends View> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f24406b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2183qd<T> f24407c;

    public d22(@NotNull T view, @NotNull InterfaceC2183qd<T> animator) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f24406b = view;
        this.f24407c = animator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24407c.a(this.f24406b);
    }
}
