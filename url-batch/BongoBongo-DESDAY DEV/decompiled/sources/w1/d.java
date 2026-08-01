package w1;

import F1.v;
import F1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f4215a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4216b;

    /* renamed from: c, reason: collision with root package name */
    public long f4217c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4218e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f4220g;

    public d(e eVar, v vVar, long j2) {
        h1.d.e(vVar, "delegate");
        this.f4220g = eVar;
        this.f4215a = vVar;
        this.f4216b = j2;
        this.d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // F1.v
    public final x a() {
        return this.f4215a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4219f) {
            return;
        }
        this.f4219f = true;
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    @Override // F1.v
    public final long d(F1.f fVar, long j2) {
        h1.d.e(fVar, "sink");
        if (this.f4219f) {
            throw new IllegalStateException("closed");
        }
        try {
            long d = this.f4215a.d(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f4220g;
                eVar.getClass();
                h1.d.e(eVar.f4221a, "call");
            }
            if (d == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f4217c + d;
            long j4 = this.f4216b;
            if (j4 == -1 || j3 <= j4) {
                this.f4217c = j3;
                if (j3 == j4) {
                    h(null);
                }
                return d;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f4215a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f4218e) {
            return iOException;
        }
        this.f4218e = true;
        e eVar = this.f4220g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            h1.d.e(eVar.f4221a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f4215a + ')';
    }
}
