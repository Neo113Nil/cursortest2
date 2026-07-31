package E2;

import E.G;
import N2.C0150f;
import N2.F;
import N2.H;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements F {

    /* renamed from: d, reason: collision with root package name */
    public final F f784d;

    /* renamed from: e, reason: collision with root package name */
    public final long f785e;

    /* renamed from: f, reason: collision with root package name */
    public long f786f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f787g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f788h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f789i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G f790j;

    public d(G g3, F f3, long j3) {
        Z1.i.f(f3, "delegate");
        this.f790j = g3;
        Z1.i.f(f3, "delegate");
        this.f784d = f3;
        this.f785e = j3;
        this.f787g = true;
        if (j3 == 0) {
            b(null);
        }
    }

    public final void a() {
        this.f784d.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f788h) {
            return iOException;
        }
        this.f788h = true;
        G g3 = this.f790j;
        if (iOException == null && this.f787g) {
            this.f787g = false;
            g3.getClass();
            Z1.i.f((h) g3.f622b, "call");
        }
        return g3.a(true, false, iOException);
    }

    @Override // N2.F
    public final H c() {
        return this.f784d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f789i) {
            return;
        }
        this.f789i = true;
        try {
            a();
            b(null);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    @Override // N2.F
    public final long l(C0150f c0150f, long j3) {
        Z1.i.f(c0150f, "sink");
        if (this.f789i) {
            throw new IllegalStateException("closed");
        }
        try {
            long l3 = this.f784d.l(c0150f, j3);
            if (this.f787g) {
                this.f787g = false;
                G g3 = this.f790j;
                g3.getClass();
                Z1.i.f((h) g3.f622b, "call");
            }
            if (l3 == -1) {
                b(null);
                return -1L;
            }
            long j4 = this.f786f + l3;
            long j5 = this.f785e;
            if (j5 == -1 || j4 <= j5) {
                this.f786f = j4;
                if (j4 == j5) {
                    b(null);
                }
                return l3;
            }
            throw new ProtocolException("expected " + j5 + " bytes but received " + j4);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f784d + ')';
    }
}
