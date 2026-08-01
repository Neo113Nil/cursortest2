package g;

import M.InterfaceC0010k;
import M.Q;
import M.Y;
import Z.AbstractC0037g;
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
import f.AbstractC0084a;
import j.AbstractC0144a;
import j.C0146c;
import j.C0151h;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0170h;
import l.C0172A;
import l.C0187g;
import l.C0194j0;
import l.C0195k;
import l.C0210s;
import l.C0214u;
import l.C0218w;
import l.C0222y;
import l.C0224z;
import l.InterfaceC0198l0;
import l.InterfaceC0200m0;
import l.Z0;
import l.e1;
import l.g1;
import l.j1;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0101A extends o implements k.k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final q.k f2184i0 = new q.k();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f2185j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2186k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2187A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2188B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2189C;

    /* renamed from: D, reason: collision with root package name */
    public View f2190D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2191E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2192F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2193G;
    public boolean H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2194I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2195J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2196K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2197L;

    /* renamed from: M, reason: collision with root package name */
    public z[] f2198M;

    /* renamed from: N, reason: collision with root package name */
    public z f2199N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2200O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2201P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2202Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2203R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2204S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2205T;

    /* renamed from: U, reason: collision with root package name */
    public int f2206U;

    /* renamed from: V, reason: collision with root package name */
    public int f2207V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2208W;

    /* renamed from: X, reason: collision with root package name */
    public w f2209X;

    /* renamed from: Y, reason: collision with root package name */
    public w f2210Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2211Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2212a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2214c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2215d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2216e0;

    /* renamed from: f0, reason: collision with root package name */
    public D f2217f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2218g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2219h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2220j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2221k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2222l;

    /* renamed from: m, reason: collision with root package name */
    public v f2223m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2224n;

    /* renamed from: o, reason: collision with root package name */
    public K f2225o;

    /* renamed from: p, reason: collision with root package name */
    public C0151h f2226p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2227q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0198l0 f2228r;

    /* renamed from: s, reason: collision with root package name */
    public q f2229s;

    /* renamed from: t, reason: collision with root package name */
    public q f2230t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0144a f2231u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2232v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2233w;

    /* renamed from: x, reason: collision with root package name */
    public p f2234x;

    /* renamed from: y, reason: collision with root package name */
    public Y f2235y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2236z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final p f2213b0 = new p(this, 0);

    public LayoutInflaterFactory2C0101A(Context context, Window window, InterfaceC0111j interfaceC0111j, Object obj) {
        AbstractActivityC0110i abstractActivityC0110i;
        this.f2205T = -100;
        this.f2221k = context;
        this.f2220j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0110i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0110i = (AbstractActivityC0110i) context;
                    break;
                }
            }
            abstractActivityC0110i = null;
            if (abstractActivityC0110i != null) {
                this.f2205T = ((LayoutInflaterFactory2C0101A) abstractActivityC0110i.n()).f2205T;
            }
        }
        if (this.f2205T == -100) {
            q.k kVar = f2184i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2220j.getClass().getName(), null);
            if (num != null) {
                this.f2205T = num.intValue();
                kVar.remove(this.f2220j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        C0214u.d();
    }

    public static I.f m(Context context) {
        I.f fVar;
        I.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.f2328c) == null) {
            return null;
        }
        I.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        I.g gVar = fVar.f333a;
        if (gVar.f334a.isEmpty()) {
            fVar2 = I.f.f332b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f333a.f334a.size() + gVar.f334a.size()) {
                Locale locale = i < gVar.f334a.size() ? gVar.f334a.get(i) : b2.f333a.f334a.get(i - gVar.f334a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new I.f(new I.g(I.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f333a.f334a.isEmpty() ? b2 : fVar2;
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
            t.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f2212a0 = (1 << i) | this.f2212a0;
        if (this.f2211Z) {
            return;
        }
        View decorView = this.f2222l.getDecorView();
        p pVar = this.f2213b0;
        WeakHashMap weakHashMap = Q.f513a;
        decorView.postOnAnimation(pVar);
        this.f2211Z = true;
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
                if (this.f2210Y == null) {
                    this.f2210Y = new w(this, context);
                }
                return this.f2210Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0200m0 interfaceC0200m0;
        Z0 z02;
        boolean z2 = this.f2200O;
        this.f2200O = false;
        z y2 = y(0);
        if (y2.f2354m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0144a abstractC0144a = this.f2231u;
        if (abstractC0144a != null) {
            abstractC0144a.a();
            return true;
        }
        z();
        K k2 = this.f2225o;
        if (k2 == null || (interfaceC0200m0 = k2.f2264e) == null || (z02 = ((e1) interfaceC0200m0).f2979a.f1425L) == null || z02.f2957b == null) {
            return false;
        }
        Z0 z03 = ((e1) interfaceC0200m0).f2979a.f1425L;
        k.o oVar = z03 == null ? null : z03.f2957b;
        if (oVar != null) {
            oVar.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2758f.getCount() > 0) goto L88;
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
        if (zVar.f2354m || this.f2203R) {
            return;
        }
        int i2 = zVar.f2345a;
        Context context = this.f2221k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2222l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, zVar.h)) {
            r(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f2348e;
        if (yVar == null || zVar.f2355n) {
            if (yVar == null) {
                z();
                K k2 = this.f2225o;
                Context z02 = k2 != null ? k2.z0() : null;
                if (z02 != null) {
                    context = z02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.winfour.neondrop.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.winfour.neondrop.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.winfour.neondrop.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0146c c0146c = new C0146c(context, 0);
                c0146c.getTheme().setTo(newTheme);
                zVar.f2351j = c0146c;
                TypedArray obtainStyledAttributes = c0146c.obtainStyledAttributes(AbstractC0084a.f2133j);
                zVar.f2346b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f2348e = new y(this, zVar.f2351j);
                zVar.f2347c = 81;
            } else if (zVar.f2355n && yVar.getChildCount() > 0) {
                zVar.f2348e.removeAllViews();
            }
            View view = zVar.f2350g;
            if (view == null) {
                if (zVar.h != null) {
                    if (this.f2230t == null) {
                        this.f2230t = new q(this, 3);
                    }
                    q qVar = this.f2230t;
                    if (zVar.i == null) {
                        k.i iVar = new k.i(zVar.f2351j);
                        zVar.i = iVar;
                        iVar.f2757e = qVar;
                        k.m mVar = zVar.h;
                        mVar.b(iVar, mVar.f2765a);
                    }
                    k.i iVar2 = zVar.i;
                    y yVar2 = zVar.f2348e;
                    if (iVar2.d == null) {
                        iVar2.d = (ExpandedMenuView) iVar2.f2755b.inflate(com.winfour.neondrop.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (iVar2.f2758f == null) {
                            iVar2.f2758f = new C0170h(iVar2);
                        }
                        iVar2.d.setAdapter((ListAdapter) iVar2.f2758f);
                        iVar2.d.setOnItemClickListener(iVar2);
                    }
                    ExpandedMenuView expandedMenuView = iVar2.d;
                    zVar.f2349f = expandedMenuView;
                }
                zVar.f2355n = true;
                return;
            }
            zVar.f2349f = view;
            if (zVar.f2349f != null) {
                if (zVar.f2350g == null) {
                    k.i iVar3 = zVar.i;
                    if (iVar3.f2758f == null) {
                        iVar3.f2758f = new C0170h(iVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f2349f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f2348e.setBackgroundResource(zVar.f2346b);
                ViewParent parent = zVar.f2349f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f2349f);
                }
                zVar.f2348e.addView(zVar.f2349f, layoutParams2);
                if (!zVar.f2349f.hasFocus()) {
                    zVar.f2349f.requestFocus();
                }
            }
            zVar.f2355n = true;
            return;
        }
        View view2 = zVar.f2350g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f2353l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f2347c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f2348e, layoutParams3);
            zVar.f2354m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f2353l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f2347c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f2348e, layoutParams32);
        zVar.f2354m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        k.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f2352k || F(zVar, keyEvent)) && (mVar = zVar.h) != null) {
            return mVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(z zVar, KeyEvent keyEvent) {
        InterfaceC0198l0 interfaceC0198l0;
        InterfaceC0198l0 interfaceC0198l02;
        Resources.Theme theme;
        InterfaceC0198l0 interfaceC0198l03;
        InterfaceC0198l0 interfaceC0198l04;
        if (this.f2203R) {
            return false;
        }
        if (zVar.f2352k) {
            return true;
        }
        z zVar2 = this.f2199N;
        if (zVar2 != null && zVar2 != zVar) {
            r(zVar2, false);
        }
        Window.Callback callback = this.f2222l.getCallback();
        int i = zVar.f2345a;
        if (callback != null) {
            zVar.f2350g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0198l04 = this.f2228r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0198l04;
            actionBarOverlayLayout.k();
            ((e1) actionBarOverlayLayout.f1371e).f2987l = true;
        }
        if (zVar.f2350g == null) {
            k.m mVar = zVar.h;
            if (mVar == null || zVar.f2356o) {
                if (mVar == null) {
                    Context context = this.f2221k;
                    if ((i == 0 || i == 108) && this.f2228r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.winfour.neondrop.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.winfour.neondrop.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.winfour.neondrop.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0146c c0146c = new C0146c(context, 0);
                            c0146c.getTheme().setTo(theme);
                            context = c0146c;
                        }
                    }
                    k.m mVar2 = new k.m(context);
                    mVar2.f2768e = this;
                    k.m mVar3 = zVar.h;
                    if (mVar2 != mVar3) {
                        if (mVar3 != null) {
                            mVar3.r(zVar.i);
                        }
                        zVar.h = mVar2;
                        k.i iVar = zVar.i;
                        if (iVar != null) {
                            mVar2.b(iVar, mVar2.f2765a);
                        }
                    }
                    if (zVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0198l02 = this.f2228r) != null) {
                    if (this.f2229s == null) {
                        this.f2229s = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0198l02).l(zVar.h, this.f2229s);
                }
                zVar.h.w();
                if (!callback.onCreatePanelMenu(i, zVar.h)) {
                    k.m mVar4 = zVar.h;
                    if (mVar4 != null) {
                        if (mVar4 != null) {
                            mVar4.r(zVar.i);
                        }
                        zVar.h = null;
                    }
                    if (z2 && (interfaceC0198l0 = this.f2228r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0198l0).l(null, this.f2229s);
                    }
                    return false;
                }
                zVar.f2356o = false;
            }
            zVar.h.w();
            Bundle bundle = zVar.f2357p;
            if (bundle != null) {
                zVar.h.s(bundle);
                zVar.f2357p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f2350g, zVar.h)) {
                if (z2 && (interfaceC0198l03 = this.f2228r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0198l03).l(null, this.f2229s);
                }
                zVar.h.v();
                return false;
            }
            zVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            zVar.h.v();
        }
        zVar.f2352k = true;
        zVar.f2353l = false;
        this.f2199N = zVar;
        return true;
    }

    public final void G() {
        if (this.f2187A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2218g0 != null && (y(0).f2354m || this.f2231u != null)) {
                z2 = true;
            }
            if (z2 && this.f2219h0 == null) {
                this.f2219h0 = u.b(this.f2218g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2219h0) == null) {
                    return;
                }
                u.c(this.f2218g0, onBackInvokedCallback);
                this.f2219h0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2221k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0101A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.o
    public final void c() {
        String str;
        this.f2201P = true;
        k(false, true);
        w();
        Object obj = this.f2220j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = B.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                K k2 = this.f2225o;
                if (k2 == null) {
                    this.f2214c0 = true;
                } else {
                    k2.B0(true);
                }
            }
            synchronized (o.h) {
                o.e(this);
                o.f2331g.add(new WeakReference(this));
            }
        }
        this.f2204S = new Configuration(this.f2221k.getResources().getConfiguration());
        this.f2202Q = true;
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
        if (this.f2220j instanceof Activity) {
            synchronized (o.h) {
                o.e(this);
            }
        }
        if (this.f2211Z) {
            this.f2222l.getDecorView().removeCallbacks(this.f2213b0);
        }
        this.f2203R = true;
        if (this.f2205T != -100) {
            Object obj = this.f2220j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2184i0.put(this.f2220j.getClass().getName(), Integer.valueOf(this.f2205T));
                wVar = this.f2209X;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.f2210Y;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f2184i0.remove(this.f2220j.getClass().getName());
        wVar = this.f2209X;
        if (wVar != null) {
        }
        wVar2 = this.f2210Y;
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
        if (this.f2196K && i == 108) {
            return false;
        }
        if (this.f2193G && i == 1) {
            this.f2193G = false;
        }
        if (i == 1) {
            G();
            this.f2196K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2191E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.f2192F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2194I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2193G = true;
            return true;
        }
        if (i != 109) {
            return this.f2222l.requestFeature(i);
        }
        G();
        this.H = true;
        return true;
    }

    @Override // g.o
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2188B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2221k).inflate(i, viewGroup);
        this.f2223m.a(this.f2222l.getCallback());
    }

    @Override // g.o
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2188B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2223m.a(this.f2222l.getCallback());
    }

    @Override // g.o
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2188B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2223m.a(this.f2222l.getCallback());
    }

    @Override // g.o
    public final void j(CharSequence charSequence) {
        this.f2227q = charSequence;
        InterfaceC0198l0 interfaceC0198l0 = this.f2228r;
        if (interfaceC0198l0 != null) {
            interfaceC0198l0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2225o;
        if (k2 == null) {
            TextView textView = this.f2189C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        e1 e1Var = (e1) k2.f2264e;
        if (e1Var.f2984g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f2980b & 8) != 0) {
            Toolbar toolbar = e1Var.f2979a;
            toolbar.setTitle(charSequence);
            if (e1Var.f2984g) {
                Q.m(toolbar.getRootView(), charSequence);
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
        I.f b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f2203R) {
            return false;
        }
        int i3 = this.f2205T;
        if (i3 == -100) {
            i3 = o.f2327b;
        }
        Context context = this.f2221k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        I.f m2 = i4 < 33 ? m(context) : null;
        if (!z3 && m2 != null) {
            m2 = t.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, m2, null, false);
        boolean z5 = this.f2208W;
        Object obj = this.f2220j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2204S;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                I.f b3 = t.b(configuration);
                b2 = m2 != null ? null : t.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2201P && ((f2186k0 || this.f2202Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new B.a(0, activity));
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
                            int i8 = this.f2206U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2206U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).f().f1578c.compareTo(EnumC0070m.f1570c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2202Q && !this.f2203R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0110i)) {
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
                            w wVar = this.f2209X;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2210Y == null) {
                                this.f2210Y = new w(this, context);
                            }
                            this.f2210Y.i();
                        } else {
                            w wVar2 = this.f2210Y;
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
                    this.f2207V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2207V = 0;
            }
        }
        this.f2208W = true;
        i = this.f2207V;
        configuration = this.f2204S;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        I.f b32 = t.b(configuration);
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
        if (this.f2222l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f2223m = vVar;
        window.setCallback(vVar);
        int[] iArr = f2185j0;
        Context context = this.f2221k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0214u a2 = C0214u.a();
            synchronized (a2) {
                drawable = a2.f3079a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2222l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2218g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2219h0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2219h0 = null;
        }
        Object obj = this.f2220j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2218g0 = u.a(activity);
                H();
            }
        }
        this.f2218g0 = null;
        H();
    }

    public final void n(int i, z zVar, k.m mVar) {
        if (mVar == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f2198M;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                mVar = zVar.h;
            }
        }
        if ((zVar == null || zVar.f2354m) && !this.f2203R) {
            v vVar = this.f2223m;
            Window.Callback callback = this.f2222l.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i, mVar);
            } finally {
                vVar.d = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(k.m mVar) {
        ActionMenuView actionMenuView;
        C0195k c0195k;
        C0195k c0195k2;
        C0195k c0195k3;
        InterfaceC0198l0 interfaceC0198l0 = this.f2228r;
        if (interfaceC0198l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0198l0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((e1) actionBarOverlayLayout.f1371e).f2979a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1431a) != null && actionMenuView.f1394s) {
                if (ViewConfiguration.get(this.f2221k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2228r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout2.f1371e).f2979a.f1431a;
                    if (actionMenuView2 != null) {
                        C0195k c0195k4 = actionMenuView2.f1395t;
                        if (c0195k4 != null) {
                            if (c0195k4.f3030u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2222l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2228r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((e1) actionBarOverlayLayout3.f1371e).f2979a.f1431a;
                if ((actionMenuView3 == null || (c0195k3 = actionMenuView3.f1395t) == null || !c0195k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2228r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((e1) actionBarOverlayLayout4.f1371e).f2979a.f1431a;
                    if (actionMenuView4 != null && (c0195k2 = actionMenuView4.f1395t) != null) {
                        c0195k2.f();
                    }
                    if (this.f2203R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2203R) {
                    return;
                }
                if (this.f2211Z && (1 & this.f2212a0) != 0) {
                    View decorView = this.f2222l.getDecorView();
                    p pVar = this.f2213b0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z y2 = y(0);
                k.m mVar2 = y2.h;
                if (mVar2 == null || y2.f2356o || !callback.onPreparePanel(0, y2.f2350g, mVar2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2228r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((e1) actionBarOverlayLayout5.f1371e).f2979a.f1431a;
                if (actionMenuView5 == null || (c0195k = actionMenuView5.f1395t) == null) {
                    return;
                }
                c0195k.l();
                return;
            }
        }
        z y3 = y(0);
        y3.f2355n = true;
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
        View e2;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2217f0 == null) {
            int[] iArr = AbstractC0084a.f2133j;
            Context context2 = this.f2221k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2217f0 = new D();
            } else {
                try {
                    this.f2217f0 = (D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2217f0 = new D();
                }
            }
        }
        D d = this.f2217f0;
        int i2 = g1.f2993a;
        d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0084a.f2147x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0146c = (resourceId == 0 || ((context instanceof C0146c) && ((C0146c) context).f2624a == resourceId)) ? context : new C0146c(context, resourceId);
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
                e2 = new l.E(c0146c, attributeSet);
                break;
            case 1:
                e2 = new C0210s(c0146c, attributeSet);
                break;
            case 2:
                e2 = new C0172A(c0146c, attributeSet);
                break;
            case 3:
                e2 = d.e(c0146c, attributeSet);
                break;
            case 4:
                e2 = new C0222y(c0146c, attributeSet, com.winfour.neondrop.R.attr.imageButtonStyle);
                break;
            case 5:
                e2 = new l.G(c0146c, attributeSet);
                break;
            case 6:
                e2 = new l.Q(c0146c, attributeSet);
                break;
            case 7:
                e2 = d.d(c0146c, attributeSet);
                break;
            case '\b':
                e2 = new C0194j0(c0146c, attributeSet);
                break;
            case '\t':
                e2 = new C0224z(c0146c, attributeSet, 0);
                break;
            case '\n':
                e2 = d.a(c0146c, attributeSet);
                break;
            case 11:
                e2 = d.c(c0146c, attributeSet);
                break;
            case '\f':
                e2 = new C0218w(c0146c, attributeSet);
                break;
            case '\r':
                e2 = d.b(c0146c, attributeSet);
                break;
            default:
                e2 = null;
                break;
        }
        if (e2 == null && context != c0146c) {
            Object[] objArr = d.f2246a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0146c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = D.f2245g;
                        if (i3 < 3) {
                            View f2 = d.f(c0146c, str2, strArr[i3]);
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
                    View f3 = d.f(c0146c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            e2 = view2;
        }
        if (e2 != null) {
            Context context3 = e2.getContext();
            if ((context3 instanceof ContextWrapper) && e2.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, D.f2242c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    e2.setOnClickListener(new C(e2, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0146c.obtainStyledAttributes(attributeSet, D.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = Q.f513a;
                    i = 0;
                    new M.A(com.winfour.neondrop.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(e2, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0146c.obtainStyledAttributes(attributeSet, D.f2243e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    Q.m(e2, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0146c.obtainStyledAttributes(attributeSet, D.f2244f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = Q.f513a;
                    new M.A(com.winfour.neondrop.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(e2, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return e2;
    }

    public final void p(k.m mVar) {
        C0195k c0195k;
        if (this.f2197L) {
            return;
        }
        this.f2197L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2228r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f1371e).f2979a.f1431a;
        if (actionMenuView != null && (c0195k = actionMenuView.f1395t) != null) {
            c0195k.f();
            C0187g c0187g = c0195k.f3029t;
            if (c0187g != null && c0187g.b()) {
                c0187g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2222l.getCallback();
        if (callback != null && !this.f2203R) {
            callback.onPanelClosed(108, mVar);
        }
        this.f2197L = false;
    }

    @Override // k.k
    public final boolean q(k.m mVar, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f2222l.getCallback();
        if (callback != null && !this.f2203R) {
            k.m k2 = mVar.k();
            z[] zVarArr = this.f2198M;
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
                return callback.onMenuItemSelected(zVar.f2345a, menuItem);
            }
        }
        return false;
    }

    public final void r(z zVar, boolean z2) {
        y yVar;
        InterfaceC0198l0 interfaceC0198l0;
        C0195k c0195k;
        if (z2 && zVar.f2345a == 0 && (interfaceC0198l0 = this.f2228r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0198l0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f1371e).f2979a.f1431a;
            if (actionMenuView != null && (c0195k = actionMenuView.f1395t) != null && c0195k.i()) {
                p(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2221k.getSystemService("window");
        if (windowManager != null && zVar.f2354m && (yVar = zVar.f2348e) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                n(zVar.f2345a, zVar, null);
            }
        }
        zVar.f2352k = false;
        zVar.f2353l = false;
        zVar.f2354m = false;
        zVar.f2349f = null;
        zVar.f2355n = true;
        if (this.f2199N == zVar) {
            this.f2199N = null;
        }
        if (zVar.f2345a == 0) {
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
        C0195k c0195k;
        Object obj = this.f2220j;
        if (((obj instanceof InterfaceC0010k) || (obj instanceof DialogInterfaceC0107f)) && (decorView = this.f2222l.getDecorView()) != null && z1.d.n(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            v vVar = this.f2223m;
            Window.Callback callback = this.f2222l.getCallback();
            vVar.getClass();
            try {
                vVar.f2340c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                vVar.f2340c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2200O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                z y2 = y(0);
                if (y2.f2354m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2231u != null) {
                    return true;
                }
                z y3 = y(0);
                InterfaceC0198l0 interfaceC0198l0 = this.f2228r;
                Context context = this.f2221k;
                if (interfaceC0198l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0198l0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((e1) actionBarOverlayLayout.f1371e).f2979a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1431a) != null && actionMenuView.f1394s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2228r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout2.f1371e).f2979a.f1431a;
                        if (actionMenuView2 == null || (c0195k = actionMenuView2.f1395t) == null || !c0195k.i()) {
                            if (!this.f2203R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2228r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((e1) actionBarOverlayLayout3.f1371e).f2979a.f1431a;
                                if (actionMenuView3 != null) {
                                    C0195k c0195k2 = actionMenuView3.f1395t;
                                    if (c0195k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2228r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((e1) actionBarOverlayLayout4.f1371e).f2979a.f1431a;
                            if (actionMenuView4 != null) {
                                C0195k c0195k3 = actionMenuView4.f1395t;
                                if (c0195k3 != null) {
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
                boolean z4 = y3.f2354m;
                if (z4 || y3.f2353l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2352k) {
                        if (y3.f2356o) {
                            y3.f2352k = false;
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
                y2.f2357p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2356o = true;
        y2.f2355n = true;
        if ((i == 108 || i == 0) && this.f2228r != null) {
            z y3 = y(0);
            y3.f2352k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2187A) {
            return;
        }
        int[] iArr = AbstractC0084a.f2133j;
        Context context = this.f2221k;
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
        this.f2195J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2222l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2196K) {
            viewGroup = this.f2194I ? (ViewGroup) from.inflate(com.winfour.neondrop.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.winfour.neondrop.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2195J) {
            viewGroup = (ViewGroup) from.inflate(com.winfour.neondrop.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.f2193G = false;
        } else if (this.f2193G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.winfour.neondrop.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0146c(context, typedValue.resourceId) : context).inflate(com.winfour.neondrop.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0198l0 interfaceC0198l0 = (InterfaceC0198l0) viewGroup.findViewById(com.winfour.neondrop.R.id.decor_content_parent);
            this.f2228r = interfaceC0198l0;
            interfaceC0198l0.setWindowCallback(this.f2222l.getCallback());
            if (this.H) {
                ((ActionBarOverlayLayout) this.f2228r).j(109);
            }
            if (this.f2191E) {
                ((ActionBarOverlayLayout) this.f2228r).j(2);
            }
            if (this.f2192F) {
                ((ActionBarOverlayLayout) this.f2228r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2193G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.f2195J + ", windowActionModeOverlay: " + this.f2194I + ", windowNoTitle: " + this.f2196K + " }");
        }
        q qVar = new q(this, i2);
        WeakHashMap weakHashMap = Q.f513a;
        M.F.u(viewGroup, qVar);
        if (this.f2228r == null) {
            this.f2189C = (TextView) viewGroup.findViewById(com.winfour.neondrop.R.id.title);
        }
        boolean z2 = j1.f3010a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.winfour.neondrop.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2222l.findViewById(R.id.content);
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
        this.f2222l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i));
        this.f2188B = viewGroup;
        Object obj = this.f2220j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2227q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0198l0 interfaceC0198l02 = this.f2228r;
            if (interfaceC0198l02 != null) {
                interfaceC0198l02.setWindowTitle(title);
            } else {
                K k2 = this.f2225o;
                if (k2 != null) {
                    e1 e1Var = (e1) k2.f2264e;
                    if (!e1Var.f2984g) {
                        e1Var.h = title;
                        if ((e1Var.f2980b & 8) != 0) {
                            Toolbar toolbar = e1Var.f2979a;
                            toolbar.setTitle(title);
                            if (e1Var.f2984g) {
                                Q.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2189C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2188B.findViewById(R.id.content);
        View decorView = this.f2222l.getDecorView();
        contentFrameLayout2.f1411g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2187A = true;
        z y2 = y(0);
        if (this.f2203R || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2222l == null) {
            Object obj = this.f2220j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f2222l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0037g x(Context context) {
        if (this.f2209X == null) {
            if (A1.j.f78e == null) {
                Context applicationContext = context.getApplicationContext();
                A1.j.f78e = new A1.j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2209X = new w(this, A1.j.f78e);
        }
        return this.f2209X;
    }

    public final z y(int i) {
        z[] zVarArr = this.f2198M;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f2198M = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f2345a = i;
        zVar2.f2355n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void z() {
        v();
        if (this.f2193G && this.f2225o == null) {
            Object obj = this.f2220j;
            if (obj instanceof Activity) {
                this.f2225o = new K((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.f2225o = new K((Dialog) obj);
            }
            K k2 = this.f2225o;
            if (k2 != null) {
                k2.B0(this.f2214c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
