package d6;

import F5.j;
import X5.o;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import m1.AbstractC0521b;
import n6.q;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: j, reason: collision with root package name */
    public long f3979j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3980k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f3981l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, o url) {
        super(hVar, url);
        i.e(url, "url");
        this.f3981l = hVar;
        this.f3979j = -1L;
        this.f3980k = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z5;
        if (this.f3974h) {
            return;
        }
        if (this.f3980k) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = Y5.e.f3102a;
            i.e(timeUnit, "timeUnit");
            try {
                z5 = Y5.e.f(this, 100);
            } catch (IOException unused) {
                z5 = false;
            }
            if (!z5) {
                this.f3981l.f3990b.h();
                a(h.f3988f);
            }
        }
        this.f3974h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (r16.f3980k == false) goto L49;
     */
    @Override // d6.b, n6.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i(long j4, n6.f fVar) {
        byte e4;
        h hVar = this.f3981l;
        B0.c cVar = hVar.f3991c;
        if (this.f3974h) {
            throw new IllegalStateException("closed");
        }
        if (this.f3980k) {
            long j7 = this.f3979j;
            if (j7 == 0 || j7 == -1) {
                if (j7 != -1) {
                    ((q) cVar.f73i).w(Long.MAX_VALUE);
                }
                try {
                    q qVar = (q) cVar.f73i;
                    n6.f fVar2 = qVar.f5548g;
                    qVar.C(1L);
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        if (!qVar.e(i8)) {
                            break;
                        }
                        e4 = fVar2.e(i7);
                        if ((e4 < 48 || e4 > 57) && ((e4 < 97 || e4 > 102) && (e4 < 65 || e4 > 70))) {
                            break;
                        }
                        i7 = i8;
                    }
                    if (i7 == 0) {
                        AbstractC0521b.g(16);
                        String num = Integer.toString(e4, 16);
                        i.d(num, "toString(...)");
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
                    }
                    this.f3979j = fVar2.m();
                    String obj = j.h0(((q) cVar.f73i).w(Long.MAX_VALUE)).toString();
                    if (this.f3979j < 0 || (obj.length() > 0 && !F5.q.I(obj, ";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3979j + obj + '\"');
                    }
                    if (this.f3979j == 0) {
                        this.f3980k = false;
                        a(hVar.f3993e.a());
                    }
                } catch (NumberFormatException e7) {
                    throw new ProtocolException(e7.getMessage());
                }
            }
            long i9 = super.i(Math.min(8192L, this.f3979j), fVar);
            if (i9 != -1) {
                this.f3979j -= i9;
                return i9;
            }
            hVar.f3990b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(h.f3988f);
            throw protocolException;
        }
        return -1L;
    }
}
