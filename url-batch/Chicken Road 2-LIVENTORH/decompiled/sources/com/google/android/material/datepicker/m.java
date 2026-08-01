package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import f1.e1;
import java.util.ArrayList;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m<S> extends w {
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public b f923a0;

    /* renamed from: b0, reason: collision with root package name */
    public r f924b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f925c0;
    public c d0;

    /* renamed from: e0, reason: collision with root package name */
    public RecyclerView f926e0;

    /* renamed from: f0, reason: collision with root package name */
    public RecyclerView f927f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f928g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f929h0;
    public View i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f930j0;

    /* renamed from: k0, reason: collision with root package name */
    public MaterialButton f931k0;

    /* renamed from: l0, reason: collision with root package name */
    public AccessibilityManager f932l0;

    public final void G(r rVar) {
        v vVar = (v) this.f927f0.getAdapter();
        int d = vVar.d.f903f.d(rVar);
        AccessibilityManager accessibilityManager = this.f932l0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int d3 = d - vVar.d.f903f.d(this.f924b0);
            boolean z3 = Math.abs(d3) > 3;
            boolean z4 = d3 > 0;
            this.f924b0 = rVar;
            if (z3 && z4) {
                this.f927f0.Z(d - 3);
                this.f927f0.post(new androidx.emoji2.text.j(d, 1, this));
            } else if (z3) {
                this.f927f0.Z(d + 3);
                this.f927f0.post(new androidx.emoji2.text.j(d, 1, this));
            } else {
                this.f927f0.post(new androidx.emoji2.text.j(d, 1, this));
            }
        } else {
            this.f924b0 = rVar;
            this.f927f0.Z(d);
        }
        I(d);
    }

    public final void H(int i) {
        this.f925c0 = i;
        if (i == 2) {
            this.f926e0.getLayoutManager().o0(this.f924b0.f957h - ((b0) this.f926e0.getAdapter()).d.f923a0.f903f.f957h);
            this.i0.setVisibility(0);
            this.f930j0.setVisibility(8);
            this.f928g0.setVisibility(8);
            this.f929h0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.i0.setVisibility(8);
            this.f930j0.setVisibility(0);
            this.f928g0.setVisibility(0);
            this.f929h0.setVisibility(0);
            G(this.f924b0);
        }
    }

    public final void I(int i) {
        this.f929h0.setEnabled(i + 1 < this.f927f0.getAdapter().a());
        this.f928g0.setEnabled(i - 1 >= 0);
    }

    @Override // androidx.fragment.app.u
    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.f539k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f923a0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f924b0 = (r) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i4;
        f1.z zVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.Z);
        this.d0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f932l0 = (AccessibilityManager) C().getSystemService("accessibility");
        r rVar = this.f923a0.f903f;
        if (p.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.oriondriftchasers.arordrft.R.layout.mtrl_calendar_vertical;
            i4 = 1;
        } else {
            i = com.oriondriftchasers.arordrft.R.layout.mtrl_calendar_horizontal;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = s.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.oriondriftchasers.arordrft.R.id.mtrl_calendar_days_of_week);
        l0.m(gridView, new g(0));
        int i6 = this.f923a0.f906j;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new e(i6) : new e()));
        gridView.setNumColumns(rVar.i);
        gridView.setEnabled(false);
        this.f927f0 = (RecyclerView) inflate.findViewById(com.oriondriftchasers.arordrft.R.id.mtrl_calendar_months);
        this.f927f0.setLayoutManager(new h(this, i4, i4));
        this.f927f0.setTag("MONTHS_VIEW_GROUP_TAG");
        v vVar = new v(contextThemeWrapper, this.f923a0, new a0.a(8, this));
        this.f927f0.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.oriondriftchasers.arordrft.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.oriondriftchasers.arordrft.R.id.mtrl_calendar_year_selector_frame);
        this.f926e0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f926e0.setLayoutManager(new GridLayoutManager(integer));
            this.f926e0.setAdapter(new b0(this));
            RecyclerView recyclerView4 = this.f926e0;
            i iVar = new i();
            z.c(null);
            z.c(null);
            recyclerView4.g(iVar);
        }
        View findViewById = inflate.findViewById(com.oriondriftchasers.arordrft.R.id.month_navigation_fragment_toggle);
        b bVar = vVar.d;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.oriondriftchasers.arordrft.R.id.month_navigation_fragment_toggle);
            this.f931k0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            l0.m(this.f931k0, new j(0, this));
            View findViewById2 = inflate.findViewById(com.oriondriftchasers.arordrft.R.id.month_navigation_previous);
            this.f928g0 = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(com.oriondriftchasers.arordrft.R.id.month_navigation_next);
            this.f929h0 = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.i0 = inflate.findViewById(com.oriondriftchasers.arordrft.R.id.mtrl_calendar_year_selector_frame);
            this.f930j0 = inflate.findViewById(com.oriondriftchasers.arordrft.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            this.f931k0.setText(this.f924b0.c());
            this.f927f0.h(new k(this, vVar));
            this.f931k0.setOnClickListener(new l(0, this));
            this.f929h0.setOnClickListener(new f(this, vVar, 1));
            this.f928g0.setOnClickListener(new f(this, vVar, 0));
            I(bVar.f903f.d(this.f924b0));
        }
        if (!p.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (zVar = new f1.z()).f1548a) != (recyclerView = this.f927f0)) {
            e1 e1Var = zVar.f1549b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f676m0;
                if (arrayList != null) {
                    arrayList.remove(e1Var);
                }
                zVar.f1548a.setOnFlingListener(null);
            }
            zVar.f1548a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                zVar.f1548a.h(e1Var);
                zVar.f1548a.setOnFlingListener(zVar);
                new Scroller(zVar.f1548a.getContext(), new DecelerateInterpolator());
                zVar.f();
            }
        }
        this.f927f0.Z(bVar.f903f.d(this.f924b0));
        l0.m(this.f927f0, new g(1));
        return inflate;
    }

    @Override // androidx.fragment.app.u
    public final void w(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f923a0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f924b0);
    }
}
