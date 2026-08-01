package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2426b;

    public q(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f2426b = sVar;
        this.f2425a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f2425a;
        p a2 = materialCalendarGridView.a();
        if (i < a2.a() || i > a2.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((k) this.f2426b.f2430d.f145b).f2379V.f2357c.f2363a) {
            throw null;
        }
    }
}
