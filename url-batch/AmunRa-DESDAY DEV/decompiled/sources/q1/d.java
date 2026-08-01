package q1;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o1.m;
import o1.p;

/* loaded from: classes.dex */
public final class d extends a {
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f3520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, long j2) {
        super(pVar);
        this.f3520e = pVar;
        this.d = j2;
        if (j2 == 0) {
            f();
        }
    }

    @Override // q1.a, x1.v
    public final long b(x1.f fVar, long j2) {
        Z0.d.e(fVar, "sink");
        if (this.f3512b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.d;
        if (j3 == 0) {
            return -1L;
        }
        long b2 = super.b(fVar, Math.min(j3, 8192L));
        if (b2 == -1) {
            ((m) this.f3520e.f3427c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            f();
            throw protocolException;
        }
        long j4 = this.d - b2;
        this.d = j4;
        if (j4 == 0) {
            f();
        }
        return b2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3512b) {
            return;
        }
        if (this.d != 0 && !l1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f3520e.f3427c).k();
            f();
        }
        this.f3512b = true;
    }
}
