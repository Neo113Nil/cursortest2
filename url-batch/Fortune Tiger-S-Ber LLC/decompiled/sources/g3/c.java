package g3;

import java.io.IOException;
import java.net.ProtocolException;
import p3.v;
import p3.x;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements v {

    /* renamed from: f, reason: collision with root package name */
    public final v f1925f;
    public final long g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1926i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1927j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1928k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f1929l;

    public c(d dVar, v vVar, long j4) {
        u2.c.e(vVar, "delegate");
        this.f1929l = dVar;
        this.f1925f = vVar;
        this.g = j4;
        this.f1926i = true;
        if (j4 == 0) {
            n(null);
        }
    }

    @Override // p3.v
    public final x a() {
        return this.f1925f.a();
    }

    @Override // p3.v
    public final long c(long j4, p3.f fVar) {
        if (this.f1928k) {
            throw new IllegalStateException("closed");
        }
        try {
            long c = this.f1925f.c(8192L, fVar);
            if (this.f1926i) {
                this.f1926i = false;
            }
            if (c == -1) {
                n(null);
                return -1L;
            }
            long j5 = this.h + c;
            long j6 = this.g;
            if (j6 == -1 || j5 <= j6) {
                this.h = j5;
                if (j5 == j6) {
                    n(null);
                }
                return c;
            }
            throw new ProtocolException("expected " + j6 + " bytes but received " + j5);
        } catch (IOException e4) {
            throw n(e4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1928k) {
            return;
        }
        this.f1928k = true;
        try {
            m();
            n(null);
        } catch (IOException e4) {
            throw n(e4);
        }
    }

    public final void m() {
        this.f1925f.close();
    }

    public final IOException n(IOException iOException) {
        if (this.f1927j) {
            return iOException;
        }
        this.f1927j = true;
        if (iOException == null && this.f1926i) {
            this.f1926i = false;
        }
        d dVar = this.f1929l;
        i iVar = dVar.f1930a;
        if (iOException != null) {
            dVar.b(iOException);
        }
        return iVar.g(dVar, false, true, iOException);
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f1925f + ')';
    }
}
