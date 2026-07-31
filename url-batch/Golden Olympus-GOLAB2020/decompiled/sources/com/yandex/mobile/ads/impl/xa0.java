package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xa0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<xk0> f34509a;

    public xa0(@NotNull ArrayList installedPackages) {
        Intrinsics.checkNotNullParameter(installedPackages, "installedPackages");
        this.f34509a = installedPackages;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa0) && Intrinsics.areEqual(this.f34509a, ((xa0) obj).f34509a);
    }

    public final int hashCode() {
        return this.f34509a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "FilteringRule(installedPackages=" + this.f34509a + ")";
    }
}
