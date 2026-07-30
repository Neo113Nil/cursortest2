package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jk0 implements ol2 {
    public final ol2 m;
    public final a0 n;
    public boolean o;

    public jk0(ol2 ol2Var, a0 a0Var) {
        ol2Var.getClass();
        this.m = ol2Var;
        this.n = a0Var;
    }

    public final void b() {
        this.m.close();
    }

    @Override // defpackage.ol2, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        try {
            b();
        } catch (IOException e) {
            this.o = true;
            this.n.invoke(e);
        }
    }

    @Override // defpackage.ol2
    public final rx2 e() {
        return this.m.e();
    }

    public final void f() {
        this.m.flush();
    }

    @Override // defpackage.ol2, java.io.Flushable
    public final void flush() {
        try {
            f();
        } catch (IOException e) {
            this.o = true;
            this.n.invoke(e);
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.m + ')';
    }

    @Override // defpackage.ol2
    public final void u(long j, fq fqVar) {
        if (this.o) {
            fqVar.skip(j);
            return;
        }
        try {
            this.m.u(j, fqVar);
        } catch (IOException e) {
            this.o = true;
            this.n.invoke(e);
        }
    }
}
