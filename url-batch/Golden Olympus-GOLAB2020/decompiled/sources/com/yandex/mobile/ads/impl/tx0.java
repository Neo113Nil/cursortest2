package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tx0 implements InterfaceC2096mi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f32723a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sy0 f32724b;

    public tx0(@NotNull C2360y7<String> adResponse, @NotNull sy0 mediationData) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        this.f32723a = adResponse;
        this.f32724b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2096mi
    @NotNull
    public final InterfaceC2072li a(@NotNull C1977hi loadController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        return new com.monetization.ads.mediation.banner.c(loadController, this.f32723a, this.f32724b);
    }
}
