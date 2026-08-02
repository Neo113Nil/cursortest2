package defpackage;

import android.content.Intent;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bpp implements htr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bpp(bpr bprVar, String str, hvi hviVar, int i) {
        this.d = i;
        this.a = bprVar;
        this.b = str;
        this.c = hviVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [hvi, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v22, types: [htr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v11, types: [ccg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v28, types: [htr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v30, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v56, types: [ggs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v12, types: [hvi, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        frv frvVar;
        int i = 8;
        int i2 = 4;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        switch (this.d) {
            case 0:
                return ((bpr) this.a).g((String) this.b, ((Integer) hnu.aR(this.c)).intValue());
            case 1:
                return ((bpr) this.a).g((String) this.b, ((Integer) hnu.aR(this.c)).intValue());
            case 2:
                Object obj2 = ((bvc) this.a).b.V.d;
                bpr bprVar = (bpr) obj2;
                hvi a = bprVar.d.a();
                Object obj3 = this.c;
                bpg bpgVar = new bpg(obj2, obj3, i3);
                hvl hvlVar = bprVar.b;
                hvi au = hoq.au(a, bpgVar, hvlVar);
                Object obj4 = this.b;
                hvi au2 = hoq.au(au, new bpg(obj2, obj4, i2), hvlVar);
                bpg bpgVar2 = new bpg(obj2, obj3, 6);
                hvl hvlVar2 = bprVar.c;
                return hoq.au(hoq.au(hoq.au(au2, bpgVar2, hvlVar2), new bpp(bprVar, (String) obj4, au, i5), hvlVar2), new bpp(bprVar, (String) obj3, au2, i4), hvlVar2);
            case 3:
                return this.c.a((hel) obj, (cbz) this.a, (String) this.b);
            case 4:
                List list = (List) obj;
                evm evmVar = (evm) this.c;
                if (!evmVar.e) {
                    list = hel.q("");
                }
                int i6 = hel.d;
                heg hegVar = new heg(4);
                Iterator it = list.iterator();
                while (true) {
                    Object obj5 = this.a;
                    int i7 = 5;
                    if (!it.hasNext()) {
                        return hnu.aV(hegVar.g()).a(new bws(i7), ((etd) obj5).d());
                    }
                    Object obj6 = this.b;
                    String str = (String) it.next();
                    kee keeVar = evw.a;
                    if (keeVar == null || !keeVar.p((String) obj6, str)) {
                        etd etdVar = (etd) obj5;
                        ewc ewcVar = new ewc(etdVar, (String) obj6, str, evmVar.c);
                        hvi a2 = ewcVar.a(evmVar.d ? etdVar.c.getSharedPreferences("PhenotypeStickyAccount", 0).getString(evmVar.a, "") : str);
                        hegVar.h(hti.g(hti.g(hvc.v(a2), new doj(ewcVar, i7), etdVar.d()), new evv(etdVar, a2, evmVar, str, 1), etdVar.d()));
                    }
                }
                break;
            case 5:
                ?? r12 = this.c;
                ?? r0 = this.b;
                return hnu.aR(r12).equals(hnu.aR(r0)) ? r0 : hti.g(((fcn) this.a).f(r0), gvx.c(new doj(r0, i)), huf.a);
            case 6:
                ?? r02 = this.c;
                ?? r1 = this.b;
                boolean equals = hnu.aR(r02).equals(hnu.aR(r1));
                Object obj7 = this.a;
                if (equals) {
                    return hnu.aJ(obj);
                }
                htr c = gvx.c(new egl(obj7, r1, 10));
                fcr fcrVar = (fcr) obj7;
                hvi g = hti.g(r1, c, fcrVar.b);
                synchronized (fcrVar.d) {
                }
                return g;
            case 7:
                return ((fcu) this.a).b.g(this.c, this.b);
            case 8:
                return ((fcu) ((kee) this.a).a).b.g(this.c, this.b);
            case 9:
                fry fryVar = (fry) obj;
                if (fryVar.c != null || (frvVar = fryVar.a) == null) {
                    return this.b;
                }
                return ((fto) this.c).c(frvVar, (Intent) this.a, fryVar.e);
            case 10:
                fue fueVar = (fue) obj;
                boolean z = fueVar.a;
                Object obj8 = this.c;
                Object obj9 = this.a;
                return !z ? hnu.aJ(new fry((frv) obj9, ful.a, fueVar, null, (frx) obj8)) : hti.f(((fto) this.b).b.f((frv) obj9), gvx.a(new bso(fueVar, obj8, i, null)), huf.a);
            case 11:
                Object obj10 = this.a;
                ewj ewjVar = new ewj(obj10, this.c, this.b, i3);
                long j = gvx.a;
                dxi dxiVar = new dxi(gta.d(false), ewjVar, 19);
                ScheduledExecutorService scheduledExecutorService = ((fuj) obj10).e;
                Logger logger = hqq.a;
                hai haiVar = hai.a;
                gzp h = gzp.h(scheduledExecutorService);
                Duration duration = hqj.b;
                return new hqq(dxiVar, new hqh(), new bwt(11), ((gzs) h).a, hqp.a, haiVar);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((fuj) this.a).f((Duration) this.c, (Instant) this.b);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                fuf fufVar = (fuf) obj;
                fufVar.getClass();
                return ((iyi) this.c).e((String) this.b, (frv) this.a, fufVar.b, true);
            default:
                ghh ghhVar = (ghh) obj;
                jkj k = etm.a.k();
                jkj k2 = etl.a.k();
                if (!k2.b.M()) {
                    k2.t();
                }
                etl etlVar = (etl) k2.b;
                etlVar.c = 4;
                etlVar.b |= 1;
                if (!k.b.M()) {
                    k.t();
                }
                ?? r2 = this.b;
                Object obj11 = this.a;
                Object obj12 = this.c;
                etm etmVar = (etm) k.b;
                etl etlVar2 = (etl) k2.q();
                etlVar2.getClass();
                etmVar.d = etlVar2;
                etmVar.b |= 2;
                ghn ghnVar = (ghn) obj12;
                ghnVar.e(k);
                ggj ggjVar = (ggj) obj11;
                ghm bv = hnu.bv(ggjVar, k, ghnVar.a());
                return ghhVar.e(r2, bv) ? ((Boolean) ghnVar.s.a()).booleanValue() ? hnu.aJ(new ggw(true)) : hoq.at(ghnVar.m.b().b(ggjVar.e, bv.c), gvx.a(new fxn(9)), huf.a) : hnu.aJ(new ggw(false));
        }
    }

    public /* synthetic */ bpp(fto ftoVar, frv frvVar, frx frxVar, int i) {
        this.d = i;
        this.b = ftoVar;
        this.a = frvVar;
        this.c = frxVar;
    }

    public /* synthetic */ bpp(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ bpp(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ bpp(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.b = str;
        this.a = obj2;
    }
}
