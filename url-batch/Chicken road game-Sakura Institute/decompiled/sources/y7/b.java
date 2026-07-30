package y7;

import a0.m;
import f8.f;
import f8.h;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import r6.k;
import s7.l;
import s7.p;
import z6.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: i, reason: collision with root package name */
    public final l f9924i;

    /* renamed from: j, reason: collision with root package name */
    public long f9925j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9926k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f9927l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, l lVar) {
        super(eVar);
        k.f(lVar, "url");
        this.f9927l = eVar;
        this.f9924i = lVar;
        this.f9925j = -1L;
        this.f9926k = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z8;
        if (this.f9922g) {
            return;
        }
        if (this.f9926k) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = t7.b.f8932a;
            k.f(timeUnit, "timeUnit");
            try {
                z8 = t7.b.s(this, 100);
            } catch (IOException unused) {
                z8 = false;
            }
            if (!z8) {
                this.f9927l.f9932b.k();
                b();
            }
        }
        this.f9922g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r9.f9926k == false) goto L30;
     */
    @Override // y7.a, f8.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long v(long j8, f fVar) {
        e eVar = this.f9927l;
        h hVar = eVar.f9933c;
        k.f(fVar, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(m.h(j8, "byteCount < 0: ").toString());
        }
        if (this.f9922g) {
            throw new IllegalStateException("closed");
        }
        if (this.f9926k) {
            long j9 = this.f9925j;
            if (j9 == 0 || j9 == -1) {
                if (j9 != -1) {
                    hVar.q();
                }
                try {
                    this.f9925j = hVar.R();
                    String obj = z6.h.W(hVar.q()).toString();
                    if (this.f9925j < 0 || (obj.length() > 0 && !o.v(obj, ";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f9925j + obj + '\"');
                    }
                    if (this.f9925j == 0) {
                        this.f9926k = false;
                        eVar.f9937g = eVar.f9936f.a();
                        p pVar = eVar.f9931a;
                        k.c(pVar);
                        s7.b bVar = pVar.f8650o;
                        s7.k kVar = eVar.f9937g;
                        k.c(kVar);
                        x7.e.b(bVar, this.f9924i, kVar);
                        b();
                    }
                } catch (NumberFormatException e9) {
                    throw new ProtocolException(e9.getMessage());
                }
            }
            long v5 = super.v(Math.min(j8, this.f9925j), fVar);
            if (v5 != -1) {
                this.f9925j -= v5;
                return v5;
            }
            eVar.f9932b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        return -1L;
    }
}
