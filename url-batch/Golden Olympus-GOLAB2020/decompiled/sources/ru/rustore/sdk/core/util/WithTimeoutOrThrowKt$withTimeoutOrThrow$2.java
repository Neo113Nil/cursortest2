package ru.rustore.sdk.core.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o2.U0;

@Metadata
/* loaded from: classes3.dex */
final class WithTimeoutOrThrowKt$withTimeoutOrThrow$2 extends s implements Function1<U0, U0> {
    public static final WithTimeoutOrThrowKt$withTimeoutOrThrow$2 INSTANCE = new WithTimeoutOrThrowKt$withTimeoutOrThrow$2();

    WithTimeoutOrThrowKt$withTimeoutOrThrow$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final U0 invoke(U0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }
}
