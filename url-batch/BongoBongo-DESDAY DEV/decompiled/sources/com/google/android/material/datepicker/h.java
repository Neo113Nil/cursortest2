package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.G;

/* loaded from: classes.dex */
public final class h extends G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1879a;

    public h(k kVar) {
        this.f1879a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // h0.G
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1879a.getClass();
            throw null;
        }
    }
}
