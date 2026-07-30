package i8;

import com.google.android.gms.internal.ads.C4088vv;
import java.io.IOException;
import java.net.ProtocolException;
import u8.z;

/* loaded from: classes2.dex */
public final class h implements u8.x {

    /* renamed from: n, reason: collision with root package name */
    public final u8.x f38368n;

    /* renamed from: u, reason: collision with root package name */
    public final long f38369u;

    /* renamed from: v, reason: collision with root package name */
    public long f38370v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f38371w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f38372x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f38373y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C4088vv f38374z;

    public h(C4088vv c4088vv, u8.x delegate, long j9) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f38374z = c4088vv;
        this.f38368n = delegate;
        this.f38369u = j9;
        this.f38371w = true;
        if (j9 == 0) {
            g(null);
        }
    }

    @Override // u8.x
    public final z L() {
        return this.f38368n.L();
    }

    public final void b() {
        this.f38368n.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38373y) {
            return;
        }
        this.f38373y = true;
        try {
            b();
            g(null);
        } catch (IOException e6) {
            IOException g9 = g(e6);
            kotlin.jvm.internal.h.b(g9);
            throw g9;
        }
    }

    @Override // u8.x
    public final long f(long j9, u8.e sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (this.f38373y) {
            throw new IllegalStateException("closed");
        }
        try {
            long f6 = this.f38368n.f(8192L, sink);
            boolean z8 = this.f38371w;
            C4088vv c4088vv = this.f38374z;
            if (z8) {
                this.f38371w = false;
                c4088vv.getClass();
                q call = (q) c4088vv.f34899v;
                kotlin.jvm.internal.h.e(call, "call");
            }
            if (f6 == -1) {
                g(null);
                return -1L;
            }
            long j10 = this.f38370v + f6;
            long j11 = this.f38369u;
            if (j11 == -1 || j10 <= j11) {
                this.f38370v = j10;
                if (((j8.f) c4088vv.f34901x).b()) {
                    g(null);
                }
                return f6;
            }
            throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
        } catch (IOException e6) {
            IOException g9 = g(e6);
            kotlin.jvm.internal.h.b(g9);
            throw g9;
        }
    }

    public final IOException g(IOException iOException) {
        if (this.f38372x) {
            return iOException;
        }
        this.f38372x = true;
        C4088vv c4088vv = this.f38374z;
        if (iOException == null && this.f38371w) {
            this.f38371w = false;
            c4088vv.getClass();
            q call = (q) c4088vv.f34899v;
            kotlin.jvm.internal.h.e(call, "call");
        }
        return C4088vv.a(c4088vv, iOException, 4);
    }

    public final String toString() {
        return h.class.getSimpleName() + '(' + this.f38368n + ')';
    }
}
