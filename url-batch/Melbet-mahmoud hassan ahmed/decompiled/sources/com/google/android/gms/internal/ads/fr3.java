package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class fr3 {
    fr3() {
    }

    public static final int a(int i7, Object obj, Object obj2) {
        er3 er3Var = (er3) obj;
        if (er3Var.isEmpty()) {
            return 0;
        }
        Iterator it = er3Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean b(Object obj) {
        return !((er3) obj).g();
    }

    public static final Object c(Object obj, Object obj2) {
        er3 er3Var = (er3) obj;
        er3 er3Var2 = (er3) obj2;
        if (!er3Var2.isEmpty()) {
            if (!er3Var.g()) {
                er3Var = er3Var.d();
            }
            er3Var.f(er3Var2);
        }
        return er3Var;
    }
}
