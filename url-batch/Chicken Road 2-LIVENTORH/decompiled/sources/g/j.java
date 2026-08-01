package g;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.s0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.d3;
import l.i3;
import l.m2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class j extends a.m implements k {
    public boolean A;
    public boolean B;
    public c0 D;

    /* renamed from: y, reason: collision with root package name */
    public final a0.a f1650y = new a0.a(5, new androidx.fragment.app.w(this));

    /* renamed from: z, reason: collision with root package name */
    public final androidx.lifecycle.t f1651z = new androidx.lifecycle.t(this);
    public boolean C = true;

    public j() {
        this.i.f1703b.e("android:support:lifecycle", new a.g(1, this));
        final int i = 0;
        g(new m0.a(this) { // from class: androidx.fragment.app.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g.j f559b;

            {
                this.f559b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f559b.f1650y.A();
                        break;
                    default:
                        this.f559b.f1650y.A();
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f53p.add(new m0.a(this) { // from class: androidx.fragment.app.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g.j f559b;

            {
                this.f559b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f559b.f1650y.A();
                        break;
                    default:
                        this.f559b.f1650y.A();
                        break;
                }
            }
        });
        h(new a.h(this, 1));
        this.i.f1703b.e("androidx:appcompat", new h(this));
        h(new i(this));
    }

    public static boolean l(androidx.fragment.app.k0 k0Var) {
        boolean z3 = false;
        for (androidx.fragment.app.u uVar : k0Var.f443c.k()) {
            if (uVar != null) {
                androidx.fragment.app.w wVar = uVar.f552x;
                if ((wVar == null ? null : wVar.f571r) != null) {
                    z3 |= l(uVar.g());
                }
                s0 s0Var = uVar.S;
                androidx.lifecycle.m mVar = androidx.lifecycle.m.i;
                if (s0Var != null) {
                    s0Var.f();
                    if (s0Var.f532h.f630c.compareTo(mVar) >= 0) {
                        uVar.S.f532h.g();
                        z3 = true;
                    }
                }
                if (uVar.R.f630c.compareTo(mVar) >= 0) {
                    uVar.R.g();
                    z3 = true;
                }
            }
        }
        return z3;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        c0 c0Var = (c0) k();
        c0Var.u();
        ((ViewGroup) c0Var.F.findViewById(R.id.content)).addView(view, layoutParams);
        c0Var.f1597r.a(c0Var.f1596q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        c0 c0Var = (c0) k();
        c0Var.T = true;
        int i11 = c0Var.X;
        if (i11 == -100) {
            i11 = p.f1677g;
        }
        int B = c0Var.B(context, i11);
        if (p.b(context) && p.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (p.f1683n) {
                    try {
                        j0.e eVar = p.f1678h;
                        if (eVar == null) {
                            if (p.i == null) {
                                p.i = j0.e.a(c0.c.e(context));
                            }
                            if (!p.i.f1891a.f1892a.isEmpty()) {
                                p.f1678h = p.i;
                            }
                        } else if (!eVar.equals(p.i)) {
                            j0.e eVar2 = p.f1678h;
                            p.i = eVar2;
                            c0.c.d(context, eVar2.f1891a.f1892a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!p.f1680k) {
                p.f1676f.execute(new d1.h(context, 2));
            }
        }
        j0.e n4 = c0.n(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(c0.r(context, B, n4, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof j.c) {
            try {
                ((j.c) context).a(c0.r(context, B, n4, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (c0.f1583o0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f4 = configuration4.fontScale;
                    if (f2 != f4) {
                        configuration.fontScale = f4;
                    }
                    int i12 = configuration3.mcc;
                    int i13 = configuration4.mcc;
                    if (i12 != i13) {
                        configuration.mcc = i13;
                    }
                    int i14 = configuration3.mnc;
                    int i15 = configuration4.mnc;
                    if (i14 != i15) {
                        configuration.mnc = i15;
                    }
                    int i16 = Build.VERSION.SDK_INT;
                    u.a(configuration3, configuration4, configuration);
                    int i17 = configuration3.touchscreen;
                    int i18 = configuration4.touchscreen;
                    if (i17 != i18) {
                        configuration.touchscreen = i18;
                    }
                    int i19 = configuration3.keyboard;
                    int i20 = configuration4.keyboard;
                    if (i19 != i20) {
                        configuration.keyboard = i20;
                    }
                    int i21 = configuration3.keyboardHidden;
                    int i22 = configuration4.keyboardHidden;
                    if (i21 != i22) {
                        configuration.keyboardHidden = i22;
                    }
                    int i23 = configuration3.navigation;
                    int i24 = configuration4.navigation;
                    if (i23 != i24) {
                        configuration.navigation = i24;
                    }
                    int i25 = configuration3.navigationHidden;
                    int i26 = configuration4.navigationHidden;
                    if (i25 != i26) {
                        configuration.navigationHidden = i26;
                    }
                    int i27 = configuration3.orientation;
                    int i28 = configuration4.orientation;
                    if (i27 != i28) {
                        configuration.orientation = i28;
                    }
                    int i29 = configuration3.screenLayout & 15;
                    int i30 = configuration4.screenLayout & 15;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 192;
                    int i32 = configuration4.screenLayout & 192;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 48;
                    int i34 = configuration4.screenLayout & 48;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    int i35 = configuration3.screenLayout & 768;
                    int i36 = configuration4.screenLayout & 768;
                    if (i35 != i36) {
                        configuration.screenLayout |= i36;
                    }
                    if (i16 >= 26) {
                        i = configuration3.colorMode;
                        int i37 = i & 3;
                        i4 = configuration4.colorMode;
                        if (i37 != (i4 & 3)) {
                            i9 = configuration.colorMode;
                            i10 = configuration4.colorMode;
                            configuration.colorMode = i9 | (i10 & 3);
                        }
                        i5 = configuration3.colorMode;
                        int i38 = i5 & 12;
                        i6 = configuration4.colorMode;
                        if (i38 != (i6 & 12)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 12);
                        }
                    }
                    int i39 = configuration3.uiMode & 15;
                    int i40 = configuration4.uiMode & 15;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.uiMode & 48;
                    int i42 = configuration4.uiMode & 48;
                    if (i41 != i42) {
                        configuration.uiMode |= i42;
                    }
                    int i43 = configuration3.screenWidthDp;
                    int i44 = configuration4.screenWidthDp;
                    if (i43 != i44) {
                        configuration.screenWidthDp = i44;
                    }
                    int i45 = configuration3.screenHeightDp;
                    int i46 = configuration4.screenHeightDp;
                    if (i45 != i46) {
                        configuration.screenHeightDp = i46;
                    }
                    int i47 = configuration3.smallestScreenWidthDp;
                    int i48 = configuration4.smallestScreenWidthDp;
                    if (i47 != i48) {
                        configuration.smallestScreenWidthDp = i48;
                    }
                    int i49 = configuration3.densityDpi;
                    int i50 = configuration4.densityDpi;
                    if (i49 != i50) {
                        configuration.densityDpi = i50;
                    }
                }
            }
            Configuration r3 = c0.r(context, B, n4, configuration, true);
            j.c cVar = new j.c(context, com.oriondriftchasers.arordrft.R.style.Theme_AppCompat_Empty);
            cVar.a(r3);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        e0.l.a(theme);
                    } else {
                        synchronized (e0.b.f1134e) {
                            if (!e0.b.f1136g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    e0.b.f1135f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e4) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e4);
                                }
                                e0.b.f1136g = true;
                            }
                            Method method = e0.b.f1135f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e5) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e5);
                                    e0.b.f1135f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((c0) k()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // c0.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((c0) k()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.A);
        printWriter.print(" mResumed=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        if (getApplication() != null) {
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(d(), b1.a.d);
            String canonicalName = b1.a.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            q.k kVar = ((b1.a) tVar.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), b1.a.class)).f723c;
            if (kVar.f3039h > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (kVar.f3039h > 0) {
                    if (kVar.f3038g[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(kVar.f3037f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((androidx.fragment.app.w) this.f1650y.f81g).f570q.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        c0 c0Var = (c0) k();
        c0Var.u();
        return c0Var.f1596q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        c0 c0Var = (c0) k();
        if (c0Var.f1600u == null) {
            c0Var.z();
            m0 m0Var = c0Var.f1599t;
            c0Var.f1600u = new j.h(m0Var != null ? m0Var.X() : c0Var.f1595p);
        }
        return c0Var.f1600u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = i3.f2350a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        c0 c0Var = (c0) k();
        if (c0Var.f1599t != null) {
            c0Var.z();
            c0Var.f1599t.getClass();
            c0Var.A(0);
        }
    }

    public final p k() {
        if (this.D == null) {
            n nVar = p.f1676f;
            this.D = new c0(this, null, this, this);
        }
        return this.D;
    }

    public final void m() {
        super.onDestroy();
        ((androidx.fragment.app.w) this.f1650y.f81g).f570q.k();
        this.f1651z.d(androidx.lifecycle.l.ON_DESTROY);
    }

    public final boolean n(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((androidx.fragment.app.w) this.f1650y.f81g).f570q.i();
        }
        return false;
    }

    public final void o() {
        super.onPostResume();
        this.f1651z.d(androidx.lifecycle.l.ON_RESUME);
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) this.f1650y.f81g).f570q;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.f481h = false;
        k0Var.t(7);
    }

    @Override // a.m, android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        this.f1650y.A();
        super.onActivityResult(i, i4, intent);
    }

    @Override // a.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c0 c0Var = (c0) k();
        if (c0Var.K && c0Var.E) {
            c0Var.z();
            m0 m0Var = c0Var.f1599t;
            if (m0Var != null) {
                m0Var.a0(m0Var.f1660n.getResources().getBoolean(com.oriondriftchasers.arordrft.R.bool.abc_action_bar_embed_tabs));
            }
        }
        l.u a2 = l.u.a();
        Context context = c0Var.f1595p;
        synchronized (a2) {
            m2 m2Var = a2.f2467a;
            synchronized (m2Var) {
                q.h hVar = (q.h) m2Var.f2392b.get(context);
                if (hVar != null) {
                    hVar.a();
                }
            }
        }
        c0Var.W = new Configuration(c0Var.f1595p.getResources().getConfiguration());
        c0Var.l(false, false);
    }

    @Override // a.m, c0.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1651z.d(androidx.lifecycle.l.ON_CREATE);
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) this.f1650y.f81g).f570q;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.f481h = false;
        k0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((androidx.fragment.app.w) this.f1650y.f81g).f570q.f445f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        m();
        k().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // a.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a2;
        if (!n(i, menuItem)) {
            c0 c0Var = (c0) k();
            c0Var.z();
            m0 m0Var = c0Var.f1599t;
            if (menuItem.getItemId() != 16908332 || m0Var == null || (((d3) m0Var.f1664r).f2270b & 4) == 0 || (a2 = c0.c.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(a2)) {
                navigateUpTo(a2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a4 = c0.c.a(this);
            if (a4 == null) {
                a4 = c0.c.a(this);
            }
            if (a4 != null) {
                ComponentName component = a4.getComponent();
                if (component == null) {
                    component = a4.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b4 = c0.c.b(this, component);
                    while (b4 != null) {
                        arrayList.add(size, b4);
                        b4 = c0.c.b(this, b4.getComponent());
                    }
                    arrayList.add(a4);
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e4);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.B = false;
        ((androidx.fragment.app.w) this.f1650y.f81g).f570q.t(5);
        this.f1651z.d(androidx.lifecycle.l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((c0) k()).u();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        o();
        c0 c0Var = (c0) k();
        c0Var.z();
        m0 m0Var = c0Var.f1599t;
        if (m0Var != null) {
            m0Var.G = true;
        }
    }

    @Override // a.m, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1650y.A();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        a0.a aVar = this.f1650y;
        aVar.A();
        super.onResume();
        this.B = true;
        ((androidx.fragment.app.w) aVar.f81g).f570q.x(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        p();
        ((c0) k()).l(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1650y.A();
    }

    @Override // android.app.Activity
    public final void onStop() {
        q();
        c0 c0Var = (c0) k();
        c0Var.z();
        m0 m0Var = c0Var.f1599t;
        if (m0Var != null) {
            m0Var.G = false;
            j.j jVar = m0Var.F;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((c0) k()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        a0.a aVar = this.f1650y;
        aVar.A();
        androidx.fragment.app.w wVar = (androidx.fragment.app.w) aVar.f81g;
        super.onStart();
        this.C = false;
        if (!this.A) {
            this.A = true;
            androidx.fragment.app.k0 k0Var = wVar.f570q;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.f481h = false;
            k0Var.t(4);
        }
        wVar.f570q.x(true);
        this.f1651z.d(androidx.lifecycle.l.ON_START);
        androidx.fragment.app.k0 k0Var2 = wVar.f570q;
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.f481h = false;
        k0Var2.t(5);
    }

    public final void q() {
        a0.a aVar;
        super.onStop();
        this.C = true;
        do {
            aVar = this.f1650y;
        } while (l(((androidx.fragment.app.w) aVar.f81g).f570q));
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) aVar.f81g).f570q;
        k0Var.F = true;
        k0Var.L.f481h = true;
        k0Var.t(4);
        this.f1651z.d(androidx.lifecycle.l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        j();
        k().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((c0) k()).Y = i;
    }

    @Override // a.m, android.app.Activity
    public void setContentView(View view) {
        j();
        k().h(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        k().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((androidx.fragment.app.w) this.f1650y.f81g).f570q.f445f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
