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
import l.InterfaceC0202d;
import l.InterfaceC0219l0;
import l.d1;

/* loaded from: classes.dex */
public final class K extends w1.d implements InterfaceC0202d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2157y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2158z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2159a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2160b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2161c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0219l0 f2162e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2163f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2164g;
    public boolean h;
    public J i;

    /* renamed from: j, reason: collision with root package name */
    public J f2165j;

    /* renamed from: k, reason: collision with root package name */
    public B.j f2166k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2167l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2168m;

    /* renamed from: n, reason: collision with root package name */
    public int f2169n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2170o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2171p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2172q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2173r;

    /* renamed from: s, reason: collision with root package name */
    public j.j f2174s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2175t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2176u;

    /* renamed from: v, reason: collision with root package name */
    public final I f2177v;

    /* renamed from: w, reason: collision with root package name */
    public final I f2178w;

    /* renamed from: x, reason: collision with root package name */
    public final C.g f2179x;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2168m = new ArrayList();
        this.f2169n = 0;
        this.f2170o = true;
        this.f2173r = true;
        this.f2177v = new I(this, 0);
        this.f2178w = new I(this, 1);
        this.f2179x = new C.g(24, this);
        View decorView = activity.getWindow().getDecorView();
        z0(decorView);
        if (z2) {
            return;
        }
        this.f2164g = decorView.findViewById(R.id.content);
    }

    public final void A0(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        d1 d1Var = (d1) this.f2162e;
        int i2 = d1Var.f2899b;
        this.h = true;
        d1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void B0(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((d1) this.f2162e).getClass();
        } else {
            ((d1) this.f2162e).getClass();
            this.d.setTabContainer(null);
        }
        this.f2162e.getClass();
        ((d1) this.f2162e).f2898a.setCollapsible(false);
        this.f2161c.setHasNonEmbeddedTabs(false);
    }

    public final void C0(boolean z2) {
        boolean z3 = this.f2172q || !this.f2171p;
        View view = this.f2164g;
        C.g gVar = this.f2179x;
        if (!z3) {
            if (this.f2173r) {
                this.f2173r = false;
                j.j jVar = this.f2174s;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2169n;
                I i2 = this.f2177v;
                if (i != 0 || (!this.f2175t && !z2)) {
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
                View view2 = (View) a2.f443a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(gVar != null ? new C0001a0(gVar, view2) : null);
                }
                boolean z4 = jVar2.f2592e;
                ArrayList arrayList = jVar2.f2589a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2170o && view != null) {
                    C0005c0 a3 = T.a(view);
                    a3.e(f2);
                    if (!jVar2.f2592e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2157y;
                boolean z5 = jVar2.f2592e;
                if (!z5) {
                    jVar2.f2591c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2590b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2174s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2173r) {
            return;
        }
        this.f2173r = true;
        j.j jVar3 = this.f2174s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.d.setVisibility(0);
        int i3 = this.f2169n;
        I i4 = this.f2178w;
        if (i3 == 0 && (this.f2175t || z2)) {
            this.d.setTranslationY(RecyclerView.f1530C0);
            float f3 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.d.setTranslationY(f3);
            j.j jVar4 = new j.j();
            C0005c0 a4 = T.a(this.d);
            a4.e(RecyclerView.f1530C0);
            View view3 = (View) a4.f443a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(gVar != null ? new C0001a0(gVar, view3) : null);
            }
            boolean z6 = jVar4.f2592e;
            ArrayList arrayList2 = jVar4.f2589a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2170o && view != null) {
                view.setTranslationY(f3);
                C0005c0 a5 = T.a(view);
                a5.e(RecyclerView.f1530C0);
                if (!jVar4.f2592e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2158z;
            boolean z7 = jVar4.f2592e;
            if (!z7) {
                jVar4.f2591c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2590b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2174s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(RecyclerView.f1530C0);
            if (this.f2170o && view != null) {
                view.setTranslationY(RecyclerView.f1530C0);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2161c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = T.f423a;
            K.F.c(actionBarOverlayLayout);
        }
    }

    public final void x0(boolean z2) {
        C0005c0 i;
        C0005c0 c0005c0;
        if (z2) {
            if (!this.f2172q) {
                this.f2172q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2161c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                C0(false);
            }
        } else if (this.f2172q) {
            this.f2172q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2161c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            C0(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((d1) this.f2162e).f2898a.setVisibility(4);
                this.f2163f.setVisibility(0);
                return;
            } else {
                ((d1) this.f2162e).f2898a.setVisibility(0);
                this.f2163f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            d1 d1Var = (d1) this.f2162e;
            i = T.a(d1Var.f2898a);
            i.a(RecyclerView.f1530C0);
            i.c(100L);
            i.d(new j.i(d1Var, 4));
            c0005c0 = this.f2163f.i(0, 200L);
        } else {
            d1 d1Var2 = (d1) this.f2162e;
            C0005c0 a2 = T.a(d1Var2.f2898a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(d1Var2, 0));
            i = this.f2163f.i(8, 100L);
            c0005c0 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2589a;
        arrayList.add(i);
        View view = (View) i.f443a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0005c0.f443a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0005c0);
        jVar.b();
    }

    public final Context y0() {
        if (this.f2160b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2159a.getTheme().resolveAttribute(com.playbag.tripgear.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2160b = new ContextThemeWrapper(this.f2159a, i);
            } else {
                this.f2160b = this.f2159a;
            }
        }
        return this.f2160b;
    }

    public final void z0(View view) {
        InterfaceC0219l0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.playbag.tripgear.R.id.decor_content_parent);
        this.f2161c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.playbag.tripgear.R.id.action_bar);
        if (findViewById instanceof InterfaceC0219l0) {
            wrapper = (InterfaceC0219l0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2162e = wrapper;
        this.f2163f = (ActionBarContextView) view.findViewById(com.playbag.tripgear.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.playbag.tripgear.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC0219l0 interfaceC0219l0 = this.f2162e;
        if (interfaceC0219l0 == null || this.f2163f == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((d1) interfaceC0219l0).f2898a.getContext();
        this.f2159a = context;
        if ((((d1) this.f2162e).f2899b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2162e.getClass();
        B0(context.getResources().getBoolean(com.playbag.tripgear.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2159a.obtainStyledAttributes(null, f.a.f2055a, com.playbag.tripgear.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2161c;
            if (!actionBarOverlayLayout2.f1285g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2176u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = T.f423a;
            K.H.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2168m = new ArrayList();
        this.f2169n = 0;
        this.f2170o = true;
        this.f2173r = true;
        this.f2177v = new I(this, 0);
        this.f2178w = new I(this, 1);
        this.f2179x = new C.g(24, this);
        z0(dialog.getWindow().getDecorView());
    }
}
