package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1334f;
    public final /* synthetic */ w g;

    public u(w wVar, MaterialCalendarGridView materialCalendarGridView) {
        this.g = wVar;
        this.f1334f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        MaterialCalendarGridView materialCalendarGridView = this.f1334f;
        s b2 = materialCalendarGridView.b();
        if (i4 < b2.c() || i4 > b2.f()) {
            return;
        }
        if (materialCalendarGridView.b().getItem(i4).longValue() >= this.g.f1338e.f1288a.a0.h.f1282f) {
            throw null;
        }
    }
}
