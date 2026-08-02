package t0;

import E1.P;
import T.G;
import android.os.SystemClock;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import v0.AbstractC1450b;
import y0.F;
import y0.InterfaceC1575g;
import y0.y;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1427b implements u0.o, u0.k, InterfaceC1575g, y0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15266a;

    public /* synthetic */ C1427b(int i4) {
        this.f15266a = i4;
    }

    public static g1.e f(u0.h hVar, P p2) {
        IOException iOException = (IOException) p2.f519c;
        if (!(iOException instanceof Y.v)) {
            return null;
        }
        int i4 = ((Y.v) iOException).f3743c;
        if (i4 != 403 && i4 != 404 && i4 != 410 && i4 != 416 && i4 != 500 && i4 != 503) {
            return null;
        }
        if (hVar.a(1)) {
            return new g1.e(1, 300000L);
        }
        if (hVar.a(2)) {
            return new g1.e(2, 60000L);
        }
        return null;
    }

    public static long h(P p2) {
        for (Throwable th = (IOException) p2.f519c; th != null; th = th.getCause()) {
            if ((th instanceof G) || (th instanceof FileNotFoundException) || (th instanceof Y.s) || (th instanceof u0.m)) {
                return -9223372036854775807L;
            }
            if ((th instanceof Y.i) && ((Y.i) th).f3694a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((p2.f518b - 1) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 5000);
    }

    @Override // u0.k
    public void c() {
        synchronized (AbstractC1450b.f15531a) {
            Object obj = AbstractC1450b.f15532b;
            synchronized (obj) {
                if (AbstractC1450b.f15533c) {
                    return;
                }
                long a3 = AbstractC1450b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    AbstractC1450b.f15534d = a3;
                    AbstractC1450b.f15533c = true;
                }
            }
        }
    }

    public int g(int i4) {
        return i4 == 7 ? 6 : 3;
    }

    @Override // y0.p
    public void r() {
        switch (this.f15266a) {
            case 6:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // y0.p
    public void x(y yVar) {
        switch (this.f15266a) {
            case 6:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // y0.p
    public F z(int i4, int i5) {
        switch (this.f15266a) {
            case 6:
                throw new UnsupportedOperationException();
            default:
                return new y0.m();
        }
    }

    private final void e() {
    }

    @Override // u0.o
    public void a() {
    }

    @Override // u0.k
    public void d() {
    }

    private final void i(y yVar) {
    }

    @Override // y0.InterfaceC1575g
    public long b(long j4) {
        return j4;
    }
}
