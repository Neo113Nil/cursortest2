package g;

import Y.AbstractComponentCallbacksC0051q;
import Y.C0053t;
import Y.C0054u;
import Y.Q;
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
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.EnumC0073m;
import androidx.recyclerview.widget.RecyclerView;
import d0.C0087a;
import g.AbstractActivityC0108i;
import j.C0146c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.C0239u;
import l.M0;
import l.d1;
import l.f1;
import z.AbstractC0323c;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0108i extends a.l implements InterfaceC0109j {

    /* renamed from: u, reason: collision with root package name */
    public boolean f2257u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2258v;

    /* renamed from: x, reason: collision with root package name */
    public LayoutInflaterFactory2C0092A f2260x;

    /* renamed from: s, reason: collision with root package name */
    public final C.g f2255s = new C.g(17, new C0054u(this));

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.t f2256t = new androidx.lifecycle.t(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f2259w = true;

    public AbstractActivityC0108i() {
        this.d.f2566b.e("android:support:lifecycle", new Y.r(0, this));
        final int i = 0;
        g(new J.a(this) { // from class: Y.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0108i f1153b;

            {
                this.f1153b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f1153b.f2255s.B();
                        break;
                    default:
                        this.f1153b.f2255s.B();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f1212k.add(new J.a(this) { // from class: Y.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0108i f1153b;

            {
                this.f1153b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1153b.f2255s.B();
                        break;
                    default:
                        this.f1153b.f2255s.B();
                        break;
                }
            }
        });
        h(new C0053t(this, 0));
        this.d.f2566b.e("androidx:appcompat", new C0106g(this));
        h(new C0107h(this));
    }

    public static boolean n(Y.I i) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : i.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                C0054u c0054u = abstractComponentCallbacksC0051q.f1142s;
                if ((c0054u == null ? null : c0054u.f1159e) != null) {
                    z2 |= n(abstractComponentCallbacksC0051q.g());
                }
                Q q2 = abstractComponentCallbacksC0051q.f1122N;
                EnumC0073m enumC0073m = EnumC0073m.d;
                if (q2 != null && q2.e().f1521c.compareTo(enumC0073m) >= 0) {
                    abstractComponentCallbacksC0051q.f1122N.f1027c.g();
                    z2 = true;
                }
                if (abstractComponentCallbacksC0051q.f1121M.f1521c.compareTo(enumC0073m) >= 0) {
                    abstractComponentCallbacksC0051q.f1121M.g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) l();
        layoutInflaterFactory2C0092A.v();
        ((ViewGroup) layoutInflaterFactory2C0092A.f2126B.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0092A.f2161m.a(layoutInflaterFactory2C0092A.f2160l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) l();
        layoutInflaterFactory2C0092A.f2139P = true;
        int i = layoutInflaterFactory2C0092A.f2143T;
        if (i == -100) {
            i = o.f2265b;
        }
        int B2 = layoutInflaterFactory2C0092A.B(context, i);
        if (o.b(context) && o.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (o.i) {
                    try {
                        G.f fVar = o.f2266c;
                        if (fVar == null) {
                            if (o.d == null) {
                                o.d = G.f.a(AbstractC0323c.e(context));
                            }
                            if (!o.d.f249a.f250a.isEmpty()) {
                                o.f2266c = o.d;
                            }
                        } else if (!fVar.equals(o.d)) {
                            G.f fVar2 = o.f2266c;
                            o.d = fVar2;
                            AbstractC0323c.d(context, fVar2.f249a.f250a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!o.f2268f) {
                o.f2264a.execute(new e0.g(context, 2));
            }
        }
        G.f m2 = LayoutInflaterFactory2C0092A.m(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0092A.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0146c) {
            try {
                ((C0146c) context).a(LayoutInflaterFactory2C0092A.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0092A.f2124k0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = RecyclerView.f1559A0;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = RecyclerView.f1559A0;
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
            Configuration s2 = LayoutInflaterFactory2C0092A.s(context, B2, m2, configuration, true);
            C0146c c0146c = new C0146c(context, com.winworm.neongrid.R.style.Theme_AppCompat_Empty);
            c0146c.a(s2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0146c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        B.q.a(theme);
                    } else {
                        synchronized (B.b.f28e) {
                            if (!B.b.f30g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    B.b.f29f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                B.b.f30g = true;
                            }
                            Method method = B.b.f29f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                    B.b.f29f = null;
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
        ((LayoutInflaterFactory2C0092A) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0092A) l()).z();
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
        printWriter.print(this.f2257u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2258v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2259w);
        if (getApplication() != null) {
            o.l lVar = ((C0087a) new C.g(c(), C0087a.f2062c).z(C0087a.class)).f2063b;
            if (lVar.f3295c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (lVar.f3295c > 0) {
                    if (lVar.f3294b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(lVar.f3293a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0054u) this.f2255s.f80b).d.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) l();
        layoutInflaterFactory2C0092A.v();
        return layoutInflaterFactory2C0092A.f2160l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) l();
        if (layoutInflaterFactory2C0092A.f2164p == null) {
            layoutInflaterFactory2C0092A.z();
            K k2 = layoutInflaterFactory2C0092A.f2163o;
            layoutInflaterFactory2C0092A.f2164p = new j.h(k2 != null ? k2.w0() : layoutInflaterFactory2C0092A.f2159k);
        }
        return layoutInflaterFactory2C0092A.f2164p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = f1.f2935a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) l();
        if (layoutInflaterFactory2C0092A.f2163o != null) {
            layoutInflaterFactory2C0092A.z();
            layoutInflaterFactory2C0092A.f2163o.getClass();
            layoutInflaterFactory2C0092A.A(0);
        }
    }

    public final o l() {
        if (this.f2260x == null) {
            m mVar = o.f2264a;
            this.f2260x = new LayoutInflaterFactory2C0092A(this, null, this, this);
        }
        return this.f2260x;
    }

    public final void m() {
        androidx.lifecycle.H.f(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        g1.d.e(decorView, "<this>");
        decorView.setTag(com.winworm.neongrid.R.id.view_tree_view_model_store_owner, this);
        i0.g.p(getWindow().getDecorView(), this);
        z1.l.S(getWindow().getDecorView(), this);
    }

    public final void o() {
        super.onDestroy();
        ((C0054u) this.f2255s.f80b).d.k();
        this.f2256t.d(EnumC0072l.ON_DESTROY);
    }

    @Override // a.l, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f2255s.B();
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) l();
        if (layoutInflaterFactory2C0092A.f2130G && layoutInflaterFactory2C0092A.f2125A) {
            layoutInflaterFactory2C0092A.z();
            K k2 = layoutInflaterFactory2C0092A.f2163o;
            if (k2 != null) {
                k2.z0(k2.f2199a.getResources().getBoolean(com.winworm.neongrid.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0239u a2 = C0239u.a();
        Context context = layoutInflaterFactory2C0092A.f2159k;
        synchronized (a2) {
            M0 m02 = a2.f3023a;
            synchronized (m02) {
                o.e eVar = (o.e) m02.f2854b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        layoutInflaterFactory2C0092A.f2142S = new Configuration(layoutInflaterFactory2C0092A.f2159k.getResources().getConfiguration());
        layoutInflaterFactory2C0092A.k(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // a.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2256t.d(EnumC0072l.ON_CREATE);
        Y.I i = ((C0054u) this.f2255s.f80b).d;
        i.f962E = false;
        i.F = false;
        i.f968L.f1004g = false;
        i.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0054u) this.f2255s.f80b).d.f974f.onCreateView(view, str, context, attributeSet);
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
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) l();
        layoutInflaterFactory2C0092A.z();
        K k2 = layoutInflaterFactory2C0092A.f2163o;
        if (menuItem.getItemId() == 16908332 && k2 != null && (((d1) k2.f2202e).f2924b & 4) != 0 && (a2 = AbstractC0323c.a(this)) != null) {
            if (!shouldUpRecreateTask(a2)) {
                navigateUpTo(a2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a3 = AbstractC0323c.a(this);
            if (a3 == null) {
                a3 = AbstractC0323c.a(this);
            }
            if (a3 != null) {
                ComponentName component = a3.getComponent();
                if (component == null) {
                    component = a3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = AbstractC0323c.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = AbstractC0323c.b(this, b2.getComponent());
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
    public void onPause() {
        super.onPause();
        this.f2258v = false;
        ((C0054u) this.f2255s.f80b).d.t(5);
        this.f2256t.d(EnumC0072l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0092A) l()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        q();
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) l();
        layoutInflaterFactory2C0092A.z();
        K k2 = layoutInflaterFactory2C0092A.f2163o;
        if (k2 != null) {
            k2.f2215t = true;
        }
    }

    @Override // a.l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2255s.B();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C.g gVar = this.f2255s;
        gVar.B();
        super.onResume();
        this.f2258v = true;
        ((C0054u) gVar.f80b).d.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        r();
        ((LayoutInflaterFactory2C0092A) l()).k(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2255s.B();
    }

    @Override // android.app.Activity
    public void onStop() {
        s();
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) l();
        layoutInflaterFactory2C0092A.z();
        K k2 = layoutInflaterFactory2C0092A.f2163o;
        if (k2 != null) {
            k2.f2215t = false;
            j.j jVar = k2.f2214s;
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
        ((LayoutInflaterFactory2C0092A) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final boolean p(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0054u) this.f2255s.f80b).d.i();
        }
        return false;
    }

    public final void q() {
        super.onPostResume();
        this.f2256t.d(EnumC0072l.ON_RESUME);
        Y.I i = ((C0054u) this.f2255s.f80b).d;
        i.f962E = false;
        i.F = false;
        i.f968L.f1004g = false;
        i.t(7);
    }

    public final void r() {
        C.g gVar = this.f2255s;
        gVar.B();
        super.onStart();
        this.f2259w = false;
        boolean z2 = this.f2257u;
        C0054u c0054u = (C0054u) gVar.f80b;
        if (!z2) {
            this.f2257u = true;
            Y.I i = c0054u.d;
            i.f962E = false;
            i.F = false;
            i.f968L.f1004g = false;
            i.t(4);
        }
        c0054u.d.y(true);
        this.f2256t.d(EnumC0072l.ON_START);
        Y.I i2 = c0054u.d;
        i2.f962E = false;
        i2.F = false;
        i2.f968L.f1004g = false;
        i2.t(5);
    }

    public final void s() {
        C.g gVar;
        super.onStop();
        this.f2259w = true;
        do {
            gVar = this.f2255s;
        } while (n(((C0054u) gVar.f80b).d));
        Y.I i = ((C0054u) gVar.f80b).d;
        i.F = true;
        i.f968L.f1004g = true;
        i.t(4);
        this.f2256t.d(EnumC0072l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m();
        l().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0092A) l()).f2144U = i;
    }

    @Override // a.l, android.app.Activity
    public void setContentView(View view) {
        m();
        l().h(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0054u) this.f2255s.f80b).d.f974f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        l().i(view, layoutParams);
    }
}
