package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.p20;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
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
        p20 b = materialCalendarGridView.b();
        if (i < b.c() || i > b.f()) {
            return;
        }
        if (materialCalendarGridView.b().getItem(i).longValue() >= this.g.e.a.a0.h.f) {
            throw null;
        }
    }
}
