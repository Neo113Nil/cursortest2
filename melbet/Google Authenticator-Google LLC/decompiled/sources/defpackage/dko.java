package defpackage;

import android.content.Context;
import android.os.Handler;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dko implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final /* synthetic */ int f;

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i) {
        this.f = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.f) {
            case 0:
                jsb jsbVar = this.b;
                dkh b = ((dkn) this.a).b();
                hvl hvlVar = (hvl) jsbVar.b();
                jsb jsbVar2 = this.e;
                Set b2 = ((jsd) this.d).b();
                return new dkj(hvlVar, this.c, b2, b);
            case 1:
                ThreadFactory threadFactory = (ThreadFactory) this.c.b();
                hvm hvmVar = (hvm) this.e.b();
                Object obj = ((jrx) this.a).a;
                dhm b3 = ((dhu) this.d).b();
                gzp gzpVar = (gzp) obj;
                ((dhs) this.b).b();
                ThreadFactory d = dja.d("Blocking", new dgs(new dgs(threadFactory, 0), 1));
                gzp gzpVar2 = b3.a;
                return new dgh(hnu.aB(dgn.a(gzpVar, new dft(TimeUnit.SECONDS, new SynchronousQueue(), (ThreadFactory) (!gzpVar2.f() ? gyf.a : gzp.h(new dhk((dhn) gzpVar2.b(), d))).d(d)))), hvmVar);
            case 2:
                jsb jsbVar3 = this.b;
                return new dvf(((jrk) this.c).b(), ((dwr) this.a).b(), ((dwu) this.d).b(), ((dwq) this.e).b(), ((eie) jsbVar3).b());
            case 3:
                jsb jsbVar4 = this.c;
                return new dvw(((dwr) this.a).b(), ((dwu) this.d).b(), ((dwq) this.e).b(), ((eib) this.b).b(), ((dwm) jsbVar4).b());
            case 4:
                jsb jsbVar5 = this.a;
                jsb jsbVar6 = this.e;
                egt b4 = ((egu) this.b).b();
                Context b5 = ((jrk) jsbVar6).b();
                ExecutorService executorService = (ExecutorService) jsbVar5.b();
                jsb jsbVar7 = this.c;
                Optional b6 = ((edc) this.d).b();
                Optional b7 = ((bnv) jsbVar7).b();
                executorService.getClass();
                egd egdVar = new egd();
                egdVar.b(b5);
                egdVar.b = executorService;
                egdVar.c = (ScheduledExecutorService) b6.orElse(null);
                egdVar.d = (Handler) b7.orElse(null);
                egdVar.f = b4;
                return egdVar.a();
            case 5:
                jsb jsbVar8 = this.b;
                jsb jsbVar9 = this.c;
                jsb jsbVar10 = this.d;
                fwm b8 = ((dzw) this.e).b();
                dzu b9 = ((dzx) jsbVar10).b();
                cbp b10 = ((dzl) jsbVar9).b();
                ((dzm) jsbVar8).b();
                return new dzo(b8, b9, b10, (ExecutorService) this.a.b());
            case 6:
                Executor executor = (Executor) this.e.b();
                jsb jsbVar11 = this.a;
                jsb jsbVar12 = this.c;
                Set b11 = ((jsd) this.b).b();
                eqm b12 = ((eji) jsbVar12).b();
                return new ejl(executor, b11, b12, this.d);
            case 7:
                jsb jsbVar13 = this.c;
                jsb jsbVar14 = this.b;
                String b13 = ((emq) this.d).b();
                fwm b14 = ((elz) jsbVar14).b();
                dih dihVar = (dih) jsbVar13.b();
                ((jrk) this.a).b();
                return new epa(b13, b14, dihVar, this.e);
            case 8:
                jsb jsbVar15 = this.b;
                jsb jsbVar16 = this.e;
                ldt b15 = ((emj) this.d).b();
                jpt a = jrv.a(jsbVar16);
                ((bnu) jsbVar15).a();
                return new eok(b15, a, (Executor) this.c.b(), (bry) this.a.b());
            case 9:
                return new eqm(((emj) this.b).b(), (hvm) this.c.b(), (Executor) this.e.b(), jrv.a(this.a), this.d);
            case 10:
                jsb jsbVar17 = this.e;
                Context b16 = ((jrk) this.a).b();
                jpt a2 = jrv.a(jsbVar17);
                AtomicReference atomicReference = etd.a;
                hwm hwmVar = new hwm(null);
                hwmVar.f = b16;
                a2.getClass();
                hwmVar.c = new eks(a2, 18);
                jsb jsbVar18 = this.c;
                jsbVar18.getClass();
                hwmVar.b = new dxi(hwmVar, new eks(jsbVar18, 19), 12);
                jsb jsbVar19 = this.b;
                jsbVar19.getClass();
                hwmVar.a = new eks(jsbVar19, 19);
                jsb jsbVar20 = this.d;
                jsbVar20.getClass();
                hwmVar.d = new eks(jsbVar20, 20);
                return hwmVar.f();
            case 11:
                return new ftr((jpu) ((jrx) this.b).a, (iyi) this.d.b(), (fuc) this.c.b(), (gzp) ((jrx) this.e).a, (gkj) this.a.b());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new fzz((Map) ((jrx) this.c).a, (gzp) ((jrx) this.d).a, ((fxm) this.a).a(), (hvl) this.e.b(), (gzp) ((jrx) this.b).a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new gcq(((jrt) this.d).a, (gva) this.b.b(), ((jrz) this.e).b(), (gzp) ((jrx) this.c).a, (gzp) ((jrx) this.a).a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Map map = (Map) ((jrx) this.d).a;
                Map map2 = (Map) ((jrx) this.e).a;
                jsb jsbVar21 = this.a;
                Map b17 = ((jrz) this.c).b();
                Map map3 = (Map) jsbVar21.b();
                Map map4 = (Map) this.b.b();
                map.getClass();
                map2.getClass();
                b17.getClass();
                map3.getClass();
                map4.getClass();
                hen henVar = new hen(4);
                for (Map.Entry entry : map.entrySet()) {
                    henVar.g(hnu.bz(b17, (ghu) entry.getKey()), new fxs((koe) entry.getValue(), 5));
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    henVar.g(hnu.bz(b17, (ghu) entry2.getKey()), new fxs((koe) entry2.getValue(), 6));
                }
                her d2 = henVar.d(true);
                if (!map3.keySet().containsAll(d2.keySet())) {
                    throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map3.keySet() + ", params provided: " + d2.keySet());
                }
                hfm keySet = d2.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : keySet) {
                    if (map4.keySet().contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return d2;
                }
                arrayList.toString();
                throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList.toString()));
            case 15:
                return new fym(this.b, this.a, (hvl) this.e.b(), (etd) this.d.b(), ((ghg) this.c).b());
            case 16:
                return new fym((hvl) this.a.b(), this.d, ((ghy) this.b).b(), (cfe) this.e.b(), (etd) this.c.b());
            case 17:
                Object obj3 = ((jrx) this.c).a;
                jsb jsbVar22 = this.e;
                jsb jsbVar23 = this.d;
                final ets b18 = ((ett) this.b).b();
                final gid b19 = ((gie) jsbVar23).b();
                final fwm b20 = ((ewo) jsbVar22).b();
                final Optional optional = (Optional) obj3;
                optional.getClass();
                final jsb jsbVar24 = this.a;
                jsbVar24.getClass();
                return new gjj() { // from class: gih
                    /* JADX WARN: Type inference failed for: r11v2, types: [hvl, java.lang.Object] */
                    @Override // defpackage.gjj
                    public final hvi a() {
                        gty aB;
                        if (!hnu.bu(fwm.this, optional)) {
                            return hve.a;
                        }
                        gid gidVar = b19;
                        int i = 0;
                        if (!((Boolean) ksy.c(((bnv) jsbVar24).b(), false)).booleanValue()) {
                            gij gijVar = new gij(b18);
                            guc gucVar = gub.a;
                            aB = hoq.aB(172, "Registering packages with phenotype", gucVar, true);
                            try {
                                Set keySet2 = gidVar.f.keySet();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj4 : keySet2) {
                                    Optional optional2 = gidVar.g;
                                    ggx ggxVar = new ggx(new ghz(2), 3);
                                    if (true == optional2.isPresent()) {
                                        optional2 = Optional.ofNullable(ggxVar.a.a(optional2.get()));
                                    }
                                    if (((Boolean) ksy.c(optional2, true)).booleanValue()) {
                                        arrayList2.add(obj4);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(ixc.w(arrayList2));
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    String d3 = gidVar.j.d((String) it.next());
                                    aB = hoq.aB(174, "Getting registration info from individual reader", gucVar, true);
                                    try {
                                        iwq iwqVar = gidVar.i;
                                        hvi submit = iwqVar.d.submit(gvx.i(new gnq(iwqVar, d3, 1)));
                                        submit.getClass();
                                        aB.b(submit);
                                        ixf.j(aB, null);
                                        hvi au = hoq.au(hoq.au(submit, new fvr(new ayb(gidVar, d3, gijVar, 3), 12), gidVar.b), new giu(new fvv(gidVar, d3, 3), 1), huf.a);
                                        gaj.d(175, au, "Failed to register for %s", d3);
                                        arrayList3.add(au);
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                }
                                hvi t = hoq.aU(arrayList3).t(new fxs(gidVar, 11), huf.a);
                                aB.b(t);
                                ixf.j(aB, null);
                                return t;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        guc gucVar2 = gub.a;
                        aB = hoq.aB(162, "Bulk Registering packages with phenotype", gucVar2, true);
                        try {
                            Set keySet3 = gidVar.f.keySet();
                            ArrayList<String> arrayList4 = new ArrayList();
                            for (Object obj5 : keySet3) {
                                Optional optional3 = gidVar.g;
                                ggx ggxVar2 = new ggx(new ghz(1), 2);
                                if (true == optional3.isPresent()) {
                                    optional3 = Optional.ofNullable(ggxVar2.a.a(optional3.get()));
                                }
                                if (((Boolean) ksy.c(optional3, true)).booleanValue()) {
                                    arrayList4.add(obj5);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(ixc.w(arrayList4));
                            for (String str : arrayList4) {
                                kee keeVar = gidVar.j;
                                String d4 = keeVar.d(str);
                                aB = hoq.aB(166, "Getting individual registration info", gucVar2, true);
                                try {
                                    String d5 = keeVar.d(str);
                                    aB = hoq.aB(171, "Getting cacheable registration info from individual reader", gucVar2, true);
                                    try {
                                        int i2 = i;
                                        hvi at = hoq.at(((gbc) gidVar.i.a).c(), new gia(new dwd(d5, 15), 4), huf.a);
                                        aB.b(at);
                                        ixf.j(aB, null);
                                        hvi au2 = hoq.au(at, new fvr(new fvv(gidVar, d5, 5), 10), gidVar.b);
                                        aB.b(au2);
                                        ixf.j(aB, null);
                                        Object[] objArr = new Object[1];
                                        objArr[i2] = d4;
                                        gaj.d(167, au2, "Failed to build registration info for %s", objArr);
                                        arrayList5.add(au2);
                                        i = i2;
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            int i3 = i;
                            hvi at2 = hoq.at(hnu.aO(arrayList5), new gia(new ghz(i3), i3), huf.a);
                            aB = hoq.aB(163, "Bulk registering packages with Phenotype", gucVar2, true);
                            try {
                                hvi au3 = hoq.au(at2, new fvr(new dwd(gidVar, 14), 14), gidVar.b);
                                aB.b(au3);
                                ixf.j(aB, null);
                                gaj.d(164, au3, "Failed to bulk register", new Object[0]);
                                brn aV = hoq.aV(au3);
                                gib gibVar = new gib(at2, gidVar, 0);
                                huf hufVar = huf.a;
                                hvi t2 = aV.t(gibVar, hufVar);
                                gaj.d(165, t2, "Failed to set runtime properties or update configs", new Object[0]);
                                hvi t3 = hoq.aV(t2).t(new fxs(gidVar, 10), hufVar);
                                aB.b(t3);
                                ixf.j(aB, null);
                                return t3;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                };
            case 18:
                return new gnx(((jrh) this.e).a(), (bd) ((jrx) this.c).a, (gbi) this.b.b(), ((bnu) this.a).a(), this.d);
            case 19:
                final gzp gzpVar3 = (gzp) ((jrx) this.e).a;
                final gzp gzpVar4 = (gzp) ((jrx) this.a).a;
                final gzp gzpVar5 = (gzp) ((jrx) this.c).a;
                final gzp gzpVar6 = (gzp) ((jrx) this.b).a;
                final Set set = (Set) ((jrx) this.d).a;
                return new eww() { // from class: gtr
                    @Override // defpackage.eww
                    public final void a() {
                        gzp gzpVar7 = gzp.this;
                        gur gurVar = gzpVar7.f() ? (gur) gzpVar7.b() : gur.a;
                        gzp gzpVar8 = gzpVar4;
                        gus.a = gurVar;
                        gsm gsmVar = gzpVar8.f() ? (gsm) gzpVar8.b() : gsm.c;
                        gzp gzpVar9 = gzpVar5;
                        gsn.a = gsmVar;
                        gue gueVar = gzpVar9.f() ? (gue) gzpVar9.b() : gue.a;
                        Set set2 = set;
                        guf.a = gueVar;
                        if (!set2.isEmpty()) {
                            gta.s(hfm.n(set2));
                        }
                        gzp gzpVar10 = gzpVar6;
                        if (!gzpVar10.f() || ((Boolean) gzpVar10.b()).booleanValue()) {
                            return;
                        }
                        gsv.a();
                    }
                };
            default:
                gva gvaVar = (gva) this.d.b();
                gzp gzpVar7 = (gzp) ((jrx) this.e).a;
                gzp gzpVar8 = (gzp) ((jrx) this.c).a;
                gzp gzpVar9 = (gzp) ((jrx) this.a).a;
                gzp gzpVar10 = (gzp) ((jrx) this.b).a;
                int i = hel.d;
                heg hegVar = new heg(4);
                if (gzpVar9.f()) {
                    hegVar.h((kbi) gzpVar9.b());
                }
                hegVar.h((kbi) gzpVar8.c(new goi(gvaVar, 2)));
                if (gzpVar7.f()) {
                    hegVar.h((kbi) gzpVar7.b());
                }
                if (gzpVar10.f()) {
                    hegVar.h((kbi) gzpVar10.b());
                }
                hel g = hegVar.g();
                g.getClass();
                return g;
        }
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, byte[] bArr) {
        this.f = i;
        this.c = jsbVar;
        this.e = jsbVar2;
        this.d = jsbVar3;
        this.a = jsbVar4;
        this.b = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.e = jsbVar;
        this.a = jsbVar2;
        this.c = jsbVar3;
        this.b = jsbVar4;
        this.d = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, char[] cArr) {
        this.f = i;
        this.c = jsbVar;
        this.a = jsbVar2;
        this.d = jsbVar3;
        this.e = jsbVar4;
        this.b = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, float[] fArr) {
        this.f = i;
        this.e = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.a = jsbVar4;
        this.d = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, int[] iArr) {
        this.f = i;
        this.b = jsbVar;
        this.e = jsbVar2;
        this.a = jsbVar3;
        this.d = jsbVar4;
        this.c = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, short[] sArr) {
        this.f = i;
        this.a = jsbVar;
        this.d = jsbVar2;
        this.e = jsbVar3;
        this.b = jsbVar4;
        this.c = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, boolean[] zArr) {
        this.f = i;
        this.e = jsbVar;
        this.d = jsbVar2;
        this.c = jsbVar3;
        this.b = jsbVar4;
        this.a = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, byte[][] bArr) {
        this.f = i;
        this.d = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.e = jsbVar4;
        this.a = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, char[][] cArr) {
        this.f = i;
        this.d = jsbVar;
        this.e = jsbVar2;
        this.b = jsbVar3;
        this.c = jsbVar4;
        this.a = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, float[][] fArr) {
        this.f = i;
        this.c = jsbVar;
        this.d = jsbVar2;
        this.a = jsbVar3;
        this.e = jsbVar4;
        this.b = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, int[][] iArr) {
        this.f = i;
        this.a = jsbVar;
        this.e = jsbVar2;
        this.c = jsbVar3;
        this.b = jsbVar4;
        this.d = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, short[][] sArr) {
        this.f = i;
        this.b = jsbVar;
        this.c = jsbVar2;
        this.e = jsbVar3;
        this.a = jsbVar4;
        this.d = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.b = jsbVar;
        this.d = jsbVar2;
        this.c = jsbVar3;
        this.e = jsbVar4;
        this.a = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.d = jsbVar;
        this.b = jsbVar2;
        this.e = jsbVar3;
        this.c = jsbVar4;
        this.a = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, char[][][] cArr) {
        this.f = i;
        this.d = jsbVar;
        this.e = jsbVar2;
        this.c = jsbVar3;
        this.a = jsbVar4;
        this.b = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, float[][][] fArr) {
        this.f = i;
        this.e = jsbVar;
        this.c = jsbVar2;
        this.b = jsbVar3;
        this.a = jsbVar4;
        this.d = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, int[][][] iArr) {
        this.f = i;
        this.a = jsbVar;
        this.d = jsbVar2;
        this.b = jsbVar3;
        this.e = jsbVar4;
        this.c = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, short[][][] sArr) {
        this.f = i;
        this.b = jsbVar;
        this.a = jsbVar2;
        this.e = jsbVar3;
        this.d = jsbVar4;
        this.c = jsbVar5;
    }

    public dko(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.b = jsbVar;
        this.d = jsbVar2;
        this.e = jsbVar3;
        this.c = jsbVar4;
        this.a = jsbVar5;
    }
}
