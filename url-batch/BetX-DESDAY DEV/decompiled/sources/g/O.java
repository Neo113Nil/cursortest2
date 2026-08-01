package g;

import K.C0005c0;
import K.C0009e0;
import K.X;
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
import j.AbstractC0170b;
import j.InterfaceC0169a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0204o;
import k.MenuC0202m;
import l.InterfaceC0256d;
import l.InterfaceC0275m0;
import l.Y0;
import l.d1;

/* loaded from: classes.dex */
public final class O extends AbstractC0149a implements InterfaceC0256d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2521y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2522z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2523a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2524b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2525c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f2526d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0275m0 f2527e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2528f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2529g;
    public boolean h;
    public N i;

    /* renamed from: j, reason: collision with root package name */
    public N f2530j;

    /* renamed from: k, reason: collision with root package name */
    public B.j f2531k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2532l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2533m;

    /* renamed from: n, reason: collision with root package name */
    public int f2534n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2535o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2536p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2537q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2538r;

    /* renamed from: s, reason: collision with root package name */
    public j.k f2539s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2540t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2541u;

    /* renamed from: v, reason: collision with root package name */
    public final M f2542v;

    /* renamed from: w, reason: collision with root package name */
    public final M f2543w;

    /* renamed from: x, reason: collision with root package name */
    public final B0.d f2544x;

    public O(Activity activity, boolean z2) {
        new ArrayList();
        this.f2533m = new ArrayList();
        this.f2534n = 0;
        this.f2535o = true;
        this.f2538r = true;
        this.f2542v = new M(this, 0);
        this.f2543w = new M(this, 1);
        this.f2544x = new B0.d(22, this);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z2) {
            return;
        }
        this.f2529g = decorView.findViewById(R.id.content);
    }

    @Override // g.AbstractC0149a
    public final boolean b() {
        Y0 y02;
        InterfaceC0275m0 interfaceC0275m0 = this.f2527e;
        if (interfaceC0275m0 == null || (y02 = ((d1) interfaceC0275m0).f3352a.f1073M) == null || y02.f3318b == null) {
            return false;
        }
        Y0 y03 = ((d1) interfaceC0275m0).f3352a.f1073M;
        C0204o c0204o = y03 == null ? null : y03.f3318b;
        if (c0204o == null) {
            return true;
        }
        c0204o.collapseActionView();
        return true;
    }

    @Override // g.AbstractC0149a
    public final void c(boolean z2) {
        if (z2 == this.f2532l) {
            return;
        }
        this.f2532l = z2;
        ArrayList arrayList = this.f2533m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // g.AbstractC0149a
    public final int d() {
        return ((d1) this.f2527e).f3353b;
    }

    @Override // g.AbstractC0149a
    public final Context e() {
        if (this.f2524b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2523a.getTheme().resolveAttribute(com.luckyarcade.spinthrow.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2524b = new ContextThemeWrapper(this.f2523a, i);
            } else {
                this.f2524b = this.f2523a;
            }
        }
        return this.f2524b;
    }

    @Override // g.AbstractC0149a
    public final void g() {
        r(this.f2523a.getResources().getBoolean(com.luckyarcade.spinthrow.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // g.AbstractC0149a
    public final boolean i(int i, KeyEvent keyEvent) {
        MenuC0202m menuC0202m;
        N n2 = this.i;
        if (n2 == null || (menuC0202m = n2.f2517d) == null) {
            return false;
        }
        menuC0202m.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuC0202m.performShortcut(i, keyEvent, 0);
    }

    @Override // g.AbstractC0149a
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        d1 d1Var = (d1) this.f2527e;
        int i2 = d1Var.f3353b;
        this.h = true;
        d1Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // g.AbstractC0149a
    public final void m(boolean z2) {
        j.k kVar;
        this.f2540t = z2;
        if (z2 || (kVar = this.f2539s) == null) {
            return;
        }
        kVar.a();
    }

    @Override // g.AbstractC0149a
    public final void n(CharSequence charSequence) {
        d1 d1Var = (d1) this.f2527e;
        if (d1Var.f3358g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f3353b & 8) != 0) {
            Toolbar toolbar = d1Var.f3352a;
            toolbar.setTitle(charSequence);
            if (d1Var.f3358g) {
                X.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // g.AbstractC0149a
    public final AbstractC0170b o(B.j jVar) {
        N n2 = this.i;
        if (n2 != null) {
            n2.a();
        }
        this.f2525c.setHideOnContentScrollEnabled(false);
        this.f2528f.e();
        N n3 = new N(this, this.f2528f.getContext(), jVar);
        MenuC0202m menuC0202m = n3.f2517d;
        menuC0202m.w();
        try {
            if (!((InterfaceC0169a) n3.f2518e.f36b).b(n3, menuC0202m)) {
                return null;
            }
            this.i = n3;
            n3.g();
            this.f2528f.c(n3);
            p(true);
            return n3;
        } finally {
            menuC0202m.v();
        }
    }

    public final void p(boolean z2) {
        C0009e0 i;
        C0009e0 c0009e0;
        if (z2) {
            if (!this.f2537q) {
                this.f2537q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2525c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (this.f2537q) {
            this.f2537q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2525c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        if (!this.f2526d.isLaidOut()) {
            if (z2) {
                ((d1) this.f2527e).f3352a.setVisibility(4);
                this.f2528f.setVisibility(0);
                return;
            } else {
                ((d1) this.f2527e).f3352a.setVisibility(0);
                this.f2528f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            d1 d1Var = (d1) this.f2527e;
            i = X.a(d1Var.f3352a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.j(d1Var, 4));
            c0009e0 = this.f2528f.i(0, 200L);
        } else {
            d1 d1Var2 = (d1) this.f2527e;
            C0009e0 a2 = X.a(d1Var2.f3352a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.j(d1Var2, 0));
            i = this.f2528f.i(8, 100L);
            c0009e0 = a2;
        }
        j.k kVar = new j.k();
        ArrayList arrayList = kVar.f2868a;
        arrayList.add(i);
        View view = (View) i.f439a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0009e0.f439a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0009e0);
        kVar.b();
    }

    public final void q(View view) {
        InterfaceC0275m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.luckyarcade.spinthrow.R.id.decor_content_parent);
        this.f2525c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.luckyarcade.spinthrow.R.id.action_bar);
        if (findViewById instanceof InterfaceC0275m0) {
            wrapper = (InterfaceC0275m0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2527e = wrapper;
        this.f2528f = (ActionBarContextView) view.findViewById(com.luckyarcade.spinthrow.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.luckyarcade.spinthrow.R.id.action_bar_container);
        this.f2526d = actionBarContainer;
        InterfaceC0275m0 interfaceC0275m0 = this.f2527e;
        if (interfaceC0275m0 == null || this.f2528f == null || actionBarContainer == null) {
            throw new IllegalStateException(O.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((d1) interfaceC0275m0).f3352a.getContext();
        this.f2523a = context;
        if ((((d1) this.f2527e).f3353b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2527e.getClass();
        r(context.getResources().getBoolean(com.luckyarcade.spinthrow.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2523a.obtainStyledAttributes(null, f.a.f2391a, com.luckyarcade.spinthrow.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2525c;
            if (!actionBarOverlayLayout2.f1018g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2541u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2526d;
            WeakHashMap weakHashMap = X.f419a;
            K.L.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void r(boolean z2) {
        if (z2) {
            this.f2526d.setTabContainer(null);
            ((d1) this.f2527e).getClass();
        } else {
            ((d1) this.f2527e).getClass();
            this.f2526d.setTabContainer(null);
        }
        this.f2527e.getClass();
        ((d1) this.f2527e).f3352a.setCollapsible(false);
        this.f2525c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z2) {
        boolean z3 = this.f2537q || !this.f2536p;
        View view = this.f2529g;
        B0.d dVar = this.f2544x;
        if (!z3) {
            if (this.f2538r) {
                this.f2538r = false;
                j.k kVar = this.f2539s;
                if (kVar != null) {
                    kVar.a();
                }
                int i = this.f2534n;
                M m2 = this.f2542v;
                if (i != 0 || (!this.f2540t && !z2)) {
                    m2.a();
                    return;
                }
                this.f2526d.setAlpha(1.0f);
                this.f2526d.setTransitioning(true);
                j.k kVar2 = new j.k();
                float f2 = -this.f2526d.getHeight();
                if (z2) {
                    this.f2526d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                C0009e0 a2 = X.a(this.f2526d);
                a2.e(f2);
                View view2 = (View) a2.f439a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(dVar != null ? new C0005c0(dVar, view2) : null);
                }
                boolean z4 = kVar2.f2872e;
                ArrayList arrayList = kVar2.f2868a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2535o && view != null) {
                    C0009e0 a3 = X.a(view);
                    a3.e(f2);
                    if (!kVar2.f2872e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2521y;
                boolean z5 = kVar2.f2872e;
                if (!z5) {
                    kVar2.f2870c = accelerateInterpolator;
                }
                if (!z5) {
                    kVar2.f2869b = 250L;
                }
                if (!z5) {
                    kVar2.f2871d = m2;
                }
                this.f2539s = kVar2;
                kVar2.b();
                return;
            }
            return;
        }
        if (this.f2538r) {
            return;
        }
        this.f2538r = true;
        j.k kVar3 = this.f2539s;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f2526d.setVisibility(0);
        int i2 = this.f2534n;
        M m3 = this.f2543w;
        if (i2 == 0 && (this.f2540t || z2)) {
            this.f2526d.setTranslationY(0.0f);
            float f3 = -this.f2526d.getHeight();
            if (z2) {
                this.f2526d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f2526d.setTranslationY(f3);
            j.k kVar4 = new j.k();
            C0009e0 a4 = X.a(this.f2526d);
            a4.e(0.0f);
            View view3 = (View) a4.f439a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(dVar != null ? new C0005c0(dVar, view3) : null);
            }
            boolean z6 = kVar4.f2872e;
            ArrayList arrayList2 = kVar4.f2868a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2535o && view != null) {
                view.setTranslationY(f3);
                C0009e0 a5 = X.a(view);
                a5.e(0.0f);
                if (!kVar4.f2872e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2522z;
            boolean z7 = kVar4.f2872e;
            if (!z7) {
                kVar4.f2870c = decelerateInterpolator;
            }
            if (!z7) {
                kVar4.f2869b = 250L;
            }
            if (!z7) {
                kVar4.f2871d = m3;
            }
            this.f2539s = kVar4;
            kVar4.b();
        } else {
            this.f2526d.setAlpha(1.0f);
            this.f2526d.setTranslationY(0.0f);
            if (this.f2535o && view != null) {
                view.setTranslationY(0.0f);
            }
            m3.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2525c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = X.f419a;
            K.J.c(actionBarOverlayLayout);
        }
    }

    public O(Dialog dialog) {
        new ArrayList();
        this.f2533m = new ArrayList();
        this.f2534n = 0;
        this.f2535o = true;
        this.f2538r = true;
        this.f2542v = new M(this, 0);
        this.f2543w = new M(this, 1);
        this.f2544x = new B0.d(22, this);
        q(dialog.getWindow().getDecorView());
    }
}
