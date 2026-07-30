package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface oj1 {
    default int a(h41 h41Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new i80((jj1) list.get(i3), i41.n, j41.n, i2));
        }
        return f(new s41(h41Var, h41Var.getLayoutDirection()), arrayList, v10.b(i, 0, 13)).c();
    }

    default int b(h41 h41Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new i80((jj1) list.get(i3), i41.n, j41.m, i2));
        }
        return f(new s41(h41Var, h41Var.getLayoutDirection()), arrayList, v10.b(0, i, 7)).e();
    }

    pj1 f(qj1 qj1Var, List list, long j);

    default int g(h41 h41Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new i80((jj1) list.get(i3), i41.m, j41.n, i2));
        }
        return f(new s41(h41Var, h41Var.getLayoutDirection()), arrayList, v10.b(i, 0, 13)).c();
    }

    default int i(h41 h41Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new i80((jj1) list.get(i3), i41.m, j41.m, i2));
        }
        return f(new s41(h41Var, h41Var.getLayoutDirection()), arrayList, v10.b(0, i, 7)).e();
    }
}
