package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clutchquizarena.app.R;
import f0.AbstractC0119z;
import f0.I;
import f0.W;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0119z {

    /* renamed from: c, reason: collision with root package name */
    public final b f1919c;
    public final A0.h d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1920e;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, A0.h hVar) {
        o oVar = bVar.f1845a;
        o oVar2 = bVar.d;
        if (oVar.f1905a.compareTo(oVar2.f1905a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f1905a.compareTo(bVar.f1846b.f1905a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1920e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1919c = bVar;
        this.d = hVar;
        if (this.f2368a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2369b = true;
    }

    @Override // f0.AbstractC0119z
    public final int a() {
        return this.f1919c.f1850g;
    }

    @Override // f0.AbstractC0119z
    public final long b(int i) {
        Calendar a2 = w.a(this.f1919c.f1845a.f1905a);
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

    @Override // f0.AbstractC0119z
    public final void c(W w2, int i) {
        r rVar = (r) w2;
        b bVar = this.f1919c;
        Calendar a2 = w.a(bVar.f1845a.f1905a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f1917t.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f1918u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f1912a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // f0.AbstractC0119z
    public final W d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new I(-1, this.f1920e));
        return new r(linearLayout, true);
    }
}
