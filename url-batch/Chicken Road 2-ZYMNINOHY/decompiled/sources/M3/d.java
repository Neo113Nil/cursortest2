package M3;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public long f1771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f1772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, long j4) {
        super(gVar);
        this.f1772e = gVar;
        this.f1771d = j4;
        if (j4 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.f1762b) {
            return;
        }
        if (this.f1771d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = H3.b.f1103a;
            i.e(timeUnit, "timeUnit");
            try {
                z = H3.b.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f1772e.f1778b.k();
                a();
            }
        }
        this.f1762b = true;
    }

    @Override // M3.a, T3.v
    public final long j(T3.g sink, long j4) {
        i.e(sink, "sink");
        if (this.f1762b) {
            throw new IllegalStateException("closed");
        }
        long j5 = this.f1771d;
        if (j5 == 0) {
            return -1L;
        }
        long j6 = super.j(sink, Math.min(j5, 8192L));
        if (j6 == -1) {
            this.f1772e.f1778b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j7 = this.f1771d - j6;
        this.f1771d = j7;
        if (j7 == 0) {
            a();
        }
        return j6;
    }
}
