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
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class s00<S> extends n50 {
    public int Z;
    public ca a0;
    public o20 b0;
    public a c0;
    public s6 d0;
    public RecyclerView e0;
    public RecyclerView f0;
    public View g0;
    public View h0;
    public View i0;
    public View j0;
    public MaterialButton k0;
    public AccessibilityManager l0;
    public j50 m0;
    public boolean n0;

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public enum a {
        DAY,
        YEAR
    }

    public static boolean J(s00 s00Var, boolean z) {
        o20 o20Var;
        if (s00Var.n0) {
            return false;
        }
        if (s00Var.f0.getScrollState() != 0) {
            return true;
        }
        e eVar = (e) s00Var.f0.getAdapter();
        if (eVar == null || (o20Var = s00Var.b0) == null) {
            return false;
        }
        int f = eVar.f(o20Var) + (z ? 1 : -1);
        if (f < 0 || f >= eVar.d.l) {
            return false;
        }
        eVar.i = z ? 2 : 1;
        s00Var.K(eVar.e(f));
        return true;
    }

    @Override // defpackage.n50
    public final void I(xy xyVar) {
        this.Y.add(xyVar);
    }

    public final void K(o20 o20Var) {
        e eVar = (e) this.f0.getAdapter();
        int f = eVar.f(o20Var);
        AccessibilityManager accessibilityManager = this.l0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int f2 = f - eVar.f(this.b0);
            boolean z = Math.abs(f2) > 3;
            boolean z2 = f2 > 0;
            this.b0 = o20Var;
            int i = 2;
            if (z && z2) {
                this.f0.b0(f - 3);
                this.f0.post(new fa(f, i, this));
            } else {
                RecyclerView recyclerView = this.f0;
                if (z) {
                    recyclerView.b0(f + 3);
                    this.f0.post(new fa(f, i, this));
                } else {
                    recyclerView.post(new fa(f, i, this));
                }
            }
        } else {
            this.b0 = o20Var;
            this.f0.b0(f);
        }
        N();
        O(f);
    }

    public final void L(a aVar) {
        this.c0 = aVar;
        if (aVar == a.YEAR) {
            this.e0.getLayoutManager().o0(this.b0.h - ((lp0) this.e0.getAdapter()).d.a0.f.h);
            this.i0.setVisibility(0);
            this.j0.setVisibility(8);
            this.g0.setVisibility(8);
            this.h0.setVisibility(8);
            return;
        }
        if (aVar == a.DAY) {
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
        a aVar = this.c0;
        if (aVar == a.YEAR) {
            hm0.n(view, k(R.string.mtrl_picker_pane_title_year_view));
        } else if (aVar == a.DAY) {
            hm0.n(view, k(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void N() {
        o20 o20Var;
        e eVar = (e) this.f0.getAdapter();
        if (eVar != null) {
            a80 a80Var = eVar.a;
            if (this.n0 || (o20Var = this.b0) == null || o20Var.equals(eVar.h)) {
                return;
            }
            int f = eVar.f(eVar.h);
            eVar.h = o20Var;
            int f2 = eVar.f(o20Var);
            a80Var.c(f, 1);
            a80Var.c(f2, 1);
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

    @Override // androidx.fragment.app.a
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            s9.c();
            return;
        }
        this.a0 = (ca) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.b0 = (o20) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            s9.c();
        }
    }

    @Override // androidx.fragment.app.a
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.Z);
        int i3 = 3;
        this.d0 = new s6(contextThemeWrapper, 3);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.l0 = (AccessibilityManager) E().getSystemService("accessibility");
        o20 o20Var = this.a0.f;
        boolean N = b10.N(contextThemeWrapper, android.R.attr.windowFullscreen);
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
        int i6 = p20.i;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i6 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i6) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        hm0.m(gridView, new n00(i4));
        int i7 = this.a0.j;
        gridView.setAdapter((ListAdapter) (i7 > 0 ? new zh(i7) : new zh()));
        gridView.setNumColumns(o20Var.i);
        gridView.setEnabled(false);
        this.f0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f0.setLayoutManager(new o00(this, i2, i2));
        this.f0.setTag("MONTHS_VIEW_GROUP_TAG");
        e eVar = new e(contextThemeWrapper, this.a0, new p00(this), new p00(this));
        this.f0.setAdapter(eVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.e0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.e0.setLayoutManager(new GridLayoutManager(integer));
            this.e0.setAdapter(new lp0(this));
            RecyclerView recyclerView2 = this.e0;
            q00 q00Var = new q00();
            xk0.c(null);
            xk0.c(null);
            recyclerView2.g(q00Var);
        }
        if (!this.n0) {
            j50 j50Var = new j50();
            this.m0 = j50Var;
            RecyclerView recyclerView3 = this.f0;
            RecyclerView recyclerView4 = j50Var.a;
            if (recyclerView4 != recyclerView3) {
                ee0 ee0Var = j50Var.b;
                if (recyclerView4 != null) {
                    ArrayList arrayList = recyclerView4.n0;
                    if (arrayList != null) {
                        arrayList.remove(ee0Var);
                    }
                    j50Var.a.setOnFlingListener(null);
                }
                j50Var.a = recyclerView3;
                if (recyclerView3 != null) {
                    if (recyclerView3.getOnFlingListener() != null) {
                        s9.u("An instance of OnFlingListener already set.");
                        return null;
                    }
                    j50Var.a.h(ee0Var);
                    j50Var.a.setOnFlingListener(j50Var);
                    new Scroller(j50Var.a.getContext(), new DecelerateInterpolator());
                    j50Var.f();
                }
            }
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.k0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            hm0.m(this.k0, new m8(4, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.g0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            zi0.a(this.g0, k(R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.h0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            zi0.a(this.h0, k(R.string.mtrl_picker_next_month_tooltip));
            this.i0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.j0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            L(a.DAY);
            this.k0.setText(this.b0.c());
            this.f0.h(new r00(this, eVar));
            this.k0.setOnClickListener(new y0(i3, this));
            this.h0.setOnClickListener(new m00(this, eVar, i4));
            this.g0.setOnClickListener(new m00(this, eVar, i5));
            O(eVar.f(this.b0));
        }
        this.f0.b0(eVar.f(this.b0));
        hm0.m(this.f0, new n00(i5));
        M(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.a
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.b0);
    }
}
