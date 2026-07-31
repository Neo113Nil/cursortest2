package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.r9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2201r9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z52 f31079a;

    public /* synthetic */ C2201r9() {
        this(new z52());
    }

    @NotNull
    public final tb1 a(@NotNull h41 nativeAdBlock) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        n61 c4 = nativeAdBlock.c();
        List<C2276uf<?>> b4 = c4.b();
        z52 z52Var = this.f31079a;
        List<tx1> i4 = c4.i();
        z52Var.getClass();
        ArrayList a4 = z52.a(null, i4);
        z52 z52Var2 = this.f31079a;
        List<String> g4 = c4.g();
        z52Var2.getClass();
        return new tb1(b4, a4, z52.a(null, g4), AdRevenueScheme.AD_UNIT, c4.d());
    }

    public C2201r9(@NotNull z52 trackingDataCreator) {
        Intrinsics.checkNotNullParameter(trackingDataCreator, "trackingDataCreator");
        this.f31079a = trackingDataCreator;
    }
}
