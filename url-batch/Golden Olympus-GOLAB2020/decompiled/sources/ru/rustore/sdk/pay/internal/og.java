package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class og {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ta f44751a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final xl f44752b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final q5 f44753c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final e f44754d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final rj f44755e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final pe f44756f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final y7 f44757g;

    public og(@NotNull e activePurchaseStateRepository, @NotNull q5 failureUrlRepository, @NotNull y7 logger, @NotNull ta paymentRepository, @NotNull pe purchaseEventRepository, @NotNull rj sdkThemeRepository, @NotNull xl successUrlRepository) {
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(successUrlRepository, "successUrlRepository");
        Intrinsics.checkNotNullParameter(failureUrlRepository, "failureUrlRepository");
        Intrinsics.checkNotNullParameter(activePurchaseStateRepository, "activePurchaseStateRepository");
        Intrinsics.checkNotNullParameter(sdkThemeRepository, "sdkThemeRepository");
        Intrinsics.checkNotNullParameter(purchaseEventRepository, "purchaseEventRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f44751a = paymentRepository;
        this.f44752b = successUrlRepository;
        this.f44753c = failureUrlRepository;
        this.f44754d = activePurchaseStateRepository;
        this.f44755e = sdkThemeRepository;
        this.f44756f = purchaseEventRepository;
        this.f44757g = logger;
    }
}
