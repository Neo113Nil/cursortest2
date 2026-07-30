package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hs2 {
    public final int PxuCJdSBwIXG;
    public long TSizfFm2Yiuu;
    public long lS5Rgt96tfkO;

    public hs2(int i) {
        this.PxuCJdSBwIXG = i;
    }

    public static void lS5Rgt96tfkO(hs2 hs2Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (hs2Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = hs2Var.lS5Rgt96tfkO + j;
                hs2Var.lS5Rgt96tfkO = j3;
                long j4 = hs2Var.TSizfFm2Yiuu + j2;
                hs2Var.TSizfFm2Yiuu = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long PxuCJdSBwIXG() {
        return this.lS5Rgt96tfkO - this.TSizfFm2Yiuu;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.PxuCJdSBwIXG + ", total=" + this.lS5Rgt96tfkO + ", acknowledged=" + this.TSizfFm2Yiuu + ", unacknowledged=" + PxuCJdSBwIXG() + ')';
    }
}
