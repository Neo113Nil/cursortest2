package p3;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
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
                    b2 = l0.g.b();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (b2 == e.f3025l) {
                e.f3025l = null;
                reentrantLock.unlock();
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
