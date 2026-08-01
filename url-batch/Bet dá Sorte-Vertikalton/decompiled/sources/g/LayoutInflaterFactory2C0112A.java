package g;

import K.C0011l;
import K.InterfaceC0010k;
import K.S;
import K.Z;
import X.AbstractC0037g;
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
import j.AbstractC0137a;
import j.C0139c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0152h;
import k.C0153i;
import k.C0159o;
import k.InterfaceC0155k;
import k.MenuC0157m;
import l.C0184D;
import l.C0186F;
import l.C0196P;
import l.C0211g;
import l.C0214h0;
import l.C0219k;
import l.C0233r;
import l.C0237t;
import l.C0241v;
import l.C0245x;
import l.C0247y;
import l.C0249z;
import l.InterfaceC0218j0;
import l.InterfaceC0220k0;
import l.X0;
import l.c1;
import l.e1;
import l.h1;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0112A extends o implements InterfaceC0155k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final o.k f2302i0 = new o.k();
    public static final int[] j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2303k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2304A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2305B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2306C;

    /* renamed from: D, reason: collision with root package name */
    public View f2307D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2308E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2309G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2310H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2311I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2312J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2313K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2314L;

    /* renamed from: M, reason: collision with root package name */
    public z[] f2315M;

    /* renamed from: N, reason: collision with root package name */
    public z f2316N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2317O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2318P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2319Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2320R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2321S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2322T;

    /* renamed from: U, reason: collision with root package name */
    public int f2323U;

    /* renamed from: V, reason: collision with root package name */
    public int f2324V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2325W;

    /* renamed from: X, reason: collision with root package name */
    public w f2326X;

    /* renamed from: Y, reason: collision with root package name */
    public w f2327Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2328Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2329a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2331c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2332d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2333e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0115D f2334f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2335g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2336h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2337j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2338k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2339l;

    /* renamed from: m, reason: collision with root package name */
    public v f2340m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2341n;

    /* renamed from: o, reason: collision with root package name */
    public K f2342o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2343p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2344q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0218j0 f2345r;

    /* renamed from: s, reason: collision with root package name */
    public q f2346s;

    /* renamed from: t, reason: collision with root package name */
    public q f2347t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0137a f2348u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2349v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2350w;

    /* renamed from: x, reason: collision with root package name */
    public p f2351x;

    /* renamed from: y, reason: collision with root package name */
    public Z f2352y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2353z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final p f2330b0 = new p(this, 0);

    public LayoutInflaterFactory2C0112A(Context context, Window window, InterfaceC0129j interfaceC0129j, Object obj) {
        AbstractActivityC0128i abstractActivityC0128i;
        this.f2322T = -100;
        this.f2338k = context;
        this.f2337j = obj;
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
                this.f2322T = ((LayoutInflaterFactory2C0112A) abstractActivityC0128i.l()).f2322T;
            }
        }
        if (this.f2322T == -100) {
            o.k kVar = f2302i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2337j.getClass().getName(), null);
            if (num != null) {
                this.f2322T = num.intValue();
                kVar.remove(this.f2337j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        C0237t.d();
    }

    public static G.f m(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.f2444c) == null) {
            return null;
        }
        G.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f176a;
        if (gVar.f177a.isEmpty()) {
            fVar2 = G.f.f175b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f176a.f177a.size() + gVar.f177a.size()) {
                Locale locale = i < gVar.f177a.size() ? gVar.f177a.get(i) : b2.f176a.f177a.get(i - gVar.f177a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f176a.f177a.isEmpty() ? b2 : fVar2;
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
        this.f2329a0 = (1 << i) | this.f2329a0;
        if (this.f2328Z) {
            return;
        }
        View decorView = this.f2339l.getDecorView();
        p pVar = this.f2330b0;
        WeakHashMap weakHashMap = S.f351a;
        decorView.postOnAnimation(pVar);
        this.f2328Z = true;
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
                if (this.f2327Y == null) {
                    this.f2327Y = new w(this, context);
                }
                return this.f2327Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0220k0 interfaceC0220k0;
        X0 x02;
        boolean z2 = this.f2317O;
        this.f2317O = false;
        z y2 = y(0);
        if (y2.f2469m) {
            if (!z2) {
                p(y2, true);
            }
            return true;
        }
        AbstractC0137a abstractC0137a = this.f2348u;
        if (abstractC0137a != null) {
            abstractC0137a.a();
            return true;
        }
        z();
        K k2 = this.f2342o;
        if (k2 == null || (interfaceC0220k0 = k2.f2380g) == null || (x02 = ((c1) interfaceC0220k0).f2938a.f1295L) == null || x02.f2918b == null) {
            return false;
        }
        X0 x03 = ((c1) interfaceC0220k0).f2938a.f1295L;
        C0159o c0159o = x03 == null ? null : x03.f2918b;
        if (c0159o != null) {
            c0159o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2641f.getCount() > 0) goto L88;
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
        if (zVar.f2469m || this.f2320R) {
            return;
        }
        int i2 = zVar.f2460a;
        Context context = this.f2338k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2339l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, zVar.h)) {
            p(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f2463e;
        if (yVar == null || zVar.f2470n) {
            if (yVar == null) {
                z();
                K k2 = this.f2342o;
                Context l02 = k2 != null ? k2.l0() : null;
                if (l02 != null) {
                    context = l02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.glasspulse.glasspulse.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.glasspulse.glasspulse.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.glasspulse.glasspulse.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0139c c0139c = new C0139c(context, 0);
                c0139c.getTheme().setTo(newTheme);
                zVar.f2466j = c0139c;
                TypedArray obtainStyledAttributes = c0139c.obtainStyledAttributes(f.a.f2038j);
                zVar.f2461b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f2463e = new y(this, zVar.f2466j);
                zVar.f2462c = 81;
            } else if (zVar.f2470n && yVar.getChildCount() > 0) {
                zVar.f2463e.removeAllViews();
            }
            View view = zVar.f2465g;
            if (view == null) {
                if (zVar.h != null) {
                    if (this.f2347t == null) {
                        this.f2347t = new q(this, 3);
                    }
                    q qVar = this.f2347t;
                    if (zVar.i == null) {
                        C0153i c0153i = new C0153i(zVar.f2466j);
                        zVar.i = c0153i;
                        c0153i.f2640e = qVar;
                        MenuC0157m menuC0157m = zVar.h;
                        menuC0157m.b(c0153i, menuC0157m.f2648a);
                    }
                    C0153i c0153i2 = zVar.i;
                    y yVar2 = zVar.f2463e;
                    if (c0153i2.d == null) {
                        c0153i2.d = (ExpandedMenuView) c0153i2.f2638b.inflate(com.glasspulse.glasspulse.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c0153i2.f2641f == null) {
                            c0153i2.f2641f = new C0152h(c0153i2);
                        }
                        c0153i2.d.setAdapter((ListAdapter) c0153i2.f2641f);
                        c0153i2.d.setOnItemClickListener(c0153i2);
                    }
                    ExpandedMenuView expandedMenuView = c0153i2.d;
                    zVar.f2464f = expandedMenuView;
                }
                zVar.f2470n = true;
                return;
            }
            zVar.f2464f = view;
            if (zVar.f2464f != null) {
                if (zVar.f2465g == null) {
                    C0153i c0153i3 = zVar.i;
                    if (c0153i3.f2641f == null) {
                        c0153i3.f2641f = new C0152h(c0153i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f2464f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f2463e.setBackgroundResource(zVar.f2461b);
                ViewParent parent = zVar.f2464f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f2464f);
                }
                zVar.f2463e.addView(zVar.f2464f, layoutParams2);
                if (!zVar.f2464f.hasFocus()) {
                    zVar.f2464f.requestFocus();
                }
            }
            zVar.f2470n = true;
            return;
        }
        View view2 = zVar.f2465g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f2468l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f2462c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f2463e, layoutParams3);
            zVar.f2469m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f2468l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f2462c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f2463e, layoutParams32);
        zVar.f2469m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        MenuC0157m menuC0157m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f2467k || F(zVar, keyEvent)) && (menuC0157m = zVar.h) != null) {
            return menuC0157m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(z zVar, KeyEvent keyEvent) {
        InterfaceC0218j0 interfaceC0218j0;
        InterfaceC0218j0 interfaceC0218j02;
        Resources.Theme theme;
        InterfaceC0218j0 interfaceC0218j03;
        InterfaceC0218j0 interfaceC0218j04;
        if (this.f2320R) {
            return false;
        }
        if (zVar.f2467k) {
            return true;
        }
        z zVar2 = this.f2316N;
        if (zVar2 != null && zVar2 != zVar) {
            p(zVar2, false);
        }
        Window.Callback callback = this.f2339l.getCallback();
        int i = zVar.f2460a;
        if (callback != null) {
            zVar.f2465g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0218j04 = this.f2345r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0218j04;
            actionBarOverlayLayout.k();
            ((c1) actionBarOverlayLayout.f1238e).f2946l = true;
        }
        if (zVar.f2465g == null) {
            MenuC0157m menuC0157m = zVar.h;
            if (menuC0157m == null || zVar.f2471o) {
                if (menuC0157m == null) {
                    Context context = this.f2338k;
                    if ((i == 0 || i == 108) && this.f2345r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.glasspulse.glasspulse.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.glasspulse.glasspulse.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.glasspulse.glasspulse.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0139c c0139c = new C0139c(context, 0);
                            c0139c.getTheme().setTo(theme);
                            context = c0139c;
                        }
                    }
                    MenuC0157m menuC0157m2 = new MenuC0157m(context);
                    menuC0157m2.f2651e = this;
                    MenuC0157m menuC0157m3 = zVar.h;
                    if (menuC0157m2 != menuC0157m3) {
                        if (menuC0157m3 != null) {
                            menuC0157m3.r(zVar.i);
                        }
                        zVar.h = menuC0157m2;
                        C0153i c0153i = zVar.i;
                        if (c0153i != null) {
                            menuC0157m2.b(c0153i, menuC0157m2.f2648a);
                        }
                    }
                    if (zVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0218j02 = this.f2345r) != null) {
                    if (this.f2346s == null) {
                        this.f2346s = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0218j02).l(zVar.h, this.f2346s);
                }
                zVar.h.w();
                if (!callback.onCreatePanelMenu(i, zVar.h)) {
                    MenuC0157m menuC0157m4 = zVar.h;
                    if (menuC0157m4 != null) {
                        if (menuC0157m4 != null) {
                            menuC0157m4.r(zVar.i);
                        }
                        zVar.h = null;
                    }
                    if (z2 && (interfaceC0218j0 = this.f2345r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0218j0).l(null, this.f2346s);
                    }
                    return false;
                }
                zVar.f2471o = false;
            }
            zVar.h.w();
            Bundle bundle = zVar.f2472p;
            if (bundle != null) {
                zVar.h.s(bundle);
                zVar.f2472p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f2465g, zVar.h)) {
                if (z2 && (interfaceC0218j03 = this.f2345r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0218j03).l(null, this.f2346s);
                }
                zVar.h.v();
                return false;
            }
            zVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            zVar.h.v();
        }
        zVar.f2467k = true;
        zVar.f2468l = false;
        this.f2316N = zVar;
        return true;
    }

    public final void G() {
        if (this.f2304A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2335g0 != null && (y(0).f2469m || this.f2348u != null)) {
                z2 = true;
            }
            if (z2 && this.f2336h0 == null) {
                this.f2336h0 = u.b(this.f2335g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2336h0) == null) {
                    return;
                }
                u.c(this.f2335g0, onBackInvokedCallback);
                this.f2336h0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2338k);
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
        this.f2318P = true;
        k(false, true);
        w();
        Object obj = this.f2337j;
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
                K k2 = this.f2342o;
                if (k2 == null) {
                    this.f2331c0 = true;
                } else {
                    k2.n0(true);
                }
            }
            synchronized (o.h) {
                o.e(this);
                o.f2447g.add(new WeakReference(this));
            }
        }
        this.f2321S = new Configuration(this.f2338k.getResources().getConfiguration());
        this.f2319Q = true;
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
        if (this.f2337j instanceof Activity) {
            synchronized (o.h) {
                o.e(this);
            }
        }
        if (this.f2328Z) {
            this.f2339l.getDecorView().removeCallbacks(this.f2330b0);
        }
        this.f2320R = true;
        if (this.f2322T != -100) {
            Object obj = this.f2337j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2302i0.put(this.f2337j.getClass().getName(), Integer.valueOf(this.f2322T));
                wVar = this.f2326X;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.f2327Y;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f2302i0.remove(this.f2337j.getClass().getName());
        wVar = this.f2326X;
        if (wVar != null) {
        }
        wVar2 = this.f2327Y;
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
        if (this.f2313K && i == 108) {
            return false;
        }
        if (this.f2309G && i == 1) {
            this.f2309G = false;
        }
        if (i == 1) {
            G();
            this.f2313K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2308E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2311I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2309G = true;
            return true;
        }
        if (i != 109) {
            return this.f2339l.requestFeature(i);
        }
        G();
        this.f2310H = true;
        return true;
    }

    @Override // g.o
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2305B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2338k).inflate(i, viewGroup);
        this.f2340m.a(this.f2339l.getCallback());
    }

    @Override // g.o
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2305B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2340m.a(this.f2339l.getCallback());
    }

    @Override // g.o
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2305B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2340m.a(this.f2339l.getCallback());
    }

    @Override // g.o
    public final void j(CharSequence charSequence) {
        this.f2344q = charSequence;
        InterfaceC0218j0 interfaceC0218j0 = this.f2345r;
        if (interfaceC0218j0 != null) {
            interfaceC0218j0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2342o;
        if (k2 == null) {
            TextView textView = this.f2306C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        c1 c1Var = (c1) k2.f2380g;
        if (c1Var.f2943g) {
            return;
        }
        c1Var.h = charSequence;
        if ((c1Var.f2939b & 8) != 0) {
            Toolbar toolbar = c1Var.f2938a;
            toolbar.setTitle(charSequence);
            if (c1Var.f2943g) {
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
        if (this.f2320R) {
            return false;
        }
        int i3 = this.f2322T;
        if (i3 == -100) {
            i3 = o.f2443b;
        }
        Context context = this.f2338k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f m2 = i4 < 33 ? m(context) : null;
        if (!z3 && m2 != null) {
            m2 = t.b(context.getResources().getConfiguration());
        }
        Configuration r2 = r(context, B2, m2, null, false);
        boolean z5 = this.f2325W;
        Object obj = this.f2337j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2321S;
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
                if (((~i) & i2) != 0 && z2 && this.f2318P && ((f2303k0 || this.f2319Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(r2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new G0.o(11, activity));
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
                            int i8 = this.f2323U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2323U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).d().f1448c.compareTo(EnumC0072m.f1440c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2319Q && !this.f2320R) {
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
                            w wVar = this.f2326X;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2327Y == null) {
                                this.f2327Y = new w(this, context);
                            }
                            this.f2327Y.i();
                        } else {
                            w wVar2 = this.f2327Y;
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
                    this.f2324V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2324V = 0;
            }
        }
        this.f2325W = true;
        i = this.f2324V;
        configuration = this.f2321S;
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
        if (this.f2339l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f2340m = vVar;
        window.setCallback(vVar);
        int[] iArr = j0;
        Context context = this.f2338k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0237t a2 = C0237t.a();
            synchronized (a2) {
                drawable = a2.f3035a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2339l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2335g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2336h0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2336h0 = null;
        }
        Object obj = this.f2337j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2335g0 = u.a(activity);
                H();
            }
        }
        this.f2335g0 = null;
        H();
    }

    public final void n(int i, z zVar, MenuC0157m menuC0157m) {
        if (menuC0157m == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f2315M;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                menuC0157m = zVar.h;
            }
        }
        if ((zVar == null || zVar.f2469m) && !this.f2320R) {
            v vVar = this.f2340m;
            Window.Callback callback = this.f2339l.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i, menuC0157m);
            } finally {
                vVar.d = false;
            }
        }
    }

    public final void o(MenuC0157m menuC0157m) {
        C0219k c0219k;
        if (this.f2314L) {
            return;
        }
        this.f2314L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2345r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.f1238e).f2938a.f1301a;
        if (actionMenuView != null && (c0219k = actionMenuView.f1262t) != null) {
            c0219k.e();
            C0211g c0211g = c0219k.f2988t;
            if (c0211g != null && c0211g.b()) {
                c0211g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2339l.getCallback();
        if (callback != null && !this.f2320R) {
            callback.onPanelClosed(108, menuC0157m);
        }
        this.f2314L = false;
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
        View c0184d;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2334f0 == null) {
            int[] iArr = f.a.f2038j;
            Context context2 = this.f2338k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2334f0 = new C0115D();
            } else {
                try {
                    this.f2334f0 = (C0115D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2334f0 = new C0115D();
                }
            }
        }
        C0115D c0115d = this.f2334f0;
        int i2 = e1.f2950a;
        c0115d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2052x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0139c = (resourceId == 0 || ((context instanceof C0139c) && ((C0139c) context).f2515a == resourceId)) ? context : new C0139c(context, resourceId);
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
                c0184d = new C0184D(c0139c, attributeSet);
                break;
            case 1:
                c0184d = new C0233r(c0139c, attributeSet);
                break;
            case 2:
                c0184d = new C0249z(c0139c, attributeSet);
                break;
            case 3:
                c0184d = c0115d.e(c0139c, attributeSet);
                break;
            case 4:
                c0184d = new C0245x(c0139c, attributeSet, com.glasspulse.glasspulse.R.attr.imageButtonStyle);
                break;
            case 5:
                c0184d = new C0186F(c0139c, attributeSet);
                break;
            case 6:
                c0184d = new C0196P(c0139c, attributeSet);
                break;
            case 7:
                c0184d = c0115d.d(c0139c, attributeSet);
                break;
            case '\b':
                c0184d = new C0214h0(c0139c, attributeSet);
                break;
            case '\t':
                c0184d = new C0247y(c0139c, attributeSet, 0);
                break;
            case '\n':
                c0184d = c0115d.a(c0139c, attributeSet);
                break;
            case 11:
                c0184d = c0115d.c(c0139c, attributeSet);
                break;
            case '\f':
                c0184d = new C0241v(c0139c, attributeSet);
                break;
            case '\r':
                c0184d = c0115d.b(c0139c, attributeSet);
                break;
            default:
                c0184d = null;
                break;
        }
        if (c0184d == null && context != c0139c) {
            Object[] objArr = c0115d.f2363a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0139c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0115D.f2362g;
                        if (i3 < 3) {
                            View f2 = c0115d.f(c0139c, str2, strArr[i3]);
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
                    View f3 = c0115d.f(c0139c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0184d = view2;
        }
        if (c0184d != null) {
            Context context3 = c0184d.getContext();
            if ((context3 instanceof ContextWrapper) && c0184d.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0115D.f2359c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0184d.setOnClickListener(new ViewOnClickListenerC0114C(c0184d, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0139c.obtainStyledAttributes(attributeSet, C0115D.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = S.f351a;
                    i = 0;
                    new K.B(com.glasspulse.glasspulse.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0184d, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0139c.obtainStyledAttributes(attributeSet, C0115D.f2360e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    S.m(c0184d, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0139c.obtainStyledAttributes(attributeSet, C0115D.f2361f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = S.f351a;
                    new K.B(com.glasspulse.glasspulse.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0184d, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0184d;
    }

    public final void p(z zVar, boolean z2) {
        y yVar;
        InterfaceC0218j0 interfaceC0218j0;
        C0219k c0219k;
        if (z2 && zVar.f2460a == 0 && (interfaceC0218j0 = this.f2345r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0218j0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.f1238e).f2938a.f1301a;
            if (actionMenuView != null && (c0219k = actionMenuView.f1262t) != null && c0219k.i()) {
                o(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2338k.getSystemService("window");
        if (windowManager != null && zVar.f2469m && (yVar = zVar.f2463e) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                n(zVar.f2460a, zVar, null);
            }
        }
        zVar.f2467k = false;
        zVar.f2468l = false;
        zVar.f2469m = false;
        zVar.f2464f = null;
        zVar.f2470n = true;
        if (this.f2316N == zVar) {
            this.f2316N = null;
        }
        if (zVar.f2460a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0155k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(MenuC0157m menuC0157m) {
        ActionMenuView actionMenuView;
        C0219k c0219k;
        C0219k c0219k2;
        C0219k c0219k3;
        InterfaceC0218j0 interfaceC0218j0 = this.f2345r;
        if (interfaceC0218j0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0218j0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((c1) actionBarOverlayLayout.f1238e).f2938a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1301a) != null && actionMenuView.f1261s) {
                if (ViewConfiguration.get(this.f2338k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2345r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.f1238e).f2938a.f1301a;
                    if (actionMenuView2 != null) {
                        C0219k c0219k4 = actionMenuView2.f1262t;
                        if (c0219k4 != null) {
                            if (c0219k4.f2989u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2339l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2345r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.f1238e).f2938a.f1301a;
                if ((actionMenuView3 == null || (c0219k3 = actionMenuView3.f1262t) == null || !c0219k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2345r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.f1238e).f2938a.f1301a;
                    if (actionMenuView4 != null && (c0219k2 = actionMenuView4.f1262t) != null) {
                        c0219k2.e();
                    }
                    if (this.f2320R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2320R) {
                    return;
                }
                if (this.f2328Z && (1 & this.f2329a0) != 0) {
                    View decorView = this.f2339l.getDecorView();
                    p pVar = this.f2330b0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z y2 = y(0);
                MenuC0157m menuC0157m2 = y2.h;
                if (menuC0157m2 == null || y2.f2471o || !callback.onPreparePanel(0, y2.f2465g, menuC0157m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2345r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((c1) actionBarOverlayLayout5.f1238e).f2938a.f1301a;
                if (actionMenuView5 == null || (c0219k = actionMenuView5.f1262t) == null) {
                    return;
                }
                c0219k.l();
                return;
            }
        }
        z y3 = y(0);
        y3.f2470n = true;
        p(y3, false);
        D(y3, null);
    }

    @Override // k.InterfaceC0155k
    public final boolean s(MenuC0157m menuC0157m, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f2339l.getCallback();
        if (callback != null && !this.f2320R) {
            MenuC0157m k2 = menuC0157m.k();
            z[] zVarArr = this.f2315M;
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
                return callback.onMenuItemSelected(zVar.f2460a, menuItem);
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
        C0219k c0219k;
        Object obj = this.f2337j;
        if (((obj instanceof InterfaceC0010k) || (obj instanceof DialogInterfaceC0125f)) && (decorView = this.f2339l.getDecorView()) != null && u1.l.q(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            v vVar = this.f2340m;
            Window.Callback callback = this.f2339l.getCallback();
            vVar.getClass();
            try {
                vVar.f2455c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                vVar.f2455c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2317O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                z y2 = y(0);
                if (y2.f2469m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2348u != null) {
                    return true;
                }
                z y3 = y(0);
                InterfaceC0218j0 interfaceC0218j0 = this.f2345r;
                Context context = this.f2338k;
                if (interfaceC0218j0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0218j0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((c1) actionBarOverlayLayout.f1238e).f2938a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1301a) != null && actionMenuView.f1261s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2345r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.f1238e).f2938a.f1301a;
                        if (actionMenuView2 == null || (c0219k = actionMenuView2.f1262t) == null || !c0219k.i()) {
                            if (!this.f2320R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2345r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.f1238e).f2938a.f1301a;
                                if (actionMenuView3 != null) {
                                    C0219k c0219k2 = actionMenuView3.f1262t;
                                    if (c0219k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2345r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.f1238e).f2938a.f1301a;
                            if (actionMenuView4 != null) {
                                C0219k c0219k3 = actionMenuView4.f1262t;
                                if (c0219k3 != null) {
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
                boolean z4 = y3.f2469m;
                if (z4 || y3.f2468l) {
                    p(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2467k) {
                        if (y3.f2471o) {
                            y3.f2467k = false;
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
                y2.f2472p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2471o = true;
        y2.f2470n = true;
        if ((i == 108 || i == 0) && this.f2345r != null) {
            z y3 = y(0);
            y3.f2467k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2304A) {
            return;
        }
        int[] iArr = f.a.f2038j;
        Context context = this.f2338k;
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
        this.f2312J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2339l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2313K) {
            viewGroup = this.f2311I ? (ViewGroup) from.inflate(com.glasspulse.glasspulse.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.glasspulse.glasspulse.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2312J) {
            viewGroup = (ViewGroup) from.inflate(com.glasspulse.glasspulse.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2310H = false;
            this.f2309G = false;
        } else if (this.f2309G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.glasspulse.glasspulse.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0139c(context, typedValue.resourceId) : context).inflate(com.glasspulse.glasspulse.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0218j0 interfaceC0218j0 = (InterfaceC0218j0) viewGroup.findViewById(com.glasspulse.glasspulse.R.id.decor_content_parent);
            this.f2345r = interfaceC0218j0;
            interfaceC0218j0.setWindowCallback(this.f2339l.getCallback());
            if (this.f2310H) {
                ((ActionBarOverlayLayout) this.f2345r).j(109);
            }
            if (this.f2308E) {
                ((ActionBarOverlayLayout) this.f2345r).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.f2345r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2309G + ", windowActionBarOverlay: " + this.f2310H + ", android:windowIsFloating: " + this.f2312J + ", windowActionModeOverlay: " + this.f2311I + ", windowNoTitle: " + this.f2313K + " }");
        }
        q qVar = new q(this, i2);
        WeakHashMap weakHashMap = S.f351a;
        K.G.u(viewGroup, qVar);
        if (this.f2345r == null) {
            this.f2306C = (TextView) viewGroup.findViewById(com.glasspulse.glasspulse.R.id.title);
        }
        boolean z2 = h1.f2967a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.glasspulse.glasspulse.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2339l.findViewById(R.id.content);
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
        this.f2339l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i));
        this.f2305B = viewGroup;
        Object obj = this.f2337j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2344q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0218j0 interfaceC0218j02 = this.f2345r;
            if (interfaceC0218j02 != null) {
                interfaceC0218j02.setWindowTitle(title);
            } else {
                K k2 = this.f2342o;
                if (k2 != null) {
                    c1 c1Var = (c1) k2.f2380g;
                    if (!c1Var.f2943g) {
                        c1Var.h = title;
                        if ((c1Var.f2939b & 8) != 0) {
                            Toolbar toolbar = c1Var.f2938a;
                            toolbar.setTitle(title);
                            if (c1Var.f2943g) {
                                S.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2306C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2305B.findViewById(R.id.content);
        View decorView = this.f2339l.getDecorView();
        contentFrameLayout2.f1281g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2304A = true;
        z y2 = y(0);
        if (this.f2320R || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2339l == null) {
            Object obj = this.f2337j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f2339l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0037g x(Context context) {
        if (this.f2326X == null) {
            if (C0011l.f402e == null) {
                Context applicationContext = context.getApplicationContext();
                C0011l.f402e = new C0011l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2326X = new w(this, C0011l.f402e);
        }
        return this.f2326X;
    }

    public final z y(int i) {
        z[] zVarArr = this.f2315M;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f2315M = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f2460a = i;
        zVar2.f2470n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void z() {
        v();
        if (this.f2309G && this.f2342o == null) {
            Object obj = this.f2337j;
            if (obj instanceof Activity) {
                this.f2342o = new K((Activity) obj, this.f2310H);
            } else if (obj instanceof Dialog) {
                this.f2342o = new K((Dialog) obj);
            }
            K k2 = this.f2342o;
            if (k2 != null) {
                k2.n0(this.f2331c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
