package x1;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import v1.m;
import v1.p;

/* loaded from: classes.dex */
public final class d extends a {
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f4155e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, long j2) {
        super(pVar);
        this.f4155e = pVar;
        this.d = j2;
        if (j2 == 0) {
            g();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4147b) {
            return;
        }
        if (this.d != 0 && !s1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f4155e.f4081c).k();
            g();
        }
        this.f4147b = true;
    }

    @Override // x1.a, E1.v
    public final long d(E1.f fVar, long j2) {
        g1.d.e(fVar, "sink");
        if (this.f4147b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.d;
        if (j3 == 0) {
            return -1L;
        }
        long d = super.d(fVar, Math.min(j3, 8192L));
        if (d == -1) {
            ((m) this.f4155e.f4081c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            g();
            throw protocolException;
        }
        long j4 = this.d - d;
        this.d = j4;
        if (j4 == 0) {
            g();
        }
        return d;
    }
}
