package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.t6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2244t6 implements InterfaceC2267u6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AdQualityVerificationBlockingReasons f32224a;

    public C2244t6(@NotNull AdQualityVerificationBlockingReasons reasons) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.f32224a = reasons;
    }

    @NotNull
    public final AdQualityVerificationBlockingReasons a() {
        return this.f32224a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2244t6) && Intrinsics.areEqual(this.f32224a, ((C2244t6) obj).f32224a);
    }

    public final int hashCode() {
        return this.f32224a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AdQualityVerifierControllerBlockedResult(reasons=" + this.f32224a + ")";
    }
}
