package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class w60 implements Runnable, Comparable, s00 {
    public int OPXfSBeufaJ8 = -1;
    private volatile Object _heap;
    public long rtx2ld2ELZv4;

    public w60(long j) {
        this.rtx2ld2ELZv4 = j;
    }

    @Override // defpackage.s00
    public final void PxuCJdSBwIXG() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                f50 f50Var = f2.OPXfSBeufaJ8;
                if (obj == f50Var) {
                    return;
                }
                x60 x60Var = obj instanceof x60 ? (x60) obj : null;
                if (x60Var != null) {
                    synchronized (x60Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof qj2 ? (qj2) obj2 : null) != null) {
                            x60Var.lS5Rgt96tfkO(this.OPXfSBeufaJ8);
                        }
                    }
                }
                this._heap = f50Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y1f8riQaR6yg(x60 x60Var) {
        if (this._heap != f2.OPXfSBeufaJ8) {
            this._heap = x60Var;
        } else {
            u9.XL4ISE6Oc65B("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.rtx2ld2ELZv4 - ((w60) obj).rtx2ld2ELZv4;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int lS5Rgt96tfkO(long j, x60 x60Var, y60 y60Var) {
        synchronized (this) {
            if (this._heap == f2.OPXfSBeufaJ8) {
                return 2;
            }
            synchronized (x60Var) {
                try {
                    w60[] w60VarArr = x60Var.PxuCJdSBwIXG;
                    w60 w60Var = w60VarArr != null ? w60VarArr[0] : null;
                    if (y60.gPXPFXrUH4XX.get(y60Var) != 0) {
                        return 1;
                    }
                    if (w60Var == null) {
                        x60Var.TSizfFm2Yiuu = j;
                    } else {
                        long j2 = w60Var.rtx2ld2ELZv4;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - x60Var.TSizfFm2Yiuu > 0) {
                            x60Var.TSizfFm2Yiuu = j;
                        }
                    }
                    long j3 = this.rtx2ld2ELZv4;
                    long j4 = x60Var.TSizfFm2Yiuu;
                    if (j3 - j4 < 0) {
                        this.rtx2ld2ELZv4 = j4;
                    }
                    x60Var.PxuCJdSBwIXG(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.rtx2ld2ELZv4 + ']';
    }
}
