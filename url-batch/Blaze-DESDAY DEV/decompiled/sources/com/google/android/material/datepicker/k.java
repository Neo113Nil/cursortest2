package com.google.android.material.datepicker;

import K.T;
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
import g0.C0141z;
import g0.d0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f1816U;

    /* renamed from: V, reason: collision with root package name */
    public b f1817V;

    /* renamed from: W, reason: collision with root package name */
    public o f1818W;

    /* renamed from: X, reason: collision with root package name */
    public int f1819X;

    /* renamed from: Y, reason: collision with root package name */
    public c f1820Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f1821Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f1822a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f1823b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f1824c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f1825d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f1826e0;

    public final void G(o oVar) {
        s sVar = (s) this.f1822a0.getAdapter();
        int d = sVar.d.f1794a.d(oVar);
        int d2 = d - sVar.d.f1794a.d(this.f1818W);
        boolean z2 = Math.abs(d2) > 3;
        boolean z3 = d2 > 0;
        this.f1818W = oVar;
        if (z2 && z3) {
            this.f1822a0.e0(d - 3);
            this.f1822a0.post(new H.b(this, d, 2));
        } else if (!z2) {
            this.f1822a0.post(new H.b(this, d, 2));
        } else {
            this.f1822a0.e0(d + 3);
            this.f1822a0.post(new H.b(this, d, 2));
        }
    }

    public final void H(int i) {
        this.f1819X = i;
        if (i == 2) {
            this.f1821Z.getLayoutManager().p0(this.f1818W.f1856c - ((y) this.f1821Z.getAdapter()).d.f1817V.f1794a.f1856c);
            this.f1825d0.setVisibility(0);
            this.f1826e0.setVisibility(8);
            this.f1823b0.setVisibility(8);
            this.f1824c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1825d0.setVisibility(8);
            this.f1826e0.setVisibility(0);
            this.f1823b0.setVisibility(0);
            this.f1824c0.setVisibility(0);
            G(this.f1818W);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1131f;
        }
        this.f1816U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1817V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1818W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0141z c0141z;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f1816U);
        this.f1820Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f1817V.f1794a;
        if (m.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.winworm.neongrid.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.winworm.neongrid.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.winworm.neongrid.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.winworm.neongrid.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.winworm.neongrid.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.winworm.neongrid.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.winworm.neongrid.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.winworm.neongrid.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.winworm.neongrid.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.winworm.neongrid.R.id.mtrl_calendar_days_of_week);
        T.l(gridView, new Q.h(1));
        int i4 = this.f1817V.f1797e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.d);
        gridView.setEnabled(false);
        this.f1822a0 = (RecyclerView) inflate.findViewById(com.winworm.neongrid.R.id.mtrl_calendar_months);
        this.f1822a0.setLayoutManager(new g(this, i2, i2));
        this.f1822a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f1817V, new C.g(21, this));
        this.f1822a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.winworm.neongrid.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.winworm.neongrid.R.id.mtrl_calendar_year_selector_frame);
        this.f1821Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f1821Z.setLayoutManager(new GridLayoutManager(integer));
            this.f1821Z.setAdapter(new y(this));
            this.f1821Z.i(new h(this));
        }
        if (inflate.findViewById(com.winworm.neongrid.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.winworm.neongrid.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            T.l(materialButton, new D0.a(2, this));
            View findViewById = inflate.findViewById(com.winworm.neongrid.R.id.month_navigation_previous);
            this.f1823b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.winworm.neongrid.R.id.month_navigation_next);
            this.f1824c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f1825d0 = inflate.findViewById(com.winworm.neongrid.R.id.mtrl_calendar_year_selector_frame);
            this.f1826e0 = inflate.findViewById(com.winworm.neongrid.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f1818W.c());
            this.f1822a0.j(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f1824c0.setOnClickListener(new f(this, sVar, 1));
            this.f1823b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0141z = new C0141z()).f2542a) != (recyclerView = this.f1822a0)) {
            d0 d0Var = c0141z.f2543b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1600g0;
                if (arrayList != null) {
                    arrayList.remove(d0Var);
                }
                c0141z.f2542a.setOnFlingListener(null);
            }
            c0141z.f2542a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0141z.f2542a.j(d0Var);
                c0141z.f2542a.setOnFlingListener(c0141z);
                new Scroller(c0141z.f2542a.getContext(), new DecelerateInterpolator());
                c0141z.f();
            }
        }
        this.f1822a0.e0(sVar.d.f1794a.d(this.f1818W));
        T.l(this.f1822a0, new Q.h(2));
        return inflate;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1816U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1817V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1818W);
    }
}
