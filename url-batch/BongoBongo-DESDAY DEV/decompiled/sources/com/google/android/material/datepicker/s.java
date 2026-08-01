package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.winfour.winrandom.R;
import h0.AbstractC0114B;
import h0.K;
import h0.a0;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0114B {
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final D.g f1936e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1937f;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, D.g gVar) {
        o oVar = bVar.f1862a;
        o oVar2 = bVar.d;
        if (oVar.f1922a.compareTo(oVar2.f1922a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f1922a.compareTo(bVar.f1863b.f1922a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1937f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = bVar;
        this.f1936e = gVar;
        if (this.f2383a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2384b = true;
    }

    @Override // h0.AbstractC0114B
    public final int a() {
        return this.d.f1867g;
    }

    @Override // h0.AbstractC0114B
    public final long b(int i) {
        Calendar a2 = w.a(this.d.f1862a.f1922a);
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

    @Override // h0.AbstractC0114B
    public final void c(a0 a0Var, int i) {
        r rVar = (r) a0Var;
        b bVar = this.d;
        Calendar a2 = w.a(bVar.f1862a.f1922a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f1934u.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f1935v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f1929a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // h0.AbstractC0114B
    public final a0 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new K(-1, this.f1937f));
        return new r(linearLayout, true);
    }
}
