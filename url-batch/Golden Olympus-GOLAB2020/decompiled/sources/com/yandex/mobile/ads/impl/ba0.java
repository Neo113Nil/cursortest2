package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ba0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u90 f23643a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<d90> f23644b;

    public ba0(@NotNull u90 state, @NotNull List<d90> items) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23643a = state;
        this.f23644b = items;
    }

    @NotNull
    public final u90 a() {
        return this.f23643a;
    }

    @NotNull
    public final List<d90> b() {
        return this.f23644b;
    }

    @NotNull
    public final u90 c() {
        return this.f23643a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba0)) {
            return false;
        }
        ba0 ba0Var = (ba0) obj;
        return Intrinsics.areEqual(this.f23643a, ba0Var.f23643a) && Intrinsics.areEqual(this.f23644b, ba0Var.f23644b);
    }

    public final int hashCode() {
        return this.f23644b.hashCode() + (this.f23643a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "FeedState(state=" + this.f23643a + ", items=" + this.f23644b + ")";
    }
}
