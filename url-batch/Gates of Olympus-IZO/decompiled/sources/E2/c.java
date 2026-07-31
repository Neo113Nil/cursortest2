package E2;

import E.G;
import N2.C0150f;
import N2.D;
import N2.H;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements D {

    /* renamed from: d, reason: collision with root package name */
    public final D f778d;

    /* renamed from: e, reason: collision with root package name */
    public final long f779e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f780f;

    /* renamed from: g, reason: collision with root package name */
    public long f781g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f782h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G f783i;

    public c(G g3, D d3, long j3) {
        Z1.i.f(d3, "delegate");
        this.f783i = g3;
        this.f778d = d3;
        this.f779e = j3;
    }

    public final void a() {
        this.f778d.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f780f) {
            return iOException;
        }
        this.f780f = true;
        return this.f783i.a(false, true, iOException);
    }

    @Override // N2.D
    public final H c() {
        return this.f778d.c();
    }

    @Override // N2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f782h) {
            return;
        }
        this.f782h = true;
        long j3 = this.f779e;
        if (j3 != -1 && this.f781g != j3) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            b(null);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    public final void e() {
        this.f778d.flush();
    }

    @Override // N2.D, java.io.Flushable
    public final void flush() {
        try {
            e();
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    @Override // N2.D
    public final void g(C0150f c0150f, long j3) {
        if (this.f782h) {
            throw new IllegalStateException("closed");
        }
        long j4 = this.f779e;
        if (j4 == -1 || this.f781g + j3 <= j4) {
            try {
                this.f778d.g(c0150f, j3);
                this.f781g += j3;
                return;
            } catch (IOException e3) {
                throw b(e3);
            }
        }
        throw new ProtocolException("expected " + j4 + " bytes but received " + (this.f781g + j3));
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f778d + ')';
    }
}
