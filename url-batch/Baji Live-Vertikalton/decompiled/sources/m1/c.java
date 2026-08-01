package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final s f3180a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3181b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3182c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3184f;

    public c(e eVar, s sVar, long j2) {
        X0.e.e(sVar, "delegate");
        this.f3184f = eVar;
        this.f3180a = sVar;
        this.f3181b = j2;
    }

    @Override // v1.s
    public final w a() {
        return this.f3180a.a();
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3183e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3181b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3180a.c(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw f(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3183e) {
            return;
        }
        this.f3183e = true;
        long j2 = this.f3181b;
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
        this.f3180a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3182c) {
            return iOException;
        }
        this.f3182c = true;
        return this.f3184f.a(false, true, iOException);
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        try {
            g();
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void g() {
        this.f3180a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3180a + ')';
    }
}
