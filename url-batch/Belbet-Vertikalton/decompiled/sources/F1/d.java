package F1;

import D1.m;
import D1.q;
import M1.p;
import j1.h;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import z1.o;
import z1.s;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    public final o f325d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, o oVar) {
        super(qVar);
        h.e(oVar, "url");
        this.f327g = qVar;
        this.f325d = oVar;
        this.e = -1L;
        this.f326f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f320b) {
            return;
        }
        if (this.f326f && !A1.c.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f327g.f274c).k();
            a();
        }
        this.f320b = true;
    }

    @Override // F1.b, M1.v
    public final long h(M1.f fVar, long j) {
        h.e(fVar, "sink");
        if (this.f320b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f326f) {
            return -1L;
        }
        long j2 = this.e;
        q qVar = this.f327g;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                ((p) qVar.f275d).G(Long.MAX_VALUE);
            }
            try {
                this.e = ((p) qVar.f275d).B();
                String obj = q1.e.L0(((p) qVar.f275d).G(Long.MAX_VALUE)).toString();
                if (this.e < 0 || (obj.length() > 0 && !q1.m.s0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.e + obj + '\"');
                }
                if (this.e == 0) {
                    this.f326f = false;
                    qVar.f277g = ((a) qVar.f276f).f();
                    s sVar = (s) qVar.f273b;
                    h.b(sVar);
                    z1.m mVar = (z1.m) qVar.f277g;
                    h.b(mVar);
                    E1.f.b(sVar.j, this.f325d, mVar);
                    a();
                }
                if (!this.f326f) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long h2 = super.h(fVar, Math.min(8192L, this.e));
        if (h2 != -1) {
            this.e -= h2;
            return h2;
        }
        ((m) qVar.f274c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }
}
