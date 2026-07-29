package g;

import K.C0001a0;
import K.T;
import K.Y;
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
import l.InterfaceC0228d;
import l.InterfaceC0247m0;
import l.d1;

/* loaded from: classes.dex */
public final class K extends q1.l implements InterfaceC0228d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2261y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2262z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2263a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2264b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2265c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0247m0 f2266e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2267f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2268g;
    public boolean h;
    public J i;

    /* renamed from: j, reason: collision with root package name */
    public J f2269j;

    /* renamed from: k, reason: collision with root package name */
    public B.j f2270k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2271l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2272m;

    /* renamed from: n, reason: collision with root package name */
    public int f2273n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2274o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2275p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2276q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2277r;

    /* renamed from: s, reason: collision with root package name */
    public j.j f2278s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2279t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2280u;

    /* renamed from: v, reason: collision with root package name */
    public final I f2281v;

    /* renamed from: w, reason: collision with root package name */
    public final I f2282w;

    /* renamed from: x, reason: collision with root package name */
    public final B0.d f2283x;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2272m = new ArrayList();
        this.f2273n = 0;
        this.f2274o = true;
        this.f2277r = true;
        this.f2281v = new I(this, 0);
        this.f2282w = new I(this, 1);
        this.f2283x = new B0.d(25, this);
        View decorView = activity.getWindow().getDecorView();
        f0(decorView);
        if (z2) {
            return;
        }
        this.f2268g = decorView.findViewById(R.id.content);
    }

    public final void d0(boolean z2) {
        C0001a0 i;
        C0001a0 c0001a0;
        if (z2) {
            if (!this.f2276q) {
                this.f2276q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2265c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                i0(false);
            }
        } else if (this.f2276q) {
            this.f2276q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2265c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            i0(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((d1) this.f2266e).f2952a.setVisibility(4);
                this.f2267f.setVisibility(0);
                return;
            } else {
                ((d1) this.f2266e).f2952a.setVisibility(0);
                this.f2267f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            d1 d1Var = (d1) this.f2266e;
            i = T.a(d1Var.f2952a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.i(d1Var, 4));
            c0001a0 = this.f2267f.i(0, 200L);
        } else {
            d1 d1Var2 = (d1) this.f2266e;
            C0001a0 a2 = T.a(d1Var2.f2952a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(d1Var2, 0));
            i = this.f2267f.i(8, 100L);
            c0001a0 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2575a;
        arrayList.add(i);
        View view = (View) i.f391a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0001a0.f391a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0001a0);
        jVar.b();
    }

    public final Context e0() {
        if (this.f2264b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2263a.getTheme().resolveAttribute(com.luckyreads.bookshelf.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2264b = new ContextThemeWrapper(this.f2263a, i);
            } else {
                this.f2264b = this.f2263a;
            }
        }
        return this.f2264b;
    }

    public final void f0(View view) {
        InterfaceC0247m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.luckyreads.bookshelf.R.id.decor_content_parent);
        this.f2265c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.luckyreads.bookshelf.R.id.action_bar);
        if (findViewById instanceof InterfaceC0247m0) {
            wrapper = (InterfaceC0247m0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2266e = wrapper;
        this.f2267f = (ActionBarContextView) view.findViewById(com.luckyreads.bookshelf.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.luckyreads.bookshelf.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC0247m0 interfaceC0247m0 = this.f2266e;
        if (interfaceC0247m0 == null || this.f2267f == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((d1) interfaceC0247m0).f2952a.getContext();
        this.f2263a = context;
        if ((((d1) this.f2266e).f2953b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2266e.getClass();
        h0(context.getResources().getBoolean(com.luckyreads.bookshelf.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2263a.obtainStyledAttributes(null, f.a.f1921a, com.luckyreads.bookshelf.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2265c;
            if (!actionBarOverlayLayout2.f1163g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2280u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = T.f381a;
            K.H.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void g0(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        d1 d1Var = (d1) this.f2266e;
        int i2 = d1Var.f2953b;
        this.h = true;
        d1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void h0(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((d1) this.f2266e).getClass();
        } else {
            ((d1) this.f2266e).getClass();
            this.d.setTabContainer(null);
        }
        this.f2266e.getClass();
        ((d1) this.f2266e).f2952a.setCollapsible(false);
        this.f2265c.setHasNonEmbeddedTabs(false);
    }

    public final void i0(boolean z2) {
        boolean z3 = this.f2276q || !this.f2275p;
        View view = this.f2268g;
        B0.d dVar = this.f2283x;
        if (!z3) {
            if (this.f2277r) {
                this.f2277r = false;
                j.j jVar = this.f2278s;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2273n;
                I i2 = this.f2281v;
                if (i != 0 || (!this.f2279t && !z2)) {
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
                C0001a0 a2 = T.a(this.d);
                a2.e(f2);
                View view2 = (View) a2.f391a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(dVar != null ? new Y(dVar, view2) : null);
                }
                boolean z4 = jVar2.f2578e;
                ArrayList arrayList = jVar2.f2575a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2274o && view != null) {
                    C0001a0 a3 = T.a(view);
                    a3.e(f2);
                    if (!jVar2.f2578e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2261y;
                boolean z5 = jVar2.f2578e;
                if (!z5) {
                    jVar2.f2577c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2576b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2278s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2277r) {
            return;
        }
        this.f2277r = true;
        j.j jVar3 = this.f2278s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.d.setVisibility(0);
        int i3 = this.f2273n;
        I i4 = this.f2282w;
        if (i3 == 0 && (this.f2279t || z2)) {
            this.d.setTranslationY(0.0f);
            float f3 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.d.setTranslationY(f3);
            j.j jVar4 = new j.j();
            C0001a0 a4 = T.a(this.d);
            a4.e(0.0f);
            View view3 = (View) a4.f391a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(dVar != null ? new Y(dVar, view3) : null);
            }
            boolean z6 = jVar4.f2578e;
            ArrayList arrayList2 = jVar4.f2575a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2274o && view != null) {
                view.setTranslationY(f3);
                C0001a0 a5 = T.a(view);
                a5.e(0.0f);
                if (!jVar4.f2578e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2262z;
            boolean z7 = jVar4.f2578e;
            if (!z7) {
                jVar4.f2577c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2576b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2278s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.f2274o && view != null) {
                view.setTranslationY(0.0f);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2265c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = T.f381a;
            K.F.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2272m = new ArrayList();
        this.f2273n = 0;
        this.f2274o = true;
        this.f2277r = true;
        this.f2281v = new I(this, 0);
        this.f2282w = new I(this, 1);
        this.f2283x = new B0.d(25, this);
        f0(dialog.getWindow().getDecorView());
    }
}
