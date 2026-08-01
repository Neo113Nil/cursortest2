package i3;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p3.f;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public long f2111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f2112j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, long j4) {
        super(eVar);
        this.f2112j = eVar;
        this.f2111i = j4;
        if (j4 == 0) {
            m();
        }
    }

    @Override // i3.a, p3.v
    public final long c(long j4, f fVar) {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        long j5 = this.f2111i;
        if (j5 == 0) {
            return -1L;
        }
        long c = super.c(Math.min(j5, 8192L), fVar);
        if (c == -1) {
            this.f2112j.f2115b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        long j6 = this.f2111i - c;
        this.f2111i = j6;
        if (j6 == 0) {
            m();
        }
        return c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        if (this.g) {
            return;
        }
        if (this.f2111i != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = d3.c.f1490a;
            u2.c.e(timeUnit, "timeUnit");
            try {
                z3 = d3.c.r(this, 100);
            } catch (IOException unused) {
                z3 = false;
            }
            if (!z3) {
                this.f2112j.f2115b.k();
                m();
            }
        }
        this.g = true;
    }
}
