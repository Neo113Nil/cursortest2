package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d51 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2276uf<?> f24435a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2172q2 f24436b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final v61 f24437c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qo1 f24438d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final dr0 f24439e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final wb0 f24440f;

    public d51(@NotNull C2276uf asset, @Nullable dr0 dr0Var, @NotNull InterfaceC2172q2 adClickable, @NotNull v61 nativeAdViewAdapter, @NotNull qo1 renderedTimer, @NotNull wb0 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(adClickable, "adClickable");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f24435a = asset;
        this.f24436b = adClickable;
        this.f24437c = nativeAdViewAdapter;
        this.f24438d = renderedTimer;
        this.f24439e = dr0Var;
        this.f24440f = forceImpressionTrackingListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        long b4 = this.f24438d.b();
        dr0 dr0Var = this.f24439e;
        if (dr0Var == null || b4 < dr0Var.b() || !this.f24435a.e() || !this.f24436b.a(view, this.f24435a, this.f24439e, this.f24437c).a()) {
            return;
        }
        this.f24440f.a();
    }
}
