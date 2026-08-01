package h;

import M.C0029z;
import M.InterfaceC0014j;
import M.P;
import M.W;
import Z.AbstractC0043g;
import a.AbstractC0058a;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC0078m;
import g.AbstractC0122a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC0204a;
import l.C0206c;
import m.C0224h;
import m.C0225i;
import m.C0231o;
import m.InterfaceC0227k;
import m.MenuC0229m;
import n.C0245A;
import n.C0249E;
import n.C0251G;
import n.C0261Q;
import n.C0274g;
import n.C0279i0;
import n.C0282k;
import n.C0300t;
import n.C0302u;
import n.C0306w;
import n.C0310y;
import n.C0312z;
import n.InterfaceC0283k0;
import n.InterfaceC0285l0;
import n.d1;
import n.i1;
import n.k1;
import n.n1;

/* loaded from: classes.dex */
public final class z extends n implements InterfaceC0227k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final q.k f2841i0 = new q.k();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f2842j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2843k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2844A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2845B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2846C;

    /* renamed from: D, reason: collision with root package name */
    public View f2847D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2848E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2849F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2850G;
    public boolean H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2851I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2852J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2853K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2854L;

    /* renamed from: M, reason: collision with root package name */
    public y[] f2855M;

    /* renamed from: N, reason: collision with root package name */
    public y f2856N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2857O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2858P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2859Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2860R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2861S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2862T;

    /* renamed from: U, reason: collision with root package name */
    public int f2863U;

    /* renamed from: V, reason: collision with root package name */
    public int f2864V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2865W;

    /* renamed from: X, reason: collision with root package name */
    public v f2866X;

    /* renamed from: Y, reason: collision with root package name */
    public v f2867Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2868Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2869a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2871c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2872d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2873e0;

    /* renamed from: f0, reason: collision with root package name */
    public D f2874f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2875g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2876h0;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2877k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2878l;

    /* renamed from: m, reason: collision with root package name */
    public u f2879m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2880n;

    /* renamed from: o, reason: collision with root package name */
    public K f2881o;

    /* renamed from: p, reason: collision with root package name */
    public l.h f2882p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2883q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0283k0 f2884r;

    /* renamed from: s, reason: collision with root package name */
    public p f2885s;

    /* renamed from: t, reason: collision with root package name */
    public p f2886t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0204a f2887u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2888v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2889w;

    /* renamed from: x, reason: collision with root package name */
    public o f2890x;

    /* renamed from: y, reason: collision with root package name */
    public W f2891y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2892z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final o f2870b0 = new o(this, 0);

    public z(Context context, Window window, InterfaceC0133j interfaceC0133j, Object obj) {
        AbstractActivityC0132i abstractActivityC0132i;
        this.f2862T = -100;
        this.f2877k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0132i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0132i = (AbstractActivityC0132i) context;
                    break;
                }
            }
            abstractActivityC0132i = null;
            if (abstractActivityC0132i != null) {
                this.f2862T = ((z) abstractActivityC0132i.l()).f2862T;
            }
        }
        if (this.f2862T == -100) {
            q.k kVar = f2841i0;
            Integer num = (Integer) kVar.getOrDefault(this.j.getClass().getName(), null);
            if (num != null) {
                this.f2862T = num.intValue();
                kVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0302u.d();
    }

    public static I.f o(Context context) {
        I.f fVar;
        I.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = n.f2810c) == null) {
            return null;
        }
        I.f b2 = s.b(context.getApplicationContext().getResources().getConfiguration());
        I.g gVar = fVar.f577a;
        if (gVar.f578a.isEmpty()) {
            fVar2 = I.f.f576b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f577a.f578a.size() + gVar.f578a.size()) {
                Locale locale = i < gVar.f578a.size() ? gVar.f578a.get(i) : b2.f577a.f578a.get(i - gVar.f578a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new I.f(new I.g(I.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f577a.f578a.isEmpty() ? b2 : fVar2;
    }

    public static Configuration s(Context context, int i, I.f fVar, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            s.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f2869a0 = (1 << i) | this.f2869a0;
        if (this.f2868Z) {
            return;
        }
        View decorView = this.f2878l.getDecorView();
        o oVar = this.f2870b0;
        WeakHashMap weakHashMap = P.f711a;
        decorView.postOnAnimation(oVar);
        this.f2868Z = true;
    }

    public final int B(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return x(context).f();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f2867Y == null) {
                    this.f2867Y = new v(this, context);
                }
                return this.f2867Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0285l0 interfaceC0285l0;
        d1 d1Var;
        boolean z2 = this.f2857O;
        this.f2857O = false;
        y y2 = y(0);
        if (y2.f2837m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0204a abstractC0204a = this.f2887u;
        if (abstractC0204a != null) {
            abstractC0204a.a();
            return true;
        }
        z();
        K k2 = this.f2881o;
        if (k2 == null || (interfaceC0285l0 = k2.i) == null || (d1Var = ((i1) interfaceC0285l0).f3637a.f1787L) == null || d1Var.f3611b == null) {
            return false;
        }
        d1 d1Var2 = ((i1) interfaceC0285l0).f3637a.f1787L;
        C0231o c0231o = d1Var2 == null ? null : d1Var2.f3611b;
        if (c0231o != null) {
            c0231o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f3341f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(y yVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (yVar.f2837m || this.f2860R) {
            return;
        }
        int i2 = yVar.f2828a;
        Context context = this.f2877k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2878l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, yVar.f2834h)) {
            r(yVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(yVar, keyEvent)) {
            return;
        }
        x xVar = yVar.e;
        if (xVar == null || yVar.f2838n) {
            if (xVar == null) {
                z();
                K k2 = this.f2881o;
                Context i02 = k2 != null ? k2.i0() : null;
                if (i02 != null) {
                    context = i02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.winpower.neonfit.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.winpower.neonfit.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.winpower.neonfit.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0206c c0206c = new C0206c(context, 0);
                c0206c.getTheme().setTo(newTheme);
                yVar.j = c0206c;
                TypedArray obtainStyledAttributes = c0206c.obtainStyledAttributes(AbstractC0122a.j);
                yVar.f2829b = obtainStyledAttributes.getResourceId(86, 0);
                yVar.f2831d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                yVar.e = new x(this, yVar.j);
                yVar.f2830c = 81;
            } else if (yVar.f2838n && xVar.getChildCount() > 0) {
                yVar.e.removeAllViews();
            }
            View view = yVar.f2833g;
            if (view == null) {
                if (yVar.f2834h != null) {
                    if (this.f2886t == null) {
                        this.f2886t = new p(this, 3);
                    }
                    p pVar = this.f2886t;
                    if (yVar.i == null) {
                        C0225i c0225i = new C0225i(yVar.j);
                        yVar.i = c0225i;
                        c0225i.e = pVar;
                        MenuC0229m menuC0229m = yVar.f2834h;
                        menuC0229m.b(c0225i, menuC0229m.f3348a);
                    }
                    C0225i c0225i2 = yVar.i;
                    x xVar2 = yVar.e;
                    if (c0225i2.f3340d == null) {
                        c0225i2.f3340d = (ExpandedMenuView) c0225i2.f3338b.inflate(com.winpower.neonfit.R.layout.abc_expanded_menu_layout, (ViewGroup) xVar2, false);
                        if (c0225i2.f3341f == null) {
                            c0225i2.f3341f = new C0224h(c0225i2);
                        }
                        c0225i2.f3340d.setAdapter((ListAdapter) c0225i2.f3341f);
                        c0225i2.f3340d.setOnItemClickListener(c0225i2);
                    }
                    ExpandedMenuView expandedMenuView = c0225i2.f3340d;
                    yVar.f2832f = expandedMenuView;
                }
                yVar.f2838n = true;
                return;
            }
            yVar.f2832f = view;
            if (yVar.f2832f != null) {
                if (yVar.f2833g == null) {
                    C0225i c0225i3 = yVar.i;
                    if (c0225i3.f3341f == null) {
                        c0225i3.f3341f = new C0224h(c0225i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = yVar.f2832f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                yVar.e.setBackgroundResource(yVar.f2829b);
                ViewParent parent = yVar.f2832f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(yVar.f2832f);
                }
                yVar.e.addView(yVar.f2832f, layoutParams2);
                if (!yVar.f2832f.hasFocus()) {
                    yVar.f2832f.requestFocus();
                }
            }
            yVar.f2838n = true;
            return;
        }
        View view2 = yVar.f2833g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            yVar.f2836l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = yVar.f2830c;
            layoutParams3.windowAnimations = yVar.f2831d;
            windowManager.addView(yVar.e, layoutParams3);
            yVar.f2837m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        yVar.f2836l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = yVar.f2830c;
        layoutParams32.windowAnimations = yVar.f2831d;
        windowManager.addView(yVar.e, layoutParams32);
        yVar.f2837m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(y yVar, int i, KeyEvent keyEvent) {
        MenuC0229m menuC0229m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((yVar.f2835k || F(yVar, keyEvent)) && (menuC0229m = yVar.f2834h) != null) {
            return menuC0229m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(y yVar, KeyEvent keyEvent) {
        InterfaceC0283k0 interfaceC0283k0;
        InterfaceC0283k0 interfaceC0283k02;
        Resources.Theme theme;
        InterfaceC0283k0 interfaceC0283k03;
        InterfaceC0283k0 interfaceC0283k04;
        if (this.f2860R) {
            return false;
        }
        if (yVar.f2835k) {
            return true;
        }
        y yVar2 = this.f2856N;
        if (yVar2 != null && yVar2 != yVar) {
            r(yVar2, false);
        }
        Window.Callback callback = this.f2878l.getCallback();
        int i = yVar.f2828a;
        if (callback != null) {
            yVar.f2833g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0283k04 = this.f2884r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0283k04;
            actionBarOverlayLayout.k();
            ((i1) actionBarOverlayLayout.e).f3645l = true;
        }
        if (yVar.f2833g == null) {
            MenuC0229m menuC0229m = yVar.f2834h;
            if (menuC0229m == null || yVar.f2839o) {
                if (menuC0229m == null) {
                    Context context = this.f2877k;
                    if ((i == 0 || i == 108) && this.f2884r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.winpower.neonfit.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.winpower.neonfit.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.winpower.neonfit.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C0206c c0206c = new C0206c(context, 0);
                            c0206c.getTheme().setTo(theme);
                            context = c0206c;
                        }
                    }
                    MenuC0229m menuC0229m2 = new MenuC0229m(context);
                    menuC0229m2.e = this;
                    MenuC0229m menuC0229m3 = yVar.f2834h;
                    if (menuC0229m2 != menuC0229m3) {
                        if (menuC0229m3 != null) {
                            menuC0229m3.r(yVar.i);
                        }
                        yVar.f2834h = menuC0229m2;
                        C0225i c0225i = yVar.i;
                        if (c0225i != null) {
                            menuC0229m2.b(c0225i, menuC0229m2.f3348a);
                        }
                    }
                    if (yVar.f2834h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0283k02 = this.f2884r) != null) {
                    if (this.f2885s == null) {
                        this.f2885s = new p(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0283k02).l(yVar.f2834h, this.f2885s);
                }
                yVar.f2834h.w();
                if (!callback.onCreatePanelMenu(i, yVar.f2834h)) {
                    MenuC0229m menuC0229m4 = yVar.f2834h;
                    if (menuC0229m4 != null) {
                        if (menuC0229m4 != null) {
                            menuC0229m4.r(yVar.i);
                        }
                        yVar.f2834h = null;
                    }
                    if (z2 && (interfaceC0283k0 = this.f2884r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0283k0).l(null, this.f2885s);
                    }
                    return false;
                }
                yVar.f2839o = false;
            }
            yVar.f2834h.w();
            Bundle bundle = yVar.f2840p;
            if (bundle != null) {
                yVar.f2834h.s(bundle);
                yVar.f2840p = null;
            }
            if (!callback.onPreparePanel(0, yVar.f2833g, yVar.f2834h)) {
                if (z2 && (interfaceC0283k03 = this.f2884r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0283k03).l(null, this.f2885s);
                }
                yVar.f2834h.v();
                return false;
            }
            yVar.f2834h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            yVar.f2834h.v();
        }
        yVar.f2835k = true;
        yVar.f2836l = false;
        this.f2856N = yVar;
        return true;
    }

    public final void G() {
        if (this.f2844A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2875g0 != null && (y(0).f2837m || this.f2887u != null)) {
                z2 = true;
            }
            if (z2 && this.f2876h0 == null) {
                this.f2876h0 = t.b(this.f2875g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2876h0) == null) {
                    return;
                }
                t.c(this.f2875g0, onBackInvokedCallback);
                this.f2876h0 = null;
            }
        }
    }

    @Override // h.n
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2877k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof z) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // m.InterfaceC0227k
    public final boolean c(MenuC0229m menuC0229m, MenuItem menuItem) {
        y yVar;
        Window.Callback callback = this.f2878l.getCallback();
        if (callback != null && !this.f2860R) {
            MenuC0229m k2 = menuC0229m.k();
            y[] yVarArr = this.f2855M;
            int length = yVarArr != null ? yVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    yVar = yVarArr[i];
                    if (yVar != null && yVar.f2834h == k2) {
                        break;
                    }
                    i++;
                } else {
                    yVar = null;
                    break;
                }
            }
            if (yVar != null) {
                return callback.onMenuItemSelected(yVar.f2828a, menuItem);
            }
        }
        return false;
    }

    @Override // h.n
    public final void d() {
        String str;
        this.f2858P = true;
        m(false, true);
        w();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = B.d.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                K k2 = this.f2881o;
                if (k2 == null) {
                    this.f2871c0 = true;
                } else {
                    k2.k0(true);
                }
            }
            synchronized (n.f2814h) {
                n.g(this);
                n.f2813g.add(new WeakReference(this));
            }
        }
        this.f2861S = new Configuration(this.f2877k.getResources().getConfiguration());
        this.f2859Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // h.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        v vVar;
        v vVar2;
        if (this.j instanceof Activity) {
            synchronized (n.f2814h) {
                n.g(this);
            }
        }
        if (this.f2868Z) {
            this.f2878l.getDecorView().removeCallbacks(this.f2870b0);
        }
        this.f2860R = true;
        if (this.f2862T != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2841i0.put(this.j.getClass().getName(), Integer.valueOf(this.f2862T));
                vVar = this.f2866X;
                if (vVar != null) {
                    vVar.c();
                }
                vVar2 = this.f2867Y;
                if (vVar2 == null) {
                    vVar2.c();
                    return;
                }
                return;
            }
        }
        f2841i0.remove(this.j.getClass().getName());
        vVar = this.f2866X;
        if (vVar != null) {
        }
        vVar2 = this.f2867Y;
        if (vVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // m.InterfaceC0227k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(MenuC0229m menuC0229m) {
        ActionMenuView actionMenuView;
        C0282k c0282k;
        C0282k c0282k2;
        C0282k c0282k3;
        InterfaceC0283k0 interfaceC0283k0 = this.f2884r;
        if (interfaceC0283k0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0283k0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((i1) actionBarOverlayLayout.e).f3637a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1793a) != null && actionMenuView.f1756s) {
                if (ViewConfiguration.get(this.f2877k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2884r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((i1) actionBarOverlayLayout2.e).f3637a.f1793a;
                    if (actionMenuView2 != null) {
                        C0282k c0282k4 = actionMenuView2.f1757t;
                        if (c0282k4 != null) {
                            if (c0282k4.f3667u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2878l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2884r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((i1) actionBarOverlayLayout3.e).f3637a.f1793a;
                if ((actionMenuView3 == null || (c0282k3 = actionMenuView3.f1757t) == null || !c0282k3.h()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2884r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((i1) actionBarOverlayLayout4.e).f3637a.f1793a;
                    if (actionMenuView4 != null && (c0282k2 = actionMenuView4.f1757t) != null) {
                        c0282k2.e();
                    }
                    if (this.f2860R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).f2834h);
                    return;
                }
                if (callback == null || this.f2860R) {
                    return;
                }
                if (this.f2868Z && (1 & this.f2869a0) != 0) {
                    View decorView = this.f2878l.getDecorView();
                    o oVar = this.f2870b0;
                    decorView.removeCallbacks(oVar);
                    oVar.run();
                }
                y y2 = y(0);
                MenuC0229m menuC0229m2 = y2.f2834h;
                if (menuC0229m2 == null || y2.f2839o || !callback.onPreparePanel(0, y2.f2833g, menuC0229m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.f2834h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2884r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((i1) actionBarOverlayLayout5.e).f3637a.f1793a;
                if (actionMenuView5 == null || (c0282k = actionMenuView5.f1757t) == null) {
                    return;
                }
                c0282k.l();
                return;
            }
        }
        y y3 = y(0);
        y3.f2838n = true;
        r(y3, false);
        D(y3, null);
    }

    @Override // h.n
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2853K && i == 108) {
            return false;
        }
        if (this.f2850G && i == 1) {
            this.f2850G = false;
        }
        if (i == 1) {
            G();
            this.f2853K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2848E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.f2849F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2851I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2850G = true;
            return true;
        }
        if (i != 109) {
            return this.f2878l.requestFeature(i);
        }
        G();
        this.H = true;
        return true;
    }

    @Override // h.n
    public final void i(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2845B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2877k).inflate(i, viewGroup);
        this.f2879m.a(this.f2878l.getCallback());
    }

    @Override // h.n
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2845B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2879m.a(this.f2878l.getCallback());
    }

    @Override // h.n
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2845B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2879m.a(this.f2878l.getCallback());
    }

    @Override // h.n
    public final void l(CharSequence charSequence) {
        this.f2883q = charSequence;
        InterfaceC0283k0 interfaceC0283k0 = this.f2884r;
        if (interfaceC0283k0 != null) {
            interfaceC0283k0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2881o;
        if (k2 == null) {
            TextView textView = this.f2846C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        i1 i1Var = (i1) k2.i;
        if (i1Var.f3642g) {
            return;
        }
        i1Var.f3643h = charSequence;
        if ((i1Var.f3638b & 8) != 0) {
            Toolbar toolbar = i1Var.f3637a;
            toolbar.setTitle(charSequence);
            if (i1Var.f3642g) {
                P.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        I.f b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f2860R) {
            return false;
        }
        int i3 = this.f2862T;
        if (i3 == -100) {
            i3 = n.f2809b;
        }
        Context context = this.f2877k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        I.f o2 = i4 < 33 ? o(context) : null;
        if (!z3 && o2 != null) {
            o2 = s.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, o2, null, false);
        boolean z5 = this.f2865W;
        Object obj = this.j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2861S;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                I.f b3 = s.b(configuration);
                b2 = o2 != null ? null : s.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2858P && ((f2843k0 || this.f2859Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new A0.b(1, activity));
                        }
                        z4 = true;
                        if (!z4 || i2 == 0) {
                            z6 = z4;
                        } else {
                            boolean z7 = (i2 & i) == i2;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (b2 != null) {
                                s.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.f2863U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2863U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.t) {
                                    if (((androidx.lifecycle.t) activity2).e().f1949d.compareTo(EnumC0078m.f1936c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2859Q && !this.f2860R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0132i)) {
                            if ((i2 & 512) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                        }
                        if (b2 != null) {
                            s.c(s.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).i();
                        } else {
                            v vVar = this.f2866X;
                            if (vVar != null) {
                                vVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2867Y == null) {
                                this.f2867Y = new v(this, context);
                            }
                            this.f2867Y.i();
                        } else {
                            v vVar2 = this.f2867Y;
                            if (vVar2 != null) {
                                vVar2.c();
                            }
                        }
                        return z6;
                    }
                }
                z4 = false;
                if (z4) {
                }
                z6 = z4;
                if (z6) {
                    if ((i2 & 512) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                }
                if (b2 != null) {
                }
                if (i3 == 0) {
                }
                if (i3 == 3) {
                }
                return z6;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f2864V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f2864V = 0;
            }
        }
        this.f2865W = true;
        i = this.f2864V;
        configuration = this.f2861S;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        I.f b32 = s.b(configuration);
        if (o2 != null) {
        }
        if (i52 == i62) {
        }
        if (b2 != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z4 = false;
        if (z4) {
        }
        z6 = z4;
        if (z6) {
        }
        if (b2 != null) {
        }
        if (i3 == 0) {
        }
        if (i3 == 3) {
        }
        return z6;
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2878l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof u) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        u uVar = new u(this, callback);
        this.f2879m = uVar;
        window.setCallback(uVar);
        int[] iArr = f2842j0;
        Context context = this.f2877k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0302u a2 = C0302u.a();
            synchronized (a2) {
                drawable = a2.f3717a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2878l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2875g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2876h0) != null) {
            t.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2876h0 = null;
        }
        Object obj = this.j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2875g0 = t.a(activity);
                H();
            }
        }
        this.f2875g0 = null;
        H();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0115, code lost:
    
        if (r2.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c0249e;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2874f0 == null) {
            int[] iArr = AbstractC0122a.j;
            Context context2 = this.f2877k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2874f0 = new D();
            } else {
                try {
                    this.f2874f0 = (D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2874f0 = new D();
                }
            }
        }
        D d2 = this.f2874f0;
        int i2 = k1.f3670a;
        d2.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0122a.f2716y, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0206c = (resourceId == 0 || ((context instanceof C0206c) && ((C0206c) context).f3191a == resourceId)) ? context : new C0206c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str2.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1455429095:
                if (str2.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1346021293:
                if (str2.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -938935918:
                if (str2.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str2.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -339785223:
                if (str2.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 776382189:
                if (str2.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 799298502:
                if (str2.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1125864064:
                if (str2.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1413872058:
                if (str2.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1601505219:
                if (str2.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1666676343:
                if (str2.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2001146706:
                if (str2.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                c0249e = new C0249E(c0206c, attributeSet);
                break;
            case 1:
                c0249e = new C0300t(c0206c, attributeSet);
                break;
            case 2:
                c0249e = new C0245A(c0206c, attributeSet);
                break;
            case 3:
                c0249e = d2.e(c0206c, attributeSet);
                break;
            case 4:
                c0249e = new C0310y(c0206c, attributeSet, com.winpower.neonfit.R.attr.imageButtonStyle);
                break;
            case 5:
                c0249e = new C0251G(c0206c, attributeSet);
                break;
            case 6:
                c0249e = new C0261Q(c0206c, attributeSet);
                break;
            case 7:
                c0249e = d2.d(c0206c, attributeSet);
                break;
            case '\b':
                c0249e = new C0279i0(c0206c, attributeSet);
                break;
            case '\t':
                c0249e = new C0312z(c0206c, attributeSet, 0);
                break;
            case '\n':
                c0249e = d2.a(c0206c, attributeSet);
                break;
            case 11:
                c0249e = d2.c(c0206c, attributeSet);
                break;
            case '\f':
                c0249e = new C0306w(c0206c, attributeSet);
                break;
            case '\r':
                c0249e = d2.b(c0206c, attributeSet);
                break;
            default:
                c0249e = null;
                break;
        }
        if (c0249e == null && context != c0206c) {
            Object[] objArr = d2.f2731a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0206c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = D.f2729g;
                        if (i3 < 3) {
                            View f2 = d2.f(c0206c, str2, strArr[i3]);
                            if (f2 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f2;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    View f3 = d2.f(c0206c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0249e = view2;
        }
        if (c0249e != null) {
            Context context3 = c0249e.getContext();
            if ((context3 instanceof ContextWrapper) && c0249e.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, D.f2726c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0249e.setOnClickListener(new C(c0249e, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0206c.obtainStyledAttributes(attributeSet, D.f2727d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = P.f711a;
                    i = 0;
                    new C0029z(com.winpower.neonfit.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(c0249e, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0206c.obtainStyledAttributes(attributeSet, D.e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    P.m(c0249e, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0206c.obtainStyledAttributes(attributeSet, D.f2728f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = P.f711a;
                    new C0029z(com.winpower.neonfit.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).f(c0249e, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0249e;
    }

    public final void p(int i, y yVar, MenuC0229m menuC0229m) {
        if (menuC0229m == null) {
            if (yVar == null && i >= 0) {
                y[] yVarArr = this.f2855M;
                if (i < yVarArr.length) {
                    yVar = yVarArr[i];
                }
            }
            if (yVar != null) {
                menuC0229m = yVar.f2834h;
            }
        }
        if ((yVar == null || yVar.f2837m) && !this.f2860R) {
            u uVar = this.f2879m;
            Window.Callback callback = this.f2878l.getCallback();
            uVar.getClass();
            try {
                uVar.f2824d = true;
                callback.onPanelClosed(i, menuC0229m);
            } finally {
                uVar.f2824d = false;
            }
        }
    }

    public final void q(MenuC0229m menuC0229m) {
        C0282k c0282k;
        if (this.f2854L) {
            return;
        }
        this.f2854L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2884r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.e).f3637a.f1793a;
        if (actionMenuView != null && (c0282k = actionMenuView.f1757t) != null) {
            c0282k.e();
            C0274g c0274g = c0282k.f3666t;
            if (c0274g != null && c0274g.b()) {
                c0274g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2878l.getCallback();
        if (callback != null && !this.f2860R) {
            callback.onPanelClosed(108, menuC0229m);
        }
        this.f2854L = false;
    }

    public final void r(y yVar, boolean z2) {
        x xVar;
        InterfaceC0283k0 interfaceC0283k0;
        C0282k c0282k;
        if (z2 && yVar.f2828a == 0 && (interfaceC0283k0 = this.f2884r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0283k0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.e).f3637a.f1793a;
            if (actionMenuView != null && (c0282k = actionMenuView.f1757t) != null && c0282k.h()) {
                q(yVar.f2834h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2877k.getSystemService("window");
        if (windowManager != null && yVar.f2837m && (xVar = yVar.e) != null) {
            windowManager.removeView(xVar);
            if (z2) {
                p(yVar.f2828a, yVar, null);
            }
        }
        yVar.f2835k = false;
        yVar.f2836l = false;
        yVar.f2837m = false;
        yVar.f2832f = null;
        yVar.f2838n = true;
        if (this.f2856N == yVar) {
            this.f2856N = null;
        }
        if (yVar.f2828a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r7.e() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        if (r7.l() != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        boolean z2;
        boolean z3;
        ActionMenuView actionMenuView;
        C0282k c0282k;
        Object obj = this.j;
        if (((obj instanceof InterfaceC0014j) || (obj instanceof B)) && (decorView = this.f2878l.getDecorView()) != null && AbstractC0058a.q(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            u uVar = this.f2879m;
            Window.Callback callback = this.f2878l.getCallback();
            uVar.getClass();
            try {
                uVar.f2823c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                uVar.f2823c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2857O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                y y2 = y(0);
                if (y2.f2837m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2887u != null) {
                    return true;
                }
                y y3 = y(0);
                InterfaceC0283k0 interfaceC0283k0 = this.f2884r;
                Context context = this.f2877k;
                if (interfaceC0283k0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0283k0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((i1) actionBarOverlayLayout.e).f3637a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1793a) != null && actionMenuView.f1756s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2884r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((i1) actionBarOverlayLayout2.e).f3637a.f1793a;
                        if (actionMenuView2 == null || (c0282k = actionMenuView2.f1757t) == null || !c0282k.h()) {
                            if (!this.f2860R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2884r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((i1) actionBarOverlayLayout3.e).f3637a.f1793a;
                                if (actionMenuView3 != null) {
                                    C0282k c0282k2 = actionMenuView3.f1757t;
                                    if (c0282k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2884r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((i1) actionBarOverlayLayout4.e).f3637a.f1793a;
                            if (actionMenuView4 != null) {
                                C0282k c0282k3 = actionMenuView4.f1757t;
                                if (c0282k3 != null) {
                                }
                            }
                            z2 = false;
                        }
                        if (z2) {
                            return true;
                        }
                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                        if (audioManager != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        return true;
                    }
                }
                boolean z4 = y3.f2837m;
                if (z4 || y3.f2836l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2835k) {
                        if (y3.f2839o) {
                            y3.f2835k = false;
                            z3 = F(y3, keyEvent);
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            D(y3, keyEvent);
                            z2 = true;
                            if (z2) {
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
        } else if (C()) {
            return true;
        }
        return false;
    }

    public final void u(int i) {
        y y2 = y(i);
        if (y2.f2834h != null) {
            Bundle bundle = new Bundle();
            y2.f2834h.t(bundle);
            if (bundle.size() > 0) {
                y2.f2840p = bundle;
            }
            y2.f2834h.w();
            y2.f2834h.clear();
        }
        y2.f2839o = true;
        y2.f2838n = true;
        if ((i == 108 || i == 0) && this.f2884r != null) {
            y y3 = y(0);
            y3.f2835k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2844A) {
            return;
        }
        int[] iArr = AbstractC0122a.j;
        Context context = this.f2877k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.f2852J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2878l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2853K) {
            viewGroup = this.f2851I ? (ViewGroup) from.inflate(com.winpower.neonfit.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.winpower.neonfit.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2852J) {
            viewGroup = (ViewGroup) from.inflate(com.winpower.neonfit.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.f2850G = false;
        } else if (this.f2850G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.winpower.neonfit.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0206c(context, typedValue.resourceId) : context).inflate(com.winpower.neonfit.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0283k0 interfaceC0283k0 = (InterfaceC0283k0) viewGroup.findViewById(com.winpower.neonfit.R.id.decor_content_parent);
            this.f2884r = interfaceC0283k0;
            interfaceC0283k0.setWindowCallback(this.f2878l.getCallback());
            if (this.H) {
                ((ActionBarOverlayLayout) this.f2884r).j(109);
            }
            if (this.f2848E) {
                ((ActionBarOverlayLayout) this.f2884r).j(2);
            }
            if (this.f2849F) {
                ((ActionBarOverlayLayout) this.f2884r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2850G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.f2852J + ", windowActionModeOverlay: " + this.f2851I + ", windowNoTitle: " + this.f2853K + " }");
        }
        p pVar = new p(this, i2);
        WeakHashMap weakHashMap = P.f711a;
        M.E.u(viewGroup, pVar);
        if (this.f2884r == null) {
            this.f2846C = (TextView) viewGroup.findViewById(com.winpower.neonfit.R.id.title);
        }
        boolean z2 = n1.f3683a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.winpower.neonfit.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2878l.findViewById(R.id.content);
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
        this.f2878l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new p(this, i));
        this.f2845B = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2883q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0283k0 interfaceC0283k02 = this.f2884r;
            if (interfaceC0283k02 != null) {
                interfaceC0283k02.setWindowTitle(title);
            } else {
                K k2 = this.f2881o;
                if (k2 != null) {
                    i1 i1Var = (i1) k2.i;
                    if (!i1Var.f3642g) {
                        i1Var.f3643h = title;
                        if ((i1Var.f3638b & 8) != 0) {
                            Toolbar toolbar = i1Var.f3637a;
                            toolbar.setTitle(title);
                            if (i1Var.f3642g) {
                                P.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2846C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2845B.findViewById(R.id.content);
        View decorView = this.f2878l.getDecorView();
        contentFrameLayout2.f1773g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f2844A = true;
        y y2 = y(0);
        if (this.f2860R || y2.f2834h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2878l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f2878l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0043g x(Context context) {
        if (this.f2866X == null) {
            if (I0.h.e == null) {
                Context applicationContext = context.getApplicationContext();
                I0.h.e = new I0.h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2866X = new v(this, I0.h.e);
        }
        return this.f2866X;
    }

    public final y y(int i) {
        y[] yVarArr = this.f2855M;
        if (yVarArr == null || yVarArr.length <= i) {
            y[] yVarArr2 = new y[i + 1];
            if (yVarArr != null) {
                System.arraycopy(yVarArr, 0, yVarArr2, 0, yVarArr.length);
            }
            this.f2855M = yVarArr2;
            yVarArr = yVarArr2;
        }
        y yVar = yVarArr[i];
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y();
        yVar2.f2828a = i;
        yVar2.f2838n = false;
        yVarArr[i] = yVar2;
        return yVar2;
    }

    public final void z() {
        v();
        if (this.f2850G && this.f2881o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.f2881o = new K((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.f2881o = new K((Dialog) obj);
            }
            K k2 = this.f2881o;
            if (k2 != null) {
                k2.k0(this.f2871c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
