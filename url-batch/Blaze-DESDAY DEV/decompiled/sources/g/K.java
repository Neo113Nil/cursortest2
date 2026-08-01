package g;

import K.C0001a0;
import K.C0005c0;
import K.T;
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
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.InterfaceC0205d;
import l.InterfaceC0222l0;
import l.d1;

/* loaded from: classes.dex */
public final class K extends z1.d implements InterfaceC0205d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2197y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2198z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2199a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2200b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2201c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0222l0 f2202e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2203f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2204g;
    public boolean h;
    public J i;

    /* renamed from: j, reason: collision with root package name */
    public J f2205j;

    /* renamed from: k, reason: collision with root package name */
    public B.j f2206k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2207l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2208m;

    /* renamed from: n, reason: collision with root package name */
    public int f2209n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2210o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2211p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2212q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2213r;

    /* renamed from: s, reason: collision with root package name */
    public j.j f2214s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2215t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2216u;

    /* renamed from: v, reason: collision with root package name */
    public final I f2217v;

    /* renamed from: w, reason: collision with root package name */
    public final I f2218w;

    /* renamed from: x, reason: collision with root package name */
    public final C.g f2219x;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2208m = new ArrayList();
        this.f2209n = 0;
        this.f2210o = true;
        this.f2213r = true;
        this.f2217v = new I(this, 0);
        this.f2218w = new I(this, 1);
        this.f2219x = new C.g(23, this);
        View decorView = activity.getWindow().getDecorView();
        x0(decorView);
        if (z2) {
            return;
        }
        this.f2204g = decorView.findViewById(R.id.content);
    }

    public final void A0(boolean z2) {
        boolean z3 = this.f2212q || !this.f2211p;
        View view = this.f2204g;
        C.g gVar = this.f2219x;
        if (!z3) {
            if (this.f2213r) {
                this.f2213r = false;
                j.j jVar = this.f2214s;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2209n;
                I i2 = this.f2217v;
                if (i != 0 || (!this.f2215t && !z2)) {
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
                C0005c0 a2 = T.a(this.d);
                a2.e(f2);
                View view2 = (View) a2.f460a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(gVar != null ? new C0001a0(gVar, view2) : null);
                }
                boolean z4 = jVar2.f2630e;
                ArrayList arrayList = jVar2.f2627a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2210o && view != null) {
                    C0005c0 a3 = T.a(view);
                    a3.e(f2);
                    if (!jVar2.f2630e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2197y;
                boolean z5 = jVar2.f2630e;
                if (!z5) {
                    jVar2.f2629c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2628b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2214s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2213r) {
            return;
        }
        this.f2213r = true;
        j.j jVar3 = this.f2214s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.d.setVisibility(0);
        int i3 = this.f2209n;
        I i4 = this.f2218w;
        if (i3 == 0 && (this.f2215t || z2)) {
            this.d.setTranslationY(RecyclerView.f1559A0);
            float f3 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.d.setTranslationY(f3);
            j.j jVar4 = new j.j();
            C0005c0 a4 = T.a(this.d);
            a4.e(RecyclerView.f1559A0);
            View view3 = (View) a4.f460a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(gVar != null ? new C0001a0(gVar, view3) : null);
            }
            boolean z6 = jVar4.f2630e;
            ArrayList arrayList2 = jVar4.f2627a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2210o && view != null) {
                view.setTranslationY(f3);
                C0005c0 a5 = T.a(view);
                a5.e(RecyclerView.f1559A0);
                if (!jVar4.f2630e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2198z;
            boolean z7 = jVar4.f2630e;
            if (!z7) {
                jVar4.f2629c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2628b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2214s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(RecyclerView.f1559A0);
            if (this.f2210o && view != null) {
                view.setTranslationY(RecyclerView.f1559A0);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2201c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = T.f440a;
            K.F.c(actionBarOverlayLayout);
        }
    }

    public final void v0(boolean z2) {
        C0005c0 i;
        C0005c0 c0005c0;
        if (z2) {
            if (!this.f2212q) {
                this.f2212q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2201c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                A0(false);
            }
        } else if (this.f2212q) {
            this.f2212q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2201c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            A0(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((d1) this.f2202e).f2923a.setVisibility(4);
                this.f2203f.setVisibility(0);
                return;
            } else {
                ((d1) this.f2202e).f2923a.setVisibility(0);
                this.f2203f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            d1 d1Var = (d1) this.f2202e;
            i = T.a(d1Var.f2923a);
            i.a(RecyclerView.f1559A0);
            i.c(100L);
            i.d(new j.i(d1Var, 4));
            c0005c0 = this.f2203f.i(0, 200L);
        } else {
            d1 d1Var2 = (d1) this.f2202e;
            C0005c0 a2 = T.a(d1Var2.f2923a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(d1Var2, 0));
            i = this.f2203f.i(8, 100L);
            c0005c0 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2627a;
        arrayList.add(i);
        View view = (View) i.f460a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0005c0.f460a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0005c0);
        jVar.b();
    }

    public final Context w0() {
        if (this.f2200b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2199a.getTheme().resolveAttribute(com.winworm.neongrid.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2200b = new ContextThemeWrapper(this.f2199a, i);
            } else {
                this.f2200b = this.f2199a;
            }
        }
        return this.f2200b;
    }

    public final void x0(View view) {
        InterfaceC0222l0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.winworm.neongrid.R.id.decor_content_parent);
        this.f2201c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.winworm.neongrid.R.id.action_bar);
        if (findViewById instanceof InterfaceC0222l0) {
            wrapper = (InterfaceC0222l0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2202e = wrapper;
        this.f2203f = (ActionBarContextView) view.findViewById(com.winworm.neongrid.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.winworm.neongrid.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC0222l0 interfaceC0222l0 = this.f2202e;
        if (interfaceC0222l0 == null || this.f2203f == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((d1) interfaceC0222l0).f2923a.getContext();
        this.f2199a = context;
        if ((((d1) this.f2202e).f2924b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2202e.getClass();
        z0(context.getResources().getBoolean(com.winworm.neongrid.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2199a.obtainStyledAttributes(null, f.a.f2098a, com.winworm.neongrid.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2201c;
            if (!actionBarOverlayLayout2.f1316g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2216u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = T.f440a;
            K.H.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void y0(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        d1 d1Var = (d1) this.f2202e;
        int i2 = d1Var.f2924b;
        this.h = true;
        d1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void z0(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((d1) this.f2202e).getClass();
        } else {
            ((d1) this.f2202e).getClass();
            this.d.setTabContainer(null);
        }
        this.f2202e.getClass();
        ((d1) this.f2202e).f2923a.setCollapsible(false);
        this.f2201c.setHasNonEmbeddedTabs(false);
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2208m = new ArrayList();
        this.f2209n = 0;
        this.f2210o = true;
        this.f2213r = true;
        this.f2217v = new I(this, 0);
        this.f2218w = new I(this, 1);
        this.f2219x = new C.g(23, this);
        x0(dialog.getWindow().getDecorView());
    }
}
