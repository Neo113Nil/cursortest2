package t;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f3786a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3787b;

    public static long a(f fVar, long j2) {
        o oVar = fVar.d;
        if (oVar instanceof j) {
            return j2;
        }
        ArrayList arrayList = fVar.f3781k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0300d interfaceC0300d = (InterfaceC0300d) arrayList.get(i);
            if (interfaceC0300d instanceof f) {
                f fVar2 = (f) interfaceC0300d;
                if (fVar2.d != oVar) {
                    j3 = Math.min(j3, a(fVar2, fVar2.f3778f + j2));
                }
            }
        }
        if (fVar != oVar.i) {
            return j3;
        }
        long j4 = oVar.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(oVar.h, j5)), j5 - r9.f3778f);
    }

    public static long b(f fVar, long j2) {
        o oVar = fVar.d;
        if (oVar instanceof j) {
            return j2;
        }
        ArrayList arrayList = fVar.f3781k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0300d interfaceC0300d = (InterfaceC0300d) arrayList.get(i);
            if (interfaceC0300d instanceof f) {
                f fVar2 = (f) interfaceC0300d;
                if (fVar2.d != oVar) {
                    j3 = Math.max(j3, b(fVar2, fVar2.f3778f + j2));
                }
            }
        }
        if (fVar != oVar.h) {
            return j3;
        }
        long j4 = oVar.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(oVar.i, j5)), j5 - r9.f3778f);
    }
}
