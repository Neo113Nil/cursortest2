package T2;

import a.AbstractC0235a;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: T2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0230e k3;
        while (true) {
            try {
                reentrantLock = C0230e.f4400h;
                reentrantLock.lock();
                try {
                    k3 = AbstractC0235a.k();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (k3 == C0230e.f4404l) {
                C0230e.f4404l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (k3 != null) {
                    k3.j();
                }
            }
        }
    }
}
