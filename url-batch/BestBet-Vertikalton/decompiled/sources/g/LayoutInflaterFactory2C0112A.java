package g;

import K.InterfaceC0014j;
import K.Q;
import K.Z;
import Y.AbstractC0040g;
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
import androidx.lifecycle.EnumC0072m;
import androidx.recyclerview.widget.RecyclerView;
import j.AbstractC0164a;
import j.C0166c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0184h;
import k.C0185i;
import k.C0192p;
import k.InterfaceC0187k;
import k.MenuC0189m;
import l.C0207D;
import l.C0209F;
import l.C0219P;
import l.C0234g;
import l.C0237h0;
import l.C0242k;
import l.C0258s;
import l.C0260t;
import l.C0264v;
import l.C0268x;
import l.C0270y;
import l.C0272z;
import l.InterfaceC0241j0;
import l.InterfaceC0243k0;
import l.X0;
import l.c1;
import l.e1;
import l.h1;
import u0.C0372k;
import z.AbstractC0400c;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0112A extends o implements InterfaceC0187k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final o.k f2539i0 = new o.k();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f2540j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2541k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2542A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2543B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2544C;

    /* renamed from: D, reason: collision with root package name */
    public View f2545D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2546E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2547G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2548H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2549I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2550J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2551K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2552L;

    /* renamed from: M, reason: collision with root package name */
    public z[] f2553M;

    /* renamed from: N, reason: collision with root package name */
    public z f2554N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2555O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2556P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2557Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2558R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2559S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2560T;

    /* renamed from: U, reason: collision with root package name */
    public int f2561U;

    /* renamed from: V, reason: collision with root package name */
    public int f2562V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2563W;

    /* renamed from: X, reason: collision with root package name */
    public w f2564X;

    /* renamed from: Y, reason: collision with root package name */
    public w f2565Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2566Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2567a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2569c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2570d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2571e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0115D f2572f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2573g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2574h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2575j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2576k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2577l;

    /* renamed from: m, reason: collision with root package name */
    public v f2578m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2579n;

    /* renamed from: o, reason: collision with root package name */
    public K f2580o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2581p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2582q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0241j0 f2583r;

    /* renamed from: s, reason: collision with root package name */
    public q f2584s;

    /* renamed from: t, reason: collision with root package name */
    public q f2585t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0164a f2586u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2587v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2588w;

    /* renamed from: x, reason: collision with root package name */
    public p f2589x;

    /* renamed from: y, reason: collision with root package name */
    public Z f2590y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2591z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final p f2568b0 = new p(this, 0);

    public LayoutInflaterFactory2C0112A(Context context, Window window, InterfaceC0129j interfaceC0129j, Object obj) {
        AbstractActivityC0128i abstractActivityC0128i;
        this.f2560T = -100;
        this.f2576k = context;
        this.f2575j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0128i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0128i = (AbstractActivityC0128i) context;
                    break;
                }
            }
            abstractActivityC0128i = null;
            if (abstractActivityC0128i != null) {
                this.f2560T = ((LayoutInflaterFactory2C0112A) abstractActivityC0128i.l()).f2560T;
            }
        }
        if (this.f2560T == -100) {
            o.k kVar = f2539i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2575j.getClass().getName(), null);
            if (num != null) {
                this.f2560T = num.intValue();
                kVar.remove(this.f2575j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0260t.d();
    }

    public static G.f o(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.f2684c) == null) {
            return null;
        }
        G.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f289a;
        if (gVar.f290a.isEmpty()) {
            fVar2 = G.f.f288b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f289a.f290a.size() + gVar.f290a.size()) {
                Locale locale = i < gVar.f290a.size() ? gVar.f290a.get(i) : b2.f289a.f290a.get(i - gVar.f290a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f289a.f290a.isEmpty() ? b2 : fVar2;
    }

    public static Configuration s(Context context, int i, G.f fVar, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = RecyclerView.f1937A0;
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
        this.f2567a0 = (1 << i) | this.f2567a0;
        if (this.f2566Z) {
            return;
        }
        View decorView = this.f2577l.getDecorView();
        p pVar = this.f2568b0;
        WeakHashMap weakHashMap = Q.f578a;
        decorView.postOnAnimation(pVar);
        this.f2566Z = true;
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
                if (this.f2565Y == null) {
                    this.f2565Y = new w(this, context);
                }
                return this.f2565Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0243k0 interfaceC0243k0;
        X0 x02;
        boolean z2 = this.f2555O;
        this.f2555O = false;
        z y2 = y(0);
        if (y2.f2710m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0164a abstractC0164a = this.f2586u;
        if (abstractC0164a != null) {
            abstractC0164a.a();
            return true;
        }
        z();
        K k2 = this.f2580o;
        if (k2 == null || (interfaceC0243k0 = k2.h) == null || (x02 = ((c1) interfaceC0243k0).f3374a.f1741L) == null || x02.f3353b == null) {
            return false;
        }
        X0 x03 = ((c1) interfaceC0243k0).f3374a.f1741L;
        C0192p c0192p = x03 == null ? null : x03.f3353b;
        if (c0192p != null) {
            c0192p.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f3156f.getCount() > 0) goto L88;
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
        if (zVar.f2710m || this.f2558R) {
            return;
        }
        int i2 = zVar.f2701a;
        Context context = this.f2576k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2577l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, zVar.h)) {
            r(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f2704e;
        if (yVar == null || zVar.f2711n) {
            if (yVar == null) {
                z();
                K k2 = this.f2580o;
                Context E2 = k2 != null ? k2.E() : null;
                if (E2 != null) {
                    context = E2;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.fortunequest.neontrack.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.fortunequest.neontrack.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.fortunequest.neontrack.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0166c c0166c = new C0166c(context, 0);
                c0166c.getTheme().setTo(newTheme);
                zVar.f2707j = c0166c;
                TypedArray obtainStyledAttributes = c0166c.obtainStyledAttributes(f.a.f2520j);
                zVar.f2702b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f2704e = new y(this, zVar.f2707j);
                zVar.f2703c = 81;
            } else if (zVar.f2711n && yVar.getChildCount() > 0) {
                zVar.f2704e.removeAllViews();
            }
            View view = zVar.f2706g;
            if (view == null) {
                if (zVar.h != null) {
                    if (this.f2585t == null) {
                        this.f2585t = new q(this, 3);
                    }
                    q qVar = this.f2585t;
                    if (zVar.i == null) {
                        C0185i c0185i = new C0185i(zVar.f2707j);
                        zVar.i = c0185i;
                        c0185i.f3155e = qVar;
                        MenuC0189m menuC0189m = zVar.h;
                        menuC0189m.b(c0185i, menuC0189m.f3163a);
                    }
                    C0185i c0185i2 = zVar.i;
                    y yVar2 = zVar.f2704e;
                    if (c0185i2.d == null) {
                        c0185i2.d = (ExpandedMenuView) c0185i2.f3153b.inflate(com.fortunequest.neontrack.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c0185i2.f3156f == null) {
                            c0185i2.f3156f = new C0184h(c0185i2);
                        }
                        c0185i2.d.setAdapter((ListAdapter) c0185i2.f3156f);
                        c0185i2.d.setOnItemClickListener(c0185i2);
                    }
                    ExpandedMenuView expandedMenuView = c0185i2.d;
                    zVar.f2705f = expandedMenuView;
                }
                zVar.f2711n = true;
                return;
            }
            zVar.f2705f = view;
            if (zVar.f2705f != null) {
                if (zVar.f2706g == null) {
                    C0185i c0185i3 = zVar.i;
                    if (c0185i3.f3156f == null) {
                        c0185i3.f3156f = new C0184h(c0185i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f2705f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f2704e.setBackgroundResource(zVar.f2702b);
                ViewParent parent = zVar.f2705f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f2705f);
                }
                zVar.f2704e.addView(zVar.f2705f, layoutParams2);
                if (!zVar.f2705f.hasFocus()) {
                    zVar.f2705f.requestFocus();
                }
            }
            zVar.f2711n = true;
            return;
        }
        View view2 = zVar.f2706g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f2709l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f2703c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f2704e, layoutParams3);
            zVar.f2710m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f2709l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f2703c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f2704e, layoutParams32);
        zVar.f2710m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        MenuC0189m menuC0189m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f2708k || F(zVar, keyEvent)) && (menuC0189m = zVar.h) != null) {
            return menuC0189m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(z zVar, KeyEvent keyEvent) {
        InterfaceC0241j0 interfaceC0241j0;
        InterfaceC0241j0 interfaceC0241j02;
        Resources.Theme theme;
        InterfaceC0241j0 interfaceC0241j03;
        InterfaceC0241j0 interfaceC0241j04;
        if (this.f2558R) {
            return false;
        }
        if (zVar.f2708k) {
            return true;
        }
        z zVar2 = this.f2554N;
        if (zVar2 != null && zVar2 != zVar) {
            r(zVar2, false);
        }
        Window.Callback callback = this.f2577l.getCallback();
        int i = zVar.f2701a;
        if (callback != null) {
            zVar.f2706g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0241j04 = this.f2583r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0241j04;
            actionBarOverlayLayout.k();
            ((c1) actionBarOverlayLayout.f1687e).f3382l = true;
        }
        if (zVar.f2706g == null) {
            MenuC0189m menuC0189m = zVar.h;
            if (menuC0189m == null || zVar.f2712o) {
                if (menuC0189m == null) {
                    Context context = this.f2576k;
                    if ((i == 0 || i == 108) && this.f2583r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.fortunequest.neontrack.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.fortunequest.neontrack.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.fortunequest.neontrack.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0166c c0166c = new C0166c(context, 0);
                            c0166c.getTheme().setTo(theme);
                            context = c0166c;
                        }
                    }
                    MenuC0189m menuC0189m2 = new MenuC0189m(context);
                    menuC0189m2.f3166e = this;
                    MenuC0189m menuC0189m3 = zVar.h;
                    if (menuC0189m2 != menuC0189m3) {
                        if (menuC0189m3 != null) {
                            menuC0189m3.r(zVar.i);
                        }
                        zVar.h = menuC0189m2;
                        C0185i c0185i = zVar.i;
                        if (c0185i != null) {
                            menuC0189m2.b(c0185i, menuC0189m2.f3163a);
                        }
                    }
                    if (zVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0241j02 = this.f2583r) != null) {
                    if (this.f2584s == null) {
                        this.f2584s = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0241j02).l(zVar.h, this.f2584s);
                }
                zVar.h.w();
                if (!callback.onCreatePanelMenu(i, zVar.h)) {
                    MenuC0189m menuC0189m4 = zVar.h;
                    if (menuC0189m4 != null) {
                        if (menuC0189m4 != null) {
                            menuC0189m4.r(zVar.i);
                        }
                        zVar.h = null;
                    }
                    if (z2 && (interfaceC0241j0 = this.f2583r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0241j0).l(null, this.f2584s);
                    }
                    return false;
                }
                zVar.f2712o = false;
            }
            zVar.h.w();
            Bundle bundle = zVar.f2713p;
            if (bundle != null) {
                zVar.h.s(bundle);
                zVar.f2713p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f2706g, zVar.h)) {
                if (z2 && (interfaceC0241j03 = this.f2583r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0241j03).l(null, this.f2584s);
                }
                zVar.h.v();
                return false;
            }
            zVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            zVar.h.v();
        }
        zVar.f2708k = true;
        zVar.f2709l = false;
        this.f2554N = zVar;
        return true;
    }

    public final void G() {
        if (this.f2542A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2573g0 != null && (y(0).f2710m || this.f2586u != null)) {
                z2 = true;
            }
            if (z2 && this.f2574h0 == null) {
                this.f2574h0 = u.b(this.f2573g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2574h0) == null) {
                    return;
                }
                u.c(this.f2573g0, onBackInvokedCallback);
                this.f2574h0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2576k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0112A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.o
    public final void c() {
        String str;
        this.f2556P = true;
        m(false, true);
        w();
        Object obj = this.f2575j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0400c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                K k2 = this.f2580o;
                if (k2 == null) {
                    this.f2569c0 = true;
                } else {
                    k2.G(true);
                }
            }
            synchronized (o.h) {
                o.e(this);
                o.f2687g.add(new WeakReference(this));
            }
        }
        this.f2559S = new Configuration(this.f2576k.getResources().getConfiguration());
        this.f2557Q = true;
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
        if (this.f2575j instanceof Activity) {
            synchronized (o.h) {
                o.e(this);
            }
        }
        if (this.f2566Z) {
            this.f2577l.getDecorView().removeCallbacks(this.f2568b0);
        }
        this.f2558R = true;
        if (this.f2560T != -100) {
            Object obj = this.f2575j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2539i0.put(this.f2575j.getClass().getName(), Integer.valueOf(this.f2560T));
                wVar = this.f2564X;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.f2565Y;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f2539i0.remove(this.f2575j.getClass().getName());
        wVar = this.f2564X;
        if (wVar != null) {
        }
        wVar2 = this.f2565Y;
        if (wVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0187k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(MenuC0189m menuC0189m) {
        ActionMenuView actionMenuView;
        C0242k c0242k;
        C0242k c0242k2;
        C0242k c0242k3;
        InterfaceC0241j0 interfaceC0241j0 = this.f2583r;
        if (interfaceC0241j0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0241j0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((c1) actionBarOverlayLayout.f1687e).f3374a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1747a) != null && actionMenuView.f1710s) {
                if (ViewConfiguration.get(this.f2576k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2583r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.f1687e).f3374a.f1747a;
                    if (actionMenuView2 != null) {
                        C0242k c0242k4 = actionMenuView2.f1711t;
                        if (c0242k4 != null) {
                            if (c0242k4.f3425u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2577l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2583r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.f1687e).f3374a.f1747a;
                if ((actionMenuView3 == null || (c0242k3 = actionMenuView3.f1711t) == null || !c0242k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2583r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.f1687e).f3374a.f1747a;
                    if (actionMenuView4 != null && (c0242k2 = actionMenuView4.f1711t) != null) {
                        c0242k2.f();
                    }
                    if (this.f2558R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2558R) {
                    return;
                }
                if (this.f2566Z && (1 & this.f2567a0) != 0) {
                    View decorView = this.f2577l.getDecorView();
                    p pVar = this.f2568b0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z y2 = y(0);
                MenuC0189m menuC0189m2 = y2.h;
                if (menuC0189m2 == null || y2.f2712o || !callback.onPreparePanel(0, y2.f2706g, menuC0189m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2583r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((c1) actionBarOverlayLayout5.f1687e).f3374a.f1747a;
                if (actionMenuView5 == null || (c0242k = actionMenuView5.f1711t) == null) {
                    return;
                }
                c0242k.l();
                return;
            }
        }
        z y3 = y(0);
        y3.f2711n = true;
        r(y3, false);
        D(y3, null);
    }

    @Override // k.InterfaceC0187k
    public final boolean g(MenuC0189m menuC0189m, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f2577l.getCallback();
        if (callback != null && !this.f2558R) {
            MenuC0189m k2 = menuC0189m.k();
            z[] zVarArr = this.f2553M;
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
                return callback.onMenuItemSelected(zVar.f2701a, menuItem);
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
        if (this.f2551K && i == 108) {
            return false;
        }
        if (this.f2547G && i == 1) {
            this.f2547G = false;
        }
        if (i == 1) {
            G();
            this.f2551K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2546E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2549I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2547G = true;
            return true;
        }
        if (i != 109) {
            return this.f2577l.requestFeature(i);
        }
        G();
        this.f2548H = true;
        return true;
    }

    @Override // g.o
    public final void i(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2543B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2576k).inflate(i, viewGroup);
        this.f2578m.a(this.f2577l.getCallback());
    }

    @Override // g.o
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2543B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2578m.a(this.f2577l.getCallback());
    }

    @Override // g.o
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2543B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2578m.a(this.f2577l.getCallback());
    }

    @Override // g.o
    public final void l(CharSequence charSequence) {
        this.f2582q = charSequence;
        InterfaceC0241j0 interfaceC0241j0 = this.f2583r;
        if (interfaceC0241j0 != null) {
            interfaceC0241j0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2580o;
        if (k2 == null) {
            TextView textView = this.f2544C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        c1 c1Var = (c1) k2.h;
        if (c1Var.f3379g) {
            return;
        }
        c1Var.h = charSequence;
        if ((c1Var.f3375b & 8) != 0) {
            Toolbar toolbar = c1Var.f3374a;
            toolbar.setTitle(charSequence);
            if (c1Var.f3379g) {
                Q.m(toolbar.getRootView(), charSequence);
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
        if (this.f2558R) {
            return false;
        }
        int i3 = this.f2560T;
        if (i3 == -100) {
            i3 = o.f2683b;
        }
        Context context = this.f2576k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f o2 = i4 < 33 ? o(context) : null;
        if (!z3 && o2 != null) {
            o2 = t.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, o2, null, false);
        boolean z5 = this.f2563W;
        Object obj = this.f2575j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2559S;
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
                if (((~i) & i2) != 0 && z2 && this.f2556P && ((f2541k0 || this.f2557Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new E0.b(12, activity));
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
                            int i8 = this.f2561U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2561U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.t) {
                                    if (((androidx.lifecycle.t) activity2).e().d.compareTo(EnumC0072m.f1886c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2557Q && !this.f2558R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0128i)) {
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
                            w wVar = this.f2564X;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2565Y == null) {
                                this.f2565Y = new w(this, context);
                            }
                            this.f2565Y.i();
                        } else {
                            w wVar2 = this.f2565Y;
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
                    this.f2562V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2562V = 0;
            }
        }
        this.f2563W = true;
        i = this.f2562V;
        configuration = this.f2559S;
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
        if (this.f2577l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f2578m = vVar;
        window.setCallback(vVar);
        int[] iArr = f2540j0;
        Context context = this.f2576k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0260t a2 = C0260t.a();
            synchronized (a2) {
                drawable = a2.f3469a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2577l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2573g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2574h0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2574h0 = null;
        }
        Object obj = this.f2575j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2573g0 = u.a(activity);
                H();
            }
        }
        this.f2573g0 = null;
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
        View c0207d;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2572f0 == null) {
            int[] iArr = f.a.f2520j;
            Context context2 = this.f2576k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2572f0 = new C0115D();
            } else {
                try {
                    this.f2572f0 = (C0115D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2572f0 = new C0115D();
                }
            }
        }
        C0115D c0115d = this.f2572f0;
        int i2 = e1.f3386a;
        c0115d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2534x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0166c = (resourceId == 0 || ((context instanceof C0166c) && ((C0166c) context).f3022a == resourceId)) ? context : new C0166c(context, resourceId);
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
                c0207d = new C0207D(c0166c, attributeSet);
                break;
            case 1:
                c0207d = new C0258s(c0166c, attributeSet);
                break;
            case 2:
                c0207d = new C0272z(c0166c, attributeSet);
                break;
            case 3:
                c0207d = c0115d.e(c0166c, attributeSet);
                break;
            case 4:
                c0207d = new C0268x(c0166c, attributeSet, com.fortunequest.neontrack.R.attr.imageButtonStyle);
                break;
            case 5:
                c0207d = new C0209F(c0166c, attributeSet);
                break;
            case 6:
                c0207d = new C0219P(c0166c, attributeSet);
                break;
            case 7:
                c0207d = c0115d.d(c0166c, attributeSet);
                break;
            case '\b':
                c0207d = new C0237h0(c0166c, attributeSet);
                break;
            case '\t':
                c0207d = new C0270y(c0166c, attributeSet, 0);
                break;
            case '\n':
                c0207d = c0115d.a(c0166c, attributeSet);
                break;
            case 11:
                c0207d = c0115d.c(c0166c, attributeSet);
                break;
            case '\f':
                c0207d = new C0264v(c0166c, attributeSet);
                break;
            case '\r':
                c0207d = c0115d.b(c0166c, attributeSet);
                break;
            default:
                c0207d = null;
                break;
        }
        if (c0207d == null && context != c0166c) {
            Object[] objArr = c0115d.f2601a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0166c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0115D.f2600g;
                        if (i3 < 3) {
                            View f2 = c0115d.f(c0166c, str2, strArr[i3]);
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
                    View f3 = c0115d.f(c0166c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0207d = view2;
        }
        if (c0207d != null) {
            Context context3 = c0207d.getContext();
            if ((context3 instanceof ContextWrapper) && c0207d.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0115D.f2597c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0207d.setOnClickListener(new ViewOnClickListenerC0114C(c0207d, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0166c.obtainStyledAttributes(attributeSet, C0115D.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = Q.f578a;
                    i = 0;
                    new K.A(com.fortunequest.neontrack.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(c0207d, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0166c.obtainStyledAttributes(attributeSet, C0115D.f2598e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    Q.m(c0207d, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0166c.obtainStyledAttributes(attributeSet, C0115D.f2599f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = Q.f578a;
                    new K.A(com.fortunequest.neontrack.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).f(c0207d, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0207d;
    }

    public final void p(int i, z zVar, MenuC0189m menuC0189m) {
        if (menuC0189m == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f2553M;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                menuC0189m = zVar.h;
            }
        }
        if ((zVar == null || zVar.f2710m) && !this.f2558R) {
            v vVar = this.f2578m;
            Window.Callback callback = this.f2577l.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i, menuC0189m);
            } finally {
                vVar.d = false;
            }
        }
    }

    public final void q(MenuC0189m menuC0189m) {
        C0242k c0242k;
        if (this.f2552L) {
            return;
        }
        this.f2552L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2583r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.f1687e).f3374a.f1747a;
        if (actionMenuView != null && (c0242k = actionMenuView.f1711t) != null) {
            c0242k.f();
            C0234g c0234g = c0242k.f3424t;
            if (c0234g != null && c0234g.b()) {
                c0234g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2577l.getCallback();
        if (callback != null && !this.f2558R) {
            callback.onPanelClosed(108, menuC0189m);
        }
        this.f2552L = false;
    }

    public final void r(z zVar, boolean z2) {
        y yVar;
        InterfaceC0241j0 interfaceC0241j0;
        C0242k c0242k;
        if (z2 && zVar.f2701a == 0 && (interfaceC0241j0 = this.f2583r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0241j0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.f1687e).f3374a.f1747a;
            if (actionMenuView != null && (c0242k = actionMenuView.f1711t) != null && c0242k.i()) {
                q(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2576k.getSystemService("window");
        if (windowManager != null && zVar.f2710m && (yVar = zVar.f2704e) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                p(zVar.f2701a, zVar, null);
            }
        }
        zVar.f2708k = false;
        zVar.f2709l = false;
        zVar.f2710m = false;
        zVar.f2705f = null;
        zVar.f2711n = true;
        if (this.f2554N == zVar) {
            this.f2554N = null;
        }
        if (zVar.f2701a == 0) {
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
        C0242k c0242k;
        Object obj = this.f2575j;
        if (((obj instanceof InterfaceC0014j) || (obj instanceof DialogInterfaceC0125f)) && (decorView = this.f2577l.getDecorView()) != null && H1.d.v(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            v vVar = this.f2578m;
            Window.Callback callback = this.f2577l.getCallback();
            vVar.getClass();
            try {
                vVar.f2696c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                vVar.f2696c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2555O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                z y2 = y(0);
                if (y2.f2710m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2586u != null) {
                    return true;
                }
                z y3 = y(0);
                InterfaceC0241j0 interfaceC0241j0 = this.f2583r;
                Context context = this.f2576k;
                if (interfaceC0241j0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0241j0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((c1) actionBarOverlayLayout.f1687e).f3374a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1747a) != null && actionMenuView.f1710s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2583r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.f1687e).f3374a.f1747a;
                        if (actionMenuView2 == null || (c0242k = actionMenuView2.f1711t) == null || !c0242k.i()) {
                            if (!this.f2558R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2583r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.f1687e).f3374a.f1747a;
                                if (actionMenuView3 != null) {
                                    C0242k c0242k2 = actionMenuView3.f1711t;
                                    if (c0242k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2583r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.f1687e).f3374a.f1747a;
                            if (actionMenuView4 != null) {
                                C0242k c0242k3 = actionMenuView4.f1711t;
                                if (c0242k3 != null) {
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
                boolean z4 = y3.f2710m;
                if (z4 || y3.f2709l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2708k) {
                        if (y3.f2712o) {
                            y3.f2708k = false;
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
                y2.f2713p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2712o = true;
        y2.f2711n = true;
        if ((i == 108 || i == 0) && this.f2583r != null) {
            z y3 = y(0);
            y3.f2708k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2542A) {
            return;
        }
        int[] iArr = f.a.f2520j;
        Context context = this.f2576k;
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
        this.f2550J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2577l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2551K) {
            viewGroup = this.f2549I ? (ViewGroup) from.inflate(com.fortunequest.neontrack.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.fortunequest.neontrack.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2550J) {
            viewGroup = (ViewGroup) from.inflate(com.fortunequest.neontrack.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2548H = false;
            this.f2547G = false;
        } else if (this.f2547G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.fortunequest.neontrack.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0166c(context, typedValue.resourceId) : context).inflate(com.fortunequest.neontrack.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0241j0 interfaceC0241j0 = (InterfaceC0241j0) viewGroup.findViewById(com.fortunequest.neontrack.R.id.decor_content_parent);
            this.f2583r = interfaceC0241j0;
            interfaceC0241j0.setWindowCallback(this.f2577l.getCallback());
            if (this.f2548H) {
                ((ActionBarOverlayLayout) this.f2583r).j(109);
            }
            if (this.f2546E) {
                ((ActionBarOverlayLayout) this.f2583r).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.f2583r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2547G + ", windowActionBarOverlay: " + this.f2548H + ", android:windowIsFloating: " + this.f2550J + ", windowActionModeOverlay: " + this.f2549I + ", windowNoTitle: " + this.f2551K + " }");
        }
        q qVar = new q(this, i2);
        WeakHashMap weakHashMap = Q.f578a;
        K.F.u(viewGroup, qVar);
        if (this.f2583r == null) {
            this.f2544C = (TextView) viewGroup.findViewById(com.fortunequest.neontrack.R.id.title);
        }
        boolean z2 = h1.f3403a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.fortunequest.neontrack.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2577l.findViewById(R.id.content);
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
        this.f2577l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i));
        this.f2543B = viewGroup;
        Object obj = this.f2575j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2582q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0241j0 interfaceC0241j02 = this.f2583r;
            if (interfaceC0241j02 != null) {
                interfaceC0241j02.setWindowTitle(title);
            } else {
                K k2 = this.f2580o;
                if (k2 != null) {
                    c1 c1Var = (c1) k2.h;
                    if (!c1Var.f3379g) {
                        c1Var.h = title;
                        if ((c1Var.f3375b & 8) != 0) {
                            Toolbar toolbar = c1Var.f3374a;
                            toolbar.setTitle(title);
                            if (c1Var.f3379g) {
                                Q.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2544C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2543B.findViewById(R.id.content);
        View decorView = this.f2577l.getDecorView();
        contentFrameLayout2.f1727g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2542A = true;
        z y2 = y(0);
        if (this.f2558R || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2577l == null) {
            Object obj = this.f2575j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f2577l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0040g x(Context context) {
        if (this.f2564X == null) {
            if (C0372k.d == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                C0372k c0372k = new C0372k();
                c0372k.f4192c = new C0119H();
                c0372k.f4190a = applicationContext;
                c0372k.f4191b = locationManager;
                C0372k.d = c0372k;
            }
            this.f2564X = new w(this, C0372k.d);
        }
        return this.f2564X;
    }

    public final z y(int i) {
        z[] zVarArr = this.f2553M;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f2553M = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f2701a = i;
        zVar2.f2711n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void z() {
        v();
        if (this.f2547G && this.f2580o == null) {
            Object obj = this.f2575j;
            if (obj instanceof Activity) {
                this.f2580o = new K((Activity) obj, this.f2548H);
            } else if (obj instanceof Dialog) {
                this.f2580o = new K((Dialog) obj);
            }
            K k2 = this.f2580o;
            if (k2 != null) {
                k2.G(this.f2569c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
