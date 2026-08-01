package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ln extends in {
    public boolean i;

    @Override // defpackage.in, defpackage.f30
    public final long b(long j, u8 u8Var) {
        if (this.g) {
            t8.t("closed");
            return 0L;
        }
        if (this.i) {
            return -1L;
        }
        long b = super.b(8192L, u8Var);
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
