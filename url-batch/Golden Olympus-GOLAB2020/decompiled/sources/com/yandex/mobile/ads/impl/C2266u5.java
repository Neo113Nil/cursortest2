package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.u5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2266u5 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final jz1 f32838a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final lz1 f32839b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32840c;

    public C2266u5(@Nullable jz1 jz1Var, @Nullable lz1 lz1Var, long j4) {
        this.f32838a = jz1Var;
        this.f32839b = lz1Var;
        this.f32840c = j4;
    }

    public final long a() {
        return this.f32840c;
    }

    @Nullable
    public final jz1 b() {
        return this.f32838a;
    }

    @Nullable
    public final lz1 c() {
        return this.f32839b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2266u5)) {
            return false;
        }
        C2266u5 c2266u5 = (C2266u5) obj;
        return this.f32838a == c2266u5.f32838a && this.f32839b == c2266u5.f32839b && this.f32840c == c2266u5.f32840c;
    }

    public final int hashCode() {
        jz1 jz1Var = this.f32838a;
        int hashCode = (jz1Var == null ? 0 : jz1Var.hashCode()) * 31;
        lz1 lz1Var = this.f32839b;
        return Long.hashCode(this.f32840c) + ((hashCode + (lz1Var != null ? lz1Var.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdPodSkip(transitionStrategy=" + this.f32838a + ", visibility=" + this.f32839b + ", delay=" + this.f32840c + ")";
    }
}
