package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f966g;

    public t(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f966g = vVar;
        this.f965f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        MaterialCalendarGridView materialCalendarGridView = this.f965f;
        s a2 = materialCalendarGridView.a();
        if (i < a2.a() || i > a2.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((m) this.f966g.f969e.f81g).f923a0.f905h.f911f) {
            throw null;
        }
    }
}
