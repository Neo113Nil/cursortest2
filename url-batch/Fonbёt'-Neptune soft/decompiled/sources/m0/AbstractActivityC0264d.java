package m0;

import B0.C0031i;
import P.O;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.textservice.TextServicesManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o0.C0279a;
import q0.C0287d;
import r0.C0289a;
import u0.AbstractC0310a;
import v0.C0311a;
import v0.C0312b;
import v0.C0313c;

/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0264d extends Activity implements androidx.lifecycle.l {

    /* renamed from: i, reason: collision with root package name */
    public static final int f3142i = View.generateViewId();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3143e = false;

    /* renamed from: f, reason: collision with root package name */
    public C0267g f3144f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.n f3145g;

    /* renamed from: h, reason: collision with root package name */
    public final OnBackInvokedCallback f3146h;

    public AbstractActivityC0264d() {
        int i2 = Build.VERSION.SDK_INT;
        this.f3146h = i2 < 33 ? null : i2 >= 34 ? new C0263c(this) : new OnBackInvokedCallback() { // from class: m0.b
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                AbstractActivityC0264d.this.onBackPressed();
            }
        };
        this.f3145g = new androidx.lifecycle.n(this);
    }

    @Override // androidx.lifecycle.l
    public final androidx.lifecycle.n a() {
        return this.f3145g;
    }

    public final String b() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int c() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    public final String d() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String e() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle g2 = g();
            String string = g2 != null ? g2.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String f() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle g2 = g();
            if (g2 != null) {
                return g2.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle g() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void h(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z2 && !this.f3143e) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f3146h);
                this.f3143e = true;
                return;
            }
            return;
        }
        if (z2 || !this.f3143e || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f3146h);
        this.f3143e = false;
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (d() != null || this.f3144f.f3156f) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : d() == null;
    }

    public final boolean k(String str) {
        C0267g c0267g = this.f3144f;
        if (c0267g == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0267g.f3159i) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (k("onActivityResult")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            if (c0267g.f3152b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            n0.e eVar = c0267g.f3152b.f3266d;
            if (!eVar.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            E0.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                eVar.f3290f.d(i2, i3, intent);
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (k("onBackPressed")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            n0.c cVar = c0267g.f3152b;
            if (cVar != null) {
                cVar.f3271i.f3474a.f("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:0|1|2|(1:6)|8|(1:10)|11|(2:13|(4:15|(1:17)|18|(2:20|21))(2:23|(4:25|(3:27|93|34)|40|(1:42)(2:43|44))(41:45|(1:47)|48|(1:50)|51|(1:53)(2:109|(1:111))|54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(1:68)|69|(1:71)|72|(1:74)|75|(1:77)|78|(1:80)|81|(1:83)|84|(2:86|(1:88)(1:89))|90|(1:92)|93|(1:95)|96|(1:98)|99|(1:101)|102|(1:104)|105|(1:107)|108)))|112|113|114|(1:116)|117|118|(1:120)|121|(1:123)(1:231)|124|(2:126|(1:128)(2:129|(1:131)(1:132)))|133|(4:135|136|137|(1:139)(2:218|(1:220)(2:221|222)))(1:230)|140|(1:142)|143|(1:145)|(1:147)(1:217)|148|(3:150|(1:152)(1:211)|153)(3:212|(1:214)(1:216)|215)|154|(6:156|(1:158)|159|(2:161|(3:163|(1:165)|166)(2:167|168))|169|170)|171|(1:173)|174|(1:176)|177|178|179|180|(2:(1:207)(1:184)|185)(1:208)|186|(2:187|(1:189)(1:190))|191|(2:192|(1:194)(1:195))|(2:196|(1:198)(1:199))|200|(6:202|(1:204)|159|(0)|169|170)(2:205|206)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0475, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0586  */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i2;
        try {
            Bundle g2 = g();
            if (g2 != null && (i2 = g2.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            h(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0267g c0267g = new C0267g(this);
        this.f3144f = c0267g;
        c0267g.c();
        int i3 = 0;
        if (c0267g.f3152b == null) {
            String d2 = c0267g.f3151a.d();
            if (d2 != null) {
                if (n0.i.f3302c == null) {
                    n0.i.f3302c = new n0.i(1);
                }
                n0.c cVar = (n0.c) n0.i.f3302c.f3303a.get(d2);
                c0267g.f3152b = cVar;
                c0267g.f3156f = true;
                if (cVar == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + d2 + "'");
                }
            } else {
                c0267g.f3151a.getClass();
                c0267g.f3152b = null;
                String stringExtra = c0267g.f3151a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (n0.i.f3301b == null) {
                        synchronized (n0.i.class) {
                            try {
                                if (n0.i.f3301b == null) {
                                    n0.i.f3301b = new n0.i(0);
                                }
                            } finally {
                            }
                        }
                    }
                    n0.h hVar = (n0.h) n0.i.f3301b.f3303a.get(stringExtra);
                    if (hVar == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    AbstractActivityC0264d abstractActivityC0264d = c0267g.f3151a;
                    abstractActivityC0264d.getClass();
                    n0.g gVar = new n0.g(abstractActivityC0264d);
                    c0267g.a(gVar);
                    c0267g.f3152b = hVar.a(gVar);
                    c0267g.f3156f = false;
                } else {
                    AbstractActivityC0264d abstractActivityC0264d2 = c0267g.f3151a;
                    abstractActivityC0264d2.getClass();
                    Intent intent = c0267g.f3151a.getIntent();
                    ArrayList arrayList = new ArrayList();
                    if (intent.getBooleanExtra("trace-startup", false)) {
                        arrayList.add("--trace-startup");
                    }
                    if (intent.getBooleanExtra("start-paused", false)) {
                        arrayList.add("--start-paused");
                    }
                    int intExtra = intent.getIntExtra("vm-service-port", 0);
                    if (intExtra > 0) {
                        arrayList.add("--vm-service-port=" + Integer.toString(intExtra));
                    } else {
                        int intExtra2 = intent.getIntExtra("observatory-port", 0);
                        if (intExtra2 > 0) {
                            arrayList.add("--vm-service-port=" + Integer.toString(intExtra2));
                        }
                    }
                    if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
                        arrayList.add("--disable-service-auth-codes");
                    }
                    if (intent.getBooleanExtra("endless-trace-buffer", false)) {
                        arrayList.add("--endless-trace-buffer");
                    }
                    if (intent.getBooleanExtra("use-test-fonts", false)) {
                        arrayList.add("--use-test-fonts");
                    }
                    if (intent.getBooleanExtra("enable-dart-profiling", false)) {
                        arrayList.add("--enable-dart-profiling");
                    }
                    if (intent.getBooleanExtra("enable-software-rendering", false)) {
                        arrayList.add("--enable-software-rendering");
                    }
                    if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
                        arrayList.add("--skia-deterministic-rendering");
                    }
                    if (intent.getBooleanExtra("trace-skia", false)) {
                        arrayList.add("--trace-skia");
                    }
                    String stringExtra2 = intent.getStringExtra("trace-skia-allowlist");
                    if (stringExtra2 != null) {
                        arrayList.add("--trace-skia-allowlist=".concat(stringExtra2));
                    }
                    if (intent.getBooleanExtra("trace-systrace", false)) {
                        arrayList.add("--trace-systrace");
                    }
                    if (intent.hasExtra("trace-to-file")) {
                        arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
                    }
                    if (intent.hasExtra("enable-impeller")) {
                        if (intent.getBooleanExtra("enable-impeller", false)) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
                        arrayList.add("--dump-skp-on-shader-compilation");
                    }
                    if (intent.getBooleanExtra("cache-sksl", false)) {
                        arrayList.add("--cache-sksl");
                    }
                    if (intent.getBooleanExtra("purge-persistent-cache", false)) {
                        arrayList.add("--purge-persistent-cache");
                    }
                    if (intent.getBooleanExtra("verbose-logging", false)) {
                        arrayList.add("--verbose-logging");
                    }
                    if (intent.hasExtra("dart-flags")) {
                        arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
                    }
                    HashSet hashSet = new HashSet(arrayList);
                    n0.h hVar2 = new n0.h(abstractActivityC0264d2, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0264d abstractActivityC0264d3 = c0267g.f3151a;
                    abstractActivityC0264d3.getClass();
                    n0.g gVar2 = new n0.g(abstractActivityC0264d3);
                    gVar2.f3298e = false;
                    gVar2.f3299f = c0267g.f3151a.j();
                    c0267g.a(gVar2);
                    c0267g.f3152b = hVar2.a(gVar2);
                    c0267g.f3156f = false;
                }
            }
        }
        c0267g.f3151a.getClass();
        n0.e eVar = c0267g.f3152b.f3266d;
        androidx.lifecycle.n nVar = c0267g.f3151a.f3145g;
        eVar.getClass();
        E0.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0267g c0267g2 = eVar.f3289e;
            if (c0267g2 != null) {
                c0267g2.b();
            }
            eVar.d();
            eVar.f3289e = c0267g;
            AbstractActivityC0264d abstractActivityC0264d4 = c0267g.f3151a;
            abstractActivityC0264d4.getClass();
            eVar.b(abstractActivityC0264d4, nVar);
            Trace.endSection();
            AbstractActivityC0264d abstractActivityC0264d5 = c0267g.f3151a;
            abstractActivityC0264d5.getClass();
            c0267g.f3154d = new io.flutter.plugin.platform.f(abstractActivityC0264d5, c0267g.f3152b.f3274l, abstractActivityC0264d5);
            AbstractActivityC0264d abstractActivityC0264d6 = c0267g.f3151a;
            n0.c cVar2 = c0267g.f3152b;
            if (!abstractActivityC0264d6.f3144f.f3156f) {
                AbstractC0310a.f(cVar2);
            }
            c0267g.f3159i = true;
            C0267g c0267g3 = this.f3144f;
            c0267g3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0267g3.f3151a.j()) {
                v0.j jVar = c0267g3.f3152b.f3273k;
                jVar.f3521e = true;
                v0.i iVar = jVar.f3520d;
                if (iVar != null) {
                    iVar.c(v0.j.a(bArr));
                    jVar.f3520d = null;
                    jVar.f3518b = bArr;
                } else if (jVar.f3522f) {
                    jVar.f3519c.f("push", v0.j.a(bArr), new v0.i(0, jVar, bArr));
                } else {
                    jVar.f3518b = bArr;
                }
            }
            c0267g3.f3151a.getClass();
            n0.e eVar2 = c0267g3.f3152b.f3266d;
            if (eVar2.e()) {
                E0.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) eVar2.f3290f.f3020f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f3145g.c(androidx.lifecycle.f.ON_CREATE);
            if (c() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0267g c0267g4 = this.f3144f;
            boolean z2 = (c() == 1 ? (char) 1 : (char) 2) == 1;
            c0267g4.c();
            if (c0267g4.f3151a.c() == 1) {
                AbstractActivityC0264d abstractActivityC0264d7 = c0267g4.f3151a;
                abstractActivityC0264d7.getClass();
                l lVar = new l(abstractActivityC0264d7, c0267g4.f3151a.c() != 1);
                c0267g4.f3151a.getClass();
                AbstractActivityC0264d abstractActivityC0264d8 = c0267g4.f3151a;
                abstractActivityC0264d8.getClass();
                c0267g4.f3153c = new q(abstractActivityC0264d8, lVar);
            } else {
                AbstractActivityC0264d abstractActivityC0264d9 = c0267g4.f3151a;
                abstractActivityC0264d9.getClass();
                n nVar2 = new n(abstractActivityC0264d9, null);
                nVar2.f3174e = false;
                nVar2.f3175f = false;
                nVar2.setSurfaceTextureListener(new m(nVar2));
                nVar2.setOpaque(c0267g4.f3151a.c() == 1);
                c0267g4.f3151a.getClass();
                AbstractActivityC0264d abstractActivityC0264d10 = c0267g4.f3151a;
                abstractActivityC0264d10.getClass();
                c0267g4.f3153c = new q(abstractActivityC0264d10, nVar2);
            }
            c0267g4.f3153c.f3188j.add(c0267g4.f3161k);
            c0267g4.f3151a.getClass();
            q qVar = c0267g4.f3153c;
            n0.c cVar3 = c0267g4.f3152b;
            qVar.getClass();
            Objects.toString(cVar3);
            if (qVar.c()) {
                if (cVar3 != qVar.f3190l) {
                    qVar.a();
                }
                c0267g4.f3153c.setId(f3142i);
                if (z2) {
                    q qVar2 = c0267g4.f3153c;
                    if (c0267g4.f3151a.c() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0267g4.f3155e != null) {
                        qVar2.getViewTreeObserver().removeOnPreDrawListener(c0267g4.f3155e);
                    }
                    c0267g4.f3155e = new ViewTreeObserverOnPreDrawListenerC0266f(c0267g4, qVar2);
                    qVar2.getViewTreeObserver().addOnPreDrawListener(c0267g4.f3155e);
                }
                setContentView(c0267g4.f3153c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(1073741824);
                window.getDecorView().setSystemUiVisibility(1280);
            }
            qVar.f3190l = cVar3;
            io.flutter.embedding.engine.renderer.l lVar2 = cVar3.f3264b;
            qVar.f3189k = lVar2.f2540d;
            qVar.f3186h.a(lVar2);
            C0265e c0265e = qVar.f3203z;
            lVar2.f2537a.addIsDisplayingFlutterUiListener(c0265e);
            if (lVar2.f2540d) {
                c0265e.b();
            }
            if (Build.VERSION.SDK_INT >= 24) {
                qVar.f3192n = new O(qVar, qVar.f3190l.f3270h);
            }
            n0.c cVar4 = qVar.f3190l;
            qVar.f3193o = new io.flutter.plugin.editing.j(qVar, cVar4.f3279q, cVar4.f3275m, cVar4.f3280r);
            TextServicesManager textServicesManager = (TextServicesManager) qVar.getContext().getSystemService("textservices");
            qVar.f3199u = textServicesManager;
            qVar.f3194p = new io.flutter.plugin.editing.g(textServicesManager, qVar.f3190l.f3277o);
            new O(qVar, qVar.f3193o.f2597b, qVar.f3190l.f3275m);
            qVar.f3195q = qVar.f3190l.f3267e;
            qVar.f3196r = new C0031i(qVar);
            qVar.f3197s = new C0261a(qVar.f3190l.f3264b, false);
            io.flutter.view.k kVar = new io.flutter.view.k(qVar, cVar3.f3268f, (AccessibilityManager) qVar.getContext().getSystemService("accessibility"), qVar.getContext().getContentResolver(), qVar.f3190l.f3280r);
            qVar.f3198t = kVar;
            kVar.f2807s = qVar.f3201x;
            boolean isEnabled = kVar.f2791c.isEnabled();
            boolean isTouchExplorationEnabled = qVar.f3198t.f2791c.isTouchExplorationEnabled();
            if (qVar.f3190l.f3264b.f2537a.getIsSoftwareRenderingEnabled()) {
                qVar.setWillNotDraw(false);
            } else {
                qVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            n0.c cVar5 = qVar.f3190l;
            io.flutter.plugin.platform.o oVar = cVar5.f3280r;
            oVar.f2662h.f2622a = qVar.f3198t;
            oVar.f2656b = new C0261a(cVar5.f3264b, true);
            qVar.f3193o.f2597b.restartInput(qVar);
            qVar.d();
            qVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, qVar.f3202y);
            qVar.e();
            io.flutter.plugin.platform.o oVar2 = cVar3.f3280r;
            oVar2.f2658d = qVar;
            int i4 = 0;
            while (true) {
                SparseArray sparseArray = oVar2.f2668n;
                if (i4 >= sparseArray.size()) {
                    break;
                }
                oVar2.f2658d.addView((io.flutter.plugin.platform.j) sparseArray.valueAt(i4));
                i4++;
            }
            int i5 = 0;
            while (true) {
                SparseArray sparseArray2 = oVar2.f2666l;
                if (i5 >= sparseArray2.size()) {
                    break;
                }
                oVar2.f2658d.addView((C0289a) sparseArray2.valueAt(i5));
                i5++;
            }
            while (true) {
                SparseArray sparseArray3 = oVar2.f2665k;
                if (i3 >= sparseArray3.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray3.valueAt(i3)).getClass();
                i3++;
            }
            Iterator it2 = qVar.f3191m.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            if (qVar.f3189k) {
                c0265e.b();
            }
            c0267g4.f3153c.setId(f3142i);
            if (z2) {
            }
            setContentView(c0267g4.f3153c);
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            window2.setStatusBarColor(1073741824);
            window2.getDecorView().setSystemUiVisibility(1280);
        } finally {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th.addSuppressed(th3);
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (k("onDestroy")) {
            this.f3144f.e();
            this.f3144f.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f3146h);
            this.f3143e = false;
        }
        C0267g c0267g = this.f3144f;
        if (c0267g != null) {
            c0267g.f3151a = null;
            c0267g.f3152b = null;
            c0267g.f3153c = null;
            c0267g.f3154d = null;
            this.f3144f = null;
        }
        this.f3145g.c(androidx.lifecycle.f.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            n0.c cVar = c0267g.f3152b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            n0.e eVar = cVar.f3266d;
            if (eVar.e()) {
                E0.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) eVar.f3290f.f3018d).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            String d2 = c0267g.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            C0311a c0311a = c0267g.f3152b.f3271i;
            c0311a.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d2);
            c0311a.f3474a.f("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            c0267g.f3151a.getClass();
            n0.c cVar = c0267g.f3152b;
            if (cVar != null) {
                C0313c c0313c = cVar.f3269g;
                c0313c.a(3, c0313c.f3478c);
            }
        }
        this.f3145g.c(androidx.lifecycle.f.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            if (c0267g.f3152b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.f fVar = c0267g.f3154d;
            if (fVar != null) {
                fVar.b();
            }
            c0267g.f3152b.f3280r.j();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            if (c0267g.f3152b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            n0.e eVar = c0267g.f3152b.f3266d;
            if (!eVar.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            E0.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) eVar.f3290f.f3016b).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f3145g.c(androidx.lifecycle.f.ON_RESUME);
        if (k("onResume")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            c0267g.f3151a.getClass();
            n0.c cVar = c0267g.f3152b;
            if (cVar != null) {
                C0313c c0313c = cVar.f3269g;
                c0313c.a(2, c0313c.f3478c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            if (c0267g.f3151a.j()) {
                bundle.putByteArray("framework", c0267g.f3152b.f3273k.f3518b);
            }
            c0267g.f3151a.getClass();
            Bundle bundle2 = new Bundle();
            n0.e eVar = c0267g.f3152b.f3266d;
            if (eVar.e()) {
                E0.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) eVar.f3290f.f3020f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0267g.f3151a.d() == null || c0267g.f3151a.i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0267g.f3151a.f3143e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        String b2;
        Bundle g2;
        super.onStart();
        this.f3145g.c(androidx.lifecycle.f.ON_START);
        if (k("onStart")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            if (c0267g.f3151a.d() == null && !c0267g.f3152b.f3265c.f3328e) {
                String f2 = c0267g.f3151a.f();
                if (f2 == null) {
                    AbstractActivityC0264d abstractActivityC0264d = c0267g.f3151a;
                    abstractActivityC0264d.getClass();
                    f2 = c0267g.d(abstractActivityC0264d.getIntent());
                    if (f2 == null) {
                        f2 = "/";
                    }
                }
                AbstractActivityC0264d abstractActivityC0264d2 = c0267g.f3151a;
                abstractActivityC0264d2.getClass();
                try {
                    g2 = abstractActivityC0264d2.g();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (g2 != null) {
                    str = g2.getString("io.flutter.EntrypointUri");
                    c0267g.f3151a.e();
                    c0267g.f3152b.f3271i.f3474a.f("setInitialRoute", f2, null);
                    b2 = c0267g.f3151a.b();
                    if (b2 != null || b2.isEmpty()) {
                        b2 = (String) ((C0287d) C0031i.G().f154f).f3382d.f3330g;
                    }
                    c0267g.f3152b.f3265c.d(str != null ? new C0279a(b2, c0267g.f3151a.e()) : new C0279a(b2, str, c0267g.f3151a.e()), (List) c0267g.f3151a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0267g.f3151a.e();
                c0267g.f3152b.f3271i.f3474a.f("setInitialRoute", f2, null);
                b2 = c0267g.f3151a.b();
                if (b2 != null) {
                }
                b2 = (String) ((C0287d) C0031i.G().f154f).f3382d.f3330g;
                c0267g.f3152b.f3265c.d(str != null ? new C0279a(b2, c0267g.f3151a.e()) : new C0279a(b2, str, c0267g.f3151a.e()), (List) c0267g.f3151a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0267g.f3160j;
            if (num != null) {
                c0267g.f3153c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            c0267g.f3151a.getClass();
            n0.c cVar = c0267g.f3152b;
            if (cVar != null) {
                C0313c c0313c = cVar.f3269g;
                c0313c.a(5, c0313c.f3478c);
            }
            c0267g.f3160j = Integer.valueOf(c0267g.f3153c.getVisibility());
            c0267g.f3153c.setVisibility(8);
            n0.c cVar2 = c0267g.f3152b;
            if (cVar2 != null) {
                cVar2.f3264b.e(40);
            }
        }
        this.f3145g.c(androidx.lifecycle.f.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (k("onTrimMemory")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            n0.c cVar = c0267g.f3152b;
            if (cVar != null) {
                if (c0267g.f3158h && i2 >= 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) cVar.f3265c.f3329f;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0312b c0312b = c0267g.f3152b.f3278p;
                    c0312b.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    c0312b.f3475a.h(hashMap, null);
                }
                c0267g.f3152b.f3264b.e(i2);
                io.flutter.plugin.platform.o oVar = c0267g.f3152b.f3280r;
                if (i2 < 40) {
                    oVar.getClass();
                    return;
                }
                Iterator it = oVar.f2663i.values().iterator();
                while (it.hasNext()) {
                    ((io.flutter.plugin.platform.A) it.next()).f2619h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (k("onUserLeaveHint")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            n0.c cVar = c0267g.f3152b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            n0.e eVar = cVar.f3266d;
            if (!eVar.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            E0.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) eVar.f3290f.f3019e).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (k("onWindowFocusChanged")) {
            C0267g c0267g = this.f3144f;
            c0267g.c();
            c0267g.f3151a.getClass();
            n0.c cVar = c0267g.f3152b;
            if (cVar != null) {
                C0313c c0313c = cVar.f3269g;
                if (z2) {
                    c0313c.a(c0313c.f3476a, true);
                } else {
                    c0313c.a(c0313c.f3476a, false);
                }
            }
        }
    }
}
