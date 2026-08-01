package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class u6 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        x6 c;
        while (true) {
            try {
                reentrantLock = x6.h;
                reentrantLock.lock();
                try {
                    c = o8.c();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c == x6.l) {
                x6.l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c != null) {
                    c.j();
                }
            }
        }
    }
}
