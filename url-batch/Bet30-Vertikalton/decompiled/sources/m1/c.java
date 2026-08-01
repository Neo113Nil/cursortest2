package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3203b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3204c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3206f;

    public c(e eVar, t tVar, long j2) {
        X0.d.e(tVar, "delegate");
        this.f3206f = eVar;
        this.f3202a = tVar;
        this.f3203b = j2;
    }

    @Override // v1.t
    public final x a() {
        return this.f3202a.a();
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3205e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3203b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3202a.c(fVar, j2);
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
        if (this.f3205e) {
            return;
        }
        this.f3205e = true;
        long j2 = this.f3203b;
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
        this.f3202a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3204c) {
            return iOException;
        }
        this.f3204c = true;
        return this.f3206f.a(false, true, iOException);
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
        this.f3202a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3202a + ')';
    }
}
