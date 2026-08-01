package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e0.AbstractC0113F;

/* loaded from: classes.dex */
public final class h extends AbstractC0113F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1850a;

    public h(k kVar) {
        this.f1850a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // e0.AbstractC0113F
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1850a.getClass();
            throw null;
        }
    }
}
