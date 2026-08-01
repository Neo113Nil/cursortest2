package g;

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
import l.a3;
import l.i1;
import n0.p0;
import n0.s0;
import n0.t0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k0 extends b4.l implements l.c {

    /* renamed from: b, reason: collision with root package name */
    public Context f1534b;

    /* renamed from: c, reason: collision with root package name */
    public Context f1535c;
    public ActionBarOverlayLayout d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f1536e;

    /* renamed from: f, reason: collision with root package name */
    public i1 f1537f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f1538g;
    public final View h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public j0 f1539j;

    /* renamed from: k, reason: collision with root package name */
    public j0 f1540k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.emoji2.text.q f1541l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1542m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1543n;

    /* renamed from: o, reason: collision with root package name */
    public int f1544o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1545p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1546q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1547r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1548s;

    /* renamed from: t, reason: collision with root package name */
    public j.j f1549t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1550u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1551v;

    /* renamed from: w, reason: collision with root package name */
    public final i0 f1552w;

    /* renamed from: x, reason: collision with root package name */
    public final i0 f1553x;

    /* renamed from: y, reason: collision with root package name */
    public final a0.a f1554y;

    /* renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f1533z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    public k0(Activity activity, boolean z4) {
        new ArrayList();
        this.f1543n = new ArrayList();
        this.f1544o = 0;
        this.f1545p = true;
        this.f1548s = true;
        this.f1552w = new i0(this, 0);
        this.f1553x = new i0(this, 1);
        this.f1554y = new a0.a(10, this);
        View decorView = activity.getWindow().getDecorView();
        n0(decorView);
        if (z4) {
            return;
        }
        this.h = decorView.findViewById(R.id.content);
    }

    public final void l0(boolean z4) {
        t0 i;
        t0 t0Var;
        if (z4) {
            if (!this.f1547r) {
                this.f1547r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                q0(false);
            }
        } else if (this.f1547r) {
            this.f1547r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            q0(false);
        }
        if (!this.f1536e.isLaidOut()) {
            if (z4) {
                ((a3) this.f1537f).f2391a.setVisibility(4);
                this.f1538g.setVisibility(0);
                return;
            } else {
                ((a3) this.f1537f).f2391a.setVisibility(0);
                this.f1538g.setVisibility(8);
                return;
            }
        }
        if (z4) {
            a3 a3Var = (a3) this.f1537f;
            i = p0.a(a3Var.f2391a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.i(a3Var, 4));
            t0Var = this.f1538g.i(0, 200L);
        } else {
            a3 a3Var2 = (a3) this.f1537f;
            t0 a5 = p0.a(a3Var2.f2391a);
            a5.a(1.0f);
            a5.c(200L);
            a5.d(new j.i(a3Var2, 0));
            i = this.f1538g.i(8, 100L);
            t0Var = a5;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2124a;
        arrayList.add(i);
        View view = (View) i.f2835a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) t0Var.f2835a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(t0Var);
        jVar.b();
    }

    public final Context m0() {
        if (this.f1535c == null) {
            TypedValue typedValue = new TypedValue();
            this.f1534b.getTheme().resolveAttribute(com.gdmhkmf.belbet.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1535c = new ContextThemeWrapper(this.f1534b, i);
            } else {
                this.f1535c = this.f1534b;
            }
        }
        return this.f1535c;
    }

    public final void n0(View view) {
        i1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.gdmhkmf.belbet.R.id.decor_content_parent);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.gdmhkmf.belbet.R.id.action_bar);
        if (findViewById instanceof i1) {
            wrapper = (i1) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f1537f = wrapper;
        this.f1538g = (ActionBarContextView) view.findViewById(com.gdmhkmf.belbet.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.gdmhkmf.belbet.R.id.action_bar_container);
        this.f1536e = actionBarContainer;
        i1 i1Var = this.f1537f;
        if (i1Var == null || this.f1538g == null || actionBarContainer == null) {
            throw new IllegalStateException(k0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((a3) i1Var).f2391a.getContext();
        this.f1534b = context;
        if ((((a3) this.f1537f).f2392b & 4) != 0) {
            this.i = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f1537f.getClass();
        p0(context.getResources().getBoolean(com.gdmhkmf.belbet.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f1534b.obtainStyledAttributes(null, f.a.f1390a, com.gdmhkmf.belbet.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.d;
            if (!actionBarOverlayLayout2.f312l) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f1551v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1536e;
            WeakHashMap weakHashMap = p0.f2816a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void o0(boolean z4) {
        if (this.i) {
            return;
        }
        int i = z4 ? 4 : 0;
        a3 a3Var = (a3) this.f1537f;
        int i4 = a3Var.f2392b;
        this.i = true;
        a3Var.a((i & 4) | (i4 & (-5)));
    }

    public final void p0(boolean z4) {
        if (z4) {
            this.f1536e.setTabContainer(null);
            ((a3) this.f1537f).getClass();
        } else {
            ((a3) this.f1537f).getClass();
            this.f1536e.setTabContainer(null);
        }
        this.f1537f.getClass();
        ((a3) this.f1537f).f2391a.setCollapsible(false);
        this.d.setHasNonEmbeddedTabs(false);
    }

    public final void q0(boolean z4) {
        boolean z5 = this.f1546q;
        boolean z6 = this.f1547r;
        a0.a aVar = this.f1554y;
        View view = this.h;
        if (!z6 && z5) {
            if (this.f1548s) {
                this.f1548s = false;
                j.j jVar = this.f1549t;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f1544o;
                i0 i0Var = this.f1552w;
                if (i != 0 || (!this.f1550u && !z4)) {
                    i0Var.b();
                    return;
                }
                this.f1536e.setAlpha(1.0f);
                this.f1536e.setTransitioning(true);
                j.j jVar2 = new j.j();
                float f5 = -this.f1536e.getHeight();
                if (z4) {
                    this.f1536e.getLocationInWindow(new int[]{0, 0});
                    f5 -= r12[1];
                }
                t0 a5 = p0.a(this.f1536e);
                a5.e(f5);
                View view2 = (View) a5.f2835a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(aVar != null ? new s0(aVar, view2) : null);
                }
                boolean z7 = jVar2.f2127e;
                ArrayList arrayList = jVar2.f2124a;
                if (!z7) {
                    arrayList.add(a5);
                }
                if (this.f1545p && view != null) {
                    t0 a6 = p0.a(view);
                    a6.e(f5);
                    if (!jVar2.f2127e) {
                        arrayList.add(a6);
                    }
                }
                boolean z8 = jVar2.f2127e;
                if (!z8) {
                    jVar2.f2126c = f1533z;
                }
                if (!z8) {
                    jVar2.f2125b = 250L;
                }
                if (!z8) {
                    jVar2.d = i0Var;
                }
                this.f1549t = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f1548s) {
            return;
        }
        this.f1548s = true;
        j.j jVar3 = this.f1549t;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f1536e.setVisibility(0);
        int i4 = this.f1544o;
        i0 i0Var2 = this.f1553x;
        if (i4 == 0 && (this.f1550u || z4)) {
            this.f1536e.setTranslationY(0.0f);
            float f6 = -this.f1536e.getHeight();
            if (z4) {
                this.f1536e.getLocationInWindow(new int[]{0, 0});
                f6 -= r12[1];
            }
            this.f1536e.setTranslationY(f6);
            j.j jVar4 = new j.j();
            t0 a7 = p0.a(this.f1536e);
            a7.e(0.0f);
            View view3 = (View) a7.f2835a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(aVar != null ? new s0(aVar, view3) : null);
            }
            boolean z9 = jVar4.f2127e;
            ArrayList arrayList2 = jVar4.f2124a;
            if (!z9) {
                arrayList2.add(a7);
            }
            if (this.f1545p && view != null) {
                view.setTranslationY(f6);
                t0 a8 = p0.a(view);
                a8.e(0.0f);
                if (!jVar4.f2127e) {
                    arrayList2.add(a8);
                }
            }
            boolean z10 = jVar4.f2127e;
            if (!z10) {
                jVar4.f2126c = A;
            }
            if (!z10) {
                jVar4.f2125b = 250L;
            }
            if (!z10) {
                jVar4.d = i0Var2;
            }
            this.f1549t = jVar4;
            jVar4.b();
        } else {
            this.f1536e.setAlpha(1.0f);
            this.f1536e.setTranslationY(0.0f);
            if (this.f1545p && view != null) {
                view.setTranslationY(0.0f);
            }
            i0Var2.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = p0.f2816a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public k0(Dialog dialog) {
        new ArrayList();
        this.f1543n = new ArrayList();
        this.f1544o = 0;
        this.f1545p = true;
        this.f1548s = true;
        this.f1552w = new i0(this, 0);
        this.f1553x = new i0(this, 1);
        this.f1554y = new a0.a(10, this);
        n0(dialog.getWindow().getDecorView());
    }
}
