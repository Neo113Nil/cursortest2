package s3;

import A.AbstractC0017m;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import q3.i;
import q3.l;
import z3.C1448f;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: j, reason: collision with root package name */
    public long f10603j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f10604k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, long j4) {
        super(lVar);
        this.f10604k = lVar;
        this.f10603j = j4;
        if (j4 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10594e) {
            return;
        }
        if (this.f10603j != 0 && !n3.b.g(this, TimeUnit.MILLISECONDS)) {
            ((i) this.f10604k.f9428c).k();
            a();
        }
        this.f10594e = true;
    }

    @Override // s3.a, z3.F
    public final long l(C1448f sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
        }
        if (this.f10594e) {
            throw new IllegalStateException("closed");
        }
        long j5 = this.f10603j;
        if (j5 == 0) {
            return -1L;
        }
        long l4 = super.l(sink, Math.min(j5, j4));
        if (l4 == -1) {
            ((i) this.f10604k.f9428c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j6 = this.f10603j - l4;
        this.f10603j = j6;
        if (j6 == 0) {
            a();
        }
        return l4;
    }
}
