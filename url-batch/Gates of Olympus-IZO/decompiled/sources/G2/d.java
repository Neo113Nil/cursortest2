package G2;

import A2.q;
import A2.u;
import E2.k;
import E2.o;
import N2.C0150f;
import N2.z;
import Z1.i;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: g, reason: collision with root package name */
    public final q f1588g;

    /* renamed from: h, reason: collision with root package name */
    public long f1589h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1590i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f1591j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, q qVar) {
        super(oVar);
        i.f(qVar, "url");
        this.f1591j = oVar;
        this.f1588g = qVar;
        this.f1589h = -1L;
        this.f1590i = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1583e) {
            return;
        }
        if (this.f1590i && !B2.c.g(this, TimeUnit.MILLISECONDS)) {
            ((k) this.f1591j.f847c).k();
            a();
        }
        this.f1583e = true;
    }

    @Override // G2.b, N2.F
    public final long l(C0150f c0150f, long j3) {
        i.f(c0150f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f1583e) {
            throw new IllegalStateException("closed");
        }
        if (!this.f1590i) {
            return -1L;
        }
        long j4 = this.f1589h;
        o oVar = this.f1591j;
        if (j4 == 0 || j4 == -1) {
            if (j4 != -1) {
                ((z) oVar.f848d).u(Long.MAX_VALUE);
            }
            try {
                this.f1589h = ((z) oVar.f848d).i();
                String obj = AbstractC0447i.H0(((z) oVar.f848d).u(Long.MAX_VALUE)).toString();
                if (this.f1589h < 0 || (obj.length() > 0 && !AbstractC0454p.i0(obj, ";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1589h + obj + '\"');
                }
                if (this.f1589h == 0) {
                    this.f1590i = false;
                    oVar.f851g = ((a) oVar.f850f).a();
                    u uVar = (u) oVar.f846b;
                    i.c(uVar);
                    A2.o oVar2 = (A2.o) oVar.f851g;
                    i.c(oVar2);
                    F2.f.b(uVar.f171m, this.f1588g, oVar2);
                    a();
                }
                if (!this.f1590i) {
                    return -1L;
                }
            } catch (NumberFormatException e3) {
                throw new ProtocolException(e3.getMessage());
            }
        }
        long l3 = super.l(c0150f, Math.min(j3, this.f1589h));
        if (l3 != -1) {
            this.f1589h -= l3;
            return l3;
        }
        ((k) oVar.f847c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }
}
