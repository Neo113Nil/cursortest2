package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final pk f43946a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final d8 f43947b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final w2 f43948c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final rj f43949d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final g8 f43950e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final y7 f43951f;

    public d0(@NotNull pk setActivePurchaseUseCase, @NotNull d8 observePurchaseResultUseCase, @NotNull w2 clearPaymentOperationIdUseCase, @NotNull rj sdkThemeRepository, @NotNull g8 payActivityNavigator, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(setActivePurchaseUseCase, "setActivePurchaseUseCase");
        Intrinsics.checkNotNullParameter(observePurchaseResultUseCase, "observePurchaseResultUseCase");
        Intrinsics.checkNotNullParameter(clearPaymentOperationIdUseCase, "clearPaymentOperationIdUseCase");
        Intrinsics.checkNotNullParameter(sdkThemeRepository, "sdkThemeRepository");
        Intrinsics.checkNotNullParameter(payActivityNavigator, "payActivityNavigator");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f43946a = setActivePurchaseUseCase;
        this.f43947b = observePurchaseResultUseCase;
        this.f43948c = clearPaymentOperationIdUseCase;
        this.f43949d = sdkThemeRepository;
        this.f43950e = payActivityNavigator;
        this.f43951f = logger;
    }
}
