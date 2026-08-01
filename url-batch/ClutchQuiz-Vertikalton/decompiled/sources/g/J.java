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
import l.InterfaceC0207d;
import l.InterfaceC0222k0;
import l.c1;

/* loaded from: classes.dex */
public final class J extends T.d implements InterfaceC0207d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2392y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2393z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2394a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2395b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2396c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0222k0 f2397e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2398f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2399g;
    public boolean h;
    public I i;

    /* renamed from: j, reason: collision with root package name */
    public I f2400j;

    /* renamed from: k, reason: collision with root package name */
    public B.j f2401k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2402l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2403m;

    /* renamed from: n, reason: collision with root package name */
    public int f2404n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2405o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2406p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2407q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2408r;

    /* renamed from: s, reason: collision with root package name */
    public j.j f2409s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2410t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2411u;

    /* renamed from: v, reason: collision with root package name */
    public final C0127H f2412v;

    /* renamed from: w, reason: collision with root package name */
    public final C0127H f2413w;

    /* renamed from: x, reason: collision with root package name */
    public final A0.h f2414x;

    public J(Activity activity, boolean z2) {
        new ArrayList();
        this.f2403m = new ArrayList();
        this.f2404n = 0;
        this.f2405o = true;
        this.f2408r = true;
        this.f2412v = new C0127H(this, 0);
        this.f2413w = new C0127H(this, 1);
        this.f2414x = new A0.h(23, this);
        View decorView = activity.getWindow().getDecorView();
        U(decorView);
        if (z2) {
            return;
        }
        this.f2399g = decorView.findViewById(R.id.content);
    }

    public final void S(boolean z2) {
        Z i;
        Z z3;
        if (z2) {
            if (!this.f2407q) {
                this.f2407q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2396c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                X(false);
            }
        } else if (this.f2407q) {
            this.f2407q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2396c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            X(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((c1) this.f2397e).f2953a.setVisibility(4);
                this.f2398f.setVisibility(0);
                return;
            } else {
                ((c1) this.f2397e).f2953a.setVisibility(0);
                this.f2398f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            c1 c1Var = (c1) this.f2397e;
            i = S.a(c1Var.f2953a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.i(c1Var, 4));
            z3 = this.f2398f.i(0, 200L);
        } else {
            c1 c1Var2 = (c1) this.f2397e;
            Z a2 = S.a(c1Var2.f2953a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(c1Var2, 0));
            i = this.f2398f.i(8, 100L);
            z3 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2642a;
        arrayList.add(i);
        View view = (View) i.f374a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) z3.f374a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(z3);
        jVar.b();
    }

    public final Context T() {
        if (this.f2395b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2394a.getTheme().resolveAttribute(com.clutchquizarena.app.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2395b = new ContextThemeWrapper(this.f2394a, i);
            } else {
                this.f2395b = this.f2394a;
            }
        }
        return this.f2395b;
    }

    public final void U(View view) {
        InterfaceC0222k0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.clutchquizarena.app.R.id.decor_content_parent);
        this.f2396c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.clutchquizarena.app.R.id.action_bar);
        if (findViewById instanceof InterfaceC0222k0) {
            wrapper = (InterfaceC0222k0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2397e = wrapper;
        this.f2398f = (ActionBarContextView) view.findViewById(com.clutchquizarena.app.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.clutchquizarena.app.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC0222k0 interfaceC0222k0 = this.f2397e;
        if (interfaceC0222k0 == null || this.f2398f == null || actionBarContainer == null) {
            throw new IllegalStateException(J.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((c1) interfaceC0222k0).f2953a.getContext();
        this.f2394a = context;
        if ((((c1) this.f2397e).f2954b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2397e.getClass();
        W(context.getResources().getBoolean(com.clutchquizarena.app.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2394a.obtainStyledAttributes(null, f.a.f2109a, com.clutchquizarena.app.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2396c;
            if (!actionBarOverlayLayout2.f1305g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2411u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = S.f365a;
            K.G.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void V(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        c1 c1Var = (c1) this.f2397e;
        int i2 = c1Var.f2954b;
        this.h = true;
        c1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void W(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((c1) this.f2397e).getClass();
        } else {
            ((c1) this.f2397e).getClass();
            this.d.setTabContainer(null);
        }
        this.f2397e.getClass();
        ((c1) this.f2397e).f2953a.setCollapsible(false);
        this.f2396c.setHasNonEmbeddedTabs(false);
    }

    public final void X(boolean z2) {
        boolean z3 = this.f2407q || !this.f2406p;
        View view = this.f2399g;
        A0.h hVar = this.f2414x;
        if (!z3) {
            if (this.f2408r) {
                this.f2408r = false;
                j.j jVar = this.f2409s;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2404n;
                C0127H c0127h = this.f2412v;
                if (i != 0 || (!this.f2410t && !z2)) {
                    c0127h.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                j.j jVar2 = new j.j();
                float f2 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                Z a2 = S.a(this.d);
                a2.e(f2);
                View view2 = (View) a2.f374a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(hVar != null ? new X(hVar, view2) : null);
                }
                boolean z4 = jVar2.f2645e;
                ArrayList arrayList = jVar2.f2642a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2405o && view != null) {
                    Z a3 = S.a(view);
                    a3.e(f2);
                    if (!jVar2.f2645e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2392y;
                boolean z5 = jVar2.f2645e;
                if (!z5) {
                    jVar2.f2644c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2643b = 250L;
                }
                if (!z5) {
                    jVar2.d = c0127h;
                }
                this.f2409s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2408r) {
            return;
        }
        this.f2408r = true;
        j.j jVar3 = this.f2409s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.f2404n;
        C0127H c0127h2 = this.f2413w;
        if (i2 == 0 && (this.f2410t || z2)) {
            this.d.setTranslationY(0.0f);
            float f3 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.d.setTranslationY(f3);
            j.j jVar4 = new j.j();
            Z a4 = S.a(this.d);
            a4.e(0.0f);
            View view3 = (View) a4.f374a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(hVar != null ? new X(hVar, view3) : null);
            }
            boolean z6 = jVar4.f2645e;
            ArrayList arrayList2 = jVar4.f2642a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2405o && view != null) {
                view.setTranslationY(f3);
                Z a5 = S.a(view);
                a5.e(0.0f);
                if (!jVar4.f2645e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2393z;
            boolean z7 = jVar4.f2645e;
            if (!z7) {
                jVar4.f2644c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2643b = 250L;
            }
            if (!z7) {
                jVar4.d = c0127h2;
            }
            this.f2409s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.f2405o && view != null) {
                view.setTranslationY(0.0f);
            }
            c0127h2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2396c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = S.f365a;
            K.E.c(actionBarOverlayLayout);
        }
    }

    public J(Dialog dialog) {
        new ArrayList();
        this.f2403m = new ArrayList();
        this.f2404n = 0;
        this.f2405o = true;
        this.f2408r = true;
        this.f2412v = new C0127H(this, 0);
        this.f2413w = new C0127H(this, 1);
        this.f2414x = new A0.h(23, this);
        U(dialog.getWindow().getDecorView());
    }
}
