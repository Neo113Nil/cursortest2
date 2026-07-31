package G2;

import E2.k;
import E2.o;
import N2.C0150f;
import Z1.i;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: g, reason: collision with root package name */
    public long f1592g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f1593h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, long j3) {
        super(oVar);
        this.f1593h = oVar;
        this.f1592g = j3;
        if (j3 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1583e) {
            return;
        }
        if (this.f1592g != 0 && !B2.c.g(this, TimeUnit.MILLISECONDS)) {
            ((k) this.f1593h.f847c).k();
            a();
        }
        this.f1583e = true;
    }

    @Override // G2.b, N2.F
    public final long l(C0150f c0150f, long j3) {
        i.f(c0150f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f1583e) {
            throw new IllegalStateException("closed");
        }
        long j4 = this.f1592g;
        if (j4 == 0) {
            return -1L;
        }
        long l3 = super.l(c0150f, Math.min(j4, j3));
        if (l3 == -1) {
            ((k) this.f1593h.f847c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j5 = this.f1592g - l3;
        this.f1592g = j5;
        if (j5 == 0) {
            a();
        }
        return l3;
    }
}
