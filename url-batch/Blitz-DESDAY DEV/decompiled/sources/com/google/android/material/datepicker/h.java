package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.F;

/* loaded from: classes.dex */
public final class h extends F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1864a;

    public h(k kVar) {
        this.f1864a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // h0.F
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1864a.getClass();
            throw null;
        }
    }
}
