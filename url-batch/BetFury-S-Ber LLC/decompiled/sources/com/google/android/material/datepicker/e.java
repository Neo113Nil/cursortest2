package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.trembin.nirefon.betfury.R;
import defpackage.b10;
import defpackage.ca;
import defpackage.i80;
import defpackage.o20;
import defpackage.p00;
import defpackage.p20;
import defpackage.s9;
import defpackage.x80;
import defpackage.xk0;
import defpackage.z70;
import java.util.Calendar;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class e extends z70 {
    public final ca d;
    public final p00 e;
    public final p00 f;
    public final int g;
    public o20 h;
    public int i = 0;

    public e(ContextThemeWrapper contextThemeWrapper, ca caVar, p00 p00Var, p00 p00Var2) {
        o20 o20Var = caVar.f;
        o20 o20Var2 = caVar.g;
        o20 o20Var3 = caVar.i;
        if (o20Var.f.compareTo(o20Var3.f) > 0) {
            s9.k("firstPage cannot be after currentPage");
            throw null;
        }
        if (o20Var3.f.compareTo(o20Var2.f) > 0) {
            s9.k("currentPage cannot be after lastPage");
            throw null;
        }
        this.g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p20.i) + (b10.N(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = caVar;
        this.e = p00Var;
        this.f = p00Var2;
        this.h = o20Var3;
        if (this.a.a()) {
            s9.u("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.b = true;
    }

    @Override // defpackage.z70
    public final int a() {
        return this.d.l;
    }

    @Override // defpackage.z70
    public final long b(int i) {
        Calendar a = xk0.a(this.d.f.f);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = xk0.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // defpackage.z70
    public final void c(x80 x80Var, int i) {
        d dVar = (d) x80Var;
        ca caVar = this.d;
        Calendar a = xk0.a(caVar.f.f);
        a.add(2, i);
        o20 o20Var = new o20(a);
        dVar.u.setText(o20Var.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) dVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !o20Var.equals(materialCalendarGridView.b().f)) {
            new p20(o20Var, caVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.b().getClass();
        throw null;
    }

    @Override // defpackage.z70
    public final x80 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!b10.N(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new d(linearLayout, false);
        }
        linearLayout.setLayoutParams(new i80(-1, this.g));
        return new d(linearLayout, true);
    }

    public final o20 e(int i) {
        Calendar a = xk0.a(this.d.f.f);
        a.add(2, i);
        return new o20(a);
    }

    public final int f(o20 o20Var) {
        return this.d.f.d(o20Var);
    }
}
