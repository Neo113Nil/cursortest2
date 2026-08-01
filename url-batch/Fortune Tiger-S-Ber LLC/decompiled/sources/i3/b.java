package i3;

import c3.k;
import c3.m;
import c3.q;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p3.f;
import p3.h;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: i, reason: collision with root package name */
    public final m f2107i;

    /* renamed from: j, reason: collision with root package name */
    public long f2108j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2109k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f2110l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, m mVar) {
        super(eVar);
        u2.c.e(mVar, "url");
        this.f2110l = eVar;
        this.f2107i = mVar;
        this.f2108j = -1L;
        this.f2109k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r9.f2109k == false) goto L28;
     */
    @Override // i3.a, p3.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j4, f fVar) {
        e eVar = this.f2110l;
        h hVar = eVar.c;
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        if (this.f2109k) {
            long j5 = this.f2108j;
            if (j5 == 0 || j5 == -1) {
                if (j5 != -1) {
                    hVar.d();
                }
                try {
                    this.f2108j = hVar.k();
                    String obj = b3.e.q0(hVar.d()).toString();
                    if (this.f2108j < 0 || (obj.length() > 0 && !b3.m.b0(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f2108j + obj + '\"');
                    }
                    if (this.f2108j == 0) {
                        this.f2109k = false;
                        eVar.g = eVar.f2118f.f();
                        q qVar = eVar.f2114a;
                        u2.c.b(qVar);
                        c3.b bVar = qVar.f1109o;
                        k kVar = eVar.g;
                        u2.c.b(kVar);
                        h3.f.b(bVar, this.f2107i, kVar);
                        m();
                    }
                } catch (NumberFormatException e4) {
                    throw new ProtocolException(e4.getMessage());
                }
            }
            long c = super.c(Math.min(8192L, this.f2108j), fVar);
            if (c != -1) {
                this.f2108j -= c;
                return c;
            }
            eVar.f2115b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        if (this.g) {
            return;
        }
        if (this.f2109k) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = d3.c.f1490a;
            u2.c.e(timeUnit, "timeUnit");
            try {
                z3 = d3.c.r(this, 100);
            } catch (IOException unused) {
                z3 = false;
            }
            if (!z3) {
                this.f2110l.f2115b.k();
                m();
            }
        }
        this.g = true;
    }
}
