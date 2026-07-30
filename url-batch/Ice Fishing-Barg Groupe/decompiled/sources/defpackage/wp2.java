package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wp2 implements sp2 {
    public final long OPXfSBeufaJ8;
    public final up2 rtx2ld2ELZv4;
    public final long wdg6QnbFHrFF = 0;

    public wp2(up2 up2Var) {
        this.rtx2ld2ELZv4 = up2Var;
        this.OPXfSBeufaJ8 = (up2Var.r3s1LDPKFs1S() + up2Var.dgRBjINgWbAK()) * 1000000;
    }

    @Override // defpackage.sp2
    public final boolean PxuCJdSBwIXG() {
        return true;
    }

    @Override // defpackage.sp2
    public final o8 QrzZRwfaDlRX(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return this.rtx2ld2ELZv4.QrzZRwfaDlRX(TSizfFm2Yiuu(j), o8Var, o8Var2, Y1f8riQaR6yg(j, o8Var, o8Var3, o8Var2));
    }

    public final long TSizfFm2Yiuu(long j) {
        long j2 = j + this.wdg6QnbFHrFF;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.OPXfSBeufaJ8;
        long j4 = j2 / j3;
        return j4 % 2 == 0 ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    public final o8 Y1f8riQaR6yg(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        long j2 = this.wdg6QnbFHrFF;
        long j3 = j + j2;
        long j4 = this.OPXfSBeufaJ8;
        return j3 > j4 ? this.rtx2ld2ELZv4.x50lh2ztY7Y5(j4 - j2, o8Var, o8Var3, o8Var2) : o8Var2;
    }

    @Override // defpackage.sp2
    public final long lS5Rgt96tfkO(o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.sp2
    public final o8 x50lh2ztY7Y5(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return this.rtx2ld2ELZv4.x50lh2ztY7Y5(TSizfFm2Yiuu(j), o8Var, o8Var2, Y1f8riQaR6yg(j, o8Var, o8Var3, o8Var2));
    }
}
