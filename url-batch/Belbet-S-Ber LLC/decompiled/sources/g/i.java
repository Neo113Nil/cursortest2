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
import androidx.fragment.app.s0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.a3;
import l.c3;
import l.j2;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class i extends a.m implements j {
    public boolean B;
    public boolean C;
    public a0 E;

    /* renamed from: z, reason: collision with root package name */
    public final a0.a f1527z = new a0.a(4, new androidx.fragment.app.w(this));
    public final androidx.lifecycle.t A = new androidx.lifecycle.t(this);
    public boolean D = true;

    public i() {
        this.i.f1972b.e("android:support:lifecycle", new a.g(1, this));
        final int i = 0;
        g(new m0.a(this) { // from class: androidx.fragment.app.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g.i f666b;

            {
                this.f666b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f666b.f1527z.H();
                        break;
                    default:
                        this.f666b.f1527z.H();
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f55p.add(new m0.a(this) { // from class: androidx.fragment.app.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g.i f666b;

            {
                this.f666b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f666b.f1527z.H();
                        break;
                    default:
                        this.f666b.f1527z.H();
                        break;
                }
            }
        });
        h(new a.h(this, 1));
        this.i.f1972b.e("androidx:appcompat", new g(this));
        h(new h(this));
    }

    public static boolean l(androidx.fragment.app.k0 k0Var) {
        boolean z4 = false;
        for (androidx.fragment.app.u uVar : k0Var.f556c.m()) {
            if (uVar != null) {
                androidx.fragment.app.w wVar = uVar.f660x;
                if ((wVar == null ? null : wVar.f677s) != null) {
                    z4 |= l(uVar.g());
                }
                s0 s0Var = uVar.S;
                androidx.lifecycle.m mVar = androidx.lifecycle.m.i;
                if (s0Var != null) {
                    s0Var.d();
                    if (s0Var.h.f734c.compareTo(mVar) >= 0) {
                        uVar.S.h.g();
                        z4 = true;
                    }
                }
                if (uVar.R.f734c.compareTo(mVar) >= 0) {
                    uVar.R.g();
                    z4 = true;
                }
            }
        }
        return z4;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        a0 a0Var = (a0) k();
        a0Var.u();
        ((ViewGroup) a0Var.G.findViewById(R.id.content)).addView(view, layoutParams);
        a0Var.f1461r.a(a0Var.f1460q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        a0 a0Var = (a0) k();
        a0Var.U = true;
        int i = a0Var.Y;
        if (i == -100) {
            i = o.f1558g;
        }
        int B = a0Var.B(context, i);
        if (o.b(context) && o.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (o.f1563n) {
                    try {
                        j0.f fVar = o.h;
                        if (fVar == null) {
                            if (o.i == null) {
                                o.i = j0.f.a(c0.c.f(context));
                            }
                            if (!o.i.f2134a.f2135a.isEmpty()) {
                                o.h = o.i;
                            }
                        } else if (!fVar.equals(o.i)) {
                            j0.f fVar2 = o.h;
                            o.i = fVar2;
                            c0.c.e(context, fVar2.f2134a.f2135a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!o.f1560k) {
                o.f1557f.execute(new e1.h(context, 2));
            }
        }
        j0.f m4 = a0.m(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(a0.r(context, B, m4, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof j.c) {
            try {
                ((j.c) context).a(a0.r(context, B, m4, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (a0.f1446p0) {
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
                    float f5 = configuration3.fontScale;
                    float f6 = configuration4.fontScale;
                    if (f5 != f6) {
                        configuration.fontScale = f6;
                    }
                    int i4 = configuration3.mcc;
                    int i5 = configuration4.mcc;
                    if (i4 != i5) {
                        configuration.mcc = i5;
                    }
                    int i6 = configuration3.mnc;
                    int i7 = configuration4.mnc;
                    if (i6 != i7) {
                        configuration.mnc = i7;
                    }
                    t.a(configuration3, configuration4, configuration);
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.colorMode & 3;
                    int i29 = configuration4.colorMode & 3;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.colorMode & 12;
                    int i31 = configuration4.colorMode & 12;
                    if (i30 != i31) {
                        configuration.colorMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 15;
                    int i33 = configuration4.uiMode & 15;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.uiMode & 48;
                    int i35 = configuration4.uiMode & 48;
                    if (i34 != i35) {
                        configuration.uiMode |= i35;
                    }
                    int i36 = configuration3.screenWidthDp;
                    int i37 = configuration4.screenWidthDp;
                    if (i36 != i37) {
                        configuration.screenWidthDp = i37;
                    }
                    int i38 = configuration3.screenHeightDp;
                    int i39 = configuration4.screenHeightDp;
                    if (i38 != i39) {
                        configuration.screenHeightDp = i39;
                    }
                    int i40 = configuration3.smallestScreenWidthDp;
                    int i41 = configuration4.smallestScreenWidthDp;
                    if (i40 != i41) {
                        configuration.smallestScreenWidthDp = i41;
                    }
                    int i42 = configuration3.densityDpi;
                    int i43 = configuration4.densityDpi;
                    if (i42 != i43) {
                        configuration.densityDpi = i43;
                    }
                }
            }
            Configuration r4 = a0.r(context, B, m4, configuration, true);
            j.c cVar = new j.c(context, com.gdmhkmf.belbet.R.style.Theme_AppCompat_Empty);
            cVar.a(r4);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        e0.l.a(theme);
                    } else {
                        synchronized (e0.b.f1316e) {
                            if (!e0.b.f1318g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    e0.b.f1317f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e4) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e4);
                                }
                                e0.b.f1318g = true;
                            }
                            Method method = e0.b.f1317f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e5) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e5);
                                    e0.b.f1317f = null;
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
        ((a0) k()).y();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // c0.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((a0) k()).y();
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
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(e(), c1.a.d);
            String canonicalName = c1.a.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            q.k kVar = ((c1.a) tVar.b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), c1.a.class)).f874c;
            if (kVar.h > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (kVar.h > 0) {
                    if (kVar.f3117g[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(kVar.f3116f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((androidx.fragment.app.w) this.f1527z.f79g).f676r.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        a0 a0Var = (a0) k();
        a0Var.u();
        return a0Var.f1460q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        a0 a0Var = (a0) k();
        if (a0Var.f1464u == null) {
            a0Var.y();
            k0 k0Var = a0Var.f1463t;
            a0Var.f1464u = new j.h(k0Var != null ? k0Var.m0() : a0Var.f1459p);
        }
        return a0Var.f1464u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = c3.f2426a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        a0 a0Var = (a0) k();
        if (a0Var.f1463t != null) {
            a0Var.y();
            a0Var.f1463t.getClass();
            a0Var.A(0);
        }
    }

    public final o k() {
        if (this.E == null) {
            m mVar = o.f1557f;
            this.E = new a0(this, null, this, this);
        }
        return this.E;
    }

    public final void m() {
        super.onDestroy();
        ((androidx.fragment.app.w) this.f1527z.f79g).f676r.l();
        this.A.d(androidx.lifecycle.l.ON_DESTROY);
    }

    public final boolean n(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((androidx.fragment.app.w) this.f1527z.f79g).f676r.i();
        }
        return false;
    }

    public final void o() {
        super.onPostResume();
        this.A.d(androidx.lifecycle.l.ON_RESUME);
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) this.f1527z.f79g).f676r;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.u(7);
    }

    @Override // a.m, android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        this.f1527z.H();
        super.onActivityResult(i, i4, intent);
    }

    @Override // a.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0 a0Var = (a0) k();
        if (a0Var.L && a0Var.F) {
            a0Var.y();
            k0 k0Var = a0Var.f1463t;
            if (k0Var != null) {
                k0Var.p0(k0Var.f1534b.getResources().getBoolean(com.gdmhkmf.belbet.R.bool.abc_action_bar_embed_tabs));
            }
        }
        l.r a5 = l.r.a();
        Context context = a0Var.f1459p;
        synchronized (a5) {
            j2 j2Var = a5.f2550a;
            synchronized (j2Var) {
                q.h hVar = (q.h) j2Var.f2488b.get(context);
                if (hVar != null) {
                    hVar.a();
                }
            }
        }
        a0Var.X = new Configuration(a0Var.f1459p.getResources().getConfiguration());
        a0Var.k(false, false);
    }

    @Override // a.m, c0.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A.d(androidx.lifecycle.l.ON_CREATE);
        ((androidx.fragment.app.w) this.f1527z.f79g).f676r.j();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((androidx.fragment.app.w) this.f1527z.f79g).f676r.f558f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        m();
        k().d();
    }

    @Override // a.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent b2;
        if (!n(i, menuItem)) {
            a0 a0Var = (a0) k();
            a0Var.y();
            k0 k0Var = a0Var.f1463t;
            if (menuItem.getItemId() != 16908332 || k0Var == null || (((a3) k0Var.f1537f).f2392b & 4) == 0 || (b2 = c0.c.b(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(b2)) {
                navigateUpTo(b2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent b5 = c0.c.b(this);
            if (b5 == null) {
                b5 = c0.c.b(this);
            }
            if (b5 != null) {
                ComponentName component = b5.getComponent();
                if (component == null) {
                    component = b5.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent c5 = c0.c.c(this, component);
                    while (c5 != null) {
                        arrayList.add(size, c5);
                        c5 = c0.c.c(this, c5.getComponent());
                    }
                    arrayList.add(b5);
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
        this.C = false;
        ((androidx.fragment.app.w) this.f1527z.f79g).f676r.u(5);
        this.A.d(androidx.lifecycle.l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((a0) k()).u();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        o();
        a0 a0Var = (a0) k();
        a0Var.y();
        k0 k0Var = a0Var.f1463t;
        if (k0Var != null) {
            k0Var.f1550u = true;
        }
    }

    @Override // a.m, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1527z.H();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        a0.a aVar = this.f1527z;
        aVar.H();
        super.onResume();
        this.C = true;
        ((androidx.fragment.app.w) aVar.f79g).f676r.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        p();
        ((a0) k()).k(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1527z.H();
    }

    @Override // android.app.Activity
    public final void onStop() {
        q();
        a0 a0Var = (a0) k();
        a0Var.y();
        k0 k0Var = a0Var.f1463t;
        if (k0Var != null) {
            k0Var.f1550u = false;
            j.j jVar = k0Var.f1549t;
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
        ((a0) k()).y();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        a0.a aVar = this.f1527z;
        aVar.H();
        androidx.fragment.app.w wVar = (androidx.fragment.app.w) aVar.f79g;
        super.onStart();
        this.D = false;
        if (!this.B) {
            this.B = true;
            androidx.fragment.app.k0 k0Var = wVar.f676r;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.h = false;
            k0Var.u(4);
        }
        wVar.f676r.y(true);
        this.A.d(androidx.lifecycle.l.ON_START);
        androidx.fragment.app.k0 k0Var2 = wVar.f676r;
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.h = false;
        k0Var2.u(5);
    }

    public final void q() {
        a0.a aVar;
        super.onStop();
        this.D = true;
        do {
            aVar = this.f1527z;
        } while (l(((androidx.fragment.app.w) aVar.f79g).f676r));
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) aVar.f79g).f676r;
        k0Var.F = true;
        k0Var.L.h = true;
        k0Var.u(4);
        this.A.d(androidx.lifecycle.l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        j();
        k().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((a0) k()).Z = i;
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
        View onCreateView = ((androidx.fragment.app.w) this.f1527z.f79g).f676r.f558f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
