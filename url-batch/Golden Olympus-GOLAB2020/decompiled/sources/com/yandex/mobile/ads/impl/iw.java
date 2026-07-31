package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class iw {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<gw> f27405a;

    public iw(@NotNull ArrayList adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f27405a = adapters;
    }

    @NotNull
    public final List<gw> a() {
        return this.f27405a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iw) && Intrinsics.areEqual(this.f27405a, ((iw) obj).f27405a);
    }

    public final int hashCode() {
        return this.f27405a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdaptersData(adapters=" + this.f27405a + ")";
    }
}
