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
import l.InterfaceC0205d;
import l.InterfaceC0220k0;
import l.c1;

/* loaded from: classes.dex */
public final class K extends u1.d implements InterfaceC0205d {

    /* renamed from: A, reason: collision with root package name */
    public static final AccelerateInterpolator f2375A = new AccelerateInterpolator();

    /* renamed from: B, reason: collision with root package name */
    public static final DecelerateInterpolator f2376B = new DecelerateInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public Context f2377c;
    public Context d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarOverlayLayout f2378e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f2379f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0220k0 f2380g;
    public ActionBarContextView h;
    public final View i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2381j;

    /* renamed from: k, reason: collision with root package name */
    public J f2382k;

    /* renamed from: l, reason: collision with root package name */
    public J f2383l;

    /* renamed from: m, reason: collision with root package name */
    public B.j f2384m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2385n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2386o;

    /* renamed from: p, reason: collision with root package name */
    public int f2387p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2388q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2389r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2390s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2391t;

    /* renamed from: u, reason: collision with root package name */
    public j.j f2392u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2393v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2394w;

    /* renamed from: x, reason: collision with root package name */
    public final I f2395x;

    /* renamed from: y, reason: collision with root package name */
    public final I f2396y;

    /* renamed from: z, reason: collision with root package name */
    public final C.h f2397z;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2386o = new ArrayList();
        this.f2387p = 0;
        this.f2388q = true;
        this.f2391t = true;
        this.f2395x = new I(this, 0);
        this.f2396y = new I(this, 1);
        this.f2397z = new C.h(24, this);
        View decorView = activity.getWindow().getDecorView();
        m0(decorView);
        if (z2) {
            return;
        }
        this.i = decorView.findViewById(R.id.content);
    }

    public final void k0(boolean z2) {
        Z i;
        Z z3;
        if (z2) {
            if (!this.f2390s) {
                this.f2390s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2378e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                p0(false);
            }
        } else if (this.f2390s) {
            this.f2390s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2378e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            p0(false);
        }
        if (!this.f2379f.isLaidOut()) {
            if (z2) {
                ((c1) this.f2380g).f2938a.setVisibility(4);
                this.h.setVisibility(0);
                return;
            } else {
                ((c1) this.f2380g).f2938a.setVisibility(0);
                this.h.setVisibility(8);
                return;
            }
        }
        if (z2) {
            c1 c1Var = (c1) this.f2380g;
            i = S.a(c1Var.f2938a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.i(c1Var, 4));
            z3 = this.h.i(0, 200L);
        } else {
            c1 c1Var2 = (c1) this.f2380g;
            Z a2 = S.a(c1Var2.f2938a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(c1Var2, 0));
            i = this.h.i(8, 100L);
            z3 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2564a;
        arrayList.add(i);
        View view = (View) i.f360a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) z3.f360a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(z3);
        jVar.b();
    }

    public final Context l0() {
        if (this.d == null) {
            TypedValue typedValue = new TypedValue();
            this.f2377c.getTheme().resolveAttribute(com.glasspulse.glasspulse.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.d = new ContextThemeWrapper(this.f2377c, i);
            } else {
                this.d = this.f2377c;
            }
        }
        return this.d;
    }

    public final void m0(View view) {
        InterfaceC0220k0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.glasspulse.glasspulse.R.id.decor_content_parent);
        this.f2378e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.glasspulse.glasspulse.R.id.action_bar);
        if (findViewById instanceof InterfaceC0220k0) {
            wrapper = (InterfaceC0220k0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2380g = wrapper;
        this.h = (ActionBarContextView) view.findViewById(com.glasspulse.glasspulse.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.glasspulse.glasspulse.R.id.action_bar_container);
        this.f2379f = actionBarContainer;
        InterfaceC0220k0 interfaceC0220k0 = this.f2380g;
        if (interfaceC0220k0 == null || this.h == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((c1) interfaceC0220k0).f2938a.getContext();
        this.f2377c = context;
        if ((((c1) this.f2380g).f2939b & 4) != 0) {
            this.f2381j = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2380g.getClass();
        o0(context.getResources().getBoolean(com.glasspulse.glasspulse.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2377c.obtainStyledAttributes(null, f.a.f2032a, com.glasspulse.glasspulse.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2378e;
            if (!actionBarOverlayLayout2.f1240g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2394w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2379f;
            WeakHashMap weakHashMap = S.f351a;
            K.G.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void n0(boolean z2) {
        if (this.f2381j) {
            return;
        }
        int i = z2 ? 4 : 0;
        c1 c1Var = (c1) this.f2380g;
        int i2 = c1Var.f2939b;
        this.f2381j = true;
        c1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void o0(boolean z2) {
        if (z2) {
            this.f2379f.setTabContainer(null);
            ((c1) this.f2380g).getClass();
        } else {
            ((c1) this.f2380g).getClass();
            this.f2379f.setTabContainer(null);
        }
        this.f2380g.getClass();
        ((c1) this.f2380g).f2938a.setCollapsible(false);
        this.f2378e.setHasNonEmbeddedTabs(false);
    }

    public final void p0(boolean z2) {
        boolean z3 = this.f2390s || !this.f2389r;
        View view = this.i;
        C.h hVar = this.f2397z;
        if (!z3) {
            if (this.f2391t) {
                this.f2391t = false;
                j.j jVar = this.f2392u;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2387p;
                I i2 = this.f2395x;
                if (i != 0 || (!this.f2393v && !z2)) {
                    i2.a();
                    return;
                }
                this.f2379f.setAlpha(1.0f);
                this.f2379f.setTransitioning(true);
                j.j jVar2 = new j.j();
                float f2 = -this.f2379f.getHeight();
                if (z2) {
                    this.f2379f.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                Z a2 = S.a(this.f2379f);
                a2.e(f2);
                View view2 = (View) a2.f360a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(hVar != null ? new X(hVar, view2) : null);
                }
                boolean z4 = jVar2.f2567e;
                ArrayList arrayList = jVar2.f2564a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2388q && view != null) {
                    Z a3 = S.a(view);
                    a3.e(f2);
                    if (!jVar2.f2567e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2375A;
                boolean z5 = jVar2.f2567e;
                if (!z5) {
                    jVar2.f2566c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2565b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2392u = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2391t) {
            return;
        }
        this.f2391t = true;
        j.j jVar3 = this.f2392u;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f2379f.setVisibility(0);
        int i3 = this.f2387p;
        I i4 = this.f2396y;
        if (i3 == 0 && (this.f2393v || z2)) {
            this.f2379f.setTranslationY(0.0f);
            float f3 = -this.f2379f.getHeight();
            if (z2) {
                this.f2379f.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f2379f.setTranslationY(f3);
            j.j jVar4 = new j.j();
            Z a4 = S.a(this.f2379f);
            a4.e(0.0f);
            View view3 = (View) a4.f360a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(hVar != null ? new X(hVar, view3) : null);
            }
            boolean z6 = jVar4.f2567e;
            ArrayList arrayList2 = jVar4.f2564a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2388q && view != null) {
                view.setTranslationY(f3);
                Z a5 = S.a(view);
                a5.e(0.0f);
                if (!jVar4.f2567e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2376B;
            boolean z7 = jVar4.f2567e;
            if (!z7) {
                jVar4.f2566c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2565b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2392u = jVar4;
            jVar4.b();
        } else {
            this.f2379f.setAlpha(1.0f);
            this.f2379f.setTranslationY(0.0f);
            if (this.f2388q && view != null) {
                view.setTranslationY(0.0f);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2378e;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = S.f351a;
            K.E.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2386o = new ArrayList();
        this.f2387p = 0;
        this.f2388q = true;
        this.f2391t = true;
        this.f2395x = new I(this, 0);
        this.f2396y = new I(this, 1);
        this.f2397z = new C.h(24, this);
        m0(dialog.getWindow().getDecorView());
    }
}
