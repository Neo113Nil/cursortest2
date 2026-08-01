package com.google.android.material.datepicker;

import M.Q;
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
import h0.C0137y;
import h0.b0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f1870U;

    /* renamed from: V, reason: collision with root package name */
    public b f1871V;

    /* renamed from: W, reason: collision with root package name */
    public o f1872W;

    /* renamed from: X, reason: collision with root package name */
    public int f1873X;

    /* renamed from: Y, reason: collision with root package name */
    public c f1874Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f1875Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f1876a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f1877b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f1878c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f1879d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f1880e0;

    public final void G(o oVar) {
        s sVar = (s) this.f1876a0.getAdapter();
        int d = sVar.f1922c.f1847a.d(oVar);
        int d2 = d - sVar.f1922c.f1847a.d(this.f1872W);
        boolean z2 = Math.abs(d2) > 3;
        boolean z3 = d2 > 0;
        this.f1872W = oVar;
        if (z2 && z3) {
            this.f1876a0.Y(d - 3);
            this.f1876a0.post(new J.a(this, d, 2));
        } else if (!z2) {
            this.f1876a0.post(new J.a(this, d, 2));
        } else {
            this.f1876a0.Y(d + 3);
            this.f1876a0.post(new J.a(this, d, 2));
        }
    }

    public final void H(int i) {
        this.f1873X = i;
        if (i == 2) {
            this.f1875Z.getLayoutManager().n0(this.f1872W.f1910c - ((y) this.f1875Z.getAdapter()).f1927c.f1871V.f1847a.f1910c);
            this.f1879d0.setVisibility(0);
            this.f1880e0.setVisibility(8);
            this.f1877b0.setVisibility(8);
            this.f1878c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1879d0.setVisibility(8);
            this.f1880e0.setVisibility(0);
            this.f1877b0.setVisibility(0);
            this.f1878c0.setVisibility(0);
            G(this.f1872W);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1193f;
        }
        this.f1870U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1871V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1872W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0137y c0137y;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f1870U);
        this.f1874Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f1871V.f1847a;
        if (m.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.winfour.neondrop.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.winfour.neondrop.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.winfour.neondrop.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.winfour.neondrop.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.winfour.neondrop.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.winfour.neondrop.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.winfour.neondrop.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.winfour.neondrop.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.winfour.neondrop.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.winfour.neondrop.R.id.mtrl_calendar_days_of_week);
        Q.l(gridView, new S.h(1));
        int i4 = this.f1871V.f1850e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.d);
        gridView.setEnabled(false);
        this.f1876a0 = (RecyclerView) inflate.findViewById(com.winfour.neondrop.R.id.mtrl_calendar_months);
        this.f1876a0.setLayoutManager(new g(this, i2, i2));
        this.f1876a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f1871V, new E.g(22, this));
        this.f1876a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.winfour.neondrop.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.winfour.neondrop.R.id.mtrl_calendar_year_selector_frame);
        this.f1875Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f1875Z.setLayoutManager(new GridLayoutManager(integer));
            this.f1875Z.setAdapter(new y(this));
            this.f1875Z.g(new h(this));
        }
        if (inflate.findViewById(com.winfour.neondrop.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.winfour.neondrop.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            Q.l(materialButton, new F0.a(2, this));
            View findViewById = inflate.findViewById(com.winfour.neondrop.R.id.month_navigation_previous);
            this.f1877b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.winfour.neondrop.R.id.month_navigation_next);
            this.f1878c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f1879d0 = inflate.findViewById(com.winfour.neondrop.R.id.mtrl_calendar_year_selector_frame);
            this.f1880e0 = inflate.findViewById(com.winfour.neondrop.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f1872W.c());
            this.f1876a0.h(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f1878c0.setOnClickListener(new f(this, sVar, 1));
            this.f1877b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0137y = new C0137y()).f2608a) != (recyclerView = this.f1876a0)) {
            b0 b0Var = c0137y.f2609b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1649e0;
                if (arrayList != null) {
                    arrayList.remove(b0Var);
                }
                c0137y.f2608a.setOnFlingListener(null);
            }
            c0137y.f2608a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0137y.f2608a.h(b0Var);
                c0137y.f2608a.setOnFlingListener(c0137y);
                new Scroller(c0137y.f2608a.getContext(), new DecelerateInterpolator());
                c0137y.f();
            }
        }
        this.f1876a0.Y(sVar.f1922c.f1847a.d(this.f1872W));
        Q.l(this.f1876a0, new S.h(2));
        return inflate;
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1870U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1871V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1872W);
    }
}
