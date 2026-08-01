package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xp extends up {
    public boolean i;

    @Override // defpackage.up, defpackage.h60
    public final long b(long j, h9 h9Var) {
        if (this.g) {
            g9.s("closed");
            return 0L;
        }
        if (this.i) {
            return -1L;
        }
        long b = super.b(8192L, h9Var);
        if (b != -1) {
            return b;
        }
        this.i = true;
        f();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        if (!this.i) {
            f();
        }
        this.g = true;
    }
}
