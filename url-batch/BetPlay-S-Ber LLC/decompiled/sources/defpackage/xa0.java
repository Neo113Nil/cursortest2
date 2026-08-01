package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class xa0 extends u0 implements z0 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public ie e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public wa0 i;
    public wa0 j;
    public h5 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public u90 s;
    public boolean t;
    public boolean u;
    public final va0 v;
    public final va0 w;
    public final tx x;

    public xa0(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new va0(this, 0);
        this.w = new va0(this, 1);
        this.x = new tx(this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        t90 i;
        t90 t90Var;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        boolean isLaidOut = this.d.isLaidOut();
        ie ieVar = this.e;
        if (!isLaidOut) {
            if (z2) {
                ((q60) ieVar).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((q60) ieVar).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            q60 q60Var = (q60) ieVar;
            i = e90.a(q60Var.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new p60(q60Var, 4));
            t90Var = this.f.i(0, 200L);
        } else {
            q60 q60Var2 = (q60) ieVar;
            t90 a = e90.a(q60Var2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new p60(q60Var2, 0));
            i = this.f.i(8, 100L);
            t90Var = a;
        }
        u90 u90Var = new u90();
        ArrayList arrayList = u90Var.a;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) t90Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(t90Var);
        u90Var.b();
    }

    public final Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.awerser.monnit.betplay.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public final void c(View view) {
        ie wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.awerser.monnit.betplay.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.awerser.monnit.betplay.R.id.action_bar);
        if (findViewById instanceof ie) {
            wrapper = (ie) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.awerser.monnit.betplay.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.awerser.monnit.betplay.R.id.action_bar_container);
        this.d = actionBarContainer;
        ie ieVar = this.e;
        if (ieVar == null || this.f == null || actionBarContainer == null) {
            o8.t(xa0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((q60) ieVar).a.getContext();
        this.a = context;
        if ((((q60) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        e(context.getResources().getBoolean(com.awerser.monnit.betplay.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, my.a, com.awerser.monnit.betplay.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.l) {
                o8.t("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = e90.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        q60 q60Var = (q60) this.e;
        int i2 = q60Var.b;
        this.h = true;
        q60Var.a((i & 4) | (i2 & (-5)));
    }

    public final void e(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((q60) this.e).getClass();
        } else {
            ((q60) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((q60) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        tx txVar = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                u90 u90Var = this.s;
                if (u90Var != null) {
                    u90Var.a();
                }
                int i = this.n;
                va0 va0Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    va0Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                u90 u90Var2 = new u90();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                t90 a = e90.a(this.d);
                a.e(f);
                View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(txVar != null ? new fg(txVar, view2) : null);
                }
                boolean z5 = u90Var2.e;
                ArrayList arrayList = u90Var2.a;
                if (!z5) {
                    arrayList.add(a);
                }
                if (this.o && view != null) {
                    t90 a2 = e90.a(view);
                    a2.e(f);
                    if (!u90Var2.e) {
                        arrayList.add(a2);
                    }
                }
                boolean z6 = u90Var2.e;
                if (!z6) {
                    u90Var2.c = y;
                }
                if (!z6) {
                    u90Var2.b = 250L;
                }
                if (!z6) {
                    u90Var2.d = va0Var;
                }
                this.s = u90Var2;
                u90Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        u90 u90Var3 = this.s;
        if (u90Var3 != null) {
            u90Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        va0 va0Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            u90 u90Var4 = new u90();
            t90 a3 = e90.a(this.d);
            a3.e(0.0f);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(txVar != null ? new fg(txVar, view3) : null);
            }
            boolean z7 = u90Var4.e;
            ArrayList arrayList2 = u90Var4.a;
            if (!z7) {
                arrayList2.add(a3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                t90 a4 = e90.a(view);
                a4.e(0.0f);
                if (!u90Var4.e) {
                    arrayList2.add(a4);
                }
            }
            boolean z8 = u90Var4.e;
            if (!z8) {
                u90Var4.c = z;
            }
            if (!z8) {
                u90Var4.b = 250L;
            }
            if (!z8) {
                u90Var4.d = va0Var2;
            }
            this.s = u90Var4;
            u90Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            va0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = e90.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public xa0(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new va0(this, 0);
        this.w = new va0(this, 1);
        this.x = new tx(this);
        c(dialog.getWindow().getDecorView());
    }
}
