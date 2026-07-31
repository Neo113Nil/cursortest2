package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class zo {

    /* renamed from: a, reason: collision with root package name */
    private final long f20564a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m8 f20565b;

    public zo(long j4, @NotNull m8 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f20564a = j4;
        this.f20565b = unit;
    }

    public final long a() {
        return this.f20564a;
    }

    @NotNull
    public final m8 b() {
        return this.f20565b;
    }

    @NotNull
    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f20564a + " unit=" + this.f20565b + ')';
    }

    public /* synthetic */ zo(long j4, m8 m8Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, (i4 & 2) != 0 ? m8.Second : m8Var);
    }
}
