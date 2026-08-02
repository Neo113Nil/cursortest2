package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnk implements bsr, bxf, caq, ggq, giy, gks, gnr, gpz, gqa, jrp {
    final jsb A;
    final jsb B;
    final jsb C;
    final jsb D;
    public final bnl E;
    final iee F;
    private final frv G;
    private final bnk H = this;
    final jsb a;
    final jsb b;
    final jsb c;
    final jsb d;
    final jsb e;
    final jsb f;
    final jsb g;
    final jsb h;
    final jsb i;
    final jsb j;
    final jsb k;
    final jsb l;
    final jsb m;
    final jsb n;
    final jsb o;
    final jsb p;
    final jsb q;
    final jsb r;
    final jsb s;
    final jsb t;
    final jsb u;
    final jsb v;
    final jsb w;
    final jsb x;
    final jsb y;
    final jsb z;

    public bnk(bnl bnlVar, frv frvVar) {
        this.E = bnlVar;
        this.G = frvVar;
        jrw c = jrx.c(frvVar);
        this.a = c;
        gmu gmuVar = new gmu(c);
        this.b = gmuVar;
        jsb jsbVar = bnlVar.fG;
        jsb jsbVar2 = bnlVar.at;
        fxm fxmVar = new fxm(jsbVar, gmuVar, jsbVar2, 0);
        this.c = fxmVar;
        fxv fxvVar = new fxv(fxmVar);
        this.d = fxvVar;
        fxu fxuVar = new fxu(bnlVar.C, jsbVar2, fxvVar);
        this.e = fxuVar;
        this.f = jrv.c(new bpy(fxuVar, bnlVar.fI, 3, null));
        this.g = jrv.c(new bpy(fxuVar, bnlVar.fI, 5, null));
        fxi fxiVar = new fxi(fxmVar, bnlVar.ku);
        this.h = fxiVar;
        this.i = jrv.c(new btb((jsb) fxiVar, bnlVar.lf, bnlVar.lj, bnlVar.q, bnlVar.A, bnlVar.at, 1, (byte[]) null));
        jsb c2 = jrv.c(new dte((jsb) gmuVar, bnlVar.gk, bnlVar.he, bnlVar.hd, 13, (short[][]) null));
        this.j = c2;
        glc glcVar = new glc(c2, gmuVar, 11);
        this.k = glcVar;
        jrw jrwVar = jsd.a;
        List c3 = iwj.c(1);
        List c4 = iwj.c(0);
        c3.add(glcVar);
        jsd jsdVar = new jsd(c3, c4);
        this.l = jsdVar;
        gov govVar = new gov(jsdVar);
        this.m = govVar;
        this.n = new gow(govVar, bnlVar.lk);
        this.o = jrv.c(new dte(bnlVar.C, bnlVar.hc, (jsb) gmuVar, bnlVar.A, 1, (byte[]) null));
        this.p = jrv.c(new gpd(0));
        jsb jsbVar3 = bof.b;
        this.q = jsbVar3;
        iee ieeVar = new iee(gmuVar, bnlVar.hc, bnlVar.hf, bnlVar.mu, jsbVar3, bnlVar.A, bnlVar.gU);
        this.F = ieeVar;
        jrw a = jrx.a(new gix(ieeVar));
        this.r = a;
        jsb jsbVar4 = bnlVar.gR;
        jsb jsbVar5 = jrz.b;
        jsb jsbVar6 = bnlVar.hi;
        jrw jrwVar2 = jsd.a;
        this.s = jrv.c(new elo(a, jsbVar4, gmuVar, jsbVar5, fxmVar, jsbVar6, jrwVar2, bnlVar.gc, bnlVar.hc, bnlVar.hf, 2, (char[]) null));
        jsb jsbVar7 = bnlVar.fG;
        jsb jsbVar8 = bnlVar.fk;
        fxm fxmVar2 = new fxm(jsbVar7, gmuVar, jsbVar8, 1);
        this.t = fxmVar2;
        this.u = jrv.c(new elo(bnlVar.gR, jsbVar8, gmuVar, a, fxmVar2, bnlVar.hi, jsbVar5, jrwVar2, bnlVar.hc, bnlVar.hf, 3, (short[]) null));
        jsb jsbVar9 = bof.a;
        this.v = jsbVar9;
        jsb jsbVar10 = bnlVar.at;
        jsb jsbVar11 = bnlVar.hx;
        dko dkoVar = new dko(jsbVar5, jsbVar9, fxmVar, jsbVar10, jsbVar11, 12, (float[][]) null);
        this.w = dkoVar;
        this.x = new gaa(jsbVar11, bnlVar.hy, dkoVar, 0);
        grs grsVar = new grs(bnlVar.hN, bnlVar.hW, 1);
        this.y = grsVar;
        List c5 = iwj.c(0);
        List c6 = iwj.c(1);
        c6.add(grsVar);
        this.z = new jsd(c5, c6);
        gcn gcnVar = new gcn(c, 14);
        this.A = gcnVar;
        List c7 = iwj.c(0);
        List c8 = iwj.c(1);
        c8.add(gcnVar);
        jsd jsdVar2 = new jsd(c7, c8);
        this.B = jsdVar2;
        this.C = jse.a(new gaa(bnlVar.ac, bnlVar.bI, jsdVar2, 13, (char[][]) null));
        this.D = jse.a(new gcn(bnlVar.jQ, 3));
    }

    public final bow a() {
        boy boyVar = (boy) this.o.b();
        bnl bnlVar = this.E;
        return new bow((Context) bnlVar.nS.a, boyVar, (hvl) bnlVar.at.b());
    }

    public final bxc b() {
        car h = h();
        bnl bnlVar = this.E;
        return new bxc(h, (iwq) bnlVar.gZ.b(), r(), (hvl) bnlVar.A.b(), (hvl) bnlVar.at.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v8, types: [iel, java.lang.Object] */
    public final caz c() {
        char c;
        bnl bnlVar = this.E;
        icp icpVar = (icp) bnlVar.mr.b();
        iet ietVar = (iet) bnlVar.ms.b();
        iel c2 = ien.c(Optional.of(new gpe(bnlVar.lq, bnlVar.lr, bnlVar.ls, bnlVar.lt, bnlVar.lu, bnlVar.lv, bnlVar.lw, bnlVar.lx, bnlVar.ly, bnlVar.lz, bnlVar.lA, bnlVar.lB, bnlVar.lC, bnlVar.lD, bnlVar.lE)));
        ikj ikjVar = (ikj) bnlVar.hO.b();
        ldt ldtVar = new ldt(this.n, icpVar, ietVar, c2, new gpa(ikjVar, gzp.h(Boolean.valueOf(((kee) new ikk(bnlVar.hs, null).a.b()).c("tiktok.directboot", "45703457").c())), gzp.h(bnlVar.lY)));
        goq goqVar = (goq) bnlVar.mt.b();
        Object obj = ldtVar.b;
        icz iczVar = goqVar.a;
        iczVar.getClass();
        String str = jnn.m.a;
        str.getClass();
        icp icpVar2 = (icp) obj;
        ConcurrentHashMap concurrentHashMap = icpVar2.e;
        jwx jwxVar = (jwx) concurrentHashMap.get(iczVar);
        if (jwxVar != null) {
            c = 0;
        } else {
            ConcurrentHashMap concurrentHashMap2 = icpVar2.f;
            jwx jwxVar2 = (jwx) concurrentHashMap2.get(str);
            int i = 14;
            if (jwxVar2 != null) {
                c = 0;
            } else {
                int i2 = hel.d;
                heg hegVar = new heg(4);
                hegVar.h(ikg.r(new eqn(obj, 16)));
                icn icnVar = icpVar2.a;
                if (icnVar.h != null) {
                    hegVar.h(new iew(icnVar.k));
                }
                int i3 = 15;
                if (icnVar.g == null) {
                    hegVar.h(new iet(2));
                } else if (icpVar2.c.h()) {
                    hegVar.h(new ies(0));
                    hegVar.h(ikg.r(new eig(i)));
                } else {
                    hegVar.h(new iet(0));
                    hegVar.h(ikg.r(new eig(i3)));
                }
                if (icpVar2.c.l()) {
                    c = 0;
                    hegVar.h(new ies(2, (byte[]) null));
                } else {
                    c = 0;
                }
                hegVar.h(new ieu());
                if (icnVar.n != null) {
                    hegVar.h(ikg.r(new eqn(obj, i3)));
                }
                hegVar.h(ikg.r(new eqn(obj, 13)));
                jwxVar2 = iwu.c(new iff(str, icnVar, icpVar2.b), hegVar.g());
                jwx jwxVar3 = (jwx) concurrentHashMap2.putIfAbsent(str, jwxVar2);
                if (jwxVar3 != null) {
                    jwxVar2 = jwxVar3;
                }
            }
            jwz[] jwzVarArr = new jwz[1];
            jwzVarArr[c] = ikg.r(new eqn(iczVar, i));
            jwxVar = iwu.d(jwxVar2, jwzVarArr);
            jwx jwxVar4 = (jwx) concurrentHashMap.putIfAbsent(iczVar, jwxVar);
            if (jwxVar4 != null) {
                jwxVar = jwxVar4;
            }
        }
        ikk ikkVar = bnlVar.nS;
        jwz[] jwzVarArr2 = new jwz[1];
        jwzVarArr2[c] = ikg.r(new eqn(ldtVar, 8));
        jwx d = iwu.d(jwxVar, jwzVarArr2);
        jwz[] jwzVarArr3 = new jwz[3];
        jwzVarArr3[c] = new ies((iel) ldtVar.d, 1);
        jwzVarArr3[1] = ldtVar.a;
        jwzVarArr3[2] = ldtVar.e;
        kuq kuqVar = new kuq(iwu.d(d, jwzVarArr3), jww.a.d(knp.a, kno.b), (byte[]) null);
        bow a = a();
        return new caz((Context) ikkVar.a, kuqVar, a, (hvl) bnlVar.A.b(), (hvl) bnlVar.at.b());
    }

    public final frv d() {
        frv frvVar = this.G;
        gmu.c(frvVar);
        return frvVar;
    }

    @Override // defpackage.gqk
    public final Map e() {
        return her.j("OrphanCacheAccountSynclet", this.x);
    }

    @Override // defpackage.gnr
    public final Map f() {
        return hix.b;
    }

    @Override // defpackage.caq
    public final bpr g() {
        return (bpr) this.i.b();
    }

    public final car h() {
        frv d = d();
        bnl bnlVar = this.E;
        return new car(d, ((fuk) bnlVar.hc).b(), (Context) bnlVar.nS.a, (hvl) bnlVar.at.b());
    }

    @Override // defpackage.caq
    public final caz i() {
        return c();
    }

    @Override // defpackage.caq
    public final ccd j() {
        bnl bnlVar = this.E;
        bpr bprVar = (bpr) this.i.b();
        caz c = c();
        hel r = hel.r(new cca((bpr) this.i.b(), (hvl) bnlVar.A.b()), new cce(c(), (hvl) bnlVar.A.b()));
        r.getClass();
        return new ccd((Context) bnlVar.nS.a, bprVar, c, r, a(), (hvl) bnlVar.at.b(), (hvl) bnlVar.A.b());
    }

    @Override // defpackage.gks
    public final bnr k() {
        return new bnr(this.E, this.H);
    }

    @Override // defpackage.gql
    public final grq l() {
        bnl bnlVar = this.E;
        cka ckaVar = new cka((hvm) bnlVar.A.b());
        hjb hjbVar = hjb.a;
        hoq.y(hjbVar.isEmpty(), "Can't provide Sync SyncSystemMonitor to any account level. Only application scoped SyncSystemMonitors may be provided");
        return new grq(ckaVar, new eqn(hjbVar, 11), this.z, new eig(13));
    }

    @Override // defpackage.bsr
    public final fcu m() {
        return (fcu) this.f.b();
    }

    @Override // defpackage.bxf
    public final fcu n() {
        return (fcu) this.g.b();
    }

    @Override // defpackage.ggq
    public final iee o() {
        bnl bnlVar = this.E;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) bnlVar.A.b();
        Map map = (Map) bnlVar.gO.b();
        ets b = ((ett) bnlVar.gD).b();
        Optional empty = Optional.empty();
        iwq iwqVar = (iwq) this.s.b();
        iwq iwqVar2 = (iwq) this.u.b();
        new cfe(bnlVar.gJ, bnlVar.gx);
        return new iee(scheduledExecutorService, map, b, empty, iwqVar, iwqVar2, (etd) bnlVar.gG.b());
    }

    @Override // defpackage.giy
    public final iwq p() {
        return (iwq) this.u.b();
    }

    @Override // defpackage.giy
    public final iwq q() {
        return (iwq) this.s.b();
    }

    public final iyi r() {
        return new iyi(this.E.nS.a, d(), (fcu) this.g.b(), (boolean[]) null);
    }
}
