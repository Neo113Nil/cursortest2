package f;

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
import androidx.fragment.app.s0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.b3;
import k.j2;
import k.z2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class i extends androidx.activity.o implements j {
    public boolean A;
    public b0 C;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1607z;

    /* renamed from: x, reason: collision with root package name */
    public final a2.e f1605x = new a2.e(4, new androidx.fragment.app.w(this));

    /* renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.t f1606y = new androidx.lifecycle.t(this);
    public boolean B = true;

    public i() {
        this.f127i.f1004b.e("android:support:lifecycle", new androidx.activity.f(1, this));
        final int i4 = 0;
        g(new j0.a(this) { // from class: androidx.fragment.app.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f.i f541b;

            {
                this.f541b = this;
            }

            @Override // j0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f541b.f1605x.y();
                        break;
                    default:
                        this.f541b.f1605x.y();
                        break;
                }
            }
        });
        final int i5 = 1;
        this.f134p.add(new j0.a(this) { // from class: androidx.fragment.app.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f.i f541b;

            {
                this.f541b = this;
            }

            @Override // j0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        this.f541b.f1605x.y();
                        break;
                    default:
                        this.f541b.f1605x.y();
                        break;
                }
            }
        });
        h(new androidx.activity.g(this, 1));
        this.f127i.f1004b.e("androidx:appcompat", new c1.a(this));
        h(new h(this));
    }

    public static boolean n(androidx.fragment.app.k0 k0Var) {
        boolean z3 = false;
        for (androidx.fragment.app.u uVar : k0Var.c.j()) {
            if (uVar != null) {
                androidx.fragment.app.w wVar = uVar.f536x;
                if ((wVar == null ? null : wVar.f551o) != null) {
                    z3 |= n(uVar.g());
                }
                s0 s0Var = uVar.S;
                androidx.lifecycle.m mVar = androidx.lifecycle.m.f591i;
                if (s0Var != null) {
                    s0Var.d();
                    if (s0Var.h.c.compareTo(mVar) >= 0) {
                        uVar.S.h.g();
                        z3 = true;
                    }
                }
                if (uVar.R.c.compareTo(mVar) >= 0) {
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
        b0 b0Var = (b0) m();
        b0Var.v();
        ((ViewGroup) b0Var.G.findViewById(R.id.content)).addView(view, layoutParams);
        b0Var.f1558r.a(b0Var.f1557q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        b0 b0Var = (b0) m();
        b0Var.U = true;
        int i4 = b0Var.Y;
        if (i4 == -100) {
            i4 = p.g;
        }
        int B = b0Var.B(context, i4);
        int i5 = 0;
        if (p.b(context) && p.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (p.f1644n) {
                    try {
                        g0.d dVar = p.h;
                        if (dVar == null) {
                            if (p.f1639i == null) {
                                p.f1639i = g0.d.a(z.c.e(context));
                            }
                            if (!p.f1639i.f1757a.f1758a.isEmpty()) {
                                p.h = p.f1639i;
                            }
                        } else if (!dVar.equals(p.f1639i)) {
                            g0.d dVar2 = p.h;
                            p.f1639i = dVar2;
                            z.c.d(context, dVar2.f1757a.f1758a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!p.f1641k) {
                p.f1638f.execute(new k(context, i5));
            }
        }
        g0.d o4 = b0.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(b0.s(context, B, o4, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof i.c) {
            try {
                ((i.c) context).a(b0.s(context, B, o4, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (b0.f1543p0) {
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
                    float f4 = configuration3.fontScale;
                    float f5 = configuration4.fontScale;
                    if (f4 != f5) {
                        configuration.fontScale = f5;
                    }
                    int i6 = configuration3.mcc;
                    int i7 = configuration4.mcc;
                    if (i6 != i7) {
                        configuration.mcc = i7;
                    }
                    int i8 = configuration3.mnc;
                    int i9 = configuration4.mnc;
                    if (i8 != i9) {
                        configuration.mnc = i9;
                    }
                    u.a(configuration3, configuration4, configuration);
                    int i10 = configuration3.touchscreen;
                    int i11 = configuration4.touchscreen;
                    if (i10 != i11) {
                        configuration.touchscreen = i11;
                    }
                    int i12 = configuration3.keyboard;
                    int i13 = configuration4.keyboard;
                    if (i12 != i13) {
                        configuration.keyboard = i13;
                    }
                    int i14 = configuration3.keyboardHidden;
                    int i15 = configuration4.keyboardHidden;
                    if (i14 != i15) {
                        configuration.keyboardHidden = i15;
                    }
                    int i16 = configuration3.navigation;
                    int i17 = configuration4.navigation;
                    if (i16 != i17) {
                        configuration.navigation = i17;
                    }
                    int i18 = configuration3.navigationHidden;
                    int i19 = configuration4.navigationHidden;
                    if (i18 != i19) {
                        configuration.navigationHidden = i19;
                    }
                    int i20 = configuration3.orientation;
                    int i21 = configuration4.orientation;
                    if (i20 != i21) {
                        configuration.orientation = i21;
                    }
                    int i22 = configuration3.screenLayout & 15;
                    int i23 = configuration4.screenLayout & 15;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 192;
                    int i25 = configuration4.screenLayout & 192;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 48;
                    int i27 = configuration4.screenLayout & 48;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.screenLayout & 768;
                    int i29 = configuration4.screenLayout & 768;
                    if (i28 != i29) {
                        configuration.screenLayout |= i29;
                    }
                    int i30 = configuration3.colorMode & 3;
                    int i31 = configuration4.colorMode & 3;
                    if (i30 != i31) {
                        configuration.colorMode |= i31;
                    }
                    int i32 = configuration3.colorMode & 12;
                    int i33 = configuration4.colorMode & 12;
                    if (i32 != i33) {
                        configuration.colorMode |= i33;
                    }
                    int i34 = configuration3.uiMode & 15;
                    int i35 = configuration4.uiMode & 15;
                    if (i34 != i35) {
                        configuration.uiMode |= i35;
                    }
                    int i36 = configuration3.uiMode & 48;
                    int i37 = configuration4.uiMode & 48;
                    if (i36 != i37) {
                        configuration.uiMode |= i37;
                    }
                    int i38 = configuration3.screenWidthDp;
                    int i39 = configuration4.screenWidthDp;
                    if (i38 != i39) {
                        configuration.screenWidthDp = i39;
                    }
                    int i40 = configuration3.screenHeightDp;
                    int i41 = configuration4.screenHeightDp;
                    if (i40 != i41) {
                        configuration.screenHeightDp = i41;
                    }
                    int i42 = configuration3.smallestScreenWidthDp;
                    int i43 = configuration4.smallestScreenWidthDp;
                    if (i42 != i43) {
                        configuration.smallestScreenWidthDp = i43;
                    }
                    int i44 = configuration3.densityDpi;
                    int i45 = configuration4.densityDpi;
                    if (i44 != i45) {
                        configuration.densityDpi = i45;
                    }
                }
            }
            Configuration s2 = b0.s(context, B, o4, configuration, true);
            i.c cVar = new i.c(context, com.gglhk.bofio.fortunetiger.R.style.Theme_AppCompat_Empty);
            cVar.a(s2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        b0.l.a(theme);
                    } else {
                        synchronized (b0.b.f695e) {
                            if (!b0.b.g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    b0.b.f696f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e4) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e4);
                                }
                                b0.b.g = true;
                            }
                            Method method = b0.b.f696f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e5) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e5);
                                    b0.b.f696f = null;
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
        ((b0) m()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((b0) m()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L34;
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
                    if (str2.equals("--autofill")) {
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
        printWriter.print(this.f1607z);
        printWriter.print(" mResumed=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        if (getApplication() != null) {
            androidx.emoji2.text.s sVar = new androidx.emoji2.text.s(e(), y0.a.f3611d);
            String canonicalName = y0.a.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            n.k kVar = ((y0.a) sVar.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), y0.a.class)).c;
            if (kVar.h > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (kVar.h > 0) {
                    if (kVar.g[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(kVar.f2936f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((androidx.fragment.app.w) this.f1605x.g).f550n.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i4) {
        b0 b0Var = (b0) m();
        b0Var.v();
        return b0Var.f1557q.findViewById(i4);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        b0 b0Var = (b0) m();
        if (b0Var.f1561u == null) {
            b0Var.z();
            l0 l0Var = b0Var.f1560t;
            b0Var.f1561u = new i.h(l0Var != null ? l0Var.m0() : b0Var.f1556p);
        }
        return b0Var.f1561u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i4 = b3.f2505a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        b0 b0Var = (b0) m();
        if (b0Var.f1560t != null) {
            b0Var.z();
            b0Var.f1560t.getClass();
            b0Var.A(0);
        }
    }

    public final p m() {
        if (this.C == null) {
            n nVar = p.f1638f;
            this.C = new b0(this, null, this, this);
        }
        return this.C;
    }

    public final void o() {
        super.onDestroy();
        ((androidx.fragment.app.w) this.f1605x.g).f550n.k();
        this.f1606y.d(androidx.lifecycle.l.ON_DESTROY);
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        this.f1605x.y();
        super.onActivityResult(i4, i5, intent);
    }

    @Override // androidx.activity.o, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b0 b0Var = (b0) m();
        if (b0Var.L && b0Var.F) {
            b0Var.z();
            l0 l0Var = b0Var.f1560t;
            if (l0Var != null) {
                l0Var.p0(l0Var.f1617f.getResources().getBoolean(com.gglhk.bofio.fortunetiger.R.bool.abc_action_bar_embed_tabs));
            }
        }
        k.s a4 = k.s.a();
        Context context = b0Var.f1556p;
        synchronized (a4) {
            j2 j2Var = a4.f2641a;
            synchronized (j2Var) {
                n.h hVar = (n.h) j2Var.f2564b.get(context);
                if (hVar != null) {
                    hVar.a();
                }
            }
        }
        b0Var.X = new Configuration(b0Var.f1556p.getResources().getConfiguration());
        b0Var.m(false, false);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1606y.d(androidx.lifecycle.l.ON_CREATE);
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) this.f1605x.g).f550n;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((androidx.fragment.app.w) this.f1605x.g).f550n.f439f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        o();
        m().d();
    }

    @Override // androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        Intent a4;
        if (!p(i4, menuItem)) {
            b0 b0Var = (b0) m();
            b0Var.z();
            l0 l0Var = b0Var.f1560t;
            if (menuItem.getItemId() != 16908332 || l0Var == null || (((z2) l0Var.f1619j).f2700b & 4) == 0 || (a4 = z.c.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(a4)) {
                navigateUpTo(a4);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a5 = z.c.a(this);
            if (a5 == null) {
                a5 = z.c.a(this);
            }
            if (a5 != null) {
                ComponentName component = a5.getComponent();
                if (component == null) {
                    component = a5.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = z.c.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = z.c.b(this, b2.getComponent());
                    }
                    arrayList.add(a5);
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
        this.A = false;
        ((androidx.fragment.app.w) this.f1605x.g).f550n.t(5);
        this.f1606y.d(androidx.lifecycle.l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((b0) m()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        q();
        b0 b0Var = (b0) m();
        b0Var.z();
        l0 l0Var = b0Var.f1560t;
        if (l0Var != null) {
            l0Var.f1634y = true;
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.f1605x.y();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        a2.e eVar = this.f1605x;
        eVar.y();
        super.onResume();
        this.A = true;
        ((androidx.fragment.app.w) eVar.g).f550n.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        r();
        ((b0) m()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1605x.y();
    }

    @Override // android.app.Activity
    public final void onStop() {
        s();
        b0 b0Var = (b0) m();
        b0Var.z();
        l0 l0Var = b0Var.f1560t;
        if (l0Var != null) {
            l0Var.f1634y = false;
            i.j jVar = l0Var.f1633x;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        m().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((b0) m()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final boolean p(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 6) {
            return ((androidx.fragment.app.w) this.f1605x.g).f550n.i();
        }
        return false;
    }

    public final void q() {
        super.onPostResume();
        this.f1606y.d(androidx.lifecycle.l.ON_RESUME);
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) this.f1605x.g).f550n;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.t(7);
    }

    public final void r() {
        a2.e eVar = this.f1605x;
        eVar.y();
        androidx.fragment.app.w wVar = (androidx.fragment.app.w) eVar.g;
        super.onStart();
        this.B = false;
        if (!this.f1607z) {
            this.f1607z = true;
            androidx.fragment.app.k0 k0Var = wVar.f550n;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.h = false;
            k0Var.t(4);
        }
        wVar.f550n.y(true);
        this.f1606y.d(androidx.lifecycle.l.ON_START);
        androidx.fragment.app.k0 k0Var2 = wVar.f550n;
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.h = false;
        k0Var2.t(5);
    }

    public final void s() {
        a2.e eVar;
        super.onStop();
        this.B = true;
        do {
            eVar = this.f1605x;
        } while (n(((androidx.fragment.app.w) eVar.g).f550n));
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) eVar.g).f550n;
        k0Var.F = true;
        k0Var.L.h = true;
        k0Var.t(4);
        this.f1606y.d(androidx.lifecycle.l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i4) {
        j();
        m().g(i4);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        super.setTheme(i4);
        ((b0) m()).Z = i4;
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(View view) {
        j();
        m().h(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        m().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((androidx.fragment.app.w) this.f1605x.g).f550n.f439f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
