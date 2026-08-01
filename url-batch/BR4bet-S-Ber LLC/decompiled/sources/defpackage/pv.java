package defpackage;

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
import com.google.android.material.datepicker.e;
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class pv<S> extends wz {
    public int Z;
    public p9 a0;
    public kx b0;
    public int c0;
    public k6 d0;
    public RecyclerView e0;
    public RecyclerView f0;
    public View g0;
    public View h0;
    public View i0;
    public View j0;
    public MaterialButton k0;
    public AccessibilityManager l0;
    public sz m0;
    public boolean n0;

    public static boolean J(pv pvVar, boolean z) {
        kx kxVar;
        if (pvVar.n0) {
            return false;
        }
        if (pvVar.f0.getScrollState() != 0) {
            return true;
        }
        e eVar = (e) pvVar.f0.getAdapter();
        if (eVar == null || (kxVar = pvVar.b0) == null) {
            return false;
        }
        int f = eVar.f(kxVar) + (z ? 1 : -1);
        if (f < 0 || f >= eVar.d.l) {
            return false;
        }
        eVar.i = z ? 2 : 1;
        pvVar.K(eVar.e(f));
        return true;
    }

    @Override // defpackage.wz
    public final void I(ej ejVar) {
        this.Y.add(ejVar);
    }

    public final void K(kx kxVar) {
        e eVar = (e) this.f0.getAdapter();
        int f = eVar.f(kxVar);
        AccessibilityManager accessibilityManager = this.l0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int f2 = f - eVar.f(this.b0);
            boolean z = Math.abs(f2) > 3;
            boolean z2 = f2 > 0;
            this.b0 = kxVar;
            int i = 2;
            if (z && z2) {
                this.f0.Z(f - 3);
                this.f0.post(new q9(f, i, this));
            } else {
                RecyclerView recyclerView = this.f0;
                if (z) {
                    recyclerView.Z(f + 3);
                    this.f0.post(new q9(f, i, this));
                } else {
                    recyclerView.post(new q9(f, i, this));
                }
            }
        } else {
            this.b0 = kxVar;
            this.f0.Z(f);
        }
        N();
        O(f);
    }

    public final void L(int i) {
        this.c0 = i;
        if (i == 2) {
            this.e0.getLayoutManager().o0(this.b0.h - ((gf0) this.e0.getAdapter()).d.a0.f.h);
            this.i0.setVisibility(0);
            this.j0.setVisibility(8);
            this.g0.setVisibility(8);
            this.h0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.i0.setVisibility(8);
            this.j0.setVisibility(0);
            this.g0.setVisibility(0);
            this.h0.setVisibility(0);
            K(this.b0);
        }
    }

    public final void M(View view) {
        if (view == null) {
            return;
        }
        int i = this.c0;
        if (i == 2) {
            ic0.n(view, k(R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            ic0.n(view, k(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void N() {
        kx kxVar;
        e eVar = (e) this.f0.getAdapter();
        if (eVar != null) {
            u10 u10Var = eVar.a;
            if (this.n0 || (kxVar = this.b0) == null || kxVar.equals(eVar.h)) {
                return;
            }
            int f = eVar.f(eVar.h);
            eVar.h = kxVar;
            int f2 = eVar.f(kxVar);
            u10Var.c(f, 1);
            u10Var.c(f2, 1);
        }
    }

    public final void O(int i) {
        View view = this.h0;
        if (view != null) {
            view.setEnabled(i + 1 < this.f0.getAdapter().a());
        }
        View view2 = this.g0;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // defpackage.pm
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            g9.b();
            return;
        }
        this.a0 = (p9) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.b0 = (kx) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            g9.b();
        }
    }

    @Override // defpackage.pm
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.Z);
        int i3 = 3;
        this.d0 = new k6(contextThemeWrapper, 3);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.l0 = (AccessibilityManager) E().getSystemService("accessibility");
        kx kxVar = this.a0.f;
        boolean N = yv.N(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.n0 = N;
        int i4 = 0;
        int i5 = 1;
        if (N) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = E().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i6 = lx.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i6 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i6) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ic0.m(gridView, new kv(0));
        int i7 = this.a0.j;
        gridView.setAdapter((ListAdapter) (i7 > 0 ? new vf(i7) : new vf()));
        gridView.setNumColumns(kxVar.i);
        gridView.setEnabled(false);
        this.f0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f0.setLayoutManager(new lv(this, i2, i2));
        this.f0.setTag("MONTHS_VIEW_GROUP_TAG");
        e eVar = new e(contextThemeWrapper, this.a0, new mv(this), new mv(this));
        this.f0.setAdapter(eVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.e0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.e0.setLayoutManager(new GridLayoutManager(integer));
            this.e0.setAdapter(new gf0(this));
            RecyclerView recyclerView2 = this.e0;
            nv nvVar = new nv();
            za0.c(null);
            za0.c(null);
            recyclerView2.g(nvVar);
        }
        if (!this.n0) {
            sz szVar = new sz();
            this.m0 = szVar;
            RecyclerView recyclerView3 = this.f0;
            RecyclerView recyclerView4 = szVar.a;
            if (recyclerView4 != recyclerView3) {
                b60 b60Var = szVar.b;
                if (recyclerView4 != null) {
                    ArrayList arrayList = recyclerView4.m0;
                    if (arrayList != null) {
                        arrayList.remove(b60Var);
                    }
                    szVar.a.setOnFlingListener(null);
                }
                szVar.a = recyclerView3;
                if (recyclerView3 != null) {
                    if (recyclerView3.getOnFlingListener() != null) {
                        g9.s("An instance of OnFlingListener already set.");
                        return null;
                    }
                    szVar.a.h(b60Var);
                    szVar.a.setOnFlingListener(szVar);
                    new Scroller(szVar.a.getContext(), new DecelerateInterpolator());
                    szVar.f();
                }
            }
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.k0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ic0.m(this.k0, new a8(4, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.g0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            t90.a(this.g0, k(R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.h0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            t90.a(this.h0, k(R.string.mtrl_picker_next_month_tooltip));
            this.i0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.j0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            L(1);
            this.k0.setText(this.b0.c());
            this.f0.h(new ov(this, eVar));
            this.k0.setOnClickListener(new v0(i3, this));
            this.h0.setOnClickListener(new jv(this, eVar, i4));
            this.g0.setOnClickListener(new jv(this, eVar, i5));
            O(eVar.f(this.b0));
        }
        this.f0.Z(eVar.f(this.b0));
        ic0.m(this.f0, new kv(1));
        M(inflate);
        return inflate;
    }

    @Override // defpackage.pm
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.b0);
    }
}
