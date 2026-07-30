package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class u51 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;

    public /* synthetic */ u51(long j, int i) {
        this.m = i;
        this.n = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [a61] */
    /* JADX WARN: Type inference failed for: r20v1, types: [a61] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uc2 M;
        int i = this.m;
        long j = this.n;
        switch (i) {
            case 0:
                nc2 nc2Var = (nc2) obj;
                nc2Var.getClass();
                M = nc2Var.M("SELECT atlasSlug FROM item_stone WHERE itemId = ?");
                try {
                    M.d(j, 1);
                    ArrayList arrayList = new ArrayList();
                    while (M.E()) {
                        arrayList.add(M.j(0));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                nc2 nc2Var2 = (nc2) obj;
                nc2Var2.getClass();
                M = nc2Var2.M("SELECT atlasSlug FROM item_stone WHERE itemId = ?");
                try {
                    M.d(j, 1);
                    ArrayList arrayList2 = new ArrayList();
                    while (M.E()) {
                        arrayList2.add(M.j(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                nc2 nc2Var3 = (nc2) obj;
                nc2Var3.getClass();
                M = nc2Var3.M("DELETE FROM item_stone WHERE itemId = ?");
                try {
                    M.d(j, 1);
                    M.E();
                    M.close();
                    return Unit.a;
                } finally {
                }
            case 3:
                nc2 nc2Var4 = (nc2) obj;
                nc2Var4.getClass();
                M = nc2Var4.M("DELETE FROM jewelry_item WHERE id = ?");
                try {
                    M.d(j, 1);
                    M.E();
                    M.close();
                    return Unit.a;
                } finally {
                }
            case 4:
                nc2 nc2Var5 = (nc2) obj;
                nc2Var5.getClass();
                M = nc2Var5.M("SELECT * FROM jewelry_item WHERE id = ? LIMIT 1");
                try {
                    M.d(j, 1);
                    int t = bd3.t(M, "id");
                    int t2 = bd3.t(M, "name");
                    int t3 = bd3.t(M, "type");
                    int t4 = bd3.t(M, "metal");
                    int t5 = bd3.t(M, "fineness");
                    int t6 = bd3.t(M, "weightGrams");
                    int t7 = bd3.t(M, "purchaseDateEpochDay");
                    int t8 = bd3.t(M, "place");
                    int t9 = bd3.t(M, "valueEntered");
                    int t10 = bd3.t(M, "notes");
                    int t11 = bd3.t(M, "photoUri");
                    int t12 = bd3.t(M, "favourite");
                    int t13 = bd3.t(M, "createdAt");
                    if (M.E()) {
                        r16 = new a61(M.getLong(t), M.j(t2), M.j(t3), M.j(t4), M.isNull(t5) ? null : M.j(t5), M.isNull(t6) ? null : Double.valueOf(M.getDouble(t6)), M.isNull(t7) ? null : Long.valueOf(M.getLong(t7)), M.isNull(t8) ? null : M.j(t8), M.isNull(t9) ? null : Double.valueOf(M.getDouble(t9)), M.isNull(t10) ? null : M.j(t10), M.isNull(t11) ? null : M.j(t11), ((int) M.getLong(t12)) != 0, M.getLong(t13));
                    }
                    return r16;
                } finally {
                }
            default:
                nc2 nc2Var6 = (nc2) obj;
                nc2Var6.getClass();
                M = nc2Var6.M("SELECT * FROM jewelry_item WHERE id = ? LIMIT 1");
                try {
                    M.d(j, 1);
                    int t14 = bd3.t(M, "id");
                    int t15 = bd3.t(M, "name");
                    int t16 = bd3.t(M, "type");
                    int t17 = bd3.t(M, "metal");
                    int t18 = bd3.t(M, "fineness");
                    int t19 = bd3.t(M, "weightGrams");
                    int t20 = bd3.t(M, "purchaseDateEpochDay");
                    int t21 = bd3.t(M, "place");
                    int t22 = bd3.t(M, "valueEntered");
                    int t23 = bd3.t(M, "notes");
                    int t24 = bd3.t(M, "photoUri");
                    int t25 = bd3.t(M, "favourite");
                    int t26 = bd3.t(M, "createdAt");
                    if (M.E()) {
                        r16 = new a61(M.getLong(t14), M.j(t15), M.j(t16), M.j(t17), M.isNull(t18) ? null : M.j(t18), M.isNull(t19) ? null : Double.valueOf(M.getDouble(t19)), M.isNull(t20) ? null : Long.valueOf(M.getLong(t20)), M.isNull(t21) ? null : M.j(t21), M.isNull(t22) ? null : Double.valueOf(M.getDouble(t22)), M.isNull(t23) ? null : M.j(t23), M.isNull(t24) ? null : M.j(t24), ((int) M.getLong(t25)) != 0, M.getLong(t26));
                    }
                    return r16;
                } finally {
                }
        }
    }
}
