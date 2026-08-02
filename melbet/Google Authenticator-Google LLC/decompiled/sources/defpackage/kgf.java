package defpackage;

import java.util.Collection;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgf implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kgf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object, jyo] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((kgh) this.a).f.f();
                return;
            case 1:
                kja kjaVar = ((kge) this.a).f;
                kmk kmkVar = kmk.SUBCHANNEL_SHUTDOWN;
                hoq.I(((kif) kjaVar).a.A.get(), "Channel must have been shut down");
                return;
            case 2:
                ((kgh) this.a).d();
                return;
            case 3:
                ((kgh) this.a).f.e();
                return;
            case 4:
                ((kgh) this.a).f.o();
                return;
            case 5:
                ((kgg) this.a).a.e();
                return;
            case 6:
                khu khuVar = (khu) this.a;
                khuVar.v = null;
                khuVar.d.a(2, "CONNECTING after backoff");
                khuVar.b(jxi.a);
                khuVar.g();
                return;
            case 7:
                khu khuVar2 = (khu) this.a;
                if (khuVar2.p.a == jxi.d) {
                    khuVar2.d.a(2, "CONNECTING as requested");
                    khuVar2.b(jxi.a);
                    khuVar2.g();
                    return;
                }
                return;
            case 8:
                khu khuVar3 = (khu) ((kga) this.a).b;
                kjb kjbVar = khuVar3.k;
                khuVar3.w = null;
                khuVar3.k = null;
                kjbVar.e(kbq.l.e("InternalSubchannel closed transport due to address change"));
                return;
            case 9:
                ?? r7 = this.a;
                khu khuVar4 = (khu) r7;
                khuVar4.d.a(2, "Terminated");
                kiq kiqVar = ((ken) khuVar4.a.b).i;
                kiqVar.v.remove(r7);
                jyl.c(kiqVar.H.d, r7);
                kiqVar.g();
                return;
            case 10:
                khs khsVar = (khs) this.a;
                khu khuVar5 = khsVar.c;
                khuVar5.u = null;
                if (khuVar5.q != null) {
                    hoq.I(khuVar5.o == null, "Unexpected non-null activeTransport");
                    khsVar.a.e(khuVar5.q);
                    return;
                }
                kfr kfrVar = khuVar5.n;
                kfr kfrVar2 = khsVar.a;
                if (kfrVar == kfrVar2) {
                    khuVar5.o = kfrVar2;
                    khuVar5.n = null;
                    khr khrVar = khuVar5.h;
                    khuVar5.r = khrVar.a();
                    khuVar5.b(jxi.b);
                    kmq kmqVar = khuVar5.s;
                    String str = khuVar5.t;
                    String d = khs.d(khrVar.a());
                    String c = khs.c(khrVar.a(), jxx.b);
                    String b = khs.b((kbe) khrVar.a().a(kgy.a));
                    kay kayVar = kmq.c;
                    hel q = hel.q(str);
                    hel r = hel.r(d, c);
                    kag kagVar = kmqVar.a;
                    kagVar.a(kayVar, q, r);
                    kagVar.b(kmq.e, hel.q(str), hel.s(b, d, c));
                    return;
                }
                return;
            case 11:
                khs khsVar2 = (khs) this.a;
                kfr kfrVar3 = khsVar2.a;
                khu khuVar6 = khsVar2.c;
                Collection collection = khuVar6.l;
                collection.remove(kfrVar3);
                if (khuVar6.p.a == jxi.e && collection.isEmpty()) {
                    khuVar6.e();
                    return;
                }
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                kiq kiqVar2 = (kiq) this.a;
                if (kiqVar2.t == null) {
                    return;
                }
                kiqVar2.i(true);
                kge kgeVar = kiqVar2.y;
                kgeVar.d(null);
                kiqVar2.G.a(2, "Entering IDLE state");
                kiqVar2.o.a(jxi.d);
                khh khhVar = kiqVar2.Q;
                Object[] objArr = {kiqVar2.x, kgeVar};
                for (int i = 0; i < 2; i++) {
                    if (khhVar.a.contains(objArr[i])) {
                        kiqVar2.f();
                        return;
                    }
                }
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                kiq kiqVar3 = ((kii) this.a).b;
                kiqVar3.m.c();
                if (kiqVar3.s) {
                    kiqVar3.r.b();
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((kin) this.a).c.f();
                return;
            case 15:
                Object obj = this.a;
                kiq kiqVar4 = ((kim) obj).k.c;
                Collection collection2 = kiqVar4.w;
                if (collection2 != null) {
                    collection2.remove(obj);
                    if (kiqVar4.w.isEmpty()) {
                        kiqVar4.Q.c(kiqVar4.x, false);
                        kiqVar4.w = null;
                        if (kiqVar4.A.get()) {
                            kip kipVar = kiqVar4.z;
                            kbq kbqVar = kiq.b;
                            synchronized (kipVar.a) {
                                if (kipVar.c != null) {
                                    return;
                                }
                                kipVar.c = kbqVar;
                                boolean isEmpty = kipVar.b.isEmpty();
                                if (isEmpty) {
                                    kipVar.d.y.e(kbqVar);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((ken) this.a).f.f(kiq.c);
                return;
            case 17:
                Object obj2 = this.a;
                kju kjuVar = (kju) obj2;
                kjuVar.s = null;
                kjuVar.k.c();
                ((jzk) obj2).c();
                return;
            case 18:
                Object obj3 = this.a;
                kju kjuVar2 = (kju) obj3;
                kjuVar2.r = null;
                if (kjuVar2.k.e()) {
                    ((jzk) obj3).c();
                    return;
                }
                return;
            case 19:
                ((jzk) this.a).c();
                return;
            default:
                ((jzk) this.a).c();
                return;
        }
    }

    public /* synthetic */ kgf(jzk jzkVar, int i) {
        this.b = i;
        this.a = jzkVar;
    }
}
