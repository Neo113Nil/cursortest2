package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.v;
import v1.x;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f3191a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3192b;

    /* renamed from: c, reason: collision with root package name */
    public long f3193c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3194e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3196g;

    public d(e eVar, v vVar, long j2) {
        X0.d.e(vVar, "delegate");
        this.f3196g = eVar;
        this.f3191a = vVar;
        this.f3192b = j2;
        this.d = true;
        if (j2 == 0) {
            f(null);
        }
    }

    @Override // v1.v
    public final x a() {
        return this.f3191a.a();
    }

    @Override // v1.v
    public final long b(v1.f fVar, long j2) {
        X0.d.e(fVar, "sink");
        if (this.f3195f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3191a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3196g;
                eVar.getClass();
                X0.d.e(eVar.f3197a, "call");
            }
            if (b2 == -1) {
                f(null);
                return -1L;
            }
            long j3 = this.f3193c + b2;
            long j4 = this.f3192b;
            if (j4 == -1 || j3 <= j4) {
                this.f3193c = j3;
                if (j3 == j4) {
                    f(null);
                }
                return b2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3195f) {
            return;
        }
        this.f3195f = true;
        try {
            e();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void e() {
        this.f3191a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3194e) {
            return iOException;
        }
        this.f3194e = true;
        e eVar = this.f3196g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            X0.d.e(eVar.f3197a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3191a + ')';
    }
}
