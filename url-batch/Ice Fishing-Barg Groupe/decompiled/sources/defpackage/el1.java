package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class el1 implements o82 {
    public final yf OPXfSBeufaJ8;
    public long cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final ig rtx2ld2ELZv4;
    public z12 wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public el1(ig igVar) {
        this.rtx2ld2ELZv4 = igVar;
        yf PxuCJdSBwIXG = igVar.PxuCJdSBwIXG();
        this.OPXfSBeufaJ8 = PxuCJdSBwIXG;
        z12 z12Var = PxuCJdSBwIXG.rtx2ld2ELZv4;
        this.wdg6QnbFHrFF = z12Var;
        this.dgRBjINgWbAK = z12Var != null ? z12Var.lS5Rgt96tfkO : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r9 == r2.lS5Rgt96tfkO) goto L13;
     */
    @Override // defpackage.o82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        z12 z12Var;
        if (this.x50lh2ztY7Y5) {
            u9.rtx2ld2ELZv4("closed");
            return 0L;
        }
        z12 z12Var2 = this.wdg6QnbFHrFF;
        yf yfVar2 = this.OPXfSBeufaJ8;
        if (z12Var2 != null) {
            z12 z12Var3 = yfVar2.rtx2ld2ELZv4;
            if (z12Var2 == z12Var3) {
                int i = this.dgRBjINgWbAK;
                z12Var3.getClass();
            }
            u9.rtx2ld2ELZv4("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (!this.rtx2ld2ELZv4.r3s1LDPKFs1S(this.cpQdD2nAriOS + 1)) {
            return -1L;
        }
        if (this.wdg6QnbFHrFF == null && (z12Var = yfVar2.rtx2ld2ELZv4) != null) {
            this.wdg6QnbFHrFF = z12Var;
            this.dgRBjINgWbAK = z12Var.lS5Rgt96tfkO;
        }
        long min = Math.min(8192L, yfVar2.OPXfSBeufaJ8 - this.cpQdD2nAriOS);
        this.OPXfSBeufaJ8.a92UlCVFR9N8(yfVar, this.cpQdD2nAriOS, min);
        this.cpQdD2nAriOS += min;
        return min;
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4.TSizfFm2Yiuu();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x50lh2ztY7Y5 = true;
    }
}
