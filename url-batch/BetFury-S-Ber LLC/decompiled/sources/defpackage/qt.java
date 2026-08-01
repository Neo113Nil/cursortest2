package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qt extends nt {
    public boolean i;

    @Override // defpackage.nt, defpackage.ke0
    public final long c(long j, t9 t9Var) {
        if (this.g) {
            s9.u("closed");
            return 0L;
        }
        if (this.i) {
            return -1L;
        }
        long c = super.c(8192L, t9Var);
        if (c != -1) {
            return c;
        }
        this.i = true;
        i();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        if (!this.i) {
            i();
        }
        this.g = true;
    }
}
