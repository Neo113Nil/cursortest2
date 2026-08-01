package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class z30 {
    public rd0 a;
    public ArrayList b;

    public static long a(fh fhVar, long j) {
        rd0 rd0Var = fhVar.d;
        ArrayList arrayList = fhVar.k;
        if (rd0Var instanceof lp) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            dh dhVar = (dh) arrayList.get(i);
            if (dhVar instanceof fh) {
                fh fhVar2 = (fh) dhVar;
                if (fhVar2.d != rd0Var) {
                    j2 = Math.min(j2, a(fhVar2, fhVar2.f + j));
                }
            }
        }
        fh fhVar3 = rd0Var.i;
        fh fhVar4 = rd0Var.h;
        if (fhVar != fhVar3) {
            return j2;
        }
        long j3 = j - rd0Var.j();
        return Math.min(Math.min(j2, a(fhVar4, j3)), j3 - fhVar4.f);
    }

    public static long b(fh fhVar, long j) {
        rd0 rd0Var = fhVar.d;
        ArrayList arrayList = fhVar.k;
        if (rd0Var instanceof lp) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            dh dhVar = (dh) arrayList.get(i);
            if (dhVar instanceof fh) {
                fh fhVar2 = (fh) dhVar;
                if (fhVar2.d != rd0Var) {
                    j2 = Math.max(j2, b(fhVar2, fhVar2.f + j));
                }
            }
        }
        fh fhVar3 = rd0Var.h;
        fh fhVar4 = rd0Var.i;
        if (fhVar != fhVar3) {
            return j2;
        }
        long j3 = rd0Var.j() + j;
        return Math.max(Math.max(j2, b(fhVar4, j3)), j3 - fhVar4.f);
    }
}
