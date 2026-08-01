package g;

import K.C0009e0;
import K.InterfaceC0015k;
import K.X;
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
import androidx.appcompat.widget.ViewStubCompat;
import androidx.fragment.app.AbstractC0050g;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.EnumC0081n;
import androidx.lifecycle.InterfaceC0086t;
import j.AbstractC0169b;
import j.InterfaceC0168a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0195h;
import k.C0196i;
import k.InterfaceC0198k;
import k.MenuC0200m;
import l.C0230A;
import l.C0231B;
import l.C0232C;
import l.C0236G;
import l.C0238I;
import l.C0260g;
import l.C0268k;
import l.C0269k0;
import l.C0286t;
import l.C0292w;
import l.C0296y;
import l.InterfaceC0273m0;
import l.T;
import l.e1;
import l.g1;
import l.j1;

/* renamed from: g.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0141C extends q implements InterfaceC0198k, LayoutInflater.Factory2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final o.k f2432h0 = new o.k();
    public static final int[] i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f2433j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f2434A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f2435B;

    /* renamed from: C, reason: collision with root package name */
    public View f2436C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2437D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2438E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2439G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2440H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2441I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2442J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2443K;

    /* renamed from: L, reason: collision with root package name */
    public C0140B[] f2444L;

    /* renamed from: M, reason: collision with root package name */
    public C0140B f2445M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2446N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2447O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2448P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2449Q;

    /* renamed from: R, reason: collision with root package name */
    public Configuration f2450R;

    /* renamed from: S, reason: collision with root package name */
    public final int f2451S;

    /* renamed from: T, reason: collision with root package name */
    public int f2452T;

    /* renamed from: U, reason: collision with root package name */
    public int f2453U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2454V;

    /* renamed from: W, reason: collision with root package name */
    public y f2455W;

    /* renamed from: X, reason: collision with root package name */
    public y f2456X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f2457Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2458Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2460b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f2461c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2462d0;

    /* renamed from: e0, reason: collision with root package name */
    public C0144F f2463e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2464f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f2465g0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2466j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2467k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2468l;

    /* renamed from: m, reason: collision with root package name */
    public x f2469m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2470n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0148a f2471o;

    /* renamed from: p, reason: collision with root package name */
    public j.i f2472p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2473q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0273m0 f2474r;

    /* renamed from: s, reason: collision with root package name */
    public s f2475s;

    /* renamed from: t, reason: collision with root package name */
    public s f2476t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0169b f2477u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2478v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2479w;

    /* renamed from: x, reason: collision with root package name */
    public r f2480x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2482z;

    /* renamed from: y, reason: collision with root package name */
    public C0009e0 f2481y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final r f2459a0 = new r(this, 0);

    public LayoutInflaterFactory2C0141C(Context context, Window window, InterfaceC0159l interfaceC0159l, Object obj) {
        AbstractActivityC0158k abstractActivityC0158k;
        this.f2451S = -100;
        this.f2467k = context;
        this.f2470n = interfaceC0159l;
        this.f2466j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0158k)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0158k = (AbstractActivityC0158k) context;
                    break;
                }
            }
            abstractActivityC0158k = null;
            if (abstractActivityC0158k != null) {
                this.f2451S = ((LayoutInflaterFactory2C0141C) abstractActivityC0158k.getDelegate()).f2451S;
            }
        }
        if (this.f2451S == -100) {
            o.k kVar = f2432h0;
            Integer num = (Integer) kVar.getOrDefault(this.f2466j.getClass().getName(), null);
            if (num != null) {
                this.f2451S = num.intValue();
                kVar.remove(this.f2466j.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C0292w.d();
    }

    public static G.g q(Context context) {
        G.g gVar;
        G.g gVar2;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = q.f2585c) == null) {
            return null;
        }
        G.g b2 = v.b(context.getApplicationContext().getResources().getConfiguration());
        G.h hVar = gVar.f202a;
        if (hVar.f203a.isEmpty()) {
            gVar2 = G.g.f201b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f202a.f203a.size() + hVar.f203a.size()) {
                Locale locale = i < hVar.f203a.size() ? hVar.f203a.get(i) : b2.f202a.f203a.get(i - hVar.f203a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            gVar2 = new G.g(new G.h(G.f.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return gVar2.f202a.f203a.isEmpty() ? b2 : gVar2;
    }

    public static Configuration u(Context context, int i, G.g gVar, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            v.d(configuration2, gVar);
        }
        return configuration2;
    }

    public final C0140B A(int i) {
        C0140B[] c0140bArr = this.f2444L;
        if (c0140bArr == null || c0140bArr.length <= i) {
            C0140B[] c0140bArr2 = new C0140B[i + 1];
            if (c0140bArr != null) {
                System.arraycopy(c0140bArr, 0, c0140bArr2, 0, c0140bArr.length);
            }
            this.f2444L = c0140bArr2;
            c0140bArr = c0140bArr2;
        }
        C0140B c0140b = c0140bArr[i];
        if (c0140b != null) {
            return c0140b;
        }
        C0140B c0140b2 = new C0140B();
        c0140b2.f2418a = i;
        c0140b2.f2429n = false;
        c0140bArr[i] = c0140b2;
        return c0140b2;
    }

    public final void B() {
        x();
        if (this.F && this.f2471o == null) {
            Object obj = this.f2466j;
            if (obj instanceof Activity) {
                this.f2471o = new O((Activity) obj, this.f2439G);
            } else if (obj instanceof Dialog) {
                this.f2471o = new O((Dialog) obj);
            }
            AbstractC0148a abstractC0148a = this.f2471o;
            if (abstractC0148a != null) {
                abstractC0148a.l(this.f2460b0);
            }
        }
    }

    public final void C(int i) {
        this.f2458Z = (1 << i) | this.f2458Z;
        if (this.f2457Y) {
            return;
        }
        View decorView = this.f2468l.getDecorView();
        r rVar = this.f2459a0;
        WeakHashMap weakHashMap = X.f418a;
        decorView.postOnAnimation(rVar);
        this.f2457Y = true;
    }

    public final int D(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return z(context).f();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f2456X == null) {
                    this.f2456X = new y(this, context);
                }
                return this.f2456X.f();
            }
        }
        return i;
    }

    public final boolean E() {
        boolean z2 = this.f2446N;
        this.f2446N = false;
        C0140B A2 = A(0);
        if (A2.f2428m) {
            if (!z2) {
                t(A2, true);
            }
            return true;
        }
        AbstractC0169b abstractC0169b = this.f2477u;
        if (abstractC0169b != null) {
            abstractC0169b.a();
            return true;
        }
        B();
        AbstractC0148a abstractC0148a = this.f2471o;
        return abstractC0148a != null && abstractC0148a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f3049f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(C0140B c0140b, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0140b.f2428m || this.f2449Q) {
            return;
        }
        int i2 = c0140b.f2418a;
        Context context = this.f2467k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2468l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c0140b.h)) {
            t(c0140b, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !H(c0140b, keyEvent)) {
            return;
        }
        C0139A c0139a = c0140b.f2422e;
        if (c0139a == null || c0140b.f2429n) {
            if (c0139a == null) {
                B();
                AbstractC0148a abstractC0148a = this.f2471o;
                Context e2 = abstractC0148a != null ? abstractC0148a.e() : null;
                if (e2 != null) {
                    context = e2;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.fortuneink.neonpad.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.fortuneink.neonpad.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.fortuneink.neonpad.R.style.Theme_AppCompat_CompactMenu, true);
                }
                j.d dVar = new j.d(context, 0);
                dVar.getTheme().setTo(newTheme);
                c0140b.f2425j = dVar;
                TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.a.f2394j);
                c0140b.f2419b = obtainStyledAttributes.getResourceId(86, 0);
                c0140b.f2421d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                c0140b.f2422e = new C0139A(this, c0140b.f2425j);
                c0140b.f2420c = 81;
            } else if (c0140b.f2429n && c0139a.getChildCount() > 0) {
                c0140b.f2422e.removeAllViews();
            }
            View view = c0140b.f2424g;
            if (view == null) {
                if (c0140b.h != null) {
                    if (this.f2476t == null) {
                        this.f2476t = new s(this, 3);
                    }
                    s sVar = this.f2476t;
                    if (c0140b.i == null) {
                        C0196i c0196i = new C0196i(c0140b.f2425j);
                        c0140b.i = c0196i;
                        c0196i.f3048e = sVar;
                        MenuC0200m menuC0200m = c0140b.h;
                        menuC0200m.b(c0196i, menuC0200m.f3057a);
                    }
                    C0196i c0196i2 = c0140b.i;
                    C0139A c0139a2 = c0140b.f2422e;
                    if (c0196i2.f3047d == null) {
                        c0196i2.f3047d = (ExpandedMenuView) c0196i2.f3045b.inflate(com.fortuneink.neonpad.R.layout.abc_expanded_menu_layout, (ViewGroup) c0139a2, false);
                        if (c0196i2.f3049f == null) {
                            c0196i2.f3049f = new C0195h(c0196i2);
                        }
                        c0196i2.f3047d.setAdapter((ListAdapter) c0196i2.f3049f);
                        c0196i2.f3047d.setOnItemClickListener(c0196i2);
                    }
                    ExpandedMenuView expandedMenuView = c0196i2.f3047d;
                    c0140b.f2423f = expandedMenuView;
                }
                c0140b.f2429n = true;
                return;
            }
            c0140b.f2423f = view;
            if (c0140b.f2423f != null) {
                if (c0140b.f2424g == null) {
                    C0196i c0196i3 = c0140b.i;
                    if (c0196i3.f3049f == null) {
                        c0196i3.f3049f = new C0195h(c0196i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = c0140b.f2423f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0140b.f2422e.setBackgroundResource(c0140b.f2419b);
                ViewParent parent = c0140b.f2423f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c0140b.f2423f);
                }
                c0140b.f2422e.addView(c0140b.f2423f, layoutParams2);
                if (!c0140b.f2423f.hasFocus()) {
                    c0140b.f2423f.requestFocus();
                }
            }
            c0140b.f2429n = true;
            return;
        }
        View view2 = c0140b.f2424g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            c0140b.f2427l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = c0140b.f2420c;
            layoutParams3.windowAnimations = c0140b.f2421d;
            windowManager.addView(c0140b.f2422e, layoutParams3);
            c0140b.f2428m = true;
            if (i2 != 0) {
                J();
                return;
            }
            return;
        }
        i = -2;
        c0140b.f2427l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = c0140b.f2420c;
        layoutParams32.windowAnimations = c0140b.f2421d;
        windowManager.addView(c0140b.f2422e, layoutParams32);
        c0140b.f2428m = true;
        if (i2 != 0) {
        }
    }

    public final boolean G(C0140B c0140b, int i, KeyEvent keyEvent) {
        MenuC0200m menuC0200m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0140b.f2426k || H(c0140b, keyEvent)) && (menuC0200m = c0140b.h) != null) {
            return menuC0200m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean H(C0140B c0140b, KeyEvent keyEvent) {
        InterfaceC0273m0 interfaceC0273m0;
        InterfaceC0273m0 interfaceC0273m02;
        Resources.Theme theme;
        InterfaceC0273m0 interfaceC0273m03;
        InterfaceC0273m0 interfaceC0273m04;
        if (this.f2449Q) {
            return false;
        }
        if (c0140b.f2426k) {
            return true;
        }
        C0140B c0140b2 = this.f2445M;
        if (c0140b2 != null && c0140b2 != c0140b) {
            t(c0140b2, false);
        }
        Window.Callback callback = this.f2468l.getCallback();
        int i = c0140b.f2418a;
        if (callback != null) {
            c0140b.f2424g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0273m04 = this.f2474r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0273m04;
            actionBarOverlayLayout.k();
            ((e1) actionBarOverlayLayout.f1015e).f3361l = true;
        }
        if (c0140b.f2424g == null && (!z2 || !(this.f2471o instanceof J))) {
            MenuC0200m menuC0200m = c0140b.h;
            if (menuC0200m == null || c0140b.f2430o) {
                if (menuC0200m == null) {
                    Context context = this.f2467k;
                    if ((i == 0 || i == 108) && this.f2474r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.fortuneink.neonpad.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.fortuneink.neonpad.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.fortuneink.neonpad.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            j.d dVar = new j.d(context, 0);
                            dVar.getTheme().setTo(theme);
                            context = dVar;
                        }
                    }
                    MenuC0200m menuC0200m2 = new MenuC0200m(context);
                    menuC0200m2.f3061e = this;
                    MenuC0200m menuC0200m3 = c0140b.h;
                    if (menuC0200m2 != menuC0200m3) {
                        if (menuC0200m3 != null) {
                            menuC0200m3.r(c0140b.i);
                        }
                        c0140b.h = menuC0200m2;
                        C0196i c0196i = c0140b.i;
                        if (c0196i != null) {
                            menuC0200m2.b(c0196i, menuC0200m2.f3057a);
                        }
                    }
                    if (c0140b.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0273m02 = this.f2474r) != null) {
                    if (this.f2475s == null) {
                        this.f2475s = new s(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0273m02).l(c0140b.h, this.f2475s);
                }
                c0140b.h.w();
                if (!callback.onCreatePanelMenu(i, c0140b.h)) {
                    MenuC0200m menuC0200m4 = c0140b.h;
                    if (menuC0200m4 != null) {
                        if (menuC0200m4 != null) {
                            menuC0200m4.r(c0140b.i);
                        }
                        c0140b.h = null;
                    }
                    if (z2 && (interfaceC0273m0 = this.f2474r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0273m0).l(null, this.f2475s);
                    }
                    return false;
                }
                c0140b.f2430o = false;
            }
            c0140b.h.w();
            Bundle bundle = c0140b.f2431p;
            if (bundle != null) {
                c0140b.h.s(bundle);
                c0140b.f2431p = null;
            }
            if (!callback.onPreparePanel(0, c0140b.f2424g, c0140b.h)) {
                if (z2 && (interfaceC0273m03 = this.f2474r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0273m03).l(null, this.f2475s);
                }
                c0140b.h.v();
                return false;
            }
            c0140b.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0140b.h.v();
        }
        c0140b.f2426k = true;
        c0140b.f2427l = false;
        this.f2445M = c0140b;
        return true;
    }

    public final void I() {
        if (this.f2482z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2464f0 != null && (A(0).f2428m || this.f2477u != null)) {
                z2 = true;
            }
            if (z2 && this.f2465g0 == null) {
                this.f2465g0 = w.b(this.f2464f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2465g0) == null) {
                    return;
                }
                w.c(this.f2464f0, onBackInvokedCallback);
                this.f2465g0 = null;
            }
        }
    }

    @Override // g.q
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2467k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0141C) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.q
    public final void b() {
        if (this.f2471o != null) {
            B();
            if (this.f2471o.f()) {
                return;
            }
            C(0);
        }
    }

    @Override // g.q
    public final void d() {
        String str;
        this.f2447O = true;
        o(false, true);
        y();
        Object obj = this.f2466j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = z.f.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0148a abstractC0148a = this.f2471o;
                if (abstractC0148a == null) {
                    this.f2460b0 = true;
                } else {
                    abstractC0148a.l(true);
                }
            }
            synchronized (q.h) {
                q.h(this);
                q.f2589g.add(new WeakReference(this));
            }
        }
        this.f2450R = new Configuration(this.f2467k.getResources().getConfiguration());
        this.f2448P = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0198k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MenuC0200m menuC0200m) {
        ActionMenuView actionMenuView;
        C0268k c0268k;
        InterfaceC0273m0 interfaceC0273m0 = this.f2474r;
        if (interfaceC0273m0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0273m0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((e1) actionBarOverlayLayout.f1015e).f3352a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1080a) != null && actionMenuView.f1039s) {
                if (ViewConfiguration.get(this.f2467k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2474r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout2.f1015e).f3352a.f1080a;
                    if (actionMenuView2 != null) {
                        C0268k c0268k2 = actionMenuView2.f1040t;
                        if (c0268k2 != null) {
                            if (c0268k2.f3404u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2468l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2474r;
                actionBarOverlayLayout3.k();
                if (((e1) actionBarOverlayLayout3.f1015e).f3352a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2474r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((e1) actionBarOverlayLayout4.f1015e).f3352a.f1080a;
                    if (actionMenuView3 != null && (c0268k = actionMenuView3.f1040t) != null) {
                        c0268k.f();
                    }
                    if (this.f2449Q) {
                        return;
                    }
                    callback.onPanelClosed(108, A(0).h);
                    return;
                }
                if (callback == null || this.f2449Q) {
                    return;
                }
                if (this.f2457Y && (1 & this.f2458Z) != 0) {
                    View decorView = this.f2468l.getDecorView();
                    r rVar = this.f2459a0;
                    decorView.removeCallbacks(rVar);
                    rVar.run();
                }
                C0140B A2 = A(0);
                MenuC0200m menuC0200m2 = A2.h;
                if (menuC0200m2 == null || A2.f2430o || !callback.onPreparePanel(0, A2.f2424g, menuC0200m2)) {
                    return;
                }
                callback.onMenuOpened(108, A2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2474r;
                actionBarOverlayLayout5.k();
                ((e1) actionBarOverlayLayout5.f1015e).f3352a.v();
                return;
            }
        }
        C0140B A3 = A(0);
        A3.f2429n = true;
        t(A3, false);
        F(A3, null);
    }

    @Override // k.InterfaceC0198k
    public final boolean f(MenuC0200m menuC0200m, MenuItem menuItem) {
        C0140B c0140b;
        Window.Callback callback = this.f2468l.getCallback();
        if (callback != null && !this.f2449Q) {
            MenuC0200m k2 = menuC0200m.k();
            C0140B[] c0140bArr = this.f2444L;
            int length = c0140bArr != null ? c0140bArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0140b = c0140bArr[i];
                    if (c0140b != null && c0140b.h == k2) {
                        break;
                    }
                    i++;
                } else {
                    c0140b = null;
                    break;
                }
            }
            if (c0140b != null) {
                return callback.onMenuItemSelected(c0140b.f2418a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // g.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        AbstractC0148a abstractC0148a;
        y yVar;
        y yVar2;
        if (this.f2466j instanceof Activity) {
            synchronized (q.h) {
                q.h(this);
            }
        }
        if (this.f2457Y) {
            this.f2468l.getDecorView().removeCallbacks(this.f2459a0);
        }
        this.f2449Q = true;
        if (this.f2451S != -100) {
            Object obj = this.f2466j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2432h0.put(this.f2466j.getClass().getName(), Integer.valueOf(this.f2451S));
                abstractC0148a = this.f2471o;
                if (abstractC0148a != null) {
                    abstractC0148a.h();
                }
                yVar = this.f2455W;
                if (yVar != null) {
                    yVar.c();
                }
                yVar2 = this.f2456X;
                if (yVar2 == null) {
                    yVar2.c();
                    return;
                }
                return;
            }
        }
        f2432h0.remove(this.f2466j.getClass().getName());
        abstractC0148a = this.f2471o;
        if (abstractC0148a != null) {
        }
        yVar = this.f2455W;
        if (yVar != null) {
        }
        yVar2 = this.f2456X;
        if (yVar2 == null) {
        }
    }

    @Override // g.q
    public final boolean i(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2442J && i == 108) {
            return false;
        }
        if (this.F && i == 1) {
            this.F = false;
        }
        if (i == 1) {
            I();
            this.f2442J = true;
            return true;
        }
        if (i == 2) {
            I();
            this.f2437D = true;
            return true;
        }
        if (i == 5) {
            I();
            this.f2438E = true;
            return true;
        }
        if (i == 10) {
            I();
            this.f2440H = true;
            return true;
        }
        if (i == 108) {
            I();
            this.F = true;
            return true;
        }
        if (i != 109) {
            return this.f2468l.requestFeature(i);
        }
        I();
        this.f2439G = true;
        return true;
    }

    @Override // g.q
    public final void j(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f2434A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2467k).inflate(i, viewGroup);
        this.f2469m.a(this.f2468l.getCallback());
    }

    @Override // g.q
    public final void k(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f2434A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2469m.a(this.f2468l.getCallback());
    }

    @Override // g.q
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f2434A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2469m.a(this.f2468l.getCallback());
    }

    @Override // g.q
    public final void m(CharSequence charSequence) {
        this.f2473q = charSequence;
        InterfaceC0273m0 interfaceC0273m0 = this.f2474r;
        if (interfaceC0273m0 != null) {
            interfaceC0273m0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0148a abstractC0148a = this.f2471o;
        if (abstractC0148a != null) {
            abstractC0148a.n(charSequence);
            return;
        }
        TextView textView = this.f2435B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Type inference failed for: r2v0, types: [g.l, java.lang.Object] */
    @Override // g.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0169b n(InterfaceC0168a interfaceC0168a) {
        AbstractC0169b onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC0169b abstractC0169b;
        int i = 1;
        if (interfaceC0168a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0169b abstractC0169b2 = this.f2477u;
        if (abstractC0169b2 != null) {
            abstractC0169b2.a();
        }
        B.j jVar = new B.j(this, interfaceC0168a);
        B();
        AbstractC0148a abstractC0148a = this.f2471o;
        ?? r2 = this.f2470n;
        if (abstractC0148a != null) {
            AbstractC0169b o2 = abstractC0148a.o(jVar);
            this.f2477u = o2;
            if (o2 != null) {
                r2.onSupportActionModeStarted(o2);
            }
        }
        if (this.f2477u == null) {
            C0009e0 c0009e0 = this.f2481y;
            if (c0009e0 != null) {
                c0009e0.b();
            }
            AbstractC0169b abstractC0169b3 = this.f2477u;
            if (abstractC0169b3 != null) {
                abstractC0169b3.a();
            }
            if (!this.f2449Q) {
                try {
                    onWindowStartingSupportActionMode = r2.onWindowStartingSupportActionMode(jVar);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    this.f2477u = onWindowStartingSupportActionMode;
                } else {
                    if (this.f2478v == null) {
                        boolean z2 = this.f2441I;
                        Context context = this.f2467k;
                        if (z2) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.fortuneink.neonpad.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                j.d dVar = new j.d(context, 0);
                                dVar.getTheme().setTo(newTheme);
                                context = dVar;
                            }
                            this.f2478v = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.fortuneink.neonpad.R.attr.actionModePopupWindowStyle);
                            this.f2479w = popupWindow;
                            Q.m.d(popupWindow, 2);
                            this.f2479w.setContentView(this.f2478v);
                            this.f2479w.setWidth(-1);
                            context.getTheme().resolveAttribute(com.fortuneink.neonpad.R.attr.actionBarSize, typedValue, true);
                            this.f2478v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f2479w.setHeight(-2);
                            this.f2480x = new r(this, i);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f2434A.findViewById(com.fortuneink.neonpad.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                B();
                                AbstractC0148a abstractC0148a2 = this.f2471o;
                                Context e2 = abstractC0148a2 != null ? abstractC0148a2.e() : null;
                                if (e2 != null) {
                                    context = e2;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.f2478v = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.f2478v != null) {
                        C0009e0 c0009e02 = this.f2481y;
                        if (c0009e02 != null) {
                            c0009e02.b();
                        }
                        this.f2478v.e();
                        Context context2 = this.f2478v.getContext();
                        ActionBarContextView actionBarContextView = this.f2478v;
                        j.e eVar = new j.e();
                        eVar.f2815c = context2;
                        eVar.f2816d = actionBarContextView;
                        eVar.f2817e = jVar;
                        MenuC0200m menuC0200m = new MenuC0200m(actionBarContextView.getContext());
                        menuC0200m.f3066l = 1;
                        eVar.h = menuC0200m;
                        menuC0200m.f3061e = eVar;
                        if (((InterfaceC0168a) jVar.f36b).b(eVar, menuC0200m)) {
                            eVar.i();
                            this.f2478v.c(eVar);
                            this.f2477u = eVar;
                            if (this.f2482z && (viewGroup = this.f2434A) != null && viewGroup.isLaidOut()) {
                                this.f2478v.setAlpha(0.0f);
                                C0009e0 a2 = X.a(this.f2478v);
                                a2.a(1.0f);
                                this.f2481y = a2;
                                a2.d(new t(i, this));
                            } else {
                                this.f2478v.setAlpha(1.0f);
                                this.f2478v.setVisibility(0);
                                if (this.f2478v.getParent() instanceof View) {
                                    View view = (View) this.f2478v.getParent();
                                    WeakHashMap weakHashMap = X.f418a;
                                    K.J.c(view);
                                }
                            }
                            if (this.f2479w != null) {
                                this.f2468l.getDecorView().post(this.f2480x);
                            }
                        } else {
                            this.f2477u = null;
                        }
                    }
                }
                abstractC0169b = this.f2477u;
                if (abstractC0169b != null) {
                    r2.onSupportActionModeStarted(abstractC0169b);
                }
                J();
                this.f2477u = this.f2477u;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            abstractC0169b = this.f2477u;
            if (abstractC0169b != null) {
            }
            J();
            this.f2477u = this.f2477u;
        }
        J();
        return this.f2477u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        G.g b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f2449Q) {
            return false;
        }
        int i3 = this.f2451S;
        if (i3 == -100) {
            i3 = q.f2584b;
        }
        int i4 = i3;
        Context context = this.f2467k;
        int D2 = D(context, i4);
        int i5 = Build.VERSION.SDK_INT;
        G.g q2 = i5 < 33 ? q(context) : null;
        if (!z3 && q2 != null) {
            q2 = v.b(context.getResources().getConfiguration());
        }
        Configuration u2 = u(context, D2, q2, null, false);
        boolean z5 = this.f2454V;
        Object obj = this.f2466j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2450R;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i6 = configuration.uiMode & 48;
                int i7 = u2.uiMode & 48;
                G.g b3 = v.b(configuration);
                b2 = q2 != null ? null : v.b(u2);
                i2 = i6 == i7 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2447O && ((f2433j0 || this.f2448P) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(u2.getLayoutDirection());
                        }
                        if (i8 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new B0.q(12, activity));
                        }
                        z4 = true;
                        if (!z4 || i2 == 0) {
                            z6 = z4;
                        } else {
                            boolean z7 = (i & i2) == i2;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i7;
                            if (b2 != null) {
                                v.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i9 = this.f2452T;
                            if (i9 != 0) {
                                context.setTheme(i9);
                                context.getTheme().applyStyle(this.f2452T, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof InterfaceC0086t) {
                                    if (((C0088v) ((InterfaceC0086t) activity2).getLifecycle()).f1499c.compareTo(EnumC0081n.f1490c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2448P && !this.f2449Q) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0158k)) {
                            if ((i2 & 512) != 0) {
                                ((AbstractActivityC0158k) obj).onNightModeChanged(D2);
                            }
                            if ((i2 & 4) != 0) {
                                ((AbstractActivityC0158k) obj).onLocalesChanged(q2);
                            }
                        }
                        if (b2 != null) {
                            v.c(v.b(context.getResources().getConfiguration()));
                        }
                        if (i4 == 0) {
                            z(context).i();
                        } else {
                            y yVar = this.f2455W;
                            if (yVar != null) {
                                yVar.c();
                            }
                        }
                        if (i4 == 3) {
                            if (this.f2456X == null) {
                                this.f2456X = new y(this, context);
                            }
                            this.f2456X.i();
                        } else {
                            y yVar2 = this.f2456X;
                            if (yVar2 != null) {
                                yVar2.c();
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
                if (i4 == 0) {
                }
                if (i4 == 3) {
                }
                return z6;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i5 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f2453U = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2453U = 0;
            }
        }
        this.f2454V = true;
        i = this.f2453U;
        configuration = this.f2450R;
        if (configuration == null) {
        }
        int i62 = configuration.uiMode & 48;
        int i72 = u2.uiMode & 48;
        G.g b32 = v.b(configuration);
        if (q2 != null) {
        }
        if (i62 == i72) {
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
        if (i4 == 0) {
        }
        if (i4 == 3) {
        }
        return z6;
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
        View c0236g;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2463e0 == null) {
            int[] iArr = f.a.f2394j;
            Context context2 = this.f2467k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2463e0 = new C0144F();
            } else {
                try {
                    this.f2463e0 = (C0144F) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2463e0 = new C0144F();
                }
            }
        }
        C0144F c0144f = this.f2463e0;
        int i2 = g1.f3367a;
        c0144f.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2408x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context dVar = (resourceId == 0 || ((context instanceof j.d) && ((j.d) context).f2810a == resourceId)) ? context : new j.d(context, resourceId);
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
                c0236g = new C0236G(dVar, attributeSet);
                break;
            case 1:
                c0236g = new C0286t(dVar, attributeSet);
                break;
            case 2:
                c0236g = new C0232C(dVar, attributeSet);
                break;
            case 3:
                c0236g = c0144f.e(dVar, attributeSet);
                break;
            case 4:
                c0236g = new C0230A(dVar, attributeSet, com.fortuneink.neonpad.R.attr.imageButtonStyle);
                break;
            case 5:
                c0236g = new C0238I(dVar, attributeSet);
                break;
            case 6:
                c0236g = new T(dVar, attributeSet);
                break;
            case 7:
                c0236g = c0144f.d(dVar, attributeSet);
                break;
            case '\b':
                c0236g = new C0269k0(dVar, attributeSet);
                break;
            case '\t':
                c0236g = new C0231B(dVar, attributeSet, 0);
                break;
            case '\n':
                c0236g = c0144f.a(dVar, attributeSet);
                break;
            case 11:
                c0236g = c0144f.c(dVar, attributeSet);
                break;
            case '\f':
                c0236g = new C0296y(dVar, attributeSet);
                break;
            case '\r':
                c0236g = c0144f.b(dVar, attributeSet);
                break;
            default:
                c0236g = null;
                break;
        }
        if (c0236g == null && context != dVar) {
            Object[] objArr = c0144f.f2494a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = dVar;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0144F.f2493g;
                        if (i3 < 3) {
                            View f2 = c0144f.f(dVar, str2, strArr[i3]);
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
                    View f3 = c0144f.f(dVar, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0236g = view2;
        }
        if (c0236g != null) {
            Context context3 = c0236g.getContext();
            if ((context3 instanceof ContextWrapper) && c0236g.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0144F.f2489c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0236g.setOnClickListener(new ViewOnClickListenerC0143E(c0236g, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = dVar.obtainStyledAttributes(attributeSet, C0144F.f2490d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = X.f418a;
                    i = 0;
                    new K.G(com.fortuneink.neonpad.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0236g, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = dVar.obtainStyledAttributes(attributeSet, C0144F.f2491e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    X.m(c0236g, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = dVar.obtainStyledAttributes(attributeSet, C0144F.f2492f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = X.f418a;
                    new K.G(com.fortuneink.neonpad.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0236g, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0236g;
    }

    public final void p(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2468l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        x xVar = new x(this, callback);
        this.f2469m = xVar;
        window.setCallback(xVar);
        int[] iArr = i0;
        Context context = this.f2467k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0292w a2 = C0292w.a();
            synchronized (a2) {
                drawable = a2.f3471a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2468l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2464f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2465g0) != null) {
            w.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2465g0 = null;
        }
        Object obj = this.f2466j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2464f0 = w.a(activity);
                J();
            }
        }
        this.f2464f0 = null;
        J();
    }

    public final void r(int i, C0140B c0140b, MenuC0200m menuC0200m) {
        if (menuC0200m == null) {
            if (c0140b == null && i >= 0) {
                C0140B[] c0140bArr = this.f2444L;
                if (i < c0140bArr.length) {
                    c0140b = c0140bArr[i];
                }
            }
            if (c0140b != null) {
                menuC0200m = c0140b.h;
            }
        }
        if ((c0140b == null || c0140b.f2428m) && !this.f2449Q) {
            x xVar = this.f2469m;
            Window.Callback callback = this.f2468l.getCallback();
            xVar.getClass();
            try {
                xVar.f2600e = true;
                callback.onPanelClosed(i, menuC0200m);
            } finally {
                xVar.f2600e = false;
            }
        }
    }

    public final void s(MenuC0200m menuC0200m) {
        C0268k c0268k;
        if (this.f2443K) {
            return;
        }
        this.f2443K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2474r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f1015e).f3352a.f1080a;
        if (actionMenuView != null && (c0268k = actionMenuView.f1040t) != null) {
            c0268k.f();
            C0260g c0260g = c0268k.f3403t;
            if (c0260g != null && c0260g.b()) {
                c0260g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2468l.getCallback();
        if (callback != null && !this.f2449Q) {
            callback.onPanelClosed(108, menuC0200m);
        }
        this.f2443K = false;
    }

    public final void t(C0140B c0140b, boolean z2) {
        C0139A c0139a;
        InterfaceC0273m0 interfaceC0273m0;
        if (z2 && c0140b.f2418a == 0 && (interfaceC0273m0 = this.f2474r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0273m0;
            actionBarOverlayLayout.k();
            if (((e1) actionBarOverlayLayout.f1015e).f3352a.p()) {
                s(c0140b.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2467k.getSystemService("window");
        if (windowManager != null && c0140b.f2428m && (c0139a = c0140b.f2422e) != null) {
            windowManager.removeView(c0139a);
            if (z2) {
                r(c0140b.f2418a, c0140b, null);
            }
        }
        c0140b.f2426k = false;
        c0140b.f2427l = false;
        c0140b.f2428m = false;
        c0140b.f2423f = null;
        c0140b.f2429n = true;
        if (this.f2445M == c0140b) {
            this.f2445M = null;
        }
        if (c0140b.f2418a == 0) {
            J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ef, code lost:
    
        if (r7.f() != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        boolean z2;
        boolean z3;
        ActionMenuView actionMenuView;
        Object obj = this.f2466j;
        if (((obj instanceof InterfaceC0015k) || (obj instanceof DialogInterfaceC0155h)) && (decorView = this.f2468l.getDecorView()) != null && q1.l.r(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            x xVar = this.f2469m;
            Window.Callback callback = this.f2468l.getCallback();
            xVar.getClass();
            try {
                xVar.f2599d = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                xVar.f2599d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2446N = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                C0140B A2 = A(0);
                if (A2.f2428m) {
                    return true;
                }
                H(A2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2477u != null) {
                    return true;
                }
                C0140B A3 = A(0);
                InterfaceC0273m0 interfaceC0273m0 = this.f2474r;
                Context context = this.f2467k;
                if (interfaceC0273m0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0273m0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((e1) actionBarOverlayLayout.f1015e).f3352a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1080a) != null && actionMenuView.f1039s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2474r;
                        actionBarOverlayLayout2.k();
                        if (((e1) actionBarOverlayLayout2.f1015e).f3352a.p()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2474r;
                            actionBarOverlayLayout3.k();
                            ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout3.f1015e).f3352a.f1080a;
                            if (actionMenuView2 != null) {
                                C0268k c0268k = actionMenuView2.f1040t;
                                if (c0268k != null) {
                                }
                            }
                        } else if (!this.f2449Q && H(A3, keyEvent)) {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2474r;
                            actionBarOverlayLayout4.k();
                            z2 = ((e1) actionBarOverlayLayout4.f1015e).f3352a.v();
                            if (!z2) {
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
                        z2 = false;
                        if (!z2) {
                        }
                    }
                }
                boolean z4 = A3.f2428m;
                if (z4 || A3.f2427l) {
                    t(A3, true);
                    z2 = z4;
                    if (!z2) {
                    }
                } else {
                    if (A3.f2426k) {
                        if (A3.f2430o) {
                            A3.f2426k = false;
                            z3 = H(A3, keyEvent);
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            F(A3, keyEvent);
                            z2 = true;
                            if (!z2) {
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                }
            }
        } else if (E()) {
            return true;
        }
        return false;
    }

    public final void w(int i) {
        C0140B A2 = A(i);
        if (A2.h != null) {
            Bundle bundle = new Bundle();
            A2.h.t(bundle);
            if (bundle.size() > 0) {
                A2.f2431p = bundle;
            }
            A2.h.w();
            A2.h.clear();
        }
        A2.f2430o = true;
        A2.f2429n = true;
        if ((i == 108 || i == 0) && this.f2474r != null) {
            C0140B A3 = A(0);
            A3.f2426k = false;
            H(A3, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2482z) {
            return;
        }
        int[] iArr = f.a.f2394j;
        Context context = this.f2467k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.f2441I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        y();
        this.f2468l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2442J) {
            viewGroup = this.f2440H ? (ViewGroup) from.inflate(com.fortuneink.neonpad.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.fortuneink.neonpad.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2441I) {
            viewGroup = (ViewGroup) from.inflate(com.fortuneink.neonpad.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2439G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.fortuneink.neonpad.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.d(context, typedValue.resourceId) : context).inflate(com.fortuneink.neonpad.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0273m0 interfaceC0273m0 = (InterfaceC0273m0) viewGroup.findViewById(com.fortuneink.neonpad.R.id.decor_content_parent);
            this.f2474r = interfaceC0273m0;
            interfaceC0273m0.setWindowCallback(this.f2468l.getCallback());
            if (this.f2439G) {
                ((ActionBarOverlayLayout) this.f2474r).j(109);
            }
            if (this.f2437D) {
                ((ActionBarOverlayLayout) this.f2474r).j(2);
            }
            if (this.f2438E) {
                ((ActionBarOverlayLayout) this.f2474r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.f2439G + ", android:windowIsFloating: " + this.f2441I + ", windowActionModeOverlay: " + this.f2440H + ", windowNoTitle: " + this.f2442J + " }");
        }
        s sVar = new s(this, i2);
        WeakHashMap weakHashMap = X.f418a;
        K.L.u(viewGroup, sVar);
        if (this.f2474r == null) {
            this.f2435B = (TextView) viewGroup.findViewById(com.fortuneink.neonpad.R.id.title);
        }
        boolean z2 = j1.f3383a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.fortuneink.neonpad.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2468l.findViewById(R.id.content);
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
        this.f2468l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new s(this, i));
        this.f2434A = viewGroup;
        Object obj = this.f2466j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2473q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0273m0 interfaceC0273m02 = this.f2474r;
            if (interfaceC0273m02 != null) {
                interfaceC0273m02.setWindowTitle(title);
            } else {
                AbstractC0148a abstractC0148a = this.f2471o;
                if (abstractC0148a != null) {
                    abstractC0148a.n(title);
                } else {
                    TextView textView = this.f2435B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2434A.findViewById(R.id.content);
        View decorView = this.f2468l.getDecorView();
        contentFrameLayout2.f1057g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2482z = true;
        C0140B A2 = A(0);
        if (this.f2449Q || A2.h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.f2468l == null) {
            Object obj = this.f2466j;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f2468l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0050g z(Context context) {
        if (this.f2455W == null) {
            if (T.r.f808e == null) {
                Context applicationContext = context.getApplicationContext();
                T.r.f808e = new T.r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2455W = new y(this, T.r.f808e);
        }
        return this.f2455W;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
