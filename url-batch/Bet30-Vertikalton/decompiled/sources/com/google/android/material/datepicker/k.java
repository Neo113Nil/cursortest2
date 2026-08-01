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
import f0.C0107y;
import f0.a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f1661U;

    /* renamed from: V, reason: collision with root package name */
    public b f1662V;

    /* renamed from: W, reason: collision with root package name */
    public o f1663W;

    /* renamed from: X, reason: collision with root package name */
    public int f1664X;

    /* renamed from: Y, reason: collision with root package name */
    public c f1665Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f1666Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f1667a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f1668b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f1669c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f1670d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f1671e0;

    public final void G(o oVar) {
        s sVar = (s) this.f1667a0.getAdapter();
        int d = sVar.f1712c.f1639a.d(oVar);
        int d2 = d - sVar.f1712c.f1639a.d(this.f1663W);
        boolean z2 = Math.abs(d2) > 3;
        boolean z3 = d2 > 0;
        this.f1663W = oVar;
        if (z2 && z3) {
            this.f1667a0.Y(d - 3);
            this.f1667a0.post(new H.b(this, d, 2));
        } else if (!z2) {
            this.f1667a0.post(new H.b(this, d, 2));
        } else {
            this.f1667a0.Y(d + 3);
            this.f1667a0.post(new H.b(this, d, 2));
        }
    }

    public final void H(int i) {
        this.f1664X = i;
        if (i == 2) {
            this.f1666Z.getLayoutManager().n0(this.f1663W.f1700c - ((y) this.f1666Z.getAdapter()).f1717c.f1662V.f1639a.f1700c);
            this.f1670d0.setVisibility(0);
            this.f1671e0.setVisibility(8);
            this.f1668b0.setVisibility(8);
            this.f1669c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1670d0.setVisibility(8);
            this.f1671e0.setVisibility(0);
            this.f1668b0.setVisibility(0);
            this.f1669c0.setVisibility(0);
            G(this.f1663W);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f973f;
        }
        this.f1661U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1662V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1663W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0107y c0107y;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f1661U);
        this.f1665Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f1662V.f1639a;
        if (m.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.lasercut.dash.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.lasercut.dash.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.lasercut.dash.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.lasercut.dash.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.lasercut.dash.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.lasercut.dash.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.lasercut.dash.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.lasercut.dash.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.lasercut.dash.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.lasercut.dash.R.id.mtrl_calendar_days_of_week);
        T.l(gridView, new Q.h(1));
        int i4 = this.f1662V.f1642e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.d);
        gridView.setEnabled(false);
        this.f1667a0 = (RecyclerView) inflate.findViewById(com.lasercut.dash.R.id.mtrl_calendar_months);
        this.f1667a0.setLayoutManager(new g(this, i2, i2));
        this.f1667a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f1662V, new B0.d(22, this));
        this.f1667a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.lasercut.dash.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.lasercut.dash.R.id.mtrl_calendar_year_selector_frame);
        this.f1666Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f1666Z.setLayoutManager(new GridLayoutManager(integer));
            this.f1666Z.setAdapter(new y(this));
            this.f1666Z.g(new h(this));
        }
        if (inflate.findViewById(com.lasercut.dash.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.lasercut.dash.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            T.l(materialButton, new B0.a(2, this));
            View findViewById = inflate.findViewById(com.lasercut.dash.R.id.month_navigation_previous);
            this.f1668b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.lasercut.dash.R.id.month_navigation_next);
            this.f1669c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f1670d0 = inflate.findViewById(com.lasercut.dash.R.id.mtrl_calendar_year_selector_frame);
            this.f1671e0 = inflate.findViewById(com.lasercut.dash.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f1663W.c());
            this.f1667a0.h(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f1669c0.setOnClickListener(new f(this, sVar, 1));
            this.f1668b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0107y = new C0107y()).f2185a) != (recyclerView = this.f1667a0)) {
            a0 a0Var = c0107y.f2186b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1442e0;
                if (arrayList != null) {
                    arrayList.remove(a0Var);
                }
                c0107y.f2185a.setOnFlingListener(null);
            }
            c0107y.f2185a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0107y.f2185a.h(a0Var);
                c0107y.f2185a.setOnFlingListener(c0107y);
                new Scroller(c0107y.f2185a.getContext(), new DecelerateInterpolator());
                c0107y.f();
            }
        }
        this.f1667a0.Y(sVar.f1712c.f1639a.d(this.f1663W));
        T.l(this.f1667a0, new Q.h(2));
        return inflate;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1661U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1662V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1663W);
    }
}
