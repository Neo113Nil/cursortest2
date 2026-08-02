package com.stripe.android.financialconnections.features.error;

import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes8.dex */
public final /* synthetic */ class ErrorViewModel$logErrors$1 extends PropertyReference1Impl {
    public static final ErrorViewModel$logErrors$1 INSTANCE = new ErrorViewModel$logErrors$1(ErrorState.class, "payload", "getPayload()Lcom/stripe/android/financialconnections/presentation/Async;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((ErrorState) obj).payload;
    }
}
