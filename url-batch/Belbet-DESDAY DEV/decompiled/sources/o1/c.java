package o1;

import e1.l;
import f0.C0085b;
import i1.k;
import i1.m;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final m d;

    /* renamed from: e, reason: collision with root package name */
    public long f3370e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3372g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, m mVar) {
        super(pVar);
        X0.d.e(mVar, "url");
        this.f3372g = pVar;
        this.d = mVar;
        this.f3370e = -1L;
        this.f3371f = true;
    }

    @Override // o1.a, v1.v
    public final long b(v1.f fVar, long j2) {
        X0.d.e(fVar, "sink");
        if (this.f3365b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3371f) {
            return -1L;
        }
        long j3 = this.f3370e;
        p pVar = this.f3372g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((v1.p) pVar.d).m(Long.MAX_VALUE);
            }
            try {
                this.f3370e = ((v1.p) pVar.d).i();
                String obj = e1.d.y0(((v1.p) pVar.d).m(Long.MAX_VALUE)).toString();
                if (this.f3370e < 0 || (obj.length() > 0 && !l.i0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3370e + obj + '\"');
                }
                if (this.f3370e == 0) {
                    this.f3371f = false;
                    pVar.f3267g = ((C0085b) pVar.f3266f).f();
                    i1.p pVar2 = (i1.p) pVar.f3263b;
                    X0.d.b(pVar2);
                    k kVar = (k) pVar.f3267g;
                    X0.d.b(kVar);
                    n1.e.b(pVar2.f2485j, this.d, kVar);
                    e();
                }
                if (!this.f3371f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3370e));
        if (b2 != -1) {
            this.f3370e -= b2;
            return b2;
        }
        ((m1.m) pVar.f3264c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        e();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3365b) {
            return;
        }
        if (this.f3371f && !j1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m1.m) this.f3372g.f3264c).k();
            e();
        }
        this.f3365b = true;
    }
}
