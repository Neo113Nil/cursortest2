package kotlinx.coroutines.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class InlineList {
    public static final Symbol CLOSED;
    public static final Symbol REUSABLE_CLAIMED;
    public static final Symbol UNDEFINED;

    static {
        int i = 0;
        CLOSED = new Symbol("CLOSED", i);
        UNDEFINED = new Symbol("UNDEFINED", i);
        REUSABLE_CLAIMED = new Symbol("REUSABLE_CLAIMED", i);
    }

    public static final void checkParallelism(int i) {
        if (i >= 1) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Expected positive parallelism level, but got "));
    }

    public static final Object findSegmentInternal(Segment segment, long j, Function2 function2) {
        while (true) {
            if (segment.id >= j && !segment.isRemoved()) {
                return segment;
            }
            Object nextOrClosed = segment.getNextOrClosed();
            Symbol symbol = CLOSED;
            if (nextOrClosed == symbol) {
                return symbol;
            }
            Segment segment2 = (Segment) ((ConcurrentLinkedListNode) nextOrClosed);
            if (segment2 == null) {
                segment2 = (Segment) function2.invoke(Long.valueOf(segment.id + 1), segment);
                if (segment.trySetNext(segment2)) {
                    if (segment.isRemoved()) {
                        segment.remove();
                    }
                }
            }
            segment = segment2;
        }
    }

    /* renamed from: getSegment-impl, reason: not valid java name */
    public static final Segment m4198getSegmentimpl(Object obj) {
        if (obj != CLOSED) {
            return (Segment) obj;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Does not contain segment");
        return null;
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m4199isClosedimpl(Object obj) {
        return obj == CLOSED;
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m4200plusFjFbRPM(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void resumeCancellableWithInternal(Object obj, Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            continuation.resumeWith(obj);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.dispatcher;
        ContinuationImpl continuationImpl = dispatchedContinuation.continuation;
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        Object completedExceptionally = m4120exceptionOrNullimpl == null ? obj : new CompletedExceptionally(m4120exceptionOrNullimpl, false);
        if (safeIsDispatchNeeded(coroutineDispatcher, continuationImpl.getContext())) {
            dispatchedContinuation._state = completedExceptionally;
            dispatchedContinuation.resumeMode = 1;
            safeDispatch(coroutineDispatcher, continuationImpl.getContext(), dispatchedContinuation);
            return;
        }
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.useCount >= 4294967296L) {
            dispatchedContinuation._state = completedExceptionally;
            dispatchedContinuation.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            Job job = (Job) continuationImpl.getContext().get(Job.Key.$$INSTANCE);
            if (job == null || job.isActive()) {
                Object obj2 = dispatchedContinuation.countOrElement;
                CoroutineContext context = continuationImpl.getContext();
                Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj2);
                UndispatchedCoroutine updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(continuationImpl, context, updateThreadContext) : null;
                try {
                    continuationImpl.resumeWith(obj);
                } finally {
                    if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                        ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                    }
                }
            } else {
                dispatchedContinuation.resumeWith(SafeTrace.createFailure(job.getCancellationException()));
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void safeDispatch(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            coroutineDispatcher.dispatch(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean safeIsDispatchNeeded(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) {
        try {
            return coroutineDispatcher.isDispatchNeeded(coroutineContext);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }

    public static final long systemProp(long j, String str, long j2, long j3) {
        String str2;
        int i = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long longOrNull = StringsKt.toLongOrNull(10, str2);
        if (longOrNull == null) {
            Path$$ExternalSyntheticBUOutline0.m("System property '", str, "' has unrecognized value '", str2);
            return 0L;
        }
        long longValue = longOrNull.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        StringBuilder m = re$$ExternalSyntheticOutline0.m("System property '", str, "' should be in range ", j2);
        Boxes$$ExternalSyntheticOutline1.m1151m(j3, "..", ", but is '", m);
        m.append(longValue);
        m.append('\'');
        throw new IllegalStateException(m.toString().toString());
    }

    public static int systemProp$default(int i, int i2, String str) {
        return (int) systemProp(i, str, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
