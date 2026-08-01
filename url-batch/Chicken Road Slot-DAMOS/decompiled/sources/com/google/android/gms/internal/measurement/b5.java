package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface b5 {
    static f5 m(b5 b5Var, i5 i5Var, e7 e7Var, ArrayList arrayList) {
        String str = i5Var.f2395d;
        if (!b5Var.h(str)) {
            if ("hasOwnProperty".equals(str)) {
                ia.c("hasOwnProperty", arrayList, 1);
                return b5Var.h(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).f()) ? f5.j : f5.f2284k;
            }
            te.a1.e(v4.a.k("Object has no function ", str));
            return null;
        }
        f5 c10 = b5Var.c(str);
        if (c10 instanceof e4) {
            return ((e4) c10).a(e7Var, arrayList);
        }
        throw new IllegalArgumentException(str + " is not a function");
    }

    f5 c(String str);

    boolean h(String str);

    void k(String str, f5 f5Var);
}
