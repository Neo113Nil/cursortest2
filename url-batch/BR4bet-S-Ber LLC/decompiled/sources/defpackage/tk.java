package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tk implements h60 {
    public final h60 f;
    public final long g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ uk l;

    public tk(uk ukVar, h60 h60Var, long j) {
        h60Var.getClass();
        this.l = ukVar;
        this.f = h60Var;
        this.g = j;
        this.i = true;
        if (j == 0) {
            g(null);
        }
    }

    @Override // defpackage.h60
    public final f90 a() {
        return this.f.a();
    }

    @Override // defpackage.h60
    public final long b(long j, h9 h9Var) {
        if (this.k) {
            g9.s("closed");
            return 0L;
        }
        try {
            long b = this.f.b(8192L, h9Var);
            if (this.i) {
                this.i = false;
            }
            if (b == -1) {
                g(null);
                return -1L;
            }
            long j2 = this.h + b;
            long j3 = this.g;
            if (j3 == -1 || j2 <= j3) {
                this.h = j2;
                if (j2 == j3) {
                    g(null);
                }
                return b;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw g(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        try {
            f();
            g(null);
        } catch (IOException e) {
            throw g(e);
        }
    }

    public final void f() {
        this.f.close();
    }

    public final IOException g(IOException iOException) {
        if (this.j) {
            return iOException;
        }
        this.j = true;
        if (iOException == null && this.i) {
            this.i = false;
        }
        uk ukVar = this.l;
        i10 i10Var = ukVar.a;
        if (iOException != null) {
            ukVar.b(iOException);
        }
        return i10Var.g(ukVar, false, true, iOException);
    }

    public final String toString() {
        return tk.class.getSimpleName() + '(' + this.f + ')';
    }
}
