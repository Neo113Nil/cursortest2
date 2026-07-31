package ru.rustore.sdk.core.util;

import a2.AbstractC1241b;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3313G;
import o2.AbstractC3344n0;
import o2.C3345o;
import o2.InterfaceC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.core.tasks.Task;

@Metadata
/* loaded from: classes3.dex */
public final class TaskCoroutineExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object toSuspendResult(@NotNull Task<T> task, @NotNull d dVar) {
        TaskCoroutineExtensionsKt$toSuspendResult$1 taskCoroutineExtensionsKt$toSuspendResult$1;
        int i4;
        if (dVar instanceof TaskCoroutineExtensionsKt$toSuspendResult$1) {
            taskCoroutineExtensionsKt$toSuspendResult$1 = (TaskCoroutineExtensionsKt$toSuspendResult$1) dVar;
            int i5 = taskCoroutineExtensionsKt$toSuspendResult$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                taskCoroutineExtensionsKt$toSuspendResult$1.label = i5 - Integer.MIN_VALUE;
                Object obj = taskCoroutineExtensionsKt$toSuspendResult$1.result;
                Object f4 = AbstractC1241b.f();
                i4 = taskCoroutineExtensionsKt$toSuspendResult$1.label;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    AbstractC3313G abstractC3313G = (AbstractC3313G) taskCoroutineExtensionsKt$toSuspendResult$1.getContext().get(AbstractC3313G.f42003c);
                    Executor a4 = abstractC3313G != null ? AbstractC3344n0.a(abstractC3313G) : null;
                    taskCoroutineExtensionsKt$toSuspendResult$1.L$0 = task;
                    taskCoroutineExtensionsKt$toSuspendResult$1.L$1 = a4;
                    taskCoroutineExtensionsKt$toSuspendResult$1.label = 1;
                    final C3345o c3345o = new C3345o(AbstractC1241b.c(taskCoroutineExtensionsKt$toSuspendResult$1), 1);
                    c3345o.E();
                    if (a4 == null) {
                        task.addOnSuccessListener(new OnSuccessListener() { // from class: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$2$1
                            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                            public final void onSuccess(T t4) {
                                CancellableContinuationExtKt.resumeIfActive(InterfaceC3343n.this, Result.a(Result.m243constructorimpl(t4)));
                            }
                        });
                        task.addOnFailureListener(new OnFailureListener() { // from class: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$2$2
                            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
                            public final void onFailure(Throwable throwable) {
                                Intrinsics.checkNotNullParameter(throwable, "throwable");
                                InterfaceC3343n interfaceC3343n = InterfaceC3343n.this;
                                Result.Companion companion = Result.Companion;
                                CancellableContinuationExtKt.resumeIfActive(interfaceC3343n, Result.a(Result.m243constructorimpl(ResultKt.createFailure(throwable))));
                            }
                        });
                    } else {
                        task.addOnSuccessListener(a4, new OnSuccessListener() { // from class: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$2$3
                            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                            public final void onSuccess(T t4) {
                                CancellableContinuationExtKt.resumeIfActive(InterfaceC3343n.this, Result.a(Result.m243constructorimpl(t4)));
                            }
                        });
                        task.addOnFailureListener(a4, new OnFailureListener() { // from class: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$2$4
                            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
                            public final void onFailure(Throwable throwable) {
                                Intrinsics.checkNotNullParameter(throwable, "throwable");
                                InterfaceC3343n interfaceC3343n = InterfaceC3343n.this;
                                Result.Companion companion = Result.Companion;
                                CancellableContinuationExtKt.resumeIfActive(interfaceC3343n, Result.a(Result.m243constructorimpl(ResultKt.createFailure(throwable))));
                            }
                        });
                    }
                    c3345o.f(new TaskCoroutineExtensionsKt$toSuspendResult$2$5(task));
                    obj = c3345o.y();
                    if (obj == AbstractC1241b.f()) {
                        h.c(taskCoroutineExtensionsKt$toSuspendResult$1);
                    }
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return ((Result) obj).h();
            }
        }
        taskCoroutineExtensionsKt$toSuspendResult$1 = new TaskCoroutineExtensionsKt$toSuspendResult$1(dVar);
        Object obj2 = taskCoroutineExtensionsKt$toSuspendResult$1.result;
        Object f42 = AbstractC1241b.f();
        i4 = taskCoroutineExtensionsKt$toSuspendResult$1.label;
        if (i4 != 0) {
        }
        return ((Result) obj2).h();
    }
}
