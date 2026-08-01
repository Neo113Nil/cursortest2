package F1;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e d;
        while (true) {
            try {
                reentrantLock = e.f239h;
                reentrantLock.lock();
                try {
                    d = A1.m.d();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (d == e.f242l) {
                e.f242l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (d != null) {
                    d.j();
                }
            }
        }
    }
}
