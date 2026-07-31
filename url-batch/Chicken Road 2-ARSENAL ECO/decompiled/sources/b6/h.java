package b6;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class h implements n6.w {

    /* renamed from: f, reason: collision with root package name */
    public final n6.w f3658f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3659g;

    /* renamed from: h, reason: collision with root package name */
    public long f3660h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3661i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3662j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3663k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U.a f3664l;

    public h(U.a aVar, n6.w delegate, long j4) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f3664l = aVar;
        this.f3658f = delegate;
        this.f3659g = j4;
        this.f3661i = true;
        if (j4 == 0) {
            d(null);
        }
    }

    public final void a() {
        this.f3658f.close();
    }

    @Override // n6.w
    public final n6.y b() {
        return this.f3658f.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3663k) {
            return;
        }
        this.f3663k = true;
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
        if (this.f3662j) {
            return iOException;
        }
        this.f3662j = true;
        U.a aVar = this.f3664l;
        if (iOException == null && this.f3661i) {
            this.f3661i = false;
            aVar.getClass();
        }
        return U.a.a(aVar, iOException, 4);
    }

    @Override // n6.w
    public final long i(long j4, n6.f fVar) {
        if (this.f3663k) {
            throw new IllegalStateException("closed");
        }
        try {
            long i7 = this.f3658f.i(8192L, fVar);
            boolean z5 = this.f3661i;
            U.a aVar = this.f3664l;
            if (z5) {
                this.f3661i = false;
                aVar.getClass();
            }
            if (i7 == -1) {
                d(null);
                return -1L;
            }
            long j7 = this.f3660h + i7;
            long j8 = this.f3659g;
            if (j8 == -1 || j7 <= j8) {
                this.f3660h = j7;
                if (((c6.f) aVar.f2485e).d()) {
                    d(null);
                }
                return i7;
            }
            throw new ProtocolException("expected " + j8 + " bytes but received " + j7);
        } catch (IOException e4) {
            IOException d7 = d(e4);
            kotlin.jvm.internal.i.b(d7);
            throw d7;
        }
    }

    public final String toString() {
        return h.class.getSimpleName() + '(' + this.f3658f + ')';
    }
}
