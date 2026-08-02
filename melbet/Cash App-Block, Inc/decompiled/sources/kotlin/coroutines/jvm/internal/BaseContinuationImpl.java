package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import papa.internal.LaunchTracker;

/* loaded from: classes.dex */
public abstract class BaseContinuationImpl implements Continuation, CoroutineStackFrame, Serializable {
    private final Continuation<Object> completion;

    public BaseContinuationImpl(Continuation continuation) {
        this.completion = continuation;
    }

    public Continuation<Unit> create(Continuation<?> continuation) {
        continuation.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        DebugMetadata debugMetadata = (DebugMetadata) getClass().getAnnotation(DebugMetadata.class);
        String str2 = null;
        if (debugMetadata == null || debugMetadata.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField(AnnotatedPrivateKey.LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? debugMetadata.l()[i] : -1;
        ModuleNameRetriever.INSTANCE.getClass();
        LaunchTracker launchTracker = ModuleNameRetriever.cache;
        LaunchTracker launchTracker2 = ModuleNameRetriever.notOnJava9;
        if (launchTracker == null) {
            try {
                LaunchTracker launchTracker3 = new LaunchTracker(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                ModuleNameRetriever.cache = launchTracker3;
                launchTracker = launchTracker3;
            } catch (Exception unused2) {
                ModuleNameRetriever.cache = launchTracker2;
                launchTracker = launchTracker2;
            }
        }
        if (launchTracker != launchTracker2 && (method = (Method) launchTracker.appLaunchedCallback) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) launchTracker.lastAppBecameInvisibleRealtimeMillis) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) launchTracker.launchInProgress;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = debugMetadata.c();
        } else {
            str = str2 + '/' + debugMetadata.c();
        }
        return new StackTraceElement(str, debugMetadata.m(), debugMetadata.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<java.lang.Object>] */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            BaseContinuationImpl baseContinuationImpl = this;
            ?? r0 = baseContinuationImpl.completion;
            r0.getClass();
            try {
                obj = baseContinuationImpl.invokeSuspend(obj);
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj = new Result.Failure(th);
            }
            if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return;
            }
            Result.Companion companion2 = Result.Companion;
            baseContinuationImpl.releaseIntercepted();
            if (!(r0 instanceof BaseContinuationImpl)) {
                r0.resumeWith(obj);
                return;
            }
            this = r0;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        continuation.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
