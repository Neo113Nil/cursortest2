package D1;

import M1.v;
import M1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f157a;

    /* renamed from: b, reason: collision with root package name */
    public final long f158b;

    /* renamed from: c, reason: collision with root package name */
    public long f159c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f160e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f162g;

    public d(e eVar, v vVar, long j2) {
        k1.e.e(vVar, "delegate");
        this.f162g = eVar;
        this.f157a = vVar;
        this.f158b = j2;
        this.d = true;
        if (j2 == 0) {
            d(null);
        }
    }

    public final void a() {
        this.f157a.close();
    }

    @Override // M1.v
    public final x b() {
        return this.f157a.b();
    }

    @Override // M1.v
    public final long c(M1.f fVar, long j2) {
        k1.e.e(fVar, "sink");
        if (this.f161f) {
            throw new IllegalStateException("closed");
        }
        try {
            long c2 = this.f157a.c(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f162g;
                eVar.getClass();
                k1.e.e(eVar.f163a, "call");
            }
            if (c2 == -1) {
                d(null);
                return -1L;
            }
            long j3 = this.f159c + c2;
            long j4 = this.f158b;
            if (j4 == -1 || j3 <= j4) {
                this.f159c = j3;
                if (j3 == j4) {
                    d(null);
                }
                return c2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw d(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f161f) {
            return;
        }
        this.f161f = true;
        try {
            a();
            d(null);
        } catch (IOException e2) {
            throw d(e2);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f160e) {
            return iOException;
        }
        this.f160e = true;
        e eVar = this.f162g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            k1.e.e(eVar.f163a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f157a + ')';
    }
}
