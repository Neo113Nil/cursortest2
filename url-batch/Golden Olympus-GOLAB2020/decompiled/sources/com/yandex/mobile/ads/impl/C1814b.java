package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1814b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23526a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<Long> f23527b;

    public C1814b() {
        this(0);
    }

    @NotNull
    public final String a() {
        return this.f23526a;
    }

    @NotNull
    public final Set<Long> b() {
        return this.f23527b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1814b)) {
            return false;
        }
        C1814b c1814b = (C1814b) obj;
        return Intrinsics.areEqual(this.f23526a, c1814b.f23526a) && Intrinsics.areEqual(this.f23527b, c1814b.f23527b);
    }

    public final int hashCode() {
        return this.f23527b.hashCode() + (this.f23526a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "AbExperimentData(experiments=" + this.f23526a + ", triggeredTestIds=" + this.f23527b + ")";
    }

    public /* synthetic */ C1814b(int i4) {
        this("", kotlin.collections.T.e());
    }

    public C1814b(@NotNull String experiments, @NotNull Set<Long> triggeredTestIds) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(triggeredTestIds, "triggeredTestIds");
        this.f23526a = experiments;
        this.f23527b = triggeredTestIds;
    }
}
