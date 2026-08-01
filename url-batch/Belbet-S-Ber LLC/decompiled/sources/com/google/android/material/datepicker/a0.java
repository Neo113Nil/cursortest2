package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a0 implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f1032g;

    public a0(c0 c0Var, MaterialCalendarGridView materialCalendarGridView) {
        this.f1032g = c0Var;
        this.f1031f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f1031f;
        y b2 = materialCalendarGridView.b();
        if (i < b2.c() || i > b2.f()) {
            return;
        }
        l lVar = this.f1032g.f1046f;
        Long item = materialCalendarGridView.b().getItem(i);
        long longValue = item.longValue();
        q qVar = lVar.f1079a;
        if (longValue >= qVar.f1087b0.h.f1068f) {
            qVar.f1086a0.f1067f = item;
            Iterator it = qVar.Y.iterator();
            while (it.hasNext()) {
                ((u) it.next()).b(qVar.f1086a0.f1067f);
            }
            qVar.f1091g0.getAdapter().f1764a.b();
            RecyclerView recyclerView = qVar.f1090f0;
            if (recyclerView != null) {
                recyclerView.getAdapter().f1764a.b();
            }
        }
    }
}
