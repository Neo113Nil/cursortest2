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
import l.InterfaceC0212d;
import l.InterfaceC0231m0;
import l.e1;

/* loaded from: classes.dex */
public final class K extends u1.d implements InterfaceC0212d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2335y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2336z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2337a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2338b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2339c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0231m0 f2340e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2341f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2342g;
    public boolean h;
    public J i;

    /* renamed from: j, reason: collision with root package name */
    public J f2343j;

    /* renamed from: k, reason: collision with root package name */
    public B.j f2344k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2345l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2346m;

    /* renamed from: n, reason: collision with root package name */
    public int f2347n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2348o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2349p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2350q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2351r;

    /* renamed from: s, reason: collision with root package name */
    public j.j f2352s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2353t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2354u;

    /* renamed from: v, reason: collision with root package name */
    public final I f2355v;

    /* renamed from: w, reason: collision with root package name */
    public final I f2356w;

    /* renamed from: x, reason: collision with root package name */
    public final C.g f2357x;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2346m = new ArrayList();
        this.f2347n = 0;
        this.f2348o = true;
        this.f2351r = true;
        this.f2355v = new I(this, 0);
        this.f2356w = new I(this, 1);
        this.f2357x = new C.g(25, this);
        View decorView = activity.getWindow().getDecorView();
        w0(decorView);
        if (z2) {
            return;
        }
        this.f2342g = decorView.findViewById(R.id.content);
    }

    public final void u0(boolean z2) {
        Z i;
        Z z3;
        if (z2) {
            if (!this.f2350q) {
                this.f2350q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2339c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                z0(false);
            }
        } else if (this.f2350q) {
            this.f2350q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2339c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            z0(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((e1) this.f2340e).f2906a.setVisibility(4);
                this.f2341f.setVisibility(0);
                return;
            } else {
                ((e1) this.f2340e).f2906a.setVisibility(0);
                this.f2341f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            e1 e1Var = (e1) this.f2340e;
            i = S.a(e1Var.f2906a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.i(e1Var, 4));
            z3 = this.f2341f.i(0, 200L);
        } else {
            e1 e1Var2 = (e1) this.f2340e;
            Z a2 = S.a(e1Var2.f2906a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(e1Var2, 0));
            i = this.f2341f.i(8, 100L);
            z3 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2525a;
        arrayList.add(i);
        View view = (View) i.f378a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) z3.f378a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(z3);
        jVar.b();
    }

    public final Context v0() {
        if (this.f2338b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2337a.getTheme().resolveAttribute(com.playgen.securelock.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2338b = new ContextThemeWrapper(this.f2337a, i);
            } else {
                this.f2338b = this.f2337a;
            }
        }
        return this.f2338b;
    }

    public final void w0(View view) {
        InterfaceC0231m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.playgen.securelock.R.id.decor_content_parent);
        this.f2339c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.playgen.securelock.R.id.action_bar);
        if (findViewById instanceof InterfaceC0231m0) {
            wrapper = (InterfaceC0231m0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2340e = wrapper;
        this.f2341f = (ActionBarContextView) view.findViewById(com.playgen.securelock.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.playgen.securelock.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC0231m0 interfaceC0231m0 = this.f2340e;
        if (interfaceC0231m0 == null || this.f2341f == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((e1) interfaceC0231m0).f2906a.getContext();
        this.f2337a = context;
        if ((((e1) this.f2340e).f2907b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2340e.getClass();
        y0(context.getResources().getBoolean(com.playgen.securelock.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2337a.obtainStyledAttributes(null, f.a.f1990a, com.playgen.securelock.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2339c;
            if (!actionBarOverlayLayout2.f1226g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2354u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = S.f369a;
            K.G.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void x0(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        e1 e1Var = (e1) this.f2340e;
        int i2 = e1Var.f2907b;
        this.h = true;
        e1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void y0(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((e1) this.f2340e).getClass();
        } else {
            ((e1) this.f2340e).getClass();
            this.d.setTabContainer(null);
        }
        this.f2340e.getClass();
        ((e1) this.f2340e).f2906a.setCollapsible(false);
        this.f2339c.setHasNonEmbeddedTabs(false);
    }

    public final void z0(boolean z2) {
        boolean z3 = this.f2350q || !this.f2349p;
        View view = this.f2342g;
        C.g gVar = this.f2357x;
        if (!z3) {
            if (this.f2351r) {
                this.f2351r = false;
                j.j jVar = this.f2352s;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2347n;
                I i2 = this.f2355v;
                if (i != 0 || (!this.f2353t && !z2)) {
                    i2.a();
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
                View view2 = (View) a2.f378a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(gVar != null ? new X(gVar, view2) : null);
                }
                boolean z4 = jVar2.f2528e;
                ArrayList arrayList = jVar2.f2525a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2348o && view != null) {
                    Z a3 = S.a(view);
                    a3.e(f2);
                    if (!jVar2.f2528e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2335y;
                boolean z5 = jVar2.f2528e;
                if (!z5) {
                    jVar2.f2527c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2526b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2352s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2351r) {
            return;
        }
        this.f2351r = true;
        j.j jVar3 = this.f2352s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.d.setVisibility(0);
        int i3 = this.f2347n;
        I i4 = this.f2356w;
        if (i3 == 0 && (this.f2353t || z2)) {
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
            View view3 = (View) a4.f378a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(gVar != null ? new X(gVar, view3) : null);
            }
            boolean z6 = jVar4.f2528e;
            ArrayList arrayList2 = jVar4.f2525a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2348o && view != null) {
                view.setTranslationY(f3);
                Z a5 = S.a(view);
                a5.e(0.0f);
                if (!jVar4.f2528e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2336z;
            boolean z7 = jVar4.f2528e;
            if (!z7) {
                jVar4.f2527c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2526b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2352s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.f2348o && view != null) {
                view.setTranslationY(0.0f);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2339c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = S.f369a;
            K.E.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2346m = new ArrayList();
        this.f2347n = 0;
        this.f2348o = true;
        this.f2351r = true;
        this.f2355v = new I(this, 0);
        this.f2356w = new I(this, 1);
        this.f2357x = new C.g(25, this);
        w0(dialog.getWindow().getDecorView());
    }
}
