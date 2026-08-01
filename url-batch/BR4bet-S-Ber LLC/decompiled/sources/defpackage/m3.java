package defpackage;

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
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class m3 extends wc implements p3 {
    public boolean A;
    public boolean B;
    public n4 D;
    public final rc0 y = new rc0(24, new rm(this));
    public final os z = new os(this);
    public boolean C = true;

    public m3() {
        this.i.b.e("android:support:lifecycle", new qc(1, this));
        final int i = 0;
        this.n.add(new de(this) { // from class: qm
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // defpackage.de
            public final void accept(Object obj) {
                int i2 = i;
                m3 m3Var = this.b;
                switch (i2) {
                    case 0:
                        m3Var.y.H();
                        break;
                    default:
                        m3Var.y.H();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.p.add(new de(this) { // from class: qm
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // defpackage.de
            public final void accept(Object obj) {
                int i22 = i2;
                m3 m3Var = this.b;
                switch (i22) {
                    case 0:
                        m3Var.y.H();
                        break;
                    default:
                        m3Var.y.H();
                        break;
                }
            }
        });
        g(new rc(this, 1));
        this.i.b.e("androidx:appcompat", new k3(this));
        g(new l3(this));
    }

    public static boolean l(en enVar) {
        boolean z = false;
        for (pm pmVar : enVar.c.n()) {
            if (pmVar != null) {
                rm rmVar = pmVar.x;
                if ((rmVar == null ? null : rmVar.v) != null) {
                    z |= l(pmVar.g());
                }
                pn pnVar = pmVar.S;
                hs hsVar = hs.h;
                hs hsVar2 = hs.i;
                if (pnVar != null) {
                    pnVar.f();
                    if (pnVar.h.c.compareTo(hsVar2) >= 0) {
                        os osVar = pmVar.S.h;
                        osVar.c("setCurrentState");
                        osVar.e(hsVar);
                        z = true;
                    }
                }
                if (pmVar.R.c.compareTo(hsVar2) >= 0) {
                    os osVar2 = pmVar.R;
                    osVar2.c("setCurrentState");
                    osVar2.e(hsVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        n4 n4Var = (n4) j();
        n4Var.v();
        ((ViewGroup) n4Var.F.findViewById(R.id.content)).addView(view, layoutParams);
        n4Var.r.a(n4Var.q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        n4 n4Var = (n4) j();
        n4Var.T = true;
        int i = n4Var.X;
        if (i == -100) {
            i = z3.g;
        }
        int B = n4Var.B(context, i);
        int i2 = 0;
        if (z3.b(context) && z3.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (z3.n) {
                    try {
                        wt wtVar = z3.h;
                        if (wtVar == null) {
                            if (z3.i == null) {
                                z3.i = wt.a(kr.U(context));
                            }
                            if (!z3.i.a.a.isEmpty()) {
                                z3.h = z3.i;
                            }
                        } else if (!wtVar.equals(z3.i)) {
                            wt wtVar2 = z3.h;
                            z3.i = wtVar2;
                            kr.P(context, wtVar2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!z3.k) {
                z3.f.execute(new t3(context, i2));
            }
        }
        wt n = n4.n(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(n4.s(context, B, n, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof ke) {
            try {
                ((ke) context).a(n4.s(context, B, n, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (n4.o0) {
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
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    e4.a(configuration3, configuration4, configuration);
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.colorMode & 3;
                    int i28 = configuration4.colorMode & 3;
                    if (i27 != i28) {
                        configuration.colorMode |= i28;
                    }
                    int i29 = configuration3.colorMode & 12;
                    int i30 = configuration4.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration3.uiMode & 15;
                    int i32 = configuration4.uiMode & 15;
                    if (i31 != i32) {
                        configuration.uiMode |= i32;
                    }
                    int i33 = configuration3.uiMode & 48;
                    int i34 = configuration4.uiMode & 48;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.screenWidthDp;
                    int i36 = configuration4.screenWidthDp;
                    if (i35 != i36) {
                        configuration.screenWidthDp = i36;
                    }
                    int i37 = configuration3.screenHeightDp;
                    int i38 = configuration4.screenHeightDp;
                    if (i37 != i38) {
                        configuration.screenHeightDp = i38;
                    }
                    int i39 = configuration3.smallestScreenWidthDp;
                    int i40 = configuration4.smallestScreenWidthDp;
                    if (i39 != i40) {
                        configuration.smallestScreenWidthDp = i40;
                    }
                    int i41 = configuration3.densityDpi;
                    int i42 = configuration4.densityDpi;
                    if (i41 != i42) {
                        configuration.densityDpi = i42;
                    }
                }
            }
            Configuration s = n4.s(context, B, n, configuration, true);
            ke keVar = new ke(context, com.moontiko.really.admiralcasino.R.style.Theme_AppCompat_Empty);
            keVar.a(s);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = keVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        n6.c(theme);
                    } else {
                        synchronized (xf.k) {
                            if (!xf.m) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    xf.l = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                xf.m = true;
                            }
                            Method method = xf.l;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    xf.l = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = keVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((n4) j()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.vc, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((n4) j()).z();
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
        printWriter.print(this.A);
        printWriter.print(" mResumed=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        if (getApplication() != null) {
            k60 k60Var = ((vt) new pw(d(), vt.c).d(vt.class)).b;
            if (k60Var.h > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (k60Var.h > 0) {
                    if (k60Var.g[0] != null) {
                        g9.b();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(k60Var.f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((rm) this.y.g).u.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        n4 n4Var = (n4) j();
        n4Var.v();
        return n4Var.q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        n4 n4Var = (n4) j();
        if (n4Var.t == null) {
            n4Var.z();
            xd0 xd0Var = n4Var.s;
            n4Var.t = new v70(xd0Var != null ? xd0Var.b() : n4Var.p);
        }
        return n4Var.t;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = nb0.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        n4 n4Var = (n4) j();
        if (n4Var.s != null) {
            n4Var.z();
            n4Var.s.getClass();
            n4Var.A(0);
        }
    }

    public final z3 j() {
        if (this.D == null) {
            x3 x3Var = z3.f;
            this.D = new n4(this, null, this, this);
        }
        return this.D;
    }

    public final en k() {
        return ((rm) this.y.g).u;
    }

    public final void m() {
        super.onDestroy();
        ((rm) this.y.g).u.k();
        this.z.d(gs.ON_DESTROY);
    }

    public final boolean n(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((rm) this.y.g).u.i();
        }
        return false;
    }

    public final void o() {
        super.onPostResume();
        this.z.d(gs.ON_RESUME);
        en enVar = ((rm) this.y.g).u;
        enVar.E = false;
        enVar.F = false;
        enVar.L.g = false;
        enVar.t(7);
    }

    @Override // defpackage.wc, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.y.H();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.wc, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n4 n4Var = (n4) j();
        if (n4Var.K && n4Var.E) {
            n4Var.z();
            xd0 xd0Var = n4Var.s;
            if (xd0Var != null) {
                xd0Var.e(xd0Var.a.getResources().getBoolean(com.moontiko.really.admiralcasino.R.bool.abc_action_bar_embed_tabs));
            }
        }
        r4 a = r4.a();
        Context context = n4Var.p;
        synchronized (a) {
            h30 h30Var = a.a;
            synchronized (h30Var) {
                eu euVar = (eu) h30Var.b.get(context);
                if (euVar != null) {
                    euVar.a();
                }
            }
        }
        n4Var.W = new Configuration(n4Var.p.getResources().getConfiguration());
        n4Var.l(false, false);
    }

    @Override // defpackage.wc, defpackage.vc, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.z.d(gs.ON_CREATE);
        en enVar = ((rm) this.y.g).u;
        enVar.E = false;
        enVar.F = false;
        enVar.L.g = false;
        enVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((rm) this.y.g).u.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        m();
        j().d();
    }

    @Override // defpackage.wc, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent n;
        if (!n(i, menuItem)) {
            n4 n4Var = (n4) j();
            n4Var.z();
            xd0 xd0Var = n4Var.s;
            if (menuItem.getItemId() != 16908332 || xd0Var == null || (((s90) xd0Var.e).b & 4) == 0 || (n = mz.n(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(n)) {
                navigateUpTo(n);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent n2 = mz.n(this);
            if (n2 == null) {
                n2 = mz.n(this);
            }
            if (n2 != null) {
                ComponentName component = n2.getComponent();
                if (component == null) {
                    component = n2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent o = mz.o(this, component);
                    while (o != null) {
                        arrayList.add(size, o);
                        o = mz.o(this, o.getComponent());
                    }
                    arrayList.add(n2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                g9.s("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
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
        ((rm) this.y.g).u.t(5);
        this.z.d(gs.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((n4) j()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        o();
        n4 n4Var = (n4) j();
        n4Var.z();
        xd0 xd0Var = n4Var.s;
        if (xd0Var != null) {
            xd0Var.t = true;
        }
    }

    @Override // defpackage.wc, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.y.H();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        rc0 rc0Var = this.y;
        rc0Var.H();
        super.onResume();
        this.B = true;
        ((rm) rc0Var.g).u.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        p();
        ((n4) j()).l(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.y.H();
    }

    @Override // android.app.Activity
    public final void onStop() {
        q();
        n4 n4Var = (n4) j();
        n4Var.z();
        xd0 xd0Var = n4Var.s;
        if (xd0Var != null) {
            xd0Var.t = false;
            xc0 xc0Var = xd0Var.s;
            if (xc0Var != null) {
                xc0Var.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        j().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((n4) j()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        rc0 rc0Var = this.y;
        rc0Var.H();
        rm rmVar = (rm) rc0Var.g;
        super.onStart();
        this.C = false;
        if (!this.A) {
            this.A = true;
            en enVar = rmVar.u;
            enVar.E = false;
            enVar.F = false;
            enVar.L.g = false;
            enVar.t(4);
        }
        rmVar.u.y(true);
        this.z.d(gs.ON_START);
        en enVar2 = rmVar.u;
        enVar2.E = false;
        enVar2.F = false;
        enVar2.L.g = false;
        enVar2.t(5);
    }

    public final void q() {
        super.onStop();
        this.C = true;
        while (l(k())) {
        }
        en enVar = ((rm) this.y.g).u;
        enVar.F = true;
        enVar.L.g = true;
        enVar.t(4);
        this.z.d(gs.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        i();
        j().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((n4) j()).Y = i;
    }

    @Override // defpackage.wc, android.app.Activity
    public void setContentView(View view) {
        i();
        j().i(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        j().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((rm) this.y.g).u.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
