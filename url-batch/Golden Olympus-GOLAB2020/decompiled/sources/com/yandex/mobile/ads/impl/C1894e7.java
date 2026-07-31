package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.e7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1894e7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1921fa f25120a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1849ca f25121b;

    public C1894e7(@NotNull InterfaceC1921fa adVisibilityValidator, @NotNull InterfaceC1849ca adViewRenderingValidator) {
        Intrinsics.checkNotNullParameter(adVisibilityValidator, "adVisibilityValidator");
        Intrinsics.checkNotNullParameter(adViewRenderingValidator, "adViewRenderingValidator");
        this.f25120a = adVisibilityValidator;
        this.f25121b = adViewRenderingValidator;
    }

    public final boolean a() {
        return this.f25120a.a() && this.f25121b.a();
    }
}
