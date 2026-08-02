package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.DisposeOnCancel;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public class SharedFlowImpl extends AbstractSharedFlow implements MutableSharedFlow, Flow, FusibleFlow {
    public Object[] buffer;
    public final int bufferCapacity;
    public int bufferSize;
    public long minCollectorIndex;
    public final BufferOverflow onBufferOverflow;
    public int queueSize;
    public final int replay;
    public long replayIndex;

    public final class Emitter implements DisposableHandle {
        public final CancellableContinuationImpl cont;
        public final SharedFlowImpl flow;
        public final long index;
        public final Object value;

        public Emitter(SharedFlowImpl sharedFlowImpl, long j, Object obj, CancellableContinuationImpl cancellableContinuationImpl) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            SharedFlowImpl sharedFlowImpl = this.flow;
            synchronized (sharedFlowImpl) {
                if (this.index >= sharedFlowImpl.getHead()) {
                    Object[] objArr = sharedFlowImpl.buffer;
                    objArr.getClass();
                    long j = this.index;
                    if (objArr[((int) j) & (objArr.length - 1)] == this) {
                        FlowKt.access$setBufferAt(objArr, j, FlowKt.NO_VALUE);
                        sharedFlowImpl.cleanupTailLocked();
                    }
                }
            }
        }
    }

    public SharedFlowImpl(int i, int i2, BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:47|48))(1:49)|12|13|14|15|(3:16|(3:38|39|(3:41|42|43)(1:44))(4:18|(1:23)|32|(2:34|35)(1:36))|37))(4:50|51|52|53)|29|30)(5:59|60|61|(2:63|(1:65))|67)|54|55|15|(3:16|(0)(0)|37)))|70|6|(0)(0)|54|55|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        throw r2.getCancellationException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void collect$suspendImpl(SharedFlowImpl sharedFlowImpl, FlowCollector flowCollector, Continuation continuation) {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        int i;
        SharedFlowImpl sharedFlowImpl2;
        Throwable th;
        SharedFlowSlot sharedFlowSlot;
        FlowCollector flowCollector2;
        Job job;
        Object tryTakeValue;
        Job job2;
        FlowCollector flowCollector3;
        if (continuation instanceof SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) continuation;
            int i2 = sharedFlowImpl$collect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sharedFlowImpl$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = sharedFlowImpl$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedFlowImpl$collect$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            job2 = sharedFlowImpl$collect$1.L$3;
                            sharedFlowSlot = sharedFlowImpl$collect$1.L$2;
                            flowCollector3 = sharedFlowImpl$collect$1.L$1;
                            sharedFlowImpl2 = sharedFlowImpl$collect$1.L$0;
                        } else {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return;
                            }
                            job2 = sharedFlowImpl$collect$1.L$3;
                            sharedFlowSlot = sharedFlowImpl$collect$1.L$2;
                            flowCollector3 = sharedFlowImpl$collect$1.L$1;
                            sharedFlowImpl2 = sharedFlowImpl$collect$1.L$0;
                        }
                        try {
                            SafeTrace.throwOnFailure(obj);
                            flowCollector2 = flowCollector3;
                            job = job2;
                            sharedFlowImpl = sharedFlowImpl2;
                            while (true) {
                                tryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
                                if (tryTakeValue == FlowKt.NO_VALUE) {
                                    sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.L$1 = flowCollector2;
                                    sharedFlowImpl$collect$1.L$2 = sharedFlowSlot;
                                    sharedFlowImpl$collect$1.L$3 = job;
                                    sharedFlowImpl$collect$1.label = 2;
                                    if (sharedFlowImpl.awaitValue(sharedFlowSlot, sharedFlowImpl$collect$1) == coroutineSingletons) {
                                        return;
                                    }
                                } else {
                                    if (job != null && !job.isActive()) {
                                        break;
                                    }
                                    sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.L$1 = flowCollector2;
                                    sharedFlowImpl$collect$1.L$2 = sharedFlowSlot;
                                    sharedFlowImpl$collect$1.L$3 = job;
                                    sharedFlowImpl$collect$1.label = 3;
                                    if (flowCollector2.emit(tryTakeValue, sharedFlowImpl$collect$1) == coroutineSingletons) {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        sharedFlowSlot = sharedFlowImpl$collect$1.L$2;
                        FlowCollector flowCollector4 = sharedFlowImpl$collect$1.L$1;
                        SharedFlowImpl sharedFlowImpl3 = sharedFlowImpl$collect$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            flowCollector2 = flowCollector4;
                            sharedFlowImpl = sharedFlowImpl3;
                        } catch (Throwable th3) {
                            th = th3;
                            sharedFlowImpl2 = sharedFlowImpl3;
                        }
                    }
                    sharedFlowImpl2.freeSlot(sharedFlowSlot);
                    throw th;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowSlot sharedFlowSlot2 = (SharedFlowSlot) sharedFlowImpl.allocateSlot();
                try {
                    if (flowCollector instanceof SubscribedFlowCollector) {
                        sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                        sharedFlowImpl$collect$1.L$1 = flowCollector;
                        sharedFlowImpl$collect$1.L$2 = sharedFlowSlot2;
                        sharedFlowImpl$collect$1.label = 1;
                        if (((SubscribedFlowCollector) flowCollector).onSubscription(sharedFlowImpl$collect$1) == coroutineSingletons) {
                            return;
                        }
                    }
                    flowCollector2 = flowCollector;
                    sharedFlowSlot = sharedFlowSlot2;
                } catch (Throwable th4) {
                    sharedFlowImpl2 = sharedFlowImpl;
                    th = th4;
                    sharedFlowSlot = sharedFlowSlot2;
                }
                job = (Job) sharedFlowImpl$collect$1.getContext().get(Job.Key.$$INSTANCE);
                while (true) {
                    tryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
                    if (tryTakeValue == FlowKt.NO_VALUE) {
                    }
                }
            }
        }
        sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(sharedFlowImpl, continuation);
        Object obj2 = sharedFlowImpl$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedFlowImpl$collect$1.label;
        if (i == 0) {
        }
        job = (Job) sharedFlowImpl$collect$1.getContext().get(Job.Key.$$INSTANCE);
        while (true) {
            tryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
            if (tryTakeValue == FlowKt.NO_VALUE) {
            }
        }
    }

    public final Object awaitValue(SharedFlowSlot sharedFlowSlot, SharedFlowImpl$collect$1 sharedFlowImpl$collect$1) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(sharedFlowImpl$collect$1));
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(sharedFlowSlot) < 0) {
                    sharedFlowSlot.cont = cancellableContinuationImpl;
                } else {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : Unit.INSTANCE;
    }

    public final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            while (this.queueSize > 0) {
                long head = getHead();
                int i = this.bufferSize;
                int i2 = this.queueSize;
                if (objArr[((int) ((head + (i + i2)) - 1)) & (objArr.length - 1)] != FlowKt.NO_VALUE) {
                    return;
                }
                this.queueSize = i2 - 1;
                FlowKt.access$setBufferAt(objArr, getHead() + this.bufferSize + this.queueSize, null);
            }
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        collect$suspendImpl(this, flowCollector, continuation);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot createSlot() {
        SharedFlowSlot sharedFlowSlot = new SharedFlowSlot();
        sharedFlowSlot.index = -1L;
        return sharedFlowSlot;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot[] createSlotArray() {
        return new SharedFlowSlot[2];
    }

    public final void dropOldestLocked() {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        Object[] objArr = this.buffer;
        objArr.getClass();
        FlowKt.access$setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            if (this.nCollectors != 0 && (abstractSharedFlowSlotArr = this.slots) != null) {
                for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                    if (abstractSharedFlowSlot != null) {
                        SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                        long j = sharedFlowSlot.index;
                        if (0 <= j && j < head) {
                            sharedFlowSlot.index = head;
                        }
                    }
                }
            }
            this.minCollectorIndex = head;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        SharedFlowImpl sharedFlowImpl;
        Throwable th;
        Continuation[] findSlotsToResumeLocked;
        Emitter emitter;
        if (tryEmit(obj)) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        Continuation[] continuationArr = CombineKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(obj)) {
                    try {
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
                        findSlotsToResumeLocked = findSlotsToResumeLocked(continuationArr);
                        emitter = null;
                        sharedFlowImpl = this;
                    } catch (Throwable th2) {
                        th = th2;
                        sharedFlowImpl = this;
                        throw th;
                    }
                } else {
                    try {
                        sharedFlowImpl = this;
                        try {
                            Emitter emitter2 = new Emitter(sharedFlowImpl, getHead() + this.bufferSize + this.queueSize, obj, cancellableContinuationImpl);
                            sharedFlowImpl.enqueueLocked(emitter2);
                            sharedFlowImpl.queueSize++;
                            if (sharedFlowImpl.bufferCapacity == 0) {
                                continuationArr = sharedFlowImpl.findSlotsToResumeLocked(continuationArr);
                            }
                            findSlotsToResumeLocked = continuationArr;
                            emitter = emitter2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        sharedFlowImpl = this;
                        th = th4;
                        throw th;
                    }
                }
                int i = 0;
                if (emitter != null) {
                    cancellableContinuationImpl.invokeOnCancellationImpl(new DisposeOnCancel(emitter, i));
                }
                int length = findSlotsToResumeLocked.length;
                while (i < length) {
                    Continuation continuation2 = findSlotsToResumeLocked[i];
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.Companion;
                        continuation2.resumeWith(Unit.INSTANCE);
                    }
                    i++;
                }
                Object result = cancellableContinuationImpl.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (result != coroutineSingletons) {
                    result = Unit.INSTANCE;
                }
                return result == coroutineSingletons ? result : Unit.INSTANCE;
            } catch (Throwable th5) {
                th = th5;
                sharedFlowImpl = this;
            }
        }
    }

    public final void enqueueLocked(Object obj) {
        int i = this.bufferSize + this.queueSize;
        Object[] objArr = this.buffer;
        if (objArr == null) {
            objArr = growBuffer(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = growBuffer(i, objArr.length * 2, objArr);
        }
        FlowKt.access$setBufferAt(objArr, getHead() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Continuation[] findSlotsToResumeLocked(Continuation[] continuationArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        CancellableContinuationImpl cancellableContinuationImpl;
        int length = continuationArr.length;
        if (this.nCollectors != 0 && (abstractSharedFlowSlotArr = this.slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot != null && (cancellableContinuationImpl = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) != null && tryPeekLocked(sharedFlowSlot) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        continuationArr = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                    }
                    continuationArr[length] = cancellableContinuationImpl;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return FlowKt.fuseSharedFlow(this, coroutineContext, i, bufferOverflow);
    }

    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        synchronized (this) {
            int head = (int) ((getHead() + this.bufferSize) - this.replayIndex);
            if (head == 0) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(head);
            Object[] objArr = this.buffer;
            objArr.getClass();
            for (int i = 0; i < head; i++) {
                arrayList.add(objArr[((int) (this.replayIndex + i)) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    public final Object[] growBuffer(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.buffer = objArr2;
        if (objArr != null) {
            long head = getHead();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + head;
                FlowKt.access$setBufferAt(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void resetReplayCache() {
        SharedFlowImpl sharedFlowImpl;
        synchronized (this) {
            try {
                sharedFlowImpl = this;
                try {
                    sharedFlowImpl.updateBufferLocked(getHead() + this.bufferSize, this.minCollectorIndex, getHead() + this.bufferSize, getHead() + this.bufferSize + this.queueSize);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                sharedFlowImpl = this;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean tryEmit(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArr = CombineKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(obj)) {
                continuationArr = findSlotsToResumeLocked(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Unit.INSTANCE);
            }
        }
        return z;
    }

    public final boolean tryEmitLocked(Object obj) {
        int i = this.nCollectors;
        int i2 = this.replay;
        if (i != 0) {
            int i3 = this.bufferSize;
            int i4 = this.bufferCapacity;
            if (i3 >= i4 && this.minCollectorIndex <= this.replayIndex) {
                int ordinal = this.onBufferOverflow.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return false;
                    }
                }
            }
            enqueueLocked(obj);
            int i5 = this.bufferSize + 1;
            this.bufferSize = i5;
            if (i5 > i4) {
                dropOldestLocked();
            }
            long head = getHead() + this.bufferSize;
            long j = this.replayIndex;
            if (((int) (head - j)) > i2) {
                updateBufferLocked(1 + j, this.minCollectorIndex, getHead() + this.bufferSize, getHead() + this.bufferSize + this.queueSize);
            }
        } else if (i2 != 0) {
            enqueueLocked(obj);
            int i6 = this.bufferSize + 1;
            this.bufferSize = i6;
            if (i6 > i2) {
                dropOldestLocked();
            }
            this.minCollectorIndex = getHead() + this.bufferSize;
            return true;
        }
        return true;
    }

    public final long tryPeekLocked(SharedFlowSlot sharedFlowSlot) {
        long j = sharedFlowSlot.index;
        if (j >= getHead() + this.bufferSize && (this.bufferCapacity > 0 || j > getHead() || this.queueSize == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object tryTakeValue(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation[] continuationArr = CombineKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long tryPeekLocked = tryPeekLocked(sharedFlowSlot);
                if (tryPeekLocked < 0) {
                    obj = FlowKt.NO_VALUE;
                } else {
                    long j = sharedFlowSlot.index;
                    Object[] objArr = this.buffer;
                    objArr.getClass();
                    Object obj2 = objArr[((int) tryPeekLocked) & (objArr.length - 1)];
                    if (obj2 instanceof Emitter) {
                        obj2 = ((Emitter) obj2).value;
                    }
                    sharedFlowSlot.index = tryPeekLocked + 1;
                    Object obj3 = obj2;
                    continuationArr = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Unit.INSTANCE);
            }
        }
        return obj;
    }

    public final void updateBufferLocked(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long head = getHead(); head < min; head++) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            FlowKt.access$setBufferAt(objArr, head, null);
        }
        this.replayIndex = j;
        this.minCollectorIndex = j2;
        this.bufferSize = (int) (j3 - min);
        this.queueSize = (int) (j4 - j3);
    }

    public final Continuation[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j) {
        long j2;
        long j3;
        int i;
        long j4;
        Continuation[] continuationArr;
        Continuation[] continuationArr2;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        Symbol symbol = FlowKt.NO_VALUE;
        Continuation[] continuationArr3 = CombineKt.EMPTY_RESUMES;
        if (j <= this.minCollectorIndex) {
            long head = getHead();
            long j5 = this.bufferSize + head;
            int i2 = this.bufferCapacity;
            if (i2 == 0 && this.queueSize > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.nCollectors != 0 && (abstractSharedFlowSlotArr = this.slots) != null) {
                for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                    if (abstractSharedFlowSlot != null) {
                        long j6 = ((SharedFlowSlot) abstractSharedFlowSlot).index;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.minCollectorIndex) {
                long head2 = getHead() + this.bufferSize;
                int i4 = this.nCollectors;
                int i5 = this.queueSize;
                if (i4 > 0) {
                    j2 = 1;
                    i5 = Math.min(i5, i2 - ((int) (head2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = this.queueSize + head2;
                if (i5 > 0) {
                    Continuation[] continuationArr4 = new Continuation[i5];
                    Object[] objArr = this.buffer;
                    objArr.getClass();
                    j3 = j5;
                    long j8 = head2;
                    while (true) {
                        if (head2 >= j7) {
                            continuationArr2 = continuationArr4;
                            i = i2;
                            j4 = j7;
                            break;
                        }
                        continuationArr2 = continuationArr4;
                        Object obj = objArr[((int) head2) & (objArr.length - 1)];
                        if (obj != symbol) {
                            obj.getClass();
                            Emitter emitter = (Emitter) obj;
                            i = i2;
                            int i6 = i3 + 1;
                            j4 = j7;
                            continuationArr2[i3] = emitter.cont;
                            FlowKt.access$setBufferAt(objArr, head2, symbol);
                            FlowKt.access$setBufferAt(objArr, j8, emitter.value);
                            j8 += j2;
                            if (i6 >= i5) {
                                break;
                            }
                            i3 = i6;
                        } else {
                            i = i2;
                            j4 = j7;
                        }
                        head2 += j2;
                        continuationArr4 = continuationArr2;
                        i2 = i;
                        j7 = j4;
                    }
                    head2 = j8;
                    continuationArr = continuationArr2;
                } else {
                    j3 = j5;
                    i = i2;
                    j4 = j7;
                    continuationArr = continuationArr3;
                }
                long max = Math.max(this.replayIndex, Math.max(head, head2 - this.replay));
                if (i == 0 && max < j4) {
                    Object[] objArr2 = this.buffer;
                    objArr2.getClass();
                    if (Intrinsics.areEqual(objArr2[((int) max) & (objArr2.length - 1)], symbol)) {
                        head2 += j2;
                        max += j2;
                    }
                }
                long j9 = head2;
                updateBufferLocked(max, this.nCollectors == 0 ? j9 : j3, j9, j4);
                cleanupTailLocked();
                return continuationArr.length == 0 ? continuationArr : findSlotsToResumeLocked(continuationArr);
            }
        }
        return continuationArr3;
    }
}
