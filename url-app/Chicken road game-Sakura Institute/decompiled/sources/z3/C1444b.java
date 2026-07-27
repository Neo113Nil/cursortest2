package z3;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1444b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C1447e d4;
        while (true) {
            try {
                reentrantLock = C1447e.f11990h;
                reentrantLock.lock();
                try {
                    d4 = m3.u.d();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (d4 == C1447e.f11994l) {
                C1447e.f11994l = null;
                return;
            }
            Unit unit = Unit.f7487a;
            reentrantLock.unlock();
            if (d4 != null) {
                d4.j();
            }
        }
    }
}
