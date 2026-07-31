package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lg2<V extends View, T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kg2<V, T> f28568a;

    public lg2(@NotNull kg2<V, T> viewAdapter) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        this.f28568a = viewAdapter;
    }

    public final void a() {
        V b4 = this.f28568a.b();
        if (b4 == null) {
            return;
        }
        this.f28568a.a(b4);
    }

    public final void b() {
        this.f28568a.a();
    }

    public final void b(T t4) {
        V b4 = this.f28568a.b();
        if (b4 == null) {
            return;
        }
        this.f28568a.b(b4, t4);
        b4.setVisibility(0);
    }

    public final void a(@NotNull C2276uf<?> asset, @NotNull ng2 viewConfigurator, @Nullable T t4) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        if (this.f28568a.b() == null) {
            return;
        }
        this.f28568a.a(asset, viewConfigurator, t4);
    }

    public final boolean a(T t4) {
        V b4 = this.f28568a.b();
        return b4 != null && this.f28568a.a(b4, t4);
    }
}
