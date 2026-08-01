package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class u00 {
    public ka0 a;
    public ArrayList b;

    public static long a(hf hfVar, long j) {
        ka0 ka0Var = hfVar.d;
        ArrayList arrayList = hfVar.k;
        if (ka0Var instanceof zm) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ff ffVar = (ff) arrayList.get(i);
            if (ffVar instanceof hf) {
                hf hfVar2 = (hf) ffVar;
                if (hfVar2.d != ka0Var) {
                    j2 = Math.min(j2, a(hfVar2, hfVar2.f + j));
                }
            }
        }
        hf hfVar3 = ka0Var.i;
        hf hfVar4 = ka0Var.h;
        if (hfVar != hfVar3) {
            return j2;
        }
        long j3 = j - ka0Var.j();
        return Math.min(Math.min(j2, a(hfVar4, j3)), j3 - hfVar4.f);
    }

    public static long b(hf hfVar, long j) {
        ka0 ka0Var = hfVar.d;
        ArrayList arrayList = hfVar.k;
        if (ka0Var instanceof zm) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ff ffVar = (ff) arrayList.get(i);
            if (ffVar instanceof hf) {
                hf hfVar2 = (hf) ffVar;
                if (hfVar2.d != ka0Var) {
                    j2 = Math.max(j2, b(hfVar2, hfVar2.f + j));
                }
            }
        }
        hf hfVar3 = ka0Var.h;
        hf hfVar4 = ka0Var.i;
        if (hfVar != hfVar3) {
            return j2;
        }
        long j3 = ka0Var.j() + j;
        return Math.max(Math.max(j2, b(hfVar4, j3)), j3 - hfVar4.f);
    }
}
