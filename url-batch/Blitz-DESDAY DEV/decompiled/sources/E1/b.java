package E1;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e k2;
        while (true) {
            try {
                reentrantLock = e.h;
                reentrantLock.lock();
                try {
                    k2 = z1.l.k();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (k2 == e.f197l) {
                e.f197l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (k2 != null) {
                    k2.j();
                }
            }
        }
    }
}
