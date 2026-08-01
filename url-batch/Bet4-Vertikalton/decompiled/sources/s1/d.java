package s1;

import B1.v;
import B1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f3699a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3700b;

    /* renamed from: c, reason: collision with root package name */
    public long f3701c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3702e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3703f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3704g;

    public d(e eVar, v vVar, long j2) {
        d1.d.e(vVar, "delegate");
        this.f3704g = eVar;
        this.f3699a = vVar;
        this.f3700b = j2;
        this.d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // B1.v
    public final x a() {
        return this.f3699a.a();
    }

    @Override // B1.v
    public final long c(B1.f fVar, long j2) {
        d1.d.e(fVar, "sink");
        if (this.f3703f) {
            throw new IllegalStateException("closed");
        }
        try {
            long c2 = this.f3699a.c(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3704g;
                eVar.getClass();
                d1.d.e(eVar.f3705a, "call");
            }
            if (c2 == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f3701c + c2;
            long j4 = this.f3700b;
            if (j4 == -1 || j3 <= j4) {
                this.f3701c = j3;
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
        if (this.f3703f) {
            return;
        }
        this.f3703f = true;
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3699a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3702e) {
            return iOException;
        }
        this.f3702e = true;
        e eVar = this.f3704g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            d1.d.e(eVar.f3705a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3699a + ')';
    }
}
