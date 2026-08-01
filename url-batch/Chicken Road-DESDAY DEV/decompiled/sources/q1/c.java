package q1;

import java.io.IOException;
import java.net.ProtocolException;
import z1.t;
import z1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3447a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3448b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3449c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3451f;

    public c(e eVar, t tVar, long j2) {
        b1.d.e(tVar, "delegate");
        this.f3451f = eVar;
        this.f3447a = tVar;
        this.f3448b = j2;
    }

    @Override // z1.t
    public final x a() {
        return this.f3447a.a();
    }

    @Override // z1.t
    public final void c(z1.f fVar, long j2) {
        if (this.f3450e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3448b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3447a.c(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw h(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3450e) {
            return;
        }
        this.f3450e = true;
        long j2 = this.f3448b;
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

    @Override // z1.t, java.io.Flushable
    public final void flush() {
        try {
            i();
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3447a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3449c) {
            return iOException;
        }
        this.f3449c = true;
        return this.f3451f.a(false, true, iOException);
    }

    public final void i() {
        this.f3447a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3447a + ')';
    }
}
