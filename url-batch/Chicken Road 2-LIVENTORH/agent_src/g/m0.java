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
import l.d3;
import l.l1;
import n0.o0;
import n0.p0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m0 extends a.y implements l.d {
    public static final AccelerateInterpolator L = new AccelerateInterpolator();
    public static final DecelerateInterpolator M = new DecelerateInterpolator();
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public j.j F;
    public boolean G;
    public boolean H;
    public final k0 I;
    public final k0 J;
    public final a0.a K;

    /* renamed from: n, reason: collision with root package name */
    public Context f1660n;

    /* renamed from: o, reason: collision with root package name */
    public Context f1661o;

    /* renamed from: p, reason: collision with root package name */
    public ActionBarOverlayLayout f1662p;

    /* renamed from: q, reason: collision with root package name */
    public ActionBarContainer f1663q;

    /* renamed from: r, reason: collision with root package name */
    public l1 f1664r;

    /* renamed from: s, reason: collision with root package name */
    public ActionBarContextView f1665s;

    /* renamed from: t, reason: collision with root package name */
    public final View f1666t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1667u;

    /* renamed from: v, reason: collision with root package name */
    public l0 f1668v;

    /* renamed from: w, reason: collision with root package name */
    public l0 f1669w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.emoji2.text.q f1670x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1671y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f1672z;

    public m0(Activity activity, boolean z3) {
        new ArrayList();
        this.f1672z = new ArrayList();
        this.A = 0;
        this.B = true;
        this.E = true;
        this.I = new k0(this, 0);
        this.J = new k0(this, 1);
        this.K = new a0.a(13, this);
        View decorView = activity.getWindow().getDecorView();
        Y(decorView);
        if (z3) {
            return;
        }
        this.f1666t = decorView.findViewById(R.id.content);
    }

    public final void W(boolean z3) {
        p0 i;
        p0 p0Var;
        if (z3) {
            if (!this.D) {
                this.D = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1662p;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                b0(false);
            }
        } else if (this.D) {
            this.D = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1662p;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            b0(false);
        }
        if (!this.f1663q.isLaidOut()) {
            if (z3) {
                ((d3) this.f1664r).f2269a.setVisibility(4);
                this.f1665s.setVisibility(0);
                return;
            } else {
                ((d3) this.f1664r).f2269a.setVisibility(0);
                this.f1665s.setVisibility(8);
                return;
            }
        }
        if (z3) {
            d3 d3Var = (d3) this.f1664r;
            i = n0.l0.a(d3Var.f2269a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.i(d3Var, 4));
            p0Var = this.f1665s.i(0, 200L);
        } else {
            d3 d3Var2 = (d3) this.f1664r;
            p0 a2 = n0.l0.a(d3Var2.f2269a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(d3Var2, 0));
            i = this.f1665s.i(8, 100L);
            p0Var = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f1881a;
        arrayList.add(i);
        View view = (View) i.f2772a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) p0Var.f2772a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(p0Var);
        jVar.b();
    }

    public final Context X() {
        if (this.f1661o == null) {
            TypedValue typedValue = new TypedValue();
            this.f1660n.getTheme().resolveAttribute(com.oriondriftchasers.arordrft.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1661o = new ContextThemeWrapper(this.f1660n, i);
            } else {
                this.f1661o = this.f1660n;
            }
        }
        return this.f1661o;
    }

    public final void Y(View view) {
        l1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.oriondriftchasers.arordrft.R.id.decor_content_parent);
        this.f1662p = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.oriondriftchasers.arordrft.R.id.action_bar);
        if (findViewById instanceof l1) {
            wrapper = (l1) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f1664r = wrapper;
        this.f1665s = (ActionBarContextView) view.findViewById(com.oriondriftchasers.arordrft.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.oriondriftchasers.arordrft.R.id.action_bar_container);
        this.f1663q = actionBarContainer;
        l1 l1Var = this.f1664r;
        if (l1Var == null || this.f1665s == null || actionBarContainer == null) {
            throw new IllegalStateException(m0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((d3) l1Var).f2269a.getContext();
        this.f1660n = context;
        if ((((d3) this.f1664r).f2270b & 4) != 0) {
            this.f1667u = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f1664r.getClass();
        a0(context.getResources().getBoolean(com.oriondriftchasers.arordrft.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f1660n.obtainStyledAttributes(null, f.a.f1240a, com.oriondriftchasers.arordrft.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1662p;
            if (!actionBarOverlayLayout2.f183l) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.H = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1663q;
            WeakHashMap weakHashMap = n0.l0.f2757a;
            n0.d0.i(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void Z(boolean z3) {
        if (this.f1667u) {
            return;
        }
        int i = z3 ? 4 : 0;
        d3 d3Var = (d3) this.f1664r;
        int i4 = d3Var.f2270b;
        this.f1667u = true;
        d3Var.a((i & 4) | (i4 & (-5)));
    }

    public final void a0(boolean z3) {
        if (z3) {
            this.f1663q.setTabContainer(null);
            ((d3) this.f1664r).getClass();
        } else {
            ((d3) this.f1664r).getClass();
            this.f1663q.setTabContainer(null);
        }
        this.f1664r.getClass();
        ((d3) this.f1664r).f2269a.setCollapsible(false);
        this.f1662p.setHasNonEmbeddedTabs(false);
    }

    public final void b0(boolean z3) {
        boolean z4 = this.C;
        boolean z5 = this.D;
        a0.a aVar = this.K;
        View view = this.f1666t;
        if (!z5 && z4) {
            if (this.E) {
                this.E = false;
                j.j jVar = this.F;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.A;
                k0 k0Var = this.I;
                if (i != 0 || (!this.G && !z3)) {
                    k0Var.a();
                    return;
                }
                this.f1663q.setAlpha(1.0f);
                this.f1663q.setTransitioning(true);
                j.j jVar2 = new j.j();
                float f2 = -this.f1663q.getHeight();
                if (z3) {
                    this.f1663q.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                p0 a2 = n0.l0.a(this.f1663q);
                a2.e(f2);
                View view2 = (View) a2.f2772a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(aVar != null ? new o0(aVar, view2) : null);
                }
                boolean z6 = jVar2.f1884e;
                ArrayList arrayList = jVar2.f1881a;
                if (!z6) {
                    arrayList.add(a2);
                }
                if (this.B && view != null) {
                    p0 a4 = n0.l0.a(view);
                    a4.e(f2);
                    if (!jVar2.f1884e) {
                        arrayList.add(a4);
                    }
                }
                boolean z7 = jVar2.f1884e;
                if (!z7) {
                    jVar2.f1883c = L;
                }
                if (!z7) {
                    jVar2.f1882b = 250L;
                }
                if (!z7) {
                    jVar2.d = k0Var;
                }
                this.F = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.E) {
            return;
        }
        this.E = true;
        j.j jVar3 = this.F;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f1663q.setVisibility(0);
        int i4 = this.A;
        k0 k0Var2 = this.J;
        if (i4 == 0 && (this.G || z3)) {
            this.f1663q.setTranslationY(0.0f);
            float f4 = -this.f1663q.getHeight();
            if (z3) {
                this.f1663q.getLocationInWindow(new int[]{0, 0});
                f4 -= r12[1];
            }
            this.f1663q.setTranslationY(f4);
            j.j jVar4 = new j.j();
            p0 a5 = n0.l0.a(this.f1663q);
            a5.e(0.0f);
            View view3 = (View) a5.f2772a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(aVar != null ? new o0(aVar, view3) : null);
            }
            boolean z8 = jVar4.f1884e;
            ArrayList arrayList2 = jVar4.f1881a;
            if (!z8) {
                arrayList2.add(a5);
            }
            if (this.B && view != null) {
                view.setTranslationY(f4);
                p0 a6 = n0.l0.a(view);
                a6.e(0.0f);
                if (!jVar4.f1884e) {
                    arrayList2.add(a6);
                }
            }
            boolean z9 = jVar4.f1884e;
            if (!z9) {
                jVar4.f1883c = M;
            }
            if (!z9) {
                jVar4.f1882b = 250L;
            }
            if (!z9) {
                jVar4.d = k0Var2;
            }
            this.F = jVar4;
            jVar4.b();
        } else {
            this.f1663q.setAlpha(1.0f);
            this.f1663q.setTranslationY(0.0f);
            if (this.B && view != null) {
                view.setTranslationY(0.0f);
            }
            k0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1662p;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = n0.l0.f2757a;
            n0.b0.c(actionBarOverlayLayout);
        }
    }

    public m0(Dialog dialog) {
        new ArrayList();
        this.f1672z = new ArrayList();
        this.A = 0;
        this.B = true;
        this.E = true;
        this.I = new k0(this, 0);
        this.J = new k0(this, 1);
        this.K = new a0.a(13, this);
        Y(dialog.getWindow().getDecorView());
    }
}
