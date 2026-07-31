package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ek0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final dk0 f25334a = new dk0(ip1.b.f27331S, ip1.b.f27330R, ip1.b.f27332T, ip1.b.f27333U);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final dk0 f25335b = new dk0(ip1.b.f27366y, ip1.b.f27365x, ip1.b.f27367z, ip1.b.f27313A);

    @NotNull
    public static dk0 a(@NotNull EnumC1848c9 adStructureType) {
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        int ordinal = adStructureType.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return f25334a;
        }
        if (ordinal == 2) {
            return f25335b;
        }
        throw new W1.m();
    }
}
