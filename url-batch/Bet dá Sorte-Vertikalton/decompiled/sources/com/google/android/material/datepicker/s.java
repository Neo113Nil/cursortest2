package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.glasspulse.glasspulse.R;
import f0.AbstractC0086A;
import f0.J;
import f0.X;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0086A {

    /* renamed from: c, reason: collision with root package name */
    public final b f1840c;
    public final C.h d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1841e;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, C.h hVar) {
        o oVar = bVar.f1767a;
        o oVar2 = bVar.d;
        if (oVar.f1826a.compareTo(oVar2.f1826a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f1826a.compareTo(bVar.f1768b.f1826a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1841e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1840c = bVar;
        this.d = hVar;
        if (this.f2055a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2056b = true;
    }

    @Override // f0.AbstractC0086A
    public final int a() {
        return this.f1840c.f1772g;
    }

    @Override // f0.AbstractC0086A
    public final long b(int i) {
        Calendar a2 = w.a(this.f1840c.f1767a.f1826a);
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

    @Override // f0.AbstractC0086A
    public final void c(X x2, int i) {
        r rVar = (r) x2;
        b bVar = this.f1840c;
        Calendar a2 = w.a(bVar.f1767a.f1826a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f1838t.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f1839u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f1833a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // f0.AbstractC0086A
    public final X d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new J(-1, this.f1841e));
        return new r(linearLayout, true);
    }
}
