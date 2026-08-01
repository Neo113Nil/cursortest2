package D1;

import M1.t;
import M1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f152a;

    /* renamed from: b, reason: collision with root package name */
    public final long f153b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f154c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f156f;

    public c(e eVar, t tVar, long j2) {
        k1.e.e(tVar, "delegate");
        this.f156f = eVar;
        this.f152a = tVar;
        this.f153b = j2;
    }

    public final void a() {
        this.f152a.close();
    }

    @Override // M1.t
    public final x b() {
        return this.f152a.b();
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f155e) {
            return;
        }
        this.f155e = true;
        long j2 = this.f153b;
        if (j2 != -1 && this.d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            d(null);
        } catch (IOException e2) {
            throw d(e2);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f154c) {
            return iOException;
        }
        this.f154c = true;
        return this.f156f.a(false, true, iOException);
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        try {
            j();
        } catch (IOException e2) {
            throw d(e2);
        }
    }

    @Override // M1.t
    public final void i(M1.f fVar, long j2) {
        if (this.f155e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f153b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f152a.i(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw d(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    public final void j() {
        this.f152a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f152a + ')';
    }
}
