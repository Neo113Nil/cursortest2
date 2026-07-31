package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class uy<V extends View, T> implements InterfaceC2299vf<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kg2<V, T> f33446a;

    public uy(@NotNull kg2<V, T> viewAdapter) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        this.f33446a = viewAdapter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final void a() {
        V b4 = this.f33446a.b();
        if (b4 == null) {
            return;
        }
        this.f33446a.a(b4);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final boolean b() {
        return this.f33446a.b() != null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    @Nullable
    public final ah2 c() {
        V view = this.f33446a.b();
        if (view == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        return new ah2(view.getWidth(), view.getHeight());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final boolean d() {
        return lh2.a(this.f33446a.b(), 100);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final void destroy() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final boolean e() {
        return this.f33446a.c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final void a(@NotNull C2276uf<T> asset, @NotNull ng2 viewConfigurator) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        this.f33446a.a(asset, viewConfigurator, asset.d());
    }

    public void b(T t4) {
        c(t4);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final void c(T t4) {
        V b4 = this.f33446a.b();
        if (b4 == null) {
            return;
        }
        this.f33446a.b(b4, t4);
        b4.setVisibility(0);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final boolean a(T t4) {
        V b4 = this.f33446a.b();
        return b4 != null && this.f33446a.a(b4, t4);
    }
}
