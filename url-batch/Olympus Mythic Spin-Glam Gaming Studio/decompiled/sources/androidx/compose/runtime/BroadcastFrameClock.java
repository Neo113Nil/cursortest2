package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.X3;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: BroadcastFrameClock.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002'(B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0018\u0010\u0017\u001a\u00060\u0015j\u0002`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R \u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "cause", X3.g.e, "(Ljava/lang/Throwable;)V", "", "timeNanos", "sendFrame", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function0;", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "failureCause", "Ljava/lang/Throwable;", "Landroidx/compose/runtime/BroadcastFrameClock$AtomicAwaitersCount;", "pendingAwaitersCountUnlocked", "Landroidx/compose/runtime/internal/AtomicInt;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "awaiters", "Landroidx/collection/MutableObjectList;", "spareList", "", "getHasAwaiters", "()Z", "hasAwaiters", "FrameAwaiter", "AtomicAwaitersCount", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    private Throwable failureCause;
    private final Function0 onNewAwaiters;
    private final Object lock = new Object();
    private final AtomicInt pendingAwaitersCountUnlocked = AtomicAwaitersCount.m1083constructorimpl();
    private MutableObjectList awaiters = new MutableObjectList(0, 1, null);
    private MutableObjectList spareList = new MutableObjectList(0, 1, null);

    public BroadcastFrameClock(Function0 function0) {
        this.onNewAwaiters = function0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return MonotonicFrameClock.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "onFrame", "Lkotlin/Function1;", "", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CancellableContinuation;)V", "cancel", "", "resume", "timeNanos", "resumeWithException", TelemetryCategory.EXCEPTION, "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FrameAwaiter<R> {
        private CancellableContinuation continuation;
        private Function1 onFrame;

        public FrameAwaiter(Function1 function1, CancellableContinuation cancellableContinuation) {
            this.onFrame = function1;
            this.continuation = cancellableContinuation;
        }

        public final void cancel() {
            this.onFrame = null;
            this.continuation = null;
        }

        public final void resume(long timeNanos) {
            CancellableContinuation cancellableContinuation;
            Object m8023constructorimpl;
            Function1 function1 = this.onFrame;
            if (function1 == null || (cancellableContinuation = this.continuation) == null) {
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(function1.invoke(Long.valueOf(timeNanos)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            cancellableContinuation.resumeWith(m8023constructorimpl);
        }

        public final void resumeWithException(Throwable exception) {
            CancellableContinuation cancellableContinuation = this.continuation;
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(exception)));
            }
        }
    }

    public final boolean getHasAwaiters() {
        return (this.pendingAwaitersCountUnlocked.get() & 134217727) > 0;
    }

    public final void sendFrame(long timeNanos) {
        int i;
        int i2;
        synchronized (this.lock) {
            try {
                MutableObjectList mutableObjectList = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = mutableObjectList;
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, AtomicAwaitersCount.m1087packimpl(atomicInt, ((i >>> 27) & 15) + 1, 0)));
                int i3 = mutableObjectList.get_size();
                for (i2 = 0; i2 < i3; i2++) {
                    ((FrameAwaiter) mutableObjectList.get(i2)).resume(timeNanos);
                }
                mutableObjectList.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable cause) {
        int i;
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                MutableObjectList mutableObjectList = this.awaiters;
                Object[] objArr = mutableObjectList.content;
                int i2 = mutableObjectList._size;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((FrameAwaiter) objArr[i3]).resumeWithException(cause);
                }
                this.awaiters.clear();
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, AtomicAwaitersCount.m1087packimpl(atomicInt, ((i >>> 27) & 15) + 1, 0)));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0083@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017\u0088\u0001\u0005\u0092\u0001\u00020\u0004¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$AtomicAwaitersCount;", "", "constructor-impl", "()Landroidx/compose/runtime/internal/AtomicInt;", "Landroidx/compose/runtime/internal/AtomicInt;", "value", "(Landroidx/compose/runtime/internal/AtomicInt;)Landroidx/compose/runtime/internal/AtomicInt;", "", "version", "count", "pack-impl", "(Landroidx/compose/runtime/internal/AtomicInt;II)I", "pack", "", "toString-impl", "(Landroidx/compose/runtime/internal/AtomicInt;)Ljava/lang/String;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/internal/AtomicInt;", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class AtomicAwaitersCount {
        private final AtomicInt value;

        /* renamed from: constructor-impl, reason: not valid java name */
        private static AtomicInt m1084constructorimpl(AtomicInt atomicInt) {
            return atomicInt;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1085equalsimpl(AtomicInt atomicInt, Object obj) {
            return (obj instanceof AtomicAwaitersCount) && Intrinsics.areEqual(atomicInt, ((AtomicAwaitersCount) obj).getValue());
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1086hashCodeimpl(AtomicInt atomicInt) {
            return atomicInt.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: pack-impl, reason: not valid java name */
        public static final int m1087packimpl(AtomicInt atomicInt, int i, int i2) {
            return ((i & 15) << 27) | (134217727 & i2);
        }

        public boolean equals(Object other) {
            return m1085equalsimpl(this.value, other);
        }

        public int hashCode() {
            return m1086hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ AtomicInt getValue() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static AtomicInt m1083constructorimpl() {
            return m1084constructorimpl(new AtomicInt(0));
        }

        public String toString() {
            return m1088toStringimpl(this.value);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1088toStringimpl(AtomicInt atomicInt) {
            int i = atomicInt.get();
            return "AtomicAwaitersCount(version = " + ((i >>> 27) & 15) + ", count = " + (i & 134217727) + ')';
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public Object withFrameNanos(Function1 function1, Continuation continuation) {
        int i;
        int i2;
        boolean z = true;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final FrameAwaiter frameAwaiter = new FrameAwaiter(function1, cancellableContinuationImpl);
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th == null) {
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                    i2 = i + 1;
                } while (!atomicInt.compareAndSet(i, i2));
                if ((134217727 & i2) != 1) {
                    z = false;
                }
                ref$IntRef.element = (i2 >>> 27) & 15;
                this.awaiters.add(frameAwaiter);
                cancellableContinuationImpl.invokeOnCancellation(new Function1() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Throwable th2) {
                        int i3;
                        BroadcastFrameClock.FrameAwaiter.this.cancel();
                        AtomicInt atomicInt2 = this.pendingAwaitersCountUnlocked;
                        int i4 = ref$IntRef.element;
                        do {
                            i3 = atomicInt2.get();
                        } while (!atomicInt2.compareAndSet(i3, ((i3 >>> 27) & 15) == i4 ? i3 - 1 : i3));
                    }
                });
                if (z && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.mo4828invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            } else {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(th)));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
