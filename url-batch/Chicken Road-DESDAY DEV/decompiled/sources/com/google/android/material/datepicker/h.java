package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f0.AbstractC0091F;

/* loaded from: classes.dex */
public final class h extends AbstractC0091F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1717a;

    public h(k kVar) {
        this.f1717a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // f0.AbstractC0091F
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1717a.getClass();
            throw null;
        }
    }
}
