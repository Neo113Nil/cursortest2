package q1;

import java.io.IOException;
import java.net.ProtocolException;
import z1.v;
import z1.x;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f3505a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3506b;

    /* renamed from: c, reason: collision with root package name */
    public long f3507c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3508e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3510g;

    public d(e eVar, v vVar, long j2) {
        b1.d.e(vVar, "delegate");
        this.f3510g = eVar;
        this.f3505a = vVar;
        this.f3506b = j2;
        this.d = true;
        if (j2 == 0) {
            h(null);
        }
    }

    @Override // z1.v
    public final x a() {
        return this.f3505a.a();
    }

    @Override // z1.v
    public final long b(z1.f fVar, long j2) {
        b1.d.e(fVar, "sink");
        if (this.f3509f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3505a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3510g;
                eVar.getClass();
                b1.d.e(eVar.f3511a, "call");
            }
            if (b2 == -1) {
                h(null);
                return -1L;
            }
            long j3 = this.f3507c + b2;
            long j4 = this.f3506b;
            if (j4 == -1 || j3 <= j4) {
                this.f3507c = j3;
                if (j3 == j4) {
                    h(null);
                }
                return b2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3509f) {
            return;
        }
        this.f3509f = true;
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3505a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3508e) {
            return iOException;
        }
        this.f3508e = true;
        e eVar = this.f3510g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            b1.d.e(eVar.f3511a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3505a + ')';
    }
}
