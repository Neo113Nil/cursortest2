package defpackage;

import android.os.Trace;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kfu implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kfu(ifu ifuVar, kbq kbqVar, kaa kaaVar, int i) {
        this.d = i;
        this.b = ifuVar;
        this.a = kbqVar;
        this.c = kaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 6;
        byte[] bArr = null;
        switch (this.d) {
            case 0:
                ((kgc) this.a).g.a((iwr) this.b, (kaa) this.c);
                return;
            case 1:
                ((ifu) this.b).a.a((kbq) this.a, (kaa) this.c);
                return;
            case 2:
                Object obj = this.a;
                kgb kgbVar = (kgb) obj;
                kbq kbqVar = kgbVar.b;
                Object obj2 = this.b;
                Object obj3 = this.c;
                if (kbqVar != null) {
                    obj3 = kgbVar.b;
                    obj2 = new kaa();
                }
                try {
                    ((kgb) obj).d.a((kbq) obj3, (kaa) obj2);
                    return;
                } catch (RuntimeException e) {
                    kgc.a.logp(Level.WARNING, "io.grpc.internal.DelayedClientCall$DelayedListener$3", "run", "Exception thrown by onClose() in ClientCall", (Throwable) e);
                    return;
                }
            case 3:
                khs khsVar = (khs) this.a;
                khu khuVar = khsVar.c;
                if (khuVar.p.a == jxi.e) {
                    return;
                }
                kjb kjbVar = khuVar.o;
                kfr kfrVar = khsVar.a;
                if (kjbVar == kfrVar) {
                    khuVar.o = null;
                    khr khrVar = khuVar.h;
                    khrVar.c();
                    khuVar.b(jxi.d);
                    kmq kmqVar = khuVar.s;
                    String str = khuVar.t;
                    String d = khs.d(khrVar.a());
                    String c = khs.c(khrVar.a(), jxx.b);
                    Object obj4 = this.c;
                    String b = khs.b((kbe) khrVar.a().a(kgy.a));
                    kay kayVar = kmq.b;
                    hel q = hel.q(str);
                    hel s = hel.s(d, c, ((kmk) obj4).g);
                    kag kagVar = kmqVar.a;
                    kagVar.a(kayVar, q, s);
                    kagVar.b(kmq.e, hel.q(str), hel.s(b, d, c));
                    return;
                }
                if (khuVar.n == kfrVar) {
                    kmq kmqVar2 = khuVar.s;
                    String str2 = khuVar.t;
                    khr khrVar2 = khuVar.h;
                    kmqVar2.a.a(kmq.d, hel.q(str2), hel.r(khs.d(khrVar2.a()), khs.c(khrVar2.a(), jxx.b)));
                    hoq.K(khuVar.p.a == jxi.a, "Expected state is CONNECTING, actual state is %s", khuVar.p.a);
                    jxx jxxVar = (jxx) khrVar2.a.get(khrVar2.b);
                    int i2 = khrVar2.c + 1;
                    khrVar2.c = i2;
                    if (i2 >= jxxVar.e.size()) {
                        khrVar2.b++;
                        khrVar2.c = 0;
                    }
                    if (khrVar2.b < khrVar2.a.size()) {
                        khuVar.g();
                        return;
                    }
                    khuVar.n = null;
                    khrVar2.c();
                    Object obj5 = this.b;
                    kbw kbwVar = khuVar.g;
                    kbwVar.c();
                    kbq kbqVar2 = (kbq) obj5;
                    hoq.y(!kbqVar2.g(), "The error status must not be OK");
                    khuVar.d(new jxj(jxi.c, kbqVar2));
                    if (khuVar.e) {
                        return;
                    }
                    if (khuVar.u == null) {
                        khuVar.u = new kgo();
                    }
                    long a = khuVar.u.a() - khuVar.j.a(TimeUnit.NANOSECONDS);
                    khuVar.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", khu.j(kbqVar2), Long.valueOf(a));
                    hoq.I(khuVar.v == null, "previous reconnectTask is not done");
                    khuVar.v = kbwVar.d(new kgf(khuVar, 6), a, TimeUnit.NANOSECONDS, khuVar.b);
                    return;
                }
                return;
            case 4:
                Object obj6 = this.b;
                synchronized (((kks) obj6).a) {
                    if (((kks) obj6).b) {
                        return;
                    }
                    ((kks) obj6).a();
                    ((kkv) this.c).b.g.execute(new kga(this, this.a, 19));
                    return;
                }
            case 5:
                new cyi("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + ((String) this.b) + " running callback", 2, null);
                try {
                    new kyf(((ljj) this.c).k, this.a, i).run();
                    Trace.endSection();
                    return;
                } finally {
                }
            case 6:
                Object obj7 = this.a;
                ljq ljqVar = (ljq) obj7;
                ljqVar.p = URI.create(ljqVar.m).resolve((String) this.b).toString();
                ljqVar.f.add(ljqVar.p);
                ljqVar.j(2, 3, new kyf(obj7, this.c, 4, bArr));
                return;
            default:
                Object obj8 = this.b;
                Object obj9 = this.c;
                Object obj10 = this.a;
                try {
                    ((ljo) obj10).a.onFailed(((ljo) obj10).d, (UrlResponseInfo) obj9, (CronetException) obj8);
                } catch (Exception e2) {
                    ((ljo) obj10).d.i("onFailed", e2);
                }
                ljo ljoVar = (ljo) obj10;
                ljoVar.c();
                ljoVar.d.r.a();
                return;
        }
    }

    public kfu(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj2;
        this.b = obj3;
        this.a = obj;
    }

    public /* synthetic */ kfu(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public kfu(kkv kkvVar, kks kksVar, kkw kkwVar, int i) {
        this.d = i;
        this.b = kksVar;
        this.a = kkwVar;
        this.c = kkvVar;
    }

    public /* synthetic */ kfu(ljj ljjVar, String str, ljr ljrVar, int i) {
        this.d = i;
        this.c = ljjVar;
        this.b = str;
        this.a = ljrVar;
    }

    public /* synthetic */ kfu(ljo ljoVar, UrlResponseInfo urlResponseInfo, CronetException cronetException, int i) {
        this.d = i;
        this.a = ljoVar;
        this.c = urlResponseInfo;
        this.b = cronetException;
    }
}
