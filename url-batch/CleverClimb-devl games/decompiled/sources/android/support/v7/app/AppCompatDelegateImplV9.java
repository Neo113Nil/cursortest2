package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.NavUtils;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.view.b;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.l;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ViewUtils;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class AppCompatDelegateImplV9 extends e implements MenuBuilder.a, LayoutInflater.Factory2 {
    private static final boolean t;
    private View A;
    private boolean B;
    private boolean C;
    private boolean D;
    private PanelFeatureState[] E;
    private PanelFeatureState F;
    private boolean G;
    private final Runnable H;
    private boolean I;
    private Rect J;
    private Rect K;
    private AppCompatViewInflater L;
    android.support.v7.view.b m;
    ActionBarContextView n;
    PopupWindow o;
    Runnable p;
    ViewPropertyAnimatorCompat q;
    boolean r;
    int s;
    private DecorContentParent u;
    private a v;
    private d w;
    private boolean x;
    private ViewGroup y;
    private TextView z;

    void a(ViewGroup viewGroup) {
    }

    static {
        t = Build.VERSION.SDK_INT < 21;
    }

    AppCompatDelegateImplV9(Context context, Window window, android.support.v7.app.c cVar) {
        super(context, window, cVar);
        this.q = null;
        this.H = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV9.1
            @Override // java.lang.Runnable
            public void run() {
                if ((AppCompatDelegateImplV9.this.s & 1) != 0) {
                    AppCompatDelegateImplV9.this.f(0);
                }
                if ((AppCompatDelegateImplV9.this.s & 4096) != 0) {
                    AppCompatDelegateImplV9.this.f(108);
                }
                AppCompatDelegateImplV9.this.r = false;
                AppCompatDelegateImplV9.this.s = 0;
            }
        };
    }

    @Override // android.support.v7.app.d
    public void a(Bundle bundle) {
        if (!(this.f1636c instanceof Activity) || NavUtils.getParentActivityName((Activity) this.f1636c) == null) {
            return;
        }
        android.support.v7.app.a n = n();
        if (n == null) {
            this.I = true;
        } else {
            n.c(true);
        }
    }

    @Override // android.support.v7.app.d
    public void b(Bundle bundle) {
        x();
    }

    @Override // android.support.v7.app.e
    public void m() {
        x();
        if (this.h && this.f == null) {
            if (this.f1636c instanceof Activity) {
                this.f = new n((Activity) this.f1636c, this.i);
            } else if (this.f1636c instanceof Dialog) {
                this.f = new n((Dialog) this.f1636c);
            }
            if (this.f != null) {
                this.f.c(this.I);
            }
        }
    }

    @Override // android.support.v7.app.d
    public void a(Toolbar toolbar) {
        if (this.f1636c instanceof Activity) {
            android.support.v7.app.a a2 = a();
            if (a2 instanceof n) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.g = null;
            if (a2 != null) {
                a2.g();
            }
            if (toolbar != null) {
                k kVar = new k(toolbar, ((Activity) this.f1636c).getTitle(), this.f1637d);
                this.f = kVar;
                this.f1635b.setCallback(kVar.h());
            } else {
                this.f = null;
                this.f1635b.setCallback(this.f1637d);
            }
            f();
        }
    }

    @Override // android.support.v7.app.d
    public <T extends View> T a(int i) {
        x();
        return (T) this.f1635b.findViewById(i);
    }

    @Override // android.support.v7.app.d
    public void a(Configuration configuration) {
        android.support.v7.app.a a2;
        if (this.h && this.x && (a2 = a()) != null) {
            a2.a(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.f1634a);
        j();
    }

    @Override // android.support.v7.app.e, android.support.v7.app.d
    public void d() {
        android.support.v7.app.a a2 = a();
        if (a2 != null) {
            a2.d(false);
        }
    }

    @Override // android.support.v7.app.d
    public void e() {
        android.support.v7.app.a a2 = a();
        if (a2 != null) {
            a2.d(true);
        }
    }

    @Override // android.support.v7.app.d
    public void a(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1636c.onContentChanged();
    }

    @Override // android.support.v7.app.d
    public void b(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1634a).inflate(i, viewGroup);
        this.f1636c.onContentChanged();
    }

    @Override // android.support.v7.app.d
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1636c.onContentChanged();
    }

    @Override // android.support.v7.app.d
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ((ViewGroup) this.y.findViewById(R.id.content)).addView(view, layoutParams);
        this.f1636c.onContentChanged();
    }

    @Override // android.support.v7.app.e, android.support.v7.app.d
    public void g() {
        if (this.r) {
            this.f1635b.getDecorView().removeCallbacks(this.H);
        }
        super.g();
        if (this.f != null) {
            this.f.g();
        }
    }

    private void x() {
        if (this.x) {
            return;
        }
        this.y = y();
        CharSequence s = s();
        if (!TextUtils.isEmpty(s)) {
            b(s);
        }
        z();
        a(this.y);
        this.x = true;
        PanelFeatureState a2 = a(0, false);
        if (q()) {
            return;
        }
        if (a2 == null || a2.j == null) {
            d(108);
        }
    }

    private ViewGroup y() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f1634a.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            c(1);
        } else if (obtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar, false)) {
            c(108);
        }
        if (obtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            c(109);
        }
        if (obtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            c(10);
        }
        this.k = obtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.f1635b.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1634a);
        if (!this.l) {
            if (this.k) {
                viewGroup = (ViewGroup) from.inflate(android.support.v7.appcompat.R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.i = false;
                this.h = false;
            } else if (this.h) {
                TypedValue typedValue = new TypedValue();
                this.f1634a.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new android.support.v7.view.d(this.f1634a, typedValue.resourceId);
                } else {
                    context = this.f1634a;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(android.support.v7.appcompat.R.layout.abc_screen_toolbar, (ViewGroup) null);
                this.u = (DecorContentParent) viewGroup.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
                this.u.setWindowCallback(r());
                if (this.i) {
                    this.u.initFeature(109);
                }
                if (this.B) {
                    this.u.initFeature(2);
                }
                if (this.C) {
                    this.u.initFeature(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            if (this.j) {
                viewGroup = (ViewGroup) from.inflate(android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
            } else {
                viewGroup = (ViewGroup) from.inflate(android.support.v7.appcompat.R.layout.abc_screen_simple, (ViewGroup) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: android.support.v7.app.AppCompatDelegateImplV9.2
                    @Override // android.support.v4.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                        int g = AppCompatDelegateImplV9.this.g(systemWindowInsetTop);
                        if (systemWindowInsetTop != g) {
                            windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), g, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                        }
                        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                    }
                });
            } else {
                ((FitWindowsViewGroup) viewGroup).setOnFitSystemWindowsListener(new FitWindowsViewGroup.OnFitSystemWindowsListener() { // from class: android.support.v7.app.AppCompatDelegateImplV9.3
                    @Override // android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
                    public void onFitSystemWindows(Rect rect) {
                        rect.top = AppCompatDelegateImplV9.this.g(rect.top);
                    }
                });
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.h + ", windowActionBarOverlay: " + this.i + ", android:windowIsFloating: " + this.k + ", windowActionModeOverlay: " + this.j + ", windowNoTitle: " + this.l + " }");
        }
        if (this.u == null) {
            this.z = (TextView) viewGroup.findViewById(android.support.v7.appcompat.R.id.title);
        }
        ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1635b.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1635b.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: android.support.v7.app.AppCompatDelegateImplV9.4
            @Override // android.support.v7.widget.ContentFrameLayout.OnAttachListener
            public void onAttachedFromWindow() {
            }

            @Override // android.support.v7.widget.ContentFrameLayout.OnAttachListener
            public void onDetachedFromWindow() {
                AppCompatDelegateImplV9.this.w();
            }
        });
        return viewGroup;
    }

    private void z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.y.findViewById(R.id.content);
        View decorView = this.f1635b.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1634a.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @Override // android.support.v7.app.d
    public boolean c(int i) {
        int h = h(i);
        if (this.l && h == 108) {
            return false;
        }
        if (this.h && h == 1) {
            this.h = false;
        }
        switch (h) {
            case 1:
                A();
                this.l = true;
                return true;
            case 2:
                A();
                this.B = true;
                return true;
            case 5:
                A();
                this.C = true;
                return true;
            case 10:
                A();
                this.j = true;
                return true;
            case 108:
                A();
                this.h = true;
                return true;
            case 109:
                A();
                this.i = true;
                return true;
            default:
                return this.f1635b.requestFeature(h);
        }
    }

    @Override // android.support.v7.app.e
    void b(CharSequence charSequence) {
        if (this.u != null) {
            this.u.setWindowTitle(charSequence);
        } else if (n() != null) {
            n().a(charSequence);
        } else if (this.z != null) {
            this.z.setText(charSequence);
        }
    }

    @Override // android.support.v7.app.e
    void a(int i, Menu menu) {
        if (i == 108) {
            android.support.v7.app.a a2 = a();
            if (a2 != null) {
                a2.e(false);
                return;
            }
            return;
        }
        if (i == 0) {
            PanelFeatureState a3 = a(i, true);
            if (a3.o) {
                a(a3, false);
            }
        }
    }

    @Override // android.support.v7.app.e
    boolean b(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        android.support.v7.app.a a2 = a();
        if (a2 != null) {
            a2.e(true);
        }
        return true;
    }

    @Override // android.support.v7.view.menu.MenuBuilder.a
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState a2;
        Window.Callback r = r();
        if (r == null || q() || (a2 = a((Menu) menuBuilder.p())) == null) {
            return false;
        }
        return r.onMenuItemSelected(a2.f1611a, menuItem);
    }

    @Override // android.support.v7.view.menu.MenuBuilder.a
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        a(menuBuilder, true);
    }

    @Override // android.support.v7.app.d
    public android.support.v7.view.b a(b.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.m != null) {
            this.m.c();
        }
        b bVar = new b(aVar);
        android.support.v7.app.a a2 = a();
        if (a2 != null) {
            this.m = a2.a(bVar);
            if (this.m != null && this.e != null) {
                this.e.onSupportActionModeStarted(this.m);
            }
        }
        if (this.m == null) {
            this.m = b(bVar);
        }
        return this.m;
    }

    @Override // android.support.v7.app.d
    public void f() {
        android.support.v7.app.a a2 = a();
        if (a2 == null || !a2.e()) {
            d(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    @Override // android.support.v7.app.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    android.support.v7.view.b b(b.a aVar) {
        android.support.v7.view.b bVar;
        Context context;
        u();
        if (this.m != null) {
            this.m.c();
        }
        if (!(aVar instanceof b)) {
            aVar = new b(aVar);
        }
        if (this.e != null && !q()) {
            try {
                bVar = this.e.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (bVar == null) {
                this.m = bVar;
            } else {
                if (this.n == null) {
                    if (this.k) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f1634a.getTheme();
                        theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.f1634a.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new android.support.v7.view.d(this.f1634a, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.f1634a;
                        }
                        this.n = new ActionBarContextView(context);
                        this.o = new PopupWindow(context, (AttributeSet) null, android.support.v7.appcompat.R.attr.actionModePopupWindowStyle);
                        PopupWindowCompat.setWindowLayoutType(this.o, 2);
                        this.o.setContentView(this.n);
                        this.o.setWidth(-1);
                        context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarSize, typedValue, true);
                        this.n.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.o.setHeight(-2);
                        this.p = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV9.5
                            @Override // java.lang.Runnable
                            public void run() {
                                AppCompatDelegateImplV9.this.o.showAtLocation(AppCompatDelegateImplV9.this.n, 55, 0, 0);
                                AppCompatDelegateImplV9.this.u();
                                if (AppCompatDelegateImplV9.this.t()) {
                                    AppCompatDelegateImplV9.this.n.setAlpha(0.0f);
                                    AppCompatDelegateImplV9.this.q = ViewCompat.animate(AppCompatDelegateImplV9.this.n).alpha(1.0f);
                                    AppCompatDelegateImplV9.this.q.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.AppCompatDelegateImplV9.5.1
                                        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
                                        public void onAnimationStart(View view) {
                                            AppCompatDelegateImplV9.this.n.setVisibility(0);
                                        }

                                        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
                                        public void onAnimationEnd(View view) {
                                            AppCompatDelegateImplV9.this.n.setAlpha(1.0f);
                                            AppCompatDelegateImplV9.this.q.setListener(null);
                                            AppCompatDelegateImplV9.this.q = null;
                                        }
                                    });
                                    return;
                                }
                                AppCompatDelegateImplV9.this.n.setAlpha(1.0f);
                                AppCompatDelegateImplV9.this.n.setVisibility(0);
                            }
                        };
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.y.findViewById(android.support.v7.appcompat.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(o()));
                            this.n = (ActionBarContextView) viewStubCompat.inflate();
                        }
                    }
                }
                if (this.n != null) {
                    u();
                    this.n.killMode();
                    android.support.v7.view.e eVar = new android.support.v7.view.e(this.n.getContext(), this.n, aVar, this.o == null);
                    if (aVar.a(eVar, eVar.b())) {
                        eVar.d();
                        this.n.initForMode(eVar);
                        this.m = eVar;
                        if (t()) {
                            this.n.setAlpha(0.0f);
                            this.q = ViewCompat.animate(this.n).alpha(1.0f);
                            this.q.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.AppCompatDelegateImplV9.6
                                @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
                                public void onAnimationStart(View view) {
                                    AppCompatDelegateImplV9.this.n.setVisibility(0);
                                    AppCompatDelegateImplV9.this.n.sendAccessibilityEvent(32);
                                    if (AppCompatDelegateImplV9.this.n.getParent() instanceof View) {
                                        ViewCompat.requestApplyInsets((View) AppCompatDelegateImplV9.this.n.getParent());
                                    }
                                }

                                @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
                                public void onAnimationEnd(View view) {
                                    AppCompatDelegateImplV9.this.n.setAlpha(1.0f);
                                    AppCompatDelegateImplV9.this.q.setListener(null);
                                    AppCompatDelegateImplV9.this.q = null;
                                }
                            });
                        } else {
                            this.n.setAlpha(1.0f);
                            this.n.setVisibility(0);
                            this.n.sendAccessibilityEvent(32);
                            if (this.n.getParent() instanceof View) {
                                ViewCompat.requestApplyInsets((View) this.n.getParent());
                            }
                        }
                        if (this.o != null) {
                            this.f1635b.getDecorView().post(this.p);
                        }
                    } else {
                        this.m = null;
                    }
                }
            }
            if (this.m != null && this.e != null) {
                this.e.onSupportActionModeStarted(this.m);
            }
            return this.m;
        }
        bVar = null;
        if (bVar == null) {
        }
        if (this.m != null) {
            this.e.onSupportActionModeStarted(this.m);
        }
        return this.m;
    }

    final boolean t() {
        return this.x && this.y != null && ViewCompat.isLaidOut(this.y);
    }

    void u() {
        if (this.q != null) {
            this.q.cancel();
        }
    }

    boolean v() {
        if (this.m != null) {
            this.m.c();
            return true;
        }
        android.support.v7.app.a a2 = a();
        return a2 != null && a2.f();
    }

    @Override // android.support.v7.app.e
    boolean a(int i, KeyEvent keyEvent) {
        android.support.v7.app.a a2 = a();
        if (a2 != null && a2.a(i, keyEvent)) {
            return true;
        }
        if (this.F != null && a(this.F, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.F != null) {
                this.F.n = true;
            }
            return true;
        }
        if (this.F == null) {
            PanelFeatureState a3 = a(0, true);
            b(a3, keyEvent);
            boolean a4 = a(a3, keyEvent.getKeyCode(), keyEvent, 1);
            a3.m = false;
            if (a4) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.app.e
    boolean a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 82 && this.f1636c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? c(keyCode, keyEvent) : b(keyCode, keyEvent);
    }

    boolean b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.G;
            this.G = false;
            PanelFeatureState a2 = a(0, false);
            if (a2 != null && a2.o) {
                if (!z) {
                    a(a2, true);
                }
                return true;
            }
            if (v()) {
                return true;
            }
        } else if (i == 82) {
            e(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.G = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View b(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.L == null) {
            String string = this.f1634a.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme).getString(android.support.v7.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.L = new AppCompatViewInflater();
            } else {
                try {
                    this.L = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.L = new AppCompatViewInflater();
                }
            }
        }
        if (t) {
            if (attributeSet instanceof XmlPullParser) {
                if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
            } else {
                z2 = a((ViewParent) view);
            }
            z = z2;
        } else {
            z = false;
        }
        return this.L.a(view, str, context, attributeSet, z, t, true, VectorEnabledTintResources.shouldBeUsed());
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1635b.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.isAttachedToWindow((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // android.support.v7.app.d
    public void i() {
        LayoutInflater from = LayoutInflater.from(this.f1634a);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(from, this);
        } else {
            if (from.getFactory2() instanceof AppCompatDelegateImplV9) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 != null ? a2 : b(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    View a(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView;
        if (!(this.f1636c instanceof LayoutInflater.Factory) || (onCreateView = ((LayoutInflater.Factory) this.f1636c).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return onCreateView;
    }

    private void a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.o || q()) {
            return;
        }
        if (panelFeatureState.f1611a == 0) {
            if ((this.f1634a.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback r = r();
        if (r != null && !r.onMenuOpened(panelFeatureState.f1611a, panelFeatureState.j)) {
            a(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1634a.getSystemService("window");
        if (windowManager != null && b(panelFeatureState, keyEvent)) {
            if (panelFeatureState.g == null || panelFeatureState.q) {
                if (panelFeatureState.g == null) {
                    if (!a(panelFeatureState) || panelFeatureState.g == null) {
                        return;
                    }
                } else if (panelFeatureState.q && panelFeatureState.g.getChildCount() > 0) {
                    panelFeatureState.g.removeAllViews();
                }
                if (!c(panelFeatureState) || !panelFeatureState.a()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = panelFeatureState.h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.g.setBackgroundResource(panelFeatureState.f1612b);
                ViewParent parent = panelFeatureState.h.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(panelFeatureState.h);
                }
                panelFeatureState.g.addView(panelFeatureState.h, layoutParams2);
                if (!panelFeatureState.h.hasFocus()) {
                    panelFeatureState.h.requestFocus();
                }
            } else if (panelFeatureState.i != null && (layoutParams = panelFeatureState.i.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
                panelFeatureState.n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f1614d, panelFeatureState.e, 1002, 8519680, -3);
                layoutParams3.gravity = panelFeatureState.f1613c;
                layoutParams3.windowAnimations = panelFeatureState.f;
                windowManager.addView(panelFeatureState.g, layoutParams3);
                panelFeatureState.o = true;
            }
            i = -2;
            panelFeatureState.n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f1614d, panelFeatureState.e, 1002, 8519680, -3);
            layoutParams32.gravity = panelFeatureState.f1613c;
            layoutParams32.windowAnimations = panelFeatureState.f;
            windowManager.addView(panelFeatureState.g, layoutParams32);
            panelFeatureState.o = true;
        }
    }

    private boolean a(PanelFeatureState panelFeatureState) {
        panelFeatureState.a(o());
        panelFeatureState.g = new c(panelFeatureState.l);
        panelFeatureState.f1613c = 81;
        return true;
    }

    private void a(MenuBuilder menuBuilder, boolean z) {
        if (this.u != null && this.u.canShowOverflowMenu() && (!ViewConfiguration.get(this.f1634a).hasPermanentMenuKey() || this.u.isOverflowMenuShowPending())) {
            Window.Callback r = r();
            if (!this.u.isOverflowMenuShowing() || !z) {
                if (r == null || q()) {
                    return;
                }
                if (this.r && (this.s & 1) != 0) {
                    this.f1635b.getDecorView().removeCallbacks(this.H);
                    this.H.run();
                }
                PanelFeatureState a2 = a(0, true);
                if (a2.j == null || a2.r || !r.onPreparePanel(0, a2.i, a2.j)) {
                    return;
                }
                r.onMenuOpened(108, a2.j);
                this.u.showOverflowMenu();
                return;
            }
            this.u.hideOverflowMenu();
            if (q()) {
                return;
            }
            r.onPanelClosed(108, a(0, true).j);
            return;
        }
        PanelFeatureState a3 = a(0, true);
        a3.q = true;
        a(a3, false);
        a(a3, (KeyEvent) null);
    }

    private boolean b(PanelFeatureState panelFeatureState) {
        Context context = this.f1634a;
        if ((panelFeatureState.f1611a == 0 || panelFeatureState.f1611a == 108) && this.u != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                android.support.v7.view.d dVar = new android.support.v7.view.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.a(this);
        panelFeatureState.a(menuBuilder);
        return true;
    }

    private boolean c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.i != null) {
            panelFeatureState.h = panelFeatureState.i;
            return true;
        }
        if (panelFeatureState.j == null) {
            return false;
        }
        if (this.w == null) {
            this.w = new d();
        }
        panelFeatureState.h = (View) panelFeatureState.a(this.w);
        return panelFeatureState.h != null;
    }

    private boolean b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (q()) {
            return false;
        }
        if (panelFeatureState.m) {
            return true;
        }
        if (this.F != null && this.F != panelFeatureState) {
            a(this.F, false);
        }
        Window.Callback r = r();
        if (r != null) {
            panelFeatureState.i = r.onCreatePanelView(panelFeatureState.f1611a);
        }
        boolean z = panelFeatureState.f1611a == 0 || panelFeatureState.f1611a == 108;
        if (z && this.u != null) {
            this.u.setMenuPrepared();
        }
        if (panelFeatureState.i == null && (!z || !(n() instanceof k))) {
            if (panelFeatureState.j == null || panelFeatureState.r) {
                if (panelFeatureState.j == null && (!b(panelFeatureState) || panelFeatureState.j == null)) {
                    return false;
                }
                if (z && this.u != null) {
                    if (this.v == null) {
                        this.v = new a();
                    }
                    this.u.setMenu(panelFeatureState.j, this.v);
                }
                panelFeatureState.j.g();
                if (!r.onCreatePanelMenu(panelFeatureState.f1611a, panelFeatureState.j)) {
                    panelFeatureState.a((MenuBuilder) null);
                    if (z && this.u != null) {
                        this.u.setMenu(null, this.v);
                    }
                    return false;
                }
                panelFeatureState.r = false;
            }
            panelFeatureState.j.g();
            if (panelFeatureState.s != null) {
                panelFeatureState.j.b(panelFeatureState.s);
                panelFeatureState.s = null;
            }
            if (!r.onPreparePanel(0, panelFeatureState.i, panelFeatureState.j)) {
                if (z && this.u != null) {
                    this.u.setMenu(null, this.v);
                }
                panelFeatureState.j.h();
                return false;
            }
            panelFeatureState.p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.j.setQwertyMode(panelFeatureState.p);
            panelFeatureState.j.h();
        }
        panelFeatureState.m = true;
        panelFeatureState.n = false;
        this.F = panelFeatureState;
        return true;
    }

    void a(MenuBuilder menuBuilder) {
        if (this.D) {
            return;
        }
        this.D = true;
        this.u.dismissPopups();
        Window.Callback r = r();
        if (r != null && !q()) {
            r.onPanelClosed(108, menuBuilder);
        }
        this.D = false;
    }

    void e(int i) {
        a(a(i, true), true);
    }

    void a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.f1611a == 0 && this.u != null && this.u.isOverflowMenuShowing()) {
            a(panelFeatureState.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1634a.getSystemService("window");
        if (windowManager != null && panelFeatureState.o && panelFeatureState.g != null) {
            windowManager.removeView(panelFeatureState.g);
            if (z) {
                a(panelFeatureState.f1611a, panelFeatureState, (Menu) null);
            }
        }
        panelFeatureState.m = false;
        panelFeatureState.n = false;
        panelFeatureState.o = false;
        panelFeatureState.h = null;
        panelFeatureState.q = true;
        if (this.F == panelFeatureState) {
            this.F = null;
        }
    }

    private boolean d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState a2 = a(i, true);
        if (a2.o) {
            return false;
        }
        return b(a2, keyEvent);
    }

    private boolean e(int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        if (this.m != null) {
            return false;
        }
        PanelFeatureState a2 = a(i, true);
        if (i == 0 && this.u != null && this.u.canShowOverflowMenu() && !ViewConfiguration.get(this.f1634a).hasPermanentMenuKey()) {
            if (!this.u.isOverflowMenuShowing()) {
                if (!q() && b(a2, keyEvent)) {
                    z = this.u.showOverflowMenu();
                }
                z = false;
            } else {
                z = this.u.hideOverflowMenu();
            }
        } else if (a2.o || a2.n) {
            z = a2.o;
            a(a2, true);
        } else {
            if (a2.m) {
                if (a2.r) {
                    a2.m = false;
                    z2 = b(a2, keyEvent);
                } else {
                    z2 = true;
                }
                if (z2) {
                    a(a2, keyEvent);
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            AudioManager audioManager = (AudioManager) this.f1634a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z;
    }

    void a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.E.length) {
                panelFeatureState = this.E[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.o) && !q()) {
            this.f1636c.onPanelClosed(i, menu);
        }
    }

    PanelFeatureState a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.E;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    protected PanelFeatureState a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.E;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.E = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    private boolean a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.m || b(panelFeatureState, keyEvent)) && panelFeatureState.j != null) {
            z = panelFeatureState.j.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.u == null) {
            a(panelFeatureState, true);
        }
        return z;
    }

    private void d(int i) {
        this.s = (1 << i) | this.s;
        if (this.r) {
            return;
        }
        ViewCompat.postOnAnimation(this.f1635b.getDecorView(), this.H);
        this.r = true;
    }

    void f(int i) {
        PanelFeatureState a2;
        PanelFeatureState a3 = a(i, true);
        if (a3.j != null) {
            Bundle bundle = new Bundle();
            a3.j.a(bundle);
            if (bundle.size() > 0) {
                a3.s = bundle;
            }
            a3.j.g();
            a3.j.clear();
        }
        a3.r = true;
        a3.q = true;
        if ((i != 108 && i != 0) || this.u == null || (a2 = a(0, false)) == null) {
            return;
        }
        a2.m = false;
        b(a2, (KeyEvent) null);
    }

    int g(int i) {
        boolean z;
        boolean z2;
        if (this.n == null || !(this.n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
            if (this.n.isShown()) {
                if (this.J == null) {
                    this.J = new Rect();
                    this.K = new Rect();
                }
                Rect rect = this.J;
                Rect rect2 = this.K;
                rect.set(0, i, 0, 0);
                ViewUtils.computeFitSystemWindows(this.y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.A == null) {
                        this.A = new View(this.f1634a);
                        this.A.setBackgroundColor(this.f1634a.getResources().getColor(android.support.v7.appcompat.R.color.abc_input_method_navigation_guard));
                        this.y.addView(this.A, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.A.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = this.A != null;
                if (!this.j && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                this.n.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.A != null) {
            this.A.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    private void A() {
        if (this.x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i != 9) {
            return i;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    void w() {
        if (this.u != null) {
            this.u.dismissPopups();
        }
        if (this.o != null) {
            this.f1635b.getDecorView().removeCallbacks(this.p);
            if (this.o.isShowing()) {
                try {
                    this.o.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.o = null;
        }
        u();
        PanelFeatureState a2 = a(0, false);
        if (a2 == null || a2.j == null) {
            return;
        }
        a2.j.close();
    }

    class b implements b.a {

        /* renamed from: b, reason: collision with root package name */
        private b.a f1617b;

        public b(b.a aVar) {
            this.f1617b = aVar;
        }

        @Override // android.support.v7.view.b.a
        public boolean a(android.support.v7.view.b bVar, Menu menu) {
            return this.f1617b.a(bVar, menu);
        }

        @Override // android.support.v7.view.b.a
        public boolean b(android.support.v7.view.b bVar, Menu menu) {
            return this.f1617b.b(bVar, menu);
        }

        @Override // android.support.v7.view.b.a
        public boolean a(android.support.v7.view.b bVar, MenuItem menuItem) {
            return this.f1617b.a(bVar, menuItem);
        }

        @Override // android.support.v7.view.b.a
        public void a(android.support.v7.view.b bVar) {
            this.f1617b.a(bVar);
            if (AppCompatDelegateImplV9.this.o != null) {
                AppCompatDelegateImplV9.this.f1635b.getDecorView().removeCallbacks(AppCompatDelegateImplV9.this.p);
            }
            if (AppCompatDelegateImplV9.this.n != null) {
                AppCompatDelegateImplV9.this.u();
                AppCompatDelegateImplV9.this.q = ViewCompat.animate(AppCompatDelegateImplV9.this.n).alpha(0.0f);
                AppCompatDelegateImplV9.this.q.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.AppCompatDelegateImplV9.b.1
                    @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
                    public void onAnimationEnd(View view) {
                        AppCompatDelegateImplV9.this.n.setVisibility(8);
                        if (AppCompatDelegateImplV9.this.o != null) {
                            AppCompatDelegateImplV9.this.o.dismiss();
                        } else if (AppCompatDelegateImplV9.this.n.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) AppCompatDelegateImplV9.this.n.getParent());
                        }
                        AppCompatDelegateImplV9.this.n.removeAllViews();
                        AppCompatDelegateImplV9.this.q.setListener(null);
                        AppCompatDelegateImplV9.this.q = null;
                    }
                });
            }
            if (AppCompatDelegateImplV9.this.e != null) {
                AppCompatDelegateImplV9.this.e.onSupportActionModeFinished(AppCompatDelegateImplV9.this.m);
            }
            AppCompatDelegateImplV9.this.m = null;
        }
    }

    private final class d implements l.a {
        d() {
        }

        @Override // android.support.v7.view.menu.l.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            MenuBuilder p = menuBuilder.p();
            boolean z2 = p != menuBuilder;
            AppCompatDelegateImplV9 appCompatDelegateImplV9 = AppCompatDelegateImplV9.this;
            if (z2) {
                menuBuilder = p;
            }
            PanelFeatureState a2 = appCompatDelegateImplV9.a((Menu) menuBuilder);
            if (a2 != null) {
                if (z2) {
                    AppCompatDelegateImplV9.this.a(a2.f1611a, a2, p);
                    AppCompatDelegateImplV9.this.a(a2, true);
                } else {
                    AppCompatDelegateImplV9.this.a(a2, z);
                }
            }
        }

        @Override // android.support.v7.view.menu.l.a
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback r;
            if (menuBuilder != null || !AppCompatDelegateImplV9.this.h || (r = AppCompatDelegateImplV9.this.r()) == null || AppCompatDelegateImplV9.this.q()) {
                return true;
            }
            r.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    private final class a implements l.a {
        a() {
        }

        @Override // android.support.v7.view.menu.l.a
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback r = AppCompatDelegateImplV9.this.r();
            if (r == null) {
                return true;
            }
            r.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // android.support.v7.view.menu.l.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImplV9.this.a(menuBuilder);
        }
    }

    protected static final class PanelFeatureState {

        /* renamed from: a, reason: collision with root package name */
        int f1611a;

        /* renamed from: b, reason: collision with root package name */
        int f1612b;

        /* renamed from: c, reason: collision with root package name */
        int f1613c;

        /* renamed from: d, reason: collision with root package name */
        int f1614d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        MenuBuilder j;
        android.support.v7.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        PanelFeatureState(int i) {
            this.f1611a = i;
        }

        public boolean a() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(android.support.v7.appcompat.R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            android.support.v7.view.d dVar = new android.support.v7.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme);
            this.f1612b = obtainStyledAttributes.getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
            this.f = obtainStyledAttributes.getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        void a(MenuBuilder menuBuilder) {
            if (menuBuilder == this.j) {
                return;
            }
            if (this.j != null) {
                this.j.b(this.k);
            }
            this.j = menuBuilder;
            if (menuBuilder == null || this.k == null) {
                return;
            }
            menuBuilder.a(this.k);
        }

        android.support.v7.view.menu.m a(l.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                this.k = new android.support.v7.view.menu.e(this.l, android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
                this.k.setCallback(aVar);
                this.j.a(this.k);
            }
            return this.k.a(this.g);
        }

        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.v7.app.AppCompatDelegateImplV9.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.readFromParcel(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.readFromParcel(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            };
            int featureId;
            boolean isOpen;
            Bundle menuState;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }

            static SavedState readFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                savedState.isOpen = parcel.readInt() == 1;
                if (savedState.isOpen) {
                    savedState.menuState = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }
    }

    private class c extends ContentFrameLayout {
        public c(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImplV9.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImplV9.this.e(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(android.support.v7.a.a.b.b(getContext(), i));
        }

        private boolean a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }
}
