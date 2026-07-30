package f8;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements e0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3578f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f3579g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3580h;

    public c(OutputStream outputStream, f0 f0Var) {
        this.f3580h = outputStream;
        this.f3579g = f0Var;
    }

    @Override // f8.e0
    public final i0 a() {
        switch (this.f3578f) {
        }
        return this.f3579g;
    }

    @Override // f8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3578f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c cVar = (c) this.f3580h;
                f0 f0Var = this.f3579g;
                f0Var.h();
                try {
                    cVar.close();
                    if (f0Var.i()) {
                        throw f0Var.k(null);
                    }
                    return;
                } catch (IOException e9) {
                    if (!f0Var.i()) {
                        throw e9;
                    }
                    throw f0Var.k(e9);
                } finally {
                    f0Var.i();
                }
            default:
                ((OutputStream) this.f3580h).close();
                return;
        }
    }

    @Override // f8.e0
    public final void f(long j8, f fVar) {
        switch (this.f3578f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t6.a.t(fVar.f3598g, 0L, j8);
                long j9 = j8;
                while (true) {
                    long j10 = 0;
                    if (j9 <= 0) {
                        return;
                    }
                    b0 b0Var = fVar.f3597f;
                    r6.k.c(b0Var);
                    while (true) {
                        if (j10 < 65536) {
                            j10 += b0Var.f3573c - b0Var.f3572b;
                            if (j10 >= j9) {
                                j10 = j9;
                            } else {
                                b0Var = b0Var.f3576f;
                                r6.k.c(b0Var);
                            }
                        }
                    }
                    c cVar = (c) this.f3580h;
                    f0 f0Var = this.f3579g;
                    f0Var.h();
                    try {
                        try {
                            cVar.f(j10, fVar);
                            if (f0Var.i()) {
                                throw f0Var.k(null);
                            }
                            j9 -= j10;
                        } catch (IOException e9) {
                            if (!f0Var.i()) {
                                throw e9;
                            }
                            throw f0Var.k(e9);
                        }
                    } catch (Throwable th) {
                        f0Var.i();
                        throw th;
                    }
                }
            default:
                t6.a.t(fVar.f3598g, 0L, j8);
                while (j8 > 0) {
                    this.f3579g.f();
                    b0 b0Var2 = fVar.f3597f;
                    r6.k.c(b0Var2);
                    int min = (int) Math.min(j8, b0Var2.f3573c - b0Var2.f3572b);
                    ((OutputStream) this.f3580h).write(b0Var2.f3571a, b0Var2.f3572b, min);
                    int i7 = b0Var2.f3572b + min;
                    b0Var2.f3572b = i7;
                    long j11 = min;
                    j8 -= j11;
                    fVar.f3598g -= j11;
                    if (i7 == b0Var2.f3573c) {
                        fVar.f3597f = b0Var2.a();
                        c0.a(b0Var2);
                    }
                }
                return;
        }
    }

    @Override // f8.e0, java.io.Flushable
    public final void flush() {
        switch (this.f3578f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c cVar = (c) this.f3580h;
                f0 f0Var = this.f3579g;
                f0Var.h();
                try {
                    cVar.flush();
                    if (f0Var.i()) {
                        throw f0Var.k(null);
                    }
                    return;
                } catch (IOException e9) {
                    if (!f0Var.i()) {
                        throw e9;
                    }
                    throw f0Var.k(e9);
                } finally {
                    f0Var.i();
                }
            default:
                ((OutputStream) this.f3580h).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f3578f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "AsyncTimeout.sink(" + ((c) this.f3580h) + ')';
            default:
                return "sink(" + ((OutputStream) this.f3580h) + ')';
        }
    }

    public c(f0 f0Var, c cVar) {
        this.f3579g = f0Var;
        this.f3580h = cVar;
    }
}
