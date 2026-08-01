package v1;

import E1.v;
import E1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f3855a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3856b;

    /* renamed from: c, reason: collision with root package name */
    public long f3857c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3858e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3860g;

    public d(e eVar, v vVar, long j2) {
        g1.d.e(vVar, "delegate");
        this.f3860g = eVar;
        this.f3855a = vVar;
        this.f3856b = j2;
        this.d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // E1.v
    public final x a() {
        return this.f3855a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3859f) {
            return;
        }
        this.f3859f = true;
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
        if (this.f3859f) {
            throw new IllegalStateException("closed");
        }
        try {
            long d = this.f3855a.d(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3860g;
                eVar.getClass();
                g1.d.e(eVar.f3861a, "call");
            }
            if (d == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f3857c + d;
            long j4 = this.f3856b;
            if (j4 == -1 || j3 <= j4) {
                this.f3857c = j3;
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
        this.f3855a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3858e) {
            return iOException;
        }
        this.f3858e = true;
        e eVar = this.f3860g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            g1.d.e(eVar.f3861a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3855a + ')';
    }
}
