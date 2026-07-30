package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iy0 extends hy0 {
    public final kz0 p;
    public long q;
    public boolean r;
    public final /* synthetic */ ly0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(ly0 ly0Var, kz0 kz0Var) {
        super(ly0Var);
        kz0Var.getClass();
        this.s = ly0Var;
        this.p = kz0Var;
        this.q = -1L;
        this.r = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.n) {
            return;
        }
        if (this.r) {
            byte[] bArr = n33.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = n33.q(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.s.b.k();
                b();
            }
        }
        this.n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r11.r == false) goto L27;
     */
    @Override // defpackage.hy0, defpackage.pn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j, fq fqVar) {
        ly0 ly0Var = this.s;
        pq pqVar = ly0Var.c;
        fqVar.getClass();
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.n) {
            lh.g("closed");
            return 0L;
        }
        if (this.r) {
            long j2 = this.q;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    pqVar.r();
                }
                try {
                    this.q = pqVar.K();
                    String obj = up2.K(pqVar.r()).toString();
                    if (this.q < 0 || (obj.length() > 0 && !tp2.o(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.q + obj + '\"');
                    }
                    if (this.q == 0) {
                        this.r = false;
                        ly0Var.g = ly0Var.f.a();
                        fu1 fu1Var = ly0Var.a;
                        fu1Var.getClass();
                        qb2 qb2Var = fu1Var.v;
                        mx0 mx0Var = ly0Var.g;
                        mx0Var.getClass();
                        ez0.b(qb2Var, this.p, mx0Var);
                        b();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long h = super.h(Math.min(j, this.q), fqVar);
            if (h != -1) {
                this.q -= h;
                return h;
            }
            ly0Var.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        return -1L;
    }
}
