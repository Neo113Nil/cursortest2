package T6;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        d i2;
        while (true) {
            try {
                B6.p pVar = d.f2604h;
                reentrantLock = d.j;
                reentrantLock.lock();
                try {
                    i2 = c2.e.i();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (i2 == d.f2605i) {
                d.f2605i = null;
                return;
            }
            Unit unit = Unit.f6114a;
            reentrantLock.unlock();
            if (i2 != null) {
                i2.k();
            }
        }
    }
}
