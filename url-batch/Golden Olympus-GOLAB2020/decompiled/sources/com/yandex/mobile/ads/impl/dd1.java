package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dd1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ek0 f24592a;

    public /* synthetic */ dd1() {
        this(new ek0());
    }

    @NotNull
    public final cd1 a(@NotNull bk0 impressionReporter, @NotNull EnumC1848c9 adStructureType) {
        Intrinsics.checkNotNullParameter(impressionReporter, "impressionReporter");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        int ordinal = adStructureType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2) {
                throw new W1.m();
            }
            this.f24592a.getClass();
            return new h62(impressionReporter, ek0.a(adStructureType));
        }
        ek0 ek0Var = this.f24592a;
        EnumC1848c9 enumC1848c9 = EnumC1848c9.f24100d;
        ek0Var.getClass();
        dk0 a4 = ek0.a(enumC1848c9);
        ek0 ek0Var2 = this.f24592a;
        EnumC1848c9 enumC1848c92 = EnumC1848c9.f24099c;
        ek0Var2.getClass();
        return new my1(new h62(impressionReporter, a4), new h62(impressionReporter, ek0.a(enumC1848c92)));
    }

    public dd1(@NotNull ek0 impressionTrackingReportTypesProvider) {
        Intrinsics.checkNotNullParameter(impressionTrackingReportTypesProvider, "impressionTrackingReportTypesProvider");
        this.f24592a = impressionTrackingReportTypesProvider;
    }
}
