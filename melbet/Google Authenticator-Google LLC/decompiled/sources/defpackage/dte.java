package defpackage;

import android.app.Service;
import android.content.Context;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dte implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final /* synthetic */ int e;

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i) {
        this.e = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = 4;
        switch (this.e) {
            case 0:
                ((jrk) this.a).b();
                return new dtd((ExecutorService) this.b.b(), ((eid) this.c).b(), ((dwm) this.d).b());
            case 1:
                return new boy(((jrk) this.d).b(), ((fuk) this.a).b(), ((gmu) this.b).b(), (hvl) this.c.b());
            case 2:
                return new dvk(((eie) this.d).b(), ((dwu) this.c).b(), ((dwq) this.b).b(), ((dwr) this.a).b());
            case 3:
                jsb jsbVar = this.c;
                jsb jsbVar2 = this.d;
                jsb jsbVar3 = this.a;
                jsb jsbVar4 = this.b;
                jpt a = jrv.a(jsbVar);
                jpt a2 = jrv.a(jsbVar2);
                jpt a3 = jrv.a(jsbVar3);
                jpt a4 = jrv.a(jsbVar4);
                a.getClass();
                a2.getClass();
                a3.getClass();
                a4.getClass();
                return new duh(a, a2, a3, a4);
            case 4:
                Executor executor = (!((eiv) this.c.b()).d || ((gzp) ((jrx) this.b).a).f()) ? (Executor) this.d.b() : (Executor) this.a.b();
                executor.getClass();
                return executor;
            case 5:
                ((jrk) this.a).b();
                return new ejp(this.c, this.d, this.b);
            case 6:
                return new ekv((bry) this.b.b(), (elf) this.d.b(), this.c, this.a);
            case 7:
                return new erx((Random) ((gzp) ((jrx) this.d).a).d((Random) this.b.b()), (erh) this.a.b(), (hsl) this.c.b());
            case 8:
                return new fvm(((jrk) this.b).b(), ((jsd) this.d).b(), (hvl) this.c.b(), (gaj) this.a.b());
            case 9:
                jsb jsbVar5 = this.b;
                bd bdVar = (bd) ((jrx) this.a).a;
                cka ckaVar = (cka) jsbVar5.b();
                iwq iwqVar = (iwq) this.d.b();
                Executor executor2 = (Executor) this.c.b();
                return new gfh(new gfk(new gfe(bdVar, ckaVar, executor2), ckaVar, iwqVar, executor2, bdVar));
            case 10:
                Map map = (Map) ((jrx) this.c).a;
                Map map2 = (Map) ((jrx) this.b).a;
                jsb jsbVar6 = this.a;
                Map b = ((jrz) this.d).b();
                Map map3 = (Map) jsbVar6.b();
                map.getClass();
                map2.getClass();
                b.getClass();
                map3.getClass();
                hen henVar = new hen(4);
                for (Map.Entry entry : map.entrySet()) {
                    henVar.g(hnu.by(b, (ght) entry.getKey()), new fxs((koe) entry.getValue(), 3));
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    henVar.g(hnu.by(b, (ght) entry2.getKey()), new fxs((koe) entry2.getValue(), i));
                }
                her d = henVar.d(true);
                if (map3.keySet().containsAll(d.keySet())) {
                    return d;
                }
                throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map3.keySet() + ", params provided: " + d.keySet());
            case 11:
                Map map4 = (Map) ((jrx) this.c).a;
                jsb jsbVar7 = this.a;
                Map b2 = ((jrz) this.b).b();
                Map map5 = (Map) jsbVar7.b();
                Map map6 = (Map) this.d.b();
                map4.getClass();
                b2.getClass();
                map5.getClass();
                map6.getClass();
                hen henVar2 = new hen(4);
                for (Map.Entry entry3 : map4.entrySet()) {
                    henVar2.g(hnu.bz(b2, (ghu) entry3.getKey()), ((koe) entry3.getValue()).b());
                }
                her d2 = henVar2.d(true);
                if (!map5.keySet().containsAll(d2.keySet())) {
                    throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map5.keySet() + ", params provided: " + d2.keySet());
                }
                hfm keySet = d2.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : keySet) {
                    if (map6.keySet().contains((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return d2;
                }
                arrayList.toString();
                throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList.toString()));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new iwq((ikj) this.d.b(), (koe) this.c, (koe) this.a, (koe) this.b);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new cka(((gmu) this.a).b(), (fwm) this.b.b(), ((fvp) this.d).b(), ((bnu) this.c).a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                jsb jsbVar8 = this.a;
                Context b3 = ((jrk) this.d).b();
                hvl hvlVar = (hvl) jsbVar8.b();
                jsb jsbVar9 = this.b;
                fwm b4 = ((ewo) this.c).b();
                return new gqh(b3, hvlVar, b4);
            case 15:
                return new icp(((igh) this.a).b(), (ifv) this.c.b(), ((ien) this.d).b(), hel.o((Set) ((jrx) this.b).a));
            case 16:
                jsb jsbVar10 = this.b;
                jsb jsbVar11 = this.d;
                Optional b5 = ((bnv) this.a).b();
                Context b6 = ((jrk) jsbVar11).b();
                dih dihVar = (dih) jsbVar10.b();
                iel b7 = ((ien) this.c).b();
                dihVar.getClass();
                return new idq(b6, dihVar, b7, new idr(b5, b6, b7));
            default:
                return new ifz((Service) ((jrx) this.c).a, (ScheduledExecutorService) this.b.b(), (jyf) this.a.b(), ((bnu) this.d).a());
        }
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, byte[] bArr) {
        this.e = i;
        this.d = jsbVar;
        this.a = jsbVar2;
        this.b = jsbVar3;
        this.c = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, char[] cArr) {
        this.e = i;
        this.d = jsbVar;
        this.c = jsbVar2;
        this.b = jsbVar3;
        this.a = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, float[] fArr) {
        this.e = i;
        this.b = jsbVar;
        this.d = jsbVar2;
        this.c = jsbVar3;
        this.a = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, int[] iArr) {
        this.e = i;
        this.a = jsbVar;
        this.d = jsbVar2;
        this.c = jsbVar3;
        this.b = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, short[] sArr) {
        this.e = i;
        this.c = jsbVar;
        this.d = jsbVar2;
        this.a = jsbVar3;
        this.b = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = jsbVar;
        this.c = jsbVar2;
        this.d = jsbVar3;
        this.b = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, byte[][] bArr) {
        this.e = i;
        this.d = jsbVar;
        this.b = jsbVar2;
        this.a = jsbVar3;
        this.c = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, float[][] fArr) {
        this.e = i;
        this.d = jsbVar;
        this.c = jsbVar2;
        this.a = jsbVar3;
        this.b = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, int[][] iArr) {
        this.e = i;
        this.c = jsbVar;
        this.b = jsbVar2;
        this.d = jsbVar3;
        this.a = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, short[][] sArr) {
        this.e = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.d = jsbVar3;
        this.c = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.c = jsbVar;
        this.b = jsbVar2;
        this.a = jsbVar3;
        this.d = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, char[][][] cArr) {
        this.e = i;
        this.d = jsbVar;
        this.a = jsbVar2;
        this.c = jsbVar3;
        this.b = jsbVar4;
    }

    public dte(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, int i, int[][][] iArr) {
        this.e = i;
        this.a = jsbVar;
        this.d = jsbVar2;
        this.b = jsbVar3;
        this.c = jsbVar4;
    }
}
