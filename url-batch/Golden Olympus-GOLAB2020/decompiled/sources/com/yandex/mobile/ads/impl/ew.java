package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ew {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<yv> f25467a;

    public ew(@NotNull ArrayList adUnits) {
        Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        this.f25467a = adUnits;
    }

    @NotNull
    public final List<yv> a() {
        return this.f25467a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ew) && Intrinsics.areEqual(this.f25467a, ((ew) obj).f25467a);
    }

    public final int hashCode() {
        return this.f25467a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdUnitsData(adUnits=" + this.f25467a + ")";
    }
}
