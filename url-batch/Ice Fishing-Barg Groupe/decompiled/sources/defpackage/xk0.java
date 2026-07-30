package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xk0 extends tk0 {
    public boolean x50lh2ztY7Y5;

    @Override // defpackage.tk0, defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return 0L;
        }
        if (this.x50lh2ztY7Y5) {
            return -1L;
        }
        long RAsUl2FVSrh6 = super.RAsUl2FVSrh6(8192L, yfVar);
        if (RAsUl2FVSrh6 != -1) {
            return RAsUl2FVSrh6;
        }
        this.x50lh2ztY7Y5 = true;
        lS5Rgt96tfkO(hj0.OPXfSBeufaJ8);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.wdg6QnbFHrFF) {
            return;
        }
        if (!this.x50lh2ztY7Y5) {
            lS5Rgt96tfkO(yk0.a92UlCVFR9N8);
        }
        this.wdg6QnbFHrFF = true;
    }
}
