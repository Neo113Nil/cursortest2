package C1;

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
                    f2 = x1.d.f();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (f2 == e.f177l) {
                e.f177l = null;
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
