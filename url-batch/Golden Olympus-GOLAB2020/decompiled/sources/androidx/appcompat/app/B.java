package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1305m0;
import androidx.core.view.C1301k0;
import androidx.core.view.InterfaceC1303l0;
import androidx.core.view.InterfaceC1307n0;
import e.AbstractC2405a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class B extends AbstractC1250a implements ActionBarOverlayLayout.d {

    /* renamed from: D, reason: collision with root package name */
    private static final Interpolator f10135D = new AccelerateInterpolator();

    /* renamed from: E, reason: collision with root package name */
    private static final Interpolator f10136E = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f10140a;

    /* renamed from: b, reason: collision with root package name */
    private Context f10141b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f10142c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f10143d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f10144e;

    /* renamed from: f, reason: collision with root package name */
    androidx.appcompat.widget.A f10145f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f10146g;

    /* renamed from: h, reason: collision with root package name */
    View f10147h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10150k;

    /* renamed from: l, reason: collision with root package name */
    d f10151l;

    /* renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f10152m;

    /* renamed from: n, reason: collision with root package name */
    b.a f10153n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10154o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10156q;

    /* renamed from: t, reason: collision with root package name */
    boolean f10159t;

    /* renamed from: u, reason: collision with root package name */
    boolean f10160u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10161v;

    /* renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f10163x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10164y;

    /* renamed from: z, reason: collision with root package name */
    boolean f10165z;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f10148i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f10149j = -1;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f10155p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private int f10157r = 0;

    /* renamed from: s, reason: collision with root package name */
    boolean f10158s = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10162w = true;

    /* renamed from: A, reason: collision with root package name */
    final InterfaceC1303l0 f10137A = new a();

    /* renamed from: B, reason: collision with root package name */
    final InterfaceC1303l0 f10138B = new b();

    /* renamed from: C, reason: collision with root package name */
    final InterfaceC1307n0 f10139C = new c();

    class a extends AbstractC1305m0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC1303l0
        public void b(View view) {
            View view2;
            B b4 = B.this;
            if (b4.f10158s && (view2 = b4.f10147h) != null) {
                view2.setTranslationY(0.0f);
                B.this.f10144e.setTranslationY(0.0f);
            }
            B.this.f10144e.setVisibility(8);
            B.this.f10144e.setTransitioning(false);
            B b5 = B.this;
            b5.f10163x = null;
            b5.x();
            ActionBarOverlayLayout actionBarOverlayLayout = B.this.f10143d;
            if (actionBarOverlayLayout != null) {
                AbstractC1281a0.l0(actionBarOverlayLayout);
            }
        }
    }

    class b extends AbstractC1305m0 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC1303l0
        public void b(View view) {
            B b4 = B.this;
            b4.f10163x = null;
            b4.f10144e.requestLayout();
        }
    }

    class c implements InterfaceC1307n0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC1307n0
        public void a(View view) {
            ((View) B.this.f10144e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements e.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f10169c;

        /* renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f10170d;

        /* renamed from: e, reason: collision with root package name */
        private b.a f10171e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference f10172f;

        public d(Context context, b.a aVar) {
            this.f10169c = context;
            this.f10171e = aVar;
            androidx.appcompat.view.menu.e defaultShowAsAction = new androidx.appcompat.view.menu.e(context).setDefaultShowAsAction(1);
            this.f10170d = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f10171e;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f10171e == null) {
                return;
            }
            k();
            B.this.f10146g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            B b4 = B.this;
            if (b4.f10151l != this) {
                return;
            }
            if (B.w(b4.f10159t, b4.f10160u, false)) {
                this.f10171e.a(this);
            } else {
                B b5 = B.this;
                b5.f10152m = this;
                b5.f10153n = this.f10171e;
            }
            this.f10171e = null;
            B.this.v(false);
            B.this.f10146g.g();
            B b6 = B.this;
            b6.f10143d.setHideOnContentScrollEnabled(b6.f10165z);
            B.this.f10151l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f10172f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f10170d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f10169c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return B.this.f10146g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return B.this.f10146g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (B.this.f10151l != this) {
                return;
            }
            this.f10170d.stopDispatchingItemsChanged();
            try {
                this.f10171e.c(this, this.f10170d);
            } finally {
                this.f10170d.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return B.this.f10146g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            B.this.f10146g.setCustomView(view);
            this.f10172f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i4) {
            o(B.this.f10140a.getResources().getString(i4));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            B.this.f10146g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i4) {
            r(B.this.f10140a.getResources().getString(i4));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            B.this.f10146g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z4) {
            super.s(z4);
            B.this.f10146g.setTitleOptional(z4);
        }

        public boolean t() {
            this.f10170d.stopDispatchingItemsChanged();
            try {
                return this.f10171e.b(this, this.f10170d);
            } finally {
                this.f10170d.startDispatchingItemsChanged();
            }
        }
    }

    public B(Activity activity, boolean z4) {
        this.f10142c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z4) {
            return;
        }
        this.f10147h = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private androidx.appcompat.widget.A A(View view) {
        if (view instanceof androidx.appcompat.widget.A) {
            return (androidx.appcompat.widget.A) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.f10161v) {
            this.f10161v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f10143d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(e.f.f36311p);
        this.f10143d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f10145f = A(view.findViewById(e.f.f36296a));
        this.f10146g = (ActionBarContextView) view.findViewById(e.f.f36301f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(e.f.f36298c);
        this.f10144e = actionBarContainer;
        androidx.appcompat.widget.A a4 = this.f10145f;
        if (a4 == null || this.f10146g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f10140a = a4.getContext();
        boolean z4 = (this.f10145f.t() & 4) != 0;
        if (z4) {
            this.f10150k = true;
        }
        androidx.appcompat.view.a b4 = androidx.appcompat.view.a.b(this.f10140a);
        J(b4.a() || z4);
        H(b4.e());
        TypedArray obtainStyledAttributes = this.f10140a.obtainStyledAttributes(null, e.j.f36470a, AbstractC2405a.f36189c, 0);
        if (obtainStyledAttributes.getBoolean(e.j.f36520k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.j.f36510i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void H(boolean z4) {
        this.f10156q = z4;
        if (z4) {
            this.f10144e.setTabContainer(null);
            this.f10145f.i(null);
        } else {
            this.f10145f.i(null);
            this.f10144e.setTabContainer(null);
        }
        boolean z5 = false;
        boolean z6 = B() == 2;
        this.f10145f.w(!this.f10156q && z6);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10143d;
        if (!this.f10156q && z6) {
            z5 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z5);
    }

    private boolean K() {
        return this.f10144e.isLaidOut();
    }

    private void L() {
        if (this.f10161v) {
            return;
        }
        this.f10161v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10143d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    private void M(boolean z4) {
        if (w(this.f10159t, this.f10160u, this.f10161v)) {
            if (this.f10162w) {
                return;
            }
            this.f10162w = true;
            z(z4);
            return;
        }
        if (this.f10162w) {
            this.f10162w = false;
            y(z4);
        }
    }

    static boolean w(boolean z4, boolean z5, boolean z6) {
        if (z6) {
            return true;
        }
        return (z4 || z5) ? false : true;
    }

    public int B() {
        return this.f10145f.n();
    }

    public void E(boolean z4) {
        F(z4 ? 4 : 0, 4);
    }

    public void F(int i4, int i5) {
        int t4 = this.f10145f.t();
        if ((i5 & 4) != 0) {
            this.f10150k = true;
        }
        this.f10145f.k((i4 & i5) | ((~i5) & t4));
    }

    public void G(float f4) {
        AbstractC1281a0.w0(this.f10144e, f4);
    }

    public void I(boolean z4) {
        if (z4 && !this.f10143d.r()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f10165z = z4;
        this.f10143d.setHideOnContentScrollEnabled(z4);
    }

    public void J(boolean z4) {
        this.f10145f.s(z4);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f10160u) {
            this.f10160u = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z4) {
        this.f10158s = z4;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f10160u) {
            return;
        }
        this.f10160u = true;
        M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f10163x;
        if (hVar != null) {
            hVar.a();
            this.f10163x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i4) {
        this.f10157r = i4;
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public boolean h() {
        androidx.appcompat.widget.A a4 = this.f10145f;
        if (a4 == null || !a4.j()) {
            return false;
        }
        this.f10145f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void i(boolean z4) {
        if (z4 == this.f10154o) {
            return;
        }
        this.f10154o = z4;
        if (this.f10155p.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f10155p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public int j() {
        return this.f10145f.t();
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public Context k() {
        if (this.f10141b == null) {
            TypedValue typedValue = new TypedValue();
            this.f10140a.getTheme().resolveAttribute(AbstractC2405a.f36191e, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f10141b = new ContextThemeWrapper(this.f10140a, i4);
            } else {
                this.f10141b = this.f10140a;
            }
        }
        return this.f10141b;
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void m(Configuration configuration) {
        H(androidx.appcompat.view.a.b(this.f10140a).e());
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public boolean o(int i4, KeyEvent keyEvent) {
        Menu e4;
        d dVar = this.f10151l;
        if (dVar == null || (e4 = dVar.e()) == null) {
            return false;
        }
        e4.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e4.performShortcut(i4, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void r(boolean z4) {
        if (this.f10150k) {
            return;
        }
        E(z4);
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void s(boolean z4) {
        androidx.appcompat.view.h hVar;
        this.f10164y = z4;
        if (z4 || (hVar = this.f10163x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void t(CharSequence charSequence) {
        this.f10145f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public androidx.appcompat.view.b u(b.a aVar) {
        d dVar = this.f10151l;
        if (dVar != null) {
            dVar.c();
        }
        this.f10143d.setHideOnContentScrollEnabled(false);
        this.f10146g.k();
        d dVar2 = new d(this.f10146g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f10151l = dVar2;
        dVar2.k();
        this.f10146g.h(dVar2);
        v(true);
        return dVar2;
    }

    public void v(boolean z4) {
        C1301k0 o4;
        C1301k0 f4;
        if (z4) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z4) {
                this.f10145f.q(4);
                this.f10146g.setVisibility(0);
                return;
            } else {
                this.f10145f.q(0);
                this.f10146g.setVisibility(8);
                return;
            }
        }
        if (z4) {
            f4 = this.f10145f.o(4, 100L);
            o4 = this.f10146g.f(0, 200L);
        } else {
            o4 = this.f10145f.o(0, 200L);
            f4 = this.f10146g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(f4, o4);
        hVar.h();
    }

    void x() {
        b.a aVar = this.f10153n;
        if (aVar != null) {
            aVar.a(this.f10152m);
            this.f10152m = null;
            this.f10153n = null;
        }
    }

    public void y(boolean z4) {
        View view;
        androidx.appcompat.view.h hVar = this.f10163x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f10157r != 0 || (!this.f10164y && !z4)) {
            this.f10137A.b(null);
            return;
        }
        this.f10144e.setAlpha(1.0f);
        this.f10144e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f4 = -this.f10144e.getHeight();
        if (z4) {
            this.f10144e.getLocationInWindow(new int[]{0, 0});
            f4 -= r5[1];
        }
        C1301k0 l4 = AbstractC1281a0.e(this.f10144e).l(f4);
        l4.j(this.f10139C);
        hVar2.c(l4);
        if (this.f10158s && (view = this.f10147h) != null) {
            hVar2.c(AbstractC1281a0.e(view).l(f4));
        }
        hVar2.f(f10135D);
        hVar2.e(250L);
        hVar2.g(this.f10137A);
        this.f10163x = hVar2;
        hVar2.h();
    }

    public void z(boolean z4) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f10163x;
        if (hVar != null) {
            hVar.a();
        }
        this.f10144e.setVisibility(0);
        if (this.f10157r == 0 && (this.f10164y || z4)) {
            this.f10144e.setTranslationY(0.0f);
            float f4 = -this.f10144e.getHeight();
            if (z4) {
                this.f10144e.getLocationInWindow(new int[]{0, 0});
                f4 -= r5[1];
            }
            this.f10144e.setTranslationY(f4);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C1301k0 l4 = AbstractC1281a0.e(this.f10144e).l(0.0f);
            l4.j(this.f10139C);
            hVar2.c(l4);
            if (this.f10158s && (view2 = this.f10147h) != null) {
                view2.setTranslationY(f4);
                hVar2.c(AbstractC1281a0.e(this.f10147h).l(0.0f));
            }
            hVar2.f(f10136E);
            hVar2.e(250L);
            hVar2.g(this.f10138B);
            this.f10163x = hVar2;
            hVar2.h();
        } else {
            this.f10144e.setAlpha(1.0f);
            this.f10144e.setTranslationY(0.0f);
            if (this.f10158s && (view = this.f10147h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f10138B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10143d;
        if (actionBarOverlayLayout != null) {
            AbstractC1281a0.l0(actionBarOverlayLayout);
        }
    }

    public B(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }
}
