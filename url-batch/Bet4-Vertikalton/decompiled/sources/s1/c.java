package s1;

import B1.t;
import B1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3694a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3695b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3696c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3698f;

    public c(e eVar, t tVar, long j2) {
        d1.d.e(tVar, "delegate");
        this.f3698f = eVar;
        this.f3694a = tVar;
        this.f3695b = j2;
    }

    @Override // B1.t
    public final x a() {
        return this.f3694a.a();
    }

    @Override // B1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3697e) {
            return;
        }
        this.f3697e = true;
        long j2 = this.f3695b;
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

    @Override // B1.t
    public final void e(B1.f fVar, long j2) {
        if (this.f3697e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3695b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3694a.e(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw h(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    @Override // B1.t, java.io.Flushable
    public final void flush() {
        try {
            i();
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3694a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3696c) {
            return iOException;
        }
        this.f3696c = true;
        return this.f3698f.a(false, true, iOException);
    }

    public final void i() {
        this.f3694a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3694a + ')';
    }
}
