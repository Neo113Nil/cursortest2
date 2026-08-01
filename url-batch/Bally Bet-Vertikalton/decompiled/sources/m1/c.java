package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3186a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3187b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3188c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3190f;

    public c(e eVar, t tVar, long j2) {
        X0.d.e(tVar, "delegate");
        this.f3190f = eVar;
        this.f3186a = tVar;
        this.f3187b = j2;
    }

    @Override // v1.t
    public final x a() {
        return this.f3186a.a();
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3189e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3187b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3186a.c(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw f(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3189e) {
            return;
        }
        this.f3189e = true;
        long j2 = this.f3187b;
        if (j2 != -1 && this.d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            e();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void e() {
        this.f3186a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3188c) {
            return iOException;
        }
        this.f3188c = true;
        return this.f3190f.a(false, true, iOException);
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        try {
            g();
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void g() {
        this.f3186a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3186a + ')';
    }
}
