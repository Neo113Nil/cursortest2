package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class uq0 implements pn2 {
    public final pn2 m;

    public uq0(pn2 pn2Var) {
        pn2Var.getClass();
        this.m = pn2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.m.close();
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return this.m.e();
    }

    @Override // defpackage.pn2
    public long h(long j, fq fqVar) {
        fqVar.getClass();
        return this.m.h(j, fqVar);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.m + ')';
    }
}
