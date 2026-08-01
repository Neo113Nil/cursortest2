package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ao extends xn {
    public boolean i;

    @Override // defpackage.xn, defpackage.q30
    public final long b(long j, p8 p8Var) {
        if (this.g) {
            o8.t("closed");
            return 0L;
        }
        if (this.i) {
            return -1L;
        }
        long b = super.b(8192L, p8Var);
        if (b != -1) {
            return b;
        }
        this.i = true;
        m();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        if (!this.i) {
            m();
        }
        this.g = true;
    }
}
