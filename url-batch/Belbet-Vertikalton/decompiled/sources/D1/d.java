package D1;

import M1.v;
import M1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f213a;

    /* renamed from: b, reason: collision with root package name */
    public final long f214b;

    /* renamed from: c, reason: collision with root package name */
    public long f215c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f216d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f218g;

    public d(e eVar, v vVar, long j) {
        j1.h.e(vVar, "delegate");
        this.f218g = eVar;
        this.f213a = vVar;
        this.f214b = j;
        this.f216d = true;
        if (j == 0) {
            d(null);
        }
    }

    public final void a() {
        this.f213a.close();
    }

    @Override // M1.v
    public final x b() {
        return this.f213a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f217f) {
            return;
        }
        this.f217f = true;
        try {
            a();
            d(null);
        } catch (IOException e) {
            throw d(e);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.e) {
            return iOException;
        }
        this.e = true;
        e eVar = this.f218g;
        if (iOException == null && this.f216d) {
            this.f216d = false;
            eVar.getClass();
            j1.h.e(eVar.f219a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    @Override // M1.v
    public final long h(M1.f fVar, long j) {
        j1.h.e(fVar, "sink");
        if (this.f217f) {
            throw new IllegalStateException("closed");
        }
        try {
            long h2 = this.f213a.h(fVar, 8192L);
            if (this.f216d) {
                this.f216d = false;
                e eVar = this.f218g;
                eVar.getClass();
                j1.h.e(eVar.f219a, "call");
            }
            if (h2 == -1) {
                d(null);
                return -1L;
            }
            long j2 = this.f215c + h2;
            long j3 = this.f214b;
            if (j3 == -1 || j2 <= j3) {
                this.f215c = j2;
                if (j2 == j3) {
                    d(null);
                }
                return h2;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw d(e);
        }
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f213a + ')';
    }
}
