package z3;

import g4.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends a {
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f4155j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, long j2) {
        super(eVar);
        this.f4155j = eVar;
        this.i = j2;
        if (j2 == 0) {
            m();
        }
    }

    @Override // z3.a, g4.v
    public final long c(long j2, f fVar) {
        if (this.f4151g) {
            throw new IllegalStateException("closed");
        }
        long j4 = this.i;
        if (j4 == 0) {
            return -1L;
        }
        long c5 = super.c(Math.min(j4, 8192L), fVar);
        if (c5 == -1) {
            this.f4155j.f4157b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        long j5 = this.i - c5;
        this.i = j5;
        if (j5 == 0) {
            m();
        }
        return c5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z4;
        if (this.f4151g) {
            return;
        }
        if (this.i != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = u3.b.f3581a;
            i3.d.e(timeUnit, "timeUnit");
            try {
                z4 = u3.b.r(this, 100);
            } catch (IOException unused) {
                z4 = false;
            }
            if (!z4) {
                this.f4155j.f4157b.k();
                m();
            }
        }
        this.f4151g = true;
    }
}
