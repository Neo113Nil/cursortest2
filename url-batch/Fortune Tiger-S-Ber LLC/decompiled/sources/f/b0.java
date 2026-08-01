package f;

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
import android.os.LocaleList;
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
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.e3;
import k.h1;
import k.i1;
import k.u2;
import k.z2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b0 extends p implements j.k, LayoutInflater.Factory2 {

    /* renamed from: n0, reason: collision with root package name */
    public static final n.j f1541n0 = new n.j(0);

    /* renamed from: o0, reason: collision with root package name */
    public static final int[] f1542o0 = {R.attr.windowBackground};

    /* renamed from: p0, reason: collision with root package name */
    public static final boolean f1543p0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView A;
    public PopupWindow B;
    public q C;
    public boolean F;
    public ViewGroup G;
    public TextView H;
    public View I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public a0[] R;
    public a0 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public Configuration X;
    public final int Y;
    public int Z;
    public int a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1544b0;

    /* renamed from: c0, reason: collision with root package name */
    public x f1545c0;

    /* renamed from: d0, reason: collision with root package name */
    public x f1546d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1547e0;
    public int f0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1549h0;

    /* renamed from: i0, reason: collision with root package name */
    public Rect f1550i0;

    /* renamed from: j0, reason: collision with root package name */
    public Rect f1551j0;

    /* renamed from: k0, reason: collision with root package name */
    public e0 f1552k0;

    /* renamed from: l0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1553l0;

    /* renamed from: m0, reason: collision with root package name */
    public OnBackInvokedCallback f1554m0;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1555o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f1556p;

    /* renamed from: q, reason: collision with root package name */
    public Window f1557q;

    /* renamed from: r, reason: collision with root package name */
    public w f1558r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f1559s;

    /* renamed from: t, reason: collision with root package name */
    public l0 f1560t;

    /* renamed from: u, reason: collision with root package name */
    public i.h f1561u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1562v;

    /* renamed from: w, reason: collision with root package name */
    public h1 f1563w;

    /* renamed from: x, reason: collision with root package name */
    public r f1564x;

    /* renamed from: y, reason: collision with root package name */
    public r f1565y;

    /* renamed from: z, reason: collision with root package name */
    public i.a f1566z;
    public k0.l0 D = null;
    public final boolean E = true;

    /* renamed from: g0, reason: collision with root package name */
    public final q f1548g0 = new q(this, 0);

    public b0(Context context, Window window, j jVar, Object obj) {
        i iVar = null;
        this.Y = -100;
        this.f1556p = context;
        this.f1559s = jVar;
        this.f1555o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof i)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        iVar = (i) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (iVar != null) {
                this.Y = ((b0) iVar.m()).Y;
            }
        }
        if (this.Y == -100) {
            String name = this.f1555o.getClass().getName();
            n.j jVar2 = f1541n0;
            Integer num = (Integer) jVar2.get(name);
            if (num != null) {
                this.Y = num.intValue();
                jVar2.remove(this.f1555o.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        k.s.d();
    }

    public static g0.d o(Context context) {
        g0.d dVar;
        g0.d dVar2;
        if (Build.VERSION.SDK_INT >= 33 || (dVar = p.h) == null) {
            return null;
        }
        g0.e eVar = dVar.f1757a;
        g0.d b2 = u.b(context.getApplicationContext().getResources().getConfiguration());
        if (eVar.f1758a.isEmpty()) {
            dVar2 = g0.d.f1756b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i4 = 0;
            while (i4 < b2.f1757a.f1758a.size() + eVar.f1758a.size()) {
                Locale locale = i4 < eVar.f1758a.size() ? eVar.f1758a.get(i4) : b2.f1757a.f1758a.get(i4 - eVar.f1758a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i4++;
            }
            dVar2 = new g0.d(new g0.e(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return dVar2.f1757a.f1758a.isEmpty() ? b2 : dVar2;
    }

    public static Configuration s(Context context, int i4, g0.d dVar, Configuration configuration, boolean z3) {
        int i5 = i4 != 1 ? i4 != 2 ? z3 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        if (dVar != null) {
            u.d(configuration2, dVar);
        }
        return configuration2;
    }

    public final void A(int i4) {
        this.f0 = (1 << i4) | this.f0;
        if (this.f1547e0) {
            return;
        }
        View decorView = this.f1557q.getDecorView();
        WeakHashMap weakHashMap = k0.j0.f2752a;
        decorView.postOnAnimation(this.f1548g0);
        this.f1547e0 = true;
    }

    public final int B(Context context, int i4) {
        if (i4 != -100) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1 && i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f1546d0 == null) {
                            this.f1546d0 = new x(this, context);
                        }
                        return this.f1546d0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).f();
                }
            }
            return i4;
        }
        return -1;
    }

    public final boolean C() {
        i1 i1Var;
        u2 u2Var;
        boolean z3 = this.T;
        this.T = false;
        a0 y3 = y(0);
        if (!y3.f1530m) {
            i.a aVar = this.f1566z;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            z();
            l0 l0Var = this.f1560t;
            if (l0Var == null || (i1Var = l0Var.f1619j) == null || (u2Var = ((z2) i1Var).f2699a.Q) == null || u2Var.g == null) {
                return false;
            }
            u2 u2Var2 = ((z2) i1Var).f2699a.Q;
            j.o oVar = u2Var2 == null ? null : u2Var2.g;
            if (oVar != null) {
                oVar.collapseActionView();
            }
        } else if (!z3) {
            r(y3, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.f2182k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(a0 a0Var, KeyEvent keyEvent) {
        int i4;
        ViewGroup.LayoutParams layoutParams;
        boolean z3 = a0Var.f1530m;
        int i5 = a0Var.f1521a;
        if (z3 || this.W) {
            return;
        }
        Context context = this.f1556p;
        if (i5 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f1557q.getCallback();
        if (callback != null && !callback.onMenuOpened(i5, a0Var.h)) {
            r(a0Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(a0Var, keyEvent)) {
            return;
        }
        z zVar = a0Var.f1524e;
        if (zVar == null || a0Var.f1531n) {
            if (zVar == null) {
                z();
                l0 l0Var = this.f1560t;
                Context m02 = l0Var != null ? l0Var.m0() : null;
                if (m02 != null) {
                    context = m02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.gglhk.bofio.fortunetiger.R.attr.actionBarPopupTheme, typedValue, true);
                int i6 = typedValue.resourceId;
                if (i6 != 0) {
                    newTheme.applyStyle(i6, true);
                }
                newTheme.resolveAttribute(com.gglhk.bofio.fortunetiger.R.attr.panelMenuListTheme, typedValue, true);
                int i7 = typedValue.resourceId;
                if (i7 != 0) {
                    newTheme.applyStyle(i7, true);
                } else {
                    newTheme.applyStyle(com.gglhk.bofio.fortunetiger.R.style.Theme_AppCompat_CompactMenu, true);
                }
                i.c cVar = new i.c(context, 0);
                cVar.getTheme().setTo(newTheme);
                a0Var.f1527j = cVar;
                TypedArray obtainStyledAttributes = cVar.obtainStyledAttributes(e.a.f1501j);
                a0Var.f1522b = obtainStyledAttributes.getResourceId(86, 0);
                a0Var.f1523d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                a0Var.f1524e = new z(this, a0Var.f1527j);
                a0Var.c = 81;
            } else if (a0Var.f1531n && zVar.getChildCount() > 0) {
                a0Var.f1524e.removeAllViews();
            }
            View view = a0Var.g;
            if (view == null) {
                if (a0Var.h != null) {
                    if (this.f1565y == null) {
                        this.f1565y = new r(this, 3);
                    }
                    r rVar = this.f1565y;
                    if (a0Var.f1526i == null) {
                        j.i iVar = new j.i(a0Var.f1527j);
                        a0Var.f1526i = iVar;
                        iVar.f2181j = rVar;
                        j.m mVar = a0Var.h;
                        mVar.b(iVar, mVar.f2189a);
                    }
                    j.i iVar2 = a0Var.f1526i;
                    z zVar2 = a0Var.f1524e;
                    if (iVar2.f2180i == null) {
                        iVar2.f2180i = (ExpandedMenuView) iVar2.g.inflate(com.gglhk.bofio.fortunetiger.R.layout.abc_expanded_menu_layout, (ViewGroup) zVar2, false);
                        if (iVar2.f2182k == null) {
                            iVar2.f2182k = new j.h(iVar2);
                        }
                        iVar2.f2180i.setAdapter((ListAdapter) iVar2.f2182k);
                        iVar2.f2180i.setOnItemClickListener(iVar2);
                    }
                    ExpandedMenuView expandedMenuView = iVar2.f2180i;
                    a0Var.f1525f = expandedMenuView;
                }
                a0Var.f1531n = true;
                return;
            }
            a0Var.f1525f = view;
            if (a0Var.f1525f != null) {
                if (a0Var.g == null) {
                    j.i iVar3 = a0Var.f1526i;
                    if (iVar3.f2182k == null) {
                        iVar3.f2182k = new j.h(iVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = a0Var.f1525f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                a0Var.f1524e.setBackgroundResource(a0Var.f1522b);
                ViewParent parent = a0Var.f1525f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(a0Var.f1525f);
                }
                a0Var.f1524e.addView(a0Var.f1525f, layoutParams2);
                if (!a0Var.f1525f.hasFocus()) {
                    a0Var.f1525f.requestFocus();
                }
            }
            a0Var.f1531n = true;
            return;
        }
        View view2 = a0Var.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i4 = -1;
            a0Var.f1529l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i4, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = a0Var.c;
            layoutParams3.windowAnimations = a0Var.f1523d;
            windowManager.addView(a0Var.f1524e, layoutParams3);
            a0Var.f1530m = true;
            if (i5 != 0) {
                H();
                return;
            }
            return;
        }
        i4 = -2;
        a0Var.f1529l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i4, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = a0Var.c;
        layoutParams32.windowAnimations = a0Var.f1523d;
        windowManager.addView(a0Var.f1524e, layoutParams32);
        a0Var.f1530m = true;
        if (i5 != 0) {
        }
    }

    public final boolean E(a0 a0Var, int i4, KeyEvent keyEvent) {
        j.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((a0Var.f1528k || F(a0Var, keyEvent)) && (mVar = a0Var.h) != null) {
            return mVar.performShortcut(i4, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(a0 a0Var, KeyEvent keyEvent) {
        h1 h1Var;
        h1 h1Var2;
        Resources.Theme theme;
        h1 h1Var3;
        h1 h1Var4;
        if (!this.W) {
            boolean z3 = a0Var.f1528k;
            int i4 = a0Var.f1521a;
            if (z3) {
                return true;
            }
            a0 a0Var2 = this.S;
            if (a0Var2 != null && a0Var2 != a0Var) {
                r(a0Var2, false);
            }
            Window.Callback callback = this.f1557q.getCallback();
            if (callback != null) {
                a0Var.g = callback.onCreatePanelView(i4);
            }
            boolean z4 = i4 == 0 || i4 == 108;
            if (z4 && (h1Var4 = this.f1563w) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var4;
                actionBarOverlayLayout.k();
                ((z2) actionBarOverlayLayout.f202j).f2707l = true;
            }
            if (a0Var.g == null) {
                j.m mVar = a0Var.h;
                if (mVar == null || a0Var.f1532o) {
                    if (mVar == null) {
                        Context context = this.f1556p;
                        if ((i4 == 0 || i4 == 108) && this.f1563w != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.gglhk.bofio.fortunetiger.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.gglhk.bofio.fortunetiger.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.gglhk.bofio.fortunetiger.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                i.c cVar = new i.c(context, 0);
                                cVar.getTheme().setTo(theme);
                                context = cVar;
                            }
                        }
                        j.m mVar2 = new j.m(context);
                        mVar2.f2192e = this;
                        j.m mVar3 = a0Var.h;
                        if (mVar2 != mVar3) {
                            if (mVar3 != null) {
                                mVar3.r(a0Var.f1526i);
                            }
                            a0Var.h = mVar2;
                            j.i iVar = a0Var.f1526i;
                            if (iVar != null) {
                                mVar2.b(iVar, mVar2.f2189a);
                            }
                        }
                    }
                    if (z4 && (h1Var2 = this.f1563w) != null) {
                        if (this.f1564x == null) {
                            this.f1564x = new r(this, 2);
                        }
                        ((ActionBarOverlayLayout) h1Var2).l(a0Var.h, this.f1564x);
                    }
                    a0Var.h.w();
                    if (callback.onCreatePanelMenu(i4, a0Var.h)) {
                        a0Var.f1532o = false;
                    } else {
                        j.m mVar4 = a0Var.h;
                        if (mVar4 != null) {
                            if (mVar4 != null) {
                                mVar4.r(a0Var.f1526i);
                            }
                            a0Var.h = null;
                        }
                        if (z4 && (h1Var = this.f1563w) != null) {
                            ((ActionBarOverlayLayout) h1Var).l(null, this.f1564x);
                        }
                    }
                }
                a0Var.h.w();
                Bundle bundle = a0Var.f1533p;
                if (bundle != null) {
                    a0Var.h.s(bundle);
                    a0Var.f1533p = null;
                }
                if (!callback.onPreparePanel(0, a0Var.g, a0Var.h)) {
                    if (z4 && (h1Var3 = this.f1563w) != null) {
                        ((ActionBarOverlayLayout) h1Var3).l(null, this.f1564x);
                    }
                    a0Var.h.v();
                    return false;
                }
                a0Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                a0Var.h.v();
            }
            a0Var.f1528k = true;
            a0Var.f1529l = false;
            this.S = a0Var;
            return true;
        }
        return false;
    }

    public final void G() {
        if (this.F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z3 = false;
            if (this.f1553l0 != null && (y(0).f1530m || this.f1566z != null)) {
                z3 = true;
            }
            if (z3 && this.f1554m0 == null) {
                this.f1554m0 = v.b(this.f1553l0, this);
            } else {
                if (z3 || (onBackInvokedCallback = this.f1554m0) == null) {
                    return;
                }
                v.c(this.f1553l0, onBackInvokedCallback);
                this.f1554m0 = null;
            }
        }
    }

    @Override // f.p
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f1556p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof b0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // f.p
    public final void c() {
        String str;
        this.U = true;
        m(false, true);
        w();
        Object obj = this.f1555o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = z.c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                l0 l0Var = this.f1560t;
                if (l0Var == null) {
                    this.f1549h0 = true;
                } else {
                    l0Var.o0(true);
                }
            }
            synchronized (p.f1643m) {
                p.e(this);
                p.f1642l.add(new WeakReference(this));
            }
        }
        this.X = new Configuration(this.f1556p.getResources().getConfiguration());
        this.V = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // f.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        x xVar;
        x xVar2;
        if (this.f1555o instanceof Activity) {
            synchronized (p.f1643m) {
                p.e(this);
            }
        }
        if (this.f1547e0) {
            this.f1557q.getDecorView().removeCallbacks(this.f1548g0);
        }
        this.W = true;
        if (this.Y != -100) {
            Object obj = this.f1555o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f1541n0.put(this.f1555o.getClass().getName(), Integer.valueOf(this.Y));
                xVar = this.f1545c0;
                if (xVar != null) {
                    xVar.c();
                }
                xVar2 = this.f1546d0;
                if (xVar2 == null) {
                    xVar2.c();
                    return;
                }
                return;
            }
        }
        f1541n0.remove(this.f1555o.getClass().getName());
        xVar = this.f1545c0;
        if (xVar != null) {
        }
        xVar2 = this.f1546d0;
        if (xVar2 == null) {
        }
    }

    @Override // f.p
    public final boolean f(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i4 = 108;
        } else if (i4 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i4 = 109;
        }
        if (this.P && i4 == 108) {
            return false;
        }
        if (this.L && i4 == 1) {
            this.L = false;
        }
        if (i4 == 1) {
            G();
            this.P = true;
            return true;
        }
        if (i4 == 2) {
            G();
            this.J = true;
            return true;
        }
        if (i4 == 5) {
            G();
            this.K = true;
            return true;
        }
        if (i4 == 10) {
            G();
            this.N = true;
            return true;
        }
        if (i4 == 108) {
            G();
            this.L = true;
            return true;
        }
        if (i4 != 109) {
            return this.f1557q.requestFeature(i4);
        }
        G();
        this.M = true;
        return true;
    }

    @Override // f.p
    public final void g(int i4) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1556p).inflate(i4, viewGroup);
        this.f1558r.a(this.f1557q.getCallback());
    }

    @Override // f.p
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1558r.a(this.f1557q.getCallback());
    }

    @Override // f.p
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1558r.a(this.f1557q.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.f() != false) goto L20;
     */
    @Override // j.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(j.m mVar) {
        ActionMenuView actionMenuView;
        k.k kVar;
        k.k kVar2;
        k.k kVar3;
        h1 h1Var = this.f1563w;
        if (h1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((z2) actionBarOverlayLayout.f202j).f2699a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f236f) != null && actionMenuView.f222x) {
                if (ViewConfiguration.get(this.f1556p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1563w;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((z2) actionBarOverlayLayout2.f202j).f2699a.f236f;
                    if (actionMenuView2 != null) {
                        k.k kVar4 = actionMenuView2.f223y;
                        if (kVar4 != null) {
                            if (kVar4.f2585z == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f1557q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1563w;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((z2) actionBarOverlayLayout3.f202j).f2699a.f236f;
                if (actionMenuView3 != null && (kVar2 = actionMenuView3.f223y) != null && kVar2.f()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1563w;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((z2) actionBarOverlayLayout4.f202j).f2699a.f236f;
                    if (actionMenuView4 != null && (kVar3 = actionMenuView4.f223y) != null) {
                        kVar3.c();
                    }
                    if (this.W) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.W) {
                    return;
                }
                if (this.f1547e0 && (1 & this.f0) != 0) {
                    View decorView = this.f1557q.getDecorView();
                    q qVar = this.f1548g0;
                    decorView.removeCallbacks(qVar);
                    qVar.run();
                }
                a0 y3 = y(0);
                j.m mVar2 = y3.h;
                if (mVar2 == null || y3.f1532o || !callback.onPreparePanel(0, y3.g, mVar2)) {
                    return;
                }
                callback.onMenuOpened(108, y3.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f1563w;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((z2) actionBarOverlayLayout5.f202j).f2699a.f236f;
                if (actionMenuView5 == null || (kVar = actionMenuView5.f223y) == null) {
                    return;
                }
                kVar.l();
                return;
            }
        }
        a0 y4 = y(0);
        y4.f1531n = true;
        r(y4, false);
        D(y4, null);
    }

    @Override // f.p
    public final void k(CharSequence charSequence) {
        this.f1562v = charSequence;
        h1 h1Var = this.f1563w;
        if (h1Var != null) {
            h1Var.setWindowTitle(charSequence);
            return;
        }
        l0 l0Var = this.f1560t;
        if (l0Var == null) {
            TextView textView = this.H;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        z2 z2Var = (z2) l0Var.f1619j;
        if (z2Var.g) {
            return;
        }
        Toolbar toolbar = z2Var.f2699a;
        z2Var.h = charSequence;
        if ((z2Var.f2700b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (z2Var.g) {
                k0.j0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // j.k
    public final boolean l(j.m mVar, MenuItem menuItem) {
        a0 a0Var;
        Window.Callback callback = this.f1557q.getCallback();
        if (callback != null && !this.W) {
            j.m k4 = mVar.k();
            a0[] a0VarArr = this.R;
            int length = a0VarArr != null ? a0VarArr.length : 0;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    a0Var = a0VarArr[i4];
                    if (a0Var != null && a0Var.h == k4) {
                        break;
                    }
                    i4++;
                } else {
                    a0Var = null;
                    break;
                }
            }
            if (a0Var != null) {
                return callback.onMenuItemSelected(a0Var.f1521a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z3, boolean z4) {
        int i4;
        Configuration configuration;
        g0.d b2;
        int i5;
        boolean z5;
        Activity activity;
        if (this.W) {
            return false;
        }
        int i6 = this.Y;
        if (i6 == -100) {
            i6 = p.g;
        }
        Context context = this.f1556p;
        int B = B(context, i6);
        int i7 = Build.VERSION.SDK_INT;
        g0.d o4 = i7 < 33 ? o(context) : null;
        if (!z4 && o4 != null) {
            o4 = u.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B, o4, null, false);
        boolean z6 = this.f1544b0;
        boolean z7 = true;
        Object obj = this.f1555o;
        if (!z6 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i4 = 0;
                configuration = this.X;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i8 = configuration.uiMode & 48;
                int i9 = s2.uiMode & 48;
                g0.d b4 = u.b(configuration);
                b2 = o4 != null ? null : u.b(s2);
                i5 = i8 == i9 ? 512 : 0;
                if (b2 != null && !b4.equals(b2)) {
                    i5 |= 8196;
                }
                if (((~i4) & i5) != 0 && z3 && this.U && ((f1543p0 || this.V) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31 && (i5 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i10 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new a2.r(14, activity));
                        }
                        z5 = true;
                        if (!z5 || i5 == 0) {
                            z7 = z5;
                        } else {
                            boolean z8 = (i5 & i4) == i5;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i9;
                            if (b2 != null) {
                                u.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i11 = this.Z;
                            if (i11 != 0) {
                                context.setTheme(i11);
                                context.getTheme().applyStyle(this.Z, true);
                            }
                            if (z8 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).f().c.compareTo(androidx.lifecycle.m.h) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.V && !this.W) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b2 != null) {
                            u.c(u.b(context.getResources().getConfiguration()));
                        }
                        if (i6 == 0) {
                            x(context).i();
                        } else {
                            x xVar = this.f1545c0;
                            if (xVar != null) {
                                xVar.c();
                            }
                        }
                        if (i6 == 3) {
                            if (this.f1546d0 == null) {
                                this.f1546d0 = new x(this, context);
                            }
                            this.f1546d0.i();
                        } else {
                            x xVar2 = this.f1546d0;
                            if (xVar2 != null) {
                                xVar2.c();
                            }
                        }
                        return z7;
                    }
                }
                z5 = false;
                if (z5) {
                }
                z7 = z5;
                if (b2 != null) {
                }
                if (i6 == 0) {
                }
                if (i6 == 3) {
                }
                return z7;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i7 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.a0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e4);
                this.a0 = 0;
            }
        }
        this.f1544b0 = true;
        i4 = this.a0;
        configuration = this.X;
        if (configuration == null) {
        }
        int i82 = configuration.uiMode & 48;
        int i92 = s2.uiMode & 48;
        g0.d b42 = u.b(configuration);
        if (o4 != null) {
        }
        if (i82 == i92) {
        }
        if (b2 != null) {
            i5 |= 8196;
        }
        if (((~i4) & i5) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z5 = false;
        if (z5) {
        }
        z7 = z5;
        if (b2 != null) {
        }
        if (i6 == 0) {
        }
        if (i6 == 3) {
        }
        return z7;
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f1557q != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof w) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        w wVar = new w(this, callback);
        this.f1558r = wVar;
        window.setCallback(wVar);
        Context context = this.f1556p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f1542o0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            k.s a4 = k.s.a();
            synchronized (a4) {
                drawable = a4.f2641a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f1557q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f1553l0) != null) {
            return;
        }
        Object obj = this.f1555o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f1554m0) != null) {
            v.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1554m0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f1553l0 = v.a(activity);
                H();
            }
        }
        this.f1553l0 = null;
        H();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01e3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i4, a0 a0Var, j.m mVar) {
        if (mVar == null) {
            if (a0Var == null && i4 >= 0) {
                a0[] a0VarArr = this.R;
                if (i4 < a0VarArr.length) {
                    a0Var = a0VarArr[i4];
                }
            }
            if (a0Var != null) {
                mVar = a0Var.h;
            }
        }
        if ((a0Var == null || a0Var.f1530m) && !this.W) {
            w wVar = this.f1558r;
            Window.Callback callback = this.f1557q.getCallback();
            wVar.getClass();
            try {
                wVar.f1650i = true;
                callback.onPanelClosed(i4, mVar);
            } finally {
                wVar.f1650i = false;
            }
        }
    }

    public final void q(j.m mVar) {
        k.k kVar;
        if (this.Q) {
            return;
        }
        this.Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1563w;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((z2) actionBarOverlayLayout.f202j).f2699a.f236f;
        if (actionMenuView != null && (kVar = actionMenuView.f223y) != null) {
            kVar.c();
            k.g gVar = kVar.f2584y;
            if (gVar != null && gVar.b()) {
                gVar.f2250j.dismiss();
            }
        }
        Window.Callback callback = this.f1557q.getCallback();
        if (callback != null && !this.W) {
            callback.onPanelClosed(108, mVar);
        }
        this.Q = false;
    }

    public final void r(a0 a0Var, boolean z3) {
        z zVar;
        h1 h1Var;
        k.k kVar;
        if (z3 && a0Var.f1521a == 0 && (h1Var = this.f1563w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((z2) actionBarOverlayLayout.f202j).f2699a.f236f;
            if (actionMenuView != null && (kVar = actionMenuView.f223y) != null && kVar.f()) {
                q(a0Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1556p.getSystemService("window");
        if (windowManager != null && a0Var.f1530m && (zVar = a0Var.f1524e) != null) {
            windowManager.removeView(zVar);
            if (z3) {
                p(a0Var.f1521a, a0Var, null);
            }
        }
        a0Var.f1528k = false;
        a0Var.f1529l = false;
        a0Var.f1530m = false;
        a0Var.f1525f = null;
        a0Var.f1531n = true;
        if (this.S == a0Var) {
            this.S = null;
        }
        if (a0Var.f1521a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r7.c() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0102, code lost:
    
        if (r7.l() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        boolean z3;
        boolean z4;
        ActionMenuView actionMenuView;
        k.k kVar;
        Object obj = this.f1555o;
        if ((!(obj instanceof k0.i) && !(obj instanceof g)) || (decorView = this.f1557q.getDecorView()) == null || !k3.d.w(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                w wVar = this.f1558r;
                Window.Callback callback = this.f1557q.getCallback();
                wVar.getClass();
                try {
                    wVar.h = true;
                } finally {
                    wVar.h = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.T = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        a0 y3 = y(0);
                        if (!y3.f1530m) {
                            F(y3, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f1566z == null) {
                        a0 y4 = y(0);
                        h1 h1Var = this.f1563w;
                        Context context = this.f1556p;
                        if (h1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var;
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((z2) actionBarOverlayLayout.f202j).f2699a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f236f) != null && actionMenuView.f222x && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1563w;
                                actionBarOverlayLayout2.k();
                                ActionMenuView actionMenuView2 = ((z2) actionBarOverlayLayout2.f202j).f2699a.f236f;
                                if (actionMenuView2 == null || (kVar = actionMenuView2.f223y) == null || !kVar.f()) {
                                    if (!this.W && F(y4, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1563w;
                                        actionBarOverlayLayout3.k();
                                        ActionMenuView actionMenuView3 = ((z2) actionBarOverlayLayout3.f202j).f2699a.f236f;
                                        if (actionMenuView3 != null) {
                                            k.k kVar2 = actionMenuView3.f223y;
                                            if (kVar2 != null) {
                                            }
                                        }
                                    }
                                    z3 = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1563w;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView4 = ((z2) actionBarOverlayLayout4.f202j).f2699a.f236f;
                                    if (actionMenuView4 != null) {
                                        k.k kVar3 = actionMenuView4.f223y;
                                        if (kVar3 != null) {
                                        }
                                    }
                                    z3 = false;
                                }
                                if (z3) {
                                    AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        boolean z5 = y4.f1530m;
                        if (z5 || y4.f1529l) {
                            r(y4, true);
                            z3 = z5;
                            if (z3) {
                            }
                        } else {
                            if (y4.f1528k) {
                                if (y4.f1532o) {
                                    y4.f1528k = false;
                                    z4 = F(y4, keyEvent);
                                } else {
                                    z4 = true;
                                }
                                if (z4) {
                                    D(y4, keyEvent);
                                    z3 = true;
                                    if (z3) {
                                    }
                                }
                            }
                            z3 = false;
                            if (z3) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!C()) {
                return false;
            }
        }
        return true;
    }

    public final void u(int i4) {
        a0 y3 = y(i4);
        if (y3.h != null) {
            Bundle bundle = new Bundle();
            y3.h.t(bundle);
            if (bundle.size() > 0) {
                y3.f1533p = bundle;
            }
            y3.h.w();
            y3.h.clear();
        }
        y3.f1532o = true;
        y3.f1531n = true;
        if ((i4 == 108 || i4 == 0) && this.f1563w != null) {
            a0 y4 = y(0);
            y4.f1528k = false;
            F(y4, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.F) {
            return;
        }
        Context context = this.f1556p;
        int[] iArr = e.a.f1501j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i4 = 0;
        int i5 = 1;
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
        this.O = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f1557q.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.P) {
            viewGroup = this.N ? (ViewGroup) from.inflate(com.gglhk.bofio.fortunetiger.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.gglhk.bofio.fortunetiger.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.O) {
            viewGroup = (ViewGroup) from.inflate(com.gglhk.bofio.fortunetiger.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.M = false;
            this.L = false;
        } else if (this.L) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.gglhk.bofio.fortunetiger.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new i.c(context, typedValue.resourceId) : context).inflate(com.gglhk.bofio.fortunetiger.R.layout.abc_screen_toolbar, (ViewGroup) null);
            h1 h1Var = (h1) viewGroup.findViewById(com.gglhk.bofio.fortunetiger.R.id.decor_content_parent);
            this.f1563w = h1Var;
            h1Var.setWindowCallback(this.f1557q.getCallback());
            if (this.M) {
                ((ActionBarOverlayLayout) this.f1563w).j(109);
            }
            if (this.J) {
                ((ActionBarOverlayLayout) this.f1563w).j(2);
            }
            if (this.K) {
                ((ActionBarOverlayLayout) this.f1563w).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.L + ", windowActionBarOverlay: " + this.M + ", android:windowIsFloating: " + this.O + ", windowActionModeOverlay: " + this.N + ", windowNoTitle: " + this.P + " }");
        }
        r rVar = new r(this, i4);
        WeakHashMap weakHashMap = k0.j0.f2752a;
        k0.b0.j(viewGroup, rVar);
        if (this.f1563w == null) {
            this.H = (TextView) viewGroup.findViewById(com.gglhk.bofio.fortunetiger.R.id.title);
        }
        boolean z3 = e3.f2538a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e4) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.gglhk.bofio.fortunetiger.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1557q.findViewById(R.id.content);
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
        this.f1557q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new r(this, i5));
        this.G = viewGroup;
        Object obj = this.f1555o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1562v;
        if (!TextUtils.isEmpty(title)) {
            h1 h1Var2 = this.f1563w;
            if (h1Var2 != null) {
                h1Var2.setWindowTitle(title);
            } else {
                l0 l0Var = this.f1560t;
                if (l0Var != null) {
                    z2 z2Var = (z2) l0Var.f1619j;
                    if (!z2Var.g) {
                        Toolbar toolbar = z2Var.f2699a;
                        z2Var.h = title;
                        if ((z2Var.f2700b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (z2Var.g) {
                                k0.j0.n(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.H;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.G.findViewById(R.id.content);
        View decorView = this.f1557q.getDecorView();
        contentFrameLayout2.f231l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.F = true;
        a0 y3 = y(0);
        if (this.W || y3.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f1557q == null) {
            Object obj = this.f1555o;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f1557q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final androidx.fragment.app.j x(Context context) {
        if (this.f1545c0 == null) {
            if (androidx.emoji2.text.s.f355e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.emoji2.text.s.f355e = new androidx.emoji2.text.s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1545c0 = new x(this, androidx.emoji2.text.s.f355e);
        }
        return this.f1545c0;
    }

    public final a0 y(int i4) {
        a0[] a0VarArr = this.R;
        if (a0VarArr == null || a0VarArr.length <= i4) {
            a0[] a0VarArr2 = new a0[i4 + 1];
            if (a0VarArr != null) {
                System.arraycopy(a0VarArr, 0, a0VarArr2, 0, a0VarArr.length);
            }
            this.R = a0VarArr2;
            a0VarArr = a0VarArr2;
        }
        a0 a0Var = a0VarArr[i4];
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0();
        a0Var2.f1521a = i4;
        a0Var2.f1531n = false;
        a0VarArr[i4] = a0Var2;
        return a0Var2;
    }

    public final void z() {
        v();
        if (this.L && this.f1560t == null) {
            Object obj = this.f1555o;
            if (obj instanceof Activity) {
                this.f1560t = new l0((Activity) obj, this.M);
            } else if (obj instanceof Dialog) {
                this.f1560t = new l0((Dialog) obj);
            }
            l0 l0Var = this.f1560t;
            if (l0Var != null) {
                l0Var.o0(this.f1549h0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
