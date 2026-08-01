package v1;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e b2;
        while (true) {
            try {
                reentrantLock = e.h;
                reentrantLock.lock();
                try {
                    b2 = i1.m.b();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (b2 == e.f4483l) {
                e.f4483l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (b2 != null) {
                    b2.j();
                }
            }
        }
    }
}
