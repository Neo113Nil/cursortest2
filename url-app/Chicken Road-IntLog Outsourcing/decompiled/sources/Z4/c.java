package Z4;

import B4.k;
import B4.r;
import T4.q;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public long f3799e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f3801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, q url) {
        super(gVar, url);
        i.e(url, "url");
        this.f3801g = gVar;
        this.f3799e = -1L;
        this.f3800f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3794c) {
            return;
        }
        if (this.f3800f && !U4.e.d(this, TimeUnit.MILLISECONDS)) {
            this.f3801g.f3810b.h();
            a(g.f3808f);
        }
        this.f3794c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        if (r11 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0074, code lost:
    
        a.AbstractC0169a.b(16);
        r2 = java.lang.Integer.toString(r3, 16);
        kotlin.jvm.internal.i.d(r2, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008d, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r2));
     */
    @Override // Z4.a, j5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long s(j5.f sink, long j2) {
        j5.f fVar;
        long j6;
        i.e(sink, "sink");
        if (this.f3794c) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3800f) {
            return -1L;
        }
        long j7 = this.f3799e;
        g gVar = this.f3801g;
        if (j7 == 0 || j7 == -1) {
            if (j7 != -1) {
                ((j5.q) gVar.f3811c.f312c).q(Long.MAX_VALUE);
            }
            try {
                j5.q qVar = (j5.q) gVar.f3811c.f312c;
                qVar.A(1L);
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    boolean y5 = qVar.y(i3);
                    fVar = qVar.f10519b;
                    if (!y5) {
                        break;
                    }
                    byte b6 = fVar.b(i2);
                    if ((b6 < 48 || b6 > 57) && ((b6 < 97 || b6 > 102) && (b6 < 65 || b6 > 70))) {
                        break;
                    }
                    i2 = i3;
                }
                this.f3799e = fVar.p();
                String obj = k.n0(((j5.q) gVar.f3811c.f312c).q(Long.MAX_VALUE)).toString();
                if (this.f3799e < 0 || (obj.length() > 0 && !r.O(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3799e + obj + '\"');
                }
                if (this.f3799e == 0) {
                    this.f3800f = false;
                    a(gVar.f3813e.c());
                }
                if (!this.f3800f) {
                    return -1L;
                }
                j6 = -1;
            } catch (NumberFormatException e3) {
                throw new ProtocolException(e3.getMessage());
            }
        } else {
            j6 = -1;
        }
        long s2 = super.s(sink, Math.min(8192L, this.f3799e));
        if (s2 != j6) {
            this.f3799e -= s2;
            return s2;
        }
        gVar.f3810b.h();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a(g.f3808f);
        throw protocolException;
    }
}
