package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class i7 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        l7 e;
        while (true) {
            try {
                reentrantLock = l7.h;
                reentrantLock.lock();
                try {
                    e = vw.e();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (e == l7.l) {
                l7.l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (e != null) {
                    e.j();
                }
            }
        }
    }
}
