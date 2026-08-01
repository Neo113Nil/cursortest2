package w1;

import F1.t;
import F1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f4210a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4211b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4212c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f4214f;

    public c(e eVar, t tVar, long j2) {
        h1.d.e(tVar, "delegate");
        this.f4214f = eVar;
        this.f4210a = tVar;
        this.f4211b = j2;
    }

    @Override // F1.t
    public final x a() {
        return this.f4210a.a();
    }

    @Override // F1.t
    public final void b(F1.f fVar, long j2) {
        if (this.f4213e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f4211b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f4210a.b(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw h(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    @Override // F1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4213e) {
            return;
        }
        this.f4213e = true;
        long j2 = this.f4211b;
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

    @Override // F1.t, java.io.Flushable
    public final void flush() {
        try {
            i();
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f4210a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f4212c) {
            return iOException;
        }
        this.f4212c = true;
        return this.f4214f.a(false, true, iOException);
    }

    public final void i() {
        this.f4210a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f4210a + ')';
    }
}
