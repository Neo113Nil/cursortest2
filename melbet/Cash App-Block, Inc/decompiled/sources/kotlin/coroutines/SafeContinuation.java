package kotlin.coroutines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class SafeContinuation implements Continuation, CoroutineStackFrame {
    private static final Companion Companion = new Companion(null);
    public static final AtomicReferenceFieldUpdater RESULT = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "result");
    public static final /* synthetic */ long RESULT$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(SafeContinuation.class.getDeclaredField("result"));
    public final Continuation delegate;
    private volatile Object result;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SafeContinuation(Continuation continuation, CoroutineSingletons coroutineSingletons) {
        continuation.getClass();
        this.delegate = continuation;
        this.result = coroutineSingletons;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.delegate.getContext();
    }

    public final Object getOrThrow() {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = RESULT;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                long j = RESULT$offset;
                SafeContinuation safeContinuation = this;
                if (unsafe.compareAndSwapObject(safeContinuation, j, coroutineSingletons, coroutineSingletons2)) {
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                }
                if (unsafe.getObjectVolatile(safeContinuation, j) != coroutineSingletons) {
                    obj = safeContinuation.result;
                    break;
                }
                this = safeContinuation;
            }
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        SafeContinuation safeContinuation;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj3 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = RESULT;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    long j2 = RESULT$offset;
                    safeContinuation = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(safeContinuation, j2, coroutineSingletons, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(safeContinuation, j2) != coroutineSingletons) {
                        break;
                    }
                    this = safeContinuation;
                    obj = obj2;
                }
            } else {
                safeContinuation = this;
                obj2 = obj;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj3 != coroutineSingletons2) {
                    a$$ExternalSyntheticBUOutline0.m$1("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = RESULT;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    j = RESULT$offset;
                    if (unsafe.compareAndSwapObject(safeContinuation, j, coroutineSingletons2, coroutineSingletons3)) {
                        safeContinuation.delegate.resumeWith(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(safeContinuation, j) == coroutineSingletons2);
            }
            this = safeContinuation;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeContinuation(Continuation continuation) {
        this(continuation, CoroutineSingletons.UNDECIDED);
        continuation.getClass();
    }
}
