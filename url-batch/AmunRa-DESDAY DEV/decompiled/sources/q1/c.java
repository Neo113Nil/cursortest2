package q1;

import f0.C0091b;
import g1.l;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import k1.n;
import k1.r;
import o1.m;
import o1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final n d;

    /* renamed from: e, reason: collision with root package name */
    public long f3517e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, n nVar) {
        super(pVar);
        Z0.d.e(nVar, "url");
        this.f3519g = pVar;
        this.d = nVar;
        this.f3517e = -1L;
        this.f3518f = true;
    }

    @Override // q1.a, x1.v
    public final long b(x1.f fVar, long j2) {
        Z0.d.e(fVar, "sink");
        if (this.f3512b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3518f) {
            return -1L;
        }
        long j3 = this.f3517e;
        p pVar = this.f3519g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((x1.p) pVar.d).o(Long.MAX_VALUE);
            }
            try {
                this.f3517e = ((x1.p) pVar.d).k();
                String obj = g1.d.I0(((x1.p) pVar.d).o(Long.MAX_VALUE)).toString();
                if (this.f3517e < 0 || (obj.length() > 0 && !l.s0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3517e + obj + '\"');
                }
                if (this.f3517e == 0) {
                    this.f3518f = false;
                    pVar.f3430g = ((C0091b) pVar.f3429f).f();
                    r rVar = (r) pVar.f3426b;
                    Z0.d.b(rVar);
                    k1.l lVar = (k1.l) pVar.f3430g;
                    Z0.d.b(lVar);
                    p1.e.b(rVar.f2865j, this.d, lVar);
                    f();
                }
                if (!this.f3518f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3517e));
        if (b2 != -1) {
            this.f3517e -= b2;
            return b2;
        }
        ((m) pVar.f3427c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        f();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3512b) {
            return;
        }
        if (this.f3518f && !l1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f3519g.f3427c).k();
            f();
        }
        this.f3512b = true;
    }
}
