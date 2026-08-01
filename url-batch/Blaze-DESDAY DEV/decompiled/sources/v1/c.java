package v1;

import E1.t;
import E1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f4020a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4021b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4022c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f4024f;

    public c(e eVar, t tVar, long j2) {
        g1.d.e(tVar, "delegate");
        this.f4024f = eVar;
        this.f4020a = tVar;
        this.f4021b = j2;
    }

    @Override // E1.t
    public final x a() {
        return this.f4020a.a();
    }

    @Override // E1.t
    public final void b(E1.f fVar, long j2) {
        if (this.f4023e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f4021b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f4020a.b(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw h(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4023e) {
            return;
        }
        this.f4023e = true;
        long j2 = this.f4021b;
        if (j2 != -1 && this.d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    @Override // E1.t, java.io.Flushable
    public final void flush() {
        try {
            i();
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f4020a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f4022c) {
            return iOException;
        }
        this.f4022c = true;
        return this.f4024f.a(false, true, iOException);
    }

    public final void i() {
        this.f4020a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f4020a + ')';
    }
}
