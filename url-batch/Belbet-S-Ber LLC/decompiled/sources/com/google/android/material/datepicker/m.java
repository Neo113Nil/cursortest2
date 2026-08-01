package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g1.x0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f1080a;

    public m(q qVar) {
        this.f1080a = qVar;
        i0.e(null);
        i0.e(null);
    }

    @Override // g1.x0
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof l0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1080a.f1086a0.getClass();
            Iterator it = new ArrayList().iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }
}
