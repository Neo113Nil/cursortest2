package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ky0 extends hy0 {
    public boolean p;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        if (!this.p) {
            b();
        }
        this.n = true;
    }

    @Override // defpackage.hy0, defpackage.pn2
    public final long h(long j, fq fqVar) {
        fqVar.getClass();
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.n) {
            lh.g("closed");
            return 0L;
        }
        if (this.p) {
            return -1L;
        }
        long h = super.h(j, fqVar);
        if (h != -1) {
            return h;
        }
        this.p = true;
        b();
        return -1L;
    }
}
