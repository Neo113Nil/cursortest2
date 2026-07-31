package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pa0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final ej0 f30375a;

    public pa0(@Nullable ej0 ej0Var) {
        this.f30375a = ej0Var;
    }

    @Nullable
    public final ej0 a() {
        return this.f30375a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa0) && Intrinsics.areEqual(this.f30375a, ((pa0) obj).f30375a);
    }

    public final int hashCode() {
        ej0 ej0Var = this.f30375a;
        if (ej0Var == null) {
            return 0;
        }
        return ej0Var.hashCode();
    }

    @NotNull
    public final String toString() {
        return "FeedbackValue(imageValue=" + this.f30375a + ")";
    }
}
