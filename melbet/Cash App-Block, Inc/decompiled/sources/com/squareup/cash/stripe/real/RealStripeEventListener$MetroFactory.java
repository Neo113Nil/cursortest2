package com.squareup.cash.stripe.real;

import com.squareup.protos.cash.api.Error;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class RealStripeEventListener$MetroFactory implements Factory {
    public static final RealStripeEventListener$MetroFactory INSTANCE = new RealStripeEventListener$MetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Error.Code.Companion(10);
    }
}
