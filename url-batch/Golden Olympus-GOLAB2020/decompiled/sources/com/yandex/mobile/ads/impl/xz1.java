package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xz1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f34729a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34730b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34731c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34732d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34733e;

    public xz1(int i4, int i5, int i6, int i7) {
        this.f34729a = i4;
        this.f34730b = i5;
        this.f34731c = i6;
        this.f34732d = i7;
        this.f34733e = i6 * i7;
    }

    public final int a() {
        return this.f34733e;
    }

    public final int b() {
        return this.f34732d;
    }

    public final int c() {
        return this.f34731c;
    }

    public final int d() {
        return this.f34729a;
    }

    public final int e() {
        return this.f34730b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz1)) {
            return false;
        }
        xz1 xz1Var = (xz1) obj;
        return this.f34729a == xz1Var.f34729a && this.f34730b == xz1Var.f34730b && this.f34731c == xz1Var.f34731c && this.f34732d == xz1Var.f34732d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34732d) + sx1.a(this.f34731c, sx1.a(this.f34730b, Integer.hashCode(this.f34729a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "SmartCenter(x=" + this.f34729a + ", y=" + this.f34730b + ", width=" + this.f34731c + ", height=" + this.f34732d + ")";
    }
}
