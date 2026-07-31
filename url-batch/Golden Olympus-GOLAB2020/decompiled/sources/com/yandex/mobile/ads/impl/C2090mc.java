package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2090mc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1899ec f28988a;

    public C2090mc(@NotNull C1899ec advertisingInfoHolder) {
        Intrinsics.checkNotNullParameter(advertisingInfoHolder, "advertisingInfoHolder");
        this.f28988a = advertisingInfoHolder;
    }

    @NotNull
    public final C1899ec a() {
        return this.f28988a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2090mc) && Intrinsics.areEqual(this.f28988a, ((C2090mc) obj).f28988a);
    }

    public final int hashCode() {
        return this.f28988a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "Success(advertisingInfoHolder=" + this.f28988a + ")";
    }
}
