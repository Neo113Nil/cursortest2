package M2;

import K2.j;
import K2.n;
import T2.C0231f;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: g, reason: collision with root package name */
    public long f3492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f3493h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, long j3) {
        super(nVar);
        this.f3493h = nVar;
        this.f3492g = j3;
        if (j3 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3483e) {
            return;
        }
        if (this.f3492g != 0 && !H2.b.g(this, TimeUnit.MILLISECONDS)) {
            ((j) this.f3493h.f3334c).k();
            a();
        }
        this.f3483e = true;
    }

    @Override // M2.b, T2.F
    public final long f(C0231f c0231f, long j3) {
        f2.j.f(c0231f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f3483e) {
            throw new IllegalStateException("closed");
        }
        long j4 = this.f3492g;
        if (j4 == 0) {
            return -1L;
        }
        long f3 = super.f(c0231f, Math.min(j4, j3));
        if (f3 == -1) {
            ((j) this.f3493h.f3334c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j5 = this.f3492g - f3;
        this.f3492g = j5;
        if (j5 == 0) {
            a();
        }
        return f3;
    }
}
