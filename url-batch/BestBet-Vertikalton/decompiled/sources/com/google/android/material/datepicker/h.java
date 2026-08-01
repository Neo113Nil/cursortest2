package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g0.AbstractC0135E;

/* loaded from: classes.dex */
public final class h extends AbstractC0135E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2259a;

    public h(k kVar) {
        this.f2259a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // g0.AbstractC0135E
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f2259a.getClass();
            throw null;
        }
    }
}
