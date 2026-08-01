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
import com.luckyarcade.spinthrow.GameConfig;
import j.AbstractC0170b;
import j.InterfaceC0169a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0197h;
import k.C0198i;
import k.InterfaceC0200k;
import k.MenuC0202m;
import l.C0232A;
import l.C0233B;
import l.C0237F;
import l.C0239H;
import l.C0249S;
import l.C0262g;
import l.C0269j0;
import l.C0270k;
import l.C0286s;
import l.C0292v;
import l.C0296x;
import l.C0300z;
import l.InterfaceC0273l0;
import l.d1;
import l.f1;
import l.i1;

/* renamed from: g.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0142C extends q implements InterfaceC0200k, LayoutInflater.Factory2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final o.k f2436h0 = new o.k();
    public static final int[] i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f2437j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f2438A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f2439B;

    /* renamed from: C, reason: collision with root package name */
    public View f2440C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2441D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2442E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2443G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2444H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2445I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2446J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2447K;

    /* renamed from: L, reason: collision with root package name */
    public C0141B[] f2448L;

    /* renamed from: M, reason: collision with root package name */
    public C0141B f2449M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2450N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2451O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2452P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2453Q;

    /* renamed from: R, reason: collision with root package name */
    public Configuration f2454R;

    /* renamed from: S, reason: collision with root package name */
    public final int f2455S;

    /* renamed from: T, reason: collision with root package name */
    public int f2456T;

    /* renamed from: U, reason: collision with root package name */
    public int f2457U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2458V;

    /* renamed from: W, reason: collision with root package name */
    public y f2459W;

    /* renamed from: X, reason: collision with root package name */
    public y f2460X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f2461Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2462Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2464b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f2465c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2466d0;

    /* renamed from: e0, reason: collision with root package name */
    public C0145F f2467e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2468f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f2469g0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2470j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2471k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2472l;

    /* renamed from: m, reason: collision with root package name */
    public x f2473m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2474n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0149a f2475o;

    /* renamed from: p, reason: collision with root package name */
    public j.i f2476p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2477q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0273l0 f2478r;

    /* renamed from: s, reason: collision with root package name */
    public s f2479s;

    /* renamed from: t, reason: collision with root package name */
    public s f2480t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0170b f2481u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2482v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2483w;

    /* renamed from: x, reason: collision with root package name */
    public r f2484x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2486z;

    /* renamed from: y, reason: collision with root package name */
    public C0009e0 f2485y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final r f2463a0 = new r(this, 0);

    public LayoutInflaterFactory2C0142C(Context context, Window window, InterfaceC0160l interfaceC0160l, Object obj) {
        AbstractActivityC0159k abstractActivityC0159k;
        this.f2455S = -100;
        this.f2471k = context;
        this.f2474n = interfaceC0160l;
        this.f2470j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0159k)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0159k = (AbstractActivityC0159k) context;
                    break;
                }
            }
            abstractActivityC0159k = null;
            if (abstractActivityC0159k != null) {
                this.f2455S = ((LayoutInflaterFactory2C0142C) abstractActivityC0159k.getDelegate()).f2455S;
            }
        }
        if (this.f2455S == -100) {
            o.k kVar = f2436h0;
            Integer num = (Integer) kVar.getOrDefault(this.f2470j.getClass().getName(), null);
            if (num != null) {
                this.f2455S = num.intValue();
                kVar.remove(this.f2470j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0292v.d();
    }

    public static G.g o(Context context) {
        G.g gVar;
        G.g gVar2;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = q.f2589c) == null) {
            return null;
        }
        G.g b2 = v.b(context.getApplicationContext().getResources().getConfiguration());
        G.h hVar = gVar.f201a;
        if (hVar.f202a.isEmpty()) {
            gVar2 = G.g.f200b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f201a.f202a.size() + hVar.f202a.size()) {
                Locale locale = i < hVar.f202a.size() ? hVar.f202a.get(i) : b2.f201a.f202a.get(i - hVar.f202a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            gVar2 = new G.g(new G.h(G.f.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return gVar2.f201a.f202a.isEmpty() ? b2 : gVar2;
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

    public final C0141B A(int i) {
        C0141B[] c0141bArr = this.f2448L;
        if (c0141bArr == null || c0141bArr.length <= i) {
            C0141B[] c0141bArr2 = new C0141B[i + 1];
            if (c0141bArr != null) {
                System.arraycopy(c0141bArr, 0, c0141bArr2, 0, c0141bArr.length);
            }
            this.f2448L = c0141bArr2;
            c0141bArr = c0141bArr2;
        }
        C0141B c0141b = c0141bArr[i];
        if (c0141b != null) {
            return c0141b;
        }
        C0141B c0141b2 = new C0141B();
        c0141b2.f2422a = i;
        c0141b2.f2433n = false;
        c0141bArr[i] = c0141b2;
        return c0141b2;
    }

    public final void B() {
        x();
        if (this.F && this.f2475o == null) {
            Object obj = this.f2470j;
            if (obj instanceof Activity) {
                this.f2475o = new O((Activity) obj, this.f2443G);
            } else if (obj instanceof Dialog) {
                this.f2475o = new O((Dialog) obj);
            }
            AbstractC0149a abstractC0149a = this.f2475o;
            if (abstractC0149a != null) {
                abstractC0149a.l(this.f2464b0);
            }
        }
    }

    public final void C(int i) {
        this.f2462Z = (1 << i) | this.f2462Z;
        if (this.f2461Y) {
            return;
        }
        View decorView = this.f2472l.getDecorView();
        r rVar = this.f2463a0;
        WeakHashMap weakHashMap = X.f419a;
        decorView.postOnAnimation(rVar);
        this.f2461Y = true;
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
                if (this.f2460X == null) {
                    this.f2460X = new y(this, context);
                }
                return this.f2460X.f();
            }
        }
        return i;
    }

    public final boolean E() {
        boolean z2 = this.f2450N;
        this.f2450N = false;
        C0141B A2 = A(0);
        if (A2.f2432m) {
            if (!z2) {
                t(A2, true);
            }
            return true;
        }
        AbstractC0170b abstractC0170b = this.f2481u;
        if (abstractC0170b != null) {
            abstractC0170b.a();
            return true;
        }
        B();
        AbstractC0149a abstractC0149a = this.f2475o;
        return abstractC0149a != null && abstractC0149a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f3053f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(C0141B c0141b, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0141b.f2432m || this.f2453Q) {
            return;
        }
        int i2 = c0141b.f2422a;
        Context context = this.f2471k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2472l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c0141b.h)) {
            t(c0141b, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !H(c0141b, keyEvent)) {
            return;
        }
        C0140A c0140a = c0141b.f2426e;
        if (c0140a == null || c0141b.f2433n) {
            if (c0140a == null) {
                B();
                AbstractC0149a abstractC0149a = this.f2475o;
                Context e2 = abstractC0149a != null ? abstractC0149a.e() : null;
                if (e2 != null) {
                    context = e2;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.luckyarcade.spinthrow.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.luckyarcade.spinthrow.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.luckyarcade.spinthrow.R.style.Theme_AppCompat_CompactMenu, true);
                }
                j.d dVar = new j.d(context, 0);
                dVar.getTheme().setTo(newTheme);
                c0141b.f2429j = dVar;
                TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.a.f2398j);
                c0141b.f2423b = obtainStyledAttributes.getResourceId(86, 0);
                c0141b.f2425d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                c0141b.f2426e = new C0140A(this, c0141b.f2429j);
                c0141b.f2424c = 81;
            } else if (c0141b.f2433n && c0140a.getChildCount() > 0) {
                c0141b.f2426e.removeAllViews();
            }
            View view = c0141b.f2428g;
            if (view == null) {
                if (c0141b.h != null) {
                    if (this.f2480t == null) {
                        this.f2480t = new s(this, 3);
                    }
                    s sVar = this.f2480t;
                    if (c0141b.i == null) {
                        C0198i c0198i = new C0198i(c0141b.f2429j);
                        c0141b.i = c0198i;
                        c0198i.f3052e = sVar;
                        MenuC0202m menuC0202m = c0141b.h;
                        menuC0202m.b(c0198i, menuC0202m.f3061a);
                    }
                    C0198i c0198i2 = c0141b.i;
                    C0140A c0140a2 = c0141b.f2426e;
                    if (c0198i2.f3051d == null) {
                        c0198i2.f3051d = (ExpandedMenuView) c0198i2.f3049b.inflate(com.luckyarcade.spinthrow.R.layout.abc_expanded_menu_layout, (ViewGroup) c0140a2, false);
                        if (c0198i2.f3053f == null) {
                            c0198i2.f3053f = new C0197h(c0198i2);
                        }
                        c0198i2.f3051d.setAdapter((ListAdapter) c0198i2.f3053f);
                        c0198i2.f3051d.setOnItemClickListener(c0198i2);
                    }
                    ExpandedMenuView expandedMenuView = c0198i2.f3051d;
                    c0141b.f2427f = expandedMenuView;
                }
                c0141b.f2433n = true;
                return;
            }
            c0141b.f2427f = view;
            if (c0141b.f2427f != null) {
                if (c0141b.f2428g == null) {
                    C0198i c0198i3 = c0141b.i;
                    if (c0198i3.f3053f == null) {
                        c0198i3.f3053f = new C0197h(c0198i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = c0141b.f2427f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0141b.f2426e.setBackgroundResource(c0141b.f2423b);
                ViewParent parent = c0141b.f2427f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c0141b.f2427f);
                }
                c0141b.f2426e.addView(c0141b.f2427f, layoutParams2);
                if (!c0141b.f2427f.hasFocus()) {
                    c0141b.f2427f.requestFocus();
                }
            }
            c0141b.f2433n = true;
            return;
        }
        View view2 = c0141b.f2428g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            c0141b.f2431l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = c0141b.f2424c;
            layoutParams3.windowAnimations = c0141b.f2425d;
            windowManager.addView(c0141b.f2426e, layoutParams3);
            c0141b.f2432m = true;
            if (i2 != 0) {
                J();
                return;
            }
            return;
        }
        i = -2;
        c0141b.f2431l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = c0141b.f2424c;
        layoutParams32.windowAnimations = c0141b.f2425d;
        windowManager.addView(c0141b.f2426e, layoutParams32);
        c0141b.f2432m = true;
        if (i2 != 0) {
        }
    }

    public final boolean G(C0141B c0141b, int i, KeyEvent keyEvent) {
        MenuC0202m menuC0202m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0141b.f2430k || H(c0141b, keyEvent)) && (menuC0202m = c0141b.h) != null) {
            return menuC0202m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean H(C0141B c0141b, KeyEvent keyEvent) {
        InterfaceC0273l0 interfaceC0273l0;
        InterfaceC0273l0 interfaceC0273l02;
        Resources.Theme theme;
        InterfaceC0273l0 interfaceC0273l03;
        InterfaceC0273l0 interfaceC0273l04;
        if (this.f2453Q) {
            return false;
        }
        if (c0141b.f2430k) {
            return true;
        }
        C0141B c0141b2 = this.f2449M;
        if (c0141b2 != null && c0141b2 != c0141b) {
            t(c0141b2, false);
        }
        Window.Callback callback = this.f2472l.getCallback();
        int i = c0141b.f2422a;
        if (callback != null) {
            c0141b.f2428g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0273l04 = this.f2478r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0273l04;
            actionBarOverlayLayout.k();
            ((d1) actionBarOverlayLayout.f1016e).f3361l = true;
        }
        if (c0141b.f2428g == null && (!z2 || !(this.f2475o instanceof J))) {
            MenuC0202m menuC0202m = c0141b.h;
            if (menuC0202m == null || c0141b.f2434o) {
                if (menuC0202m == null) {
                    Context context = this.f2471k;
                    if ((i == 0 || i == 108) && this.f2478r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.luckyarcade.spinthrow.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.luckyarcade.spinthrow.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.luckyarcade.spinthrow.R.attr.actionBarWidgetTheme, typedValue, true);
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
                    MenuC0202m menuC0202m2 = new MenuC0202m(context);
                    menuC0202m2.f3065e = this;
                    MenuC0202m menuC0202m3 = c0141b.h;
                    if (menuC0202m2 != menuC0202m3) {
                        if (menuC0202m3 != null) {
                            menuC0202m3.r(c0141b.i);
                        }
                        c0141b.h = menuC0202m2;
                        C0198i c0198i = c0141b.i;
                        if (c0198i != null) {
                            menuC0202m2.b(c0198i, menuC0202m2.f3061a);
                        }
                    }
                    if (c0141b.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0273l02 = this.f2478r) != null) {
                    if (this.f2479s == null) {
                        this.f2479s = new s(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0273l02).l(c0141b.h, this.f2479s);
                }
                c0141b.h.w();
                if (!callback.onCreatePanelMenu(i, c0141b.h)) {
                    MenuC0202m menuC0202m4 = c0141b.h;
                    if (menuC0202m4 != null) {
                        if (menuC0202m4 != null) {
                            menuC0202m4.r(c0141b.i);
                        }
                        c0141b.h = null;
                    }
                    if (z2 && (interfaceC0273l0 = this.f2478r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0273l0).l(null, this.f2479s);
                    }
                    return false;
                }
                c0141b.f2434o = false;
            }
            c0141b.h.w();
            Bundle bundle = c0141b.f2435p;
            if (bundle != null) {
                c0141b.h.s(bundle);
                c0141b.f2435p = null;
            }
            if (!callback.onPreparePanel(0, c0141b.f2428g, c0141b.h)) {
                if (z2 && (interfaceC0273l03 = this.f2478r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0273l03).l(null, this.f2479s);
                }
                c0141b.h.v();
                return false;
            }
            c0141b.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0141b.h.v();
        }
        c0141b.f2430k = true;
        c0141b.f2431l = false;
        this.f2449M = c0141b;
        return true;
    }

    public final void I() {
        if (this.f2486z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2468f0 != null && (A(0).f2432m || this.f2481u != null)) {
                z2 = true;
            }
            if (z2 && this.f2469g0 == null) {
                this.f2469g0 = w.b(this.f2468f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2469g0) == null) {
                    return;
                }
                w.c(this.f2468f0, onBackInvokedCallback);
                this.f2469g0 = null;
            }
        }
    }

    @Override // g.q
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2471k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0142C) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.q
    public final void b() {
        if (this.f2475o != null) {
            B();
            if (this.f2475o.f()) {
                return;
            }
            C(0);
        }
    }

    @Override // g.q
    public final void d() {
        String str;
        this.f2451O = true;
        m(false, true);
        y();
        Object obj = this.f2470j;
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
                AbstractC0149a abstractC0149a = this.f2475o;
                if (abstractC0149a == null) {
                    this.f2464b0 = true;
                } else {
                    abstractC0149a.l(true);
                }
            }
            synchronized (q.h) {
                q.f(this);
                q.f2593g.add(new WeakReference(this));
            }
        }
        this.f2454R = new Configuration(this.f2471k.getResources().getConfiguration());
        this.f2452P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // g.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        AbstractC0149a abstractC0149a;
        y yVar;
        y yVar2;
        if (this.f2470j instanceof Activity) {
            synchronized (q.h) {
                q.f(this);
            }
        }
        if (this.f2461Y) {
            this.f2472l.getDecorView().removeCallbacks(this.f2463a0);
        }
        this.f2453Q = true;
        if (this.f2455S != -100) {
            Object obj = this.f2470j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2436h0.put(this.f2470j.getClass().getName(), Integer.valueOf(this.f2455S));
                abstractC0149a = this.f2475o;
                if (abstractC0149a != null) {
                    abstractC0149a.h();
                }
                yVar = this.f2459W;
                if (yVar != null) {
                    yVar.c();
                }
                yVar2 = this.f2460X;
                if (yVar2 == null) {
                    yVar2.c();
                    return;
                }
                return;
            }
        }
        f2436h0.remove(this.f2470j.getClass().getName());
        abstractC0149a = this.f2475o;
        if (abstractC0149a != null) {
        }
        yVar = this.f2459W;
        if (yVar != null) {
        }
        yVar2 = this.f2460X;
        if (yVar2 == null) {
        }
    }

    @Override // g.q
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2446J && i == 108) {
            return false;
        }
        if (this.F && i == 1) {
            this.F = false;
        }
        if (i == 1) {
            I();
            this.f2446J = true;
            return true;
        }
        if (i == 2) {
            I();
            this.f2441D = true;
            return true;
        }
        if (i == 5) {
            I();
            this.f2442E = true;
            return true;
        }
        if (i == 10) {
            I();
            this.f2444H = true;
            return true;
        }
        if (i == 108) {
            I();
            this.F = true;
            return true;
        }
        if (i != 109) {
            return this.f2472l.requestFeature(i);
        }
        I();
        this.f2443G = true;
        return true;
    }

    @Override // g.q
    public final void h(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f2438A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2471k).inflate(i, viewGroup);
        this.f2473m.a(this.f2472l.getCallback());
    }

    @Override // g.q
    public final void i(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f2438A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2473m.a(this.f2472l.getCallback());
    }

    @Override // g.q
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f2438A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2473m.a(this.f2472l.getCallback());
    }

    @Override // g.q
    public final void k(CharSequence charSequence) {
        this.f2477q = charSequence;
        InterfaceC0273l0 interfaceC0273l0 = this.f2478r;
        if (interfaceC0273l0 != null) {
            interfaceC0273l0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0149a abstractC0149a = this.f2475o;
        if (abstractC0149a != null) {
            abstractC0149a.n(charSequence);
            return;
        }
        TextView textView = this.f2439B;
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
    public final AbstractC0170b l(InterfaceC0169a interfaceC0169a) {
        AbstractC0170b onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC0170b abstractC0170b;
        int i = 1;
        if (interfaceC0169a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0170b abstractC0170b2 = this.f2481u;
        if (abstractC0170b2 != null) {
            abstractC0170b2.a();
        }
        B.j jVar = new B.j(this, interfaceC0169a);
        B();
        AbstractC0149a abstractC0149a = this.f2475o;
        ?? r2 = this.f2474n;
        if (abstractC0149a != null) {
            AbstractC0170b o2 = abstractC0149a.o(jVar);
            this.f2481u = o2;
            if (o2 != null) {
                r2.onSupportActionModeStarted(o2);
            }
        }
        if (this.f2481u == null) {
            C0009e0 c0009e0 = this.f2485y;
            if (c0009e0 != null) {
                c0009e0.b();
            }
            AbstractC0170b abstractC0170b3 = this.f2481u;
            if (abstractC0170b3 != null) {
                abstractC0170b3.a();
            }
            if (!this.f2453Q) {
                try {
                    onWindowStartingSupportActionMode = r2.onWindowStartingSupportActionMode(jVar);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    this.f2481u = onWindowStartingSupportActionMode;
                } else {
                    if (this.f2482v == null) {
                        boolean z2 = this.f2445I;
                        Context context = this.f2471k;
                        if (z2) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.luckyarcade.spinthrow.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                j.d dVar = new j.d(context, 0);
                                dVar.getTheme().setTo(newTheme);
                                context = dVar;
                            }
                            this.f2482v = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.luckyarcade.spinthrow.R.attr.actionModePopupWindowStyle);
                            this.f2483w = popupWindow;
                            Q.m.d(popupWindow, 2);
                            this.f2483w.setContentView(this.f2482v);
                            this.f2483w.setWidth(-1);
                            context.getTheme().resolveAttribute(com.luckyarcade.spinthrow.R.attr.actionBarSize, typedValue, true);
                            this.f2482v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f2483w.setHeight(-2);
                            this.f2484x = new r(this, i);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f2438A.findViewById(com.luckyarcade.spinthrow.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                B();
                                AbstractC0149a abstractC0149a2 = this.f2475o;
                                Context e2 = abstractC0149a2 != null ? abstractC0149a2.e() : null;
                                if (e2 != null) {
                                    context = e2;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.f2482v = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.f2482v != null) {
                        C0009e0 c0009e02 = this.f2485y;
                        if (c0009e02 != null) {
                            c0009e02.b();
                        }
                        this.f2482v.e();
                        Context context2 = this.f2482v.getContext();
                        ActionBarContextView actionBarContextView = this.f2482v;
                        j.e eVar = new j.e();
                        eVar.f2819c = context2;
                        eVar.f2820d = actionBarContextView;
                        eVar.f2821e = jVar;
                        MenuC0202m menuC0202m = new MenuC0202m(actionBarContextView.getContext());
                        menuC0202m.f3070l = 1;
                        eVar.h = menuC0202m;
                        menuC0202m.f3065e = eVar;
                        if (((InterfaceC0169a) jVar.f36b).b(eVar, menuC0202m)) {
                            eVar.g();
                            this.f2482v.c(eVar);
                            this.f2481u = eVar;
                            if (this.f2486z && (viewGroup = this.f2438A) != null && viewGroup.isLaidOut()) {
                                this.f2482v.setAlpha(0.0f);
                                C0009e0 a2 = X.a(this.f2482v);
                                a2.a(1.0f);
                                this.f2485y = a2;
                                a2.d(new t(i, this));
                            } else {
                                this.f2482v.setAlpha(1.0f);
                                this.f2482v.setVisibility(0);
                                if (this.f2482v.getParent() instanceof View) {
                                    View view = (View) this.f2482v.getParent();
                                    WeakHashMap weakHashMap = X.f419a;
                                    K.J.c(view);
                                }
                            }
                            if (this.f2483w != null) {
                                this.f2472l.getDecorView().post(this.f2484x);
                            }
                        } else {
                            this.f2481u = null;
                        }
                    }
                }
                abstractC0170b = this.f2481u;
                if (abstractC0170b != null) {
                    r2.onSupportActionModeStarted(abstractC0170b);
                }
                J();
                this.f2481u = this.f2481u;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            abstractC0170b = this.f2481u;
            if (abstractC0170b != null) {
            }
            J();
            this.f2481u = this.f2481u;
        }
        J();
        return this.f2481u;
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
    public final boolean m(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        G.g b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f2453Q) {
            return false;
        }
        int i3 = this.f2455S;
        if (i3 == -100) {
            i3 = q.f2588b;
        }
        int i4 = i3;
        Context context = this.f2471k;
        int D2 = D(context, i4);
        int i5 = Build.VERSION.SDK_INT;
        G.g o2 = i5 < 33 ? o(context) : null;
        if (!z3 && o2 != null) {
            o2 = v.b(context.getResources().getConfiguration());
        }
        Configuration u2 = u(context, D2, o2, null, false);
        boolean z5 = this.f2458V;
        Object obj = this.f2470j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2454R;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i6 = configuration.uiMode & 48;
                int i7 = u2.uiMode & 48;
                G.g b3 = v.b(configuration);
                b2 = o2 != null ? null : v.b(u2);
                i2 = i6 == i7 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2451O && ((f2437j0 || this.f2452P) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(u2.getLayoutDirection());
                        }
                        if (i8 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new B0.q(11, activity));
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
                            int i9 = this.f2456T;
                            if (i9 != 0) {
                                context.setTheme(i9);
                                context.getTheme().applyStyle(this.f2456T, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof InterfaceC0086t) {
                                    if (((C0088v) ((InterfaceC0086t) activity2).getLifecycle()).f1500c.compareTo(EnumC0081n.f1491c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2452P && !this.f2453Q) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0159k)) {
                            if ((i2 & 512) != 0) {
                                ((AbstractActivityC0159k) obj).onNightModeChanged(D2);
                            }
                            if ((i2 & 4) != 0) {
                                ((AbstractActivityC0159k) obj).onLocalesChanged(o2);
                            }
                        }
                        if (b2 != null) {
                            v.c(v.b(context.getResources().getConfiguration()));
                        }
                        if (i4 == 0) {
                            z(context).i();
                        } else {
                            y yVar = this.f2459W;
                            if (yVar != null) {
                                yVar.c();
                            }
                        }
                        if (i4 == 3) {
                            if (this.f2460X == null) {
                                this.f2460X = new y(this, context);
                            }
                            this.f2460X.i();
                        } else {
                            y yVar2 = this.f2460X;
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
                    this.f2457U = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2457U = 0;
            }
        }
        this.f2458V = true;
        i = this.f2457U;
        configuration = this.f2454R;
        if (configuration == null) {
        }
        int i62 = configuration.uiMode & 48;
        int i72 = u2.uiMode & 48;
        G.g b32 = v.b(configuration);
        if (o2 != null) {
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

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2472l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        x xVar = new x(this, callback);
        this.f2473m = xVar;
        window.setCallback(xVar);
        int[] iArr = i0;
        Context context = this.f2471k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0292v a2 = C0292v.a();
            synchronized (a2) {
                drawable = a2.f3470a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2472l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2468f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2469g0) != null) {
            w.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2469g0 = null;
        }
        Object obj = this.f2470j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2468f0 = w.a(activity);
                J();
            }
        }
        this.f2468f0 = null;
        J();
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
        View c0237f;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2467e0 == null) {
            int[] iArr = f.a.f2398j;
            Context context2 = this.f2471k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2467e0 = new C0145F();
            } else {
                try {
                    this.f2467e0 = (C0145F) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2467e0 = new C0145F();
                }
            }
        }
        C0145F c0145f = this.f2467e0;
        int i2 = f1.f3365a;
        c0145f.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2412x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context dVar = (resourceId == 0 || ((context instanceof j.d) && ((j.d) context).f2814a == resourceId)) ? context : new j.d(context, resourceId);
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
                c0237f = new C0237F(dVar, attributeSet);
                break;
            case 1:
                c0237f = new C0286s(dVar, attributeSet);
                break;
            case 2:
                c0237f = new C0233B(dVar, attributeSet);
                break;
            case GameConfig.COMBO_EVERY /* 3 */:
                c0237f = c0145f.e(dVar, attributeSet);
                break;
            case 4:
                c0237f = new C0300z(dVar, attributeSet, com.luckyarcade.spinthrow.R.attr.imageButtonStyle);
                break;
            case 5:
                c0237f = new C0239H(dVar, attributeSet);
                break;
            case 6:
                c0237f = new C0249S(dVar, attributeSet);
                break;
            case 7:
                c0237f = c0145f.d(dVar, attributeSet);
                break;
            case '\b':
                c0237f = new C0269j0(dVar, attributeSet);
                break;
            case '\t':
                c0237f = new C0232A(dVar, attributeSet, 0);
                break;
            case GameConfig.SCORE_PER_STICK /* 10 */:
                c0237f = c0145f.a(dVar, attributeSet);
                break;
            case 11:
                c0237f = c0145f.c(dVar, attributeSet);
                break;
            case '\f':
                c0237f = new C0296x(dVar, attributeSet);
                break;
            case '\r':
                c0237f = c0145f.b(dVar, attributeSet);
                break;
            default:
                c0237f = null;
                break;
        }
        if (c0237f == null && context != dVar) {
            Object[] objArr = c0145f.f2498a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = dVar;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0145F.f2497g;
                        if (i3 < 3) {
                            View f2 = c0145f.f(dVar, str2, strArr[i3]);
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
                    View f3 = c0145f.f(dVar, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0237f = view2;
        }
        if (c0237f != null) {
            Context context3 = c0237f.getContext();
            if ((context3 instanceof ContextWrapper) && c0237f.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0145F.f2493c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0237f.setOnClickListener(new ViewOnClickListenerC0144E(c0237f, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = dVar.obtainStyledAttributes(attributeSet, C0145F.f2494d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = X.f419a;
                    i = 0;
                    new K.G(com.luckyarcade.spinthrow.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0237f, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = dVar.obtainStyledAttributes(attributeSet, C0145F.f2495e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    X.m(c0237f, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = dVar.obtainStyledAttributes(attributeSet, C0145F.f2496f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = X.f419a;
                    new K.G(com.luckyarcade.spinthrow.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0237f, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0237f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0200k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(MenuC0202m menuC0202m) {
        ActionMenuView actionMenuView;
        C0270k c0270k;
        InterfaceC0273l0 interfaceC0273l0 = this.f2478r;
        if (interfaceC0273l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0273l0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((d1) actionBarOverlayLayout.f1016e).f3352a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1081a) != null && actionMenuView.f1040s) {
                if (ViewConfiguration.get(this.f2471k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2478r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout2.f1016e).f3352a.f1081a;
                    if (actionMenuView2 != null) {
                        C0270k c0270k2 = actionMenuView2.f1041t;
                        if (c0270k2 != null) {
                            if (c0270k2.f3407u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2472l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2478r;
                actionBarOverlayLayout3.k();
                if (((d1) actionBarOverlayLayout3.f1016e).f3352a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2478r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((d1) actionBarOverlayLayout4.f1016e).f3352a.f1081a;
                    if (actionMenuView3 != null && (c0270k = actionMenuView3.f1041t) != null) {
                        c0270k.e();
                    }
                    if (this.f2453Q) {
                        return;
                    }
                    callback.onPanelClosed(108, A(0).h);
                    return;
                }
                if (callback == null || this.f2453Q) {
                    return;
                }
                if (this.f2461Y && (1 & this.f2462Z) != 0) {
                    View decorView = this.f2472l.getDecorView();
                    r rVar = this.f2463a0;
                    decorView.removeCallbacks(rVar);
                    rVar.run();
                }
                C0141B A2 = A(0);
                MenuC0202m menuC0202m2 = A2.h;
                if (menuC0202m2 == null || A2.f2434o || !callback.onPreparePanel(0, A2.f2428g, menuC0202m2)) {
                    return;
                }
                callback.onMenuOpened(108, A2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2478r;
                actionBarOverlayLayout5.k();
                ((d1) actionBarOverlayLayout5.f1016e).f3352a.v();
                return;
            }
        }
        C0141B A3 = A(0);
        A3.f2433n = true;
        t(A3, false);
        F(A3, null);
    }

    public final void q(int i, C0141B c0141b, MenuC0202m menuC0202m) {
        if (menuC0202m == null) {
            if (c0141b == null && i >= 0) {
                C0141B[] c0141bArr = this.f2448L;
                if (i < c0141bArr.length) {
                    c0141b = c0141bArr[i];
                }
            }
            if (c0141b != null) {
                menuC0202m = c0141b.h;
            }
        }
        if ((c0141b == null || c0141b.f2432m) && !this.f2453Q) {
            x xVar = this.f2473m;
            Window.Callback callback = this.f2472l.getCallback();
            xVar.getClass();
            try {
                xVar.f2604e = true;
                callback.onPanelClosed(i, menuC0202m);
            } finally {
                xVar.f2604e = false;
            }
        }
    }

    @Override // k.InterfaceC0200k
    public final boolean r(MenuC0202m menuC0202m, MenuItem menuItem) {
        C0141B c0141b;
        Window.Callback callback = this.f2472l.getCallback();
        if (callback != null && !this.f2453Q) {
            MenuC0202m k2 = menuC0202m.k();
            C0141B[] c0141bArr = this.f2448L;
            int length = c0141bArr != null ? c0141bArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0141b = c0141bArr[i];
                    if (c0141b != null && c0141b.h == k2) {
                        break;
                    }
                    i++;
                } else {
                    c0141b = null;
                    break;
                }
            }
            if (c0141b != null) {
                return callback.onMenuItemSelected(c0141b.f2422a, menuItem);
            }
        }
        return false;
    }

    public final void s(MenuC0202m menuC0202m) {
        C0270k c0270k;
        if (this.f2447K) {
            return;
        }
        this.f2447K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2478r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1016e).f3352a.f1081a;
        if (actionMenuView != null && (c0270k = actionMenuView.f1041t) != null) {
            c0270k.e();
            C0262g c0262g = c0270k.f3406t;
            if (c0262g != null && c0262g.b()) {
                c0262g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2472l.getCallback();
        if (callback != null && !this.f2453Q) {
            callback.onPanelClosed(108, menuC0202m);
        }
        this.f2447K = false;
    }

    public final void t(C0141B c0141b, boolean z2) {
        C0140A c0140a;
        InterfaceC0273l0 interfaceC0273l0;
        if (z2 && c0141b.f2422a == 0 && (interfaceC0273l0 = this.f2478r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0273l0;
            actionBarOverlayLayout.k();
            if (((d1) actionBarOverlayLayout.f1016e).f3352a.p()) {
                s(c0141b.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2471k.getSystemService("window");
        if (windowManager != null && c0141b.f2432m && (c0140a = c0141b.f2426e) != null) {
            windowManager.removeView(c0140a);
            if (z2) {
                q(c0141b.f2422a, c0141b, null);
            }
        }
        c0141b.f2430k = false;
        c0141b.f2431l = false;
        c0141b.f2432m = false;
        c0141b.f2427f = null;
        c0141b.f2433n = true;
        if (this.f2449M == c0141b) {
            this.f2449M = null;
        }
        if (c0141b.f2422a == 0) {
            J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ef, code lost:
    
        if (r7.e() != false) goto L80;
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
        Object obj = this.f2470j;
        if (((obj instanceof InterfaceC0015k) || (obj instanceof DialogInterfaceC0156h)) && (decorView = this.f2472l.getDecorView()) != null && q1.l.r(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            x xVar = this.f2473m;
            Window.Callback callback = this.f2472l.getCallback();
            xVar.getClass();
            try {
                xVar.f2603d = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                xVar.f2603d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2450N = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                C0141B A2 = A(0);
                if (A2.f2432m) {
                    return true;
                }
                H(A2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2481u != null) {
                    return true;
                }
                C0141B A3 = A(0);
                InterfaceC0273l0 interfaceC0273l0 = this.f2478r;
                Context context = this.f2471k;
                if (interfaceC0273l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0273l0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((d1) actionBarOverlayLayout.f1016e).f3352a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1081a) != null && actionMenuView.f1040s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2478r;
                        actionBarOverlayLayout2.k();
                        if (((d1) actionBarOverlayLayout2.f1016e).f3352a.p()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2478r;
                            actionBarOverlayLayout3.k();
                            ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout3.f1016e).f3352a.f1081a;
                            if (actionMenuView2 != null) {
                                C0270k c0270k = actionMenuView2.f1041t;
                                if (c0270k != null) {
                                }
                            }
                        } else if (!this.f2453Q && H(A3, keyEvent)) {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2478r;
                            actionBarOverlayLayout4.k();
                            z2 = ((d1) actionBarOverlayLayout4.f1016e).f3352a.v();
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
                boolean z4 = A3.f2432m;
                if (z4 || A3.f2431l) {
                    t(A3, true);
                    z2 = z4;
                    if (!z2) {
                    }
                } else {
                    if (A3.f2430k) {
                        if (A3.f2434o) {
                            A3.f2430k = false;
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
        C0141B A2 = A(i);
        if (A2.h != null) {
            Bundle bundle = new Bundle();
            A2.h.t(bundle);
            if (bundle.size() > 0) {
                A2.f2435p = bundle;
            }
            A2.h.w();
            A2.h.clear();
        }
        A2.f2434o = true;
        A2.f2433n = true;
        if ((i == 108 || i == 0) && this.f2478r != null) {
            C0141B A3 = A(0);
            A3.f2430k = false;
            H(A3, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2486z) {
            return;
        }
        int[] iArr = f.a.f2398j;
        Context context = this.f2471k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f2445I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        y();
        this.f2472l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2446J) {
            viewGroup = this.f2444H ? (ViewGroup) from.inflate(com.luckyarcade.spinthrow.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.luckyarcade.spinthrow.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2445I) {
            viewGroup = (ViewGroup) from.inflate(com.luckyarcade.spinthrow.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2443G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.luckyarcade.spinthrow.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.d(context, typedValue.resourceId) : context).inflate(com.luckyarcade.spinthrow.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0273l0 interfaceC0273l0 = (InterfaceC0273l0) viewGroup.findViewById(com.luckyarcade.spinthrow.R.id.decor_content_parent);
            this.f2478r = interfaceC0273l0;
            interfaceC0273l0.setWindowCallback(this.f2472l.getCallback());
            if (this.f2443G) {
                ((ActionBarOverlayLayout) this.f2478r).j(109);
            }
            if (this.f2441D) {
                ((ActionBarOverlayLayout) this.f2478r).j(2);
            }
            if (this.f2442E) {
                ((ActionBarOverlayLayout) this.f2478r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.f2443G + ", android:windowIsFloating: " + this.f2445I + ", windowActionModeOverlay: " + this.f2444H + ", windowNoTitle: " + this.f2446J + " }");
        }
        s sVar = new s(this, i2);
        WeakHashMap weakHashMap = X.f419a;
        K.L.u(viewGroup, sVar);
        if (this.f2478r == null) {
            this.f2439B = (TextView) viewGroup.findViewById(com.luckyarcade.spinthrow.R.id.title);
        }
        boolean z2 = i1.f3382a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.luckyarcade.spinthrow.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2472l.findViewById(R.id.content);
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
        this.f2472l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new s(this, i));
        this.f2438A = viewGroup;
        Object obj = this.f2470j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2477q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0273l0 interfaceC0273l02 = this.f2478r;
            if (interfaceC0273l02 != null) {
                interfaceC0273l02.setWindowTitle(title);
            } else {
                AbstractC0149a abstractC0149a = this.f2475o;
                if (abstractC0149a != null) {
                    abstractC0149a.n(title);
                } else {
                    TextView textView = this.f2439B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2438A.findViewById(R.id.content);
        View decorView = this.f2472l.getDecorView();
        contentFrameLayout2.f1058g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2486z = true;
        C0141B A2 = A(0);
        if (this.f2453Q || A2.h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.f2472l == null) {
            Object obj = this.f2470j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f2472l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0050g z(Context context) {
        if (this.f2459W == null) {
            if (T.r.f809e == null) {
                Context applicationContext = context.getApplicationContext();
                T.r.f809e = new T.r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2459W = new y(this, T.r.f809e);
        }
        return this.f2459W;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
