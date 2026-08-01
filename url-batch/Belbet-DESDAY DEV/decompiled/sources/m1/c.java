package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3203a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3204b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3205c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3207f;

    public c(e eVar, t tVar, long j2) {
        X0.d.e(tVar, "delegate");
        this.f3207f = eVar;
        this.f3203a = tVar;
        this.f3204b = j2;
    }

    @Override // v1.t
    public final x a() {
        return this.f3203a.a();
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3206e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3204b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3203a.c(fVar, j2);
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
        if (this.f3206e) {
            return;
        }
        this.f3206e = true;
        long j2 = this.f3204b;
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
        this.f3203a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3205c) {
            return iOException;
        }
        this.f3205c = true;
        return this.f3207f.a(false, true, iOException);
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
        this.f3203a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3203a + ')';
    }
}
