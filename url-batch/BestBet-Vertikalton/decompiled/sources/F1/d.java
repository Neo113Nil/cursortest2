package F1;

import D1.m;
import D1.p;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import z1.j;
import z1.l;

/* loaded from: classes.dex */
public final class d extends b {
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public long f277e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, l lVar) {
        super(pVar);
        k1.e.e(lVar, "url");
        this.f279g = pVar;
        this.d = lVar;
        this.f277e = -1L;
        this.f278f = true;
    }

    @Override // F1.b, M1.v
    public final long c(M1.f fVar, long j2) {
        k1.e.e(fVar, "sink");
        if (this.f272b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f278f) {
            return -1L;
        }
        long j3 = this.f277e;
        p pVar = this.f279g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((M1.p) pVar.d).u(Long.MAX_VALUE);
            }
            try {
                this.f277e = ((M1.p) pVar.d).p();
                String obj = r1.d.T(((M1.p) pVar.d).u(Long.MAX_VALUE)).toString();
                if (this.f277e < 0 || (obj.length() > 0 && !r1.l.C(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f277e + obj + '\"');
                }
                if (this.f277e == 0) {
                    this.f278f = false;
                    pVar.f216g = ((a) pVar.f215f).f();
                    z1.p pVar2 = (z1.p) pVar.f212b;
                    k1.e.b(pVar2);
                    j jVar = (j) pVar.f216g;
                    k1.e.b(jVar);
                    E1.f.b(pVar2.f4727j, this.d, jVar);
                    a();
                }
                if (!this.f278f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long c2 = super.c(fVar, Math.min(8192L, this.f277e));
        if (c2 != -1) {
            this.f277e -= c2;
            return c2;
        }
        ((m) pVar.f213c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f272b) {
            return;
        }
        if (this.f278f && !A1.c.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f279g.f213c).k();
            a();
        }
        this.f272b = true;
    }
}
