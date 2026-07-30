package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
final class o0 extends j {
    public static final o0 INSTANCE = new o0();
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, f6.l> exceptionCtors = new WeakHashMap<>();

    private o0() {
    }

    @Override // kotlinx.coroutines.internal.j
    public f6.l get(Class<? extends Throwable> cls) {
        f6.l createConstructor;
        ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            f6.l lVar = exceptionCtors.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i8 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i9 = 0; i9 < readHoldCount; i9++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, f6.l> weakHashMap = exceptionCtors;
                f6.l lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                createConstructor = ExceptionsConstructorKt.createConstructor(cls);
                weakHashMap.put(cls, createConstructor);
                while (i8 < readHoldCount) {
                    readLock2.lock();
                    i8++;
                }
                writeLock.unlock();
                return createConstructor;
            } finally {
                while (i8 < readHoldCount) {
                    readLock2.lock();
                    i8++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
