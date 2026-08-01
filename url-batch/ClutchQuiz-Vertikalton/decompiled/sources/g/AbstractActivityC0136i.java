package g;

import X.AbstractComponentCallbacksC0048q;
import X.C0050t;
import X.C0051u;
import X.Q;
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
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.EnumC0072m;
import c0.C0086a;
import g.AbstractActivityC0136i;
import j.C0149c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.C0239t;
import l.L0;
import l.c1;
import l.e1;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0136i extends a.l implements InterfaceC0137j {

    /* renamed from: u, reason: collision with root package name */
    public boolean f2452u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2453v;

    /* renamed from: x, reason: collision with root package name */
    public z f2455x;

    /* renamed from: s, reason: collision with root package name */
    public final A0.h f2450s = new A0.h(15, new C0051u(this));

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.v f2451t = new androidx.lifecycle.v(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f2454w = true;

    public AbstractActivityC0136i() {
        this.d.f2580b.e("android:support:lifecycle", new X.r(0, this));
        final int i = 0;
        g(new J.a(this) { // from class: X.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0136i f1132b;

            {
                this.f1132b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f1132b.f2450s.y();
                        break;
                    default:
                        this.f1132b.f2450s.y();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f1206k.add(new J.a(this) { // from class: X.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0136i f1132b;

            {
                this.f1132b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1132b.f2450s.y();
                        break;
                    default:
                        this.f1132b.f2450s.y();
                        break;
                }
            }
        });
        h(new C0050t(this, 0));
        this.d.f2580b.e("androidx:appcompat", new C0134g(this));
        h(new C0135h(this));
    }

    public static boolean n(X.I i) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : i.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null) {
                C0051u c0051u = abstractComponentCallbacksC0048q.f1121s;
                if ((c0051u == null ? null : c0051u.f1138e) != null) {
                    z2 |= n(abstractComponentCallbacksC0048q.g());
                }
                Q q2 = abstractComponentCallbacksC0048q.f1101N;
                EnumC0072m enumC0072m = EnumC0072m.d;
                if (q2 != null && q2.d().d.compareTo(enumC0072m) >= 0) {
                    abstractComponentCallbacksC0048q.f1101N.f1006c.g();
                    z2 = true;
                }
                if (abstractComponentCallbacksC0048q.f1100M.d.compareTo(enumC0072m) >= 0) {
                    abstractComponentCallbacksC0048q.f1100M.g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        z zVar = (z) l();
        zVar.v();
        ((ViewGroup) zVar.f2491A.findViewById(R.id.content)).addView(view, layoutParams);
        zVar.f2526m.a(zVar.f2525l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        z zVar = (z) l();
        zVar.f2504O = true;
        int i = zVar.f2508S;
        if (i == -100) {
            i = n.f2457b;
        }
        int B2 = zVar.B(context, i);
        if (n.b(context) && n.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (n.i) {
                    try {
                        G.f fVar = n.f2458c;
                        if (fVar == null) {
                            if (n.d == null) {
                                n.d = G.f.a(z.c.e(context));
                            }
                            if (!n.d.f209a.f210a.isEmpty()) {
                                n.f2458c = n.d;
                            }
                        } else if (!fVar.equals(n.d)) {
                            G.f fVar2 = n.f2458c;
                            n.d = fVar2;
                            z.c.d(context, fVar2.f209a.f210a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!n.f2460f) {
                n.f2456a.execute(new d0.g(context, 2));
            }
        }
        G.f m2 = z.m(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(z.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0149c) {
            try {
                ((C0149c) context).a(z.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (z.f2490j0) {
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
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    s.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration s2 = z.s(context, B2, m2, configuration, true);
            C0149c c0149c = new C0149c(context, com.clutchquizarena.app.R.style.Theme_AppCompat_Empty);
            c0149c.a(s2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0149c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        B.q.a(theme);
                    } else {
                        synchronized (B.b.f39e) {
                            if (!B.b.f41g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    B.b.f40f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                B.b.f41g = true;
                            }
                            Method method = B.b.f40f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                    B.b.f40f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0149c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((z) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((z) l()).z();
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
        printWriter.print(this.f2452u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2453v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2454w);
        if (getApplication() != null) {
            o.l lVar = ((C0086a) new A0.h(c(), C0086a.f1708c).x(C0086a.class)).f1709b;
            if (lVar.f3240c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (lVar.f3240c > 0) {
                    if (lVar.f3239b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(lVar.f3238a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0051u) this.f2450s.f30b).d.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        z zVar = (z) l();
        zVar.v();
        return zVar.f2525l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        z zVar = (z) l();
        if (zVar.f2529p == null) {
            zVar.z();
            J j2 = zVar.f2528o;
            zVar.f2529p = new j.h(j2 != null ? j2.T() : zVar.f2524k);
        }
        return zVar.f2529p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = e1.f2965a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        z zVar = (z) l();
        if (zVar.f2528o != null) {
            zVar.z();
            zVar.f2528o.getClass();
            zVar.A(0);
        }
    }

    public final n l() {
        if (this.f2455x == null) {
            androidx.room.A a2 = n.f2456a;
            this.f2455x = new z(this, null, this, this);
        }
        return this.f2455x;
    }

    public final void m() {
        androidx.lifecycle.J.g(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        g1.f.e(decorView, "<this>");
        decorView.setTag(com.clutchquizarena.app.R.id.view_tree_view_model_store_owner, this);
        h0.g.k(getWindow().getDecorView(), this);
        T.d.N(getWindow().getDecorView(), this);
    }

    public final void o() {
        super.onDestroy();
        ((C0051u) this.f2450s.f30b).d.k();
        this.f2451t.d(EnumC0071l.ON_DESTROY);
    }

    @Override // a.l, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f2450s.y();
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z zVar = (z) l();
        if (zVar.F && zVar.f2539z) {
            zVar.z();
            J j2 = zVar.f2528o;
            if (j2 != null) {
                j2.W(j2.f2394a.getResources().getBoolean(com.clutchquizarena.app.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0239t a2 = C0239t.a();
        Context context = zVar.f2524k;
        synchronized (a2) {
            L0 l02 = a2.f3050a;
            synchronized (l02) {
                o.e eVar = (o.e) l02.f2884b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        zVar.f2507R = new Configuration(zVar.f2524k.getResources().getConfiguration());
        zVar.k(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // a.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2451t.d(EnumC0071l.ON_CREATE);
        X.I i = ((C0051u) this.f2450s.f30b).d;
        i.f941E = false;
        i.F = false;
        i.f947L.f983g = false;
        i.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0051u) this.f2450s.f30b).d.f953f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        o();
        l().d();
    }

    @Override // a.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a2;
        if (p(i, menuItem)) {
            return true;
        }
        z zVar = (z) l();
        zVar.z();
        J j2 = zVar.f2528o;
        if (menuItem.getItemId() == 16908332 && j2 != null && (((c1) j2.f2397e).f2954b & 4) != 0 && (a2 = z.c.a(this)) != null) {
            if (!shouldUpRecreateTask(a2)) {
                navigateUpTo(a2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a3 = z.c.a(this);
            if (a3 == null) {
                a3 = z.c.a(this);
            }
            if (a3 != null) {
                ComponentName component = a3.getComponent();
                if (component == null) {
                    component = a3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = z.c.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = z.c.b(this, b2.getComponent());
                    }
                    arrayList.add(a3);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
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
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f2453v = false;
        ((C0051u) this.f2450s.f30b).d.t(5);
        this.f2451t.d(EnumC0071l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((z) l()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        q();
        z zVar = (z) l();
        zVar.z();
        J j2 = zVar.f2528o;
        if (j2 != null) {
            j2.f2410t = true;
        }
    }

    @Override // a.l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2450s.y();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        A0.h hVar = this.f2450s;
        hVar.y();
        super.onResume();
        this.f2453v = true;
        ((C0051u) hVar.f30b).d.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        r();
        ((z) l()).k(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2450s.y();
    }

    @Override // android.app.Activity
    public final void onStop() {
        s();
        z zVar = (z) l();
        zVar.z();
        J j2 = zVar.f2528o;
        if (j2 != null) {
            j2.f2410t = false;
            j.j jVar = j2.f2409s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((z) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final boolean p(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0051u) this.f2450s.f30b).d.i();
        }
        return false;
    }

    public final void q() {
        super.onPostResume();
        this.f2451t.d(EnumC0071l.ON_RESUME);
        X.I i = ((C0051u) this.f2450s.f30b).d;
        i.f941E = false;
        i.F = false;
        i.f947L.f983g = false;
        i.t(7);
    }

    public final void r() {
        A0.h hVar = this.f2450s;
        hVar.y();
        super.onStart();
        this.f2454w = false;
        boolean z2 = this.f2452u;
        C0051u c0051u = (C0051u) hVar.f30b;
        if (!z2) {
            this.f2452u = true;
            X.I i = c0051u.d;
            i.f941E = false;
            i.F = false;
            i.f947L.f983g = false;
            i.t(4);
        }
        c0051u.d.y(true);
        this.f2451t.d(EnumC0071l.ON_START);
        X.I i2 = c0051u.d;
        i2.f941E = false;
        i2.F = false;
        i2.f947L.f983g = false;
        i2.t(5);
    }

    public final void s() {
        A0.h hVar;
        super.onStop();
        this.f2454w = true;
        do {
            hVar = this.f2450s;
        } while (n(((C0051u) hVar.f30b).d));
        X.I i = ((C0051u) hVar.f30b).d;
        i.F = true;
        i.f947L.f983g = true;
        i.t(4);
        this.f2451t.d(EnumC0071l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m();
        l().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((z) l()).f2509T = i;
    }

    @Override // a.l, android.app.Activity
    public void setContentView(View view) {
        m();
        l().h(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0051u) this.f2450s.f30b).d.f953f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        l().i(view, layoutParams);
    }
}
