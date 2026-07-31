package z2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f9151a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f9152b;

    public static long a(f fVar, long j7) {
        o oVar = fVar.f9140d;
        ArrayList arrayList = fVar.f9146k;
        if (oVar instanceof j) {
            return j7;
        }
        int size = arrayList.size();
        long j8 = j7;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f9140d != oVar) {
                    j8 = Math.min(j8, a(fVar2, fVar2.f9142f + j7));
                }
            }
        }
        f fVar3 = oVar.i;
        f fVar4 = oVar.f9168h;
        if (fVar != fVar3) {
            return j8;
        }
        long j9 = j7 - oVar.j();
        return Math.min(Math.min(j8, a(fVar4, j9)), j9 - fVar4.f9142f);
    }

    public static long b(f fVar, long j7) {
        o oVar = fVar.f9140d;
        ArrayList arrayList = fVar.f9146k;
        if (oVar instanceof j) {
            return j7;
        }
        int size = arrayList.size();
        long j8 = j7;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f9140d != oVar) {
                    j8 = Math.max(j8, b(fVar2, fVar2.f9142f + j7));
                }
            }
        }
        f fVar3 = oVar.f9168h;
        f fVar4 = oVar.i;
        if (fVar != fVar3) {
            return j8;
        }
        long j9 = oVar.j() + j7;
        return Math.max(Math.max(j8, b(fVar4, j9)), j9 - fVar4.f9142f);
    }
}
