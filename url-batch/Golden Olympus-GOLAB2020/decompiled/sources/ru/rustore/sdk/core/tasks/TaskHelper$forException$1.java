package ru.rustore.sdk.core.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.core.tasks.Task;

@Metadata
/* loaded from: classes3.dex */
final class TaskHelper$forException$1 extends s implements Function1<Task<T>.TaskResultProvider, Unit> {
    final /* synthetic */ Exception $exception;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaskHelper$forException$1(Exception exc) {
        super(1);
        this.$exception = exc;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Task.TaskResultProvider) obj);
        return Unit.f41027a;
    }

    public final void invoke(Task<T>.TaskResultProvider create) {
        Intrinsics.checkNotNullParameter(create, "$this$create");
        create.setTaskErrorResult(this.$exception);
    }
}
