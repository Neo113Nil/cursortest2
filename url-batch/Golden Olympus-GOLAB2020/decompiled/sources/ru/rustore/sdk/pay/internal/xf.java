package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final il f45226a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final ll f45227b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final y7 f45228c;

    public xf(@NotNull il subscriptionPurchaseStatusMapper, @NotNull ll subscriptionTariffMapper, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(subscriptionPurchaseStatusMapper, "subscriptionPurchaseStatusMapper");
        Intrinsics.checkNotNullParameter(subscriptionTariffMapper, "subscriptionTariffMapper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f45226a = subscriptionPurchaseStatusMapper;
        this.f45227b = subscriptionTariffMapper;
        this.f45228c = logger;
    }
}
