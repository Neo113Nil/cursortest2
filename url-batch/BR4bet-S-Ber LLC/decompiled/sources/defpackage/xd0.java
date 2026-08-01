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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xd0 implements y0 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public yf e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public wd0 i;
    public wd0 j;
    public a5 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public xc0 s;
    public boolean t;
    public boolean u;
    public final vd0 v;
    public final vd0 w;
    public final pw x;

    public xd0(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new vd0(this, 0);
        this.w = new vd0(this, 1);
        this.x = new pw(this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        wc0 i;
        wc0 wc0Var;
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
        yf yfVar = this.e;
        if (!isLaidOut) {
            if (z2) {
                ((s90) yfVar).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((s90) yfVar).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            s90 s90Var = (s90) yfVar;
            i = ic0.a(s90Var.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new r90(s90Var, 4));
            wc0Var = this.f.i(0, 200L);
        } else {
            s90 s90Var2 = (s90) yfVar;
            wc0 a = ic0.a(s90Var2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new r90(s90Var2, 0));
            i = this.f.i(8, 100L);
            wc0Var = a;
        }
        xc0 xc0Var = new xc0();
        ArrayList arrayList = xc0Var.a;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) wc0Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(wc0Var);
        xc0Var.b();
    }

    public final Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.moontiko.really.admiralcasino.R.attr.actionBarWidgetTheme, typedValue, true);
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
        yf wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.moontiko.really.admiralcasino.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.moontiko.really.admiralcasino.R.id.action_bar);
        if (findViewById instanceof yf) {
            wrapper = (yf) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.moontiko.really.admiralcasino.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.moontiko.really.admiralcasino.R.id.action_bar_container);
        this.d = actionBarContainer;
        yf yfVar = this.e;
        if (yfVar == null || this.f == null || actionBarContainer == null) {
            g9.s(xd0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((s90) yfVar).a.getContext();
        this.a = context;
        if ((((s90) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        e(context.getResources().getBoolean(com.moontiko.really.admiralcasino.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, z00.a, com.moontiko.really.admiralcasino.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.l) {
                g9.s("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = ic0.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        s90 s90Var = (s90) this.e;
        int i2 = s90Var.b;
        this.h = true;
        s90Var.a((i & 4) | (i2 & (-5)));
    }

    public final void e(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((s90) this.e).getClass();
        } else {
            ((s90) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((s90) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        pw pwVar = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                xc0 xc0Var = this.s;
                if (xc0Var != null) {
                    xc0Var.a();
                }
                int i = this.n;
                vd0 vd0Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    vd0Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                xc0 xc0Var2 = new xc0();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                wc0 a = ic0.a(this.d);
                a.e(f);
                View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(pwVar != null ? new oi(pwVar, view2) : null);
                }
                boolean z5 = xc0Var2.e;
                ArrayList arrayList = xc0Var2.a;
                if (!z5) {
                    arrayList.add(a);
                }
                if (this.o && view != null) {
                    wc0 a2 = ic0.a(view);
                    a2.e(f);
                    if (!xc0Var2.e) {
                        arrayList.add(a2);
                    }
                }
                boolean z6 = xc0Var2.e;
                if (!z6) {
                    xc0Var2.c = y;
                }
                if (!z6) {
                    xc0Var2.b = 250L;
                }
                if (!z6) {
                    xc0Var2.d = vd0Var;
                }
                this.s = xc0Var2;
                xc0Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        xc0 xc0Var3 = this.s;
        if (xc0Var3 != null) {
            xc0Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        vd0 vd0Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            xc0 xc0Var4 = new xc0();
            wc0 a3 = ic0.a(this.d);
            a3.e(0.0f);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(pwVar != null ? new oi(pwVar, view3) : null);
            }
            boolean z7 = xc0Var4.e;
            ArrayList arrayList2 = xc0Var4.a;
            if (!z7) {
                arrayList2.add(a3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                wc0 a4 = ic0.a(view);
                a4.e(0.0f);
                if (!xc0Var4.e) {
                    arrayList2.add(a4);
                }
            }
            boolean z8 = xc0Var4.e;
            if (!z8) {
                xc0Var4.c = z;
            }
            if (!z8) {
                xc0Var4.b = 250L;
            }
            if (!z8) {
                xc0Var4.d = vd0Var2;
            }
            this.s = xc0Var4;
            xc0Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            vd0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = ic0.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public xd0(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new vd0(this, 0);
        this.w = new vd0(this, 1);
        this.x = new pw(this);
        c(dialog.getWindow().getDecorView());
    }
}
