package o1;

import java.io.IOException;
import java.net.ProtocolException;
import x1.v;
import x1.x;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f3371a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3372b;

    /* renamed from: c, reason: collision with root package name */
    public long f3373c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3374e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3376g;

    public d(e eVar, v vVar, long j2) {
        Z0.d.e(vVar, "delegate");
        this.f3376g = eVar;
        this.f3371a = vVar;
        this.f3372b = j2;
        this.d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // x1.v
    public final x a() {
        return this.f3371a.a();
    }

    @Override // x1.v
    public final long b(x1.f fVar, long j2) {
        Z0.d.e(fVar, "sink");
        if (this.f3375f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3371a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3376g;
                eVar.getClass();
                Z0.d.e(eVar.f3377a, "call");
            }
            if (b2 == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f3373c + b2;
            long j4 = this.f3372b;
            if (j4 == -1 || j3 <= j4) {
                this.f3373c = j3;
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
        if (this.f3375f) {
            return;
        }
        this.f3375f = true;
        try {
            f();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void f() {
        this.f3371a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3374e) {
            return iOException;
        }
        this.f3374e = true;
        e eVar = this.f3376g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            Z0.d.e(eVar.f3377a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3371a + ')';
    }
}
