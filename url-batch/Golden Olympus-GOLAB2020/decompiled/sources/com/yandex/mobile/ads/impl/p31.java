package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p31 {

    /* renamed from: a, reason: collision with root package name */
    private final int f30321a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30322b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30323c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30324d;

    public p31(int i4, int i5, int i6, int i7) {
        this.f30321a = i4;
        this.f30322b = i5;
        this.f30323c = i6;
        this.f30324d = i7;
    }

    public final int a() {
        return this.f30323c;
    }

    public final int b() {
        return this.f30321a;
    }

    public final int c() {
        return this.f30324d;
    }

    public final int d() {
        return this.f30322b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p31)) {
            return false;
        }
        p31 p31Var = (p31) obj;
        return this.f30321a == p31Var.f30321a && this.f30322b == p31Var.f30322b && this.f30323c == p31Var.f30323c && this.f30324d == p31Var.f30324d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30324d) + sx1.a(this.f30323c, sx1.a(this.f30322b, Integer.hashCode(this.f30321a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "MuteControlResources(mutedResourceId=" + this.f30321a + ", unmutedResourceId=" + this.f30322b + ", mutedContentDescriptionId=" + this.f30323c + ", unmutedContentDescriptionId=" + this.f30324d + ")";
    }
}
