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
    public long f3347e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, m mVar) {
        super(pVar);
        X0.e.e(mVar, "url");
        this.f3349g = pVar;
        this.d = mVar;
        this.f3347e = -1L;
        this.f3348f = true;
    }

    @Override // o1.a, v1.u
    public final long b(v1.f fVar, long j2) {
        X0.e.e(fVar, "sink");
        if (this.f3342b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3348f) {
            return -1L;
        }
        long j3 = this.f3347e;
        p pVar = this.f3349g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((o) pVar.d).m(Long.MAX_VALUE);
            }
            try {
                this.f3347e = ((o) pVar.d).i();
                String obj = e1.d.y0(((o) pVar.d).m(Long.MAX_VALUE)).toString();
                if (this.f3347e < 0 || (obj.length() > 0 && !l.i0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3347e + obj + '\"');
                }
                if (this.f3347e == 0) {
                    this.f3348f = false;
                    pVar.f3244g = ((C0085b) pVar.f3243f).f();
                    i1.o oVar = (i1.o) pVar.f3240b;
                    X0.e.b(oVar);
                    k kVar = (k) pVar.f3244g;
                    X0.e.b(kVar);
                    n1.e.b(oVar.f2463j, this.d, kVar);
                    e();
                }
                if (!this.f3348f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3347e));
        if (b2 != -1) {
            this.f3347e -= b2;
            return b2;
        }
        ((m1.m) pVar.f3241c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        e();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3342b) {
            return;
        }
        if (this.f3348f && !j1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m1.m) this.f3349g.f3241c).k();
            e();
        }
        this.f3342b = true;
    }
}
