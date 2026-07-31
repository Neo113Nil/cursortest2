package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cw {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<bw> f24328a;

    public cw(@NotNull List<bw> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f24328a = adapters;
    }

    @NotNull
    public final List<bw> a() {
        return this.f24328a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw) && Intrinsics.areEqual(this.f24328a, ((cw) obj).f24328a);
    }

    public final int hashCode() {
        return this.f24328a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdUnitMediationData(adapters=" + this.f24328a + ")";
    }
}
