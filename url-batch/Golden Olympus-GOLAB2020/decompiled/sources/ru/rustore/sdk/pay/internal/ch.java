package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ch {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ta f43926a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final g1 f43927b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f43928c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final pe f43929d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final y7 f43930e;

    public ch(@NotNull ta paymentRepository, @NotNull g1 backUrlRepository, @NotNull e activePurchaseStateRepository, @NotNull pe purchaseEventRepository, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(backUrlRepository, "backUrlRepository");
        Intrinsics.checkNotNullParameter(activePurchaseStateRepository, "activePurchaseStateRepository");
        Intrinsics.checkNotNullParameter(purchaseEventRepository, "purchaseEventRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f43926a = paymentRepository;
        this.f43927b = backUrlRepository;
        this.f43928c = activePurchaseStateRepository;
        this.f43929d = purchaseEventRepository;
        this.f43930e = logger;
    }
}
