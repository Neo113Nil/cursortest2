package n6;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        d h7;
        while (true) {
            try {
                A.j jVar = d.f5510h;
                reentrantLock = d.f5512j;
                reentrantLock.lock();
                try {
                    h7 = U0.h.h();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (h7 == d.f5511i) {
                d.f5511i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (h7 != null) {
                    h7.k();
                }
            }
        }
    }
}
