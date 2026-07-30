package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ck implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    public /* synthetic */ ck(String str, int i) {
        this.m = i;
        this.n = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uc2 M;
        kk kkVar;
        int i = this.m;
        String str = this.n;
        switch (i) {
            case 0:
                nc2 nc2Var = (nc2) obj;
                nc2Var.getClass();
                M = nc2Var.M("SELECT * FROM atlas_progress WHERE slug = ? LIMIT 1");
                boolean z = true;
                try {
                    M.w(1, str);
                    int t = bd3.t(M, "slug");
                    int t2 = bd3.t(M, "studied");
                    int t3 = bd3.t(M, "favourite");
                    int t4 = bd3.t(M, "owned");
                    if (M.E()) {
                        String j = M.j(t);
                        boolean z2 = ((int) M.getLong(t2)) != 0;
                        boolean z3 = ((int) M.getLong(t3)) != 0;
                        if (((int) M.getLong(t4)) == 0) {
                            z = false;
                        }
                        kkVar = new kk(j, z2, z3, z);
                    } else {
                        kkVar = null;
                    }
                    return kkVar;
                } finally {
                }
            case 1:
                nc2 nc2Var2 = (nc2) obj;
                nc2Var2.getClass();
                M = nc2Var2.M("SELECT * FROM jewelry_item WHERE name LIKE '%' || ? || '%' ORDER BY createdAt DESC");
                try {
                    M.w(1, str);
                    int t5 = bd3.t(M, "id");
                    int t6 = bd3.t(M, "name");
                    int t7 = bd3.t(M, "type");
                    int t8 = bd3.t(M, "metal");
                    int t9 = bd3.t(M, "fineness");
                    int t10 = bd3.t(M, "weightGrams");
                    int t11 = bd3.t(M, "purchaseDateEpochDay");
                    int t12 = bd3.t(M, "place");
                    int t13 = bd3.t(M, "valueEntered");
                    int t14 = bd3.t(M, "notes");
                    int t15 = bd3.t(M, "photoUri");
                    int t16 = bd3.t(M, "favourite");
                    int t17 = bd3.t(M, "createdAt");
                    ArrayList arrayList = new ArrayList();
                    while (M.E()) {
                        int i2 = t6;
                        arrayList.add(new a61(M.getLong(t5), M.j(t6), M.j(t7), M.j(t8), M.isNull(t9) ? null : M.j(t9), M.isNull(t10) ? null : Double.valueOf(M.getDouble(t10)), M.isNull(t11) ? null : Long.valueOf(M.getLong(t11)), M.isNull(t12) ? null : M.j(t12), M.isNull(t13) ? null : Double.valueOf(M.getDouble(t13)), M.isNull(t14) ? null : M.j(t14), M.isNull(t15) ? null : M.j(t15), ((int) M.getLong(t16)) != 0, M.getLong(t17)));
                        t6 = i2;
                    }
                    return arrayList;
                } finally {
                }
            default:
                String str2 = (String) obj;
                str2.getClass();
                return up2.y(str2) ? str2.length() < str.length() ? str : str2 : str.concat(str2);
        }
    }
}
