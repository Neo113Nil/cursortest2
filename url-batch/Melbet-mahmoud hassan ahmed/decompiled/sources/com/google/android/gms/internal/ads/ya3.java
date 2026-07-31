package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class ya3<V> extends bb3<V, List<V>> {
    ya3(z63<? extends cc3<? extends V>> z63Var, boolean z6) {
        super(z63Var, true);
        U();
    }

    @Override // com.google.android.gms.internal.ads.bb3
    public final /* bridge */ /* synthetic */ Object X(List list) {
        ArrayList a7 = x73.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            za3 za3Var = (za3) it.next();
            a7.add(za3Var != null ? za3Var.f15057a : null);
        }
        return Collections.unmodifiableList(a7);
    }
}
