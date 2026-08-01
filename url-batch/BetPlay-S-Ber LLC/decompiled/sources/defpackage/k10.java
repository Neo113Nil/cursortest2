package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class k10 {
    public ra0 a;
    public ArrayList b;

    public static long a(gf gfVar, long j) {
        ra0 ra0Var = gfVar.d;
        ArrayList arrayList = gfVar.k;
        if (ra0Var instanceof on) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ef efVar = (ef) arrayList.get(i);
            if (efVar instanceof gf) {
                gf gfVar2 = (gf) efVar;
                if (gfVar2.d != ra0Var) {
                    j2 = Math.min(j2, a(gfVar2, gfVar2.f + j));
                }
            }
        }
        gf gfVar3 = ra0Var.i;
        gf gfVar4 = ra0Var.h;
        if (gfVar != gfVar3) {
            return j2;
        }
        long j3 = j - ra0Var.j();
        return Math.min(Math.min(j2, a(gfVar4, j3)), j3 - gfVar4.f);
    }

    public static long b(gf gfVar, long j) {
        ra0 ra0Var = gfVar.d;
        ArrayList arrayList = gfVar.k;
        if (ra0Var instanceof on) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ef efVar = (ef) arrayList.get(i);
            if (efVar instanceof gf) {
                gf gfVar2 = (gf) efVar;
                if (gfVar2.d != ra0Var) {
                    j2 = Math.max(j2, b(gfVar2, gfVar2.f + j));
                }
            }
        }
        gf gfVar3 = ra0Var.h;
        gf gfVar4 = ra0Var.i;
        if (gfVar != gfVar3) {
            return j2;
        }
        long j3 = ra0Var.j() + j;
        return Math.max(Math.max(j2, b(gfVar4, j3)), j3 - gfVar4.f);
    }
}
