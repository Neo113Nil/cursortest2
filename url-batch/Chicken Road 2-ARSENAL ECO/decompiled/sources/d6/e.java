package d6;

import X5.n;
import X5.o;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: j, reason: collision with root package name */
    public long f3982j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f3983k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, o url, long j4) {
        super(hVar, url);
        i.e(url, "url");
        this.f3983k = hVar;
        this.f3982j = j4;
        if (j4 == 0) {
            a(n.f2972g);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z5;
        if (this.f3974h) {
            return;
        }
        if (this.f3982j != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = Y5.e.f3102a;
            i.e(timeUnit, "timeUnit");
            try {
                z5 = Y5.e.f(this, 100);
            } catch (IOException unused) {
                z5 = false;
            }
            if (!z5) {
                this.f3983k.f3990b.h();
                a(h.f3988f);
            }
        }
        this.f3974h = true;
    }

    @Override // d6.b, n6.w
    public final long i(long j4, n6.f fVar) {
        if (this.f3974h) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f3982j;
        if (j7 == 0) {
            return -1L;
        }
        long i7 = super.i(Math.min(j7, 8192L), fVar);
        if (i7 == -1) {
            this.f3983k.f3990b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(h.f3988f);
            throw protocolException;
        }
        long j8 = this.f3982j - i7;
        this.f3982j = j8;
        if (j8 == 0) {
            a(n.f2972g);
        }
        return i7;
    }
}
