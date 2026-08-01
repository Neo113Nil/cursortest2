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
import androidx.lifecycle.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class c3 extends wb implements f3 {
    public boolean B;
    public boolean C;
    public d4 E;
    public final k0 z = new k0(23, new ok(this));
    public final a A = new a(this);
    public boolean D = true;

    public c3() {
        this.i.b.e("android:support:lifecycle", new qb(1, this));
        final int i = 0;
        this.n.add(new dd(this) { // from class: nk
            public final /* synthetic */ c3 b;

            {
                this.b = this;
            }

            @Override // defpackage.dd
            public final void accept(Object obj) {
                int i2 = i;
                c3 c3Var = this.b;
                switch (i2) {
                    case 0:
                        c3Var.z.G();
                        break;
                    default:
                        c3Var.z.G();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.p.add(new dd(this) { // from class: nk
            public final /* synthetic */ c3 b;

            {
                this.b = this;
            }

            @Override // defpackage.dd
            public final void accept(Object obj) {
                int i22 = i2;
                c3 c3Var = this.b;
                switch (i22) {
                    case 0:
                        c3Var.z.G();
                        break;
                    default:
                        c3Var.z.G();
                        break;
                }
            }
        });
        g(new rb(this, 1));
        this.i.b.e("androidx:appcompat", new a3(this));
        g(new b3(this));
    }

    public static boolean k(bl blVar) {
        boolean z = false;
        for (mk mkVar : blVar.c.n()) {
            if (mkVar != null) {
                ok okVar = mkVar.x;
                if ((okVar == null ? null : okVar.s) != null) {
                    z |= k(mkVar.g());
                }
                kl klVar = mkVar.S;
                vp vpVar = vp.h;
                vp vpVar2 = vp.i;
                if (klVar != null) {
                    klVar.f();
                    if (klVar.h.c.compareTo(vpVar2) >= 0) {
                        a aVar = mkVar.S.h;
                        aVar.c("setCurrentState");
                        aVar.e(vpVar);
                        z = true;
                    }
                }
                if (mkVar.R.c.compareTo(vpVar2) >= 0) {
                    a aVar2 = mkVar.R;
                    aVar2.c("setCurrentState");
                    aVar2.e(vpVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        d4 d4Var = (d4) j();
        d4Var.w();
        ((ViewGroup) d4Var.E.findViewById(R.id.content)).addView(view, layoutParams);
        d4Var.r.a(d4Var.q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        d4 d4Var = (d4) j();
        d4Var.S = true;
        int i = d4Var.W;
        if (i == -100) {
            i = p3.g;
        }
        int C = d4Var.C(context, i);
        int i2 = 0;
        if (p3.c(context) && p3.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (p3.n) {
                    try {
                        er erVar = p3.h;
                        if (erVar == null) {
                            if (p3.i == null) {
                                p3.i = er.a(jw.V(context));
                            }
                            if (!p3.i.a.a.isEmpty()) {
                                p3.h = p3.i;
                            }
                        } else if (!erVar.equals(p3.i)) {
                            er erVar2 = p3.h;
                            p3.i = erVar2;
                            jw.S(context, erVar2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!p3.k) {
                p3.f.execute(new j3(context, i2));
            }
        }
        er o = d4.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(d4.t(context, C, o, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof kd) {
            try {
                ((kd) context).a(d4.t(context, C, o, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (d4.n0) {
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
                    u3.a(configuration3, configuration4, configuration);
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
            Configuration t = d4.t(context, C, o, configuration, true);
            kd kdVar = new kd(context, com.derinko.gbini.n1casino.R.style.Theme_AppCompat_Empty);
            kdVar.a(t);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = kdVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        d6.c(theme);
                    } else {
                        synchronized (zo.j) {
                            if (!zo.l) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    zo.k = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                zo.l = true;
                            }
                            Method method = zo.k;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    zo.k = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = kdVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        d4 d4Var = (d4) j();
        d4Var.A();
        o8 o8Var = d4Var.s;
        if (getWindow().hasFeature(0)) {
            if (o8Var == null || !o8Var.n()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.vb, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        d4 d4Var = (d4) j();
        d4Var.A();
        o8 o8Var = d4Var.s;
        if (keyCode == 82 && o8Var != null && o8Var.b0(keyEvent)) {
            return true;
        }
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
        printWriter.print(this.B);
        printWriter.print(" mResumed=");
        printWriter.print(this.C);
        printWriter.print(" mStopped=");
        printWriter.print(this.D);
        if (getApplication() != null) {
            a6 a6Var = new a6(d(), dr.d);
            String canonicalName = dr.class.getCanonicalName();
            if (canonicalName == null) {
                t8.k("Local and anonymous classes can not be ViewModels");
                return;
            }
            i30 i30Var = ((dr) a6Var.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), dr.class)).c;
            if (i30Var.h > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (i30Var.h > 0) {
                    if (i30Var.g[0] != null) {
                        t8.c();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(i30Var.f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((ok) this.z.g).r.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        d4 d4Var = (d4) j();
        d4Var.w();
        return d4Var.q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        d4 d4Var = (d4) j();
        if (d4Var.t == null) {
            d4Var.A();
            o8 o8Var = d4Var.s;
            d4Var.t = new t40(o8Var != null ? o8Var.J() : d4Var.p);
        }
        return d4Var.t;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = c80.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        j().b();
    }

    public final p3 j() {
        if (this.E == null) {
            n3 n3Var = p3.f;
            this.E = new d4(this, null, this, this);
        }
        return this.E;
    }

    public final void l() {
        super.onDestroy();
        ((ok) this.z.g).r.k();
        this.A.d(up.ON_DESTROY);
    }

    public final boolean m(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((ok) this.z.g).r.i();
        }
        return false;
    }

    public final void n() {
        super.onPostResume();
        this.A.d(up.ON_RESUME);
        bl blVar = ((ok) this.z.g).r;
        blVar.E = false;
        blVar.F = false;
        blVar.L.h = false;
        blVar.t(7);
    }

    public final void o() {
        k0 k0Var = this.z;
        k0Var.G();
        ok okVar = (ok) k0Var.g;
        super.onStart();
        this.D = false;
        if (!this.B) {
            this.B = true;
            bl blVar = okVar.r;
            blVar.E = false;
            blVar.F = false;
            blVar.L.h = false;
            blVar.t(4);
        }
        okVar.r.y(true);
        this.A.d(up.ON_START);
        bl blVar2 = okVar.r;
        blVar2.E = false;
        blVar2.F = false;
        blVar2.L.h = false;
        blVar2.t(5);
    }

    @Override // defpackage.wb, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.z.G();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.wb, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d4 d4Var = (d4) j();
        if (d4Var.J && d4Var.D) {
            d4Var.A();
            o8 o8Var = d4Var.s;
            if (o8Var != null) {
                o8Var.X();
            }
        }
        h4 a = h4.a();
        Context context = d4Var.p;
        synchronized (a) {
            c00 c00Var = a.a;
            synchronized (c00Var) {
                hr hrVar = (hr) c00Var.b.get(context);
                if (hrVar != null) {
                    hrVar.a();
                }
            }
        }
        d4Var.V = new Configuration(d4Var.p.getResources().getConfiguration());
        d4Var.m(false, false);
    }

    @Override // defpackage.wb, defpackage.vb, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A.d(up.ON_CREATE);
        bl blVar = ((ok) this.z.g).r;
        blVar.E = false;
        blVar.F = false;
        blVar.L.h = false;
        blVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((ok) this.z.g).r.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        l();
        j().e();
    }

    @Override // defpackage.wb, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent t;
        if (!m(i, menuItem)) {
            d4 d4Var = (d4) j();
            d4Var.A();
            o8 o8Var = d4Var.s;
            if (menuItem.getItemId() != 16908332 || o8Var == null || (o8Var.x() & 4) == 0 || (t = zo.t(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(t)) {
                navigateUpTo(t);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent t2 = zo.t(this);
            if (t2 == null) {
                t2 = zo.t(this);
            }
            if (t2 != null) {
                ComponentName component = t2.getComponent();
                if (component == null) {
                    component = t2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent u = zo.u(this, component);
                    while (u != null) {
                        arrayList.add(size, u);
                        u = zo.u(this, u.getComponent());
                    }
                    arrayList.add(t2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                t8.t("No intents added to TaskStackBuilder; cannot startActivities");
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
        this.C = false;
        ((ok) this.z.g).r.t(5);
        this.A.d(up.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((d4) j()).w();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        n();
        d4 d4Var = (d4) j();
        d4Var.A();
        o8 o8Var = d4Var.s;
        if (o8Var != null) {
            o8Var.n0(true);
        }
    }

    @Override // defpackage.wb, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.z.G();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        k0 k0Var = this.z;
        k0Var.G();
        super.onResume();
        this.C = true;
        ((ok) k0Var.g).r.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        o();
        ((d4) j()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.z.G();
    }

    @Override // android.app.Activity
    public void onStop() {
        p();
        d4 d4Var = (d4) j();
        d4Var.A();
        o8 o8Var = d4Var.s;
        if (o8Var != null) {
            o8Var.n0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        j().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        d4 d4Var = (d4) j();
        d4Var.A();
        o8 o8Var = d4Var.s;
        if (getWindow().hasFeature(0)) {
            if (o8Var == null || !o8Var.c0()) {
                super.openOptionsMenu();
            }
        }
    }

    public final void p() {
        k0 k0Var;
        super.onStop();
        this.D = true;
        do {
            k0Var = this.z;
        } while (k(((ok) k0Var.g).r));
        bl blVar = ((ok) k0Var.g).r;
        blVar.F = true;
        blVar.L.h = true;
        blVar.t(4);
        this.A.d(up.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        i();
        j().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((d4) j()).X = i;
    }

    @Override // defpackage.wb, android.app.Activity
    public void setContentView(View view) {
        i();
        j().j(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        j().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((ok) this.z.g).r.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
