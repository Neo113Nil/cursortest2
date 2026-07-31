package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gf1 f34160a;

    public /* synthetic */ wq() {
        this(new gf1());
    }

    @NotNull
    public final jp1 a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        gf1 gf1Var = this.f34160a;
        int n4 = adConfiguration.n();
        gf1Var.getClass();
        jp1Var.b(n4 != 1 ? n4 != 2 ? StringUtils.UNDEFINED : b9.h.f15433C : b9.h.f15435D, b9.h.f15492n);
        return jp1Var;
    }

    public wq(@NotNull gf1 orientationNameProvider) {
        Intrinsics.checkNotNullParameter(orientationNameProvider, "orientationNameProvider");
        this.f34160a = orientationNameProvider;
    }
}
