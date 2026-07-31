package ru.rustore.sdk.core.util;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3343n;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class CancellableContinuationExtKt {
    public static final <T> void resumeIfActive(@NotNull InterfaceC3343n interfaceC3343n, T t4) {
        Intrinsics.checkNotNullParameter(interfaceC3343n, "<this>");
        if (interfaceC3343n.isActive()) {
            interfaceC3343n.resumeWith(Result.m243constructorimpl(t4));
        }
    }

    public static final <T> void resumeWithExceptionIfActive(@NotNull InterfaceC3343n interfaceC3343n, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(interfaceC3343n, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        if (interfaceC3343n.isActive()) {
            Result.Companion companion = Result.Companion;
            interfaceC3343n.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(error)));
        }
    }
}
