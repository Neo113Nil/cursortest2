package j5;

import G0.F;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        d l2;
        while (true) {
            try {
                F f3 = d.f10481h;
                reentrantLock = d.f10483j;
                reentrantLock.lock();
                try {
                    l2 = W1.e.l();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (l2 == d.f10482i) {
                d.f10482i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (l2 != null) {
                    l2.k();
                }
            }
        }
    }
}
