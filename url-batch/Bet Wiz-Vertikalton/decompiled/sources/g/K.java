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
import l.InterfaceC0211d;
import l.InterfaceC0228l0;
import l.d1;

/* loaded from: classes.dex */
public final class K extends x1.l implements InterfaceC0211d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2396y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2397z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2398a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2399b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2400c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0228l0 f2401e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2402f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2403g;
    public boolean h;
    public J i;

    /* renamed from: j, reason: collision with root package name */
    public J f2404j;

    /* renamed from: k, reason: collision with root package name */
    public B.j f2405k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2406l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2407m;

    /* renamed from: n, reason: collision with root package name */
    public int f2408n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2409o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2410p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2411q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2412r;

    /* renamed from: s, reason: collision with root package name */
    public j.j f2413s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2414t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2415u;

    /* renamed from: v, reason: collision with root package name */
    public final I f2416v;

    /* renamed from: w, reason: collision with root package name */
    public final I f2417w;

    /* renamed from: x, reason: collision with root package name */
    public final C.g f2418x;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2407m = new ArrayList();
        this.f2408n = 0;
        this.f2409o = true;
        this.f2412r = true;
        this.f2416v = new I(this, 0);
        this.f2417w = new I(this, 1);
        this.f2418x = new C.g(24, this);
        View decorView = activity.getWindow().getDecorView();
        n0(decorView);
        if (z2) {
            return;
        }
        this.f2403g = decorView.findViewById(R.id.content);
    }

    public final void l0(boolean z2) {
        Z i;
        Z z3;
        if (z2) {
            if (!this.f2411q) {
                this.f2411q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2400c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                q0(false);
            }
        } else if (this.f2411q) {
            this.f2411q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2400c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            q0(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((d1) this.f2401e).f2959a.setVisibility(4);
                this.f2402f.setVisibility(0);
                return;
            } else {
                ((d1) this.f2401e).f2959a.setVisibility(0);
                this.f2402f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            d1 d1Var = (d1) this.f2401e;
            i = S.a(d1Var.f2959a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.i(d1Var, 4));
            z3 = this.f2402f.i(0, 200L);
        } else {
            d1 d1Var2 = (d1) this.f2401e;
            Z a2 = S.a(d1Var2.f2959a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(d1Var2, 0));
            i = this.f2402f.i(8, 100L);
            z3 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2576a;
        arrayList.add(i);
        View view = (View) i.f431a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) z3.f431a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(z3);
        jVar.b();
    }

    public final Context m0() {
        if (this.f2399b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2398a.getTheme().resolveAttribute(com.neonpulse.gridlogic.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2399b = new ContextThemeWrapper(this.f2398a, i);
            } else {
                this.f2399b = this.f2398a;
            }
        }
        return this.f2399b;
    }

    public final void n0(View view) {
        InterfaceC0228l0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.neonpulse.gridlogic.R.id.decor_content_parent);
        this.f2400c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.neonpulse.gridlogic.R.id.action_bar);
        if (findViewById instanceof InterfaceC0228l0) {
            wrapper = (InterfaceC0228l0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2401e = wrapper;
        this.f2402f = (ActionBarContextView) view.findViewById(com.neonpulse.gridlogic.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.neonpulse.gridlogic.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC0228l0 interfaceC0228l0 = this.f2401e;
        if (interfaceC0228l0 == null || this.f2402f == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((d1) interfaceC0228l0).f2959a.getContext();
        this.f2398a = context;
        if ((((d1) this.f2401e).f2960b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2401e.getClass();
        p0(context.getResources().getBoolean(com.neonpulse.gridlogic.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2398a.obtainStyledAttributes(null, f.a.f2057a, com.neonpulse.gridlogic.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2400c;
            if (!actionBarOverlayLayout2.f1271g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2415u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = S.f422a;
            K.G.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void o0(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        d1 d1Var = (d1) this.f2401e;
        int i2 = d1Var.f2960b;
        this.h = true;
        d1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void p0(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((d1) this.f2401e).getClass();
        } else {
            ((d1) this.f2401e).getClass();
            this.d.setTabContainer(null);
        }
        this.f2401e.getClass();
        ((d1) this.f2401e).f2959a.setCollapsible(false);
        this.f2400c.setHasNonEmbeddedTabs(false);
    }

    public final void q0(boolean z2) {
        boolean z3 = this.f2411q || !this.f2410p;
        View view = this.f2403g;
        C.g gVar = this.f2418x;
        if (!z3) {
            if (this.f2412r) {
                this.f2412r = false;
                j.j jVar = this.f2413s;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2408n;
                I i2 = this.f2416v;
                if (i != 0 || (!this.f2414t && !z2)) {
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
                View view2 = (View) a2.f431a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(gVar != null ? new X(gVar, view2) : null);
                }
                boolean z4 = jVar2.f2579e;
                ArrayList arrayList = jVar2.f2576a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2409o && view != null) {
                    Z a3 = S.a(view);
                    a3.e(f2);
                    if (!jVar2.f2579e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2396y;
                boolean z5 = jVar2.f2579e;
                if (!z5) {
                    jVar2.f2578c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2577b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2413s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2412r) {
            return;
        }
        this.f2412r = true;
        j.j jVar3 = this.f2413s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.d.setVisibility(0);
        int i3 = this.f2408n;
        I i4 = this.f2417w;
        if (i3 == 0 && (this.f2414t || z2)) {
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
            View view3 = (View) a4.f431a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(gVar != null ? new X(gVar, view3) : null);
            }
            boolean z6 = jVar4.f2579e;
            ArrayList arrayList2 = jVar4.f2576a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2409o && view != null) {
                view.setTranslationY(f3);
                Z a5 = S.a(view);
                a5.e(0.0f);
                if (!jVar4.f2579e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2397z;
            boolean z7 = jVar4.f2579e;
            if (!z7) {
                jVar4.f2578c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2577b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2413s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.f2409o && view != null) {
                view.setTranslationY(0.0f);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2400c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = S.f422a;
            K.E.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2407m = new ArrayList();
        this.f2408n = 0;
        this.f2409o = true;
        this.f2412r = true;
        this.f2416v = new I(this, 0);
        this.f2417w = new I(this, 1);
        this.f2418x = new C.g(24, this);
        n0(dialog.getWindow().getDecorView());
    }
}
