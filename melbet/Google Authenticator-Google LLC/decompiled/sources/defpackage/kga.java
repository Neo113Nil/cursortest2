package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kga implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public kga(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kmo] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jxe] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        kjb kjbVar;
        kkx kkxVar;
        boolean z = true;
        int i = 0;
        kks kksVar = null;
        switch (this.c) {
            case 0:
                ((kgb) this.b).f(this.a);
                return;
            case 1:
                ((kgb) this.a).e((kaa) this.b);
                return;
            case 2:
                ((kgh) this.a).f.h(this.b);
                return;
            case 3:
                ((kgh) this.a).f.q((jxv) this.b);
                return;
            case 4:
                ((kgh) this.a).f.p((jxs) this.b);
                return;
            case 5:
                ((kgh) this.b).f.j((InputStream) this.a);
                return;
            case 6:
                ((kgh) this.a).f.n((kbq) this.b);
                return;
            case 7:
                ((kgg) this.b).a.d(this.a);
                return;
            case 8:
                ((kgg) this.a).a.c((kaa) this.b);
                return;
            case 9:
                ((kgj) this.a).b.a((kao) this.b);
                return;
            case 10:
                List list = Collections.EMPTY_LIST;
                kgj kgjVar = (kgj) this.b;
                kgjVar.b.a(new kao(kbs.b(kbq.l.e("Unable to resolve host ".concat(String.valueOf(kgjVar.a.j))).d((Throwable) this.a)), jwt.a, null));
                return;
            case 11:
                ?? r0 = this.a;
                khu khuVar = (khu) this.b;
                khr khrVar = khuVar.h;
                SocketAddress b = khrVar.b();
                khrVar.a = r0;
                khrVar.c();
                khuVar.i = r0;
                jxi jxiVar = khuVar.p.a;
                jxi jxiVar2 = jxi.b;
                if (jxiVar == jxiVar2 || khuVar.p.a == jxi.a) {
                    while (true) {
                        if (i < khrVar.a.size()) {
                            int indexOf = ((jxx) khrVar.a.get(i)).e.indexOf(b);
                            if (indexOf == -1) {
                                i++;
                            } else {
                                khrVar.b = i;
                                khrVar.c = indexOf;
                            }
                        } else if (khuVar.p.a == jxiVar2) {
                            kjbVar = khuVar.o;
                            khuVar.o = null;
                            khrVar.c();
                            khuVar.b(jxi.d);
                        } else {
                            khuVar.n.e(kbq.l.e("InternalSubchannel closed pending transport due to address change"));
                            khuVar.n = null;
                            khrVar.c();
                            khuVar.g();
                        }
                    }
                    if (kjbVar == null) {
                        if (khuVar.w != null) {
                            khuVar.k.e(kbq.l.e("InternalSubchannel closed transport early due to address change"));
                            khuVar.w.c();
                            khuVar.w = null;
                        }
                        khuVar.k = kjbVar;
                        khuVar.w = khuVar.g.d(new kgf(this, 8), 5L, TimeUnit.SECONDS, khuVar.b);
                        return;
                    }
                    return;
                }
                kjbVar = null;
                if (kjbVar == null) {
                }
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                khu khuVar2 = (khu) this.a;
                jxi jxiVar3 = khuVar2.p.a;
                jxi jxiVar4 = jxi.e;
                if (jxiVar3 == jxiVar4) {
                    return;
                }
                kbq kbqVar = (kbq) this.b;
                khuVar2.q = kbqVar;
                kjb kjbVar2 = khuVar2.o;
                kfr kfrVar = khuVar2.n;
                khuVar2.o = null;
                khuVar2.n = null;
                khuVar2.b(jxiVar4);
                khuVar2.h.c();
                if (khuVar2.l.isEmpty()) {
                    khuVar2.e();
                }
                khuVar2.g.c();
                kuq kuqVar = khuVar2.v;
                if (kuqVar != null) {
                    kuqVar.c();
                    khuVar2.v = null;
                    khuVar2.u = null;
                }
                kuq kuqVar2 = khuVar2.w;
                if (kuqVar2 != null) {
                    kuqVar2.c();
                    khuVar2.k.e(kbqVar);
                    khuVar2.w = null;
                    khuVar2.k = null;
                }
                if (kjbVar2 != null) {
                    kjbVar2.e(kbqVar);
                }
                if (kfrVar != null) {
                    kfrVar.e(kbqVar);
                    return;
                }
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((khu) this.a).m.c(this.b, false);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((kij) this.a).v((kbq) this.b);
                return;
            case 15:
                kin kinVar = (kin) this.a;
                if (kinVar.a.get() != kiq.e) {
                    ((kim) this.b).k();
                    return;
                }
                kiq kiqVar = kinVar.c;
                if (kiqVar.w == null) {
                    kiqVar.w = new LinkedHashSet();
                    kiqVar.Q.c(kiqVar.x, true);
                }
                kiqVar.w.add(this.b);
                return;
            case 16:
                this.a.run();
                Object obj = this.b;
                ((kim) obj).k.c.m.execute(new kgf(obj, 15));
                return;
            case 17:
                Object obj2 = this.b;
                Object obj3 = ((cns) obj2).b;
                Object obj4 = ((kky) obj3).m;
                synchronized (obj4) {
                    if (!((kks) ((cns) obj2).a).b) {
                        ((kky) obj3).r = ((kky) obj3).r.a((kkw) this.a);
                        if (((kky) obj3).w(((kky) obj3).r) && ((kkxVar = ((kky) obj3).p) == null || kkxVar.a())) {
                            kksVar = new kks(obj4);
                            ((kky) obj3).y = kksVar;
                        } else {
                            ((kky) obj3).r = ((kky) obj3).r.b();
                            ((kky) obj3).y = null;
                        }
                        z = false;
                    }
                }
                if (z) {
                    kkw kkwVar = (kkw) this.a;
                    kkwVar.a.t(new kkv((kky) ((cns) this.b).b, kkwVar));
                    kkwVar.a.n(kbq.c.e("Unneeded hedging"));
                    return;
                }
                if (kksVar != null) {
                    Object obj5 = ((cns) this.b).b;
                    cns cnsVar = new cns(obj5, kksVar, 2);
                    kky kkyVar = (kky) obj5;
                    kksVar.b(kkyVar.i.schedule(cnsVar, kkyVar.k.b, TimeUnit.NANOSECONDS));
                }
                ((kky) ((cns) this.b).b).l((kkw) this.a);
                return;
            case 18:
                ((kkv) this.a).b.w.c((kaa) this.b);
                return;
            case 19:
                ((kkv) ((kfu) this.b).c).b.l((kkw) this.a);
                return;
            default:
                ((kkv) this.b).b.l((kkw) this.a);
                return;
        }
    }

    public kga(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ kga(kgj kgjVar, IOException iOException, int i) {
        this.c = i;
        this.b = kgjVar;
        this.a = iOException;
    }

    public /* synthetic */ kga(kgj kgjVar, kao kaoVar, int i) {
        this.c = i;
        this.a = kgjVar;
        this.b = kaoVar;
    }
}
