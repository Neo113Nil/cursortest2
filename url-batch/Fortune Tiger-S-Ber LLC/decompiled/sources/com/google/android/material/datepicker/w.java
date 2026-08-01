package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b1.c1;
import b1.e0;
import b1.o0;
import com.gglhk.bofio.fortunetiger.R;
import java.util.Calendar;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public final b f1337d;

    /* renamed from: e, reason: collision with root package name */
    public final h f1338e;

    /* renamed from: f, reason: collision with root package name */
    public final h f1339f;
    public final int g;
    public r h;

    /* renamed from: i, reason: collision with root package name */
    public int f1340i = 0;

    public w(ContextThemeWrapper contextThemeWrapper, b bVar, h hVar, h hVar2) {
        r rVar = bVar.f1276f;
        r rVar2 = bVar.g;
        r rVar3 = bVar.f1277i;
        if (rVar.f1324f.compareTo(rVar3.f1324f) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (rVar3.f1324f.compareTo(rVar2.f1324f) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * s.f1329d) + (p.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1337d = bVar;
        this.f1338e = hVar;
        this.f1339f = hVar2;
        this.h = rVar3;
        if (this.f771a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f772b = true;
    }

    @Override // b1.e0
    public final int a() {
        return this.f1337d.f1280l;
    }

    @Override // b1.e0
    public final long b(int i4) {
        Calendar a4 = a0.a(this.f1337d.f1276f.f1324f);
        a4.add(2, i4);
        a4.set(5, 1);
        Calendar a5 = a0.a(a4);
        a5.get(2);
        a5.get(1);
        a5.getMaximum(7);
        a5.getActualMaximum(5);
        a5.getTimeInMillis();
        return a5.getTimeInMillis();
    }

    @Override // b1.e0
    public final void c(c1 c1Var, int i4) {
        v vVar = (v) c1Var;
        b bVar = this.f1337d;
        Calendar a4 = a0.a(bVar.f1276f.f1324f);
        a4.add(2, i4);
        r rVar = new r(a4);
        vVar.f1335u.setText(rVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) vVar.f1336v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !rVar.equals(materialCalendarGridView.b().f1331a)) {
            new s(rVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.b().getClass();
        throw null;
    }

    @Override // b1.e0
    public final c1 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!p.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new v(linearLayout, false);
        }
        linearLayout.setLayoutParams(new o0(-1, this.g));
        return new v(linearLayout, true);
    }

    public final r e(int i4) {
        Calendar a4 = a0.a(this.f1337d.f1276f.f1324f);
        a4.add(2, i4);
        return new r(a4);
    }

    public final int f(r rVar) {
        return this.f1337d.f1276f.d(rVar);
    }
}
