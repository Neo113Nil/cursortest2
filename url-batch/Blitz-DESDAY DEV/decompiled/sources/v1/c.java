package v1;

import E1.t;
import E1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3851b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3852c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3854f;

    public c(e eVar, t tVar, long j2) {
        g1.d.e(tVar, "delegate");
        this.f3854f = eVar;
        this.f3850a = tVar;
        this.f3851b = j2;
    }

    @Override // E1.t
    public final x a() {
        return this.f3850a.a();
    }

    @Override // E1.t
    public final void b(E1.f fVar, long j2) {
        if (this.f3853e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3851b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3850a.b(fVar, j2);
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
        if (this.f3853e) {
            return;
        }
        this.f3853e = true;
        long j2 = this.f3851b;
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
        this.f3850a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3852c) {
            return iOException;
        }
        this.f3852c = true;
        return this.f3854f.a(false, true, iOException);
    }

    public final void i() {
        this.f3850a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3850a + ')';
    }
}
