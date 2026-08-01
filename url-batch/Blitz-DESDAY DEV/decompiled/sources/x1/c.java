package x1;

import h0.C0115b;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import r1.j;
import r1.l;
import r1.o;
import v1.m;
import v1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public long f4178e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f4180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, l lVar) {
        super(pVar);
        g1.d.e(lVar, "url");
        this.f4180g = pVar;
        this.d = lVar;
        this.f4178e = -1L;
        this.f4179f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4173b) {
            return;
        }
        if (this.f4179f && !s1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f4180g.f3911c).k();
            g();
        }
        this.f4173b = true;
    }

    @Override // x1.a, E1.v
    public final long d(E1.f fVar, long j2) {
        g1.d.e(fVar, "sink");
        if (this.f4173b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f4179f) {
            return -1L;
        }
        long j3 = this.f4178e;
        p pVar = this.f4180g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((E1.p) pVar.d).o(Long.MAX_VALUE);
            }
            try {
                this.f4178e = ((E1.p) pVar.d).k();
                String obj = n1.d.R(((E1.p) pVar.d).o(Long.MAX_VALUE)).toString();
                if (this.f4178e < 0 || (obj.length() > 0 && !n1.l.B(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4178e + obj + '\"');
                }
                if (this.f4178e == 0) {
                    this.f4179f = false;
                    pVar.f3914g = ((C0115b) pVar.f3913f).f();
                    o oVar = (o) pVar.f3910b;
                    g1.d.b(oVar);
                    j jVar = (j) pVar.f3914g;
                    g1.d.b(jVar);
                    w1.e.b(oVar.f3513j, this.d, jVar);
                    g();
                }
                if (!this.f4179f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long d = super.d(fVar, Math.min(8192L, this.f4178e));
        if (d != -1) {
            this.f4178e -= d;
            return d;
        }
        ((m) pVar.f3911c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        g();
        throw protocolException;
    }
}
