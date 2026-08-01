package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.zu;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
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
        zu b = materialCalendarGridView.b();
        if (i < b.c() || i > b.f()) {
            return;
        }
        if (materialCalendarGridView.b().getItem(i).longValue() >= this.g.e.a.h.h.f) {
            throw null;
        }
    }
}
