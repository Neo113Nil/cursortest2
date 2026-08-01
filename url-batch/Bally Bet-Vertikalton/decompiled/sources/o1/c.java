package o1;

import e1.l;
import f0.C0086b;
import i1.k;
import i1.m;
import i1.o;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final m d;

    /* renamed from: e, reason: collision with root package name */
    public long f3353e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3355g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, m mVar) {
        super(pVar);
        X0.d.e(mVar, "url");
        this.f3355g = pVar;
        this.d = mVar;
        this.f3353e = -1L;
        this.f3354f = true;
    }

    @Override // o1.a, v1.v
    public final long b(v1.f fVar, long j2) {
        X0.d.e(fVar, "sink");
        if (this.f3348b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3354f) {
            return -1L;
        }
        long j3 = this.f3353e;
        p pVar = this.f3355g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((v1.p) pVar.d).m(Long.MAX_VALUE);
            }
            try {
                this.f3353e = ((v1.p) pVar.d).i();
                String obj = e1.d.y0(((v1.p) pVar.d).m(Long.MAX_VALUE)).toString();
                if (this.f3353e < 0 || (obj.length() > 0 && !l.i0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3353e + obj + '\"');
                }
                if (this.f3353e == 0) {
                    this.f3354f = false;
                    pVar.f3250g = ((C0086b) pVar.f3249f).f();
                    o oVar = (o) pVar.f3246b;
                    X0.d.b(oVar);
                    k kVar = (k) pVar.f3250g;
                    X0.d.b(kVar);
                    n1.e.b(oVar.f2469j, this.d, kVar);
                    e();
                }
                if (!this.f3354f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3353e));
        if (b2 != -1) {
            this.f3353e -= b2;
            return b2;
        }
        ((m1.m) pVar.f3247c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        e();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3348b) {
            return;
        }
        if (this.f3354f && !j1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m1.m) this.f3355g.f3247c).k();
            e();
        }
        this.f3348b = true;
    }
}
