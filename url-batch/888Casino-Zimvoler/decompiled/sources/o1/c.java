package o1;

import e1.l;
import f0.C0085b;
import i1.k;
import i1.m;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m1.p;
import v1.o;

/* loaded from: classes.dex */
public final class c extends a {
    public final m d;

    /* renamed from: e, reason: collision with root package name */
    public long f3348e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, m mVar) {
        super(pVar);
        X0.e.e(mVar, "url");
        this.f3350g = pVar;
        this.d = mVar;
        this.f3348e = -1L;
        this.f3349f = true;
    }

    @Override // o1.a, v1.u
    public final long b(v1.f fVar, long j2) {
        X0.e.e(fVar, "sink");
        if (this.f3343b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3349f) {
            return -1L;
        }
        long j3 = this.f3348e;
        p pVar = this.f3350g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((o) pVar.d).m(Long.MAX_VALUE);
            }
            try {
                this.f3348e = ((o) pVar.d).i();
                String obj = e1.d.y0(((o) pVar.d).m(Long.MAX_VALUE)).toString();
                if (this.f3348e < 0 || (obj.length() > 0 && !l.i0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3348e + obj + '\"');
                }
                if (this.f3348e == 0) {
                    this.f3349f = false;
                    pVar.f3245g = ((C0085b) pVar.f3244f).f();
                    i1.o oVar = (i1.o) pVar.f3241b;
                    X0.e.b(oVar);
                    k kVar = (k) pVar.f3245g;
                    X0.e.b(kVar);
                    n1.e.b(oVar.f2464j, this.d, kVar);
                    e();
                }
                if (!this.f3349f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3348e));
        if (b2 != -1) {
            this.f3348e -= b2;
            return b2;
        }
        ((m1.m) pVar.f3242c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        e();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3343b) {
            return;
        }
        if (this.f3349f && !j1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m1.m) this.f3350g.f3242c).k();
            e();
        }
        this.f3343b = true;
    }
}
