package w7;

import c0.w;
import f8.g0;
import f8.n;
import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: g, reason: collision with root package name */
    public final long f9534g;

    /* renamed from: h, reason: collision with root package name */
    public long f9535h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9536i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9537j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9538k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f9539l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w wVar, g0 g0Var, long j8) {
        super(g0Var);
        r6.k.f(g0Var, "delegate");
        this.f9539l = wVar;
        this.f9534g = j8;
        this.f9536i = true;
        if (j8 == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f9537j) {
            return iOException;
        }
        this.f9537j = true;
        if (iOException == null && this.f9536i) {
            this.f9536i = false;
        }
        w wVar = this.f9539l;
        g gVar = (g) wVar.f1514b;
        if (iOException != null) {
            wVar.f(iOException);
        }
        return gVar.f(wVar, false, true, iOException);
    }

    @Override // f8.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9538k) {
            return;
        }
        this.f9538k = true;
        try {
            super.close();
            b(null);
        } catch (IOException e9) {
            throw b(e9);
        }
    }

    @Override // f8.g0
    public final long v(long j8, f8.f fVar) {
        r6.k.f(fVar, "sink");
        if (this.f9538k) {
            throw new IllegalStateException("closed");
        }
        try {
            long v5 = this.f3626f.v(j8, fVar);
            if (this.f9536i) {
                this.f9536i = false;
            }
            if (v5 == -1) {
                b(null);
                return -1L;
            }
            long j9 = this.f9535h + v5;
            long j10 = this.f9534g;
            if (j10 == -1 || j9 <= j10) {
                this.f9535h = j9;
                if (j9 == j10) {
                    b(null);
                }
                return v5;
            }
            throw new ProtocolException("expected " + j10 + " bytes but received " + j9);
        } catch (IOException e9) {
            throw b(e9);
        }
    }
}
