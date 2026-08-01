package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.winfour.neondrop.R;
import h0.AbstractC0113A;
import h0.J;
import h0.X;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0113A {

    /* renamed from: c, reason: collision with root package name */
    public final b f1922c;
    public final E.g d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1923e;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, E.g gVar) {
        o oVar = bVar.f1847a;
        o oVar2 = bVar.d;
        if (oVar.f1908a.compareTo(oVar2.f1908a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f1908a.compareTo(bVar.f1848b.f1908a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1923e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1922c = bVar;
        this.d = gVar;
        if (this.f2367a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2368b = true;
    }

    @Override // h0.AbstractC0113A
    public final int a() {
        return this.f1922c.f1852g;
    }

    @Override // h0.AbstractC0113A
    public final long b(int i) {
        Calendar a2 = w.a(this.f1922c.f1847a.f1908a);
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

    @Override // h0.AbstractC0113A
    public final void c(X x2, int i) {
        r rVar = (r) x2;
        b bVar = this.f1922c;
        Calendar a2 = w.a(bVar.f1847a.f1908a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f1920t.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f1921u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f1915a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // h0.AbstractC0113A
    public final X d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new J(-1, this.f1923e));
        return new r(linearLayout, true);
    }
}
