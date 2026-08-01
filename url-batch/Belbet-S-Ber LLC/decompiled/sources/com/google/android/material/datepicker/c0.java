package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.gdmhkmf.belbet.R;
import g1.b1;
import g1.q0;
import g1.q1;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c0 extends q0 {
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f1045e;

    /* renamed from: f, reason: collision with root package name */
    public final l f1046f;

    /* renamed from: g, reason: collision with root package name */
    public final l f1047g;
    public final int h;
    public x i;

    /* renamed from: j, reason: collision with root package name */
    public int f1048j = 0;

    public c0(ContextThemeWrapper contextThemeWrapper, f0 f0Var, b bVar, l lVar, l lVar2) {
        x xVar = bVar.f1033f;
        x xVar2 = bVar.f1034g;
        x xVar3 = bVar.i;
        if (xVar.compareTo(xVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (xVar3.compareTo(xVar2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.h = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * y.f1127f) + (v.L(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = bVar;
        this.f1045e = f0Var;
        this.f1046f = lVar;
        this.f1047g = lVar2;
        this.i = xVar3;
        if (this.f1764a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f1765b = true;
    }

    @Override // g1.q0
    public final int a() {
        return this.d.f1037l;
    }

    @Override // g1.q0
    public final long b(int i) {
        Calendar c5 = i0.c(this.d.f1033f.f1122f);
        c5.add(2, i);
        c5.set(5, 1);
        Calendar c6 = i0.c(c5);
        c6.get(2);
        c6.get(1);
        c6.getMaximum(7);
        c6.getActualMaximum(5);
        c6.getTimeInMillis();
        return c6.getTimeInMillis();
    }

    @Override // g1.q0
    public final void c(q1 q1Var, int i) {
        b0 b0Var = (b0) q1Var;
        b bVar = this.d;
        Calendar c5 = i0.c(bVar.f1033f.f1122f);
        c5.add(2, i);
        x xVar = new x(c5);
        b0Var.f1038u.setText(xVar.d());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) b0Var.f1039v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !xVar.equals(materialCalendarGridView.b().f1129a)) {
            y yVar = new y(xVar, this.f1045e, bVar);
            materialCalendarGridView.setNumColumns(xVar.i);
            materialCalendarGridView.setAdapter((ListAdapter) yVar);
        } else {
            materialCalendarGridView.invalidate();
            y b2 = materialCalendarGridView.b();
            f0 f0Var = b2.f1130b;
            ArrayList arrayList = b2.f1131c;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                b2.h(materialCalendarGridView, ((Long) obj).longValue());
            }
            if (f0Var != null) {
                ArrayList a5 = f0Var.a();
                int size2 = a5.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = a5.get(i5);
                    i5++;
                    b2.h(materialCalendarGridView, ((Long) obj2).longValue());
                }
                b2.f1131c = f0Var.a();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new a0(this, materialCalendarGridView));
        materialCalendarGridView.f1024g = this.f1047g;
        boolean L = v.L(b0Var.f1768a.getContext(), android.R.attr.windowFullscreen);
        if (L || xVar.equals(this.i)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(393216);
        }
        if (L || !xVar.equals(this.i)) {
            return;
        }
        final int i6 = this.f1048j;
        this.f1048j = 0;
        materialCalendarGridView.post(new Runnable(this) { // from class: com.google.android.material.datepicker.z
            @Override // java.lang.Runnable
            public final void run() {
                int i7;
                int a6;
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                if (!materialCalendarGridView2.hasFocus() || (i7 = i6) == 0) {
                    return;
                }
                y b5 = materialCalendarGridView2.b();
                if (i7 == 1) {
                    a6 = b5.b(b5.f() + 1);
                    if (a6 == -1) {
                        a6 = b5.f();
                    }
                } else {
                    a6 = b5.a(b5.c() - 1);
                    if (a6 == -1) {
                        a6 = b5.c();
                    }
                }
                materialCalendarGridView2.setSelection(a6);
            }
        });
    }

    @Override // g1.q0
    public final q1 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!v.L(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new b0(linearLayout, false);
        }
        linearLayout.setLayoutParams(new b1(-1, this.h));
        return new b0(linearLayout, true);
    }

    public final x e(int i) {
        Calendar c5 = i0.c(this.d.f1033f.f1122f);
        c5.add(2, i);
        return new x(c5);
    }

    public final int f(x xVar) {
        return this.d.f1033f.e(xVar);
    }
}
