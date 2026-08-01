package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.v;
import v1.x;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f3207a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3208b;

    /* renamed from: c, reason: collision with root package name */
    public long f3209c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3210e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3212g;

    public d(e eVar, v vVar, long j2) {
        X0.d.e(vVar, "delegate");
        this.f3212g = eVar;
        this.f3207a = vVar;
        this.f3208b = j2;
        this.d = true;
        if (j2 == 0) {
            f(null);
        }
    }

    @Override // v1.v
    public final x a() {
        return this.f3207a.a();
    }

    @Override // v1.v
    public final long b(v1.f fVar, long j2) {
        X0.d.e(fVar, "sink");
        if (this.f3211f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3207a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3212g;
                eVar.getClass();
                X0.d.e(eVar.f3213a, "call");
            }
            if (b2 == -1) {
                f(null);
                return -1L;
            }
            long j3 = this.f3209c + b2;
            long j4 = this.f3208b;
            if (j4 == -1 || j3 <= j4) {
                this.f3209c = j3;
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
        if (this.f3211f) {
            return;
        }
        this.f3211f = true;
        try {
            e();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void e() {
        this.f3207a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3210e) {
            return iOException;
        }
        this.f3210e = true;
        e eVar = this.f3212g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            X0.d.e(eVar.f3213a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3207a + ')';
    }
}
