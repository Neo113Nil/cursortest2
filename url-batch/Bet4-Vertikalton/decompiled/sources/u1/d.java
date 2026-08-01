package u1;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import s1.m;
import s1.p;

/* loaded from: classes.dex */
public final class d extends a {
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f3826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, long j2) {
        super(pVar);
        this.f3826e = pVar;
        this.d = j2;
        if (j2 == 0) {
            g();
        }
    }

    @Override // u1.a, B1.v
    public final long c(B1.f fVar, long j2) {
        d1.d.e(fVar, "sink");
        if (this.f3818b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.d;
        if (j3 == 0) {
            return -1L;
        }
        long c2 = super.c(fVar, Math.min(j3, 8192L));
        if (c2 == -1) {
            ((m) this.f3826e.f3755c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            g();
            throw protocolException;
        }
        long j4 = this.d - c2;
        this.d = j4;
        if (j4 == 0) {
            g();
        }
        return c2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3818b) {
            return;
        }
        if (this.d != 0 && !p1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f3826e.f3755c).k();
            g();
        }
        this.f3818b = true;
    }
}
