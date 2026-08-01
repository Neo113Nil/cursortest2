package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class n4 extends z3 implements kw, LayoutInflater.Factory2 {
    public static final w50 m0 = new w50(0);
    public static final int[] n0 = {R.attr.windowBackground};
    public static final boolean o0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow A;
    public a4 B;
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
    public m4[] Q;
    public m4 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;
    public boolean a0;
    public i4 b0;
    public i4 c0;
    public boolean d0;
    public int e0;
    public boolean g0;
    public Rect h0;
    public Rect i0;
    public j6 j0;
    public OnBackInvokedDispatcher k0;
    public OnBackInvokedCallback l0;
    public final Object o;
    public final Context p;
    public Window q;
    public h4 r;
    public xd0 s;
    public v70 t;
    public CharSequence u;
    public ActionBarOverlayLayout v;
    public b4 w;
    public b4 x;
    public m1 y;
    public ActionBarContextView z;
    public wc0 C = null;
    public final boolean D = true;
    public final a4 f0 = new a4(this, 0);

    public n4(Context context, Window window, p3 p3Var, Object obj) {
        m3 m3Var = null;
        this.X = -100;
        this.p = context;
        this.o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof m3)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        m3Var = (m3) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (m3Var != null) {
                this.X = ((n4) m3Var.j()).X;
            }
        }
        if (this.X == -100) {
            String name = this.o.getClass().getName();
            w50 w50Var = m0;
            Integer num = (Integer) w50Var.get(name);
            if (num != null) {
                this.X = num.intValue();
                w50Var.remove(this.o.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        r4.d();
    }

    public static wt n(Context context) {
        wt wtVar;
        wt wtVar2;
        if (Build.VERSION.SDK_INT >= 33 || (wtVar = z3.h) == null) {
            return null;
        }
        xt xtVar = wtVar.a;
        wt b = e4.b(context.getApplicationContext().getResources().getConfiguration());
        if (xtVar.a.isEmpty()) {
            wtVar2 = wt.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.a.a.size() + xtVar.a.size()) {
                Locale locale = i < xtVar.a.size() ? xtVar.a.get(i) : b.a.a.get(i - xtVar.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            wtVar2 = new wt(new xt(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return wtVar2.a.a.isEmpty() ? b : wtVar2;
    }

    public static Configuration s(Context context, int i, wt wtVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (wtVar != null) {
            e4.d(configuration2, wtVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.e0 = (1 << i) | this.e0;
        if (this.d0) {
            return;
        }
        View decorView = this.q.getDecorView();
        WeakHashMap weakHashMap = ic0.a;
        decorView.postOnAnimation(this.f0);
        this.d0 = true;
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            g9.s("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.c0 == null) {
                            this.c0 = new i4(this, context);
                        }
                        return this.c0.f();
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
        yf yfVar;
        n90 n90Var;
        boolean z = this.S;
        this.S = false;
        m4 y = y(0);
        if (!y.m) {
            m1 m1Var = this.y;
            if (m1Var != null) {
                m1Var.a();
                return true;
            }
            z();
            xd0 xd0Var = this.s;
            if (xd0Var == null || (yfVar = xd0Var.e) == null || (n90Var = ((s90) yfVar).a.Q) == null || n90Var.g == null) {
                return false;
            }
            n90 n90Var2 = ((s90) yfVar).a.Q;
            qw qwVar = n90Var2 == null ? null : n90Var2.g;
            if (qwVar != null) {
                qwVar.collapseActionView();
            }
        } else if (!z) {
            r(y, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(m4 m4Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = m4Var.m;
        int i2 = m4Var.a;
        if (z || this.V) {
            return;
        }
        Context context = this.p;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, m4Var.h)) {
            r(m4Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(m4Var, keyEvent)) {
            return;
        }
        l4 l4Var = m4Var.e;
        if (l4Var == null || m4Var.n) {
            if (l4Var == null) {
                z();
                xd0 xd0Var = this.s;
                Context b = xd0Var != null ? xd0Var.b() : null;
                if (b != null) {
                    context = b;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.moontiko.really.admiralcasino.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.moontiko.really.admiralcasino.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.moontiko.really.admiralcasino.R.style.Theme_AppCompat_CompactMenu, true);
                }
                ke keVar = new ke(context, 0);
                keVar.getTheme().setTo(newTheme);
                m4Var.j = keVar;
                TypedArray obtainStyledAttributes = keVar.obtainStyledAttributes(z00.j);
                m4Var.b = obtainStyledAttributes.getResourceId(86, 0);
                m4Var.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                m4Var.e = new l4(this, m4Var.j);
                m4Var.c = 81;
            } else if (m4Var.n && l4Var.getChildCount() > 0) {
                m4Var.e.removeAllViews();
            }
            View view = m4Var.g;
            if (view == null) {
                if (m4Var.h != null) {
                    if (this.x == null) {
                        this.x = new b4(this, 3);
                    }
                    b4 b4Var = this.x;
                    if (m4Var.i == null) {
                        gt gtVar = new gt(m4Var.j);
                        m4Var.i = gtVar;
                        gtVar.j = b4Var;
                        mw mwVar = m4Var.h;
                        mwVar.b(gtVar, mwVar.a);
                    }
                    gt gtVar2 = m4Var.i;
                    l4 l4Var2 = m4Var.e;
                    if (gtVar2.i == null) {
                        gtVar2.i = (ExpandedMenuView) gtVar2.g.inflate(com.moontiko.really.admiralcasino.R.layout.abc_expanded_menu_layout, (ViewGroup) l4Var2, false);
                        if (gtVar2.k == null) {
                            gtVar2.k = new ft(gtVar2);
                        }
                        gtVar2.i.setAdapter((ListAdapter) gtVar2.k);
                        gtVar2.i.setOnItemClickListener(gtVar2);
                    }
                    ExpandedMenuView expandedMenuView = gtVar2.i;
                    m4Var.f = expandedMenuView;
                }
                m4Var.n = true;
                return;
            }
            m4Var.f = view;
            if (m4Var.f != null) {
                if (m4Var.g == null) {
                    gt gtVar3 = m4Var.i;
                    if (gtVar3.k == null) {
                        gtVar3.k = new ft(gtVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = m4Var.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                m4Var.e.setBackgroundResource(m4Var.b);
                ViewParent parent = m4Var.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(m4Var.f);
                }
                m4Var.e.addView(m4Var.f, layoutParams2);
                if (!m4Var.f.hasFocus()) {
                    m4Var.f.requestFocus();
                }
            }
            m4Var.n = true;
            return;
        }
        View view2 = m4Var.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            m4Var.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = m4Var.c;
            layoutParams3.windowAnimations = m4Var.d;
            windowManager.addView(m4Var.e, layoutParams3);
            m4Var.m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        m4Var.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = m4Var.c;
        layoutParams32.windowAnimations = m4Var.d;
        windowManager.addView(m4Var.e, layoutParams32);
        m4Var.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(m4 m4Var, int i, KeyEvent keyEvent) {
        mw mwVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((m4Var.k || F(m4Var, keyEvent)) && (mwVar = m4Var.h) != null) {
            return mwVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(m4 m4Var, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.V) {
            boolean z = m4Var.k;
            int i = m4Var.a;
            if (z) {
                return true;
            }
            m4 m4Var2 = this.R;
            if (m4Var2 != null && m4Var2 != m4Var) {
                r(m4Var2, false);
            }
            Window.Callback callback = this.q.getCallback();
            if (callback != null) {
                m4Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.v) != null) {
                actionBarOverlayLayout4.k();
                ((s90) actionBarOverlayLayout4.j).l = true;
            }
            if (m4Var.g == null) {
                mw mwVar = m4Var.h;
                if (mwVar == null || m4Var.o) {
                    if (mwVar == null) {
                        Context context = this.p;
                        if ((i == 0 || i == 108) && this.v != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.moontiko.really.admiralcasino.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.moontiko.really.admiralcasino.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.moontiko.really.admiralcasino.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                ke keVar = new ke(context, 0);
                                keVar.getTheme().setTo(theme);
                                context = keVar;
                            }
                        }
                        mw mwVar2 = new mw(context);
                        mwVar2.e = this;
                        mw mwVar3 = m4Var.h;
                        if (mwVar2 != mwVar3) {
                            if (mwVar3 != null) {
                                mwVar3.r(m4Var.i);
                            }
                            m4Var.h = mwVar2;
                            gt gtVar = m4Var.i;
                            if (gtVar != null) {
                                mwVar2.b(gtVar, mwVar2.a);
                            }
                        }
                    }
                    if (z2 && (actionBarOverlayLayout2 = this.v) != null) {
                        if (this.w == null) {
                            this.w = new b4(this, 2);
                        }
                        actionBarOverlayLayout2.l(m4Var.h, this.w);
                    }
                    m4Var.h.w();
                    if (callback.onCreatePanelMenu(i, m4Var.h)) {
                        m4Var.o = false;
                    } else {
                        mw mwVar4 = m4Var.h;
                        if (mwVar4 != null) {
                            if (mwVar4 != null) {
                                mwVar4.r(m4Var.i);
                            }
                            m4Var.h = null;
                        }
                        if (z2 && (actionBarOverlayLayout = this.v) != null) {
                            actionBarOverlayLayout.l(null, this.w);
                        }
                    }
                }
                m4Var.h.w();
                Bundle bundle = m4Var.p;
                if (bundle != null) {
                    m4Var.h.s(bundle);
                    m4Var.p = null;
                }
                if (!callback.onPreparePanel(0, m4Var.g, m4Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.v) != null) {
                        actionBarOverlayLayout3.l(null, this.w);
                    }
                    m4Var.h.v();
                    return false;
                }
                m4Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                m4Var.h.v();
            }
            m4Var.k = true;
            m4Var.l = false;
            this.R = m4Var;
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
            boolean z = false;
            if (this.k0 != null && (y(0).m || this.y != null)) {
                z = true;
            }
            if (z && this.l0 == null) {
                this.l0 = g4.b(this.k0, this);
            } else {
                if (z || (onBackInvokedCallback = this.l0) == null) {
                    return;
                }
                g4.c(this.k0, onBackInvokedCallback);
                this.l0 = null;
            }
        }
    }

    @Override // defpackage.z3
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof n4) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.z3
    public final void c() {
        String str;
        this.T = true;
        l(false, true);
        w();
        Object obj = this.o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = mz.p(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                xd0 xd0Var = this.s;
                if (xd0Var == null) {
                    this.g0 = true;
                } else {
                    xd0Var.d(true);
                }
            }
            synchronized (z3.m) {
                z3.e(this);
                z3.l.add(new WeakReference(this));
            }
        }
        this.W = new Configuration(this.p.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        i4 i4Var;
        i4 i4Var2;
        if (this.o instanceof Activity) {
            synchronized (z3.m) {
                z3.e(this);
            }
        }
        if (this.d0) {
            this.q.getDecorView().removeCallbacks(this.f0);
        }
        this.V = true;
        if (this.X != -100) {
            Object obj = this.o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                m0.put(this.o.getClass().getName(), Integer.valueOf(this.X));
                i4Var = this.b0;
                if (i4Var != null) {
                    i4Var.c();
                }
                i4Var2 = this.c0;
                if (i4Var2 == null) {
                    i4Var2.c();
                    return;
                }
                return;
            }
        }
        m0.remove(this.o.getClass().getName());
        i4Var = this.b0;
        if (i4Var != null) {
        }
        i4Var2 = this.c0;
        if (i4Var2 == null) {
        }
    }

    @Override // defpackage.z3
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
            return this.q.requestFeature(i);
        }
        G();
        this.L = true;
        return true;
    }

    @Override // defpackage.kw
    public final boolean g(mw mwVar, MenuItem menuItem) {
        m4 m4Var;
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.V) {
            mw k = mwVar.k();
            m4[] m4VarArr = this.Q;
            int length = m4VarArr != null ? m4VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    m4Var = m4VarArr[i];
                    if (m4Var != null && m4Var.h == k) {
                        break;
                    }
                    i++;
                } else {
                    m4Var = null;
                    break;
                }
            }
            if (m4Var != null) {
                return callback.onMenuItemSelected(m4Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.z3
    public final void h(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.p).inflate(i, viewGroup);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.z3
    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.z3
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.z3
    public final void k(CharSequence charSequence) {
        this.u = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        xd0 xd0Var = this.s;
        if (xd0Var == null) {
            TextView textView = this.G;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        s90 s90Var = (s90) xd0Var.e;
        if (s90Var.g) {
            return;
        }
        Toolbar toolbar = s90Var.a;
        s90Var.h = charSequence;
        if ((s90Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s90Var.g) {
                ic0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        wt b;
        int i2;
        boolean z3;
        Activity activity;
        if (this.V) {
            return false;
        }
        int i3 = this.X;
        if (i3 == -100) {
            i3 = z3.g;
        }
        Context context = this.p;
        int B = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        wt n = i4 < 33 ? n(context) : null;
        if (!z2 && n != null) {
            n = e4.b(context.getResources().getConfiguration());
        }
        Configuration s = s(context, B, n, null, false);
        boolean z4 = this.a0;
        boolean z5 = true;
        Object obj = this.o;
        if (!z4 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.W;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s.uiMode & 48;
                wt b2 = e4.b(configuration);
                b = n != null ? null : e4.b(s);
                i2 = i5 == i6 ? 512 : 0;
                if (b != null && !b2.equals(b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.T && ((o0 || this.U) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new n1(r1, activity));
                        }
                        z3 = true;
                        if (!z3 || i2 == 0) {
                            z5 = z3;
                        } else {
                            r1 = (i2 & i) == i2 ? 1 : 0;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (b != null) {
                                e4.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.Y;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.Y, true);
                            }
                            if (r1 != 0 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof ms) {
                                    if (((ms) activity2).e().c.compareTo(hs.h) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.U && !this.V) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b != null) {
                            e4.c(e4.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).i();
                        } else {
                            i4 i4Var = this.b0;
                            if (i4Var != null) {
                                i4Var.c();
                            }
                        }
                        i4 i4Var2 = this.c0;
                        if (i3 == 3) {
                            if (i4Var2 == null) {
                                this.c0 = new i4(this, context);
                            }
                            this.c0.i();
                        } else if (i4Var2 != null) {
                            i4Var2.c();
                        }
                        return z5;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z5 = z3;
                if (b != null) {
                }
                if (i3 == 0) {
                }
                i4 i4Var22 = this.c0;
                if (i3 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.Z = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.Z = 0;
            }
        }
        this.a0 = true;
        i = this.Z;
        configuration = this.W;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s.uiMode & 48;
        wt b22 = e4.b(configuration);
        if (n != null) {
        }
        if (i52 == i62) {
        }
        if (b != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z3 = false;
        if (z3) {
        }
        z5 = z3;
        if (b != null) {
        }
        if (i3 == 0) {
        }
        i4 i4Var222 = this.c0;
        if (i3 == 3) {
        }
        return z5;
    }

    public final void m(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.q != null) {
            g9.s("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h4) {
            g9.s("AppCompat has already installed itself into the Window");
            return;
        }
        h4 h4Var = new h4(this, callback);
        this.r = h4Var;
        window.setCallback(h4Var);
        Context context = this.p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, n0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            r4 a = r4.a();
            synchronized (a) {
                drawable = a.a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.k0) != null) {
            return;
        }
        Object obj = this.o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.l0) != null) {
            g4.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.l0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.k0 = g4.a(activity);
                H();
            }
        }
        this.k0 = null;
        H();
    }

    public final void o(int i, m4 m4Var, mw mwVar) {
        if (mwVar == null) {
            if (m4Var == null && i >= 0) {
                m4[] m4VarArr = this.Q;
                if (i < m4VarArr.length) {
                    m4Var = m4VarArr[i];
                }
            }
            if (m4Var != null) {
                mwVar = m4Var.h;
            }
        }
        if ((m4Var == null || m4Var.m) && !this.V) {
            h4 h4Var = this.r;
            Window.Callback callback = this.q.getCallback();
            h4Var.getClass();
            try {
                h4Var.i = true;
                callback.onPanelClosed(i, mwVar);
            } finally {
                h4Var.i = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x010e, code lost:
    
        if (r10.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c5Var;
        View view2 = null;
        if (this.j0 == null) {
            int[] iArr = z00.j;
            Context context2 = this.p;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.j0 = new j6();
            } else {
                try {
                    this.j0 = (j6) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.j0 = new j6();
                }
            }
        }
        j6 j6Var = this.j0;
        int i = nb0.a;
        j6Var.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z00.x, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context keVar = (resourceId == 0 || ((context instanceof ke) && ((ke) context).a == resourceId)) ? context : new ke(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                c5Var = new c5(keVar, attributeSet);
                break;
            case 1:
                c5Var = new r3(keVar, attributeSet);
                break;
            case 2:
                c5Var = new y4(keVar, attributeSet);
                break;
            case 3:
                c5Var = j6Var.e(keVar, attributeSet);
                break;
            case 4:
                c5Var = new v4(keVar, attributeSet, com.moontiko.really.admiralcasino.R.attr.imageButtonStyle);
                break;
            case 5:
                c5Var = new e5(keVar, attributeSet);
                break;
            case 6:
                c5Var = new q5(keVar, attributeSet);
                break;
            case 7:
                c5Var = j6Var.d(keVar, attributeSet);
                break;
            case '\b':
                c5Var = new h6(keVar, attributeSet);
                break;
            case '\t':
                c5Var = new x4(keVar, attributeSet, 0);
                break;
            case '\n':
                c5Var = j6Var.a(keVar, attributeSet);
                break;
            case 11:
                c5Var = j6Var.c(keVar, attributeSet);
                break;
            case '\f':
                c5Var = new t4(keVar, attributeSet);
                break;
            case '\r':
                c5Var = j6Var.b(keVar, attributeSet);
                break;
            default:
                c5Var = null;
                break;
        }
        if (c5Var == null && context != keVar) {
            Object[] objArr = j6Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = keVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = j6.g;
                        if (i2 < 3) {
                            View f = j6Var.f(keVar, str, strArr[i2]);
                            if (f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View f2 = j6Var.f(keVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c5Var = view2;
        }
        if (c5Var != null) {
            Context context3 = c5Var.getContext();
            if ((context3 instanceof ContextWrapper) && c5Var.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, j6.c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c5Var.setOnClickListener(new i6(c5Var, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = keVar.obtainStyledAttributes(attributeSet, j6.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = ic0.a;
                    new wb0(com.moontiko.really.admiralcasino.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c5Var, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = keVar.obtainStyledAttributes(attributeSet, j6.e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    ic0.n(c5Var, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = keVar.obtainStyledAttributes(attributeSet, j6.f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = ic0.a;
                    new wb0(com.moontiko.really.admiralcasino.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).d(c5Var, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c5Var;
    }

    public final void p(mw mwVar) {
        i1 i1Var;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((s90) actionBarOverlayLayout.j).a.f;
        if (actionMenuView != null && (i1Var = actionMenuView.y) != null) {
            i1Var.d();
            e1 e1Var = i1Var.y;
            if (e1Var != null && e1Var.b()) {
                e1Var.j.dismiss();
            }
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, mwVar);
        }
        this.P = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // defpackage.kw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(mw mwVar) {
        ActionMenuView actionMenuView;
        i1 i1Var;
        i1 i1Var2;
        i1 i1Var3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((s90) actionBarOverlayLayout.j).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x) {
                if (ViewConfiguration.get(this.p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((s90) actionBarOverlayLayout2.j).a.f;
                    if (actionMenuView2 != null) {
                        i1 i1Var4 = actionMenuView2.y;
                        if (i1Var4 != null) {
                            if (i1Var4.z == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((s90) actionBarOverlayLayout3.j).a.f;
                if (actionMenuView3 != null && (i1Var2 = actionMenuView3.y) != null && i1Var2.i()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((s90) actionBarOverlayLayout4.j).a.f;
                    if (actionMenuView4 != null && (i1Var3 = actionMenuView4.y) != null) {
                        i1Var3.d();
                    }
                    if (this.V) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.V) {
                    return;
                }
                if (this.d0 && (1 & this.e0) != 0) {
                    View decorView = this.q.getDecorView();
                    a4 a4Var = this.f0;
                    decorView.removeCallbacks(a4Var);
                    a4Var.run();
                }
                m4 y = y(0);
                mw mwVar2 = y.h;
                if (mwVar2 == null || y.o || !callback.onPreparePanel(0, y.g, mwVar2)) {
                    return;
                }
                callback.onMenuOpened(108, y.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.v;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((s90) actionBarOverlayLayout5.j).a.f;
                if (actionMenuView5 == null || (i1Var = actionMenuView5.y) == null) {
                    return;
                }
                i1Var.l();
                return;
            }
        }
        m4 y2 = y(0);
        y2.n = true;
        r(y2, false);
        D(y2, null);
    }

    public final void r(m4 m4Var, boolean z) {
        l4 l4Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        i1 i1Var;
        if (z && m4Var.a == 0 && (actionBarOverlayLayout = this.v) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((s90) actionBarOverlayLayout.j).a.f;
            if (actionMenuView != null && (i1Var = actionMenuView.y) != null && i1Var.i()) {
                p(m4Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.p.getSystemService("window");
        if (windowManager != null && m4Var.m && (l4Var = m4Var.e) != null) {
            windowManager.removeView(l4Var);
            if (z) {
                o(m4Var.a, m4Var, null);
            }
        }
        m4Var.k = false;
        m4Var.l = false;
        m4Var.m = false;
        m4Var.f = null;
        m4Var.n = true;
        if (this.R == m4Var) {
            this.R = null;
        }
        if (m4Var.a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r6.d() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fa, code lost:
    
        if (r6.l() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        i1 i1Var;
        Object obj = this.o;
        if ((!(obj instanceof yr) && !(obj instanceof p4)) || (decorView = this.q.getDecorView()) == null || !b9.l(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                h4 h4Var = this.r;
                Window.Callback callback = this.q.getCallback();
                h4Var.getClass();
                try {
                    h4Var.h = true;
                } finally {
                    h4Var.h = false;
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
                        m4 y = y(0);
                        if (!y.m) {
                            F(y, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.y == null) {
                        m4 y2 = y(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
                        Context context = this.p;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((s90) actionBarOverlayLayout.j).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                                actionBarOverlayLayout2.k();
                                ActionMenuView actionMenuView2 = ((s90) actionBarOverlayLayout2.j).a.f;
                                if (actionMenuView2 == null || (i1Var = actionMenuView2.y) == null || !i1Var.i()) {
                                    if (!this.V && F(y2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                                        actionBarOverlayLayout3.k();
                                        ActionMenuView actionMenuView3 = ((s90) actionBarOverlayLayout3.j).a.f;
                                        if (actionMenuView3 != null) {
                                            i1 i1Var2 = actionMenuView3.y;
                                            if (i1Var2 != null) {
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView4 = ((s90) actionBarOverlayLayout4.j).a.f;
                                    if (actionMenuView4 != null) {
                                        i1 i1Var3 = actionMenuView4.y;
                                        if (i1Var3 != null) {
                                        }
                                    }
                                    z = false;
                                }
                                if (z) {
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
                        boolean z3 = y2.m;
                        if (z3 || y2.l) {
                            r(y2, true);
                            z = z3;
                            if (z) {
                            }
                        } else {
                            if (y2.k) {
                                if (y2.o) {
                                    y2.k = false;
                                    z2 = F(y2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    D(y2, keyEvent);
                                    z = true;
                                    if (z) {
                                    }
                                }
                            }
                            z = false;
                            if (z) {
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

    public final void u(int i) {
        m4 y = y(i);
        if (y.h != null) {
            Bundle bundle = new Bundle();
            y.h.t(bundle);
            if (bundle.size() > 0) {
                y.p = bundle;
            }
            y.h.w();
            y.h.clear();
        }
        y.o = true;
        y.n = true;
        if ((i == 108 || i == 0) && this.v != null) {
            m4 y2 = y(0);
            y2.k = false;
            F(y2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.E) {
            return;
        }
        Context context = this.p;
        int[] iArr = z00.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            g9.s("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
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
        this.q.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) from.inflate(com.moontiko.really.admiralcasino.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.moontiko.really.admiralcasino.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) from.inflate(com.moontiko.really.admiralcasino.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.moontiko.really.admiralcasino.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ke(context, typedValue.resourceId) : context).inflate(com.moontiko.really.admiralcasino.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.moontiko.really.admiralcasino.R.id.decor_content_parent);
            this.v = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.q.getCallback());
            if (this.L) {
                this.v.j(109);
            }
            if (this.I) {
                this.v.j(2);
            }
            if (this.J) {
                this.v.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        b4 b4Var = new b4(this, i);
        WeakHashMap weakHashMap = ic0.a;
        ac0.c(viewGroup, b4Var);
        if (this.v == null) {
            this.G = (TextView) viewGroup.findViewById(com.moontiko.really.admiralcasino.R.id.title);
        }
        boolean z = ed0.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.moontiko.really.admiralcasino.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.q.findViewById(R.id.content);
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
        this.q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new b4(this, i2));
        this.F = viewGroup;
        Object obj = this.o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.u;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                xd0 xd0Var = this.s;
                if (xd0Var != null) {
                    s90 s90Var = (s90) xd0Var.e;
                    if (!s90Var.g) {
                        Toolbar toolbar = s90Var.a;
                        s90Var.h = title;
                        if ((s90Var.b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (s90Var.g) {
                                ic0.n(toolbar.getRootView(), title);
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
        View decorView = this.q.getDecorView();
        contentFrameLayout2.l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        m4 y = y(0);
        if (this.V || y.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.q == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.q != null) {
            return;
        }
        g9.s("We have not been given a Window");
    }

    public final k4 x(Context context) {
        if (this.b0 == null) {
            if (k6.l == null) {
                Context applicationContext = context.getApplicationContext();
                k6.l = new k6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.b0 = new i4(this, k6.l);
        }
        return this.b0;
    }

    public final m4 y(int i) {
        m4[] m4VarArr = this.Q;
        if (m4VarArr == null || m4VarArr.length <= i) {
            m4[] m4VarArr2 = new m4[i + 1];
            if (m4VarArr != null) {
                System.arraycopy(m4VarArr, 0, m4VarArr2, 0, m4VarArr.length);
            }
            this.Q = m4VarArr2;
            m4VarArr = m4VarArr2;
        }
        m4 m4Var = m4VarArr[i];
        if (m4Var != null) {
            return m4Var;
        }
        m4 m4Var2 = new m4();
        m4Var2.a = i;
        m4Var2.n = false;
        m4VarArr[i] = m4Var2;
        return m4Var2;
    }

    public final void z() {
        v();
        if (this.K && this.s == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                this.s = new xd0((Activity) obj, this.L);
            } else if (obj instanceof Dialog) {
                this.s = new xd0((Dialog) obj);
            }
            xd0 xd0Var = this.s;
            if (xd0Var != null) {
                xd0Var.d(this.g0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
