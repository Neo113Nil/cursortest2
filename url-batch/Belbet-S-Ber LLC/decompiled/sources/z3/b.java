package z3;

import g4.f;
import g4.h;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p3.l;
import t3.j;
import t3.k;
import t3.o;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends a {
    public final k i;

    /* renamed from: j, reason: collision with root package name */
    public long f4152j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4153k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f4154l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, k kVar) {
        super(eVar);
        i3.d.e(kVar, "url");
        this.f4154l = eVar;
        this.i = kVar;
        this.f4152j = -1L;
        this.f4153k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r9.f4153k == false) goto L28;
     */
    @Override // z3.a, g4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j2, f fVar) {
        e eVar = this.f4154l;
        h hVar = eVar.f4158c;
        if (this.f4151g) {
            throw new IllegalStateException("closed");
        }
        if (this.f4153k) {
            long j4 = this.f4152j;
            if (j4 == 0 || j4 == -1) {
                if (j4 != -1) {
                    hVar.e();
                }
                try {
                    this.f4152j = hVar.k();
                    String obj = p3.d.E0(hVar.e()).toString();
                    if (this.f4152j < 0 || (obj.length() > 0 && !l.q0(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4152j + obj + '\"');
                    }
                    if (this.f4152j == 0) {
                        this.f4153k = false;
                        eVar.f4161g = eVar.f4160f.f();
                        o oVar = eVar.f4156a;
                        i3.d.b(oVar);
                        t3.b bVar = oVar.f3488o;
                        j jVar = eVar.f4161g;
                        i3.d.b(jVar);
                        y3.e.b(bVar, this.i, jVar);
                        m();
                    }
                } catch (NumberFormatException e4) {
                    throw new ProtocolException(e4.getMessage());
                }
            }
            long c5 = super.c(Math.min(8192L, this.f4152j), fVar);
            if (c5 != -1) {
                this.f4152j -= c5;
                return c5;
            }
            eVar.f4157b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z4;
        if (this.f4151g) {
            return;
        }
        if (this.f4153k) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = u3.b.f3581a;
            i3.d.e(timeUnit, "timeUnit");
            try {
                z4 = u3.b.r(this, 100);
            } catch (IOException unused) {
                z4 = false;
            }
            if (!z4) {
                this.f4154l.f4157b.k();
                m();
            }
        }
        this.f4151g = true;
    }
}
