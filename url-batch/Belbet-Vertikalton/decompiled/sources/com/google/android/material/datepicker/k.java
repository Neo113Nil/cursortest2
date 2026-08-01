package com.google.android.material.datepicker;

import M.P;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import h0.C0172w;
import h0.Y;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f2378U;

    /* renamed from: V, reason: collision with root package name */
    public b f2379V;

    /* renamed from: W, reason: collision with root package name */
    public o f2380W;

    /* renamed from: X, reason: collision with root package name */
    public int f2381X;

    /* renamed from: Y, reason: collision with root package name */
    public c f2382Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f2383Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f2384a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f2385b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f2386c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f2387d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f2388e0;

    public final void G(o oVar) {
        s sVar = (s) this.f2384a0.getAdapter();
        int d2 = sVar.f2429c.f2355a.d(oVar);
        int d3 = d2 - sVar.f2429c.f2355a.d(this.f2380W);
        boolean z2 = Math.abs(d3) > 3;
        boolean z3 = d3 > 0;
        this.f2380W = oVar;
        if (z2 && z3) {
            this.f2384a0.Y(d2 - 3);
            this.f2384a0.post(new J.a(this, d2, 2));
        } else if (!z2) {
            this.f2384a0.post(new J.a(this, d2, 2));
        } else {
            this.f2384a0.Y(d2 + 3);
            this.f2384a0.post(new J.a(this, d2, 2));
        }
    }

    public final void H(int i) {
        this.f2381X = i;
        if (i == 2) {
            this.f2383Z.getLayoutManager().n0(this.f2380W.f2417c - ((y) this.f2383Z.getAdapter()).f2434c.f2379V.f2355a.f2417c);
            this.f2387d0.setVisibility(0);
            this.f2388e0.setVisibility(8);
            this.f2385b0.setVisibility(8);
            this.f2386c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f2387d0.setVisibility(8);
            this.f2388e0.setVisibility(0);
            this.f2385b0.setVisibility(0);
            this.f2386c0.setVisibility(0);
            G(this.f2380W);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1612f;
        }
        this.f2378U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2379V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2380W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0172w c0172w;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f2378U);
        this.f2382Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f2379V.f2355a;
        if (m.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.winpower.neonfit.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.winpower.neonfit.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.winpower.neonfit.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.winpower.neonfit.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.winpower.neonfit.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.winpower.neonfit.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.f2421d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.winpower.neonfit.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.winpower.neonfit.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.winpower.neonfit.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.winpower.neonfit.R.id.mtrl_calendar_days_of_week);
        P.l(gridView, new S.h(1));
        int i4 = this.f2379V.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.f2418d);
        gridView.setEnabled(false);
        this.f2384a0 = (RecyclerView) inflate.findViewById(com.winpower.neonfit.R.id.mtrl_calendar_months);
        this.f2384a0.setLayoutManager(new g(this, i2, i2));
        this.f2384a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f2379V, new C1.d(23, this));
        this.f2384a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.winpower.neonfit.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.winpower.neonfit.R.id.mtrl_calendar_year_selector_frame);
        this.f2383Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f2383Z.setLayoutManager(new GridLayoutManager(integer));
            this.f2383Z.setAdapter(new y(this));
            this.f2383Z.g(new h(this));
        }
        if (inflate.findViewById(com.winpower.neonfit.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.winpower.neonfit.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            P.l(materialButton, new H0.a(2, this));
            View findViewById = inflate.findViewById(com.winpower.neonfit.R.id.month_navigation_previous);
            this.f2385b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.winpower.neonfit.R.id.month_navigation_next);
            this.f2386c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2387d0 = inflate.findViewById(com.winpower.neonfit.R.id.mtrl_calendar_year_selector_frame);
            this.f2388e0 = inflate.findViewById(com.winpower.neonfit.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f2380W.c());
            this.f2384a0.h(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f2386c0.setOnClickListener(new f(this, sVar, 1));
            this.f2385b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0172w = new C0172w()).f3131a) != (recyclerView = this.f2384a0)) {
            Y y2 = c0172w.f3132b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f2020e0;
                if (arrayList != null) {
                    arrayList.remove(y2);
                }
                c0172w.f3131a.setOnFlingListener(null);
            }
            c0172w.f3131a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0172w.f3131a.h(y2);
                c0172w.f3131a.setOnFlingListener(c0172w);
                new Scroller(c0172w.f3131a.getContext(), new DecelerateInterpolator());
                c0172w.f();
            }
        }
        this.f2384a0.Y(sVar.f2429c.f2355a.d(this.f2380W));
        P.l(this.f2384a0, new S.h(2));
        return inflate;
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2378U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2379V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2380W);
    }
}
