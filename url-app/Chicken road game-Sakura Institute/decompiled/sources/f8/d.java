package f8;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3584f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3585g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3586h;

    public /* synthetic */ d(Object obj, int i7, Object obj2) {
        this.f3584f = i7;
        this.f3585g = obj;
        this.f3586h = obj2;
    }

    @Override // f8.g0
    public final i0 a() {
        switch (this.f3584f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (f0) this.f3585g;
            default:
                return (i0) this.f3586h;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3584f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f0 f0Var = (f0) this.f3585g;
                d dVar = (d) this.f3586h;
                f0Var.h();
                try {
                    dVar.close();
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
                ((InputStream) this.f3585g).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f3584f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "AsyncTimeout.source(" + ((d) this.f3586h) + ')';
            default:
                return "source(" + ((InputStream) this.f3585g) + ')';
        }
    }

    @Override // f8.g0
    public final long v(long j8, f fVar) {
        switch (this.f3584f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r6.k.f(fVar, "sink");
                f0 f0Var = (f0) this.f3585g;
                d dVar = (d) this.f3586h;
                f0Var.h();
                try {
                    long v5 = dVar.v(j8, fVar);
                    if (f0Var.i()) {
                        throw f0Var.k(null);
                    }
                    return v5;
                } catch (IOException e9) {
                    if (f0Var.i()) {
                        throw f0Var.k(e9);
                    }
                    throw e9;
                } finally {
                    f0Var.i();
                }
            default:
                r6.k.f(fVar, "sink");
                if (j8 == 0) {
                    return 0L;
                }
                if (j8 < 0) {
                    throw new IllegalArgumentException(a0.m.h(j8, "byteCount < 0: ").toString());
                }
                try {
                    ((i0) this.f3586h).f();
                    b0 F = fVar.F(1);
                    int read = ((InputStream) this.f3585g).read(F.f3571a, F.f3573c, (int) Math.min(j8, 8192 - F.f3573c));
                    if (read == -1) {
                        if (F.f3572b == F.f3573c) {
                            fVar.f3597f = F.a();
                            c0.a(F);
                        }
                        return -1L;
                    }
                    F.f3573c += read;
                    long j9 = read;
                    fVar.f3598g += j9;
                    return j9;
                } catch (AssertionError e10) {
                    if (a8.d.L(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
        }
    }
}
