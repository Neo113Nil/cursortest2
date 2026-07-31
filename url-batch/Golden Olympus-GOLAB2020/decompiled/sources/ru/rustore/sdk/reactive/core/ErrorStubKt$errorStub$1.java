package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class ErrorStubKt$errorStub$1 extends s implements Function1<Throwable, Unit> {
    public static final ErrorStubKt$errorStub$1 INSTANCE = new ErrorStubKt$errorStub$1();

    ErrorStubKt$errorStub$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f41027a;
    }

    public final void invoke(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("Error not implemented");
    }
}
