package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.fortuneink.neonpad.R;
import e0.AbstractC0107A;
import e0.J;
import e0.X;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0107A {

    /* renamed from: c, reason: collision with root package name */
    public final b f1930c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.d f1931d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1932e;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, B0.d dVar) {
        o oVar = bVar.f1855a;
        o oVar2 = bVar.f1858d;
        if (oVar.f1914a.compareTo(oVar2.f1914a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f1914a.compareTo(bVar.f1856b.f1914a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1932e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.f1921d) + (m.F(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1930c = bVar;
        this.f1931d = dVar;
        if (this.f2096a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2097b = true;
    }

    @Override // e0.AbstractC0107A
    public final int a() {
        return this.f1930c.f1861g;
    }

    @Override // e0.AbstractC0107A
    public final long b(int i) {
        Calendar a2 = w.a(this.f1930c.f1855a.f1914a);
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

    @Override // e0.AbstractC0107A
    public final void c(X x2, int i) {
        r rVar = (r) x2;
        b bVar = this.f1930c;
        Calendar a2 = w.a(bVar.f1855a.f1914a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f1928t.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f1929u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f1923a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // e0.AbstractC0107A
    public final X d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.F(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new J(-1, this.f1932e));
        return new r(linearLayout, true);
    }
}
