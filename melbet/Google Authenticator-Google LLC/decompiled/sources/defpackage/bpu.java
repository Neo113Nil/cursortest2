package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpu implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public bpu(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return new a();
            case 1:
                Context b = ((jrk) this.a).b();
                etd.e(b);
                List list = cji.n;
                cjd cjdVar = new cjd(b, "AUTHENTICATOR_ANDROID");
                cjdVar.e = new box(1);
                cjdVar.d = null;
                return cjdVar.a();
            case 2:
                hel q = hel.q((bss) this.a.b());
                q.getClass();
                return q;
            case 3:
                return new bwo();
            case 4:
                final bzw b2 = ((bzx) this.a).b();
                return new jwu() { // from class: bzy
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.jwu
                    public final kuq e() {
                        igc igcVar = ewy.a;
                        kbi[] kbiVarArr = {ewy.b};
                        kuq e = bzw.this.e();
                        List asList = Arrays.asList(kbiVarArr);
                        if (asList.isEmpty()) {
                            return e;
                        }
                        Object obj = e.b;
                        HashMap hashMap = new HashMap();
                        Iterator it = e.f().iterator();
                        while (true) {
                            kbl kblVar = (kbl) obj;
                            String str = kblVar.a;
                            if (!it.hasNext()) {
                                return ixg.j(str, kblVar, hashMap);
                            }
                            kuq kuqVar = (kuq) it.next();
                            Object obj2 = kuqVar.a;
                            Iterator it2 = asList.iterator();
                            kbj kbjVar = obj2;
                            while (it2.hasNext()) {
                                kbjVar = new kbj((kbi) it2.next(), kbjVar);
                            }
                            ixg.k(kuqVar.h(kbjVar), str, hashMap);
                        }
                    }
                };
            case 5:
                etd.e(((jrk) this.a).b());
                epj d = epk.d();
                d.d = true == jsk.a.bB().c() ? 3 : 2;
                return d.a();
            case 6:
                etd.e(((jrk) this.a).b());
                eqq d2 = ell.d();
                d2.b = true == jsk.a.bB().a() ? 3 : 2;
                return d2.b();
            case 7:
                etd.e(((jrk) this.a).b());
                emy d3 = emz.d();
                d3.d = true == jsk.a.bB().b() ? 3 : 2;
                return d3.a();
            case 8:
                etd.e(((jrk) this.a).b());
                epy d4 = epz.d();
                d4.d = true == jsk.a.bB().d() ? 3 : 2;
                return d4.a();
            case 9:
                etd.e(((jrk) this.a).b());
                eqq d5 = eqr.d();
                d5.b = true == jsk.a.bB().e() ? 3 : 2;
                return d5.a();
            case 10:
                etd.e(((jrk) this.a).b());
                eqv d6 = eqw.d();
                d6.e = true == jsk.a.bB().f() ? 3 : 2;
                return d6.a();
            case 11:
                etd.e(((jrk) this.a).b());
                era d7 = erc.d();
                d7.c = 3;
                return d7.a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                String packageName = ((Context) ((jrx) this.a).a).getPackageName();
                packageName.getClass();
                return packageName;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new ckc(this.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                cbp b3 = ((dgm) this.a).b();
                dfs dfsVar = new dfs(dja.d("Scheduler", new dfq(0)));
                dfsVar.setRemoveOnCancelPolicy(true);
                hvm d8 = b3.d(hnu.aC(dfsVar));
                d8.getClass();
                return d8;
            case 15:
                return new gpi(((bnu) this.a).a(), 1);
            case 16:
                return new cbp((byte[]) null);
            case 17:
                Set<atf> b4 = ((jsd) this.a).b();
                asd asdVar = new asd();
                for (atf atfVar : b4) {
                    atfVar.getClass();
                    asdVar.a.add(atfVar);
                }
                return asdVar;
            case 18:
                dke dkeVar = (dke) ((gzp) ((jrx) this.a).a).d(new dke(4, null));
                int i = dkeVar.a;
                hoq.x(i == 4 || i == 3);
                return new dld(dkeVar);
            case 19:
                return ((cka) this.a.b()).a;
            default:
                return new cka((cka) this.a.b());
        }
    }
}
