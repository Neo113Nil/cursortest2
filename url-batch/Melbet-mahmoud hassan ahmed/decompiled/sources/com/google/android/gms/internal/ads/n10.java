package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n10 {
    static List<String> a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, p20.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, z20.f14900a);
        c(arrayList, z20.f14901b);
        c(arrayList, z20.f14902c);
        c(arrayList, z20.f14903d);
        c(arrayList, z20.f14904e);
        c(arrayList, z20.f14910k);
        c(arrayList, z20.f14905f);
        c(arrayList, z20.f14906g);
        c(arrayList, z20.f14907h);
        c(arrayList, z20.f14908i);
        c(arrayList, z20.f14909j);
        return arrayList;
    }

    static List<String> b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, l30.f7803a);
        return arrayList;
    }

    private static void c(List<String> list, p20<String> p20Var) {
        String e7 = p20Var.e();
        if (TextUtils.isEmpty(e7)) {
            return;
        }
        list.add(e7);
    }
}
