package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejr implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final jsb g;
    private final /* synthetic */ int h;

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i) {
        this.h = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.g = jsbVar7;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.h) {
            case 0:
                ejl ejlVar = (ejl) this.a.b();
                jsb jsbVar = this.c;
                gzp a = ((bnu) this.b).a();
                jsb jsbVar2 = this.g;
                return new fym(ejlVar, a, this.d, this.e, this.f, jsbVar2);
            case 1:
                jsb jsbVar3 = this.d;
                jsb jsbVar4 = this.c;
                jsb jsbVar5 = this.g;
                return new duo(jrv.a(this.b), this.a, jrv.a(this.f), jrv.a(this.e), jrv.a(jsbVar5), jrv.a(jsbVar4), jrv.a(jsbVar3));
            case 2:
                jsb jsbVar6 = this.d;
                jsb jsbVar7 = this.b;
                ldt b = ((emj) this.a).b();
                Context b2 = ((jrk) jsbVar7).b();
                hvm hvmVar = (hvm) jsbVar6.b();
                jsb jsbVar8 = this.c;
                jpt a2 = jrv.a(this.g);
                return new emv(b, b2, hvmVar, a2, this.f, this.e);
            case 3:
                jsb jsbVar9 = this.d;
                return new eqt(((emj) this.a).b(), ((jrk) this.c).b(), (ekv) jsbVar9.b(), (Executor) this.g.b(), jrv.a(this.b), ((erk) this.f).b(), this.e);
            case 4:
                jsb jsbVar10 = this.b;
                ldt b3 = ((emj) this.g).b();
                Executor executor = (Executor) jsbVar10.b();
                jsb jsbVar11 = this.d;
                jsb jsbVar12 = this.c;
                return new eqz(b3, executor, jrv.a(this.e), jrv.a(jsbVar12), this.a, this.f, ((erm) jsbVar11).b());
            case 5:
                fwm fwmVar = (fwm) this.b.b();
                return new fto(fwmVar, ((jrt) this.g).a, ((jrt) this.d).a, (Set) ((jrx) this.c).a, (ftf) this.e.b(), (gzp) ((jrx) this.a).a);
            case 6:
                fwm fwmVar2 = (fwm) this.c.b();
                fcu fcuVar = (fcu) this.b.b();
                return new fuy(this.g, fwmVar2, fcuVar, this.d, ((emp) this.e).a().intValue(), (Executor) this.f.b());
            case 7:
                ((ewo) this.d).b();
                Optional optional = (Optional) ((jrx) this.b).a;
                Optional optional2 = (Optional) ((jrx) this.c).a;
                jsb jsbVar13 = this.g;
                return new gjn(optional, optional2, this.a, this.e, this.f, jsbVar13);
            case 8:
                jsb jsbVar14 = this.d;
                jsb jsbVar15 = this.b;
                Context b4 = ((jrk) this.g).b();
                Object b5 = jsbVar15.b();
                ckb ckbVar = (ckb) jsbVar14.b();
                Executor executor2 = (Executor) this.c.b();
                Object obj = ((jrx) this.f).a;
                jsb jsbVar16 = this.e;
                jpt a3 = jrv.a(this.a);
                jpt a4 = jrv.a(jsbVar16);
                a3.getClass();
                igt igtVar = new igt(b4, new eqn(a3, 4));
                ckbVar.getClass();
                igtVar.d = ckbVar;
                boolean booleanValue = ((Boolean) ((gzp) obj).d(false)).booleanValue();
                igtVar.j = (gmz) b5;
                a4.getClass();
                igtVar.f = new eqn(a4, 5);
                igtVar.e = executor2;
                igtVar.h = igt.g;
                Context context = igtVar.b;
                ckb ckbVar2 = igtVar.d;
                if (ckbVar2 == null) {
                    ckbVar2 = new igu();
                }
                ckb ckbVar3 = ckbVar2;
                erx erxVar = igt.a;
                Executor executor3 = igtVar.e;
                if (executor3 == null) {
                    executor3 = huf.a;
                }
                Executor executor4 = executor3;
                koe koeVar = igtVar.c;
                ikg ikgVar = igtVar.j;
                if (ikgVar == null) {
                    ikgVar = igt.i;
                }
                ikg ikgVar2 = ikgVar;
                koe koeVar2 = igtVar.f;
                if (koeVar2 == null) {
                    koeVar2 = new eqn(igtVar, 20);
                }
                return new igv(context, ckbVar3, erxVar, executor4, koeVar, ikgVar2, booleanValue, koeVar2, igtVar.h, 0);
            case 9:
                jsb jsbVar17 = this.f;
                jsb jsbVar18 = this.g;
                Context b6 = ((jrk) this.c).b();
                Object b7 = jsbVar18.b();
                hvl hvlVar = (hvl) this.b.b();
                return new iwq(b6, (fym) b7, hvlVar, (koe) this.a);
            case 10:
                boolean booleanValue2 = ((Boolean) this.d.b()).booleanValue();
                Object obj2 = ((jrx) this.b).a;
                fwm b8 = ((ewo) this.f).b();
                gzp gzpVar = (gzp) obj2;
                Object obj3 = ((jrx) this.a).a;
                String a5 = ((gcp) this.g).a();
                gzp gzpVar2 = (gzp) obj3;
                if ((((gdd) this.c).b().equals(gdc.b) || ((Boolean) gzpVar2.d(false)).booleanValue()) && !((Boolean) gzpVar.d(false)).booleanValue() && !b8.k().equals(a5)) {
                    ((hkf) ((hkf) gqp.a.f()).i("com/google/apps/tiktok/sync/impl/SyncModule", "provideSyncManager", 135, "SyncModule.java")).s("The ProcessInit main process must be the same as the default work process, otherwise Synclets will not run. See go/tiktok-sync/multiprocess#sync-process-check");
                }
                Object gqbVar = booleanValue2 ? (gqc) this.e.b() : new gqb();
                gqbVar.getClass();
                return gqbVar;
            default:
                return new gra((gqc) this.d.b(), (ghf) this.e.b(), ((grk) this.f).b(), (ScheduledExecutorService) this.c.b(), ((grr) this.a).b(), (gzp) ((jrx) this.b).a, ((Boolean) this.g.b()).booleanValue());
        }
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, byte[] bArr) {
        this.h = i;
        this.b = jsbVar;
        this.a = jsbVar2;
        this.f = jsbVar3;
        this.e = jsbVar4;
        this.g = jsbVar5;
        this.c = jsbVar6;
        this.d = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, char[] cArr) {
        this.h = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.d = jsbVar3;
        this.g = jsbVar4;
        this.f = jsbVar5;
        this.c = jsbVar6;
        this.e = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, float[] fArr) {
        this.h = i;
        this.g = jsbVar;
        this.c = jsbVar2;
        this.b = jsbVar3;
        this.a = jsbVar4;
        this.d = jsbVar5;
        this.e = jsbVar6;
        this.f = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, int[] iArr) {
        this.h = i;
        this.g = jsbVar;
        this.b = jsbVar2;
        this.e = jsbVar3;
        this.c = jsbVar4;
        this.a = jsbVar5;
        this.f = jsbVar6;
        this.d = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, short[] sArr) {
        this.h = i;
        this.a = jsbVar;
        this.c = jsbVar2;
        this.d = jsbVar3;
        this.g = jsbVar4;
        this.b = jsbVar5;
        this.f = jsbVar6;
        this.e = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, boolean[] zArr) {
        this.h = i;
        this.b = jsbVar;
        this.g = jsbVar2;
        this.d = jsbVar3;
        this.f = jsbVar4;
        this.c = jsbVar5;
        this.e = jsbVar6;
        this.a = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, byte[][] bArr) {
        this.h = i;
        this.d = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.a = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.g = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, char[][] cArr) {
        this.h = i;
        this.g = jsbVar;
        this.b = jsbVar2;
        this.d = jsbVar3;
        this.c = jsbVar4;
        this.a = jsbVar5;
        this.e = jsbVar6;
        this.f = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, int[][] iArr) {
        this.h = i;
        this.d = jsbVar;
        this.e = jsbVar2;
        this.f = jsbVar3;
        this.b = jsbVar4;
        this.g = jsbVar5;
        this.a = jsbVar6;
        this.c = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, short[][] sArr) {
        this.h = i;
        this.c = jsbVar;
        this.g = jsbVar2;
        this.f = jsbVar3;
        this.b = jsbVar4;
        this.e = jsbVar5;
        this.a = jsbVar6;
        this.d = jsbVar7;
    }

    public ejr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, int i, boolean[][] zArr) {
        this.h = i;
        this.d = jsbVar;
        this.e = jsbVar2;
        this.f = jsbVar3;
        this.c = jsbVar4;
        this.a = jsbVar5;
        this.b = jsbVar6;
        this.g = jsbVar7;
    }
}
