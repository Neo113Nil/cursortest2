package i;

import I.InterfaceC0115k;
import I.T;
import I.Y;
import a.AbstractC0169a;
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
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0249o;
import androidx.lifecycle.InterfaceC0256w;
import h.AbstractC0454a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC0646b;
import l.C0649e;
import l.C0650f;
import l.InterfaceC0645a;
import n.C0708f;
import n.C0716j;
import n.C0733s;
import n.InterfaceC0723m0;
import n.s1;
import n.z1;
import u.C0939j;

/* renamed from: i.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0500B extends AbstractC0529p implements m.k, LayoutInflater.Factory2 {

    /* renamed from: p0, reason: collision with root package name */
    public static final C0939j f5302p0 = new C0939j(0);

    /* renamed from: q0, reason: collision with root package name */
    public static final int[] f5303q0 = {R.attr.windowBackground};
    public static final boolean r0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: s0, reason: collision with root package name */
    public static final boolean f5304s0 = true;

    /* renamed from: A, reason: collision with root package name */
    public C0531r f5305A;

    /* renamed from: B, reason: collision with root package name */
    public C0532s f5306B;

    /* renamed from: C, reason: collision with root package name */
    public AbstractC0646b f5307C;

    /* renamed from: D, reason: collision with root package name */
    public ActionBarContextView f5308D;

    /* renamed from: E, reason: collision with root package name */
    public PopupWindow f5309E;

    /* renamed from: F, reason: collision with root package name */
    public RunnableC0530q f5310F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5312H;

    /* renamed from: I, reason: collision with root package name */
    public ViewGroup f5313I;

    /* renamed from: J, reason: collision with root package name */
    public TextView f5314J;

    /* renamed from: K, reason: collision with root package name */
    public View f5315K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5316L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5317M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5318N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f5319O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5320P;
    public boolean Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5321R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5322S;

    /* renamed from: T, reason: collision with root package name */
    public C0499A[] f5323T;

    /* renamed from: U, reason: collision with root package name */
    public C0499A f5324U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f5325V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f5326W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f5327X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f5328Y;

    /* renamed from: Z, reason: collision with root package name */
    public Configuration f5329Z;

    /* renamed from: a0, reason: collision with root package name */
    public final int f5330a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f5331b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f5332c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f5333d0;

    /* renamed from: e0, reason: collision with root package name */
    public C0537x f5334e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0537x f5335f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f5336g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f5337h0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f5339j0;

    /* renamed from: k0, reason: collision with root package name */
    public Rect f5340k0;

    /* renamed from: l0, reason: collision with root package name */
    public Rect f5341l0;

    /* renamed from: m0, reason: collision with root package name */
    public C0503E f5342m0;

    /* renamed from: n0, reason: collision with root package name */
    public OnBackInvokedDispatcher f5343n0;

    /* renamed from: o0, reason: collision with root package name */
    public OnBackInvokedCallback f5344o0;

    /* renamed from: r, reason: collision with root package name */
    public final Object f5345r;

    /* renamed from: s, reason: collision with root package name */
    public final Context f5346s;

    /* renamed from: t, reason: collision with root package name */
    public Window f5347t;

    /* renamed from: u, reason: collision with root package name */
    public WindowCallbackC0536w f5348u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f5349v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC0514a f5350w;

    /* renamed from: x, reason: collision with root package name */
    public l.j f5351x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f5352y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0723m0 f5353z;

    /* renamed from: G, reason: collision with root package name */
    public Y f5311G = null;

    /* renamed from: i0, reason: collision with root package name */
    public final RunnableC0530q f5338i0 = new RunnableC0530q(this, 0);

    public LayoutInflaterFactory2C0500B(Context context, Window window, InterfaceC0526m interfaceC0526m, Object obj) {
        AbstractActivityC0525l abstractActivityC0525l = null;
        this.f5330a0 = -100;
        this.f5346s = context;
        this.f5349v = interfaceC0526m;
        this.f5345r = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC0525l)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC0525l = (AbstractActivityC0525l) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC0525l != null) {
                this.f5330a0 = ((LayoutInflaterFactory2C0500B) abstractActivityC0525l.getDelegate()).f5330a0;
            }
        }
        if (this.f5330a0 == -100) {
            String name = this.f5345r.getClass().getName();
            C0939j c0939j = f5302p0;
            Integer num = (Integer) c0939j.get(name);
            if (num != null) {
                this.f5330a0 = num.intValue();
                c0939j.remove(this.f5345r.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C0733s.c();
    }

    public static E.f q(Context context) {
        E.f fVar;
        E.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = AbstractC0529p.f5472i) == null) {
            return null;
        }
        E.g gVar = fVar.f654a;
        E.f b7 = AbstractC0534u.b(context.getApplicationContext().getResources().getConfiguration());
        if (gVar.f655a.isEmpty()) {
            fVar2 = E.f.f653b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < b7.f654a.f655a.size() + gVar.f655a.size()) {
                Locale locale = i2 < gVar.f655a.size() ? gVar.f655a.get(i2) : b7.f654a.f655a.get(i2 - gVar.f655a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            fVar2 = new E.f(new E.g(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f654a.f655a.isEmpty() ? b7 : fVar2;
    }

    public static Configuration u(Context context, int i2, E.f fVar, Configuration configuration, boolean z7) {
        int i5 = i2 != 1 ? i2 != 2 ? z7 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            AbstractC0534u.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final C0499A A(int i2) {
        C0499A[] c0499aArr = this.f5323T;
        if (c0499aArr == null || c0499aArr.length <= i2) {
            C0499A[] c0499aArr2 = new C0499A[i2 + 1];
            if (c0499aArr != null) {
                System.arraycopy(c0499aArr, 0, c0499aArr2, 0, c0499aArr.length);
            }
            this.f5323T = c0499aArr2;
            c0499aArr = c0499aArr2;
        }
        C0499A c0499a = c0499aArr[i2];
        if (c0499a != null) {
            return c0499a;
        }
        C0499A c0499a2 = new C0499A();
        c0499a2.f5287a = i2;
        c0499a2.f5299n = false;
        c0499aArr[i2] = c0499a2;
        return c0499a2;
    }

    public final void B() {
        x();
        if (this.f5318N && this.f5350w == null) {
            Object obj = this.f5345r;
            if (obj instanceof Activity) {
                this.f5350w = new C0513O((Activity) obj, this.f5319O);
            } else if (obj instanceof Dialog) {
                this.f5350w = new C0513O((Dialog) obj);
            }
            AbstractC0514a abstractC0514a = this.f5350w;
            if (abstractC0514a != null) {
                abstractC0514a.o(this.f5339j0);
            }
        }
    }

    public final void C(int i2) {
        this.f5337h0 = (1 << i2) | this.f5337h0;
        if (this.f5336g0) {
            return;
        }
        View decorView = this.f5347t.getDecorView();
        WeakHashMap weakHashMap = T.f1153a;
        decorView.postOnAnimation(this.f5338i0);
        this.f5336g0 = true;
    }

    public final int D(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f5335f0 == null) {
                            this.f5335f0 = new C0537x(this, context);
                        }
                        return this.f5335f0.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return z(context).e();
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean E() {
        boolean z7 = this.f5325V;
        this.f5325V = false;
        C0499A A7 = A(0);
        if (!A7.f5298m) {
            AbstractC0646b abstractC0646b = this.f5307C;
            if (abstractC0646b != null) {
                abstractC0646b.a();
                return true;
            }
            B();
            AbstractC0514a abstractC0514a = this.f5350w;
            if (abstractC0514a == null || !abstractC0514a.b()) {
                return false;
            }
        } else if (!z7) {
            t(A7, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0175, code lost:
    
        if (r2.f6402n.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(C0499A c0499a, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        boolean z7 = c0499a.f5298m;
        int i5 = c0499a.f5287a;
        if (z7 || this.f5328Y) {
            return;
        }
        Context context = this.f5346s;
        if (i5 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f5347t.getCallback();
        if (callback != null && !callback.onMenuOpened(i5, c0499a.f5294h)) {
            t(c0499a, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !H(c0499a, keyEvent)) {
            return;
        }
        C0539z c0539z = c0499a.f5291e;
        if (c0539z == null || c0499a.f5299n) {
            if (c0539z == null) {
                B();
                AbstractC0514a abstractC0514a = this.f5350w;
                Context e7 = abstractC0514a != null ? abstractC0514a.e() : null;
                if (e7 != null) {
                    context = e7;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.icefishing.icefish.ice.fishing.s294s.R.attr.actionBarPopupTheme, typedValue, true);
                int i7 = typedValue.resourceId;
                if (i7 != 0) {
                    newTheme.applyStyle(i7, true);
                }
                newTheme.resolveAttribute(com.icefishing.icefish.ice.fishing.s294s.R.attr.panelMenuListTheme, typedValue, true);
                int i8 = typedValue.resourceId;
                if (i8 != 0) {
                    newTheme.applyStyle(i8, true);
                } else {
                    newTheme.applyStyle(com.icefishing.icefish.ice.fishing.s294s.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0649e c0649e = new C0649e(context, 0);
                c0649e.getTheme().setTo(newTheme);
                c0499a.j = c0649e;
                TypedArray obtainStyledAttributes = c0649e.obtainStyledAttributes(AbstractC0454a.j);
                c0499a.f5288b = obtainStyledAttributes.getResourceId(86, 0);
                c0499a.f5290d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                c0499a.f5291e = new C0539z(this, c0499a.j);
                c0499a.f5289c = 81;
            } else if (c0499a.f5299n && c0539z.getChildCount() > 0) {
                c0499a.f5291e.removeAllViews();
            }
            View view = c0499a.f5293g;
            if (view == null) {
                if (c0499a.f5294h != null) {
                    if (this.f5306B == null) {
                        this.f5306B = new C0532s(this);
                    }
                    C0532s c0532s = this.f5306B;
                    if (c0499a.f5295i == null) {
                        m.i iVar = new m.i(c0499a.j);
                        c0499a.f5295i = iVar;
                        iVar.f6401m = c0532s;
                        m.m mVar = c0499a.f5294h;
                        mVar.b(iVar, mVar.f6410a);
                    }
                    m.i iVar2 = c0499a.f5295i;
                    C0539z c0539z2 = c0499a.f5291e;
                    if (iVar2.f6400l == null) {
                        iVar2.f6400l = (ExpandedMenuView) iVar2.f6398e.inflate(com.icefishing.icefish.ice.fishing.s294s.R.layout.abc_expanded_menu_layout, (ViewGroup) c0539z2, false);
                        if (iVar2.f6402n == null) {
                            iVar2.f6402n = new m.h(iVar2);
                        }
                        iVar2.f6400l.setAdapter((ListAdapter) iVar2.f6402n);
                        iVar2.f6400l.setOnItemClickListener(iVar2);
                    }
                    ExpandedMenuView expandedMenuView = iVar2.f6400l;
                    c0499a.f5292f = expandedMenuView;
                }
                c0499a.f5299n = true;
                return;
            }
            c0499a.f5292f = view;
            if (c0499a.f5292f != null) {
                if (c0499a.f5293g == null) {
                    m.i iVar3 = c0499a.f5295i;
                    if (iVar3.f6402n == null) {
                        iVar3.f6402n = new m.h(iVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = c0499a.f5292f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0499a.f5291e.setBackgroundResource(c0499a.f5288b);
                ViewParent parent = c0499a.f5292f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c0499a.f5292f);
                }
                c0499a.f5291e.addView(c0499a.f5292f, layoutParams2);
                if (!c0499a.f5292f.hasFocus()) {
                    c0499a.f5292f.requestFocus();
                }
            }
            c0499a.f5299n = true;
            return;
        }
        View view2 = c0499a.f5293g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i2 = -1;
            c0499a.f5297l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = c0499a.f5289c;
            layoutParams3.windowAnimations = c0499a.f5290d;
            windowManager.addView(c0499a.f5291e, layoutParams3);
            c0499a.f5298m = true;
            if (i5 != 0) {
                J();
                return;
            }
            return;
        }
        i2 = -2;
        c0499a.f5297l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = c0499a.f5289c;
        layoutParams32.windowAnimations = c0499a.f5290d;
        windowManager.addView(c0499a.f5291e, layoutParams32);
        c0499a.f5298m = true;
        if (i5 != 0) {
        }
    }

    public final boolean G(C0499A c0499a, int i2, KeyEvent keyEvent) {
        m.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0499a.f5296k || H(c0499a, keyEvent)) && (mVar = c0499a.f5294h) != null) {
            return mVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.f5294h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(C0499A c0499a, KeyEvent keyEvent) {
        InterfaceC0723m0 interfaceC0723m0;
        InterfaceC0723m0 interfaceC0723m02;
        Resources.Theme theme;
        InterfaceC0723m0 interfaceC0723m03;
        InterfaceC0723m0 interfaceC0723m04;
        if (!this.f5328Y) {
            boolean z7 = c0499a.f5296k;
            int i2 = c0499a.f5287a;
            if (z7) {
                return true;
            }
            C0499A c0499a2 = this.f5324U;
            if (c0499a2 != null && c0499a2 != c0499a) {
                t(c0499a2, false);
            }
            Window.Callback callback = this.f5347t.getCallback();
            if (callback != null) {
                c0499a.f5293g = callback.onCreatePanelView(i2);
            }
            boolean z8 = i2 == 0 || i2 == 108;
            if (z8 && (interfaceC0723m04 = this.f5353z) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0723m04;
                actionBarOverlayLayout.e();
                ((s1) actionBarOverlayLayout.f3181m).f6896l = true;
            }
            if (c0499a.f5293g == null && (!z8 || !(this.f5350w instanceof C0508J))) {
                m.m mVar = c0499a.f5294h;
                if (mVar == null || c0499a.f5300o) {
                    if (mVar == null) {
                        Context context = this.f5346s;
                        if ((i2 == 0 || i2 == 108) && this.f5353z != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.icefishing.icefish.ice.fishing.s294s.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.icefishing.icefish.ice.fishing.s294s.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.icefishing.icefish.ice.fishing.s294s.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                C0649e c0649e = new C0649e(context, 0);
                                c0649e.getTheme().setTo(theme);
                                context = c0649e;
                            }
                        }
                        m.m mVar2 = new m.m(context);
                        mVar2.f6414e = this;
                        m.m mVar3 = c0499a.f5294h;
                        if (mVar2 != mVar3) {
                            if (mVar3 != null) {
                                mVar3.r(c0499a.f5295i);
                            }
                            c0499a.f5294h = mVar2;
                            m.i iVar = c0499a.f5295i;
                            if (iVar != null) {
                                mVar2.b(iVar, mVar2.f6410a);
                            }
                        }
                    }
                    if (z8 && (interfaceC0723m02 = this.f5353z) != null) {
                        if (this.f5305A == null) {
                            this.f5305A = new C0531r(this);
                        }
                        ((ActionBarOverlayLayout) interfaceC0723m02).f(c0499a.f5294h, this.f5305A);
                    }
                    c0499a.f5294h.w();
                    if (callback.onCreatePanelMenu(i2, c0499a.f5294h)) {
                        c0499a.f5300o = false;
                    } else {
                        m.m mVar4 = c0499a.f5294h;
                        if (mVar4 != null) {
                            if (mVar4 != null) {
                                mVar4.r(c0499a.f5295i);
                            }
                            c0499a.f5294h = null;
                        }
                        if (z8 && (interfaceC0723m0 = this.f5353z) != null) {
                            ((ActionBarOverlayLayout) interfaceC0723m0).f(null, this.f5305A);
                        }
                    }
                }
                c0499a.f5294h.w();
                Bundle bundle = c0499a.f5301p;
                if (bundle != null) {
                    c0499a.f5294h.s(bundle);
                    c0499a.f5301p = null;
                }
                if (!callback.onPreparePanel(0, c0499a.f5293g, c0499a.f5294h)) {
                    if (z8 && (interfaceC0723m03 = this.f5353z) != null) {
                        ((ActionBarOverlayLayout) interfaceC0723m03).f(null, this.f5305A);
                    }
                    c0499a.f5294h.v();
                    return false;
                }
                c0499a.f5294h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c0499a.f5294h.v();
            }
            c0499a.f5296k = true;
            c0499a.f5297l = false;
            this.f5324U = c0499a;
            return true;
        }
        return false;
    }

    public final void I() {
        if (this.f5312H) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z7 = false;
            if (this.f5343n0 != null && (A(0).f5298m || this.f5307C != null)) {
                z7 = true;
            }
            if (z7 && this.f5344o0 == null) {
                this.f5344o0 = AbstractC0535v.b(this.f5343n0, this);
            } else {
                if (z7 || (onBackInvokedCallback = this.f5344o0) == null) {
                    return;
                }
                AbstractC0535v.c(this.f5343n0, onBackInvokedCallback);
            }
        }
    }

    @Override // i.AbstractC0529p
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f5346s);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0500B) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // i.AbstractC0529p
    public final void b() {
        if (this.f5350w != null) {
            B();
            if (this.f5350w.g()) {
                return;
            }
            C(0);
        }
    }

    @Override // m.k
    public final boolean d(m.m mVar, MenuItem menuItem) {
        C0499A c0499a;
        Window.Callback callback = this.f5347t.getCallback();
        if (callback != null && !this.f5328Y) {
            m.m k7 = mVar.k();
            C0499A[] c0499aArr = this.f5323T;
            int length = c0499aArr != null ? c0499aArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    c0499a = c0499aArr[i2];
                    if (c0499a != null && c0499a.f5294h == k7) {
                        break;
                    }
                    i2++;
                } else {
                    c0499a = null;
                    break;
                }
            }
            if (c0499a != null) {
                return callback.onMenuItemSelected(c0499a.f5287a, menuItem);
            }
        }
        return false;
    }

    @Override // i.AbstractC0529p
    public final void e() {
        String str;
        this.f5326W = true;
        o(false, true);
        y();
        Object obj = this.f5345r;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = d4.c.t(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0514a abstractC0514a = this.f5350w;
                if (abstractC0514a == null) {
                    this.f5339j0 = true;
                } else {
                    abstractC0514a.o(true);
                }
            }
            synchronized (AbstractC0529p.f5477p) {
                AbstractC0529p.g(this);
                AbstractC0529p.f5476o.add(new WeakReference(this));
            }
        }
        this.f5329Z = new Configuration(this.f5346s.getResources().getConfiguration());
        this.f5327X = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // i.AbstractC0529p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        AbstractC0514a abstractC0514a;
        C0537x c0537x;
        C0537x c0537x2;
        if (this.f5345r instanceof Activity) {
            synchronized (AbstractC0529p.f5477p) {
                AbstractC0529p.g(this);
            }
        }
        if (this.f5336g0) {
            this.f5347t.getDecorView().removeCallbacks(this.f5338i0);
        }
        this.f5328Y = true;
        if (this.f5330a0 != -100) {
            Object obj = this.f5345r;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f5302p0.put(this.f5345r.getClass().getName(), Integer.valueOf(this.f5330a0));
                abstractC0514a = this.f5350w;
                if (abstractC0514a != null) {
                    abstractC0514a.j();
                }
                c0537x = this.f5334e0;
                if (c0537x != null) {
                    c0537x.c();
                }
                c0537x2 = this.f5335f0;
                if (c0537x2 == null) {
                    c0537x2.c();
                    return;
                }
                return;
            }
        }
        f5302p0.remove(this.f5345r.getClass().getName());
        abstractC0514a = this.f5350w;
        if (abstractC0514a != null) {
        }
        c0537x = this.f5334e0;
        if (c0537x != null) {
        }
        c0537x2 = this.f5335f0;
        if (c0537x2 == null) {
        }
    }

    @Override // i.AbstractC0529p
    public final boolean h(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f5321R && i2 == 108) {
            return false;
        }
        if (this.f5318N && i2 == 1) {
            this.f5318N = false;
        }
        if (i2 == 1) {
            I();
            this.f5321R = true;
            return true;
        }
        if (i2 == 2) {
            I();
            this.f5316L = true;
            return true;
        }
        if (i2 == 5) {
            I();
            this.f5317M = true;
            return true;
        }
        if (i2 == 10) {
            I();
            this.f5320P = true;
            return true;
        }
        if (i2 == 108) {
            I();
            this.f5318N = true;
            return true;
        }
        if (i2 != 109) {
            return this.f5347t.requestFeature(i2);
        }
        I();
        this.f5319O = true;
        return true;
    }

    @Override // i.AbstractC0529p
    public final void i(int i2) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f5313I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f5346s).inflate(i2, viewGroup);
        this.f5348u.a(this.f5347t.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.e() != false) goto L20;
     */
    @Override // m.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(m.m mVar) {
        ActionMenuView actionMenuView;
        C0716j c0716j;
        InterfaceC0723m0 interfaceC0723m0 = this.f5353z;
        if (interfaceC0723m0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0723m0;
            actionBarOverlayLayout.e();
            Toolbar toolbar = ((s1) actionBarOverlayLayout.f3181m).f6886a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f3332d) != null && actionMenuView.f3195A) {
                if (ViewConfiguration.get(this.f5346s).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f5353z;
                    actionBarOverlayLayout2.e();
                    ActionMenuView actionMenuView2 = ((s1) actionBarOverlayLayout2.f3181m).f6886a.f3332d;
                    if (actionMenuView2 != null) {
                        C0716j c0716j2 = actionMenuView2.f3196B;
                        if (c0716j2 != null) {
                            if (c0716j2.f6795C == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f5347t.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f5353z;
                actionBarOverlayLayout3.e();
                if (((s1) actionBarOverlayLayout3.f3181m).f6886a.o()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f5353z;
                    actionBarOverlayLayout4.e();
                    ActionMenuView actionMenuView3 = ((s1) actionBarOverlayLayout4.f3181m).f6886a.f3332d;
                    if (actionMenuView3 != null && (c0716j = actionMenuView3.f3196B) != null) {
                        c0716j.c();
                    }
                    if (this.f5328Y) {
                        return;
                    }
                    callback.onPanelClosed(108, A(0).f5294h);
                    return;
                }
                if (callback == null || this.f5328Y) {
                    return;
                }
                if (this.f5336g0 && (1 & this.f5337h0) != 0) {
                    View decorView = this.f5347t.getDecorView();
                    RunnableC0530q runnableC0530q = this.f5338i0;
                    decorView.removeCallbacks(runnableC0530q);
                    runnableC0530q.run();
                }
                C0499A A7 = A(0);
                m.m mVar2 = A7.f5294h;
                if (mVar2 == null || A7.f5300o || !callback.onPreparePanel(0, A7.f5293g, mVar2)) {
                    return;
                }
                callback.onMenuOpened(108, A7.f5294h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f5353z;
                actionBarOverlayLayout5.e();
                ((s1) actionBarOverlayLayout5.f3181m).f6886a.u();
                return;
            }
        }
        C0499A A8 = A(0);
        A8.f5299n = true;
        t(A8, false);
        F(A8, null);
    }

    @Override // i.AbstractC0529p
    public final void k(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f5313I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f5348u.a(this.f5347t.getCallback());
    }

    @Override // i.AbstractC0529p
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f5313I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f5348u.a(this.f5347t.getCallback());
    }

    @Override // i.AbstractC0529p
    public final void m(CharSequence charSequence) {
        this.f5352y = charSequence;
        InterfaceC0723m0 interfaceC0723m0 = this.f5353z;
        if (interfaceC0723m0 != null) {
            interfaceC0723m0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0514a abstractC0514a = this.f5350w;
        if (abstractC0514a != null) {
            abstractC0514a.s(charSequence);
            return;
        }
        TextView textView = this.f5314J;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Type inference failed for: r1v1, types: [i.m, java.lang.Object] */
    @Override // i.AbstractC0529p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0646b n(InterfaceC0645a interfaceC0645a) {
        AbstractC0646b onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC0646b abstractC0646b;
        if (interfaceC0645a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0646b abstractC0646b2 = this.f5307C;
        if (abstractC0646b2 != null) {
            abstractC0646b2.a();
        }
        P0.e eVar = new P0.e(this, 6, interfaceC0645a);
        B();
        AbstractC0514a abstractC0514a = this.f5350w;
        ?? r12 = this.f5349v;
        if (abstractC0514a != null) {
            AbstractC0646b u7 = abstractC0514a.u(eVar);
            this.f5307C = u7;
            if (u7 != null) {
                r12.onSupportActionModeStarted(u7);
            }
        }
        if (this.f5307C == null) {
            Y y7 = this.f5311G;
            if (y7 != null) {
                y7.b();
            }
            AbstractC0646b abstractC0646b3 = this.f5307C;
            if (abstractC0646b3 != null) {
                abstractC0646b3.a();
            }
            if (!this.f5328Y) {
                try {
                    onWindowStartingSupportActionMode = r12.onWindowStartingSupportActionMode(eVar);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    this.f5307C = onWindowStartingSupportActionMode;
                } else {
                    int i2 = 1;
                    if (this.f5308D == null) {
                        boolean z7 = this.Q;
                        Context context = this.f5346s;
                        if (z7) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.icefishing.icefish.ice.fishing.s294s.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                C0649e c0649e = new C0649e(context, 0);
                                c0649e.getTheme().setTo(newTheme);
                                context = c0649e;
                            }
                            this.f5308D = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.icefishing.icefish.ice.fishing.s294s.R.attr.actionModePopupWindowStyle);
                            this.f5309E = popupWindow;
                            popupWindow.setWindowLayoutType(2);
                            this.f5309E.setContentView(this.f5308D);
                            this.f5309E.setWidth(-1);
                            context.getTheme().resolveAttribute(com.icefishing.icefish.ice.fishing.s294s.R.attr.actionBarSize, typedValue, true);
                            this.f5308D.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f5309E.setHeight(-2);
                            this.f5310F = new RunnableC0530q(this, i2);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f5313I.findViewById(com.icefishing.icefish.ice.fishing.s294s.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                B();
                                AbstractC0514a abstractC0514a2 = this.f5350w;
                                Context e7 = abstractC0514a2 != null ? abstractC0514a2.e() : null;
                                if (e7 != null) {
                                    context = e7;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.f5308D = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.f5308D != null) {
                        Y y8 = this.f5311G;
                        if (y8 != null) {
                            y8.b();
                        }
                        this.f5308D.e();
                        Context context2 = this.f5308D.getContext();
                        ActionBarContextView actionBarContextView = this.f5308D;
                        C0650f c0650f = new C0650f();
                        c0650f.f6210i = context2;
                        c0650f.f6211l = actionBarContextView;
                        c0650f.f6212m = eVar;
                        m.m mVar = new m.m(actionBarContextView.getContext());
                        mVar.f6420l = 1;
                        c0650f.f6215p = mVar;
                        mVar.f6414e = c0650f;
                        if (((InterfaceC0645a) eVar.f2194e).b(c0650f, mVar)) {
                            c0650f.h();
                            this.f5308D.c(c0650f);
                            this.f5307C = c0650f;
                            if (this.f5312H && (viewGroup = this.f5313I) != null) {
                                WeakHashMap weakHashMap = T.f1153a;
                                if (viewGroup.isLaidOut()) {
                                    this.f5308D.setAlpha(0.0f);
                                    Y a7 = T.a(this.f5308D);
                                    a7.a(1.0f);
                                    this.f5311G = a7;
                                    a7.d(new C0533t(i2, this));
                                    if (this.f5309E != null) {
                                        this.f5347t.getDecorView().post(this.f5310F);
                                    }
                                }
                            }
                            this.f5308D.setAlpha(1.0f);
                            this.f5308D.setVisibility(0);
                            if (this.f5308D.getParent() instanceof View) {
                                View view = (View) this.f5308D.getParent();
                                WeakHashMap weakHashMap2 = T.f1153a;
                                view.requestApplyInsets();
                            }
                            if (this.f5309E != null) {
                            }
                        } else {
                            this.f5307C = null;
                        }
                    }
                }
                abstractC0646b = this.f5307C;
                if (abstractC0646b != null) {
                    r12.onSupportActionModeStarted(abstractC0646b);
                }
                J();
                this.f5307C = this.f5307C;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            abstractC0646b = this.f5307C;
            if (abstractC0646b != null) {
            }
            J();
            this.f5307C = this.f5307C;
        }
        J();
        return this.f5307C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(boolean z7, boolean z8) {
        int i2;
        Configuration configuration;
        E.f b7;
        int i5;
        boolean z9;
        boolean z10;
        boolean z11;
        Object obj;
        Object obj2;
        Activity activity;
        if (this.f5328Y) {
            return false;
        }
        int i7 = this.f5330a0;
        if (i7 == -100) {
            i7 = AbstractC0529p.f5471e;
        }
        Context context = this.f5346s;
        int D7 = D(context, i7);
        int i8 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        E.f q4 = i8 < 33 ? q(context) : null;
        if (!z8 && q4 != null) {
            q4 = AbstractC0534u.b(context.getResources().getConfiguration());
        }
        Configuration u7 = u(context, D7, q4, null, false);
        boolean z12 = this.f5333d0;
        Object obj3 = this.f5345r;
        if (!z12 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i2 = 0;
                configuration = this.f5329Z;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i9 = configuration.uiMode & 48;
                int i10 = u7.uiMode & 48;
                E.f b8 = AbstractC0534u.b(configuration);
                b7 = q4 != null ? null : AbstractC0534u.b(u7);
                i5 = i9 == i10 ? 512 : 0;
                if (b7 != null && !b8.equals(b7)) {
                    i5 |= 8196;
                }
                if (((~i2) & i5) != 0 && z7 && this.f5326W && ((r0 || this.f5327X) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new A.k(23, activity));
                        }
                        z9 = true;
                        if (!z9 || i5 == 0) {
                            z10 = z9;
                        } else {
                            boolean z13 = (i2 & i5) == i5;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i10;
                            if (b7 != null) {
                                AbstractC0534u.d(configuration2, b7);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 < 26 && i11 < 28) {
                                if (!d4.c.f4659h) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        d4.c.f4658g = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e7) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e7);
                                    }
                                    d4.c.f4659h = true;
                                }
                                Field field = d4.c.f4658g;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e8);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!d4.c.f4653b) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                d4.c.f4652a = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e9) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e9);
                                            }
                                            d4.c.f4653b = true;
                                        }
                                        Field field2 = d4.c.f4652a;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e10) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e10);
                                            }
                                            if (obj2 != null) {
                                                if (!d4.c.f4655d) {
                                                    try {
                                                        d4.c.f4654c = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e11) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e11);
                                                    }
                                                    d4.c.f4655d = true;
                                                }
                                                Class cls = d4.c.f4654c;
                                                if (cls != null) {
                                                    if (!d4.c.f4657f) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            d4.c.f4656e = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e12) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e12);
                                                        }
                                                        d4.c.f4657f = true;
                                                    }
                                                    Field field3 = d4.c.f4656e;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e13) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e13);
                                                        }
                                                        if (longSparseArray != null) {
                                                            AbstractC0506H.a(longSparseArray);
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
                            int i12 = this.f5331b0;
                            if (i12 != 0) {
                                context.setTheme(i12);
                                z11 = true;
                                context.getTheme().applyStyle(this.f5331b0, true);
                            } else {
                                z11 = true;
                            }
                            if (z13 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof InterfaceC0256w) {
                                    if (((C0258y) ((InterfaceC0256w) activity2).getLifecycle()).f3922d.a(EnumC0249o.f3908i)) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f5327X && !this.f5328Y) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                            z10 = z11;
                        }
                        if (z10 && (obj3 instanceof AbstractActivityC0525l)) {
                            if ((i5 & 512) != 0) {
                                ((AbstractActivityC0525l) obj3).onNightModeChanged(D7);
                            }
                            if ((i5 & 4) != 0) {
                                ((AbstractActivityC0525l) obj3).onLocalesChanged(q4);
                            }
                        }
                        if (z10 && b7 != null) {
                            AbstractC0534u.c(AbstractC0534u.b(context.getResources().getConfiguration()));
                        }
                        if (i7 == 0) {
                            z(context).h();
                        } else {
                            C0537x c0537x = this.f5334e0;
                            if (c0537x != null) {
                                c0537x.c();
                            }
                        }
                        if (i7 == 3) {
                            if (this.f5335f0 == null) {
                                this.f5335f0 = new C0537x(this, context);
                            }
                            this.f5335f0.h();
                        } else {
                            C0537x c0537x2 = this.f5335f0;
                            if (c0537x2 != null) {
                                c0537x2.c();
                            }
                        }
                        return z10;
                    }
                }
                z9 = false;
                if (z9) {
                }
                z10 = z9;
                if (z10) {
                    if ((i5 & 512) != 0) {
                    }
                    if ((i5 & 4) != 0) {
                    }
                }
                if (z10) {
                    AbstractC0534u.c(AbstractC0534u.b(context.getResources().getConfiguration()));
                }
                if (i7 == 0) {
                }
                if (i7 == 3) {
                }
                return z10;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i8 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f5332c0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e14) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e14);
                this.f5332c0 = 0;
            }
        }
        this.f5333d0 = true;
        i2 = this.f5332c0;
        configuration = this.f5329Z;
        if (configuration == null) {
        }
        int i92 = configuration.uiMode & 48;
        int i102 = u7.uiMode & 48;
        E.f b82 = AbstractC0534u.b(configuration);
        if (q4 != null) {
        }
        if (i92 == i102) {
        }
        if (b7 != null) {
            i5 |= 8196;
        }
        if (((~i2) & i5) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z9 = false;
        if (z9) {
        }
        z10 = z9;
        if (z10) {
        }
        if (z10) {
        }
        if (i7 == 0) {
        }
        if (i7 == 3) {
        }
        return z10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01e4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.LayoutInflaterFactory2C0500B.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f5347t != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC0536w) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC0536w windowCallbackC0536w = new WindowCallbackC0536w(this, callback);
        this.f5348u = windowCallbackC0536w;
        window.setCallback(windowCallbackC0536w);
        Context context = this.f5346s;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f5303q0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0733s a7 = C0733s.a();
            synchronized (a7) {
                drawable = a7.f6881a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f5347t = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f5343n0) != null) {
            return;
        }
        Object obj = this.f5345r;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f5344o0) != null) {
            AbstractC0535v.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f5344o0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f5343n0 = AbstractC0535v.a(activity);
                J();
            }
        }
        this.f5343n0 = null;
        J();
    }

    public final void r(int i2, C0499A c0499a, m.m mVar) {
        if (mVar == null) {
            if (c0499a == null && i2 >= 0) {
                C0499A[] c0499aArr = this.f5323T;
                if (i2 < c0499aArr.length) {
                    c0499a = c0499aArr[i2];
                }
            }
            if (c0499a != null) {
                mVar = c0499a.f5294h;
            }
        }
        if ((c0499a == null || c0499a.f5298m) && !this.f5328Y) {
            WindowCallbackC0536w windowCallbackC0536w = this.f5348u;
            Window.Callback callback = this.f5347t.getCallback();
            windowCallbackC0536w.getClass();
            try {
                windowCallbackC0536w.f5488m = true;
                callback.onPanelClosed(i2, mVar);
            } finally {
                windowCallbackC0536w.f5488m = false;
            }
        }
    }

    public final void s(m.m mVar) {
        C0716j c0716j;
        if (this.f5322S) {
            return;
        }
        this.f5322S = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f5353z;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((s1) actionBarOverlayLayout.f3181m).f6886a.f3332d;
        if (actionMenuView != null && (c0716j = actionMenuView.f3196B) != null) {
            c0716j.c();
            C0708f c0708f = c0716j.f6794B;
            if (c0708f != null && c0708f.b()) {
                c0708f.f6484i.dismiss();
            }
        }
        Window.Callback callback = this.f5347t.getCallback();
        if (callback != null && !this.f5328Y) {
            callback.onPanelClosed(108, mVar);
        }
        this.f5322S = false;
    }

    public final void t(C0499A c0499a, boolean z7) {
        C0539z c0539z;
        InterfaceC0723m0 interfaceC0723m0;
        if (z7 && c0499a.f5287a == 0 && (interfaceC0723m0 = this.f5353z) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0723m0;
            actionBarOverlayLayout.e();
            if (((s1) actionBarOverlayLayout.f3181m).f6886a.o()) {
                s(c0499a.f5294h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f5346s.getSystemService("window");
        if (windowManager != null && c0499a.f5298m && (c0539z = c0499a.f5291e) != null) {
            windowManager.removeView(c0539z);
            if (z7) {
                r(c0499a.f5287a, c0499a, null);
            }
        }
        c0499a.f5296k = false;
        c0499a.f5297l = false;
        c0499a.f5298m = false;
        c0499a.f5292f = null;
        c0499a.f5299n = true;
        if (this.f5324U == c0499a) {
            this.f5324U = null;
        }
        if (c0499a.f5287a == 0) {
            J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r7.c() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        boolean z7;
        boolean z8;
        ActionMenuView actionMenuView;
        Object obj = this.f5345r;
        if ((!(obj instanceof InterfaceC0115k) && !(obj instanceof DialogInterfaceC0522i)) || (decorView = this.f5347t.getDecorView()) == null || !AbstractC0169a.i(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                WindowCallbackC0536w windowCallbackC0536w = this.f5348u;
                Window.Callback callback = this.f5347t.getCallback();
                windowCallbackC0536w.getClass();
                try {
                    windowCallbackC0536w.f5487l = true;
                } finally {
                    windowCallbackC0536w.f5487l = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f5325V = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        C0499A A7 = A(0);
                        if (!A7.f5298m) {
                            H(A7, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f5307C == null) {
                        C0499A A8 = A(0);
                        InterfaceC0723m0 interfaceC0723m0 = this.f5353z;
                        Context context = this.f5346s;
                        if (interfaceC0723m0 != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0723m0;
                            actionBarOverlayLayout.e();
                            Toolbar toolbar = ((s1) actionBarOverlayLayout.f3181m).f6886a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f3332d) != null && actionMenuView.f3195A && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f5353z;
                                actionBarOverlayLayout2.e();
                                if (((s1) actionBarOverlayLayout2.f3181m).f6886a.o()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f5353z;
                                    actionBarOverlayLayout3.e();
                                    ActionMenuView actionMenuView2 = ((s1) actionBarOverlayLayout3.f3181m).f6886a.f3332d;
                                    if (actionMenuView2 != null) {
                                        C0716j c0716j = actionMenuView2.f3196B;
                                        if (c0716j != null) {
                                        }
                                    }
                                } else if (!this.f5328Y && H(A8, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f5353z;
                                    actionBarOverlayLayout4.e();
                                    z7 = ((s1) actionBarOverlayLayout4.f3181m).f6886a.u();
                                    if (z7) {
                                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                                z7 = false;
                                if (z7) {
                                }
                            }
                        }
                        boolean z9 = A8.f5298m;
                        if (z9 || A8.f5297l) {
                            t(A8, true);
                            z7 = z9;
                            if (z7) {
                            }
                        } else {
                            if (A8.f5296k) {
                                if (A8.f5300o) {
                                    A8.f5296k = false;
                                    z8 = H(A8, keyEvent);
                                } else {
                                    z8 = true;
                                }
                                if (z8) {
                                    F(A8, keyEvent);
                                    z7 = true;
                                    if (z7) {
                                    }
                                }
                            }
                            z7 = false;
                            if (z7) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!E()) {
                return false;
            }
        }
        return true;
    }

    public final void w(int i2) {
        C0499A A7 = A(i2);
        if (A7.f5294h != null) {
            Bundle bundle = new Bundle();
            A7.f5294h.t(bundle);
            if (bundle.size() > 0) {
                A7.f5301p = bundle;
            }
            A7.f5294h.w();
            A7.f5294h.clear();
        }
        A7.f5300o = true;
        A7.f5299n = true;
        if ((i2 == 108 || i2 == 0) && this.f5353z != null) {
            C0499A A8 = A(0);
            A8.f5296k = false;
            H(A8, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f5312H) {
            return;
        }
        Context context = this.f5346s;
        int[] iArr = AbstractC0454a.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
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
        this.Q = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        y();
        this.f5347t.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f5321R) {
            viewGroup = this.f5320P ? (ViewGroup) from.inflate(com.icefishing.icefish.ice.fishing.s294s.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.icefishing.icefish.ice.fishing.s294s.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.Q) {
            viewGroup = (ViewGroup) from.inflate(com.icefishing.icefish.ice.fishing.s294s.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f5319O = false;
            this.f5318N = false;
        } else if (this.f5318N) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.icefishing.icefish.ice.fishing.s294s.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0649e(context, typedValue.resourceId) : context).inflate(com.icefishing.icefish.ice.fishing.s294s.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0723m0 interfaceC0723m0 = (InterfaceC0723m0) viewGroup.findViewById(com.icefishing.icefish.ice.fishing.s294s.R.id.decor_content_parent);
            this.f5353z = interfaceC0723m0;
            interfaceC0723m0.setWindowCallback(this.f5347t.getCallback());
            if (this.f5319O) {
                ((ActionBarOverlayLayout) this.f5353z).d(109);
            }
            if (this.f5316L) {
                ((ActionBarOverlayLayout) this.f5353z).d(2);
            }
            if (this.f5317M) {
                ((ActionBarOverlayLayout) this.f5353z).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f5318N + ", windowActionBarOverlay: " + this.f5319O + ", android:windowIsFloating: " + this.Q + ", windowActionModeOverlay: " + this.f5320P + ", windowNoTitle: " + this.f5321R + " }");
        }
        C0531r c0531r = new C0531r(this);
        WeakHashMap weakHashMap = T.f1153a;
        I.K.c(viewGroup, c0531r);
        if (this.f5353z == null) {
            this.f5314J = (TextView) viewGroup.findViewById(com.icefishing.icefish.ice.fishing.s294s.R.id.title);
        }
        Method method = z1.f6967a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e8) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e8);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.icefishing.icefish.ice.fishing.s294s.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f5347t.findViewById(R.id.content);
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
        this.f5347t.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0532s(this));
        this.f5313I = viewGroup;
        Object obj = this.f5345r;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f5352y;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0723m0 interfaceC0723m02 = this.f5353z;
            if (interfaceC0723m02 != null) {
                interfaceC0723m02.setWindowTitle(title);
            } else {
                AbstractC0514a abstractC0514a = this.f5350w;
                if (abstractC0514a != null) {
                    abstractC0514a.s(title);
                } else {
                    TextView textView = this.f5314J;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f5313I.findViewById(R.id.content);
        View decorView = this.f5347t.getDecorView();
        contentFrameLayout2.f3217o.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = T.f1153a;
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
        this.f5312H = true;
        C0499A A7 = A(0);
        if (this.f5328Y || A7.f5294h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.f5347t == null) {
            Object obj = this.f5345r;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f5347t == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0538y z(Context context) {
        if (this.f5334e0 == null) {
            if (D0.j.f328n == null) {
                Context applicationContext = context.getApplicationContext();
                D0.j.f328n = new D0.j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f5334e0 = new C0537x(this, D0.j.f328n);
        }
        return this.f5334e0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
