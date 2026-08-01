package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g0.G;

/* loaded from: classes.dex */
public final class h extends G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1810a;

    public h(k kVar) {
        this.f1810a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // g0.G
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1810a.getClass();
            throw null;
        }
    }
}
