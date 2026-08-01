package E1;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e i;
        while (true) {
            try {
                reentrantLock = e.h;
                reentrantLock.lock();
                try {
                    i = z1.d.i();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (i == e.f198l) {
                e.f198l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (i != null) {
                    i.j();
                }
            }
        }
    }
}
