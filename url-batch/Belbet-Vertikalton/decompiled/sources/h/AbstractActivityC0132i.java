package h;

import Z.AbstractComponentCallbacksC0053q;
import Z.C0055t;
import Z.C0056u;
import Z.Q;
import a.AbstractC0058a;
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
import androidx.lifecycle.EnumC0077l;
import androidx.lifecycle.EnumC0078m;
import e0.C0114a;
import h.AbstractActivityC0132i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.C0206c;
import n.C0302u;
import n.P0;
import n.i1;
import n.k1;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0132i extends b.l implements InterfaceC0133j {

    /* renamed from: u, reason: collision with root package name */
    public boolean f2804u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2805v;

    /* renamed from: x, reason: collision with root package name */
    public z f2807x;

    /* renamed from: s, reason: collision with root package name */
    public final C1.d f2802s = new C1.d(18, new C0056u(this));

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.v f2803t = new androidx.lifecycle.v(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f2806w = true;

    public AbstractActivityC0132i() {
        this.f2180d.f3167b.e("android:support:lifecycle", new Z.r(0, this));
        final int i = 0;
        g(new L.a(this) { // from class: Z.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0132i f1634b;

            {
                this.f1634b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f1634b.f2802s.u();
                        break;
                    default:
                        this.f1634b.f2802s.u();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f2184k.add(new L.a(this) { // from class: Z.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0132i f1634b;

            {
                this.f1634b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1634b.f2802s.u();
                        break;
                    default:
                        this.f1634b.f2802s.u();
                        break;
                }
            }
        });
        h(new C0055t(this, 0));
        this.f2180d.f3167b.e("androidx:appcompat", new C0130g(this));
        h(new C0131h(this));
    }

    public static boolean n(Z.I i) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : i.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null) {
                C0056u c0056u = abstractComponentCallbacksC0053q.f1623s;
                if ((c0056u == null ? null : c0056u.f1640f) != null) {
                    z2 |= n(abstractComponentCallbacksC0053q.g());
                }
                Q q2 = abstractComponentCallbacksC0053q.f1603N;
                EnumC0078m enumC0078m = EnumC0078m.f1937d;
                if (q2 != null) {
                    q2.f();
                    if (q2.f1505c.f1949d.compareTo(enumC0078m) >= 0) {
                        abstractComponentCallbacksC0053q.f1603N.f1505c.g();
                        z2 = true;
                    }
                }
                if (abstractComponentCallbacksC0053q.f1602M.f1949d.compareTo(enumC0078m) >= 0) {
                    abstractComponentCallbacksC0053q.f1602M.g();
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
        ((ViewGroup) zVar.f2845B.findViewById(R.id.content)).addView(view, layoutParams);
        zVar.f2879m.a(zVar.f2878l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        z zVar = (z) l();
        zVar.f2858P = true;
        int i = zVar.f2862T;
        if (i == -100) {
            i = n.f2809b;
        }
        int B2 = zVar.B(context, i);
        if (n.b(context) && n.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (n.i) {
                    try {
                        I.f fVar = n.f2810c;
                        if (fVar == null) {
                            if (n.f2811d == null) {
                                n.f2811d = I.f.a(B.d.e(context));
                            }
                            if (!n.f2811d.f577a.f578a.isEmpty()) {
                                n.f2810c = n.f2811d;
                            }
                        } else if (!fVar.equals(n.f2811d)) {
                            I.f fVar2 = n.f2810c;
                            n.f2811d = fVar2;
                            B.d.d(context, fVar2.f577a.f578a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!n.f2812f) {
                n.f2808a.execute(new f0.g(context, 2));
            }
        }
        I.f o2 = z.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(z.s(context, B2, o2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0206c) {
            try {
                ((C0206c) context).a(z.s(context, B2, o2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (z.f2843k0) {
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
            Configuration s2 = z.s(context, B2, o2, configuration, true);
            C0206c c0206c = new C0206c(context, com.winpower.neonfit.R.style.Theme_AppCompat_Empty);
            c0206c.a(s2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0206c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        D.p.a(theme);
                    } else {
                        synchronized (D.b.e) {
                            if (!D.b.f165g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    D.b.f164f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                D.b.f165g = true;
                            }
                            Method method = D.b.f164f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    D.b.f164f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0206c;
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

    @Override // b.l, android.app.Activity, android.view.Window.Callback
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
        printWriter.print(this.f2804u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2805v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2806w);
        if (getApplication() != null) {
            q.l lVar = ((C0114a) new C1.d(c(), C0114a.f2652c).s(C0114a.class)).f2653b;
            if (lVar.f3929c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (lVar.f3929c > 0) {
                    if (lVar.f3928b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(lVar.f3927a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0056u) this.f2802s.f145b).e.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        z zVar = (z) l();
        zVar.v();
        return zVar.f2878l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        z zVar = (z) l();
        if (zVar.f2882p == null) {
            zVar.z();
            K k2 = zVar.f2881o;
            zVar.f2882p = new l.h(k2 != null ? k2.i0() : zVar.f2877k);
        }
        return zVar.f2882p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = k1.f3670a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        z zVar = (z) l();
        if (zVar.f2881o != null) {
            zVar.z();
            zVar.f2881o.getClass();
            zVar.A(0);
        }
    }

    public final n l() {
        if (this.f2807x == null) {
            androidx.room.D d2 = n.f2808a;
            this.f2807x = new z(this, null, this, this);
        }
        return this.f2807x;
    }

    public final void m() {
        androidx.lifecycle.J.g(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        j1.h.e(decorView, "<this>");
        decorView.setTag(com.winpower.neonfit.R.id.view_tree_view_model_store_owner, this);
        AbstractC0058a.Y(getWindow().getDecorView(), this);
        H1.d.b0(getWindow().getDecorView(), this);
    }

    public final void o() {
        super.onDestroy();
        ((C0056u) this.f2802s.f145b).e.k();
        this.f2803t.d(EnumC0077l.ON_DESTROY);
    }

    @Override // b.l, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f2802s.u();
        super.onActivityResult(i, i2, intent);
    }

    @Override // b.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z zVar = (z) l();
        if (zVar.f2850G && zVar.f2844A) {
            zVar.z();
            K k2 = zVar.f2881o;
            if (k2 != null) {
                k2.l0(k2.e.getResources().getBoolean(com.winpower.neonfit.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0302u a2 = C0302u.a();
        Context context = zVar.f2877k;
        synchronized (a2) {
            P0 p02 = a2.f3717a;
            synchronized (p02) {
                q.e eVar = (q.e) p02.f3507b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        zVar.f2861S = new Configuration(zVar.f2877k.getResources().getConfiguration());
        zVar.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // b.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2803t.d(EnumC0077l.ON_CREATE);
        Z.I i = ((C0056u) this.f2802s.f145b).e;
        i.f1437E = false;
        i.f1438F = false;
        i.f1443L.f1481g = false;
        i.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0056u) this.f2802s.f145b).e.f1449f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        o();
        l().e();
    }

    @Override // b.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a2;
        if (p(i, menuItem)) {
            return true;
        }
        z zVar = (z) l();
        zVar.z();
        K k2 = zVar.f2881o;
        if (menuItem.getItemId() == 16908332 && k2 != null && (((i1) k2.i).f3638b & 4) != 0 && (a2 = B.d.a(this)) != null) {
            if (!shouldUpRecreateTask(a2)) {
                navigateUpTo(a2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a3 = B.d.a(this);
            if (a3 == null) {
                a3 = B.d.a(this);
            }
            if (a3 != null) {
                ComponentName component = a3.getComponent();
                if (component == null) {
                    component = a3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = B.d.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = B.d.b(this, b2.getComponent());
                    }
                    arrayList.add(a3);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
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
    public void onPause() {
        super.onPause();
        this.f2805v = false;
        ((C0056u) this.f2802s.f145b).e.t(5);
        this.f2803t.d(EnumC0077l.ON_PAUSE);
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
        K k2 = zVar.f2881o;
        if (k2 != null) {
            k2.f2765x = true;
        }
    }

    @Override // b.l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2802s.u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C1.d dVar = this.f2802s;
        dVar.u();
        super.onResume();
        this.f2805v = true;
        ((C0056u) dVar.f145b).e.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        r();
        ((z) l()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2802s.u();
    }

    @Override // android.app.Activity
    public final void onStop() {
        s();
        z zVar = (z) l();
        zVar.z();
        K k2 = zVar.f2881o;
        if (k2 != null) {
            k2.f2765x = false;
            l.j jVar = k2.f2764w;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().l(charSequence);
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
            return ((C0056u) this.f2802s.f145b).e.i();
        }
        return false;
    }

    public final void q() {
        super.onPostResume();
        this.f2803t.d(EnumC0077l.ON_RESUME);
        Z.I i = ((C0056u) this.f2802s.f145b).e;
        i.f1437E = false;
        i.f1438F = false;
        i.f1443L.f1481g = false;
        i.t(7);
    }

    public final void r() {
        C1.d dVar = this.f2802s;
        dVar.u();
        super.onStart();
        this.f2806w = false;
        boolean z2 = this.f2804u;
        C0056u c0056u = (C0056u) dVar.f145b;
        if (!z2) {
            this.f2804u = true;
            Z.I i = c0056u.e;
            i.f1437E = false;
            i.f1438F = false;
            i.f1443L.f1481g = false;
            i.t(4);
        }
        c0056u.e.y(true);
        this.f2803t.d(EnumC0077l.ON_START);
        Z.I i2 = c0056u.e;
        i2.f1437E = false;
        i2.f1438F = false;
        i2.f1443L.f1481g = false;
        i2.t(5);
    }

    public final void s() {
        C1.d dVar;
        super.onStop();
        this.f2806w = true;
        do {
            dVar = this.f2802s;
        } while (n(((C0056u) dVar.f145b).e));
        Z.I i = ((C0056u) dVar.f145b).e;
        i.f1438F = true;
        i.f1443L.f1481g = true;
        i.t(4);
        this.f2803t.d(EnumC0077l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m();
        l().i(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((z) l()).f2863U = i;
    }

    @Override // b.l, android.app.Activity
    public void setContentView(View view) {
        m();
        l().j(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0056u) this.f2802s.f145b).e.f1449f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        l().k(view, layoutParams);
    }
}
