package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xi0 extends uq0 {
    public final long n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final /* synthetic */ du s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(du duVar, pn2 pn2Var, long j) {
        super(pn2Var);
        pn2Var.getClass();
        this.s = duVar;
        this.n = j;
        this.p = true;
        if (j == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.q) {
            return iOException;
        }
        this.q = true;
        if (iOException == null && this.p) {
            this.p = false;
        }
        du duVar = this.s;
        t62 t62Var = (t62) duVar.b;
        if (iOException != null) {
            duVar.g(iOException);
        }
        return t62Var.g(duVar, false, true, iOException);
    }

    @Override // defpackage.uq0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.r) {
            return;
        }
        this.r = true;
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // defpackage.uq0, defpackage.pn2
    public final long h(long j, fq fqVar) {
        fqVar.getClass();
        if (this.r) {
            lh.g("closed");
            return 0L;
        }
        try {
            long h = this.m.h(j, fqVar);
            if (this.p) {
                this.p = false;
            }
            if (h == -1) {
                b(null);
                return -1L;
            }
            long j2 = this.o + h;
            long j3 = this.n;
            if (j3 == -1 || j2 <= j3) {
                this.o = j2;
                if (j2 == j3) {
                    b(null);
                }
                return h;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw b(e);
        }
    }
}
