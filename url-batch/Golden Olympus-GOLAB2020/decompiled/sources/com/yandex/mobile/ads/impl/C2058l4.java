package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2058l4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC2082m4 f28410a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f28411b;

    public C2058l4(@NotNull EnumC2082m4 adLoadingPhaseType, @NotNull Map<String, ? extends Object> reportParameters) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(reportParameters, "reportParameters");
        this.f28410a = adLoadingPhaseType;
        this.f28411b = reportParameters;
    }

    @NotNull
    public final EnumC2082m4 a() {
        return this.f28410a;
    }

    @NotNull
    public final Map<String, Object> b() {
        return this.f28411b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2058l4)) {
            return false;
        }
        C2058l4 c2058l4 = (C2058l4) obj;
        return this.f28410a == c2058l4.f28410a && Intrinsics.areEqual(this.f28411b, c2058l4.f28411b);
    }

    public final int hashCode() {
        return this.f28411b.hashCode() + (this.f28410a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.f28410a + ", reportParameters=" + this.f28411b + ")";
    }
}
