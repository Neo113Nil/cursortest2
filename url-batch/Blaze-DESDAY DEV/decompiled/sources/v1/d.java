package v1;

import E1.v;
import E1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f4025a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4026b;

    /* renamed from: c, reason: collision with root package name */
    public long f4027c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4028e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f4030g;

    public d(e eVar, v vVar, long j2) {
        g1.d.e(vVar, "delegate");
        this.f4030g = eVar;
        this.f4025a = vVar;
        this.f4026b = j2;
        this.d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // E1.v
    public final x a() {
        return this.f4025a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4029f) {
            return;
        }
        this.f4029f = true;
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    @Override // E1.v
    public final long d(E1.f fVar, long j2) {
        g1.d.e(fVar, "sink");
        if (this.f4029f) {
            throw new IllegalStateException("closed");
        }
        try {
            long d = this.f4025a.d(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f4030g;
                eVar.getClass();
                g1.d.e(eVar.f4031a, "call");
            }
            if (d == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f4027c + d;
            long j4 = this.f4026b;
            if (j4 == -1 || j3 <= j4) {
                this.f4027c = j3;
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
        this.f4025a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f4028e) {
            return iOException;
        }
        this.f4028e = true;
        e eVar = this.f4030g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            g1.d.e(eVar.f4031a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f4025a + ')';
    }
}
