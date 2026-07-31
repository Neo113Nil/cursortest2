package M2;

import G2.l;
import G2.n;
import G2.r;
import T2.C0231f;
import T2.z;
import f2.j;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import n2.AbstractC0730j;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: g, reason: collision with root package name */
    public final n f3488g;

    /* renamed from: h, reason: collision with root package name */
    public long f3489h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3490i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K2.n f3491j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(K2.n nVar, n nVar2) {
        super(nVar);
        j.f(nVar2, "url");
        this.f3491j = nVar;
        this.f3488g = nVar2;
        this.f3489h = -1L;
        this.f3490i = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3483e) {
            return;
        }
        if (this.f3490i && !H2.b.g(this, TimeUnit.MILLISECONDS)) {
            ((K2.j) this.f3491j.f3334c).k();
            a();
        }
        this.f3483e = true;
    }

    @Override // M2.b, T2.F
    public final long f(C0231f c0231f, long j3) {
        j.f(c0231f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f3483e) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3490i) {
            return -1L;
        }
        long j4 = this.f3489h;
        K2.n nVar = this.f3491j;
        if (j4 == 0 || j4 == -1) {
            if (j4 != -1) {
                ((z) nVar.f3335d).u(Long.MAX_VALUE);
            }
            try {
                this.f3489h = ((z) nVar.f3335d).g();
                String obj = AbstractC0730j.Y(((z) nVar.f3335d).u(Long.MAX_VALUE)).toString();
                if (this.f3489h < 0 || (obj.length() > 0 && !AbstractC0737q.z(obj, ";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3489h + obj + '\"');
                }
                if (this.f3489h == 0) {
                    this.f3490i = false;
                    nVar.f3338g = ((a) nVar.f3337f).a();
                    r rVar = (r) nVar.f3333b;
                    j.c(rVar);
                    l lVar = (l) nVar.f3338g;
                    j.c(lVar);
                    L2.f.b(rVar.f2259m, this.f3488g, lVar);
                    a();
                }
                if (!this.f3490i) {
                    return -1L;
                }
            } catch (NumberFormatException e3) {
                throw new ProtocolException(e3.getMessage());
            }
        }
        long f3 = super.f(c0231f, Math.min(j3, this.f3489h));
        if (f3 != -1) {
            this.f3489h -= f3;
            return f3;
        }
        ((K2.j) nVar.f3334c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }
}
