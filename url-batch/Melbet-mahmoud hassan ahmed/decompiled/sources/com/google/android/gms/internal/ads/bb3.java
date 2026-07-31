package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class bb3<V, C> extends pa3<V, C> {

    /* renamed from: u, reason: collision with root package name */
    private List<za3<V>> f3316u;

    bb3(z63<? extends cc3<? extends V>> z63Var, boolean z6) {
        super(z63Var, true, true);
        List<za3<V>> emptyList = z63Var.isEmpty() ? Collections.emptyList() : x73.a(z63Var.size());
        for (int i7 = 0; i7 < z63Var.size(); i7++) {
            emptyList.add(null);
        }
        this.f3316u = emptyList;
    }

    @Override // com.google.android.gms.internal.ads.pa3
    final void M(int i7) {
        super.M(i7);
        this.f3316u = null;
    }

    @Override // com.google.android.gms.internal.ads.pa3
    final void S(int i7, V v6) {
        List<za3<V>> list = this.f3316u;
        if (list != null) {
            list.set(i7, new za3<>(v6));
        }
    }

    @Override // com.google.android.gms.internal.ads.pa3
    final void T() {
        List<za3<V>> list = this.f3316u;
        if (list != null) {
            w(X(list));
        }
    }

    abstract C X(List<za3<V>> list);
}
