package com.google.android.material.datepicker;

import K.Q;
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
import g0.C0159x;
import g0.b0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f2265U;

    /* renamed from: V, reason: collision with root package name */
    public b f2266V;

    /* renamed from: W, reason: collision with root package name */
    public o f2267W;

    /* renamed from: X, reason: collision with root package name */
    public int f2268X;

    /* renamed from: Y, reason: collision with root package name */
    public c f2269Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f2270Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f2271a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f2272b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f2273c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f2274d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f2275e0;

    public final void G(o oVar) {
        s sVar = (s) this.f2271a0.getAdapter();
        int d = sVar.d.f2243a.d(oVar);
        int d2 = d - sVar.d.f2243a.d(this.f2267W);
        boolean z2 = Math.abs(d2) > 3;
        boolean z3 = d2 > 0;
        this.f2267W = oVar;
        if (z2 && z3) {
            this.f2271a0.e0(d - 3);
            this.f2271a0.post(new H.b(this, d, 2));
        } else if (!z2) {
            this.f2271a0.post(new H.b(this, d, 2));
        } else {
            this.f2271a0.e0(d + 3);
            this.f2271a0.post(new H.b(this, d, 2));
        }
    }

    public final void H(int i) {
        this.f2268X = i;
        if (i == 2) {
            this.f2270Z.getLayoutManager().p0(this.f2267W.f2305c - ((y) this.f2270Z.getAdapter()).d.f2266V.f2243a.f2305c);
            this.f2274d0.setVisibility(0);
            this.f2275e0.setVisibility(8);
            this.f2272b0.setVisibility(8);
            this.f2273c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f2274d0.setVisibility(8);
            this.f2275e0.setVisibility(0);
            this.f2272b0.setVisibility(0);
            this.f2273c0.setVisibility(0);
            G(this.f2267W);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1463f;
        }
        this.f2265U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2266V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2267W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0159x c0159x;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f2265U);
        this.f2269Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f2266V.f2243a;
        if (m.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.fortunequest.neontrack.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.fortunequest.neontrack.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.fortunequest.neontrack.R.id.mtrl_calendar_days_of_week);
        Q.l(gridView, new Q.h(1));
        int i4 = this.f2266V.f2246e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.d);
        gridView.setEnabled(false);
        this.f2271a0 = (RecyclerView) inflate.findViewById(com.fortunequest.neontrack.R.id.mtrl_calendar_months);
        this.f2271a0.setLayoutManager(new g(this, i2, i2));
        this.f2271a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f2266V, new A0.c(24, this));
        this.f2271a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.fortunequest.neontrack.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.fortunequest.neontrack.R.id.mtrl_calendar_year_selector_frame);
        this.f2270Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f2270Z.setLayoutManager(new GridLayoutManager(integer));
            this.f2270Z.setAdapter(new y(this));
            this.f2270Z.i(new h(this));
        }
        if (inflate.findViewById(com.fortunequest.neontrack.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.fortunequest.neontrack.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            Q.l(materialButton, new D0.e(4, this));
            View findViewById = inflate.findViewById(com.fortunequest.neontrack.R.id.month_navigation_previous);
            this.f2272b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.fortunequest.neontrack.R.id.month_navigation_next);
            this.f2273c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2274d0 = inflate.findViewById(com.fortunequest.neontrack.R.id.mtrl_calendar_year_selector_frame);
            this.f2275e0 = inflate.findViewById(com.fortunequest.neontrack.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f2267W.c());
            this.f2271a0.j(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f2273c0.setOnClickListener(new f(this, sVar, 1));
            this.f2272b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0159x = new C0159x()).f2951a) != (recyclerView = this.f2271a0)) {
            b0 b0Var = c0159x.f2952b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1980g0;
                if (arrayList != null) {
                    arrayList.remove(b0Var);
                }
                c0159x.f2951a.setOnFlingListener(null);
            }
            c0159x.f2951a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0159x.f2951a.j(b0Var);
                c0159x.f2951a.setOnFlingListener(c0159x);
                new Scroller(c0159x.f2951a.getContext(), new DecelerateInterpolator());
                c0159x.f();
            }
        }
        this.f2271a0.e0(sVar.d.f2243a.d(this.f2267W));
        Q.l(this.f2271a0, new Q.h(2));
        return inflate;
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2265U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2266V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2267W);
    }
}
