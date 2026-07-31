package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34605a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34606b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34607c;

    public xk0(int i4, int i5, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f34605a = name;
        this.f34606b = i4;
        this.f34607c = i5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk0)) {
            return false;
        }
        xk0 xk0Var = (xk0) obj;
        return Intrinsics.areEqual(this.f34605a, xk0Var.f34605a) && this.f34606b == xk0Var.f34606b && this.f34607c == xk0Var.f34607c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34607c) + sx1.a(this.f34606b, this.f34605a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "InstalledPackage(name=" + this.f34605a + ", minVersion=" + this.f34606b + ", maxVersion=" + this.f34607c + ")";
    }
}
