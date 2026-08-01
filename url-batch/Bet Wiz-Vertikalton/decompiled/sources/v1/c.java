package v1;

import f0.C0092b;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l1.l;
import p1.k;
import p1.m;
import p1.q;
import t1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final m d;

    /* renamed from: e, reason: collision with root package name */
    public long f4046e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f4048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, m mVar) {
        super(pVar);
        e1.d.e(mVar, "url");
        this.f4048g = pVar;
        this.d = mVar;
        this.f4046e = -1L;
        this.f4047f = true;
    }

    @Override // v1.a, C1.v
    public final long b(C1.f fVar, long j2) {
        e1.d.e(fVar, "sink");
        if (this.f4041b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f4047f) {
            return -1L;
        }
        long j3 = this.f4046e;
        p pVar = this.f4048g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((C1.p) pVar.d).o(Long.MAX_VALUE);
            }
            try {
                this.f4046e = ((C1.p) pVar.d).k();
                String obj = l1.d.K(((C1.p) pVar.d).o(Long.MAX_VALUE)).toString();
                if (this.f4046e < 0 || (obj.length() > 0 && !l.u(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4046e + obj + '\"');
                }
                if (this.f4046e == 0) {
                    this.f4047f = false;
                    pVar.f3797g = ((C0092b) pVar.f3796f).f();
                    q qVar = (q) pVar.f3793b;
                    e1.d.b(qVar);
                    k kVar = (k) pVar.f3797g;
                    e1.d.b(kVar);
                    u1.e.b(qVar.f3397j, this.d, kVar);
                    g();
                }
                if (!this.f4047f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f4046e));
        if (b2 != -1) {
            this.f4046e -= b2;
            return b2;
        }
        ((t1.m) pVar.f3794c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        g();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4041b) {
            return;
        }
        if (this.f4047f && !q1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((t1.m) this.f4048g.f3794c).k();
            g();
        }
        this.f4041b = true;
    }
}
