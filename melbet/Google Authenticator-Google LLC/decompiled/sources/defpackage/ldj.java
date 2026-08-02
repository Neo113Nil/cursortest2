package defpackage;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ldj extends lca {
    public static final ldj a = new ldj();
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap c = new WeakHashMap();

    @Override // defpackage.lca
    public final krt a(Class cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            krt krtVar = (krt) c.get(cls);
            if (krtVar != null) {
                return krtVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap weakHashMap = c;
                krt krtVar2 = (krt) weakHashMap.get(cls);
                if (krtVar2 != null) {
                    return krtVar2;
                }
                krt b2 = lck.b(cls);
                weakHashMap.put(cls, b2);
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                return b2;
            } finally {
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
