package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class kt {

    /* renamed from: a, reason: collision with root package name */
    private final int f16969a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m8 f16970b;

    public kt(int i4, @NotNull m8 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f16969a = i4;
        this.f16970b = unit;
    }

    public final int a() {
        return this.f16969a;
    }

    @NotNull
    public final m8 b() {
        return this.f16970b;
    }

    @NotNull
    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f16969a + ", unit=" + this.f16970b + ')';
    }
}
