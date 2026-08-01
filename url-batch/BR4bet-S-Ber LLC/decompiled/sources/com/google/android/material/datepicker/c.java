package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.lx;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView f;
    public final /* synthetic */ e g;

    public c(e eVar, MaterialCalendarGridView materialCalendarGridView) {
        this.g = eVar;
        this.f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f;
        lx b = materialCalendarGridView.b();
        if (i < b.c() || i > b.f()) {
            return;
        }
        if (materialCalendarGridView.b().getItem(i).longValue() >= this.g.e.a.a0.h.f) {
            throw null;
        }
    }
}
