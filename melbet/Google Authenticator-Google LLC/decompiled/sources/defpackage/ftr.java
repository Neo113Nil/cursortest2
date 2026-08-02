package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ftr implements aec {
    public Object b;
    public final iyi d;
    private final jpu e;
    private final fuc f;
    private final gkj g;
    private final koi h;
    private final boolean i;
    public static final fhq c = new fhq();
    public static final hkh a = hkh.l("com/google/apps/tiktok/account/api/controller/ActivityAccountState");

    public ftr(jpu jpuVar, iyi iyiVar, fuc fucVar, gzp gzpVar, gkj gkjVar) {
        agf agfVar;
        agf agfVar2;
        jpuVar.getClass();
        iyiVar.getClass();
        fucVar.getClass();
        gzpVar.getClass();
        gkjVar.getClass();
        this.e = jpuVar;
        this.d = iyiVar;
        this.f = fucVar;
        this.g = gkjVar;
        int d = jpuVar.d() - 1;
        int i = 19;
        int i2 = 18;
        if (d != 0) {
            int i3 = 20;
            if (d != 1) {
                bd b = jpuVar.b();
                koi a2 = koc.a(3, new fts(new dfh(b, 20), 1));
                int i4 = ksx.a;
                agfVar2 = new agf(new ksj(ftz.class), new fts(a2, 0), new dtz(b, a2, 2), new fts(a2, 2));
                this.h = agfVar2;
                this.i = ((Boolean) gzpVar.d(false)).booleanValue();
                jpuVar.L().a(this);
            }
            glu e = jpuVar.e();
            int i5 = ksx.a;
            agfVar = new agf(new ksj(ftz.class), new aux(e, i2), new aux(e, i), new aux(e, i3));
        } else {
            Activity a3 = jpuVar.a();
            dfh dfhVar = new dfh(a3, 17);
            int i6 = ksx.a;
            agfVar = new agf(new ksj(ftz.class), new dfh(a3, 18), dfhVar, new dfh(a3, 19));
        }
        agfVar2 = agfVar;
        this.h = agfVar2;
        this.i = ((Boolean) gzpVar.d(false)).booleanValue();
        jpuVar.L().a(this);
    }

    @Override // defpackage.aec
    public final void a(aer aerVar) {
        boolean z = false;
        if (h().c && !this.i && h().b) {
            z = true;
        }
        h().b = this.i;
        if (z) {
            h().a = ftx.a;
            c.k(fhq.j(this.e));
            return;
        }
        fty ftyVar = h().a;
        if (ksp.b(ftyVar, ftv.a)) {
            this.d.o();
            return;
        }
        if (ftyVar instanceof ftw) {
            iyi iyiVar = this.d;
            ftw ftwVar = (ftw) ftyVar;
            frv.a(ftwVar.a);
            ful fulVar = ftwVar.b;
            iyiVar.m();
            return;
        }
        if (ksp.b(ftyVar, ftu.a)) {
            this.d.n();
        } else if (!ksp.b(ftyVar, ftx.a)) {
            throw new koj();
        }
    }

    public final int g() {
        fao.c();
        fty ftyVar = h().a;
        ftw ftwVar = ftyVar instanceof ftw ? (ftw) ftyVar : null;
        if (ftwVar != null) {
            return ftwVar.a;
        }
        return -1;
    }

    public final ftz h() {
        return (ftz) this.h.a();
    }

    public final void i() {
        n(ftx.a);
    }

    public final void j() {
        fhq.j(this.e).Z();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void k(fsv fsvVar) {
        n(ftu.a);
        iyi iyiVar = this.d;
        iyiVar.n();
        gty aC = hoq.aC(86, "onNoAccountAvailable");
        try {
            Iterator it = iyiVar.c.iterator();
            while (it.hasNext()) {
                ((ftm) it.next()).c(fsvVar);
            }
            Iterator it2 = ((ArrayList) iyiVar.a).iterator();
            while (it2.hasNext()) {
                ((ftm) it2.next()).c(fsvVar);
            }
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void l() {
        if (n(ftv.a)) {
            iyi iyiVar = this.d;
            iyiVar.o();
            gty aC = hoq.aC(87, "onAccountLoading");
            try {
                Iterator it = iyiVar.c.iterator();
                while (it.hasNext()) {
                    ((ftm) it.next()).b();
                }
                Iterator it2 = ((ArrayList) iyiVar.a).iterator();
                while (it2.hasNext()) {
                    ((ftm) it2.next()).b();
                }
                aC.close();
            } catch (Throwable th) {
                try {
                    aC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final boolean m() {
        fao.c();
        return h().a instanceof ftw;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public final boolean n(fty ftyVar) {
        jqg c2;
        jqg a2;
        fao.c();
        this.f.g();
        if (ksp.b(h().a, ftyVar)) {
            return false;
        }
        j();
        boolean z = ftyVar instanceof ftw;
        if (z || !(h().a instanceof ftx)) {
            c.k(fhq.j(this.e));
        }
        fty ftyVar2 = h().a;
        h().a = ftyVar;
        if ((ftyVar2 instanceof ftw) || z) {
            gkj gkjVar = this.g;
            frv a3 = frv.a(g());
            synchronized (gkjVar.b) {
                Set b = gkjVar.b();
                if (!b.isEmpty()) {
                    frv frvVar = (frv) hnu.X(b);
                    jpu jpuVar = gkjVar.a;
                    if (jpuVar.d() == 1 || jpuVar.d() == 2) {
                        iwq j = ((gki) imq.a(gkjVar.d, gki.class)).j();
                        synchronized (j.d) {
                            ?? r3 = j.a;
                            hoq.H(r3.containsKey(frvVar));
                            gla glaVar = (gla) r3.remove(frvVar);
                            gku a4 = glaVar.b.a(glaVar.a);
                            synchronized (a4.e) {
                                afr afrVar = a4.a;
                                Object obj = afrVar.b;
                                Set keySet = ((ldt) obj).a.keySet();
                                ?? r10 = ((ldt) obj).c;
                                Set l = ixd.l(keySet, r10.keySet());
                                ?? r7 = afrVar.a;
                                for (String str : ixd.l(l, r7.keySet())) {
                                    str.getClass();
                                    ((ldt) obj).t(str);
                                    if (((afq) r7.remove(str)) != null) {
                                        throw null;
                                    }
                                    str.getClass();
                                    r10.remove(str);
                                }
                                c2 = a4.f != null ? ((gkt) imq.a(a4.f, gkt.class)).c() : null;
                                a4.f = null;
                            }
                            if (c2 != null) {
                                c2.a();
                            }
                        }
                    }
                    synchronized (gkjVar.b) {
                        Map map = gkjVar.c;
                        hoq.H(map.containsKey(frvVar));
                        gkl a5 = ((gkg) map.remove(frvVar)).a.a();
                        synchronized (a5.d) {
                            jxh jxhVar = a5.f;
                            iwf.a();
                            jxhVar.f();
                            glt gltVar = a5.e;
                            a2 = gltVar != null ? ((gkm) imq.a(gltVar, gkm.class)).a() : null;
                            a5.e = null;
                            a5.a = null;
                        }
                        if (a2 != null) {
                            a2.a();
                        }
                    }
                }
                gkjVar.c.put(a3, gkjVar.a(a3));
            }
        }
        return true;
    }

    @Override // defpackage.aec
    public final /* synthetic */ void b(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void e(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void f(aer aerVar) {
    }
}
