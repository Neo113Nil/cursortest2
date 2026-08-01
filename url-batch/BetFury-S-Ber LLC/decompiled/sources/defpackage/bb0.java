package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class bb0 {
    public vn0 a;
    public ArrayList b;

    public static long a(mj mjVar, long j) {
        vn0 vn0Var = mjVar.d;
        ArrayList arrayList = mjVar.k;
        if (vn0Var instanceof ct) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            jj jjVar = (jj) arrayList.get(i);
            if (jjVar instanceof mj) {
                mj mjVar2 = (mj) jjVar;
                if (mjVar2.d != vn0Var) {
                    j2 = Math.min(j2, a(mjVar2, mjVar2.f + j));
                }
            }
        }
        mj mjVar3 = vn0Var.i;
        mj mjVar4 = vn0Var.h;
        if (mjVar != mjVar3) {
            return j2;
        }
        long j3 = j - vn0Var.j();
        return Math.min(Math.min(j2, a(mjVar4, j3)), j3 - mjVar4.f);
    }

    public static long b(mj mjVar, long j) {
        vn0 vn0Var = mjVar.d;
        ArrayList arrayList = mjVar.k;
        if (vn0Var instanceof ct) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            jj jjVar = (jj) arrayList.get(i);
            if (jjVar instanceof mj) {
                mj mjVar2 = (mj) jjVar;
                if (mjVar2.d != vn0Var) {
                    j2 = Math.max(j2, b(mjVar2, mjVar2.f + j));
                }
            }
        }
        mj mjVar3 = vn0Var.h;
        mj mjVar4 = vn0Var.i;
        if (mjVar != mjVar3) {
            return j2;
        }
        long j3 = vn0Var.j() + j;
        return Math.max(Math.max(j2, b(mjVar4, j3)), j3 - mjVar4.f);
    }
}
