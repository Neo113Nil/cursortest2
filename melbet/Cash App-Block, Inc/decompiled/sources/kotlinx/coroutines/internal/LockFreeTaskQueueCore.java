package kotlinx.coroutines.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class LockFreeTaskQueueCore {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: array, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1542array;
    public final int capacity;
    public final int mask;
    public final boolean singleConsumer;
    public static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long _next$volatile$FU$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(LockFreeTaskQueueCore.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater _state$volatile$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");
    public static final Symbol REMOVE_FROZEN = new Symbol("REMOVE_FROZEN", 0);

    public final class Placeholder {
        public final int index;

        public Placeholder(int i) {
            this.index = i;
        }
    }

    public LockFreeTaskQueueCore(int i, boolean z) {
        this.capacity = i;
        this.singleConsumer = z;
        int i2 = i - 1;
        this.mask = i2;
        this.f1542array = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        throw null;
    }

    public final int addLast(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.mask;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.singleConsumer;
            AtomicReferenceArray atomicReferenceArray = this.f1542array;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                LockFreeTaskQueueCore lockFreeTaskQueueCore = this;
                if (_state$volatile$FU.compareAndSet(lockFreeTaskQueueCore, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    LockFreeTaskQueueCore lockFreeTaskQueueCore2 = lockFreeTaskQueueCore;
                    while ((atomicLongFieldUpdater.get(lockFreeTaskQueueCore2) & 1152921504606846976L) != 0) {
                        lockFreeTaskQueueCore2 = lockFreeTaskQueueCore2.next();
                        AtomicReferenceArray atomicReferenceArray2 = lockFreeTaskQueueCore2.f1542array;
                        int i4 = lockFreeTaskQueueCore2.mask & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof Placeholder) && ((Placeholder) obj2).index == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            lockFreeTaskQueueCore2 = null;
                        }
                        if (lockFreeTaskQueueCore2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = lockFreeTaskQueueCore;
            } else {
                int i5 = this.capacity;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final LockFreeTaskQueueCore allocateOrGetNextCopy(long j) {
        LockFreeTaskQueueCore lockFreeTaskQueueCore;
        while (true) {
            _next$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j2 = _next$volatile$FU$offset;
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) unsafe.getObjectVolatile(this, j2);
            if (lockFreeTaskQueueCore2 != null) {
                return lockFreeTaskQueueCore2;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore3 = new LockFreeTaskQueueCore(this.capacity * 2, this.singleConsumer);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.mask;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.f1542array.get(i4);
                if (obj == null) {
                    obj = new Placeholder(i);
                }
                lockFreeTaskQueueCore3.f1542array.set(lockFreeTaskQueueCore3.mask & i, obj);
                i++;
            }
            _state$volatile$FU.set(lockFreeTaskQueueCore3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                lockFreeTaskQueueCore = this;
                if (!unsafe2.compareAndSwapObject(lockFreeTaskQueueCore, _next$volatile$FU$offset, (Object) null, lockFreeTaskQueueCore3) && unsafe2.getObjectVolatile(lockFreeTaskQueueCore, j2) == null) {
                    this = lockFreeTaskQueueCore;
                }
            }
            this = lockFreeTaskQueueCore;
        }
    }

    public final boolean close() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore = this;
            if (atomicLongFieldUpdater.compareAndSet(lockFreeTaskQueueCore, j, 2305843009213693952L | j)) {
                return true;
            }
            this = lockFreeTaskQueueCore;
        }
    }

    public final LockFreeTaskQueueCore next() {
        long j;
        LockFreeTaskQueueCore lockFreeTaskQueueCore;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                lockFreeTaskQueueCore = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            lockFreeTaskQueueCore = this;
            if (atomicLongFieldUpdater.compareAndSet(lockFreeTaskQueueCore, j, j2)) {
                j = j2;
                break;
            }
            this = lockFreeTaskQueueCore;
        }
        return lockFreeTaskQueueCore.allocateOrGetNextCopy(j);
    }

    public final Object removeFirstOrNull() {
        LockFreeTaskQueueCore lockFreeTaskQueueCore = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
            long j = atomicLongFieldUpdater.get(lockFreeTaskQueueCore);
            if ((j & 1152921504606846976L) != 0) {
                return REMOVE_FROZEN;
            }
            int i = (int) (j & 1073741823);
            int i2 = lockFreeTaskQueueCore.mask;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = lockFreeTaskQueueCore.f1542array;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = lockFreeTaskQueueCore.singleConsumer;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof Placeholder) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (_state$volatile$FU.compareAndSet(lockFreeTaskQueueCore, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                lockFreeTaskQueueCore = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(lockFreeTaskQueueCore);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            lockFreeTaskQueueCore = lockFreeTaskQueueCore.next();
                        } else {
                            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = lockFreeTaskQueueCore;
                            if (_state$volatile$FU.compareAndSet(lockFreeTaskQueueCore2, j3, (j3 & (-1073741824)) | j2)) {
                                lockFreeTaskQueueCore2.f1542array.set(i4 & lockFreeTaskQueueCore2.mask, null);
                                lockFreeTaskQueueCore = null;
                            } else {
                                lockFreeTaskQueueCore = lockFreeTaskQueueCore2;
                            }
                        }
                        if (lockFreeTaskQueueCore == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
