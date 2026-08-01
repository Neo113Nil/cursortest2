package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.moontiko.really.admiralcasino.R;
import defpackage.c20;
import defpackage.g9;
import defpackage.kx;
import defpackage.lx;
import defpackage.mv;
import defpackage.p9;
import defpackage.q20;
import defpackage.t10;
import defpackage.yv;
import defpackage.za0;
import java.util.Calendar;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class e extends t10 {
    public final p9 d;
    public final mv e;
    public final mv f;
    public final int g;
    public kx h;
    public int i = 0;

    public e(ContextThemeWrapper contextThemeWrapper, p9 p9Var, mv mvVar, mv mvVar2) {
        kx kxVar = p9Var.f;
        kx kxVar2 = p9Var.g;
        kx kxVar3 = p9Var.i;
        if (kxVar.f.compareTo(kxVar3.f) > 0) {
            g9.i("firstPage cannot be after currentPage");
            throw null;
        }
        if (kxVar3.f.compareTo(kxVar2.f) > 0) {
            g9.i("currentPage cannot be after lastPage");
            throw null;
        }
        this.g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * lx.d) + (yv.N(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = p9Var;
        this.e = mvVar;
        this.f = mvVar2;
        this.h = kxVar3;
        if (this.a.a()) {
            g9.s("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.b = true;
    }

    @Override // defpackage.t10
    public final int a() {
        return this.d.l;
    }

    @Override // defpackage.t10
    public final long b(int i) {
        Calendar a = za0.a(this.d.f.f);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = za0.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // defpackage.t10
    public final void c(q20 q20Var, int i) {
        d dVar = (d) q20Var;
        p9 p9Var = this.d;
        Calendar a = za0.a(p9Var.f.f);
        a.add(2, i);
        kx kxVar = new kx(a);
        dVar.u.setText(kxVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) dVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !kxVar.equals(materialCalendarGridView.b().a)) {
            new lx(kxVar, p9Var);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.b().getClass();
        throw null;
    }

    @Override // defpackage.t10
    public final q20 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!yv.N(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new d(linearLayout, false);
        }
        linearLayout.setLayoutParams(new c20(-1, this.g));
        return new d(linearLayout, true);
    }

    public final kx e(int i) {
        Calendar a = za0.a(this.d.f.f);
        a.add(2, i);
        return new kx(a);
    }

    public final int f(kx kxVar) {
        return this.d.f.d(kxVar);
    }
}
