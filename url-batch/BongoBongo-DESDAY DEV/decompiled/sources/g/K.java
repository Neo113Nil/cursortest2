package g;

import L.C0001a0;
import L.C0005c0;
import L.T;
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
import f.AbstractC0097a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.InterfaceC0207d;
import m.InterfaceC0226m0;
import m.j1;

/* loaded from: classes.dex */
public final class K extends A1.d implements InterfaceC0207d {

    /* renamed from: C, reason: collision with root package name */
    public static final AccelerateInterpolator f2273C = new AccelerateInterpolator();

    /* renamed from: D, reason: collision with root package name */
    public static final DecelerateInterpolator f2274D = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public final I f2275A;

    /* renamed from: B, reason: collision with root package name */
    public final D.g f2276B;

    /* renamed from: e, reason: collision with root package name */
    public Context f2277e;

    /* renamed from: f, reason: collision with root package name */
    public Context f2278f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarOverlayLayout f2279g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContainer f2280h;
    public InterfaceC0226m0 i;

    /* renamed from: j, reason: collision with root package name */
    public ActionBarContextView f2281j;

    /* renamed from: k, reason: collision with root package name */
    public final View f2282k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2283l;

    /* renamed from: m, reason: collision with root package name */
    public J f2284m;

    /* renamed from: n, reason: collision with root package name */
    public J f2285n;

    /* renamed from: o, reason: collision with root package name */
    public C.j f2286o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2287p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2288q;

    /* renamed from: r, reason: collision with root package name */
    public int f2289r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2290s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2291t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2292u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2293v;

    /* renamed from: w, reason: collision with root package name */
    public k.j f2294w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2295x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2296y;

    /* renamed from: z, reason: collision with root package name */
    public final I f2297z;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2288q = new ArrayList();
        this.f2289r = 0;
        this.f2290s = true;
        this.f2293v = true;
        this.f2297z = new I(this, 0);
        this.f2275A = new I(this, 1);
        this.f2276B = new D.g(24, this);
        View decorView = activity.getWindow().getDecorView();
        o0(decorView);
        if (z2) {
            return;
        }
        this.f2282k = decorView.findViewById(R.id.content);
    }

    public final void m0(boolean z2) {
        C0005c0 i;
        C0005c0 c0005c0;
        if (z2) {
            if (!this.f2292u) {
                this.f2292u = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2279g;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                r0(false);
            }
        } else if (this.f2292u) {
            this.f2292u = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2279g;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            r0(false);
        }
        if (!this.f2280h.isLaidOut()) {
            if (z2) {
                ((j1) this.i).f3110a.setVisibility(4);
                this.f2281j.setVisibility(0);
                return;
            } else {
                ((j1) this.i).f3110a.setVisibility(0);
                this.f2281j.setVisibility(8);
                return;
            }
        }
        if (z2) {
            j1 j1Var = (j1) this.i;
            i = T.a(j1Var.f3110a);
            i.a(RecyclerView.A0);
            i.c(100L);
            i.d(new k.i(j1Var, 4));
            c0005c0 = this.f2281j.i(0, 200L);
        } else {
            j1 j1Var2 = (j1) this.i;
            C0005c0 a2 = T.a(j1Var2.f3110a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new k.i(j1Var2, 0));
            i = this.f2281j.i(8, 100L);
            c0005c0 = a2;
        }
        k.j jVar = new k.j();
        ArrayList arrayList = jVar.f2726a;
        arrayList.add(i);
        View view = (View) i.f510a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0005c0.f510a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0005c0);
        jVar.b();
    }

    public final Context n0() {
        if (this.f2278f == null) {
            TypedValue typedValue = new TypedValue();
            this.f2277e.getTheme().resolveAttribute(com.winfour.winrandom.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2278f = new ContextThemeWrapper(this.f2277e, i);
            } else {
                this.f2278f = this.f2277e;
            }
        }
        return this.f2278f;
    }

    public final void o0(View view) {
        InterfaceC0226m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.winfour.winrandom.R.id.decor_content_parent);
        this.f2279g = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.winfour.winrandom.R.id.action_bar);
        if (findViewById instanceof InterfaceC0226m0) {
            wrapper = (InterfaceC0226m0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.i = wrapper;
        this.f2281j = (ActionBarContextView) view.findViewById(com.winfour.winrandom.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.winfour.winrandom.R.id.action_bar_container);
        this.f2280h = actionBarContainer;
        InterfaceC0226m0 interfaceC0226m0 = this.i;
        if (interfaceC0226m0 == null || this.f2281j == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((j1) interfaceC0226m0).f3110a.getContext();
        this.f2277e = context;
        if ((((j1) this.i).f3111b & 4) != 0) {
            this.f2283l = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.i.getClass();
        q0(context.getResources().getBoolean(com.winfour.winrandom.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2277e.obtainStyledAttributes(null, AbstractC0097a.f2136a, com.winfour.winrandom.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2279g;
            if (!actionBarOverlayLayout2.f1369g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2296y = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2280h;
            WeakHashMap weakHashMap = T.f490a;
            L.H.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void p0(boolean z2) {
        if (this.f2283l) {
            return;
        }
        int i = z2 ? 4 : 0;
        j1 j1Var = (j1) this.i;
        int i2 = j1Var.f3111b;
        this.f2283l = true;
        j1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void q0(boolean z2) {
        if (z2) {
            this.f2280h.setTabContainer(null);
            ((j1) this.i).getClass();
        } else {
            ((j1) this.i).getClass();
            this.f2280h.setTabContainer(null);
        }
        this.i.getClass();
        ((j1) this.i).f3110a.setCollapsible(false);
        this.f2279g.setHasNonEmbeddedTabs(false);
    }

    public final void r0(boolean z2) {
        boolean z3 = this.f2292u || !this.f2291t;
        View view = this.f2282k;
        D.g gVar = this.f2276B;
        if (!z3) {
            if (this.f2293v) {
                this.f2293v = false;
                k.j jVar = this.f2294w;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2289r;
                I i2 = this.f2297z;
                if (i != 0 || (!this.f2295x && !z2)) {
                    i2.a();
                    return;
                }
                this.f2280h.setAlpha(1.0f);
                this.f2280h.setTransitioning(true);
                k.j jVar2 = new k.j();
                float f2 = -this.f2280h.getHeight();
                if (z2) {
                    this.f2280h.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                C0005c0 a2 = T.a(this.f2280h);
                a2.e(f2);
                View view2 = (View) a2.f510a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(gVar != null ? new C0001a0(gVar, view2) : null);
                }
                boolean z4 = jVar2.f2729e;
                ArrayList arrayList = jVar2.f2726a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2290s && view != null) {
                    C0005c0 a3 = T.a(view);
                    a3.e(f2);
                    if (!jVar2.f2729e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2273C;
                boolean z5 = jVar2.f2729e;
                if (!z5) {
                    jVar2.f2728c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2727b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2294w = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2293v) {
            return;
        }
        this.f2293v = true;
        k.j jVar3 = this.f2294w;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f2280h.setVisibility(0);
        int i3 = this.f2289r;
        I i4 = this.f2275A;
        if (i3 == 0 && (this.f2295x || z2)) {
            this.f2280h.setTranslationY(RecyclerView.A0);
            float f3 = -this.f2280h.getHeight();
            if (z2) {
                this.f2280h.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f2280h.setTranslationY(f3);
            k.j jVar4 = new k.j();
            C0005c0 a4 = T.a(this.f2280h);
            a4.e(RecyclerView.A0);
            View view3 = (View) a4.f510a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(gVar != null ? new C0001a0(gVar, view3) : null);
            }
            boolean z6 = jVar4.f2729e;
            ArrayList arrayList2 = jVar4.f2726a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2290s && view != null) {
                view.setTranslationY(f3);
                C0005c0 a5 = T.a(view);
                a5.e(RecyclerView.A0);
                if (!jVar4.f2729e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2274D;
            boolean z7 = jVar4.f2729e;
            if (!z7) {
                jVar4.f2728c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2727b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2294w = jVar4;
            jVar4.b();
        } else {
            this.f2280h.setAlpha(1.0f);
            this.f2280h.setTranslationY(RecyclerView.A0);
            if (this.f2290s && view != null) {
                view.setTranslationY(RecyclerView.A0);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2279g;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = T.f490a;
            L.F.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2288q = new ArrayList();
        this.f2289r = 0;
        this.f2290s = true;
        this.f2293v = true;
        this.f2297z = new I(this, 0);
        this.f2275A = new I(this, 1);
        this.f2276B = new D.g(24, this);
        o0(dialog.getWindow().getDecorView());
    }
}
