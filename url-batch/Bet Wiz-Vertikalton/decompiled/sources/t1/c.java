package t1;

import C1.t;
import C1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3733a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3734b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3735c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3737f;

    public c(e eVar, t tVar, long j2) {
        e1.d.e(tVar, "delegate");
        this.f3737f = eVar;
        this.f3733a = tVar;
        this.f3734b = j2;
    }

    @Override // C1.t
    public final x a() {
        return this.f3733a.a();
    }

    @Override // C1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3736e) {
            return;
        }
        this.f3736e = true;
        long j2 = this.f3734b;
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

    @Override // C1.t
    public final void f(C1.f fVar, long j2) {
        if (this.f3736e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3734b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3733a.f(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw h(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    @Override // C1.t, java.io.Flushable
    public final void flush() {
        try {
            i();
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3733a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3735c) {
            return iOException;
        }
        this.f3735c = true;
        return this.f3737f.a(false, true, iOException);
    }

    public final void i() {
        this.f3733a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3733a + ')';
    }
}
