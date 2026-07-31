package K2;

import E.F;
import T2.C0231f;
import T2.D;
import T2.H;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: d, reason: collision with root package name */
    public final D f3263d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3264e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3265f;

    /* renamed from: g, reason: collision with root package name */
    public long f3266g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3267h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f3268i;

    public b(F f3, D d3, long j3) {
        f2.j.f(d3, "delegate");
        this.f3268i = f3;
        this.f3263d = d3;
        this.f3264e = j3;
    }

    public final void a() {
        this.f3263d.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f3265f) {
            return iOException;
        }
        this.f3265f = true;
        return this.f3268i.a(false, true, iOException);
    }

    @Override // T2.D
    public final H c() {
        return this.f3263d.c();
    }

    @Override // T2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3267h) {
            return;
        }
        this.f3267h = true;
        long j3 = this.f3264e;
        if (j3 != -1 && this.f3266g != j3) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            b(null);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    public final void d() {
        this.f3263d.flush();
    }

    @Override // T2.D, java.io.Flushable
    public final void flush() {
        try {
            d();
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    @Override // T2.D
    public final void p(C0231f c0231f, long j3) {
        if (this.f3267h) {
            throw new IllegalStateException("closed");
        }
        long j4 = this.f3264e;
        if (j4 == -1 || this.f3266g + j3 <= j4) {
            try {
                this.f3263d.p(c0231f, j3);
                this.f3266g += j3;
                return;
            } catch (IOException e3) {
                throw b(e3);
            }
        }
        throw new ProtocolException("expected " + j4 + " bytes but received " + (this.f3266g + j3));
    }

    public final String toString() {
        return b.class.getSimpleName() + '(' + this.f3263d + ')';
    }
}
