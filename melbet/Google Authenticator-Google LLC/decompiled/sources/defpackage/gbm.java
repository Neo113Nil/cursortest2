package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gbm implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gbm(gva gvaVar, Runnable runnable, int i) {
        this.d = i;
        this.b = gvaVar;
        this.a = "AutoGIL";
        this.c = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [hvi, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v79, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v13, types: [gdn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [gel, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        gty aB;
        Object obj;
        switch (this.d) {
            case 0:
                gbn gbnVar = (gbn) this.b;
                boolean z = gbnVar.e;
                Object obj2 = this.a;
                if (!z) {
                    return;
                }
                Object obj3 = this.c;
                if (!gbnVar.c.remove(obj3)) {
                    return;
                }
                gbj gbjVar = (gbj) gbnVar.b.b(((gbp) obj3).a);
                aB = hoq.aB(125, "onSuccess FuturesMixin", gub.a, true);
                try {
                    gbjVar.b(((gbp) obj3).d, obj2);
                    aB.close();
                    return;
                } finally {
                }
            case 1:
                ?? r0 = this.c;
                gtt f = ((gva) this.b).f((String) this.a, 122);
                try {
                    r0.run();
                    f.close();
                    return;
                } finally {
                }
            case 2:
                gbn gbnVar2 = (gbn) this.b;
                boolean z2 = gbnVar2.e;
                Object obj4 = this.a;
                if (!z2) {
                    return;
                }
                Object obj5 = this.c;
                if (!gbnVar2.c.remove(obj5)) {
                    return;
                }
                gbj gbjVar2 = (gbj) gbnVar2.b.b(((gbp) obj5).a);
                aB = hoq.aB(123, "onFailure FuturesMixin", gub.a, true);
                try {
                    gbjVar2.a(((gbp) obj5).d, (Throwable) obj4);
                    aB.close();
                    return;
                } finally {
                }
            case 3:
                ((ger) ((gpj) this.a).b).a(this.b, new gdr(), this.c);
                return;
            case 4:
                Object obj6 = this.b;
                Object obj7 = this.c;
                geu geuVar = (geu) this.a;
                geuVar.a.execute(new gbm(geuVar, (gej) obj7, obj6, 5));
                return;
            case 5:
                fao.c();
                Object obj8 = this.a;
                geu geuVar2 = (geu) obj8;
                gej gejVar = geuVar2.e;
                Object obj9 = this.c;
                hoq.I(!obj9.equals(gejVar), "The same LoadTask was processed twice.");
                Object obj10 = this.b;
                gdy gdyVar = (gdy) obj10;
                hoq.H(gdyVar.b().isDone());
                if (geuVar2.i.c(obj10)) {
                    try {
                        if (gdyVar.b().isCancelled()) {
                            return;
                        }
                        try {
                            if (((gej) obj9).b(((geu) obj8).e)) {
                                ((gdy) obj10).c();
                            } else if (!((gdy) obj10).b().isCancelled()) {
                                int a = ((geu) obj8).f.c.a(((gej) obj9).f, ((gdy) obj10).a(), !((gej) obj9).c()) - 1;
                                if (a == 0) {
                                    ((gdy) obj10).c();
                                    if (((gej) obj9).c()) {
                                        gdw gdwVar = new gdw();
                                        gdwVar.addSuppressed(gwd.c());
                                        ((geu) obj8).h(gdwVar);
                                    } else {
                                        ((geu) obj8).d((gej) obj9);
                                    }
                                } else if (a != 1) {
                                    ((geu) obj8).b((gej) obj9, (gdy) obj10);
                                    if (((gej) obj9).c()) {
                                        gdw gdwVar2 = new gdw();
                                        gdwVar2.addSuppressed(gwd.c());
                                        ((geu) obj8).h(gdwVar2);
                                    } else {
                                        ((geu) obj8).d((gej) obj9);
                                    }
                                } else {
                                    ((geu) obj8).b((gej) obj9, (gdy) obj10);
                                    if (((geu) obj8).g.d && ((geu) obj8).i()) {
                                        hoq.I(((geu) obj8).g.e.f(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                        geu.g((gdl) ((geu) obj8).g.c);
                                        ((geu) obj8).g = ((geu) obj8).g.b(false);
                                    }
                                }
                            }
                            if (((geu) obj8).g.d && ((geu) obj8).i()) {
                                hoq.I(((geu) obj8).g.e.f(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                geu.g((gdl) ((geu) obj8).g.c);
                                ((geu) obj8).g = ((geu) obj8).g.b(false);
                                return;
                            }
                            return;
                        } catch (geo e) {
                            ((geu) obj8).h(e.getCause());
                            return;
                        }
                    } catch (Throwable th) {
                        geuVar2.b.execute(new fnh(th, 17));
                        return;
                    }
                }
                return;
            case 6:
                Object obj11 = this.b;
                Object obj12 = this.c;
                geu geuVar3 = (geu) this.a;
                geuVar3.a.execute(new gbm(geuVar3, (gej) obj12, obj11, 7));
                return;
            case 7:
                Object obj13 = this.a;
                geu geuVar4 = (geu) obj13;
                gbd gbdVar = geuVar4.h;
                Object obj14 = this.b;
                Object obj15 = this.c;
                if (gbdVar.c(obj14)) {
                    ?? r02 = ((cfe) obj14).a;
                    if (r02.isCancelled()) {
                        return;
                    }
                    fao.c();
                    try {
                        try {
                            hnu.aR(r02);
                            if (((gej) obj15).b(((geu) obj13).e)) {
                                if (((geu) obj13).g.d && ((geu) obj13).i()) {
                                    hoq.I(((geu) obj13).g.e.f(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                    geu.g((gdl) ((geu) obj13).g.c);
                                    ((geu) obj13).g = ((geu) obj13).g.b(false);
                                    return;
                                }
                                return;
                            }
                            ((geu) obj13).e((gej) obj15);
                            ((geu) obj13).k.j(hnu.aJ(null), "com.google.apps.tiktok.account.data.AllAccounts", gee.a, gzp.h(((geu) obj13).c), ((geu) obj13).a);
                            return;
                        } catch (ExecutionException e2) {
                            ((geu) obj13).h(e2.getCause());
                            return;
                        }
                    } catch (Throwable th2) {
                        geuVar4.b.execute(new fnh(th2, 16));
                        return;
                    }
                }
                return;
            case 8:
                ((gos) this.b).b((iwr) this.c, (kaa) this.a);
                return;
            case 9:
                ((gqn) this.b).l((gqs) this.c, this.a);
                return;
            case 10:
                ((ier) this.b).f().r((String) this.c, (Throwable) this.a);
                return;
            case 11:
                ((ier) this.b).f().a((iwr) this.c, (kaa) this.a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((iey) this.b).f().r((String) this.c, (Throwable) this.a);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((iey) this.b).f().a((iwr) this.c, (kaa) this.a);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ifb) this.b).c.r((String) this.c, (Throwable) this.a);
                return;
            case 15:
                ((ifb) this.b).c.a((iwr) this.c, (kaa) this.a);
                return;
            case 16:
                ((ifm) this.a).j((bry) this.b, (ifj) this.c);
                return;
            case 17:
                ifm ifmVar = (ifm) this.b;
                Iterator it = ifmVar.b.iterator();
                while (it.hasNext()) {
                    ((hvi) it.next()).cancel(true);
                }
                iws iwsVar = ifmVar.j;
                if (iwsVar != null) {
                    iwsVar.r((String) this.c, (Throwable) this.a);
                    return;
                }
                return;
            case 18:
                ((ifm) this.a).j((bry) this.b, (ifj) this.c);
                return;
            case 19:
                Object obj16 = this.b;
                ifi ifiVar = (ifi) obj16;
                boolean z3 = ifiVar.a;
                Object obj17 = this.c;
                Object obj18 = this.a;
                if (z3) {
                    return;
                }
                try {
                    ((ifi) obj16).c.a((kbq) obj18, (kaa) obj17);
                    return;
                } finally {
                    ifiVar.a = true;
                    ifiVar.b.g.a();
                }
            default:
                ifn ifnVar = (ifn) this.c;
                Iterator it2 = ((LinkedHashMap) ifnVar.c).entrySet().iterator();
                while (true) {
                    obj = this.a;
                    if (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (((hvi) entry.getValue()).isDone()) {
                            it2.remove();
                            ifg ifgVar = (ifg) entry.getKey();
                            try {
                                ((ifo) obj).j((bry) this.b, ifgVar, ifgVar.c(), ifnVar);
                            } catch (Throwable th3) {
                                ifo ifoVar = (ifo) obj;
                                ifoVar.d = kbq.c(th3);
                                ifoVar.e = new kaa();
                                ifoVar.f();
                                ifoVar.c = true;
                                return;
                            }
                        }
                    }
                }
                if (ifnVar.a()) {
                    ifnVar.b--;
                    ((ifo) obj).e();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ gbm(geu geuVar, gej gejVar, Object obj, int i) {
        this.d = i;
        this.a = geuVar;
        this.c = gejVar;
        this.b = obj;
    }

    public /* synthetic */ gbm(ifi ifiVar, kbq kbqVar, kaa kaaVar, int i) {
        this.d = i;
        this.b = ifiVar;
        this.a = kbqVar;
        this.c = kaaVar;
    }

    public /* synthetic */ gbm(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ gbm(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
