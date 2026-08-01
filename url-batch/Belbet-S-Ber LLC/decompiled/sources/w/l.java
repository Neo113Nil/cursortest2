package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f3762a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3763b;

    public static long a(f fVar, long j2) {
        o oVar = fVar.d;
        ArrayList arrayList = fVar.f3757k;
        if (oVar instanceof j) {
            return j2;
        }
        int size = arrayList.size();
        long j4 = j2;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j4 = Math.min(j4, a(fVar2, fVar2.f3754f + j2));
                }
            }
        }
        f fVar3 = oVar.i;
        f fVar4 = oVar.h;
        if (fVar != fVar3) {
            return j4;
        }
        long j5 = j2 - oVar.j();
        return Math.min(Math.min(j4, a(fVar4, j5)), j5 - fVar4.f3754f);
    }

    public static long b(f fVar, long j2) {
        o oVar = fVar.d;
        ArrayList arrayList = fVar.f3757k;
        if (oVar instanceof j) {
            return j2;
        }
        int size = arrayList.size();
        long j4 = j2;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j4 = Math.max(j4, b(fVar2, fVar2.f3754f + j2));
                }
            }
        }
        f fVar3 = oVar.h;
        f fVar4 = oVar.i;
        if (fVar != fVar3) {
            return j4;
        }
        long j5 = oVar.j() + j2;
        return Math.max(Math.max(j4, b(fVar4, j5)), j5 - fVar4.f3754f);
    }
}
