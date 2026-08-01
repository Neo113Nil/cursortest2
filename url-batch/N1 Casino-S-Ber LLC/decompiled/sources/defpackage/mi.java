package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class mi implements f30 {
    public final f30 f;
    public final long g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ ni l;

    public mi(ni niVar, f30 f30Var, long j) {
        f30Var.getClass();
        this.l = niVar;
        this.f = f30Var;
        this.g = j;
        this.i = true;
        if (j == 0) {
            n(null);
        }
    }

    @Override // defpackage.f30
    public final v50 a() {
        return this.f.a();
    }

    @Override // defpackage.f30
    public final long b(long j, u8 u8Var) {
        if (this.k) {
            t8.t("closed");
            return 0L;
        }
        try {
            long b = this.f.b(8192L, u8Var);
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
        ni niVar = this.l;
        gy gyVar = niVar.a;
        if (iOException != null) {
            niVar.b(iOException);
        }
        return gyVar.g(niVar, false, true, iOException);
    }

    public final String toString() {
        return mi.class.getSimpleName() + '(' + this.f + ')';
    }
}
