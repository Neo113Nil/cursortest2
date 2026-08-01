package D1;

import M1.t;
import M1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f208a;

    /* renamed from: b, reason: collision with root package name */
    public final long f209b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f210c;

    /* renamed from: d, reason: collision with root package name */
    public long f211d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f212f;

    public c(e eVar, t tVar, long j) {
        j1.h.e(tVar, "delegate");
        this.f212f = eVar;
        this.f208a = tVar;
        this.f209b = j;
    }

    public final void a() {
        this.f208a.close();
    }

    @Override // M1.t
    public final x b() {
        return this.f208a.b();
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        long j = this.f209b;
        if (j != -1 && this.f211d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            d(null);
        } catch (IOException e) {
            throw d(e);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f210c) {
            return iOException;
        }
        this.f210c = true;
        return this.f212f.a(false, true, iOException);
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        try {
            q();
        } catch (IOException e) {
            throw d(e);
        }
    }

    @Override // M1.t
    public final void n(M1.f fVar, long j) {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f209b;
        if (j2 == -1 || this.f211d + j <= j2) {
            try {
                this.f208a.n(fVar, j);
                this.f211d += j;
                return;
            } catch (IOException e) {
                throw d(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f211d + j));
    }

    public final void q() {
        this.f208a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f208a + ')';
    }
}
