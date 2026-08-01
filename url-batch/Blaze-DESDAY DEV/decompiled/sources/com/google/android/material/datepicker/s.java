package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.winworm.neongrid.R;
import g0.AbstractC0112B;
import g0.K;
import g0.a0;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0112B {
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final C.g f1868e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1869f;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, C.g gVar) {
        o oVar = bVar.f1794a;
        o oVar2 = bVar.d;
        if (oVar.f1854a.compareTo(oVar2.f1854a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f1854a.compareTo(bVar.f1795b.f1854a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1869f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = bVar;
        this.f1868e = gVar;
        if (this.f2297a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2298b = true;
    }

    @Override // g0.AbstractC0112B
    public final int a() {
        return this.d.f1799g;
    }

    @Override // g0.AbstractC0112B
    public final long b(int i) {
        Calendar a2 = w.a(this.d.f1794a.f1854a);
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

    @Override // g0.AbstractC0112B
    public final void c(a0 a0Var, int i) {
        r rVar = (r) a0Var;
        b bVar = this.d;
        Calendar a2 = w.a(bVar.f1794a.f1854a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f1866u.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f1867v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f1861a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // g0.AbstractC0112B
    public final a0 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new K(-1, this.f1869f));
        return new r(linearLayout, true);
    }
}
