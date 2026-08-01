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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v4 extends h4 implements p10, LayoutInflater.Factory2 {
    public static final zd0 m0 = new zd0(0);
    public static final int[] n0 = {R.attr.windowBackground};
    public static final boolean o0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow A;
    public i4 B;
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
    public u4[] Q;
    public u4 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;
    public boolean a0;
    public q4 b0;
    public q4 c0;
    public boolean d0;
    public int e0;
    public boolean g0;
    public Rect h0;
    public Rect i0;
    public r6 j0;
    public OnBackInvokedDispatcher k0;
    public OnBackInvokedCallback l0;
    public final Object o;
    public final Context p;
    public Window q;
    public p4 r;
    public n9 s;
    public eg0 t;
    public CharSequence u;
    public ActionBarOverlayLayout v;
    public j4 w;
    public j4 x;
    public p1 y;
    public ActionBarContextView z;
    public vm0 C = null;
    public final boolean D = true;
    public final i4 f0 = new i4(this, 0);

    public v4(Context context, Window window, x3 x3Var, Object obj) {
        u3 u3Var = null;
        this.X = -100;
        this.p = context;
        this.o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof u3)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        u3Var = (u3) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (u3Var != null) {
                this.X = ((v4) u3Var.k()).X;
            }
        }
        if (this.X == -100) {
            String name = this.o.getClass().getName();
            zd0 zd0Var = m0;
            Integer num = (Integer) zd0Var.get(name);
            if (num != null) {
                this.X = num.intValue();
                zd0Var.remove(this.o.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        a5.d();
    }

    public static vy p(Context context) {
        vy vyVar;
        vy vyVar2;
        if (Build.VERSION.SDK_INT >= 33 || (vyVar = h4.h) == null) {
            return null;
        }
        wy wyVar = vyVar.a;
        vy b = m4.b(context.getApplicationContext().getResources().getConfiguration());
        if (wyVar.a.isEmpty()) {
            vyVar2 = vy.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.a.a.size() + wyVar.a.size()) {
                Locale locale = i < wyVar.a.size() ? wyVar.a.get(i) : b.a.a.get(i - wyVar.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            vyVar2 = new vy(new wy(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return vyVar2.a.a.isEmpty() ? b : vyVar2;
    }

    public static Configuration t(Context context, int i, vy vyVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (vyVar != null) {
            m4.d(configuration2, vyVar);
        }
        return configuration2;
    }

    public final void A() {
        w();
        if (this.K && this.s == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                this.s = new bo0((Activity) obj, this.L);
            } else if (obj instanceof Dialog) {
                this.s = new bo0((Dialog) obj);
            }
            n9 n9Var = this.s;
            if (n9Var != null) {
                n9Var.N(this.g0);
            }
        }
    }

    public final void B(int i) {
        this.e0 = (1 << i) | this.e0;
        if (this.d0) {
            return;
        }
        View decorView = this.q.getDecorView();
        WeakHashMap weakHashMap = hm0.a;
        decorView.postOnAnimation(this.f0);
        this.d0 = true;
    }

    public final int C(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            s9.u("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.c0 == null) {
                            this.c0 = new q4(this, context);
                        }
                        return this.c0.f();
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
        boolean z = this.S;
        this.S = false;
        u4 z2 = z(0);
        if (!z2.m) {
            p1 p1Var = this.y;
            if (p1Var != null) {
                p1Var.a();
                return true;
            }
            A();
            n9 n9Var = this.s;
            if (n9Var == null || !n9Var.g()) {
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
    public final void E(u4 u4Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = u4Var.m;
        int i2 = u4Var.a;
        if (z || this.V) {
            return;
        }
        Context context = this.p;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, u4Var.h)) {
            s(u4Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !G(u4Var, keyEvent)) {
            return;
        }
        t4 t4Var = u4Var.e;
        if (t4Var == null || u4Var.n) {
            if (t4Var == null) {
                A();
                n9 n9Var = this.s;
                Context t = n9Var != null ? n9Var.t() : null;
                if (t != null) {
                    context = t;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.trembin.nirefon.betfury.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.trembin.nirefon.betfury.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.trembin.nirefon.betfury.R.style.Theme_AppCompat_CompactMenu, true);
                }
                cg cgVar = new cg(context, 0);
                cgVar.getTheme().setTo(newTheme);
                u4Var.j = cgVar;
                TypedArray obtainStyledAttributes = cgVar.obtainStyledAttributes(d70.j);
                u4Var.b = obtainStyledAttributes.getResourceId(86, 0);
                u4Var.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                u4Var.e = new t4(this, u4Var.j);
                u4Var.c = 81;
            } else if (u4Var.n && t4Var.getChildCount() > 0) {
                u4Var.e.removeAllViews();
            }
            View view = u4Var.g;
            if (view == null) {
                if (u4Var.h != null) {
                    if (this.x == null) {
                        this.x = new j4(this, 3);
                    }
                    j4 j4Var = this.x;
                    if (u4Var.i == null) {
                        gy gyVar = new gy(u4Var.j);
                        u4Var.i = gyVar;
                        gyVar.j = j4Var;
                        r10 r10Var = u4Var.h;
                        r10Var.b(gyVar, r10Var.a);
                    }
                    gy gyVar2 = u4Var.i;
                    t4 t4Var2 = u4Var.e;
                    if (gyVar2.i == null) {
                        gyVar2.i = (ExpandedMenuView) gyVar2.g.inflate(com.trembin.nirefon.betfury.R.layout.abc_expanded_menu_layout, (ViewGroup) t4Var2, false);
                        if (gyVar2.k == null) {
                            gyVar2.k = new fy(gyVar2);
                        }
                        gyVar2.i.setAdapter((ListAdapter) gyVar2.k);
                        gyVar2.i.setOnItemClickListener(gyVar2);
                    }
                    ExpandedMenuView expandedMenuView = gyVar2.i;
                    u4Var.f = expandedMenuView;
                }
                u4Var.n = true;
                return;
            }
            u4Var.f = view;
            if (u4Var.f != null) {
                if (u4Var.g == null) {
                    gy gyVar3 = u4Var.i;
                    if (gyVar3.k == null) {
                        gyVar3.k = new fy(gyVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = u4Var.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                u4Var.e.setBackgroundResource(u4Var.b);
                ViewParent parent = u4Var.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(u4Var.f);
                }
                u4Var.e.addView(u4Var.f, layoutParams2);
                if (!u4Var.f.hasFocus()) {
                    u4Var.f.requestFocus();
                }
            }
            u4Var.n = true;
            return;
        }
        View view2 = u4Var.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            u4Var.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = u4Var.c;
            layoutParams3.windowAnimations = u4Var.d;
            windowManager.addView(u4Var.e, layoutParams3);
            u4Var.m = true;
            if (i2 != 0) {
                I();
                return;
            }
            return;
        }
        i = -2;
        u4Var.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = u4Var.c;
        layoutParams32.windowAnimations = u4Var.d;
        windowManager.addView(u4Var.e, layoutParams32);
        u4Var.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean F(u4 u4Var, int i, KeyEvent keyEvent) {
        r10 r10Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((u4Var.k || G(u4Var, keyEvent)) && (r10Var = u4Var.h) != null) {
            return r10Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        if (r13.h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(u4 u4Var, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.V) {
            boolean z = u4Var.k;
            int i = u4Var.a;
            if (z) {
                return true;
            }
            u4 u4Var2 = this.R;
            if (u4Var2 != null && u4Var2 != u4Var) {
                s(u4Var2, false);
            }
            Window.Callback callback = this.q.getCallback();
            if (callback != null) {
                u4Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.v) != null) {
                actionBarOverlayLayout4.k();
                ((yi0) actionBarOverlayLayout4.j).l = true;
            }
            if (u4Var.g == null && (!z2 || !(this.s instanceof wi0))) {
                r10 r10Var = u4Var.h;
                if (r10Var == null || u4Var.o) {
                    if (r10Var == null) {
                        Context context = this.p;
                        if ((i == 0 || i == 108) && this.v != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.trembin.nirefon.betfury.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.trembin.nirefon.betfury.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.trembin.nirefon.betfury.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                cg cgVar = new cg(context, 0);
                                cgVar.getTheme().setTo(theme);
                                context = cgVar;
                            }
                        }
                        r10 r10Var2 = new r10(context);
                        r10Var2.e = this;
                        r10 r10Var3 = u4Var.h;
                        if (r10Var2 != r10Var3) {
                            if (r10Var3 != null) {
                                r10Var3.r(u4Var.i);
                            }
                            u4Var.h = r10Var2;
                            gy gyVar = u4Var.i;
                            if (gyVar != null) {
                                r10Var2.b(gyVar, r10Var2.a);
                            }
                        }
                    }
                    if (z2 && (actionBarOverlayLayout2 = this.v) != null) {
                        if (this.w == null) {
                            this.w = new j4(this, 2);
                        }
                        actionBarOverlayLayout2.l(u4Var.h, this.w);
                    }
                    u4Var.h.w();
                    if (callback.onCreatePanelMenu(i, u4Var.h)) {
                        u4Var.o = false;
                    } else {
                        r10 r10Var4 = u4Var.h;
                        if (r10Var4 != null) {
                            if (r10Var4 != null) {
                                r10Var4.r(u4Var.i);
                            }
                            u4Var.h = null;
                        }
                        if (z2 && (actionBarOverlayLayout = this.v) != null) {
                            actionBarOverlayLayout.l(null, this.w);
                        }
                    }
                }
                u4Var.h.w();
                Bundle bundle = u4Var.p;
                if (bundle != null) {
                    u4Var.h.s(bundle);
                    u4Var.p = null;
                }
                if (!callback.onPreparePanel(0, u4Var.g, u4Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.v) != null) {
                        actionBarOverlayLayout3.l(null, this.w);
                    }
                    u4Var.h.v();
                    return false;
                }
                u4Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                u4Var.h.v();
            }
            u4Var.k = true;
            u4Var.l = false;
            this.R = u4Var;
            return true;
        }
        return false;
    }

    public final void H() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.k0 != null && (z(0).m || this.y != null)) {
                z = true;
            }
            if (z && this.l0 == null) {
                this.l0 = o4.b(this.k0, this);
            } else {
                if (z || (onBackInvokedCallback = this.l0) == null) {
                    return;
                }
                o4.c(this.k0, onBackInvokedCallback);
                this.l0 = null;
            }
        }
    }

    @Override // defpackage.h4
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof v4) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.h4
    public final void b() {
        if (this.s != null) {
            A();
            if (this.s.A()) {
                return;
            }
            B(0);
        }
    }

    @Override // defpackage.h4
    public final void d() {
        String str;
        this.T = true;
        m(false, true);
        x();
        Object obj = this.o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = gk0.s(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                n9 n9Var = this.s;
                if (n9Var == null) {
                    this.g0 = true;
                } else {
                    n9Var.N(true);
                }
            }
            synchronized (h4.m) {
                h4.f(this);
                h4.l.add(new WeakReference(this));
            }
        }
        this.W = new Configuration(this.p.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        n9 n9Var;
        q4 q4Var;
        q4 q4Var2;
        if (this.o instanceof Activity) {
            synchronized (h4.m) {
                h4.f(this);
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
                n9Var = this.s;
                if (n9Var != null) {
                    n9Var.F();
                }
                q4Var = this.b0;
                if (q4Var != null) {
                    q4Var.c();
                }
                q4Var2 = this.c0;
                if (q4Var2 == null) {
                    q4Var2.c();
                    return;
                }
                return;
            }
        }
        m0.remove(this.o.getClass().getName());
        n9Var = this.s;
        if (n9Var != null) {
        }
        q4Var = this.b0;
        if (q4Var != null) {
        }
        q4Var2 = this.c0;
        if (q4Var2 == null) {
        }
    }

    @Override // defpackage.p10
    public final boolean g(r10 r10Var, MenuItem menuItem) {
        u4 u4Var;
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.V) {
            r10 k = r10Var.k();
            u4[] u4VarArr = this.Q;
            int length = u4VarArr != null ? u4VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    u4Var = u4VarArr[i];
                    if (u4Var != null && u4Var.h == k) {
                        break;
                    }
                    i++;
                } else {
                    u4Var = null;
                    break;
                }
            }
            if (u4Var != null) {
                return callback.onMenuItemSelected(u4Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.h4
    public final boolean h(int i) {
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
            H();
            this.O = true;
            return true;
        }
        if (i == 2) {
            H();
            this.I = true;
            return true;
        }
        if (i == 5) {
            H();
            this.J = true;
            return true;
        }
        if (i == 10) {
            H();
            this.M = true;
            return true;
        }
        if (i == 108) {
            H();
            this.K = true;
            return true;
        }
        if (i != 109) {
            return this.q.requestFeature(i);
        }
        H();
        this.L = true;
        return true;
    }

    @Override // defpackage.h4
    public final void i(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.p).inflate(i, viewGroup);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.h4
    public final void j(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.h4
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.h4
    public final void l(CharSequence charSequence) {
        this.u = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        n9 n9Var = this.s;
        if (n9Var != null) {
            n9Var.Q(charSequence);
            return;
        }
        TextView textView = this.G;
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
        vy b;
        int i2;
        boolean z3;
        Activity activity;
        if (this.V) {
            return false;
        }
        int i3 = this.X;
        if (i3 == -100) {
            i3 = h4.g;
        }
        Context context = this.p;
        int C = C(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        vy p = i4 < 33 ? p(context) : null;
        if (!z2 && p != null) {
            p = m4.b(context.getResources().getConfiguration());
        }
        Configuration t = t(context, C, p, null, false);
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
                int i6 = t.uiMode & 48;
                vy b2 = m4.b(configuration);
                b = p != null ? null : m4.b(t);
                i2 = i5 == i6 ? 512 : 0;
                if (b != null && !b2.equals(b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.T && ((o0 || this.U) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(t.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new r1(r1, activity));
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
                                m4.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.Y;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.Y, true);
                            }
                            if (r1 != 0 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof lx) {
                                    if (((lx) activity2).e().c.isAtLeast(gx.CREATED)) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.U && !this.V) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b != null) {
                            m4.c(m4.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            y(context).i();
                        } else {
                            q4 q4Var = this.b0;
                            if (q4Var != null) {
                                q4Var.c();
                            }
                        }
                        q4 q4Var2 = this.c0;
                        if (i3 == 3) {
                            if (q4Var2 == null) {
                                this.c0 = new q4(this, context);
                            }
                            this.c0.i();
                        } else if (q4Var2 != null) {
                            q4Var2.c();
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
                q4 q4Var22 = this.c0;
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
        int i62 = t.uiMode & 48;
        vy b22 = m4.b(configuration);
        if (p != null) {
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
        q4 q4Var222 = this.c0;
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
            s9.u("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof p4) {
            s9.u("AppCompat has already installed itself into the Window");
            return;
        }
        p4 p4Var = new p4(this, callback);
        this.r = p4Var;
        window.setCallback(p4Var);
        Context context = this.p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, n0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            a5 a = a5.a();
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
            o4.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.l0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.k0 = o4.a(activity);
                I();
            }
        }
        this.k0 = null;
        I();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // defpackage.p10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(r10 r10Var) {
        ActionMenuView actionMenuView;
        l1 l1Var;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((yi0) actionBarOverlayLayout.j).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x) {
                if (ViewConfiguration.get(this.p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((yi0) actionBarOverlayLayout2.j).a.f;
                    if (actionMenuView2 != null) {
                        l1 l1Var2 = actionMenuView2.y;
                        if (l1Var2 != null) {
                            if (l1Var2.z == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                actionBarOverlayLayout3.k();
                if (((yi0) actionBarOverlayLayout3.j).a.o()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((yi0) actionBarOverlayLayout4.j).a.f;
                    if (actionMenuView3 != null && (l1Var = actionMenuView3.y) != null) {
                        l1Var.d();
                    }
                    if (this.V) {
                        return;
                    }
                    callback.onPanelClosed(108, z(0).h);
                    return;
                }
                if (callback == null || this.V) {
                    return;
                }
                if (this.d0 && (1 & this.e0) != 0) {
                    View decorView = this.q.getDecorView();
                    i4 i4Var = this.f0;
                    decorView.removeCallbacks(i4Var);
                    i4Var.run();
                }
                u4 z = z(0);
                r10 r10Var2 = z.h;
                if (r10Var2 == null || z.o || !callback.onPreparePanel(0, z.g, r10Var2)) {
                    return;
                }
                callback.onMenuOpened(108, z.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.v;
                actionBarOverlayLayout5.k();
                ((yi0) actionBarOverlayLayout5.j).a.u();
                return;
            }
        }
        u4 z2 = z(0);
        z2.n = true;
        s(z2, false);
        E(z2, null);
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
        View k5Var;
        View view2 = null;
        if (this.j0 == null) {
            int[] iArr = d70.j;
            Context context2 = this.p;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.j0 = new r6();
            } else {
                try {
                    this.j0 = (r6) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.j0 = new r6();
                }
            }
        }
        r6 r6Var = this.j0;
        int i = kl0.a;
        r6Var.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d70.y, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context cgVar = (resourceId == 0 || ((context instanceof cg) && ((cg) context).a == resourceId)) ? context : new cg(context, resourceId);
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
                k5Var = new k5(cgVar, attributeSet);
                break;
            case 1:
                k5Var = new z3(cgVar, attributeSet);
                break;
            case 2:
                k5Var = new g5(cgVar, attributeSet);
                break;
            case 3:
                k5Var = r6Var.e(cgVar, attributeSet);
                break;
            case 4:
                k5Var = new e5(cgVar, attributeSet, com.trembin.nirefon.betfury.R.attr.imageButtonStyle);
                break;
            case 5:
                k5Var = new m5(cgVar, attributeSet);
                break;
            case 6:
                k5Var = new y5(cgVar, attributeSet);
                break;
            case 7:
                k5Var = r6Var.d(cgVar, attributeSet);
                break;
            case '\b':
                k5Var = new p6(cgVar, attributeSet);
                break;
            case '\t':
                k5Var = new f5(cgVar, attributeSet, 0);
                break;
            case '\n':
                k5Var = r6Var.a(cgVar, attributeSet);
                break;
            case 11:
                k5Var = r6Var.c(cgVar, attributeSet);
                break;
            case '\f':
                k5Var = new c5(cgVar, attributeSet);
                break;
            case '\r':
                k5Var = r6Var.b(cgVar, attributeSet);
                break;
            default:
                k5Var = null;
                break;
        }
        if (k5Var == null && context != cgVar) {
            Object[] objArr = r6Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cgVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = r6.g;
                        if (i2 < 3) {
                            View f = r6Var.f(cgVar, str, strArr[i2]);
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
                    View f2 = r6Var.f(cgVar, str, null);
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
            k5Var = view2;
        }
        if (k5Var != null) {
            Context context3 = k5Var.getContext();
            if ((context3 instanceof ContextWrapper) && k5Var.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, r6.c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    k5Var.setOnClickListener(new q6(k5Var, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = cgVar.obtainStyledAttributes(attributeSet, r6.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = hm0.a;
                    new vl0(com.trembin.nirefon.betfury.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(k5Var, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = cgVar.obtainStyledAttributes(attributeSet, r6.e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    hm0.n(k5Var, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = cgVar.obtainStyledAttributes(attributeSet, r6.f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = hm0.a;
                    new vl0(com.trembin.nirefon.betfury.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(k5Var, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return k5Var;
    }

    public final void q(int i, u4 u4Var, r10 r10Var) {
        if (r10Var == null) {
            if (u4Var == null && i >= 0) {
                u4[] u4VarArr = this.Q;
                if (i < u4VarArr.length) {
                    u4Var = u4VarArr[i];
                }
            }
            if (u4Var != null) {
                r10Var = u4Var.h;
            }
        }
        if ((u4Var == null || u4Var.m) && !this.V) {
            p4 p4Var = this.r;
            Window.Callback callback = this.q.getCallback();
            p4Var.getClass();
            try {
                p4Var.j = true;
                callback.onPanelClosed(i, r10Var);
            } finally {
                p4Var.j = false;
            }
        }
    }

    public final void r(r10 r10Var) {
        l1 l1Var;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((yi0) actionBarOverlayLayout.j).a.f;
        if (actionMenuView != null && (l1Var = actionMenuView.y) != null) {
            l1Var.d();
            h1 h1Var = l1Var.y;
            if (h1Var != null && h1Var.b()) {
                h1Var.j.dismiss();
            }
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, r10Var);
        }
        this.P = false;
    }

    public final void s(u4 u4Var, boolean z) {
        t4 t4Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && u4Var.a == 0 && (actionBarOverlayLayout = this.v) != null) {
            actionBarOverlayLayout.k();
            if (((yi0) actionBarOverlayLayout.j).a.o()) {
                r(u4Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.p.getSystemService("window");
        if (windowManager != null && u4Var.m && (t4Var = u4Var.e) != null) {
            windowManager.removeView(t4Var);
            if (z) {
                q(u4Var.a, u4Var, null);
            }
        }
        u4Var.k = false;
        u4Var.l = false;
        u4Var.m = false;
        u4Var.f = null;
        u4Var.n = true;
        if (this.R == u4Var) {
            this.R = null;
        }
        if (u4Var.a == 0) {
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
        if ((!(obj instanceof sw) && !(obj instanceof x4)) || (decorView = this.q.getDecorView()) == null || !gk0.n(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                p4 p4Var = this.r;
                Window.Callback callback = this.q.getCallback();
                p4Var.getClass();
                try {
                    p4Var.i = true;
                } finally {
                    p4Var.i = false;
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
                        u4 z3 = z(0);
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
                        u4 z4 = z(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
                        Context context = this.p;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((yi0) actionBarOverlayLayout.j).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                                actionBarOverlayLayout2.k();
                                if (((yi0) actionBarOverlayLayout2.j).a.o()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                                    actionBarOverlayLayout3.k();
                                    ActionMenuView actionMenuView2 = ((yi0) actionBarOverlayLayout3.j).a.f;
                                    if (actionMenuView2 != null) {
                                        l1 l1Var = actionMenuView2.y;
                                        if (l1Var != null) {
                                        }
                                    }
                                } else if (!this.V && G(z4, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                                    actionBarOverlayLayout4.k();
                                    z = ((yi0) actionBarOverlayLayout4.j).a.u();
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
        u4 z = z(i);
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
            u4 z2 = z(0);
            z2.k = false;
            G(z2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.E) {
            return;
        }
        Context context = this.p;
        int[] iArr = d70.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            s9.u("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (obtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.N = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        x();
        this.q.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) from.inflate(com.trembin.nirefon.betfury.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.trembin.nirefon.betfury.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) from.inflate(com.trembin.nirefon.betfury.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.trembin.nirefon.betfury.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new cg(context, typedValue.resourceId) : context).inflate(com.trembin.nirefon.betfury.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.trembin.nirefon.betfury.R.id.decor_content_parent);
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
        j4 j4Var = new j4(this, i);
        WeakHashMap weakHashMap = hm0.a;
        zl0.c(viewGroup, j4Var);
        if (this.v == null) {
            this.G = (TextView) viewGroup.findViewById(com.trembin.nirefon.betfury.R.id.title);
        }
        boolean z = dn0.a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.trembin.nirefon.betfury.R.id.action_bar_activity_content);
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
        contentFrameLayout.setAttachListener(new j4(this, i2));
        this.F = viewGroup;
        Object obj = this.o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.u;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                n9 n9Var = this.s;
                if (n9Var != null) {
                    n9Var.Q(title);
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
        u4 z2 = z(0);
        if (this.V || z2.h != null) {
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
        s9.u("We have not been given a Window");
    }

    public final s4 y(Context context) {
        if (this.b0 == null) {
            if (s6.g == null) {
                Context applicationContext = context.getApplicationContext();
                s6.g = new s6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.b0 = new q4(this, s6.g);
        }
        return this.b0;
    }

    public final u4 z(int i) {
        u4[] u4VarArr = this.Q;
        if (u4VarArr == null || u4VarArr.length <= i) {
            u4[] u4VarArr2 = new u4[i + 1];
            if (u4VarArr != null) {
                System.arraycopy(u4VarArr, 0, u4VarArr2, 0, u4VarArr.length);
            }
            this.Q = u4VarArr2;
            u4VarArr = u4VarArr2;
        }
        u4 u4Var = u4VarArr[i];
        if (u4Var != null) {
            return u4Var;
        }
        u4 u4Var2 = new u4();
        u4Var2.a = i;
        u4Var2.n = false;
        u4VarArr[i] = u4Var2;
        return u4Var2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
