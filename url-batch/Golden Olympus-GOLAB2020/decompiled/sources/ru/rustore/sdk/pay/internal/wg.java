package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ta f45171a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final g1 f45172b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f45173c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final pe f45174d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final y7 f45175e;

    public wg(@NotNull ta paymentRepository, @NotNull g1 backUrlRepository, @NotNull e activePurchaseStateRepository, @NotNull pe purchaseEventRepository, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(backUrlRepository, "backUrlRepository");
        Intrinsics.checkNotNullParameter(activePurchaseStateRepository, "activePurchaseStateRepository");
        Intrinsics.checkNotNullParameter(purchaseEventRepository, "purchaseEventRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f45171a = paymentRepository;
        this.f45172b = backUrlRepository;
        this.f45173c = activePurchaseStateRepository;
        this.f45174d = purchaseEventRepository;
        this.f45175e = logger;
    }
}
