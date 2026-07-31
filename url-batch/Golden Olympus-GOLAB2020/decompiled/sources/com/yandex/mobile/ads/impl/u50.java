package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u50 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final v50 f32841a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32842b;

    public u50(@NotNull v50 type, @NotNull String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f32841a = type;
        this.f32842b = value;
    }

    @NotNull
    public final v50 a() {
        return this.f32841a;
    }

    @NotNull
    public final String b() {
        return this.f32842b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return this.f32841a == u50Var.f32841a && Intrinsics.areEqual(this.f32842b, u50Var.f32842b);
    }

    public final int hashCode() {
        return this.f32842b.hashCode() + (this.f32841a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ExclusionRule(type=" + this.f32841a + ", value=" + this.f32842b + ")";
    }
}
