package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class n7 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        q7 h;
        while (true) {
            try {
                reentrantLock = q7.h;
                reentrantLock.lock();
                try {
                    h = bi.h();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (h == q7.l) {
                q7.l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (h != null) {
                    h.j();
                }
            }
        }
    }
}
