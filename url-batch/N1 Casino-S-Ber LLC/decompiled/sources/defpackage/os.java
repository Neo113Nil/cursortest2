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
import com.derinko.gbini.n1casino.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.e;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class os<S> extends sw {
    public int Z;
    public c9 a0;
    public ju b0;
    public int c0;
    public a6 d0;
    public RecyclerView e0;
    public RecyclerView f0;
    public View g0;
    public View h0;
    public View i0;
    public View j0;
    public MaterialButton k0;
    public AccessibilityManager l0;
    public ow m0;
    public boolean n0;

    public static boolean J(os osVar, boolean z) {
        ju juVar;
        if (osVar.n0) {
            return false;
        }
        if (osVar.f0.getScrollState() != 0) {
            return true;
        }
        e eVar = (e) osVar.f0.getAdapter();
        if (eVar == null || (juVar = osVar.b0) == null) {
            return false;
        }
        int h = eVar.h(juVar) + (z ? 1 : -1);
        if (h < 0 || h >= eVar.d.l) {
            return false;
        }
        eVar.i = z ? 2 : 1;
        osVar.K(eVar.g(h));
        return true;
    }

    @Override // defpackage.sw
    public final void I(dh dhVar) {
        this.Y.add(dhVar);
    }

    public final void K(ju juVar) {
        e eVar = (e) this.f0.getAdapter();
        int h = eVar.h(juVar);
        AccessibilityManager accessibilityManager = this.l0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int h2 = h - eVar.h(this.b0);
            boolean z = Math.abs(h2) > 3;
            boolean z2 = h2 > 0;
            this.b0 = juVar;
            int i = 2;
            if (z && z2) {
                this.f0.b0(h - 3);
                this.f0.post(new d9(h, i, this));
            } else {
                RecyclerView recyclerView = this.f0;
                if (z) {
                    recyclerView.b0(h + 3);
                    this.f0.post(new d9(h, i, this));
                } else {
                    recyclerView.post(new d9(h, i, this));
                }
            }
        } else {
            this.b0 = juVar;
            this.f0.b0(h);
        }
        N();
        O(h);
    }

    public final void L(int i) {
        this.c0 = i;
        if (i == 2) {
            this.e0.getLayoutManager().o0(this.b0.h - ((yb0) this.e0.getAdapter()).d.a0.f.h);
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
            x80.n(view, l(R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            x80.n(view, l(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void N() {
        ju juVar;
        e eVar = (e) this.f0.getAdapter();
        if (eVar != null) {
            qy qyVar = eVar.a;
            if (this.n0 || (juVar = this.b0) == null || juVar.equals(eVar.h)) {
                return;
            }
            int h = eVar.h(eVar.h);
            eVar.h = juVar;
            int h2 = eVar.h(juVar);
            qyVar.c(h, 1);
            qyVar.c(h2, 1);
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

    @Override // defpackage.mk
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            t8.c();
            return;
        }
        this.a0 = (c9) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.b0 = (ju) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            t8.c();
        }
    }

    @Override // defpackage.mk
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.Z);
        int i3 = 3;
        this.d0 = new a6(contextThemeWrapper, 3);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.l0 = (AccessibilityManager) E().getSystemService("accessibility");
        ju juVar = this.a0.f;
        boolean N = xs.N(contextThemeWrapper, android.R.attr.windowFullscreen);
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
        int i6 = ku.i;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i6 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i6) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        x80.m(gridView, new js(i4));
        int i7 = this.a0.j;
        gridView.setAdapter((ListAdapter) (i7 > 0 ? new he(i7) : new he()));
        gridView.setNumColumns(juVar.i);
        gridView.setEnabled(false);
        this.f0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f0.setLayoutManager(new ks(this, i2, i2));
        this.f0.setTag("MONTHS_VIEW_GROUP_TAG");
        e eVar = new e(contextThemeWrapper, this.a0, new ls(this), new ls(this));
        this.f0.setAdapter(eVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.e0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.e0.setLayoutManager(new GridLayoutManager(integer));
            this.e0.setAdapter(new yb0(this));
            RecyclerView recyclerView2 = this.e0;
            ms msVar = new ms();
            p70.c(null);
            p70.c(null);
            recyclerView2.g(msVar);
        }
        if (!this.n0) {
            ow owVar = new ow();
            this.m0 = owVar;
            RecyclerView recyclerView3 = this.f0;
            RecyclerView recyclerView4 = owVar.a;
            if (recyclerView4 != recyclerView3) {
                z20 z20Var = owVar.b;
                if (recyclerView4 != null) {
                    ArrayList arrayList = recyclerView4.n0;
                    if (arrayList != null) {
                        arrayList.remove(z20Var);
                    }
                    owVar.a.setOnFlingListener(null);
                }
                owVar.a = recyclerView3;
                if (recyclerView3 != null) {
                    if (recyclerView3.getOnFlingListener() != null) {
                        t8.t("An instance of OnFlingListener already set.");
                        return null;
                    }
                    owVar.a.h(z20Var);
                    owVar.a.setOnFlingListener(owVar);
                    new Scroller(owVar.a.getContext(), new DecelerateInterpolator());
                    owVar.f();
                }
            }
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.k0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            x80.m(this.k0, new o7(4, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.g0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            l60.a(this.g0, l(R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.h0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            l60.a(this.h0, l(R.string.mtrl_picker_next_month_tooltip));
            this.i0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.j0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            L(1);
            this.k0.setText(this.b0.c());
            this.f0.h(new ns(this, eVar));
            this.k0.setOnClickListener(new u0(i3, this));
            this.h0.setOnClickListener(new is(this, eVar, i4));
            this.g0.setOnClickListener(new is(this, eVar, i5));
            O(eVar.h(this.b0));
        }
        this.f0.b0(eVar.h(this.b0));
        x80.m(this.f0, new js(i5));
        M(inflate);
        return inflate;
    }

    @Override // defpackage.mk
    public final void y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.b0);
    }
}
