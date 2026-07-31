package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s3 f44164a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final x9 f44165b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final y7 f44166c;

    public g9(@NotNull s3 couponMapper, @NotNull x9 paymentMethodMapper, @NotNull y7 nonFatalExceptionLogger) {
        Intrinsics.checkNotNullParameter(couponMapper, "couponMapper");
        Intrinsics.checkNotNullParameter(paymentMethodMapper, "paymentMethodMapper");
        Intrinsics.checkNotNullParameter(nonFatalExceptionLogger, "nonFatalExceptionLogger");
        this.f44164a = couponMapper;
        this.f44165b = paymentMethodMapper;
        this.f44166c = nonFatalExceptionLogger;
    }
}
