package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.winpower.neonfit.R;
import h0.AbstractC0174y;
import h0.C0142H;
import h0.V;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0174y {

    /* renamed from: c, reason: collision with root package name */
    public final b f2429c;

    /* renamed from: d, reason: collision with root package name */
    public final C1.d f2430d;
    public final int e;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, C1.d dVar) {
        o oVar = bVar.f2355a;
        o oVar2 = bVar.f2358d;
        if (oVar.f2415a.compareTo(oVar2.f2415a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f2415a.compareTo(bVar.f2356b.f2415a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.f2421d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f2429c = bVar;
        this.f2430d = dVar;
        if (this.f3136a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3137b = true;
    }

    @Override // h0.AbstractC0174y
    public final int a() {
        return this.f2429c.f2360g;
    }

    @Override // h0.AbstractC0174y
    public final long b(int i) {
        Calendar a2 = w.a(this.f2429c.f2355a.f2415a);
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

    @Override // h0.AbstractC0174y
    public final void c(V v2, int i) {
        r rVar = (r) v2;
        b bVar = this.f2429c;
        Calendar a2 = w.a(bVar.f2355a.f2415a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f2427t.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f2428u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f2422a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // h0.AbstractC0174y
    public final V d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0142H(-1, this.e));
        return new r(linearLayout, true);
    }
}
