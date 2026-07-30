package com.facebook.bolts;

import com.facebook.bolts.BoltsExecutors;
import defpackage.ah0;
import defpackage.ct2;
import defpackage.dt2;
import defpackage.et2;
import defpackage.fa0;
import defpackage.ft2;
import defpackage.gt2;
import defpackage.k3;
import defpackage.q1;
import defpackage.s50;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR;
    public static final Companion Companion = new Companion(null);
    private static final Executor IMMEDIATE_EXECUTOR;
    private static final Task<?> TASK_CANCELLED;
    private static final Task<Boolean> TASK_FALSE;
    private static final Task<?> TASK_NULL;
    private static final Task<Boolean> TASK_TRUE;
    public static final Executor UI_THREAD_EXECUTOR;
    private static volatile UnobservedExceptionHandler unobservedExceptionHandler;
    private boolean cancelledField;
    private boolean completeField;
    private final Condition condition;
    private List<Continuation<TResult, Void>> continuations;
    private Exception errorField;
    private boolean errorHasBeenObserved;
    private final ReentrantLock lock;
    private TResult resultField;
    private UnobservedErrorNotifier unobservedErrorNotifier;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    @fa0
    public final class TaskCompletionSource extends com.facebook.bolts.TaskCompletionSource<TResult> {
        public TaskCompletionSource() {
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface UnobservedExceptionHandler {
        void unobservedException(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    static {
        BoltsExecutors.Companion companion = BoltsExecutors.Companion;
        BACKGROUND_EXECUTOR = companion.background();
        IMMEDIATE_EXECUTOR = companion.immediate$facebook_bolts_release();
        UI_THREAD_EXECUTOR = AndroidExecutors.Companion.uiThread();
        TASK_NULL = new Task<>((Object) null);
        TASK_TRUE = new Task<>(Boolean.TRUE);
        TASK_FALSE = new Task<>(Boolean.FALSE);
        TASK_CANCELLED = new Task<>(true);
    }

    private Task(boolean z) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable) {
        return Companion.call(callable);
    }

    public static final <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return Companion.callInBackground(callable);
    }

    public static final <TResult> Task<TResult> cancelled() {
        return Companion.cancelled();
    }

    public static /* synthetic */ Task continueWhile$default(Task task, Callable callable, Continuation continuation, Executor executor, CancellationToken cancellationToken, int i, Object obj) {
        if ((i & 4) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        if ((i & 8) != 0) {
            cancellationToken = null;
        }
        return task.continueWhile(callable, continuation, executor, cancellationToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void continueWith$lambda$10$lambda$9(com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        taskCompletionSource.getClass();
        continuation.getClass();
        executor.getClass();
        task.getClass();
        Companion.completeImmediately(taskCompletionSource, continuation, task, executor, cancellationToken);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void continueWithTask$lambda$12$lambda$11(com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        taskCompletionSource.getClass();
        continuation.getClass();
        executor.getClass();
        task.getClass();
        Companion.completeAfterTask(taskCompletionSource, continuation, task, executor, cancellationToken);
        return null;
    }

    public static final Task<Void> delay(long j) {
        return Companion.delay(j);
    }

    public static final <TResult> Task<TResult> forError(Exception exc) {
        return Companion.forError(exc);
    }

    public static final <TResult> Task<TResult> forResult(TResult tresult) {
        return Companion.forResult(tresult);
    }

    public static final UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return Companion.getUnobservedExceptionHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task makeVoid$lambda$8(Task task) {
        task.getClass();
        return task.isCancelled() ? Companion.cancelled() : task.isFaulted() ? Companion.forError(task.getError()) : Companion.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task onSuccess$lambda$13(CancellationToken cancellationToken, Continuation continuation, Task task) {
        continuation.getClass();
        task.getClass();
        return (cancellationToken == null || !cancellationToken.isCancellationRequested()) ? task.isFaulted() ? Companion.forError(task.getError()) : task.isCancelled() ? Companion.cancelled() : task.continueWith(continuation) : Companion.cancelled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task onSuccessTask$lambda$14(CancellationToken cancellationToken, Continuation continuation, Task task) {
        continuation.getClass();
        task.getClass();
        return (cancellationToken == null || !cancellationToken.isCancellationRequested()) ? task.isFaulted() ? Companion.forError(task.getError()) : task.isCancelled() ? Companion.cancelled() : task.continueWithTask(continuation) : Companion.cancelled();
    }

    private final void runContinuations() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<Continuation<TResult, Void>> list = this.continuations;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((Continuation) it.next()).then(this);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            this.continuations = null;
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler2) {
        Companion.setUnobservedExceptionHandler(unobservedExceptionHandler2);
    }

    public static final Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        return Companion.whenAll(collection);
    }

    public static final <TResult> Task<List<TResult>> whenAllResult(Collection<Task<TResult>> collection) {
        return Companion.whenAllResult(collection);
    }

    public static final Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        return Companion.whenAny(collection);
    }

    public static final <TResult> Task<Task<TResult>> whenAnyResult(Collection<Task<TResult>> collection) {
        return Companion.whenAnyResult(collection);
    }

    public final Task<Void> continueWhile(final Callable<Boolean> callable, final Continuation<Void, Task<Void>> continuation, final Executor executor, final CancellationToken cancellationToken) {
        callable.getClass();
        continuation.getClass();
        executor.getClass();
        return makeVoid().continueWithTask((Continuation<Void, Task<TContinuationResult>>) new Continuation<Void, Task<Void>>() { // from class: com.facebook.bolts.Task$continueWhile$predicateContinuation$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.bolts.Continuation
            public Task<Void> then(Task<Void> task) {
                task.getClass();
                CancellationToken cancellationToken2 = CancellationToken.this;
                if (cancellationToken2 != null && cancellationToken2.isCancellationRequested()) {
                    return Task.Companion.cancelled();
                }
                Boolean call = callable.call();
                call.getClass();
                return call.booleanValue() ? Task.Companion.forResult(null).onSuccessTask(continuation, executor).onSuccessTask(this, executor) : Task.Companion.forResult(null);
            }
        }, executor);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor, CancellationToken cancellationToken) {
        Continuation<TResult, TContinuationResult> continuation2;
        Executor executor2;
        CancellationToken cancellationToken2;
        List<Continuation<TResult, Void>> list;
        continuation.getClass();
        executor.getClass();
        com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (isCompleted || (list = this.continuations) == null) {
                continuation2 = continuation;
                executor2 = executor;
                cancellationToken2 = cancellationToken;
            } else {
                continuation2 = continuation;
                executor2 = executor;
                cancellationToken2 = cancellationToken;
                list.add(new dt2(taskCompletionSource, continuation2, executor2, cancellationToken2, 0));
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
            if (isCompleted) {
                Companion.completeImmediately(taskCompletionSource, continuation2, this, executor2, cancellationToken2);
            }
            return taskCompletionSource.getTask();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, CancellationToken cancellationToken) {
        Continuation<TResult, Task<TContinuationResult>> continuation2;
        Executor executor2;
        CancellationToken cancellationToken2;
        List<Continuation<TResult, Void>> list;
        continuation.getClass();
        executor.getClass();
        com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (isCompleted || (list = this.continuations) == null) {
                continuation2 = continuation;
                executor2 = executor;
                cancellationToken2 = cancellationToken;
            } else {
                continuation2 = continuation;
                executor2 = executor;
                cancellationToken2 = cancellationToken;
                list.add(new dt2(taskCompletionSource, continuation2, executor2, cancellationToken2, 1));
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
            if (isCompleted) {
                Companion.completeAfterTask(taskCompletionSource, continuation2, this, executor2, cancellationToken2);
            }
            return taskCompletionSource.getTask();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Exception getError() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                this.errorHasBeenObserved = true;
                UnobservedErrorNotifier unobservedErrorNotifier = this.unobservedErrorNotifier;
                if (unobservedErrorNotifier != null) {
                    unobservedErrorNotifier.setObserved();
                    this.unobservedErrorNotifier = null;
                }
            }
            Exception exc = this.errorField;
            reentrantLock.unlock();
            return exc;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final TResult getResult() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.resultField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.cancelledField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCompleted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.completeField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isFaulted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.errorField != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Task<Void> makeVoid() {
        return continueWithTask(new et2());
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor, CancellationToken cancellationToken) {
        continuation.getClass();
        executor.getClass();
        return continueWithTask(new ct2(cancellationToken, continuation, 1), executor);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, CancellationToken cancellationToken) {
        continuation.getClass();
        executor.getClass();
        return continueWithTask(new ct2(cancellationToken, continuation, 0), executor);
    }

    public final boolean trySetCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.cancelledField = true;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetError(Exception exc) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.errorField = exc;
            this.errorHasBeenObserved = false;
            this.condition.signalAll();
            runContinuations();
            if (!this.errorHasBeenObserved && unobservedExceptionHandler != null) {
                this.unobservedErrorNotifier = new UnobservedErrorNotifier(this);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetResult(TResult tresult) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.resultField = tresult;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean waitForCompletion(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await(j, timeUnit);
            }
            boolean isCompleted = isCompleted();
            reentrantLock.unlock();
            return isCompleted;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void call$lambda$2(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Callable callable) {
            taskCompletionSource.getClass();
            callable.getClass();
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                taskCompletionSource.setCancelled();
                return;
            }
            try {
                taskCompletionSource.setResult(callable.call());
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e) {
                taskCompletionSource.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeAfterTask(com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, Task<TContinuationResult>> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
            com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource2;
            try {
                taskCompletionSource2 = taskCompletionSource;
                try {
                    executor.execute(new ft2(cancellationToken, taskCompletionSource2, continuation, task, 0));
                } catch (Exception e) {
                    e = e;
                    taskCompletionSource2.setError(new ExecutorException(e));
                }
            } catch (Exception e2) {
                e = e2;
                taskCompletionSource2 = taskCompletionSource;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void completeAfterTask$lambda$7(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
            taskCompletionSource.getClass();
            continuation.getClass();
            task.getClass();
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                taskCompletionSource.setCancelled();
                return;
            }
            try {
                Task task2 = (Task) continuation.then(task);
                if (task2 != null && task2.continueWith(new ct2(cancellationToken, taskCompletionSource, 2)) != null) {
                    return;
                }
                taskCompletionSource.setResult(null);
                Unit unit = Unit.a;
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e) {
                taskCompletionSource.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Void completeAfterTask$lambda$7$lambda$6(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Task task) {
            taskCompletionSource.getClass();
            task.getClass();
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                taskCompletionSource.setCancelled();
                return null;
            }
            if (task.isCancelled()) {
                taskCompletionSource.setCancelled();
            } else if (task.isFaulted()) {
                taskCompletionSource.setError(task.getError());
            } else {
                taskCompletionSource.setResult(task.getResult());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeImmediately(com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, TContinuationResult> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
            com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource2;
            try {
                taskCompletionSource2 = taskCompletionSource;
                try {
                    executor.execute(new ft2(cancellationToken, taskCompletionSource2, continuation, task, 1));
                } catch (Exception e) {
                    e = e;
                    taskCompletionSource2.setError(new ExecutorException(e));
                }
            } catch (Exception e2) {
                e = e2;
                taskCompletionSource2 = taskCompletionSource;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void completeImmediately$lambda$5(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
            taskCompletionSource.getClass();
            continuation.getClass();
            task.getClass();
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                taskCompletionSource.setCancelled();
                return;
            }
            try {
                taskCompletionSource.setResult(continuation.then(task));
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e) {
                taskCompletionSource.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void delay$lambda$0(com.facebook.bolts.TaskCompletionSource taskCompletionSource) {
            taskCompletionSource.getClass();
            taskCompletionSource.trySetResult(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void delay$lambda$1(ScheduledFuture scheduledFuture, com.facebook.bolts.TaskCompletionSource taskCompletionSource) {
            taskCompletionSource.getClass();
            scheduledFuture.cancel(true);
            taskCompletionSource.trySetCancelled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Void whenAny$lambda$4(AtomicBoolean atomicBoolean, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Task task) {
            atomicBoolean.getClass();
            taskCompletionSource.getClass();
            task.getClass();
            if (atomicBoolean.compareAndSet(false, true)) {
                taskCompletionSource.setResult(task);
                return null;
            }
            task.getError();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Void whenAnyResult$lambda$3(AtomicBoolean atomicBoolean, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Task task) {
            atomicBoolean.getClass();
            taskCompletionSource.getClass();
            task.getClass();
            if (atomicBoolean.compareAndSet(false, true)) {
                taskCompletionSource.setResult(task);
                return null;
            }
            task.getError();
            return null;
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, CancellationToken cancellationToken) {
            callable.getClass();
            executor.getClass();
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            try {
                executor.execute(new s50(cancellationToken, taskCompletionSource, callable, 7));
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
            callable.getClass();
            return call(callable, Task.BACKGROUND_EXECUTOR, null);
        }

        public final <TResult> Task<TResult> cancelled() {
            Task<TResult> task = Task.TASK_CANCELLED;
            task.getClass();
            return task;
        }

        public final Task<Void> delay(long j) {
            return delay$facebook_bolts_release(j, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), null);
        }

        public final Task<Void> delay$facebook_bolts_release(long j, ScheduledExecutorService scheduledExecutorService, CancellationToken cancellationToken) {
            scheduledExecutorService.getClass();
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                return cancelled();
            }
            if (j <= 0) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new k3(23, taskCompletionSource), j, TimeUnit.MILLISECONDS);
            if (cancellationToken != null) {
                cancellationToken.register(new q1(20, schedule, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> forError(Exception exc) {
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setError(exc);
            return taskCompletionSource.getTask();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <TResult> Task<TResult> forResult(TResult tresult) {
            if (tresult == 0) {
                Task<TResult> task = Task.TASK_NULL;
                task.getClass();
                return task;
            }
            if (tresult instanceof Boolean) {
                Task<TResult> task2 = ((Boolean) tresult).booleanValue() ? Task.TASK_TRUE : Task.TASK_FALSE;
                task2.getClass();
                return task2;
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setResult(tresult);
            return taskCompletionSource.getTask();
        }

        public final UnobservedExceptionHandler getUnobservedExceptionHandler() {
            return Task.unobservedExceptionHandler;
        }

        public final void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler) {
            Task.unobservedExceptionHandler = unobservedExceptionHandler;
        }

        public final Task<Void> whenAll(Collection<? extends Task<?>> collection) {
            collection.getClass();
            if (collection.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final ArrayList arrayList = new ArrayList();
            final ReentrantLock reentrantLock = new ReentrantLock();
            final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : collection) {
                task.getClass();
                task.continueWith(new Continuation() { // from class: com.facebook.bolts.Task$Companion$whenAll$1
                    @Override // com.facebook.bolts.Continuation
                    public final Void then(Task<Object> task2) {
                        task2.getClass();
                        if (task2.isFaulted()) {
                            ReentrantLock reentrantLock2 = reentrantLock;
                            ArrayList<Exception> arrayList2 = arrayList;
                            reentrantLock2.lock();
                            try {
                                arrayList2.add(task2.getError());
                            } finally {
                                reentrantLock2.unlock();
                            }
                        }
                        if (task2.isCancelled()) {
                            atomicBoolean.set(true);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (arrayList.size() != 0) {
                                if (arrayList.size() == 1) {
                                    taskCompletionSource.setError(arrayList.get(0));
                                    return null;
                                }
                                taskCompletionSource.setError(new AggregateException(String.format("There were %d exceptions.", Arrays.copyOf(new Object[]{Integer.valueOf(arrayList.size())}, 1)), arrayList));
                                return null;
                            }
                            boolean z = atomicBoolean.get();
                            TaskCompletionSource<Void> taskCompletionSource2 = taskCompletionSource;
                            if (z) {
                                taskCompletionSource2.setCancelled();
                                return null;
                            }
                            taskCompletionSource2.setResult(null);
                        }
                        return null;
                    }

                    @Override // com.facebook.bolts.Continuation
                    public /* bridge */ /* synthetic */ Object then(Task task2) {
                        return then((Task<Object>) task2);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<List<TResult>> whenAllResult(final Collection<Task<TResult>> collection) {
            collection.getClass();
            return (Task<List<TResult>>) whenAll(collection).onSuccess(new Continuation<Void, List<? extends TResult>>() { // from class: com.facebook.bolts.Task$Companion$whenAllResult$1
                @Override // com.facebook.bolts.Continuation
                public List<TResult> then(Task<Void> task) {
                    task.getClass();
                    if (collection.isEmpty()) {
                        return ah0.m;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<Task<TResult>> it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getResult());
                    }
                    return arrayList;
                }
            });
        }

        public final Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
            collection.getClass();
            if (collection.isEmpty()) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : collection) {
                task.getClass();
                task.continueWith(new gt2(atomicBoolean, taskCompletionSource, 1));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<Task<TResult>> whenAnyResult(Collection<Task<TResult>> collection) {
            collection.getClass();
            if (collection.isEmpty()) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            int i = 0;
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<Task<TResult>> it = collection.iterator();
            while (it.hasNext()) {
                it.next().continueWith(new gt2(atomicBoolean, taskCompletionSource, i));
            }
            return taskCompletionSource.getTask();
        }

        private Companion() {
        }

        public final <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
            callable.getClass();
            return call(callable, Task.BACKGROUND_EXECUTOR, cancellationToken);
        }

        public final Task<Void> delay(long j, CancellationToken cancellationToken) {
            return delay$facebook_bolts_release(j, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), cancellationToken);
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
            callable.getClass();
            executor.getClass();
            return call(callable, executor, null);
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable) {
            callable.getClass();
            return call(callable, Task.IMMEDIATE_EXECUTOR, null);
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
            callable.getClass();
            return call(callable, Task.IMMEDIATE_EXECUTOR, cancellationToken);
        }
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
        return Companion.call(callable, cancellationToken);
    }

    public static final <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
        return Companion.callInBackground(callable, cancellationToken);
    }

    public static final Task<Void> delay(long j, CancellationToken cancellationToken) {
        return Companion.delay(j, cancellationToken);
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return Companion.call(callable, executor);
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, CancellationToken cancellationToken) {
        return Companion.call(callable, executor, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        continuation.getClass();
        executor.getClass();
        return onSuccess(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        continuation.getClass();
        executor.getClass();
        return onSuccessTask(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation) {
        continuation.getClass();
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        continuation.getClass();
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        continuation.getClass();
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        continuation.getClass();
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, CancellationToken cancellationToken) {
        callable.getClass();
        continuation.getClass();
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation) {
        callable.getClass();
        continuation.getClass();
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <TOut> Task<TOut> cast() {
        return this;
    }

    private Task(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        trySetResult(tresult);
    }

    public final void waitForCompletion() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await();
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Task() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        continuation.getClass();
        executor.getClass();
        return continueWith(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        continuation.getClass();
        executor.getClass();
        return continueWithTask(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        continuation.getClass();
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        continuation.getClass();
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        continuation.getClass();
        return continueWith(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        continuation.getClass();
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }
}
