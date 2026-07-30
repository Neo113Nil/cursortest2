package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class xa extends yj2 {
    private static final va Companion = new va();
    public static xa OPXfSBeufaJ8;
    public static final long cpQdD2nAriOS;
    public static final Condition dgRBjINgWbAK;
    public static final um rtx2ld2ELZv4;
    public static final ReentrantLock wdg6QnbFHrFF;
    public static final long x50lh2ztY7Y5;
    public long RAsUl2FVSrh6;
    public int a92UlCVFR9N8 = -1;
    public int e9gEMXR7LXtO;

    static {
        um umVar = new um(6);
        umVar.TSizfFm2Yiuu = new xa[8];
        rtx2ld2ELZv4 = umVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        wdg6QnbFHrFF = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        dgRBjINgWbAK = newCondition;
        x50lh2ztY7Y5 = 60000L;
        cpQdD2nAriOS = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final boolean dgRBjINgWbAK() {
        ReentrantLock reentrantLock = wdg6QnbFHrFF;
        reentrantLock.lock();
        try {
            int i = this.e9gEMXR7LXtO;
            this.e9gEMXR7LXtO = 0;
            if (i != 1) {
                return i == 2;
            }
            rtx2ld2ELZv4.x50lh2ztY7Y5(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void wdg6QnbFHrFF() {
        long j = this.TSizfFm2Yiuu;
        boolean z = this.PxuCJdSBwIXG;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = wdg6QnbFHrFF;
            reentrantLock.lock();
            try {
                if (this.e9gEMXR7LXtO != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e9gEMXR7LXtO = 1;
                va.PxuCJdSBwIXG(Companion, this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public IOException x50lh2ztY7Y5(IOException iOException) {
        throw null;
    }

    public void cpQdD2nAriOS() {
    }
}
