package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.awerser.monnit.betplay.R;
import defpackage.c00;
import defpackage.fz;
import defpackage.mt;
import defpackage.o8;
import defpackage.oz;
import defpackage.w70;
import defpackage.x8;
import defpackage.yu;
import defpackage.zs;
import defpackage.zu;
import java.util.Calendar;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class e extends fz {
    public final x8 d;
    public final zs e;
    public final zs f;
    public final int g;
    public yu h;
    public int i = 0;

    public e(ContextThemeWrapper contextThemeWrapper, x8 x8Var, zs zsVar, zs zsVar2) {
        yu yuVar = x8Var.f;
        yu yuVar2 = x8Var.g;
        yu yuVar3 = x8Var.i;
        if (yuVar.f.compareTo(yuVar3.f) > 0) {
            o8.j("firstPage cannot be after currentPage");
            throw null;
        }
        if (yuVar3.f.compareTo(yuVar2.f) > 0) {
            o8.j("currentPage cannot be after lastPage");
            throw null;
        }
        this.g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * zu.d) + (mt.i(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = x8Var;
        this.e = zsVar;
        this.f = zsVar2;
        this.h = yuVar3;
        if (this.a.a()) {
            o8.t("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.b = true;
    }

    @Override // defpackage.fz
    public final int a() {
        return this.d.l;
    }

    @Override // defpackage.fz
    public final long b(int i) {
        Calendar a = w70.a(this.d.f.f);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = w70.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // defpackage.fz
    public final void c(c00 c00Var, int i) {
        d dVar = (d) c00Var;
        x8 x8Var = this.d;
        Calendar a = w70.a(x8Var.f.f);
        a.add(2, i);
        yu yuVar = new yu(a);
        dVar.u.setText(yuVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) dVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !yuVar.equals(materialCalendarGridView.b().a)) {
            new zu(yuVar, x8Var);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.b().getClass();
        throw null;
    }

    @Override // defpackage.fz
    public final c00 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!mt.i(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new d(linearLayout, false);
        }
        linearLayout.setLayoutParams(new oz(-1, this.g));
        return new d(linearLayout, true);
    }

    public final yu e(int i) {
        Calendar a = w70.a(this.d.f.f);
        a.add(2, i);
        return new yu(a);
    }

    public final int f(yu yuVar) {
        return this.d.f.d(yuVar);
    }
}
