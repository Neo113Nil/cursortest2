package x1;

import java.util.concurrent.locks.ReentrantLock;
import k0.y;

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
                    b2 = y.b();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (b2 == e.f4231l) {
                e.f4231l = null;
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
