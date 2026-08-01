package s1;

import f0.C0093b;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m1.j;
import m1.l;
import q1.m;
import q1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public long f3695e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3697g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, l lVar) {
        super(pVar);
        b1.d.e(lVar, "url");
        this.f3697g = pVar;
        this.d = lVar;
        this.f3695e = -1L;
        this.f3696f = true;
    }

    @Override // s1.a, z1.v
    public final long b(z1.f fVar, long j2) {
        b1.d.e(fVar, "sink");
        if (this.f3690b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3696f) {
            return -1L;
        }
        long j3 = this.f3695e;
        p pVar = this.f3697g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((z1.p) pVar.d).o(Long.MAX_VALUE);
            }
            try {
                this.f3695e = ((z1.p) pVar.d).k();
                String obj = i1.d.E0(((z1.p) pVar.d).o(Long.MAX_VALUE)).toString();
                if (this.f3695e < 0 || (obj.length() > 0 && !i1.l.o0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3695e + obj + '\"');
                }
                if (this.f3695e == 0) {
                    this.f3696f = false;
                    pVar.f3511g = ((C0093b) pVar.f3510f).f();
                    m1.p pVar2 = (m1.p) pVar.f3507b;
                    b1.d.b(pVar2);
                    j jVar = (j) pVar.f3511g;
                    b1.d.b(jVar);
                    r1.e.b(pVar2.f3217j, this.d, jVar);
                    g();
                }
                if (!this.f3696f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3695e));
        if (b2 != -1) {
            this.f3695e -= b2;
            return b2;
        }
        ((m) pVar.f3508c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        g();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3690b) {
            return;
        }
        if (this.f3696f && !n1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f3697g.f3508c).k();
            g();
        }
        this.f3690b = true;
    }
}
