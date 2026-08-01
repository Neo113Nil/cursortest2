package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f0.E;

/* loaded from: classes.dex */
public final class h extends E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1861a;

    public h(k kVar) {
        this.f1861a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // f0.E
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1861a.getClass();
            throw null;
        }
    }
}
