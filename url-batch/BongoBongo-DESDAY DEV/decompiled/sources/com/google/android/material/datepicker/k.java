package com.google.android.material.datepicker;

import L.T;
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
import h0.C0143z;
import h0.e0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f1885U;

    /* renamed from: V, reason: collision with root package name */
    public b f1886V;

    /* renamed from: W, reason: collision with root package name */
    public o f1887W;

    /* renamed from: X, reason: collision with root package name */
    public int f1888X;

    /* renamed from: Y, reason: collision with root package name */
    public c f1889Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f1890Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f1891a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f1892b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f1893c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f1894d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f1895e0;

    public final void G(o oVar) {
        s sVar = (s) this.f1891a0.getAdapter();
        int d = sVar.d.f1862a.d(oVar);
        int d2 = d - sVar.d.f1862a.d(this.f1887W);
        boolean z2 = Math.abs(d2) > 3;
        boolean z3 = d2 > 0;
        this.f1887W = oVar;
        if (z2 && z3) {
            this.f1891a0.e0(d - 3);
            this.f1891a0.post(new I.a(this, d, 2));
        } else if (!z2) {
            this.f1891a0.post(new I.a(this, d, 2));
        } else {
            this.f1891a0.e0(d + 3);
            this.f1891a0.post(new I.a(this, d, 2));
        }
    }

    public final void H(int i) {
        this.f1888X = i;
        if (i == 2) {
            this.f1890Z.getLayoutManager().p0(this.f1887W.f1924c - ((y) this.f1890Z.getAdapter()).d.f1886V.f1862a.f1924c);
            this.f1894d0.setVisibility(0);
            this.f1895e0.setVisibility(8);
            this.f1892b0.setVisibility(8);
            this.f1893c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1894d0.setVisibility(8);
            this.f1895e0.setVisibility(0);
            this.f1892b0.setVisibility(0);
            this.f1893c0.setVisibility(0);
            G(this.f1887W);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1183f;
        }
        this.f1885U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1886V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1887W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0143z c0143z;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f1885U);
        this.f1889Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f1886V.f1862a;
        if (m.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.winfour.winrandom.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.winfour.winrandom.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.winfour.winrandom.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.winfour.winrandom.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.winfour.winrandom.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.winfour.winrandom.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.winfour.winrandom.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.winfour.winrandom.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.winfour.winrandom.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.winfour.winrandom.R.id.mtrl_calendar_days_of_week);
        T.l(gridView, new R.h(1));
        int i4 = this.f1886V.f1865e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.d);
        gridView.setEnabled(false);
        this.f1891a0 = (RecyclerView) inflate.findViewById(com.winfour.winrandom.R.id.mtrl_calendar_months);
        this.f1891a0.setLayoutManager(new g(this, i2, i2));
        this.f1891a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f1886V, new D.g(22, this));
        this.f1891a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.winfour.winrandom.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.winfour.winrandom.R.id.mtrl_calendar_year_selector_frame);
        this.f1890Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f1890Z.setLayoutManager(new GridLayoutManager(integer));
            this.f1890Z.setAdapter(new y(this));
            this.f1890Z.i(new h(this));
        }
        if (inflate.findViewById(com.winfour.winrandom.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.winfour.winrandom.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            T.l(materialButton, new E0.a(2, this));
            View findViewById = inflate.findViewById(com.winfour.winrandom.R.id.month_navigation_previous);
            this.f1892b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.winfour.winrandom.R.id.month_navigation_next);
            this.f1893c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f1894d0 = inflate.findViewById(com.winfour.winrandom.R.id.mtrl_calendar_year_selector_frame);
            this.f1895e0 = inflate.findViewById(com.winfour.winrandom.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f1887W.c());
            this.f1891a0.j(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f1893c0.setOnClickListener(new f(this, sVar, 1));
            this.f1892b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0143z = new C0143z()).f2641a) != (recyclerView = this.f1891a0)) {
            e0 e0Var = c0143z.f2642b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1663g0;
                if (arrayList != null) {
                    arrayList.remove(e0Var);
                }
                c0143z.f2641a.setOnFlingListener(null);
            }
            c0143z.f2641a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0143z.f2641a.j(e0Var);
                c0143z.f2641a.setOnFlingListener(c0143z);
                new Scroller(c0143z.f2641a.getContext(), new DecelerateInterpolator());
                c0143z.f();
            }
        }
        this.f1891a0.e0(sVar.d.f1862a.d(this.f1887W));
        T.l(this.f1891a0, new R.h(2));
        return inflate;
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1885U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1886V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1887W);
    }
}
