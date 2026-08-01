package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f0.AbstractC0089F;

/* loaded from: classes.dex */
public final class h extends AbstractC0089F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1687a;

    public h(k kVar) {
        this.f1687a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // f0.AbstractC0089F
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1687a.getClass();
            throw null;
        }
    }
}
