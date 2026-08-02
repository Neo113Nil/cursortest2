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
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
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
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dy extends dk implements LayoutInflater.Factory2, gb {
    private static final qy N = new qy(0);
    private static final int[] O = {R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    boolean B;
    boolean C;
    public dw D;
    public boolean E;
    boolean F;
    public Configuration G;
    public int H;
    public boolean I;
    public int J;
    public Rect K;
    public Rect L;
    private CharSequence P;
    private dx Q;
    private TextView R;
    private boolean S;
    private boolean T;
    private boolean U;
    private dw[] V;
    private boolean W;
    private boolean X;
    private int Y;
    private int Z;
    private boolean aa;
    private dt ab;
    private dt ac;
    private boolean ae;
    private AppCompatViewInflater af;
    private OnBackInvokedDispatcher ag;
    private OnBackInvokedCallback ah;
    private dx ai;
    final Object j;
    final Context k;
    public Window l;
    public dq m;
    final dj n;
    cs o;
    MenuInflater p;
    public jb q;
    fg r;
    public ActionBarContextView s;
    public PopupWindow t;
    public Runnable u;
    public boolean w;
    public ViewGroup x;
    boolean y;
    boolean z;
    public brn M = null;
    public boolean v = true;
    private final Runnable ad = new bo(this, 4, null);

    public dy(Context context, Window window, dj djVar, Object obj) {
        di diVar = null;
        this.Y = -100;
        this.k = context;
        this.n = djVar;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof di)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        diVar = (di) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (diVar != null) {
                this.Y = ((dy) diVar.i()).Y;
            }
        }
        if (this.Y == -100) {
            qy qyVar = N;
            Integer num = (Integer) qyVar.get(this.j.getClass().getName());
            if (num != null) {
                this.Y = num.intValue();
                qyVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            S(window);
        }
        hx.f();
    }

    private final dt Q(Context context) {
        if (this.ac == null) {
            this.ac = new dr(this, context);
        }
        return this.ac;
    }

    private final dt R(Context context) {
        if (this.ab == null) {
            if (bvw.d == null) {
                Context applicationContext = context.getApplicationContext();
                bvw.d = new bvw(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.ab = new du(this, bvw.d);
        }
        return this.ab;
    }

    private final void S(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (this.l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof dq) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        dq dqVar = new dq(this, callback);
        this.m = dqVar;
        window.setCallback(dqVar);
        byo t = byo.t(this.k, null, O);
        Drawable k = t.k(0);
        if (k != null) {
            window.setBackgroundDrawable(k);
        }
        t.n();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || this.ag != null) {
            return;
        }
        Object obj = this.j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
                this.ag = onBackInvokedDispatcher;
                G();
            }
        }
        this.ag = null;
        G();
    }

    private final void T() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                S(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void U(int i2) {
        this.J = (1 << i2) | this.J;
        if (this.I) {
            return;
        }
        View decorView = this.l.getDecorView();
        Runnable runnable = this.ad;
        int i3 = yq.a;
        decorView.postOnAnimation(runnable);
        this.I = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x014b, code lost:
    
        if (r14.f != null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void V(dw dwVar, KeyEvent keyEvent) {
        ExpandedMenuView expandedMenuView;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (dwVar.m || this.F) {
            return;
        }
        int i3 = dwVar.a;
        if (i3 == 0 && (this.k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback v = v();
        if (v != null && !v.onMenuOpened(i3, dwVar.h)) {
            A(dwVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager == null || !K(dwVar, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = dwVar.e;
        if (viewGroup == null || dwVar.n) {
            if (viewGroup == null) {
                Context s = s();
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = s.getResources().newTheme();
                newTheme.setTo(s.getTheme());
                newTheme.resolveAttribute(com.google.android.apps.authenticator2.R.attr.actionBarPopupTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    newTheme.applyStyle(typedValue.resourceId, true);
                }
                newTheme.resolveAttribute(com.google.android.apps.authenticator2.R.attr.panelMenuListTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    newTheme.applyStyle(typedValue.resourceId, true);
                } else {
                    newTheme.applyStyle(com.google.android.apps.authenticator2.R.style.Theme_AppCompat_CompactMenu, true);
                }
                on onVar = new on(s, 0);
                onVar.getTheme().setTo(newTheme);
                dwVar.j = onVar;
                TypedArray obtainStyledAttributes = onVar.obtainStyledAttributes(em.j);
                dwVar.b = obtainStyledAttributes.getResourceId(86, 0);
                dwVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                dwVar.e = new dv(this, dwVar.j);
                dwVar.c = 81;
                if (dwVar.e == null) {
                    return;
                }
            } else if (dwVar.n && viewGroup.getChildCount() > 0) {
                dwVar.e.removeAllViews();
            }
            View view = dwVar.g;
            if (view == null) {
                gd gdVar = dwVar.h;
                if (gdVar != null) {
                    dx dxVar = this.Q;
                    if (dxVar == null) {
                        dxVar = new dx(this, 0);
                        this.Q = dxVar;
                    }
                    if (gdVar == null) {
                        expandedMenuView = null;
                    } else {
                        if (dwVar.i == null) {
                            dwVar.i = new fz(dwVar.j);
                            fz fzVar = dwVar.i;
                            fzVar.e = dxVar;
                            dwVar.h.g(fzVar);
                        }
                        fz fzVar2 = dwVar.i;
                        ViewGroup viewGroup2 = dwVar.e;
                        if (fzVar2.d == null) {
                            fzVar2.d = (ExpandedMenuView) fzVar2.b.inflate(com.google.android.apps.authenticator2.R.layout.abc_expanded_menu_layout, viewGroup2, false);
                            if (fzVar2.f == null) {
                                fzVar2.f = new fy(fzVar2);
                            }
                            fzVar2.d.setAdapter((ListAdapter) fzVar2.f);
                            fzVar2.d.setOnItemClickListener(fzVar2);
                        }
                        expandedMenuView = fzVar2.d;
                    }
                    dwVar.f = expandedMenuView;
                }
                dwVar.n = true;
                return;
            }
            dwVar.f = view;
            if (dwVar.f != null && (dwVar.g != null || dwVar.i.k().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams2 = dwVar.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                dwVar.e.setBackgroundResource(dwVar.b);
                ViewParent parent = dwVar.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(dwVar.f);
                }
                dwVar.e.addView(dwVar.f, layoutParams2);
                if (!dwVar.f.hasFocus()) {
                    dwVar.f.requestFocus();
                }
            }
            dwVar.n = true;
            return;
        }
        View view2 = dwVar.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i2 = -1;
            dwVar.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = dwVar.c;
            layoutParams3.windowAnimations = dwVar.d;
            windowManager.addView(dwVar.e, layoutParams3);
            dwVar.m = true;
            if (i3 != 0) {
                G();
                return;
            }
            return;
        }
        i2 = -2;
        dwVar.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = dwVar.c;
        layoutParams32.windowAnimations = dwVar.d;
        windowManager.addView(dwVar.e, layoutParams32);
        dwVar.m = true;
        if (i3 != 0) {
        }
    }

    private final void W() {
        if (this.w) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    final void A(dw dwVar, boolean z) {
        ViewGroup viewGroup;
        jb jbVar;
        if (z && dwVar.a == 0 && (jbVar = this.q) != null && jbVar.s()) {
            z(dwVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && dwVar.m && (viewGroup = dwVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                y(dwVar.a, dwVar, null);
            }
        }
        dwVar.k = false;
        dwVar.l = false;
        dwVar.m = false;
        dwVar.f = null;
        dwVar.n = true;
        if (this.D == dwVar) {
            this.D = null;
        }
        if (dwVar.a == 0) {
            G();
        }
    }

    public final void B(int i2) {
        dw O2 = O(i2);
        if (O2.h != null) {
            Bundle bundle = new Bundle();
            O2.h.o(bundle);
            if (bundle.size() > 0) {
                O2.p = bundle;
            }
            O2.h.s();
            O2.h.clear();
        }
        O2.o = true;
        O2.n = true;
        if ((i2 == 108 || i2 == 0) && this.q != null) {
            dw O3 = O(0);
            O3.k = false;
            K(O3, null);
        }
    }

    public final void C() {
        brn brnVar = this.M;
        if (brnVar != null) {
            brnVar.M();
        }
    }

    public final void D() {
        ViewGroup viewGroup;
        if (this.w) {
            return;
        }
        Context context = this.k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(em.j);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            p(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            p(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            p(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            p(10);
        }
        this.B = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        T();
        this.l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.C) {
            viewGroup = this.A ? (ViewGroup) from.inflate(com.google.android.apps.authenticator2.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.google.android.apps.authenticator2.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.B) {
            viewGroup = (ViewGroup) from.inflate(com.google.android.apps.authenticator2.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.z = false;
            this.y = false;
        } else if (this.y) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.google.android.apps.authenticator2.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                context = new on(context, typedValue.resourceId);
            }
            viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.google.android.apps.authenticator2.R.layout.abc_screen_toolbar, (ViewGroup) null);
            jb jbVar = (jb) viewGroup.findViewById(com.google.android.apps.authenticator2.R.id.decor_content_parent);
            this.q = jbVar;
            jbVar.n(v());
            if (this.z) {
                this.q.c(109);
            }
            if (this.S) {
                this.q.c(2);
            }
            if (this.T) {
                this.q.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.y + ", windowActionBarOverlay: " + this.z + ", android:windowIsFloating: " + this.B + ", windowActionModeOverlay: " + this.A + ", windowNoTitle: " + this.C + " }");
        }
        tu tuVar = new tu(this, 1);
        int i2 = yq.a;
        yi.c(viewGroup, tuVar);
        if (this.q == null) {
            this.R = (TextView) viewGroup.findViewById(com.google.android.apps.authenticator2.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.apps.authenticator2.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
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
        this.l.setContentView(viewGroup);
        contentFrameLayout.i = new kee(this);
        this.x = viewGroup;
        CharSequence x = x();
        if (!TextUtils.isEmpty(x)) {
            jb jbVar2 = this.q;
            if (jbVar2 != null) {
                jbVar2.o(x);
            } else {
                cs csVar = this.o;
                if (csVar != null) {
                    csVar.k(x);
                } else {
                    TextView textView = this.R;
                    if (textView != null) {
                        textView.setText(x);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.x.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = this.k.obtainStyledAttributes(em.j);
        if (contentFrameLayout2.b == null) {
            contentFrameLayout2.b = new TypedValue();
        }
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
        if (contentFrameLayout2.c == null) {
            contentFrameLayout2.c = new TypedValue();
        }
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
        if (obtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.d == null) {
                contentFrameLayout2.d = new TypedValue();
            }
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            if (contentFrameLayout2.e == null) {
                contentFrameLayout2.e = new TypedValue();
            }
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.f == null) {
                contentFrameLayout2.f = new TypedValue();
            }
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.g == null) {
                contentFrameLayout2.g = new TypedValue();
            }
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.w = true;
        dw O2 = O(0);
        if (this.F || O2.h != null) {
            return;
        }
        U(108);
    }

    public final void E() {
        D();
        if (this.y && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new el((Activity) obj, this.z);
            } else if (obj instanceof Dialog) {
                this.o = new el((Dialog) obj);
            }
            cs csVar = this.o;
            if (csVar != null) {
                csVar.f(this.ae);
            }
        }
    }

    @Override // defpackage.gb
    public final void F(gd gdVar) {
        jb jbVar = this.q;
        if (jbVar == null || !jbVar.p() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.q.r())) {
            dw O2 = O(0);
            O2.n = true;
            A(O2, false);
            V(O2, null);
            return;
        }
        Window.Callback v = v();
        if (this.q.s()) {
            this.q.q();
            if (this.F) {
                return;
            }
            v.onPanelClosed(108, O(0).h);
            return;
        }
        if (v == null || this.F) {
            return;
        }
        if (this.I && (1 & this.J) != 0) {
            View decorView = this.l.getDecorView();
            Runnable runnable = this.ad;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        dw O3 = O(0);
        gd gdVar2 = O3.h;
        if (gdVar2 == null || O3.o || !v.onPreparePanel(0, O3.g, gdVar2)) {
            return;
        }
        v.onMenuOpened(108, O3.h);
        this.q.u();
    }

    final void G() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.ag == null || (!O(0).m && this.r == null)) {
                OnBackInvokedCallback onBackInvokedCallback = this.ah;
                if (onBackInvokedCallback != null) {
                    this.ag.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                    this.ah = null;
                    return;
                }
                return;
            }
            if (this.ah == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.ag;
                me meVar = new me(this, 1);
                onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, meVar);
                this.ah = meVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        if (r7 != false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean H(KeyEvent keyEvent) {
        boolean z;
        Object obj = this.j;
        if (((obj instanceof xj) || (obj instanceof ea)) && this.l.getDecorView() != null) {
            int i2 = yq.a;
        }
        if (keyEvent.getKeyCode() == 82) {
            dq dqVar = this.m;
            Window.Callback callback = this.l.getCallback();
            try {
                dqVar.a = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                dqVar.a = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.W = (keyEvent.getFlags() & 128) != 0;
                return false;
            }
            if (keyCode != 82) {
                return false;
            }
            if (keyEvent.getRepeatCount() == 0) {
                dw O2 = O(0);
                if (O2.m) {
                    return true;
                }
                K(O2, keyEvent);
            }
            return true;
        }
        if (keyCode == 4) {
            return I();
        }
        if (keyCode != 82) {
            return false;
        }
        if (this.r != null) {
            return true;
        }
        dw O3 = O(0);
        jb jbVar = this.q;
        if (jbVar == null || !jbVar.p() || ViewConfiguration.get(this.k).hasPermanentMenuKey()) {
            boolean z2 = O3.m;
            if (!z2 && !O3.l) {
                if (!O3.k) {
                    return true;
                }
                if (O3.o) {
                    O3.k = false;
                    if (!K(O3, keyEvent)) {
                        return true;
                    }
                }
                V(O3, keyEvent);
                AudioManager audioManager = (AudioManager) this.k.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
            A(O3, true);
            z = z2;
        } else if (this.q.s()) {
            z = this.q.q();
        } else {
            if (this.F || !K(O3, keyEvent)) {
                return true;
            }
            z = this.q.u();
        }
    }

    public final boolean I() {
        boolean z = this.W;
        this.W = false;
        dw O2 = O(0);
        if (O2.m) {
            if (!z) {
                A(O2, true);
            }
            return true;
        }
        fg fgVar = this.r;
        if (fgVar != null) {
            fgVar.f();
            return true;
        }
        cs b = b();
        return b != null && b.m();
    }

    @Override // defpackage.gb
    public final boolean J(gd gdVar, MenuItem menuItem) {
        dw u;
        Window.Callback v = v();
        if (v == null || this.F || (u = u(gdVar.a())) == null) {
            return false;
        }
        return v.onMenuItemSelected(u.a, menuItem);
    }

    public final boolean K(dw dwVar, KeyEvent keyEvent) {
        jb jbVar;
        jb jbVar2;
        Resources.Theme theme;
        jb jbVar3;
        jb jbVar4;
        if (this.F) {
            return false;
        }
        if (dwVar.k) {
            return true;
        }
        dw dwVar2 = this.D;
        if (dwVar2 != null && dwVar2 != dwVar) {
            A(dwVar2, false);
        }
        Window.Callback v = v();
        if (v != null) {
            dwVar.g = v.onCreatePanelView(dwVar.a);
        }
        int i2 = dwVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (jbVar4 = this.q) != null) {
            jbVar4.m();
        }
        if (dwVar.g == null && (!z || !(this.o instanceof ef))) {
            gd gdVar = dwVar.h;
            if (gdVar == null || dwVar.o) {
                if (gdVar == null) {
                    Context context = this.k;
                    if ((i2 == 0 || i2 == 108) && this.q != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.google.android.apps.authenticator2.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.google.android.apps.authenticator2.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.google.android.apps.authenticator2.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            on onVar = new on(context, 0);
                            onVar.getTheme().setTo(theme);
                            context = onVar;
                        }
                    }
                    gd gdVar2 = new gd(context);
                    gdVar2.b = this;
                    dwVar.a(gdVar2);
                    if (dwVar.h == null) {
                        return false;
                    }
                }
                if (z && (jbVar2 = this.q) != null) {
                    if (this.ai == null) {
                        this.ai = new dx(this, 1);
                    }
                    jbVar2.l(dwVar.h, this.ai);
                }
                dwVar.h.s();
                if (!v.onCreatePanelMenu(i2, dwVar.h)) {
                    dwVar.a(null);
                    if (z && (jbVar = this.q) != null) {
                        jbVar.l(null, this.ai);
                    }
                    return false;
                }
                dwVar.o = false;
            }
            dwVar.h.s();
            Bundle bundle = dwVar.p;
            if (bundle != null) {
                dwVar.h.n(bundle);
                dwVar.p = null;
            }
            if (!v.onPreparePanel(0, dwVar.g, dwVar.h)) {
                if (z && (jbVar3 = this.q) != null) {
                    jbVar3.l(null, this.ai);
                }
                dwVar.h.r();
                return false;
            }
            dwVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            dwVar.h.r();
        }
        dwVar.k = true;
        dwVar.l = false;
        this.D = dwVar;
        return true;
    }

    public final boolean L() {
        ViewGroup viewGroup;
        return this.w && (viewGroup = this.x) != null && viewGroup.isLaidOut();
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0156, code lost:
    
        if (r5 == false) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(boolean z, boolean z2) {
        int i2;
        Configuration configuration;
        vv g;
        int i3;
        LocaleList forLanguageTags;
        Object obj;
        if (this.F) {
            return;
        }
        int q = q();
        Context context = this.k;
        int r = r(context, q);
        vv w = Build.VERSION.SDK_INT < 33 ? w(context) : null;
        if (!z2 && w != null) {
            w = e.g(context.getResources().getConfiguration());
        }
        vv vvVar = w;
        Configuration t = t(context, r, vvVar, null, false);
        boolean z3 = false;
        if (!this.aa) {
            Object obj2 = this.j;
            if (obj2 instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    i2 = 0;
                    configuration = this.G;
                    if (configuration == null) {
                        configuration = this.k.getResources().getConfiguration();
                    }
                    int i4 = configuration.uiMode & 48;
                    int i5 = t.uiMode & 48;
                    vv g2 = e.g(configuration);
                    g = vvVar != null ? null : e.g(t);
                    i3 = i4 == i5 ? 512 : 0;
                    if (g != null && !g2.equals(g)) {
                        i3 |= 8196;
                    }
                    if (((~i2) & i3) != 0 && z && this.E && (i || this.X)) {
                        obj = this.j;
                        if (obj instanceof Activity) {
                            Activity activity = (Activity) obj;
                            if (!activity.isChild()) {
                                if (Build.VERSION.SDK_INT >= 31 && (i3 & 8192) != 0) {
                                    activity.getWindow().getDecorView().setLayoutDirection(t.getLayoutDirection());
                                }
                                activity.recreate();
                                z3 = true;
                            }
                        }
                    }
                    if (z3 && i3 != 0) {
                        int i6 = i3 & i2;
                        Context context2 = this.k;
                        Resources resources = context2.getResources();
                        Configuration configuration2 = new Configuration(resources.getConfiguration());
                        configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
                        if (g != null) {
                            e.h(configuration2, g);
                        }
                        resources.updateConfiguration(configuration2, null);
                        int i7 = this.H;
                        if (i7 != 0) {
                            context2.setTheme(i7);
                            context2.getTheme().applyStyle(this.H, true);
                        }
                        if (i6 == i3) {
                            Object obj3 = this.j;
                            if (obj3 instanceof Activity) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof aer) {
                                    if (((aer) activity2).L().c.a(aek.c)) {
                                        activity2.onConfigurationChanged(configuration2);
                                        this.l.getDecorView().dispatchConfigurationChanged(configuration2);
                                    }
                                } else if (this.X && !this.F) {
                                    activity2.onConfigurationChanged(configuration2);
                                    this.l.getDecorView().dispatchConfigurationChanged(configuration2);
                                }
                            }
                        }
                    }
                    Object obj4 = this.j;
                    if (obj4 instanceof di) {
                        if ((i3 & 512) != 0) {
                            ((di) obj4).n();
                        }
                        if ((i3 & 4) != 0) {
                            ((di) obj4).m();
                        }
                    }
                    if (g != null) {
                        forLanguageTags = LocaleList.forLanguageTags(e.g(this.k.getResources().getConfiguration()).e());
                        LocaleList.setDefault(forLanguageTags);
                    }
                    if (q == 0) {
                        R(this.k).d();
                    } else {
                        dt dtVar = this.ab;
                        if (dtVar != null) {
                            dtVar.c();
                        }
                        if (q == 3) {
                            Q(this.k).d();
                            return;
                        }
                    }
                    dt dtVar2 = this.ac;
                    if (dtVar2 != null) {
                        dtVar2.c();
                        return;
                    }
                    return;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj2.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.Z = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.Z = 0;
                }
            }
        }
        this.aa = true;
        i2 = this.Z;
        configuration = this.G;
        if (configuration == null) {
        }
        int i42 = configuration.uiMode & 48;
        int i52 = t.uiMode & 48;
        vv g22 = e.g(configuration);
        if (vvVar != null) {
        }
        if (i42 == i52) {
        }
        if (g != null) {
            i3 |= 8196;
        }
        if (((~i2) & i3) != 0) {
            obj = this.j;
            if (obj instanceof Activity) {
            }
        }
        if (z3) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public final View N(String str, Context context, AttributeSet attributeSet) {
        View view;
        AppCompatViewInflater appCompatViewInflater = this.af;
        View view2 = null;
        AppCompatViewInflater appCompatViewInflater2 = appCompatViewInflater;
        if (appCompatViewInflater == null) {
            Context context2 = this.k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(em.j);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                AppCompatViewInflater appCompatViewInflater3 = new AppCompatViewInflater();
                this.af = appCompatViewInflater3;
                appCompatViewInflater2 = appCompatViewInflater3;
            } else {
                try {
                    AppCompatViewInflater appCompatViewInflater4 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.af = appCompatViewInflater4;
                    appCompatViewInflater2 = appCompatViewInflater4;
                } catch (Throwable unused) {
                    AppCompatViewInflater appCompatViewInflater5 = new AppCompatViewInflater();
                    this.af = appCompatViewInflater5;
                    appCompatViewInflater2 = appCompatViewInflater5;
                }
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, em.z, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        obtainStyledAttributes2.recycle();
        Context onVar = (resourceId == 0 || ((context instanceof on) && ((on) context).a == resourceId)) ? context : new on(context, resourceId);
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    view = new ie(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    view = new hv(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    view = new ia(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    view = appCompatViewInflater2.e(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    view = new hz(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    view = new C0001if(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    view = new io(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    view = appCompatViewInflater2.d(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    view = new iy(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    view = new AppCompatImageView(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    view = appCompatViewInflater2.a(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    view = appCompatViewInflater2.c(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    view = new hy(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    view = appCompatViewInflater2.b(onVar, attributeSet);
                    break;
                }
                view = null;
                break;
            default:
                view = null;
                break;
        }
        if (view == null && context != onVar) {
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = appCompatViewInflater2.f;
                objArr[0] = onVar;
                objArr[1] = attributeSet;
                if (str.indexOf(46) == -1) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < 3) {
                            View f = appCompatViewInflater2.f(onVar, str, AppCompatViewInflater.e[i2]);
                            if (f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f;
                                appCompatViewInflater2 = appCompatViewInflater2;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                            appCompatViewInflater2 = appCompatViewInflater2;
                        }
                    }
                } else {
                    View f2 = appCompatViewInflater2.f(onVar, str, null);
                    Object[] objArr2 = appCompatViewInflater2.f;
                    objArr2[0] = 0;
                    objArr2[1] = 0;
                    view2 = f2;
                    appCompatViewInflater2 = objArr2;
                }
            } catch (Exception unused2) {
                Object[] objArr3 = appCompatViewInflater2.f;
                objArr3[0] = view2;
                objArr3[1] = view2;
            } catch (Throwable th) {
                Object[] objArr4 = appCompatViewInflater2.f;
                objArr4[0] = view2;
                objArr4[1] = view2;
                throw th;
            }
            view = view2;
        }
        if (view != null) {
            Context context3 = view.getContext();
            if ((context3 instanceof ContextWrapper) && view.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, AppCompatViewInflater.a);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    view.setOnClickListener(new ec(view, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = onVar.obtainStyledAttributes(attributeSet, AppCompatViewInflater.b);
                if (obtainStyledAttributes4.hasValue(0)) {
                    yq.m(view, obtainStyledAttributes4.getBoolean(0, false));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = onVar.obtainStyledAttributes(attributeSet, AppCompatViewInflater.c);
                if (obtainStyledAttributes5.hasValue(0)) {
                    yq.n(view, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = onVar.obtainStyledAttributes(attributeSet, AppCompatViewInflater.d);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z = obtainStyledAttributes6.getBoolean(0, false);
                    int i3 = yq.a;
                    new ya(Boolean.class).e(view, Boolean.valueOf(z));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return view;
    }

    public final dw O(int i2) {
        dw[] dwVarArr = this.V;
        if (dwVarArr == null || dwVarArr.length <= i2) {
            dw[] dwVarArr2 = new dw[i2 + 1];
            if (dwVarArr != null) {
                System.arraycopy(dwVarArr, 0, dwVarArr2, 0, dwVarArr.length);
            }
            this.V = dwVarArr2;
            dwVarArr = dwVarArr2;
        }
        dw dwVar = dwVarArr[i2];
        if (dwVar != null) {
            return dwVar;
        }
        dw dwVar2 = new dw(i2);
        dwVarArr[i2] = dwVar2;
        return dwVar2;
    }

    public final boolean P(dw dwVar, int i2, KeyEvent keyEvent) {
        gd gdVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((dwVar.k || K(dwVar, keyEvent)) && (gdVar = dwVar.h) != null) {
            return gdVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    @Override // defpackage.dk
    public final Context a() {
        return this.k;
    }

    @Override // defpackage.dk
    public final cs b() {
        E();
        return this.o;
    }

    @Override // defpackage.dk
    public final View c(int i2) {
        D();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.dk
    public final void d(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ((ViewGroup) this.x.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.dk
    public final void e() {
        LayoutInflater from = LayoutInflater.from(this.k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            from.getFactory2();
        }
    }

    @Override // defpackage.dk
    public final void f() {
        if (this.o == null || b().n()) {
            return;
        }
        U(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        cs csVar;
        dt dtVar;
        dt dtVar2;
        if (this.j instanceof Activity) {
            synchronized (dk.f) {
                dk.i(this);
            }
        }
        if (this.I) {
            this.l.getDecorView().removeCallbacks(this.ad);
        }
        this.F = true;
        if (this.Y != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                N.put(obj.getClass().getName(), Integer.valueOf(this.Y));
                csVar = this.o;
                if (csVar != null) {
                    csVar.e();
                }
                dtVar = this.ab;
                if (dtVar != null) {
                    dtVar.c();
                }
                dtVar2 = this.ac;
                if (dtVar2 == null) {
                    dtVar2.c();
                    return;
                }
                return;
            }
        }
        N.remove(this.j.getClass().getName());
        csVar = this.o;
        if (csVar != null) {
        }
        dtVar = this.ab;
        if (dtVar != null) {
        }
        dtVar2 = this.ac;
        if (dtVar2 == null) {
        }
    }

    @Override // defpackage.dk
    public final void h() {
        cs b = b();
        if (b != null) {
            b.h(false);
        }
    }

    @Override // defpackage.dk
    public final void j(int i2) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.dk
    public final void k(View view) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.dk
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.dk
    public final void m(CharSequence charSequence) {
        this.P = charSequence;
        jb jbVar = this.q;
        if (jbVar != null) {
            jbVar.o(charSequence);
            return;
        }
        cs csVar = this.o;
        if (csVar != null) {
            csVar.k(charSequence);
            return;
        }
        TextView textView = this.R;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.dk
    public final void o() {
        String str;
        this.E = true;
        M(false, true);
        T();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                str = ox.k((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                cs csVar = this.o;
                if (csVar == null) {
                    this.ae = true;
                } else {
                    csVar.f(true);
                }
            }
            synchronized (dk.f) {
                dk.i(this);
                dk.e.add(new WeakReference(this));
            }
        }
        this.G = new Configuration(this.k.getResources().getConfiguration());
        this.X = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return N(str, context, attributeSet);
    }

    @Override // defpackage.dk
    public final void p(int i2) {
        if (i2 == 8) {
            i2 = 108;
        } else if (i2 == 9) {
            i2 = 109;
        }
        if (this.C && i2 == 108) {
            return;
        }
        if (this.y && i2 == 1) {
            this.y = false;
        }
        if (i2 == 1) {
            W();
            this.C = true;
            return;
        }
        if (i2 == 2) {
            W();
            this.S = true;
            return;
        }
        if (i2 == 5) {
            W();
            this.T = true;
            return;
        }
        if (i2 == 10) {
            W();
            this.A = true;
        } else if (i2 == 108) {
            W();
            this.y = true;
        } else if (i2 != 109) {
            this.l.requestFeature(i2);
        } else {
            W();
            this.z = true;
        }
    }

    public final int q() {
        int i2 = this.Y;
        return i2 != -100 ? i2 : dk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0118 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int r(Context context, int i2) {
        long j;
        int i3;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        return ((dr) Q(context)).a.isPowerSaveMode() ? 2 : 1;
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                bvw bvwVar = ((du) R(context)).b;
                eh ehVar = (eh) bvwVar.c;
                if (ehVar.b > System.currentTimeMillis()) {
                    i3 = ehVar.a;
                } else {
                    Context context2 = (Context) bvwVar.a;
                    Location q = oy.l(context2, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? bvwVar.q("network") : null;
                    Location q2 = oy.l(context2, "android.permission.ACCESS_FINE_LOCATION") == 0 ? bvwVar.q("gps") : null;
                    if (q2 == null || q == null ? q2 != null : q2.getTime() > q.getTime()) {
                        q = q2;
                    }
                    if (q == null) {
                        int i4 = Calendar.getInstance().get(11);
                        return (i4 < 6 || i4 >= 22) ? 2 : 1;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (eg.a == null) {
                        eg.a = new eg();
                    }
                    eg egVar = eg.a;
                    egVar.a(currentTimeMillis - 86400000, q.getLatitude(), q.getLongitude());
                    egVar.a(currentTimeMillis, q.getLatitude(), q.getLongitude());
                    int i5 = egVar.d;
                    long j2 = egVar.c;
                    long j3 = egVar.b;
                    egVar.a(currentTimeMillis + 86400000, q.getLatitude(), q.getLongitude());
                    long j4 = egVar.c;
                    if (j2 == -1 || j3 == -1) {
                        j = currentTimeMillis + 43200000;
                    } else {
                        if (currentTimeMillis > j3) {
                            j2 = j4;
                        } else if (currentTimeMillis > j2) {
                            j2 = j3;
                        }
                        j = j2 + 60000;
                    }
                    ehVar.a = 1 == i5;
                    ehVar.b = j;
                    i3 = i5;
                }
                if (i3 == 0) {
                    return 1;
                }
            }
        }
        return i2;
    }

    final Context s() {
        cs b = b();
        Context b2 = b != null ? b.b() : null;
        return b2 == null ? this.k : b2;
    }

    public final Configuration t(Context context, int i2, vv vvVar, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (vvVar != null) {
            e.h(configuration2, vvVar);
        }
        return configuration2;
    }

    final dw u(Menu menu) {
        dw[] dwVarArr = this.V;
        int length = dwVarArr != null ? dwVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            dw dwVar = dwVarArr[i2];
            if (dwVar != null && dwVar.h == menu) {
                return dwVar;
            }
        }
        return null;
    }

    final Window.Callback v() {
        return this.l.getCallback();
    }

    final vv w(Context context) {
        vv vvVar;
        vv b;
        if (Build.VERSION.SDK_INT >= 33 || (vvVar = dk.b) == null) {
            return null;
        }
        vv g = e.g(context.getApplicationContext().getResources().getConfiguration());
        if (vvVar.g()) {
            b = vv.a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < vvVar.a() + g.a()) {
                Locale f = i2 < vvVar.a() ? vvVar.f(i2) : g.f(i2 - vvVar.a());
                if (f != null) {
                    linkedHashSet.add(f);
                }
                i2++;
            }
            b = vv.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return b.g() ? g : b;
    }

    final CharSequence x() {
        Object obj = this.j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.P;
    }

    final void y(int i2, dw dwVar, Menu menu) {
        if (menu == null) {
            menu = dwVar.h;
        }
        if (dwVar.m && !this.F) {
            dq dqVar = this.m;
            Window.Callback callback = this.l.getCallback();
            try {
                dqVar.b = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                dqVar.b = false;
            }
        }
    }

    final void z(gd gdVar) {
        if (this.U) {
            return;
        }
        this.U = true;
        this.q.a();
        Window.Callback v = v();
        if (v != null && !this.F) {
            v.onPanelClosed(108, gdVar);
        }
        this.U = false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return N(str, context, attributeSet);
    }
}
