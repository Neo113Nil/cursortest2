package q1;

import java.io.IOException;
import java.net.ProtocolException;
import z1.v;
import z1.x;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f3452a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3453b;

    /* renamed from: c, reason: collision with root package name */
    public long f3454c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3455e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3457g;

    public d(e eVar, v vVar, long j2) {
        b1.d.e(vVar, "delegate");
        this.f3457g = eVar;
        this.f3452a = vVar;
        this.f3453b = j2;
        this.d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // z1.v
    public final x a() {
        return this.f3452a.a();
    }

    @Override // z1.v
    public final long b(z1.f fVar, long j2) {
        b1.d.e(fVar, "sink");
        if (this.f3456f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3452a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3457g;
                eVar.getClass();
                b1.d.e(eVar.f3458a, "call");
            }
            if (b2 == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f3454c + b2;
            long j4 = this.f3453b;
            if (j4 == -1 || j3 <= j4) {
                this.f3454c = j3;
                if (j3 == j4) {
                    h(null);
                }
                return b2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3456f) {
            return;
        }
        this.f3456f = true;
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3452a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3455e) {
            return iOException;
        }
        this.f3455e = true;
        e eVar = this.f3457g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            b1.d.e(eVar.f3458a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3452a + ')';
    }
}
