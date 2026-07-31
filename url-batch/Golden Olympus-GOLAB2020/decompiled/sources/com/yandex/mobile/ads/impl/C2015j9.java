package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2015j9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z52 f27567a;

    public /* synthetic */ C2015j9() {
        this(new z52());
    }

    @NotNull
    public final tb1 a(@NotNull u31 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        z52 z52Var = this.f27567a;
        List<tx1> h4 = nativeAd.h();
        z52Var.getClass();
        ArrayList a4 = z52.a(h4, null);
        z52 z52Var2 = this.f27567a;
        List<String> f4 = nativeAd.f();
        z52Var2.getClass();
        return new tb1(nativeAd.b(), a4, z52.a(f4, null), nativeAd.a(), nativeAd.c());
    }

    public C2015j9(@NotNull z52 trackingDataCreator) {
        Intrinsics.checkNotNullParameter(trackingDataCreator, "trackingDataCreator");
        this.f27567a = trackingDataCreator;
    }
}
