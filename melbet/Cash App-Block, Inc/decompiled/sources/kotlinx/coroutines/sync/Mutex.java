package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public interface Mutex {
    boolean isLocked();

    Object lock(Continuation continuation);

    boolean tryLock(Object obj);

    void unlock(Object obj);
}
