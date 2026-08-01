package v1;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import t1.m;
import t1.p;

/* loaded from: classes.dex */
public final class d extends a {
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f4049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, long j2) {
        super(pVar);
        this.f4049e = pVar;
        this.d = j2;
        if (j2 == 0) {
            g();
        }
    }

    @Override // v1.a, C1.v
    public final long b(C1.f fVar, long j2) {
        e1.d.e(fVar, "sink");
        if (this.f4041b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.d;
        if (j3 == 0) {
            return -1L;
        }
        long b2 = super.b(fVar, Math.min(j3, 8192L));
        if (b2 == -1) {
            ((m) this.f4049e.f3794c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            g();
            throw protocolException;
        }
        long j4 = this.d - b2;
        this.d = j4;
        if (j4 == 0) {
            g();
        }
        return b2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4041b) {
            return;
        }
        if (this.d != 0 && !q1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f4049e.f3794c).k();
            g();
        }
        this.f4041b = true;
    }
}
