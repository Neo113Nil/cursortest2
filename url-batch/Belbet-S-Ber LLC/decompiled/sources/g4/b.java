package g4;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
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
                    b2 = b4.l.b();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (b2 == e.f1930l) {
                e.f1930l = null;
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
