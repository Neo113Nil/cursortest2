package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g0.I;

/* loaded from: classes.dex */
public final class h extends I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1779a;

    public h(k kVar) {
        this.f1779a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // g0.I
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1779a.getClass();
            throw null;
        }
    }
}
