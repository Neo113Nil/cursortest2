package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class fi implements q30 {
    public final q30 f;
    public final long g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ gi l;

    public fi(gi giVar, q30 q30Var, long j) {
        q30Var.getClass();
        this.l = giVar;
        this.f = q30Var;
        this.g = j;
        this.i = true;
        if (j == 0) {
            n(null);
        }
    }

    @Override // defpackage.q30
    public final d60 a() {
        return this.f.a();
    }

    @Override // defpackage.q30
    public final long b(long j, p8 p8Var) {
        if (this.k) {
            o8.t("closed");
            return 0L;
        }
        try {
            long b = this.f.b(8192L, p8Var);
            if (this.i) {
                this.i = false;
            }
            if (b == -1) {
                n(null);
                return -1L;
            }
            long j2 = this.h + b;
            long j3 = this.g;
            if (j3 == -1 || j2 <= j3) {
                this.h = j2;
                if (j2 == j3) {
                    n(null);
                }
                return b;
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
            m();
            n(null);
        } catch (IOException e) {
            throw n(e);
        }
    }

    public final void m() {
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
        gi giVar = this.l;
        vy vyVar = giVar.a;
        if (iOException != null) {
            giVar.b(iOException);
        }
        return vyVar.g(giVar, false, true, iOException);
    }

    public final String toString() {
        return fi.class.getSimpleName() + '(' + this.f + ')';
    }
}
