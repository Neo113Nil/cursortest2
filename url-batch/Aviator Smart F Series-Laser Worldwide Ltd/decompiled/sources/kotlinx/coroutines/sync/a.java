package kotlinx.coroutines.sync;

import kotlin.coroutines.c;

/* loaded from: classes5.dex */
public interface a {
    Object acquire(c cVar);

    int getAvailablePermits();

    void release();

    boolean tryAcquire();
}
