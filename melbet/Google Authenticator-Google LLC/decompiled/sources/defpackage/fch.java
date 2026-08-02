package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fch implements htr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fch(dok dokVar, dog dogVar, int i, int i2) {
        this.d = i2;
        this.c = dokVar;
        this.b = dogVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        int i = this.d;
        if (i == 0) {
            jll jllVar = (jll) obj;
            ?? r4 = this.c;
            int i2 = this.a;
            fci fciVar = (fci) this.b;
            return hnu.aV(r4).b(gvx.b(new fcg(fciVar, jllVar, i2, (List) r4, 0)), fciVar.b);
        }
        int i3 = 19;
        if (i != 1) {
            int i4 = this.a;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                if (((Boolean) hnu.aR((Future) this.c.get(i5))).booleanValue()) {
                    fwv fwvVar = (fwv) ((fci) this.b).a.get(i5);
                    avc avcVar = new avc(fwvVar, 15);
                    iyi iyiVar = fwvVar.d;
                    Object obj2 = iyiVar.a;
                    euy euyVar = new euy(fwvVar.a, 20);
                    huf hufVar = huf.a;
                    arrayList.add(hnu.aY(hoq.ar(avcVar, iyiVar.b), ((fcu) obj2).a(euyVar, hufVar)).a(new bws(i3), hufVar));
                }
            }
            return hnu.aX(arrayList).a(new bws(i3), huf.a);
        }
        dop dopVar = (dop) obj;
        boolean h = dok.h(dopVar);
        int i6 = this.a;
        Object obj3 = this.c;
        if (!h || !dok.g(dopVar)) {
            return ((dok) obj3).j(i6);
        }
        dok dokVar = (dok) obj3;
        fwm fwmVar = dokVar.e;
        doo dooVar = dopVar.c;
        if (dooVar == null) {
            dooVar = doo.a;
        }
        Object obj4 = this.b;
        gwu g = gwu.g(fwmVar.L(dooVar, i6));
        cvr cvrVar = new cvr(18);
        huf hufVar2 = huf.a;
        return g.h(cvrVar, hufVar2).d(Exception.class, new cvr(19), hufVar2).i(new ego(dokVar, dopVar, (dog) obj4, i6, 1), hufVar2);
    }

    public /* synthetic */ fch(fci fciVar, int i, List list, int i2) {
        this.d = i2;
        this.b = fciVar;
        this.a = i;
        this.c = list;
    }

    public /* synthetic */ fch(fci fciVar, List list, int i, int i2) {
        this.d = i2;
        this.b = fciVar;
        this.c = list;
        this.a = i;
    }
}
