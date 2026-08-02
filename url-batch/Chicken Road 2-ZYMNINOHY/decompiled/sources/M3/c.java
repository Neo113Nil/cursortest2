package M3;

import G3.C0051b;
import G3.n;
import G3.p;
import G3.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import w3.AbstractC1510g;
import w3.o;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public final p f1767d;

    /* renamed from: e, reason: collision with root package name */
    public long f1768e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f1770g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, p url) {
        super(gVar);
        i.e(url, "url");
        this.f1770g = gVar;
        this.f1767d = url;
        this.f1768e = -1L;
        this.f1769f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.f1762b) {
            return;
        }
        if (this.f1769f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = H3.b.f1103a;
            i.e(timeUnit, "timeUnit");
            try {
                z = H3.b.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f1770g.f1778b.k();
                a();
            }
        }
        this.f1762b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r9.f1769f == false) goto L28;
     */
    @Override // M3.a, T3.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j(T3.g sink, long j4) {
        g gVar = this.f1770g;
        T3.i iVar = gVar.f1779c;
        i.e(sink, "sink");
        if (this.f1762b) {
            throw new IllegalStateException("closed");
        }
        if (this.f1769f) {
            long j5 = this.f1768e;
            if (j5 == 0 || j5 == -1) {
                if (j5 != -1) {
                    iVar.m();
                }
                try {
                    this.f1768e = iVar.q();
                    String obj = AbstractC1510g.r0(iVar.m()).toString();
                    if (this.f1768e < 0 || (obj.length() > 0 && !o.a0(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1768e + obj + '\"');
                    }
                    if (this.f1768e == 0) {
                        this.f1769f = false;
                        gVar.f1783g = gVar.f1782f.H();
                        s sVar = gVar.f1777a;
                        i.b(sVar);
                        C0051b c0051b = sVar.f986j;
                        n nVar = gVar.f1783g;
                        i.b(nVar);
                        L3.f.b(c0051b, this.f1767d, nVar);
                        a();
                    }
                } catch (NumberFormatException e4) {
                    throw new ProtocolException(e4.getMessage());
                }
            }
            long j6 = super.j(sink, Math.min(8192L, this.f1768e));
            if (j6 != -1) {
                this.f1768e -= j6;
                return j6;
            }
            gVar.f1778b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        return -1L;
    }
}
