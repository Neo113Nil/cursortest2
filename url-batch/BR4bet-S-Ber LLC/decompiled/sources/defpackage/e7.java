package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class e7 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        h7 c;
        while (true) {
            try {
                reentrantLock = h7.h;
                reentrantLock.lock();
                try {
                    c = xf.c();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c == h7.l) {
                h7.l = null;
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
