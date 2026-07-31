package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ErrorStubKt {

    @NotNull
    private static final Function1<Throwable, Unit> errorStub = ErrorStubKt$errorStub$1.INSTANCE;

    @NotNull
    public static final Function1<Throwable, Unit> getErrorStub() {
        return errorStub;
    }
}
