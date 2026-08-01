package y1;

import h0.C0120b;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import s1.j;
import s1.l;
import s1.o;
import w1.m;
import w1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public long f4348e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f4350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, l lVar) {
        super(pVar);
        h1.d.e(lVar, "url");
        this.f4350g = pVar;
        this.d = lVar;
        this.f4348e = -1L;
        this.f4349f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4343b) {
            return;
        }
        if (this.f4349f && !t1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f4350g.f4274c).k();
            g();
        }
        this.f4343b = true;
    }

    @Override // y1.a, F1.v
    public final long d(F1.f fVar, long j2) {
        h1.d.e(fVar, "sink");
        if (this.f4343b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f4349f) {
            return -1L;
        }
        long j3 = this.f4348e;
        p pVar = this.f4350g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((F1.p) pVar.d).o(Long.MAX_VALUE);
            }
            try {
                this.f4348e = ((F1.p) pVar.d).k();
                String obj = o1.d.S(((F1.p) pVar.d).o(Long.MAX_VALUE)).toString();
                if (this.f4348e < 0 || (obj.length() > 0 && !o1.l.y(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4348e + obj + '\"');
                }
                if (this.f4348e == 0) {
                    this.f4349f = false;
                    pVar.f4277g = ((C0120b) pVar.f4276f).f();
                    o oVar = (o) pVar.f4273b;
                    h1.d.b(oVar);
                    j jVar = (j) pVar.f4277g;
                    h1.d.b(jVar);
                    x1.e.b(oVar.f3668j, this.d, jVar);
                    g();
                }
                if (!this.f4349f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long d = super.d(fVar, Math.min(8192L, this.f4348e));
        if (d != -1) {
            this.f4348e -= d;
            return d;
        }
        ((m) pVar.f4274c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        g();
        throw protocolException;
    }
}
