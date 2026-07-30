package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oj extends Thread {
    public final /* synthetic */ int m = 0;

    public /* synthetic */ oj(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.m) {
            case 0:
                break;
            default:
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
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = rj.h;
                reentrantLock = rj.h;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                rj e = nj.e();
                if (e == rj.l) {
                    rj.l = null;
                    return;
                }
                Unit unit = Unit.a;
                reentrantLock.unlock();
                if (e != null) {
                    e.j();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public /* synthetic */ oj(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
