package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cbc implements htq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cbc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [fwp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v71, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r3v5, types: [hac, java.lang.Object] */
    @Override // defpackage.htq
    public final hvi a() {
        hel o;
        hvi aJ;
        int i = 19;
        int i2 = 7;
        int i3 = 9;
        int i4 = 12;
        int i5 = 17;
        byte[] bArr = null;
        int i6 = 6;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                cbe cbeVar = (cbe) obj;
                hvi at = hoq.at(((cba) hnu.bp((Context) cbeVar.g.a, cba.class)).s().d(), new bwv(15), huf.a);
                bpn bpnVar = new bpn(obj, i5);
                hvl hvlVar = cbeVar.e;
                return hoq.au(hoq.au(at, bpnVar, hvlVar), new bpg(obj, at, i4), hvlVar);
            case 1:
                return ((car) this.a).g();
            case 2:
                this.a.run();
                return hve.a;
            case 3:
                ?? r0 = this.a;
                int i7 = djl.a;
                return hnu.aM(r0, huf.a);
            case 4:
                iee ieeVar = (iee) this.a;
                gzp gzpVar = (gzp) ieeVar.d.bB();
                boolean f = gzpVar.f();
                Object bB = ieeVar.c.bB();
                if (f) {
                    gzp gzpVar2 = (gzp) bB;
                    if (gzpVar2.f()) {
                        ena enaVar = new ena((File) gzpVar.b(), (String) gzpVar2.b());
                        int a = enaVar.a();
                        enaVar.b().delete();
                        enaVar.b = 0;
                        enaVar.c = true;
                        if (a < ((enb) ieeVar.f.b()).c) {
                            return hve.a;
                        }
                        Object obj2 = ieeVar.a;
                        eme a2 = emf.a();
                        jkj k = lgv.a.k();
                        jkj k2 = lgu.a.k();
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        lgu lguVar = (lgu) k2.b;
                        lguVar.c = 6;
                        lguVar.b |= 1;
                        if (!k.b.M()) {
                            k.t();
                        }
                        lgv lgvVar = (lgv) k.b;
                        lgu lguVar2 = (lgu) k2.q();
                        lguVar2.getClass();
                        lgvVar.z = lguVar2;
                        lgvVar.b |= 8388608;
                        a2.f((lgv) k.q());
                        return ((emi) obj2).b(a2.a());
                    }
                }
                return hve.a;
            case 5:
                enl enlVar = (enl) this.a;
                return (!enlVar.n() || enlVar.c.getAndSet(true)) ? hve.a : enlVar.p(6, (emz) enlVar.b.b(), ((enb) enlVar.e.b()).f);
            case 6:
                enl enlVar2 = (enl) this.a;
                if (enlVar2.n()) {
                    iee ieeVar2 = enlVar2.g;
                    if (((AtomicBoolean) ieeVar2.e).getAndSet(false)) {
                        hnu.aN(new cbc(ieeVar2, 4), ieeVar2.b);
                    } else {
                        hvi hviVar = hve.a;
                    }
                }
                return hve.a;
            case 7:
                Object obj3 = this.a;
                return djl.d(((eny) obj3).b, new ect(obj3, i3));
            case 8:
                return hve.a;
            case 9:
                return ((eqd) this.a).c();
            case 10:
                Object obj4 = this.a;
                fcn fcnVar = (fcn) obj4;
                return hti.f(hnu.aK(fcnVar.b), new bso(fcnVar.k, new evp(obj4, i6), i2), huf.a);
            case 11:
                Object obj5 = this.a;
                fcn fcnVar2 = (fcn) obj5;
                Uri uri = (Uri) hnu.aR(fcnVar2.b);
                try {
                    return hnu.aJ(((fcn) obj5).i(uri));
                } catch (IOException e) {
                    gzp gzpVar3 = fcnVar2.d;
                    if (!gzpVar3.f()) {
                        return hnu.aI(e);
                    }
                    if (fcn.e(e)) {
                        return hnu.aI(e);
                    }
                    Object b = gzpVar3.b();
                    hum humVar = fcnVar2.h;
                    htq b2 = gvx.b(new bwr(obj5, b, 8, bArr));
                    Executor executor = fcnVar2.c;
                    return hti.g(humVar.a(b2, executor), gvx.c(new egl(obj5, uri, i3, bArr)), executor);
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj6 = this.a;
                htr c = gvx.c(new doj(obj6, i4));
                fcr fcrVar = (fcr) obj6;
                return hnu.aK(hti.g(fcrVar.a, c, fcrVar.b));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj7 = this.a;
                fcr fcrVar2 = (fcr) obj7;
                try {
                    return hnu.aJ(((fcr) obj7).b((Uri) hnu.aR(fcrVar2.a)));
                } catch (IOException e2) {
                    fcq fcqVar = new fcq(obj7, 0);
                    gzp gzpVar4 = fcrVar2.c;
                    return !gzpVar4.f() ? hnu.aI(e2) : ((e2 instanceof faz) || (e2.getCause() instanceof faz)) ? hnu.aI(e2) : hti.g(((fby) gzpVar4.b()).a(e2, fcqVar), gvx.c(new doj(obj7, 11)), fcrVar2.b);
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return this.a;
            case 15:
                return hnu.aJ(this.a);
            case 16:
                List list = ((ftf) this.a).d;
                synchronized (list) {
                    o = hel.o(list);
                }
                ArrayList arrayList = new ArrayList(o.size());
                int size = o.size();
                for (int i8 = 0; i8 < size; i8++) {
                    try {
                        aJ = ((fte) o.get(i8)).l();
                    } catch (Throwable th) {
                        ((hkf) ((hkf) ((hkf) ftf.a.f()).h(th)).i("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "notifyRequirementStateChanged", (char) 198, "AccountRequirementManagerImpl.java")).s("OnRequirementStateChanged observer failed.");
                        aJ = hnu.aJ(null);
                    }
                    arrayList.add(aJ);
                }
                return hnu.aV(arrayList).a(new bws(i), huf.a);
            case 17:
                Set set = ((fvm) this.a).a;
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((fug) ((kee) it.next()).a).d());
                    } catch (Exception e3) {
                        arrayList2.add(hnu.aI(e3));
                    }
                }
                return hnu.aX(arrayList2).a(new bws(i), huf.a);
            case 18:
                return ((fcu) this.a).d();
            case 19:
                return this.a.a();
            default:
                Object obj8 = this.a;
                fxo fxoVar = (fxo) obj8;
                fuy fuyVar = fxoVar.c;
                hvi a3 = fxoVar.a();
                hvi g = hti.g(hvc.v(fuyVar.d()), gvx.c(new fvr(obj8, i6)), fxoVar.f);
                htr c2 = gvx.c(new fvr(obj8, i2));
                hvl hvlVar2 = fxoVar.e;
                hvi g2 = hti.g(g, c2, hvlVar2);
                return hnu.aW(a3, g2).a(gvx.i(new bsp(a3, g2, i5)), hvlVar2);
        }
    }
}
