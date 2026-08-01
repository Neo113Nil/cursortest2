package f;

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
import k.i1;
import k.z2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l0 extends k3.d implements k.d {
    public static final AccelerateInterpolator D = new AccelerateInterpolator();
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public final j0 A;
    public final j0 B;
    public final a2.e C;

    /* renamed from: f, reason: collision with root package name */
    public Context f1617f;
    public Context g;
    public ActionBarOverlayLayout h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarContainer f1618i;

    /* renamed from: j, reason: collision with root package name */
    public i1 f1619j;

    /* renamed from: k, reason: collision with root package name */
    public ActionBarContextView f1620k;

    /* renamed from: l, reason: collision with root package name */
    public final View f1621l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1622m;

    /* renamed from: n, reason: collision with root package name */
    public k0 f1623n;

    /* renamed from: o, reason: collision with root package name */
    public k0 f1624o;

    /* renamed from: p, reason: collision with root package name */
    public a2.s f1625p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1626q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f1627r;

    /* renamed from: s, reason: collision with root package name */
    public int f1628s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1629t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1630u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1631v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1632w;

    /* renamed from: x, reason: collision with root package name */
    public i.j f1633x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1634y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1635z;

    public l0(Activity activity, boolean z3) {
        new ArrayList();
        this.f1627r = new ArrayList();
        this.f1628s = 0;
        this.f1629t = true;
        this.f1632w = true;
        this.A = new j0(this, 0);
        this.B = new j0(this, 1);
        this.C = new a2.e(12, this);
        View decorView = activity.getWindow().getDecorView();
        n0(decorView);
        if (z3) {
            return;
        }
        this.f1621l = decorView.findViewById(R.id.content);
    }

    public final void l0(boolean z3) {
        k0.l0 i4;
        k0.l0 l0Var;
        if (z3) {
            if (!this.f1631v) {
                this.f1631v = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.h;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                q0(false);
            }
        } else if (this.f1631v) {
            this.f1631v = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.h;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            q0(false);
        }
        if (!this.f1618i.isLaidOut()) {
            if (z3) {
                ((z2) this.f1619j).f2699a.setVisibility(4);
                this.f1620k.setVisibility(0);
                return;
            } else {
                ((z2) this.f1619j).f2699a.setVisibility(0);
                this.f1620k.setVisibility(8);
                return;
            }
        }
        if (z3) {
            z2 z2Var = (z2) this.f1619j;
            i4 = k0.j0.a(z2Var.f2699a);
            i4.a(0.0f);
            i4.c(100L);
            i4.d(new i.i(z2Var, 4));
            l0Var = this.f1620k.i(0, 200L);
        } else {
            z2 z2Var2 = (z2) this.f1619j;
            k0.l0 a4 = k0.j0.a(z2Var2.f2699a);
            a4.a(1.0f);
            a4.c(200L);
            a4.d(new i.i(z2Var2, 0));
            i4 = this.f1620k.i(8, 100L);
            l0Var = a4;
        }
        i.j jVar = new i.j();
        ArrayList arrayList = jVar.f2075a;
        arrayList.add(i4);
        View view = (View) i4.f2758a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) l0Var.f2758a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(l0Var);
        jVar.b();
    }

    public final Context m0() {
        if (this.g == null) {
            TypedValue typedValue = new TypedValue();
            this.f1617f.getTheme().resolveAttribute(com.gglhk.bofio.fortunetiger.R.attr.actionBarWidgetTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.g = new ContextThemeWrapper(this.f1617f, i4);
            } else {
                this.g = this.f1617f;
            }
        }
        return this.g;
    }

    public final void n0(View view) {
        i1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.gglhk.bofio.fortunetiger.R.id.decor_content_parent);
        this.h = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.gglhk.bofio.fortunetiger.R.id.action_bar);
        if (findViewById instanceof i1) {
            wrapper = (i1) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f1619j = wrapper;
        this.f1620k = (ActionBarContextView) view.findViewById(com.gglhk.bofio.fortunetiger.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.gglhk.bofio.fortunetiger.R.id.action_bar_container);
        this.f1618i = actionBarContainer;
        i1 i1Var = this.f1619j;
        if (i1Var == null || this.f1620k == null || actionBarContainer == null) {
            throw new IllegalStateException(l0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((z2) i1Var).f2699a.getContext();
        this.f1617f = context;
        if ((((z2) this.f1619j).f2700b & 4) != 0) {
            this.f1622m = true;
        }
        int i4 = context.getApplicationInfo().targetSdkVersion;
        this.f1619j.getClass();
        p0(context.getResources().getBoolean(com.gglhk.bofio.fortunetiger.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f1617f.obtainStyledAttributes(null, e.a.f1495a, com.gglhk.bofio.fortunetiger.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.h;
            if (!actionBarOverlayLayout2.f204l) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f1635z = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1618i;
            WeakHashMap weakHashMap = k0.j0.f2752a;
            k0.b0.i(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void o0(boolean z3) {
        if (this.f1622m) {
            return;
        }
        int i4 = z3 ? 4 : 0;
        z2 z2Var = (z2) this.f1619j;
        int i5 = z2Var.f2700b;
        this.f1622m = true;
        z2Var.a((i4 & 4) | (i5 & (-5)));
    }

    public final void p0(boolean z3) {
        if (z3) {
            this.f1618i.setTabContainer(null);
            ((z2) this.f1619j).getClass();
        } else {
            ((z2) this.f1619j).getClass();
            this.f1618i.setTabContainer(null);
        }
        this.f1619j.getClass();
        ((z2) this.f1619j).f2699a.setCollapsible(false);
        this.h.setHasNonEmbeddedTabs(false);
    }

    public final void q0(boolean z3) {
        boolean z4 = this.f1630u;
        boolean z5 = this.f1631v;
        a2.e eVar = this.C;
        View view = this.f1621l;
        if (!z5 && z4) {
            if (this.f1632w) {
                this.f1632w = false;
                i.j jVar = this.f1633x;
                if (jVar != null) {
                    jVar.a();
                }
                int i4 = this.f1628s;
                j0 j0Var = this.A;
                if (i4 != 0 || (!this.f1634y && !z3)) {
                    j0Var.b();
                    return;
                }
                this.f1618i.setAlpha(1.0f);
                this.f1618i.setTransitioning(true);
                i.j jVar2 = new i.j();
                float f4 = -this.f1618i.getHeight();
                if (z3) {
                    this.f1618i.getLocationInWindow(new int[]{0, 0});
                    f4 -= r12[1];
                }
                k0.l0 a4 = k0.j0.a(this.f1618i);
                a4.e(f4);
                View view2 = (View) a4.f2758a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(eVar != null ? new j2.i(eVar, view2) : null);
                }
                boolean z6 = jVar2.f2078e;
                ArrayList arrayList = jVar2.f2075a;
                if (!z6) {
                    arrayList.add(a4);
                }
                if (this.f1629t && view != null) {
                    k0.l0 a5 = k0.j0.a(view);
                    a5.e(f4);
                    if (!jVar2.f2078e) {
                        arrayList.add(a5);
                    }
                }
                boolean z7 = jVar2.f2078e;
                if (!z7) {
                    jVar2.c = D;
                }
                if (!z7) {
                    jVar2.f2076b = 250L;
                }
                if (!z7) {
                    jVar2.f2077d = j0Var;
                }
                this.f1633x = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f1632w) {
            return;
        }
        this.f1632w = true;
        i.j jVar3 = this.f1633x;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f1618i.setVisibility(0);
        int i5 = this.f1628s;
        j0 j0Var2 = this.B;
        if (i5 == 0 && (this.f1634y || z3)) {
            this.f1618i.setTranslationY(0.0f);
            float f5 = -this.f1618i.getHeight();
            if (z3) {
                this.f1618i.getLocationInWindow(new int[]{0, 0});
                f5 -= r12[1];
            }
            this.f1618i.setTranslationY(f5);
            i.j jVar4 = new i.j();
            k0.l0 a6 = k0.j0.a(this.f1618i);
            a6.e(0.0f);
            View view3 = (View) a6.f2758a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(eVar != null ? new j2.i(eVar, view3) : null);
            }
            boolean z8 = jVar4.f2078e;
            ArrayList arrayList2 = jVar4.f2075a;
            if (!z8) {
                arrayList2.add(a6);
            }
            if (this.f1629t && view != null) {
                view.setTranslationY(f5);
                k0.l0 a7 = k0.j0.a(view);
                a7.e(0.0f);
                if (!jVar4.f2078e) {
                    arrayList2.add(a7);
                }
            }
            boolean z9 = jVar4.f2078e;
            if (!z9) {
                jVar4.c = E;
            }
            if (!z9) {
                jVar4.f2076b = 250L;
            }
            if (!z9) {
                jVar4.f2077d = j0Var2;
            }
            this.f1633x = jVar4;
            jVar4.b();
        } else {
            this.f1618i.setAlpha(1.0f);
            this.f1618i.setTranslationY(0.0f);
            if (this.f1629t && view != null) {
                view.setTranslationY(0.0f);
            }
            j0Var2.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.h;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = k0.j0.f2752a;
            k0.z.c(actionBarOverlayLayout);
        }
    }

    public l0(Dialog dialog) {
        new ArrayList();
        this.f1627r = new ArrayList();
        this.f1628s = 0;
        this.f1629t = true;
        this.f1632w = true;
        this.A = new j0(this, 0);
        this.B = new j0(this, 1);
        this.C = new a2.e(12, this);
        n0(dialog.getWindow().getDecorView());
    }
}
