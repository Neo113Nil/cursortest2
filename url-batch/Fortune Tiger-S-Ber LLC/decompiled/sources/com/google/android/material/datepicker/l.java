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
import b1.f0;
import b1.f1;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import k.a3;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l<S> extends x {
    public int Z;
    public b a0;

    /* renamed from: b0, reason: collision with root package name */
    public r f1292b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1293c0;

    /* renamed from: d0, reason: collision with root package name */
    public androidx.emoji2.text.s f1294d0;

    /* renamed from: e0, reason: collision with root package name */
    public RecyclerView f1295e0;
    public RecyclerView f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f1296g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f1297h0;

    /* renamed from: i0, reason: collision with root package name */
    public View f1298i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f1299j0;

    /* renamed from: k0, reason: collision with root package name */
    public MaterialButton f1300k0;

    /* renamed from: l0, reason: collision with root package name */
    public AccessibilityManager f1301l0;

    /* renamed from: m0, reason: collision with root package name */
    public b1.a0 f1302m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f1303n0;

    public static boolean H(l lVar, boolean z3) {
        r rVar;
        if (lVar.f1303n0) {
            return false;
        }
        if (lVar.f0.getScrollState() != 0) {
            return true;
        }
        w wVar = (w) lVar.f0.getAdapter();
        if (wVar == null || (rVar = lVar.f1292b0) == null) {
            return false;
        }
        int f4 = wVar.f(rVar) + (z3 ? 1 : -1);
        if (f4 < 0 || f4 >= wVar.f1337d.f1280l) {
            return false;
        }
        wVar.f1340i = z3 ? 2 : 1;
        lVar.I(wVar.e(f4));
        return true;
    }

    @Override // com.google.android.material.datepicker.x
    public final void G(g2.f fVar) {
        this.Y.add(fVar);
    }

    public final void I(r rVar) {
        w wVar = (w) this.f0.getAdapter();
        int f4 = wVar.f(rVar);
        AccessibilityManager accessibilityManager = this.f1301l0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int f5 = f4 - wVar.f(this.f1292b0);
            boolean z3 = Math.abs(f5) > 3;
            boolean z4 = f5 > 0;
            this.f1292b0 = rVar;
            if (z3 && z4) {
                this.f0.Z(f4 - 3);
                this.f0.post(new androidx.emoji2.text.j(f4, 1, this));
            } else if (z3) {
                this.f0.Z(f4 + 3);
                this.f0.post(new androidx.emoji2.text.j(f4, 1, this));
            } else {
                this.f0.post(new androidx.emoji2.text.j(f4, 1, this));
            }
        } else {
            this.f1292b0 = rVar;
            this.f0.Z(f4);
        }
        L();
        M(f4);
    }

    public final void J(int i4) {
        this.f1293c0 = i4;
        if (i4 == 2) {
            this.f1295e0.getLayoutManager().o0(this.f1292b0.h - ((c0) this.f1295e0.getAdapter()).f1283d.a0.f1276f.h);
            this.f1298i0.setVisibility(0);
            this.f1299j0.setVisibility(8);
            this.f1296g0.setVisibility(8);
            this.f1297h0.setVisibility(8);
            return;
        }
        if (i4 == 1) {
            this.f1298i0.setVisibility(8);
            this.f1299j0.setVisibility(0);
            this.f1296g0.setVisibility(0);
            this.f1297h0.setVisibility(0);
            I(this.f1292b0);
        }
    }

    public final void K(View view) {
        if (view == null) {
            return;
        }
        int i4 = this.f1293c0;
        if (i4 == 2) {
            j0.n(view, k(R.string.mtrl_picker_pane_title_year_view));
        } else if (i4 == 1) {
            j0.n(view, k(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void L() {
        r rVar;
        w wVar = (w) this.f0.getAdapter();
        if (wVar != null) {
            f0 f0Var = wVar.f771a;
            if (this.f1303n0 || (rVar = this.f1292b0) == null || rVar.equals(wVar.h)) {
                return;
            }
            int f4 = wVar.f(wVar.h);
            wVar.h = rVar;
            int f5 = wVar.f(rVar);
            f0Var.b(f4);
            f0Var.b(f5);
        }
    }

    public final void M(int i4) {
        View view = this.f1297h0;
        if (view != null) {
            view.setEnabled(i4 + 1 < this.f0.getAdapter().a());
        }
        View view2 = this.f1296g0;
        if (view2 != null) {
            view2.setEnabled(i4 - 1 >= 0);
        }
    }

    @Override // androidx.fragment.app.u
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f523k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.a0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1292b0 = (r) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.u
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i4;
        int i5;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.Z);
        this.f1294d0 = new androidx.emoji2.text.s(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f1301l0 = (AccessibilityManager) C().getSystemService("accessibility");
        r rVar = this.a0.f1276f;
        boolean J = p.J(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.f1303n0 = J;
        if (J) {
            i4 = R.layout.mtrl_calendar_vertical;
            i5 = 1;
        } else {
            i4 = R.layout.mtrl_calendar_horizontal;
            i5 = 0;
        }
        View inflate = cloneInContext.inflate(i4, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i6 = s.f1329d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i6 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i6) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        j0.m(gridView, new f(0));
        int i7 = this.a0.f1278j;
        gridView.setAdapter((ListAdapter) (i7 > 0 ? new d(i7) : new d()));
        gridView.setNumColumns(rVar.f1325i);
        gridView.setEnabled(false);
        this.f0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f0.setLayoutManager(new g(this, i5, i5));
        this.f0.setTag("MONTHS_VIEW_GROUP_TAG");
        w wVar = new w(contextThemeWrapper, this.a0, new h(this), new h(this));
        this.f0.setAdapter(wVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f1295e0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f1295e0.setLayoutManager(new GridLayoutManager(integer));
            this.f1295e0.setAdapter(new c0(this));
            RecyclerView recyclerView2 = this.f1295e0;
            i iVar = new i();
            a0.c(null);
            a0.c(null);
            recyclerView2.g(iVar);
        }
        if (!this.f1303n0) {
            b1.a0 a0Var = new b1.a0();
            this.f1302m0 = a0Var;
            RecyclerView recyclerView3 = this.f0;
            RecyclerView recyclerView4 = a0Var.f729a;
            if (recyclerView4 != recyclerView3) {
                f1 f1Var = a0Var.f730b;
                if (recyclerView4 != null) {
                    ArrayList arrayList = recyclerView4.f644m0;
                    if (arrayList != null) {
                        arrayList.remove(f1Var);
                    }
                    a0Var.f729a.setOnFlingListener(null);
                }
                a0Var.f729a = recyclerView3;
                if (recyclerView3 != null) {
                    if (recyclerView3.getOnFlingListener() != null) {
                        throw new IllegalStateException("An instance of OnFlingListener already set.");
                    }
                    a0Var.f729a.h(f1Var);
                    a0Var.f729a.setOnFlingListener(a0Var);
                    new Scroller(a0Var.f729a.getContext(), new DecelerateInterpolator());
                    a0Var.f();
                }
            }
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.f1300k0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            j0.m(this.f1300k0, new a2.a(2, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f1296g0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            a3.a(this.f1296g0, k(R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f1297h0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            a3.a(this.f1297h0, k(R.string.mtrl_picker_next_month_tooltip));
            this.f1298i0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f1299j0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            J(1);
            this.f1300k0.setText(this.f1292b0.c());
            this.f0.h(new j(this, wVar));
            int i8 = 0;
            this.f1300k0.setOnClickListener(new k(i8, this));
            this.f1297h0.setOnClickListener(new e(this, wVar, i8));
            this.f1296g0.setOnClickListener(new e(this, wVar, 1));
            M(wVar.f(this.f1292b0));
        }
        this.f0.Z(wVar.f(this.f1292b0));
        j0.m(this.f0, new f(1));
        K(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.u
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1292b0);
    }
}
