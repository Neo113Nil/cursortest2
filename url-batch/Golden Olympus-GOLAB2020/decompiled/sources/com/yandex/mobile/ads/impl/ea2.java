package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ea2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dn1 f25161a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final up f25162b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zw1 f25163c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ea2() {
        this(r0, r1, new up(r1), new zw1());
        dn1 dn1Var = new dn1();
        vp1 vp1Var = new vp1();
    }

    public ea2(@NotNull dn1 randomGenerator, @NotNull vp1 requestHelper, @NotNull up cmpRequestConfigurator, @NotNull zw1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(requestHelper, "requestHelper");
        Intrinsics.checkNotNullParameter(cmpRequestConfigurator, "cmpRequestConfigurator");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f25161a = randomGenerator;
        this.f25162b = cmpRequestConfigurator;
        this.f25163c = sensitiveModeChecker;
    }
}
