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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class d4 extends p3 implements kt, LayoutInflater.Factory2 {
    public static final u20 l0 = new u20(0);
    public static final int[] m0 = {R.attr.windowBackground};
    public static final boolean n0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow A;
    public q3 B;
    public boolean D;
    public ViewGroup E;
    public TextView F;
    public View G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public c4[] P;
    public c4 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Configuration V;
    public final int W;
    public int X;
    public int Y;
    public boolean Z;
    public y3 a0;
    public y3 b0;
    public boolean c0;
    public int d0;
    public boolean f0;
    public Rect g0;
    public Rect h0;
    public z5 i0;
    public OnBackInvokedDispatcher j0;
    public OnBackInvokedCallback k0;
    public final Object o;
    public final Context p;
    public Window q;
    public x3 r;
    public o8 s;
    public t40 t;
    public CharSequence u;
    public ActionBarOverlayLayout v;
    public r3 w;
    public r3 x;
    public l1 y;
    public ActionBarContextView z;
    public l90 C = null;
    public final q3 e0 = new q3(this, 0);

    public d4(Context context, Window window, f3 f3Var, Object obj) {
        c3 c3Var = null;
        this.W = -100;
        this.p = context;
        this.o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof c3)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        c3Var = (c3) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (c3Var != null) {
                this.W = ((d4) c3Var.j()).W;
            }
        }
        if (this.W == -100) {
            String name = this.o.getClass().getName();
            u20 u20Var = l0;
            Integer num = (Integer) u20Var.get(name);
            if (num != null) {
                this.W = num.intValue();
                u20Var.remove(this.o.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        h4.d();
    }

    public static er o(Context context) {
        er erVar;
        er erVar2;
        if (Build.VERSION.SDK_INT >= 33 || (erVar = p3.h) == null) {
            return null;
        }
        fr frVar = erVar.a;
        er b = u3.b(context.getApplicationContext().getResources().getConfiguration());
        if (frVar.a.isEmpty()) {
            erVar2 = er.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.a.a.size() + frVar.a.size()) {
                Locale locale = i < frVar.a.size() ? frVar.a.get(i) : b.a.a.get(i - frVar.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            erVar2 = new er(new fr(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return erVar2.a.a.isEmpty() ? b : erVar2;
    }

    public static Configuration t(Context context, int i, er erVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (erVar != null) {
            u3.d(configuration2, erVar);
        }
        return configuration2;
    }

    public final void A() {
        w();
        if (this.J && this.s == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                this.s = new qa0((Activity) obj, this.K);
            } else if (obj instanceof Dialog) {
                this.s = new qa0((Dialog) obj);
            }
            o8 o8Var = this.s;
            if (o8Var != null) {
                o8Var.l0(this.f0);
            }
        }
    }

    public final void B(int i) {
        this.d0 = (1 << i) | this.d0;
        if (this.c0) {
            return;
        }
        View decorView = this.q.getDecorView();
        WeakHashMap weakHashMap = x80.a;
        decorView.postOnAnimation(this.e0);
        this.c0 = true;
    }

    public final int C(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            t8.t("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.b0 == null) {
                            this.b0 = new y3(this, context);
                        }
                        return this.b0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean D() {
        boolean z = this.R;
        this.R = false;
        c4 z2 = z(0);
        if (!z2.m) {
            l1 l1Var = this.y;
            if (l1Var != null) {
                l1Var.a();
                return true;
            }
            A();
            o8 o8Var = this.s;
            if (o8Var == null || !o8Var.o()) {
                return false;
            }
        } else if (!z) {
            s(z2, true);
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
    public final void E(c4 c4Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c4Var.m;
        int i2 = c4Var.a;
        if (z || this.U) {
            return;
        }
        Context context = this.p;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c4Var.h)) {
            s(c4Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !G(c4Var, keyEvent)) {
            return;
        }
        b4 b4Var = c4Var.e;
        if (b4Var == null || c4Var.n) {
            if (b4Var == null) {
                A();
                o8 o8Var = this.s;
                Context J = o8Var != null ? o8Var.J() : null;
                if (J != null) {
                    context = J;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.derinko.gbini.n1casino.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.derinko.gbini.n1casino.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.derinko.gbini.n1casino.R.style.Theme_AppCompat_CompactMenu, true);
                }
                kd kdVar = new kd(context, 0);
                kdVar.getTheme().setTo(newTheme);
                c4Var.j = kdVar;
                TypedArray obtainStyledAttributes = kdVar.obtainStyledAttributes(wx.j);
                c4Var.b = obtainStyledAttributes.getResourceId(86, 0);
                c4Var.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                c4Var.e = new b4(this, c4Var.j);
                c4Var.c = 81;
            } else if (c4Var.n && b4Var.getChildCount() > 0) {
                c4Var.e.removeAllViews();
            }
            View view = c4Var.g;
            if (view == null) {
                if (c4Var.h != null) {
                    if (this.x == null) {
                        this.x = new r3(this, 3);
                    }
                    r3 r3Var = this.x;
                    if (c4Var.i == null) {
                        rq rqVar = new rq(c4Var.j);
                        c4Var.i = rqVar;
                        rqVar.j = r3Var;
                        mt mtVar = c4Var.h;
                        mtVar.b(rqVar, mtVar.a);
                    }
                    rq rqVar2 = c4Var.i;
                    b4 b4Var2 = c4Var.e;
                    if (rqVar2.i == null) {
                        rqVar2.i = (ExpandedMenuView) rqVar2.g.inflate(com.derinko.gbini.n1casino.R.layout.abc_expanded_menu_layout, (ViewGroup) b4Var2, false);
                        if (rqVar2.k == null) {
                            rqVar2.k = new qq(rqVar2);
                        }
                        rqVar2.i.setAdapter((ListAdapter) rqVar2.k);
                        rqVar2.i.setOnItemClickListener(rqVar2);
                    }
                    ExpandedMenuView expandedMenuView = rqVar2.i;
                    c4Var.f = expandedMenuView;
                }
                c4Var.n = true;
                return;
            }
            c4Var.f = view;
            if (c4Var.f != null) {
                if (c4Var.g == null) {
                    rq rqVar3 = c4Var.i;
                    if (rqVar3.k == null) {
                        rqVar3.k = new qq(rqVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = c4Var.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c4Var.e.setBackgroundResource(c4Var.b);
                ViewParent parent = c4Var.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c4Var.f);
                }
                c4Var.e.addView(c4Var.f, layoutParams2);
                if (!c4Var.f.hasFocus()) {
                    c4Var.f.requestFocus();
                }
            }
            c4Var.n = true;
            return;
        }
        View view2 = c4Var.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            c4Var.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = c4Var.c;
            layoutParams3.windowAnimations = c4Var.d;
            windowManager.addView(c4Var.e, layoutParams3);
            c4Var.m = true;
            if (i2 != 0) {
                I();
                return;
            }
            return;
        }
        i = -2;
        c4Var.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = c4Var.c;
        layoutParams32.windowAnimations = c4Var.d;
        windowManager.addView(c4Var.e, layoutParams32);
        c4Var.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean F(c4 c4Var, int i, KeyEvent keyEvent) {
        mt mtVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c4Var.k || G(c4Var, keyEvent)) && (mtVar = c4Var.h) != null) {
            return mtVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        if (r13.h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(c4 c4Var, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.U) {
            boolean z = c4Var.k;
            int i = c4Var.a;
            if (z) {
                return true;
            }
            c4 c4Var2 = this.Q;
            if (c4Var2 != null && c4Var2 != c4Var) {
                s(c4Var2, false);
            }
            Window.Callback callback = this.q.getCallback();
            if (callback != null) {
                c4Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.v) != null) {
                actionBarOverlayLayout4.k();
                ((k60) actionBarOverlayLayout4.j).l = true;
            }
            if (c4Var.g == null && (!z2 || !(this.s instanceof i60))) {
                mt mtVar = c4Var.h;
                if (mtVar == null || c4Var.o) {
                    if (mtVar == null) {
                        Context context = this.p;
                        if ((i == 0 || i == 108) && this.v != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.derinko.gbini.n1casino.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.derinko.gbini.n1casino.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.derinko.gbini.n1casino.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                kd kdVar = new kd(context, 0);
                                kdVar.getTheme().setTo(theme);
                                context = kdVar;
                            }
                        }
                        mt mtVar2 = new mt(context);
                        mtVar2.e = this;
                        mt mtVar3 = c4Var.h;
                        if (mtVar2 != mtVar3) {
                            if (mtVar3 != null) {
                                mtVar3.r(c4Var.i);
                            }
                            c4Var.h = mtVar2;
                            rq rqVar = c4Var.i;
                            if (rqVar != null) {
                                mtVar2.b(rqVar, mtVar2.a);
                            }
                        }
                    }
                    if (z2 && (actionBarOverlayLayout2 = this.v) != null) {
                        if (this.w == null) {
                            this.w = new r3(this, 2);
                        }
                        actionBarOverlayLayout2.l(c4Var.h, this.w);
                    }
                    c4Var.h.w();
                    if (callback.onCreatePanelMenu(i, c4Var.h)) {
                        c4Var.o = false;
                    } else {
                        mt mtVar4 = c4Var.h;
                        if (mtVar4 != null) {
                            if (mtVar4 != null) {
                                mtVar4.r(c4Var.i);
                            }
                            c4Var.h = null;
                        }
                        if (z2 && (actionBarOverlayLayout = this.v) != null) {
                            actionBarOverlayLayout.l(null, this.w);
                        }
                    }
                }
                c4Var.h.w();
                Bundle bundle = c4Var.p;
                if (bundle != null) {
                    c4Var.h.s(bundle);
                    c4Var.p = null;
                }
                if (!callback.onPreparePanel(0, c4Var.g, c4Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.v) != null) {
                        actionBarOverlayLayout3.l(null, this.w);
                    }
                    c4Var.h.v();
                    return false;
                }
                c4Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c4Var.h.v();
            }
            c4Var.k = true;
            c4Var.l = false;
            this.Q = c4Var;
            return true;
        }
        return false;
    }

    public final void H() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.j0 != null && (z(0).m || this.y != null)) {
                z = true;
            }
            if (z && this.k0 == null) {
                this.k0 = w3.b(this.j0, this);
            } else {
                if (z || (onBackInvokedCallback = this.k0) == null) {
                    return;
                }
                w3.c(this.j0, onBackInvokedCallback);
                this.k0 = null;
            }
        }
    }

    @Override // defpackage.p3
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof d4) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.p3
    public final void b() {
        if (this.s != null) {
            A();
            if (this.s.M()) {
                return;
            }
            B(0);
        }
    }

    @Override // defpackage.p3
    public final void d() {
        String str;
        this.S = true;
        m(false, true);
        x();
        Object obj = this.o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = zo.v(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                o8 o8Var = this.s;
                if (o8Var == null) {
                    this.f0 = true;
                } else {
                    o8Var.l0(true);
                }
            }
            synchronized (p3.m) {
                p3.f(this);
                p3.l.add(new WeakReference(this));
            }
        }
        this.V = new Configuration(this.p.getResources().getConfiguration());
        this.T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.p3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        o8 o8Var;
        y3 y3Var;
        y3 y3Var2;
        if (this.o instanceof Activity) {
            synchronized (p3.m) {
                p3.f(this);
            }
        }
        if (this.c0) {
            this.q.getDecorView().removeCallbacks(this.e0);
        }
        this.U = true;
        if (this.W != -100) {
            Object obj = this.o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                l0.put(this.o.getClass().getName(), Integer.valueOf(this.W));
                o8Var = this.s;
                if (o8Var != null) {
                    o8Var.Z();
                }
                y3Var = this.a0;
                if (y3Var != null) {
                    y3Var.c();
                }
                y3Var2 = this.b0;
                if (y3Var2 == null) {
                    y3Var2.c();
                    return;
                }
                return;
            }
        }
        l0.remove(this.o.getClass().getName());
        o8Var = this.s;
        if (o8Var != null) {
        }
        y3Var = this.a0;
        if (y3Var != null) {
        }
        y3Var2 = this.b0;
        if (y3Var2 == null) {
        }
    }

    @Override // defpackage.p3
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.N && i == 108) {
            return false;
        }
        if (this.J && i == 1) {
            this.J = false;
        }
        if (i == 1) {
            H();
            this.N = true;
            return true;
        }
        if (i == 2) {
            H();
            this.H = true;
            return true;
        }
        if (i == 5) {
            H();
            this.I = true;
            return true;
        }
        if (i == 10) {
            H();
            this.L = true;
            return true;
        }
        if (i == 108) {
            H();
            this.J = true;
            return true;
        }
        if (i != 109) {
            return this.q.requestFeature(i);
        }
        H();
        this.K = true;
        return true;
    }

    @Override // defpackage.p3
    public final void h(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.p).inflate(i, viewGroup);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.kt
    public final boolean i(mt mtVar, MenuItem menuItem) {
        c4 c4Var;
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.U) {
            mt k = mtVar.k();
            c4[] c4VarArr = this.P;
            int length = c4VarArr != null ? c4VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c4Var = c4VarArr[i];
                    if (c4Var != null && c4Var.h == k) {
                        break;
                    }
                    i++;
                } else {
                    c4Var = null;
                    break;
                }
            }
            if (c4Var != null) {
                return callback.onMenuItemSelected(c4Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.p3
    public final void j(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.p3
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.p3
    public final void l(CharSequence charSequence) {
        this.u = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        o8 o8Var = this.s;
        if (o8Var != null) {
            o8Var.p0(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
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
    public final boolean m(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        er b;
        int i2;
        boolean z3;
        Activity activity;
        if (this.U) {
            return false;
        }
        int i3 = this.W;
        if (i3 == -100) {
            i3 = p3.g;
        }
        Context context = this.p;
        int C = C(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        er o = i4 < 33 ? o(context) : null;
        if (!z2 && o != null) {
            o = u3.b(context.getResources().getConfiguration());
        }
        Configuration t = t(context, C, o, null, false);
        boolean z4 = this.Z;
        boolean z5 = true;
        Object obj = this.o;
        if (!z4 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.V;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = t.uiMode & 48;
                er b2 = u3.b(configuration);
                b = o != null ? null : u3.b(t);
                i2 = i5 == i6 ? 512 : 0;
                if (b != null && !b2.equals(b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.S && ((n0 || this.T) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(t.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new m1(r1, activity));
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
                                u3.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.X;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.X, true);
                            }
                            if (r1 != 0 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof aq) {
                                    if (((aq) activity2).e().c.compareTo(vp.h) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.T && !this.U) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b != null) {
                            u3.c(u3.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            y(context).i();
                        } else {
                            y3 y3Var = this.a0;
                            if (y3Var != null) {
                                y3Var.c();
                            }
                        }
                        y3 y3Var2 = this.b0;
                        if (i3 == 3) {
                            if (y3Var2 == null) {
                                this.b0 = new y3(this, context);
                            }
                            this.b0.i();
                        } else if (y3Var2 != null) {
                            y3Var2.c();
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
                y3 y3Var22 = this.b0;
                if (i3 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.Y = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.Y = 0;
            }
        }
        this.Z = true;
        i = this.Y;
        configuration = this.V;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = t.uiMode & 48;
        er b22 = u3.b(configuration);
        if (o != null) {
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
        y3 y3Var222 = this.b0;
        if (i3 == 3) {
        }
        return z5;
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.q != null) {
            t8.t("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x3) {
            t8.t("AppCompat has already installed itself into the Window");
            return;
        }
        x3 x3Var = new x3(this, callback);
        this.r = x3Var;
        window.setCallback(x3Var);
        Context context = this.p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, m0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            h4 a = h4.a();
            synchronized (a) {
                drawable = a.a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.j0) != null) {
            return;
        }
        Object obj = this.o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.k0) != null) {
            w3.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.k0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.j0 = w3.a(activity);
                I();
            }
        }
        this.j0 = null;
        I();
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
        View s4Var;
        View view2 = null;
        if (this.i0 == null) {
            int[] iArr = wx.j;
            Context context2 = this.p;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.i0 = new z5();
            } else {
                try {
                    this.i0 = (z5) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.i0 = new z5();
                }
            }
        }
        z5 z5Var = this.i0;
        int i = c80.a;
        z5Var.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, wx.y, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context kdVar = (resourceId == 0 || ((context instanceof kd) && ((kd) context).a == resourceId)) ? context : new kd(context, resourceId);
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
                s4Var = new s4(kdVar, attributeSet);
                break;
            case 1:
                s4Var = new h3(kdVar, attributeSet);
                break;
            case 2:
                s4Var = new o4(kdVar, attributeSet);
                break;
            case 3:
                s4Var = z5Var.e(kdVar, attributeSet);
                break;
            case 4:
                s4Var = new l4(kdVar, attributeSet, com.derinko.gbini.n1casino.R.attr.imageButtonStyle);
                break;
            case 5:
                s4Var = new u4(kdVar, attributeSet);
                break;
            case 6:
                s4Var = new g5(kdVar, attributeSet);
                break;
            case 7:
                s4Var = z5Var.d(kdVar, attributeSet);
                break;
            case '\b':
                s4Var = new x5(kdVar, attributeSet);
                break;
            case '\t':
                s4Var = new n4(kdVar, attributeSet, 0);
                break;
            case '\n':
                s4Var = z5Var.a(kdVar, attributeSet);
                break;
            case 11:
                s4Var = z5Var.c(kdVar, attributeSet);
                break;
            case '\f':
                s4Var = new j4(kdVar, attributeSet);
                break;
            case '\r':
                s4Var = z5Var.b(kdVar, attributeSet);
                break;
            default:
                s4Var = null;
                break;
        }
        if (s4Var == null && context != kdVar) {
            Object[] objArr = z5Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = kdVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = z5.g;
                        if (i2 < 3) {
                            View f = z5Var.f(kdVar, str, strArr[i2]);
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
                    View f2 = z5Var.f(kdVar, str, null);
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
            s4Var = view2;
        }
        if (s4Var != null) {
            Context context3 = s4Var.getContext();
            if ((context3 instanceof ContextWrapper) && s4Var.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, z5.c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    s4Var.setOnClickListener(new y5(s4Var, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = kdVar.obtainStyledAttributes(attributeSet, z5.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = x80.a;
                    new l80(com.derinko.gbini.n1casino.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(s4Var, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = kdVar.obtainStyledAttributes(attributeSet, z5.e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    x80.n(s4Var, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = kdVar.obtainStyledAttributes(attributeSet, z5.f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = x80.a;
                    new l80(com.derinko.gbini.n1casino.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).d(s4Var, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return s4Var;
    }

    public final void p(int i, c4 c4Var, mt mtVar) {
        if (mtVar == null) {
            if (c4Var == null && i >= 0) {
                c4[] c4VarArr = this.P;
                if (i < c4VarArr.length) {
                    c4Var = c4VarArr[i];
                }
            }
            if (c4Var != null) {
                mtVar = c4Var.h;
            }
        }
        if ((c4Var == null || c4Var.m) && !this.U) {
            x3 x3Var = this.r;
            Window.Callback callback = this.q.getCallback();
            x3Var.getClass();
            try {
                x3Var.j = true;
                callback.onPanelClosed(i, mtVar);
            } finally {
                x3Var.j = false;
            }
        }
    }

    public final void q(mt mtVar) {
        h1 h1Var;
        if (this.O) {
            return;
        }
        this.O = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((k60) actionBarOverlayLayout.j).a.f;
        if (actionMenuView != null && (h1Var = actionMenuView.y) != null) {
            h1Var.d();
            d1 d1Var = h1Var.y;
            if (d1Var != null && d1Var.b()) {
                d1Var.j.dismiss();
            }
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.U) {
            callback.onPanelClosed(108, mtVar);
        }
        this.O = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.kt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(mt mtVar) {
        ActionMenuView actionMenuView;
        h1 h1Var;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((k60) actionBarOverlayLayout.j).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x) {
                if (ViewConfiguration.get(this.p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((k60) actionBarOverlayLayout2.j).a.f;
                    if (actionMenuView2 != null) {
                        h1 h1Var2 = actionMenuView2.y;
                        if (h1Var2 != null) {
                            if (h1Var2.z == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                actionBarOverlayLayout3.k();
                if (((k60) actionBarOverlayLayout3.j).a.o()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((k60) actionBarOverlayLayout4.j).a.f;
                    if (actionMenuView3 != null && (h1Var = actionMenuView3.y) != null) {
                        h1Var.d();
                    }
                    if (this.U) {
                        return;
                    }
                    callback.onPanelClosed(108, z(0).h);
                    return;
                }
                if (callback == null || this.U) {
                    return;
                }
                if (this.c0 && (1 & this.d0) != 0) {
                    View decorView = this.q.getDecorView();
                    q3 q3Var = this.e0;
                    decorView.removeCallbacks(q3Var);
                    q3Var.run();
                }
                c4 z = z(0);
                mt mtVar2 = z.h;
                if (mtVar2 == null || z.o || !callback.onPreparePanel(0, z.g, mtVar2)) {
                    return;
                }
                callback.onMenuOpened(108, z.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.v;
                actionBarOverlayLayout5.k();
                ((k60) actionBarOverlayLayout5.j).a.u();
                return;
            }
        }
        c4 z2 = z(0);
        z2.n = true;
        s(z2, false);
        E(z2, null);
    }

    public final void s(c4 c4Var, boolean z) {
        b4 b4Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && c4Var.a == 0 && (actionBarOverlayLayout = this.v) != null) {
            actionBarOverlayLayout.k();
            if (((k60) actionBarOverlayLayout.j).a.o()) {
                q(c4Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.p.getSystemService("window");
        if (windowManager != null && c4Var.m && (b4Var = c4Var.e) != null) {
            windowManager.removeView(b4Var);
            if (z) {
                p(c4Var.a, c4Var, null);
            }
        }
        c4Var.k = false;
        c4Var.l = false;
        c4Var.m = false;
        c4Var.f = null;
        c4Var.n = true;
        if (this.Q == c4Var) {
            this.Q = null;
        }
        if (c4Var.a == 0) {
            I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e8, code lost:
    
        if (r6.d() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        Object obj = this.o;
        if ((!(obj instanceof mp) && !(obj instanceof f4)) || (decorView = this.q.getDecorView()) == null || !zo.n(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                x3 x3Var = this.r;
                Window.Callback callback = this.q.getCallback();
                x3Var.getClass();
                try {
                    x3Var.i = true;
                } finally {
                    x3Var.i = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.R = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        c4 z3 = z(0);
                        if (!z3.m) {
                            G(z3, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.y == null) {
                        c4 z4 = z(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
                        Context context = this.p;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((k60) actionBarOverlayLayout.j).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                                actionBarOverlayLayout2.k();
                                if (((k60) actionBarOverlayLayout2.j).a.o()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                                    actionBarOverlayLayout3.k();
                                    ActionMenuView actionMenuView2 = ((k60) actionBarOverlayLayout3.j).a.f;
                                    if (actionMenuView2 != null) {
                                        h1 h1Var = actionMenuView2.y;
                                        if (h1Var != null) {
                                        }
                                    }
                                } else if (!this.U && G(z4, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                                    actionBarOverlayLayout4.k();
                                    z = ((k60) actionBarOverlayLayout4.j).a.u();
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
                                z = false;
                                if (z) {
                                }
                            }
                        }
                        boolean z5 = z4.m;
                        if (z5 || z4.l) {
                            s(z4, true);
                            z = z5;
                            if (z) {
                            }
                        } else {
                            if (z4.k) {
                                if (z4.o) {
                                    z4.k = false;
                                    z2 = G(z4, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    E(z4, keyEvent);
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
            if (!D()) {
                return false;
            }
        }
        return true;
    }

    public final void v(int i) {
        c4 z = z(i);
        if (z.h != null) {
            Bundle bundle = new Bundle();
            z.h.t(bundle);
            if (bundle.size() > 0) {
                z.p = bundle;
            }
            z.h.w();
            z.h.clear();
        }
        z.o = true;
        z.n = true;
        if ((i == 108 || i == 0) && this.v != null) {
            c4 z2 = z(0);
            z2.k = false;
            G(z2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.D) {
            return;
        }
        Context context = this.p;
        int[] iArr = wx.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            t8.t("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
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
        this.M = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        x();
        this.q.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.N) {
            viewGroup = this.L ? (ViewGroup) from.inflate(com.derinko.gbini.n1casino.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.derinko.gbini.n1casino.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.M) {
            viewGroup = (ViewGroup) from.inflate(com.derinko.gbini.n1casino.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.K = false;
            this.J = false;
        } else if (this.J) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.derinko.gbini.n1casino.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new kd(context, typedValue.resourceId) : context).inflate(com.derinko.gbini.n1casino.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.derinko.gbini.n1casino.R.id.decor_content_parent);
            this.v = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.q.getCallback());
            if (this.K) {
                this.v.j(109);
            }
            if (this.H) {
                this.v.j(2);
            }
            if (this.I) {
                this.v.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.J + ", windowActionBarOverlay: " + this.K + ", android:windowIsFloating: " + this.M + ", windowActionModeOverlay: " + this.L + ", windowNoTitle: " + this.N + " }");
        }
        r3 r3Var = new r3(this, i);
        WeakHashMap weakHashMap = x80.a;
        p80.c(viewGroup, r3Var);
        if (this.v == null) {
            this.F = (TextView) viewGroup.findViewById(com.derinko.gbini.n1casino.R.id.title);
        }
        boolean z = v90.a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.derinko.gbini.n1casino.R.id.action_bar_activity_content);
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
        contentFrameLayout.setAttachListener(new r3(this, i2));
        this.E = viewGroup;
        Object obj = this.o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.u;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                o8 o8Var = this.s;
                if (o8Var != null) {
                    o8Var.p0(title);
                } else {
                    TextView textView = this.F;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.E.findViewById(R.id.content);
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
        this.D = true;
        c4 z2 = z(0);
        if (this.U || z2.h != null) {
            return;
        }
        B(108);
    }

    public final void x() {
        if (this.q == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.q != null) {
            return;
        }
        t8.t("We have not been given a Window");
    }

    public final a4 y(Context context) {
        if (this.a0 == null) {
            if (a6.g == null) {
                Context applicationContext = context.getApplicationContext();
                a6.g = new a6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.a0 = new y3(this, a6.g);
        }
        return this.a0;
    }

    public final c4 z(int i) {
        c4[] c4VarArr = this.P;
        if (c4VarArr == null || c4VarArr.length <= i) {
            c4[] c4VarArr2 = new c4[i + 1];
            if (c4VarArr != null) {
                System.arraycopy(c4VarArr, 0, c4VarArr2, 0, c4VarArr.length);
            }
            this.P = c4VarArr2;
            c4VarArr = c4VarArr2;
        }
        c4 c4Var = c4VarArr[i];
        if (c4Var != null) {
            return c4Var;
        }
        c4 c4Var2 = new c4();
        c4Var2.a = i;
        c4Var2.n = false;
        c4VarArr[i] = c4Var2;
        return c4Var2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
