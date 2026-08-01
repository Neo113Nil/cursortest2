package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qn implements ke0 {
    public final ke0 f;
    public final long g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ rn l;

    public qn(rn rnVar, ke0 ke0Var, long j) {
        ke0Var.getClass();
        this.l = rnVar;
        this.f = ke0Var;
        this.g = j;
        this.i = true;
        if (j == 0) {
            n(null);
        }
    }

    @Override // defpackage.ke0
    public final gi0 a() {
        return this.f.a();
    }

    @Override // defpackage.ke0
    public final long c(long j, t9 t9Var) {
        if (this.k) {
            s9.u("closed");
            return 0L;
        }
        try {
            long c = this.f.c(8192L, t9Var);
            if (this.i) {
                this.i = false;
            }
            if (c == -1) {
                n(null);
                return -1L;
            }
            long j2 = this.h + c;
            long j3 = this.g;
            if (j3 == -1 || j2 <= j3) {
                this.h = j2;
                if (j2 == j3) {
                    n(null);
                }
                return c;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw n(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        try {
            i();
            n(null);
        } catch (IOException e) {
            throw n(e);
        }
    }

    public final void i() {
        this.f.close();
    }

    public final IOException n(IOException iOException) {
        if (this.j) {
            return iOException;
        }
        this.j = true;
        if (iOException == null && this.i) {
            this.i = false;
        }
        rn rnVar = this.l;
        n70 n70Var = rnVar.a;
        if (iOException != null) {
            rnVar.b(iOException);
        }
        return n70Var.g(rnVar, false, true, iOException);
    }

    public final String toString() {
        return qn.class.getSimpleName() + '(' + this.f + ')';
    }
}
