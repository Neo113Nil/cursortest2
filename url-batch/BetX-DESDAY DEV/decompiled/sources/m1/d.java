package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.w;
import v1.y;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w f3549a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3550b;

    /* renamed from: c, reason: collision with root package name */
    public long f3551c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3552d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3553e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3555g;

    public d(e eVar, w wVar, long j2) {
        X0.f.e(wVar, "delegate");
        this.f3555g = eVar;
        this.f3549a = wVar;
        this.f3550b = j2;
        this.f3552d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // v1.w
    public final y a() {
        return this.f3549a.a();
    }

    @Override // v1.w
    public final long c(v1.f fVar, long j2) {
        X0.f.e(fVar, "sink");
        if (this.f3554f) {
            throw new IllegalStateException("closed");
        }
        try {
            long c2 = this.f3549a.c(fVar, 8192L);
            if (this.f3552d) {
                this.f3552d = false;
                e eVar = this.f3555g;
                eVar.getClass();
                X0.f.e(eVar.f3556a, "call");
            }
            if (c2 == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f3551c + c2;
            long j4 = this.f3550b;
            if (j4 == -1 || j3 <= j4) {
                this.f3551c = j3;
                if (j3 == j4) {
                    h(null);
                }
                return c2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3554f) {
            return;
        }
        this.f3554f = true;
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3549a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3553e) {
            return iOException;
        }
        this.f3553e = true;
        e eVar = this.f3555g;
        if (iOException == null && this.f3552d) {
            this.f3552d = false;
            eVar.getClass();
            X0.f.e(eVar.f3556a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3549a + ')';
    }
}
