package W2;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3437n = 2;

    public /* synthetic */ d(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        u8.c k6;
        switch (this.f3437n) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            case 1:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                G1.a aVar = u8.c.f41264h;
                reentrantLock = u8.c.f41265j;
                reentrantLock.lock();
                try {
                    k6 = C3.e.k();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
                continue;
            }
            if (k6 == u8.c.i) {
                u8.c.i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (k6 != null) {
                    k6.k();
                }
            }
        }
    }

    public /* synthetic */ d(String str) {
        super(str);
    }

    public /* synthetic */ d(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
