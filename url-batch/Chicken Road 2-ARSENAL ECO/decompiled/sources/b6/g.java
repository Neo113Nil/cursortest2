package b6;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class g implements n6.u {

    /* renamed from: f, reason: collision with root package name */
    public final n6.u f3651f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3652g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3653h;

    /* renamed from: i, reason: collision with root package name */
    public long f3654i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3655j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3656k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U.a f3657l;

    public g(U.a aVar, n6.u delegate, long j4) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f3657l = aVar;
        this.f3651f = delegate;
        this.f3652g = j4;
        this.f3655j = aVar.f2481a;
    }

    public final void a() {
        this.f3651f.close();
    }

    @Override // n6.u
    public final n6.y b() {
        return this.f3651f.b();
    }

    @Override // n6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3656k) {
            return;
        }
        this.f3656k = true;
        long j4 = this.f3652g;
        if (j4 != -1 && this.f3654i != j4) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            d(null);
        } catch (IOException e4) {
            IOException d7 = d(e4);
            kotlin.jvm.internal.i.b(d7);
            throw d7;
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f3653h) {
            return iOException;
        }
        this.f3653h = true;
        return U.a.a(this.f3657l, iOException, 2);
    }

    public final void e() {
        this.f3651f.flush();
    }

    @Override // n6.u, java.io.Flushable
    public final void flush() {
        try {
            e();
        } catch (IOException e4) {
            IOException d7 = d(e4);
            kotlin.jvm.internal.i.b(d7);
            throw d7;
        }
    }

    @Override // n6.u
    public final void l(long j4, n6.f fVar) {
        if (this.f3656k) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f3652g;
        if (j7 != -1 && this.f3654i + j4 > j7) {
            throw new ProtocolException("expected " + j7 + " bytes but received " + (this.f3654i + j4));
        }
        try {
            if (this.f3655j) {
                this.f3655j = false;
                this.f3657l.getClass();
            }
            this.f3651f.l(j4, fVar);
            this.f3654i += j4;
        } catch (IOException e4) {
            IOException d7 = d(e4);
            kotlin.jvm.internal.i.b(d7);
            throw d7;
        }
    }

    public final String toString() {
        return g.class.getSimpleName() + '(' + this.f3651f + ')';
    }
}
