package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.u;
import v1.w;

/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final u f3203a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3204b;

    /* renamed from: c, reason: collision with root package name */
    public long f3205c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3206e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3208g;

    public d(e eVar, u uVar, long j2) {
        X0.e.e(uVar, "delegate");
        this.f3208g = eVar;
        this.f3203a = uVar;
        this.f3204b = j2;
        this.d = true;
        if (j2 == 0) {
            f(null);
        }
    }

    @Override // v1.u
    public final w a() {
        return this.f3203a.a();
    }

    @Override // v1.u
    public final long b(v1.f fVar, long j2) {
        X0.e.e(fVar, "sink");
        if (this.f3207f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3203a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3208g;
                eVar.getClass();
                X0.e.e(eVar.f3209a, "call");
            }
            if (b2 == -1) {
                f(null);
                return -1L;
            }
            long j3 = this.f3205c + b2;
            long j4 = this.f3204b;
            if (j4 == -1 || j3 <= j4) {
                this.f3205c = j3;
                if (j3 == j4) {
                    f(null);
                }
                return b2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3207f) {
            return;
        }
        this.f3207f = true;
        try {
            e();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void e() {
        this.f3203a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3206e) {
            return iOException;
        }
        this.f3206e = true;
        e eVar = this.f3208g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            X0.e.e(eVar.f3209a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3203a + ')';
    }
}
