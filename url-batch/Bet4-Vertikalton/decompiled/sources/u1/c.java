package u1;

import g0.C0117c;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o1.j;
import o1.l;
import s1.m;
import s1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public long f3823e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, l lVar) {
        super(pVar);
        d1.d.e(lVar, "url");
        this.f3825g = pVar;
        this.d = lVar;
        this.f3823e = -1L;
        this.f3824f = true;
    }

    @Override // u1.a, B1.v
    public final long c(B1.f fVar, long j2) {
        d1.d.e(fVar, "sink");
        if (this.f3818b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3824f) {
            return -1L;
        }
        long j3 = this.f3823e;
        p pVar = this.f3825g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((B1.p) pVar.d).o(Long.MAX_VALUE);
            }
            try {
                this.f3823e = ((B1.p) pVar.d).k();
                String obj = k1.d.O(((B1.p) pVar.d).o(Long.MAX_VALUE)).toString();
                if (this.f3823e < 0 || (obj.length() > 0 && !k1.l.y(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3823e + obj + '\"');
                }
                if (this.f3823e == 0) {
                    this.f3824f = false;
                    pVar.f3758g = ((C0117c) pVar.f3757f).f();
                    o1.p pVar2 = (o1.p) pVar.f3754b;
                    d1.d.b(pVar2);
                    j jVar = (j) pVar.f3758g;
                    d1.d.b(jVar);
                    t1.e.b(pVar2.f3351j, this.d, jVar);
                    g();
                }
                if (!this.f3824f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long c2 = super.c(fVar, Math.min(8192L, this.f3823e));
        if (c2 != -1) {
            this.f3823e -= c2;
            return c2;
        }
        ((m) pVar.f3755c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        g();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3818b) {
            return;
        }
        if (this.f3824f && !p1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f3825g.f3755c).k();
            g();
        }
        this.f3818b = true;
    }
}
