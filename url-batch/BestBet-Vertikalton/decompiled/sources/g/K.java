package g;

import K.Q;
import K.Y;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.InterfaceC0228d;
import l.InterfaceC0243k0;
import l.c1;
import u0.C0385x;

/* loaded from: classes.dex */
public final class K extends b1.g implements InterfaceC0228d {

    /* renamed from: B, reason: collision with root package name */
    public static final AccelerateInterpolator f2614B = new AccelerateInterpolator();

    /* renamed from: C, reason: collision with root package name */
    public static final DecelerateInterpolator f2615C = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public final A0.c f2616A;
    public Context d;

    /* renamed from: e, reason: collision with root package name */
    public Context f2617e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarOverlayLayout f2618f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContainer f2619g;
    public InterfaceC0243k0 h;
    public ActionBarContextView i;

    /* renamed from: j, reason: collision with root package name */
    public final View f2620j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2621k;

    /* renamed from: l, reason: collision with root package name */
    public J f2622l;

    /* renamed from: m, reason: collision with root package name */
    public J f2623m;

    /* renamed from: n, reason: collision with root package name */
    public C0385x f2624n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2625o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2626p;

    /* renamed from: q, reason: collision with root package name */
    public int f2627q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2628r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2629s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2630t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2631u;

    /* renamed from: v, reason: collision with root package name */
    public j.j f2632v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2633w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2634x;

    /* renamed from: y, reason: collision with root package name */
    public final I f2635y;

    /* renamed from: z, reason: collision with root package name */
    public final I f2636z;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2626p = new ArrayList();
        this.f2627q = 0;
        this.f2628r = true;
        this.f2631u = true;
        this.f2635y = new I(this, 0);
        this.f2636z = new I(this, 1);
        this.f2616A = new A0.c(26, this);
        View decorView = activity.getWindow().getDecorView();
        F(decorView);
        if (z2) {
            return;
        }
        this.f2620j = decorView.findViewById(R.id.content);
    }

    public final void D(boolean z2) {
        Z i;
        Z z3;
        if (z2) {
            if (!this.f2630t) {
                this.f2630t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2618f;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                I(false);
            }
        } else if (this.f2630t) {
            this.f2630t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2618f;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            I(false);
        }
        if (!this.f2619g.isLaidOut()) {
            if (z2) {
                ((c1) this.h).f3374a.setVisibility(4);
                this.i.setVisibility(0);
                return;
            } else {
                ((c1) this.h).f3374a.setVisibility(0);
                this.i.setVisibility(8);
                return;
            }
        }
        if (z2) {
            c1 c1Var = (c1) this.h;
            i = Q.a(c1Var.f3374a);
            i.a(RecyclerView.f1937A0);
            i.c(100L);
            i.d(new j.i(c1Var, 4));
            z3 = this.i.i(0, 200L);
        } else {
            c1 c1Var2 = (c1) this.h;
            Z a2 = Q.a(c1Var2.f3374a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(c1Var2, 0));
            i = this.i.i(8, 100L);
            z3 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f3071a;
        arrayList.add(i);
        View view = (View) i.f591a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) z3.f591a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(z3);
        jVar.b();
    }

    public final Context E() {
        if (this.f2617e == null) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(com.fortunequest.neontrack.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2617e = new ContextThemeWrapper(this.d, i);
            } else {
                this.f2617e = this.d;
            }
        }
        return this.f2617e;
    }

    public final void F(View view) {
        InterfaceC0243k0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.fortunequest.neontrack.R.id.decor_content_parent);
        this.f2618f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.fortunequest.neontrack.R.id.action_bar);
        if (findViewById instanceof InterfaceC0243k0) {
            wrapper = (InterfaceC0243k0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.h = wrapper;
        this.i = (ActionBarContextView) view.findViewById(com.fortunequest.neontrack.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.fortunequest.neontrack.R.id.action_bar_container);
        this.f2619g = actionBarContainer;
        InterfaceC0243k0 interfaceC0243k0 = this.h;
        if (interfaceC0243k0 == null || this.i == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((c1) interfaceC0243k0).f3374a.getContext();
        this.d = context;
        if ((((c1) this.h).f3375b & 4) != 0) {
            this.f2621k = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.h.getClass();
        H(context.getResources().getBoolean(com.fortunequest.neontrack.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(null, f.a.f2514a, com.fortunequest.neontrack.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2618f;
            if (!actionBarOverlayLayout2.f1689g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2634x = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2619g;
            WeakHashMap weakHashMap = Q.f578a;
            K.F.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void G(boolean z2) {
        if (this.f2621k) {
            return;
        }
        int i = z2 ? 4 : 0;
        c1 c1Var = (c1) this.h;
        int i2 = c1Var.f3375b;
        this.f2621k = true;
        c1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void H(boolean z2) {
        if (z2) {
            this.f2619g.setTabContainer(null);
            ((c1) this.h).getClass();
        } else {
            ((c1) this.h).getClass();
            this.f2619g.setTabContainer(null);
        }
        this.h.getClass();
        ((c1) this.h).f3374a.setCollapsible(false);
        this.f2618f.setHasNonEmbeddedTabs(false);
    }

    public final void I(boolean z2) {
        boolean z3 = this.f2630t || !this.f2629s;
        View view = this.f2620j;
        A0.c cVar = this.f2616A;
        if (!z3) {
            if (this.f2631u) {
                this.f2631u = false;
                j.j jVar = this.f2632v;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2627q;
                I i2 = this.f2635y;
                if (i != 0 || (!this.f2633w && !z2)) {
                    i2.a();
                    return;
                }
                this.f2619g.setAlpha(1.0f);
                this.f2619g.setTransitioning(true);
                j.j jVar2 = new j.j();
                float f2 = -this.f2619g.getHeight();
                if (z2) {
                    this.f2619g.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                Z a2 = Q.a(this.f2619g);
                a2.e(f2);
                View view2 = (View) a2.f591a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new Y(cVar, view2) : null);
                }
                boolean z4 = jVar2.f3074e;
                ArrayList arrayList = jVar2.f3071a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2628r && view != null) {
                    Z a3 = Q.a(view);
                    a3.e(f2);
                    if (!jVar2.f3074e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2614B;
                boolean z5 = jVar2.f3074e;
                if (!z5) {
                    jVar2.f3073c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f3072b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2632v = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2631u) {
            return;
        }
        this.f2631u = true;
        j.j jVar3 = this.f2632v;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f2619g.setVisibility(0);
        int i3 = this.f2627q;
        I i4 = this.f2636z;
        if (i3 == 0 && (this.f2633w || z2)) {
            this.f2619g.setTranslationY(RecyclerView.f1937A0);
            float f3 = -this.f2619g.getHeight();
            if (z2) {
                this.f2619g.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f2619g.setTranslationY(f3);
            j.j jVar4 = new j.j();
            Z a4 = Q.a(this.f2619g);
            a4.e(RecyclerView.f1937A0);
            View view3 = (View) a4.f591a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new Y(cVar, view3) : null);
            }
            boolean z6 = jVar4.f3074e;
            ArrayList arrayList2 = jVar4.f3071a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2628r && view != null) {
                view.setTranslationY(f3);
                Z a5 = Q.a(view);
                a5.e(RecyclerView.f1937A0);
                if (!jVar4.f3074e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2615C;
            boolean z7 = jVar4.f3074e;
            if (!z7) {
                jVar4.f3073c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f3072b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2632v = jVar4;
            jVar4.b();
        } else {
            this.f2619g.setAlpha(1.0f);
            this.f2619g.setTranslationY(RecyclerView.f1937A0);
            if (this.f2628r && view != null) {
                view.setTranslationY(RecyclerView.f1937A0);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2618f;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = Q.f578a;
            K.D.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2626p = new ArrayList();
        this.f2627q = 0;
        this.f2628r = true;
        this.f2631u = true;
        this.f2635y = new I(this, 0);
        this.f2636z = new I(this, 1);
        this.f2616A = new A0.c(26, this);
        F(dialog.getWindow().getDecorView());
    }
}
