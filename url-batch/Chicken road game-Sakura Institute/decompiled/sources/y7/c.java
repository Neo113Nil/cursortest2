package y7;

import a0.m;
import f8.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public long f9928i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f9929j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, long j8) {
        super(eVar);
        this.f9929j = eVar;
        this.f9928i = j8;
        if (j8 == 0) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z8;
        if (this.f9922g) {
            return;
        }
        if (this.f9928i != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = t7.b.f8932a;
            k.f(timeUnit, "timeUnit");
            try {
                z8 = t7.b.s(this, 100);
            } catch (IOException unused) {
                z8 = false;
            }
            if (!z8) {
                this.f9929j.f9932b.k();
                b();
            }
        }
        this.f9922g = true;
    }

    @Override // y7.a, f8.g0
    public final long v(long j8, f fVar) {
        k.f(fVar, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(m.h(j8, "byteCount < 0: ").toString());
        }
        if (this.f9922g) {
            throw new IllegalStateException("closed");
        }
        long j9 = this.f9928i;
        if (j9 == 0) {
            return -1L;
        }
        long v5 = super.v(Math.min(j9, j8), fVar);
        if (v5 == -1) {
            this.f9929j.f9932b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j10 = this.f9928i - v5;
        this.f9928i = j10;
        if (j10 == 0) {
            b();
        }
        return v5;
    }
}
