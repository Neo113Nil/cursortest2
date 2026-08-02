package defpackage;

import android.content.Context;
import android.os.Handler;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvr implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final jsb g;
    private final jsb h;
    private final /* synthetic */ int i;

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i) {
        this.i = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.g = jsbVar7;
        this.h = jsbVar8;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = 2;
        switch (this.i) {
            case 0:
                Object obj = ((jrx) this.d).a;
                jsb jsbVar = this.c;
                return new dya(((dwu) this.a).b(), ((dwq) this.b).b(), ((eie) jsbVar).b(), (Optional) obj, (Optional) ((jrx) this.e).a, ((jrk) this.f).b(), (Optional) ((jrx) this.g).a, ((dwm) this.h).b());
            case 1:
                ThreadFactory threadFactory = (ThreadFactory) this.d.b();
                hvm hvmVar = (hvm) this.g.b();
                int max = Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
                Integer.valueOf(max).getClass();
                bst b = ((dfy) this.h).b();
                dhm b2 = ((dhu) this.e).b();
                gzp gzpVar = (gzp) ((jrx) this.b).a;
                gzp gzpVar2 = (gzp) ((jrx) this.f).a;
                cbp cbpVar = (cbp) this.a.b();
                dhr b3 = ((dfx) this.c).b();
                dio dioVar = new dio("Lite", max, ((Boolean) gzpVar2.d(false)).booleanValue(), diq.a);
                return new dgh(hnu.aB(dgn.a(gzpVar, dja.c(dioVar, b2, b.a(dja.d(dioVar.a, new dgs(threadFactory, 0))), dja.f(cbpVar, dioVar), b3))), hvmVar);
            case 2:
                jsb jsbVar2 = this.g;
                jsb jsbVar3 = this.a;
                jsb jsbVar4 = this.d;
                jsb jsbVar5 = this.e;
                dxs b4 = ((dxt) this.f).b();
                dyx b5 = ((dyz) jsbVar5).b();
                dyu b6 = ((dyw) jsbVar4).b();
                dzh b7 = ((dzj) jsbVar3).b();
                ((eam) jsbVar2).b();
                jsb jsbVar6 = this.h;
                dxo b8 = ((dxr) this.b).b();
                dyf b9 = ((dyg) jsbVar6).b();
                dyr dyrVar = new dyr();
                ((eao) this.c).b();
                return new dyc(b4, b5, b6, b7, b8, b9, dyrVar);
            case 3:
                jsb jsbVar7 = this.e;
                Context b10 = ((jrk) this.b).b();
                fwm fwmVar = (fwm) jsbVar7.b();
                jsb jsbVar8 = this.c;
                jsb jsbVar9 = this.f;
                jsb jsbVar10 = this.g;
                return new epx(this.h, b10, this.a, this.d, jsbVar10, jsbVar9, jsbVar8, fwmVar);
            case 4:
                return new fxo((fwm) this.f.b(), (fuy) this.g.b(), (fuq) this.b.b(), (hvl) this.e.b(), (hvl) this.d.b(), ((fxk) this.h).b(), (hum) this.a.b());
            case 5:
                jsb jsbVar11 = this.e;
                Context b11 = ((jrk) this.b).b();
                gce gceVar = (gce) jsbVar11.b();
                jsb jsbVar12 = this.g;
                return new ghf(b11, gceVar, ((jrz) this.a).b(), (Executor) jsbVar12.b(), ((bnu) this.c).a(), (gzp) ((jrx) this.d).a, ((gcu) this.h).b(), (gzp) ((jrx) this.f).a);
            case 6:
                return new ghf((Optional) ((jrx) this.c).a, (ScheduledExecutorService) this.f.b(), (iwq) this.a.b(), (iwq) this.b.b(), (Map) this.e.b(), ((ett) this.g).b(), ((ghy) this.d).b(), (etd) this.h.b());
            case 7:
                cfe cfeVar = (cfe) ((jrx) this.d).a;
                ghc ghcVar = (ghc) ((jrx) this.g).a;
                gpj gpjVar = (gpj) this.e.b();
                hvl hvlVar = (hvl) this.b.b();
                fym fymVar = (fym) this.a.b();
                Set set = (Set) ((jrx) this.c).a;
                cfe b12 = ((ghg) this.h).b();
                cfeVar.getClass();
                ghcVar.getClass();
                gpjVar.getClass();
                hvlVar.getClass();
                fymVar.getClass();
                Map map = ((jrt) this.f).a;
                map.getClass();
                set.getClass();
                return cfeVar.i(ggh.a, new fvv(b12, gpjVar, i), hvlVar, map, ghe.a, new gdg((Object) ghcVar, 4, (int[]) null), new fvr(fymVar, 8), new aji(14), set);
            case 8:
                ghc ghcVar2 = (ghc) ((jrx) this.f).a;
                cfe cfeVar2 = (cfe) ((jrx) this.h).a;
                gpj gpjVar2 = (gpj) this.c.b();
                Map map2 = (Map) ((jrx) this.b).a;
                Executor executor = (Executor) this.e.b();
                fym fymVar2 = (fym) this.a.b();
                Object obj2 = ((jrx) this.d).a;
                cfe b13 = ((ghg) this.g).b();
                Set set2 = (Set) obj2;
                ghcVar2.getClass();
                cfeVar2.getClass();
                gpjVar2.getClass();
                map2.getClass();
                executor.getClass();
                fymVar2.getClass();
                set2.getClass();
                return cfeVar2.i(ggh.c, new fvv(b13, gpjVar2, 6), executor, map2, gip.a, new gdg((Object) ghcVar2, 7, (int[]) null), new fvr(fymVar2, 15), new aji(16), set2);
            case 9:
                gqc gqcVar = (gqc) this.d.b();
                ghf ghfVar = (ghf) this.a.b();
                jsb jsbVar13 = this.f;
                return new grd(gqcVar, ghfVar, ((grk) this.e).b(), (ScheduledExecutorService) jsbVar13.b(), ((ewo) this.g).b(), ((grr) this.c).b(), (gzp) ((jrx) this.b).a, ((Boolean) this.h.b()).booleanValue());
            case 10:
                jsb jsbVar14 = this.b;
                Object b14 = this.g.b();
                gzp gzpVar3 = (gzp) ((jrx) this.a).a;
                gtb gtbVar = gtb.a;
                gtbVar.getClass();
                return new gvn((gtp) b14, this.f, this.d, gzpVar3, gtbVar, (Map) ((jrx) this.h).a, (Map) ((jrx) this.e).a, (gzp) ((jrx) this.c).a);
            case 11:
                final gzp gzpVar4 = (gzp) ((jrx) this.f).a;
                final gzp gzpVar5 = (gzp) ((jrx) this.b).a;
                final gzp gzpVar6 = (gzp) ((jrx) this.g).a;
                final gzp gzpVar7 = (gzp) ((jrx) this.c).a;
                final Set set3 = (Set) ((jrx) this.e).a;
                final gzp gzpVar8 = (gzp) ((jrx) this.h).a;
                final gzp gzpVar9 = (gzp) ((jrx) this.d).a;
                final gzp gzpVar10 = (gzp) ((jrx) this.a).a;
                return new eww() { // from class: gwf
                    @Override // defpackage.eww
                    public final void a() {
                        gzp gzpVar11 = gzp.this;
                        if (gzpVar11.f()) {
                            gus.a = (gur) gzpVar11.b();
                        }
                        gzp gzpVar12 = gzpVar5;
                        if (gzpVar12.f()) {
                            gsn.a = (gsm) gzpVar12.b();
                        }
                        gzp gzpVar13 = gzpVar6;
                        if (gzpVar13.f()) {
                            guf.a = (gue) gzpVar13.b();
                        }
                        gzp gzpVar14 = gzpVar7;
                        if (gzpVar14.f() && !((Boolean) gzpVar14.b()).booleanValue()) {
                            gsv.a();
                        }
                        Set set4 = set3;
                        if (!set4.isEmpty()) {
                            gta.s(hfm.n(set4));
                        }
                        gzp gzpVar15 = gzpVar8;
                        if (gzpVar15.f() && ((Boolean) gzpVar15.b()).booleanValue()) {
                            gta.a = false;
                        } else {
                            gta.a = true;
                        }
                        gzp gzpVar16 = gzpVar9;
                        if (gzpVar16.f() && ((Boolean) gzpVar16.b()).booleanValue()) {
                            gta.b = true;
                        }
                        gzp gzpVar17 = gzpVar10;
                        if (gzpVar17.f()) {
                            ((Boolean) gzpVar17.b()).booleanValue();
                        }
                    }
                };
            default:
                Context b15 = ((jrk) this.g).b();
                idk idkVar = (idk) this.a.b();
                dih dihVar = (dih) this.f.b();
                gzp gzpVar11 = (gzp) ((jrx) this.b).a;
                gzp gzpVar12 = (gzp) ((jrx) this.c).a;
                gzp a = ((bnu) this.d).a();
                ifv ifvVar = (ifv) this.e.b();
                iel b16 = ((ien) this.h).b();
                idkVar.getClass();
                dihVar.getClass();
                gzpVar11.getClass();
                gzpVar12.getClass();
                ifvVar.getClass();
                return new idp(b15, idkVar, ((Boolean) gzpVar11.d(true)).booleanValue(), ((Boolean) gzpVar12.d(false)).booleanValue(), (Handler) ((gzs) a).a, ifvVar, b16);
        }
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, byte[] bArr) {
        this.i = i;
        this.d = jsbVar;
        this.g = jsbVar2;
        this.h = jsbVar3;
        this.e = jsbVar4;
        this.b = jsbVar5;
        this.f = jsbVar6;
        this.a = jsbVar7;
        this.c = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, char[] cArr) {
        this.i = i;
        this.f = jsbVar;
        this.e = jsbVar2;
        this.d = jsbVar3;
        this.a = jsbVar4;
        this.g = jsbVar5;
        this.b = jsbVar6;
        this.h = jsbVar7;
        this.c = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, float[] fArr) {
        this.i = i;
        this.c = jsbVar;
        this.f = jsbVar2;
        this.a = jsbVar3;
        this.b = jsbVar4;
        this.e = jsbVar5;
        this.g = jsbVar6;
        this.d = jsbVar7;
        this.h = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, int[] iArr) {
        this.i = i;
        this.c = jsbVar;
        this.f = jsbVar2;
        this.g = jsbVar3;
        this.b = jsbVar4;
        this.e = jsbVar5;
        this.d = jsbVar6;
        this.h = jsbVar7;
        this.a = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, short[] sArr) {
        this.i = i;
        this.h = jsbVar;
        this.b = jsbVar2;
        this.a = jsbVar3;
        this.d = jsbVar4;
        this.g = jsbVar5;
        this.f = jsbVar6;
        this.c = jsbVar7;
        this.e = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, boolean[] zArr) {
        this.i = i;
        this.b = jsbVar;
        this.e = jsbVar2;
        this.a = jsbVar3;
        this.g = jsbVar4;
        this.c = jsbVar5;
        this.d = jsbVar6;
        this.h = jsbVar7;
        this.f = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, byte[][] bArr) {
        this.i = i;
        this.d = jsbVar;
        this.g = jsbVar2;
        this.e = jsbVar3;
        this.b = jsbVar4;
        this.a = jsbVar5;
        this.f = jsbVar6;
        this.c = jsbVar7;
        this.h = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, char[][] cArr) {
        this.i = i;
        this.f = jsbVar;
        this.h = jsbVar2;
        this.c = jsbVar3;
        this.b = jsbVar4;
        this.e = jsbVar5;
        this.a = jsbVar6;
        this.g = jsbVar7;
        this.d = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, float[][] fArr) {
        this.i = i;
        this.g = jsbVar;
        this.a = jsbVar2;
        this.f = jsbVar3;
        this.b = jsbVar4;
        this.c = jsbVar5;
        this.d = jsbVar6;
        this.e = jsbVar7;
        this.h = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, int[][] iArr) {
        this.i = i;
        this.g = jsbVar;
        this.b = jsbVar2;
        this.f = jsbVar3;
        this.d = jsbVar4;
        this.a = jsbVar5;
        this.h = jsbVar6;
        this.e = jsbVar7;
        this.c = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, short[][] sArr) {
        this.i = i;
        this.d = jsbVar;
        this.a = jsbVar2;
        this.e = jsbVar3;
        this.f = jsbVar4;
        this.g = jsbVar5;
        this.c = jsbVar6;
        this.b = jsbVar7;
        this.h = jsbVar8;
    }

    public dvr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, int i, boolean[][] zArr) {
        this.i = i;
        this.f = jsbVar;
        this.b = jsbVar2;
        this.g = jsbVar3;
        this.c = jsbVar4;
        this.e = jsbVar5;
        this.h = jsbVar6;
        this.d = jsbVar7;
        this.a = jsbVar8;
    }
}
