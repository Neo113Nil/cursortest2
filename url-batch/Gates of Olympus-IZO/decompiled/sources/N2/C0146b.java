package N2;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: N2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0149e j3;
        while (true) {
            try {
                reentrantLock = C0149e.f2920h;
                reentrantLock.lock();
                try {
                    j3 = I2.l.j();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (j3 == C0149e.f2924l) {
                C0149e.f2924l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (j3 != null) {
                    j3.j();
                }
            }
        }
    }
}
