package kotlinx.coroutines.sync;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import com.squareup.cash.common.ui.ColorModelsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.internal.Perfs$$ExternalSyntheticLambda2;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class MutexImpl extends SemaphoreAndMutexImpl implements Mutex {
    public static final /* synthetic */ AtomicReferenceFieldUpdater owner$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long owner$volatile$FU$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(MutexImpl.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public final class CancellableContinuationWithOwner implements CancellableContinuation, Waiter {
        public final CancellableContinuationImpl cont;

        public CancellableContinuationWithOwner(CancellableContinuationImpl cancellableContinuationImpl) {
            this.cont = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final boolean cancel(Throwable th) {
            return this.cont.cancel(th);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final void completeResume(Object obj) {
            this.cont.completeResume(obj);
        }

        @Override // kotlin.coroutines.Continuation
        public final CoroutineContext getContext() {
            return this.cont.context;
        }

        @Override // kotlinx.coroutines.Waiter
        public final void invokeOnCancellation(Segment segment, int i) {
            this.cont.invokeOnCancellation(segment, i);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final void resume(Object obj, Function3 function3) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.owner$volatile$FU;
            MutexImpl mutexImpl = MutexImpl.this;
            atomicReferenceFieldUpdater.set(mutexImpl, null);
            Perfs$$ExternalSyntheticLambda2 perfs$$ExternalSyntheticLambda2 = new Perfs$$ExternalSyntheticLambda2(5, mutexImpl, this);
            CancellableContinuationImpl cancellableContinuationImpl = this.cont;
            cancellableContinuationImpl.resumeImpl$kotlinx_coroutines_core((Unit) obj, cancellableContinuationImpl.resumeMode, new ColorModelsKt$$ExternalSyntheticLambda0(perfs$$ExternalSyntheticLambda2, 7));
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            this.cont.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final Symbol tryResume(Object obj, Function3 function3) {
            MutexImpl mutexImpl = MutexImpl.this;
            CardAppletTile$$ExternalSyntheticLambda1 cardAppletTile$$ExternalSyntheticLambda1 = new CardAppletTile$$ExternalSyntheticLambda1(mutexImpl, this);
            Symbol tryResumeImpl = this.cont.tryResumeImpl((Unit) obj, cardAppletTile$$ExternalSyntheticLambda1);
            if (tryResumeImpl != null) {
                MutexImpl.owner$volatile$FU.set(mutexImpl, null);
            }
            return tryResumeImpl;
        }
    }

    public MutexImpl() {
        super(1);
        this.owner$volatile = MutexKt.NO_OWNER;
    }

    public final int holdsLockImpl(Object obj) {
        while (isLocked()) {
            owner$volatile$FU.getClass();
            Object objectVolatile = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, owner$volatile$FU$offset);
            if (objectVolatile != MutexKt.NO_OWNER) {
                return objectVolatile == obj ? 1 : 2;
            }
        }
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean isLocked() {
        return Math.max(SemaphoreAndMutexImpl._availablePermits$volatile$FU.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0023, code lost:
    
        r0.resume(kotlin.Unit.INSTANCE, r3.onCancellationRelease);
     */
    @Override // kotlinx.coroutines.sync.Mutex
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lock(Continuation continuation) {
        if (tryLock(null)) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl orCreateCancellableContinuation = JobKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        try {
            CancellableContinuationWithOwner cancellableContinuationWithOwner = new CancellableContinuationWithOwner(orCreateCancellableContinuation);
            while (true) {
                int andDecrement = SemaphoreAndMutexImpl._availablePermits$volatile$FU.getAndDecrement(this);
                if (andDecrement <= this.permits) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (addAcquireToQueue(cancellableContinuationWithOwner)) {
                        break;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(JobKt.getHexAddress(this));
        sb.append("[isLocked=");
        sb.append(isLocked());
        sb.append(",owner=");
        owner$volatile$FU.getClass();
        return Recorder$$ExternalSyntheticOutline1.m(sb, ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, owner$volatile$FU$offset), ']');
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean tryLock(Object obj) {
        String obj2;
        int tryLockImpl = tryLockImpl(obj);
        if (tryLockImpl == 0) {
            return true;
        }
        if (tryLockImpl == 1) {
            return false;
        }
        if (tryLockImpl != 2) {
            a$$ExternalSyntheticBUOutline0.m$1("unexpected");
            return false;
        }
        obj2 = ("This mutex is already locked by the specified owner: " + obj).toString();
        a$$ExternalSyntheticBUOutline0.m$1(obj2);
        return false;
    }

    public final int tryLockImpl(Object obj) {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = SemaphoreAndMutexImpl._availablePermits$volatile$FU;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.permits;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else if (i2 <= 0) {
                if (obj == null) {
                    break;
                }
                int holdsLockImpl = holdsLockImpl(obj);
                if (holdsLockImpl == 1) {
                    return 2;
                }
                if (holdsLockImpl == 2) {
                    break;
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                owner$volatile$FU.getClass();
                ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, owner$volatile$FU$offset, obj);
                return 0;
            }
        }
        return 1;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void unlock(Object obj) {
        while (this.isLocked()) {
            owner$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = owner$volatile$FU$offset;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            Symbol symbol = MutexKt.NO_OWNER;
            if (objectVolatile != symbol) {
                if (objectVolatile != obj && obj != null) {
                    Path$$ExternalSyntheticBUOutline0.m(objectVolatile, ", but ", obj, " is expected", "This mutex is locked by ");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    MutexImpl mutexImpl = this;
                    if (unsafe2.compareAndSwapObject(mutexImpl, owner$volatile$FU$offset, objectVolatile, symbol)) {
                        mutexImpl.release();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(mutexImpl, j) != objectVolatile) {
                            this = mutexImpl;
                            break;
                        }
                        this = mutexImpl;
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$1("This mutex is not locked");
    }
}
