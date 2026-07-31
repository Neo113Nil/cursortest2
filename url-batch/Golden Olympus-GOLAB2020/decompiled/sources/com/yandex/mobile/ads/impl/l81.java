package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k81 f28459a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final k81 f28460b;

    public /* synthetic */ l81() {
        this(new y41(), new em1());
    }

    @NotNull
    public final k81 a(@NotNull zq1 responseNativeType) {
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        int ordinal = responseNativeType.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                return this.f28460b;
            }
            if (ordinal != 4) {
                throw new W1.m();
            }
        }
        return this.f28459a;
    }

    public l81(@NotNull k81 nativeAdCreator, @NotNull k81 promoAdCreator) {
        Intrinsics.checkNotNullParameter(nativeAdCreator, "nativeAdCreator");
        Intrinsics.checkNotNullParameter(promoAdCreator, "promoAdCreator");
        this.f28459a = nativeAdCreator;
        this.f28460b = promoAdCreator;
    }
}
