package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class kg2<V extends View, T> {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f28198b = {C1873da.a(kg2.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ao1 f28199a;

    public kg2(@NotNull V view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f28199a = bo1.a(view);
    }

    public void a() {
    }

    public abstract boolean a(@NotNull V v4, T t4);

    @Nullable
    public final V b() {
        return (V) this.f28199a.getValue(this, f28198b[0]);
    }

    public abstract void b(@NotNull V v4, T t4);

    public final boolean c() {
        V view = b();
        if (view == null || lh2.d(view)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        return view.getWidth() >= 1 && view.getHeight() >= 1;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void a(@NotNull V view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public void a(@NotNull C2276uf<?> asset, @NotNull ng2 viewConfigurator, @Nullable T t4) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        V b4 = b();
        if (b4 == null) {
            return;
        }
        viewConfigurator.a(b4, asset);
        viewConfigurator.a(asset, new mg2(b4));
    }
}
