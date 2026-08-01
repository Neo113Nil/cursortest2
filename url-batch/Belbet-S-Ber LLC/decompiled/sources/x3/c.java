package x3;

import g4.v;
import g4.x;
import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements v {

    /* renamed from: f, reason: collision with root package name */
    public final v f3894f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3895g;
    public long h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3896j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3897k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f3898l;

    public c(d dVar, v vVar, long j2) {
        i3.d.e(vVar, "delegate");
        this.f3898l = dVar;
        this.f3894f = vVar;
        this.f3895g = j2;
        this.i = true;
        if (j2 == 0) {
            n(null);
        }
    }

    @Override // g4.v
    public final x a() {
        return this.f3894f.a();
    }

    @Override // g4.v
    public final long c(long j2, g4.f fVar) {
        if (this.f3897k) {
            throw new IllegalStateException("closed");
        }
        try {
            long c5 = this.f3894f.c(8192L, fVar);
            if (this.i) {
                this.i = false;
            }
            if (c5 == -1) {
                n(null);
                return -1L;
            }
            long j4 = this.h + c5;
            long j5 = this.f3895g;
            if (j5 == -1 || j4 <= j5) {
                this.h = j4;
                if (j4 == j5) {
                    n(null);
                }
                return c5;
            }
            throw new ProtocolException("expected " + j5 + " bytes but received " + j4);
        } catch (IOException e4) {
            throw n(e4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3897k) {
            return;
        }
        this.f3897k = true;
        try {
            m();
            n(null);
        } catch (IOException e4) {
            throw n(e4);
        }
    }

    public final void m() {
        this.f3894f.close();
    }

    public final IOException n(IOException iOException) {
        if (this.f3896j) {
            return iOException;
        }
        this.f3896j = true;
        if (iOException == null && this.i) {
            this.i = false;
        }
        d dVar = this.f3898l;
        i iVar = dVar.f3899a;
        if (iOException != null) {
            dVar.b(iOException);
        }
        return iVar.g(dVar, false, true, iOException);
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3894f + ')';
    }
}
