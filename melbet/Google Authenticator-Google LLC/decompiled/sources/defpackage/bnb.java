package defpackage;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnb implements boq, bqx, brj, bvo, bwc, bwh, bxn, bxr, byc, byi, byv, bzf, ftq, fyn, fyr, glh, gmr, gxs, jrp {
    final jsb A;
    final jsb B;
    final jsb C;
    final jsb D;
    final jsb E;
    final jsb F;
    final jsb G;
    final jsb H;
    final jsb I;
    final jsb J;
    final jsb K;
    final jsb L;
    final jsb M;
    final jsb N;
    final jsb O;
    final jsb P;
    final jsb Q;
    final jsb R;
    final jsb S;
    final jsb T;
    final jsb U;
    final jsb V;
    final jsb W;
    final jsb X;
    final jsb Y;
    final jsb Z;
    final jsb a;
    final jsb aA;
    final jsb aB;
    final jsb aC;
    final jsb aD;
    final jsb aE;
    final jsb aF;
    final jsb aG;
    final jsb aH;
    final jsb aI;
    final jsb aJ;
    final jsb aK;
    final jsb aL;
    final jsb aM;
    final jsb aN;
    final jsb aO;
    final jsb aP;
    final jsb aQ;
    final jsb aR;
    final jsb aS;
    final jsb aT;
    final jsb aU;
    final jsb aV;
    final jsb aW;
    final jsb aX;
    final jsb aY;
    final jsb aZ;
    final jsb aa;
    final jsb ab;
    final jsb ac;
    final jsb ad;
    final jsb ae;
    final jsb af;
    final jsb ag;
    final jsb ah;
    final jsb ai;
    final jsb aj;
    final jsb ak;
    final jsb al;
    final jsb am;
    final jsb an;
    final jsb ao;
    final jsb ap;
    final jsb aq;
    final jsb ar;
    final jsb as;
    final jsb at;
    final jsb au;
    final jsb av;
    final jsb aw;
    final jsb ax;
    final jsb ay;
    final jsb az;
    final jsb b;
    final jsb ba;
    final jsb bb;
    final jsb bc;
    final jsb bd;
    final jsb be;
    private final bd bf;
    private final bnl bg;
    private final bnk bh;
    private final bmx bi;
    private final bnf bj;
    private final bnb bk = this;
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

    public bnb(bnl bnlVar, bnk bnkVar, bmx bmxVar, bnf bnfVar, bd bdVar) {
        this.bg = bnlVar;
        this.bh = bnkVar;
        this.bi = bmxVar;
        this.bj = bnfVar;
        this.bf = bdVar;
        jrw a = jrx.a(bdVar);
        this.a = a;
        jsb c = jrv.c(new fuv(a, 20));
        this.b = c;
        this.c = jrv.c(new gaa(a, bnlVar.gZ, bnlVar.gc, 6));
        bnu bnuVar = new bnu(bnkVar.b, 1, null);
        this.d = bnuVar;
        this.e = jrv.c(new dko(bmxVar.b, a, c, bnuVar, bnlVar.mH, 18, (float[][][]) null));
        this.f = jrv.c(new fvc(a, bnlVar.gc, 15));
        this.g = jrv.c(new btb(a, bnfVar.b, bnlVar.hd, bnlVar.mJ, c, bnkVar.C, 11, (boolean[][]) null));
        gte gteVar = new gte(bnkVar.C);
        this.h = gteVar;
        gnl gnlVar = new gnl(gteVar);
        this.i = gnlVar;
        this.j = jrv.c(new gaa(gnlVar, a, bnlVar.mL, 11, (char[][]) null));
        jsb c2 = jrv.c(new dwn(bnlVar.C, 1));
        this.k = c2;
        dwt dwtVar = new dwt(c2);
        this.l = dwtVar;
        jsb jsbVar = bnlVar.C;
        dwm dwmVar = new dwm(jsbVar);
        this.m = dwmVar;
        dte dteVar = new dte(jsbVar, bnlVar.fk, bnlVar.nl, dwmVar, 0);
        this.n = dteVar;
        dwu dwuVar = new dwu(c2);
        this.o = dwuVar;
        dwr dwrVar = new dwr(c2);
        this.p = dwrVar;
        dwq dwqVar = new dwq(c2);
        this.q = dwqVar;
        jsb jsbVar2 = bnlVar.nm;
        dko dkoVar = new dko(jsbVar, (jsb) dwrVar, (jsb) dwuVar, (jsb) dwqVar, jsbVar2, 2, (char[]) null);
        this.r = dkoVar;
        dte dteVar2 = new dte(jsbVar2, (jsb) dwuVar, (jsb) dwqVar, (jsb) dwrVar, 2, (char[]) null);
        this.s = dteVar2;
        jsb jsbVar3 = bof.a;
        this.t = jsbVar3;
        this.u = jsbVar3;
        jsb jsbVar4 = bnlVar.C;
        btb btbVar = new btb((jsb) dkoVar, (jsb) dteVar2, jsbVar3, jsbVar3, (jsb) dwuVar, jsbVar4, 3, (short[]) null);
        this.v = btbVar;
        jsb jsbVar5 = bnlVar.at;
        dwp dwpVar = new dwp(jsbVar4, jsbVar5);
        this.w = dwpVar;
        egu eguVar = new egu(bnlVar.nl, jsbVar5, jsbVar4, dwpVar);
        this.x = eguVar;
        dug dugVar = new dug(jsbVar4, eguVar);
        this.y = dugVar;
        this.z = jsbVar3;
        this.A = jsbVar3;
        dfo dfoVar = new dfo((jsb) dugVar, jsbVar3, jsbVar3, 5, (byte[]) null);
        this.B = dfoVar;
        eib eibVar = new eib(jsbVar4);
        this.C = eibVar;
        dko dkoVar2 = new dko((jsb) dwrVar, (jsb) dwuVar, (jsb) dwqVar, (jsb) eibVar, (jsb) dwmVar, 3, (short[]) null);
        this.D = dkoVar2;
        this.E = jsbVar3;
        jsb jsbVar6 = bof.b;
        this.F = jsbVar6;
        this.G = jsbVar6;
        this.H = jsbVar6;
        dvr dvrVar = new dvr(dwuVar, dwqVar, bnlVar.nm, jsbVar6, jsbVar6, jsbVar4, jsbVar6, dwmVar, 0);
        this.I = dvrVar;
        this.J = jsbVar3;
        btb btbVar2 = new btb((jsb) dwuVar, (jsb) dwqVar, bnlVar.nn, jsbVar6, jsbVar4, (jsb) dwmVar, 2, (char[]) null);
        this.K = btbVar2;
        dwn dwnVar = new dwn(c2, 3);
        this.L = dwnVar;
        this.M = jsbVar3;
        dwn dwnVar2 = new dwn(c2, 4);
        this.N = dwnVar2;
        this.O = jsbVar3;
        this.P = jsbVar3;
        bnv bnvVar = new bnv(jsbVar5);
        this.Q = bnvVar;
        edc edcVar = new edc(bnvVar);
        this.R = edcVar;
        bnv bnvVar2 = new bnv(bnlVar.fl);
        this.S = bnvVar2;
        jsb jsbVar7 = bnlVar.C;
        jsb jsbVar8 = bnlVar.at;
        jsb a2 = jse.a(new dko((jsb) eguVar, jsbVar7, jsbVar8, (jsb) edcVar, (jsb) bnvVar2, 4, (int[]) null));
        this.T = a2;
        dfo dfoVar2 = new dfo(a2, jsbVar7, jsbVar8, 6, (float[]) null);
        this.U = dfoVar2;
        this.V = jsbVar3;
        this.W = jsbVar3;
        bnu bnuVar2 = new bnu(ecn.a, 1, null);
        this.X = bnuVar2;
        this.Y = jsbVar3;
        this.Z = jsbVar3;
        dur durVar = new dur(bnlVar.C, dwtVar, dteVar, dwuVar, btbVar, dfoVar, dkoVar2, jsbVar3, jsbVar3, dvrVar, jsbVar3, btbVar2, dwnVar, jsbVar3, dwnVar2, jsbVar3, jsbVar3, dfoVar2, jsbVar3, jsbVar3, jsbVar3, jsbVar3, bnuVar2, jsbVar3, dwmVar, jsbVar3);
        this.aa = durVar;
        dws dwsVar = new dws(c2);
        this.ab = dwsVar;
        dzf dzfVar = new dzf(dwsVar, dwmVar);
        this.ac = dzfVar;
        dyy dyyVar = new dyy(dzfVar, dwmVar);
        this.ad = dyyVar;
        dyv dyvVar = new dyv(dzfVar);
        this.ae = dyvVar;
        eag eagVar = new eag(dzfVar);
        this.af = eagVar;
        this.ag = jsbVar3;
        this.ah = jsbVar3;
        bnu bnuVar3 = new bnu(dwmVar, 1, null);
        this.ai = bnuVar3;
        ehj ehjVar = new ehj(dwsVar, jsbVar3, jsbVar3, bnuVar2, jsbVar3, jsbVar3, bnuVar3);
        this.aj = ehjVar;
        eab eabVar = new eab(ehjVar);
        this.ak = eabVar;
        dzw dzwVar = new dzw(eagVar, eabVar);
        this.al = dzwVar;
        eal ealVar = new eal(dzwVar);
        this.am = ealVar;
        dxl dxlVar = new dxl(dzfVar, ealVar, dwmVar);
        this.an = dxlVar;
        jsb jsbVar9 = bnlVar.C;
        dvz dvzVar = new dvz(jsbVar9, a2);
        this.ao = dvzVar;
        jsb jsbVar10 = bnlVar.at;
        jsb a3 = jse.a(new dfo(jsbVar9, jsbVar10, dvzVar, 7, (float[]) null));
        this.ap = a3;
        dzg dzgVar = new dzg(dwrVar, ehjVar, dwsVar, a3, dwmVar);
        this.aq = dzgVar;
        dzb dzbVar = new dzb(bnlVar.nk, dwtVar, dwrVar, dwuVar, dwmVar);
        this.ar = dzbVar;
        dzz dzzVar = new dzz(ehjVar);
        this.as = dzzVar;
        eao eaoVar = new eao(dwsVar);
        this.at = eaoVar;
        dzj dzjVar = new dzj(dwsVar, dzbVar, ehjVar);
        this.au = dzjVar;
        ead eadVar = new ead(eaoVar, dwsVar);
        this.av = eadVar;
        ear earVar = new ear(dzzVar, eaoVar, dwsVar);
        this.aw = earVar;
        eah eahVar = new eah(dzzVar, eaoVar, dzjVar, eadVar, earVar, dzgVar);
        this.ax = eahVar;
        dzx dzxVar = new dzx(eahVar, dwsVar, dzbVar);
        this.ay = dzxVar;
        eam eamVar = new eam(dzxVar);
        this.az = eamVar;
        dxm dxmVar = new dxm(dzgVar, dzbVar, eamVar, earVar);
        this.aA = dxmVar;
        dfo dfoVar3 = new dfo(dxlVar, dxmVar, jsbVar10, 8, (char[][]) null);
        this.aB = dfoVar3;
        dyi dyiVar = new dyi(dzfVar);
        this.aC = dyiVar;
        dyj dyjVar = new dyj(dzgVar);
        this.aD = dyjVar;
        dfo dfoVar4 = new dfo((jsb) dyiVar, (jsb) dyjVar, jsbVar10, 9, (byte[]) null);
        this.aE = dfoVar4;
        dyp dypVar = new dyp(dwsVar);
        this.aF = dypVar;
        dxb dxbVar = new dxb(dzfVar, dypVar);
        this.aG = dxbVar;
        dxg dxgVar = new dxg(dfoVar4, dxbVar);
        this.aH = dxgVar;
        dzl dzlVar = new dzl(dzwVar);
        this.aI = dzlVar;
        dzm dzmVar = new dzm(dzxVar);
        this.aJ = dzmVar;
        dko dkoVar3 = new dko(dzwVar, dzxVar, dzlVar, dzmVar, jsbVar10, 5, (boolean[]) null);
        this.aK = dkoVar3;
        dxq dxqVar = new dxq(dfoVar3, dxgVar, dkoVar3);
        this.aL = dxqVar;
        dzt dztVar = new dzt(dkoVar3);
        this.aM = dztVar;
        bpy bpyVar = new bpy(dztVar, jsbVar10, 17);
        this.aN = bpyVar;
        dys dysVar = new dys(bpyVar, dwmVar);
        this.aO = dysVar;
        emm emmVar = new emm(dyyVar, dyvVar, ealVar, dxqVar, dwtVar, dysVar, dwsVar, bpyVar, dwmVar, 1, (byte[]) null);
        this.aP = emmVar;
        dxt dxtVar = new dxt(eaoVar, dzzVar);
        this.aQ = dxtVar;
        dyz dyzVar = new dyz(dzgVar, dzbVar);
        this.aR = dyzVar;
        dyw dywVar = new dyw(dzgVar, dzbVar);
        this.aS = dywVar;
        dyq dyqVar = new dyq(eaoVar);
        this.aT = dyqVar;
        dxc dxcVar = new dxc(dzgVar, dzbVar, eaoVar, dyqVar);
        this.aU = dxcVar;
        dxh dxhVar = new dxh(ehjVar, dxcVar);
        this.aV = dxhVar;
        dxr dxrVar = new dxr(dxhVar, dzbVar);
        this.aW = dxrVar;
        dyg dygVar = new dyg(dzbVar);
        this.aX = dygVar;
        dvr dvrVar2 = new dvr((jsb) dxtVar, (jsb) dyzVar, (jsb) dywVar, (jsb) dzjVar, (jsb) eamVar, (jsb) dxrVar, (jsb) dygVar, (jsb) eaoVar, 2, (char[]) null);
        this.aY = dvrVar2;
        dwn dwnVar3 = new dwn(jsbVar9, 2);
        this.aZ = dwnVar3;
        this.ba = jsbVar3;
        ejr ejrVar = new ejr((jsb) dwrVar, (jsb) emmVar, (jsb) dvrVar2, (jsb) dzbVar, (jsb) dwsVar, (jsb) dwnVar3, jsbVar3, 1, (byte[]) null);
        this.bb = ejrVar;
        bpy bpyVar2 = new bpy(bnlVar.nm, jsbVar9, 16);
        this.bc = bpyVar2;
        this.bd = new dte((jsb) durVar, (jsb) ejrVar, (jsb) dwqVar, (jsb) bpyVar2, 3, (short[]) null);
        this.be = jse.a(new glc(bmxVar.c, bmxVar.d, 2, null));
    }

    public final Bundle a() {
        return hnu.bc(this.bf);
    }

    @Override // defpackage.boq
    public final boo b() {
        bmx bmxVar = this.bi;
        Activity a = bmxVar.a();
        bnk bnkVar = this.bh;
        frv d = bnkVar.d();
        bd bdVar = this.bf;
        if (!(bdVar instanceof bok)) {
            throw new IllegalStateException(bnq.b(bdVar, boo.class, "Attempt to inject a Fragment wrapper of type "));
        }
        bok bokVar = (bok) bdVar;
        bokVar.getClass();
        gbi gbiVar = (gbi) this.b.b();
        bnl bnlVar = this.bg;
        return new boo(a, d, bokVar, gbiVar, bnlVar.m(), bnkVar.b(), bmxVar.c(), t(), (hvl) bnlVar.A.b());
    }

    @Override // defpackage.bqx
    public final bqw c() {
        String c = fsq.c(a());
        bnk bnkVar = this.bh;
        frv d = bnkVar.d();
        bmx bmxVar = this.bi;
        Activity a = bmxVar.a();
        bnl bnlVar = this.bg;
        bd bdVar = this.bf;
        if (!(bdVar instanceof bqs)) {
            throw new IllegalStateException(bnq.b(bdVar, bqw.class, "Attempt to inject a Fragment wrapper of type "));
        }
        bqs bqsVar = (bqs) bdVar;
        bqsVar.getClass();
        ldt ldtVar = new ldt(bnkVar.d(), ((fuk) bnlVar.hc).b(), (bss) bnlVar.ji.b(), bnkVar.h(), (hvl) bnlVar.A.b());
        bxc b = bnkVar.b();
        fde u = bnlVar.u();
        gbi gbiVar = (gbi) this.b.b();
        return new bqw(c, d, a, bqsVar, ldtVar, b, u, gbiVar, (gez) this.c.b(), bmxVar.c(), new bpz(), (hvl) bnlVar.at.b());
    }

    @Override // defpackage.brj
    public final bri d() {
        bd bdVar = this.bf;
        if (!(bdVar instanceof bre)) {
            throw new IllegalStateException(bnq.b(bdVar, bri.class, "Attempt to inject a Fragment wrapper of type "));
        }
        bre breVar = (bre) bdVar;
        breVar.getClass();
        bmx bmxVar = this.bi;
        jsb jsbVar = this.b;
        brn c = bmxVar.c();
        gbi gbiVar = (gbi) jsbVar.b();
        bnk bnkVar = this.bh;
        bnl bnlVar = this.bg;
        bxc b = bnkVar.b();
        return new bri(breVar, c, gbiVar, b);
    }

    @Override // defpackage.bvo
    public final bvm e() {
        Bundle a = a();
        bnl bnlVar = this.bg;
        jkd jkdVar = (jkd) bnlVar.mv.b();
        hoq.y(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
        bwi bwiVar = (bwi) imi.c(a, "TIKTOK_FRAGMENT_ARGUMENT", bwi.a, jkdVar);
        bwiVar.getClass();
        bd bdVar = this.bf;
        if (!(bdVar instanceof buf)) {
            throw new IllegalStateException(bnq.b(bdVar, bvm.class, "Attempt to inject a Fragment wrapper of type "));
        }
        buf bufVar = (buf) bdVar;
        bufVar.getClass();
        bmx bmxVar = this.bi;
        bnk bnkVar = this.bh;
        Activity a2 = bmxVar.a();
        frv d = bnkVar.d();
        brn c = bmxVar.c();
        bvp bvpVar = new bvp();
        kt t = t();
        ClipboardManager clipboardManager = (ClipboardManager) ((Context) bnlVar.nS.a).getSystemService("clipboard");
        clipboardManager.getClass();
        bwo bwoVar = (bwo) bnlVar.mw.b();
        gbi gbiVar = (gbi) this.b.b();
        gez gezVar = (gez) this.c.b();
        iwq iwqVar = (iwq) bnlVar.gZ.b();
        gva gvaVar = (gva) bnkVar.C.b();
        gva gvaVar2 = (gva) bnkVar.C.b();
        brn brnVar = new brn(gvaVar2, (byte[]) null);
        jey m = bnlVar.m();
        car h = bnkVar.h();
        bnl bnlVar2 = bnkVar.E;
        fde u = bnlVar2.u();
        fuj b = ((fuk) bnlVar2.hc).b();
        Object b2 = bnlVar2.gZ.b();
        cbp c2 = gdu.c(b2);
        return new bvm(bwiVar, bufVar, a2, d, c, bvpVar, t, clipboardManager, bwoVar, gbiVar, gezVar, iwqVar, gvaVar, brnVar, m, new bww(h, u, b, c2, (bss) bnlVar2.ji.b(), (hvl) bnlVar2.at.b()), bnkVar.b(), new bwz(bnkVar.h(), (iwq) bnlVar2.gZ.b(), bnkVar.r(), (hvl) bnlVar2.A.b(), (hvl) bnlVar2.at.b()), bnkVar.h(), bnlVar.b(), new cad(bnkVar.h(), bnlVar2.b(), bnkVar.a(), (dih) bnlVar2.q.b(), (kvm) bnkVar.D.b()), bnkVar.a(), (gnx) this.e.b(), new brn((gva) bnkVar.C.b(), (byte[]) null), (hvl) bnlVar.A.b(), (hvl) bnlVar.at.b());
    }

    @Override // defpackage.bwc
    public final bwb f() {
        bd bdVar = this.bf;
        if (!(bdVar instanceof bvz)) {
            throw new IllegalStateException(bnq.b(bdVar, bwb.class, "Attempt to inject a Fragment wrapper of type "));
        }
        bvz bvzVar = (bvz) bdVar;
        bvzVar.getClass();
        return new bwb(bvzVar, (gva) this.bh.C.b());
    }

    @Override // defpackage.bwh
    public final bwg g() {
        bd bdVar = this.bf;
        if (!(bdVar instanceof bwd)) {
            throw new IllegalStateException(bnq.b(bdVar, bwg.class, "Attempt to inject a Fragment wrapper of type "));
        }
        bwd bwdVar = (bwd) bdVar;
        bwdVar.getClass();
        return new bwg(bwdVar, (gva) this.bh.C.b());
    }

    @Override // defpackage.bxn
    public final bxm h() {
        bd bdVar = this.bf;
        if (!(bdVar instanceof bxj)) {
            throw new IllegalStateException(bnq.b(bdVar, bxm.class, "Attempt to inject a Fragment wrapper of type "));
        }
        bxj bxjVar = (bxj) bdVar;
        bxjVar.getClass();
        return new bxm(bxjVar, this.bi.c());
    }

    @Override // defpackage.bxr
    public final bxq i() {
        bd bdVar = this.bf;
        if (!(bdVar instanceof bxo)) {
            throw new IllegalStateException(bnq.b(bdVar, bxq.class, "Attempt to inject a Fragment wrapper of type "));
        }
        bxo bxoVar = (bxo) bdVar;
        bxoVar.getClass();
        bnk bnkVar = this.bh;
        return new bxq(bxoVar, bnkVar.d(), (gva) bnkVar.C.b());
    }

    @Override // defpackage.byc
    public final bya j() {
        bmx bmxVar = this.bi;
        Activity a = bmxVar.a();
        bd bdVar = this.bf;
        if (!(bdVar instanceof bxx)) {
            throw new IllegalStateException(bnq.b(bdVar, bya.class, "Attempt to inject a Fragment wrapper of type "));
        }
        bxx bxxVar = (bxx) bdVar;
        bxxVar.getClass();
        return new bya(a, bxxVar, bmxVar.c(), new byk(), this.bh.b(), (gez) this.c.b());
    }

    @Override // defpackage.byi
    public final byh k() {
        bd bdVar = this.bf;
        boolean z = bdVar instanceof byd;
        bzk n = n();
        if (!z) {
            throw new IllegalStateException(bnq.b(bdVar, byh.class, "Attempt to inject a Fragment wrapper of type "));
        }
        byd bydVar = (byd) bdVar;
        bydVar.getClass();
        return new byh(n, bydVar, this.bi.c());
    }

    @Override // defpackage.byv
    public final byu l() {
        bd bdVar = this.bf;
        boolean z = bdVar instanceof byr;
        bzk n = n();
        if (!z) {
            throw new IllegalStateException(bnq.b(bdVar, byu.class, "Attempt to inject a Fragment wrapper of type "));
        }
        byr byrVar = (byr) bdVar;
        byrVar.getClass();
        bnk bnkVar = this.bh;
        bnl bnlVar = this.bg;
        bxc b = bnkVar.b();
        return new byu(n, byrVar, b, this.bi.c(), (gbi) this.b.b());
    }

    @Override // defpackage.bzf
    public final bze m() {
        bmx bmxVar = this.bi;
        Activity a = bmxVar.a();
        bd bdVar = this.bf;
        if (!(bdVar instanceof bza)) {
            throw new IllegalStateException(bnq.b(bdVar, bze.class, "Attempt to inject a Fragment wrapper of type "));
        }
        bza bzaVar = (bza) bdVar;
        bzaVar.getClass();
        bnk bnkVar = this.bh;
        bnl bnlVar = this.bg;
        bxc b = bnkVar.b();
        jey m = bnlVar.m();
        return new bze(a, bzaVar, b, m, bmxVar.c(), (gbi) this.b.b(), (jkd) bnlVar.mv.b(), (hvl) bnlVar.A.b());
    }

    public final bzk n() {
        Bundle a = a();
        jkd jkdVar = (jkd) this.bg.mv.b();
        hoq.y(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
        bzk bzkVar = (bzk) imi.c(a, "TIKTOK_FRAGMENT_ARGUMENT", bzk.a, jkdVar);
        bzkVar.getClass();
        return bzkVar;
    }

    @Override // defpackage.fyn
    public final fym o() {
        bd bdVar = this.bf;
        if (!(bdVar instanceof fyl)) {
            throw new IllegalStateException(bnq.b(bdVar, fym.class, "Attempt to inject a Fragment wrapper of type "));
        }
        fyl fylVar = (fyl) bdVar;
        fylVar.getClass();
        bnk bnkVar = this.bh;
        jsb jsbVar = this.f;
        frv d = bnkVar.d();
        gpj gpjVar = (gpj) jsbVar.b();
        bnl bnlVar = this.bg;
        fuj b = ((fuk) bnlVar.hc).b();
        jsb jsbVar2 = this.g;
        Object b2 = jsbVar2.b();
        Object b3 = jsbVar2.b();
        fyw fywVar = new fyw((fyx) b3);
        gnh gnhVar = (gnh) this.j.b();
        bmx bmxVar = this.bi;
        final Activity a = bmxVar.a();
        final brn d2 = bmxVar.d();
        final gzp h = gzp.h("google");
        final dsd dsdVar = new dsd(a, 2);
        final String str = "OG: Manage Accounts";
        dry dryVar = new dry() { // from class: gxc
            @Override // defpackage.dry, defpackage.dou
            public final void a(View view, Object obj) {
                fuf fufVar = (fuf) obj;
                gtt f = ((gva) brn.this.a).f(str, 273);
                try {
                    dsdVar.a(view, fufVar);
                    f.close();
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        };
        final dsd dsdVar2 = new dsd(a, 3);
        final String str2 = "OG: Add Account";
        dry dryVar2 = new dry() { // from class: gxc
            @Override // defpackage.dry, defpackage.dou
            public final void a(View view, Object obj) {
                fuf fufVar = (fuf) obj;
                gtt f = ((gva) brn.this.a).f(str2, 273);
                try {
                    dsdVar2.a(view, fufVar);
                    f.close();
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        };
        final dry dryVar3 = new dry() { // from class: fys
            @Override // defpackage.dry, defpackage.dou
            public final void a(View view, Object obj) {
                fuf fufVar = (fuf) obj;
                if (fufVar != null) {
                    if (((String) ((gzs) gzp.this).a).equals(fufVar.b.k)) {
                        Activity activity = a;
                        Intent i = fhr.i(fufVar, 1);
                        if (i.resolveActivity(activity.getPackageManager()) != null) {
                            activity.startActivityForResult(i, 9631);
                            return;
                        } else {
                            fhr.j(activity, "https://myaccount.google.com/");
                            return;
                        }
                    }
                }
                throw new UnsupportedOperationException("Should only be visible for Google accounts");
            }
        };
        final String str3 = "OG: My Account";
        drz drzVar = new drz(new dry() { // from class: gxc
            @Override // defpackage.dry, defpackage.dou
            public final void a(View view, Object obj) {
                fuf fufVar = (fuf) obj;
                gtt f = ((gva) brn.this.a).f(str3, 273);
                try {
                    dryVar3.a(view, fufVar);
                    f.close();
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, dryVar2, dryVar);
        final Activity a2 = bmxVar.a();
        brn d3 = bmxVar.d();
        final gzp h2 = gzp.h("google");
        gyf gyfVar = gyf.a;
        final int i = 1;
        int i2 = 2;
        gzp h3 = gzp.h(new dut(d3, "OG: Privacy Policy", new dou() { // from class: fyy
            @Override // defpackage.dou
            public final void a(View view, Object obj) {
                int i3 = i;
                Activity activity = a2;
                if (i3 != 0) {
                    if (obj != null) {
                        fuf fufVar = (fuf) obj;
                        if (((String) ((gzs) h2).a).equals(fufVar.b.k)) {
                            Intent i4 = fhr.i(fufVar, 500);
                            if (i4.resolveActivity(activity.getPackageManager()) != null) {
                                activity.startActivityForResult(i4, 9631);
                                return;
                            } else {
                                fhr.j(activity, "https://policies.google.com/privacy");
                                return;
                            }
                        }
                    }
                    fhr.j(activity, "https://policies.google.com/privacy");
                    return;
                }
                if (obj != null) {
                    fuf fufVar2 = (fuf) obj;
                    if (((String) ((gzs) h2).a).equals(fufVar2.b.k)) {
                        Intent i5 = fhr.i(fufVar2, 503);
                        if (i5.resolveActivity(activity.getPackageManager()) != null) {
                            activity.startActivityForResult(i5, 9631);
                            return;
                        } else {
                            fhr.j(activity, "https://policies.google.com/terms");
                            return;
                        }
                    }
                }
                fhr.j(activity, "https://policies.google.com/terms");
            }
        }, i2));
        final int i3 = 0;
        return new fym(fylVar, d, gpjVar, b, (fyx) b2, fywVar, gnhVar, drzVar, new ecl(h3, gzp.h(new dut(d3, "OG: Terms of Service", new dou() { // from class: fyy
            @Override // defpackage.dou
            public final void a(View view, Object obj) {
                int i32 = i3;
                Activity activity = a2;
                if (i32 != 0) {
                    if (obj != null) {
                        fuf fufVar = (fuf) obj;
                        if (((String) ((gzs) h2).a).equals(fufVar.b.k)) {
                            Intent i4 = fhr.i(fufVar, 500);
                            if (i4.resolveActivity(activity.getPackageManager()) != null) {
                                activity.startActivityForResult(i4, 9631);
                                return;
                            } else {
                                fhr.j(activity, "https://policies.google.com/privacy");
                                return;
                            }
                        }
                    }
                    fhr.j(activity, "https://policies.google.com/privacy");
                    return;
                }
                if (obj != null) {
                    fuf fufVar2 = (fuf) obj;
                    if (((String) ((gzs) h2).a).equals(fufVar2.b.k)) {
                        Intent i5 = fhr.i(fufVar2, 503);
                        if (i5.resolveActivity(activity.getPackageManager()) != null) {
                            activity.startActivityForResult(i5, 9631);
                            return;
                        } else {
                            fhr.j(activity, "https://policies.google.com/terms");
                            return;
                        }
                    }
                }
                fhr.j(activity, "https://policies.google.com/terms");
            }
        }, i2)), gyfVar, gyfVar), gzp.h("google"), (ScheduledExecutorService) bnlVar.at.b(), (dme) bnlVar.nk.b());
    }

    @Override // defpackage.fyr
    public final fyq p() {
        Activity a = this.bi.a();
        frv d = this.bh.d();
        jpt a2 = jrv.a(this.bd);
        gyf gyfVar = gyf.a;
        return new fyq(a, this.bf, d, new iee(a2, gyfVar, new dja(), gyfVar, (ExecutorService) this.bg.at.b(), gyfVar));
    }

    @Override // defpackage.gmr
    public final bob q() {
        return new bob(this.bg, this.bh, this.bi, this.bk);
    }

    @Override // defpackage.glh
    public final glu r() {
        return (glu) this.be.b();
    }

    @Override // defpackage.gxs
    public final void s() {
        this.bi.c();
    }

    public final kt t() {
        bnl bnlVar = this.bg;
        return new kt(null);
    }

    @Override // defpackage.glh
    public final ikj u() {
        return new ikj((koe) jsd.a, new boc());
    }
}
