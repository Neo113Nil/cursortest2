package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ea, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1897ea implements InterfaceC1921fa {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f25153b = {C1873da.a(C1897ea.class, "adViewReference", "getAdViewReference()Lcom/monetization/ads/banner/InternalAdView;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ao1 f25154a;

    public C1897ea(@NotNull vo0 adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.f25154a = bo1.a(adView);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1921fa
    public final boolean a() {
        vo0 vo0Var = (vo0) this.f25154a.getValue(this, f25153b[0]);
        return vo0Var != null && lh2.b(vo0Var) >= 1;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1921fa
    public final boolean b() {
        vo0 vo0Var = (vo0) this.f25154a.getValue(this, f25153b[0]);
        return (vo0Var == null || lh2.d(vo0Var)) ? false : true;
    }
}
