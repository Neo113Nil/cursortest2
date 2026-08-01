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
    public long f3365e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3367g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, m mVar) {
        super(pVar);
        X0.e.e(mVar, "url");
        this.f3367g = pVar;
        this.d = mVar;
        this.f3365e = -1L;
        this.f3366f = true;
    }

    @Override // o1.a, v1.u
    public final long b(v1.f fVar, long j2) {
        X0.e.e(fVar, "sink");
        if (this.f3360b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3366f) {
            return -1L;
        }
        long j3 = this.f3365e;
        p pVar = this.f3367g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((o) pVar.d).m(Long.MAX_VALUE);
            }
            try {
                this.f3365e = ((o) pVar.d).i();
                String obj = e1.d.y0(((o) pVar.d).m(Long.MAX_VALUE)).toString();
                if (this.f3365e < 0 || (obj.length() > 0 && !l.i0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3365e + obj + '\"');
                }
                if (this.f3365e == 0) {
                    this.f3366f = false;
                    pVar.f3262g = ((C0085b) pVar.f3261f).f();
                    i1.p pVar2 = (i1.p) pVar.f3258b;
                    X0.e.b(pVar2);
                    k kVar = (k) pVar.f3262g;
                    X0.e.b(kVar);
                    n1.e.b(pVar2.f2481j, this.d, kVar);
                    e();
                }
                if (!this.f3366f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3365e));
        if (b2 != -1) {
            this.f3365e -= b2;
            return b2;
        }
        ((m1.m) pVar.f3259c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        e();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3360b) {
            return;
        }
        if (this.f3366f && !j1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m1.m) this.f3367g.f3259c).k();
            e();
        }
        this.f3360b = true;
    }
}
