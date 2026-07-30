package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wa extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        va vaVar;
        ReentrantLock reentrantLock;
        va vaVar2;
        xa lS5Rgt96tfkO;
        va vaVar3;
        va vaVar4;
        while (true) {
            try {
                vaVar = xa.Companion;
                vaVar.getClass();
                reentrantLock = xa.wdg6QnbFHrFF;
                reentrantLock.lock();
                try {
                    vaVar2 = xa.Companion;
                    vaVar2.getClass();
                    lS5Rgt96tfkO = va.lS5Rgt96tfkO();
                    vaVar3 = xa.Companion;
                    vaVar3.getClass();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (lS5Rgt96tfkO == xa.OPXfSBeufaJ8) {
                vaVar4 = xa.Companion;
                vaVar4.getClass();
                xa.OPXfSBeufaJ8 = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (lS5Rgt96tfkO != null) {
                lS5Rgt96tfkO.cpQdD2nAriOS();
            }
        }
    }
}
