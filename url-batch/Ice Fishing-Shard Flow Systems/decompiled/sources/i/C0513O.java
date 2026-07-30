package i;

import I.T;
import I.W;
import I.Y;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import h.AbstractC0454a;
import j4.C0573b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.AbstractC0646b;
import l.InterfaceC0645a;
import n.InterfaceC0704d;
import n.InterfaceC0725n0;
import n.n1;
import n.s1;

/* renamed from: i.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513O extends AbstractC0514a implements InterfaceC0704d {

    /* renamed from: a, reason: collision with root package name */
    public Context f5389a;

    /* renamed from: b, reason: collision with root package name */
    public Context f5390b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f5391c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f5392d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0725n0 f5393e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f5394f;

    /* renamed from: g, reason: collision with root package name */
    public final View f5395g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5396h;

    /* renamed from: i, reason: collision with root package name */
    public C0512N f5397i;
    public C0512N j;

    /* renamed from: k, reason: collision with root package name */
    public P0.e f5398k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5399l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f5400m;

    /* renamed from: n, reason: collision with root package name */
    public int f5401n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5402o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5403p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5404q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5405r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5406s;

    /* renamed from: t, reason: collision with root package name */
    public C0573b f5407t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5408u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5409v;

    /* renamed from: w, reason: collision with root package name */
    public final C0510L f5410w;

    /* renamed from: x, reason: collision with root package name */
    public final C0510L f5411x;

    /* renamed from: y, reason: collision with root package name */
    public final C0511M f5412y;

    /* renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f5388z = new AccelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public static final DecelerateInterpolator f5387A = new DecelerateInterpolator();

    public C0513O(Activity activity, boolean z7) {
        new ArrayList();
        this.f5400m = new ArrayList();
        this.f5401n = 0;
        this.f5402o = true;
        this.f5406s = true;
        this.f5410w = new C0510L(this, 0);
        this.f5411x = new C0510L(this, 1);
        this.f5412y = new C0511M(0, this);
        View decorView = activity.getWindow().getDecorView();
        w(decorView);
        if (z7) {
            return;
        }
        this.f5395g = decorView.findViewById(R.id.content);
    }

    @Override // i.AbstractC0514a
    public final boolean b() {
        n1 n1Var;
        InterfaceC0725n0 interfaceC0725n0 = this.f5393e;
        if (interfaceC0725n0 == null || (n1Var = ((s1) interfaceC0725n0).f6886a.f3326U) == null || n1Var.f6845e == null) {
            return false;
        }
        n1 n1Var2 = ((s1) interfaceC0725n0).f6886a.f3326U;
        m.o oVar = n1Var2 == null ? null : n1Var2.f6845e;
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // i.AbstractC0514a
    public final void c(boolean z7) {
        if (z7 == this.f5399l) {
            return;
        }
        this.f5399l = z7;
        ArrayList arrayList = this.f5400m;
        if (arrayList.size() > 0) {
            throw C4.p.f(arrayList, 0);
        }
    }

    @Override // i.AbstractC0514a
    public final int d() {
        return ((s1) this.f5393e).f6887b;
    }

    @Override // i.AbstractC0514a
    public final Context e() {
        if (this.f5390b == null) {
            TypedValue typedValue = new TypedValue();
            this.f5389a.getTheme().resolveAttribute(com.icefishing.icefish.ice.fishing.s294s.R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f5390b = new ContextThemeWrapper(this.f5389a, i2);
            } else {
                this.f5390b = this.f5389a;
            }
        }
        return this.f5390b;
    }

    @Override // i.AbstractC0514a
    public final void f() {
        if (this.f5403p) {
            return;
        }
        this.f5403p = true;
        y(false);
    }

    @Override // i.AbstractC0514a
    public final boolean h() {
        int height = this.f5392d.getHeight();
        if (this.f5406s) {
            return height == 0 || this.f5391c.getActionBarHideOffset() < height;
        }
        return false;
    }

    @Override // i.AbstractC0514a
    public final void i() {
        x(this.f5389a.getResources().getBoolean(com.icefishing.icefish.ice.fishing.s294s.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // i.AbstractC0514a
    public final boolean k(int i2, KeyEvent keyEvent) {
        m.m mVar;
        C0512N c0512n = this.f5397i;
        if (c0512n == null || (mVar = c0512n.f5383l) == null) {
            return false;
        }
        mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return mVar.performShortcut(i2, keyEvent, 0);
    }

    @Override // i.AbstractC0514a
    public final void n(ColorDrawable colorDrawable) {
        this.f5392d.setPrimaryBackground(colorDrawable);
    }

    @Override // i.AbstractC0514a
    public final void o(boolean z7) {
        if (this.f5396h) {
            return;
        }
        int i2 = z7 ? 4 : 0;
        s1 s1Var = (s1) this.f5393e;
        int i5 = s1Var.f6887b;
        this.f5396h = true;
        s1Var.a((i2 & 4) | (i5 & (-5)));
    }

    @Override // i.AbstractC0514a
    public final void p(boolean z7) {
        int i2 = z7 ? 8 : 0;
        s1 s1Var = (s1) this.f5393e;
        s1Var.a((i2 & 8) | (s1Var.f6887b & (-9)));
    }

    @Override // i.AbstractC0514a
    public final void q(boolean z7) {
        C0573b c0573b;
        this.f5408u = z7;
        if (z7 || (c0573b = this.f5407t) == null) {
            return;
        }
        c0573b.a();
    }

    @Override // i.AbstractC0514a
    public final void r(CharSequence charSequence) {
        s1 s1Var = (s1) this.f5393e;
        s1Var.f6892g = true;
        Toolbar toolbar = s1Var.f6886a;
        s1Var.f6893h = charSequence;
        if ((s1Var.f6887b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s1Var.f6892g) {
                T.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // i.AbstractC0514a
    public final void s(CharSequence charSequence) {
        s1 s1Var = (s1) this.f5393e;
        if (s1Var.f6892g) {
            return;
        }
        Toolbar toolbar = s1Var.f6886a;
        s1Var.f6893h = charSequence;
        if ((s1Var.f6887b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s1Var.f6892g) {
                T.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // i.AbstractC0514a
    public final void t() {
        if (this.f5403p) {
            this.f5403p = false;
            y(false);
        }
    }

    @Override // i.AbstractC0514a
    public final AbstractC0646b u(P0.e eVar) {
        C0512N c0512n = this.f5397i;
        if (c0512n != null) {
            c0512n.a();
        }
        this.f5391c.setHideOnContentScrollEnabled(false);
        this.f5394f.e();
        C0512N c0512n2 = new C0512N(this, this.f5394f.getContext(), eVar);
        m.m mVar = c0512n2.f5383l;
        mVar.w();
        try {
            if (!((InterfaceC0645a) c0512n2.f5384m.f2194e).b(c0512n2, mVar)) {
                return null;
            }
            this.f5397i = c0512n2;
            c0512n2.h();
            this.f5394f.c(c0512n2);
            v(true);
            return c0512n2;
        } finally {
            mVar.v();
        }
    }

    public final void v(boolean z7) {
        Y i2;
        Y y7;
        if (z7) {
            if (!this.f5405r) {
                this.f5405r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5391c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                y(false);
            }
        } else if (this.f5405r) {
            this.f5405r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5391c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            y(false);
        }
        ActionBarContainer actionBarContainer = this.f5392d;
        WeakHashMap weakHashMap = T.f1153a;
        if (!actionBarContainer.isLaidOut()) {
            if (z7) {
                ((s1) this.f5393e).f6886a.setVisibility(4);
                this.f5394f.setVisibility(0);
                return;
            } else {
                ((s1) this.f5393e).f6886a.setVisibility(0);
                this.f5394f.setVisibility(8);
                return;
            }
        }
        if (z7) {
            s1 s1Var = (s1) this.f5393e;
            i2 = T.a(s1Var.f6886a);
            i2.a(0.0f);
            i2.c(100L);
            i2.d(new l.k(s1Var, 4));
            y7 = this.f5394f.i(200L, 0);
        } else {
            s1 s1Var2 = (s1) this.f5393e;
            Y a7 = T.a(s1Var2.f6886a);
            a7.a(1.0f);
            a7.c(200L);
            a7.d(new l.k(s1Var2, 0));
            i2 = this.f5394f.i(100L, 8);
            y7 = a7;
        }
        C0573b c0573b = new C0573b();
        ArrayList arrayList = (ArrayList) c0573b.f5957i;
        arrayList.add(i2);
        View view = (View) i2.f1164a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) y7.f1164a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(y7);
        c0573b.d();
    }

    public final void w(View view) {
        InterfaceC0725n0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.icefishing.icefish.ice.fishing.s294s.R.id.decor_content_parent);
        this.f5391c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.icefishing.icefish.ice.fishing.s294s.R.id.action_bar);
        if (findViewById instanceof InterfaceC0725n0) {
            wrapper = (InterfaceC0725n0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f5393e = wrapper;
        this.f5394f = (ActionBarContextView) view.findViewById(com.icefishing.icefish.ice.fishing.s294s.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.icefishing.icefish.ice.fishing.s294s.R.id.action_bar_container);
        this.f5392d = actionBarContainer;
        InterfaceC0725n0 interfaceC0725n0 = this.f5393e;
        if (interfaceC0725n0 == null || this.f5394f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0513O.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((s1) interfaceC0725n0).f6886a.getContext();
        this.f5389a = context;
        if ((((s1) this.f5393e).f6887b & 4) != 0) {
            this.f5396h = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f5393e.getClass();
        x(context.getResources().getBoolean(com.icefishing.icefish.ice.fishing.s294s.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f5389a.obtainStyledAttributes(null, AbstractC0454a.f5037a, com.icefishing.icefish.ice.fishing.s294s.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5391c;
            if (!actionBarOverlayLayout2.f3184p) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f5409v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f5392d;
            WeakHashMap weakHashMap = T.f1153a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void x(boolean z7) {
        if (z7) {
            this.f5392d.setTabContainer(null);
            ((s1) this.f5393e).getClass();
        } else {
            ((s1) this.f5393e).getClass();
            this.f5392d.setTabContainer(null);
        }
        this.f5393e.getClass();
        ((s1) this.f5393e).f6886a.setCollapsible(false);
        this.f5391c.setHasNonEmbeddedTabs(false);
    }

    public final void y(boolean z7) {
        boolean z8 = this.f5403p;
        boolean z9 = this.f5404q;
        boolean z10 = this.f5405r;
        C0511M c0511m = this.f5412y;
        View view = this.f5395g;
        if (!z10 && (z8 || z9)) {
            if (this.f5406s) {
                this.f5406s = false;
                C0573b c0573b = this.f5407t;
                if (c0573b != null) {
                    c0573b.a();
                }
                int i2 = this.f5401n;
                C0510L c0510l = this.f5410w;
                if (i2 != 0 || (!this.f5408u && !z7)) {
                    c0510l.a();
                    return;
                }
                this.f5392d.setAlpha(1.0f);
                this.f5392d.setTransitioning(true);
                C0573b c0573b2 = new C0573b();
                ArrayList arrayList = (ArrayList) c0573b2.f5957i;
                float f7 = -this.f5392d.getHeight();
                if (z7) {
                    this.f5392d.getLocationInWindow(new int[]{0, 0});
                    f7 -= r12[1];
                }
                Y a7 = T.a(this.f5392d);
                a7.e(f7);
                View view2 = (View) a7.f1164a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0511m != null ? new W(c0511m, view2) : null);
                }
                if (!c0573b2.f5956e) {
                    arrayList.add(a7);
                }
                if (this.f5402o && view != null) {
                    Y a8 = T.a(view);
                    a8.e(f7);
                    if (!c0573b2.f5956e) {
                        arrayList.add(a8);
                    }
                }
                boolean z11 = c0573b2.f5956e;
                if (!z11) {
                    c0573b2.f5958l = f5388z;
                }
                if (!z11) {
                    c0573b2.f5955d = 250L;
                }
                if (!z11) {
                    c0573b2.f5959m = c0510l;
                }
                this.f5407t = c0573b2;
                c0573b2.d();
                return;
            }
            return;
        }
        if (this.f5406s) {
            return;
        }
        this.f5406s = true;
        C0573b c0573b3 = this.f5407t;
        if (c0573b3 != null) {
            c0573b3.a();
        }
        this.f5392d.setVisibility(0);
        int i5 = this.f5401n;
        C0510L c0510l2 = this.f5411x;
        if (i5 == 0 && (this.f5408u || z7)) {
            this.f5392d.setTranslationY(0.0f);
            float f8 = -this.f5392d.getHeight();
            if (z7) {
                this.f5392d.getLocationInWindow(new int[]{0, 0});
                f8 -= r12[1];
            }
            this.f5392d.setTranslationY(f8);
            C0573b c0573b4 = new C0573b();
            ArrayList arrayList2 = (ArrayList) c0573b4.f5957i;
            Y a9 = T.a(this.f5392d);
            a9.e(0.0f);
            View view3 = (View) a9.f1164a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0511m != null ? new W(c0511m, view3) : null);
            }
            if (!c0573b4.f5956e) {
                arrayList2.add(a9);
            }
            if (this.f5402o && view != null) {
                view.setTranslationY(f8);
                Y a10 = T.a(view);
                a10.e(0.0f);
                if (!c0573b4.f5956e) {
                    arrayList2.add(a10);
                }
            }
            boolean z12 = c0573b4.f5956e;
            if (!z12) {
                c0573b4.f5958l = f5387A;
            }
            if (!z12) {
                c0573b4.f5955d = 250L;
            }
            if (!z12) {
                c0573b4.f5959m = c0510l2;
            }
            this.f5407t = c0573b4;
            c0573b4.d();
        } else {
            this.f5392d.setAlpha(1.0f);
            this.f5392d.setTranslationY(0.0f);
            if (this.f5402o && view != null) {
                view.setTranslationY(0.0f);
            }
            c0510l2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5391c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = T.f1153a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public C0513O(Dialog dialog) {
        new ArrayList();
        this.f5400m = new ArrayList();
        this.f5401n = 0;
        this.f5402o = true;
        this.f5406s = true;
        this.f5410w = new C0510L(this, 0);
        this.f5411x = new C0510L(this, 1);
        this.f5412y = new C0511M(0, this);
        w(dialog.getWindow().getDecorView());
    }
}
