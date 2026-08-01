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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qa0 extends o8 implements x0 {
    public static final AccelerateInterpolator Q = new AccelerateInterpolator();
    public static final DecelerateInterpolator R = new DecelerateInterpolator();
    public pa0 A;
    public pa0 B;
    public q4 C;
    public boolean D;
    public final ArrayList E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public m90 K;
    public boolean L;
    public boolean M;
    public final oa0 N;
    public final oa0 O;
    public final mr P;
    public Context s;
    public Context t;
    public ActionBarOverlayLayout u;
    public ActionBarContainer v;
    public ie w;
    public ActionBarContextView x;
    public final View y;
    public boolean z;

    public qa0(Activity activity, boolean z) {
        new ArrayList();
        this.E = new ArrayList();
        this.F = 0;
        this.G = true;
        this.J = true;
        this.N = new oa0(this, 0);
        this.O = new oa0(this, 1);
        this.P = new mr(this);
        View decorView = activity.getWindow().getDecorView();
        G0(decorView);
        if (z) {
            return;
        }
        this.y = decorView.findViewById(R.id.content);
    }

    public final void F0(boolean z) {
        l90 i;
        l90 l90Var;
        boolean z2 = this.I;
        if (z) {
            if (!z2) {
                this.I = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.u;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                I0(false);
            }
        } else if (z2) {
            this.I = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.u;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            I0(false);
        }
        boolean isLaidOut = this.v.isLaidOut();
        ie ieVar = this.w;
        if (!isLaidOut) {
            if (z) {
                ((k60) ieVar).a.setVisibility(4);
                this.x.setVisibility(0);
                return;
            } else {
                ((k60) ieVar).a.setVisibility(0);
                this.x.setVisibility(8);
                return;
            }
        }
        if (z) {
            k60 k60Var = (k60) ieVar;
            i = x80.a(k60Var.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j60(k60Var, 4));
            l90Var = this.x.i(0, 200L);
        } else {
            k60 k60Var2 = (k60) ieVar;
            l90 a = x80.a(k60Var2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new j60(k60Var2, 0));
            i = this.x.i(8, 100L);
            l90Var = a;
        }
        m90 m90Var = new m90();
        ArrayList arrayList = m90Var.a;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) l90Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(l90Var);
        m90Var.b();
    }

    public final void G0(View view) {
        ie wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.derinko.gbini.n1casino.R.id.decor_content_parent);
        this.u = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.derinko.gbini.n1casino.R.id.action_bar);
        if (findViewById instanceof ie) {
            wrapper = (ie) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.w = wrapper;
        this.x = (ActionBarContextView) view.findViewById(com.derinko.gbini.n1casino.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.derinko.gbini.n1casino.R.id.action_bar_container);
        this.v = actionBarContainer;
        ie ieVar = this.w;
        if (ieVar == null || this.x == null || actionBarContainer == null) {
            t8.t(qa0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((k60) ieVar).a.getContext();
        this.s = context;
        if ((((k60) this.w).b & 4) != 0) {
            this.z = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.w.getClass();
        H0(context.getResources().getBoolean(com.derinko.gbini.n1casino.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.s.obtainStyledAttributes(null, wx.a, com.derinko.gbini.n1casino.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.u;
            if (!actionBarOverlayLayout2.l) {
                t8.t("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.M = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.v;
            WeakHashMap weakHashMap = x80.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void H0(boolean z) {
        if (z) {
            this.v.setTabContainer(null);
            ((k60) this.w).getClass();
        } else {
            ((k60) this.w).getClass();
            this.v.setTabContainer(null);
        }
        this.w.getClass();
        ((k60) this.w).a.setCollapsible(false);
        this.u.setHasNonEmbeddedTabs(false);
    }

    public final void I0(boolean z) {
        boolean z2 = this.I || !this.H;
        boolean z3 = this.J;
        mr mrVar = this.P;
        View view = this.y;
        if (!z2) {
            if (z3) {
                this.J = false;
                m90 m90Var = this.K;
                if (m90Var != null) {
                    m90Var.a();
                }
                int i = this.F;
                oa0 oa0Var = this.N;
                if (i != 0 || (!this.L && !z)) {
                    oa0Var.a();
                    return;
                }
                this.v.setAlpha(1.0f);
                this.v.setTransitioning(true);
                m90 m90Var2 = new m90();
                float f = -this.v.getHeight();
                if (z) {
                    this.v.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                l90 a = x80.a(this.v);
                a.e(f);
                View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(mrVar != null ? new ng(mrVar, view2) : null);
                }
                boolean z4 = m90Var2.e;
                ArrayList arrayList = m90Var2.a;
                if (!z4) {
                    arrayList.add(a);
                }
                if (this.G && view != null) {
                    l90 a2 = x80.a(view);
                    a2.e(f);
                    if (!m90Var2.e) {
                        arrayList.add(a2);
                    }
                }
                boolean z5 = m90Var2.e;
                if (!z5) {
                    m90Var2.c = Q;
                }
                if (!z5) {
                    m90Var2.b = 250L;
                }
                if (!z5) {
                    m90Var2.d = oa0Var;
                }
                this.K = m90Var2;
                m90Var2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.J = true;
        m90 m90Var3 = this.K;
        if (m90Var3 != null) {
            m90Var3.a();
        }
        this.v.setVisibility(0);
        int i2 = this.F;
        oa0 oa0Var2 = this.O;
        if (i2 == 0 && (this.L || z)) {
            this.v.setTranslationY(0.0f);
            float f2 = -this.v.getHeight();
            if (z) {
                this.v.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.v.setTranslationY(f2);
            m90 m90Var4 = new m90();
            l90 a3 = x80.a(this.v);
            a3.e(0.0f);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(mrVar != null ? new ng(mrVar, view3) : null);
            }
            boolean z6 = m90Var4.e;
            ArrayList arrayList2 = m90Var4.a;
            if (!z6) {
                arrayList2.add(a3);
            }
            if (this.G && view != null) {
                view.setTranslationY(f2);
                l90 a4 = x80.a(view);
                a4.e(0.0f);
                if (!m90Var4.e) {
                    arrayList2.add(a4);
                }
            }
            boolean z7 = m90Var4.e;
            if (!z7) {
                m90Var4.c = R;
            }
            if (!z7) {
                m90Var4.b = 250L;
            }
            if (!z7) {
                m90Var4.d = oa0Var2;
            }
            this.K = m90Var4;
            m90Var4.b();
        } else {
            this.v.setAlpha(1.0f);
            this.v.setTranslationY(0.0f);
            if (this.G && view != null) {
                view.setTranslationY(0.0f);
            }
            oa0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.u;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = x80.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // defpackage.o8
    public final Context J() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.s.getTheme().resolveAttribute(com.derinko.gbini.n1casino.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.s, i);
            } else {
                this.t = this.s;
            }
        }
        return this.t;
    }

    @Override // defpackage.o8
    public final void X() {
        H0(this.s.getResources().getBoolean(com.derinko.gbini.n1casino.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.o8
    public final boolean a0(int i, KeyEvent keyEvent) {
        mt mtVar;
        pa0 pa0Var = this.A;
        if (pa0Var == null || (mtVar = pa0Var.i) == null) {
            return false;
        }
        mtVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return mtVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.o8
    public final void l0(boolean z) {
        if (this.z) {
            return;
        }
        int i = z ? 4 : 0;
        k60 k60Var = (k60) this.w;
        int i2 = k60Var.b;
        this.z = true;
        k60Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.o8
    public final void n0(boolean z) {
        m90 m90Var;
        this.L = z;
        if (z || (m90Var = this.K) == null) {
            return;
        }
        m90Var.a();
    }

    @Override // defpackage.o8
    public final boolean o() {
        d60 d60Var;
        ie ieVar = this.w;
        if (ieVar == null || (d60Var = ((k60) ieVar).a.R) == null || d60Var.g == null) {
            return false;
        }
        d60 d60Var2 = ((k60) ieVar).a.R;
        pt ptVar = d60Var2 == null ? null : d60Var2.g;
        if (ptVar == null) {
            return true;
        }
        ptVar.collapseActionView();
        return true;
    }

    @Override // defpackage.o8
    public final void p0(CharSequence charSequence) {
        k60 k60Var = (k60) this.w;
        if (k60Var.g) {
            return;
        }
        Toolbar toolbar = k60Var.a;
        k60Var.h = charSequence;
        if ((k60Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k60Var.g) {
                x80.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.o8
    public final void s(boolean z) {
        if (z == this.D) {
            return;
        }
        this.D = z;
        ArrayList arrayList = this.E;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        t8.c();
    }

    @Override // defpackage.o8
    public final l1 w0(q4 q4Var) {
        pa0 pa0Var = this.A;
        if (pa0Var != null) {
            pa0Var.a();
        }
        this.u.setHideOnContentScrollEnabled(false);
        this.x.e();
        pa0 pa0Var2 = new pa0(this, this.x.getContext(), q4Var);
        mt mtVar = pa0Var2.i;
        mtVar.w();
        try {
            if (!((we) pa0Var2.j.g).v(pa0Var2, mtVar)) {
                return null;
            }
            this.A = pa0Var2;
            pa0Var2.g();
            this.x.c(pa0Var2);
            F0(true);
            return pa0Var2;
        } finally {
            mtVar.v();
        }
    }

    @Override // defpackage.o8
    public final int x() {
        return ((k60) this.w).b;
    }

    public qa0(Dialog dialog) {
        new ArrayList();
        this.E = new ArrayList();
        this.F = 0;
        this.G = true;
        this.J = true;
        this.N = new oa0(this, 0);
        this.O = new oa0(this, 1);
        this.P = new mr(this);
        G0(dialog.getWindow().getDecorView());
    }
}
