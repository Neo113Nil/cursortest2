package J6;

import D0.j;
import D6.s;
import T6.q;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.p;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: m, reason: collision with root package name */
    public long f1401m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1402n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f1403o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, s url) {
        super(hVar, url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1403o = hVar;
        this.f1401m = -1L;
        this.f1402n = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z7;
        if (this.f1396i) {
            return;
        }
        if (this.f1402n) {
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
                this.f1403o.f1412b.h();
                a(h.f1410f);
            }
        }
        this.f1396i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r9.f1402n == false) goto L28;
     */
    @Override // J6.b, T6.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(long j, T6.f sink) {
        h hVar = this.f1403o;
        j jVar = hVar.f1413c;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f1396i) {
            throw new IllegalStateException("closed");
        }
        if (this.f1402n) {
            long j7 = this.f1401m;
            if (j7 == 0 || j7 == -1) {
                if (j7 != -1) {
                    ((q) jVar.f331i).u(Long.MAX_VALUE);
                }
                try {
                    this.f1401m = ((q) jVar.f331i).g();
                    String obj = StringsKt.J(((q) jVar.f331i).u(Long.MAX_VALUE)).toString();
                    if (this.f1401m < 0 || (obj.length() > 0 && !p.l(obj, ";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1401m + obj + '\"');
                    }
                    if (this.f1401m == 0) {
                        this.f1402n = false;
                        a(hVar.f1415e.c());
                    }
                } catch (NumberFormatException e7) {
                    throw new ProtocolException(e7.getMessage());
                }
            }
            long o7 = super.o(Math.min(8192L, this.f1401m), sink);
            if (o7 != -1) {
                this.f1401m -= o7;
                return o7;
            }
            hVar.f1412b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(h.f1410f);
            throw protocolException;
        }
        return -1L;
    }
}
