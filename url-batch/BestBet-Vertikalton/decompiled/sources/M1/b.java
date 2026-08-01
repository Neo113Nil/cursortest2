package M1;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e j2;
        while (true) {
            try {
                reentrantLock = e.h;
                reentrantLock.lock();
                try {
                    j2 = H1.l.j();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (j2 == e.f794l) {
                e.f794l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (j2 != null) {
                    j2.j();
                }
            }
        }
    }
}
