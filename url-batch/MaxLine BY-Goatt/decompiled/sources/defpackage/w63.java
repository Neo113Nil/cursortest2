package defpackage;

import android.R;
import android.animation.ValueAnimator;
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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w63 implements v2 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public u70 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public v63 i;
    public v63 j;
    public t21 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public x53 s;
    public boolean t;
    public boolean u;
    public final u63 v;
    public final u63 w;
    public final ot2 x;

    public w63(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new u63(this, 0);
        this.w = new u63(this, 1);
        this.x = new ot2(10, this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        w53 i;
        w53 w53Var;
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
        u70 u70Var = this.e;
        if (!isLaidOut) {
            if (z2) {
                ((ky2) u70Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((ky2) u70Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            ky2 ky2Var = (ky2) u70Var;
            i = e53.a(ky2Var.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new jy2(ky2Var, 4));
            w53Var = this.f.i(200L, 0);
        } else {
            ky2 ky2Var2 = (ky2) u70Var;
            w53 a = e53.a(ky2Var2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new jy2(ky2Var2, 0));
            i = this.f.i(100L, 8);
            w53Var = a;
        }
        x53 x53Var = new x53();
        ArrayList arrayList = x53Var.a;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) w53Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(w53Var);
        x53Var.b();
    }

    public final Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.majelw.libystne.R.attr.actionBarWidgetTheme, typedValue, true);
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
        u70 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.majelw.libystne.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.majelw.libystne.R.id.action_bar);
        if (findViewById instanceof u70) {
            wrapper = (u70) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.majelw.libystne.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.majelw.libystne.R.id.action_bar_container);
        this.d = actionBarContainer;
        u70 u70Var = this.e;
        if (u70Var == null || this.f == null || actionBarContainer == null) {
            lh.g(w63.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((ky2) u70Var).a.getContext();
        this.a = context;
        if ((((ky2) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        e(context.getResources().getBoolean(com.majelw.libystne.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, b62.a, com.majelw.libystne.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.s) {
                lh.g("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = e53.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        ky2 ky2Var = (ky2) this.e;
        int i2 = ky2Var.b;
        this.h = true;
        ky2Var.a((i & 4) | (i2 & (-5)));
    }

    public final void e(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((ky2) this.e).getClass();
        } else {
            ((ky2) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((ky2) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final ot2 ot2Var = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                x53 x53Var = this.s;
                if (x53Var != null) {
                    x53Var.a();
                }
                int i = this.n;
                u63 u63Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    u63Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                x53 x53Var2 = new x53();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                w53 a = e53.a(this.d);
                a.e(f);
                final View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(ot2Var != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: v53
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((w63) ot2.this.n).d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = x53Var2.e;
                ArrayList arrayList = x53Var2.a;
                if (!z5) {
                    arrayList.add(a);
                }
                if (this.o && view != null) {
                    w53 a2 = e53.a(view);
                    a2.e(f);
                    if (!x53Var2.e) {
                        arrayList.add(a2);
                    }
                }
                boolean z6 = x53Var2.e;
                if (!z6) {
                    x53Var2.c = y;
                }
                if (!z6) {
                    x53Var2.b = 250L;
                }
                if (!z6) {
                    x53Var2.d = u63Var;
                }
                this.s = x53Var2;
                x53Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        x53 x53Var3 = this.s;
        if (x53Var3 != null) {
            x53Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        u63 u63Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            x53 x53Var4 = new x53();
            w53 a3 = e53.a(this.d);
            a3.e(0.0f);
            final View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(ot2Var != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: v53
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((w63) ot2.this.n).d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = x53Var4.e;
            ArrayList arrayList2 = x53Var4.a;
            if (!z7) {
                arrayList2.add(a3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                w53 a4 = e53.a(view);
                a4.e(0.0f);
                if (!x53Var4.e) {
                    arrayList2.add(a4);
                }
            }
            boolean z8 = x53Var4.e;
            if (!z8) {
                x53Var4.c = z;
            }
            if (!z8) {
                x53Var4.b = 250L;
            }
            if (!z8) {
                x53Var4.d = u63Var2;
            }
            this.s = x53Var4;
            x53Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            u63Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = e53.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public w63(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new u63(this, 0);
        this.w = new u63(this, 1);
        this.x = new ot2(10, this);
        c(dialog.getWindow().getDecorView());
    }
}
