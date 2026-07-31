package ru.rustore.sdk.core.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.core.tasks.Task;

@Metadata
/* loaded from: classes3.dex */
final class TaskCoroutineExtensionsKt$toSuspendResult$2$5 extends s implements Function1<Throwable, Unit> {
    final /* synthetic */ Task<T> $this_toSuspendResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaskCoroutineExtensionsKt$toSuspendResult$2$5(Task<T> task) {
        super(1);
        this.$this_toSuspendResult = task;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f41027a;
    }

    public final void invoke(Throwable th) {
        this.$this_toSuspendResult.cancel();
    }
}
