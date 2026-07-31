package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nv0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f29759a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29760b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29761c;

    public nv0(int i4, int i5, int i6) {
        this.f29759a = i4;
        this.f29760b = i5;
        this.f29761c = i6;
    }

    public final int a() {
        return this.f29761c;
    }

    public final int b() {
        return this.f29760b;
    }

    public final int c() {
        return this.f29759a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv0)) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        return this.f29759a == nv0Var.f29759a && this.f29760b == nv0Var.f29760b && this.f29761c == nv0Var.f29761c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29761c) + sx1.a(this.f29760b, Integer.hashCode(this.f29759a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "MediaFileInfo(width=" + this.f29759a + ", height=" + this.f29760b + ", bitrate=" + this.f29761c + ")";
    }
}
