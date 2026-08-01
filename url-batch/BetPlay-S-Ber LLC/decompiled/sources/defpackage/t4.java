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
import androidx.lifecycle.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class t4 extends f4 implements yt, LayoutInflater.Factory2 {
    public static final h30 n0 = new h30(0);
    public static final int[] o0 = {R.attr.windowBackground};
    public static final boolean p0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView A;
    public PopupWindow B;
    public g4 C;
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
    public s4[] R;
    public s4 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public Configuration X;
    public final int Y;
    public int Z;
    public int a0;
    public boolean b0;
    public o4 c0;
    public o4 d0;
    public boolean e0;
    public int f0;
    public boolean h0;
    public Rect i0;
    public Rect j0;
    public q6 k0;
    public OnBackInvokedDispatcher l0;
    public OnBackInvokedCallback m0;
    public final Object o;
    public final Context p;
    public Window q;
    public n4 r;
    public final v3 s;
    public xa0 t;
    public a50 u;
    public CharSequence v;
    public ActionBarOverlayLayout w;
    public h4 x;
    public h4 y;
    public p1 z;
    public t90 D = null;
    public final boolean E = true;
    public final g4 g0 = new g4(this, 0);

    public t4(Context context, Window window, v3 v3Var, Object obj) {
        r3 r3Var = null;
        this.Y = -100;
        this.p = context;
        this.s = v3Var;
        this.o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof r3)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        r3Var = (r3) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (r3Var != null) {
                this.Y = ((t4) r3Var.q()).Y;
            }
        }
        if (this.Y == -100) {
            String name = this.o.getClass().getName();
            h30 h30Var = n0;
            Integer num = (Integer) h30Var.get(name);
            if (num != null) {
                this.Y = num.intValue();
                h30Var.remove(this.o.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        y4.d();
    }

    public static sr o(Context context) {
        sr srVar;
        sr srVar2;
        if (Build.VERSION.SDK_INT >= 33 || (srVar = f4.h) == null) {
            return null;
        }
        tr trVar = srVar.a;
        sr b = k4.b(context.getApplicationContext().getResources().getConfiguration());
        if (trVar.a.isEmpty()) {
            srVar2 = sr.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.a.a.size() + trVar.a.size()) {
                Locale locale = i < trVar.a.size() ? trVar.a.get(i) : b.a.a.get(i - trVar.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            srVar2 = new sr(new tr(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return srVar2.a.a.isEmpty() ? b : srVar2;
    }

    public static Configuration s(Context context, int i, sr srVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (srVar != null) {
            k4.d(configuration2, srVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f0 = (1 << i) | this.f0;
        if (this.e0) {
            return;
        }
        View decorView = this.q.getDecorView();
        WeakHashMap weakHashMap = e90.a;
        decorView.postOnAnimation(this.g0);
        this.e0 = true;
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            o8.t("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.d0 == null) {
                            this.d0 = new o4(this, context);
                        }
                        return this.d0.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).e();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean C() {
        ie ieVar;
        l60 l60Var;
        boolean z = this.T;
        this.T = false;
        s4 y = y(0);
        if (!y.m) {
            p1 p1Var = this.z;
            if (p1Var != null) {
                p1Var.a();
                return true;
            }
            z();
            xa0 xa0Var = this.t;
            if (xa0Var == null || (ieVar = xa0Var.e) == null || (l60Var = ((q60) ieVar).a.Q) == null || l60Var.g == null) {
                return false;
            }
            l60 l60Var2 = ((q60) ieVar).a.Q;
            eu euVar = l60Var2 == null ? null : l60Var2.g;
            if (euVar != null) {
                euVar.collapseActionView();
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
    public final void D(s4 s4Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = s4Var.m;
        int i2 = s4Var.a;
        if (z || this.W) {
            return;
        }
        Context context = this.p;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, s4Var.h)) {
            r(s4Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(s4Var, keyEvent)) {
            return;
        }
        r4 r4Var = s4Var.e;
        if (r4Var == null || s4Var.n) {
            if (r4Var == null) {
                z();
                xa0 xa0Var = this.t;
                Context b = xa0Var != null ? xa0Var.b() : null;
                if (b != null) {
                    context = b;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.awerser.monnit.betplay.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.awerser.monnit.betplay.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.awerser.monnit.betplay.R.style.Theme_AppCompat_CompactMenu, true);
                }
                od odVar = new od(context, 0);
                odVar.getTheme().setTo(newTheme);
                s4Var.j = odVar;
                TypedArray obtainStyledAttributes = odVar.obtainStyledAttributes(my.j);
                s4Var.b = obtainStyledAttributes.getResourceId(86, 0);
                s4Var.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                s4Var.e = new r4(this, s4Var.j);
                s4Var.c = 81;
            } else if (s4Var.n && r4Var.getChildCount() > 0) {
                s4Var.e.removeAllViews();
            }
            View view = s4Var.g;
            if (view == null) {
                if (s4Var.h != null) {
                    if (this.y == null) {
                        this.y = new h4(this, 3);
                    }
                    h4 h4Var = this.y;
                    if (s4Var.i == null) {
                        dr drVar = new dr(s4Var.j);
                        s4Var.i = drVar;
                        drVar.j = h4Var;
                        au auVar = s4Var.h;
                        auVar.b(drVar, auVar.a);
                    }
                    dr drVar2 = s4Var.i;
                    r4 r4Var2 = s4Var.e;
                    if (drVar2.i == null) {
                        drVar2.i = (ExpandedMenuView) drVar2.g.inflate(com.awerser.monnit.betplay.R.layout.abc_expanded_menu_layout, (ViewGroup) r4Var2, false);
                        if (drVar2.k == null) {
                            drVar2.k = new cr(drVar2);
                        }
                        drVar2.i.setAdapter((ListAdapter) drVar2.k);
                        drVar2.i.setOnItemClickListener(drVar2);
                    }
                    ExpandedMenuView expandedMenuView = drVar2.i;
                    s4Var.f = expandedMenuView;
                }
                s4Var.n = true;
                return;
            }
            s4Var.f = view;
            if (s4Var.f != null) {
                if (s4Var.g == null) {
                    dr drVar3 = s4Var.i;
                    if (drVar3.k == null) {
                        drVar3.k = new cr(drVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = s4Var.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                s4Var.e.setBackgroundResource(s4Var.b);
                ViewParent parent = s4Var.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(s4Var.f);
                }
                s4Var.e.addView(s4Var.f, layoutParams2);
                if (!s4Var.f.hasFocus()) {
                    s4Var.f.requestFocus();
                }
            }
            s4Var.n = true;
            return;
        }
        View view2 = s4Var.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            s4Var.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = s4Var.c;
            layoutParams3.windowAnimations = s4Var.d;
            windowManager.addView(s4Var.e, layoutParams3);
            s4Var.m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        s4Var.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = s4Var.c;
        layoutParams32.windowAnimations = s4Var.d;
        windowManager.addView(s4Var.e, layoutParams32);
        s4Var.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(s4 s4Var, int i, KeyEvent keyEvent) {
        au auVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((s4Var.k || F(s4Var, keyEvent)) && (auVar = s4Var.h) != null) {
            return auVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(s4 s4Var, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.W) {
            boolean z = s4Var.k;
            int i = s4Var.a;
            if (z) {
                return true;
            }
            s4 s4Var2 = this.S;
            if (s4Var2 != null && s4Var2 != s4Var) {
                r(s4Var2, false);
            }
            Window.Callback callback = this.q.getCallback();
            if (callback != null) {
                s4Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.w) != null) {
                actionBarOverlayLayout4.k();
                ((q60) actionBarOverlayLayout4.j).l = true;
            }
            if (s4Var.g == null) {
                au auVar = s4Var.h;
                if (auVar == null || s4Var.o) {
                    if (auVar == null) {
                        Context context = this.p;
                        if ((i == 0 || i == 108) && this.w != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.awerser.monnit.betplay.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.awerser.monnit.betplay.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.awerser.monnit.betplay.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                od odVar = new od(context, 0);
                                odVar.getTheme().setTo(theme);
                                context = odVar;
                            }
                        }
                        au auVar2 = new au(context);
                        auVar2.e = this;
                        au auVar3 = s4Var.h;
                        if (auVar2 != auVar3) {
                            if (auVar3 != null) {
                                auVar3.r(s4Var.i);
                            }
                            s4Var.h = auVar2;
                            dr drVar = s4Var.i;
                            if (drVar != null) {
                                auVar2.b(drVar, auVar2.a);
                            }
                        }
                    }
                    if (z2 && (actionBarOverlayLayout2 = this.w) != null) {
                        if (this.x == null) {
                            this.x = new h4(this, 2);
                        }
                        actionBarOverlayLayout2.l(s4Var.h, this.x);
                    }
                    s4Var.h.w();
                    if (callback.onCreatePanelMenu(i, s4Var.h)) {
                        s4Var.o = false;
                    } else {
                        au auVar4 = s4Var.h;
                        if (auVar4 != null) {
                            if (auVar4 != null) {
                                auVar4.r(s4Var.i);
                            }
                            s4Var.h = null;
                        }
                        if (z2 && (actionBarOverlayLayout = this.w) != null) {
                            actionBarOverlayLayout.l(null, this.x);
                        }
                    }
                }
                s4Var.h.w();
                Bundle bundle = s4Var.p;
                if (bundle != null) {
                    s4Var.h.s(bundle);
                    s4Var.p = null;
                }
                if (!callback.onPreparePanel(0, s4Var.g, s4Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.w) != null) {
                        actionBarOverlayLayout3.l(null, this.x);
                    }
                    s4Var.h.v();
                    return false;
                }
                s4Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                s4Var.h.v();
            }
            s4Var.k = true;
            s4Var.l = false;
            this.S = s4Var;
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
            boolean z = false;
            if (this.l0 != null && (y(0).m || this.z != null)) {
                z = true;
            }
            if (z && this.m0 == null) {
                this.m0 = m4.b(this.l0, this);
            } else {
                if (z || (onBackInvokedCallback = this.m0) == null) {
                    return;
                }
                m4.c(this.l0, onBackInvokedCallback);
                this.m0 = null;
            }
        }
    }

    @Override // defpackage.f4
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof t4) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.f4
    public final void c() {
        String str;
        this.U = true;
        l(false, true);
        w();
        Object obj = this.o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = l70.s(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                xa0 xa0Var = this.t;
                if (xa0Var == null) {
                    this.h0 = true;
                } else {
                    xa0Var.d(true);
                }
            }
            synchronized (f4.m) {
                f4.e(this);
                f4.l.add(new WeakReference(this));
            }
        }
        this.X = new Configuration(this.p.getResources().getConfiguration());
        this.V = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.f4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        o4 o4Var;
        o4 o4Var2;
        if (this.o instanceof Activity) {
            synchronized (f4.m) {
                f4.e(this);
            }
        }
        if (this.e0) {
            this.q.getDecorView().removeCallbacks(this.g0);
        }
        this.W = true;
        if (this.Y != -100) {
            Object obj = this.o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                n0.put(this.o.getClass().getName(), Integer.valueOf(this.Y));
                o4Var = this.c0;
                if (o4Var != null) {
                    o4Var.c();
                }
                o4Var2 = this.d0;
                if (o4Var2 == null) {
                    o4Var2.c();
                    return;
                }
                return;
            }
        }
        n0.remove(this.o.getClass().getName());
        o4Var = this.c0;
        if (o4Var != null) {
        }
        o4Var2 = this.d0;
        if (o4Var2 == null) {
        }
    }

    @Override // defpackage.yt
    public final boolean f(au auVar, MenuItem menuItem) {
        s4 s4Var;
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.W) {
            au k = auVar.k();
            s4[] s4VarArr = this.R;
            int length = s4VarArr != null ? s4VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    s4Var = s4VarArr[i];
                    if (s4Var != null && s4Var.h == k) {
                        break;
                    }
                    i++;
                } else {
                    s4Var = null;
                    break;
                }
            }
            if (s4Var != null) {
                return callback.onMenuItemSelected(s4Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.f4
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.P && i == 108) {
            return false;
        }
        if (this.L && i == 1) {
            this.L = false;
        }
        if (i == 1) {
            G();
            this.P = true;
            return true;
        }
        if (i == 2) {
            G();
            this.J = true;
            return true;
        }
        if (i == 5) {
            G();
            this.K = true;
            return true;
        }
        if (i == 10) {
            G();
            this.N = true;
            return true;
        }
        if (i == 108) {
            G();
            this.L = true;
            return true;
        }
        if (i != 109) {
            return this.q.requestFeature(i);
        }
        G();
        this.M = true;
        return true;
    }

    @Override // defpackage.f4
    public final void h(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.p).inflate(i, viewGroup);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.f4
    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.f4
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.f4
    public final void k(CharSequence charSequence) {
        this.v = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.w;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        xa0 xa0Var = this.t;
        if (xa0Var == null) {
            TextView textView = this.H;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        q60 q60Var = (q60) xa0Var.e;
        if (q60Var.g) {
            return;
        }
        Toolbar toolbar = q60Var.a;
        q60Var.h = charSequence;
        if ((q60Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (q60Var.g) {
                e90.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        sr b;
        int i2;
        boolean z3;
        Activity activity;
        if (this.W) {
            return false;
        }
        int i3 = this.Y;
        if (i3 == -100) {
            i3 = f4.g;
        }
        Context context = this.p;
        int B = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        sr o = i4 < 33 ? o(context) : null;
        if (!z2 && o != null) {
            o = k4.b(context.getResources().getConfiguration());
        }
        Configuration s = s(context, B, o, null, false);
        boolean z4 = this.b0;
        boolean z5 = true;
        Object obj = this.o;
        if (!z4 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.X;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s.uiMode & 48;
                sr b2 = k4.b(configuration);
                b = o != null ? null : k4.b(s);
                i2 = i5 == i6 ? 512 : 0;
                if (b != null && !b2.equals(b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.U && ((p0 || this.V) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new q1(r1, activity));
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
                                k4.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.Z;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.Z, true);
                            }
                            if (r1 != 0 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof nq) {
                                    if (((a) ((nq) activity2).getLifecycle()).c.compareTo(hq.h) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.V && !this.W) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b != null) {
                            k4.c(k4.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).h();
                        } else {
                            o4 o4Var = this.c0;
                            if (o4Var != null) {
                                o4Var.c();
                            }
                        }
                        o4 o4Var2 = this.d0;
                        if (i3 == 3) {
                            if (o4Var2 == null) {
                                this.d0 = new o4(this, context);
                            }
                            this.d0.h();
                        } else if (o4Var2 != null) {
                            o4Var2.c();
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
                o4 o4Var22 = this.d0;
                if (i3 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.a0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.a0 = 0;
            }
        }
        this.b0 = true;
        i = this.a0;
        configuration = this.X;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s.uiMode & 48;
        sr b22 = k4.b(configuration);
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
        o4 o4Var222 = this.d0;
        if (i3 == 3) {
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.yt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(au auVar) {
        ActionMenuView actionMenuView;
        k1 k1Var;
        k1 k1Var2;
        k1 k1Var3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.w;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((q60) actionBarOverlayLayout.j).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x) {
                if (ViewConfiguration.get(this.p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.w;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((q60) actionBarOverlayLayout2.j).a.f;
                    if (actionMenuView2 != null) {
                        k1 k1Var4 = actionMenuView2.y;
                        if (k1Var4 != null) {
                            if (k1Var4.z == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.w;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((q60) actionBarOverlayLayout3.j).a.f;
                if (actionMenuView3 != null && (k1Var2 = actionMenuView3.y) != null && k1Var2.h()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.w;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((q60) actionBarOverlayLayout4.j).a.f;
                    if (actionMenuView4 != null && (k1Var3 = actionMenuView4.y) != null) {
                        k1Var3.d();
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
                if (this.e0 && (1 & this.f0) != 0) {
                    View decorView = this.q.getDecorView();
                    g4 g4Var = this.g0;
                    decorView.removeCallbacks(g4Var);
                    g4Var.run();
                }
                s4 y = y(0);
                au auVar2 = y.h;
                if (auVar2 == null || y.o || !callback.onPreparePanel(0, y.g, auVar2)) {
                    return;
                }
                callback.onMenuOpened(108, y.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.w;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((q60) actionBarOverlayLayout5.j).a.f;
                if (actionMenuView5 == null || (k1Var = actionMenuView5.y) == null) {
                    return;
                }
                k1Var.l();
                return;
            }
        }
        s4 y2 = y(0);
        y2.n = true;
        r(y2, false);
        D(y2, null);
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.q != null) {
            o8.t("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n4) {
            o8.t("AppCompat has already installed itself into the Window");
            return;
        }
        n4 n4Var = new n4(this, callback);
        this.r = n4Var;
        window.setCallback(n4Var);
        Context context = this.p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, o0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            y4 a = y4.a();
            synchronized (a) {
                drawable = a.a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.l0) != null) {
            return;
        }
        Object obj = this.o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.m0) != null) {
            m4.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.m0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.l0 = m4.a(activity);
                H();
            }
        }
        this.l0 = null;
        H();
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
        View j5Var;
        View view2 = null;
        if (this.k0 == null) {
            int[] iArr = my.j;
            Context context2 = this.p;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.k0 = new q6();
            } else {
                try {
                    this.k0 = (q6) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.k0 = new q6();
                }
            }
        }
        q6 q6Var = this.k0;
        int i = j80.a;
        q6Var.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, my.x, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context odVar = (resourceId == 0 || ((context instanceof od) && ((od) context).a == resourceId)) ? context : new od(context, resourceId);
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
                j5Var = new j5(odVar, attributeSet);
                break;
            case 1:
                j5Var = new x3(odVar, attributeSet);
                break;
            case 2:
                j5Var = new f5(odVar, attributeSet);
                break;
            case 3:
                j5Var = q6Var.e(odVar, attributeSet);
                break;
            case 4:
                j5Var = new c5(odVar, attributeSet, com.awerser.monnit.betplay.R.attr.imageButtonStyle);
                break;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                j5Var = new l5(odVar, attributeSet);
                break;
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                j5Var = new x5(odVar, attributeSet);
                break;
            case 7:
                j5Var = q6Var.d(odVar, attributeSet);
                break;
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                j5Var = new o6(odVar, attributeSet);
                break;
            case '\t':
                j5Var = new e5(odVar, attributeSet, 0);
                break;
            case '\n':
                j5Var = q6Var.a(odVar, attributeSet);
                break;
            case 11:
                j5Var = q6Var.c(odVar, attributeSet);
                break;
            case '\f':
                j5Var = new a5(odVar, attributeSet);
                break;
            case '\r':
                j5Var = q6Var.b(odVar, attributeSet);
                break;
            default:
                j5Var = null;
                break;
        }
        if (j5Var == null && context != odVar) {
            Object[] objArr = q6Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = odVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = q6.g;
                        if (i2 < 3) {
                            View f = q6Var.f(odVar, str, strArr[i2]);
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
                    View f2 = q6Var.f(odVar, str, null);
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
            j5Var = view2;
        }
        if (j5Var != null) {
            Context context3 = j5Var.getContext();
            if ((context3 instanceof ContextWrapper) && j5Var.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, q6.c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    j5Var.setOnClickListener(new p6(j5Var, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = odVar.obtainStyledAttributes(attributeSet, q6.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = e90.a;
                    new s80(com.awerser.monnit.betplay.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(j5Var, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = odVar.obtainStyledAttributes(attributeSet, q6.e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    e90.n(j5Var, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = odVar.obtainStyledAttributes(attributeSet, q6.f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = e90.a;
                    new s80(com.awerser.monnit.betplay.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).d(j5Var, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return j5Var;
    }

    public final void p(int i, s4 s4Var, au auVar) {
        if (auVar == null) {
            if (s4Var == null && i >= 0) {
                s4[] s4VarArr = this.R;
                if (i < s4VarArr.length) {
                    s4Var = s4VarArr[i];
                }
            }
            if (s4Var != null) {
                auVar = s4Var.h;
            }
        }
        if ((s4Var == null || s4Var.m) && !this.W) {
            n4 n4Var = this.r;
            Window.Callback callback = this.q.getCallback();
            n4Var.getClass();
            try {
                n4Var.i = true;
                callback.onPanelClosed(i, auVar);
            } finally {
                n4Var.i = false;
            }
        }
    }

    public final void q(au auVar) {
        k1 k1Var;
        if (this.Q) {
            return;
        }
        this.Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.w;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((q60) actionBarOverlayLayout.j).a.f;
        if (actionMenuView != null && (k1Var = actionMenuView.y) != null) {
            k1Var.d();
            f1 f1Var = k1Var.y;
            if (f1Var != null && f1Var.b()) {
                f1Var.j.dismiss();
            }
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.W) {
            callback.onPanelClosed(108, auVar);
        }
        this.Q = false;
    }

    public final void r(s4 s4Var, boolean z) {
        r4 r4Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        k1 k1Var;
        if (z && s4Var.a == 0 && (actionBarOverlayLayout = this.w) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((q60) actionBarOverlayLayout.j).a.f;
            if (actionMenuView != null && (k1Var = actionMenuView.y) != null && k1Var.h()) {
                q(s4Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.p.getSystemService("window");
        if (windowManager != null && s4Var.m && (r4Var = s4Var.e) != null) {
            windowManager.removeView(r4Var);
            if (z) {
                p(s4Var.a, s4Var, null);
            }
        }
        s4Var.k = false;
        s4Var.l = false;
        s4Var.m = false;
        s4Var.f = null;
        s4Var.n = true;
        if (this.S == s4Var) {
            this.S = null;
        }
        if (s4Var.a == 0) {
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
        k1 k1Var;
        Object obj = this.o;
        if ((!(obj instanceof xp) && !(obj instanceof v4)) || (decorView = this.q.getDecorView()) == null || !l70.m(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                n4 n4Var = this.r;
                Window.Callback callback = this.q.getCallback();
                n4Var.getClass();
                try {
                    n4Var.h = true;
                } finally {
                    n4Var.h = false;
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
                        s4 y = y(0);
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
                    if (this.z == null) {
                        s4 y2 = y(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.w;
                        Context context = this.p;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((q60) actionBarOverlayLayout.j).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.w;
                                actionBarOverlayLayout2.k();
                                ActionMenuView actionMenuView2 = ((q60) actionBarOverlayLayout2.j).a.f;
                                if (actionMenuView2 == null || (k1Var = actionMenuView2.y) == null || !k1Var.h()) {
                                    if (!this.W && F(y2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.w;
                                        actionBarOverlayLayout3.k();
                                        ActionMenuView actionMenuView3 = ((q60) actionBarOverlayLayout3.j).a.f;
                                        if (actionMenuView3 != null) {
                                            k1 k1Var2 = actionMenuView3.y;
                                            if (k1Var2 != null) {
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.w;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView4 = ((q60) actionBarOverlayLayout4.j).a.f;
                                    if (actionMenuView4 != null) {
                                        k1 k1Var3 = actionMenuView4.y;
                                        if (k1Var3 != null) {
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
        s4 y = y(i);
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
        if ((i == 108 || i == 0) && this.w != null) {
            s4 y2 = y(0);
            y2.k = false;
            F(y2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.F) {
            return;
        }
        Context context = this.p;
        int[] iArr = my.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            o8.t("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
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
        this.O = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.q.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.P) {
            viewGroup = this.N ? (ViewGroup) from.inflate(com.awerser.monnit.betplay.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.awerser.monnit.betplay.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.O) {
            viewGroup = (ViewGroup) from.inflate(com.awerser.monnit.betplay.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.M = false;
            this.L = false;
        } else if (this.L) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.awerser.monnit.betplay.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new od(context, typedValue.resourceId) : context).inflate(com.awerser.monnit.betplay.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.awerser.monnit.betplay.R.id.decor_content_parent);
            this.w = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.q.getCallback());
            if (this.M) {
                this.w.j(109);
            }
            if (this.J) {
                this.w.j(2);
            }
            if (this.K) {
                this.w.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.L + ", windowActionBarOverlay: " + this.M + ", android:windowIsFloating: " + this.O + ", windowActionModeOverlay: " + this.N + ", windowNoTitle: " + this.P + " }");
        }
        h4 h4Var = new h4(this, i);
        WeakHashMap weakHashMap = e90.a;
        w80.c(viewGroup, h4Var);
        if (this.w == null) {
            this.H = (TextView) viewGroup.findViewById(com.awerser.monnit.betplay.R.id.title);
        }
        boolean z = ca0.a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.awerser.monnit.betplay.R.id.action_bar_activity_content);
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
        contentFrameLayout.setAttachListener(new h4(this, i2));
        this.G = viewGroup;
        Object obj = this.o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.v;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.w;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                xa0 xa0Var = this.t;
                if (xa0Var != null) {
                    q60 q60Var = (q60) xa0Var.e;
                    if (!q60Var.g) {
                        Toolbar toolbar = q60Var.a;
                        q60Var.h = title;
                        if ((q60Var.b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (q60Var.g) {
                                e90.n(toolbar.getRootView(), title);
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
        this.F = true;
        s4 y = y(0);
        if (this.W || y.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.q == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.q != null) {
            return;
        }
        o8.t("We have not been given a Window");
    }

    public final q4 x(Context context) {
        if (this.c0 == null) {
            if (r6.g == null) {
                Context applicationContext = context.getApplicationContext();
                r6.g = new r6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.c0 = new o4(this, r6.g);
        }
        return this.c0;
    }

    public final s4 y(int i) {
        s4[] s4VarArr = this.R;
        if (s4VarArr == null || s4VarArr.length <= i) {
            s4[] s4VarArr2 = new s4[i + 1];
            if (s4VarArr != null) {
                System.arraycopy(s4VarArr, 0, s4VarArr2, 0, s4VarArr.length);
            }
            this.R = s4VarArr2;
            s4VarArr = s4VarArr2;
        }
        s4 s4Var = s4VarArr[i];
        if (s4Var != null) {
            return s4Var;
        }
        s4 s4Var2 = new s4();
        s4Var2.a = i;
        s4Var2.n = false;
        s4VarArr[i] = s4Var2;
        return s4Var2;
    }

    public final void z() {
        v();
        if (this.L && this.t == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                this.t = new xa0((Activity) obj, this.M);
            } else if (obj instanceof Dialog) {
                this.t = new xa0((Dialog) obj);
            }
            xa0 xa0Var = this.t;
            if (xa0Var != null) {
                xa0Var.d(this.h0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
