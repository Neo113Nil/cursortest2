package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.SimpleTimeLimiter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class SimpleTimeLimiter implements TimeLimiter {
    private final ExecutorService executor;

    /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1, reason: invalid class name */
    class AnonymousClass1 implements InvocationHandler {
        final /* synthetic */ Set val$interruptibleMethods;
        final /* synthetic */ Object val$target;
        final /* synthetic */ long val$timeoutDuration;
        final /* synthetic */ TimeUnit val$timeoutUnit;

        AnonymousClass1(Object obj, long j8, TimeUnit timeUnit, Set set) {
            this.val$target = obj;
            this.val$timeoutDuration = j8;
            this.val$timeoutUnit = timeUnit;
            this.val$interruptibleMethods = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$invoke$0(Method method, Object obj, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e8) {
                throw SimpleTimeLimiter.throwCause(e8, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public Object invoke(Object obj, final Method method, @CheckForNull final Object[] objArr) {
            final Object obj2 = this.val$target;
            return SimpleTimeLimiter.this.callWithTimeout(new Callable() { // from class: com.google.common.util.concurrent.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object lambda$invoke$0;
                    lambda$invoke$0 = SimpleTimeLimiter.AnonymousClass1.lambda$invoke$0(method, obj2, objArr);
                    return lambda$invoke$0;
                }
            }, this.val$timeoutDuration, this.val$timeoutUnit, this.val$interruptibleMethods.contains(method));
        }
    }

    private SimpleTimeLimiter(ExecutorService executorService) {
        this.executor = (ExecutorService) Preconditions.checkNotNull(executorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T callWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit, boolean z7) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<T> submit = this.executor.submit(callable);
        try {
            if (!z7) {
                return (T) Uninterruptibles.getUninterruptibly(submit, j8, timeUnit);
            }
            try {
                return submit.get(j8, timeUnit);
            } catch (InterruptedException e8) {
                submit.cancel(true);
                throw e8;
            }
        } catch (ExecutionException e9) {
            throw throwCause(e9, true);
        } catch (TimeoutException e10) {
            submit.cancel(true);
            throw new UncheckedTimeoutException(e10);
        }
    }

    private static void checkPositiveTimeout(long j8) {
        Preconditions.checkArgument(j8 > 0, "timeout must be positive: %s", j8);
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
        return new SimpleTimeLimiter(executorService);
    }

    private static boolean declaresInterruptedEx(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static Set<Method> findInterruptibleMethods(Class<?> cls) {
        HashSet newHashSet = Sets.newHashSet();
        for (Method method : cls.getMethods()) {
            if (declaresInterruptedEx(method)) {
                newHashSet.add(method);
            }
        }
        return newHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception throwCause(Exception exc, boolean z7) {
        Throwable cause = exc.getCause();
        if (cause == null) {
            throw exc;
        }
        if (z7) {
            cause.setStackTrace((StackTraceElement[]) ObjectArrays.concat(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw exc;
    }

    private void wrapAndThrowExecutionExceptionOrError(Throwable th) {
        if (th instanceof Error) {
            throw new ExecutionError((Error) th);
        }
        if (!(th instanceof RuntimeException)) {
            throw new ExecutionException(th);
        }
        throw new UncheckedExecutionException(th);
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(Throwable th) {
        if (!(th instanceof Error)) {
            throw new UncheckedExecutionException(th);
        }
        throw new ExecutionError((Error) th);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<T> submit = this.executor.submit(callable);
        try {
            return (T) Uninterruptibles.getUninterruptibly(submit, j8, timeUnit);
        } catch (ExecutionException e8) {
            wrapAndThrowExecutionExceptionOrError(e8.getCause());
            throw new AssertionError();
        } catch (TimeoutException e9) {
            submit.cancel(true);
            throw e9;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t7, Class<T> cls, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t7);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Preconditions.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        return (T) newProxy(cls, new AnonymousClass1(t7, j8, timeUnit, findInterruptibleMethods(cls)));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<?> submit = this.executor.submit(runnable);
        try {
            Uninterruptibles.getUninterruptibly(submit, j8, timeUnit);
        } catch (ExecutionException e8) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e8.getCause());
            throw new AssertionError();
        } catch (TimeoutException e9) {
            submit.cancel(true);
            throw e9;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<?> submit = this.executor.submit(runnable);
        try {
            submit.get(j8, timeUnit);
        } catch (InterruptedException e8) {
            e = e8;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e9) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e9.getCause());
            throw new AssertionError();
        } catch (TimeoutException e10) {
            e = e10;
            submit.cancel(true);
            throw e;
        }
    }

    private static <T> T newProxy(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<T> submit = this.executor.submit(callable);
        try {
            return submit.get(j8, timeUnit);
        } catch (InterruptedException e8) {
            e = e8;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e9) {
            wrapAndThrowExecutionExceptionOrError(e9.getCause());
            throw new AssertionError();
        } catch (TimeoutException e10) {
            e = e10;
            submit.cancel(true);
            throw e;
        }
    }
}
