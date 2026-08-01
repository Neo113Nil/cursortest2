package g;

import M.Q;
import M.W;
import M.Y;
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
import f.AbstractC0084a;
import j.C0152i;
import j.C0153j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.InterfaceC0181d;
import l.InterfaceC0200m0;
import l.e1;

/* loaded from: classes.dex */
public final class K extends z1.l implements InterfaceC0181d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2259y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2260z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2261a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2262b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2263c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0200m0 f2264e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2265f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2266g;
    public boolean h;
    public J i;

    /* renamed from: j, reason: collision with root package name */
    public J f2267j;

    /* renamed from: k, reason: collision with root package name */
    public D.j f2268k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2269l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2270m;

    /* renamed from: n, reason: collision with root package name */
    public int f2271n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2272o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2273p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2274q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2275r;

    /* renamed from: s, reason: collision with root package name */
    public C0153j f2276s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2277t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2278u;

    /* renamed from: v, reason: collision with root package name */
    public final I f2279v;

    /* renamed from: w, reason: collision with root package name */
    public final I f2280w;

    /* renamed from: x, reason: collision with root package name */
    public final E.g f2281x;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2270m = new ArrayList();
        this.f2271n = 0;
        this.f2272o = true;
        this.f2275r = true;
        this.f2279v = new I(this, 0);
        this.f2280w = new I(this, 1);
        this.f2281x = new E.g(24, this);
        View decorView = activity.getWindow().getDecorView();
        A0(decorView);
        if (z2) {
            return;
        }
        this.f2266g = decorView.findViewById(R.id.content);
    }

    public final void A0(View view) {
        InterfaceC0200m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.winfour.neondrop.R.id.decor_content_parent);
        this.f2263c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.winfour.neondrop.R.id.action_bar);
        if (findViewById instanceof InterfaceC0200m0) {
            wrapper = (InterfaceC0200m0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2264e = wrapper;
        this.f2265f = (ActionBarContextView) view.findViewById(com.winfour.neondrop.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.winfour.neondrop.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC0200m0 interfaceC0200m0 = this.f2264e;
        if (interfaceC0200m0 == null || this.f2265f == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((e1) interfaceC0200m0).f2979a.getContext();
        this.f2261a = context;
        if ((((e1) this.f2264e).f2980b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2264e.getClass();
        C0(context.getResources().getBoolean(com.winfour.neondrop.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2261a.obtainStyledAttributes(null, AbstractC0084a.f2127a, com.winfour.neondrop.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2263c;
            if (!actionBarOverlayLayout2.f1373g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2278u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = Q.f513a;
            M.F.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void B0(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        e1 e1Var = (e1) this.f2264e;
        int i2 = e1Var.f2980b;
        this.h = true;
        e1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void C0(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((e1) this.f2264e).getClass();
        } else {
            ((e1) this.f2264e).getClass();
            this.d.setTabContainer(null);
        }
        this.f2264e.getClass();
        ((e1) this.f2264e).f2979a.setCollapsible(false);
        this.f2263c.setHasNonEmbeddedTabs(false);
    }

    public final void D0(boolean z2) {
        boolean z3 = this.f2274q || !this.f2273p;
        View view = this.f2266g;
        E.g gVar = this.f2281x;
        if (!z3) {
            if (this.f2275r) {
                this.f2275r = false;
                C0153j c0153j = this.f2276s;
                if (c0153j != null) {
                    c0153j.a();
                }
                int i = this.f2271n;
                I i2 = this.f2279v;
                if (i != 0 || (!this.f2277t && !z2)) {
                    i2.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                C0153j c0153j2 = new C0153j();
                float f2 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                Y a2 = Q.a(this.d);
                a2.e(f2);
                View view2 = (View) a2.f522a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(gVar != null ? new W(gVar, view2) : null);
                }
                boolean z4 = c0153j2.f2676e;
                ArrayList arrayList = c0153j2.f2673a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2272o && view != null) {
                    Y a3 = Q.a(view);
                    a3.e(f2);
                    if (!c0153j2.f2676e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2259y;
                boolean z5 = c0153j2.f2676e;
                if (!z5) {
                    c0153j2.f2675c = accelerateInterpolator;
                }
                if (!z5) {
                    c0153j2.f2674b = 250L;
                }
                if (!z5) {
                    c0153j2.d = i2;
                }
                this.f2276s = c0153j2;
                c0153j2.b();
                return;
            }
            return;
        }
        if (this.f2275r) {
            return;
        }
        this.f2275r = true;
        C0153j c0153j3 = this.f2276s;
        if (c0153j3 != null) {
            c0153j3.a();
        }
        this.d.setVisibility(0);
        int i3 = this.f2271n;
        I i4 = this.f2280w;
        if (i3 == 0 && (this.f2277t || z2)) {
            this.d.setTranslationY(0.0f);
            float f3 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.d.setTranslationY(f3);
            C0153j c0153j4 = new C0153j();
            Y a4 = Q.a(this.d);
            a4.e(0.0f);
            View view3 = (View) a4.f522a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(gVar != null ? new W(gVar, view3) : null);
            }
            boolean z6 = c0153j4.f2676e;
            ArrayList arrayList2 = c0153j4.f2673a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2272o && view != null) {
                view.setTranslationY(f3);
                Y a5 = Q.a(view);
                a5.e(0.0f);
                if (!c0153j4.f2676e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2260z;
            boolean z7 = c0153j4.f2676e;
            if (!z7) {
                c0153j4.f2675c = decelerateInterpolator;
            }
            if (!z7) {
                c0153j4.f2674b = 250L;
            }
            if (!z7) {
                c0153j4.d = i4;
            }
            this.f2276s = c0153j4;
            c0153j4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.f2272o && view != null) {
                view.setTranslationY(0.0f);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2263c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = Q.f513a;
            M.D.c(actionBarOverlayLayout);
        }
    }

    public final void y0(boolean z2) {
        Y i;
        Y y2;
        if (z2) {
            if (!this.f2274q) {
                this.f2274q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2263c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                D0(false);
            }
        } else if (this.f2274q) {
            this.f2274q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2263c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            D0(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((e1) this.f2264e).f2979a.setVisibility(4);
                this.f2265f.setVisibility(0);
                return;
            } else {
                ((e1) this.f2264e).f2979a.setVisibility(0);
                this.f2265f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            e1 e1Var = (e1) this.f2264e;
            i = Q.a(e1Var.f2979a);
            i.a(0.0f);
            i.c(100L);
            i.d(new C0152i(e1Var, 4));
            y2 = this.f2265f.i(0, 200L);
        } else {
            e1 e1Var2 = (e1) this.f2264e;
            Y a2 = Q.a(e1Var2.f2979a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new C0152i(e1Var2, 0));
            i = this.f2265f.i(8, 100L);
            y2 = a2;
        }
        C0153j c0153j = new C0153j();
        ArrayList arrayList = c0153j.f2673a;
        arrayList.add(i);
        View view = (View) i.f522a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) y2.f522a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(y2);
        c0153j.b();
    }

    public final Context z0() {
        if (this.f2262b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2261a.getTheme().resolveAttribute(com.winfour.neondrop.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2262b = new ContextThemeWrapper(this.f2261a, i);
            } else {
                this.f2262b = this.f2261a;
            }
        }
        return this.f2262b;
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2270m = new ArrayList();
        this.f2271n = 0;
        this.f2272o = true;
        this.f2275r = true;
        this.f2279v = new I(this, 0);
        this.f2280w = new I(this, 1);
        this.f2281x = new E.g(24, this);
        A0(dialog.getWindow().getDecorView());
    }
}
