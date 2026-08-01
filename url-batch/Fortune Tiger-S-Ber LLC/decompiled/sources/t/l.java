package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f3345a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3346b;

    public static long a(f fVar, long j4) {
        o oVar = fVar.f3335d;
        ArrayList arrayList = fVar.f3340k;
        if (oVar instanceof j) {
            return j4;
        }
        int size = arrayList.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f3335d != oVar) {
                    j5 = Math.min(j5, a(fVar2, fVar2.f3337f + j4));
                }
            }
        }
        f fVar3 = oVar.f3359i;
        f fVar4 = oVar.h;
        if (fVar != fVar3) {
            return j5;
        }
        long j6 = j4 - oVar.j();
        return Math.min(Math.min(j5, a(fVar4, j6)), j6 - fVar4.f3337f);
    }

    public static long b(f fVar, long j4) {
        o oVar = fVar.f3335d;
        ArrayList arrayList = fVar.f3340k;
        if (oVar instanceof j) {
            return j4;
        }
        int size = arrayList.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f3335d != oVar) {
                    j5 = Math.max(j5, b(fVar2, fVar2.f3337f + j4));
                }
            }
        }
        f fVar3 = oVar.h;
        f fVar4 = oVar.f3359i;
        if (fVar != fVar3) {
            return j5;
        }
        long j6 = oVar.j() + j4;
        return Math.max(Math.max(j5, b(fVar4, j6)), j6 - fVar4.f3337f);
    }
}
