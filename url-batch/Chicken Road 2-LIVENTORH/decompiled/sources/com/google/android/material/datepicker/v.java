package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.oriondriftchasers.arordrft.R;
import f1.b1;
import f1.d0;
import f1.n0;
import java.util.Calendar;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class v extends d0 {
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final a0.a f969e;

    /* renamed from: f, reason: collision with root package name */
    public final int f970f;

    public v(ContextThemeWrapper contextThemeWrapper, b bVar, a0.a aVar) {
        r rVar = bVar.f903f;
        r rVar2 = bVar.f904g;
        r rVar3 = bVar.i;
        if (rVar.f955f.compareTo(rVar3.f955f) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (rVar3.f955f.compareTo(rVar2.f955f) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f970f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * s.d) + (p.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = bVar;
        this.f969e = aVar;
        if (this.f1333a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f1334b = true;
    }

    @Override // f1.d0
    public final int a() {
        return this.d.f908l;
    }

    @Override // f1.d0
    public final long b(int i) {
        Calendar a2 = z.a(this.d.f903f.f955f);
        a2.add(2, i);
        a2.set(5, 1);
        Calendar a4 = z.a(a2);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        return a4.getTimeInMillis();
    }

    @Override // f1.d0
    public final void c(b1 b1Var, int i) {
        u uVar = (u) b1Var;
        b bVar = this.d;
        Calendar a2 = z.a(bVar.f903f.f955f);
        a2.add(2, i);
        r rVar = new r(a2);
        uVar.f967u.setText(rVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) uVar.f968v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !rVar.equals(materialCalendarGridView.a().f962a)) {
            new s(rVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // f1.d0
    public final b1 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!p.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new u(linearLayout, false);
        }
        linearLayout.setLayoutParams(new n0(-1, this.f970f));
        return new u(linearLayout, true);
    }
}
