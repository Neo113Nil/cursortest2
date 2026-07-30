package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wk0 extends t01 {
    public final qz1 m;
    public final gl0 n;
    public final String o;
    public final Closeable p;
    public boolean q;
    public p62 r;

    public wk0(qz1 qz1Var, gl0 gl0Var, String str, Closeable closeable) {
        this.m = qz1Var;
        this.n = gl0Var;
        this.o = str;
        this.p = closeable;
    }

    @Override // defpackage.t01, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.q = true;
            p62 p62Var = this.r;
            if (p62Var != null) {
                l.a(p62Var);
            }
            Closeable closeable = this.p;
            if (closeable != null) {
                l.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.t01
    public final yj1 m() {
        return null;
    }

    @Override // defpackage.t01
    public final synchronized pq n() {
        if (this.q) {
            throw new IllegalStateException("closed");
        }
        p62 p62Var = this.r;
        if (p62Var != null) {
            return p62Var;
        }
        pn2 l = this.n.l(this.m);
        l.getClass();
        p62 p62Var2 = new p62(l);
        this.r = p62Var2;
        return p62Var2;
    }
}
