package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final wa f45314a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final g1 f45315b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final rj f45316c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final g8 f45317d;

    public z6(@NotNull wa paymentTypeRepository, @NotNull g1 backUrlRepository, @NotNull rj sdkThemeRepository, @NotNull g8 navigator) {
        Intrinsics.checkNotNullParameter(paymentTypeRepository, "paymentTypeRepository");
        Intrinsics.checkNotNullParameter(backUrlRepository, "backUrlRepository");
        Intrinsics.checkNotNullParameter(sdkThemeRepository, "sdkThemeRepository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f45314a = paymentTypeRepository;
        this.f45315b = backUrlRepository;
        this.f45316c = sdkThemeRepository;
        this.f45317d = navigator;
    }
}
