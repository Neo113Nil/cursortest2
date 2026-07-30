package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class yj2 {
    public static final xj2 Companion = new xj2();
    public static final wj2 Y1f8riQaR6yg = new wj2();
    public boolean PxuCJdSBwIXG;
    public long TSizfFm2Yiuu;
    public long lS5Rgt96tfkO;

    public yj2 PxuCJdSBwIXG() {
        this.PxuCJdSBwIXG = false;
        return this;
    }

    public yj2 RAsUl2FVSrh6(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.TSizfFm2Yiuu = timeUnit.toNanos(j);
            return this;
        }
        u9.OPXfSBeufaJ8("timeout < 0: ", j);
        return null;
    }

    public long TSizfFm2Yiuu() {
        if (this.PxuCJdSBwIXG) {
            return this.lS5Rgt96tfkO;
        }
        u9.rtx2ld2ELZv4("No deadline");
        return 0L;
    }

    public yj2 Y1f8riQaR6yg(long j) {
        this.PxuCJdSBwIXG = true;
        this.lS5Rgt96tfkO = j;
        return this;
    }

    public void a92UlCVFR9N8() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.PxuCJdSBwIXG && this.lS5Rgt96tfkO - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean e9gEMXR7LXtO() {
        return this.PxuCJdSBwIXG;
    }

    public yj2 lS5Rgt96tfkO() {
        this.TSizfFm2Yiuu = 0L;
        return this;
    }

    public long rtx2ld2ELZv4() {
        return this.TSizfFm2Yiuu;
    }
}
