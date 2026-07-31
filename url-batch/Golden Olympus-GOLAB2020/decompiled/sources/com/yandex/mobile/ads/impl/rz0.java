package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rz0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f31496a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<sz0> f31497b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31498c;

    public rz0(long j4, @NotNull String adUnitId, @NotNull List networks) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(networks, "networks");
        this.f31496a = adUnitId;
        this.f31497b = networks;
        this.f31498c = j4;
    }

    public final long a() {
        return this.f31498c;
    }

    @NotNull
    public final List<sz0> b() {
        return this.f31497b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz0)) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        return Intrinsics.areEqual(this.f31496a, rz0Var.f31496a) && Intrinsics.areEqual(this.f31497b, rz0Var.f31497b) && this.f31498c == rz0Var.f31498c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31498c) + C2039k9.a(this.f31497b, this.f31496a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "MediationPrefetchAdUnitSettings(adUnitId=" + this.f31496a + ", networks=" + this.f31497b + ", loadTimeoutMillis=" + this.f31498c + ")";
    }
}
