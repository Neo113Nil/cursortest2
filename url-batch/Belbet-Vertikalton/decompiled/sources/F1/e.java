package F1;

import D1.m;
import D1.q;
import j1.h;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: d, reason: collision with root package name */
    public long f328d;
    public final /* synthetic */ q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, long j) {
        super(qVar);
        this.e = qVar;
        this.f328d = j;
        if (j == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f320b) {
            return;
        }
        if (this.f328d != 0 && !A1.c.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.e.f274c).k();
            a();
        }
        this.f320b = true;
    }

    @Override // F1.b, M1.v
    public final long h(M1.f fVar, long j) {
        h.e(fVar, "sink");
        if (this.f320b) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f328d;
        if (j2 == 0) {
            return -1L;
        }
        long h2 = super.h(fVar, Math.min(j2, 8192L));
        if (h2 == -1) {
            ((m) this.e.f274c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j3 = this.f328d - h2;
        this.f328d = j3;
        if (j3 == 0) {
            a();
        }
        return h2;
    }
}
