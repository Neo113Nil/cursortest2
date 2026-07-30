package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class em1 {
    public int OPXfSBeufaJ8;
    public int rtx2ld2ELZv4;
    public long x50lh2ztY7Y5;
    public long wdg6QnbFHrFF = 0;
    public long dgRBjINgWbAK = fm1.PxuCJdSBwIXG;

    public em1() {
        wq0.Companion.getClass();
        this.x50lh2ztY7Y5 = 0L;
    }

    public int D0aTLcX6Uhyo() {
        return (int) (this.wdg6QnbFHrFF & 4294967295L);
    }

    public int JTxCbbCwomzt() {
        return (int) (this.wdg6QnbFHrFF >> 32);
    }

    public final void fRTaYY6FBZcX(long j) {
        if (ir0.PxuCJdSBwIXG(this.wdg6QnbFHrFF, j)) {
            return;
        }
        this.wdg6QnbFHrFF = j;
        rxipThha848g();
    }

    public abstract void hVNtCUZb4tYH(long j, float f, le0 le0Var);

    public final void rxipThha848g() {
        this.rtx2ld2ELZv4 = ng0.wdg6QnbFHrFF((int) (this.wdg6QnbFHrFF >> 32), rr.wdg6QnbFHrFF(this.dgRBjINgWbAK), rr.rtx2ld2ELZv4(this.dgRBjINgWbAK));
        this.OPXfSBeufaJ8 = ng0.wdg6QnbFHrFF((int) (this.wdg6QnbFHrFF & 4294967295L), rr.OPXfSBeufaJ8(this.dgRBjINgWbAK), rr.RAsUl2FVSrh6(this.dgRBjINgWbAK));
        int i = this.rtx2ld2ELZv4;
        long j = this.wdg6QnbFHrFF;
        this.x50lh2ztY7Y5 = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public final void v6yxfmkxNKhL(long j) {
        if (rr.lS5Rgt96tfkO(this.dgRBjINgWbAK, j)) {
            return;
        }
        this.dgRBjINgWbAK = j;
        rxipThha848g();
    }

    public Object wdg6QnbFHrFF() {
        return null;
    }

    public abstract int yQRudnv4La6p(u uVar);
}
