package g;

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
import android.util.LongSparseArray;
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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.d3;
import l.k1;
import l.l1;
import l.l3;
import l.y2;
import n0.p0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c0 extends p implements k.k, LayoutInflater.Factory2 {

    /* renamed from: m0, reason: collision with root package name */
    public static final q.j f1581m0 = new q.j(0);

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f1582n0 = {R.attr.windowBackground};

    /* renamed from: o0, reason: collision with root package name */
    public static final boolean f1583o0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView A;
    public PopupWindow B;
    public q C;
    public boolean E;
    public ViewGroup F;
    public TextView G;
    public View H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public b0[] Q;
    public b0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1584a0;

    /* renamed from: b0, reason: collision with root package name */
    public y f1585b0;

    /* renamed from: c0, reason: collision with root package name */
    public y f1586c0;
    public boolean d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f1587e0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1589g0;

    /* renamed from: h0, reason: collision with root package name */
    public Rect f1590h0;
    public Rect i0;

    /* renamed from: j0, reason: collision with root package name */
    public f0 f1591j0;

    /* renamed from: k0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1592k0;

    /* renamed from: l0, reason: collision with root package name */
    public OnBackInvokedCallback f1593l0;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1594o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f1595p;

    /* renamed from: q, reason: collision with root package name */
    public Window f1596q;

    /* renamed from: r, reason: collision with root package name */
    public x f1597r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f1598s;

    /* renamed from: t, reason: collision with root package name */
    public m0 f1599t;

    /* renamed from: u, reason: collision with root package name */
    public j.h f1600u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1601v;

    /* renamed from: w, reason: collision with root package name */
    public k1 f1602w;

    /* renamed from: x, reason: collision with root package name */
    public r f1603x;

    /* renamed from: y, reason: collision with root package name */
    public r f1604y;

    /* renamed from: z, reason: collision with root package name */
    public j.a f1605z;
    public p0 D = null;

    /* renamed from: f0, reason: collision with root package name */
    public final q f1588f0 = new q(this, 0);

    public c0(Context context, Window window, k kVar, Object obj) {
        j jVar = null;
        this.X = -100;
        this.f1595p = context;
        this.f1598s = kVar;
        this.f1594o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof j)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        jVar = (j) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (jVar != null) {
                this.X = ((c0) jVar.k()).X;
            }
        }
        if (this.X == -100) {
            String name = this.f1594o.getClass().getName();
            q.j jVar2 = f1581m0;
            Integer num = (Integer) jVar2.get(name);
            if (num != null) {
                this.X = num.intValue();
                jVar2.remove(this.f1594o.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        l.u.d();
    }

    public static j0.e n(Context context) {
        j0.e eVar;
        j0.e eVar2;
        if (Build.VERSION.SDK_INT >= 33 || (eVar = p.f1678h) == null) {
            return null;
        }
        j0.f fVar = eVar.f1891a;
        j0.e b4 = u.b(context.getApplicationContext().getResources().getConfiguration());
        if (fVar.f1892a.isEmpty()) {
            eVar2 = j0.e.f1890b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b4.f1891a.f1892a.size() + fVar.f1892a.size()) {
                Locale locale = i < fVar.f1892a.size() ? fVar.f1892a.get(i) : b4.f1891a.f1892a.get(i - fVar.f1892a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            eVar2 = new j0.e(new j0.f(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return eVar2.f1891a.f1892a.isEmpty() ? b4 : eVar2;
    }

    public static Configuration r(Context context, int i, j0.e eVar, Configuration configuration, boolean z3) {
        int i4 = i != 1 ? i != 2 ? z3 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            u.d(configuration2, eVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f1587e0 = (1 << i) | this.f1587e0;
        if (this.d0) {
            return;
        }
        View decorView = this.f1596q.getDecorView();
        WeakHashMap weakHashMap = n0.l0.f2757a;
        decorView.postOnAnimation(this.f1588f0);
        this.d0 = true;
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f1586c0 == null) {
                            this.f1586c0 = new y(this, context);
                        }
                        return this.f1586c0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean C() {
        l1 l1Var;
        y2 y2Var;
        boolean z3 = this.S;
        this.S = false;
        b0 y3 = y(0);
        if (!y3.f1576m) {
            j.a aVar = this.f1605z;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            z();
            m0 m0Var = this.f1599t;
            if (m0Var == null || (l1Var = m0Var.f1664r) == null || (y2Var = ((d3) l1Var).f2269a.Q) == null || y2Var.f2522g == null) {
                return false;
            }
            y2 y2Var2 = ((d3) l1Var).f2269a.Q;
            k.o oVar = y2Var2 == null ? null : y2Var2.f2522g;
            if (oVar != null) {
                oVar.collapseActionView();
            }
        } else if (!z3) {
            q(y3, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.f2053k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(b0 b0Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z3 = b0Var.f1576m;
        int i4 = b0Var.f1566a;
        if (z3 || this.V) {
            return;
        }
        Context context = this.f1595p;
        if (i4 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f1596q.getCallback();
        if (callback != null && !callback.onMenuOpened(i4, b0Var.f1572h)) {
            q(b0Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(b0Var, keyEvent)) {
            return;
        }
        a0 a0Var = b0Var.f1569e;
        if (a0Var == null || b0Var.f1577n) {
            if (a0Var == null) {
                z();
                m0 m0Var = this.f1599t;
                Context X = m0Var != null ? m0Var.X() : null;
                if (X != null) {
                    context = X;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.oriondriftchasers.arordrft.R.attr.actionBarPopupTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    newTheme.applyStyle(i5, true);
                }
                newTheme.resolveAttribute(com.oriondriftchasers.arordrft.R.attr.panelMenuListTheme, typedValue, true);
                int i6 = typedValue.resourceId;
                if (i6 != 0) {
                    newTheme.applyStyle(i6, true);
                } else {
                    newTheme.applyStyle(com.oriondriftchasers.arordrft.R.style.Theme_AppCompat_CompactMenu, true);
                }
                j.c cVar = new j.c(context, 0);
                cVar.getTheme().setTo(newTheme);
                b0Var.f1573j = cVar;
                TypedArray obtainStyledAttributes = cVar.obtainStyledAttributes(f.a.f1247j);
                b0Var.f1567b = obtainStyledAttributes.getResourceId(86, 0);
                b0Var.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                b0Var.f1569e = new a0(this, b0Var.f1573j);
                b0Var.f1568c = 81;
            } else if (b0Var.f1577n && a0Var.getChildCount() > 0) {
                b0Var.f1569e.removeAllViews();
            }
            View view = b0Var.f1571g;
            if (view == null) {
                if (b0Var.f1572h != null) {
                    if (this.f1604y == null) {
                        this.f1604y = new r(this, 3);
                    }
                    r rVar = this.f1604y;
                    if (b0Var.i == null) {
                        k.i iVar = new k.i(b0Var.f1573j);
                        b0Var.i = iVar;
                        iVar.f2052j = rVar;
                        k.m mVar = b0Var.f1572h;
                        mVar.b(iVar, mVar.f2060a);
                    }
                    k.i iVar2 = b0Var.i;
                    a0 a0Var2 = b0Var.f1569e;
                    if (iVar2.i == null) {
                        iVar2.i = (ExpandedMenuView) iVar2.f2050g.inflate(com.oriondriftchasers.arordrft.R.layout.abc_expanded_menu_layout, (ViewGroup) a0Var2, false);
                        if (iVar2.f2053k == null) {
                            iVar2.f2053k = new k.h(iVar2);
                        }
                        iVar2.i.setAdapter((ListAdapter) iVar2.f2053k);
                        iVar2.i.setOnItemClickListener(iVar2);
                    }
                    ExpandedMenuView expandedMenuView = iVar2.i;
                    b0Var.f1570f = expandedMenuView;
                }
                b0Var.f1577n = true;
                return;
            }
            b0Var.f1570f = view;
            if (b0Var.f1570f != null) {
                if (b0Var.f1571g == null) {
                    k.i iVar3 = b0Var.i;
                    if (iVar3.f2053k == null) {
                        iVar3.f2053k = new k.h(iVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = b0Var.f1570f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                b0Var.f1569e.setBackgroundResource(b0Var.f1567b);
                ViewParent parent = b0Var.f1570f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(b0Var.f1570f);
                }
                b0Var.f1569e.addView(b0Var.f1570f, layoutParams2);
                if (!b0Var.f1570f.hasFocus()) {
                    b0Var.f1570f.requestFocus();
                }
            }
            b0Var.f1577n = true;
            return;
        }
        View view2 = b0Var.f1571g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            b0Var.f1575l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = b0Var.f1568c;
            layoutParams3.windowAnimations = b0Var.d;
            windowManager.addView(b0Var.f1569e, layoutParams3);
            b0Var.f1576m = true;
            if (i4 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        b0Var.f1575l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = b0Var.f1568c;
        layoutParams32.windowAnimations = b0Var.d;
        windowManager.addView(b0Var.f1569e, layoutParams32);
        b0Var.f1576m = true;
        if (i4 != 0) {
        }
    }

    public final boolean E(b0 b0Var, int i, KeyEvent keyEvent) {
        k.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((b0Var.f1574k || F(b0Var, keyEvent)) && (mVar = b0Var.f1572h) != null) {
            return mVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.f1572h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(b0 b0Var, KeyEvent keyEvent) {
        k1 k1Var;
        k1 k1Var2;
        Resources.Theme theme;
        k1 k1Var3;
        k1 k1Var4;
        if (!this.V) {
            boolean z3 = b0Var.f1574k;
            int i = b0Var.f1566a;
            if (z3) {
                return true;
            }
            b0 b0Var2 = this.R;
            if (b0Var2 != null && b0Var2 != b0Var) {
                q(b0Var2, false);
            }
            Window.Callback callback = this.f1596q.getCallback();
            if (callback != null) {
                b0Var.f1571g = callback.onCreatePanelView(i);
            }
            boolean z4 = i == 0 || i == 108;
            if (z4 && (k1Var4 = this.f1602w) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var4;
                actionBarOverlayLayout.k();
                ((d3) actionBarOverlayLayout.f181j).f2278l = true;
            }
            if (b0Var.f1571g == null) {
                k.m mVar = b0Var.f1572h;
                if (mVar == null || b0Var.f1578o) {
                    if (mVar == null) {
                        Context context = this.f1595p;
                        if ((i == 0 || i == 108) && this.f1602w != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.oriondriftchasers.arordrft.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.oriondriftchasers.arordrft.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.oriondriftchasers.arordrft.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                j.c cVar = new j.c(context, 0);
                                cVar.getTheme().setTo(theme);
                                context = cVar;
                            }
                        }
                        k.m mVar2 = new k.m(context);
                        mVar2.f2063e = this;
                        k.m mVar3 = b0Var.f1572h;
                        if (mVar2 != mVar3) {
                            if (mVar3 != null) {
                                mVar3.r(b0Var.i);
                            }
                            b0Var.f1572h = mVar2;
                            k.i iVar = b0Var.i;
                            if (iVar != null) {
                                mVar2.b(iVar, mVar2.f2060a);
                            }
                        }
                    }
                    if (z4 && (k1Var2 = this.f1602w) != null) {
                        if (this.f1603x == null) {
                            this.f1603x = new r(this, 2);
                        }
                        ((ActionBarOverlayLayout) k1Var2).l(b0Var.f1572h, this.f1603x);
                    }
                    b0Var.f1572h.w();
                    if (callback.onCreatePanelMenu(i, b0Var.f1572h)) {
                        b0Var.f1578o = false;
                    } else {
                        k.m mVar4 = b0Var.f1572h;
                        if (mVar4 != null) {
                            if (mVar4 != null) {
                                mVar4.r(b0Var.i);
                            }
                            b0Var.f1572h = null;
                        }
                        if (z4 && (k1Var = this.f1602w) != null) {
                            ((ActionBarOverlayLayout) k1Var).l(null, this.f1603x);
                        }
                    }
                }
                b0Var.f1572h.w();
                Bundle bundle = b0Var.f1579p;
                if (bundle != null) {
                    b0Var.f1572h.s(bundle);
                    b0Var.f1579p = null;
                }
                if (!callback.onPreparePanel(0, b0Var.f1571g, b0Var.f1572h)) {
                    if (z4 && (k1Var3 = this.f1602w) != null) {
                        ((ActionBarOverlayLayout) k1Var3).l(null, this.f1603x);
                    }
                    b0Var.f1572h.v();
                    return false;
                }
                b0Var.f1572h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                b0Var.f1572h.v();
            }
            b0Var.f1574k = true;
            b0Var.f1575l = false;
            this.R = b0Var;
            return true;
        }
        return false;
    }

    public final void G() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z3 = false;
            if (this.f1592k0 != null && (y(0).f1576m || this.f1605z != null)) {
                z3 = true;
            }
            if (z3 && this.f1593l0 == null) {
                this.f1593l0 = w.b(this.f1592k0, this);
            } else {
                if (z3 || (onBackInvokedCallback = this.f1593l0) == null) {
                    return;
                }
                w.c(this.f1592k0, onBackInvokedCallback);
                this.f1593l0 = null;
            }
        }
    }

    @Override // g.p
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f1595p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof c0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.p
    public final void c() {
        String str;
        this.T = true;
        l(false, true);
        w();
        Object obj = this.f1594o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = c0.c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                m0 m0Var = this.f1599t;
                if (m0Var == null) {
                    this.f1589g0 = true;
                } else {
                    m0Var.Z(true);
                }
            }
            synchronized (p.f1682m) {
                p.e(this);
                p.f1681l.add(new WeakReference(this));
            }
        }
        this.W = new Configuration(this.f1595p.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // g.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        y yVar;
        y yVar2;
        if (this.f1594o instanceof Activity) {
            synchronized (p.f1682m) {
                p.e(this);
            }
        }
        if (this.d0) {
            this.f1596q.getDecorView().removeCallbacks(this.f1588f0);
        }
        this.V = true;
        if (this.X != -100) {
            Object obj = this.f1594o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f1581m0.put(this.f1594o.getClass().getName(), Integer.valueOf(this.X));
                yVar = this.f1585b0;
                if (yVar != null) {
                    yVar.c();
                }
                yVar2 = this.f1586c0;
                if (yVar2 == null) {
                    yVar2.c();
                    return;
                }
                return;
            }
        }
        f1581m0.remove(this.f1594o.getClass().getName());
        yVar = this.f1585b0;
        if (yVar != null) {
        }
        yVar2 = this.f1586c0;
        if (yVar2 == null) {
        }
    }

    @Override // g.p
    public final boolean f(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.O && i == 108) {
            return false;
        }
        if (this.K && i == 1) {
            this.K = false;
        }
        if (i == 1) {
            G();
            this.O = true;
            return true;
        }
        if (i == 2) {
            G();
            this.I = true;
            return true;
        }
        if (i == 5) {
            G();
            this.J = true;
            return true;
        }
        if (i == 10) {
            G();
            this.M = true;
            return true;
        }
        if (i == 108) {
            G();
            this.K = true;
            return true;
        }
        if (i != 109) {
            return this.f1596q.requestFeature(i);
        }
        G();
        this.L = true;
        return true;
    }

    @Override // g.p
    public final void g(int i) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1595p).inflate(i, viewGroup);
        this.f1597r.a(this.f1596q.getCallback());
    }

    @Override // g.p
    public final void h(View view) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1597r.a(this.f1596q.getCallback());
    }

    @Override // g.p
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1597r.a(this.f1596q.getCallback());
    }

    @Override // g.p
    public final void j(CharSequence charSequence) {
        this.f1601v = charSequence;
        k1 k1Var = this.f1602w;
        if (k1Var != null) {
            k1Var.setWindowTitle(charSequence);
            return;
        }
        m0 m0Var = this.f1599t;
        if (m0Var == null) {
            TextView textView = this.G;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        d3 d3Var = (d3) m0Var.f1664r;
        if (d3Var.f2274g) {
            return;
        }
        Toolbar toolbar = d3Var.f2269a;
        d3Var.f2275h = charSequence;
        if ((d3Var.f2270b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (d3Var.f2274g) {
                n0.l0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // k.k
    public final boolean k(k.m mVar, MenuItem menuItem) {
        b0 b0Var;
        Window.Callback callback = this.f1596q.getCallback();
        if (callback != null && !this.V) {
            k.m k4 = mVar.k();
            b0[] b0VarArr = this.Q;
            int length = b0VarArr != null ? b0VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    b0Var = b0VarArr[i];
                    if (b0Var != null && b0Var.f1572h == k4) {
                        break;
                    }
                    i++;
                } else {
                    b0Var = null;
                    break;
                }
            }
            if (b0Var != null) {
                return callback.onMenuItemSelected(b0Var.f1566a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(boolean z3, boolean z4) {
        int i;
        Configuration configuration;
        j0.e b4;
        int i4;
        boolean z5;
        Object obj;
        Object obj2;
        Activity activity;
        if (this.V) {
            return false;
        }
        int i5 = this.X;
        if (i5 == -100) {
            i5 = p.f1677g;
        }
        Context context = this.f1595p;
        int B = B(context, i5);
        int i6 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        j0.e n4 = i6 < 33 ? n(context) : null;
        if (!z4 && n4 != null) {
            n4 = u.b(context.getResources().getConfiguration());
        }
        Configuration r3 = r(context, B, n4, null, false);
        boolean z6 = this.f1584a0;
        boolean z7 = true;
        Object obj3 = this.f1594o;
        if (!z6 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.W;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i7 = configuration.uiMode & 48;
                int i8 = r3.uiMode & 48;
                j0.e b5 = u.b(configuration);
                b4 = n4 != null ? null : u.b(r3);
                i4 = i7 == i8 ? 512 : 0;
                if (b4 != null && !b5.equals(b4)) {
                    i4 |= 8196;
                }
                if (((~i) & i4) != 0 && z3 && this.T && ((f1583o0 || this.U) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i9 = Build.VERSION.SDK_INT;
                        if (i9 >= 31 && (i4 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(r3.getLayoutDirection());
                        }
                        if (i9 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new a.j(4, activity));
                        }
                        z5 = true;
                        if (!z5 || i4 == 0) {
                            z7 = z5;
                        } else {
                            boolean z8 = (i4 & i) == i4;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i8;
                            if (b4 != null) {
                                u.d(configuration2, b4);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 < 26 && i10 < 28) {
                                if (!a.y.f75m) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        a.y.f74l = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e4) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e4);
                                    }
                                    a.y.f75m = true;
                                }
                                Field field = a.y.f74l;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e5) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e5);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!a.y.f70g) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                a.y.f69f = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e6) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
                                            }
                                            a.y.f70g = true;
                                        }
                                        Field field2 = a.y.f69f;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e7) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e7);
                                            }
                                            if (obj2 != null) {
                                                if (!a.y.i) {
                                                    try {
                                                        a.y.f71h = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e8) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e8);
                                                    }
                                                    a.y.i = true;
                                                }
                                                Class cls = a.y.f71h;
                                                if (cls != null) {
                                                    if (!a.y.f73k) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            a.y.f72j = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e9) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e9);
                                                        }
                                                        a.y.f73k = true;
                                                    }
                                                    Field field3 = a.y.f72j;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e10) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e10);
                                                        }
                                                        if (longSparseArray != null) {
                                                            longSparseArray.clear();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i11 = this.Y;
                            if (i11 != 0) {
                                context.setTheme(i11);
                                context.getTheme().applyStyle(this.Y, true);
                            }
                            if (z8 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).e().f630c.compareTo(androidx.lifecycle.m.f619h) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.U && !this.V) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b4 != null) {
                            u.c(u.b(context.getResources().getConfiguration()));
                        }
                        if (i5 == 0) {
                            x(context).i();
                        } else {
                            y yVar = this.f1585b0;
                            if (yVar != null) {
                                yVar.c();
                            }
                        }
                        if (i5 == 3) {
                            if (this.f1586c0 == null) {
                                this.f1586c0 = new y(this, context);
                            }
                            this.f1586c0.i();
                        } else {
                            y yVar2 = this.f1586c0;
                            if (yVar2 != null) {
                                yVar2.c();
                            }
                        }
                        return z7;
                    }
                }
                z5 = false;
                if (z5) {
                }
                z7 = z5;
                if (b4 != null) {
                }
                if (i5 == 0) {
                }
                if (i5 == 3) {
                }
                return z7;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i6 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.Z = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e11) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e11);
                this.Z = 0;
            }
        }
        this.f1584a0 = true;
        i = this.Z;
        configuration = this.W;
        if (configuration == null) {
        }
        int i72 = configuration.uiMode & 48;
        int i82 = r3.uiMode & 48;
        j0.e b52 = u.b(configuration);
        if (n4 != null) {
        }
        if (i72 == i82) {
        }
        if (b4 != null) {
            i4 |= 8196;
        }
        if (((~i) & i4) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z5 = false;
        if (z5) {
        }
        z7 = z5;
        if (b4 != null) {
        }
        if (i5 == 0) {
        }
        if (i5 == 3) {
        }
        return z7;
    }

    public final void m(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f1596q != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        x xVar = new x(this, callback);
        this.f1597r = xVar;
        window.setCallback(xVar);
        Context context = this.f1595p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f1582n0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            l.u a2 = l.u.a();
            synchronized (a2) {
                drawable = a2.f2467a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f1596q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f1592k0) != null) {
            return;
        }
        Object obj = this.f1594o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f1593l0) != null) {
            w.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1593l0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f1592k0 = w.a(activity);
                H();
            }
        }
        this.f1592k0 = null;
        H();
    }

    public final void o(int i, b0 b0Var, k.m mVar) {
        if (mVar == null) {
            if (b0Var == null && i >= 0) {
                b0[] b0VarArr = this.Q;
                if (i < b0VarArr.length) {
                    b0Var = b0VarArr[i];
                }
            }
            if (b0Var != null) {
                mVar = b0Var.f1572h;
            }
        }
        if ((b0Var == null || b0Var.f1576m) && !this.V) {
            x xVar = this.f1597r;
            Window.Callback callback = this.f1596q.getCallback();
            xVar.getClass();
            try {
                xVar.i = true;
                callback.onPanelClosed(i, mVar);
            } finally {
                xVar.i = false;
            }
        }
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
        throw new UnsupportedOperationException("Method not decompiled: g.c0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(k.m mVar) {
        l.l lVar;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1602w;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((d3) actionBarOverlayLayout.f181j).f2269a.f218f;
        if (actionMenuView != null && (lVar = actionMenuView.f202y) != null) {
            lVar.f();
            l.g gVar = lVar.f2378z;
            if (gVar != null && gVar.b()) {
                gVar.i.dismiss();
            }
        }
        Window.Callback callback = this.f1596q.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, mVar);
        }
        this.P = false;
    }

    public final void q(b0 b0Var, boolean z3) {
        a0 a0Var;
        k1 k1Var;
        l.l lVar;
        if (z3 && b0Var.f1566a == 0 && (k1Var = this.f1602w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((d3) actionBarOverlayLayout.f181j).f2269a.f218f;
            if (actionMenuView != null && (lVar = actionMenuView.f202y) != null && lVar.k()) {
                p(b0Var.f1572h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1595p.getSystemService("window");
        if (windowManager != null && b0Var.f1576m && (a0Var = b0Var.f1569e) != null) {
            windowManager.removeView(a0Var);
            if (z3) {
                o(b0Var.f1566a, b0Var, null);
            }
        }
        b0Var.f1574k = false;
        b0Var.f1575l = false;
        b0Var.f1576m = false;
        b0Var.f1570f = null;
        b0Var.f1577n = true;
        if (this.R == b0Var) {
            this.R = null;
        }
        if (b0Var.f1566a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r7.f() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0102, code lost:
    
        if (r7.n() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(KeyEvent keyEvent) {
        View decorView;
        boolean z3;
        boolean z4;
        ActionMenuView actionMenuView;
        l.l lVar;
        Object obj = this.f1594o;
        if ((!(obj instanceof n0.i) && !(obj instanceof g)) || (decorView = this.f1596q.getDecorView()) == null || !h.a.q(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                x xVar = this.f1597r;
                Window.Callback callback = this.f1596q.getCallback();
                xVar.getClass();
                try {
                    xVar.f1692h = true;
                } finally {
                    xVar.f1692h = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.S = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        b0 y3 = y(0);
                        if (!y3.f1576m) {
                            F(y3, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f1605z == null) {
                        b0 y4 = y(0);
                        k1 k1Var = this.f1602w;
                        Context context = this.f1595p;
                        if (k1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((d3) actionBarOverlayLayout.f181j).f2269a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f218f) != null && actionMenuView.f201x && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1602w;
                                actionBarOverlayLayout2.k();
                                ActionMenuView actionMenuView2 = ((d3) actionBarOverlayLayout2.f181j).f2269a.f218f;
                                if (actionMenuView2 == null || (lVar = actionMenuView2.f202y) == null || !lVar.k()) {
                                    if (!this.V && F(y4, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1602w;
                                        actionBarOverlayLayout3.k();
                                        ActionMenuView actionMenuView3 = ((d3) actionBarOverlayLayout3.f181j).f2269a.f218f;
                                        if (actionMenuView3 != null) {
                                            l.l lVar2 = actionMenuView3.f202y;
                                            if (lVar2 != null) {
                                            }
                                        }
                                    }
                                    z3 = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1602w;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView4 = ((d3) actionBarOverlayLayout4.f181j).f2269a.f218f;
                                    if (actionMenuView4 != null) {
                                        l.l lVar3 = actionMenuView4.f202y;
                                        if (lVar3 != null) {
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
                        boolean z5 = y4.f1576m;
                        if (z5 || y4.f1575l) {
                            q(y4, true);
                            z3 = z5;
                            if (z3) {
                            }
                        } else {
                            if (y4.f1574k) {
                                if (y4.f1578o) {
                                    y4.f1574k = false;
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

    public final void t(int i) {
        b0 y3 = y(i);
        if (y3.f1572h != null) {
            Bundle bundle = new Bundle();
            y3.f1572h.t(bundle);
            if (bundle.size() > 0) {
                y3.f1579p = bundle;
            }
            y3.f1572h.w();
            y3.f1572h.clear();
        }
        y3.f1578o = true;
        y3.f1577n = true;
        if ((i == 108 || i == 0) && this.f1602w != null) {
            b0 y4 = y(0);
            y4.f1574k = false;
            F(y4, null);
        }
    }

    public final void u() {
        ViewGroup viewGroup;
        if (this.E) {
            return;
        }
        Context context = this.f1595p;
        int[] iArr = f.a.f1247j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i = 0;
        int i4 = 1;
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
        this.N = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f1596q.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) from.inflate(com.oriondriftchasers.arordrft.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.oriondriftchasers.arordrft.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) from.inflate(com.oriondriftchasers.arordrft.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.oriondriftchasers.arordrft.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.c(context, typedValue.resourceId) : context).inflate(com.oriondriftchasers.arordrft.R.layout.abc_screen_toolbar, (ViewGroup) null);
            k1 k1Var = (k1) viewGroup.findViewById(com.oriondriftchasers.arordrft.R.id.decor_content_parent);
            this.f1602w = k1Var;
            k1Var.setWindowCallback(this.f1596q.getCallback());
            if (this.L) {
                ((ActionBarOverlayLayout) this.f1602w).j(109);
            }
            if (this.I) {
                ((ActionBarOverlayLayout) this.f1602w).j(2);
            }
            if (this.J) {
                ((ActionBarOverlayLayout) this.f1602w).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        r rVar = new r(this, i);
        WeakHashMap weakHashMap = n0.l0.f2757a;
        n0.d0.j(viewGroup, rVar);
        if (this.f1602w == null) {
            this.G = (TextView) viewGroup.findViewById(com.oriondriftchasers.arordrft.R.id.title);
        }
        boolean z3 = l3.f2381a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.oriondriftchasers.arordrft.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1596q.findViewById(R.id.content);
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
        this.f1596q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new r(this, i4));
        this.F = viewGroup;
        Object obj = this.f1594o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1601v;
        if (!TextUtils.isEmpty(title)) {
            k1 k1Var2 = this.f1602w;
            if (k1Var2 != null) {
                k1Var2.setWindowTitle(title);
            } else {
                m0 m0Var = this.f1599t;
                if (m0Var != null) {
                    d3 d3Var = (d3) m0Var.f1664r;
                    if (!d3Var.f2274g) {
                        Toolbar toolbar = d3Var.f2269a;
                        d3Var.f2275h = title;
                        if ((d3Var.f2270b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (d3Var.f2274g) {
                                n0.l0.n(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.G;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.F.findViewById(R.id.content);
        View decorView = this.f1596q.getDecorView();
        contentFrameLayout2.f213l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.E = true;
        b0 y3 = y(0);
        if (this.V || y3.f1572h != null) {
            return;
        }
        A(108);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // k.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(k.m mVar) {
        ActionMenuView actionMenuView;
        l.l lVar;
        l.l lVar2;
        l.l lVar3;
        k1 k1Var = this.f1602w;
        if (k1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((d3) actionBarOverlayLayout.f181j).f2269a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f218f) != null && actionMenuView.f201x) {
                if (ViewConfiguration.get(this.f1595p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1602w;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((d3) actionBarOverlayLayout2.f181j).f2269a.f218f;
                    if (actionMenuView2 != null) {
                        l.l lVar4 = actionMenuView2.f202y;
                        if (lVar4 != null) {
                            if (lVar4.A == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f1596q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1602w;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((d3) actionBarOverlayLayout3.f181j).f2269a.f218f;
                if (actionMenuView3 != null && (lVar2 = actionMenuView3.f202y) != null && lVar2.k()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1602w;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((d3) actionBarOverlayLayout4.f181j).f2269a.f218f;
                    if (actionMenuView4 != null && (lVar3 = actionMenuView4.f202y) != null) {
                        lVar3.f();
                    }
                    if (this.V) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).f1572h);
                    return;
                }
                if (callback == null || this.V) {
                    return;
                }
                if (this.d0 && (1 & this.f1587e0) != 0) {
                    View decorView = this.f1596q.getDecorView();
                    q qVar = this.f1588f0;
                    decorView.removeCallbacks(qVar);
                    qVar.run();
                }
                b0 y3 = y(0);
                k.m mVar2 = y3.f1572h;
                if (mVar2 == null || y3.f1578o || !callback.onPreparePanel(0, y3.f1571g, mVar2)) {
                    return;
                }
                callback.onMenuOpened(108, y3.f1572h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f1602w;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((d3) actionBarOverlayLayout5.f181j).f2269a.f218f;
                if (actionMenuView5 == null || (lVar = actionMenuView5.f202y) == null) {
                    return;
                }
                lVar.n();
                return;
            }
        }
        b0 y4 = y(0);
        y4.f1577n = true;
        q(y4, false);
        D(y4, null);
    }

    public final void w() {
        if (this.f1596q == null) {
            Object obj = this.f1594o;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.f1596q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final androidx.fragment.app.j x(Context context) {
        if (this.f1585b0 == null) {
            if (androidx.emoji2.text.t.f353e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.emoji2.text.t.f353e = new androidx.emoji2.text.t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1585b0 = new y(this, androidx.emoji2.text.t.f353e);
        }
        return this.f1585b0;
    }

    public final b0 y(int i) {
        b0[] b0VarArr = this.Q;
        if (b0VarArr == null || b0VarArr.length <= i) {
            b0[] b0VarArr2 = new b0[i + 1];
            if (b0VarArr != null) {
                System.arraycopy(b0VarArr, 0, b0VarArr2, 0, b0VarArr.length);
            }
            this.Q = b0VarArr2;
            b0VarArr = b0VarArr2;
        }
        b0 b0Var = b0VarArr[i];
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0();
        b0Var2.f1566a = i;
        b0Var2.f1577n = false;
        b0VarArr[i] = b0Var2;
        return b0Var2;
    }

    public final void z() {
        u();
        if (this.K && this.f1599t == null) {
            Object obj = this.f1594o;
            if (obj instanceof Activity) {
                this.f1599t = new m0((Activity) obj, this.L);
            } else if (obj instanceof Dialog) {
                this.f1599t = new m0((Dialog) obj);
            }
            m0 m0Var = this.f1599t;
            if (m0Var != null) {
                m0Var.Z(this.f1589g0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
