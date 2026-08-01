package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.AbstractC0138D;

/* loaded from: classes.dex */
public final class h extends AbstractC0138D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2372a;

    public h(k kVar) {
        this.f2372a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // h0.AbstractC0138D
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f2372a.getClass();
            throw null;
        }
    }
}
