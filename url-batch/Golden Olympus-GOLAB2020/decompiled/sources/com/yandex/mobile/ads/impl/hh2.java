package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hh2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f26749a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26750b;

    public hh2(int i4, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f26749a = adUnitId;
        this.f26750b = i4;
    }

    @NotNull
    public final String a() {
        return this.f26749a;
    }

    public final int b() {
        return this.f26750b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh2)) {
            return false;
        }
        hh2 hh2Var = (hh2) obj;
        return Intrinsics.areEqual(this.f26749a, hh2Var.f26749a) && this.f26750b == hh2Var.f26750b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26750b) + (this.f26749a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ViewSizeKey(adUnitId=" + this.f26749a + ", screenOrientation=" + this.f26750b + ")";
    }
}
