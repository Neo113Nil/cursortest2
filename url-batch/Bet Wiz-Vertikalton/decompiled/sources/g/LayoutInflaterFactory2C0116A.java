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
import androidx.lifecycle.EnumC0070m;
import j.AbstractC0139a;
import j.C0141c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0155h;
import k.C0156i;
import k.C0162o;
import k.InterfaceC0158k;
import k.MenuC0160m;
import l.C0187A;
import l.C0191E;
import l.C0193G;
import l.C0203Q;
import l.C0217g;
import l.C0222i0;
import l.C0225k;
import l.C0241s;
import l.C0245u;
import l.C0249w;
import l.C0253y;
import l.C0255z;
import l.InterfaceC0226k0;
import l.InterfaceC0228l0;
import l.Y0;
import l.d1;
import l.f1;
import l.i1;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0116A extends o implements InterfaceC0158k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final o.k f2321i0 = new o.k();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f2322j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2323k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2324A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2325B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2326C;

    /* renamed from: D, reason: collision with root package name */
    public View f2327D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2328E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2329G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2330H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2331I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2332J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2333K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2334L;

    /* renamed from: M, reason: collision with root package name */
    public z[] f2335M;

    /* renamed from: N, reason: collision with root package name */
    public z f2336N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2337O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2338P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2339Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2340R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2341S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2342T;

    /* renamed from: U, reason: collision with root package name */
    public int f2343U;

    /* renamed from: V, reason: collision with root package name */
    public int f2344V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2345W;

    /* renamed from: X, reason: collision with root package name */
    public w f2346X;

    /* renamed from: Y, reason: collision with root package name */
    public w f2347Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2348Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2349a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2351c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2352d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2353e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0119D f2354f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2355g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2356h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2357j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2358k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2359l;

    /* renamed from: m, reason: collision with root package name */
    public v f2360m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2361n;

    /* renamed from: o, reason: collision with root package name */
    public K f2362o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2363p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2364q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0226k0 f2365r;

    /* renamed from: s, reason: collision with root package name */
    public q f2366s;

    /* renamed from: t, reason: collision with root package name */
    public q f2367t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0139a f2368u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2369v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2370w;

    /* renamed from: x, reason: collision with root package name */
    public p f2371x;

    /* renamed from: y, reason: collision with root package name */
    public Z f2372y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2373z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final p f2350b0 = new p(this, 0);

    public LayoutInflaterFactory2C0116A(Context context, Window window, InterfaceC0133j interfaceC0133j, Object obj) {
        AbstractActivityC0132i abstractActivityC0132i;
        this.f2342T = -100;
        this.f2358k = context;
        this.f2357j = obj;
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
                this.f2342T = ((LayoutInflaterFactory2C0116A) abstractActivityC0132i.l()).f2342T;
            }
        }
        if (this.f2342T == -100) {
            o.k kVar = f2321i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2357j.getClass().getName(), null);
            if (num != null) {
                this.f2342T = num.intValue();
                kVar.remove(this.f2357j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        C0245u.d();
    }

    public static G.f m(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.f2465c) == null) {
            return null;
        }
        G.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f245a;
        if (gVar.f246a.isEmpty()) {
            fVar2 = G.f.f244b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f245a.f246a.size() + gVar.f246a.size()) {
                Locale locale = i < gVar.f246a.size() ? gVar.f246a.get(i) : b2.f245a.f246a.get(i - gVar.f246a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f245a.f246a.isEmpty() ? b2 : fVar2;
    }

    public static Configuration r(Context context, int i, G.f fVar, Configuration configuration, boolean z2) {
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
        this.f2349a0 = (1 << i) | this.f2349a0;
        if (this.f2348Z) {
            return;
        }
        View decorView = this.f2359l.getDecorView();
        p pVar = this.f2350b0;
        WeakHashMap weakHashMap = S.f422a;
        decorView.postOnAnimation(pVar);
        this.f2348Z = true;
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
                if (this.f2347Y == null) {
                    this.f2347Y = new w(this, context);
                }
                return this.f2347Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0228l0 interfaceC0228l0;
        Y0 y0;
        boolean z2 = this.f2337O;
        this.f2337O = false;
        z y2 = y(0);
        if (y2.f2491m) {
            if (!z2) {
                p(y2, true);
            }
            return true;
        }
        AbstractC0139a abstractC0139a = this.f2368u;
        if (abstractC0139a != null) {
            abstractC0139a.a();
            return true;
        }
        z();
        K k2 = this.f2362o;
        if (k2 == null || (interfaceC0228l0 = k2.f2401e) == null || (y0 = ((d1) interfaceC0228l0).f2959a.f1323L) == null || y0.f2939b == null) {
            return false;
        }
        Y0 y02 = ((d1) interfaceC0228l0).f2959a.f1323L;
        C0162o c0162o = y02 == null ? null : y02.f2939b;
        if (c0162o != null) {
            c0162o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2654f.getCount() > 0) goto L88;
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
        if (zVar.f2491m || this.f2340R) {
            return;
        }
        int i2 = zVar.f2482a;
        Context context = this.f2358k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2359l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, zVar.h)) {
            p(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f2485e;
        if (yVar == null || zVar.f2492n) {
            if (yVar == null) {
                z();
                K k2 = this.f2362o;
                Context m02 = k2 != null ? k2.m0() : null;
                if (m02 != null) {
                    context = m02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.neonpulse.gridlogic.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.neonpulse.gridlogic.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.neonpulse.gridlogic.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0141c c0141c = new C0141c(context, 0);
                c0141c.getTheme().setTo(newTheme);
                zVar.f2488j = c0141c;
                TypedArray obtainStyledAttributes = c0141c.obtainStyledAttributes(f.a.f2063j);
                zVar.f2483b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f2485e = new y(this, zVar.f2488j);
                zVar.f2484c = 81;
            } else if (zVar.f2492n && yVar.getChildCount() > 0) {
                zVar.f2485e.removeAllViews();
            }
            View view = zVar.f2487g;
            if (view == null) {
                if (zVar.h != null) {
                    if (this.f2367t == null) {
                        this.f2367t = new q(this, 3);
                    }
                    q qVar = this.f2367t;
                    if (zVar.i == null) {
                        C0156i c0156i = new C0156i(zVar.f2488j);
                        zVar.i = c0156i;
                        c0156i.f2653e = qVar;
                        MenuC0160m menuC0160m = zVar.h;
                        menuC0160m.b(c0156i, menuC0160m.f2661a);
                    }
                    C0156i c0156i2 = zVar.i;
                    y yVar2 = zVar.f2485e;
                    if (c0156i2.d == null) {
                        c0156i2.d = (ExpandedMenuView) c0156i2.f2651b.inflate(com.neonpulse.gridlogic.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c0156i2.f2654f == null) {
                            c0156i2.f2654f = new C0155h(c0156i2);
                        }
                        c0156i2.d.setAdapter((ListAdapter) c0156i2.f2654f);
                        c0156i2.d.setOnItemClickListener(c0156i2);
                    }
                    ExpandedMenuView expandedMenuView = c0156i2.d;
                    zVar.f2486f = expandedMenuView;
                }
                zVar.f2492n = true;
                return;
            }
            zVar.f2486f = view;
            if (zVar.f2486f != null) {
                if (zVar.f2487g == null) {
                    C0156i c0156i3 = zVar.i;
                    if (c0156i3.f2654f == null) {
                        c0156i3.f2654f = new C0155h(c0156i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f2486f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f2485e.setBackgroundResource(zVar.f2483b);
                ViewParent parent = zVar.f2486f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f2486f);
                }
                zVar.f2485e.addView(zVar.f2486f, layoutParams2);
                if (!zVar.f2486f.hasFocus()) {
                    zVar.f2486f.requestFocus();
                }
            }
            zVar.f2492n = true;
            return;
        }
        View view2 = zVar.f2487g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f2490l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f2484c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f2485e, layoutParams3);
            zVar.f2491m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f2490l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f2484c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f2485e, layoutParams32);
        zVar.f2491m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        MenuC0160m menuC0160m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f2489k || F(zVar, keyEvent)) && (menuC0160m = zVar.h) != null) {
            return menuC0160m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(z zVar, KeyEvent keyEvent) {
        InterfaceC0226k0 interfaceC0226k0;
        InterfaceC0226k0 interfaceC0226k02;
        Resources.Theme theme;
        InterfaceC0226k0 interfaceC0226k03;
        InterfaceC0226k0 interfaceC0226k04;
        if (this.f2340R) {
            return false;
        }
        if (zVar.f2489k) {
            return true;
        }
        z zVar2 = this.f2336N;
        if (zVar2 != null && zVar2 != zVar) {
            p(zVar2, false);
        }
        Window.Callback callback = this.f2359l.getCallback();
        int i = zVar.f2482a;
        if (callback != null) {
            zVar.f2487g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0226k04 = this.f2365r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0226k04;
            actionBarOverlayLayout.k();
            ((d1) actionBarOverlayLayout.f1269e).f2967l = true;
        }
        if (zVar.f2487g == null) {
            MenuC0160m menuC0160m = zVar.h;
            if (menuC0160m == null || zVar.f2493o) {
                if (menuC0160m == null) {
                    Context context = this.f2358k;
                    if ((i == 0 || i == 108) && this.f2365r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.neonpulse.gridlogic.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.neonpulse.gridlogic.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.neonpulse.gridlogic.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0141c c0141c = new C0141c(context, 0);
                            c0141c.getTheme().setTo(theme);
                            context = c0141c;
                        }
                    }
                    MenuC0160m menuC0160m2 = new MenuC0160m(context);
                    menuC0160m2.f2664e = this;
                    MenuC0160m menuC0160m3 = zVar.h;
                    if (menuC0160m2 != menuC0160m3) {
                        if (menuC0160m3 != null) {
                            menuC0160m3.r(zVar.i);
                        }
                        zVar.h = menuC0160m2;
                        C0156i c0156i = zVar.i;
                        if (c0156i != null) {
                            menuC0160m2.b(c0156i, menuC0160m2.f2661a);
                        }
                    }
                    if (zVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0226k02 = this.f2365r) != null) {
                    if (this.f2366s == null) {
                        this.f2366s = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0226k02).l(zVar.h, this.f2366s);
                }
                zVar.h.w();
                if (!callback.onCreatePanelMenu(i, zVar.h)) {
                    MenuC0160m menuC0160m4 = zVar.h;
                    if (menuC0160m4 != null) {
                        if (menuC0160m4 != null) {
                            menuC0160m4.r(zVar.i);
                        }
                        zVar.h = null;
                    }
                    if (z2 && (interfaceC0226k0 = this.f2365r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0226k0).l(null, this.f2366s);
                    }
                    return false;
                }
                zVar.f2493o = false;
            }
            zVar.h.w();
            Bundle bundle = zVar.f2494p;
            if (bundle != null) {
                zVar.h.s(bundle);
                zVar.f2494p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f2487g, zVar.h)) {
                if (z2 && (interfaceC0226k03 = this.f2365r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0226k03).l(null, this.f2366s);
                }
                zVar.h.v();
                return false;
            }
            zVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            zVar.h.v();
        }
        zVar.f2489k = true;
        zVar.f2490l = false;
        this.f2336N = zVar;
        return true;
    }

    public final void G() {
        if (this.f2324A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2355g0 != null && (y(0).f2491m || this.f2368u != null)) {
                z2 = true;
            }
            if (z2 && this.f2356h0 == null) {
                this.f2356h0 = u.b(this.f2355g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2356h0) == null) {
                    return;
                }
                u.c(this.f2355g0, onBackInvokedCallback);
                this.f2356h0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2358k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0116A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.o
    public final void c() {
        String str;
        this.f2338P = true;
        k(false, true);
        w();
        Object obj = this.f2357j;
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
                K k2 = this.f2362o;
                if (k2 == null) {
                    this.f2351c0 = true;
                } else {
                    k2.o0(true);
                }
            }
            synchronized (o.h) {
                o.e(this);
                o.f2468g.add(new WeakReference(this));
            }
        }
        this.f2341S = new Configuration(this.f2358k.getResources().getConfiguration());
        this.f2339Q = true;
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
        if (this.f2357j instanceof Activity) {
            synchronized (o.h) {
                o.e(this);
            }
        }
        if (this.f2348Z) {
            this.f2359l.getDecorView().removeCallbacks(this.f2350b0);
        }
        this.f2340R = true;
        if (this.f2342T != -100) {
            Object obj = this.f2357j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2321i0.put(this.f2357j.getClass().getName(), Integer.valueOf(this.f2342T));
                wVar = this.f2346X;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.f2347Y;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f2321i0.remove(this.f2357j.getClass().getName());
        wVar = this.f2346X;
        if (wVar != null) {
        }
        wVar2 = this.f2347Y;
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
        if (this.f2333K && i == 108) {
            return false;
        }
        if (this.f2329G && i == 1) {
            this.f2329G = false;
        }
        if (i == 1) {
            G();
            this.f2333K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2328E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2331I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2329G = true;
            return true;
        }
        if (i != 109) {
            return this.f2359l.requestFeature(i);
        }
        G();
        this.f2330H = true;
        return true;
    }

    @Override // g.o
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2325B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2358k).inflate(i, viewGroup);
        this.f2360m.a(this.f2359l.getCallback());
    }

    @Override // g.o
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2325B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2360m.a(this.f2359l.getCallback());
    }

    @Override // g.o
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2325B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2360m.a(this.f2359l.getCallback());
    }

    @Override // g.o
    public final void j(CharSequence charSequence) {
        this.f2364q = charSequence;
        InterfaceC0226k0 interfaceC0226k0 = this.f2365r;
        if (interfaceC0226k0 != null) {
            interfaceC0226k0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2362o;
        if (k2 == null) {
            TextView textView = this.f2326C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        d1 d1Var = (d1) k2.f2401e;
        if (d1Var.f2964g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f2960b & 8) != 0) {
            Toolbar toolbar = d1Var.f2959a;
            toolbar.setTitle(charSequence);
            if (d1Var.f2964g) {
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
        if (this.f2340R) {
            return false;
        }
        int i3 = this.f2342T;
        if (i3 == -100) {
            i3 = o.f2464b;
        }
        Context context = this.f2358k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f m2 = i4 < 33 ? m(context) : null;
        if (!z3 && m2 != null) {
            m2 = t.b(context.getResources().getConfiguration());
        }
        Configuration r2 = r(context, B2, m2, null, false);
        boolean z5 = this.f2345W;
        Object obj = this.f2357j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2341S;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = r2.uiMode & 48;
                G.f b3 = t.b(configuration);
                b2 = m2 != null ? null : t.b(r2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2338P && ((f2323k0 || this.f2339Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(r2.getLayoutDirection());
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
                            int i8 = this.f2343U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2343U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).d().f1476c.compareTo(EnumC0070m.f1468c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2339Q && !this.f2340R) {
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
                            t.c(t.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).i();
                        } else {
                            w wVar = this.f2346X;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2347Y == null) {
                                this.f2347Y = new w(this, context);
                            }
                            this.f2347Y.i();
                        } else {
                            w wVar2 = this.f2347Y;
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
                    this.f2344V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2344V = 0;
            }
        }
        this.f2345W = true;
        i = this.f2344V;
        configuration = this.f2341S;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = r2.uiMode & 48;
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
        if (this.f2359l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f2360m = vVar;
        window.setCallback(vVar);
        int[] iArr = f2322j0;
        Context context = this.f2358k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0245u a2 = C0245u.a();
            synchronized (a2) {
                drawable = a2.f3059a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2359l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2355g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2356h0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2356h0 = null;
        }
        Object obj = this.f2357j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2355g0 = u.a(activity);
                H();
            }
        }
        this.f2355g0 = null;
        H();
    }

    public final void n(int i, z zVar, MenuC0160m menuC0160m) {
        if (menuC0160m == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f2335M;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                menuC0160m = zVar.h;
            }
        }
        if ((zVar == null || zVar.f2491m) && !this.f2340R) {
            v vVar = this.f2360m;
            Window.Callback callback = this.f2359l.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i, menuC0160m);
            } finally {
                vVar.d = false;
            }
        }
    }

    public final void o(MenuC0160m menuC0160m) {
        C0225k c0225k;
        if (this.f2334L) {
            return;
        }
        this.f2334L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2365r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1269e).f2959a.f1329a;
        if (actionMenuView != null && (c0225k = actionMenuView.f1293t) != null) {
            c0225k.e();
            C0217g c0217g = c0225k.f3009t;
            if (c0217g != null && c0217g.b()) {
                c0217g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2359l.getCallback();
        if (callback != null && !this.f2340R) {
            callback.onPanelClosed(108, menuC0160m);
        }
        this.f2334L = false;
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
        View c0191e;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2354f0 == null) {
            int[] iArr = f.a.f2063j;
            Context context2 = this.f2358k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2354f0 = new C0119D();
            } else {
                try {
                    this.f2354f0 = (C0119D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2354f0 = new C0119D();
                }
            }
        }
        C0119D c0119d = this.f2354f0;
        int i2 = f1.f2971a;
        c0119d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2077x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0141c = (resourceId == 0 || ((context instanceof C0141c) && ((C0141c) context).f2527a == resourceId)) ? context : new C0141c(context, resourceId);
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
                c0191e = new C0191E(c0141c, attributeSet);
                break;
            case 1:
                c0191e = new C0241s(c0141c, attributeSet);
                break;
            case 2:
                c0191e = new C0187A(c0141c, attributeSet);
                break;
            case 3:
                c0191e = c0119d.e(c0141c, attributeSet);
                break;
            case 4:
                c0191e = new C0253y(c0141c, attributeSet, com.neonpulse.gridlogic.R.attr.imageButtonStyle);
                break;
            case 5:
                c0191e = new C0193G(c0141c, attributeSet);
                break;
            case 6:
                c0191e = new C0203Q(c0141c, attributeSet);
                break;
            case 7:
                c0191e = c0119d.d(c0141c, attributeSet);
                break;
            case '\b':
                c0191e = new C0222i0(c0141c, attributeSet);
                break;
            case '\t':
                c0191e = new C0255z(c0141c, attributeSet, 0);
                break;
            case '\n':
                c0191e = c0119d.a(c0141c, attributeSet);
                break;
            case 11:
                c0191e = c0119d.c(c0141c, attributeSet);
                break;
            case '\f':
                c0191e = new C0249w(c0141c, attributeSet);
                break;
            case '\r':
                c0191e = c0119d.b(c0141c, attributeSet);
                break;
            default:
                c0191e = null;
                break;
        }
        if (c0191e == null && context != c0141c) {
            Object[] objArr = c0119d.f2383a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0141c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0119D.f2382g;
                        if (i3 < 3) {
                            View f2 = c0119d.f(c0141c, str2, strArr[i3]);
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
                    View f3 = c0119d.f(c0141c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0191e = view2;
        }
        if (c0191e != null) {
            Context context3 = c0191e.getContext();
            if ((context3 instanceof ContextWrapper) && c0191e.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0119D.f2379c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0191e.setOnClickListener(new ViewOnClickListenerC0118C(c0191e, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0141c.obtainStyledAttributes(attributeSet, C0119D.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = S.f422a;
                    i = 0;
                    new K.B(com.neonpulse.gridlogic.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0191e, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0141c.obtainStyledAttributes(attributeSet, C0119D.f2380e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    S.m(c0191e, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0141c.obtainStyledAttributes(attributeSet, C0119D.f2381f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = S.f422a;
                    new K.B(com.neonpulse.gridlogic.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0191e, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0191e;
    }

    public final void p(z zVar, boolean z2) {
        y yVar;
        InterfaceC0226k0 interfaceC0226k0;
        C0225k c0225k;
        if (z2 && zVar.f2482a == 0 && (interfaceC0226k0 = this.f2365r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0226k0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1269e).f2959a.f1329a;
            if (actionMenuView != null && (c0225k = actionMenuView.f1293t) != null && c0225k.i()) {
                o(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2358k.getSystemService("window");
        if (windowManager != null && zVar.f2491m && (yVar = zVar.f2485e) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                n(zVar.f2482a, zVar, null);
            }
        }
        zVar.f2489k = false;
        zVar.f2490l = false;
        zVar.f2491m = false;
        zVar.f2486f = null;
        zVar.f2492n = true;
        if (this.f2336N == zVar) {
            this.f2336N = null;
        }
        if (zVar.f2482a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0158k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(MenuC0160m menuC0160m) {
        ActionMenuView actionMenuView;
        C0225k c0225k;
        C0225k c0225k2;
        C0225k c0225k3;
        InterfaceC0226k0 interfaceC0226k0 = this.f2365r;
        if (interfaceC0226k0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0226k0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((d1) actionBarOverlayLayout.f1269e).f2959a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1329a) != null && actionMenuView.f1292s) {
                if (ViewConfiguration.get(this.f2358k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2365r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout2.f1269e).f2959a.f1329a;
                    if (actionMenuView2 != null) {
                        C0225k c0225k4 = actionMenuView2.f1293t;
                        if (c0225k4 != null) {
                            if (c0225k4.f3010u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2359l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2365r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((d1) actionBarOverlayLayout3.f1269e).f2959a.f1329a;
                if ((actionMenuView3 == null || (c0225k3 = actionMenuView3.f1293t) == null || !c0225k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2365r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((d1) actionBarOverlayLayout4.f1269e).f2959a.f1329a;
                    if (actionMenuView4 != null && (c0225k2 = actionMenuView4.f1293t) != null) {
                        c0225k2.e();
                    }
                    if (this.f2340R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2340R) {
                    return;
                }
                if (this.f2348Z && (1 & this.f2349a0) != 0) {
                    View decorView = this.f2359l.getDecorView();
                    p pVar = this.f2350b0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z y2 = y(0);
                MenuC0160m menuC0160m2 = y2.h;
                if (menuC0160m2 == null || y2.f2493o || !callback.onPreparePanel(0, y2.f2487g, menuC0160m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2365r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((d1) actionBarOverlayLayout5.f1269e).f2959a.f1329a;
                if (actionMenuView5 == null || (c0225k = actionMenuView5.f1293t) == null) {
                    return;
                }
                c0225k.l();
                return;
            }
        }
        z y3 = y(0);
        y3.f2492n = true;
        p(y3, false);
        D(y3, null);
    }

    @Override // k.InterfaceC0158k
    public final boolean s(MenuC0160m menuC0160m, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f2359l.getCallback();
        if (callback != null && !this.f2340R) {
            MenuC0160m k2 = menuC0160m.k();
            z[] zVarArr = this.f2335M;
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
                return callback.onMenuItemSelected(zVar.f2482a, menuItem);
            }
        }
        return false;
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
        C0225k c0225k;
        Object obj = this.f2357j;
        if (((obj instanceof InterfaceC0010k) || (obj instanceof DialogInterfaceC0129f)) && (decorView = this.f2359l.getDecorView()) != null && x1.d.v(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            v vVar = this.f2360m;
            Window.Callback callback = this.f2359l.getCallback();
            vVar.getClass();
            try {
                vVar.f2477c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                vVar.f2477c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2337O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                z y2 = y(0);
                if (y2.f2491m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2368u != null) {
                    return true;
                }
                z y3 = y(0);
                InterfaceC0226k0 interfaceC0226k0 = this.f2365r;
                Context context = this.f2358k;
                if (interfaceC0226k0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0226k0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((d1) actionBarOverlayLayout.f1269e).f2959a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1329a) != null && actionMenuView.f1292s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2365r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout2.f1269e).f2959a.f1329a;
                        if (actionMenuView2 == null || (c0225k = actionMenuView2.f1293t) == null || !c0225k.i()) {
                            if (!this.f2340R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2365r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((d1) actionBarOverlayLayout3.f1269e).f2959a.f1329a;
                                if (actionMenuView3 != null) {
                                    C0225k c0225k2 = actionMenuView3.f1293t;
                                    if (c0225k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2365r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((d1) actionBarOverlayLayout4.f1269e).f2959a.f1329a;
                            if (actionMenuView4 != null) {
                                C0225k c0225k3 = actionMenuView4.f1293t;
                                if (c0225k3 != null) {
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
                boolean z4 = y3.f2491m;
                if (z4 || y3.f2490l) {
                    p(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2489k) {
                        if (y3.f2493o) {
                            y3.f2489k = false;
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
                y2.f2494p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2493o = true;
        y2.f2492n = true;
        if ((i == 108 || i == 0) && this.f2365r != null) {
            z y3 = y(0);
            y3.f2489k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2324A) {
            return;
        }
        int[] iArr = f.a.f2063j;
        Context context = this.f2358k;
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
        this.f2332J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2359l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2333K) {
            viewGroup = this.f2331I ? (ViewGroup) from.inflate(com.neonpulse.gridlogic.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.neonpulse.gridlogic.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2332J) {
            viewGroup = (ViewGroup) from.inflate(com.neonpulse.gridlogic.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2330H = false;
            this.f2329G = false;
        } else if (this.f2329G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.neonpulse.gridlogic.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0141c(context, typedValue.resourceId) : context).inflate(com.neonpulse.gridlogic.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0226k0 interfaceC0226k0 = (InterfaceC0226k0) viewGroup.findViewById(com.neonpulse.gridlogic.R.id.decor_content_parent);
            this.f2365r = interfaceC0226k0;
            interfaceC0226k0.setWindowCallback(this.f2359l.getCallback());
            if (this.f2330H) {
                ((ActionBarOverlayLayout) this.f2365r).j(109);
            }
            if (this.f2328E) {
                ((ActionBarOverlayLayout) this.f2365r).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.f2365r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2329G + ", windowActionBarOverlay: " + this.f2330H + ", android:windowIsFloating: " + this.f2332J + ", windowActionModeOverlay: " + this.f2331I + ", windowNoTitle: " + this.f2333K + " }");
        }
        q qVar = new q(this, i2);
        WeakHashMap weakHashMap = S.f422a;
        K.G.u(viewGroup, qVar);
        if (this.f2365r == null) {
            this.f2326C = (TextView) viewGroup.findViewById(com.neonpulse.gridlogic.R.id.title);
        }
        boolean z2 = i1.f2990a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.neonpulse.gridlogic.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2359l.findViewById(R.id.content);
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
        this.f2359l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i));
        this.f2325B = viewGroup;
        Object obj = this.f2357j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2364q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0226k0 interfaceC0226k02 = this.f2365r;
            if (interfaceC0226k02 != null) {
                interfaceC0226k02.setWindowTitle(title);
            } else {
                K k2 = this.f2362o;
                if (k2 != null) {
                    d1 d1Var = (d1) k2.f2401e;
                    if (!d1Var.f2964g) {
                        d1Var.h = title;
                        if ((d1Var.f2960b & 8) != 0) {
                            Toolbar toolbar = d1Var.f2959a;
                            toolbar.setTitle(title);
                            if (d1Var.f2964g) {
                                S.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2326C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2325B.findViewById(R.id.content);
        View decorView = this.f2359l.getDecorView();
        contentFrameLayout2.f1309g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2324A = true;
        z y2 = y(0);
        if (this.f2340R || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2359l == null) {
            Object obj = this.f2357j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f2359l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0038g x(Context context) {
        if (this.f2346X == null) {
            if (C0011l.f473e == null) {
                Context applicationContext = context.getApplicationContext();
                C0011l.f473e = new C0011l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2346X = new w(this, C0011l.f473e);
        }
        return this.f2346X;
    }

    public final z y(int i) {
        z[] zVarArr = this.f2335M;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f2335M = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f2482a = i;
        zVar2.f2492n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void z() {
        v();
        if (this.f2329G && this.f2362o == null) {
            Object obj = this.f2357j;
            if (obj instanceof Activity) {
                this.f2362o = new K((Activity) obj, this.f2330H);
            } else if (obj instanceof Dialog) {
                this.f2362o = new K((Dialog) obj);
            }
            K k2 = this.f2362o;
            if (k2 != null) {
                k2.o0(this.f2351c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
