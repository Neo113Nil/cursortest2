package J6;

import D6.q;
import D6.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: m, reason: collision with root package name */
    public long f1404m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f1405n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, s url, long j) {
        super(hVar, url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1405n = hVar;
        this.f1404m = j;
        if (j == 0) {
            a(q.f552e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z7;
        if (this.f1396i) {
            return;
        }
        if (this.f1404m != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = E6.e.f712a;
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            try {
                z7 = E6.e.f(this, 100);
            } catch (IOException unused) {
                z7 = false;
            }
            if (!z7) {
                this.f1405n.f1412b.h();
                a(h.f1410f);
            }
        }
        this.f1396i = true;
    }

    @Override // J6.b, T6.w
    public final long o(long j, T6.f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f1396i) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f1404m;
        if (j7 == 0) {
            return -1L;
        }
        long o7 = super.o(Math.min(j7, 8192L), sink);
        if (o7 == -1) {
            this.f1405n.f1412b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(h.f1410f);
            throw protocolException;
        }
        long j8 = this.f1404m - o7;
        this.f1404m = j8;
        if (j8 == 0) {
            a(q.f552e);
        }
        return o7;
    }
}
