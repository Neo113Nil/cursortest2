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
import androidx.lifecycle.EnumC0073m;
import j.AbstractC0140a;
import j.C0142c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0156h;
import k.C0157i;
import k.C0163o;
import k.InterfaceC0159k;
import k.MenuC0161m;
import l.C0188A;
import l.C0192E;
import l.C0194G;
import l.C0204Q;
import l.C0218g;
import l.C0225j0;
import l.C0226k;
import l.C0242s;
import l.C0246u;
import l.C0250w;
import l.C0254y;
import l.C0256z;
import l.InterfaceC0229l0;
import l.InterfaceC0231m0;
import l.Z0;
import l.e1;
import l.g1;
import l.j1;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0117A extends o implements InterfaceC0159k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final o.k f2260i0 = new o.k();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f2261j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2262k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2263A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2264B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2265C;

    /* renamed from: D, reason: collision with root package name */
    public View f2266D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2267E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2268G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2269H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2270I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2271J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2272K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2273L;

    /* renamed from: M, reason: collision with root package name */
    public z[] f2274M;

    /* renamed from: N, reason: collision with root package name */
    public z f2275N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2276O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2277P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2278Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2279R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2280S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2281T;

    /* renamed from: U, reason: collision with root package name */
    public int f2282U;

    /* renamed from: V, reason: collision with root package name */
    public int f2283V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2284W;

    /* renamed from: X, reason: collision with root package name */
    public w f2285X;

    /* renamed from: Y, reason: collision with root package name */
    public w f2286Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2287Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2288a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2290c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2291d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2292e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0120D f2293f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2294g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2295h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2296j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2297k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2298l;

    /* renamed from: m, reason: collision with root package name */
    public v f2299m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2300n;

    /* renamed from: o, reason: collision with root package name */
    public K f2301o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2302p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2303q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0229l0 f2304r;

    /* renamed from: s, reason: collision with root package name */
    public q f2305s;

    /* renamed from: t, reason: collision with root package name */
    public q f2306t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0140a f2307u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2308v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2309w;

    /* renamed from: x, reason: collision with root package name */
    public p f2310x;

    /* renamed from: y, reason: collision with root package name */
    public Z f2311y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2312z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final p f2289b0 = new p(this, 0);

    public LayoutInflaterFactory2C0117A(Context context, Window window, InterfaceC0134j interfaceC0134j, Object obj) {
        AbstractActivityC0133i abstractActivityC0133i;
        this.f2281T = -100;
        this.f2297k = context;
        this.f2296j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0133i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0133i = (AbstractActivityC0133i) context;
                    break;
                }
            }
            abstractActivityC0133i = null;
            if (abstractActivityC0133i != null) {
                this.f2281T = ((LayoutInflaterFactory2C0117A) abstractActivityC0133i.l()).f2281T;
            }
        }
        if (this.f2281T == -100) {
            o.k kVar = f2260i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2296j.getClass().getName(), null);
            if (num != null) {
                this.f2281T = num.intValue();
                kVar.remove(this.f2296j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        C0246u.d();
    }

    public static G.f m(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.f2404c) == null) {
            return null;
        }
        G.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f192a;
        if (gVar.f193a.isEmpty()) {
            fVar2 = G.f.f191b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f192a.f193a.size() + gVar.f193a.size()) {
                Locale locale = i < gVar.f193a.size() ? gVar.f193a.get(i) : b2.f192a.f193a.get(i - gVar.f193a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f192a.f193a.isEmpty() ? b2 : fVar2;
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
        this.f2288a0 = (1 << i) | this.f2288a0;
        if (this.f2287Z) {
            return;
        }
        View decorView = this.f2298l.getDecorView();
        p pVar = this.f2289b0;
        WeakHashMap weakHashMap = S.f369a;
        decorView.postOnAnimation(pVar);
        this.f2287Z = true;
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
                if (this.f2286Y == null) {
                    this.f2286Y = new w(this, context);
                }
                return this.f2286Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0231m0 interfaceC0231m0;
        Z0 z02;
        boolean z2 = this.f2276O;
        this.f2276O = false;
        z y2 = y(0);
        if (y2.f2430m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0140a abstractC0140a = this.f2307u;
        if (abstractC0140a != null) {
            abstractC0140a.a();
            return true;
        }
        z();
        K k2 = this.f2301o;
        if (k2 == null || (interfaceC0231m0 = k2.f2340e) == null || (z02 = ((e1) interfaceC0231m0).f2906a.f1278L) == null || z02.f2884b == null) {
            return false;
        }
        Z0 z03 = ((e1) interfaceC0231m0).f2906a.f1278L;
        C0163o c0163o = z03 == null ? null : z03.f2884b;
        if (c0163o != null) {
            c0163o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2605f.getCount() > 0) goto L88;
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
        if (zVar.f2430m || this.f2279R) {
            return;
        }
        int i2 = zVar.f2421a;
        Context context = this.f2297k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2298l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, zVar.h)) {
            r(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f2424e;
        if (yVar == null || zVar.f2431n) {
            if (yVar == null) {
                z();
                K k2 = this.f2301o;
                Context v02 = k2 != null ? k2.v0() : null;
                if (v02 != null) {
                    context = v02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.playgen.securelock.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.playgen.securelock.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.playgen.securelock.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0142c c0142c = new C0142c(context, 0);
                c0142c.getTheme().setTo(newTheme);
                zVar.f2427j = c0142c;
                TypedArray obtainStyledAttributes = c0142c.obtainStyledAttributes(f.a.f1996j);
                zVar.f2422b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f2424e = new y(this, zVar.f2427j);
                zVar.f2423c = 81;
            } else if (zVar.f2431n && yVar.getChildCount() > 0) {
                zVar.f2424e.removeAllViews();
            }
            View view = zVar.f2426g;
            if (view == null) {
                if (zVar.h != null) {
                    if (this.f2306t == null) {
                        this.f2306t = new q(this, 3);
                    }
                    q qVar = this.f2306t;
                    if (zVar.i == null) {
                        C0157i c0157i = new C0157i(zVar.f2427j);
                        zVar.i = c0157i;
                        c0157i.f2604e = qVar;
                        MenuC0161m menuC0161m = zVar.h;
                        menuC0161m.b(c0157i, menuC0161m.f2612a);
                    }
                    C0157i c0157i2 = zVar.i;
                    y yVar2 = zVar.f2424e;
                    if (c0157i2.d == null) {
                        c0157i2.d = (ExpandedMenuView) c0157i2.f2602b.inflate(com.playgen.securelock.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c0157i2.f2605f == null) {
                            c0157i2.f2605f = new C0156h(c0157i2);
                        }
                        c0157i2.d.setAdapter((ListAdapter) c0157i2.f2605f);
                        c0157i2.d.setOnItemClickListener(c0157i2);
                    }
                    ExpandedMenuView expandedMenuView = c0157i2.d;
                    zVar.f2425f = expandedMenuView;
                }
                zVar.f2431n = true;
                return;
            }
            zVar.f2425f = view;
            if (zVar.f2425f != null) {
                if (zVar.f2426g == null) {
                    C0157i c0157i3 = zVar.i;
                    if (c0157i3.f2605f == null) {
                        c0157i3.f2605f = new C0156h(c0157i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f2425f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f2424e.setBackgroundResource(zVar.f2422b);
                ViewParent parent = zVar.f2425f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f2425f);
                }
                zVar.f2424e.addView(zVar.f2425f, layoutParams2);
                if (!zVar.f2425f.hasFocus()) {
                    zVar.f2425f.requestFocus();
                }
            }
            zVar.f2431n = true;
            return;
        }
        View view2 = zVar.f2426g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f2429l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f2423c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f2424e, layoutParams3);
            zVar.f2430m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f2429l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f2423c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f2424e, layoutParams32);
        zVar.f2430m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        MenuC0161m menuC0161m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f2428k || F(zVar, keyEvent)) && (menuC0161m = zVar.h) != null) {
            return menuC0161m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(z zVar, KeyEvent keyEvent) {
        InterfaceC0229l0 interfaceC0229l0;
        InterfaceC0229l0 interfaceC0229l02;
        Resources.Theme theme;
        InterfaceC0229l0 interfaceC0229l03;
        InterfaceC0229l0 interfaceC0229l04;
        if (this.f2279R) {
            return false;
        }
        if (zVar.f2428k) {
            return true;
        }
        z zVar2 = this.f2275N;
        if (zVar2 != null && zVar2 != zVar) {
            r(zVar2, false);
        }
        Window.Callback callback = this.f2298l.getCallback();
        int i = zVar.f2421a;
        if (callback != null) {
            zVar.f2426g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0229l04 = this.f2304r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0229l04;
            actionBarOverlayLayout.k();
            ((e1) actionBarOverlayLayout.f1224e).f2914l = true;
        }
        if (zVar.f2426g == null) {
            MenuC0161m menuC0161m = zVar.h;
            if (menuC0161m == null || zVar.f2432o) {
                if (menuC0161m == null) {
                    Context context = this.f2297k;
                    if ((i == 0 || i == 108) && this.f2304r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.playgen.securelock.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.playgen.securelock.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.playgen.securelock.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0142c c0142c = new C0142c(context, 0);
                            c0142c.getTheme().setTo(theme);
                            context = c0142c;
                        }
                    }
                    MenuC0161m menuC0161m2 = new MenuC0161m(context);
                    menuC0161m2.f2615e = this;
                    MenuC0161m menuC0161m3 = zVar.h;
                    if (menuC0161m2 != menuC0161m3) {
                        if (menuC0161m3 != null) {
                            menuC0161m3.r(zVar.i);
                        }
                        zVar.h = menuC0161m2;
                        C0157i c0157i = zVar.i;
                        if (c0157i != null) {
                            menuC0161m2.b(c0157i, menuC0161m2.f2612a);
                        }
                    }
                    if (zVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0229l02 = this.f2304r) != null) {
                    if (this.f2305s == null) {
                        this.f2305s = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0229l02).l(zVar.h, this.f2305s);
                }
                zVar.h.w();
                if (!callback.onCreatePanelMenu(i, zVar.h)) {
                    MenuC0161m menuC0161m4 = zVar.h;
                    if (menuC0161m4 != null) {
                        if (menuC0161m4 != null) {
                            menuC0161m4.r(zVar.i);
                        }
                        zVar.h = null;
                    }
                    if (z2 && (interfaceC0229l0 = this.f2304r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0229l0).l(null, this.f2305s);
                    }
                    return false;
                }
                zVar.f2432o = false;
            }
            zVar.h.w();
            Bundle bundle = zVar.f2433p;
            if (bundle != null) {
                zVar.h.s(bundle);
                zVar.f2433p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f2426g, zVar.h)) {
                if (z2 && (interfaceC0229l03 = this.f2304r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0229l03).l(null, this.f2305s);
                }
                zVar.h.v();
                return false;
            }
            zVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            zVar.h.v();
        }
        zVar.f2428k = true;
        zVar.f2429l = false;
        this.f2275N = zVar;
        return true;
    }

    public final void G() {
        if (this.f2263A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2294g0 != null && (y(0).f2430m || this.f2307u != null)) {
                z2 = true;
            }
            if (z2 && this.f2295h0 == null) {
                this.f2295h0 = u.b(this.f2294g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2295h0) == null) {
                    return;
                }
                u.c(this.f2294g0, onBackInvokedCallback);
                this.f2295h0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2297k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0117A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.o
    public final void c() {
        String str;
        this.f2277P = true;
        k(false, true);
        w();
        Object obj = this.f2296j;
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
                K k2 = this.f2301o;
                if (k2 == null) {
                    this.f2290c0 = true;
                } else {
                    k2.x0(true);
                }
            }
            synchronized (o.h) {
                o.e(this);
                o.f2407g.add(new WeakReference(this));
            }
        }
        this.f2280S = new Configuration(this.f2297k.getResources().getConfiguration());
        this.f2278Q = true;
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
        if (this.f2296j instanceof Activity) {
            synchronized (o.h) {
                o.e(this);
            }
        }
        if (this.f2287Z) {
            this.f2298l.getDecorView().removeCallbacks(this.f2289b0);
        }
        this.f2279R = true;
        if (this.f2281T != -100) {
            Object obj = this.f2296j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2260i0.put(this.f2296j.getClass().getName(), Integer.valueOf(this.f2281T));
                wVar = this.f2285X;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.f2286Y;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f2260i0.remove(this.f2296j.getClass().getName());
        wVar = this.f2285X;
        if (wVar != null) {
        }
        wVar2 = this.f2286Y;
        if (wVar2 == null) {
        }
    }

    @Override // g.o
    public final boolean f(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2272K && i == 108) {
            return false;
        }
        if (this.f2268G && i == 1) {
            this.f2268G = false;
        }
        if (i == 1) {
            G();
            this.f2272K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2267E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2270I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2268G = true;
            return true;
        }
        if (i != 109) {
            return this.f2298l.requestFeature(i);
        }
        G();
        this.f2269H = true;
        return true;
    }

    @Override // g.o
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2264B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2297k).inflate(i, viewGroup);
        this.f2299m.a(this.f2298l.getCallback());
    }

    @Override // g.o
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2264B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2299m.a(this.f2298l.getCallback());
    }

    @Override // g.o
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2264B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2299m.a(this.f2298l.getCallback());
    }

    @Override // g.o
    public final void j(CharSequence charSequence) {
        this.f2303q = charSequence;
        InterfaceC0229l0 interfaceC0229l0 = this.f2304r;
        if (interfaceC0229l0 != null) {
            interfaceC0229l0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2301o;
        if (k2 == null) {
            TextView textView = this.f2265C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        e1 e1Var = (e1) k2.f2340e;
        if (e1Var.f2911g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f2907b & 8) != 0) {
            Toolbar toolbar = e1Var.f2906a;
            toolbar.setTitle(charSequence);
            if (e1Var.f2911g) {
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
    public final boolean k(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        G.f b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f2279R) {
            return false;
        }
        int i3 = this.f2281T;
        if (i3 == -100) {
            i3 = o.f2403b;
        }
        Context context = this.f2297k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f m2 = i4 < 33 ? m(context) : null;
        if (!z3 && m2 != null) {
            m2 = t.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, m2, null, false);
        boolean z5 = this.f2284W;
        Object obj = this.f2296j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2280S;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                G.f b3 = t.b(configuration);
                b2 = m2 != null ? null : t.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2277P && ((f2262k0 || this.f2278Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new C0.p(12, activity));
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
                            int i8 = this.f2282U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2282U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).d().f1431c.compareTo(EnumC0073m.f1423c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2278Q && !this.f2279R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0133i)) {
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
                            w wVar = this.f2285X;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2286Y == null) {
                                this.f2286Y = new w(this, context);
                            }
                            this.f2286Y.i();
                        } else {
                            w wVar2 = this.f2286Y;
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
                    this.f2283V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2283V = 0;
            }
        }
        this.f2284W = true;
        i = this.f2283V;
        configuration = this.f2280S;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        G.f b32 = t.b(configuration);
        if (m2 != null) {
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

    public final void l(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2298l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f2299m = vVar;
        window.setCallback(vVar);
        int[] iArr = f2261j0;
        Context context = this.f2297k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0246u a2 = C0246u.a();
            synchronized (a2) {
                drawable = a2.f3006a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2298l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2294g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2295h0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2295h0 = null;
        }
        Object obj = this.f2296j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2294g0 = u.a(activity);
                H();
            }
        }
        this.f2294g0 = null;
        H();
    }

    public final void n(int i, z zVar, MenuC0161m menuC0161m) {
        if (menuC0161m == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f2274M;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                menuC0161m = zVar.h;
            }
        }
        if ((zVar == null || zVar.f2430m) && !this.f2279R) {
            v vVar = this.f2299m;
            Window.Callback callback = this.f2298l.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i, menuC0161m);
            } finally {
                vVar.d = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0159k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(MenuC0161m menuC0161m) {
        ActionMenuView actionMenuView;
        C0226k c0226k;
        C0226k c0226k2;
        C0226k c0226k3;
        InterfaceC0229l0 interfaceC0229l0 = this.f2304r;
        if (interfaceC0229l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0229l0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((e1) actionBarOverlayLayout.f1224e).f2906a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1284a) != null && actionMenuView.f1247s) {
                if (ViewConfiguration.get(this.f2297k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2304r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout2.f1224e).f2906a.f1284a;
                    if (actionMenuView2 != null) {
                        C0226k c0226k4 = actionMenuView2.f1248t;
                        if (c0226k4 != null) {
                            if (c0226k4.f2957u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2298l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2304r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((e1) actionBarOverlayLayout3.f1224e).f2906a.f1284a;
                if ((actionMenuView3 == null || (c0226k3 = actionMenuView3.f1248t) == null || !c0226k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2304r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((e1) actionBarOverlayLayout4.f1224e).f2906a.f1284a;
                    if (actionMenuView4 != null && (c0226k2 = actionMenuView4.f1248t) != null) {
                        c0226k2.f();
                    }
                    if (this.f2279R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2279R) {
                    return;
                }
                if (this.f2287Z && (1 & this.f2288a0) != 0) {
                    View decorView = this.f2298l.getDecorView();
                    p pVar = this.f2289b0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z y2 = y(0);
                MenuC0161m menuC0161m2 = y2.h;
                if (menuC0161m2 == null || y2.f2432o || !callback.onPreparePanel(0, y2.f2426g, menuC0161m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2304r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((e1) actionBarOverlayLayout5.f1224e).f2906a.f1284a;
                if (actionMenuView5 == null || (c0226k = actionMenuView5.f1248t) == null) {
                    return;
                }
                c0226k.l();
                return;
            }
        }
        z y3 = y(0);
        y3.f2431n = true;
        r(y3, false);
        D(y3, null);
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
        View c0192e;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2293f0 == null) {
            int[] iArr = f.a.f1996j;
            Context context2 = this.f2297k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2293f0 = new C0120D();
            } else {
                try {
                    this.f2293f0 = (C0120D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2293f0 = new C0120D();
                }
            }
        }
        C0120D c0120d = this.f2293f0;
        int i2 = g1.f2920a;
        c0120d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2010x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0142c = (resourceId == 0 || ((context instanceof C0142c) && ((C0142c) context).f2476a == resourceId)) ? context : new C0142c(context, resourceId);
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
                c0192e = new C0192E(c0142c, attributeSet);
                break;
            case 1:
                c0192e = new C0242s(c0142c, attributeSet);
                break;
            case 2:
                c0192e = new C0188A(c0142c, attributeSet);
                break;
            case 3:
                c0192e = c0120d.e(c0142c, attributeSet);
                break;
            case 4:
                c0192e = new C0254y(c0142c, attributeSet, com.playgen.securelock.R.attr.imageButtonStyle);
                break;
            case 5:
                c0192e = new C0194G(c0142c, attributeSet);
                break;
            case 6:
                c0192e = new C0204Q(c0142c, attributeSet);
                break;
            case 7:
                c0192e = c0120d.d(c0142c, attributeSet);
                break;
            case '\b':
                c0192e = new C0225j0(c0142c, attributeSet);
                break;
            case '\t':
                c0192e = new C0256z(c0142c, attributeSet, 0);
                break;
            case '\n':
                c0192e = c0120d.a(c0142c, attributeSet);
                break;
            case 11:
                c0192e = c0120d.c(c0142c, attributeSet);
                break;
            case '\f':
                c0192e = new C0250w(c0142c, attributeSet);
                break;
            case '\r':
                c0192e = c0120d.b(c0142c, attributeSet);
                break;
            default:
                c0192e = null;
                break;
        }
        if (c0192e == null && context != c0142c) {
            Object[] objArr = c0120d.f2322a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0142c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0120D.f2321g;
                        if (i3 < 3) {
                            View f2 = c0120d.f(c0142c, str2, strArr[i3]);
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
                    View f3 = c0120d.f(c0142c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0192e = view2;
        }
        if (c0192e != null) {
            Context context3 = c0192e.getContext();
            if ((context3 instanceof ContextWrapper) && c0192e.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0120D.f2318c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0192e.setOnClickListener(new ViewOnClickListenerC0119C(c0192e, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0142c.obtainStyledAttributes(attributeSet, C0120D.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = S.f369a;
                    i = 0;
                    new K.B(com.playgen.securelock.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0192e, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0142c.obtainStyledAttributes(attributeSet, C0120D.f2319e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    S.m(c0192e, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0142c.obtainStyledAttributes(attributeSet, C0120D.f2320f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = S.f369a;
                    new K.B(com.playgen.securelock.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0192e, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0192e;
    }

    public final void p(MenuC0161m menuC0161m) {
        C0226k c0226k;
        if (this.f2273L) {
            return;
        }
        this.f2273L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2304r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f1224e).f2906a.f1284a;
        if (actionMenuView != null && (c0226k = actionMenuView.f1248t) != null) {
            c0226k.f();
            C0218g c0218g = c0226k.f2956t;
            if (c0218g != null && c0218g.b()) {
                c0218g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2298l.getCallback();
        if (callback != null && !this.f2279R) {
            callback.onPanelClosed(108, menuC0161m);
        }
        this.f2273L = false;
    }

    @Override // k.InterfaceC0159k
    public final boolean q(MenuC0161m menuC0161m, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f2298l.getCallback();
        if (callback != null && !this.f2279R) {
            MenuC0161m k2 = menuC0161m.k();
            z[] zVarArr = this.f2274M;
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
                return callback.onMenuItemSelected(zVar.f2421a, menuItem);
            }
        }
        return false;
    }

    public final void r(z zVar, boolean z2) {
        y yVar;
        InterfaceC0229l0 interfaceC0229l0;
        C0226k c0226k;
        if (z2 && zVar.f2421a == 0 && (interfaceC0229l0 = this.f2304r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0229l0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f1224e).f2906a.f1284a;
            if (actionMenuView != null && (c0226k = actionMenuView.f1248t) != null && c0226k.i()) {
                p(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2297k.getSystemService("window");
        if (windowManager != null && zVar.f2430m && (yVar = zVar.f2424e) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                n(zVar.f2421a, zVar, null);
            }
        }
        zVar.f2428k = false;
        zVar.f2429l = false;
        zVar.f2430m = false;
        zVar.f2425f = null;
        zVar.f2431n = true;
        if (this.f2275N == zVar) {
            this.f2275N = null;
        }
        if (zVar.f2421a == 0) {
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
        C0226k c0226k;
        Object obj = this.f2296j;
        if (((obj instanceof InterfaceC0010k) || (obj instanceof DialogInterfaceC0130f)) && (decorView = this.f2298l.getDecorView()) != null && u1.l.t(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            v vVar = this.f2299m;
            Window.Callback callback = this.f2298l.getCallback();
            vVar.getClass();
            try {
                vVar.f2416c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                vVar.f2416c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2276O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                z y2 = y(0);
                if (y2.f2430m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2307u != null) {
                    return true;
                }
                z y3 = y(0);
                InterfaceC0229l0 interfaceC0229l0 = this.f2304r;
                Context context = this.f2297k;
                if (interfaceC0229l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0229l0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((e1) actionBarOverlayLayout.f1224e).f2906a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1284a) != null && actionMenuView.f1247s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2304r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout2.f1224e).f2906a.f1284a;
                        if (actionMenuView2 == null || (c0226k = actionMenuView2.f1248t) == null || !c0226k.i()) {
                            if (!this.f2279R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2304r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((e1) actionBarOverlayLayout3.f1224e).f2906a.f1284a;
                                if (actionMenuView3 != null) {
                                    C0226k c0226k2 = actionMenuView3.f1248t;
                                    if (c0226k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2304r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((e1) actionBarOverlayLayout4.f1224e).f2906a.f1284a;
                            if (actionMenuView4 != null) {
                                C0226k c0226k3 = actionMenuView4.f1248t;
                                if (c0226k3 != null) {
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
                boolean z4 = y3.f2430m;
                if (z4 || y3.f2429l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2428k) {
                        if (y3.f2432o) {
                            y3.f2428k = false;
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
                y2.f2433p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2432o = true;
        y2.f2431n = true;
        if ((i == 108 || i == 0) && this.f2304r != null) {
            z y3 = y(0);
            y3.f2428k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2263A) {
            return;
        }
        int[] iArr = f.a.f1996j;
        Context context = this.f2297k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.f2271J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2298l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2272K) {
            viewGroup = this.f2270I ? (ViewGroup) from.inflate(com.playgen.securelock.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.playgen.securelock.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2271J) {
            viewGroup = (ViewGroup) from.inflate(com.playgen.securelock.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2269H = false;
            this.f2268G = false;
        } else if (this.f2268G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.playgen.securelock.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0142c(context, typedValue.resourceId) : context).inflate(com.playgen.securelock.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0229l0 interfaceC0229l0 = (InterfaceC0229l0) viewGroup.findViewById(com.playgen.securelock.R.id.decor_content_parent);
            this.f2304r = interfaceC0229l0;
            interfaceC0229l0.setWindowCallback(this.f2298l.getCallback());
            if (this.f2269H) {
                ((ActionBarOverlayLayout) this.f2304r).j(109);
            }
            if (this.f2267E) {
                ((ActionBarOverlayLayout) this.f2304r).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.f2304r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2268G + ", windowActionBarOverlay: " + this.f2269H + ", android:windowIsFloating: " + this.f2271J + ", windowActionModeOverlay: " + this.f2270I + ", windowNoTitle: " + this.f2272K + " }");
        }
        q qVar = new q(this, i2);
        WeakHashMap weakHashMap = S.f369a;
        K.G.u(viewGroup, qVar);
        if (this.f2304r == null) {
            this.f2265C = (TextView) viewGroup.findViewById(com.playgen.securelock.R.id.title);
        }
        boolean z2 = j1.f2937a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.playgen.securelock.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2298l.findViewById(R.id.content);
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
        this.f2298l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i));
        this.f2264B = viewGroup;
        Object obj = this.f2296j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2303q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0229l0 interfaceC0229l02 = this.f2304r;
            if (interfaceC0229l02 != null) {
                interfaceC0229l02.setWindowTitle(title);
            } else {
                K k2 = this.f2301o;
                if (k2 != null) {
                    e1 e1Var = (e1) k2.f2340e;
                    if (!e1Var.f2911g) {
                        e1Var.h = title;
                        if ((e1Var.f2907b & 8) != 0) {
                            Toolbar toolbar = e1Var.f2906a;
                            toolbar.setTitle(title);
                            if (e1Var.f2911g) {
                                S.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2265C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2264B.findViewById(R.id.content);
        View decorView = this.f2298l.getDecorView();
        contentFrameLayout2.f1264g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2263A = true;
        z y2 = y(0);
        if (this.f2279R || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2298l == null) {
            Object obj = this.f2296j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f2298l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0038g x(Context context) {
        if (this.f2285X == null) {
            if (C0011l.f420e == null) {
                Context applicationContext = context.getApplicationContext();
                C0011l.f420e = new C0011l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2285X = new w(this, C0011l.f420e);
        }
        return this.f2285X;
    }

    public final z y(int i) {
        z[] zVarArr = this.f2274M;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f2274M = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f2421a = i;
        zVar2.f2431n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void z() {
        v();
        if (this.f2268G && this.f2301o == null) {
            Object obj = this.f2296j;
            if (obj instanceof Activity) {
                this.f2301o = new K((Activity) obj, this.f2269H);
            } else if (obj instanceof Dialog) {
                this.f2301o = new K((Dialog) obj);
            }
            K k2 = this.f2301o;
            if (k2 != null) {
                k2.x0(this.f2290c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
