package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e0.AbstractC0112F;

/* loaded from: classes.dex */
public final class h extends AbstractC0112F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1872a;

    public h(k kVar) {
        this.f1872a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // e0.AbstractC0112F
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1872a.getClass();
            throw null;
        }
    }
}
