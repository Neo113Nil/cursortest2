package defpackage;

import android.app.Activity;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmz implements gke, gki, gkn, gly, gmh, gvd, gxr, jqa, jqx, jrp {
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
    final iyi v;
    private final Activity w;
    private final bnl x;
    private final bna y;
    private final bmz z = this;

    public bmz(bnl bnlVar, bna bnaVar, Activity activity) {
        this.x = bnlVar;
        this.y = bnaVar;
        this.w = activity;
        jrw c = jrx.c(activity);
        this.a = c;
        gph gphVar = new gph(c, 14);
        this.b = gphVar;
        jrw c2 = jrx.c(null);
        this.c = c2;
        jsb a = jse.a(new glc(gphVar, c2, 2, null));
        this.d = a;
        jri jriVar = new jri(c, 0);
        this.e = jriVar;
        gkx gkxVar = new gkx(bnlVar.ld, jriVar, a);
        this.f = gkxVar;
        iyi iyiVar = new iyi((Object) jriVar, (Object) a, (Object) gkxVar, (char[]) null);
        this.v = iyiVar;
        jrw a2 = jrx.a(new cka(iyiVar));
        this.g = a2;
        jsb jsbVar = bof.a;
        this.h = jrv.c(new glc(a, a2, 0));
        jrh jrhVar = new jrh(c, 0);
        this.i = jrhVar;
        this.j = jrv.c(new glc(jrhVar, jsd.a, 3, null));
        this.k = jrv.c(fsp.a);
        this.l = jrv.c(new emo(a, 19));
        this.m = new glb(jriVar);
        this.n = jrv.c(new fuv(a, 19));
        gte gteVar = new gte(bnlVar.bJ);
        this.o = gteVar;
        gnl gnlVar = new gnl(gteVar);
        this.p = gnlVar;
        jrv.c(new gaa(gnlVar, jrhVar, bnlVar.mL, 10, (char[][]) null));
        fvg fvgVar = new fvg(bnlVar.nD, bnlVar.at, bnlVar.fl);
        this.q = fvgVar;
        fvi fviVar = new fvi(fvgVar);
        this.r = fviVar;
        this.s = jsbVar;
        fwb fwbVar = new fwb(bnlVar.C, fviVar, bnlVar.hc, jsbVar);
        this.t = fwbVar;
        this.u = new fvc(fwbVar, jrhVar, 3, null);
    }

    public final Activity a() {
        Activity activity = this.w;
        iwh.a(activity);
        return activity;
    }

    public final frz b() {
        frz j = ((fsr) iwc.a((glu) this.d.b(), fsr.class)).j();
        j.getClass();
        return j;
    }

    @Override // defpackage.gxr
    public final brn c() {
        return new brn((gva) this.x.bJ.b(), (byte[]) null);
    }

    @Override // defpackage.gkn
    public final gkw d() {
        return new gkw((ikj) this.x.ld.b(), f(), (glu) this.d.b());
    }

    @Override // defpackage.gvg
    public final gva e() {
        return (gva) this.x.bJ.b();
    }

    public final gzp f() {
        return gzp.g(this.w);
    }

    @Override // defpackage.gvg
    public final Set g() {
        return hjb.a;
    }

    @Override // defpackage.jqx
    public final bny h() {
        return new bny(this.x, this.y, this.z);
    }

    @Override // defpackage.gly
    public final esy i() {
        return (esy) this.j.b();
    }

    @Override // defpackage.gke, defpackage.gki
    public final iwq j() {
        return (iwq) this.h.b();
    }

    @Override // defpackage.jqa
    public final kuq k() {
        return new kuq((Map) new jry(her.m(true, true, true, true)), new bod(this.x));
    }

    @Override // defpackage.gmh
    public final kee l() {
        return new kee(f());
    }
}
