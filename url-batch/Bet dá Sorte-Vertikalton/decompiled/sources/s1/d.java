package s1;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import q1.m;
import q1.p;

/* loaded from: classes.dex */
public final class d extends a {
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f3775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, long j2) {
        super(pVar);
        this.f3775e = pVar;
        this.d = j2;
        if (j2 == 0) {
            g();
        }
    }

    @Override // s1.a, z1.v
    public final long b(z1.f fVar, long j2) {
        b1.d.e(fVar, "sink");
        if (this.f3767b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.d;
        if (j3 == 0) {
            return -1L;
        }
        long b2 = super.b(fVar, Math.min(j3, 8192L));
        if (b2 == -1) {
            ((m) this.f3775e.f3561c).k();
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
        if (this.f3767b) {
            return;
        }
        if (this.d != 0 && !n1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f3775e.f3561c).k();
            g();
        }
        this.f3767b = true;
    }
}
