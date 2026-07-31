package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cu0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f24322a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final du0 f24323b;

    public cu0(int i4, @NotNull du0 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f24322a = i4;
        this.f24323b = mode;
    }

    @NotNull
    public final du0 a() {
        return this.f24323b;
    }

    public final int b() {
        return this.f24322a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu0)) {
            return false;
        }
        cu0 cu0Var = (cu0) obj;
        return this.f24322a == cu0Var.f24322a && this.f24323b == cu0Var.f24323b;
    }

    public final int hashCode() {
        return this.f24323b.hashCode() + (Integer.hashCode(this.f24322a) * 31);
    }

    @NotNull
    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.f24322a + ", mode=" + this.f24323b + ")";
    }
}
