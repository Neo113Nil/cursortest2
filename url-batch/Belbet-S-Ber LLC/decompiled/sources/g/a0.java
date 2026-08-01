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
import l.a3;
import l.f3;
import l.h1;
import l.i1;
import l.v2;
import n0.p0;
import n0.t0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a0 extends o implements k.k, LayoutInflater.Factory2 {

    /* renamed from: n0, reason: collision with root package name */
    public static final q.j f1444n0 = new q.j(0);

    /* renamed from: o0, reason: collision with root package name */
    public static final int[] f1445o0 = {R.attr.windowBackground};

    /* renamed from: p0, reason: collision with root package name */
    public static final boolean f1446p0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView A;
    public PopupWindow B;
    public p C;
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
    public z[] R;
    public z S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public Configuration X;
    public final int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f1447a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1448b0;

    /* renamed from: c0, reason: collision with root package name */
    public w f1449c0;
    public w d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1450e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f1451f0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1453h0;
    public Rect i0;

    /* renamed from: j0, reason: collision with root package name */
    public Rect f1454j0;

    /* renamed from: k0, reason: collision with root package name */
    public d0 f1455k0;

    /* renamed from: l0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1456l0;

    /* renamed from: m0, reason: collision with root package name */
    public OnBackInvokedCallback f1457m0;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1458o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f1459p;

    /* renamed from: q, reason: collision with root package name */
    public Window f1460q;

    /* renamed from: r, reason: collision with root package name */
    public v f1461r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f1462s;

    /* renamed from: t, reason: collision with root package name */
    public k0 f1463t;

    /* renamed from: u, reason: collision with root package name */
    public j.h f1464u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1465v;

    /* renamed from: w, reason: collision with root package name */
    public h1 f1466w;

    /* renamed from: x, reason: collision with root package name */
    public q f1467x;

    /* renamed from: y, reason: collision with root package name */
    public q f1468y;

    /* renamed from: z, reason: collision with root package name */
    public j.a f1469z;
    public t0 D = null;
    public final boolean E = true;

    /* renamed from: g0, reason: collision with root package name */
    public final p f1452g0 = new p(this, 0);

    public a0(Context context, Window window, j jVar, Object obj) {
        i iVar = null;
        this.Y = -100;
        this.f1459p = context;
        this.f1462s = jVar;
        this.f1458o = obj;
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
                this.Y = ((a0) iVar.k()).Y;
            }
        }
        if (this.Y == -100) {
            String name = this.f1458o.getClass().getName();
            q.j jVar2 = f1444n0;
            Integer num = (Integer) jVar2.get(name);
            if (num != null) {
                this.Y = num.intValue();
                jVar2.remove(this.f1458o.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        l.r.d();
    }

    public static j0.f m(Context context) {
        j0.f fVar;
        j0.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.h) == null) {
            return null;
        }
        j0.g gVar = fVar.f2134a;
        j0.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        if (gVar.f2135a.isEmpty()) {
            fVar2 = j0.f.f2133b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f2134a.f2135a.size() + gVar.f2135a.size()) {
                Locale locale = i < gVar.f2135a.size() ? gVar.f2135a.get(i) : b2.f2134a.f2135a.get(i - gVar.f2135a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new j0.f(new j0.g(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f2134a.f2135a.isEmpty() ? b2 : fVar2;
    }

    public static Configuration r(Context context, int i, j0.f fVar, Configuration configuration, boolean z4) {
        int i4 = i != 1 ? i != 2 ? z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            t.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f1451f0 = (1 << i) | this.f1451f0;
        if (this.f1450e0) {
            return;
        }
        View decorView = this.f1460q.getDecorView();
        WeakHashMap weakHashMap = p0.f2816a;
        decorView.postOnAnimation(this.f1452g0);
        this.f1450e0 = true;
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.d0 == null) {
                            this.d0 = new w(this, context);
                        }
                        return this.d0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return w(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean C() {
        i1 i1Var;
        v2 v2Var;
        boolean z4 = this.T;
        this.T = false;
        z x4 = x(0);
        if (!x4.f1586m) {
            j.a aVar = this.f1469z;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            y();
            k0 k0Var = this.f1463t;
            if (k0Var == null || (i1Var = k0Var.f1537f) == null || (v2Var = ((a3) i1Var).f2391a.Q) == null || v2Var.f2599g == null) {
                return false;
            }
            v2 v2Var2 = ((a3) i1Var).f2391a.Q;
            k.o oVar = v2Var2 == null ? null : v2Var2.f2599g;
            if (oVar != null) {
                oVar.collapseActionView();
            }
        } else if (!z4) {
            p(x4, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.f2204k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(z zVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z4 = zVar.f1586m;
        int i4 = zVar.f1577a;
        if (z4 || this.W) {
            return;
        }
        Context context = this.f1459p;
        if (i4 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f1460q.getCallback();
        if (callback != null && !callback.onMenuOpened(i4, zVar.h)) {
            p(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f1580e;
        if (yVar == null || zVar.f1587n) {
            if (yVar == null) {
                y();
                k0 k0Var = this.f1463t;
                Context m02 = k0Var != null ? k0Var.m0() : null;
                if (m02 != null) {
                    context = m02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.gdmhkmf.belbet.R.attr.actionBarPopupTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    newTheme.applyStyle(i5, true);
                }
                newTheme.resolveAttribute(com.gdmhkmf.belbet.R.attr.panelMenuListTheme, typedValue, true);
                int i6 = typedValue.resourceId;
                if (i6 != 0) {
                    newTheme.applyStyle(i6, true);
                } else {
                    newTheme.applyStyle(com.gdmhkmf.belbet.R.style.Theme_AppCompat_CompactMenu, true);
                }
                j.c cVar = new j.c(context, 0);
                cVar.getTheme().setTo(newTheme);
                zVar.f1583j = cVar;
                TypedArray obtainStyledAttributes = cVar.obtainStyledAttributes(f.a.f1396j);
                zVar.f1578b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f1580e = new y(this, zVar.f1583j);
                zVar.f1579c = 81;
            } else if (zVar.f1587n && yVar.getChildCount() > 0) {
                zVar.f1580e.removeAllViews();
            }
            View view = zVar.f1582g;
            if (view == null) {
                if (zVar.h != null) {
                    if (this.f1468y == null) {
                        this.f1468y = new q(this, 3);
                    }
                    q qVar = this.f1468y;
                    if (zVar.i == null) {
                        k.i iVar = new k.i(zVar.f1583j);
                        zVar.i = iVar;
                        iVar.f2203j = qVar;
                        k.m mVar = zVar.h;
                        mVar.b(iVar, mVar.f2211a);
                    }
                    k.i iVar2 = zVar.i;
                    y yVar2 = zVar.f1580e;
                    if (iVar2.i == null) {
                        iVar2.i = (ExpandedMenuView) iVar2.f2202g.inflate(com.gdmhkmf.belbet.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (iVar2.f2204k == null) {
                            iVar2.f2204k = new k.h(iVar2);
                        }
                        iVar2.i.setAdapter((ListAdapter) iVar2.f2204k);
                        iVar2.i.setOnItemClickListener(iVar2);
                    }
                    ExpandedMenuView expandedMenuView = iVar2.i;
                    zVar.f1581f = expandedMenuView;
                }
                zVar.f1587n = true;
                return;
            }
            zVar.f1581f = view;
            if (zVar.f1581f != null) {
                if (zVar.f1582g == null) {
                    k.i iVar3 = zVar.i;
                    if (iVar3.f2204k == null) {
                        iVar3.f2204k = new k.h(iVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f1581f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f1580e.setBackgroundResource(zVar.f1578b);
                ViewParent parent = zVar.f1581f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f1581f);
                }
                zVar.f1580e.addView(zVar.f1581f, layoutParams2);
                if (!zVar.f1581f.hasFocus()) {
                    zVar.f1581f.requestFocus();
                }
            }
            zVar.f1587n = true;
            return;
        }
        View view2 = zVar.f1582g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f1585l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f1579c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f1580e, layoutParams3);
            zVar.f1586m = true;
            if (i4 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f1585l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f1579c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f1580e, layoutParams32);
        zVar.f1586m = true;
        if (i4 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        k.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f1584k || F(zVar, keyEvent)) && (mVar = zVar.h) != null) {
            return mVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(z zVar, KeyEvent keyEvent) {
        h1 h1Var;
        h1 h1Var2;
        Resources.Theme theme;
        h1 h1Var3;
        h1 h1Var4;
        if (!this.W) {
            boolean z4 = zVar.f1584k;
            int i = zVar.f1577a;
            if (z4) {
                return true;
            }
            z zVar2 = this.S;
            if (zVar2 != null && zVar2 != zVar) {
                p(zVar2, false);
            }
            Window.Callback callback = this.f1460q.getCallback();
            if (callback != null) {
                zVar.f1582g = callback.onCreatePanelView(i);
            }
            boolean z5 = i == 0 || i == 108;
            if (z5 && (h1Var4 = this.f1466w) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var4;
                actionBarOverlayLayout.k();
                ((a3) actionBarOverlayLayout.f310j).f2399l = true;
            }
            if (zVar.f1582g == null) {
                k.m mVar = zVar.h;
                if (mVar == null || zVar.f1588o) {
                    if (mVar == null) {
                        Context context = this.f1459p;
                        if ((i == 0 || i == 108) && this.f1466w != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.gdmhkmf.belbet.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.gdmhkmf.belbet.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.gdmhkmf.belbet.R.attr.actionBarWidgetTheme, typedValue, true);
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
                        mVar2.f2214e = this;
                        k.m mVar3 = zVar.h;
                        if (mVar2 != mVar3) {
                            if (mVar3 != null) {
                                mVar3.r(zVar.i);
                            }
                            zVar.h = mVar2;
                            k.i iVar = zVar.i;
                            if (iVar != null) {
                                mVar2.b(iVar, mVar2.f2211a);
                            }
                        }
                    }
                    if (z5 && (h1Var2 = this.f1466w) != null) {
                        if (this.f1467x == null) {
                            this.f1467x = new q(this, 2);
                        }
                        ((ActionBarOverlayLayout) h1Var2).l(zVar.h, this.f1467x);
                    }
                    zVar.h.w();
                    if (callback.onCreatePanelMenu(i, zVar.h)) {
                        zVar.f1588o = false;
                    } else {
                        k.m mVar4 = zVar.h;
                        if (mVar4 != null) {
                            if (mVar4 != null) {
                                mVar4.r(zVar.i);
                            }
                            zVar.h = null;
                        }
                        if (z5 && (h1Var = this.f1466w) != null) {
                            ((ActionBarOverlayLayout) h1Var).l(null, this.f1467x);
                        }
                    }
                }
                zVar.h.w();
                Bundle bundle = zVar.f1589p;
                if (bundle != null) {
                    zVar.h.s(bundle);
                    zVar.f1589p = null;
                }
                if (!callback.onPreparePanel(0, zVar.f1582g, zVar.h)) {
                    if (z5 && (h1Var3 = this.f1466w) != null) {
                        ((ActionBarOverlayLayout) h1Var3).l(null, this.f1467x);
                    }
                    zVar.h.v();
                    return false;
                }
                zVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                zVar.h.v();
            }
            zVar.f1584k = true;
            zVar.f1585l = false;
            this.S = zVar;
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
            boolean z4 = false;
            if (this.f1456l0 != null && (x(0).f1586m || this.f1469z != null)) {
                z4 = true;
            }
            if (z4 && this.f1457m0 == null) {
                this.f1457m0 = u.b(this.f1456l0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.f1457m0) == null) {
                    return;
                }
                u.c(this.f1456l0, onBackInvokedCallback);
                this.f1457m0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f1459p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof a0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.o
    public final void c() {
        String str;
        this.U = true;
        k(false, true);
        v();
        Object obj = this.f1458o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = c0.c.d(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                k0 k0Var = this.f1463t;
                if (k0Var == null) {
                    this.f1453h0 = true;
                } else {
                    k0Var.o0(true);
                }
            }
            synchronized (o.f1562m) {
                o.e(this);
                o.f1561l.add(new WeakReference(this));
            }
        }
        this.X = new Configuration(this.f1459p.getResources().getConfiguration());
        this.V = true;
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
        if (this.f1458o instanceof Activity) {
            synchronized (o.f1562m) {
                o.e(this);
            }
        }
        if (this.f1450e0) {
            this.f1460q.getDecorView().removeCallbacks(this.f1452g0);
        }
        this.W = true;
        if (this.Y != -100) {
            Object obj = this.f1458o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f1444n0.put(this.f1458o.getClass().getName(), Integer.valueOf(this.Y));
                wVar = this.f1449c0;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.d0;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f1444n0.remove(this.f1458o.getClass().getName());
        wVar = this.f1449c0;
        if (wVar != null) {
        }
        wVar2 = this.d0;
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
            return this.f1460q.requestFeature(i);
        }
        G();
        this.M = true;
        return true;
    }

    @Override // g.o
    public final void g(int i) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1459p).inflate(i, viewGroup);
        this.f1461r.a(this.f1460q.getCallback());
    }

    @Override // g.o
    public final void h(View view) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1461r.a(this.f1460q.getCallback());
    }

    @Override // g.o
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1461r.a(this.f1460q.getCallback());
    }

    @Override // g.o
    public final void j(CharSequence charSequence) {
        this.f1465v = charSequence;
        h1 h1Var = this.f1466w;
        if (h1Var != null) {
            h1Var.setWindowTitle(charSequence);
            return;
        }
        k0 k0Var = this.f1463t;
        if (k0Var == null) {
            TextView textView = this.H;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        a3 a3Var = (a3) k0Var.f1537f;
        if (a3Var.f2396g) {
            return;
        }
        Toolbar toolbar = a3Var.f2391a;
        a3Var.h = charSequence;
        if ((a3Var.f2392b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (a3Var.f2396g) {
                p0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(boolean z4, boolean z5) {
        int i;
        Configuration configuration;
        j0.f b2;
        int i4;
        boolean z6;
        Activity activity;
        if (this.W) {
            return false;
        }
        int i5 = this.Y;
        if (i5 == -100) {
            i5 = o.f1558g;
        }
        Context context = this.f1459p;
        int B = B(context, i5);
        int i6 = Build.VERSION.SDK_INT;
        j0.f m4 = i6 < 33 ? m(context) : null;
        if (!z5 && m4 != null) {
            m4 = t.b(context.getResources().getConfiguration());
        }
        Configuration r4 = r(context, B, m4, null, false);
        boolean z7 = this.f1448b0;
        boolean z8 = true;
        Object obj = this.f1458o;
        if (!z7 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.X;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i7 = configuration.uiMode & 48;
                int i8 = r4.uiMode & 48;
                j0.f b5 = t.b(configuration);
                b2 = m4 != null ? null : t.b(r4);
                i4 = i7 == i8 ? 512 : 0;
                if (b2 != null && !b5.equals(b2)) {
                    i4 |= 8196;
                }
                if (((~i) & i4) != 0 && z4 && this.U && ((f1446p0 || this.V) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i9 = Build.VERSION.SDK_INT;
                        if (i9 >= 31 && (i4 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(r4.getLayoutDirection());
                        }
                        if (i9 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new a.j(4, activity));
                        }
                        z6 = true;
                        if (!z6 || i4 == 0) {
                            z8 = z6;
                        } else {
                            boolean z9 = (i4 & i) == i4;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i8;
                            if (b2 != null) {
                                t.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i10 = this.Z;
                            if (i10 != 0) {
                                context.setTheme(i10);
                                context.getTheme().applyStyle(this.Z, true);
                            }
                            if (z9 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).f().f734c.compareTo(androidx.lifecycle.m.h) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.V && !this.W) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b2 != null) {
                            t.c(t.b(context.getResources().getConfiguration()));
                        }
                        if (i5 == 0) {
                            w(context).i();
                        } else {
                            w wVar = this.f1449c0;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i5 == 3) {
                            if (this.d0 == null) {
                                this.d0 = new w(this, context);
                            }
                            this.d0.i();
                        } else {
                            w wVar2 = this.d0;
                            if (wVar2 != null) {
                                wVar2.c();
                            }
                        }
                        return z8;
                    }
                }
                z6 = false;
                if (z6) {
                }
                z8 = z6;
                if (b2 != null) {
                }
                if (i5 == 0) {
                }
                if (i5 == 3) {
                }
                return z8;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i6 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f1447a0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e4);
                this.f1447a0 = 0;
            }
        }
        this.f1448b0 = true;
        i = this.f1447a0;
        configuration = this.X;
        if (configuration == null) {
        }
        int i72 = configuration.uiMode & 48;
        int i82 = r4.uiMode & 48;
        j0.f b52 = t.b(configuration);
        if (m4 != null) {
        }
        if (i72 == i82) {
        }
        if (b2 != null) {
            i4 |= 8196;
        }
        if (((~i) & i4) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z6 = false;
        if (z6) {
        }
        z8 = z6;
        if (b2 != null) {
        }
        if (i5 == 0) {
        }
        if (i5 == 3) {
        }
        return z8;
    }

    public final void l(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f1460q != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f1461r = vVar;
        window.setCallback(vVar);
        Context context = this.f1459p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f1445o0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            l.r a5 = l.r.a();
            synchronized (a5) {
                drawable = a5.f2550a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f1460q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f1456l0) != null) {
            return;
        }
        Object obj = this.f1458o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f1457m0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1457m0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f1456l0 = u.a(activity);
                H();
            }
        }
        this.f1456l0 = null;
        H();
    }

    public final void n(int i, z zVar, k.m mVar) {
        if (mVar == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.R;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                mVar = zVar.h;
            }
        }
        if ((zVar == null || zVar.f1586m) && !this.W) {
            v vVar = this.f1461r;
            Window.Callback callback = this.f1460q.getCallback();
            vVar.getClass();
            try {
                vVar.i = true;
                callback.onPanelClosed(i, mVar);
            } finally {
                vVar.i = false;
            }
        }
    }

    public final void o(k.m mVar) {
        l.j jVar;
        if (this.Q) {
            return;
        }
        this.Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1466w;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((a3) actionBarOverlayLayout.f310j).f2391a.f345f;
        if (actionMenuView != null && (jVar = actionMenuView.f331y) != null) {
            jVar.e();
            l.f fVar = jVar.f2479y;
            if (fVar != null && fVar.b()) {
                fVar.f2273j.dismiss();
            }
        }
        Window.Callback callback = this.f1460q.getCallback();
        if (callback != null && !this.W) {
            callback.onPanelClosed(108, mVar);
        }
        this.Q = false;
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
        throw new UnsupportedOperationException("Method not decompiled: g.a0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(z zVar, boolean z4) {
        y yVar;
        h1 h1Var;
        l.j jVar;
        if (z4 && zVar.f1577a == 0 && (h1Var = this.f1466w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((a3) actionBarOverlayLayout.f310j).f2391a.f345f;
            if (actionMenuView != null && (jVar = actionMenuView.f331y) != null && jVar.h()) {
                o(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1459p.getSystemService("window");
        if (windowManager != null && zVar.f1586m && (yVar = zVar.f1580e) != null) {
            windowManager.removeView(yVar);
            if (z4) {
                n(zVar.f1577a, zVar, null);
            }
        }
        zVar.f1584k = false;
        zVar.f1585l = false;
        zVar.f1586m = false;
        zVar.f1581f = null;
        zVar.f1587n = true;
        if (this.S == zVar) {
            this.S = null;
        }
        if (zVar.f1577a == 0) {
            H();
        }
    }

    @Override // k.k
    public final boolean q(k.m mVar, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f1460q.getCallback();
        if (callback != null && !this.W) {
            k.m k4 = mVar.k();
            z[] zVarArr = this.R;
            int length = zVarArr != null ? zVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    zVar = zVarArr[i];
                    if (zVar != null && zVar.h == k4) {
                        break;
                    }
                    i++;
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f1577a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r7.e() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0102, code lost:
    
        if (r7.l() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(KeyEvent keyEvent) {
        View decorView;
        boolean z4;
        boolean z5;
        ActionMenuView actionMenuView;
        l.j jVar;
        Object obj = this.f1458o;
        if ((!(obj instanceof n0.l) && !(obj instanceof f)) || (decorView = this.f1460q.getDecorView()) == null || !b4.d.s(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                v vVar = this.f1461r;
                Window.Callback callback = this.f1460q.getCallback();
                vVar.getClass();
                try {
                    vVar.h = true;
                } finally {
                    vVar.h = false;
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
                        z x4 = x(0);
                        if (!x4.f1586m) {
                            F(x4, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f1469z == null) {
                        z x5 = x(0);
                        h1 h1Var = this.f1466w;
                        Context context = this.f1459p;
                        if (h1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var;
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((a3) actionBarOverlayLayout.f310j).f2391a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f345f) != null && actionMenuView.f330x && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1466w;
                                actionBarOverlayLayout2.k();
                                ActionMenuView actionMenuView2 = ((a3) actionBarOverlayLayout2.f310j).f2391a.f345f;
                                if (actionMenuView2 == null || (jVar = actionMenuView2.f331y) == null || !jVar.h()) {
                                    if (!this.W && F(x5, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1466w;
                                        actionBarOverlayLayout3.k();
                                        ActionMenuView actionMenuView3 = ((a3) actionBarOverlayLayout3.f310j).f2391a.f345f;
                                        if (actionMenuView3 != null) {
                                            l.j jVar2 = actionMenuView3.f331y;
                                            if (jVar2 != null) {
                                            }
                                        }
                                    }
                                    z4 = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1466w;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView4 = ((a3) actionBarOverlayLayout4.f310j).f2391a.f345f;
                                    if (actionMenuView4 != null) {
                                        l.j jVar3 = actionMenuView4.f331y;
                                        if (jVar3 != null) {
                                        }
                                    }
                                    z4 = false;
                                }
                                if (z4) {
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
                        boolean z6 = x5.f1586m;
                        if (z6 || x5.f1585l) {
                            p(x5, true);
                            z4 = z6;
                            if (z4) {
                            }
                        } else {
                            if (x5.f1584k) {
                                if (x5.f1588o) {
                                    x5.f1584k = false;
                                    z5 = F(x5, keyEvent);
                                } else {
                                    z5 = true;
                                }
                                if (z5) {
                                    D(x5, keyEvent);
                                    z4 = true;
                                    if (z4) {
                                    }
                                }
                            }
                            z4 = false;
                            if (z4) {
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
        z x4 = x(i);
        if (x4.h != null) {
            Bundle bundle = new Bundle();
            x4.h.t(bundle);
            if (bundle.size() > 0) {
                x4.f1589p = bundle;
            }
            x4.h.w();
            x4.h.clear();
        }
        x4.f1588o = true;
        x4.f1587n = true;
        if ((i == 108 || i == 0) && this.f1466w != null) {
            z x5 = x(0);
            x5.f1584k = false;
            F(x5, null);
        }
    }

    public final void u() {
        ViewGroup viewGroup;
        if (this.F) {
            return;
        }
        Context context = this.f1459p;
        int[] iArr = f.a.f1396j;
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
        this.O = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        v();
        this.f1460q.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.P) {
            viewGroup = this.N ? (ViewGroup) from.inflate(com.gdmhkmf.belbet.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.gdmhkmf.belbet.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.O) {
            viewGroup = (ViewGroup) from.inflate(com.gdmhkmf.belbet.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.M = false;
            this.L = false;
        } else if (this.L) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.gdmhkmf.belbet.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.c(context, typedValue.resourceId) : context).inflate(com.gdmhkmf.belbet.R.layout.abc_screen_toolbar, (ViewGroup) null);
            h1 h1Var = (h1) viewGroup.findViewById(com.gdmhkmf.belbet.R.id.decor_content_parent);
            this.f1466w = h1Var;
            h1Var.setWindowCallback(this.f1460q.getCallback());
            if (this.M) {
                ((ActionBarOverlayLayout) this.f1466w).j(109);
            }
            if (this.J) {
                ((ActionBarOverlayLayout) this.f1466w).j(2);
            }
            if (this.K) {
                ((ActionBarOverlayLayout) this.f1466w).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.L + ", windowActionBarOverlay: " + this.M + ", android:windowIsFloating: " + this.O + ", windowActionModeOverlay: " + this.N + ", windowNoTitle: " + this.P + " }");
        }
        q qVar = new q(this, i);
        WeakHashMap weakHashMap = p0.f2816a;
        n0.h0.c(viewGroup, qVar);
        if (this.f1466w == null) {
            this.H = (TextView) viewGroup.findViewById(com.gdmhkmf.belbet.R.id.title);
        }
        boolean z4 = f3.f2448a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.gdmhkmf.belbet.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1460q.findViewById(R.id.content);
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
        this.f1460q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i4));
        this.G = viewGroup;
        Object obj = this.f1458o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1465v;
        if (!TextUtils.isEmpty(title)) {
            h1 h1Var2 = this.f1466w;
            if (h1Var2 != null) {
                h1Var2.setWindowTitle(title);
            } else {
                k0 k0Var = this.f1463t;
                if (k0Var != null) {
                    a3 a3Var = (a3) k0Var.f1537f;
                    if (!a3Var.f2396g) {
                        Toolbar toolbar = a3Var.f2391a;
                        a3Var.h = title;
                        if ((a3Var.f2392b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (a3Var.f2396g) {
                                p0.n(toolbar.getRootView(), title);
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
        View decorView = this.f1460q.getDecorView();
        contentFrameLayout2.f340l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        z x4 = x(0);
        if (this.W || x4.h != null) {
            return;
        }
        A(108);
    }

    public final void v() {
        if (this.f1460q == null) {
            Object obj = this.f1458o;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f1460q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final androidx.fragment.app.j w(Context context) {
        if (this.f1449c0 == null) {
            if (androidx.emoji2.text.t.d == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                androidx.emoji2.text.t tVar = new androidx.emoji2.text.t();
                tVar.f474c = new h0();
                tVar.f472a = applicationContext;
                tVar.f473b = locationManager;
                androidx.emoji2.text.t.d = tVar;
            }
            this.f1449c0 = new w(this, androidx.emoji2.text.t.d);
        }
        return this.f1449c0;
    }

    public final z x(int i) {
        z[] zVarArr = this.R;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.R = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f1577a = i;
        zVar2.f1587n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void y() {
        u();
        if (this.L && this.f1463t == null) {
            Object obj = this.f1458o;
            if (obj instanceof Activity) {
                this.f1463t = new k0((Activity) obj, this.M);
            } else if (obj instanceof Dialog) {
                this.f1463t = new k0((Dialog) obj);
            }
            k0 k0Var = this.f1463t;
            if (k0Var != null) {
                k0Var.o0(this.f1453h0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // k.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(k.m mVar) {
        ActionMenuView actionMenuView;
        l.j jVar;
        l.j jVar2;
        l.j jVar3;
        h1 h1Var = this.f1466w;
        if (h1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((a3) actionBarOverlayLayout.f310j).f2391a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f345f) != null && actionMenuView.f330x) {
                if (ViewConfiguration.get(this.f1459p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1466w;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((a3) actionBarOverlayLayout2.f310j).f2391a.f345f;
                    if (actionMenuView2 != null) {
                        l.j jVar4 = actionMenuView2.f331y;
                        if (jVar4 != null) {
                            if (jVar4.f2480z == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f1460q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1466w;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((a3) actionBarOverlayLayout3.f310j).f2391a.f345f;
                if (actionMenuView3 != null && (jVar2 = actionMenuView3.f331y) != null && jVar2.h()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1466w;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((a3) actionBarOverlayLayout4.f310j).f2391a.f345f;
                    if (actionMenuView4 != null && (jVar3 = actionMenuView4.f331y) != null) {
                        jVar3.e();
                    }
                    if (this.W) {
                        return;
                    }
                    callback.onPanelClosed(108, x(0).h);
                    return;
                }
                if (callback == null || this.W) {
                    return;
                }
                if (this.f1450e0 && (1 & this.f1451f0) != 0) {
                    View decorView = this.f1460q.getDecorView();
                    p pVar = this.f1452g0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z x4 = x(0);
                k.m mVar2 = x4.h;
                if (mVar2 == null || x4.f1588o || !callback.onPreparePanel(0, x4.f1582g, mVar2)) {
                    return;
                }
                callback.onMenuOpened(108, x4.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f1466w;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((a3) actionBarOverlayLayout5.f310j).f2391a.f345f;
                if (actionMenuView5 == null || (jVar = actionMenuView5.f331y) == null) {
                    return;
                }
                jVar.l();
                return;
            }
        }
        z x5 = x(0);
        x5.f1587n = true;
        p(x5, false);
        D(x5, null);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
