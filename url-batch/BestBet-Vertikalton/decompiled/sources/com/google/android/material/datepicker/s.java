package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.fortunequest.neontrack.R;
import g0.AbstractC0161z;
import g0.I;
import g0.Y;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0161z {
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final A0.c f2317e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2318f;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, A0.c cVar) {
        o oVar = bVar.f2243a;
        o oVar2 = bVar.d;
        if (oVar.f2303a.compareTo(oVar2.f2303a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f2303a.compareTo(bVar.f2244b.f2303a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f2318f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = bVar;
        this.f2317e = cVar;
        if (this.f2955a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2956b = true;
    }

    @Override // g0.AbstractC0161z
    public final int a() {
        return this.d.f2248g;
    }

    @Override // g0.AbstractC0161z
    public final long b(int i) {
        Calendar a2 = w.a(this.d.f2243a.f2303a);
        a2.add(2, i);
        a2.set(5, 1);
        Calendar a3 = w.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        return a3.getTimeInMillis();
    }

    @Override // g0.AbstractC0161z
    public final void c(Y y2, int i) {
        r rVar = (r) y2;
        b bVar = this.d;
        Calendar a2 = w.a(bVar.f2243a.f2303a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f2315u.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f2316v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f2310a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // g0.AbstractC0161z
    public final Y d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new I(-1, this.f2318f));
        return new r(linearLayout, true);
    }
}
