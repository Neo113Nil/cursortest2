package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.derinko.gbini.n1casino.R;
import defpackage.c9;
import defpackage.ju;
import defpackage.ku;
import defpackage.ls;
import defpackage.nz;
import defpackage.p70;
import defpackage.py;
import defpackage.t8;
import defpackage.xs;
import defpackage.yy;
import java.util.Calendar;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class e extends py {
    public final c9 d;
    public final ls e;
    public final ls f;
    public final int g;
    public ju h;
    public int i = 0;

    public e(ContextThemeWrapper contextThemeWrapper, c9 c9Var, ls lsVar, ls lsVar2) {
        ju juVar = c9Var.f;
        ju juVar2 = c9Var.g;
        ju juVar3 = c9Var.i;
        if (juVar.f.compareTo(juVar3.f) > 0) {
            t8.k("firstPage cannot be after currentPage");
            throw null;
        }
        if (juVar3.f.compareTo(juVar2.f) > 0) {
            t8.k("currentPage cannot be after lastPage");
            throw null;
        }
        this.g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * ku.i) + (xs.N(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = c9Var;
        this.e = lsVar;
        this.f = lsVar2;
        this.h = juVar3;
        if (this.a.a()) {
            t8.t("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.b = true;
    }

    @Override // defpackage.py
    public final int a() {
        return this.d.l;
    }

    @Override // defpackage.py
    public final long b(int i) {
        Calendar a = p70.a(this.d.f.f);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = p70.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // defpackage.py
    public final void d(nz nzVar, int i) {
        d dVar = (d) nzVar;
        c9 c9Var = this.d;
        Calendar a = p70.a(c9Var.f.f);
        a.add(2, i);
        ju juVar = new ju(a);
        dVar.u.setText(juVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) dVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !juVar.equals(materialCalendarGridView.b().f)) {
            new ku(juVar, c9Var);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.b().getClass();
        throw null;
    }

    @Override // defpackage.py
    public final nz e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!xs.N(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new d(linearLayout, false);
        }
        linearLayout.setLayoutParams(new yy(-1, this.g));
        return new d(linearLayout, true);
    }

    public final ju g(int i) {
        Calendar a = p70.a(this.d.f.f);
        a.add(2, i);
        return new ju(a);
    }

    public final int h(ju juVar) {
        return this.d.f.d(juVar);
    }
}
