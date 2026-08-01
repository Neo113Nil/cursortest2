package g;

import K.S;
import K.X;
import K.Z;
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
import l.InterfaceC0209d;
import l.InterfaceC0228m0;
import l.d1;

/* loaded from: classes.dex */
public final class K extends s1.l implements InterfaceC0209d {
    public static final AccelerateInterpolator F = new AccelerateInterpolator();

    /* renamed from: G, reason: collision with root package name */
    public static final DecelerateInterpolator f2334G = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public boolean f2335A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2336B;

    /* renamed from: C, reason: collision with root package name */
    public final I f2337C;

    /* renamed from: D, reason: collision with root package name */
    public final I f2338D;

    /* renamed from: E, reason: collision with root package name */
    public final C.g f2339E;
    public Context h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public ActionBarOverlayLayout f2340j;

    /* renamed from: k, reason: collision with root package name */
    public ActionBarContainer f2341k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0228m0 f2342l;

    /* renamed from: m, reason: collision with root package name */
    public ActionBarContextView f2343m;

    /* renamed from: n, reason: collision with root package name */
    public final View f2344n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2345o;

    /* renamed from: p, reason: collision with root package name */
    public J f2346p;

    /* renamed from: q, reason: collision with root package name */
    public J f2347q;

    /* renamed from: r, reason: collision with root package name */
    public B.j f2348r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2349s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2350t;

    /* renamed from: u, reason: collision with root package name */
    public int f2351u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2352v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2353w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2354x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2355y;

    /* renamed from: z, reason: collision with root package name */
    public j.j f2356z;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2350t = new ArrayList();
        this.f2351u = 0;
        this.f2352v = true;
        this.f2355y = true;
        this.f2337C = new I(this, 0);
        this.f2338D = new I(this, 1);
        this.f2339E = new C.g(24, this);
        View decorView = activity.getWindow().getDecorView();
        m0(decorView);
        if (z2) {
            return;
        }
        this.f2344n = decorView.findViewById(R.id.content);
    }

    public final void k0(boolean z2) {
        Z i;
        Z z3;
        if (z2) {
            if (!this.f2354x) {
                this.f2354x = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2340j;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                p0(false);
            }
        } else if (this.f2354x) {
            this.f2354x = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2340j;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            p0(false);
        }
        if (!this.f2341k.isLaidOut()) {
            if (z2) {
                ((d1) this.f2342l).f3052a.setVisibility(4);
                this.f2343m.setVisibility(0);
                return;
            } else {
                ((d1) this.f2342l).f3052a.setVisibility(0);
                this.f2343m.setVisibility(8);
                return;
            }
        }
        if (z2) {
            d1 d1Var = (d1) this.f2342l;
            i = S.a(d1Var.f3052a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.i(d1Var, 4));
            z3 = this.f2343m.i(0, 200L);
        } else {
            d1 d1Var2 = (d1) this.f2342l;
            Z a2 = S.a(d1Var2.f3052a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(d1Var2, 0));
            i = this.f2343m.i(8, 100L);
            z3 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2520a;
        arrayList.add(i);
        View view = (View) i.f371a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) z3.f371a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(z3);
        jVar.b();
    }

    public final Context l0() {
        if (this.i == null) {
            TypedValue typedValue = new TypedValue();
            this.h.getTheme().resolveAttribute(com.visualfortune.eyerest.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.i = new ContextThemeWrapper(this.h, i);
            } else {
                this.i = this.h;
            }
        }
        return this.i;
    }

    public final void m0(View view) {
        InterfaceC0228m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.visualfortune.eyerest.R.id.decor_content_parent);
        this.f2340j = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.visualfortune.eyerest.R.id.action_bar);
        if (findViewById instanceof InterfaceC0228m0) {
            wrapper = (InterfaceC0228m0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2342l = wrapper;
        this.f2343m = (ActionBarContextView) view.findViewById(com.visualfortune.eyerest.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.visualfortune.eyerest.R.id.action_bar_container);
        this.f2341k = actionBarContainer;
        InterfaceC0228m0 interfaceC0228m0 = this.f2342l;
        if (interfaceC0228m0 == null || this.f2343m == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((d1) interfaceC0228m0).f3052a.getContext();
        this.h = context;
        if ((((d1) this.f2342l).f3053b & 4) != 0) {
            this.f2345o = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2342l.getClass();
        o0(context.getResources().getBoolean(com.visualfortune.eyerest.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.h.obtainStyledAttributes(null, f.a.f1989a, com.visualfortune.eyerest.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2340j;
            if (!actionBarOverlayLayout2.f1201g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2336B = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2341k;
            WeakHashMap weakHashMap = S.f362a;
            K.G.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void n0(boolean z2) {
        if (this.f2345o) {
            return;
        }
        int i = z2 ? 4 : 0;
        d1 d1Var = (d1) this.f2342l;
        int i2 = d1Var.f3053b;
        this.f2345o = true;
        d1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void o0(boolean z2) {
        if (z2) {
            this.f2341k.setTabContainer(null);
            ((d1) this.f2342l).getClass();
        } else {
            ((d1) this.f2342l).getClass();
            this.f2341k.setTabContainer(null);
        }
        this.f2342l.getClass();
        ((d1) this.f2342l).f3052a.setCollapsible(false);
        this.f2340j.setHasNonEmbeddedTabs(false);
    }

    public final void p0(boolean z2) {
        boolean z3 = this.f2354x || !this.f2353w;
        View view = this.f2344n;
        C.g gVar = this.f2339E;
        if (!z3) {
            if (this.f2355y) {
                this.f2355y = false;
                j.j jVar = this.f2356z;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2351u;
                I i2 = this.f2337C;
                if (i != 0 || (!this.f2335A && !z2)) {
                    i2.a();
                    return;
                }
                this.f2341k.setAlpha(1.0f);
                this.f2341k.setTransitioning(true);
                j.j jVar2 = new j.j();
                float f2 = -this.f2341k.getHeight();
                if (z2) {
                    this.f2341k.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                Z a2 = S.a(this.f2341k);
                a2.e(f2);
                View view2 = (View) a2.f371a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(gVar != null ? new X(gVar, view2) : null);
                }
                boolean z4 = jVar2.f2523e;
                ArrayList arrayList = jVar2.f2520a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2352v && view != null) {
                    Z a3 = S.a(view);
                    a3.e(f2);
                    if (!jVar2.f2523e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = F;
                boolean z5 = jVar2.f2523e;
                if (!z5) {
                    jVar2.f2522c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2521b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2356z = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2355y) {
            return;
        }
        this.f2355y = true;
        j.j jVar3 = this.f2356z;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f2341k.setVisibility(0);
        int i3 = this.f2351u;
        I i4 = this.f2338D;
        if (i3 == 0 && (this.f2335A || z2)) {
            this.f2341k.setTranslationY(0.0f);
            float f3 = -this.f2341k.getHeight();
            if (z2) {
                this.f2341k.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f2341k.setTranslationY(f3);
            j.j jVar4 = new j.j();
            Z a4 = S.a(this.f2341k);
            a4.e(0.0f);
            View view3 = (View) a4.f371a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(gVar != null ? new X(gVar, view3) : null);
            }
            boolean z6 = jVar4.f2523e;
            ArrayList arrayList2 = jVar4.f2520a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2352v && view != null) {
                view.setTranslationY(f3);
                Z a5 = S.a(view);
                a5.e(0.0f);
                if (!jVar4.f2523e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2334G;
            boolean z7 = jVar4.f2523e;
            if (!z7) {
                jVar4.f2522c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2521b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2356z = jVar4;
            jVar4.b();
        } else {
            this.f2341k.setAlpha(1.0f);
            this.f2341k.setTranslationY(0.0f);
            if (this.f2352v && view != null) {
                view.setTranslationY(0.0f);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2340j;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = S.f362a;
            K.E.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2350t = new ArrayList();
        this.f2351u = 0;
        this.f2352v = true;
        this.f2355y = true;
        this.f2337C = new I(this, 0);
        this.f2338D = new I(this, 1);
        this.f2339E = new C.g(24, this);
        m0(dialog.getWindow().getDecorView());
    }
}
