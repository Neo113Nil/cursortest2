package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.w;
import v1.y;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w f3545a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3546b;

    /* renamed from: c, reason: collision with root package name */
    public long f3547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3548d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3549e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3551g;

    public d(e eVar, w wVar, long j2) {
        X0.f.e(wVar, "delegate");
        this.f3551g = eVar;
        this.f3545a = wVar;
        this.f3546b = j2;
        this.f3548d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // v1.w
    public final y a() {
        return this.f3545a.a();
    }

    @Override // v1.w
    public final long c(v1.f fVar, long j2) {
        X0.f.e(fVar, "sink");
        if (this.f3550f) {
            throw new IllegalStateException("closed");
        }
        try {
            long c2 = this.f3545a.c(fVar, 8192L);
            if (this.f3548d) {
                this.f3548d = false;
                e eVar = this.f3551g;
                eVar.getClass();
                X0.f.e(eVar.f3552a, "call");
            }
            if (c2 == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f3547c + c2;
            long j4 = this.f3546b;
            if (j4 == -1 || j3 <= j4) {
                this.f3547c = j3;
                if (j3 == j4) {
                    h(null);
                }
                return c2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3550f) {
            return;
        }
        this.f3550f = true;
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3545a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3549e) {
            return iOException;
        }
        this.f3549e = true;
        e eVar = this.f3551g;
        if (iOException == null && this.f3548d) {
            this.f3548d = false;
            eVar.getClass();
            X0.f.e(eVar.f3552a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3545a + ')';
    }
}
