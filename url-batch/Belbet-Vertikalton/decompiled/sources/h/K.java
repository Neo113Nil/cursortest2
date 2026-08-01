package h;

import M.P;
import M.V;
import M.W;
import a.AbstractC0058a;
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
import g.AbstractC0122a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.InterfaceC0268d;
import n.InterfaceC0285l0;
import n.i1;

/* loaded from: classes.dex */
public final class K extends AbstractC0058a implements InterfaceC0268d {

    /* renamed from: C, reason: collision with root package name */
    public static final AccelerateInterpolator f2745C = new AccelerateInterpolator();

    /* renamed from: D, reason: collision with root package name */
    public static final DecelerateInterpolator f2746D = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public final I f2747A;

    /* renamed from: B, reason: collision with root package name */
    public final C1.d f2748B;
    public Context e;

    /* renamed from: f, reason: collision with root package name */
    public Context f2749f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarOverlayLayout f2750g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContainer f2751h;
    public InterfaceC0285l0 i;
    public ActionBarContextView j;

    /* renamed from: k, reason: collision with root package name */
    public final View f2752k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2753l;

    /* renamed from: m, reason: collision with root package name */
    public J f2754m;

    /* renamed from: n, reason: collision with root package name */
    public J f2755n;

    /* renamed from: o, reason: collision with root package name */
    public B1.c f2756o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2757p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2758q;

    /* renamed from: r, reason: collision with root package name */
    public int f2759r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2760s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2761t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2762u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2763v;

    /* renamed from: w, reason: collision with root package name */
    public l.j f2764w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2765x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2766y;

    /* renamed from: z, reason: collision with root package name */
    public final I f2767z;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2758q = new ArrayList();
        this.f2759r = 0;
        this.f2760s = true;
        this.f2763v = true;
        this.f2767z = new I(this, 0);
        this.f2747A = new I(this, 1);
        this.f2748B = new C1.d(25, this);
        View decorView = activity.getWindow().getDecorView();
        j0(decorView);
        if (z2) {
            return;
        }
        this.f2752k = decorView.findViewById(R.id.content);
    }

    public final void h0(boolean z2) {
        W i;
        W w2;
        if (z2) {
            if (!this.f2762u) {
                this.f2762u = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2750g;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m0(false);
            }
        } else if (this.f2762u) {
            this.f2762u = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2750g;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m0(false);
        }
        if (!this.f2751h.isLaidOut()) {
            if (z2) {
                ((i1) this.i).f3637a.setVisibility(4);
                this.j.setVisibility(0);
                return;
            } else {
                ((i1) this.i).f3637a.setVisibility(0);
                this.j.setVisibility(8);
                return;
            }
        }
        if (z2) {
            i1 i1Var = (i1) this.i;
            i = P.a(i1Var.f3637a);
            i.a(0.0f);
            i.c(100L);
            i.d(new l.i(i1Var, 4));
            w2 = this.j.i(0, 200L);
        } else {
            i1 i1Var2 = (i1) this.i;
            W a2 = P.a(i1Var2.f3637a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new l.i(i1Var2, 0));
            i = this.j.i(8, 100L);
            w2 = a2;
        }
        l.j jVar = new l.j();
        ArrayList arrayList = jVar.f3241a;
        arrayList.add(i);
        View view = (View) i.f718a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) w2.f718a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(w2);
        jVar.b();
    }

    public final Context i0() {
        if (this.f2749f == null) {
            TypedValue typedValue = new TypedValue();
            this.e.getTheme().resolveAttribute(com.winpower.neonfit.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2749f = new ContextThemeWrapper(this.e, i);
            } else {
                this.f2749f = this.e;
            }
        }
        return this.f2749f;
    }

    public final void j0(View view) {
        InterfaceC0285l0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.winpower.neonfit.R.id.decor_content_parent);
        this.f2750g = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.winpower.neonfit.R.id.action_bar);
        if (findViewById instanceof InterfaceC0285l0) {
            wrapper = (InterfaceC0285l0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.i = wrapper;
        this.j = (ActionBarContextView) view.findViewById(com.winpower.neonfit.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.winpower.neonfit.R.id.action_bar_container);
        this.f2751h = actionBarContainer;
        InterfaceC0285l0 interfaceC0285l0 = this.i;
        if (interfaceC0285l0 == null || this.j == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((i1) interfaceC0285l0).f3637a.getContext();
        this.e = context;
        if ((((i1) this.i).f3638b & 4) != 0) {
            this.f2753l = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.i.getClass();
        l0(context.getResources().getBoolean(com.winpower.neonfit.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(null, AbstractC0122a.f2695a, com.winpower.neonfit.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2750g;
            if (!actionBarOverlayLayout2.f1735g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2766y = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2751h;
            WeakHashMap weakHashMap = P.f711a;
            M.E.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void k0(boolean z2) {
        if (this.f2753l) {
            return;
        }
        int i = z2 ? 4 : 0;
        i1 i1Var = (i1) this.i;
        int i2 = i1Var.f3638b;
        this.f2753l = true;
        i1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void l0(boolean z2) {
        if (z2) {
            this.f2751h.setTabContainer(null);
            ((i1) this.i).getClass();
        } else {
            ((i1) this.i).getClass();
            this.f2751h.setTabContainer(null);
        }
        this.i.getClass();
        ((i1) this.i).f3637a.setCollapsible(false);
        this.f2750g.setHasNonEmbeddedTabs(false);
    }

    public final void m0(boolean z2) {
        boolean z3 = this.f2762u || !this.f2761t;
        View view = this.f2752k;
        C1.d dVar = this.f2748B;
        if (!z3) {
            if (this.f2763v) {
                this.f2763v = false;
                l.j jVar = this.f2764w;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2759r;
                I i2 = this.f2767z;
                if (i != 0 || (!this.f2765x && !z2)) {
                    i2.a();
                    return;
                }
                this.f2751h.setAlpha(1.0f);
                this.f2751h.setTransitioning(true);
                l.j jVar2 = new l.j();
                float f2 = -this.f2751h.getHeight();
                if (z2) {
                    this.f2751h.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                W a2 = P.a(this.f2751h);
                a2.e(f2);
                View view2 = (View) a2.f718a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(dVar != null ? new V(dVar, view2) : null);
                }
                boolean z4 = jVar2.e;
                ArrayList arrayList = jVar2.f3241a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2760s && view != null) {
                    W a3 = P.a(view);
                    a3.e(f2);
                    if (!jVar2.e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2745C;
                boolean z5 = jVar2.e;
                if (!z5) {
                    jVar2.f3243c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f3242b = 250L;
                }
                if (!z5) {
                    jVar2.f3244d = i2;
                }
                this.f2764w = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2763v) {
            return;
        }
        this.f2763v = true;
        l.j jVar3 = this.f2764w;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f2751h.setVisibility(0);
        int i3 = this.f2759r;
        I i4 = this.f2747A;
        if (i3 == 0 && (this.f2765x || z2)) {
            this.f2751h.setTranslationY(0.0f);
            float f3 = -this.f2751h.getHeight();
            if (z2) {
                this.f2751h.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f2751h.setTranslationY(f3);
            l.j jVar4 = new l.j();
            W a4 = P.a(this.f2751h);
            a4.e(0.0f);
            View view3 = (View) a4.f718a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(dVar != null ? new V(dVar, view3) : null);
            }
            boolean z6 = jVar4.e;
            ArrayList arrayList2 = jVar4.f3241a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2760s && view != null) {
                view.setTranslationY(f3);
                W a5 = P.a(view);
                a5.e(0.0f);
                if (!jVar4.e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2746D;
            boolean z7 = jVar4.e;
            if (!z7) {
                jVar4.f3243c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f3242b = 250L;
            }
            if (!z7) {
                jVar4.f3244d = i4;
            }
            this.f2764w = jVar4;
            jVar4.b();
        } else {
            this.f2751h.setAlpha(1.0f);
            this.f2751h.setTranslationY(0.0f);
            if (this.f2760s && view != null) {
                view.setTranslationY(0.0f);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2750g;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = P.f711a;
            M.C.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2758q = new ArrayList();
        this.f2759r = 0;
        this.f2760s = true;
        this.f2763v = true;
        this.f2767z = new I(this, 0);
        this.f2747A = new I(this, 1);
        this.f2748B = new C1.d(25, this);
        j0(dialog.getWindow().getDecorView());
    }
}
