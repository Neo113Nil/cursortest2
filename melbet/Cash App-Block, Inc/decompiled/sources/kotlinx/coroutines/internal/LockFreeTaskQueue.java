package kotlinx.coroutines.internal;

import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public class LockFreeTaskQueue {
    public static final /* synthetic */ AtomicReferenceFieldUpdater _cur$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long _cur$volatile$FU$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(LockFreeTaskQueue.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new LockFreeTaskQueueCore(8, false);

    public final boolean addLast(Runnable runnable) {
        LockFreeTaskQueue lockFreeTaskQueue;
        while (true) {
            _cur$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _cur$volatile$FU$offset;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) unsafe.getObjectVolatile(this, j);
            int addLast = lockFreeTaskQueueCore.addLast(runnable);
            if (addLast == 0) {
                return true;
            }
            if (addLast == 1) {
                LockFreeTaskQueueCore next = lockFreeTaskQueueCore.next();
                while (true) {
                    Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    lockFreeTaskQueue = this;
                    if (!unsafe2.compareAndSwapObject(lockFreeTaskQueue, _cur$volatile$FU$offset, lockFreeTaskQueueCore, next) && unsafe2.getObjectVolatile(lockFreeTaskQueue, j) == lockFreeTaskQueueCore) {
                        this = lockFreeTaskQueue;
                    }
                }
            } else {
                if (addLast == 2) {
                    return false;
                }
                lockFreeTaskQueue = this;
            }
            this = lockFreeTaskQueue;
        }
    }

    public final void close() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$volatile$FU;
            atomicReferenceFieldUpdater.getClass();
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _cur$volatile$FU$offset);
            if (lockFreeTaskQueueCore.close()) {
                return;
            } else {
                GetCert$$ExternalSyntheticOutline0.m(atomicReferenceFieldUpdater, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.next());
            }
        }
    }

    public final int getSize() {
        _cur$volatile$FU.getClass();
        LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _cur$volatile$FU$offset);
        lockFreeTaskQueueCore.getClass();
        long j = LockFreeTaskQueueCore._state$volatile$FU.get(lockFreeTaskQueueCore);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object removeFirstOrNull() {
        LockFreeTaskQueue lockFreeTaskQueue;
        while (true) {
            _cur$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _cur$volatile$FU$offset;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) unsafe.getObjectVolatile(this, j);
            Object removeFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
            if (removeFirstOrNull != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                return removeFirstOrNull;
            }
            LockFreeTaskQueueCore next = lockFreeTaskQueueCore.next();
            while (true) {
                Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                lockFreeTaskQueue = this;
                if (!unsafe2.compareAndSwapObject(lockFreeTaskQueue, _cur$volatile$FU$offset, lockFreeTaskQueueCore, next) && unsafe2.getObjectVolatile(lockFreeTaskQueue, j) == lockFreeTaskQueueCore) {
                    this = lockFreeTaskQueue;
                }
            }
            this = lockFreeTaskQueue;
        }
    }
}
