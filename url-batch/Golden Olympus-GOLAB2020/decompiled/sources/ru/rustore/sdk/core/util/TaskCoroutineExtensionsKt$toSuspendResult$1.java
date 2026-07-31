package ru.rustore.sdk.core.util;

import a2.AbstractC1241b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@f(c = "ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt", f = "TaskCoroutineExtensions.kt", l = {36}, m = "toSuspendResult")
@Metadata
/* loaded from: classes3.dex */
final class TaskCoroutineExtensionsKt$toSuspendResult$1<T> extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    TaskCoroutineExtensionsKt$toSuspendResult$1(kotlin.coroutines.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object suspendResult = TaskCoroutineExtensionsKt.toSuspendResult(null, this);
        return suspendResult == AbstractC1241b.f() ? suspendResult : Result.a(suspendResult);
    }
}
