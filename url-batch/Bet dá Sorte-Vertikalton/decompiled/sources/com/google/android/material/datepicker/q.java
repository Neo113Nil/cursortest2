package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1837b;

    public q(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1837b = sVar;
        this.f1836a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f1836a;
        p a2 = materialCalendarGridView.a();
        if (i < a2.a() || i > a2.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((k) this.f1837b.d.f150b).f1790V.f1769c.f1775a) {
            throw null;
        }
    }
}
