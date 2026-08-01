package t1;

import C1.v;
import C1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f3738a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3739b;

    /* renamed from: c, reason: collision with root package name */
    public long f3740c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3741e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3742f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3743g;

    public d(e eVar, v vVar, long j2) {
        e1.d.e(vVar, "delegate");
        this.f3743g = eVar;
        this.f3738a = vVar;
        this.f3739b = j2;
        this.d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // C1.v
    public final x a() {
        return this.f3738a.a();
    }

    @Override // C1.v
    public final long b(C1.f fVar, long j2) {
        e1.d.e(fVar, "sink");
        if (this.f3742f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3738a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3743g;
                eVar.getClass();
                e1.d.e(eVar.f3744a, "call");
            }
            if (b2 == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f3740c + b2;
            long j4 = this.f3739b;
            if (j4 == -1 || j3 <= j4) {
                this.f3740c = j3;
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
        if (this.f3742f) {
            return;
        }
        this.f3742f = true;
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3738a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3741e) {
            return iOException;
        }
        this.f3741e = true;
        e eVar = this.f3743g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            e1.d.e(eVar.f3744a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3738a + ')';
    }
}
