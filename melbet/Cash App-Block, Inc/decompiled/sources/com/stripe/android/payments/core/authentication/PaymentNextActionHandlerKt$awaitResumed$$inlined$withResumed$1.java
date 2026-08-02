package com.stripe.android.payments.core.authentication;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes4.dex */
public final class PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1 implements Function0 {
    public final /* synthetic */ CompletableDeferredImpl $completable$inlined;

    public PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1(CompletableDeferredImpl completableDeferredImpl) {
        this.$completable$inlined = completableDeferredImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.$completable$inlined.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE));
    }
}
