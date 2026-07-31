package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kz1<V extends ViewGroup> implements q00<V>, InterfaceC1816b1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C2243t5 f28370a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1792a1 f28371b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q41 f28372c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final az1 f28373d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private e00 f28374e;

    public kz1(@Nullable C2243t5 c2243t5, @NotNull C1792a1 adActivityEventController, @NotNull q41 nativeAdControlViewProvider, @NotNull az1 skipAppearanceController) {
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        Intrinsics.checkNotNullParameter(skipAppearanceController, "skipAppearanceController");
        this.f28370a = c2243t5;
        this.f28371b = adActivityEventController;
        this.f28372c = nativeAdControlViewProvider;
        this.f28373d = skipAppearanceController;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        C2266u5 b4;
        Intrinsics.checkNotNullParameter(container, "container");
        View b5 = this.f28372c.b(container);
        if (b5 != null) {
            this.f28371b.a(this);
            az1 az1Var = this.f28373d;
            C2243t5 c2243t5 = this.f28370a;
            Long valueOf = (c2243t5 == null || (b4 = c2243t5.b()) == null) ? null : Long.valueOf(b4.a());
            e00 e00Var = new e00(b5, az1Var, valueOf != null ? valueOf.longValue() : 0L, hg1.a());
            this.f28374e = e00Var;
            e00Var.b();
            if (b5.getTag() == null) {
                b5.setTag("skip_button");
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
    public final void b() {
        e00 e00Var = this.f28374e;
        if (e00Var != null) {
            e00Var.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        this.f28371b.b(this);
        e00 e00Var = this.f28374e;
        if (e00Var != null) {
            e00Var.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
    public final void a() {
        e00 e00Var = this.f28374e;
        if (e00Var != null) {
            e00Var.d();
        }
    }
}
