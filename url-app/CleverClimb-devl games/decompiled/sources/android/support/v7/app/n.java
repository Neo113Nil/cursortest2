package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.app.a;
import android.support.v7.view.b;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public class n extends android.support.v7.app.a implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    static final /* synthetic */ boolean s = !n.class.desiredAssertionStatus();
    private static final Interpolator t = new AccelerateInterpolator();
    private static final Interpolator u = new DecelerateInterpolator();
    private boolean A;
    private boolean B;
    private boolean D;
    private boolean F;
    private boolean H;

    /* renamed from: a, reason: collision with root package name */
    Context f1676a;

    /* renamed from: b, reason: collision with root package name */
    ActionBarOverlayLayout f1677b;

    /* renamed from: c, reason: collision with root package name */
    ActionBarContainer f1678c;

    /* renamed from: d, reason: collision with root package name */
    DecorToolbar f1679d;
    ActionBarContextView e;
    View f;
    ScrollingTabContainerView g;
    a h;
    android.support.v7.view.b i;
    b.a j;
    boolean l;
    boolean m;
    android.support.v7.view.h n;
    boolean o;
    private Context v;
    private Activity w;
    private Dialog x;
    private ArrayList<Object> y = new ArrayList<>();
    private int z = -1;
    private ArrayList<a.b> C = new ArrayList<>();
    private int E = 0;
    boolean k = true;
    private boolean G = true;
    final ViewPropertyAnimatorListener p = new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.n.1
        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (n.this.k && n.this.f != null) {
                n.this.f.setTranslationY(0.0f);
                n.this.f1678c.setTranslationY(0.0f);
            }
            n.this.f1678c.setVisibility(8);
            n.this.f1678c.setTransitioning(false);
            n.this.n = null;
            n.this.h();
            if (n.this.f1677b != null) {
                ViewCompat.requestApplyInsets(n.this.f1677b);
            }
        }
    };
    final ViewPropertyAnimatorListener q = new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.n.2
        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            n.this.n = null;
            n.this.f1678c.requestLayout();
        }
    };
    final ViewPropertyAnimatorUpdateListener r = new ViewPropertyAnimatorUpdateListener() { // from class: android.support.v7.app.n.3
        @Override // android.support.v4.view.ViewPropertyAnimatorUpdateListener
        public void onAnimationUpdate(View view) {
            ((View) n.this.f1678c.getParent()).invalidate();
        }
    };

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    public n(Activity activity, boolean z) {
        this.w = activity;
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (z) {
            return;
        }
        this.f = decorView.findViewById(R.id.content);
    }

    public n(Dialog dialog) {
        this.x = dialog;
        a(dialog.getWindow().getDecorView());
    }

    private void a(View view) {
        this.f1677b = (ActionBarOverlayLayout) view.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
        if (this.f1677b != null) {
            this.f1677b.setActionBarVisibilityCallback(this);
        }
        this.f1679d = b(view.findViewById(android.support.v7.appcompat.R.id.action_bar));
        this.e = (ActionBarContextView) view.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
        this.f1678c = (ActionBarContainer) view.findViewById(android.support.v7.appcompat.R.id.action_bar_container);
        if (this.f1679d == null || this.e == null || this.f1678c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1676a = this.f1679d.getContext();
        boolean z = (this.f1679d.getDisplayOptions() & 4) != 0;
        if (z) {
            this.A = true;
        }
        android.support.v7.view.a a2 = android.support.v7.view.a.a(this.f1676a);
        a(a2.f() || z);
        j(a2.d());
        TypedArray obtainStyledAttributes = this.f1676a.obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.ActionBar_hideOnContentScroll, false)) {
            b(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DecorToolbar b(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view);
        throw new IllegalStateException(sb.toString() != null ? view.getClass().getSimpleName() : "null");
    }

    @Override // android.support.v7.app.a
    public void a(float f) {
        ViewCompat.setElevation(this.f1678c, f);
    }

    @Override // android.support.v7.app.a
    public void a(Configuration configuration) {
        j(android.support.v7.view.a.a(this.f1676a).d());
    }

    private void j(boolean z) {
        this.D = z;
        if (!this.D) {
            this.f1679d.setEmbeddedTabView(null);
            this.f1678c.setTabContainer(this.g);
        } else {
            this.f1678c.setTabContainer(null);
            this.f1679d.setEmbeddedTabView(this.g);
        }
        boolean z2 = i() == 2;
        if (this.g != null) {
            if (z2) {
                this.g.setVisibility(0);
                if (this.f1677b != null) {
                    ViewCompat.requestApplyInsets(this.f1677b);
                }
            } else {
                this.g.setVisibility(8);
            }
        }
        this.f1679d.setCollapsible(!this.D && z2);
        this.f1677b.setHasNonEmbeddedTabs(!this.D && z2);
    }

    void h() {
        if (this.j != null) {
            this.j.a(this.i);
            this.i = null;
            this.j = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i) {
        this.E = i;
    }

    @Override // android.support.v7.app.a
    public void d(boolean z) {
        this.H = z;
        if (z || this.n == null) {
            return;
        }
        this.n.c();
    }

    @Override // android.support.v7.app.a
    public void e(boolean z) {
        if (z == this.B) {
            return;
        }
        this.B = z;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            this.C.get(i).a(z);
        }
    }

    public void f(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.a
    public void a(boolean z) {
        this.f1679d.setHomeButtonEnabled(z);
    }

    @Override // android.support.v7.app.a
    public void a(CharSequence charSequence) {
        this.f1679d.setWindowTitle(charSequence);
    }

    public void a(int i, int i2) {
        int displayOptions = this.f1679d.getDisplayOptions();
        if ((i2 & 4) != 0) {
            this.A = true;
        }
        this.f1679d.setDisplayOptions((i & i2) | ((i2 ^ (-1)) & displayOptions));
    }

    public int i() {
        return this.f1679d.getNavigationMode();
    }

    @Override // android.support.v7.app.a
    public int a() {
        return this.f1679d.getDisplayOptions();
    }

    @Override // android.support.v7.app.a
    public android.support.v7.view.b a(b.a aVar) {
        if (this.h != null) {
            this.h.c();
        }
        this.f1677b.setHideOnContentScrollEnabled(false);
        this.e.killMode();
        a aVar2 = new a(this.e.getContext(), aVar);
        if (!aVar2.e()) {
            return null;
        }
        this.h = aVar2;
        aVar2.d();
        this.e.initForMode(aVar2);
        i(true);
        this.e.sendAccessibilityEvent(32);
        return aVar2;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z) {
        this.k = z;
    }

    private void j() {
        if (this.F) {
            return;
        }
        this.F = true;
        if (this.f1677b != null) {
            this.f1677b.setShowingForActionMode(true);
        }
        k(false);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.m) {
            this.m = false;
            k(true);
        }
    }

    private void k() {
        if (this.F) {
            this.F = false;
            if (this.f1677b != null) {
                this.f1677b.setShowingForActionMode(false);
            }
            k(false);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (this.m) {
            return;
        }
        this.m = true;
        k(true);
    }

    @Override // android.support.v7.app.a
    public void b(boolean z) {
        if (z && !this.f1677b.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.o = z;
        this.f1677b.setHideOnContentScrollEnabled(z);
    }

    private void k(boolean z) {
        if (a(this.l, this.m, this.F)) {
            if (this.G) {
                return;
            }
            this.G = true;
            g(z);
            return;
        }
        if (this.G) {
            this.G = false;
            h(z);
        }
    }

    public void g(boolean z) {
        if (this.n != null) {
            this.n.c();
        }
        this.f1678c.setVisibility(0);
        if (this.E == 0 && (this.H || z)) {
            this.f1678c.setTranslationY(0.0f);
            float f = -this.f1678c.getHeight();
            if (z) {
                this.f1678c.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.f1678c.setTranslationY(f);
            android.support.v7.view.h hVar = new android.support.v7.view.h();
            ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.f1678c).translationY(0.0f);
            translationY.setUpdateListener(this.r);
            hVar.a(translationY);
            if (this.k && this.f != null) {
                this.f.setTranslationY(f);
                hVar.a(ViewCompat.animate(this.f).translationY(0.0f));
            }
            hVar.a(u);
            hVar.a(250L);
            hVar.a(this.q);
            this.n = hVar;
            hVar.a();
        } else {
            this.f1678c.setAlpha(1.0f);
            this.f1678c.setTranslationY(0.0f);
            if (this.k && this.f != null) {
                this.f.setTranslationY(0.0f);
            }
            this.q.onAnimationEnd(null);
        }
        if (this.f1677b != null) {
            ViewCompat.requestApplyInsets(this.f1677b);
        }
    }

    public void h(boolean z) {
        if (this.n != null) {
            this.n.c();
        }
        if (this.E == 0 && (this.H || z)) {
            this.f1678c.setAlpha(1.0f);
            this.f1678c.setTransitioning(true);
            android.support.v7.view.h hVar = new android.support.v7.view.h();
            float f = -this.f1678c.getHeight();
            if (z) {
                this.f1678c.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.f1678c).translationY(f);
            translationY.setUpdateListener(this.r);
            hVar.a(translationY);
            if (this.k && this.f != null) {
                hVar.a(ViewCompat.animate(this.f).translationY(f));
            }
            hVar.a(t);
            hVar.a(250L);
            hVar.a(this.p);
            this.n = hVar;
            hVar.a();
            return;
        }
        this.p.onAnimationEnd(null);
    }

    public void i(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        if (z) {
            j();
        } else {
            k();
        }
        if (!l()) {
            if (z) {
                this.f1679d.setVisibility(4);
                this.e.setVisibility(0);
                return;
            } else {
                this.f1679d.setVisibility(0);
                this.e.setVisibility(8);
                return;
            }
        }
        if (z) {
            viewPropertyAnimatorCompat2 = this.f1679d.setupAnimatorToVisibility(4, 100L);
            viewPropertyAnimatorCompat = this.e.setupAnimatorToVisibility(0, 200L);
        } else {
            viewPropertyAnimatorCompat = this.f1679d.setupAnimatorToVisibility(0, 200L);
            viewPropertyAnimatorCompat2 = this.e.setupAnimatorToVisibility(8, 100L);
        }
        android.support.v7.view.h hVar = new android.support.v7.view.h();
        hVar.a(viewPropertyAnimatorCompat2, viewPropertyAnimatorCompat);
        hVar.a();
    }

    private boolean l() {
        return ViewCompat.isLaidOut(this.f1678c);
    }

    @Override // android.support.v7.app.a
    public Context b() {
        if (this.v == null) {
            TypedValue typedValue = new TypedValue();
            this.f1676a.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.v = new ContextThemeWrapper(this.f1676a, i);
            } else {
                this.v = this.f1676a;
            }
        }
        return this.v;
    }

    @Override // android.support.v7.app.a
    public void a(int i) {
        this.f1679d.setNavigationContentDescription(i);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        if (this.n != null) {
            this.n.c();
            this.n = null;
        }
    }

    @Override // android.support.v7.app.a
    public boolean f() {
        if (this.f1679d == null || !this.f1679d.hasExpandedActionView()) {
            return false;
        }
        this.f1679d.collapseActionView();
        return true;
    }

    /* compiled from: WindowDecorActionBar.java */
    public class a extends android.support.v7.view.b implements MenuBuilder.a {

        /* renamed from: b, reason: collision with root package name */
        private final Context f1684b;

        /* renamed from: c, reason: collision with root package name */
        private final MenuBuilder f1685c;

        /* renamed from: d, reason: collision with root package name */
        private b.a f1686d;
        private WeakReference<View> e;

        public a(Context context, b.a aVar) {
            this.f1684b = context;
            this.f1686d = aVar;
            this.f1685c = new MenuBuilder(context).a(1);
            this.f1685c.a(this);
        }

        @Override // android.support.v7.view.b
        public MenuInflater a() {
            return new android.support.v7.view.g(this.f1684b);
        }

        @Override // android.support.v7.view.b
        public Menu b() {
            return this.f1685c;
        }

        @Override // android.support.v7.view.b
        public void c() {
            if (n.this.h != this) {
                return;
            }
            if (!n.a(n.this.l, n.this.m, false)) {
                n.this.i = this;
                n.this.j = this.f1686d;
            } else {
                this.f1686d.a(this);
            }
            this.f1686d = null;
            n.this.i(false);
            n.this.e.closeMode();
            n.this.f1679d.getViewGroup().sendAccessibilityEvent(32);
            n.this.f1677b.setHideOnContentScrollEnabled(n.this.o);
            n.this.h = null;
        }

        @Override // android.support.v7.view.b
        public void d() {
            if (n.this.h != this) {
                return;
            }
            this.f1685c.g();
            try {
                this.f1686d.b(this, this.f1685c);
            } finally {
                this.f1685c.h();
            }
        }

        public boolean e() {
            this.f1685c.g();
            try {
                return this.f1686d.a(this, this.f1685c);
            } finally {
                this.f1685c.h();
            }
        }

        @Override // android.support.v7.view.b
        public void a(View view) {
            n.this.e.setCustomView(view);
            this.e = new WeakReference<>(view);
        }

        @Override // android.support.v7.view.b
        public void a(CharSequence charSequence) {
            n.this.e.setSubtitle(charSequence);
        }

        @Override // android.support.v7.view.b
        public void b(CharSequence charSequence) {
            n.this.e.setTitle(charSequence);
        }

        @Override // android.support.v7.view.b
        public void a(int i) {
            b(n.this.f1676a.getResources().getString(i));
        }

        @Override // android.support.v7.view.b
        public void b(int i) {
            a((CharSequence) n.this.f1676a.getResources().getString(i));
        }

        @Override // android.support.v7.view.b
        public CharSequence f() {
            return n.this.e.getTitle();
        }

        @Override // android.support.v7.view.b
        public CharSequence g() {
            return n.this.e.getSubtitle();
        }

        @Override // android.support.v7.view.b
        public void a(boolean z) {
            super.a(z);
            n.this.e.setTitleOptional(z);
        }

        @Override // android.support.v7.view.b
        public boolean h() {
            return n.this.e.isTitleOptional();
        }

        @Override // android.support.v7.view.b
        public View i() {
            if (this.e != null) {
                return this.e.get();
            }
            return null;
        }

        @Override // android.support.v7.view.menu.MenuBuilder.a
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            if (this.f1686d != null) {
                return this.f1686d.a(this, menuItem);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.MenuBuilder.a
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (this.f1686d == null) {
                return;
            }
            d();
            n.this.e.showOverflowMenu();
        }
    }

    @Override // android.support.v7.app.a
    public void c(boolean z) {
        if (this.A) {
            return;
        }
        f(z);
    }

    @Override // android.support.v7.app.a
    public boolean a(int i, KeyEvent keyEvent) {
        Menu b2;
        if (this.h == null || (b2 = this.h.b()) == null) {
            return false;
        }
        b2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return b2.performShortcut(i, keyEvent, 0);
    }
}
