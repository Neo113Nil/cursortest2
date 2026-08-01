package g;

import L.C0005c0;
import L.C0014l;
import L.InterfaceC0013k;
import L.T;
import Z.AbstractC0040g;
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
import androidx.lifecycle.EnumC0079m;
import androidx.recyclerview.widget.RecyclerView;
import f.AbstractC0097a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC0147a;
import k.C0149c;
import l.C0164h;
import l.C0165i;
import l.C0171o;
import l.InterfaceC0167k;
import l.MenuC0169m;
import m.C0183A;
import m.C0187E;
import m.C0189G;
import m.C0199Q;
import m.C0213g;
import m.C0220j0;
import m.C0221k;
import m.C0237s;
import m.C0241u;
import m.C0245w;
import m.C0249y;
import m.C0251z;
import m.InterfaceC0224l0;
import m.InterfaceC0226m0;
import m.e1;
import m.j1;
import m.l1;
import m.o1;

/* loaded from: classes.dex */
public final class A extends o implements InterfaceC0167k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final p.k f2197i0 = new p.k();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f2198j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2199k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2200A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2201B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2202C;

    /* renamed from: D, reason: collision with root package name */
    public View f2203D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2204E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2205F;
    public boolean G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2206H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2207I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2208J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2209K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2210L;

    /* renamed from: M, reason: collision with root package name */
    public z[] f2211M;

    /* renamed from: N, reason: collision with root package name */
    public z f2212N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2213O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2214P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2215Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2216R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2217S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2218T;

    /* renamed from: U, reason: collision with root package name */
    public int f2219U;

    /* renamed from: V, reason: collision with root package name */
    public int f2220V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2221W;

    /* renamed from: X, reason: collision with root package name */
    public w f2222X;

    /* renamed from: Y, reason: collision with root package name */
    public w f2223Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2224Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2225a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2227c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2228d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2229e0;

    /* renamed from: f0, reason: collision with root package name */
    public D f2230f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2231g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2232h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2233j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2234k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2235l;

    /* renamed from: m, reason: collision with root package name */
    public v f2236m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2237n;

    /* renamed from: o, reason: collision with root package name */
    public K f2238o;

    /* renamed from: p, reason: collision with root package name */
    public k.h f2239p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2240q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0224l0 f2241r;

    /* renamed from: s, reason: collision with root package name */
    public q f2242s;

    /* renamed from: t, reason: collision with root package name */
    public q f2243t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0147a f2244u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2245v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2246w;

    /* renamed from: x, reason: collision with root package name */
    public p f2247x;

    /* renamed from: y, reason: collision with root package name */
    public C0005c0 f2248y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2249z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final p f2226b0 = new p(this, 0);

    public A(Context context, Window window, InterfaceC0107j interfaceC0107j, Object obj) {
        AbstractActivityC0106i abstractActivityC0106i;
        this.f2218T = -100;
        this.f2234k = context;
        this.f2233j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0106i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0106i = (AbstractActivityC0106i) context;
                    break;
                }
            }
            abstractActivityC0106i = null;
            if (abstractActivityC0106i != null) {
                this.f2218T = ((A) abstractActivityC0106i.l()).f2218T;
            }
        }
        if (this.f2218T == -100) {
            p.k kVar = f2197i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2233j.getClass().getName(), null);
            if (num != null) {
                this.f2218T = num.intValue();
                kVar.remove(this.f2233j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        C0241u.d();
    }

    public static H.f m(Context context) {
        H.f fVar;
        H.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.f2346c) == null) {
            return null;
        }
        H.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        H.g gVar = fVar.f293a;
        if (gVar.f294a.isEmpty()) {
            fVar2 = H.f.f292b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f293a.f294a.size() + gVar.f294a.size()) {
                Locale locale = i < gVar.f294a.size() ? gVar.f294a.get(i) : b2.f293a.f294a.get(i - gVar.f294a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new H.f(new H.g(H.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f293a.f294a.isEmpty() ? b2 : fVar2;
    }

    public static Configuration s(Context context, int i, H.f fVar, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = RecyclerView.A0;
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
        this.f2225a0 = (1 << i) | this.f2225a0;
        if (this.f2224Z) {
            return;
        }
        View decorView = this.f2235l.getDecorView();
        p pVar = this.f2226b0;
        WeakHashMap weakHashMap = T.f490a;
        decorView.postOnAnimation(pVar);
        this.f2224Z = true;
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
                if (this.f2223Y == null) {
                    this.f2223Y = new w(this, context);
                }
                return this.f2223Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0226m0 interfaceC0226m0;
        e1 e1Var;
        boolean z2 = this.f2213O;
        this.f2213O = false;
        z y2 = y(0);
        if (y2.f2374m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0147a abstractC0147a = this.f2244u;
        if (abstractC0147a != null) {
            abstractC0147a.a();
            return true;
        }
        z();
        K k2 = this.f2238o;
        if (k2 == null || (interfaceC0226m0 = k2.i) == null || (e1Var = ((j1) interfaceC0226m0).f3110a.f1423L) == null || e1Var.f3084b == null) {
            return false;
        }
        e1 e1Var2 = ((j1) interfaceC0226m0).f3110a.f1423L;
        C0171o c0171o = e1Var2 == null ? null : e1Var2.f3084b;
        if (c0171o != null) {
            c0171o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2808f.getCount() > 0) goto L88;
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
        if (zVar.f2374m || this.f2216R) {
            return;
        }
        int i2 = zVar.f2364a;
        Context context = this.f2234k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2235l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, zVar.f2370h)) {
            r(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f2367e;
        if (yVar == null || zVar.f2375n) {
            if (yVar == null) {
                z();
                K k2 = this.f2238o;
                Context n02 = k2 != null ? k2.n0() : null;
                if (n02 != null) {
                    context = n02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.winfour.winrandom.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.winfour.winrandom.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.winfour.winrandom.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0149c c0149c = new C0149c(context, 0);
                c0149c.getTheme().setTo(newTheme);
                zVar.f2371j = c0149c;
                TypedArray obtainStyledAttributes = c0149c.obtainStyledAttributes(AbstractC0097a.f2143j);
                zVar.f2365b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f2367e = new y(this, zVar.f2371j);
                zVar.f2366c = 81;
            } else if (zVar.f2375n && yVar.getChildCount() > 0) {
                zVar.f2367e.removeAllViews();
            }
            View view = zVar.f2369g;
            if (view == null) {
                if (zVar.f2370h != null) {
                    if (this.f2243t == null) {
                        this.f2243t = new q(this, 3);
                    }
                    q qVar = this.f2243t;
                    if (zVar.i == null) {
                        C0165i c0165i = new C0165i(zVar.f2371j);
                        zVar.i = c0165i;
                        c0165i.f2807e = qVar;
                        MenuC0169m menuC0169m = zVar.f2370h;
                        menuC0169m.b(c0165i, menuC0169m.f2815a);
                    }
                    C0165i c0165i2 = zVar.i;
                    y yVar2 = zVar.f2367e;
                    if (c0165i2.d == null) {
                        c0165i2.d = (ExpandedMenuView) c0165i2.f2805b.inflate(com.winfour.winrandom.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c0165i2.f2808f == null) {
                            c0165i2.f2808f = new C0164h(c0165i2);
                        }
                        c0165i2.d.setAdapter((ListAdapter) c0165i2.f2808f);
                        c0165i2.d.setOnItemClickListener(c0165i2);
                    }
                    ExpandedMenuView expandedMenuView = c0165i2.d;
                    zVar.f2368f = expandedMenuView;
                }
                zVar.f2375n = true;
                return;
            }
            zVar.f2368f = view;
            if (zVar.f2368f != null) {
                if (zVar.f2369g == null) {
                    C0165i c0165i3 = zVar.i;
                    if (c0165i3.f2808f == null) {
                        c0165i3.f2808f = new C0164h(c0165i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f2368f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f2367e.setBackgroundResource(zVar.f2365b);
                ViewParent parent = zVar.f2368f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f2368f);
                }
                zVar.f2367e.addView(zVar.f2368f, layoutParams2);
                if (!zVar.f2368f.hasFocus()) {
                    zVar.f2368f.requestFocus();
                }
            }
            zVar.f2375n = true;
            return;
        }
        View view2 = zVar.f2369g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f2373l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f2366c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f2367e, layoutParams3);
            zVar.f2374m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f2373l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f2366c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f2367e, layoutParams32);
        zVar.f2374m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        MenuC0169m menuC0169m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f2372k || F(zVar, keyEvent)) && (menuC0169m = zVar.f2370h) != null) {
            return menuC0169m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(z zVar, KeyEvent keyEvent) {
        InterfaceC0224l0 interfaceC0224l0;
        InterfaceC0224l0 interfaceC0224l02;
        Resources.Theme theme;
        InterfaceC0224l0 interfaceC0224l03;
        InterfaceC0224l0 interfaceC0224l04;
        if (this.f2216R) {
            return false;
        }
        if (zVar.f2372k) {
            return true;
        }
        z zVar2 = this.f2212N;
        if (zVar2 != null && zVar2 != zVar) {
            r(zVar2, false);
        }
        Window.Callback callback = this.f2235l.getCallback();
        int i = zVar.f2364a;
        if (callback != null) {
            zVar.f2369g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0224l04 = this.f2241r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0224l04;
            actionBarOverlayLayout.k();
            ((j1) actionBarOverlayLayout.f1367e).f3119l = true;
        }
        if (zVar.f2369g == null) {
            MenuC0169m menuC0169m = zVar.f2370h;
            if (menuC0169m == null || zVar.f2376o) {
                if (menuC0169m == null) {
                    Context context = this.f2234k;
                    if ((i == 0 || i == 108) && this.f2241r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.winfour.winrandom.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.winfour.winrandom.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.winfour.winrandom.R.attr.actionBarWidgetTheme, typedValue, true);
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
                    MenuC0169m menuC0169m2 = new MenuC0169m(context);
                    menuC0169m2.f2818e = this;
                    MenuC0169m menuC0169m3 = zVar.f2370h;
                    if (menuC0169m2 != menuC0169m3) {
                        if (menuC0169m3 != null) {
                            menuC0169m3.r(zVar.i);
                        }
                        zVar.f2370h = menuC0169m2;
                        C0165i c0165i = zVar.i;
                        if (c0165i != null) {
                            menuC0169m2.b(c0165i, menuC0169m2.f2815a);
                        }
                    }
                    if (zVar.f2370h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0224l02 = this.f2241r) != null) {
                    if (this.f2242s == null) {
                        this.f2242s = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0224l02).l(zVar.f2370h, this.f2242s);
                }
                zVar.f2370h.w();
                if (!callback.onCreatePanelMenu(i, zVar.f2370h)) {
                    MenuC0169m menuC0169m4 = zVar.f2370h;
                    if (menuC0169m4 != null) {
                        if (menuC0169m4 != null) {
                            menuC0169m4.r(zVar.i);
                        }
                        zVar.f2370h = null;
                    }
                    if (z2 && (interfaceC0224l0 = this.f2241r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0224l0).l(null, this.f2242s);
                    }
                    return false;
                }
                zVar.f2376o = false;
            }
            zVar.f2370h.w();
            Bundle bundle = zVar.f2377p;
            if (bundle != null) {
                zVar.f2370h.s(bundle);
                zVar.f2377p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f2369g, zVar.f2370h)) {
                if (z2 && (interfaceC0224l03 = this.f2241r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0224l03).l(null, this.f2242s);
                }
                zVar.f2370h.v();
                return false;
            }
            zVar.f2370h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            zVar.f2370h.v();
        }
        zVar.f2372k = true;
        zVar.f2373l = false;
        this.f2212N = zVar;
        return true;
    }

    public final void G() {
        if (this.f2200A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2231g0 != null && (y(0).f2374m || this.f2244u != null)) {
                z2 = true;
            }
            if (z2 && this.f2232h0 == null) {
                this.f2232h0 = u.b(this.f2231g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2232h0) == null) {
                    return;
                }
                u.c(this.f2231g0, onBackInvokedCallback);
                this.f2232h0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2234k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.o
    public final void c() {
        String str;
        this.f2214P = true;
        k(false, true);
        w();
        Object obj = this.f2233j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = A.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                K k2 = this.f2238o;
                if (k2 == null) {
                    this.f2227c0 = true;
                } else {
                    k2.p0(true);
                }
            }
            synchronized (o.f2350h) {
                o.e(this);
                o.f2349g.add(new WeakReference(this));
            }
        }
        this.f2217S = new Configuration(this.f2234k.getResources().getConfiguration());
        this.f2215Q = true;
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
        if (this.f2233j instanceof Activity) {
            synchronized (o.f2350h) {
                o.e(this);
            }
        }
        if (this.f2224Z) {
            this.f2235l.getDecorView().removeCallbacks(this.f2226b0);
        }
        this.f2216R = true;
        if (this.f2218T != -100) {
            Object obj = this.f2233j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2197i0.put(this.f2233j.getClass().getName(), Integer.valueOf(this.f2218T));
                wVar = this.f2222X;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.f2223Y;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f2197i0.remove(this.f2233j.getClass().getName());
        wVar = this.f2222X;
        if (wVar != null) {
        }
        wVar2 = this.f2223Y;
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
        if (this.f2209K && i == 108) {
            return false;
        }
        if (this.G && i == 1) {
            this.G = false;
        }
        if (i == 1) {
            G();
            this.f2209K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2204E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.f2205F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2207I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.G = true;
            return true;
        }
        if (i != 109) {
            return this.f2235l.requestFeature(i);
        }
        G();
        this.f2206H = true;
        return true;
    }

    @Override // g.o
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2201B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2234k).inflate(i, viewGroup);
        this.f2236m.a(this.f2235l.getCallback());
    }

    @Override // g.o
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2201B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2236m.a(this.f2235l.getCallback());
    }

    @Override // g.o
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2201B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2236m.a(this.f2235l.getCallback());
    }

    @Override // g.o
    public final void j(CharSequence charSequence) {
        this.f2240q = charSequence;
        InterfaceC0224l0 interfaceC0224l0 = this.f2241r;
        if (interfaceC0224l0 != null) {
            interfaceC0224l0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2238o;
        if (k2 == null) {
            TextView textView = this.f2202C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        j1 j1Var = (j1) k2.i;
        if (j1Var.f3115g) {
            return;
        }
        j1Var.f3116h = charSequence;
        if ((j1Var.f3111b & 8) != 0) {
            Toolbar toolbar = j1Var.f3110a;
            toolbar.setTitle(charSequence);
            if (j1Var.f3115g) {
                T.m(toolbar.getRootView(), charSequence);
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
    public final boolean k(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        H.f b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f2216R) {
            return false;
        }
        int i3 = this.f2218T;
        if (i3 == -100) {
            i3 = o.f2345b;
        }
        Context context = this.f2234k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        H.f m2 = i4 < 33 ? m(context) : null;
        if (!z3 && m2 != null) {
            m2 = t.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, m2, null, false);
        boolean z5 = this.f2221W;
        Object obj = this.f2233j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2217S;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                H.f b3 = t.b(configuration);
                b2 = m2 != null ? null : t.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2214P && ((f2199k0 || this.f2215Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new A.a(0, activity));
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
                            int i8 = this.f2219U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2219U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).d().f1582c.compareTo(EnumC0079m.f1574c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2215Q && !this.f2216R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0106i)) {
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
                            w wVar = this.f2222X;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2223Y == null) {
                                this.f2223Y = new w(this, context);
                            }
                            this.f2223Y.i();
                        } else {
                            w wVar2 = this.f2223Y;
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
                    this.f2220V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2220V = 0;
            }
        }
        this.f2221W = true;
        i = this.f2220V;
        configuration = this.f2217S;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        H.f b32 = t.b(configuration);
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
        if (this.f2235l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f2236m = vVar;
        window.setCallback(vVar);
        int[] iArr = f2198j0;
        Context context = this.f2234k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0241u a2 = C0241u.a();
            synchronized (a2) {
                drawable = a2.f3188a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2235l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2231g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2232h0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2232h0 = null;
        }
        Object obj = this.f2233j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2231g0 = u.a(activity);
                H();
            }
        }
        this.f2231g0 = null;
        H();
    }

    public final void n(int i, z zVar, MenuC0169m menuC0169m) {
        if (menuC0169m == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f2211M;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                menuC0169m = zVar.f2370h;
            }
        }
        if ((zVar == null || zVar.f2374m) && !this.f2216R) {
            v vVar = this.f2236m;
            Window.Callback callback = this.f2235l.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i, menuC0169m);
            } finally {
                vVar.d = false;
            }
        }
    }

    @Override // l.InterfaceC0167k
    public final boolean o(MenuC0169m menuC0169m, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f2235l.getCallback();
        if (callback != null && !this.f2216R) {
            MenuC0169m k2 = menuC0169m.k();
            z[] zVarArr = this.f2211M;
            int length = zVarArr != null ? zVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    zVar = zVarArr[i];
                    if (zVar != null && zVar.f2370h == k2) {
                        break;
                    }
                    i++;
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f2364a, menuItem);
            }
        }
        return false;
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
        View c0187e;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2230f0 == null) {
            int[] iArr = AbstractC0097a.f2143j;
            Context context2 = this.f2234k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2230f0 = new D();
            } else {
                try {
                    this.f2230f0 = (D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2230f0 = new D();
                }
            }
        }
        D d = this.f2230f0;
        int i2 = l1.f3144a;
        d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f2158y, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0149c = (resourceId == 0 || ((context instanceof C0149c) && ((C0149c) context).f2675a == resourceId)) ? context : new C0149c(context, resourceId);
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
                c0187e = new C0187E(c0149c, attributeSet);
                break;
            case 1:
                c0187e = new C0237s(c0149c, attributeSet);
                break;
            case 2:
                c0187e = new C0183A(c0149c, attributeSet);
                break;
            case 3:
                c0187e = d.e(c0149c, attributeSet);
                break;
            case 4:
                c0187e = new C0249y(c0149c, attributeSet, com.winfour.winrandom.R.attr.imageButtonStyle);
                break;
            case 5:
                c0187e = new C0189G(c0149c, attributeSet);
                break;
            case 6:
                c0187e = new C0199Q(c0149c, attributeSet);
                break;
            case 7:
                c0187e = d.d(c0149c, attributeSet);
                break;
            case '\b':
                c0187e = new C0220j0(c0149c, attributeSet);
                break;
            case '\t':
                c0187e = new C0251z(c0149c, attributeSet, 0);
                break;
            case '\n':
                c0187e = d.a(c0149c, attributeSet);
                break;
            case 11:
                c0187e = d.c(c0149c, attributeSet);
                break;
            case '\f':
                c0187e = new C0245w(c0149c, attributeSet);
                break;
            case '\r':
                c0187e = d.b(c0149c, attributeSet);
                break;
            default:
                c0187e = null;
                break;
        }
        if (c0187e == null && context != c0149c) {
            Object[] objArr = d.f2260a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0149c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = D.f2258g;
                        if (i3 < 3) {
                            View f2 = d.f(c0149c, str2, strArr[i3]);
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
                    View f3 = d.f(c0149c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0187e = view2;
        }
        if (c0187e != null) {
            Context context3 = c0187e.getContext();
            if ((context3 instanceof ContextWrapper) && c0187e.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, D.f2255c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0187e.setOnClickListener(new C(c0187e, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0149c.obtainStyledAttributes(attributeSet, D.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = T.f490a;
                    i = 0;
                    new L.C(com.winfour.winrandom.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).d(c0187e, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0149c.obtainStyledAttributes(attributeSet, D.f2256e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    T.m(c0187e, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0149c.obtainStyledAttributes(attributeSet, D.f2257f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = T.f490a;
                    new L.C(com.winfour.winrandom.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0187e, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0187e;
    }

    public final void p(MenuC0169m menuC0169m) {
        C0221k c0221k;
        if (this.f2210L) {
            return;
        }
        this.f2210L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2241r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((j1) actionBarOverlayLayout.f1367e).f3110a.f1429a;
        if (actionMenuView != null && (c0221k = actionMenuView.f1392t) != null) {
            c0221k.f();
            C0213g c0213g = c0221k.f3140t;
            if (c0213g != null && c0213g.b()) {
                c0213g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2235l.getCallback();
        if (callback != null && !this.f2216R) {
            callback.onPanelClosed(108, menuC0169m);
        }
        this.f2210L = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // l.InterfaceC0167k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(MenuC0169m menuC0169m) {
        ActionMenuView actionMenuView;
        C0221k c0221k;
        C0221k c0221k2;
        C0221k c0221k3;
        InterfaceC0224l0 interfaceC0224l0 = this.f2241r;
        if (interfaceC0224l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0224l0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((j1) actionBarOverlayLayout.f1367e).f3110a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1429a) != null && actionMenuView.f1391s) {
                if (ViewConfiguration.get(this.f2234k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2241r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((j1) actionBarOverlayLayout2.f1367e).f3110a.f1429a;
                    if (actionMenuView2 != null) {
                        C0221k c0221k4 = actionMenuView2.f1392t;
                        if (c0221k4 != null) {
                            if (c0221k4.f3141u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2235l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2241r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((j1) actionBarOverlayLayout3.f1367e).f3110a.f1429a;
                if ((actionMenuView3 == null || (c0221k3 = actionMenuView3.f1392t) == null || !c0221k3.j()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2241r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((j1) actionBarOverlayLayout4.f1367e).f3110a.f1429a;
                    if (actionMenuView4 != null && (c0221k2 = actionMenuView4.f1392t) != null) {
                        c0221k2.f();
                    }
                    if (this.f2216R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).f2370h);
                    return;
                }
                if (callback == null || this.f2216R) {
                    return;
                }
                if (this.f2224Z && (1 & this.f2225a0) != 0) {
                    View decorView = this.f2235l.getDecorView();
                    p pVar = this.f2226b0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z y2 = y(0);
                MenuC0169m menuC0169m2 = y2.f2370h;
                if (menuC0169m2 == null || y2.f2376o || !callback.onPreparePanel(0, y2.f2369g, menuC0169m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.f2370h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2241r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((j1) actionBarOverlayLayout5.f1367e).f3110a.f1429a;
                if (actionMenuView5 == null || (c0221k = actionMenuView5.f1392t) == null) {
                    return;
                }
                c0221k.l();
                return;
            }
        }
        z y3 = y(0);
        y3.f2375n = true;
        r(y3, false);
        D(y3, null);
    }

    public final void r(z zVar, boolean z2) {
        y yVar;
        InterfaceC0224l0 interfaceC0224l0;
        C0221k c0221k;
        if (z2 && zVar.f2364a == 0 && (interfaceC0224l0 = this.f2241r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0224l0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((j1) actionBarOverlayLayout.f1367e).f3110a.f1429a;
            if (actionMenuView != null && (c0221k = actionMenuView.f1392t) != null && c0221k.j()) {
                p(zVar.f2370h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2234k.getSystemService("window");
        if (windowManager != null && zVar.f2374m && (yVar = zVar.f2367e) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                n(zVar.f2364a, zVar, null);
            }
        }
        zVar.f2372k = false;
        zVar.f2373l = false;
        zVar.f2374m = false;
        zVar.f2368f = null;
        zVar.f2375n = true;
        if (this.f2212N == zVar) {
            this.f2212N = null;
        }
        if (zVar.f2364a == 0) {
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
        C0221k c0221k;
        Object obj = this.f2233j;
        if (((obj instanceof InterfaceC0013k) || (obj instanceof DialogInterfaceC0103f)) && (decorView = this.f2235l.getDecorView()) != null && A1.d.y(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            v vVar = this.f2236m;
            Window.Callback callback = this.f2235l.getCallback();
            vVar.getClass();
            try {
                vVar.f2359c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                vVar.f2359c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2213O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                z y2 = y(0);
                if (y2.f2374m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2244u != null) {
                    return true;
                }
                z y3 = y(0);
                InterfaceC0224l0 interfaceC0224l0 = this.f2241r;
                Context context = this.f2234k;
                if (interfaceC0224l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0224l0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((j1) actionBarOverlayLayout.f1367e).f3110a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1429a) != null && actionMenuView.f1391s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2241r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((j1) actionBarOverlayLayout2.f1367e).f3110a.f1429a;
                        if (actionMenuView2 == null || (c0221k = actionMenuView2.f1392t) == null || !c0221k.j()) {
                            if (!this.f2216R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2241r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((j1) actionBarOverlayLayout3.f1367e).f3110a.f1429a;
                                if (actionMenuView3 != null) {
                                    C0221k c0221k2 = actionMenuView3.f1392t;
                                    if (c0221k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2241r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((j1) actionBarOverlayLayout4.f1367e).f3110a.f1429a;
                            if (actionMenuView4 != null) {
                                C0221k c0221k3 = actionMenuView4.f1392t;
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
                boolean z4 = y3.f2374m;
                if (z4 || y3.f2373l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2372k) {
                        if (y3.f2376o) {
                            y3.f2372k = false;
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
        if (y2.f2370h != null) {
            Bundle bundle = new Bundle();
            y2.f2370h.t(bundle);
            if (bundle.size() > 0) {
                y2.f2377p = bundle;
            }
            y2.f2370h.w();
            y2.f2370h.clear();
        }
        y2.f2376o = true;
        y2.f2375n = true;
        if ((i == 108 || i == 0) && this.f2241r != null) {
            z y3 = y(0);
            y3.f2372k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2200A) {
            return;
        }
        int[] iArr = AbstractC0097a.f2143j;
        Context context = this.f2234k;
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
        this.f2208J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2235l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2209K) {
            viewGroup = this.f2207I ? (ViewGroup) from.inflate(com.winfour.winrandom.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.winfour.winrandom.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2208J) {
            viewGroup = (ViewGroup) from.inflate(com.winfour.winrandom.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2206H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.winfour.winrandom.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0149c(context, typedValue.resourceId) : context).inflate(com.winfour.winrandom.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0224l0 interfaceC0224l0 = (InterfaceC0224l0) viewGroup.findViewById(com.winfour.winrandom.R.id.decor_content_parent);
            this.f2241r = interfaceC0224l0;
            interfaceC0224l0.setWindowCallback(this.f2235l.getCallback());
            if (this.f2206H) {
                ((ActionBarOverlayLayout) this.f2241r).j(109);
            }
            if (this.f2204E) {
                ((ActionBarOverlayLayout) this.f2241r).j(2);
            }
            if (this.f2205F) {
                ((ActionBarOverlayLayout) this.f2241r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.f2206H + ", android:windowIsFloating: " + this.f2208J + ", windowActionModeOverlay: " + this.f2207I + ", windowNoTitle: " + this.f2209K + " }");
        }
        q qVar = new q(this, i2);
        WeakHashMap weakHashMap = T.f490a;
        L.H.u(viewGroup, qVar);
        if (this.f2241r == null) {
            this.f2202C = (TextView) viewGroup.findViewById(com.winfour.winrandom.R.id.title);
        }
        boolean z2 = o1.f3158a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.winfour.winrandom.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2235l.findViewById(R.id.content);
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
        this.f2235l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i));
        this.f2201B = viewGroup;
        Object obj = this.f2233j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2240q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0224l0 interfaceC0224l02 = this.f2241r;
            if (interfaceC0224l02 != null) {
                interfaceC0224l02.setWindowTitle(title);
            } else {
                K k2 = this.f2238o;
                if (k2 != null) {
                    j1 j1Var = (j1) k2.i;
                    if (!j1Var.f3115g) {
                        j1Var.f3116h = title;
                        if ((j1Var.f3111b & 8) != 0) {
                            Toolbar toolbar = j1Var.f3110a;
                            toolbar.setTitle(title);
                            if (j1Var.f3115g) {
                                T.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2202C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2201B.findViewById(R.id.content);
        View decorView = this.f2235l.getDecorView();
        contentFrameLayout2.f1408g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2200A = true;
        z y2 = y(0);
        if (this.f2216R || y2.f2370h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2235l == null) {
            Object obj = this.f2233j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f2235l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0040g x(Context context) {
        if (this.f2222X == null) {
            if (C0014l.d == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                C0014l c0014l = new C0014l();
                c0014l.f544c = new H();
                c0014l.f542a = applicationContext;
                c0014l.f543b = locationManager;
                C0014l.d = c0014l;
            }
            this.f2222X = new w(this, C0014l.d);
        }
        return this.f2222X;
    }

    public final z y(int i) {
        z[] zVarArr = this.f2211M;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f2211M = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f2364a = i;
        zVar2.f2375n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void z() {
        v();
        if (this.G && this.f2238o == null) {
            Object obj = this.f2233j;
            if (obj instanceof Activity) {
                this.f2238o = new K((Activity) obj, this.f2206H);
            } else if (obj instanceof Dialog) {
                this.f2238o = new K((Dialog) obj);
            }
            K k2 = this.f2238o;
            if (k2 != null) {
                k2.p0(this.f2227c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
