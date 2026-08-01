package com.google.android.material.datepicker;

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
import com.gdmhkmf.belbet.R;
import com.google.android.material.button.MaterialButton;
import g1.m0;
import g1.r0;
import g1.t1;
import java.util.ArrayList;
import l.b3;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q<S> extends d0 {
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public f0 f1086a0;

    /* renamed from: b0, reason: collision with root package name */
    public b f1087b0;

    /* renamed from: c0, reason: collision with root package name */
    public x f1088c0;
    public int d0;

    /* renamed from: e0, reason: collision with root package name */
    public d f1089e0;

    /* renamed from: f0, reason: collision with root package name */
    public RecyclerView f1090f0;

    /* renamed from: g0, reason: collision with root package name */
    public RecyclerView f1091g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f1092h0;
    public View i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f1093j0;

    /* renamed from: k0, reason: collision with root package name */
    public View f1094k0;

    /* renamed from: l0, reason: collision with root package name */
    public MaterialButton f1095l0;

    /* renamed from: m0, reason: collision with root package name */
    public AccessibilityManager f1096m0;

    /* renamed from: n0, reason: collision with root package name */
    public m0 f1097n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1098o0;

    public static boolean H(q qVar, boolean z4) {
        x xVar;
        if (qVar.f1098o0) {
            return false;
        }
        if (qVar.f1091g0.getScrollState() != 0) {
            return true;
        }
        c0 c0Var = (c0) qVar.f1091g0.getAdapter();
        if (c0Var == null || (xVar = qVar.f1088c0) == null) {
            return false;
        }
        int f5 = c0Var.f(xVar) + (z4 ? 1 : -1);
        if (f5 < 0 || f5 >= c0Var.d.f1037l) {
            return false;
        }
        c0Var.f1048j = z4 ? 2 : 1;
        qVar.I(c0Var.e(f5));
        return true;
    }

    @Override // com.google.android.material.datepicker.d0
    public final void G(u uVar) {
        this.Y.add(uVar);
    }

    public final void I(x xVar) {
        c0 c0Var = (c0) this.f1091g0.getAdapter();
        int f5 = c0Var.f(xVar);
        AccessibilityManager accessibilityManager = this.f1096m0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int f6 = f5 - c0Var.f(this.f1088c0);
            boolean z4 = Math.abs(f6) > 3;
            boolean z5 = f6 > 0;
            this.f1088c0 = xVar;
            if (z4 && z5) {
                this.f1091g0.g0(f5 - 3);
                this.f1091g0.post(new androidx.emoji2.text.j(f5, 1, this));
            } else if (z4) {
                this.f1091g0.g0(f5 + 3);
                this.f1091g0.post(new androidx.emoji2.text.j(f5, 1, this));
            } else {
                this.f1091g0.post(new androidx.emoji2.text.j(f5, 1, this));
            }
        } else {
            this.f1088c0 = xVar;
            this.f1091g0.g0(f5);
        }
        L();
        M(f5);
    }

    public final void J(int i) {
        this.d0 = i;
        if (i == 2) {
            this.f1090f0.getLayoutManager().q0(this.f1088c0.h - ((l0) this.f1090f0.getAdapter()).d.f1087b0.f1033f.h);
            this.f1093j0.setVisibility(0);
            this.f1094k0.setVisibility(8);
            this.f1092h0.setVisibility(8);
            this.i0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1093j0.setVisibility(8);
            this.f1094k0.setVisibility(0);
            this.f1092h0.setVisibility(0);
            this.i0.setVisibility(0);
            I(this.f1088c0);
        }
    }

    public final void K(View view) {
        if (view == null) {
            return;
        }
        int i = this.d0;
        if (i == 2) {
            p0.n(view, k(R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            p0.n(view, k(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void L() {
        x xVar;
        c0 c0Var = (c0) this.f1091g0.getAdapter();
        if (c0Var != null) {
            r0 r0Var = c0Var.f1764a;
            if (this.f1098o0 || (xVar = this.f1088c0) == null || xVar.equals(c0Var.i)) {
                return;
            }
            int f5 = c0Var.f(c0Var.i);
            c0Var.i = xVar;
            int f6 = c0Var.f(xVar);
            r0Var.d(f5, 1);
            r0Var.d(f6, 1);
        }
    }

    public final void M(int i) {
        View view = this.i0;
        if (view != null) {
            view.setEnabled(i + 1 < this.f1091g0.getAdapter().a());
        }
        View view2 = this.f1092h0;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // androidx.fragment.app.u
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f647k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        this.f1086a0 = (f0) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f1087b0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1088c0 = (x) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.u
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i4;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.Z);
        this.f1089e0 = new d(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f1096m0 = (AccessibilityManager) C().getSystemService("accessibility");
        x xVar = this.f1087b0.f1033f;
        boolean L = v.L(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.f1098o0 = L;
        if (L) {
            i = R.layout.mtrl_calendar_vertical;
            i4 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = y.f1127f;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        p0.m(gridView, new j(0));
        int i6 = this.f1087b0.f1035j;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new h(i6) : new h()));
        gridView.setNumColumns(xVar.i);
        gridView.setEnabled(false);
        this.f1091g0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f1091g0.setLayoutManager(new k(this, i4, i4));
        this.f1091g0.setTag("MONTHS_VIEW_GROUP_TAG");
        c0 c0Var = new c0(contextThemeWrapper, this.f1086a0, this.f1087b0, new l(this), new l(this));
        this.f1091g0.setAdapter(c0Var);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f1090f0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f1090f0.setLayoutManager(new GridLayoutManager(integer));
            this.f1090f0.setAdapter(new l0(this));
            this.f1090f0.i(new m(this));
        }
        if (!this.f1098o0) {
            m0 m0Var = new m0();
            this.f1097n0 = m0Var;
            RecyclerView recyclerView2 = this.f1091g0;
            RecyclerView recyclerView3 = m0Var.f1717a;
            if (recyclerView3 != recyclerView2) {
                t1 t1Var = m0Var.f1718b;
                if (recyclerView3 != null) {
                    ArrayList arrayList = recyclerView3.f779n0;
                    if (arrayList != null) {
                        arrayList.remove(t1Var);
                    }
                    m0Var.f1717a.setOnFlingListener(null);
                }
                m0Var.f1717a = recyclerView2;
                if (recyclerView2 != null) {
                    if (recyclerView2.getOnFlingListener() != null) {
                        throw new IllegalStateException("An instance of OnFlingListener already set.");
                    }
                    m0Var.f1717a.j(t1Var);
                    m0Var.f1717a.setOnFlingListener(m0Var);
                    new Scroller(m0Var.f1717a.getContext(), new DecelerateInterpolator());
                    m0Var.f();
                }
            }
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.f1095l0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            p0.m(this.f1095l0, new n(0, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f1092h0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            b3.a(this.f1092h0, k(R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.i0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            b3.a(this.i0, k(R.string.mtrl_picker_next_month_tooltip));
            this.f1093j0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f1094k0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            J(1);
            this.f1095l0.setText(this.f1088c0.d());
            this.f1091g0.j(new o(this, c0Var));
            int i7 = 0;
            this.f1095l0.setOnClickListener(new p(i7, this));
            this.i0.setOnClickListener(new i(this, c0Var, i7));
            this.f1092h0.setOnClickListener(new i(this, c0Var, 1));
            M(c0Var.f(this.f1088c0));
        }
        this.f1091g0.g0(c0Var.f(this.f1088c0));
        p0.m(this.f1091g0, new j(1));
        K(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.u
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f1086a0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1087b0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1088c0);
    }
}
