package kotlinx.coroutines.sync;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import com.squareup.cash.common.ui.ColorModelsKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public class SemaphoreAndMutexImpl {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$volatile$FU;
    public static final /* synthetic */ AtomicLongFieldUpdater deqIdx$volatile$FU;
    public static final /* synthetic */ AtomicLongFieldUpdater enqIdx$volatile$FU;
    public static final /* synthetic */ AtomicReferenceFieldUpdater head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");
    public static final /* synthetic */ long head$volatile$FU$offset;
    public static final /* synthetic */ AtomicReferenceFieldUpdater tail$volatile$FU;
    public static final /* synthetic */ long tail$volatile$FU$offset;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    public final ColorModelsKt$$ExternalSyntheticLambda0 onCancellationRelease;
    public final int permits;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        head$volatile$FU$offset = unsafe.objectFieldOffset(SemaphoreAndMutexImpl.class.getDeclaredField("head$volatile"));
        deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");
        tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");
        tail$volatile$FU$offset = unsafe.objectFieldOffset(SemaphoreAndMutexImpl.class.getDeclaredField("tail$volatile"));
        enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");
        _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");
    }

    public SemaphoreAndMutexImpl(int i) {
        this.permits = i;
        if (i <= 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i;
        this.onCancellationRelease = new ColorModelsKt$$ExternalSyntheticLambda0(this, 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r4.resume(kotlin.Unit.INSTANCE, r3.onCancellationRelease);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acquire(ContinuationImpl continuationImpl) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = _availablePermits$volatile$FU;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.permits;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl orCreateCancellableContinuation = JobKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            break;
                        }
                        if (addAcquireToQueue(orCreateCancellableContinuation)) {
                            break;
                        }
                    }
                }
            }
            Object result = orCreateCancellableContinuation.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (result != coroutineSingletons) {
                result = Unit.INSTANCE;
            }
            return result == coroutineSingletons ? result : Unit.INSTANCE;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    public final boolean addAcquireToQueue(Waiter waiter) {
        Object findSegmentInternal;
        long j;
        SemaphoreSegment semaphoreSegment;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
        atomicReferenceFieldUpdater.getClass();
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        long j2 = tail$volatile$FU$offset;
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) unsafe.getObjectVolatile(this, j2);
        long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        long j3 = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        loop0: while (true) {
            findSegmentInternal = InlineList.findSegmentInternal(semaphoreSegment2, j3, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!InlineList.m4199isClosedimpl(findSegmentInternal)) {
                Segment m4198getSegmentimpl = InlineList.m4198getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, j2);
                    j = j2;
                    semaphoreSegment = semaphoreSegment2;
                    if (segment.id >= m4198getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m4198getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (!GetCert$$ExternalSyntheticOutline0.m(atomicReferenceFieldUpdater, this, segment, m4198getSegmentimpl)) {
                        if (m4198getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            m4198getSegmentimpl.remove();
                        }
                        semaphoreSegment2 = semaphoreSegment;
                        j2 = j;
                    } else if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
            semaphoreSegment2 = semaphoreSegment;
            j2 = j;
        }
        SemaphoreSegment semaphoreSegment3 = (SemaphoreSegment) InlineList.m4198getSegmentimpl(findSegmentInternal);
        AtomicReferenceArray atomicReferenceArray = semaphoreSegment3.acquirers;
        int i = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
        if (GetCert$$ExternalSyntheticOutline0.m(atomicReferenceArray, i, waiter)) {
            waiter.invokeOnCancellation(semaphoreSegment3, i);
            return true;
        }
        if (!GetCert$$ExternalSyntheticOutline0.m(atomicReferenceArray, i, SemaphoreKt.PERMIT, SemaphoreKt.TAKEN)) {
            return false;
        }
        ((CancellableContinuation) waiter).resume(Unit.INSTANCE, this.onCancellationRelease);
        return true;
    }

    public final void release() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _availablePermits$volatile$FU;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.permits;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                Path$$ExternalSyntheticBUOutline0.m$1(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    public final boolean tryResumeNextFromQueue() {
        Object findSegmentInternal;
        String obj;
        long j;
        SemaphoreSegment semaphoreSegment;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
        atomicReferenceFieldUpdater.getClass();
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        long j2 = head$volatile$FU$offset;
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) unsafe.getObjectVolatile(this, j2);
        long andIncrement = deqIdx$volatile$FU.getAndIncrement(this);
        long j3 = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        loop0: while (true) {
            findSegmentInternal = InlineList.findSegmentInternal(semaphoreSegment2, j3, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (InlineList.m4199isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m4198getSegmentimpl = InlineList.m4198getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, j2);
                j = j2;
                semaphoreSegment = semaphoreSegment2;
                if (segment.id >= m4198getSegmentimpl.id) {
                    break loop0;
                }
                if (!m4198getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (!GetCert$$ExternalSyntheticOutline0.m(atomicReferenceFieldUpdater, this, segment, m4198getSegmentimpl)) {
                    if (m4198getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m4198getSegmentimpl.remove();
                    }
                    semaphoreSegment2 = semaphoreSegment;
                    j2 = j;
                } else if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
            }
            semaphoreSegment2 = semaphoreSegment;
            j2 = j;
        }
        SemaphoreSegment semaphoreSegment3 = (SemaphoreSegment) InlineList.m4198getSegmentimpl(findSegmentInternal);
        AtomicReferenceArray atomicReferenceArray = semaphoreSegment3.acquirers;
        semaphoreSegment3.cleanPrev();
        if (semaphoreSegment3.id <= j3) {
            int i = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
            Object andSet = atomicReferenceArray.getAndSet(i, SemaphoreKt.PERMIT);
            if (andSet == null) {
                int i2 = SemaphoreKt.MAX_SPIN_CYCLES;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == SemaphoreKt.TAKEN) {
                        return true;
                    }
                }
                return !GetCert$$ExternalSyntheticOutline0.m(atomicReferenceArray, i, SemaphoreKt.PERMIT, SemaphoreKt.BROKEN);
            }
            if (andSet != SemaphoreKt.CANCELLED) {
                if (!(andSet instanceof CancellableContinuation)) {
                    if (andSet instanceof SelectInstance) {
                        return ((SelectImplementation) ((SelectInstance) andSet)).trySelect(this, Unit.INSTANCE);
                    }
                    obj = ("unexpected: " + andSet).toString();
                    a$$ExternalSyntheticBUOutline0.m$1(obj);
                    return false;
                }
                CancellableContinuation cancellableContinuation = (CancellableContinuation) andSet;
                Symbol tryResume = cancellableContinuation.tryResume(Unit.INSTANCE, this.onCancellationRelease);
                if (tryResume != null) {
                    cancellableContinuation.completeResume(tryResume);
                    return true;
                }
            }
        }
        return false;
    }
}
