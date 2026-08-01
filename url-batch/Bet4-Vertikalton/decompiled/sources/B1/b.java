package B1;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e f2;
        while (true) {
            try {
                reentrantLock = e.h;
                reentrantLock.lock();
                try {
                    f2 = w1.l.f();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (f2 == e.f64l) {
                e.f64l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (f2 != null) {
                    f2.j();
                }
            }
        }
    }
}
