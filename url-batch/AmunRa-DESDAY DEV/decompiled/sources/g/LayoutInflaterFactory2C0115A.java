package g;

import K.C0011l;
import K.InterfaceC0010k;
import K.S;
import K.Z;
import X.AbstractC0038g;
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
import androidx.lifecycle.EnumC0071m;
import j.AbstractC0138a;
import j.C0140c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0153h;
import k.C0154i;
import k.C0160o;
import k.InterfaceC0156k;
import k.MenuC0158m;
import l.C0185A;
import l.C0186B;
import l.C0190F;
import l.C0192H;
import l.C0202S;
import l.C0215g;
import l.C0222j0;
import l.C0223k;
import l.C0241t;
import l.C0245v;
import l.C0249x;
import l.C0253z;
import l.InterfaceC0226l0;
import l.InterfaceC0228m0;
import l.Y0;
import l.d1;
import l.f1;
import l.i1;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0115A extends o implements InterfaceC0156k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final o.k f2260i0 = new o.k();
    public static final int[] j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2261k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2262A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2263B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2264C;

    /* renamed from: D, reason: collision with root package name */
    public View f2265D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2266E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2267G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2268H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2269I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2270J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2271K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2272L;

    /* renamed from: M, reason: collision with root package name */
    public z[] f2273M;

    /* renamed from: N, reason: collision with root package name */
    public z f2274N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2275O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2276P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2277Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2278R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2279S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2280T;

    /* renamed from: U, reason: collision with root package name */
    public int f2281U;

    /* renamed from: V, reason: collision with root package name */
    public int f2282V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2283W;

    /* renamed from: X, reason: collision with root package name */
    public w f2284X;

    /* renamed from: Y, reason: collision with root package name */
    public w f2285Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2286Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2287a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2289c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2290d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2291e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0118D f2292f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2293g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2294h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2295j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2296k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2297l;

    /* renamed from: m, reason: collision with root package name */
    public v f2298m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2299n;

    /* renamed from: o, reason: collision with root package name */
    public K f2300o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2301p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2302q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0226l0 f2303r;

    /* renamed from: s, reason: collision with root package name */
    public q f2304s;

    /* renamed from: t, reason: collision with root package name */
    public q f2305t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0138a f2306u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2307v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2308w;

    /* renamed from: x, reason: collision with root package name */
    public p f2309x;

    /* renamed from: y, reason: collision with root package name */
    public Z f2310y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2311z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final p f2288b0 = new p(this, 0);

    public LayoutInflaterFactory2C0115A(Context context, Window window, InterfaceC0132j interfaceC0132j, Object obj) {
        AbstractActivityC0131i abstractActivityC0131i;
        this.f2280T = -100;
        this.f2296k = context;
        this.f2295j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0131i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0131i = (AbstractActivityC0131i) context;
                    break;
                }
            }
            abstractActivityC0131i = null;
            if (abstractActivityC0131i != null) {
                this.f2280T = ((LayoutInflaterFactory2C0115A) abstractActivityC0131i.l()).f2280T;
            }
        }
        if (this.f2280T == -100) {
            o.k kVar = f2260i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2295j.getClass().getName(), null);
            if (num != null) {
                this.f2280T = num.intValue();
                kVar.remove(this.f2295j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0245v.d();
    }

    public static G.f o(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.f2403c) == null) {
            return null;
        }
        G.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f185a;
        if (gVar.f186a.isEmpty()) {
            fVar2 = G.f.f184b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f185a.f186a.size() + gVar.f186a.size()) {
                Locale locale = i < gVar.f186a.size() ? gVar.f186a.get(i) : b2.f185a.f186a.get(i - gVar.f186a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f185a.f186a.isEmpty() ? b2 : fVar2;
    }

    public static Configuration s(Context context, int i, G.f fVar, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            t.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f2287a0 = (1 << i) | this.f2287a0;
        if (this.f2286Z) {
            return;
        }
        View decorView = this.f2297l.getDecorView();
        p pVar = this.f2288b0;
        WeakHashMap weakHashMap = S.f362a;
        decorView.postOnAnimation(pVar);
        this.f2286Z = true;
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
                if (this.f2285Y == null) {
                    this.f2285Y = new w(this, context);
                }
                return this.f2285Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0228m0 interfaceC0228m0;
        Y0 y0;
        boolean z2 = this.f2275O;
        this.f2275O = false;
        z y2 = y(0);
        if (y2.f2429m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0138a abstractC0138a = this.f2306u;
        if (abstractC0138a != null) {
            abstractC0138a.a();
            return true;
        }
        z();
        K k2 = this.f2300o;
        if (k2 == null || (interfaceC0228m0 = k2.f2342l) == null || (y0 = ((d1) interfaceC0228m0).f3052a.f1253L) == null || y0.f3021b == null) {
            return false;
        }
        Y0 y02 = ((d1) interfaceC0228m0).f3052a.f1253L;
        C0160o c0160o = y02 == null ? null : y02.f3021b;
        if (c0160o != null) {
            c0160o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2595f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(z zVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (zVar.f2429m || this.f2278R) {
            return;
        }
        int i2 = zVar.f2420a;
        Context context = this.f2296k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2297l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, zVar.h)) {
            r(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f2423e;
        if (yVar == null || zVar.f2430n) {
            if (yVar == null) {
                z();
                K k2 = this.f2300o;
                Context l02 = k2 != null ? k2.l0() : null;
                if (l02 != null) {
                    context = l02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.visualfortune.eyerest.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.visualfortune.eyerest.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.visualfortune.eyerest.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0140c c0140c = new C0140c(context, 0);
                c0140c.getTheme().setTo(newTheme);
                zVar.f2426j = c0140c;
                TypedArray obtainStyledAttributes = c0140c.obtainStyledAttributes(f.a.f1995j);
                zVar.f2421b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f2423e = new y(this, zVar.f2426j);
                zVar.f2422c = 81;
            } else if (zVar.f2430n && yVar.getChildCount() > 0) {
                zVar.f2423e.removeAllViews();
            }
            View view = zVar.f2425g;
            if (view == null) {
                if (zVar.h != null) {
                    if (this.f2305t == null) {
                        this.f2305t = new q(this, 3);
                    }
                    q qVar = this.f2305t;
                    if (zVar.i == null) {
                        C0154i c0154i = new C0154i(zVar.f2426j);
                        zVar.i = c0154i;
                        c0154i.f2594e = qVar;
                        MenuC0158m menuC0158m = zVar.h;
                        menuC0158m.b(c0154i, menuC0158m.f2602a);
                    }
                    C0154i c0154i2 = zVar.i;
                    y yVar2 = zVar.f2423e;
                    if (c0154i2.d == null) {
                        c0154i2.d = (ExpandedMenuView) c0154i2.f2592b.inflate(com.visualfortune.eyerest.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c0154i2.f2595f == null) {
                            c0154i2.f2595f = new C0153h(c0154i2);
                        }
                        c0154i2.d.setAdapter((ListAdapter) c0154i2.f2595f);
                        c0154i2.d.setOnItemClickListener(c0154i2);
                    }
                    ExpandedMenuView expandedMenuView = c0154i2.d;
                    zVar.f2424f = expandedMenuView;
                }
                zVar.f2430n = true;
                return;
            }
            zVar.f2424f = view;
            if (zVar.f2424f != null) {
                if (zVar.f2425g == null) {
                    C0154i c0154i3 = zVar.i;
                    if (c0154i3.f2595f == null) {
                        c0154i3.f2595f = new C0153h(c0154i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f2424f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f2423e.setBackgroundResource(zVar.f2421b);
                ViewParent parent = zVar.f2424f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f2424f);
                }
                zVar.f2423e.addView(zVar.f2424f, layoutParams2);
                if (!zVar.f2424f.hasFocus()) {
                    zVar.f2424f.requestFocus();
                }
            }
            zVar.f2430n = true;
            return;
        }
        View view2 = zVar.f2425g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f2428l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f2422c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f2423e, layoutParams3);
            zVar.f2429m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f2428l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f2422c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f2423e, layoutParams32);
        zVar.f2429m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        MenuC0158m menuC0158m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f2427k || F(zVar, keyEvent)) && (menuC0158m = zVar.h) != null) {
            return menuC0158m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(z zVar, KeyEvent keyEvent) {
        InterfaceC0226l0 interfaceC0226l0;
        InterfaceC0226l0 interfaceC0226l02;
        Resources.Theme theme;
        InterfaceC0226l0 interfaceC0226l03;
        InterfaceC0226l0 interfaceC0226l04;
        if (this.f2278R) {
            return false;
        }
        if (zVar.f2427k) {
            return true;
        }
        z zVar2 = this.f2274N;
        if (zVar2 != null && zVar2 != zVar) {
            r(zVar2, false);
        }
        Window.Callback callback = this.f2297l.getCallback();
        int i = zVar.f2420a;
        if (callback != null) {
            zVar.f2425g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0226l04 = this.f2303r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0226l04;
            actionBarOverlayLayout.k();
            ((d1) actionBarOverlayLayout.f1199e).f3060l = true;
        }
        if (zVar.f2425g == null) {
            MenuC0158m menuC0158m = zVar.h;
            if (menuC0158m == null || zVar.f2431o) {
                if (menuC0158m == null) {
                    Context context = this.f2296k;
                    if ((i == 0 || i == 108) && this.f2303r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.visualfortune.eyerest.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.visualfortune.eyerest.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.visualfortune.eyerest.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0140c c0140c = new C0140c(context, 0);
                            c0140c.getTheme().setTo(theme);
                            context = c0140c;
                        }
                    }
                    MenuC0158m menuC0158m2 = new MenuC0158m(context);
                    menuC0158m2.f2605e = this;
                    MenuC0158m menuC0158m3 = zVar.h;
                    if (menuC0158m2 != menuC0158m3) {
                        if (menuC0158m3 != null) {
                            menuC0158m3.r(zVar.i);
                        }
                        zVar.h = menuC0158m2;
                        C0154i c0154i = zVar.i;
                        if (c0154i != null) {
                            menuC0158m2.b(c0154i, menuC0158m2.f2602a);
                        }
                    }
                    if (zVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0226l02 = this.f2303r) != null) {
                    if (this.f2304s == null) {
                        this.f2304s = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0226l02).l(zVar.h, this.f2304s);
                }
                zVar.h.w();
                if (!callback.onCreatePanelMenu(i, zVar.h)) {
                    MenuC0158m menuC0158m4 = zVar.h;
                    if (menuC0158m4 != null) {
                        if (menuC0158m4 != null) {
                            menuC0158m4.r(zVar.i);
                        }
                        zVar.h = null;
                    }
                    if (z2 && (interfaceC0226l0 = this.f2303r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0226l0).l(null, this.f2304s);
                    }
                    return false;
                }
                zVar.f2431o = false;
            }
            zVar.h.w();
            Bundle bundle = zVar.f2432p;
            if (bundle != null) {
                zVar.h.s(bundle);
                zVar.f2432p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f2425g, zVar.h)) {
                if (z2 && (interfaceC0226l03 = this.f2303r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0226l03).l(null, this.f2304s);
                }
                zVar.h.v();
                return false;
            }
            zVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            zVar.h.v();
        }
        zVar.f2427k = true;
        zVar.f2428l = false;
        this.f2274N = zVar;
        return true;
    }

    public final void G() {
        if (this.f2262A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2293g0 != null && (y(0).f2429m || this.f2306u != null)) {
                z2 = true;
            }
            if (z2 && this.f2294h0 == null) {
                this.f2294h0 = u.b(this.f2293g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2294h0) == null) {
                    return;
                }
                u.c(this.f2293g0, onBackInvokedCallback);
                this.f2294h0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2296k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0115A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.o
    public final void c() {
        String str;
        this.f2276P = true;
        m(false, true);
        w();
        Object obj = this.f2295j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = z.c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                K k2 = this.f2300o;
                if (k2 == null) {
                    this.f2289c0 = true;
                } else {
                    k2.n0(true);
                }
            }
            synchronized (o.h) {
                o.g(this);
                o.f2406g.add(new WeakReference(this));
            }
        }
        this.f2279S = new Configuration(this.f2296k.getResources().getConfiguration());
        this.f2277Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // g.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        w wVar;
        w wVar2;
        if (this.f2295j instanceof Activity) {
            synchronized (o.h) {
                o.g(this);
            }
        }
        if (this.f2286Z) {
            this.f2297l.getDecorView().removeCallbacks(this.f2288b0);
        }
        this.f2278R = true;
        if (this.f2280T != -100) {
            Object obj = this.f2295j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2260i0.put(this.f2295j.getClass().getName(), Integer.valueOf(this.f2280T));
                wVar = this.f2284X;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.f2285Y;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f2260i0.remove(this.f2295j.getClass().getName());
        wVar = this.f2284X;
        if (wVar != null) {
        }
        wVar2 = this.f2285Y;
        if (wVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0156k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MenuC0158m menuC0158m) {
        ActionMenuView actionMenuView;
        C0223k c0223k;
        C0223k c0223k2;
        C0223k c0223k3;
        InterfaceC0226l0 interfaceC0226l0 = this.f2303r;
        if (interfaceC0226l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0226l0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((d1) actionBarOverlayLayout.f1199e).f3052a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1259a) != null && actionMenuView.f1222s) {
                if (ViewConfiguration.get(this.f2296k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2303r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout2.f1199e).f3052a.f1259a;
                    if (actionMenuView2 != null) {
                        C0223k c0223k4 = actionMenuView2.f1223t;
                        if (c0223k4 != null) {
                            if (c0223k4.f3103u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2297l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2303r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((d1) actionBarOverlayLayout3.f1199e).f3052a.f1259a;
                if ((actionMenuView3 == null || (c0223k3 = actionMenuView3.f1223t) == null || !c0223k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2303r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((d1) actionBarOverlayLayout4.f1199e).f3052a.f1259a;
                    if (actionMenuView4 != null && (c0223k2 = actionMenuView4.f1223t) != null) {
                        c0223k2.f();
                    }
                    if (this.f2278R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2278R) {
                    return;
                }
                if (this.f2286Z && (1 & this.f2287a0) != 0) {
                    View decorView = this.f2297l.getDecorView();
                    p pVar = this.f2288b0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z y2 = y(0);
                MenuC0158m menuC0158m2 = y2.h;
                if (menuC0158m2 == null || y2.f2431o || !callback.onPreparePanel(0, y2.f2425g, menuC0158m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2303r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((d1) actionBarOverlayLayout5.f1199e).f3052a.f1259a;
                if (actionMenuView5 == null || (c0223k = actionMenuView5.f1223t) == null) {
                    return;
                }
                c0223k.l();
                return;
            }
        }
        z y3 = y(0);
        y3.f2430n = true;
        r(y3, false);
        D(y3, null);
    }

    @Override // k.InterfaceC0156k
    public final boolean f(MenuC0158m menuC0158m, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f2297l.getCallback();
        if (callback != null && !this.f2278R) {
            MenuC0158m k2 = menuC0158m.k();
            z[] zVarArr = this.f2273M;
            int length = zVarArr != null ? zVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    zVar = zVarArr[i];
                    if (zVar != null && zVar.h == k2) {
                        break;
                    }
                    i++;
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f2420a, menuItem);
            }
        }
        return false;
    }

    @Override // g.o
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2271K && i == 108) {
            return false;
        }
        if (this.f2267G && i == 1) {
            this.f2267G = false;
        }
        if (i == 1) {
            G();
            this.f2271K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2266E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2269I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2267G = true;
            return true;
        }
        if (i != 109) {
            return this.f2297l.requestFeature(i);
        }
        G();
        this.f2268H = true;
        return true;
    }

    @Override // g.o
    public final void i(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2263B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2296k).inflate(i, viewGroup);
        this.f2298m.a(this.f2297l.getCallback());
    }

    @Override // g.o
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2263B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2298m.a(this.f2297l.getCallback());
    }

    @Override // g.o
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2263B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2298m.a(this.f2297l.getCallback());
    }

    @Override // g.o
    public final void l(CharSequence charSequence) {
        this.f2302q = charSequence;
        InterfaceC0226l0 interfaceC0226l0 = this.f2303r;
        if (interfaceC0226l0 != null) {
            interfaceC0226l0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2300o;
        if (k2 == null) {
            TextView textView = this.f2264C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        d1 d1Var = (d1) k2.f2342l;
        if (d1Var.f3057g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f3053b & 8) != 0) {
            Toolbar toolbar = d1Var.f3052a;
            toolbar.setTitle(charSequence);
            if (d1Var.f3057g) {
                S.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        G.f b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f2278R) {
            return false;
        }
        int i3 = this.f2280T;
        if (i3 == -100) {
            i3 = o.f2402b;
        }
        Context context = this.f2296k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f o2 = i4 < 33 ? o(context) : null;
        if (!z3 && o2 != null) {
            o2 = t.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, o2, null, false);
        boolean z5 = this.f2283W;
        Object obj = this.f2295j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2279S;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                G.f b3 = t.b(configuration);
                b2 = o2 != null ? null : t.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2276P && ((f2261k0 || this.f2277Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new C0.p(13, activity));
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
                                t.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.f2281U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2281U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).d().f1406c.compareTo(EnumC0071m.f1398c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2277Q && !this.f2278R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0131i)) {
                            if ((i2 & 512) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                        }
                        if (b2 != null) {
                            t.c(t.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).i();
                        } else {
                            w wVar = this.f2284X;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2285Y == null) {
                                this.f2285Y = new w(this, context);
                            }
                            this.f2285Y.i();
                        } else {
                            w wVar2 = this.f2285Y;
                            if (wVar2 != null) {
                                wVar2.c();
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
                    this.f2282V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2282V = 0;
            }
        }
        this.f2283W = true;
        i = this.f2282V;
        configuration = this.f2279S;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        G.f b32 = t.b(configuration);
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
        if (this.f2297l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f2298m = vVar;
        window.setCallback(vVar);
        int[] iArr = j0;
        Context context = this.f2296k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0245v a2 = C0245v.a();
            synchronized (a2) {
                drawable = a2.f3153a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2297l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2293g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2294h0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2294h0 = null;
        }
        Object obj = this.f2295j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2293g0 = u.a(activity);
                H();
            }
        }
        this.f2293g0 = null;
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
        View c0190f;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2292f0 == null) {
            int[] iArr = f.a.f1995j;
            Context context2 = this.f2296k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2292f0 = new C0118D();
            } else {
                try {
                    this.f2292f0 = (C0118D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2292f0 = new C0118D();
                }
            }
        }
        C0118D c0118d = this.f2292f0;
        int i2 = f1.f3064a;
        c0118d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2009x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0140c = (resourceId == 0 || ((context instanceof C0140c) && ((C0140c) context).f2471a == resourceId)) ? context : new C0140c(context, resourceId);
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
                c0190f = new C0190F(c0140c, attributeSet);
                break;
            case 1:
                c0190f = new C0241t(c0140c, attributeSet);
                break;
            case 2:
                c0190f = new C0186B(c0140c, attributeSet);
                break;
            case 3:
                c0190f = c0118d.e(c0140c, attributeSet);
                break;
            case 4:
                c0190f = new C0253z(c0140c, attributeSet, com.visualfortune.eyerest.R.attr.imageButtonStyle);
                break;
            case 5:
                c0190f = new C0192H(c0140c, attributeSet);
                break;
            case 6:
                c0190f = new C0202S(c0140c, attributeSet);
                break;
            case 7:
                c0190f = c0118d.d(c0140c, attributeSet);
                break;
            case '\b':
                c0190f = new C0222j0(c0140c, attributeSet);
                break;
            case '\t':
                c0190f = new C0185A(c0140c, attributeSet, 0);
                break;
            case '\n':
                c0190f = c0118d.a(c0140c, attributeSet);
                break;
            case 11:
                c0190f = c0118d.c(c0140c, attributeSet);
                break;
            case '\f':
                c0190f = new C0249x(c0140c, attributeSet);
                break;
            case '\r':
                c0190f = c0118d.b(c0140c, attributeSet);
                break;
            default:
                c0190f = null;
                break;
        }
        if (c0190f == null && context != c0140c) {
            Object[] objArr = c0118d.f2321a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0140c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0118D.f2320g;
                        if (i3 < 3) {
                            View f2 = c0118d.f(c0140c, str2, strArr[i3]);
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
                    View f3 = c0118d.f(c0140c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0190f = view2;
        }
        if (c0190f != null) {
            Context context3 = c0190f.getContext();
            if ((context3 instanceof ContextWrapper) && c0190f.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0118D.f2317c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0190f.setOnClickListener(new ViewOnClickListenerC0117C(c0190f, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0140c.obtainStyledAttributes(attributeSet, C0118D.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = S.f362a;
                    i = 0;
                    new K.B(com.visualfortune.eyerest.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0190f, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0140c.obtainStyledAttributes(attributeSet, C0118D.f2318e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    S.m(c0190f, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0140c.obtainStyledAttributes(attributeSet, C0118D.f2319f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = S.f362a;
                    new K.B(com.visualfortune.eyerest.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0190f, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0190f;
    }

    public final void p(int i, z zVar, MenuC0158m menuC0158m) {
        if (menuC0158m == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f2273M;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                menuC0158m = zVar.h;
            }
        }
        if ((zVar == null || zVar.f2429m) && !this.f2278R) {
            v vVar = this.f2298m;
            Window.Callback callback = this.f2297l.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i, menuC0158m);
            } finally {
                vVar.d = false;
            }
        }
    }

    public final void q(MenuC0158m menuC0158m) {
        C0223k c0223k;
        if (this.f2272L) {
            return;
        }
        this.f2272L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2303r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1199e).f3052a.f1259a;
        if (actionMenuView != null && (c0223k = actionMenuView.f1223t) != null) {
            c0223k.f();
            C0215g c0215g = c0223k.f3102t;
            if (c0215g != null && c0215g.b()) {
                c0215g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2297l.getCallback();
        if (callback != null && !this.f2278R) {
            callback.onPanelClosed(108, menuC0158m);
        }
        this.f2272L = false;
    }

    public final void r(z zVar, boolean z2) {
        y yVar;
        InterfaceC0226l0 interfaceC0226l0;
        C0223k c0223k;
        if (z2 && zVar.f2420a == 0 && (interfaceC0226l0 = this.f2303r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0226l0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1199e).f3052a.f1259a;
            if (actionMenuView != null && (c0223k = actionMenuView.f1223t) != null && c0223k.i()) {
                q(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2296k.getSystemService("window");
        if (windowManager != null && zVar.f2429m && (yVar = zVar.f2423e) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                p(zVar.f2420a, zVar, null);
            }
        }
        zVar.f2427k = false;
        zVar.f2428l = false;
        zVar.f2429m = false;
        zVar.f2424f = null;
        zVar.f2430n = true;
        if (this.f2274N == zVar) {
            this.f2274N = null;
        }
        if (zVar.f2420a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r7.f() != false) goto L90;
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
        C0223k c0223k;
        Object obj = this.f2295j;
        if (((obj instanceof InterfaceC0010k) || (obj instanceof DialogInterfaceC0128f)) && (decorView = this.f2297l.getDecorView()) != null && s1.l.v(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            v vVar = this.f2298m;
            Window.Callback callback = this.f2297l.getCallback();
            vVar.getClass();
            try {
                vVar.f2415c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                vVar.f2415c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2275O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                z y2 = y(0);
                if (y2.f2429m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2306u != null) {
                    return true;
                }
                z y3 = y(0);
                InterfaceC0226l0 interfaceC0226l0 = this.f2303r;
                Context context = this.f2296k;
                if (interfaceC0226l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0226l0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((d1) actionBarOverlayLayout.f1199e).f3052a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1259a) != null && actionMenuView.f1222s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2303r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout2.f1199e).f3052a.f1259a;
                        if (actionMenuView2 == null || (c0223k = actionMenuView2.f1223t) == null || !c0223k.i()) {
                            if (!this.f2278R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2303r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((d1) actionBarOverlayLayout3.f1199e).f3052a.f1259a;
                                if (actionMenuView3 != null) {
                                    C0223k c0223k2 = actionMenuView3.f1223t;
                                    if (c0223k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2303r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((d1) actionBarOverlayLayout4.f1199e).f3052a.f1259a;
                            if (actionMenuView4 != null) {
                                C0223k c0223k3 = actionMenuView4.f1223t;
                                if (c0223k3 != null) {
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
                boolean z4 = y3.f2429m;
                if (z4 || y3.f2428l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2427k) {
                        if (y3.f2431o) {
                            y3.f2427k = false;
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
        z y2 = y(i);
        if (y2.h != null) {
            Bundle bundle = new Bundle();
            y2.h.t(bundle);
            if (bundle.size() > 0) {
                y2.f2432p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2431o = true;
        y2.f2430n = true;
        if ((i == 108 || i == 0) && this.f2303r != null) {
            z y3 = y(0);
            y3.f2427k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2262A) {
            return;
        }
        int[] iArr = f.a.f1995j;
        Context context = this.f2296k;
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
        this.f2270J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2297l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2271K) {
            viewGroup = this.f2269I ? (ViewGroup) from.inflate(com.visualfortune.eyerest.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.visualfortune.eyerest.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2270J) {
            viewGroup = (ViewGroup) from.inflate(com.visualfortune.eyerest.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2268H = false;
            this.f2267G = false;
        } else if (this.f2267G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.visualfortune.eyerest.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0140c(context, typedValue.resourceId) : context).inflate(com.visualfortune.eyerest.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0226l0 interfaceC0226l0 = (InterfaceC0226l0) viewGroup.findViewById(com.visualfortune.eyerest.R.id.decor_content_parent);
            this.f2303r = interfaceC0226l0;
            interfaceC0226l0.setWindowCallback(this.f2297l.getCallback());
            if (this.f2268H) {
                ((ActionBarOverlayLayout) this.f2303r).j(109);
            }
            if (this.f2266E) {
                ((ActionBarOverlayLayout) this.f2303r).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.f2303r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2267G + ", windowActionBarOverlay: " + this.f2268H + ", android:windowIsFloating: " + this.f2270J + ", windowActionModeOverlay: " + this.f2269I + ", windowNoTitle: " + this.f2271K + " }");
        }
        q qVar = new q(this, i2);
        WeakHashMap weakHashMap = S.f362a;
        K.G.u(viewGroup, qVar);
        if (this.f2303r == null) {
            this.f2264C = (TextView) viewGroup.findViewById(com.visualfortune.eyerest.R.id.title);
        }
        boolean z2 = i1.f3080a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.visualfortune.eyerest.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2297l.findViewById(R.id.content);
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
        this.f2297l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i));
        this.f2263B = viewGroup;
        Object obj = this.f2295j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2302q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0226l0 interfaceC0226l02 = this.f2303r;
            if (interfaceC0226l02 != null) {
                interfaceC0226l02.setWindowTitle(title);
            } else {
                K k2 = this.f2300o;
                if (k2 != null) {
                    d1 d1Var = (d1) k2.f2342l;
                    if (!d1Var.f3057g) {
                        d1Var.h = title;
                        if ((d1Var.f3053b & 8) != 0) {
                            Toolbar toolbar = d1Var.f3052a;
                            toolbar.setTitle(title);
                            if (d1Var.f3057g) {
                                S.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2264C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2263B.findViewById(R.id.content);
        View decorView = this.f2297l.getDecorView();
        contentFrameLayout2.f1239g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2262A = true;
        z y2 = y(0);
        if (this.f2278R || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2297l == null) {
            Object obj = this.f2295j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f2297l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0038g x(Context context) {
        if (this.f2284X == null) {
            if (C0011l.f413e == null) {
                Context applicationContext = context.getApplicationContext();
                C0011l.f413e = new C0011l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2284X = new w(this, C0011l.f413e);
        }
        return this.f2284X;
    }

    public final z y(int i) {
        z[] zVarArr = this.f2273M;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f2273M = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f2420a = i;
        zVar2.f2430n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void z() {
        v();
        if (this.f2267G && this.f2300o == null) {
            Object obj = this.f2295j;
            if (obj instanceof Activity) {
                this.f2300o = new K((Activity) obj, this.f2268H);
            } else if (obj instanceof Dialog) {
                this.f2300o = new K((Dialog) obj);
            }
            K k2 = this.f2300o;
            if (k2 != null) {
                k2.n0(this.f2289c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
