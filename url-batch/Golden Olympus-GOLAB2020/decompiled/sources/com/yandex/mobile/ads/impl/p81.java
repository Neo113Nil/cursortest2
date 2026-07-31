package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f30360a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zq1 f30361b;

    public p81(@NotNull ct adAssets, @NotNull zq1 responseNativeType) {
        Intrinsics.checkNotNullParameter(adAssets, "adAssets");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        this.f30360a = adAssets;
        this.f30361b = responseNativeType;
    }

    public static boolean a(@NotNull et image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return Intrinsics.areEqual("large", image.c()) || Intrinsics.areEqual("wide", image.c());
    }

    public final boolean b() {
        if (this.f30360a.g() != null) {
            return zq1.f35749d == this.f30361b || !e();
        }
        return false;
    }

    public final boolean c() {
        return (d() || this.f30360a.h() == null || !a(this.f30360a.h())) ? false : true;
    }

    public final boolean d() {
        return this.f30360a.i() != null;
    }

    public final boolean e() {
        return (d() || this.f30360a.h() == null || a(this.f30360a.h()) || zq1.f35749d == this.f30361b) ? false : true;
    }

    public final boolean a() {
        return (b() || this.f30360a.e() == null || !(d() || this.f30360a.h() == null || a(this.f30360a.h()))) ? false : true;
    }
}
