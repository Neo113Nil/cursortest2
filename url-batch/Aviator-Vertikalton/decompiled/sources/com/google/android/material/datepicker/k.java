package com.google.android.material.datepicker;

import K.X;
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
import e0.C0136y;
import e0.a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f1878U;

    /* renamed from: V, reason: collision with root package name */
    public b f1879V;

    /* renamed from: W, reason: collision with root package name */
    public o f1880W;

    /* renamed from: X, reason: collision with root package name */
    public int f1881X;

    /* renamed from: Y, reason: collision with root package name */
    public c f1882Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f1883Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f1884a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f1885b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f1886c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f1887d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f1888e0;

    public final void C(o oVar) {
        s sVar = (s) this.f1884a0.getAdapter();
        int d2 = sVar.f1930c.f1855a.d(oVar);
        int d3 = d2 - sVar.f1930c.f1855a.d(this.f1880W);
        boolean z2 = Math.abs(d3) > 3;
        boolean z3 = d3 > 0;
        this.f1880W = oVar;
        if (z2 && z3) {
            this.f1884a0.Y(d2 - 3);
            this.f1884a0.post(new H.b(this, d2, 2));
        } else if (!z2) {
            this.f1884a0.post(new H.b(this, d2, 2));
        } else {
            this.f1884a0.Y(d2 + 3);
            this.f1884a0.post(new H.b(this, d2, 2));
        }
    }

    public final void D(int i) {
        this.f1881X = i;
        if (i == 2) {
            this.f1883Z.getLayoutManager().n0(this.f1880W.f1916c - ((y) this.f1883Z.getAdapter()).f1936c.f1879V.f1855a.f1916c);
            this.f1887d0.setVisibility(0);
            this.f1888e0.setVisibility(8);
            this.f1885b0.setVisibility(8);
            this.f1886c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1887d0.setVisibility(8);
            this.f1888e0.setVisibility(0);
            this.f1885b0.setVisibility(0);
            this.f1886c0.setVisibility(0);
            C(this.f1880W);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f1399f;
        }
        this.f1878U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1879V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1880W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0136y c0136y;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(d(), this.f1878U);
        this.f1882Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f1879V.f1855a;
        if (m.F(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.fortuneink.neonpad.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.fortuneink.neonpad.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = y().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.fortuneink.neonpad.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.fortuneink.neonpad.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.f1921d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.fortuneink.neonpad.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.fortuneink.neonpad.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.fortuneink.neonpad.R.id.mtrl_calendar_days_of_week);
        X.l(gridView, new Q.h(1));
        int i4 = this.f1879V.f1859e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.f1917d);
        gridView.setEnabled(false);
        this.f1884a0 = (RecyclerView) inflate.findViewById(com.fortuneink.neonpad.R.id.mtrl_calendar_months);
        this.f1884a0.setLayoutManager(new g(this, i2, i2));
        this.f1884a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f1879V, new B0.d(21, this));
        this.f1884a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.fortuneink.neonpad.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.fortuneink.neonpad.R.id.mtrl_calendar_year_selector_frame);
        this.f1883Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f1883Z.setLayoutManager(new GridLayoutManager(integer));
            this.f1883Z.setAdapter(new y(this));
            this.f1883Z.g(new h(this));
        }
        if (inflate.findViewById(com.fortuneink.neonpad.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.fortuneink.neonpad.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            X.l(materialButton, new B0.a(2, this));
            View findViewById = inflate.findViewById(com.fortuneink.neonpad.R.id.month_navigation_previous);
            this.f1885b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.fortuneink.neonpad.R.id.month_navigation_next);
            this.f1886c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f1887d0 = inflate.findViewById(com.fortuneink.neonpad.R.id.mtrl_calendar_year_selector_frame);
            this.f1888e0 = inflate.findViewById(com.fortuneink.neonpad.R.id.mtrl_calendar_day_selector_frame);
            D(1);
            materialButton.setText(this.f1880W.c());
            this.f1884a0.h(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f1886c0.setOnClickListener(new f(this, sVar, 1));
            this.f1885b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.F(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0136y = new C0136y()).f2366a) != (recyclerView = this.f1884a0)) {
            a0 a0Var = c0136y.f2367b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1574e0;
                if (arrayList != null) {
                    arrayList.remove(a0Var);
                }
                c0136y.f2366a.setOnFlingListener(null);
            }
            c0136y.f2366a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0136y.f2366a.h(a0Var);
                c0136y.f2366a.setOnFlingListener(c0136y);
                new Scroller(c0136y.f2366a.getContext(), new DecelerateInterpolator());
                c0136y.f();
            }
        }
        this.f1884a0.Y(sVar.f1930c.f1855a.d(this.f1880W));
        X.l(this.f1884a0, new Q.h(2));
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1878U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1879V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1880W);
    }
}
