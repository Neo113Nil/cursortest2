package ru.rustore.sdk.core.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class Task<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final List<CompletionHandler> completionHandlers;

    @NotNull
    private final List<ListenerHandler<T>> listenerHandlers;

    @Nullable
    private volatile Result<? extends T> taskResult;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Task<T> create(@NotNull Function1<? super Task<T>.TaskResultProvider, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Task<T> task = new Task<>(null);
            block.invoke(task.new TaskResultProvider());
            return task;
        }

        private Companion() {
        }

        @NotNull
        public final <T> Pair<Task<T>, Task<T>.TaskResultProvider> create() {
            Task task = new Task(null);
            return TuplesKt.to(task, new TaskResultProvider());
        }
    }

    @Metadata
    public final class TaskResultProvider {
        public TaskResultProvider() {
        }

        public final void setTaskErrorResult(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Task.this.setTaskResult(error);
        }

        public final void setTaskSuccessResult(T t4) {
            Task.this.setTaskResult((Task<T>) t4);
        }
    }

    public /* synthetic */ Task(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Task<T> addCompletionListener(OnCompletionListener onCompletionListener, Executor executor) {
        synchronized (this) {
            try {
                Result<? extends T> result = this.taskResult;
                if (result == null) {
                    this.completionHandlers.add(new CompletionHandler(onCompletionListener, executor));
                } else {
                    runWithFallbackToMain(executor, new Task$addCompletionListener$1$1(onCompletionListener, Result.d(result.h())));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    static /* synthetic */ Task addCompletionListener$default(Task task, OnCompletionListener onCompletionListener, Executor executor, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            executor = null;
        }
        return task.addCompletionListener(onCompletionListener, executor);
    }

    private final Task<T> addListener(OnSuccessListener<T> onSuccessListener, OnFailureListener onFailureListener, Executor executor) {
        synchronized (this) {
            try {
                Result<? extends T> result = this.taskResult;
                if (result == null) {
                    this.listenerHandlers.add(new ListenerHandler<>(onSuccessListener, onFailureListener, executor));
                } else {
                    Object h4 = result.h();
                    if (Result.m244isFailureimpl(h4)) {
                        h4 = null;
                    }
                    Throwable d4 = Result.d(result.h());
                    if (h4 != null && onSuccessListener != null) {
                        runWithFallbackToMain(executor, new Task$addListener$1$1(onSuccessListener, h4));
                    }
                    if (d4 != null && onFailureListener != null) {
                        runWithFallbackToMain(executor, new Task$addListener$1$2(onFailureListener, d4));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Task addListener$default(Task task, OnSuccessListener onSuccessListener, OnFailureListener onFailureListener, Executor executor, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            onSuccessListener = null;
        }
        if ((i4 & 2) != 0) {
            onFailureListener = null;
        }
        if ((i4 & 4) != 0) {
            executor = null;
        }
        return task.addListener(onSuccessListener, onFailureListener, executor);
    }

    private final void notifyCompletionListeners(Throwable th) {
        TaskKt.forEachWithDeletion(this.completionHandlers, new Task$notifyCompletionListeners$1(this, th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runWithFallbackToMain(Executor executor, final Function0<Unit> function0) {
        if (executor != null) {
            executor.execute(new Runnable() { // from class: ru.rustore.sdk.core.tasks.a
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            });
        } else {
            TaskThreadHelper.INSTANCE.getMainHandler().post(new Runnable() { // from class: ru.rustore.sdk.core.tasks.b
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTaskResult(T t4) {
        synchronized (this) {
            if (this.taskResult != null) {
                return;
            }
            this.taskResult = Result.a(Result.m243constructorimpl(t4));
            TaskKt.forEachWithDeletion(this.listenerHandlers, new Task$setTaskResult$1$1(this, t4));
            notifyCompletionListeners(null);
            Unit unit = Unit.f41027a;
        }
    }

    @NotNull
    public final Task<T> addOnCompletionListener(@NotNull OnCompletionListener onCompletionListener) {
        Intrinsics.checkNotNullParameter(onCompletionListener, "onCompletionListener");
        return addCompletionListener$default(this, onCompletionListener, null, 2, null);
    }

    @NotNull
    public final Task<T> addOnFailureListener(@NotNull OnFailureListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return addListener(null, listener, null);
    }

    @NotNull
    public final Task<T> addOnSuccessListener(@NotNull OnSuccessListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return addListener(listener, null, null);
    }

    public final T await() {
        return await(Long.MIN_VALUE, TimeUnit.SECONDS);
    }

    public final void cancel() {
        setTaskResult((Throwable) new TaskCancellationException());
    }

    private Task() {
        this.listenerHandlers = new ArrayList();
        this.completionHandlers = new ArrayList();
    }

    @NotNull
    public final Task<T> addOnCompletionListener(@NotNull Executor executor, @NotNull OnCompletionListener onCompletionListener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(onCompletionListener, "onCompletionListener");
        return addCompletionListener(onCompletionListener, executor);
    }

    @NotNull
    public final Task<T> addOnFailureListener(@NotNull Executor executor, @NotNull OnFailureListener listener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return addListener(null, listener, executor);
    }

    @NotNull
    public final Task<T> addOnSuccessListener(@NotNull Executor executor, @NotNull OnSuccessListener<T> listener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return addListener(listener, null, executor);
    }

    public final T await(long j4, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.taskResult != null) {
            countDownLatch.countDown();
        } else {
            addCompletionListener(new OnCompletionListener() { // from class: ru.rustore.sdk.core.tasks.c
                @Override // ru.rustore.sdk.core.tasks.OnCompletionListener
                public final void onComplete(Throwable th) {
                    countDownLatch.countDown();
                }
            }, TaskThreadHelper.INSTANCE.getExecutorService());
        }
        if (j4 == Long.MIN_VALUE) {
            countDownLatch.await();
        } else {
            countDownLatch.await(j4, unit);
        }
        Result<? extends T> result = this.taskResult;
        if (result == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        T t4 = (T) result.h();
        ResultKt.a(t4);
        return t4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTaskResult(Throwable th) {
        synchronized (this) {
            if (this.taskResult != null) {
                return;
            }
            Result.Companion companion = Result.Companion;
            this.taskResult = Result.a(Result.m243constructorimpl(ResultKt.createFailure(th)));
            TaskKt.forEachWithDeletion(this.listenerHandlers, new Task$setTaskResult$2$1(this, th));
            notifyCompletionListeners(th);
            Unit unit = Unit.f41027a;
        }
    }
}
