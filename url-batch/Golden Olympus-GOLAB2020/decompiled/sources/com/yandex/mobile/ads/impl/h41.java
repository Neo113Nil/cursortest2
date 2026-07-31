package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n61 f26549a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f26550b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2286v2 f26551c;

    public h41(@NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration, @NotNull n61 nativeAdResponse) {
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f26549a = nativeAdResponse;
        this.f26550b = adResponse;
        this.f26551c = adConfiguration;
    }

    public static h41 a(h41 h41Var, n61 nativeAdResponse) {
        C2360y7<?> adResponse = h41Var.f26550b;
        C2286v2 adConfiguration = h41Var.f26551c;
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return new h41(adResponse, adConfiguration, nativeAdResponse);
    }

    @NotNull
    public final C2360y7<?> b() {
        return this.f26550b;
    }

    @NotNull
    public final n61 c() {
        return this.f26549a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h41)) {
            return false;
        }
        h41 h41Var = (h41) obj;
        return Intrinsics.areEqual(this.f26549a, h41Var.f26549a) && Intrinsics.areEqual(this.f26550b, h41Var.f26550b) && Intrinsics.areEqual(this.f26551c, h41Var.f26551c);
    }

    public final int hashCode() {
        return this.f26551c.hashCode() + ((this.f26550b.hashCode() + (this.f26549a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "NativeAdBlock(nativeAdResponse=" + this.f26549a + ", adResponse=" + this.f26550b + ", adConfiguration=" + this.f26551c + ")";
    }

    @NotNull
    public final C2286v2 a() {
        return this.f26551c;
    }
}
