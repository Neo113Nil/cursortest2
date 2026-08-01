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
import com.awerser.monnit.betplay.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.e;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ct<S> extends fx {
    public int g;
    public x8 h;
    public yu i;
    public int j;
    public r6 k;
    public RecyclerView l;
    public RecyclerView m;
    public View n;
    public View o;
    public View p;
    public View q;
    public MaterialButton r;
    public AccessibilityManager s;
    public bx t;
    public boolean u;

    public static boolean g(ct ctVar, boolean z) {
        yu yuVar;
        if (ctVar.u) {
            return false;
        }
        if (ctVar.m.getScrollState() != 0) {
            return true;
        }
        e eVar = (e) ctVar.m.getAdapter();
        if (eVar == null || (yuVar = ctVar.i) == null) {
            return false;
        }
        int f = eVar.f(yuVar) + (z ? 1 : -1);
        if (f < 0 || f >= eVar.d.l) {
            return false;
        }
        eVar.i = z ? 2 : 1;
        ctVar.h(eVar.e(f));
        return true;
    }

    @Override // defpackage.fx
    public final void f(vg vgVar) {
        this.f.add(vgVar);
    }

    public final void h(yu yuVar) {
        e eVar = (e) this.m.getAdapter();
        int f = eVar.f(yuVar);
        AccessibilityManager accessibilityManager = this.s;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int f2 = f - eVar.f(this.i);
            boolean z = Math.abs(f2) > 3;
            boolean z2 = f2 > 0;
            this.i = yuVar;
            int i = 2;
            if (z && z2) {
                this.m.Z(f - 3);
                this.m.post(new y8(f, i, this));
            } else {
                RecyclerView recyclerView = this.m;
                if (z) {
                    recyclerView.Z(f + 3);
                    this.m.post(new y8(f, i, this));
                } else {
                    recyclerView.post(new y8(f, i, this));
                }
            }
        } else {
            this.i = yuVar;
            this.m.Z(f);
        }
        k();
        l(f);
    }

    public final void i(int i) {
        this.j = i;
        if (i == 2) {
            this.l.getLayoutManager().o0(this.i.h - ((hc0) this.l.getAdapter()).d.h.f.h);
            this.p.setVisibility(0);
            this.q.setVisibility(8);
            this.n.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.p.setVisibility(8);
            this.q.setVisibility(0);
            this.n.setVisibility(0);
            this.o.setVisibility(0);
            h(this.i);
        }
    }

    public final void j(View view) {
        if (view == null) {
            return;
        }
        int i = this.j;
        if (i == 2) {
            e90.n(view, getString(R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            e90.n(view, getString(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void k() {
        yu yuVar;
        e eVar = (e) this.m.getAdapter();
        if (eVar != null) {
            gz gzVar = eVar.a;
            if (this.u || (yuVar = this.i) == null || yuVar.equals(eVar.h)) {
                return;
            }
            int f = eVar.f(eVar.h);
            eVar.h = yuVar;
            int f2 = eVar.f(yuVar);
            gzVar.b(f);
            gzVar.b(f2);
        }
    }

    public final void l(int i) {
        View view = this.o;
        if (view != null) {
            view.setEnabled(i + 1 < this.m.getAdapter().a());
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.g = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            o8.c();
            return;
        }
        this.h = (x8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.i = (yu) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            o8.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.g);
        this.k = new r6(contextThemeWrapper, 3);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.s = (AccessibilityManager) requireContext().getSystemService("accessibility");
        yu yuVar = this.h.f;
        boolean i3 = mt.i(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.u = i3;
        int i4 = 0;
        int i5 = 1;
        if (i3) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i6 = zu.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i6 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i6) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        e90.m(gridView, new xs(0));
        int i7 = this.h.j;
        gridView.setAdapter((ListAdapter) (i7 > 0 ? new he(i7) : new he()));
        gridView.setNumColumns(yuVar.i);
        gridView.setEnabled(false);
        this.m = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.m.setLayoutManager(new ys(this, i2, i2));
        this.m.setTag("MONTHS_VIEW_GROUP_TAG");
        e eVar = new e(contextThemeWrapper, this.h, new zs(this), new zs(this));
        this.m.setAdapter(eVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.l = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.l.setLayoutManager(new GridLayoutManager(integer));
            this.l.setAdapter(new hc0(this));
            RecyclerView recyclerView2 = this.l;
            at atVar = new at();
            w70.c(null);
            w70.c(null);
            recyclerView2.g(atVar);
        }
        if (!this.u) {
            bx bxVar = new bx();
            this.t = bxVar;
            RecyclerView recyclerView3 = this.m;
            RecyclerView recyclerView4 = bxVar.a;
            if (recyclerView4 != recyclerView3) {
                k30 k30Var = bxVar.b;
                if (recyclerView4 != null) {
                    ArrayList arrayList = recyclerView4.m0;
                    if (arrayList != null) {
                        arrayList.remove(k30Var);
                    }
                    bxVar.a.setOnFlingListener(null);
                }
                bxVar.a = recyclerView3;
                if (recyclerView3 != null) {
                    if (recyclerView3.getOnFlingListener() != null) {
                        o8.t("An instance of OnFlingListener already set.");
                        return null;
                    }
                    bxVar.a.h(k30Var);
                    bxVar.a.setOnFlingListener(bxVar);
                    new Scroller(bxVar.a.getContext(), new DecelerateInterpolator());
                    bxVar.f();
                }
            }
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.r = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            int i8 = 2;
            e90.m(this.r, new x9(i8, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.n = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            r60.a(this.n, getString(R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.o = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            r60.a(this.o, getString(R.string.mtrl_picker_next_month_tooltip));
            this.p = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.q = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            i(1);
            this.r.setText(this.i.c());
            this.m.h(new bt(this, eVar));
            this.r.setOnClickListener(new w0(i8, this));
            this.o.setOnClickListener(new ws(this, eVar, i4));
            this.n.setOnClickListener(new ws(this, eVar, i5));
            l(eVar.f(this.i));
        }
        this.m.Z(eVar.f(this.i));
        e90.m(this.m, new xs(1));
        j(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.g);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.h);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.i);
    }
}
