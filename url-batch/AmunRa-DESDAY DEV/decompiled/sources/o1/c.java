package o1;

import java.io.IOException;
import java.net.ProtocolException;
import x1.t;
import x1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3366a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3367b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3368c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3370f;

    public c(e eVar, t tVar, long j2) {
        Z0.d.e(tVar, "delegate");
        this.f3370f = eVar;
        this.f3366a = tVar;
        this.f3367b = j2;
    }

    @Override // x1.t
    public final x a() {
        return this.f3366a.a();
    }

    @Override // x1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3369e) {
            return;
        }
        this.f3369e = true;
        long j2 = this.f3367b;
        if (j2 != -1 && this.d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            f();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void f() {
        this.f3366a.close();
    }

    @Override // x1.t, java.io.Flushable
    public final void flush() {
        try {
            i();
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    @Override // x1.t
    public final void g(x1.f fVar, long j2) {
        if (this.f3369e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3367b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3366a.g(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw h(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    public final IOException h(IOException iOException) {
        if (this.f3368c) {
            return iOException;
        }
        this.f3368c = true;
        return this.f3370f.a(false, true, iOException);
    }

    public final void i() {
        this.f3366a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3366a + ')';
    }
}
