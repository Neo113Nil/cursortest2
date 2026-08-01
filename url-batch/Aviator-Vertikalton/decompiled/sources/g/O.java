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
import j.AbstractC0169b;
import j.InterfaceC0168a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0202o;
import k.MenuC0200m;
import l.InterfaceC0254d;
import l.InterfaceC0275n0;
import l.Z0;
import l.e1;

/* loaded from: classes.dex */
public final class O extends AbstractC0148a implements InterfaceC0254d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2517y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2518z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2519a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2520b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2521c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f2522d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0275n0 f2523e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2524f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2525g;
    public boolean h;
    public N i;

    /* renamed from: j, reason: collision with root package name */
    public N f2526j;

    /* renamed from: k, reason: collision with root package name */
    public B.j f2527k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2528l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2529m;

    /* renamed from: n, reason: collision with root package name */
    public int f2530n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2531o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2532p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2533q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2534r;

    /* renamed from: s, reason: collision with root package name */
    public j.k f2535s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2536t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2537u;

    /* renamed from: v, reason: collision with root package name */
    public final M f2538v;

    /* renamed from: w, reason: collision with root package name */
    public final M f2539w;

    /* renamed from: x, reason: collision with root package name */
    public final B0.d f2540x;

    public O(Activity activity, boolean z2) {
        new ArrayList();
        this.f2529m = new ArrayList();
        this.f2530n = 0;
        this.f2531o = true;
        this.f2534r = true;
        this.f2538v = new M(this, 0);
        this.f2539w = new M(this, 1);
        this.f2540x = new B0.d(24, this);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z2) {
            return;
        }
        this.f2525g = decorView.findViewById(R.id.content);
    }

    @Override // g.AbstractC0148a
    public final boolean b() {
        Z0 z02;
        InterfaceC0275n0 interfaceC0275n0 = this.f2523e;
        if (interfaceC0275n0 == null || (z02 = ((e1) interfaceC0275n0).f3352a.f1072M) == null || z02.f3318b == null) {
            return false;
        }
        Z0 z03 = ((e1) interfaceC0275n0).f3352a.f1072M;
        C0202o c0202o = z03 == null ? null : z03.f3318b;
        if (c0202o == null) {
            return true;
        }
        c0202o.collapseActionView();
        return true;
    }

    @Override // g.AbstractC0148a
    public final void c(boolean z2) {
        if (z2 == this.f2528l) {
            return;
        }
        this.f2528l = z2;
        ArrayList arrayList = this.f2529m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // g.AbstractC0148a
    public final int d() {
        return ((e1) this.f2523e).f3353b;
    }

    @Override // g.AbstractC0148a
    public final Context e() {
        if (this.f2520b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2519a.getTheme().resolveAttribute(com.fortuneink.neonpad.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2520b = new ContextThemeWrapper(this.f2519a, i);
            } else {
                this.f2520b = this.f2519a;
            }
        }
        return this.f2520b;
    }

    @Override // g.AbstractC0148a
    public final void g() {
        r(this.f2519a.getResources().getBoolean(com.fortuneink.neonpad.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // g.AbstractC0148a
    public final boolean i(int i, KeyEvent keyEvent) {
        MenuC0200m menuC0200m;
        N n2 = this.i;
        if (n2 == null || (menuC0200m = n2.f2513d) == null) {
            return false;
        }
        menuC0200m.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuC0200m.performShortcut(i, keyEvent, 0);
    }

    @Override // g.AbstractC0148a
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        e1 e1Var = (e1) this.f2523e;
        int i2 = e1Var.f3353b;
        this.h = true;
        e1Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // g.AbstractC0148a
    public final void m(boolean z2) {
        j.k kVar;
        this.f2536t = z2;
        if (z2 || (kVar = this.f2535s) == null) {
            return;
        }
        kVar.a();
    }

    @Override // g.AbstractC0148a
    public final void n(CharSequence charSequence) {
        e1 e1Var = (e1) this.f2523e;
        if (e1Var.f3358g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f3353b & 8) != 0) {
            Toolbar toolbar = e1Var.f3352a;
            toolbar.setTitle(charSequence);
            if (e1Var.f3358g) {
                X.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // g.AbstractC0148a
    public final AbstractC0169b o(B.j jVar) {
        N n2 = this.i;
        if (n2 != null) {
            n2.a();
        }
        this.f2521c.setHideOnContentScrollEnabled(false);
        this.f2524f.e();
        N n3 = new N(this, this.f2524f.getContext(), jVar);
        MenuC0200m menuC0200m = n3.f2513d;
        menuC0200m.w();
        try {
            if (!((InterfaceC0168a) n3.f2514e.f36b).b(n3, menuC0200m)) {
                return null;
            }
            this.i = n3;
            n3.i();
            this.f2524f.c(n3);
            p(true);
            return n3;
        } finally {
            menuC0200m.v();
        }
    }

    public final void p(boolean z2) {
        C0009e0 i;
        C0009e0 c0009e0;
        if (z2) {
            if (!this.f2533q) {
                this.f2533q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2521c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (this.f2533q) {
            this.f2533q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2521c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        if (!this.f2522d.isLaidOut()) {
            if (z2) {
                ((e1) this.f2523e).f3352a.setVisibility(4);
                this.f2524f.setVisibility(0);
                return;
            } else {
                ((e1) this.f2523e).f3352a.setVisibility(0);
                this.f2524f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            e1 e1Var = (e1) this.f2523e;
            i = X.a(e1Var.f3352a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.j(e1Var, 4));
            c0009e0 = this.f2524f.i(0, 200L);
        } else {
            e1 e1Var2 = (e1) this.f2523e;
            C0009e0 a2 = X.a(e1Var2.f3352a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.j(e1Var2, 0));
            i = this.f2524f.i(8, 100L);
            c0009e0 = a2;
        }
        j.k kVar = new j.k();
        ArrayList arrayList = kVar.f2864a;
        arrayList.add(i);
        View view = (View) i.f438a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0009e0.f438a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0009e0);
        kVar.b();
    }

    public final void q(View view) {
        InterfaceC0275n0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.fortuneink.neonpad.R.id.decor_content_parent);
        this.f2521c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.fortuneink.neonpad.R.id.action_bar);
        if (findViewById instanceof InterfaceC0275n0) {
            wrapper = (InterfaceC0275n0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2523e = wrapper;
        this.f2524f = (ActionBarContextView) view.findViewById(com.fortuneink.neonpad.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.fortuneink.neonpad.R.id.action_bar_container);
        this.f2522d = actionBarContainer;
        InterfaceC0275n0 interfaceC0275n0 = this.f2523e;
        if (interfaceC0275n0 == null || this.f2524f == null || actionBarContainer == null) {
            throw new IllegalStateException(O.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((e1) interfaceC0275n0).f3352a.getContext();
        this.f2519a = context;
        if ((((e1) this.f2523e).f3353b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2523e.getClass();
        r(context.getResources().getBoolean(com.fortuneink.neonpad.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2519a.obtainStyledAttributes(null, f.a.f2387a, com.fortuneink.neonpad.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2521c;
            if (!actionBarOverlayLayout2.f1017g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2537u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2522d;
            WeakHashMap weakHashMap = X.f418a;
            K.L.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void r(boolean z2) {
        if (z2) {
            this.f2522d.setTabContainer(null);
            ((e1) this.f2523e).getClass();
        } else {
            ((e1) this.f2523e).getClass();
            this.f2522d.setTabContainer(null);
        }
        this.f2523e.getClass();
        ((e1) this.f2523e).f3352a.setCollapsible(false);
        this.f2521c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z2) {
        boolean z3 = this.f2533q || !this.f2532p;
        View view = this.f2525g;
        B0.d dVar = this.f2540x;
        if (!z3) {
            if (this.f2534r) {
                this.f2534r = false;
                j.k kVar = this.f2535s;
                if (kVar != null) {
                    kVar.a();
                }
                int i = this.f2530n;
                M m2 = this.f2538v;
                if (i != 0 || (!this.f2536t && !z2)) {
                    m2.a();
                    return;
                }
                this.f2522d.setAlpha(1.0f);
                this.f2522d.setTransitioning(true);
                j.k kVar2 = new j.k();
                float f2 = -this.f2522d.getHeight();
                if (z2) {
                    this.f2522d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                C0009e0 a2 = X.a(this.f2522d);
                a2.e(f2);
                View view2 = (View) a2.f438a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(dVar != null ? new C0005c0(dVar, view2) : null);
                }
                boolean z4 = kVar2.f2868e;
                ArrayList arrayList = kVar2.f2864a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2531o && view != null) {
                    C0009e0 a3 = X.a(view);
                    a3.e(f2);
                    if (!kVar2.f2868e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2517y;
                boolean z5 = kVar2.f2868e;
                if (!z5) {
                    kVar2.f2866c = accelerateInterpolator;
                }
                if (!z5) {
                    kVar2.f2865b = 250L;
                }
                if (!z5) {
                    kVar2.f2867d = m2;
                }
                this.f2535s = kVar2;
                kVar2.b();
                return;
            }
            return;
        }
        if (this.f2534r) {
            return;
        }
        this.f2534r = true;
        j.k kVar3 = this.f2535s;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f2522d.setVisibility(0);
        int i2 = this.f2530n;
        M m3 = this.f2539w;
        if (i2 == 0 && (this.f2536t || z2)) {
            this.f2522d.setTranslationY(0.0f);
            float f3 = -this.f2522d.getHeight();
            if (z2) {
                this.f2522d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f2522d.setTranslationY(f3);
            j.k kVar4 = new j.k();
            C0009e0 a4 = X.a(this.f2522d);
            a4.e(0.0f);
            View view3 = (View) a4.f438a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(dVar != null ? new C0005c0(dVar, view3) : null);
            }
            boolean z6 = kVar4.f2868e;
            ArrayList arrayList2 = kVar4.f2864a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2531o && view != null) {
                view.setTranslationY(f3);
                C0009e0 a5 = X.a(view);
                a5.e(0.0f);
                if (!kVar4.f2868e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2518z;
            boolean z7 = kVar4.f2868e;
            if (!z7) {
                kVar4.f2866c = decelerateInterpolator;
            }
            if (!z7) {
                kVar4.f2865b = 250L;
            }
            if (!z7) {
                kVar4.f2867d = m3;
            }
            this.f2535s = kVar4;
            kVar4.b();
        } else {
            this.f2522d.setAlpha(1.0f);
            this.f2522d.setTranslationY(0.0f);
            if (this.f2531o && view != null) {
                view.setTranslationY(0.0f);
            }
            m3.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2521c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = X.f418a;
            K.J.c(actionBarOverlayLayout);
        }
    }

    public O(Dialog dialog) {
        new ArrayList();
        this.f2529m = new ArrayList();
        this.f2530n = 0;
        this.f2531o = true;
        this.f2534r = true;
        this.f2538v = new M(this, 0);
        this.f2539w = new M(this, 1);
        this.f2540x = new B0.d(24, this);
        q(dialog.getWindow().getDecorView());
    }
}
