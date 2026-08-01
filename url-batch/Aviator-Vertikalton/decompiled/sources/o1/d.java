package o1;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m1.m;
import m1.p;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public long f3733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f3734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, long j2) {
        super(pVar);
        this.f3734e = pVar;
        this.f3733d = j2;
        if (j2 == 0) {
            g();
        }
    }

    @Override // o1.a, v1.w
    public final long c(v1.f fVar, long j2) {
        X0.f.e(fVar, "sink");
        if (this.f3724b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3733d;
        if (j3 == 0) {
            return -1L;
        }
        long c2 = super.c(fVar, Math.min(j3, 8192L));
        if (c2 == -1) {
            ((m) this.f3734e.f3608c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            g();
            throw protocolException;
        }
        long j4 = this.f3733d - c2;
        this.f3733d = j4;
        if (j4 == 0) {
            g();
        }
        return c2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3724b) {
            return;
        }
        if (this.f3733d != 0 && !j1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f3734e.f3608c).k();
            g();
        }
        this.f3724b = true;
    }
}
