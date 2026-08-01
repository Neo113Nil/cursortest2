package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class bo0 extends n9 implements b1 {
    public static final AccelerateInterpolator Q = new AccelerateInterpolator();
    public static final DecelerateInterpolator R = new DecelerateInterpolator();
    public ao0 A;
    public ao0 B;
    public i5 C;
    public boolean D;
    public final ArrayList E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public wm0 K;
    public boolean L;
    public boolean M;
    public final zn0 N;
    public final zn0 O;
    public final kz P;
    public Context s;
    public Context t;
    public ActionBarOverlayLayout u;
    public ActionBarContainer v;
    public ci w;
    public ActionBarContextView x;
    public final View y;
    public boolean z;

    public bo0(Activity activity, boolean z) {
        new ArrayList();
        this.E = new ArrayList();
        this.F = 0;
        this.G = true;
        this.J = true;
        this.N = new zn0(this, 0);
        this.O = new zn0(this, 1);
        this.P = new kz(this);
        View decorView = activity.getWindow().getDecorView();
        X(decorView);
        if (z) {
            return;
        }
        this.y = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.n9
    public final void E() {
        Y(this.s.getResources().getBoolean(com.trembin.nirefon.betfury.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.n9
    public final boolean G(int i, KeyEvent keyEvent) {
        r10 r10Var;
        ao0 ao0Var = this.A;
        if (ao0Var == null || (r10Var = ao0Var.i) == null) {
            return false;
        }
        r10Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return r10Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.n9
    public final void N(boolean z) {
        if (this.z) {
            return;
        }
        int i = z ? 4 : 0;
        yi0 yi0Var = (yi0) this.w;
        int i2 = yi0Var.b;
        this.z = true;
        yi0Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.n9
    public final void O(boolean z) {
        wm0 wm0Var;
        this.L = z;
        if (z || (wm0Var = this.K) == null) {
            return;
        }
        wm0Var.a();
    }

    @Override // defpackage.n9
    public final void Q(CharSequence charSequence) {
        yi0 yi0Var = (yi0) this.w;
        if (yi0Var.g) {
            return;
        }
        Toolbar toolbar = yi0Var.a;
        yi0Var.h = charSequence;
        if ((yi0Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (yi0Var.g) {
                hm0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.n9
    public final p1 R(i5 i5Var) {
        ao0 ao0Var = this.A;
        if (ao0Var != null) {
            ao0Var.a();
        }
        this.u.setHideOnContentScrollEnabled(false);
        this.x.e();
        ao0 ao0Var2 = new ao0(this, this.x.getContext(), i5Var);
        r10 r10Var = ao0Var2.i;
        r10Var.w();
        try {
            if (!((wi) ao0Var2.j.g).o(ao0Var2, r10Var)) {
                return null;
            }
            this.A = ao0Var2;
            ao0Var2.h();
            this.x.c(ao0Var2);
            W(true);
            return ao0Var2;
        } finally {
            r10Var.v();
        }
    }

    public final void W(boolean z) {
        vm0 i;
        vm0 vm0Var;
        boolean z2 = this.I;
        if (z) {
            if (!z2) {
                this.I = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.u;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                Z(false);
            }
        } else if (z2) {
            this.I = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.u;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            Z(false);
        }
        boolean isLaidOut = this.v.isLaidOut();
        ci ciVar = this.w;
        if (!isLaidOut) {
            if (z) {
                ((yi0) ciVar).a.setVisibility(4);
                this.x.setVisibility(0);
                return;
            } else {
                ((yi0) ciVar).a.setVisibility(0);
                this.x.setVisibility(8);
                return;
            }
        }
        if (z) {
            yi0 yi0Var = (yi0) ciVar;
            i = hm0.a(yi0Var.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new xi0(yi0Var, 4));
            vm0Var = this.x.i(0, 200L);
        } else {
            yi0 yi0Var2 = (yi0) ciVar;
            vm0 a = hm0.a(yi0Var2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new xi0(yi0Var2, 0));
            i = this.x.i(8, 100L);
            vm0Var = a;
        }
        wm0 wm0Var = new wm0();
        ArrayList arrayList = wm0Var.a;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) vm0Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(vm0Var);
        wm0Var.b();
    }

    public final void X(View view) {
        ci wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.trembin.nirefon.betfury.R.id.decor_content_parent);
        this.u = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.trembin.nirefon.betfury.R.id.action_bar);
        if (findViewById instanceof ci) {
            wrapper = (ci) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.w = wrapper;
        this.x = (ActionBarContextView) view.findViewById(com.trembin.nirefon.betfury.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.trembin.nirefon.betfury.R.id.action_bar_container);
        this.v = actionBarContainer;
        ci ciVar = this.w;
        if (ciVar == null || this.x == null || actionBarContainer == null) {
            s9.u(bo0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((yi0) ciVar).a.getContext();
        this.s = context;
        if ((((yi0) this.w).b & 4) != 0) {
            this.z = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.w.getClass();
        Y(context.getResources().getBoolean(com.trembin.nirefon.betfury.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.s.obtainStyledAttributes(null, d70.a, com.trembin.nirefon.betfury.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.u;
            if (!actionBarOverlayLayout2.l) {
                s9.u("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.M = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.v;
            WeakHashMap weakHashMap = hm0.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void Y(boolean z) {
        if (z) {
            this.v.setTabContainer(null);
            ((yi0) this.w).getClass();
        } else {
            ((yi0) this.w).getClass();
            this.v.setTabContainer(null);
        }
        this.w.getClass();
        ((yi0) this.w).a.setCollapsible(false);
        this.u.setHasNonEmbeddedTabs(false);
    }

    public final void Z(boolean z) {
        boolean z2 = this.I || !this.H;
        boolean z3 = this.J;
        kz kzVar = this.P;
        View view = this.y;
        if (!z2) {
            if (z3) {
                this.J = false;
                wm0 wm0Var = this.K;
                if (wm0Var != null) {
                    wm0Var.a();
                }
                int i = this.F;
                zn0 zn0Var = this.N;
                if (i != 0 || (!this.L && !z)) {
                    zn0Var.a();
                    return;
                }
                this.v.setAlpha(1.0f);
                this.v.setTransitioning(true);
                wm0 wm0Var2 = new wm0();
                float f = -this.v.getHeight();
                if (z) {
                    this.v.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                vm0 a = hm0.a(this.v);
                a.e(f);
                View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(kzVar != null ? new zk(kzVar, view2) : null);
                }
                boolean z4 = wm0Var2.e;
                ArrayList arrayList = wm0Var2.a;
                if (!z4) {
                    arrayList.add(a);
                }
                if (this.G && view != null) {
                    vm0 a2 = hm0.a(view);
                    a2.e(f);
                    if (!wm0Var2.e) {
                        arrayList.add(a2);
                    }
                }
                boolean z5 = wm0Var2.e;
                if (!z5) {
                    wm0Var2.c = Q;
                }
                if (!z5) {
                    wm0Var2.b = 250L;
                }
                if (!z5) {
                    wm0Var2.d = zn0Var;
                }
                this.K = wm0Var2;
                wm0Var2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.J = true;
        wm0 wm0Var3 = this.K;
        if (wm0Var3 != null) {
            wm0Var3.a();
        }
        this.v.setVisibility(0);
        int i2 = this.F;
        zn0 zn0Var2 = this.O;
        if (i2 == 0 && (this.L || z)) {
            this.v.setTranslationY(0.0f);
            float f2 = -this.v.getHeight();
            if (z) {
                this.v.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.v.setTranslationY(f2);
            wm0 wm0Var4 = new wm0();
            vm0 a3 = hm0.a(this.v);
            a3.e(0.0f);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(kzVar != null ? new zk(kzVar, view3) : null);
            }
            boolean z6 = wm0Var4.e;
            ArrayList arrayList2 = wm0Var4.a;
            if (!z6) {
                arrayList2.add(a3);
            }
            if (this.G && view != null) {
                view.setTranslationY(f2);
                vm0 a4 = hm0.a(view);
                a4.e(0.0f);
                if (!wm0Var4.e) {
                    arrayList2.add(a4);
                }
            }
            boolean z7 = wm0Var4.e;
            if (!z7) {
                wm0Var4.c = R;
            }
            if (!z7) {
                wm0Var4.b = 250L;
            }
            if (!z7) {
                wm0Var4.d = zn0Var2;
            }
            this.K = wm0Var4;
            wm0Var4.b();
        } else {
            this.v.setAlpha(1.0f);
            this.v.setTranslationY(0.0f);
            if (this.G && view != null) {
                view.setTranslationY(0.0f);
            }
            zn0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.u;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = hm0.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // defpackage.n9
    public final boolean g() {
        ri0 ri0Var;
        ci ciVar = this.w;
        if (ciVar == null || (ri0Var = ((yi0) ciVar).a.R) == null || ri0Var.g == null) {
            return false;
        }
        ri0 ri0Var2 = ((yi0) ciVar).a.R;
        u10 u10Var = ri0Var2 == null ? null : ri0Var2.g;
        if (u10Var == null) {
            return true;
        }
        u10Var.collapseActionView();
        return true;
    }

    @Override // defpackage.n9
    public final void j(boolean z) {
        if (z == this.D) {
            return;
        }
        this.D = z;
        ArrayList arrayList = this.E;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        s9.c();
    }

    @Override // defpackage.n9
    public final int n() {
        return ((yi0) this.w).b;
    }

    @Override // defpackage.n9
    public final Context t() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.s.getTheme().resolveAttribute(com.trembin.nirefon.betfury.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.s, i);
            } else {
                this.t = this.s;
            }
        }
        return this.t;
    }

    public bo0(Dialog dialog) {
        new ArrayList();
        this.E = new ArrayList();
        this.F = 0;
        this.G = true;
        this.J = true;
        this.N = new zn0(this, 0);
        this.O = new zn0(this, 1);
        this.P = new kz(this);
        X(dialog.getWindow().getDecorView());
    }
}
