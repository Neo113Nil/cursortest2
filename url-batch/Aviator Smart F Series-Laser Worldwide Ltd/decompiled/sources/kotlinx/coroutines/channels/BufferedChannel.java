package kotlinx.coroutines.channels;

import com.google.common.primitives.Longs;
import f6.p;
import f6.q;
import f6.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.x;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import y5.w;

/* loaded from: classes5.dex */
public class BufferedChannel implements kotlinx.coroutines.channels.b {
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private final int capacity;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    public final f6.l onUndeliveredElement;
    private final q onUndeliveredElementReceiveCancellationConstructor;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;
    private static final AtomicLongFieldUpdater sendersAndCloseStatus$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus");
    private static final AtomicLongFieldUpdater receivers$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers");
    private static final AtomicLongFieldUpdater bufferEnd$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd");
    private static final AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag");
    private static final AtomicReferenceFieldUpdater sendSegment$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment");
    private static final AtomicReferenceFieldUpdater receiveSegment$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment");
    private static final AtomicReferenceFieldUpdater bufferEndSegment$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment");
    private static final AtomicReferenceFieldUpdater _closeCause$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause");
    private static final AtomicReferenceFieldUpdater closeHandler$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler");

    private final class a implements ChannelIterator, l2 {
        private o continuation;
        private Object receiveResult;

        public a() {
            g0 g0Var;
            g0Var = BufferedChannelKt.NO_RECEIVE_RESULT;
            this.receiveResult = g0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object hasNextOnNoWaiterSuspend(f fVar, int i8, long j8, kotlin.coroutines.c cVar) {
            kotlin.coroutines.c intercepted;
            g0 g0Var;
            g0 g0Var2;
            Boolean boxBoolean;
            g0 g0Var3;
            g0 g0Var4;
            g0 g0Var5;
            Object coroutine_suspended;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
            o orCreateCancellableContinuation = kotlinx.coroutines.q.getOrCreateCancellableContinuation(intercepted);
            try {
                this.continuation = orCreateCancellableContinuation;
                Object updateCellReceive = bufferedChannel.updateCellReceive(fVar, i8, j8, this);
                g0Var = BufferedChannelKt.SUSPEND;
                if (updateCellReceive == g0Var) {
                    bufferedChannel.prepareReceiverForSuspension(this, fVar, i8);
                } else {
                    g0Var2 = BufferedChannelKt.FAILED;
                    f6.l lVar = null;
                    if (updateCellReceive == g0Var2) {
                        if (j8 < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            fVar.cleanPrev();
                        }
                        f fVar2 = (f) BufferedChannel.receiveSegment$FU.get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.isClosedForReceive()) {
                                onClosedHasNextNoWaiterSuspend();
                                break;
                            }
                            long andIncrement = BufferedChannel.receivers$FU.getAndIncrement(bufferedChannel);
                            int i9 = BufferedChannelKt.SEGMENT_SIZE;
                            long j9 = andIncrement / i9;
                            int i10 = (int) (andIncrement % i9);
                            if (fVar2.id != j9) {
                                f findSegmentReceive = bufferedChannel.findSegmentReceive(j9, fVar2);
                                if (findSegmentReceive != null) {
                                    fVar2 = findSegmentReceive;
                                }
                            }
                            Object updateCellReceive2 = bufferedChannel.updateCellReceive(fVar2, i10, andIncrement, this);
                            g0Var3 = BufferedChannelKt.SUSPEND;
                            if (updateCellReceive2 == g0Var3) {
                                bufferedChannel.prepareReceiverForSuspension(this, fVar2, i10);
                                break;
                            }
                            g0Var4 = BufferedChannelKt.FAILED;
                            if (updateCellReceive2 != g0Var4) {
                                g0Var5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                                if (updateCellReceive2 == g0Var5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                fVar2.cleanPrev();
                                this.receiveResult = updateCellReceive2;
                                this.continuation = null;
                                boxBoolean = kotlin.coroutines.jvm.internal.a.boxBoolean(true);
                                f6.l lVar2 = bufferedChannel.onUndeliveredElement;
                                if (lVar2 != null) {
                                    lVar = OnUndeliveredElementKt.bindCancellationFun(lVar2, updateCellReceive2, orCreateCancellableContinuation.getContext());
                                }
                            } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                fVar2.cleanPrev();
                            }
                        }
                    } else {
                        fVar.cleanPrev();
                        this.receiveResult = updateCellReceive;
                        this.continuation = null;
                        boxBoolean = kotlin.coroutines.jvm.internal.a.boxBoolean(true);
                        f6.l lVar3 = bufferedChannel.onUndeliveredElement;
                        if (lVar3 != null) {
                            lVar = OnUndeliveredElementKt.bindCancellationFun(lVar3, updateCellReceive, orCreateCancellableContinuation.getContext());
                        }
                    }
                    orCreateCancellableContinuation.resume(boxBoolean, lVar);
                }
                Object result = orCreateCancellableContinuation.getResult();
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (result == coroutine_suspended) {
                    kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
                }
                return result;
            } catch (Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }

        private final boolean onClosedHasNext() {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw f0.recoverStackTrace(closeCause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            o oVar = this.continuation;
            s.checkNotNull(oVar);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.a aVar = Result.Companion;
                oVar.resumeWith(Result.m348constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                oVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(closeCause)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(kotlin.coroutines.c cVar) {
            f fVar;
            g0 g0Var;
            g0 g0Var2;
            g0 g0Var3;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            f fVar2 = (f) BufferedChannel.receiveSegment$FU.get(bufferedChannel);
            while (!bufferedChannel.isClosedForReceive()) {
                long andIncrement = BufferedChannel.receivers$FU.getAndIncrement(bufferedChannel);
                int i8 = BufferedChannelKt.SEGMENT_SIZE;
                long j8 = andIncrement / i8;
                int i9 = (int) (andIncrement % i8);
                if (fVar2.id != j8) {
                    f findSegmentReceive = bufferedChannel.findSegmentReceive(j8, fVar2);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        fVar = findSegmentReceive;
                    }
                } else {
                    fVar = fVar2;
                }
                Object updateCellReceive = bufferedChannel.updateCellReceive(fVar, i9, andIncrement, null);
                g0Var = BufferedChannelKt.SUSPEND;
                if (updateCellReceive == g0Var) {
                    throw new IllegalStateException("unreachable".toString());
                }
                g0Var2 = BufferedChannelKt.FAILED;
                if (updateCellReceive != g0Var2) {
                    g0Var3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (updateCellReceive == g0Var3) {
                        return hasNextOnNoWaiterSuspend(fVar, i9, andIncrement, cVar);
                    }
                    fVar.cleanPrev();
                    this.receiveResult = updateCellReceive;
                    return kotlin.coroutines.jvm.internal.a.boxBoolean(true);
                }
                if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    fVar.cleanPrev();
                }
                fVar2 = fVar;
            }
            return kotlin.coroutines.jvm.internal.a.boxBoolean(onClosedHasNext());
        }

        @Override // kotlinx.coroutines.l2
        public void invokeOnCancellation(d0 d0Var, int i8) {
            o oVar = this.continuation;
            if (oVar != null) {
                oVar.invokeOnCancellation(d0Var, i8);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public /* synthetic */ Object next(kotlin.coroutines.c cVar) {
            return ChannelIterator.DefaultImpls.next(this, cVar);
        }

        public final boolean tryResumeHasNext(Object obj) {
            boolean tryResume0;
            o oVar = this.continuation;
            s.checkNotNull(oVar);
            this.continuation = null;
            this.receiveResult = obj;
            Boolean bool = Boolean.TRUE;
            f6.l lVar = BufferedChannel.this.onUndeliveredElement;
            tryResume0 = BufferedChannelKt.tryResume0(oVar, bool, lVar != null ? OnUndeliveredElementKt.bindCancellationFun(lVar, obj, oVar.getContext()) : null);
            return tryResume0;
        }

        public final void tryResumeHasNextOnClosedChannel() {
            o oVar = this.continuation;
            s.checkNotNull(oVar);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.a aVar = Result.Companion;
                oVar.resumeWith(Result.m348constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                oVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(closeCause)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object next() {
            g0 g0Var;
            g0 g0Var2;
            Object obj = this.receiveResult;
            g0Var = BufferedChannelKt.NO_RECEIVE_RESULT;
            if (obj == g0Var) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            g0Var2 = BufferedChannelKt.NO_RECEIVE_RESULT;
            this.receiveResult = g0Var2;
            if (obj != BufferedChannelKt.getCHANNEL_CLOSED()) {
                return obj;
            }
            throw f0.recoverStackTrace(BufferedChannel.this.getReceiveException());
        }
    }

    private static final class b implements l2 {
        private final /* synthetic */ o $$delegate_0;
        private final n cont;

        public b(n nVar) {
            this.cont = nVar;
            s.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.$$delegate_0 = (o) nVar;
        }

        public final n getCont() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.l2
        public void invokeOnCancellation(d0 d0Var, int i8) {
            this.$$delegate_0.invokeOnCancellation(d0Var, i8);
        }
    }

    public BufferedChannel(int i8, f6.l lVar) {
        long initialBufferEnd;
        g0 g0Var;
        this.capacity = i8;
        this.onUndeliveredElement = lVar;
        if (i8 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i8 + ", should be >=0").toString());
        }
        initialBufferEnd = BufferedChannelKt.initialBufferEnd(i8);
        this.bufferEnd = initialBufferEnd;
        this.completedExpandBuffersAndPauseFlag = getBufferEndCounter();
        f fVar = new f(0L, null, this, 3);
        this.sendSegment = fVar;
        this.receiveSegment = fVar;
        if (isRendezvousOrUnlimited()) {
            fVar = BufferedChannelKt.NULL_SEGMENT;
            s.checkNotNull(fVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = fVar;
        this.onUndeliveredElementReceiveCancellationConstructor = lVar != null ? new q() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
            {
                super(3);
            }

            @Override // f6.q
            public final f6.l invoke(final kotlinx.coroutines.selects.j jVar, Object obj, final Object obj2) {
                final BufferedChannel bufferedChannel = BufferedChannel.this;
                return new f6.l() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // f6.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        invoke((Throwable) obj3);
                        return w.INSTANCE;
                    }

                    public final void invoke(Throwable th) {
                        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                            OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj2, jVar.getContext());
                        }
                    }
                };
            }
        } : null;
        g0Var = BufferedChannelKt.NO_CLOSE_CAUSE;
        this._closeCause = g0Var;
    }

    private final boolean bufferOrRendezvousSend(long j8) {
        return j8 < getBufferEndCounter() || j8 < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    private final void cancelSuspendedReceiveRequests(f fVar, long j8) {
        g0 g0Var;
        Object m1284constructorimpl$default = kotlinx.coroutines.internal.o.m1284constructorimpl$default(null, 1, null);
        loop0: while (fVar != null) {
            for (int i8 = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i8; i8--) {
                if ((fVar.id * BufferedChannelKt.SEGMENT_SIZE) + i8 < j8) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
                    if (state$kotlinx_coroutines_core != null) {
                        g0Var = BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core != g0Var) {
                            if (!(state$kotlinx_coroutines_core instanceof m)) {
                                if (!(state$kotlinx_coroutines_core instanceof l2)) {
                                    break;
                                }
                                if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m1284constructorimpl$default = kotlinx.coroutines.internal.o.m1289plusFjFbRPM(m1284constructorimpl$default, state$kotlinx_coroutines_core);
                                    fVar.onCancelledRequest(i8, true);
                                    break;
                                }
                            } else {
                                if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m1284constructorimpl$default = kotlinx.coroutines.internal.o.m1289plusFjFbRPM(m1284constructorimpl$default, ((m) state$kotlinx_coroutines_core).waiter);
                                    fVar.onCancelledRequest(i8, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        fVar.onSlotCleaned();
                        break;
                    }
                }
            }
            fVar = (f) fVar.getPrev();
        }
        if (m1284constructorimpl$default != null) {
            if (!(m1284constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((l2) m1284constructorimpl$default);
                return;
            }
            s.checkNotNull(m1284constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) m1284constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((l2) arrayList.get(size));
            }
        }
    }

    private final f closeLinkedList() {
        Object obj = bufferEndSegment$FU.get(this);
        f fVar = (f) sendSegment$FU.get(this);
        if (fVar.id > ((f) obj).id) {
            obj = fVar;
        }
        f fVar2 = (f) receiveSegment$FU.get(this);
        if (fVar2.id > ((f) obj).id) {
            obj = fVar2;
        }
        return (f) kotlinx.coroutines.internal.e.close((kotlinx.coroutines.internal.f) obj);
    }

    private final void completeCancel(long j8) {
        removeUnprocessedElements(completeClose(j8));
    }

    private final f completeClose(long j8) {
        f closeLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long markAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(closeLinkedList);
            if (markAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(markAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(closeLinkedList, j8);
        return closeLinkedList;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        f fVar = (f) bufferEndSegment$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$FU.getAndIncrement(this);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j8 = andIncrement / i8;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (fVar.id < j8 && fVar.getNext() != null) {
                    moveSegmentBufferEndToSpecifiedOrLast(j8, fVar);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (fVar.id != j8) {
                f findSegmentBufferEnd = findSegmentBufferEnd(j8, fVar, andIncrement);
                if (findSegmentBufferEnd == null) {
                    continue;
                } else {
                    fVar = findSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(fVar, (int) (andIncrement % i8), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final f findSegmentBufferEnd(long j8, f fVar, long j9) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$FU;
        p pVar = (p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.e.findSegmentInternal(fVar, j8, pVar);
            if (!e0.m1279isClosedimpl(findSegmentInternal)) {
                d0 m1277getSegmentimpl = e0.m1277getSegmentimpl(findSegmentInternal);
                while (true) {
                    d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                    if (d0Var.id >= m1277getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1277getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, d0Var, m1277getSegmentimpl)) {
                        if (d0Var.decPointers$kotlinx_coroutines_core()) {
                            d0Var.remove();
                        }
                    } else if (m1277getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1277getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (e0.m1279isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(j8, fVar);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        f fVar2 = (f) e0.m1277getSegmentimpl(findSegmentInternal);
        long j10 = fVar2.id;
        if (j10 <= j8) {
            return fVar2;
        }
        int i8 = BufferedChannelKt.SEGMENT_SIZE;
        if (bufferEnd$FU.compareAndSet(this, j9 + 1, i8 * j10)) {
            incCompletedExpandBufferAttempts((fVar2.id * i8) - j9);
            return null;
        }
        incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f findSegmentReceive(long j8, f fVar) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$FU;
        p pVar = (p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.e.findSegmentInternal(fVar, j8, pVar);
            if (!e0.m1279isClosedimpl(findSegmentInternal)) {
                d0 m1277getSegmentimpl = e0.m1277getSegmentimpl(findSegmentInternal);
                while (true) {
                    d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                    if (d0Var.id >= m1277getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1277getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, d0Var, m1277getSegmentimpl)) {
                        if (d0Var.decPointers$kotlinx_coroutines_core()) {
                            d0Var.remove();
                        }
                    } else if (m1277getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1277getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (e0.m1279isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (fVar.id * BufferedChannelKt.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            fVar.cleanPrev();
            return null;
        }
        f fVar2 = (f) e0.m1277getSegmentimpl(findSegmentInternal);
        if (!isRendezvousOrUnlimited() && j8 <= getBufferEndCounter() / BufferedChannelKt.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$FU;
            while (true) {
                d0 d0Var2 = (d0) atomicReferenceFieldUpdater2.get(this);
                if (d0Var2.id >= fVar2.id || !fVar2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, d0Var2, fVar2)) {
                    if (d0Var2.decPointers$kotlinx_coroutines_core()) {
                        d0Var2.remove();
                    }
                } else if (fVar2.decPointers$kotlinx_coroutines_core()) {
                    fVar2.remove();
                }
            }
        }
        long j9 = fVar2.id;
        if (j9 <= j8) {
            return fVar2;
        }
        int i8 = BufferedChannelKt.SEGMENT_SIZE;
        updateReceiversCounterIfLower(j9 * i8);
        if (fVar2.id * i8 >= getSendersCounter$kotlinx_coroutines_core()) {
            return null;
        }
        fVar2.cleanPrev();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f findSegmentSend(long j8, f fVar) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$FU;
        p pVar = (p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.e.findSegmentInternal(fVar, j8, pVar);
            if (!e0.m1279isClosedimpl(findSegmentInternal)) {
                d0 m1277getSegmentimpl = e0.m1277getSegmentimpl(findSegmentInternal);
                while (true) {
                    d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                    if (d0Var.id >= m1277getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1277getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, d0Var, m1277getSegmentimpl)) {
                        if (d0Var.decPointers$kotlinx_coroutines_core()) {
                            d0Var.remove();
                        }
                    } else if (m1277getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1277getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (e0.m1279isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (fVar.id * BufferedChannelKt.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            fVar.cleanPrev();
            return null;
        }
        f fVar2 = (f) e0.m1277getSegmentimpl(findSegmentInternal);
        long j9 = fVar2.id;
        if (j9 <= j8) {
            return fVar2;
        }
        int i8 = BufferedChannelKt.SEGMENT_SIZE;
        updateSendersCounterIfLower(j9 * i8);
        if (fVar2.id * i8 >= getReceiversCounter$kotlinx_coroutines_core()) {
            return null;
        }
        fVar2.cleanPrev();
        return null;
    }

    private final Object getAndUpdate$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
        return obj2;
    }

    private final long getBufferEndCounter() {
        return bufferEnd$FU.get(this);
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException(g.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    private final void incCompletedExpandBufferAttempts(long j8) {
        if ((completedExpandBuffersAndPauseFlag$FU.addAndGet(this, j8) & Longs.MAX_POWER_OF_TWO) != 0) {
            while ((completedExpandBuffersAndPauseFlag$FU.get(this) & Longs.MAX_POWER_OF_TWO) != 0) {
            }
        }
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i8 & 1) != 0) {
            j8 = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j8);
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        if (obj == null) {
            return;
        }
        ((f6.l) obj).invoke(getCloseCause());
    }

    private final boolean isCellNonEmpty(f fVar, int i8, long j8) {
        Object state$kotlinx_coroutines_core;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        g0 g0Var6;
        g0 g0Var7;
        do {
            state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
            if (state$kotlinx_coroutines_core != null) {
                g0Var2 = BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != g0Var2) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                        return true;
                    }
                    g0Var3 = BufferedChannelKt.INTERRUPTED_SEND;
                    if (state$kotlinx_coroutines_core == g0Var3 || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return false;
                    }
                    g0Var4 = BufferedChannelKt.DONE_RCV;
                    if (state$kotlinx_coroutines_core == g0Var4) {
                        return false;
                    }
                    g0Var5 = BufferedChannelKt.POISONED;
                    if (state$kotlinx_coroutines_core == g0Var5) {
                        return false;
                    }
                    g0Var6 = BufferedChannelKt.RESUMING_BY_EB;
                    if (state$kotlinx_coroutines_core == g0Var6) {
                        return true;
                    }
                    g0Var7 = BufferedChannelKt.RESUMING_BY_RCV;
                    return state$kotlinx_coroutines_core != g0Var7 && j8 == getReceiversCounter$kotlinx_coroutines_core();
                }
            }
            g0Var = BufferedChannelKt.POISONED;
        } while (!fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, g0Var));
        expandBuffer();
        return false;
    }

    private final boolean isClosed(long j8, boolean z7) {
        int i8 = (int) (j8 >> 60);
        if (i8 == 0 || i8 == 1) {
            return false;
        }
        if (i8 == 2) {
            completeClose(j8 & 1152921504606846975L);
            if (z7 && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        } else {
            if (i8 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i8).toString());
            }
            completeCancel(j8 & 1152921504606846975L);
        }
        return true;
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    private final boolean isClosedForReceive0(long j8) {
        return isClosed(j8, true);
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j8) {
        return isClosed(j8, false);
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    private final void loop$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        r9 = (kotlinx.coroutines.channels.f) r9.getPrev();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long markAllEmptyCellsAsClosed(f fVar) {
        g0 g0Var;
        do {
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i8--;
                if (-1 >= i8) {
                    break;
                }
                long j8 = (fVar.id * BufferedChannelKt.SEGMENT_SIZE) + i8;
                if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                    return -1L;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
                    if (state$kotlinx_coroutines_core != null) {
                        g0Var = BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core != g0Var) {
                            if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                                return j8;
                            }
                        }
                    }
                    if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        fVar.onSlotCleaned();
                        break;
                    }
                }
            }
        } while (fVar != null);
        return -1L;
    }

    private final void markCancellationStarted() {
        long j8;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (((int) (j8 >> 60)) != 0) {
                return;
            } else {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j8, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, constructSendersAndCloseStatus));
    }

    private final void markCancelled() {
        long j8;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j8, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, constructSendersAndCloseStatus));
    }

    private final void markClosed() {
        long j8;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j8 >> 60);
            if (i8 == 0) {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j8 & 1152921504606846975L, 2);
            } else if (i8 != 1) {
                return;
            } else {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j8 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, constructSendersAndCloseStatus));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long j8, f fVar) {
        f fVar2;
        f fVar3;
        while (fVar.id < j8 && (fVar3 = (f) fVar.getNext()) != null) {
            fVar = fVar3;
        }
        while (true) {
            if (!fVar.isRemoved() || (fVar2 = (f) fVar.getNext()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$FU;
                while (true) {
                    d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                    if (d0Var.id >= fVar.id) {
                        return;
                    }
                    if (!fVar.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, d0Var, fVar)) {
                        if (d0Var.decPointers$kotlinx_coroutines_core()) {
                            d0Var.remove();
                            return;
                        }
                        return;
                    } else if (fVar.decPointers$kotlinx_coroutines_core()) {
                        fVar.remove();
                    }
                }
            } else {
                fVar = fVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(n nVar) {
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m348constructorimpl(e.m1240boximpl(e.Companion.m1253closedJP2dKIU(getCloseCause()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(n nVar) {
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(getReceiveException())));
    }

    private final void onClosedSelectOnReceive(kotlinx.coroutines.selects.j jVar) {
        jVar.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final void onClosedSelectOnSend(Object obj, kotlinx.coroutines.selects.j jVar) {
        f6.l lVar = this.onUndeliveredElement;
        if (lVar != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lVar, obj, jVar.getContext());
        }
        jVar.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onClosedSend(Object obj, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        f6.l lVar = this.onUndeliveredElement;
        if (lVar == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, obj, null, 2, null)) == null) {
            Throwable sendException = getSendException();
            Result.a aVar = Result.Companion;
            oVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(sendException)));
        } else {
            y5.b.addSuppressed(callUndeliveredElementCatchingException$default, getSendException());
            Result.a aVar2 = Result.Companion;
            oVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(callUndeliveredElementCatchingException$default)));
        }
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return result == coroutine_suspended2 ? result : w.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(Object obj, n nVar) {
        f6.l lVar = this.onUndeliveredElement;
        if (lVar != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lVar, obj, nVar.getContext());
        }
        Throwable sendException = getSendException();
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(sendException)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(l2 l2Var, f fVar, int i8) {
        onReceiveEnqueued();
        l2Var.invokeOnCancellation(fVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(l2 l2Var, f fVar, int i8) {
        l2Var.invokeOnCancellation(fVar, i8 + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object obj, Object obj2) {
        return e.m1240boximpl(obj2 == BufferedChannelKt.getCHANNEL_CLOSED() ? e.Companion.m1253closedJP2dKIU(getCloseCause()) : e.Companion.m1255successJP2dKIU(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveOrNull(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        if (getCloseCause() == null) {
            return null;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectSend(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel bufferedChannel, kotlin.coroutines.c cVar) {
        f fVar;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        f fVar2 = (f) receiveSegment$FU.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j8 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (fVar2.id != j8) {
                f findSegmentReceive = bufferedChannel.findSegmentReceive(j8, fVar2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    fVar = findSegmentReceive;
                }
            } else {
                fVar = fVar2;
            }
            Object updateCellReceive = bufferedChannel.updateCellReceive(fVar, i9, andIncrement, null);
            g0Var = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == g0Var) {
                throw new IllegalStateException("unexpected".toString());
            }
            g0Var2 = BufferedChannelKt.FAILED;
            if (updateCellReceive != g0Var2) {
                g0Var3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == g0Var3) {
                    return bufferedChannel.receiveOnNoWaiterSuspend(fVar, i9, andIncrement, cVar);
                }
                fVar.cleanPrev();
                return updateCellReceive;
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                fVar.cleanPrev();
            }
            fVar2 = fVar;
        }
        throw f0.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <E> Object m1230receiveCatchingJP2dKIU$suspendImpl(BufferedChannel bufferedChannel, kotlin.coroutines.c cVar) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        Object coroutine_suspended;
        int i8;
        f fVar;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        if (cVar instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) cVar;
            int i9 = bufferedChannel$receiveCatching$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i9 - Integer.MIN_VALUE;
                BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
                Object obj = bufferedChannel$receiveCatching$12.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = bufferedChannel$receiveCatching$12.label;
                if (i8 == 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                    return ((e) obj).m1252unboximpl();
                }
                y5.g.throwOnFailure(obj);
                f fVar2 = (f) receiveSegment$FU.get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
                    int i10 = BufferedChannelKt.SEGMENT_SIZE;
                    long j8 = andIncrement / i10;
                    int i11 = (int) (andIncrement % i10);
                    if (fVar2.id != j8) {
                        f findSegmentReceive = bufferedChannel.findSegmentReceive(j8, fVar2);
                        if (findSegmentReceive == null) {
                            continue;
                        } else {
                            fVar = findSegmentReceive;
                        }
                    } else {
                        fVar = fVar2;
                    }
                    Object updateCellReceive = bufferedChannel.updateCellReceive(fVar, i11, andIncrement, null);
                    g0Var = BufferedChannelKt.SUSPEND;
                    if (updateCellReceive == g0Var) {
                        throw new IllegalStateException("unexpected".toString());
                    }
                    g0Var2 = BufferedChannelKt.FAILED;
                    if (updateCellReceive != g0Var2) {
                        g0Var3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                        if (updateCellReceive != g0Var3) {
                            fVar.cleanPrev();
                            return e.Companion.m1255successJP2dKIU(updateCellReceive);
                        }
                        bufferedChannel$receiveCatching$12.label = 1;
                        Object m1231receiveCatchingOnNoWaiterSuspendGKJJFZk = bufferedChannel.m1231receiveCatchingOnNoWaiterSuspendGKJJFZk(fVar, i11, andIncrement, bufferedChannel$receiveCatching$12);
                        return m1231receiveCatchingOnNoWaiterSuspendGKJJFZk == coroutine_suspended ? coroutine_suspended : m1231receiveCatchingOnNoWaiterSuspendGKJJFZk;
                    }
                    if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                        fVar.cleanPrev();
                    }
                    fVar2 = fVar;
                }
                return e.Companion.m1253closedJP2dKIU(bufferedChannel.getCloseCause());
            }
        }
        bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, cVar);
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$122 = bufferedChannel$receiveCatching$1;
        Object obj2 = bufferedChannel$receiveCatching$122.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = bufferedChannel$receiveCatching$122.label;
        if (i8 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1231receiveCatchingOnNoWaiterSuspendGKJJFZk(f fVar, int i8, long j8, kotlin.coroutines.c cVar) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        Object coroutine_suspended;
        int i9;
        kotlin.coroutines.c intercepted;
        g0 g0Var;
        g0 g0Var2;
        e m1240boximpl;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        Object coroutine_suspended2;
        if (cVar instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) cVar;
            int i10 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i10 - Integer.MIN_VALUE;
                Object obj = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i9 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
                if (i9 != 0) {
                    y5.g.throwOnFailure(obj);
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = fVar;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i8;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j8;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
                    intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1);
                    o orCreateCancellableContinuation = kotlinx.coroutines.q.getOrCreateCancellableContinuation(intercepted);
                    try {
                        s.checkNotNull(orCreateCancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>");
                        k kVar = new k(orCreateCancellableContinuation);
                        Object updateCellReceive = updateCellReceive(fVar, i8, j8, kVar);
                        g0Var = BufferedChannelKt.SUSPEND;
                        if (updateCellReceive == g0Var) {
                            prepareReceiverForSuspension(kVar, fVar, i8);
                        } else {
                            g0Var2 = BufferedChannelKt.FAILED;
                            f6.l lVar = null;
                            if (updateCellReceive == g0Var2) {
                                if (j8 < getSendersCounter$kotlinx_coroutines_core()) {
                                    fVar.cleanPrev();
                                }
                                f fVar2 = (f) receiveSegment$FU.get(this);
                                while (true) {
                                    if (isClosedForReceive()) {
                                        onClosedReceiveCatchingOnNoWaiterSuspend(orCreateCancellableContinuation);
                                        break;
                                    }
                                    long andIncrement = receivers$FU.getAndIncrement(this);
                                    int i11 = BufferedChannelKt.SEGMENT_SIZE;
                                    long j9 = andIncrement / i11;
                                    int i12 = (int) (andIncrement % i11);
                                    if (fVar2.id != j9) {
                                        f findSegmentReceive = findSegmentReceive(j9, fVar2);
                                        if (findSegmentReceive != null) {
                                            fVar2 = findSegmentReceive;
                                        }
                                    }
                                    Object updateCellReceive2 = updateCellReceive(fVar2, i12, andIncrement, kVar);
                                    g0Var3 = BufferedChannelKt.SUSPEND;
                                    if (updateCellReceive2 == g0Var3) {
                                        prepareReceiverForSuspension(kVar, fVar2, i12);
                                        break;
                                    }
                                    g0Var4 = BufferedChannelKt.FAILED;
                                    if (updateCellReceive2 != g0Var4) {
                                        g0Var5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                                        if (updateCellReceive2 == g0Var5) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        fVar2.cleanPrev();
                                        m1240boximpl = e.m1240boximpl(e.Companion.m1255successJP2dKIU(updateCellReceive2));
                                        f6.l lVar2 = this.onUndeliveredElement;
                                        if (lVar2 != null) {
                                            lVar = OnUndeliveredElementKt.bindCancellationFun(lVar2, updateCellReceive2, orCreateCancellableContinuation.getContext());
                                        }
                                    } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                        fVar2.cleanPrev();
                                    }
                                }
                            } else {
                                fVar.cleanPrev();
                                m1240boximpl = e.m1240boximpl(e.Companion.m1255successJP2dKIU(updateCellReceive));
                                f6.l lVar3 = this.onUndeliveredElement;
                                if (lVar3 != null) {
                                    lVar = OnUndeliveredElementKt.bindCancellationFun(lVar3, updateCellReceive, orCreateCancellableContinuation.getContext());
                                }
                            }
                            orCreateCancellableContinuation.resume(m1240boximpl, lVar);
                        }
                        obj = orCreateCancellableContinuation.getResult();
                        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                        if (obj == coroutine_suspended2) {
                            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                        throw th;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                return ((e) obj).m1252unboximpl();
            }
        }
        bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, cVar);
        Object obj2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i9 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i9 != 0) {
        }
        return ((e) obj2).m1252unboximpl();
    }

    private final <R> R receiveImpl(Object obj, f6.l lVar, q qVar, f6.a aVar, q qVar2) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        f fVar = (f) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j8 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (fVar.id != j8) {
                f findSegmentReceive = findSegmentReceive(j8, fVar);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    fVar = findSegmentReceive;
                }
            }
            Object updateCellReceive = updateCellReceive(fVar, i9, andIncrement, obj);
            g0Var = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == g0Var) {
                l2 l2Var = obj instanceof l2 ? (l2) obj : null;
                if (l2Var != null) {
                    prepareReceiverForSuspension(l2Var, fVar, i9);
                }
                return (R) qVar.invoke(fVar, Integer.valueOf(i9), Long.valueOf(andIncrement));
            }
            g0Var2 = BufferedChannelKt.FAILED;
            if (updateCellReceive != g0Var2) {
                g0Var3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == g0Var3) {
                    return (R) qVar2.invoke(fVar, Integer.valueOf(i9), Long.valueOf(andIncrement));
                }
                fVar.cleanPrev();
                return (R) lVar.invoke(updateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                fVar.cleanPrev();
            }
        }
        return (R) aVar.invoke();
    }

    static /* synthetic */ Object receiveImpl$default(BufferedChannel bufferedChannel, Object obj, f6.l lVar, q qVar, f6.a aVar, q qVar2, int i8, Object obj2) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i8 & 16) != 0) {
            qVar2 = new q() { // from class: kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1
                @Override // f6.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    return invoke((f) obj3, ((Number) obj4).intValue(), ((Number) obj5).longValue());
                }

                public final Void invoke(f fVar, int i9, long j8) {
                    throw new IllegalStateException("unexpected".toString());
                }
            };
        }
        f fVar = (f) receiveSegment$FU.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
            int i9 = BufferedChannelKt.SEGMENT_SIZE;
            long j8 = andIncrement / i9;
            int i10 = (int) (andIncrement % i9);
            if (fVar.id != j8) {
                f findSegmentReceive = bufferedChannel.findSegmentReceive(j8, fVar);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    fVar = findSegmentReceive;
                }
            }
            Object updateCellReceive = bufferedChannel.updateCellReceive(fVar, i10, andIncrement, obj);
            g0Var = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == g0Var) {
                l2 l2Var = obj instanceof l2 ? (l2) obj : null;
                if (l2Var != null) {
                    bufferedChannel.prepareReceiverForSuspension(l2Var, fVar, i10);
                }
                return qVar.invoke(fVar, Integer.valueOf(i10), Long.valueOf(andIncrement));
            }
            g0Var2 = BufferedChannelKt.FAILED;
            if (updateCellReceive != g0Var2) {
                g0Var3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == g0Var3) {
                    return qVar2.invoke(fVar, Integer.valueOf(i10), Long.valueOf(andIncrement));
                }
                fVar.cleanPrev();
                return lVar.invoke(updateCellReceive);
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                fVar.cleanPrev();
            }
        }
        return aVar.invoke();
    }

    private final void receiveImplOnNoWaiter(f fVar, int i8, long j8, l2 l2Var, f6.l lVar, f6.a aVar) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        Object updateCellReceive = updateCellReceive(fVar, i8, j8, l2Var);
        g0Var = BufferedChannelKt.SUSPEND;
        if (updateCellReceive == g0Var) {
            prepareReceiverForSuspension(l2Var, fVar, i8);
            return;
        }
        g0Var2 = BufferedChannelKt.FAILED;
        if (updateCellReceive != g0Var2) {
            fVar.cleanPrev();
            lVar.invoke(updateCellReceive);
            return;
        }
        if (j8 < getSendersCounter$kotlinx_coroutines_core()) {
            fVar.cleanPrev();
        }
        f fVar2 = (f) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            int i9 = BufferedChannelKt.SEGMENT_SIZE;
            long j9 = andIncrement / i9;
            int i10 = (int) (andIncrement % i9);
            if (fVar2.id != j9) {
                f findSegmentReceive = findSegmentReceive(j9, fVar2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    fVar2 = findSegmentReceive;
                }
            }
            Object updateCellReceive2 = updateCellReceive(fVar2, i10, andIncrement, l2Var);
            g0Var3 = BufferedChannelKt.SUSPEND;
            if (updateCellReceive2 == g0Var3) {
                if (!(l2Var instanceof l2)) {
                    l2Var = null;
                }
                if (l2Var != null) {
                    prepareReceiverForSuspension(l2Var, fVar2, i10);
                }
                w wVar = w.INSTANCE;
                return;
            }
            g0Var4 = BufferedChannelKt.FAILED;
            if (updateCellReceive2 != g0Var4) {
                g0Var5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive2 == g0Var5) {
                    throw new IllegalStateException("unexpected".toString());
                }
                fVar2.cleanPrev();
                lVar.invoke(updateCellReceive2);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                fVar2.cleanPrev();
            }
        }
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOnNoWaiterSuspend(f fVar, int i8, long j8, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o orCreateCancellableContinuation = kotlinx.coroutines.q.getOrCreateCancellableContinuation(intercepted);
        try {
            Object updateCellReceive = updateCellReceive(fVar, i8, j8, orCreateCancellableContinuation);
            g0Var = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == g0Var) {
                prepareReceiverForSuspension(orCreateCancellableContinuation, fVar, i8);
            } else {
                g0Var2 = BufferedChannelKt.FAILED;
                f6.l lVar = null;
                lVar = null;
                if (updateCellReceive == g0Var2) {
                    if (j8 < getSendersCounter$kotlinx_coroutines_core()) {
                        fVar.cleanPrev();
                    }
                    f fVar2 = (f) receiveSegment$FU.get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = receivers$FU.getAndIncrement(this);
                        int i9 = BufferedChannelKt.SEGMENT_SIZE;
                        long j9 = andIncrement / i9;
                        int i10 = (int) (andIncrement % i9);
                        if (fVar2.id != j9) {
                            f findSegmentReceive = findSegmentReceive(j9, fVar2);
                            if (findSegmentReceive != null) {
                                fVar2 = findSegmentReceive;
                            }
                        }
                        updateCellReceive = updateCellReceive(fVar2, i10, andIncrement, orCreateCancellableContinuation);
                        g0Var3 = BufferedChannelKt.SUSPEND;
                        if (updateCellReceive == g0Var3) {
                            o oVar = orCreateCancellableContinuation instanceof l2 ? orCreateCancellableContinuation : null;
                            if (oVar != null) {
                                prepareReceiverForSuspension(oVar, fVar2, i10);
                            }
                        } else {
                            g0Var4 = BufferedChannelKt.FAILED;
                            if (updateCellReceive != g0Var4) {
                                g0Var5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                                if (updateCellReceive == g0Var5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                fVar2.cleanPrev();
                                f6.l lVar2 = this.onUndeliveredElement;
                                if (lVar2 != null) {
                                    lVar = OnUndeliveredElementKt.bindCancellationFun(lVar2, updateCellReceive, orCreateCancellableContinuation.getContext());
                                }
                            } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                fVar2.cleanPrev();
                            }
                        }
                    }
                } else {
                    fVar.cleanPrev();
                    f6.l lVar3 = this.onUndeliveredElement;
                    if (lVar3 != null) {
                        lVar = OnUndeliveredElementKt.bindCancellationFun(lVar3, updateCellReceive, orCreateCancellableContinuation.getContext());
                    }
                }
                orCreateCancellableContinuation.resume(updateCellReceive, lVar);
            }
            Object result = orCreateCancellableContinuation.getResult();
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (result == coroutine_suspended) {
                kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(kotlinx.coroutines.selects.j jVar, Object obj) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        f fVar = (f) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j8 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (fVar.id != j8) {
                f findSegmentReceive = findSegmentReceive(j8, fVar);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    fVar = findSegmentReceive;
                }
            }
            Object updateCellReceive = updateCellReceive(fVar, i9, andIncrement, jVar);
            g0Var = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == g0Var) {
                l2 l2Var = jVar instanceof l2 ? (l2) jVar : null;
                if (l2Var != null) {
                    prepareReceiverForSuspension(l2Var, fVar, i9);
                    return;
                }
                return;
            }
            g0Var2 = BufferedChannelKt.FAILED;
            if (updateCellReceive != g0Var2) {
                g0Var3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == g0Var3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                fVar.cleanPrev();
                jVar.selectInRegistrationPhase(updateCellReceive);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                fVar.cleanPrev();
            }
        }
        onClosedSelectOnReceive(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:
    
        r13 = (kotlinx.coroutines.channels.f) r13.getPrev();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void removeUnprocessedElements(f fVar) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        f6.l lVar = this.onUndeliveredElement;
        UndeliveredElementException undeliveredElementException = null;
        Object m1284constructorimpl$default = kotlinx.coroutines.internal.o.m1284constructorimpl$default(null, 1, null);
        loop0: do {
            int i8 = BufferedChannelKt.SEGMENT_SIZE - 1;
            while (true) {
                if (-1 >= i8) {
                    break;
                }
                long j8 = (fVar.id * BufferedChannelKt.SEGMENT_SIZE) + i8;
                while (true) {
                    Object state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
                    g0Var = BufferedChannelKt.DONE_RCV;
                    if (state$kotlinx_coroutines_core == g0Var) {
                        break loop0;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                        g0Var2 = BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core == g0Var2 || state$kotlinx_coroutines_core == null) {
                            if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                fVar.onSlotCleaned();
                                break;
                            }
                        } else if (!(state$kotlinx_coroutines_core instanceof l2) && !(state$kotlinx_coroutines_core instanceof m)) {
                            g0Var3 = BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core == g0Var3) {
                                break loop0;
                            }
                            g0Var4 = BufferedChannelKt.RESUMING_BY_RCV;
                            if (state$kotlinx_coroutines_core == g0Var4) {
                                break loop0;
                            }
                            g0Var5 = BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core != g0Var5) {
                                break;
                            }
                        } else {
                            if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            l2 l2Var = state$kotlinx_coroutines_core instanceof m ? ((m) state$kotlinx_coroutines_core).waiter : (l2) state$kotlinx_coroutines_core;
                            if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                if (lVar != null) {
                                    undeliveredElementException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(lVar, fVar.getElement$kotlinx_coroutines_core(i8), undeliveredElementException);
                                }
                                m1284constructorimpl$default = kotlinx.coroutines.internal.o.m1289plusFjFbRPM(m1284constructorimpl$default, l2Var);
                                fVar.cleanElement$kotlinx_coroutines_core(i8);
                                fVar.onSlotCleaned();
                            }
                        }
                    } else {
                        if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            if (lVar != null) {
                                undeliveredElementException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(lVar, fVar.getElement$kotlinx_coroutines_core(i8), undeliveredElementException);
                            }
                            fVar.cleanElement$kotlinx_coroutines_core(i8);
                            fVar.onSlotCleaned();
                        }
                    }
                }
                i8--;
            }
        } while (fVar != null);
        if (m1284constructorimpl$default != null) {
            if (m1284constructorimpl$default instanceof ArrayList) {
                s.checkNotNull(m1284constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) m1284constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeSenderOnCancelledChannel((l2) arrayList.get(size));
                }
            } else {
                resumeSenderOnCancelledChannel((l2) m1284constructorimpl$default);
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    private final void resumeReceiverOnClosedChannel(l2 l2Var) {
        resumeWaiterOnClosedChannel(l2Var, true);
    }

    private final void resumeSenderOnCancelledChannel(l2 l2Var) {
        resumeWaiterOnClosedChannel(l2Var, false);
    }

    private final void resumeWaiterOnClosedChannel(l2 l2Var, boolean z7) {
        if (l2Var instanceof b) {
            n cont = ((b) l2Var).getCont();
            Result.a aVar = Result.Companion;
            cont.resumeWith(Result.m348constructorimpl(Boolean.FALSE));
            return;
        }
        if (l2Var instanceof n) {
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) l2Var;
            Result.a aVar2 = Result.Companion;
            cVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(z7 ? getReceiveException() : getSendException())));
        } else if (l2Var instanceof k) {
            o oVar = ((k) l2Var).cont;
            Result.a aVar3 = Result.Companion;
            oVar.resumeWith(Result.m348constructorimpl(e.m1240boximpl(e.Companion.m1253closedJP2dKIU(getCloseCause()))));
        } else if (l2Var instanceof a) {
            ((a) l2Var).tryResumeHasNextOnClosedChannel();
        } else {
            if (l2Var instanceof kotlinx.coroutines.selects.j) {
                ((kotlinx.coroutines.selects.j) l2Var).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + l2Var).toString());
        }
    }

    static /* synthetic */ <E> Object send$suspendImpl(BufferedChannel bufferedChannel, E e8, kotlin.coroutines.c cVar) {
        f fVar;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        Object coroutine_suspended4;
        f fVar2 = (f) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j8 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (fVar2.id != j9) {
                f findSegmentSend = bufferedChannel.findSegmentSend(j9, fVar2);
                if (findSegmentSend != null) {
                    fVar = findSegmentSend;
                } else if (isClosedForSend0) {
                    Object onClosedSend = bufferedChannel.onClosedSend(e8, cVar);
                    coroutine_suspended4 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    if (onClosedSend == coroutine_suspended4) {
                        return onClosedSend;
                    }
                }
            } else {
                fVar = fVar2;
            }
            int updateCellSend = bufferedChannel.updateCellSend(fVar, i9, e8, j8, null, isClosedForSend0);
            if (updateCellSend == 0) {
                fVar.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    Object sendOnNoWaiterSuspend = bufferedChannel.sendOnNoWaiterSuspend(fVar, i9, e8, j8, cVar);
                    coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    if (sendOnNoWaiterSuspend == coroutine_suspended2) {
                        return sendOnNoWaiterSuspend;
                    }
                } else if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        fVar.cleanPrev();
                    }
                    fVar2 = fVar;
                } else {
                    if (j8 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                        fVar.cleanPrev();
                    }
                    Object onClosedSend2 = bufferedChannel.onClosedSend(e8, cVar);
                    coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    if (onClosedSend2 == coroutine_suspended3) {
                        return onClosedSend2;
                    }
                }
            } else if (isClosedForSend0) {
                fVar.onSlotCleaned();
                Object onClosedSend3 = bufferedChannel.onClosedSend(e8, cVar);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (onClosedSend3 == coroutine_suspended) {
                    return onClosedSend3;
                }
            }
        }
        return w.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        r0 = kotlin.Result.Companion;
        r9.resumeWith(kotlin.Result.m348constructorimpl(kotlin.coroutines.jvm.internal.a.boxBoolean(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <E> Object sendBroadcast$suspendImpl(BufferedChannel bufferedChannel, E e8, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        f fVar;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        if (bufferedChannel.onUndeliveredElement != null) {
            throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`".toString());
        }
        b bVar = new b(oVar);
        f fVar2 = (f) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j8 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (fVar2.id != j9) {
                f findSegmentSend = bufferedChannel.findSegmentSend(j9, fVar2);
                if (findSegmentSend != null) {
                    fVar = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            } else {
                fVar = fVar2;
            }
            f fVar3 = fVar;
            int updateCellSend = bufferedChannel.updateCellSend(fVar, i9, e8, j8, bVar, isClosedForSend0);
            if (updateCellSend == 0) {
                fVar3.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        fVar3.cleanPrev();
                    }
                    fVar2 = fVar3;
                } else if (j8 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    fVar3.cleanPrev();
                }
            } else if (isClosedForSend0) {
                fVar3.onSlotCleaned();
            } else {
                bufferedChannel.prepareSenderForSuspension(bVar, fVar3, i9);
            }
        }
        Result.a aVar = Result.Companion;
        oVar.resumeWith(Result.m348constructorimpl(kotlin.coroutines.jvm.internal.a.boxBoolean(false)));
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return result;
    }

    public static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, f6.a aVar, p pVar, f6.a aVar2, r rVar, int i8, Object obj3) {
        f fVar;
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        r rVar2 = (i8 & 32) != 0 ? new r() { // from class: kotlinx.coroutines.channels.BufferedChannel$sendImpl$1
            @Override // f6.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((f) obj4, ((Number) obj5).intValue(), obj6, ((Number) obj7).longValue());
            }

            public final Void invoke(f fVar2, int i9, Object obj4, long j8) {
                throw new IllegalStateException("unexpected".toString());
            }
        } : rVar;
        f fVar2 = (f) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j8 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i9 = BufferedChannelKt.SEGMENT_SIZE;
            long j9 = j8 / i9;
            int i10 = (int) (j8 % i9);
            if (fVar2.id != j9) {
                f findSegmentSend = bufferedChannel.findSegmentSend(j9, fVar2);
                if (findSegmentSend != null) {
                    fVar = findSegmentSend;
                } else if (isClosedForSend0) {
                    return aVar2.invoke();
                }
            } else {
                fVar = fVar2;
            }
            int updateCellSend = bufferedChannel.updateCellSend(fVar, i10, obj, j8, obj2, isClosedForSend0);
            if (updateCellSend == 0) {
                fVar.cleanPrev();
                return aVar.invoke();
            }
            if (updateCellSend == 1) {
                return aVar.invoke();
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    fVar.onSlotCleaned();
                    return aVar2.invoke();
                }
                l2 l2Var = obj2 instanceof l2 ? (l2) obj2 : null;
                if (l2Var != null) {
                    bufferedChannel.prepareSenderForSuspension(l2Var, fVar, i10);
                }
                return pVar.invoke(fVar, Integer.valueOf(i10));
            }
            if (updateCellSend == 3) {
                return rVar2.invoke(fVar, Integer.valueOf(i10), obj, Long.valueOf(j8));
            }
            if (updateCellSend == 4) {
                if (j8 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    fVar.cleanPrev();
                }
                return aVar2.invoke();
            }
            if (updateCellSend == 5) {
                fVar.cleanPrev();
            }
            fVar2 = fVar;
        }
    }

    private final void sendImplOnNoWaiter(f fVar, int i8, Object obj, long j8, l2 l2Var, f6.a aVar, f6.a aVar2) {
        f fVar2;
        l2 l2Var2 = l2Var;
        int updateCellSend = updateCellSend(fVar, i8, obj, j8, l2Var, false);
        if (updateCellSend == 0) {
            fVar.cleanPrev();
            aVar.invoke();
            return;
        }
        if (updateCellSend == 1) {
            aVar.invoke();
            return;
        }
        if (updateCellSend == 2) {
            prepareSenderForSuspension(l2Var2, fVar, i8);
            return;
        }
        if (updateCellSend == 4) {
            if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                fVar.cleanPrev();
            }
            aVar2.invoke();
            return;
        }
        if (updateCellSend != 5) {
            throw new IllegalStateException("unexpected".toString());
        }
        fVar.cleanPrev();
        f fVar3 = (f) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j9 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i9 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = j9 / i9;
            int i10 = (int) (j9 % i9);
            if (fVar3.id != j10) {
                f findSegmentSend = findSegmentSend(j10, fVar3);
                if (findSegmentSend != null) {
                    fVar2 = findSegmentSend;
                } else if (isClosedForSend0) {
                    aVar2.invoke();
                    return;
                }
            } else {
                fVar2 = fVar3;
            }
            f fVar4 = fVar2;
            int updateCellSend2 = updateCellSend(fVar2, i10, obj, j9, l2Var, isClosedForSend0);
            if (updateCellSend2 == 0) {
                fVar4.cleanPrev();
                aVar.invoke();
                return;
            }
            if (updateCellSend2 == 1) {
                aVar.invoke();
                return;
            }
            if (updateCellSend2 == 2) {
                if (isClosedForSend0) {
                    fVar4.onSlotCleaned();
                    aVar2.invoke();
                    return;
                }
                if (!(l2Var2 instanceof l2)) {
                    l2Var2 = null;
                }
                if (l2Var2 != null) {
                    prepareSenderForSuspension(l2Var2, fVar4, i10);
                }
                w wVar = w.INSTANCE;
                return;
            }
            if (updateCellSend2 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (updateCellSend2 == 4) {
                if (j9 < getReceiversCounter$kotlinx_coroutines_core()) {
                    fVar4.cleanPrev();
                }
                aVar2.invoke();
                return;
            } else {
                if (updateCellSend2 == 5) {
                    fVar4.cleanPrev();
                }
                fVar3 = fVar4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendOnNoWaiterSuspend(f fVar, int i8, Object obj, long j8, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object m348constructorimpl;
        Object result;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        f fVar2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o orCreateCancellableContinuation = kotlinx.coroutines.q.getOrCreateCancellableContinuation(intercepted);
        try {
            int updateCellSend = updateCellSend(fVar, i8, obj, j8, orCreateCancellableContinuation, false);
            if (updateCellSend == 0) {
                fVar.cleanPrev();
                Result.a aVar = Result.Companion;
                m348constructorimpl = Result.m348constructorimpl(w.INSTANCE);
            } else {
                if (updateCellSend != 1) {
                    if (updateCellSend != 2) {
                        if (updateCellSend != 4) {
                            if (updateCellSend != 5) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            fVar.cleanPrev();
                            f fVar3 = (f) sendSegment$FU.get(this);
                            while (true) {
                                long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
                                long j9 = andIncrement & 1152921504606846975L;
                                boolean isClosedForSend0 = isClosedForSend0(andIncrement);
                                int i9 = BufferedChannelKt.SEGMENT_SIZE;
                                long j10 = j9 / i9;
                                int i10 = (int) (j9 % i9);
                                if (fVar3.id != j10) {
                                    f findSegmentSend = findSegmentSend(j10, fVar3);
                                    if (findSegmentSend != null) {
                                        fVar2 = findSegmentSend;
                                    } else if (isClosedForSend0) {
                                        break;
                                    }
                                } else {
                                    fVar2 = fVar3;
                                }
                                f fVar4 = fVar2;
                                int updateCellSend2 = updateCellSend(fVar2, i10, obj, j9, orCreateCancellableContinuation, isClosedForSend0);
                                if (updateCellSend2 == 0) {
                                    fVar4.cleanPrev();
                                    Result.a aVar2 = Result.Companion;
                                    m348constructorimpl = Result.m348constructorimpl(w.INSTANCE);
                                    break;
                                }
                                if (updateCellSend2 == 1) {
                                    Result.a aVar3 = Result.Companion;
                                    m348constructorimpl = Result.m348constructorimpl(w.INSTANCE);
                                    break;
                                }
                                if (updateCellSend2 != 2) {
                                    if (updateCellSend2 == 3) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    if (updateCellSend2 != 4) {
                                        if (updateCellSend2 == 5) {
                                            fVar4.cleanPrev();
                                        }
                                        fVar3 = fVar4;
                                    } else if (j9 < getReceiversCounter$kotlinx_coroutines_core()) {
                                        fVar4.cleanPrev();
                                    }
                                } else if (isClosedForSend0) {
                                    fVar4.onSlotCleaned();
                                } else {
                                    o oVar = orCreateCancellableContinuation instanceof l2 ? orCreateCancellableContinuation : null;
                                    if (oVar != null) {
                                        prepareSenderForSuspension(oVar, fVar4, i10);
                                    }
                                }
                            }
                        } else if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                            fVar.cleanPrev();
                        }
                        onClosedSendOnNoWaiterSuspend(obj, orCreateCancellableContinuation);
                    } else {
                        prepareSenderForSuspension(orCreateCancellableContinuation, fVar, i8);
                    }
                    result = orCreateCancellableContinuation.getResult();
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    if (result == coroutine_suspended) {
                        kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
                    }
                    coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    return result != coroutine_suspended2 ? result : w.INSTANCE;
                }
                Result.a aVar4 = Result.Companion;
                m348constructorimpl = Result.m348constructorimpl(w.INSTANCE);
            }
            orCreateCancellableContinuation.resumeWith(m348constructorimpl);
            result = orCreateCancellableContinuation.getResult();
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (result == coroutine_suspended) {
            }
            coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (result != coroutine_suspended2) {
            }
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private final boolean shouldSendSuspend(long j8) {
        if (isClosedForSend0(j8)) {
            return false;
        }
        return !bufferOrRendezvousSend(j8 & 1152921504606846975L);
    }

    private final boolean tryResumeReceiver(Object obj, Object obj2) {
        boolean tryResume0;
        boolean tryResume02;
        if (obj instanceof kotlinx.coroutines.selects.j) {
            return ((kotlinx.coroutines.selects.j) obj).trySelect(this, obj2);
        }
        if (obj instanceof k) {
            s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            k kVar = (k) obj;
            o oVar = kVar.cont;
            e m1240boximpl = e.m1240boximpl(e.Companion.m1255successJP2dKIU(obj2));
            f6.l lVar = this.onUndeliveredElement;
            tryResume02 = BufferedChannelKt.tryResume0(oVar, m1240boximpl, lVar != null ? OnUndeliveredElementKt.bindCancellationFun(lVar, obj2, kVar.cont.getContext()) : null);
            return tryResume02;
        }
        if (obj instanceof a) {
            s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).tryResumeHasNext(obj2);
        }
        if (!(obj instanceof n)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        n nVar = (n) obj;
        f6.l lVar2 = this.onUndeliveredElement;
        tryResume0 = BufferedChannelKt.tryResume0(nVar, obj2, lVar2 != null ? OnUndeliveredElementKt.bindCancellationFun(lVar2, obj2, nVar.getContext()) : null);
        return tryResume0;
    }

    private final boolean tryResumeSender(Object obj, f fVar, int i8) {
        if (obj instanceof n) {
            s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.tryResume0$default((n) obj, w.INSTANCE, null, 2, null);
        }
        if (obj instanceof kotlinx.coroutines.selects.j) {
            s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, w.INSTANCE);
            if (trySelectDetailed == TrySelectDetailedResult.REREGISTER) {
                fVar.cleanElement$kotlinx_coroutines_core(i8);
            }
            return trySelectDetailed == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return BufferedChannelKt.tryResume0$default(((b) obj).getCont(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void update$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, f6.l lVar, Object obj) {
        long j8;
        do {
            j8 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j8, ((Number) lVar.invoke(Long.valueOf(j8))).longValue()));
    }

    private final boolean updateCellExpandBuffer(f fVar, int i8, long j8) {
        g0 g0Var;
        g0 g0Var2;
        Object state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
        if ((state$kotlinx_coroutines_core instanceof l2) && j8 >= receivers$FU.get(this)) {
            g0Var = BufferedChannelKt.RESUMING_BY_EB;
            if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, g0Var)) {
                if (tryResumeSender(state$kotlinx_coroutines_core, fVar, i8)) {
                    fVar.setState$kotlinx_coroutines_core(i8, BufferedChannelKt.BUFFERED);
                    return true;
                }
                g0Var2 = BufferedChannelKt.INTERRUPTED_SEND;
                fVar.setState$kotlinx_coroutines_core(i8, g0Var2);
                fVar.onCancelledRequest(i8, false);
                return false;
            }
        }
        return updateCellExpandBufferSlow(fVar, i8, j8);
    }

    private final boolean updateCellExpandBufferSlow(f fVar, int i8, long j8) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        g0 g0Var6;
        g0 g0Var7;
        g0 g0Var8;
        while (true) {
            Object state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
            if (!(state$kotlinx_coroutines_core instanceof l2)) {
                g0Var3 = BufferedChannelKt.INTERRUPTED_SEND;
                if (state$kotlinx_coroutines_core != g0Var3) {
                    if (state$kotlinx_coroutines_core != null) {
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                            g0Var5 = BufferedChannelKt.POISONED;
                            if (state$kotlinx_coroutines_core == g0Var5) {
                                break;
                            }
                            g0Var6 = BufferedChannelKt.DONE_RCV;
                            if (state$kotlinx_coroutines_core == g0Var6) {
                                break;
                            }
                            g0Var7 = BufferedChannelKt.INTERRUPTED_RCV;
                            if (state$kotlinx_coroutines_core == g0Var7 || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                                return true;
                            }
                            g0Var8 = BufferedChannelKt.RESUMING_BY_RCV;
                            if (state$kotlinx_coroutines_core != g0Var8) {
                                throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        g0Var4 = BufferedChannelKt.IN_BUFFER;
                        if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, g0Var4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j8 >= receivers$FU.get(this)) {
                g0Var = BufferedChannelKt.RESUMING_BY_EB;
                if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, g0Var)) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, fVar, i8)) {
                        fVar.setState$kotlinx_coroutines_core(i8, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    g0Var2 = BufferedChannelKt.INTERRUPTED_SEND;
                    fVar.setState$kotlinx_coroutines_core(i8, g0Var2);
                    fVar.onCancelledRequest(i8, false);
                    return false;
                }
            } else if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, new m((l2) state$kotlinx_coroutines_core))) {
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(f fVar, int i8, long j8, Object obj) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        Object state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
        if (state$kotlinx_coroutines_core == null) {
            if (j8 >= (sendersAndCloseStatus$FU.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    g0Var3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    return g0Var3;
                }
                if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    g0Var2 = BufferedChannelKt.SUSPEND;
                    return g0Var2;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
            g0Var = BufferedChannelKt.DONE_RCV;
            if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, g0Var)) {
                expandBuffer();
                return fVar.retrieveElement$kotlinx_coroutines_core(i8);
            }
        }
        return updateCellReceiveSlow(fVar, i8, j8, obj);
    }

    private final Object updateCellReceiveSlow(f fVar, int i8, long j8, Object obj) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        g0 g0Var6;
        g0 g0Var7;
        g0 g0Var8;
        g0 g0Var9;
        g0 g0Var10;
        g0 g0Var11;
        g0 g0Var12;
        g0 g0Var13;
        g0 g0Var14;
        g0 g0Var15;
        g0 g0Var16;
        while (true) {
            Object state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
            if (state$kotlinx_coroutines_core != null) {
                g0Var5 = BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != g0Var5) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                        g0Var6 = BufferedChannelKt.DONE_RCV;
                        if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, g0Var6)) {
                            expandBuffer();
                            return fVar.retrieveElement$kotlinx_coroutines_core(i8);
                        }
                    } else {
                        g0Var7 = BufferedChannelKt.INTERRUPTED_SEND;
                        if (state$kotlinx_coroutines_core == g0Var7) {
                            g0Var8 = BufferedChannelKt.FAILED;
                            return g0Var8;
                        }
                        g0Var9 = BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == g0Var9) {
                            g0Var10 = BufferedChannelKt.FAILED;
                            return g0Var10;
                        }
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            expandBuffer();
                            g0Var11 = BufferedChannelKt.FAILED;
                            return g0Var11;
                        }
                        g0Var12 = BufferedChannelKt.RESUMING_BY_EB;
                        if (state$kotlinx_coroutines_core != g0Var12) {
                            g0Var13 = BufferedChannelKt.RESUMING_BY_RCV;
                            if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, g0Var13)) {
                                boolean z7 = state$kotlinx_coroutines_core instanceof m;
                                if (z7) {
                                    state$kotlinx_coroutines_core = ((m) state$kotlinx_coroutines_core).waiter;
                                }
                                if (tryResumeSender(state$kotlinx_coroutines_core, fVar, i8)) {
                                    g0Var16 = BufferedChannelKt.DONE_RCV;
                                    fVar.setState$kotlinx_coroutines_core(i8, g0Var16);
                                    expandBuffer();
                                    return fVar.retrieveElement$kotlinx_coroutines_core(i8);
                                }
                                g0Var14 = BufferedChannelKt.INTERRUPTED_SEND;
                                fVar.setState$kotlinx_coroutines_core(i8, g0Var14);
                                fVar.onCancelledRequest(i8, false);
                                if (z7) {
                                    expandBuffer();
                                }
                                g0Var15 = BufferedChannelKt.FAILED;
                                return g0Var15;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j8 < (sendersAndCloseStatus$FU.get(this) & 1152921504606846975L)) {
                g0Var = BufferedChannelKt.POISONED;
                if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, g0Var)) {
                    expandBuffer();
                    g0Var2 = BufferedChannelKt.FAILED;
                    return g0Var2;
                }
            } else {
                if (obj == null) {
                    g0Var3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    return g0Var3;
                }
                if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    g0Var4 = BufferedChannelKt.SUSPEND;
                    return g0Var4;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(f fVar, int i8, Object obj, long j8, Object obj2, boolean z7) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        fVar.storeElement$kotlinx_coroutines_core(i8, obj);
        if (z7) {
            return updateCellSendSlow(fVar, i8, obj, j8, obj2, z7);
        }
        Object state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(j8)) {
                if (fVar.casState$kotlinx_coroutines_core(i8, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (fVar.casState$kotlinx_coroutines_core(i8, null, obj2)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof l2) {
            fVar.cleanElement$kotlinx_coroutines_core(i8);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, obj)) {
                g0Var3 = BufferedChannelKt.DONE_RCV;
                fVar.setState$kotlinx_coroutines_core(i8, g0Var3);
                onReceiveDequeued();
                return 0;
            }
            g0Var = BufferedChannelKt.INTERRUPTED_RCV;
            Object andSetState$kotlinx_coroutines_core = fVar.getAndSetState$kotlinx_coroutines_core(i8, g0Var);
            g0Var2 = BufferedChannelKt.INTERRUPTED_RCV;
            if (andSetState$kotlinx_coroutines_core != g0Var2) {
                fVar.onCancelledRequest(i8, true);
            }
            return 5;
        }
        return updateCellSendSlow(fVar, i8, obj, j8, obj2, z7);
    }

    private final int updateCellSendSlow(f fVar, int i8, Object obj, long j8, Object obj2, boolean z7) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        g0 g0Var6;
        g0 g0Var7;
        while (true) {
            Object state$kotlinx_coroutines_core = fVar.getState$kotlinx_coroutines_core(i8);
            if (state$kotlinx_coroutines_core != null) {
                g0Var2 = BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != g0Var2) {
                    g0Var3 = BufferedChannelKt.INTERRUPTED_RCV;
                    if (state$kotlinx_coroutines_core == g0Var3) {
                        fVar.cleanElement$kotlinx_coroutines_core(i8);
                        return 5;
                    }
                    g0Var4 = BufferedChannelKt.POISONED;
                    if (state$kotlinx_coroutines_core == g0Var4) {
                        fVar.cleanElement$kotlinx_coroutines_core(i8);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        fVar.cleanElement$kotlinx_coroutines_core(i8);
                        completeCloseOrCancel();
                        return 4;
                    }
                    fVar.cleanElement$kotlinx_coroutines_core(i8);
                    if (state$kotlinx_coroutines_core instanceof m) {
                        state$kotlinx_coroutines_core = ((m) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, obj)) {
                        g0Var7 = BufferedChannelKt.DONE_RCV;
                        fVar.setState$kotlinx_coroutines_core(i8, g0Var7);
                        onReceiveDequeued();
                        return 0;
                    }
                    g0Var5 = BufferedChannelKt.INTERRUPTED_RCV;
                    Object andSetState$kotlinx_coroutines_core = fVar.getAndSetState$kotlinx_coroutines_core(i8, g0Var5);
                    g0Var6 = BufferedChannelKt.INTERRUPTED_RCV;
                    if (andSetState$kotlinx_coroutines_core != g0Var6) {
                        fVar.onCancelledRequest(i8, true);
                    }
                    return 5;
                }
                if (fVar.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (!bufferOrRendezvousSend(j8) || z7) {
                if (z7) {
                    g0Var = BufferedChannelKt.INTERRUPTED_SEND;
                    if (fVar.casState$kotlinx_coroutines_core(i8, null, g0Var)) {
                        fVar.onCancelledRequest(i8, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (fVar.casState$kotlinx_coroutines_core(i8, null, obj2)) {
                        return 2;
                    }
                }
            } else if (fVar.casState$kotlinx_coroutines_core(i8, null, BufferedChannelKt.BUFFERED)) {
                return 1;
            }
        }
    }

    private final void updateReceiversCounterIfLower(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$FU;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            if (j9 >= j8) {
                return;
            }
        } while (!receivers$FU.compareAndSet(this, j9, j8));
    }

    private final void updateSendersCounterIfLower(long j8) {
        long j9;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            long j10 = 1152921504606846975L & j9;
            if (j10 >= j8) {
                return;
            } else {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j10, (int) (j9 >> 60));
            }
        } while (!sendersAndCloseStatus$FU.compareAndSet(this, j9, constructSendersAndCloseStatus));
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        List listOf;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        f fVar;
        f fVar2;
        if (isRendezvousOrUnlimited()) {
            Object obj = bufferEndSegment$FU.get(this);
            fVar2 = BufferedChannelKt.NULL_SEGMENT;
            if (obj != fVar2) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((f) receiveSegment$FU.get(this)).id > ((f) bufferEndSegment$FU.get(this)).id) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new f[]{receiveSegment$FU.get(this), sendSegment$FU.get(this), bufferEndSegment$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listOf) {
            f fVar3 = (f) obj2;
            fVar = BufferedChannelKt.NULL_SEGMENT;
            if (fVar3 != fVar) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j8 = ((f) next).id;
            do {
                Object next2 = it.next();
                long j9 = ((f) next2).id;
                if (j8 > j9) {
                    next = next2;
                    j8 = j9;
                }
            } while (it.hasNext());
        }
        f fVar4 = (f) next;
        if (fVar4.getPrev() != null) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (fVar4.getNext() != null) {
            kotlinx.coroutines.internal.f next3 = fVar4.getNext();
            s.checkNotNull(next3);
            if (((f) next3).getPrev() != null) {
                kotlinx.coroutines.internal.f next4 = fVar4.getNext();
                s.checkNotNull(next4);
                if (((f) next4).getPrev() != fVar4) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object state$kotlinx_coroutines_core = fVar4.getState$kotlinx_coroutines_core(i10);
                if (!s.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof l2)) {
                    g0Var = BufferedChannelKt.INTERRUPTED_RCV;
                    if (!s.areEqual(state$kotlinx_coroutines_core, g0Var)) {
                        g0Var2 = BufferedChannelKt.INTERRUPTED_SEND;
                        if (!s.areEqual(state$kotlinx_coroutines_core, g0Var2) && !s.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            g0Var3 = BufferedChannelKt.POISONED;
                            if (!s.areEqual(state$kotlinx_coroutines_core, g0Var3)) {
                                g0Var4 = BufferedChannelKt.DONE_RCV;
                                if (!s.areEqual(state$kotlinx_coroutines_core, g0Var4)) {
                                    throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                                }
                            }
                            if (fVar4.getElement$kotlinx_coroutines_core(i10) != null) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        }
                    }
                    if (fVar4.getElement$kotlinx_coroutines_core(i10) != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    i9++;
                }
            }
            if (i9 == BufferedChannelKt.SEGMENT_SIZE && fVar4 != receiveSegment$FU.get(this) && fVar4 != sendSegment$FU.get(this) && fVar4 != bufferEndSegment$FU.get(this)) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            kotlinx.coroutines.internal.f next5 = fVar4.getNext();
            s.checkNotNull(next5);
            fVar4 = (f) next5;
        }
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public boolean close(Throwable th) {
        return closeOrCancelImpl(th, false);
    }

    protected boolean closeOrCancelImpl(Throwable th, boolean z7) {
        g0 g0Var;
        if (z7) {
            markCancellationStarted();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeCause$FU;
        g0Var = BufferedChannelKt.NO_CLOSE_CAUSE;
        boolean a8 = androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, g0Var, th);
        if (z7) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (a8) {
            invokeCloseHandler();
        }
        return a8;
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long j8) {
        g0 g0Var;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        f fVar = (f) receiveSegment$FU.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$FU;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(this.capacity + j9, getBufferEndCounter())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, j9 + 1)) {
                int i8 = BufferedChannelKt.SEGMENT_SIZE;
                long j10 = j9 / i8;
                int i9 = (int) (j9 % i8);
                if (fVar.id != j10) {
                    f findSegmentReceive = findSegmentReceive(j10, fVar);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        fVar = findSegmentReceive;
                    }
                }
                Object updateCellReceive = updateCellReceive(fVar, i9, j9, null);
                g0Var = BufferedChannelKt.FAILED;
                if (updateCellReceive != g0Var) {
                    fVar.cleanPrev();
                    f6.l lVar = this.onUndeliveredElement;
                    if (lVar != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, updateCellReceive, null, 2, null)) != null) {
                        throw callUndeliveredElementCatchingException$default;
                    }
                } else if (j9 < getSendersCounter$kotlinx_coroutines_core()) {
                    fVar.cleanPrev();
                }
            }
        }
    }

    protected final Throwable getCloseCause() {
        return (Throwable) _closeCause$FU.get(this);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.e getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        s.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        q qVar = (q) x.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        s.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.f(this, qVar, (q) x.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.e getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        s.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        q qVar = (q) x.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        s.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.f(this, qVar, (q) x.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.e getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        s.checkNotNull(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        q qVar = (q) x.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$1, 3);
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        s.checkNotNull(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.f(this, qVar, (q) x.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public kotlinx.coroutines.selects.g getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        s.checkNotNull(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        q qVar = (q) x.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        s.checkNotNull(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.h(this, qVar, (q) x.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$FU.get(this);
    }

    protected final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException(g.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$FU.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$FU;
            f fVar = (f) atomicReferenceFieldUpdater.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j8 = receiversCounter$kotlinx_coroutines_core / i8;
            if (fVar.id == j8 || (fVar = findSegmentReceive(j8, fVar)) != null) {
                fVar.cleanPrev();
                if (isCellNonEmpty(fVar, (int) (receiversCounter$kotlinx_coroutines_core % i8), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, receiversCounter$kotlinx_coroutines_core + 1);
            } else if (((f) atomicReferenceFieldUpdater.get(this)).id < j8) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public void invokeOnClose(f6.l lVar) {
        g0 g0Var;
        g0 g0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g0 g0Var3;
        g0 g0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = closeHandler$FU;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, lVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            g0Var = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
            if (obj != g0Var) {
                g0Var2 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                if (obj == g0Var2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = closeHandler$FU;
            g0Var3 = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
            g0Var4 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, g0Var3, g0Var4));
        lVar.invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$FU.get(this));
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$FU.get(this));
    }

    protected boolean isConflatedDropOldest() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator iterator() {
        return new a();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public boolean offer(Object obj) {
        return b.a.offer(this, obj);
    }

    protected void onClosedIdempotent() {
    }

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public Object poll() {
        return b.a.poll(this);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(kotlin.coroutines.c cVar) {
        return receive$suspendImpl(this, cVar);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo1232receiveCatchingJP2dKIU(kotlin.coroutines.c cVar) {
        return m1230receiveCatchingJP2dKIU$suspendImpl(this, cVar);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public Object receiveOrNull(kotlin.coroutines.c cVar) {
        return b.a.receiveOrNull(this, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        r14.selectInRegistrationPhase(y5.w.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void registerSelectForSend(kotlinx.coroutines.selects.j jVar, Object obj) {
        f fVar = (f) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j8 = 1152921504606846975L & andIncrement;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (fVar.id != j9) {
                f findSegmentSend = findSegmentSend(j9, fVar);
                if (findSegmentSend != null) {
                    fVar = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            }
            int updateCellSend = updateCellSend(fVar, i9, obj, j8, jVar, isClosedForSend0);
            if (updateCellSend == 0) {
                fVar.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        fVar.cleanPrev();
                    }
                } else if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                    fVar.cleanPrev();
                }
            } else {
                if (!isClosedForSend0) {
                    l2 l2Var = jVar instanceof l2 ? (l2) jVar : null;
                    if (l2Var != null) {
                        prepareSenderForSuspension(l2Var, fVar, i9);
                        return;
                    }
                    return;
                }
                fVar.onSlotCleaned();
            }
        }
        onClosedSelectOnSend(obj, jVar);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public Object send(Object obj, kotlin.coroutines.c cVar) {
        return send$suspendImpl(this, obj, cVar);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(Object obj, kotlin.coroutines.c cVar) {
        return sendBroadcast$suspendImpl(this, obj, cVar);
    }

    protected final <R> R sendImpl(Object obj, Object obj2, f6.a aVar, p pVar, f6.a aVar2, r rVar) {
        f fVar;
        f fVar2 = (f) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (fVar2.id != j9) {
                f findSegmentSend = findSegmentSend(j9, fVar2);
                if (findSegmentSend != null) {
                    fVar = findSegmentSend;
                } else if (isClosedForSend0) {
                    return (R) aVar2.invoke();
                }
            } else {
                fVar = fVar2;
            }
            int updateCellSend = updateCellSend(fVar, i9, obj, j8, obj2, isClosedForSend0);
            if (updateCellSend == 0) {
                fVar.cleanPrev();
                return (R) aVar.invoke();
            }
            if (updateCellSend == 1) {
                return (R) aVar.invoke();
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    fVar.onSlotCleaned();
                    return (R) aVar2.invoke();
                }
                l2 l2Var = obj2 instanceof l2 ? (l2) obj2 : null;
                if (l2Var != null) {
                    prepareSenderForSuspension(l2Var, fVar, i9);
                }
                return (R) pVar.invoke(fVar, Integer.valueOf(i9));
            }
            if (updateCellSend == 3) {
                return (R) rVar.invoke(fVar, Integer.valueOf(i9), obj, Long.valueOf(j8));
            }
            if (updateCellSend == 4) {
                if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                    fVar.cleanPrev();
                }
                return (R) aVar2.invoke();
            }
            if (updateCellSend == 5) {
                fVar.cleanPrev();
            }
            fVar2 = fVar;
        }
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$FU.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d7, code lost:
    
        r3 = (kotlinx.coroutines.channels.f) r3.getNext();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        List listOf;
        char last;
        g0 g0Var;
        String str;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        g0 g0Var6;
        g0 g0Var7;
        f fVar;
        StringBuilder sb = new StringBuilder();
        int i8 = (int) (sendersAndCloseStatus$FU.get(this) >> 60);
        if (i8 == 2) {
            sb.append("closed,");
        } else if (i8 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new f[]{receiveSegment$FU.get(this), sendSegment$FU.get(this), bufferEndSegment$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            f fVar2 = (f) obj;
            fVar = BufferedChannelKt.NULL_SEGMENT;
            if (fVar2 != fVar) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j8 = ((f) next).id;
            do {
                Object next2 = it.next();
                long j9 = ((f) next2).id;
                if (j8 > j9) {
                    next = next2;
                    j8 = j9;
                }
            } while (it.hasNext());
        }
        f fVar3 = (f) next;
        long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
        long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
        loop2: do {
            int i9 = BufferedChannelKt.SEGMENT_SIZE;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                long j10 = (fVar3.id * BufferedChannelKt.SEGMENT_SIZE) + i10;
                if (j10 >= sendersCounter$kotlinx_coroutines_core && j10 >= receiversCounter$kotlinx_coroutines_core) {
                    break loop2;
                }
                Object state$kotlinx_coroutines_core = fVar3.getState$kotlinx_coroutines_core(i10);
                Object element$kotlinx_coroutines_core = fVar3.getElement$kotlinx_coroutines_core(i10);
                if (state$kotlinx_coroutines_core instanceof n) {
                    str = (j10 >= receiversCounter$kotlinx_coroutines_core || j10 < sendersCounter$kotlinx_coroutines_core) ? (j10 >= sendersCounter$kotlinx_coroutines_core || j10 < receiversCounter$kotlinx_coroutines_core) ? "cont" : "send" : "receive";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.selects.j) {
                    str = (j10 >= receiversCounter$kotlinx_coroutines_core || j10 < sendersCounter$kotlinx_coroutines_core) ? (j10 >= sendersCounter$kotlinx_coroutines_core || j10 < receiversCounter$kotlinx_coroutines_core) ? "select" : "onSend" : "onReceive";
                } else if (state$kotlinx_coroutines_core instanceof k) {
                    str = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof b) {
                    str = "sendBroadcast";
                } else if (state$kotlinx_coroutines_core instanceof m) {
                    str = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    g0Var = BufferedChannelKt.RESUMING_BY_RCV;
                    if (!s.areEqual(state$kotlinx_coroutines_core, g0Var)) {
                        g0Var2 = BufferedChannelKt.RESUMING_BY_EB;
                        if (!s.areEqual(state$kotlinx_coroutines_core, g0Var2)) {
                            if (state$kotlinx_coroutines_core != null) {
                                g0Var3 = BufferedChannelKt.IN_BUFFER;
                                if (!s.areEqual(state$kotlinx_coroutines_core, g0Var3)) {
                                    g0Var4 = BufferedChannelKt.DONE_RCV;
                                    if (!s.areEqual(state$kotlinx_coroutines_core, g0Var4)) {
                                        g0Var5 = BufferedChannelKt.POISONED;
                                        if (!s.areEqual(state$kotlinx_coroutines_core, g0Var5)) {
                                            g0Var6 = BufferedChannelKt.INTERRUPTED_RCV;
                                            if (!s.areEqual(state$kotlinx_coroutines_core, g0Var6)) {
                                                g0Var7 = BufferedChannelKt.INTERRUPTED_SEND;
                                                if (!s.areEqual(state$kotlinx_coroutines_core, g0Var7) && !s.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                                    str = state$kotlinx_coroutines_core.toString();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i10++;
                        }
                    }
                    str = "resuming_sender";
                }
                if (element$kotlinx_coroutines_core != null) {
                    sb.append('(' + str + ',' + element$kotlinx_coroutines_core + "),");
                } else {
                    sb.append(str + ',');
                }
                i10++;
            }
        } while (fVar3 != null);
        last = StringsKt___StringsKt.last(sb);
        if (last == ',') {
            s.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        List listOf;
        String valueOf;
        f fVar;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S=");
        sb2.append(getSendersCounter$kotlinx_coroutines_core());
        sb2.append(",R=");
        sb2.append(getReceiversCounter$kotlinx_coroutines_core());
        sb2.append(",B=");
        sb2.append(getBufferEndCounter());
        sb2.append(",B'=");
        sb2.append(completedExpandBuffersAndPauseFlag$FU.get(this));
        sb2.append(",C=");
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        sb2.append((int) (atomicLongFieldUpdater.get(this) >> 60));
        sb2.append(',');
        sb.append(sb2.toString());
        int i8 = (int) (atomicLongFieldUpdater.get(this) >> 60);
        if (i8 == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i8 == 2) {
            sb.append("CLOSED,");
        } else if (i8 == 3) {
            sb.append("CANCELLED,");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SEND_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$FU;
        sb3.append(k0.getHexAddress(atomicReferenceFieldUpdater.get(this)));
        sb3.append(",RCV_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = receiveSegment$FU;
        sb3.append(k0.getHexAddress(atomicReferenceFieldUpdater2.get(this)));
        sb.append(sb3.toString());
        if (!isRendezvousOrUnlimited()) {
            sb.append(",EB_SEGM=" + k0.getHexAddress(bufferEndSegment$FU.get(this)));
        }
        sb.append("  ");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new f[]{atomicReferenceFieldUpdater2.get(this), atomicReferenceFieldUpdater.get(this), bufferEndSegment$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            f fVar2 = (f) obj;
            fVar = BufferedChannelKt.NULL_SEGMENT;
            if (fVar2 != fVar) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j8 = ((f) next).id;
            do {
                Object next2 = it.next();
                long j9 = ((f) next2).id;
                if (j8 > j9) {
                    next = next2;
                    j8 = j9;
                }
            } while (it.hasNext());
        }
        f fVar3 = (f) next;
        do {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(k0.getHexAddress(fVar3));
            sb4.append("=[");
            sb4.append(fVar3.isRemoved() ? "*" : "");
            sb4.append(fVar3.id);
            sb4.append(",prev=");
            f fVar4 = (f) fVar3.getPrev();
            sb4.append(fVar4 != null ? k0.getHexAddress(fVar4) : null);
            sb4.append(',');
            sb.append(sb4.toString());
            int i9 = BufferedChannelKt.SEGMENT_SIZE;
            for (int i10 = 0; i10 < i9; i10++) {
                Object state$kotlinx_coroutines_core = fVar3.getState$kotlinx_coroutines_core(i10);
                Object element$kotlinx_coroutines_core = fVar3.getElement$kotlinx_coroutines_core(i10);
                if (state$kotlinx_coroutines_core instanceof n) {
                    valueOf = "cont";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.selects.j) {
                    valueOf = "select";
                } else if (state$kotlinx_coroutines_core instanceof k) {
                    valueOf = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof b) {
                    valueOf = "send(broadcast)";
                } else if (state$kotlinx_coroutines_core instanceof m) {
                    valueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    valueOf = String.valueOf(state$kotlinx_coroutines_core);
                }
                sb.append('[' + i10 + "]=(" + valueOf + ',' + element$kotlinx_coroutines_core + "),");
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("next=");
            f fVar5 = (f) fVar3.getNext();
            sb5.append(fVar5 != null ? k0.getHexAddress(fVar5) : null);
            sb5.append("]  ");
            sb.append(sb5.toString());
            fVar3 = (f) fVar3.getNext();
        } while (fVar3 != null);
        return sb.toString();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo1233tryReceivePtdJZtk() {
        Object obj;
        f fVar;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        long j8 = receivers$FU.get(this);
        long j9 = sendersAndCloseStatus$FU.get(this);
        if (isClosedForReceive0(j9)) {
            return e.Companion.m1253closedJP2dKIU(getCloseCause());
        }
        if (j8 >= (j9 & 1152921504606846975L)) {
            return e.Companion.m1254failurePtdJZtk();
        }
        obj = BufferedChannelKt.INTERRUPTED_RCV;
        f fVar2 = (f) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (fVar2.id != j10) {
                f findSegmentReceive = findSegmentReceive(j10, fVar2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    fVar = findSegmentReceive;
                }
            } else {
                fVar = fVar2;
            }
            Object updateCellReceive = updateCellReceive(fVar, i9, andIncrement, obj);
            g0Var = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == g0Var) {
                l2 l2Var = obj instanceof l2 ? (l2) obj : null;
                if (l2Var != null) {
                    prepareReceiverForSuspension(l2Var, fVar, i9);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                fVar.onSlotCleaned();
                return e.Companion.m1254failurePtdJZtk();
            }
            g0Var2 = BufferedChannelKt.FAILED;
            if (updateCellReceive != g0Var2) {
                g0Var3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == g0Var3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                fVar.cleanPrev();
                return e.Companion.m1255successJP2dKIU(updateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                fVar.cleanPrev();
            }
            fVar2 = fVar;
        }
        return e.Companion.m1253closedJP2dKIU(getCloseCause());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return kotlinx.coroutines.channels.e.Companion.m1255successJP2dKIU(y5.w.INSTANCE);
     */
    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo1234trySendJP2dKIU(Object obj) {
        Object obj2;
        f fVar;
        if (shouldSendSuspend(sendersAndCloseStatus$FU.get(this))) {
            return e.Companion.m1254failurePtdJZtk();
        }
        obj2 = BufferedChannelKt.INTERRUPTED_SEND;
        f fVar2 = (f) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i8 = BufferedChannelKt.SEGMENT_SIZE;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (fVar2.id != j9) {
                f findSegmentSend = findSegmentSend(j9, fVar2);
                if (findSegmentSend != null) {
                    fVar = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            } else {
                fVar = fVar2;
            }
            int updateCellSend = updateCellSend(fVar, i9, obj, j8, obj2, isClosedForSend0);
            if (updateCellSend == 0) {
                fVar.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        fVar.cleanPrev();
                    }
                    fVar2 = fVar;
                } else if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                    fVar.cleanPrev();
                }
            } else {
                if (!isClosedForSend0) {
                    l2 l2Var = obj2 instanceof l2 ? (l2) obj2 : null;
                    if (l2Var != null) {
                        prepareSenderForSuspension(l2Var, fVar, i9);
                    }
                    fVar.onSlotCleaned();
                    return e.Companion.m1254failurePtdJZtk();
                }
                fVar.onSlotCleaned();
            }
        }
        return e.Companion.m1253closedJP2dKIU(getSendException());
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j8) {
        int i8;
        long j9;
        long constructEBCompletedAndPauseFlag;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long constructEBCompletedAndPauseFlag2;
        long j10;
        long constructEBCompletedAndPauseFlag3;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        while (getBufferEndCounter() <= j8) {
        }
        i8 = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i9 = 0; i9 < i8; i9++) {
            long bufferEndCounter = getBufferEndCounter();
            if (bufferEndCounter == (completedExpandBuffersAndPauseFlag$FU.get(this) & k6.c.MAX_MILLIS) && bufferEndCounter == getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$FU;
        do {
            j9 = atomicLongFieldUpdater2.get(this);
            constructEBCompletedAndPauseFlag = BufferedChannelKt.constructEBCompletedAndPauseFlag(j9 & k6.c.MAX_MILLIS, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, constructEBCompletedAndPauseFlag));
        while (true) {
            long bufferEndCounter2 = getBufferEndCounter();
            atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$FU;
            long j11 = atomicLongFieldUpdater.get(this);
            long j12 = j11 & k6.c.MAX_MILLIS;
            boolean z7 = (Longs.MAX_POWER_OF_TWO & j11) != 0;
            if (bufferEndCounter2 == j12 && bufferEndCounter2 == getBufferEndCounter()) {
                break;
            } else if (!z7) {
                constructEBCompletedAndPauseFlag2 = BufferedChannelKt.constructEBCompletedAndPauseFlag(j12, true);
                atomicLongFieldUpdater.compareAndSet(this, j11, constructEBCompletedAndPauseFlag2);
            }
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
            constructEBCompletedAndPauseFlag3 = BufferedChannelKt.constructEBCompletedAndPauseFlag(j10 & k6.c.MAX_MILLIS, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, constructEBCompletedAndPauseFlag3));
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    public /* synthetic */ BufferedChannel(int i8, f6.l lVar, int i9, kotlin.jvm.internal.o oVar) {
        this(i8, (i9 & 2) != 0 ? null : lVar);
    }
}
