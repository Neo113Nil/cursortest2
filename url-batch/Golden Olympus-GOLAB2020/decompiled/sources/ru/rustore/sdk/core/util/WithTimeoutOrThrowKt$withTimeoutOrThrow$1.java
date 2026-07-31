package ru.rustore.sdk.core.util;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@f(c = "ru.rustore.sdk.core.util.WithTimeoutOrThrowKt", f = "WithTimeoutOrThrow.kt", l = {13}, m = "withTimeoutOrThrow")
@Metadata
/* loaded from: classes3.dex */
final class WithTimeoutOrThrowKt$withTimeoutOrThrow$1<T> extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    WithTimeoutOrThrowKt$withTimeoutOrThrow$1(kotlin.coroutines.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WithTimeoutOrThrowKt.withTimeoutOrThrow(0L, null, null, this);
    }
}
