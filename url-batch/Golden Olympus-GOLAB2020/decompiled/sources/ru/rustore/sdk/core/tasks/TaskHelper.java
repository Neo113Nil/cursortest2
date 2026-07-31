package ru.rustore.sdk.core.tasks;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3313G;
import o2.B0;
import o2.InterfaceC3316J;
import o2.InterfaceC3366z;
import o2.K;
import o2.Z;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class TaskHelper {

    @NotNull
    public static final TaskHelper INSTANCE = new TaskHelper();

    private TaskHelper() {
    }

    public static /* synthetic */ Task wrap$default(TaskHelper taskHelper, AbstractC3313G abstractC3313G, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            abstractC3313G = Z.a();
        }
        return taskHelper.wrap(abstractC3313G, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wrap$lambda$1$lambda$0(InterfaceC3316J interfaceC3316J, Throwable th) {
        if (th instanceof TaskCancellationException) {
            K.f(interfaceC3316J, null, 1, null);
        }
    }

    @NotNull
    public final <T> Task<T> forException(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return Task.Companion.create(new TaskHelper$forException$1(exception));
    }

    @NotNull
    public final <T> Task<T> wrap(@NotNull AbstractC3313G taskDispatcher, @NotNull Function1<? super kotlin.coroutines.d, ? extends Object> task) {
        InterfaceC3366z b4;
        Intrinsics.checkNotNullParameter(taskDispatcher, "taskDispatcher");
        Intrinsics.checkNotNullParameter(task, "task");
        b4 = B0.b(null, 1, null);
        final InterfaceC3316J a4 = K.a(taskDispatcher.plus(b4));
        Task<T> create = Task.Companion.create(new TaskHelper$wrap$1(a4, task));
        create.addOnCompletionListener(new OnCompletionListener() { // from class: ru.rustore.sdk.core.tasks.d
            @Override // ru.rustore.sdk.core.tasks.OnCompletionListener
            public final void onComplete(Throwable th) {
                TaskHelper.wrap$lambda$1$lambda$0(InterfaceC3316J.this, th);
            }
        });
        return create;
    }
}
