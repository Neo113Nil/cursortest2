package K3;

import T3.t;
import T3.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f1532a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1533b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1534c;

    /* renamed from: d, reason: collision with root package name */
    public long f1535d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1537f;

    public c(e eVar, t delegate, long j4) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f1537f = eVar;
        this.f1532a = delegate;
        this.f1533b = j4;
    }

    public final void a() {
        this.f1532a.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f1534c) {
            return iOException;
        }
        this.f1534c = true;
        return this.f1537f.a(false, true, iOException);
    }

    @Override // T3.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1536e) {
            return;
        }
        this.f1536e = true;
        long j4 = this.f1533b;
        if (j4 != -1 && this.f1535d != j4) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            b(null);
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    @Override // T3.t
    public final x d() {
        return this.f1532a.d();
    }

    public final void e() {
        this.f1532a.flush();
    }

    @Override // T3.t, java.io.Flushable
    public final void flush() {
        try {
            e();
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    @Override // T3.t
    public final void o(T3.g gVar, long j4) {
        if (this.f1536e) {
            throw new IllegalStateException("closed");
        }
        long j5 = this.f1533b;
        if (j5 == -1 || this.f1535d + j4 <= j5) {
            try {
                this.f1532a.o(gVar, j4);
                this.f1535d += j4;
                return;
            } catch (IOException e4) {
                throw b(e4);
            }
        }
        throw new ProtocolException("expected " + j5 + " bytes but received " + (this.f1535d + j4));
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f1532a + ')';
    }
}
