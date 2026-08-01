package F1;

import D1.m;
import D1.p;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e extends b {
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar, long j2) {
        super(pVar);
        this.f280e = pVar;
        this.d = j2;
        if (j2 == 0) {
            a();
        }
    }

    @Override // F1.b, M1.v
    public final long c(M1.f fVar, long j2) {
        k1.e.e(fVar, "sink");
        if (this.f272b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.d;
        if (j3 == 0) {
            return -1L;
        }
        long c2 = super.c(fVar, Math.min(j3, 8192L));
        if (c2 == -1) {
            ((m) this.f280e.f213c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j4 = this.d - c2;
        this.d = j4;
        if (j4 == 0) {
            a();
        }
        return c2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f272b) {
            return;
        }
        if (this.d != 0 && !A1.c.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f280e.f213c).k();
            a();
        }
        this.f272b = true;
    }
}
