package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f3540a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3541b;

    public static long a(f fVar, long j4) {
        o oVar = fVar.d;
        ArrayList arrayList = fVar.f3535k;
        if (oVar instanceof j) {
            return j4;
        }
        int size = arrayList.size();
        long j5 = j4;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j5 = Math.min(j5, a(fVar2, fVar2.f3531f + j4));
                }
            }
        }
        f fVar3 = oVar.i;
        f fVar4 = oVar.f3555h;
        if (fVar != fVar3) {
            return j5;
        }
        long j6 = j4 - oVar.j();
        return Math.min(Math.min(j5, a(fVar4, j6)), j6 - fVar4.f3531f);
    }

    public static long b(f fVar, long j4) {
        o oVar = fVar.d;
        ArrayList arrayList = fVar.f3535k;
        if (oVar instanceof j) {
            return j4;
        }
        int size = arrayList.size();
        long j5 = j4;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j5 = Math.max(j5, b(fVar2, fVar2.f3531f + j4));
                }
            }
        }
        f fVar3 = oVar.f3555h;
        f fVar4 = oVar.i;
        if (fVar != fVar3) {
            return j5;
        }
        long j6 = oVar.j() + j4;
        return Math.max(Math.max(j5, b(fVar4, j6)), j6 - fVar4.f3531f);
    }
}
