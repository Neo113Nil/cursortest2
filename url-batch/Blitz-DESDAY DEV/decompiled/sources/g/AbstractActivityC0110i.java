package g;

import Z.AbstractComponentCallbacksC0047q;
import Z.C0049t;
import Z.C0050u;
import Z.Q;
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
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.EnumC0070m;
import e0.C0083a;
import f0.RunnableC0091g;
import g.AbstractActivityC0110i;
import j.C0146c;
import j.C0151h;
import j.C0153j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.C0214u;
import l.N0;
import l.e1;
import l.g1;
import m.C0227a;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0110i extends a.l implements InterfaceC0111j {

    /* renamed from: u, reason: collision with root package name */
    public boolean f2319u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2320v;

    /* renamed from: x, reason: collision with root package name */
    public LayoutInflaterFactory2C0101A f2322x;

    /* renamed from: s, reason: collision with root package name */
    public final E.g f2317s = new E.g(18, new C0050u(this));

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.t f2318t = new androidx.lifecycle.t(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f2321w = true;

    public AbstractActivityC0110i() {
        this.d.f2686b.e("android:support:lifecycle", new Z.r(0, this));
        final int i = 0;
        i(new L.a(this) { // from class: Z.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0110i f1215b;

            {
                this.f1215b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f1215b.f2317s.y();
                        break;
                    default:
                        this.f1215b.f2317s.y();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f1267k.add(new L.a(this) { // from class: Z.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0110i f1215b;

            {
                this.f1215b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1215b.f2317s.y();
                        break;
                    default:
                        this.f1215b.f2317s.y();
                        break;
                }
            }
        });
        j(new C0049t(this, 0));
        this.d.f2686b.e("androidx:appcompat", new C0108g(this));
        j(new C0109h(this));
    }

    public static boolean p(Z.I i) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : i.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                C0050u c0050u = abstractComponentCallbacksC0047q.f1204s;
                if ((c0050u == null ? null : c0050u.f1221e) != null) {
                    z2 |= p(abstractComponentCallbacksC0047q.g());
                }
                Q q2 = abstractComponentCallbacksC0047q.f1184N;
                EnumC0070m enumC0070m = EnumC0070m.d;
                if (q2 != null && q2.f().f1578c.compareTo(enumC0070m) >= 0) {
                    abstractComponentCallbacksC0047q.f1184N.f1089c.g();
                    z2 = true;
                }
                if (abstractComponentCallbacksC0047q.f1183M.f1578c.compareTo(enumC0070m) >= 0) {
                    abstractComponentCallbacksC0047q.f1183M.g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) n();
        layoutInflaterFactory2C0101A.v();
        ((ViewGroup) layoutInflaterFactory2C0101A.f2188B.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0101A.f2223m.a(layoutInflaterFactory2C0101A.f2222l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) n();
        layoutInflaterFactory2C0101A.f2201P = true;
        int i = layoutInflaterFactory2C0101A.f2205T;
        if (i == -100) {
            i = o.f2327b;
        }
        int B2 = layoutInflaterFactory2C0101A.B(context, i);
        if (o.b(context) && o.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (o.i) {
                    try {
                        I.f fVar = o.f2328c;
                        if (fVar == null) {
                            if (o.d == null) {
                                o.d = I.f.a(B.e.e(context));
                            }
                            if (!o.d.f333a.f334a.isEmpty()) {
                                o.f2328c = o.d;
                            }
                        } else if (!fVar.equals(o.d)) {
                            I.f fVar2 = o.f2328c;
                            o.d = fVar2;
                            B.e.d(context, fVar2.f333a.f334a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!o.f2330f) {
                o.f2326a.execute(new RunnableC0091g(context, 2));
            }
        }
        I.f m2 = LayoutInflaterFactory2C0101A.m(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0101A.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0146c) {
            try {
                ((C0146c) context).a(LayoutInflaterFactory2C0101A.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0101A.f2186k0) {
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
                    t.a(configuration3, configuration4, configuration);
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
            Configuration s2 = LayoutInflaterFactory2C0101A.s(context, B2, m2, configuration, true);
            C0146c c0146c = new C0146c(context, com.winfour.neondrop.R.style.Theme_AppCompat_Empty);
            c0146c.a(s2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0146c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        D.q.a(theme);
                    } else {
                        synchronized (D.b.f116e) {
                            if (!D.b.f118g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    D.b.f117f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                D.b.f118g = true;
                            }
                            Method method = D.b.f117f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                    D.b.f117f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0146c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C0101A) n()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0101A) n()).z();
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
        printWriter.print(this.f2319u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2320v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2321w);
        if (getApplication() != null) {
            q.l lVar = ((C0083a) new E.g(d(), C0083a.f2125c).w(C0083a.class)).f2126b;
            if (lVar.f3375c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (lVar.f3375c > 0) {
                    if (lVar.f3374b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(lVar.f3373a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0050u) this.f2317s.f170b).d.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) n();
        layoutInflaterFactory2C0101A.v();
        return layoutInflaterFactory2C0101A.f2222l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) n();
        if (layoutInflaterFactory2C0101A.f2226p == null) {
            layoutInflaterFactory2C0101A.z();
            K k2 = layoutInflaterFactory2C0101A.f2225o;
            layoutInflaterFactory2C0101A.f2226p = new C0151h(k2 != null ? k2.z0() : layoutInflaterFactory2C0101A.f2221k);
        }
        return layoutInflaterFactory2C0101A.f2226p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = g1.f2993a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) n();
        if (layoutInflaterFactory2C0101A.f2225o != null) {
            layoutInflaterFactory2C0101A.z();
            layoutInflaterFactory2C0101A.f2225o.getClass();
            layoutInflaterFactory2C0101A.A(0);
        }
    }

    public final o n() {
        if (this.f2322x == null) {
            m mVar = o.f2326a;
            this.f2322x = new LayoutInflaterFactory2C0101A(this, null, this, this);
        }
        return this.f2322x;
    }

    public final void o() {
        androidx.lifecycle.H.f(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        g1.d.e(decorView, "<this>");
        decorView.setTag(com.winfour.neondrop.R.id.view_tree_view_model_store_owner, this);
        C0227a.p(getWindow().getDecorView(), this);
        z1.d.U(getWindow().getDecorView(), this);
    }

    @Override // a.l, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f2317s.y();
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) n();
        if (layoutInflaterFactory2C0101A.f2193G && layoutInflaterFactory2C0101A.f2187A) {
            layoutInflaterFactory2C0101A.z();
            K k2 = layoutInflaterFactory2C0101A.f2225o;
            if (k2 != null) {
                k2.C0(k2.f2261a.getResources().getBoolean(com.winfour.neondrop.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0214u a2 = C0214u.a();
        Context context = layoutInflaterFactory2C0101A.f2221k;
        synchronized (a2) {
            N0 n02 = a2.f3079a;
            synchronized (n02) {
                q.e eVar = (q.e) n02.f2912b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        layoutInflaterFactory2C0101A.f2204S = new Configuration(layoutInflaterFactory2C0101A.f2221k.getResources().getConfiguration());
        layoutInflaterFactory2C0101A.k(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // a.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2318t.d(EnumC0069l.ON_CREATE);
        Z.I i = ((C0050u) this.f2317s.f170b).d;
        i.f1024E = false;
        i.f1025F = false;
        i.f1030L.f1066g = false;
        i.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0050u) this.f2317s.f170b).d.f1036f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        q();
        n().d();
    }

    @Override // a.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a2;
        if (r(i, menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) n();
        layoutInflaterFactory2C0101A.z();
        K k2 = layoutInflaterFactory2C0101A.f2225o;
        if (menuItem.getItemId() == 16908332 && k2 != null && (((e1) k2.f2264e).f2980b & 4) != 0 && (a2 = B.e.a(this)) != null) {
            if (!shouldUpRecreateTask(a2)) {
                navigateUpTo(a2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a3 = B.e.a(this);
            if (a3 == null) {
                a3 = B.e.a(this);
            }
            if (a3 != null) {
                ComponentName component = a3.getComponent();
                if (component == null) {
                    component = a3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = B.e.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = B.e.b(this, b2.getComponent());
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
        this.f2320v = false;
        ((C0050u) this.f2317s.f170b).d.t(5);
        this.f2318t.d(EnumC0069l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0101A) n()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        s();
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) n();
        layoutInflaterFactory2C0101A.z();
        K k2 = layoutInflaterFactory2C0101A.f2225o;
        if (k2 != null) {
            k2.f2277t = true;
        }
    }

    @Override // a.l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2317s.y();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        E.g gVar = this.f2317s;
        gVar.y();
        super.onResume();
        this.f2320v = true;
        ((C0050u) gVar.f170b).d.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        t();
        ((LayoutInflaterFactory2C0101A) n()).k(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2317s.y();
    }

    @Override // android.app.Activity
    public final void onStop() {
        u();
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) n();
        layoutInflaterFactory2C0101A.z();
        K k2 = layoutInflaterFactory2C0101A.f2225o;
        if (k2 != null) {
            k2.f2277t = false;
            C0153j c0153j = k2.f2276s;
            if (c0153j != null) {
                c0153j.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        n().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C0101A) n()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void q() {
        super.onDestroy();
        ((C0050u) this.f2317s.f170b).d.k();
        this.f2318t.d(EnumC0069l.ON_DESTROY);
    }

    public final boolean r(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0050u) this.f2317s.f170b).d.i();
        }
        return false;
    }

    public final void s() {
        super.onPostResume();
        this.f2318t.d(EnumC0069l.ON_RESUME);
        Z.I i = ((C0050u) this.f2317s.f170b).d;
        i.f1024E = false;
        i.f1025F = false;
        i.f1030L.f1066g = false;
        i.t(7);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        o();
        n().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0101A) n()).f2206U = i;
    }

    public final void t() {
        E.g gVar = this.f2317s;
        gVar.y();
        super.onStart();
        this.f2321w = false;
        boolean z2 = this.f2319u;
        C0050u c0050u = (C0050u) gVar.f170b;
        if (!z2) {
            this.f2319u = true;
            Z.I i = c0050u.d;
            i.f1024E = false;
            i.f1025F = false;
            i.f1030L.f1066g = false;
            i.t(4);
        }
        c0050u.d.y(true);
        this.f2318t.d(EnumC0069l.ON_START);
        Z.I i2 = c0050u.d;
        i2.f1024E = false;
        i2.f1025F = false;
        i2.f1030L.f1066g = false;
        i2.t(5);
    }

    public final void u() {
        E.g gVar;
        super.onStop();
        this.f2321w = true;
        do {
            gVar = this.f2317s;
        } while (p(((C0050u) gVar.f170b).d));
        Z.I i = ((C0050u) gVar.f170b).d;
        i.f1025F = true;
        i.f1030L.f1066g = true;
        i.t(4);
        this.f2318t.d(EnumC0069l.ON_STOP);
    }

    @Override // a.l, android.app.Activity
    public void setContentView(View view) {
        o();
        n().h(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0050u) this.f2317s.f170b).d.f1036f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        n().i(view, layoutParams);
    }
}
