package o1;

import e0.C0114b;
import e1.l;
import i1.n;
import i1.p;
import i1.u;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m1.m;
import v1.q;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public final p f3729d;

    /* renamed from: e, reason: collision with root package name */
    public long f3730e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m1.p f3732g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m1.p pVar, p pVar2) {
        super(pVar);
        X0.f.e(pVar2, "url");
        this.f3732g = pVar;
        this.f3729d = pVar2;
        this.f3730e = -1L;
        this.f3731f = true;
    }

    @Override // o1.a, v1.w
    public final long c(v1.f fVar, long j2) {
        X0.f.e(fVar, "sink");
        if (this.f3724b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3731f) {
            return -1L;
        }
        long j3 = this.f3730e;
        m1.p pVar = this.f3732g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((q) pVar.f3609d).o(Long.MAX_VALUE);
            }
            try {
                this.f3730e = ((q) pVar.f3609d).k();
                String obj = e1.d.P0(((q) pVar.f3609d).o(Long.MAX_VALUE)).toString();
                if (this.f3730e < 0 || (obj.length() > 0 && !l.z0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3730e + obj + '\"');
                }
                if (this.f3730e == 0) {
                    this.f3731f = false;
                    pVar.f3612g = ((C0114b) pVar.f3611f).f();
                    u uVar = (u) pVar.f3607b;
                    X0.f.b(uVar);
                    n nVar = (n) pVar.f3612g;
                    X0.f.b(nVar);
                    n1.e.b(uVar.f2753j, this.f3729d, nVar);
                    g();
                }
                if (!this.f3731f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long c2 = super.c(fVar, Math.min(8192L, this.f3730e));
        if (c2 != -1) {
            this.f3730e -= c2;
            return c2;
        }
        ((m) pVar.f3608c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        g();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3724b) {
            return;
        }
        if (this.f3731f && !j1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f3732g.f3608c).k();
            g();
        }
        this.f3724b = true;
    }
}
