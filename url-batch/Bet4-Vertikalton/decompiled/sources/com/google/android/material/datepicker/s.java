package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.playbag.tripgear.R;
import g0.AbstractC0112D;
import g0.M;
import g0.c0;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0112D {
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final C.g f1836e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1837f;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, C.g gVar) {
        o oVar = bVar.f1763a;
        o oVar2 = bVar.d;
        if (oVar.f1822a.compareTo(oVar2.f1822a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f1822a.compareTo(bVar.f1764b.f1822a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1837f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = bVar;
        this.f1836e = gVar;
        if (this.f2262a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2263b = true;
    }

    @Override // g0.AbstractC0112D
    public final int a() {
        return this.d.f1768g;
    }

    @Override // g0.AbstractC0112D
    public final long b(int i) {
        Calendar a2 = w.a(this.d.f1763a.f1822a);
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

    @Override // g0.AbstractC0112D
    public final void c(c0 c0Var, int i) {
        r rVar = (r) c0Var;
        b bVar = this.d;
        Calendar a2 = w.a(bVar.f1763a.f1822a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f1834u.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f1835v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f1829a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // g0.AbstractC0112D
    public final c0 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new M(-1, this.f1837f));
        return new r(linearLayout, true);
    }
}
