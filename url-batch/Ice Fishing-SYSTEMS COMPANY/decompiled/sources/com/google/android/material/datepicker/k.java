package com.google.android.material.datepicker;

import O.X;
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
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;
import t0.C5034S;
import t0.C5058u;

/* loaded from: classes2.dex */
public final class k<S> extends t {

    /* renamed from: A0, reason: collision with root package name */
    public int f36123A0;

    /* renamed from: B0, reason: collision with root package name */
    public b f36124B0;
    public o C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f36125D0;

    /* renamed from: E0, reason: collision with root package name */
    public c f36126E0;

    /* renamed from: F0, reason: collision with root package name */
    public RecyclerView f36127F0;

    /* renamed from: G0, reason: collision with root package name */
    public RecyclerView f36128G0;

    /* renamed from: H0, reason: collision with root package name */
    public View f36129H0;

    /* renamed from: I0, reason: collision with root package name */
    public View f36130I0;

    /* renamed from: J0, reason: collision with root package name */
    public View f36131J0;

    /* renamed from: K0, reason: collision with root package name */
    public View f36132K0;

    public final void C(o oVar) {
        s sVar = (s) this.f36128G0.getAdapter();
        int d2 = sVar.f36178c.f36098n.d(oVar);
        int d3 = d2 - sVar.f36178c.f36098n.d(this.C0);
        boolean z8 = Math.abs(d3) > 3;
        boolean z9 = d3 > 0;
        this.C0 = oVar;
        if (z8 && z9) {
            this.f36128G0.Y(d2 - 3);
            this.f36128G0.post(new L.a(this, d2, 12));
        } else if (!z8) {
            this.f36128G0.post(new L.a(this, d2, 12));
        } else {
            this.f36128G0.Y(d2 + 3);
            this.f36128G0.post(new L.a(this, d2, 12));
        }
    }

    public final void D(int i) {
        this.f36125D0 = i;
        if (i == 2) {
            this.f36127F0.getLayoutManager().n0(this.C0.f36164v - ((y) this.f36127F0.getAdapter()).f36184c.f36124B0.f36098n.f36164v);
            this.f36131J0.setVisibility(0);
            this.f36132K0.setVisibility(8);
            this.f36129H0.setVisibility(8);
            this.f36130I0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f36131J0.setVisibility(8);
            this.f36132K0.setVisibility(0);
            this.f36129H0.setVisibility(0);
            this.f36130I0.setVisibility(0);
            C(this.C0);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f5180y;
        }
        this.f36123A0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f36124B0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.C0 = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i4;
        C5058u c5058u;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(d(), this.f36123A0);
        this.f36126E0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f36124B0.f36098n;
        if (m.G(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = C5284R.layout.mtrl_calendar_vertical;
            i4 = 1;
        } else {
            i = C5284R.layout.mtrl_calendar_horizontal;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = y().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5284R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C5284R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C5284R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(C5284R.dimen.mtrl_calendar_days_of_week_height);
        int i9 = p.f36169d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(C5284R.dimen.mtrl_calendar_month_vertical_padding) * (i9 - 1)) + (resources.getDimensionPixelSize(C5284R.dimen.mtrl_calendar_day_height) * i9) + resources.getDimensionPixelOffset(C5284R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(C5284R.id.mtrl_calendar_days_of_week);
        X.o(gridView, new U.h(2));
        int i10 = this.f36124B0.f36102x;
        gridView.setAdapter((ListAdapter) (i10 > 0 ? new e(i10) : new e()));
        gridView.setNumColumns(oVar.f36165w);
        gridView.setEnabled(false);
        this.f36128G0 = (RecyclerView) inflate.findViewById(C5284R.id.mtrl_calendar_months);
        this.f36128G0.setLayoutManager(new g(this, i4, i4));
        this.f36128G0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f36124B0, new I0.j(21, this));
        this.f36128G0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(C5284R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(C5284R.id.mtrl_calendar_year_selector_frame);
        this.f36127F0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f36127F0.setLayoutManager(new GridLayoutManager(integer));
            this.f36127F0.setAdapter(new y(this));
            this.f36127F0.g(new h(this));
        }
        if (inflate.findViewById(C5284R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C5284R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            X.o(materialButton, new G0.f(1, this));
            View findViewById = inflate.findViewById(C5284R.id.month_navigation_previous);
            this.f36129H0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(C5284R.id.month_navigation_next);
            this.f36130I0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f36131J0 = inflate.findViewById(C5284R.id.mtrl_calendar_year_selector_frame);
            this.f36132K0 = inflate.findViewById(C5284R.id.mtrl_calendar_day_selector_frame);
            D(1);
            materialButton.setText(this.C0.c());
            this.f36128G0.h(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f36130I0.setOnClickListener(new f(this, sVar, 1));
            this.f36129H0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.G(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c5058u = new C5058u()).f40795a) != (recyclerView = this.f36128G0)) {
            C5034S c5034s = c5058u.f40796b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f5342K0;
                if (arrayList != null) {
                    arrayList.remove(c5034s);
                }
                c5058u.f40795a.setOnFlingListener(null);
            }
            c5058u.f40795a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c5058u.f40795a.h(c5034s);
                c5058u.f40795a.setOnFlingListener(c5058u);
                new Scroller(c5058u.f40795a.getContext(), new DecelerateInterpolator());
                c5058u.f();
            }
        }
        this.f36128G0.Y(sVar.f36178c.f36098n.d(this.C0));
        X.o(this.f36128G0, new U.h(3));
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f36123A0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f36124B0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.C0);
    }
}
