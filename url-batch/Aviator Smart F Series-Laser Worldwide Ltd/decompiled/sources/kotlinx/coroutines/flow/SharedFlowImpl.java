package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.u0;

/* loaded from: classes5.dex */
public class SharedFlowImpl extends kotlinx.coroutines.flow.internal.a implements i, kotlinx.coroutines.flow.a, kotlinx.coroutines.flow.internal.i {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    private static final class a implements u0 {
        public final kotlin.coroutines.c cont;
        public final SharedFlowImpl flow;
        public long index;
        public final Object value;

        public a(SharedFlowImpl sharedFlowImpl, long j8, Object obj, kotlin.coroutines.c cVar) {
            this.flow = sharedFlowImpl;
            this.index = j8;
            this.value = obj;
            this.cont = cVar;
        }

        @Override // kotlinx.coroutines.u0
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SharedFlowImpl(int i8, int i9, BufferOverflow bufferOverflow) {
        this.replay = i8;
        this.bufferCapacity = i9;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitValue(p pVar, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(intercepted, 1);
        oVar.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(pVar) < 0) {
                    pVar.cont = oVar;
                } else {
                    Result.a aVar = Result.Companion;
                    oVar.resumeWith(Result.m348constructorimpl(y5.w.INSTANCE));
                }
                y5.w wVar = y5.w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return result == coroutine_suspended2 ? result : y5.w.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(a aVar) {
        Object bufferAt;
        synchronized (this) {
            if (aVar.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.s.checkNotNull(objArr);
            bufferAt = o.getBufferAt(objArr, aVar.index);
            if (bufferAt != aVar) {
                return;
            }
            o.setBufferAt(objArr, aVar.index, o.NO_VALUE);
            cleanupTailLocked();
            y5.w wVar = y5.w.INSTANCE;
        }
    }

    private final void cleanupTailLocked() {
        Object bufferAt;
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.s.checkNotNull(objArr);
            while (this.queueSize > 0) {
                bufferAt = o.getBufferAt(objArr, (getHead() + getTotalSize()) - 1);
                if (bufferAt != o.NO_VALUE) {
                    return;
                }
                this.queueSize--;
                o.setBufferAt(objArr, getHead() + getTotalSize(), null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> Object collect$suspendImpl(SharedFlowImpl sharedFlowImpl, f fVar, kotlin.coroutines.c cVar) {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        Object coroutine_suspended;
        int i8;
        SharedFlowImpl sharedFlowImpl2;
        Throwable th;
        p pVar;
        f fVar2;
        l1 l1Var;
        Object tryTakeValue;
        l1 l1Var2;
        f fVar3;
        if (cVar instanceof SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) cVar;
            int i9 = sharedFlowImpl$collect$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                sharedFlowImpl$collect$1.label = i9 - Integer.MIN_VALUE;
                Object obj = sharedFlowImpl$collect$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = sharedFlowImpl$collect$1.label;
                if (i8 == 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            l1Var2 = (l1) sharedFlowImpl$collect$1.L$3;
                            pVar = (p) sharedFlowImpl$collect$1.L$2;
                            fVar3 = (f) sharedFlowImpl$collect$1.L$1;
                            sharedFlowImpl2 = (SharedFlowImpl) sharedFlowImpl$collect$1.L$0;
                        } else {
                            if (i8 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l1Var2 = (l1) sharedFlowImpl$collect$1.L$3;
                            pVar = (p) sharedFlowImpl$collect$1.L$2;
                            fVar3 = (f) sharedFlowImpl$collect$1.L$1;
                            sharedFlowImpl2 = (SharedFlowImpl) sharedFlowImpl$collect$1.L$0;
                        }
                        try {
                            y5.g.throwOnFailure(obj);
                            fVar2 = fVar3;
                            l1Var = l1Var2;
                            sharedFlowImpl = sharedFlowImpl2;
                            while (true) {
                                tryTakeValue = sharedFlowImpl.tryTakeValue(pVar);
                                if (tryTakeValue == o.NO_VALUE) {
                                    sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.L$1 = fVar2;
                                    sharedFlowImpl$collect$1.L$2 = pVar;
                                    sharedFlowImpl$collect$1.L$3 = l1Var;
                                    sharedFlowImpl$collect$1.label = 2;
                                    if (sharedFlowImpl.awaitValue(pVar, sharedFlowImpl$collect$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (l1Var != null) {
                                        o1.ensureActive(l1Var);
                                    }
                                    sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.L$1 = fVar2;
                                    sharedFlowImpl$collect$1.L$2 = pVar;
                                    sharedFlowImpl$collect$1.L$3 = l1Var;
                                    sharedFlowImpl$collect$1.label = 3;
                                    if (fVar2.emit(tryTakeValue, sharedFlowImpl$collect$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        pVar = (p) sharedFlowImpl$collect$1.L$2;
                        f fVar4 = (f) sharedFlowImpl$collect$1.L$1;
                        SharedFlowImpl sharedFlowImpl3 = (SharedFlowImpl) sharedFlowImpl$collect$1.L$0;
                        try {
                            y5.g.throwOnFailure(obj);
                            fVar2 = fVar4;
                            sharedFlowImpl = sharedFlowImpl3;
                        } catch (Throwable th3) {
                            th = th3;
                            sharedFlowImpl2 = sharedFlowImpl3;
                        }
                    }
                    sharedFlowImpl2.freeSlot(pVar);
                    throw th;
                }
                y5.g.throwOnFailure(obj);
                p pVar2 = (p) sharedFlowImpl.allocateSlot();
                try {
                    if (fVar instanceof SubscribedFlowCollector) {
                        sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                        sharedFlowImpl$collect$1.L$1 = fVar;
                        sharedFlowImpl$collect$1.L$2 = pVar2;
                        sharedFlowImpl$collect$1.label = 1;
                        if (((SubscribedFlowCollector) fVar).onSubscription(sharedFlowImpl$collect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    fVar2 = fVar;
                    pVar = pVar2;
                } catch (Throwable th4) {
                    sharedFlowImpl2 = sharedFlowImpl;
                    th = th4;
                    pVar = pVar2;
                }
                l1Var = (l1) sharedFlowImpl$collect$1.getContext().get(l1.Key);
                while (true) {
                    tryTakeValue = sharedFlowImpl.tryTakeValue(pVar);
                    if (tryTakeValue == o.NO_VALUE) {
                    }
                }
            }
        }
        sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(sharedFlowImpl, cVar);
        Object obj2 = sharedFlowImpl$collect$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = sharedFlowImpl$collect$1.label;
        if (i8 == 0) {
        }
        l1Var = (l1) sharedFlowImpl$collect$1.getContext().get(l1.Key);
        while (true) {
            tryTakeValue = sharedFlowImpl.tryTakeValue(pVar);
            if (tryTakeValue == o.NO_VALUE) {
            }
        }
    }

    private final void correctCollectorIndexesOnDropOldest(long j8) {
        kotlinx.coroutines.flow.internal.c[] cVarArr;
        if (((kotlinx.coroutines.flow.internal.a) this).nCollectors != 0 && (cVarArr = ((kotlinx.coroutines.flow.internal.a) this).slots) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : cVarArr) {
                if (cVar != null) {
                    p pVar = (p) cVar;
                    long j9 = pVar.index;
                    if (j9 >= 0 && j9 < j8) {
                        pVar.index = j8;
                    }
                }
            }
        }
        this.minCollectorIndex = j8;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        kotlin.jvm.internal.s.checkNotNull(objArr);
        o.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
    }

    static /* synthetic */ <T> Object emit$suspendImpl(SharedFlowImpl sharedFlowImpl, T t7, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        if (sharedFlowImpl.tryEmit(t7)) {
            return y5.w.INSTANCE;
        }
        Object emitSuspend = sharedFlowImpl.emitSuspend(t7, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return emitSuspend == coroutine_suspended ? emitSuspend : y5.w.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitSuspend(Object obj, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        kotlin.coroutines.c[] cVarArr;
        a aVar;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(intercepted, 1);
        oVar.initCancellability();
        kotlin.coroutines.c[] cVarArr2 = kotlinx.coroutines.flow.internal.b.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(obj)) {
                    Result.a aVar2 = Result.Companion;
                    oVar.resumeWith(Result.m348constructorimpl(y5.w.INSTANCE));
                    cVarArr = findSlotsToResumeLocked(cVarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, getTotalSize() + getHead(), obj, oVar);
                    enqueueLocked(aVar3);
                    this.queueSize++;
                    if (this.bufferCapacity == 0) {
                        cVarArr2 = findSlotsToResumeLocked(cVarArr2);
                    }
                    cVarArr = cVarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            kotlinx.coroutines.q.disposeOnCancellation(oVar, aVar);
        }
        for (kotlin.coroutines.c cVar2 : cVarArr) {
            if (cVar2 != null) {
                Result.a aVar4 = Result.Companion;
                cVar2.resumeWith(Result.m348constructorimpl(y5.w.INSTANCE));
            }
        }
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return result == coroutine_suspended2 ? result : y5.w.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object obj) {
        int totalSize = getTotalSize();
        Object[] objArr = this.buffer;
        if (objArr == null) {
            objArr = growBuffer(null, 0, 2);
        } else if (totalSize >= objArr.length) {
            objArr = growBuffer(objArr, totalSize, objArr.length * 2);
        }
        o.setBufferAt(objArr, getHead() + totalSize, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.lang.Object[]] */
    public final kotlin.coroutines.c[] findSlotsToResumeLocked(kotlin.coroutines.c[] cVarArr) {
        kotlinx.coroutines.flow.internal.c[] cVarArr2;
        p pVar;
        kotlin.coroutines.c cVar;
        int length = cVarArr.length;
        if (((kotlinx.coroutines.flow.internal.a) this).nCollectors != 0 && (cVarArr2 = ((kotlinx.coroutines.flow.internal.a) this).slots) != null) {
            int length2 = cVarArr2.length;
            int i8 = 0;
            cVarArr = cVarArr;
            while (i8 < length2) {
                kotlinx.coroutines.flow.internal.c cVar2 = cVarArr2[i8];
                if (cVar2 != null && (cVar = (pVar = (p) cVar2).cont) != null && tryPeekLocked(pVar) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = cVar;
                    pVar.cont = null;
                    length++;
                }
                i8++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    private final long getBufferEndIndex() {
        return getHead() + this.bufferSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    protected static /* synthetic */ void getLastReplayedLocked$annotations() {
    }

    private final Object getPeekedValueLockedAt(long j8) {
        Object bufferAt;
        Object[] objArr = this.buffer;
        kotlin.jvm.internal.s.checkNotNull(objArr);
        bufferAt = o.getBufferAt(objArr, j8);
        return bufferAt instanceof a ? ((a) bufferAt).value : bufferAt;
    }

    private final long getQueueEndIndex() {
        return getHead() + this.bufferSize + this.queueSize;
    }

    private final int getReplaySize() {
        return (int) ((getHead() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] growBuffer(Object[] objArr, int i8, int i9) {
        Object bufferAt;
        if (i9 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i9];
        this.buffer = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long head = getHead();
        for (int i10 = 0; i10 < i8; i10++) {
            long j8 = i10 + head;
            bufferAt = o.getBufferAt(objArr, j8);
            o.setBufferAt(objArr2, j8, bufferAt);
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(Object obj) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(obj);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i8 = b.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i8 == 1) {
                return false;
            }
            if (i8 == 2) {
                return true;
            }
        }
        enqueueLocked(obj);
        int i9 = this.bufferSize + 1;
        this.bufferSize = i9;
        if (i9 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(Object obj) {
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(obj);
        int i8 = this.bufferSize + 1;
        this.bufferSize = i8;
        if (i8 > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + this.bufferSize;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(p pVar) {
        long j8 = pVar.index;
        if (j8 < getBufferEndIndex()) {
            return j8;
        }
        if (this.bufferCapacity <= 0 && j8 <= getHead() && this.queueSize != 0) {
            return j8;
        }
        return -1L;
    }

    private final Object tryTakeValue(p pVar) {
        Object obj;
        kotlin.coroutines.c[] cVarArr = kotlinx.coroutines.flow.internal.b.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long tryPeekLocked = tryPeekLocked(pVar);
                if (tryPeekLocked < 0) {
                    obj = o.NO_VALUE;
                } else {
                    long j8 = pVar.index;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(tryPeekLocked);
                    pVar.index = tryPeekLocked + 1;
                    cVarArr = updateCollectorIndexLocked$kotlinx_coroutines_core(j8);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.c cVar : cVarArr) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m348constructorimpl(y5.w.INSTANCE));
            }
        }
        return obj;
    }

    private final void updateBufferLocked(long j8, long j9, long j10, long j11) {
        long min = Math.min(j9, j8);
        for (long head = getHead(); head < min; head++) {
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.s.checkNotNull(objArr);
            o.setBufferAt(objArr, head, null);
        }
        this.replayIndex = j8;
        this.minCollectorIndex = j9;
        this.bufferSize = (int) (j10 - min);
        this.queueSize = (int) (j11 - j10);
    }

    @Override // kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        return collect$suspendImpl(this, fVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.f
    public Object emit(Object obj, kotlin.coroutines.c cVar) {
        return emit$suspendImpl(this, obj, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.i
    public e fuse(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return o.fuseSharedFlow(this, coroutineContext, i8, bufferOverflow);
    }

    protected final Object getLastReplayedLocked() {
        Object bufferAt;
        Object[] objArr = this.buffer;
        kotlin.jvm.internal.s.checkNotNull(objArr);
        bufferAt = o.getBufferAt(objArr, (this.replayIndex + getReplaySize()) - 1);
        return bufferAt;
    }

    @Override // kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.n
    public List<Object> getReplayCache() {
        Object bufferAt;
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.s.checkNotNull(objArr);
            for (int i8 = 0; i8 < replaySize; i8++) {
                bufferAt = o.getBufferAt(objArr, this.replayIndex + i8);
                arrayList.add(bufferAt);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.i
    public void resetReplayCache() {
        synchronized (this) {
            updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
            y5.w wVar = y5.w.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.i
    public boolean tryEmit(Object obj) {
        int i8;
        boolean z7;
        kotlin.coroutines.c[] cVarArr = kotlinx.coroutines.flow.internal.b.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(obj)) {
                cVarArr = findSlotsToResumeLocked(cVarArr);
                z7 = true;
            } else {
                z7 = false;
            }
        }
        for (kotlin.coroutines.c cVar : cVarArr) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m348constructorimpl(y5.w.INSTANCE));
            }
        }
        return z7;
    }

    public final kotlin.coroutines.c[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j8) {
        long j9;
        long j10;
        Object bufferAt;
        Object bufferAt2;
        long j11;
        kotlinx.coroutines.flow.internal.c[] cVarArr;
        if (j8 > this.minCollectorIndex) {
            return kotlinx.coroutines.flow.internal.b.EMPTY_RESUMES;
        }
        long head = getHead();
        long j12 = this.bufferSize + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j12++;
        }
        if (((kotlinx.coroutines.flow.internal.a) this).nCollectors != 0 && (cVarArr = ((kotlinx.coroutines.flow.internal.a) this).slots) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : cVarArr) {
                if (cVar != null) {
                    long j13 = ((p) cVar).index;
                    if (j13 >= 0 && j13 < j12) {
                        j12 = j13;
                    }
                }
            }
        }
        if (j12 <= this.minCollectorIndex) {
            return kotlinx.coroutines.flow.internal.b.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        int min = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j12))) : this.queueSize;
        kotlin.coroutines.c[] cVarArr2 = kotlinx.coroutines.flow.internal.b.EMPTY_RESUMES;
        long j14 = this.queueSize + bufferEndIndex;
        if (min > 0) {
            cVarArr2 = new kotlin.coroutines.c[min];
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.s.checkNotNull(objArr);
            long j15 = bufferEndIndex;
            int i8 = 0;
            while (true) {
                if (bufferEndIndex >= j14) {
                    j9 = j12;
                    j10 = j14;
                    break;
                }
                bufferAt2 = o.getBufferAt(objArr, bufferEndIndex);
                j9 = j12;
                g0 g0Var = o.NO_VALUE;
                if (bufferAt2 != g0Var) {
                    kotlin.jvm.internal.s.checkNotNull(bufferAt2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) bufferAt2;
                    int i9 = i8 + 1;
                    j10 = j14;
                    cVarArr2[i8] = aVar.cont;
                    o.setBufferAt(objArr, bufferEndIndex, g0Var);
                    o.setBufferAt(objArr, j15, aVar.value);
                    j11 = 1;
                    j15++;
                    if (i9 >= min) {
                        break;
                    }
                    i8 = i9;
                } else {
                    j10 = j14;
                    j11 = 1;
                }
                bufferEndIndex += j11;
                j12 = j9;
                j14 = j10;
            }
            bufferEndIndex = j15;
        } else {
            j9 = j12;
            j10 = j14;
        }
        int i10 = (int) (bufferEndIndex - head);
        long j16 = getNCollectors() == 0 ? bufferEndIndex : j9;
        long max = Math.max(this.replayIndex, bufferEndIndex - Math.min(this.replay, i10));
        if (this.bufferCapacity == 0 && max < j10) {
            Object[] objArr2 = this.buffer;
            kotlin.jvm.internal.s.checkNotNull(objArr2);
            bufferAt = o.getBufferAt(objArr2, max);
            if (kotlin.jvm.internal.s.areEqual(bufferAt, o.NO_VALUE)) {
                bufferEndIndex++;
                max++;
            }
        }
        updateBufferLocked(max, j16, bufferEndIndex, j10);
        cleanupTailLocked();
        return (cVarArr2.length == 0) ^ true ? findSlotsToResumeLocked(cVarArr2) : cVarArr2;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j8 = this.replayIndex;
        if (j8 < this.minCollectorIndex) {
            this.minCollectorIndex = j8;
        }
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    public p createSlot() {
        return new p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    public p[] createSlotArray(int i8) {
        return new p[i8];
    }
}
