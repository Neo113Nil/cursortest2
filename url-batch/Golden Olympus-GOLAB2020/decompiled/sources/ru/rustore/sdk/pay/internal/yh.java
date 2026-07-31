package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yh {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final xl f45271a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final q5 f45272b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f45273c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final t5 f45274d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final f6 f45275e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final y5 f45276f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final bi f45277g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final zh f45278h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final xh f45279i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final bb f45280j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public final y7 f45281k;

    public yh(@NotNull xl successUrlRepository, @NotNull q5 failureUrlRepository, @NotNull e activePurchaseStateRepository, @NotNull t5 getActivePurchaseUseCase, @NotNull f6 getPurchaseApplicationUseCase, @NotNull y5 getProductPurchaseUseCase, @NotNull bi rejectPurchaseUseCase, @NotNull zh router, @NotNull xh analytics, @NotNull bb postMessageFactory, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(successUrlRepository, "successUrlRepository");
        Intrinsics.checkNotNullParameter(failureUrlRepository, "failureUrlRepository");
        Intrinsics.checkNotNullParameter(activePurchaseStateRepository, "activePurchaseStateRepository");
        Intrinsics.checkNotNullParameter(getActivePurchaseUseCase, "getActivePurchaseUseCase");
        Intrinsics.checkNotNullParameter(getPurchaseApplicationUseCase, "getPurchaseApplicationUseCase");
        Intrinsics.checkNotNullParameter(getProductPurchaseUseCase, "getProductPurchaseUseCase");
        Intrinsics.checkNotNullParameter(rejectPurchaseUseCase, "rejectPurchaseUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(postMessageFactory, "postMessageFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f45271a = successUrlRepository;
        this.f45272b = failureUrlRepository;
        this.f45273c = activePurchaseStateRepository;
        this.f45274d = getActivePurchaseUseCase;
        this.f45275e = getPurchaseApplicationUseCase;
        this.f45276f = getProductPurchaseUseCase;
        this.f45277g = rejectPurchaseUseCase;
        this.f45278h = router;
        this.f45279i = analytics;
        this.f45280j = postMessageFactory;
        this.f45281k = logger;
    }
}
