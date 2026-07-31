package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final f3 f45320a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final t9 f45321b;

    public z8(@NotNull f3 couponDtoDeserializer, @NotNull t9 paymentMethodDeserializer) {
        Intrinsics.checkNotNullParameter(couponDtoDeserializer, "couponDtoDeserializer");
        Intrinsics.checkNotNullParameter(paymentMethodDeserializer, "paymentMethodDeserializer");
        this.f45320a = couponDtoDeserializer;
        this.f45321b = paymentMethodDeserializer;
    }
}
