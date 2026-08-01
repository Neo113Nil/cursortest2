package x1;

import g0.C0118b;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import n1.l;
import r1.k;
import r1.m;
import r1.q;
import v1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final m d;

    /* renamed from: e, reason: collision with root package name */
    public long f4152e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f4154g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, m mVar) {
        super(pVar);
        g1.d.e(mVar, "url");
        this.f4154g = pVar;
        this.d = mVar;
        this.f4152e = -1L;
        this.f4153f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4147b) {
            return;
        }
        if (this.f4153f && !s1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((v1.m) this.f4154g.f4081c).k();
            g();
        }
        this.f4147b = true;
    }

    @Override // x1.a, E1.v
    public final long d(E1.f fVar, long j2) {
        g1.d.e(fVar, "sink");
        if (this.f4147b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f4153f) {
            return -1L;
        }
        long j3 = this.f4152e;
        p pVar = this.f4154g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((E1.p) pVar.d).o(Long.MAX_VALUE);
            }
            try {
                this.f4152e = ((E1.p) pVar.d).k();
                String obj = n1.d.O(((E1.p) pVar.d).o(Long.MAX_VALUE)).toString();
                if (this.f4152e < 0 || (obj.length() > 0 && !l.y(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4152e + obj + '\"');
                }
                if (this.f4152e == 0) {
                    this.f4153f = false;
                    pVar.f4084g = ((C0118b) pVar.f4083f).f();
                    q qVar = (q) pVar.f4080b;
                    g1.d.b(qVar);
                    k kVar = (k) pVar.f4084g;
                    g1.d.b(kVar);
                    w1.e.b(qVar.f3497j, this.d, kVar);
                    g();
                }
                if (!this.f4153f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long d = super.d(fVar, Math.min(8192L, this.f4152e));
        if (d != -1) {
            this.f4152e -= d;
            return d;
        }
        ((v1.m) pVar.f4081c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        g();
        throw protocolException;
    }
}
