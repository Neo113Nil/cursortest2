package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ot extends nt {
    public final ou i;
    public long j;
    public boolean k;
    public final /* synthetic */ rt l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(rt rtVar, ou ouVar) {
        super(rtVar);
        ouVar.getClass();
        this.l = rtVar;
        this.i = ouVar;
        this.j = -1L;
        this.k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r9.k == false) goto L25;
     */
    @Override // defpackage.nt, defpackage.ke0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j, t9 t9Var) {
        rt rtVar = this.l;
        w9 w9Var = rtVar.c;
        if (this.g) {
            s9.u("closed");
            return 0L;
        }
        if (this.k) {
            long j2 = this.j;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    w9Var.m();
                }
                try {
                    this.j = w9Var.L();
                    String obj = mf0.E(w9Var.m()).toString();
                    if (this.j < 0 || (obj.length() > 0 && !uf0.r(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.j + obj + '\"');
                    }
                    if (this.j == 0) {
                        this.k = false;
                        rtVar.g = rtVar.f.f();
                        o40 o40Var = rtVar.a;
                        o40Var.getClass();
                        sl slVar = o40Var.o;
                        bt btVar = rtVar.g;
                        btVar.getClass();
                        mu.b(slVar, this.i, btVar);
                        i();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long c = super.c(Math.min(8192L, this.j), t9Var);
            if (c != -1) {
                this.j -= c;
                return c;
            }
            rtVar.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            i();
            throw protocolException;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.g) {
            return;
        }
        if (this.k) {
            byte[] bArr = zk0.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = zk0.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.l.b.k();
                i();
            }
        }
        this.g = true;
    }
}
