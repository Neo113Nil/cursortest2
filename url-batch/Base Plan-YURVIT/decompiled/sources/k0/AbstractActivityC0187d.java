package k0;

import B0.C0008i;
import N.P;
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
import androidx.datastore.preferences.protobuf.k0;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p0.C0220e;
import u0.C0230b;
import u0.C0231c;
import u0.C0232d;
import z0.C0291a;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0187d extends Activity implements InterfaceC0189f, androidx.lifecycle.i {

    /* renamed from: i, reason: collision with root package name */
    public static final int f2671i = View.generateViewId();

    /* renamed from: e, reason: collision with root package name */
    public boolean f2672e = false;

    /* renamed from: f, reason: collision with root package name */
    public C0190g f2673f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j f2674g;

    /* renamed from: h, reason: collision with root package name */
    public final OnBackInvokedCallback f2675h;

    public AbstractActivityC0187d() {
        int i2 = Build.VERSION.SDK_INT;
        this.f2675h = i2 < 33 ? null : i2 >= 34 ? new C0186c(this) : new OnBackInvokedCallback() { // from class: k0.b
            public final void onBackInvoked() {
                AbstractActivityC0187d.this.onBackPressed();
            }
        };
        this.f2674g = new androidx.lifecycle.j(this);
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.j a() {
        return this.f2674g;
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
        if (z2 && !this.f2672e) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f2675h);
                this.f2672e = true;
                return;
            }
            return;
        }
        if (z2 || !this.f2672e || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f2675h);
        this.f2672e = false;
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (d() != null || this.f2673f.f2684g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : d() == null;
    }

    public final boolean k(String str) {
        C0190g c0190g = this.f2673f;
        if (c0190g == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0190g.f2687j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (k("onActivityResult")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            if (c0190g.f2679b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            l0.d dVar = c0190g.f2679b.f2778d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            C0.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                dVar.f2803f.g(i2, i3, intent);
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
            C0190g c0190g = this.f2673f;
            c0190g.c();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                cVar.f2783i.f2986a.B("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:117|118|(1:120)|121|122|(1:124)|125|(1:127)(1:256)|128|(2:130|(1:132)(2:133|(1:135)(1:136)))|137|(4:139|140|141|(1:143)(2:241|(1:243)(2:244|245)))(1:255)|144|(1:146)|147|(1:149)|(1:151)(1:240)|152|(3:154|(1:156)(1:234)|157)(3:235|(1:237)(1:239)|238)|158|(8:160|(1:162)|163|(2:165|(3:167|(1:169)|170)(2:171|172))|173|(1:175)|176|177)|178|(1:180)|181|182|183|184|(2:(1:230)(1:188)|189)(1:231)|190|(2:193|191)|194|195|(3:198|(1:200)(3:201|202|203)|196)|204|205|(5:207|(3:210|(1:212)(3:213|214|215)|208)|216|217|(2:219|(8:221|(1:223)|163|(0)|173|(0)|176|177)(2:224|225))(2:226|227))(2:228|229)) */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x047f, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0601  */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
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
        C0190g c0190g = new C0190g(this);
        this.f2673f = c0190g;
        c0190g.c();
        if (c0190g.f2679b == null) {
            String d2 = c0190g.f2678a.d();
            if (d2 != null) {
                if (l0.h.f2815c == null) {
                    l0.h.f2815c = new l0.h(2);
                }
                l0.c cVar = (l0.c) l0.h.f2815c.f2816a.get(d2);
                c0190g.f2679b = cVar;
                c0190g.f2684g = true;
                if (cVar == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + d2 + "'");
                }
            } else {
                c0190g.f2678a.getClass();
                c0190g.f2679b = null;
                String stringExtra = c0190g.f2678a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (l0.h.f2814b == null) {
                        synchronized (l0.h.class) {
                            try {
                                if (l0.h.f2814b == null) {
                                    l0.h.f2814b = new l0.h(0);
                                }
                            } finally {
                            }
                        }
                    }
                    l0.g gVar = (l0.g) l0.h.f2814b.f2816a.get(stringExtra);
                    if (gVar == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    AbstractActivityC0187d abstractActivityC0187d = c0190g.f2678a;
                    abstractActivityC0187d.getClass();
                    l0.f fVar = new l0.f(abstractActivityC0187d);
                    c0190g.a(fVar);
                    c0190g.f2679b = gVar.a(fVar);
                    c0190g.f2684g = false;
                } else {
                    AbstractActivityC0187d abstractActivityC0187d2 = c0190g.f2678a;
                    abstractActivityC0187d2.getClass();
                    Intent intent = c0190g.f2678a.getIntent();
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
                    if (intent.getBooleanExtra("profile-startup", false)) {
                        arrayList.add("--profile-startup");
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
                    if (intent.hasExtra("profile-microtasks")) {
                        arrayList.add("--profile-microtasks");
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
                    l0.g gVar2 = new l0.g(abstractActivityC0187d2, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0187d abstractActivityC0187d3 = c0190g.f2678a;
                    abstractActivityC0187d3.getClass();
                    l0.f fVar2 = new l0.f(abstractActivityC0187d3);
                    fVar2.f2811e = false;
                    fVar2.f2812f = c0190g.f2678a.j();
                    c0190g.a(fVar2);
                    c0190g.f2679b = gVar2.a(fVar2);
                    c0190g.f2684g = false;
                }
            }
        }
        c0190g.f2678a.getClass();
        l0.d dVar = c0190g.f2679b.f2778d;
        androidx.lifecycle.j jVar = c0190g.f2678a.f2674g;
        dVar.getClass();
        C0.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0190g c0190g2 = dVar.f2802e;
            if (c0190g2 != null) {
                c0190g2.b();
            }
            dVar.e();
            dVar.f2802e = c0190g;
            AbstractActivityC0187d abstractActivityC0187d4 = c0190g.f2678a;
            abstractActivityC0187d4.getClass();
            dVar.b(abstractActivityC0187d4, jVar);
            Trace.endSection();
            AbstractActivityC0187d abstractActivityC0187d5 = c0190g.f2678a;
            abstractActivityC0187d5.getClass();
            AbstractActivityC0187d abstractActivityC0187d6 = c0190g.f2678a;
            l0.c cVar2 = c0190g.f2679b;
            abstractActivityC0187d6.getClass();
            c0190g.f2681d = new io.flutter.plugin.platform.e(abstractActivityC0187d6, cVar2.f2786l, abstractActivityC0187d6);
            AbstractActivityC0187d abstractActivityC0187d7 = c0190g.f2678a;
            l0.c cVar3 = c0190g.f2679b;
            abstractActivityC0187d7.getClass();
            int i3 = f2671i;
            c0190g.f2682e = new C0291a(i3, abstractActivityC0187d5, cVar3.f2788n);
            AbstractActivityC0187d abstractActivityC0187d8 = c0190g.f2678a;
            l0.c cVar4 = c0190g.f2679b;
            if (!abstractActivityC0187d8.f2673f.f2684g) {
                k0.C(cVar4);
            }
            c0190g.f2687j = true;
            C0190g c0190g3 = this.f2673f;
            c0190g3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0190g3.f2678a.j()) {
                u0.l lVar = c0190g3.f2679b.f2785k;
                lVar.f3031e = true;
                u0.k kVar = lVar.f3030d;
                if (kVar != null) {
                    kVar.d(u0.l.a(bArr));
                    lVar.f3030d = null;
                    lVar.f3028b = bArr;
                } else if (lVar.f3032f) {
                    lVar.f3029c.B("push", u0.l.a(bArr), new u0.k(0, lVar, bArr));
                } else {
                    lVar.f3028b = bArr;
                }
            }
            c0190g3.f2678a.getClass();
            l0.d dVar2 = c0190g3.f2679b.f2778d;
            if (dVar2.f()) {
                C0.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) dVar2.f2803f.f1862f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } finally {
                    try {
                        Trace.endSection();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f2674g.a(androidx.lifecycle.d.ON_CREATE);
            if (c() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0190g c0190g4 = this.f2673f;
            boolean z2 = (c() == 1 ? (char) 1 : (char) 2) == 1;
            c0190g4.c();
            if (c0190g4.f2678a.c() == 1) {
                AbstractActivityC0187d abstractActivityC0187d9 = c0190g4.f2678a;
                abstractActivityC0187d9.getClass();
                j jVar2 = new j(abstractActivityC0187d9, c0190g4.f2678a.c() != 1);
                c0190g4.f2678a.getClass();
                AbstractActivityC0187d abstractActivityC0187d10 = c0190g4.f2678a;
                abstractActivityC0187d10.getClass();
                c0190g4.f2680c = new o(abstractActivityC0187d10, jVar2);
            } else {
                AbstractActivityC0187d abstractActivityC0187d11 = c0190g4.f2678a;
                abstractActivityC0187d11.getClass();
                l lVar2 = new l(abstractActivityC0187d11);
                lVar2.setOpaque(c0190g4.f2678a.c() == 1);
                c0190g4.f2678a.getClass();
                AbstractActivityC0187d abstractActivityC0187d12 = c0190g4.f2678a;
                abstractActivityC0187d12.getClass();
                c0190g4.f2680c = new o(abstractActivityC0187d12, lVar2);
            }
            c0190g4.f2680c.f2726l.add(c0190g4.f2689l);
            c0190g4.f2678a.getClass();
            o oVar = c0190g4.f2680c;
            l0.c cVar5 = c0190g4.f2679b;
            io.flutter.embedding.engine.renderer.a aVar = oVar.f2715C;
            Objects.toString(cVar5);
            if (oVar.c()) {
                if (cVar5 != oVar.f2728n) {
                    oVar.a();
                }
                c0190g4.f2680c.setId(i3);
                if (z2) {
                    o oVar2 = c0190g4.f2680c;
                    if (c0190g4.f2678a.c() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0190g4.f2683f != null) {
                        oVar2.getViewTreeObserver().removeOnPreDrawListener(c0190g4.f2683f);
                    }
                    c0190g4.f2683f = new ViewTreeObserverOnPreDrawListenerC0188e(c0190g4, oVar2);
                    oVar2.getViewTreeObserver().addOnPreDrawListener(c0190g4.f2683f);
                }
                setContentView(c0190g4.f2680c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            oVar.f2728n = cVar5;
            io.flutter.embedding.engine.renderer.i iVar = cVar5.f2776b;
            oVar.f2727m = iVar.f2391c;
            oVar.f2724j.c(iVar);
            iVar.a(aVar);
            if (oVar.f2720f) {
                iVar.f2389a.addResizingFlutterUiListener(oVar.f2714B);
            }
            oVar.f2730p = new P(oVar, oVar.f2728n.f2782h);
            l0.c cVar6 = oVar.f2728n;
            oVar.f2731q = new io.flutter.plugin.editing.l(oVar, cVar6.f2792r, cVar6.f2787m, cVar6.f2793s, cVar6.t);
            TextServicesManager textServicesManager = (TextServicesManager) oVar.getContext().getSystemService("textservices");
            oVar.f2736w = textServicesManager;
            oVar.f2732r = new io.flutter.plugin.editing.h(textServicesManager, oVar.f2728n.f2790p);
            new P(oVar, oVar.f2731q.f2441b, oVar.f2728n.f2787m);
            oVar.f2733s = oVar.f2728n.f2779e;
            oVar.t = new C0008i(oVar);
            oVar.f2734u = new C0184a(oVar.f2728n.f2776b, false);
            io.flutter.view.i iVar2 = new io.flutter.view.i(oVar, cVar5.f2780f, (AccessibilityManager) oVar.getContext().getSystemService("accessibility"), oVar.getContext().getContentResolver(), cVar5.f2794u);
            oVar.f2735v = iVar2;
            iVar2.f2613r = oVar.f2739z;
            boolean isEnabled = iVar2.f2598c.isEnabled();
            boolean isTouchExplorationEnabled = oVar.f2735v.f2598c.isTouchExplorationEnabled();
            if (oVar.f2728n.f2776b.f2389a.getIsSoftwareRenderingEnabled()) {
                oVar.setWillNotDraw(false);
            } else {
                oVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            l0.c cVar7 = oVar.f2728n;
            cVar7.f2793s.f2487l.f2456a = oVar.f2735v;
            new C0184a(cVar7.f2776b, true);
            l0.c cVar8 = oVar.f2728n;
            cVar8.t.f2472j.f2456a = oVar.f2735v;
            new C0184a(cVar8.f2776b, true);
            oVar.f2731q.f2441b.restartInput(oVar);
            oVar.d();
            oVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, oVar.f2713A);
            oVar.e();
            io.flutter.plugin.platform.l lVar3 = cVar5.f2793s;
            SparseArray sparseArray = lVar3.f2490o;
            SparseArray sparseArray2 = lVar3.f2491p;
            SparseArray sparseArray3 = lVar3.f2493r;
            lVar3.f2482g = oVar;
            for (int i4 = 0; i4 < sparseArray3.size(); i4++) {
                lVar3.f2482g.addView((io.flutter.plugin.platform.g) sparseArray3.valueAt(i4));
            }
            for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
                if (sparseArray2.valueAt(i5) != null) {
                    throw new ClassCastException();
                }
                lVar3.f2482g.addView(null);
            }
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                throw new ClassCastException();
            }
            io.flutter.plugin.platform.k kVar2 = cVar5.t;
            SparseArray sparseArray4 = kVar2.f2473k;
            SparseArray sparseArray5 = kVar2.f2474l;
            kVar2.f2469g = oVar;
            for (int i6 = 0; i6 < sparseArray5.size(); i6++) {
                if (sparseArray5.valueAt(i6) != null) {
                    throw new ClassCastException();
                }
                kVar2.f2469g.addView(null);
            }
            if (sparseArray4.size() > 0) {
                sparseArray4.valueAt(0).getClass();
                throw new ClassCastException();
            }
            Iterator it2 = oVar.f2729o.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            if (oVar.f2727m) {
                aVar.b();
            }
            c0190g4.f2680c.setId(i3);
            if (z2) {
            }
            setContentView(c0190g4.f2680c);
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 35) {
            }
            window2.getDecorView().setSystemUiVisibility(1280);
        } catch (Throwable th2) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (k("onDestroy")) {
            this.f2673f.e();
            this.f2673f.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f2675h);
            this.f2672e = false;
        }
        C0190g c0190g = this.f2673f;
        if (c0190g != null) {
            c0190g.f2678a = null;
            c0190g.f2679b = null;
            c0190g.f2680c = null;
            c0190g.f2681d = null;
            c0190g.f2682e = null;
            this.f2673f = null;
        }
        this.f2674g.a(androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            l0.c cVar = c0190g.f2679b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            l0.d dVar = cVar.f2778d;
            if (dVar.f()) {
                C0.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) dVar.f2803f.f1860d).iterator();
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
            String d2 = c0190g.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            C0230b c0230b = c0190g.f2679b.f2783i;
            c0230b.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d2);
            c0230b.f2986a.B("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            c0190g.f2678a.getClass();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                C0232d c0232d = cVar.f2781g;
                c0232d.a(3, c0232d.f2990c);
            }
        }
        this.f2674g.a(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            if (c0190g.f2679b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.e eVar = c0190g.f2681d;
            if (eVar != null) {
                eVar.b();
            }
            Iterator it = c0190g.f2679b.f2793s.f2488m.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.r) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            if (c0190g.f2679b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            l0.d dVar = c0190g.f2679b.f2778d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            C0.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) dVar.f2803f.f1858b).iterator();
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
        this.f2674g.a(androidx.lifecycle.d.ON_RESUME);
        if (k("onResume")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            c0190g.f2679b.f2776b.d();
            c0190g.f2678a.getClass();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                C0232d c0232d = cVar.f2781g;
                c0232d.a(2, c0232d.f2990c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            if (c0190g.f2678a.j()) {
                bundle.putByteArray("framework", c0190g.f2679b.f2785k.f3028b);
            }
            c0190g.f2678a.getClass();
            Bundle bundle2 = new Bundle();
            l0.d dVar = c0190g.f2679b.f2778d;
            if (dVar.f()) {
                C0.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) dVar.f2803f.f1862f).iterator();
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
            if (c0190g.f2678a.d() == null || c0190g.f2678a.i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0190g.f2678a.f2672e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        String b2;
        Bundle g2;
        super.onStart();
        this.f2674g.a(androidx.lifecycle.d.ON_START);
        if (k("onStart")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            if (c0190g.f2678a.d() == null && !c0190g.f2679b.f2777c.f2862j) {
                String f2 = c0190g.f2678a.f();
                if (f2 == null) {
                    AbstractActivityC0187d abstractActivityC0187d = c0190g.f2678a;
                    abstractActivityC0187d.getClass();
                    f2 = c0190g.d(abstractActivityC0187d.getIntent());
                    if (f2 == null) {
                        f2 = "/";
                    }
                }
                AbstractActivityC0187d abstractActivityC0187d2 = c0190g.f2678a;
                abstractActivityC0187d2.getClass();
                try {
                    g2 = abstractActivityC0187d2.g();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (g2 != null) {
                    str = g2.getString("io.flutter.EntrypointUri");
                    c0190g.f2678a.e();
                    c0190g.f2679b.f2783i.f2986a.B("setInitialRoute", f2, null);
                    b2 = c0190g.f2678a.b();
                    if (b2 != null || b2.isEmpty()) {
                        b2 = ((C0220e) C0008i.A().f84f).f2941d.f2930b;
                    }
                    c0190g.f2679b.f2777c.a(str != null ? new m0.a(b2, c0190g.f2678a.e()) : new m0.a(b2, str, c0190g.f2678a.e()), (List) c0190g.f2678a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0190g.f2678a.e();
                c0190g.f2679b.f2783i.f2986a.B("setInitialRoute", f2, null);
                b2 = c0190g.f2678a.b();
                if (b2 != null) {
                }
                b2 = ((C0220e) C0008i.A().f84f).f2941d.f2930b;
                c0190g.f2679b.f2777c.a(str != null ? new m0.a(b2, c0190g.f2678a.e()) : new m0.a(b2, str, c0190g.f2678a.e()), (List) c0190g.f2678a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0190g.f2688k;
            if (num != null) {
                c0190g.f2680c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            c0190g.f2678a.getClass();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                C0232d c0232d = cVar.f2781g;
                c0232d.a(5, c0232d.f2990c);
            }
            c0190g.f2688k = Integer.valueOf(c0190g.f2680c.getVisibility());
            c0190g.f2680c.setVisibility(8);
            l0.c cVar2 = c0190g.f2679b;
            if (cVar2 != null) {
                cVar2.f2776b.b(40);
            }
        }
        this.f2674g.a(androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (k("onTrimMemory")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                if (c0190g.f2686i && i2 >= 10) {
                    FlutterJNI flutterJNI = cVar.f2777c.f2857e;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0231c c0231c = c0190g.f2679b.f2791q;
                    c0231c.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    c0231c.f2987a.i(hashMap, null);
                }
                c0190g.f2679b.f2776b.b(i2);
                io.flutter.plugin.platform.l lVar = c0190g.f2679b.f2793s;
                if (i2 < 40) {
                    lVar.getClass();
                    return;
                }
                Iterator it = lVar.f2488m.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.r) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (k("onUserLeaveHint")) {
            C0190g c0190g = this.f2673f;
            c0190g.c();
            l0.c cVar = c0190g.f2679b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            l0.d dVar = cVar.f2778d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            C0.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) dVar.f2803f.f1861e).iterator();
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
            C0190g c0190g = this.f2673f;
            c0190g.c();
            c0190g.f2678a.getClass();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                C0232d c0232d = cVar.f2781g;
                if (z2) {
                    c0232d.a(c0232d.f2988a, true);
                } else {
                    c0232d.a(c0232d.f2988a, false);
                }
            }
        }
    }
}
