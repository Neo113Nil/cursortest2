package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bu0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final cu0 f23916a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final cu0 f23917b;

    public bu0(@NotNull cu0 width, @NotNull cu0 height) {
        Intrinsics.checkNotNullParameter(width, "width");
        Intrinsics.checkNotNullParameter(height, "height");
        this.f23916a = width;
        this.f23917b = height;
    }

    @NotNull
    public final cu0 a() {
        return this.f23917b;
    }

    @NotNull
    public final cu0 b() {
        return this.f23916a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu0)) {
            return false;
        }
        bu0 bu0Var = (bu0) obj;
        return Intrinsics.areEqual(this.f23916a, bu0Var.f23916a) && Intrinsics.areEqual(this.f23917b, bu0Var.f23917b);
    }

    public final int hashCode() {
        return this.f23917b.hashCode() + (this.f23916a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "MeasuredSize(width=" + this.f23916a + ", height=" + this.f23917b + ")";
    }
}
