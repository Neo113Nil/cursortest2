package g;

import K.C0012m;
import K.InterfaceC0011l;
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
import androidx.lifecycle.EnumC0072m;
import j.AbstractC0147a;
import j.C0149c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0162h;
import k.C0163i;
import k.C0169o;
import k.InterfaceC0165k;
import k.MenuC0167m;
import l.C0185D;
import l.C0187F;
import l.C0197P;
import l.C0213g;
import l.C0216h0;
import l.C0221k;
import l.C0235r;
import l.C0239t;
import l.C0243v;
import l.C0247x;
import l.C0249y;
import l.C0251z;
import l.InterfaceC0220j0;
import l.InterfaceC0222k0;
import l.X0;
import l.c1;
import l.e1;
import l.h1;

/* loaded from: classes.dex */
public final class z extends n implements InterfaceC0165k, LayoutInflater.Factory2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final o.k f2488h0 = new o.k();

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f2489i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f2490j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f2491A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f2492B;

    /* renamed from: C, reason: collision with root package name */
    public View f2493C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2494D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2495E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2496G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2497H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2498I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2499J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2500K;

    /* renamed from: L, reason: collision with root package name */
    public y[] f2501L;

    /* renamed from: M, reason: collision with root package name */
    public y f2502M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2503N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2504O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2505P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2506Q;

    /* renamed from: R, reason: collision with root package name */
    public Configuration f2507R;

    /* renamed from: S, reason: collision with root package name */
    public final int f2508S;

    /* renamed from: T, reason: collision with root package name */
    public int f2509T;

    /* renamed from: U, reason: collision with root package name */
    public int f2510U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2511V;

    /* renamed from: W, reason: collision with root package name */
    public v f2512W;

    /* renamed from: X, reason: collision with root package name */
    public v f2513X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f2514Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2515Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2517b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f2518c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2519d0;

    /* renamed from: e0, reason: collision with root package name */
    public C0122C f2520e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2521f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f2522g0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2523j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2524k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2525l;

    /* renamed from: m, reason: collision with root package name */
    public u f2526m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2527n;

    /* renamed from: o, reason: collision with root package name */
    public J f2528o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2529p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2530q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0220j0 f2531r;

    /* renamed from: s, reason: collision with root package name */
    public p f2532s;

    /* renamed from: t, reason: collision with root package name */
    public p f2533t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0147a f2534u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2535v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2536w;

    /* renamed from: x, reason: collision with root package name */
    public o f2537x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2539z;

    /* renamed from: y, reason: collision with root package name */
    public Z f2538y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final o f2516a0 = new o(this, 0);

    public z(Context context, Window window, InterfaceC0137j interfaceC0137j, Object obj) {
        AbstractActivityC0136i abstractActivityC0136i;
        this.f2508S = -100;
        this.f2524k = context;
        this.f2523j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0136i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0136i = (AbstractActivityC0136i) context;
                    break;
                }
            }
            abstractActivityC0136i = null;
            if (abstractActivityC0136i != null) {
                this.f2508S = ((z) abstractActivityC0136i.l()).f2508S;
            }
        }
        if (this.f2508S == -100) {
            o.k kVar = f2488h0;
            Integer num = (Integer) kVar.getOrDefault(this.f2523j.getClass().getName(), null);
            if (num != null) {
                this.f2508S = num.intValue();
                kVar.remove(this.f2523j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        C0239t.d();
    }

    public static G.f m(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = n.f2458c) == null) {
            return null;
        }
        G.f b2 = s.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f209a;
        if (gVar.f210a.isEmpty()) {
            fVar2 = G.f.f208b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f209a.f210a.size() + gVar.f210a.size()) {
                Locale locale = i < gVar.f210a.size() ? gVar.f210a.get(i) : b2.f209a.f210a.get(i - gVar.f210a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f209a.f210a.isEmpty() ? b2 : fVar2;
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
            s.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f2515Z = (1 << i) | this.f2515Z;
        if (this.f2514Y) {
            return;
        }
        View decorView = this.f2525l.getDecorView();
        o oVar = this.f2516a0;
        WeakHashMap weakHashMap = S.f365a;
        decorView.postOnAnimation(oVar);
        this.f2514Y = true;
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
                if (this.f2513X == null) {
                    this.f2513X = new v(this, context);
                }
                return this.f2513X.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0222k0 interfaceC0222k0;
        X0 x02;
        boolean z2 = this.f2503N;
        this.f2503N = false;
        y y2 = y(0);
        if (y2.f2484m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0147a abstractC0147a = this.f2534u;
        if (abstractC0147a != null) {
            abstractC0147a.a();
            return true;
        }
        z();
        J j2 = this.f2528o;
        if (j2 == null || (interfaceC0222k0 = j2.f2397e) == null || (x02 = ((c1) interfaceC0222k0).f2953a.f1360L) == null || x02.f2933b == null) {
            return false;
        }
        X0 x03 = ((c1) interfaceC0222k0).f2953a.f1360L;
        C0169o c0169o = x03 == null ? null : x03.f2933b;
        if (c0169o != null) {
            c0169o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2739f.getCount() > 0) goto L88;
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
        if (yVar.f2484m || this.f2506Q) {
            return;
        }
        int i2 = yVar.f2475a;
        Context context = this.f2524k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2525l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, yVar.h)) {
            r(yVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(yVar, keyEvent)) {
            return;
        }
        x xVar = yVar.f2478e;
        if (xVar == null || yVar.f2485n) {
            if (xVar == null) {
                z();
                J j2 = this.f2528o;
                Context T2 = j2 != null ? j2.T() : null;
                if (T2 != null) {
                    context = T2;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.clutchquizarena.app.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.clutchquizarena.app.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.clutchquizarena.app.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0149c c0149c = new C0149c(context, 0);
                c0149c.getTheme().setTo(newTheme);
                yVar.f2481j = c0149c;
                TypedArray obtainStyledAttributes = c0149c.obtainStyledAttributes(f.a.f2115j);
                yVar.f2476b = obtainStyledAttributes.getResourceId(86, 0);
                yVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                yVar.f2478e = new x(this, yVar.f2481j);
                yVar.f2477c = 81;
            } else if (yVar.f2485n && xVar.getChildCount() > 0) {
                yVar.f2478e.removeAllViews();
            }
            View view = yVar.f2480g;
            if (view == null) {
                if (yVar.h != null) {
                    if (this.f2533t == null) {
                        this.f2533t = new p(this, 3);
                    }
                    p pVar = this.f2533t;
                    if (yVar.i == null) {
                        C0163i c0163i = new C0163i(yVar.f2481j);
                        yVar.i = c0163i;
                        c0163i.f2738e = pVar;
                        MenuC0167m menuC0167m = yVar.h;
                        menuC0167m.b(c0163i, menuC0167m.f2746a);
                    }
                    C0163i c0163i2 = yVar.i;
                    x xVar2 = yVar.f2478e;
                    if (c0163i2.d == null) {
                        c0163i2.d = (ExpandedMenuView) c0163i2.f2736b.inflate(com.clutchquizarena.app.R.layout.abc_expanded_menu_layout, (ViewGroup) xVar2, false);
                        if (c0163i2.f2739f == null) {
                            c0163i2.f2739f = new C0162h(c0163i2);
                        }
                        c0163i2.d.setAdapter((ListAdapter) c0163i2.f2739f);
                        c0163i2.d.setOnItemClickListener(c0163i2);
                    }
                    ExpandedMenuView expandedMenuView = c0163i2.d;
                    yVar.f2479f = expandedMenuView;
                }
                yVar.f2485n = true;
                return;
            }
            yVar.f2479f = view;
            if (yVar.f2479f != null) {
                if (yVar.f2480g == null) {
                    C0163i c0163i3 = yVar.i;
                    if (c0163i3.f2739f == null) {
                        c0163i3.f2739f = new C0162h(c0163i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = yVar.f2479f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                yVar.f2478e.setBackgroundResource(yVar.f2476b);
                ViewParent parent = yVar.f2479f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(yVar.f2479f);
                }
                yVar.f2478e.addView(yVar.f2479f, layoutParams2);
                if (!yVar.f2479f.hasFocus()) {
                    yVar.f2479f.requestFocus();
                }
            }
            yVar.f2485n = true;
            return;
        }
        View view2 = yVar.f2480g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            yVar.f2483l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = yVar.f2477c;
            layoutParams3.windowAnimations = yVar.d;
            windowManager.addView(yVar.f2478e, layoutParams3);
            yVar.f2484m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        yVar.f2483l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = yVar.f2477c;
        layoutParams32.windowAnimations = yVar.d;
        windowManager.addView(yVar.f2478e, layoutParams32);
        yVar.f2484m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(y yVar, int i, KeyEvent keyEvent) {
        MenuC0167m menuC0167m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((yVar.f2482k || F(yVar, keyEvent)) && (menuC0167m = yVar.h) != null) {
            return menuC0167m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(y yVar, KeyEvent keyEvent) {
        InterfaceC0220j0 interfaceC0220j0;
        InterfaceC0220j0 interfaceC0220j02;
        Resources.Theme theme;
        InterfaceC0220j0 interfaceC0220j03;
        InterfaceC0220j0 interfaceC0220j04;
        if (this.f2506Q) {
            return false;
        }
        if (yVar.f2482k) {
            return true;
        }
        y yVar2 = this.f2502M;
        if (yVar2 != null && yVar2 != yVar) {
            r(yVar2, false);
        }
        Window.Callback callback = this.f2525l.getCallback();
        int i = yVar.f2475a;
        if (callback != null) {
            yVar.f2480g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0220j04 = this.f2531r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0220j04;
            actionBarOverlayLayout.k();
            ((c1) actionBarOverlayLayout.f1303e).f2961l = true;
        }
        if (yVar.f2480g == null) {
            MenuC0167m menuC0167m = yVar.h;
            if (menuC0167m == null || yVar.f2486o) {
                if (menuC0167m == null) {
                    Context context = this.f2524k;
                    if ((i == 0 || i == 108) && this.f2531r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.clutchquizarena.app.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.clutchquizarena.app.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.clutchquizarena.app.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0149c c0149c = new C0149c(context, 0);
                            c0149c.getTheme().setTo(theme);
                            context = c0149c;
                        }
                    }
                    MenuC0167m menuC0167m2 = new MenuC0167m(context);
                    menuC0167m2.f2749e = this;
                    MenuC0167m menuC0167m3 = yVar.h;
                    if (menuC0167m2 != menuC0167m3) {
                        if (menuC0167m3 != null) {
                            menuC0167m3.r(yVar.i);
                        }
                        yVar.h = menuC0167m2;
                        C0163i c0163i = yVar.i;
                        if (c0163i != null) {
                            menuC0167m2.b(c0163i, menuC0167m2.f2746a);
                        }
                    }
                    if (yVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0220j02 = this.f2531r) != null) {
                    if (this.f2532s == null) {
                        this.f2532s = new p(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0220j02).l(yVar.h, this.f2532s);
                }
                yVar.h.w();
                if (!callback.onCreatePanelMenu(i, yVar.h)) {
                    MenuC0167m menuC0167m4 = yVar.h;
                    if (menuC0167m4 != null) {
                        if (menuC0167m4 != null) {
                            menuC0167m4.r(yVar.i);
                        }
                        yVar.h = null;
                    }
                    if (z2 && (interfaceC0220j0 = this.f2531r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0220j0).l(null, this.f2532s);
                    }
                    return false;
                }
                yVar.f2486o = false;
            }
            yVar.h.w();
            Bundle bundle = yVar.f2487p;
            if (bundle != null) {
                yVar.h.s(bundle);
                yVar.f2487p = null;
            }
            if (!callback.onPreparePanel(0, yVar.f2480g, yVar.h)) {
                if (z2 && (interfaceC0220j03 = this.f2531r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0220j03).l(null, this.f2532s);
                }
                yVar.h.v();
                return false;
            }
            yVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            yVar.h.v();
        }
        yVar.f2482k = true;
        yVar.f2483l = false;
        this.f2502M = yVar;
        return true;
    }

    public final void G() {
        if (this.f2539z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2521f0 != null && (y(0).f2484m || this.f2534u != null)) {
                z2 = true;
            }
            if (z2 && this.f2522g0 == null) {
                this.f2522g0 = t.b(this.f2521f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2522g0) == null) {
                    return;
                }
                t.c(this.f2521f0, onBackInvokedCallback);
                this.f2522g0 = null;
            }
        }
    }

    @Override // g.n
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2524k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof z) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.n
    public final void c() {
        String str;
        this.f2504O = true;
        k(false, true);
        w();
        Object obj = this.f2523j;
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
                J j2 = this.f2528o;
                if (j2 == null) {
                    this.f2517b0 = true;
                } else {
                    j2.V(true);
                }
            }
            synchronized (n.h) {
                n.e(this);
                n.f2461g.add(new WeakReference(this));
            }
        }
        this.f2507R = new Configuration(this.f2524k.getResources().getConfiguration());
        this.f2505P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // g.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        v vVar;
        v vVar2;
        if (this.f2523j instanceof Activity) {
            synchronized (n.h) {
                n.e(this);
            }
        }
        if (this.f2514Y) {
            this.f2525l.getDecorView().removeCallbacks(this.f2516a0);
        }
        this.f2506Q = true;
        if (this.f2508S != -100) {
            Object obj = this.f2523j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2488h0.put(this.f2523j.getClass().getName(), Integer.valueOf(this.f2508S));
                vVar = this.f2512W;
                if (vVar != null) {
                    vVar.c();
                }
                vVar2 = this.f2513X;
                if (vVar2 == null) {
                    vVar2.c();
                    return;
                }
                return;
            }
        }
        f2488h0.remove(this.f2523j.getClass().getName());
        vVar = this.f2512W;
        if (vVar != null) {
        }
        vVar2 = this.f2513X;
        if (vVar2 == null) {
        }
    }

    @Override // g.n
    public final boolean f(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2499J && i == 108) {
            return false;
        }
        if (this.F && i == 1) {
            this.F = false;
        }
        if (i == 1) {
            G();
            this.f2499J = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2494D = true;
            return true;
        }
        if (i == 5) {
            G();
            this.f2495E = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2497H = true;
            return true;
        }
        if (i == 108) {
            G();
            this.F = true;
            return true;
        }
        if (i != 109) {
            return this.f2525l.requestFeature(i);
        }
        G();
        this.f2496G = true;
        return true;
    }

    @Override // g.n
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2491A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2524k).inflate(i, viewGroup);
        this.f2526m.a(this.f2525l.getCallback());
    }

    @Override // g.n
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2491A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2526m.a(this.f2525l.getCallback());
    }

    @Override // g.n
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2491A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2526m.a(this.f2525l.getCallback());
    }

    @Override // g.n
    public final void j(CharSequence charSequence) {
        this.f2530q = charSequence;
        InterfaceC0220j0 interfaceC0220j0 = this.f2531r;
        if (interfaceC0220j0 != null) {
            interfaceC0220j0.setWindowTitle(charSequence);
            return;
        }
        J j2 = this.f2528o;
        if (j2 == null) {
            TextView textView = this.f2492B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        c1 c1Var = (c1) j2.f2397e;
        if (c1Var.f2958g) {
            return;
        }
        c1Var.h = charSequence;
        if ((c1Var.f2954b & 8) != 0) {
            Toolbar toolbar = c1Var.f2953a;
            toolbar.setTitle(charSequence);
            if (c1Var.f2958g) {
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
        if (this.f2506Q) {
            return false;
        }
        int i3 = this.f2508S;
        if (i3 == -100) {
            i3 = n.f2457b;
        }
        Context context = this.f2524k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f m2 = i4 < 33 ? m(context) : null;
        if (!z3 && m2 != null) {
            m2 = s.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, m2, null, false);
        boolean z5 = this.f2511V;
        Object obj = this.f2523j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2507R;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                G.f b3 = s.b(configuration);
                b2 = m2 != null ? null : s.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2504O && ((f2490j0 || this.f2505P) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new B0.b(12, activity));
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
                            int i8 = this.f2509T;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2509T, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.t) {
                                    if (((androidx.lifecycle.t) activity2).d().d.compareTo(EnumC0072m.f1505c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2505P && !this.f2506Q) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0136i)) {
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
                            v vVar = this.f2512W;
                            if (vVar != null) {
                                vVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2513X == null) {
                                this.f2513X = new v(this, context);
                            }
                            this.f2513X.i();
                        } else {
                            v vVar2 = this.f2513X;
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
                    this.f2510U = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2510U = 0;
            }
        }
        this.f2511V = true;
        i = this.f2510U;
        configuration = this.f2507R;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        G.f b32 = s.b(configuration);
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
        if (this.f2525l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof u) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        u uVar = new u(this, callback);
        this.f2526m = uVar;
        window.setCallback(uVar);
        int[] iArr = f2489i0;
        Context context = this.f2524k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0239t a2 = C0239t.a();
            synchronized (a2) {
                drawable = a2.f3050a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2525l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2521f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2522g0) != null) {
            t.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2522g0 = null;
        }
        Object obj = this.f2523j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2521f0 = t.a(activity);
                H();
            }
        }
        this.f2521f0 = null;
        H();
    }

    public final void n(int i, y yVar, MenuC0167m menuC0167m) {
        if (menuC0167m == null) {
            if (yVar == null && i >= 0) {
                y[] yVarArr = this.f2501L;
                if (i < yVarArr.length) {
                    yVar = yVarArr[i];
                }
            }
            if (yVar != null) {
                menuC0167m = yVar.h;
            }
        }
        if ((yVar == null || yVar.f2484m) && !this.f2506Q) {
            u uVar = this.f2526m;
            Window.Callback callback = this.f2525l.getCallback();
            uVar.getClass();
            try {
                uVar.d = true;
                callback.onPanelClosed(i, menuC0167m);
            } finally {
                uVar.d = false;
            }
        }
    }

    public final void o(MenuC0167m menuC0167m) {
        C0221k c0221k;
        if (this.f2500K) {
            return;
        }
        this.f2500K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2531r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.f1303e).f2953a.f1366a;
        if (actionMenuView != null && (c0221k = actionMenuView.f1327t) != null) {
            c0221k.e();
            C0213g c0213g = c0221k.f3003t;
            if (c0213g != null && c0213g.b()) {
                c0213g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2525l.getCallback();
        if (callback != null && !this.f2506Q) {
            callback.onPanelClosed(108, menuC0167m);
        }
        this.f2500K = false;
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
        View c0185d;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2520e0 == null) {
            int[] iArr = f.a.f2115j;
            Context context2 = this.f2524k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2520e0 = new C0122C();
            } else {
                try {
                    this.f2520e0 = (C0122C) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2520e0 = new C0122C();
                }
            }
        }
        C0122C c0122c = this.f2520e0;
        int i2 = e1.f2965a;
        c0122c.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2129x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0149c = (resourceId == 0 || ((context instanceof C0149c) && ((C0149c) context).f2593a == resourceId)) ? context : new C0149c(context, resourceId);
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
                c0185d = new C0185D(c0149c, attributeSet);
                break;
            case 1:
                c0185d = new C0235r(c0149c, attributeSet);
                break;
            case 2:
                c0185d = new C0251z(c0149c, attributeSet);
                break;
            case 3:
                c0185d = c0122c.e(c0149c, attributeSet);
                break;
            case 4:
                c0185d = new C0247x(c0149c, attributeSet, com.clutchquizarena.app.R.attr.imageButtonStyle);
                break;
            case 5:
                c0185d = new C0187F(c0149c, attributeSet);
                break;
            case 6:
                c0185d = new C0197P(c0149c, attributeSet);
                break;
            case 7:
                c0185d = c0122c.d(c0149c, attributeSet);
                break;
            case '\b':
                c0185d = new C0216h0(c0149c, attributeSet);
                break;
            case '\t':
                c0185d = new C0249y(c0149c, attributeSet, 0);
                break;
            case '\n':
                c0185d = c0122c.a(c0149c, attributeSet);
                break;
            case 11:
                c0185d = c0122c.c(c0149c, attributeSet);
                break;
            case '\f':
                c0185d = new C0243v(c0149c, attributeSet);
                break;
            case '\r':
                c0185d = c0122c.b(c0149c, attributeSet);
                break;
            default:
                c0185d = null;
                break;
        }
        if (c0185d == null && context != c0149c) {
            Object[] objArr = c0122c.f2379a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0149c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0122C.f2378g;
                        if (i3 < 3) {
                            View f2 = c0122c.f(c0149c, str2, strArr[i3]);
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
                    View f3 = c0122c.f(c0149c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0185d = view2;
        }
        if (c0185d != null) {
            Context context3 = c0185d.getContext();
            if ((context3 instanceof ContextWrapper) && c0185d.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0122C.f2375c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0185d.setOnClickListener(new ViewOnClickListenerC0121B(c0185d, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0149c.obtainStyledAttributes(attributeSet, C0122C.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = S.f365a;
                    i = 0;
                    new K.B(com.clutchquizarena.app.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(c0185d, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0149c.obtainStyledAttributes(attributeSet, C0122C.f2376e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    S.m(c0185d, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0149c.obtainStyledAttributes(attributeSet, C0122C.f2377f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = S.f365a;
                    new K.B(com.clutchquizarena.app.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).f(c0185d, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0185d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0165k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(MenuC0167m menuC0167m) {
        ActionMenuView actionMenuView;
        C0221k c0221k;
        C0221k c0221k2;
        C0221k c0221k3;
        InterfaceC0220j0 interfaceC0220j0 = this.f2531r;
        if (interfaceC0220j0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0220j0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((c1) actionBarOverlayLayout.f1303e).f2953a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1366a) != null && actionMenuView.f1326s) {
                if (ViewConfiguration.get(this.f2524k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2531r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.f1303e).f2953a.f1366a;
                    if (actionMenuView2 != null) {
                        C0221k c0221k4 = actionMenuView2.f1327t;
                        if (c0221k4 != null) {
                            if (c0221k4.f3004u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2525l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2531r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.f1303e).f2953a.f1366a;
                if ((actionMenuView3 == null || (c0221k3 = actionMenuView3.f1327t) == null || !c0221k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2531r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.f1303e).f2953a.f1366a;
                    if (actionMenuView4 != null && (c0221k2 = actionMenuView4.f1327t) != null) {
                        c0221k2.e();
                    }
                    if (this.f2506Q) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2506Q) {
                    return;
                }
                if (this.f2514Y && (1 & this.f2515Z) != 0) {
                    View decorView = this.f2525l.getDecorView();
                    o oVar = this.f2516a0;
                    decorView.removeCallbacks(oVar);
                    oVar.run();
                }
                y y2 = y(0);
                MenuC0167m menuC0167m2 = y2.h;
                if (menuC0167m2 == null || y2.f2486o || !callback.onPreparePanel(0, y2.f2480g, menuC0167m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2531r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((c1) actionBarOverlayLayout5.f1303e).f2953a.f1366a;
                if (actionMenuView5 == null || (c0221k = actionMenuView5.f1327t) == null) {
                    return;
                }
                c0221k.l();
                return;
            }
        }
        y y3 = y(0);
        y3.f2485n = true;
        r(y3, false);
        D(y3, null);
    }

    @Override // k.InterfaceC0165k
    public final boolean q(MenuC0167m menuC0167m, MenuItem menuItem) {
        y yVar;
        Window.Callback callback = this.f2525l.getCallback();
        if (callback != null && !this.f2506Q) {
            MenuC0167m k2 = menuC0167m.k();
            y[] yVarArr = this.f2501L;
            int length = yVarArr != null ? yVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    yVar = yVarArr[i];
                    if (yVar != null && yVar.h == k2) {
                        break;
                    }
                    i++;
                } else {
                    yVar = null;
                    break;
                }
            }
            if (yVar != null) {
                return callback.onMenuItemSelected(yVar.f2475a, menuItem);
            }
        }
        return false;
    }

    public final void r(y yVar, boolean z2) {
        x xVar;
        InterfaceC0220j0 interfaceC0220j0;
        C0221k c0221k;
        if (z2 && yVar.f2475a == 0 && (interfaceC0220j0 = this.f2531r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0220j0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.f1303e).f2953a.f1366a;
            if (actionMenuView != null && (c0221k = actionMenuView.f1327t) != null && c0221k.i()) {
                o(yVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2524k.getSystemService("window");
        if (windowManager != null && yVar.f2484m && (xVar = yVar.f2478e) != null) {
            windowManager.removeView(xVar);
            if (z2) {
                n(yVar.f2475a, yVar, null);
            }
        }
        yVar.f2482k = false;
        yVar.f2483l = false;
        yVar.f2484m = false;
        yVar.f2479f = null;
        yVar.f2485n = true;
        if (this.f2502M == yVar) {
            this.f2502M = null;
        }
        if (yVar.f2475a == 0) {
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
        C0221k c0221k;
        Object obj = this.f2523j;
        if (((obj instanceof InterfaceC0011l) || (obj instanceof DialogInterfaceC0133f)) && (decorView = this.f2525l.getDecorView()) != null && A.c.A(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            u uVar = this.f2526m;
            Window.Callback callback = this.f2525l.getCallback();
            uVar.getClass();
            try {
                uVar.f2470c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                uVar.f2470c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2503N = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                y y2 = y(0);
                if (y2.f2484m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2534u != null) {
                    return true;
                }
                y y3 = y(0);
                InterfaceC0220j0 interfaceC0220j0 = this.f2531r;
                Context context = this.f2524k;
                if (interfaceC0220j0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0220j0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((c1) actionBarOverlayLayout.f1303e).f2953a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1366a) != null && actionMenuView.f1326s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2531r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.f1303e).f2953a.f1366a;
                        if (actionMenuView2 == null || (c0221k = actionMenuView2.f1327t) == null || !c0221k.i()) {
                            if (!this.f2506Q && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2531r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.f1303e).f2953a.f1366a;
                                if (actionMenuView3 != null) {
                                    C0221k c0221k2 = actionMenuView3.f1327t;
                                    if (c0221k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2531r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.f1303e).f2953a.f1366a;
                            if (actionMenuView4 != null) {
                                C0221k c0221k3 = actionMenuView4.f1327t;
                                if (c0221k3 != null) {
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
                boolean z4 = y3.f2484m;
                if (z4 || y3.f2483l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2482k) {
                        if (y3.f2486o) {
                            y3.f2482k = false;
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
        if (y2.h != null) {
            Bundle bundle = new Bundle();
            y2.h.t(bundle);
            if (bundle.size() > 0) {
                y2.f2487p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2486o = true;
        y2.f2485n = true;
        if ((i == 108 || i == 0) && this.f2531r != null) {
            y y3 = y(0);
            y3.f2482k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2539z) {
            return;
        }
        int[] iArr = f.a.f2115j;
        Context context = this.f2524k;
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
        this.f2498I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2525l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2499J) {
            viewGroup = this.f2497H ? (ViewGroup) from.inflate(com.clutchquizarena.app.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.clutchquizarena.app.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2498I) {
            viewGroup = (ViewGroup) from.inflate(com.clutchquizarena.app.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2496G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.clutchquizarena.app.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0149c(context, typedValue.resourceId) : context).inflate(com.clutchquizarena.app.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0220j0 interfaceC0220j0 = (InterfaceC0220j0) viewGroup.findViewById(com.clutchquizarena.app.R.id.decor_content_parent);
            this.f2531r = interfaceC0220j0;
            interfaceC0220j0.setWindowCallback(this.f2525l.getCallback());
            if (this.f2496G) {
                ((ActionBarOverlayLayout) this.f2531r).j(109);
            }
            if (this.f2494D) {
                ((ActionBarOverlayLayout) this.f2531r).j(2);
            }
            if (this.f2495E) {
                ((ActionBarOverlayLayout) this.f2531r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.f2496G + ", android:windowIsFloating: " + this.f2498I + ", windowActionModeOverlay: " + this.f2497H + ", windowNoTitle: " + this.f2499J + " }");
        }
        p pVar = new p(this, i2);
        WeakHashMap weakHashMap = S.f365a;
        K.G.u(viewGroup, pVar);
        if (this.f2531r == null) {
            this.f2492B = (TextView) viewGroup.findViewById(com.clutchquizarena.app.R.id.title);
        }
        boolean z2 = h1.f2982a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.clutchquizarena.app.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2525l.findViewById(R.id.content);
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
        this.f2525l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new p(this, i));
        this.f2491A = viewGroup;
        Object obj = this.f2523j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2530q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0220j0 interfaceC0220j02 = this.f2531r;
            if (interfaceC0220j02 != null) {
                interfaceC0220j02.setWindowTitle(title);
            } else {
                J j2 = this.f2528o;
                if (j2 != null) {
                    c1 c1Var = (c1) j2.f2397e;
                    if (!c1Var.f2958g) {
                        c1Var.h = title;
                        if ((c1Var.f2954b & 8) != 0) {
                            Toolbar toolbar = c1Var.f2953a;
                            toolbar.setTitle(title);
                            if (c1Var.f2958g) {
                                S.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2492B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2491A.findViewById(R.id.content);
        View decorView = this.f2525l.getDecorView();
        contentFrameLayout2.f1346g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2539z = true;
        y y2 = y(0);
        if (this.f2506Q || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2525l == null) {
            Object obj = this.f2523j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f2525l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0038g x(Context context) {
        if (this.f2512W == null) {
            if (C0012m.f420e == null) {
                Context applicationContext = context.getApplicationContext();
                C0012m.f420e = new C0012m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2512W = new v(this, C0012m.f420e);
        }
        return this.f2512W;
    }

    public final y y(int i) {
        y[] yVarArr = this.f2501L;
        if (yVarArr == null || yVarArr.length <= i) {
            y[] yVarArr2 = new y[i + 1];
            if (yVarArr != null) {
                System.arraycopy(yVarArr, 0, yVarArr2, 0, yVarArr.length);
            }
            this.f2501L = yVarArr2;
            yVarArr = yVarArr2;
        }
        y yVar = yVarArr[i];
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y();
        yVar2.f2475a = i;
        yVar2.f2485n = false;
        yVarArr[i] = yVar2;
        return yVar2;
    }

    public final void z() {
        v();
        if (this.F && this.f2528o == null) {
            Object obj = this.f2523j;
            if (obj instanceof Activity) {
                this.f2528o = new J((Activity) obj, this.f2496G);
            } else if (obj instanceof Dialog) {
                this.f2528o = new J((Dialog) obj);
            }
            J j2 = this.f2528o;
            if (j2 != null) {
                j2.V(this.f2517b0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
