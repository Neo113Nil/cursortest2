package s1;

import f0.C0088b;
import i1.l;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m1.k;
import m1.m;
import m1.q;
import q1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final m d;

    /* renamed from: e, reason: collision with root package name */
    public long f3772e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3773f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3774g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, m mVar) {
        super(pVar);
        b1.d.e(mVar, "url");
        this.f3774g = pVar;
        this.d = mVar;
        this.f3772e = -1L;
        this.f3773f = true;
    }

    @Override // s1.a, z1.v
    public final long b(z1.f fVar, long j2) {
        b1.d.e(fVar, "sink");
        if (this.f3767b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3773f) {
            return -1L;
        }
        long j3 = this.f3772e;
        p pVar = this.f3774g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((z1.p) pVar.d).o(Long.MAX_VALUE);
            }
            try {
                this.f3772e = ((z1.p) pVar.d).k();
                String obj = i1.d.M0(((z1.p) pVar.d).o(Long.MAX_VALUE)).toString();
                if (this.f3772e < 0 || (obj.length() > 0 && !l.w0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3772e + obj + '\"');
                }
                if (this.f3772e == 0) {
                    this.f3773f = false;
                    pVar.f3564g = ((C0088b) pVar.f3563f).f();
                    q qVar = (q) pVar.f3560b;
                    b1.d.b(qVar);
                    k kVar = (k) pVar.f3564g;
                    b1.d.b(kVar);
                    r1.e.b(qVar.f3250j, this.d, kVar);
                    g();
                }
                if (!this.f3773f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3772e));
        if (b2 != -1) {
            this.f3772e -= b2;
            return b2;
        }
        ((q1.m) pVar.f3561c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        g();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3767b) {
            return;
        }
        if (this.f3773f && !n1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((q1.m) this.f3774g.f3561c).k();
            g();
        }
        this.f3767b = true;
    }
}
