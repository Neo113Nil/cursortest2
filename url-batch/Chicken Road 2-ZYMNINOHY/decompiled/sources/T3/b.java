package T3;

import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e b4;
        while (true) {
            try {
                reentrantLock = e.f2964h;
                reentrantLock.lock();
                try {
                    b4 = AbstractC0347t0.b();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (b4 == e.f2968l) {
                e.f2968l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (b4 != null) {
                    b4.j();
                }
            }
        }
    }
}
