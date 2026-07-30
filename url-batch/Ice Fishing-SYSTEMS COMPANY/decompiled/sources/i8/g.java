package i8;

import com.google.android.gms.internal.ads.C4088vv;
import java.io.IOException;
import java.net.ProtocolException;
import u8.z;

/* loaded from: classes2.dex */
public final class g implements u8.v {

    /* renamed from: n, reason: collision with root package name */
    public final u8.v f38361n;

    /* renamed from: u, reason: collision with root package name */
    public final long f38362u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38363v;

    /* renamed from: w, reason: collision with root package name */
    public long f38364w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f38365x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f38366y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C4088vv f38367z;

    public g(C4088vv c4088vv, u8.v delegate, long j9) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f38367z = c4088vv;
        this.f38361n = delegate;
        this.f38362u = j9;
        this.f38365x = c4088vv.f34897n;
    }

    @Override // u8.v
    public final z L() {
        return this.f38361n.L();
    }

    @Override // u8.v
    public final void N(long j9, u8.e eVar) {
        if (this.f38366y) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f38362u;
        if (j10 != -1 && this.f38364w + j9 > j10) {
            throw new ProtocolException("expected " + j10 + " bytes but received " + (this.f38364w + j9));
        }
        try {
            if (this.f38365x) {
                this.f38365x = false;
                C4088vv c4088vv = this.f38367z;
                c4088vv.getClass();
                q call = (q) c4088vv.f34899v;
                kotlin.jvm.internal.h.e(call, "call");
            }
            this.f38361n.N(j9, eVar);
            this.f38364w += j9;
        } catch (IOException e6) {
            IOException g9 = g(e6);
            kotlin.jvm.internal.h.b(g9);
            throw g9;
        }
    }

    public final void b() {
        this.f38361n.close();
    }

    @Override // u8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38366y) {
            return;
        }
        this.f38366y = true;
        long j9 = this.f38362u;
        if (j9 != -1 && this.f38364w != j9) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            b();
            g(null);
        } catch (IOException e6) {
            IOException g9 = g(e6);
            kotlin.jvm.internal.h.b(g9);
            throw g9;
        }
    }

    @Override // u8.v, java.io.Flushable
    public final void flush() {
        try {
            j();
        } catch (IOException e6) {
            IOException g9 = g(e6);
            kotlin.jvm.internal.h.b(g9);
            throw g9;
        }
    }

    public final IOException g(IOException iOException) {
        if (this.f38363v) {
            return iOException;
        }
        this.f38363v = true;
        return C4088vv.a(this.f38367z, iOException, 2);
    }

    public final void j() {
        this.f38361n.flush();
    }

    public final String toString() {
        return g.class.getSimpleName() + '(' + this.f38361n + ')';
    }
}
