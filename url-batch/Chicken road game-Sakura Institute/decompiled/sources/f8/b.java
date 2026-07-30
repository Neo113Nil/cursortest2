package f8;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e k8;
        while (true) {
            try {
                reentrantLock = e.f3589h;
                reentrantLock.lock();
                try {
                    k8 = a.a.k();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (k8 == e.f3593l) {
                e.f3593l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (k8 != null) {
                    k8.j();
                }
            }
        }
    }
}
