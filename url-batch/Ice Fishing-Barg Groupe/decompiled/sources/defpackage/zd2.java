package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zd2 {
    public final be2 PxuCJdSBwIXG;
    public boolean TSizfFm2Yiuu;
    public td2 Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public final ArrayList e9gEMXR7LXtO = new ArrayList();
    public final String lS5Rgt96tfkO;

    public zd2(be2 be2Var, String str) {
        this.PxuCJdSBwIXG = be2Var;
        this.lS5Rgt96tfkO = str;
    }

    public static void lS5Rgt96tfkO(zd2 zd2Var, String str, long j, ae0 ae0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        zd2Var.getClass();
        str.getClass();
        ae0Var.getClass();
        zd2Var.TSizfFm2Yiuu(new yd2(str, z, ae0Var), j);
    }

    public final boolean PxuCJdSBwIXG() {
        td2 td2Var = this.Y1f8riQaR6yg;
        if (td2Var != null && td2Var.lS5Rgt96tfkO) {
            this.a92UlCVFR9N8 = true;
        }
        ArrayList arrayList = this.e9gEMXR7LXtO;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((td2) arrayList.get(size)).lS5Rgt96tfkO) {
                Logger logger = this.PxuCJdSBwIXG.lS5Rgt96tfkO;
                td2 td2Var2 = (td2) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    kj0.Y1f8riQaR6yg(logger, td2Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void TSizfFm2Yiuu(td2 td2Var, long j) {
        td2Var.getClass();
        synchronized (this.PxuCJdSBwIXG) {
            if (!this.TSizfFm2Yiuu) {
                if (Y1f8riQaR6yg(td2Var, j, false)) {
                    this.PxuCJdSBwIXG.TSizfFm2Yiuu(this);
                }
                return;
            }
            boolean z = td2Var.lS5Rgt96tfkO;
            Logger logger = this.PxuCJdSBwIXG.lS5Rgt96tfkO;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    kj0.Y1f8riQaR6yg(logger, td2Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    kj0.Y1f8riQaR6yg(logger, td2Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean Y1f8riQaR6yg(td2 td2Var, long j, boolean z) {
        Logger logger = this.PxuCJdSBwIXG.lS5Rgt96tfkO;
        td2Var.getClass();
        zd2 zd2Var = td2Var.TSizfFm2Yiuu;
        if (zd2Var != this) {
            if (zd2Var != null) {
                u9.rtx2ld2ELZv4("task is in multiple queues");
                return false;
            }
            td2Var.TSizfFm2Yiuu = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e9gEMXR7LXtO;
        int indexOf = arrayList.indexOf(td2Var);
        if (indexOf != -1) {
            if (td2Var.Y1f8riQaR6yg <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    kj0.Y1f8riQaR6yg(logger, td2Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        td2Var.Y1f8riQaR6yg = j2;
        if (logger.isLoggable(Level.FINE)) {
            kj0.Y1f8riQaR6yg(logger, td2Var, this, z ? "run again after ".concat(kj0.pnx5pC0XzaCw(j2 - nanoTime)) : "scheduled after ".concat(kj0.pnx5pC0XzaCw(j2 - nanoTime)));
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((td2) obj).Y1f8riQaR6yg - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, td2Var);
        return i == 0;
    }

    public final void e9gEMXR7LXtO() {
        be2 be2Var = this.PxuCJdSBwIXG;
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        synchronized (be2Var) {
            this.TSizfFm2Yiuu = true;
            if (PxuCJdSBwIXG()) {
                this.PxuCJdSBwIXG.TSizfFm2Yiuu(this);
            }
        }
    }

    public final String toString() {
        return this.lS5Rgt96tfkO;
    }
}
