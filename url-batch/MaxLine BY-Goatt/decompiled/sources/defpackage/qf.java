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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.Utility;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qf extends df implements dk1, LayoutInflater.Factory2 {
    public static final fl2 t0 = new fl2(0);
    public static final int[] u0 = {R.attr.windowBackground};
    public static final boolean v0 = !"robolectric".equals(Build.FINGERPRINT);
    public xq2 A;
    public CharSequence B;
    public ActionBarOverlayLayout C;
    public ff D;
    public ff E;
    public i3 F;
    public ActionBarContextView G;
    public PopupWindow H;
    public ef I;
    public boolean L;
    public ViewGroup M;
    public TextView N;
    public View O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public pf[] X;
    public pf Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public Configuration d0;
    public final int e0;
    public int f0;
    public int g0;
    public boolean h0;
    public mf i0;
    public mf j0;
    public boolean k0;
    public int l0;
    public boolean n0;
    public Rect o0;
    public Rect p0;
    public jh q0;
    public OnBackInvokedDispatcher r0;
    public OnBackInvokedCallback s0;
    public final Object v;
    public final Context w;
    public Window x;
    public lf y;
    public w63 z;
    public w53 J = null;
    public final boolean K = true;
    public final ef m0 = new ef(this, 0);

    public qf(Context context, Window window, ve veVar, Object obj) {
        re reVar = null;
        this.e0 = -100;
        this.w = context;
        this.v = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof re)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        reVar = (re) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (reVar != null) {
                this.e0 = ((qf) reVar.h()).e0;
            }
        }
        if (this.e0 == -100) {
            String name = this.v.getClass().getName();
            fl2 fl2Var = t0;
            Integer num = (Integer) fl2Var.get(name);
            if (num != null) {
                this.e0 = num.intValue();
                fl2Var.remove(this.v.getClass().getName());
            }
        }
        if (window != null) {
            r(window);
        }
        tf.c();
    }

    public static tf1 s(Context context) {
        tf1 tf1Var;
        tf1 tf1Var2;
        if (Build.VERSION.SDK_INT >= 33 || (tf1Var = df.o) == null) {
            return null;
        }
        vf1 vf1Var = tf1Var.a;
        tf1 b = jf.b(context.getApplicationContext().getResources().getConfiguration());
        if (vf1Var.a.isEmpty()) {
            tf1Var2 = tf1.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.a.a.size() + vf1Var.a.size()) {
                Locale locale = i < vf1Var.a.size() ? vf1Var.a.get(i) : b.a.a.get(i - vf1Var.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            tf1Var2 = new tf1(new vf1(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return tf1Var2.a.a.isEmpty() ? b : tf1Var2;
    }

    public static Configuration w(Context context, int i, tf1 tf1Var, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (tf1Var != null) {
            jf.d(configuration2, tf1Var);
        }
        return configuration2;
    }

    public final void A() {
        if (this.x == null) {
            Object obj = this.v;
            if (obj instanceof Activity) {
                r(((Activity) obj).getWindow());
            }
        }
        if (this.x != null) {
            return;
        }
        lh.g("We have not been given a Window");
    }

    public final b90 B(Context context) {
        if (this.i0 == null) {
            if (mh.s == null) {
                Context applicationContext = context.getApplicationContext();
                mh.s = new mh(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.i0 = new mf(this, mh.s);
        }
        return this.i0;
    }

    public final pf C(int i) {
        pf[] pfVarArr = this.X;
        if (pfVarArr == null || pfVarArr.length <= i) {
            pf[] pfVarArr2 = new pf[i + 1];
            if (pfVarArr != null) {
                System.arraycopy(pfVarArr, 0, pfVarArr2, 0, pfVarArr.length);
            }
            this.X = pfVarArr2;
            pfVarArr = pfVarArr2;
        }
        pf pfVar = pfVarArr[i];
        if (pfVar != null) {
            return pfVar;
        }
        pf pfVar2 = new pf();
        pfVar2.a = i;
        pfVar2.n = false;
        pfVarArr[i] = pfVar2;
        return pfVar2;
    }

    public final void D() {
        z();
        if (this.R && this.z == null) {
            Object obj = this.v;
            if (obj instanceof Activity) {
                this.z = new w63((Activity) obj, this.S);
            } else if (obj instanceof Dialog) {
                this.z = new w63((Dialog) obj);
            }
            w63 w63Var = this.z;
            if (w63Var != null) {
                w63Var.d(this.n0);
            }
        }
    }

    public final void E(int i) {
        this.l0 = (1 << i) | this.l0;
        if (this.k0) {
            return;
        }
        View decorView = this.x.getDecorView();
        WeakHashMap weakHashMap = e53.a;
        decorView.postOnAnimation(this.m0);
        this.k0 = true;
    }

    public final int F(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            lh.g("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.j0 == null) {
                            this.j0 = new mf(this, context);
                        }
                        return this.j0.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return B(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean G() {
        u70 u70Var;
        ey2 ey2Var;
        boolean z = this.Z;
        this.Z = false;
        pf C = C(0);
        if (!C.m) {
            i3 i3Var = this.F;
            if (i3Var != null) {
                i3Var.a();
                return true;
            }
            D();
            w63 w63Var = this.z;
            if (w63Var == null || (u70Var = w63Var.e) == null || (ey2Var = ((ky2) u70Var).a.a0) == null || ey2Var.n == null) {
                return false;
            }
            ey2 ey2Var2 = ((ky2) u70Var).a.a0;
            lk1 lk1Var = ey2Var2 == null ? null : ey2Var2.n;
            if (lk1Var != null) {
                lk1Var.collapseActionView();
            }
        } else if (!z) {
            v(C, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.r.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(pf pfVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = pfVar.m;
        int i2 = pfVar.a;
        if (z || this.c0) {
            return;
        }
        Context context = this.w;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.x.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, pfVar.h)) {
            v(pfVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !J(pfVar, keyEvent)) {
            return;
        }
        of ofVar = pfVar.e;
        if (ofVar == null || pfVar.n) {
            if (ofVar == null) {
                D();
                w63 w63Var = this.z;
                Context b = w63Var != null ? w63Var.b() : null;
                if (b != null) {
                    context = b;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.majelw.libystne.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.majelw.libystne.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.majelw.libystne.R.style.Theme_AppCompat_CompactMenu, true);
                }
                n30 n30Var = new n30(context, 0);
                n30Var.getTheme().setTo(newTheme);
                pfVar.j = n30Var;
                TypedArray obtainStyledAttributes = n30Var.obtainStyledAttributes(b62.j);
                pfVar.b = obtainStyledAttributes.getResourceId(86, 0);
                pfVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                pfVar.e = new of(this, pfVar.j);
                pfVar.c = 81;
            } else if (pfVar.n && ofVar.getChildCount() > 0) {
                pfVar.e.removeAllViews();
            }
            View view = pfVar.g;
            if (view == null) {
                if (pfVar.h != null) {
                    if (this.E == null) {
                        this.E = new ff(this, 3);
                    }
                    ff ffVar = this.E;
                    if (pfVar.i == null) {
                        qe1 qe1Var = new qe1(pfVar.j);
                        pfVar.i = qe1Var;
                        qe1Var.q = ffVar;
                        fk1 fk1Var = pfVar.h;
                        fk1Var.b(qe1Var, fk1Var.a);
                    }
                    qe1 qe1Var2 = pfVar.i;
                    of ofVar2 = pfVar.e;
                    if (qe1Var2.p == null) {
                        qe1Var2.p = (ExpandedMenuView) qe1Var2.n.inflate(com.majelw.libystne.R.layout.abc_expanded_menu_layout, (ViewGroup) ofVar2, false);
                        if (qe1Var2.r == null) {
                            qe1Var2.r = new pe1(qe1Var2);
                        }
                        qe1Var2.p.setAdapter((ListAdapter) qe1Var2.r);
                        qe1Var2.p.setOnItemClickListener(qe1Var2);
                    }
                    ExpandedMenuView expandedMenuView = qe1Var2.p;
                    pfVar.f = expandedMenuView;
                }
                pfVar.n = true;
                return;
            }
            pfVar.f = view;
            if (pfVar.f != null) {
                if (pfVar.g == null) {
                    qe1 qe1Var3 = pfVar.i;
                    if (qe1Var3.r == null) {
                        qe1Var3.r = new pe1(qe1Var3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = pfVar.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                pfVar.e.setBackgroundResource(pfVar.b);
                ViewParent parent = pfVar.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(pfVar.f);
                }
                pfVar.e.addView(pfVar.f, layoutParams2);
                if (!pfVar.f.hasFocus()) {
                    pfVar.f.requestFocus();
                }
            }
            pfVar.n = true;
            return;
        }
        View view2 = pfVar.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            pfVar.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = pfVar.c;
            layoutParams3.windowAnimations = pfVar.d;
            windowManager.addView(pfVar.e, layoutParams3);
            pfVar.m = true;
            if (i2 != 0) {
                L();
                return;
            }
            return;
        }
        i = -2;
        pfVar.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = pfVar.c;
        layoutParams32.windowAnimations = pfVar.d;
        windowManager.addView(pfVar.e, layoutParams32);
        pfVar.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean I(pf pfVar, int i, KeyEvent keyEvent) {
        fk1 fk1Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((pfVar.k || J(pfVar, keyEvent)) && (fk1Var = pfVar.h) != null) {
            return fk1Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(pf pfVar, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.c0) {
            boolean z = pfVar.k;
            int i = pfVar.a;
            if (z) {
                return true;
            }
            pf pfVar2 = this.Y;
            if (pfVar2 != null && pfVar2 != pfVar) {
                v(pfVar2, false);
            }
            Window.Callback callback = this.x.getCallback();
            if (callback != null) {
                pfVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.C) != null) {
                actionBarOverlayLayout4.k();
                ((ky2) actionBarOverlayLayout4.q).l = true;
            }
            if (pfVar.g == null) {
                fk1 fk1Var = pfVar.h;
                if (fk1Var == null || pfVar.o) {
                    if (fk1Var == null) {
                        Context context = this.w;
                        if ((i == 0 || i == 108) && this.C != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.majelw.libystne.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.majelw.libystne.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.majelw.libystne.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                n30 n30Var = new n30(context, 0);
                                n30Var.getTheme().setTo(theme);
                                context = n30Var;
                            }
                        }
                        fk1 fk1Var2 = new fk1(context);
                        fk1Var2.e = this;
                        fk1 fk1Var3 = pfVar.h;
                        if (fk1Var2 != fk1Var3) {
                            if (fk1Var3 != null) {
                                fk1Var3.r(pfVar.i);
                            }
                            pfVar.h = fk1Var2;
                            qe1 qe1Var = pfVar.i;
                            if (qe1Var != null) {
                                fk1Var2.b(qe1Var, fk1Var2.a);
                            }
                        }
                    }
                    if (z2 && (actionBarOverlayLayout2 = this.C) != null) {
                        if (this.D == null) {
                            this.D = new ff(this, 2);
                        }
                        actionBarOverlayLayout2.l(pfVar.h, this.D);
                    }
                    pfVar.h.w();
                    if (callback.onCreatePanelMenu(i, pfVar.h)) {
                        pfVar.o = false;
                    } else {
                        fk1 fk1Var4 = pfVar.h;
                        if (fk1Var4 != null) {
                            if (fk1Var4 != null) {
                                fk1Var4.r(pfVar.i);
                            }
                            pfVar.h = null;
                        }
                        if (z2 && (actionBarOverlayLayout = this.C) != null) {
                            actionBarOverlayLayout.l(null, this.D);
                        }
                    }
                }
                pfVar.h.w();
                Bundle bundle = pfVar.p;
                if (bundle != null) {
                    pfVar.h.s(bundle);
                    pfVar.p = null;
                }
                if (!callback.onPreparePanel(0, pfVar.g, pfVar.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.C) != null) {
                        actionBarOverlayLayout3.l(null, this.D);
                    }
                    pfVar.h.v();
                    return false;
                }
                pfVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                pfVar.h.v();
            }
            pfVar.k = true;
            pfVar.l = false;
            this.Y = pfVar;
            return true;
        }
        return false;
    }

    public final void K() {
        if (this.L) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void L() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.r0 != null && (C(0).m || this.F != null)) {
                z = true;
            }
            if (z && this.s0 == null) {
                this.s0 = kf.b(this.r0, this);
            } else {
                if (z || (onBackInvokedCallback = this.s0) == null) {
                    return;
                }
                kf.c(this.r0, onBackInvokedCallback);
                this.s0 = null;
            }
        }
    }

    @Override // defpackage.df
    public final void c() {
        LayoutInflater from = LayoutInflater.from(this.w);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof qf) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.df
    public final void d() {
        if (this.z != null) {
            D();
            this.z.getClass();
            E(0);
        }
    }

    @Override // defpackage.dk1
    public final boolean e(fk1 fk1Var, MenuItem menuItem) {
        pf pfVar;
        Window.Callback callback = this.x.getCallback();
        if (callback != null && !this.c0) {
            fk1 k = fk1Var.k();
            pf[] pfVarArr = this.X;
            int length = pfVarArr != null ? pfVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    pfVar = pfVarArr[i];
                    if (pfVar != null && pfVar.h == k) {
                        break;
                    }
                    i++;
                } else {
                    pfVar = null;
                    break;
                }
            }
            if (pfVar != null) {
                return callback.onMenuItemSelected(pfVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.df
    public final void g() {
        String str;
        this.a0 = true;
        q(false, true);
        A();
        Object obj = this.v;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = z71.A(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                w63 w63Var = this.z;
                if (w63Var == null) {
                    this.n0 = true;
                } else {
                    w63Var.d(true);
                }
            }
            synchronized (df.t) {
                df.i(this);
                df.s.add(new WeakReference(this));
            }
        }
        this.d0 = new Configuration(this.w.getResources().getConfiguration());
        this.b0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.df
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        mf mfVar;
        mf mfVar2;
        if (this.v instanceof Activity) {
            synchronized (df.t) {
                df.i(this);
            }
        }
        if (this.k0) {
            this.x.getDecorView().removeCallbacks(this.m0);
        }
        this.c0 = true;
        if (this.e0 != -100) {
            Object obj = this.v;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                t0.put(this.v.getClass().getName(), Integer.valueOf(this.e0));
                mfVar = this.i0;
                if (mfVar != null) {
                    mfVar.c();
                }
                mfVar2 = this.j0;
                if (mfVar2 == null) {
                    mfVar2.c();
                    return;
                }
                return;
            }
        }
        t0.remove(this.v.getClass().getName());
        mfVar = this.i0;
        if (mfVar != null) {
        }
        mfVar2 = this.j0;
        if (mfVar2 == null) {
        }
    }

    @Override // defpackage.df
    public final boolean j(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.V && i == 108) {
            return false;
        }
        if (this.R && i == 1) {
            this.R = false;
        }
        if (i == 1) {
            K();
            this.V = true;
            return true;
        }
        if (i == 2) {
            K();
            this.P = true;
            return true;
        }
        if (i == 5) {
            K();
            this.Q = true;
            return true;
        }
        if (i == 10) {
            K();
            this.T = true;
            return true;
        }
        if (i == 108) {
            K();
            this.R = true;
            return true;
        }
        if (i != 109) {
            return this.x.requestFeature(i);
        }
        K();
        this.S = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.dk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(fk1 fk1Var) {
        ActionMenuView actionMenuView;
        e3 e3Var;
        e3 e3Var2;
        e3 e3Var3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.C;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((ky2) actionBarOverlayLayout.q).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.m) != null && actionMenuView.E) {
                if (ViewConfiguration.get(this.w).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.C;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((ky2) actionBarOverlayLayout2.q).a.m;
                    if (actionMenuView2 != null) {
                        e3 e3Var4 = actionMenuView2.F;
                        if (e3Var4 != null) {
                            if (e3Var4.G == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.x.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.C;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((ky2) actionBarOverlayLayout3.q).a.m;
                if (actionMenuView3 != null && (e3Var2 = actionMenuView3.F) != null && e3Var2.h()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.C;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((ky2) actionBarOverlayLayout4.q).a.m;
                    if (actionMenuView4 != null && (e3Var3 = actionMenuView4.F) != null) {
                        e3Var3.c();
                    }
                    if (this.c0) {
                        return;
                    }
                    callback.onPanelClosed(108, C(0).h);
                    return;
                }
                if (callback == null || this.c0) {
                    return;
                }
                if (this.k0 && (1 & this.l0) != 0) {
                    View decorView = this.x.getDecorView();
                    ef efVar = this.m0;
                    decorView.removeCallbacks(efVar);
                    efVar.run();
                }
                pf C = C(0);
                fk1 fk1Var2 = C.h;
                if (fk1Var2 == null || C.o || !callback.onPreparePanel(0, C.g, fk1Var2)) {
                    return;
                }
                callback.onMenuOpened(108, C.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.C;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((ky2) actionBarOverlayLayout5.q).a.m;
                if (actionMenuView5 == null || (e3Var = actionMenuView5.F) == null) {
                    return;
                }
                e3Var.l();
                return;
            }
        }
        pf C2 = C(0);
        C2.n = true;
        v(C2, false);
        H(C2, null);
    }

    @Override // defpackage.df
    public final void l(int i) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.w).inflate(i, viewGroup);
        this.y.a(this.x.getCallback());
    }

    @Override // defpackage.df
    public final void m(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.y.a(this.x.getCallback());
    }

    @Override // defpackage.df
    public final void n(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.y.a(this.x.getCallback());
    }

    @Override // defpackage.df
    public final void o(CharSequence charSequence) {
        this.B = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.C;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        w63 w63Var = this.z;
        if (w63Var == null) {
            TextView textView = this.N;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        ky2 ky2Var = (ky2) w63Var.e;
        if (ky2Var.g) {
            return;
        }
        Toolbar toolbar = ky2Var.a;
        ky2Var.h = charSequence;
        if ((ky2Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (ky2Var.g) {
                e53.j(toolbar.getRootView(), charSequence);
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
        View cgVar;
        View view2 = null;
        if (this.q0 == null) {
            int[] iArr = b62.j;
            Context context2 = this.w;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.q0 = new jh();
            } else {
                try {
                    this.q0 = (jh) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.q0 = new jh();
                }
            }
        }
        jh jhVar = this.q0;
        int i = w33.a;
        jhVar.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b62.x, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context n30Var = (resourceId == 0 || ((context instanceof n30) && ((n30) context).a == resourceId)) ? context : new n30(context, resourceId);
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
                cgVar = new cg(n30Var, attributeSet);
                break;
            case 1:
                cgVar = new xe(n30Var, attributeSet);
                break;
            case 2:
                cgVar = new zf(n30Var, attributeSet);
                break;
            case 3:
                cgVar = new bh(n30Var, attributeSet);
                break;
            case 4:
                cgVar = new xf(n30Var, attributeSet, com.majelw.libystne.R.attr.imageButtonStyle);
                break;
            case 5:
                cgVar = new eg(n30Var, attributeSet);
                break;
            case 6:
                cgVar = new qg(n30Var, attributeSet);
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                cgVar = new bg(n30Var, attributeSet);
                break;
            case '\b':
                cgVar = new hh(n30Var, attributeSet);
                break;
            case '\t':
                cgVar = new AppCompatImageView(n30Var, attributeSet);
                break;
            case '\n':
                cgVar = new se(n30Var, attributeSet);
                break;
            case 11:
                cgVar = new we(n30Var, attributeSet);
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                cgVar = new vf(n30Var, attributeSet);
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                cgVar = new ue(n30Var, attributeSet);
                break;
            default:
                cgVar = null;
                break;
        }
        if (cgVar == null && context != n30Var) {
            Object[] objArr = jhVar.a;
            if (str.equals(ViewHierarchyConstants.VIEW_KEY)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = n30Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = jh.g;
                        if (i2 < 3) {
                            View a = jhVar.a(n30Var, str, strArr[i2]);
                            if (a != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = a;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View a2 = jhVar.a(n30Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = a2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            cgVar = view2;
        }
        if (cgVar != null) {
            Context context3 = cgVar.getContext();
            if ((context3 instanceof ContextWrapper) && cgVar.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, jh.c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    cgVar.setOnClickListener(new ih(cgVar, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = n30Var.obtainStyledAttributes(attributeSet, jh.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = e53.a;
                    new t43(com.majelw.libystne.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(cgVar, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = n30Var.obtainStyledAttributes(attributeSet, jh.e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    e53.j(cgVar, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = n30Var.obtainStyledAttributes(attributeSet, jh.f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = e53.a;
                    new t43(com.majelw.libystne.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(cgVar, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return cgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        tf1 b;
        int i2;
        boolean z3;
        Object obj;
        Object obj2;
        Activity activity;
        if (this.c0) {
            return false;
        }
        int i3 = this.e0;
        if (i3 == -100) {
            i3 = df.n;
        }
        Context context = this.w;
        int F = F(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        tf1 s = i4 < 33 ? s(context) : null;
        if (!z2 && s != null) {
            s = jf.b(context.getResources().getConfiguration());
        }
        Configuration w = w(context, F, s, null, false);
        boolean z4 = this.h0;
        boolean z5 = true;
        Object obj3 = this.v;
        if (!z4 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.d0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = w.uiMode & 48;
                tf1 b2 = jf.b(configuration);
                b = s != null ? null : jf.b(w);
                i2 = i5 == i6 ? 512 : 0;
                if (b != null && !b2.equals(b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.a0 && ((v0 || this.b0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(w.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new k3(r1, activity));
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
                                jf.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = Build.VERSION.SDK_INT;
                            if (i8 < 26 && i8 < 28) {
                                if (!j8.C) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        j8.B = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                                    }
                                    j8.C = true;
                                }
                                Field field = j8.B;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e2) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!j8.w) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                j8.v = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e3) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                            }
                                            j8.w = true;
                                        }
                                        Field field2 = j8.v;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e4) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                            }
                                            if (obj2 != null) {
                                                if (!j8.y) {
                                                    try {
                                                        j8.x = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e5) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
                                                    }
                                                    j8.y = true;
                                                }
                                                Class cls = j8.x;
                                                if (cls != null) {
                                                    if (!j8.A) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            j8.z = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e6) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e6);
                                                        }
                                                        j8.A = true;
                                                    }
                                                    Field field3 = j8.z;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e7) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e7);
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
                            int i9 = this.f0;
                            if (i9 != 0) {
                                context.setTheme(i9);
                                context.getTheme().applyStyle(this.f0, true);
                            }
                            if (r1 != 0 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof id1) {
                                    if (((id1) activity2).getLifecycle().b().compareTo(zc1.o) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.b0 && !this.c0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b != null) {
                            jf.c(jf.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            B(context).n();
                        } else {
                            mf mfVar = this.i0;
                            if (mfVar != null) {
                                mfVar.c();
                            }
                        }
                        mf mfVar2 = this.j0;
                        if (i3 == 3) {
                            if (mfVar2 == null) {
                                this.j0 = new mf(this, context);
                            }
                            this.j0.n();
                        } else if (mfVar2 != null) {
                            mfVar2.c();
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
                mf mfVar22 = this.j0;
                if (i3 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.g0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.g0 = 0;
            }
        }
        this.h0 = true;
        i = this.g0;
        configuration = this.d0;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = w.uiMode & 48;
        tf1 b22 = jf.b(configuration);
        if (s != null) {
        }
        if (i52 == i62) {
        }
        if (b != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj3;
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
        mf mfVar222 = this.j0;
        if (i3 == 3) {
        }
        return z5;
    }

    public final void r(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.x != null) {
            lh.g("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof lf) {
            lh.g("AppCompat has already installed itself into the Window");
            return;
        }
        lf lfVar = new lf(this, callback);
        this.y = lfVar;
        window.setCallback(lfVar);
        Context context = this.w;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, u0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            tf a = tf.a();
            synchronized (a) {
                drawable = a.a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.x = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.r0) != null) {
            return;
        }
        Object obj = this.v;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.s0) != null) {
            kf.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.s0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.r0 = kf.a(activity);
                L();
            }
        }
        this.r0 = null;
        L();
    }

    public final void t(int i, pf pfVar, fk1 fk1Var) {
        if (fk1Var == null) {
            if (pfVar == null && i >= 0) {
                pf[] pfVarArr = this.X;
                if (i < pfVarArr.length) {
                    pfVar = pfVarArr[i];
                }
            }
            if (pfVar != null) {
                fk1Var = pfVar.h;
            }
        }
        if ((pfVar == null || pfVar.m) && !this.c0) {
            lf lfVar = this.y;
            Window.Callback callback = this.x.getCallback();
            lfVar.getClass();
            try {
                lfVar.p = true;
                callback.onPanelClosed(i, fk1Var);
            } finally {
                lfVar.p = false;
            }
        }
    }

    public final void u(fk1 fk1Var) {
        e3 e3Var;
        if (this.W) {
            return;
        }
        this.W = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.C;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((ky2) actionBarOverlayLayout.q).a.m;
        if (actionMenuView != null && (e3Var = actionMenuView.F) != null) {
            e3Var.c();
            b3 b3Var = e3Var.F;
            if (b3Var != null && b3Var.b()) {
                b3Var.i.dismiss();
            }
        }
        Window.Callback callback = this.x.getCallback();
        if (callback != null && !this.c0) {
            callback.onPanelClosed(108, fk1Var);
        }
        this.W = false;
    }

    public final void v(pf pfVar, boolean z) {
        of ofVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        e3 e3Var;
        if (z && pfVar.a == 0 && (actionBarOverlayLayout = this.C) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((ky2) actionBarOverlayLayout.q).a.m;
            if (actionMenuView != null && (e3Var = actionMenuView.F) != null && e3Var.h()) {
                u(pfVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.w.getSystemService("window");
        if (windowManager != null && pfVar.m && (ofVar = pfVar.e) != null) {
            windowManager.removeView(ofVar);
            if (z) {
                t(pfVar.a, pfVar, null);
            }
        }
        pfVar.k = false;
        pfVar.l = false;
        pfVar.m = false;
        pfVar.f = null;
        pfVar.n = true;
        if (this.Y == pfVar) {
            this.Y = null;
        }
        if (pfVar.a == 0) {
            L();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r6.c() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fa, code lost:
    
        if (r6.l() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        e3 e3Var;
        Object obj = this.v;
        if ((!(obj instanceof y71) && !(obj instanceof s5)) || (decorView = this.x.getDecorView()) == null || !s03.i(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                lf lfVar = this.y;
                Window.Callback callback = this.x.getCallback();
                lfVar.getClass();
                try {
                    lfVar.o = true;
                } finally {
                    lfVar.o = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.Z = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        pf C = C(0);
                        if (!C.m) {
                            J(C, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.F == null) {
                        pf C2 = C(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.C;
                        Context context = this.w;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((ky2) actionBarOverlayLayout.q).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.m) != null && actionMenuView.E && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.C;
                                actionBarOverlayLayout2.k();
                                ActionMenuView actionMenuView2 = ((ky2) actionBarOverlayLayout2.q).a.m;
                                if (actionMenuView2 == null || (e3Var = actionMenuView2.F) == null || !e3Var.h()) {
                                    if (!this.c0 && J(C2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.C;
                                        actionBarOverlayLayout3.k();
                                        ActionMenuView actionMenuView3 = ((ky2) actionBarOverlayLayout3.q).a.m;
                                        if (actionMenuView3 != null) {
                                            e3 e3Var2 = actionMenuView3.F;
                                            if (e3Var2 != null) {
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.C;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView4 = ((ky2) actionBarOverlayLayout4.q).a.m;
                                    if (actionMenuView4 != null) {
                                        e3 e3Var3 = actionMenuView4.F;
                                        if (e3Var3 != null) {
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
                        boolean z3 = C2.m;
                        if (z3 || C2.l) {
                            v(C2, true);
                            z = z3;
                            if (z) {
                            }
                        } else {
                            if (C2.k) {
                                if (C2.o) {
                                    C2.k = false;
                                    z2 = J(C2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    H(C2, keyEvent);
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
            if (!G()) {
                return false;
            }
        }
        return true;
    }

    public final void y(int i) {
        pf C = C(i);
        if (C.h != null) {
            Bundle bundle = new Bundle();
            C.h.t(bundle);
            if (bundle.size() > 0) {
                C.p = bundle;
            }
            C.h.w();
            C.h.clear();
        }
        C.o = true;
        C.n = true;
        if ((i == 108 || i == 0) && this.C != null) {
            pf C2 = C(0);
            C2.k = false;
            J(C2, null);
        }
    }

    public final void z() {
        ViewGroup viewGroup;
        if (this.L) {
            return;
        }
        Context context = this.w;
        int[] iArr = b62.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            lh.g("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (obtainStyledAttributes.getBoolean(126, false)) {
            j(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            j(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            j(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            j(10);
        }
        this.U = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        A();
        this.x.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.V) {
            viewGroup = this.T ? (ViewGroup) from.inflate(com.majelw.libystne.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.majelw.libystne.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.U) {
            viewGroup = (ViewGroup) from.inflate(com.majelw.libystne.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.S = false;
            this.R = false;
        } else if (this.R) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.majelw.libystne.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n30(context, typedValue.resourceId) : context).inflate(com.majelw.libystne.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.majelw.libystne.R.id.decor_content_parent);
            this.C = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.x.getCallback());
            if (this.S) {
                this.C.j(109);
            }
            if (this.P) {
                this.C.j(2);
            }
            if (this.Q) {
                this.C.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.R + ", windowActionBarOverlay: " + this.S + ", android:windowIsFloating: " + this.U + ", windowActionModeOverlay: " + this.T + ", windowNoTitle: " + this.V + " }");
        }
        ff ffVar = new ff(this, i);
        WeakHashMap weakHashMap = e53.a;
        x43.c(viewGroup, ffVar);
        if (this.C == null) {
            this.N = (TextView) viewGroup.findViewById(com.majelw.libystne.R.id.title);
        }
        boolean z = c63.a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.majelw.libystne.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.x.findViewById(R.id.content);
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
        this.x.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ff(this, i2));
        this.M = viewGroup;
        Object obj = this.v;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.B;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.C;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                w63 w63Var = this.z;
                if (w63Var != null) {
                    ky2 ky2Var = (ky2) w63Var.e;
                    if (!ky2Var.g) {
                        Toolbar toolbar = ky2Var.a;
                        ky2Var.h = title;
                        if ((ky2Var.b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (ky2Var.g) {
                                e53.j(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.N;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.M.findViewById(R.id.content);
        View decorView = this.x.getDecorView();
        contentFrameLayout2.s.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.L = true;
        pf C = C(0);
        if (this.c0 || C.h != null) {
            return;
        }
        E(108);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
