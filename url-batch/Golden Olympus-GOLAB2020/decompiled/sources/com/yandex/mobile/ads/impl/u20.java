package com.yandex.mobile.ads.impl;

import O1.C1165z4;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u20 implements td0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1165z4 f32781a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f32782b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q00<ExtendedNativeAdView> f32783c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f32784d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a20 f32785e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32786f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final l10 f32787g;

    public /* synthetic */ u20(C1165z4 c1165z4, C2286v2 c2286v2, nq nqVar, InterfaceC1912f1 interfaceC1912f1, a20 a20Var, int i4) {
        this(c1165z4, c2286v2, nqVar, interfaceC1912f1, a20Var, i4, new l10(c2286v2.p().c()));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // com.yandex.mobile.ads.impl.td0
    @org.jetbrains.annotations.NotNull
    public final com.yandex.mobile.ads.impl.nq0<com.monetization.ads.nativeads.ExtendedNativeAdView> a(@org.jetbrains.annotations.NotNull android.content.Context r21, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.C2360y7<?> r22, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.f61 r23, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.mr r24, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.dt r25, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.C1792a1 r26) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u20.a(android.content.Context, com.yandex.mobile.ads.impl.y7, com.yandex.mobile.ads.impl.f61, com.yandex.mobile.ads.impl.mr, com.yandex.mobile.ads.impl.dt, com.yandex.mobile.ads.impl.a1):com.yandex.mobile.ads.impl.nq0");
    }

    public u20(@NotNull C1165z4 divData, @NotNull C2286v2 adConfiguration, @NotNull nq adTypeSpecificBinder, @NotNull InterfaceC1912f1 adActivityListener, @NotNull a20 divKitActionHandlerDelegate, int i4, @NotNull l10 divConfigurationCreator) {
        Intrinsics.checkNotNullParameter(divData, "divData");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adTypeSpecificBinder, "adTypeSpecificBinder");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        Intrinsics.checkNotNullParameter(divConfigurationCreator, "divConfigurationCreator");
        this.f32781a = divData;
        this.f32782b = adConfiguration;
        this.f32783c = adTypeSpecificBinder;
        this.f32784d = adActivityListener;
        this.f32785e = divKitActionHandlerDelegate;
        this.f32786f = i4;
        this.f32787g = divConfigurationCreator;
    }
}
