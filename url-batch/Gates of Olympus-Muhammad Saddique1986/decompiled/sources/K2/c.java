package K2;

import T2.C0231f;
import T2.F;
import T2.H;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements F {

    /* renamed from: d, reason: collision with root package name */
    public final F f3269d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3270e;

    /* renamed from: f, reason: collision with root package name */
    public long f3271f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3272g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3273h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3274i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E.F f3275j;

    public c(E.F f3, F f4, long j3) {
        f2.j.f(f4, "delegate");
        this.f3275j = f3;
        f2.j.f(f4, "delegate");
        this.f3269d = f4;
        this.f3270e = j3;
        this.f3272g = true;
        if (j3 == 0) {
            b(null);
        }
    }

    public final void a() {
        this.f3269d.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f3273h) {
            return iOException;
        }
        this.f3273h = true;
        E.F f3 = this.f3275j;
        if (iOException == null && this.f3272g) {
            this.f3272g = false;
            f3.getClass();
            f2.j.f((g) f3.f923b, "call");
        }
        return f3.a(true, false, iOException);
    }

    @Override // T2.F
    public final H c() {
        return this.f3269d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3274i) {
            return;
        }
        this.f3274i = true;
        try {
            a();
            b(null);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    @Override // T2.F
    public final long f(C0231f c0231f, long j3) {
        f2.j.f(c0231f, "sink");
        if (this.f3274i) {
            throw new IllegalStateException("closed");
        }
        try {
            long f3 = this.f3269d.f(c0231f, j3);
            if (this.f3272g) {
                this.f3272g = false;
                E.F f4 = this.f3275j;
                f4.getClass();
                f2.j.f((g) f4.f923b, "call");
            }
            if (f3 == -1) {
                b(null);
                return -1L;
            }
            long j4 = this.f3271f + f3;
            long j5 = this.f3270e;
            if (j5 == -1 || j4 <= j5) {
                this.f3271f = j4;
                if (j4 == j5) {
                    b(null);
                }
                return f3;
            }
            throw new ProtocolException("expected " + j5 + " bytes but received " + j4);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f3269d + ')';
    }
}
