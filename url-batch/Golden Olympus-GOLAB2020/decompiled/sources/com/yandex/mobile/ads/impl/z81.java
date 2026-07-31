package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f35507a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zq1 f35508b;

    public z81(@NotNull ct adAssets, @NotNull zq1 responseNativeType) {
        Intrinsics.checkNotNullParameter(adAssets, "adAssets");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        this.f35507a = adAssets;
        this.f35508b = responseNativeType;
    }

    private final boolean b() {
        if (this.f35507a.c() != null) {
            return zq1.f35748c == this.f35508b || !d();
        }
        return false;
    }

    private final boolean d() {
        return (this.f35507a.k() == null && this.f35507a.l() == null) ? false : true;
    }

    public final boolean a() {
        return (this.f35507a.n() == null && this.f35507a.b() == null && this.f35507a.d() == null && this.f35507a.g() == null && this.f35507a.e() == null) ? false : true;
    }

    public final boolean c() {
        if (this.f35507a.h() != null) {
            return Intrinsics.areEqual("large", this.f35507a.h().c()) || Intrinsics.areEqual("wide", this.f35507a.h().c());
        }
        return false;
    }

    public final boolean e() {
        return (this.f35507a.a() == null && this.f35507a.m() == null && !a()) ? false : true;
    }

    public final boolean f() {
        return this.f35507a.c() != null || d();
    }

    public final boolean g() {
        return b();
    }

    public final boolean h() {
        if (this.f35507a.c() != null) {
            return b() || c();
        }
        return false;
    }

    public final boolean i() {
        return this.f35507a.o() != null;
    }

    public final boolean j() {
        if (b()) {
            return true;
        }
        return c() && !d();
    }
}
