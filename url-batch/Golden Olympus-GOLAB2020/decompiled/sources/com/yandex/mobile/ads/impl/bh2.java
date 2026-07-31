package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bh2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f23815a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23816b;

    public bh2(int i4, int i5) {
        this.f23815a = i4;
        this.f23816b = i5;
    }

    public final int a() {
        return this.f23816b;
    }

    public final int b() {
        return this.f23815a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh2)) {
            return false;
        }
        bh2 bh2Var = (bh2) obj;
        return this.f23815a == bh2Var.f23815a && this.f23816b == bh2Var.f23816b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23816b) + (Integer.hashCode(this.f23815a) * 31);
    }

    @NotNull
    public final String toString() {
        return "ViewSize(width=" + this.f23815a + ", height=" + this.f23816b + ")";
    }
}
