package E;

import a.AbstractC0016a;
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

/* renamed from: E.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0004e extends Activity implements androidx.lifecycle.i {

    /* renamed from: e, reason: collision with root package name */
    public static final int f146e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f147a = false;

    /* renamed from: b, reason: collision with root package name */
    public C0007h f148b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j f149c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f150d;

    public AbstractActivityC0004e() {
        int i2 = Build.VERSION.SDK_INT;
        this.f150d = i2 < 33 ? null : i2 >= 34 ? new C0003d(this) : new OnBackInvokedCallback() { // from class: E.c
            public final void onBackInvoked() {
                AbstractActivityC0004e.this.onBackPressed();
            }
        };
        this.f149c = new androidx.lifecycle.j(this);
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.j a() {
        return this.f149c;
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

    public final void h(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z && !this.f147a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f150d);
                this.f147a = true;
                return;
            }
            return;
        }
        if (z || !this.f147a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f150d);
        this.f147a = false;
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (d() != null || this.f148b.f161g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : d() == null;
    }

    public final boolean k(String str) {
        C0007h c0007h = this.f148b;
        if (c0007h == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0007h.f164j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (k("onActivityResult")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            if (c0007h.f156b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            F.e eVar = c0007h.f156b.f226d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            T.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                eVar.f257f.a(i2, i3, intent);
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
            C0007h c0007h = this.f148b;
            c0007h.c();
            F.c cVar = c0007h.f156b;
            if (cVar != null) {
                cVar.f231i.f331a.h("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:117|118|(1:120)|121|122|(1:124)|125|(1:127)(1:254)|128|(2:130|(1:132)(2:133|(1:135)(1:136)))|137|(4:139|140|141|(1:143)(2:239|(1:241)(2:242|243)))(1:253)|144|(1:146)|147|(1:149)(1:238)|(1:151)(1:237)|152|(3:154|(1:156)(1:231)|157)(3:232|(1:234)(1:236)|235)|158|(8:160|(1:162)|163|(2:165|(3:167|(1:169)|170)(2:171|172))|173|(1:175)|176|177)|178|179|180|181|(2:(1:227)(1:185)|186)(1:228)|187|(2:188|(1:190)(1:191))|192|(2:193|(2:195|(1:197)(3:198|199|200))(3:201|202|(2:204|(2:205|(2:207|(1:209)(3:210|211|212))(3:213|214|(2:216|(2:218|(1:220))(2:221|222))(2:223|224))))(2:225|226)))|163|(0)|173|(0)|176|177) */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x048c, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0643  */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i2;
        int i3 = 0;
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
        C0007h c0007h = new C0007h(this);
        this.f148b = c0007h;
        c0007h.c();
        if (c0007h.f156b == null) {
            String d2 = c0007h.f155a.d();
            if (d2 != null) {
                if (F.i.f269c == null) {
                    F.i.f269c = new F.i(1);
                }
                F.c cVar = (F.c) F.i.f269c.f270a.get(d2);
                c0007h.f156b = cVar;
                c0007h.f161g = true;
                if (cVar == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + d2 + "'");
                }
            } else {
                c0007h.f155a.getClass();
                c0007h.f156b = null;
                String stringExtra = c0007h.f155a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (F.i.f268b == null) {
                        synchronized (F.i.class) {
                            try {
                                if (F.i.f268b == null) {
                                    F.i.f268b = new F.i(0);
                                }
                            } finally {
                            }
                        }
                    }
                    F.h hVar = (F.h) F.i.f268b.f270a.get(stringExtra);
                    if (hVar == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    AbstractActivityC0004e abstractActivityC0004e = c0007h.f155a;
                    abstractActivityC0004e.getClass();
                    F.g gVar = new F.g(abstractActivityC0004e);
                    c0007h.a(gVar);
                    c0007h.f156b = hVar.a(gVar);
                    c0007h.f161g = false;
                } else {
                    AbstractActivityC0004e abstractActivityC0004e2 = c0007h.f155a;
                    abstractActivityC0004e2.getClass();
                    Intent intent = c0007h.f155a.getIntent();
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
                    F.h hVar2 = new F.h(abstractActivityC0004e2, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0004e abstractActivityC0004e3 = c0007h.f155a;
                    abstractActivityC0004e3.getClass();
                    F.g gVar2 = new F.g(abstractActivityC0004e3);
                    gVar2.f265e = false;
                    gVar2.f266f = c0007h.f155a.j();
                    c0007h.a(gVar2);
                    c0007h.f156b = hVar2.a(gVar2);
                    c0007h.f161g = false;
                }
            }
        }
        c0007h.f155a.getClass();
        F.e eVar = c0007h.f156b.f226d;
        androidx.lifecycle.j jVar = c0007h.f155a.f149c;
        eVar.getClass();
        T.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0007h c0007h2 = eVar.f256e;
            if (c0007h2 != null) {
                c0007h2.b();
            }
            eVar.e();
            eVar.f256e = c0007h;
            AbstractActivityC0004e abstractActivityC0004e4 = c0007h.f155a;
            abstractActivityC0004e4.getClass();
            eVar.b(abstractActivityC0004e4, jVar);
            Trace.endSection();
            AbstractActivityC0004e abstractActivityC0004e5 = c0007h.f155a;
            abstractActivityC0004e5.getClass();
            AbstractActivityC0004e abstractActivityC0004e6 = c0007h.f155a;
            F.c cVar2 = c0007h.f156b;
            abstractActivityC0004e6.getClass();
            c0007h.f158d = new io.flutter.plugin.platform.e(abstractActivityC0004e6, cVar2.f234l, abstractActivityC0004e6);
            AbstractActivityC0004e abstractActivityC0004e7 = c0007h.f155a;
            F.c cVar3 = c0007h.f156b;
            abstractActivityC0004e7.getClass();
            c0007h.f159e = new B.n(f146e, abstractActivityC0004e5, cVar3.f236n);
            AbstractActivityC0004e abstractActivityC0004e8 = c0007h.f155a;
            F.c cVar4 = c0007h.f156b;
            if (!abstractActivityC0004e8.f148b.f161g) {
                AbstractC0016a.A(cVar4);
            }
            c0007h.f164j = true;
            C0007h c0007h3 = this.f148b;
            c0007h3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0007h3.f155a.j()) {
                M.k kVar = c0007h3.f156b.f233k;
                kVar.f373e = true;
                M.j jVar2 = kVar.f372d;
                if (jVar2 != null) {
                    jVar2.c(M.k.a(bArr));
                    kVar.f372d = null;
                    kVar.f370b = bArr;
                } else if (kVar.f374f) {
                    kVar.f371c.h("push", M.k.a(bArr), new M.j(i3, kVar, bArr));
                } else {
                    kVar.f370b = bArr;
                }
            }
            c0007h3.f155a.getClass();
            F.e eVar2 = c0007h3.f156b.f226d;
            if (eVar2.f()) {
                T.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = eVar2.f257f.f251f.iterator();
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
            this.f149c.a(androidx.lifecycle.d.ON_CREATE);
            if (c() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0007h c0007h4 = this.f148b;
            boolean z = c() == 1 ? true : 2;
            c0007h4.c();
            if (c0007h4.f155a.c() == 1) {
                AbstractActivityC0004e abstractActivityC0004e9 = c0007h4.f155a;
                abstractActivityC0004e9.getClass();
                C0013n c0013n = new C0013n(abstractActivityC0004e9, c0007h4.f155a.c() != 1);
                c0007h4.f155a.getClass();
                AbstractActivityC0004e abstractActivityC0004e10 = c0007h4.f155a;
                abstractActivityC0004e10.getClass();
                c0007h4.f157c = new v(abstractActivityC0004e10, c0013n);
            } else {
                AbstractActivityC0004e abstractActivityC0004e11 = c0007h4.f155a;
                abstractActivityC0004e11.getClass();
                C0015p c0015p = new C0015p(abstractActivityC0004e11, null);
                c0015p.f179a = false;
                c0015p.f180b = false;
                c0015p.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0014o(c0015p));
                c0015p.setOpaque(c0007h4.f155a.c() == 1);
                c0007h4.f155a.getClass();
                AbstractActivityC0004e abstractActivityC0004e12 = c0007h4.f155a;
                abstractActivityC0004e12.getClass();
                c0007h4.f157c = new v(abstractActivityC0004e12, c0015p);
            }
            c0007h4.f157c.f195f.add(c0007h4.f166l);
            c0007h4.f155a.getClass();
            v vVar = c0007h4.f157c;
            F.c cVar5 = c0007h4.f156b;
            vVar.getClass();
            Objects.toString(cVar5);
            if (vVar.c()) {
                if (cVar5 != vVar.f197h) {
                    vVar.a();
                }
                c0007h4.f157c.setId(f146e);
                if (z) {
                    v vVar2 = c0007h4.f157c;
                    if (c0007h4.f155a.c() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0007h4.f160f != null) {
                        vVar2.getViewTreeObserver().removeOnPreDrawListener(c0007h4.f160f);
                    }
                    c0007h4.f160f = new ViewTreeObserverOnPreDrawListenerC0006g(c0007h4, vVar2);
                    vVar2.getViewTreeObserver().addOnPreDrawListener(c0007h4.f160f);
                }
                setContentView(c0007h4.f157c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            vVar.f197h = cVar5;
            io.flutter.embedding.engine.renderer.h hVar3 = cVar5.f224b;
            vVar.f196g = hVar3.f625c;
            vVar.f193d.a(hVar3);
            C0005f c0005f = vVar.f210v;
            hVar3.a(c0005f);
            vVar.f199j = new A.a(vVar, vVar.f197h.f230h);
            F.c cVar6 = vVar.f197h;
            vVar.f200k = new io.flutter.plugin.editing.m(vVar, cVar6.f240r, cVar6.f235m, cVar6.f241s, cVar6.t);
            TextServicesManager textServicesManager = (TextServicesManager) vVar.getContext().getSystemService("textservices");
            vVar.f206q = textServicesManager;
            vVar.f201l = new io.flutter.plugin.editing.h(textServicesManager, vVar.f197h.f238p);
            new A.a(vVar, vVar.f200k.f679b, vVar.f197h.f235m);
            vVar.f202m = vVar.f197h.f227e;
            D.b bVar = new D.b();
            bVar.f100b = new HashSet();
            bVar.f101c = vVar;
            bVar.f99a = new G[]{new C(vVar.getBinaryMessenger()), new A.a(new M.c(vVar.getBinaryMessenger()))};
            new B.k(vVar.getBinaryMessenger()).f44c = bVar;
            vVar.f203n = bVar;
            vVar.f204o = new C0001b(vVar.f197h.f224b, false);
            io.flutter.view.g gVar3 = new io.flutter.view.g(vVar, cVar5.f228f, (AccessibilityManager) vVar.getContext().getSystemService("accessibility"), vVar.getContext().getContentResolver(), cVar5.f242u);
            vVar.f205p = gVar3;
            gVar3.f847r = vVar.t;
            boolean isEnabled = gVar3.f832c.isEnabled();
            boolean isTouchExplorationEnabled = vVar.f205p.f832c.isTouchExplorationEnabled();
            if (vVar.f197h.f224b.f623a.getIsSoftwareRenderingEnabled()) {
                vVar.setWillNotDraw(false);
            } else {
                vVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            F.c cVar7 = vVar.f197h;
            cVar7.f241s.f725i.f694a = vVar.f205p;
            new C0001b(cVar7.f224b, true);
            F.c cVar8 = vVar.f197h;
            cVar8.t.f710g.f694a = vVar.f205p;
            new C0001b(cVar8.f224b, true);
            vVar.f200k.f679b.restartInput(vVar);
            vVar.d();
            vVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, vVar.f209u);
            vVar.e();
            io.flutter.plugin.platform.j jVar3 = cVar5.f241s;
            jVar3.f720d = vVar;
            int i4 = 0;
            while (true) {
                SparseArray sparseArray = jVar3.f731o;
                if (i4 >= sparseArray.size()) {
                    break;
                }
                jVar3.f720d.addView((io.flutter.plugin.platform.g) sparseArray.valueAt(i4));
                i4++;
            }
            int i5 = 0;
            while (true) {
                SparseArray sparseArray2 = jVar3.f729m;
                if (i5 >= sparseArray2.size()) {
                    SparseArray sparseArray3 = jVar3.f728l;
                    if (sparseArray3.size() > 0) {
                        sparseArray3.valueAt(0).getClass();
                        throw new ClassCastException();
                    }
                    io.flutter.plugin.platform.i iVar = cVar5.t;
                    iVar.f707d = vVar;
                    int i6 = 0;
                    while (true) {
                        SparseArray sparseArray4 = iVar.f712i;
                        if (i6 >= sparseArray4.size()) {
                            SparseArray sparseArray5 = iVar.f711h;
                            if (sparseArray5.size() > 0) {
                                sparseArray5.valueAt(0).getClass();
                                throw new ClassCastException();
                            }
                            Iterator it2 = vVar.f198i.iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw new ClassCastException();
                            }
                            if (vVar.f196g) {
                                c0005f.a();
                            }
                        } else {
                            if (sparseArray4.valueAt(i6) != null) {
                                throw new ClassCastException();
                            }
                            iVar.f707d.addView(null);
                            i6++;
                        }
                    }
                } else {
                    if (sparseArray2.valueAt(i5) != null) {
                        throw new ClassCastException();
                    }
                    jVar3.f720d.addView(null);
                    i5++;
                }
            }
            c0007h4.f157c.setId(f146e);
            if (z) {
            }
            setContentView(c0007h4.f157c);
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
            this.f148b.e();
            this.f148b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f150d);
            this.f147a = false;
        }
        C0007h c0007h = this.f148b;
        if (c0007h != null) {
            c0007h.f155a = null;
            c0007h.f156b = null;
            c0007h.f157c = null;
            c0007h.f158d = null;
            c0007h.f159e = null;
            this.f148b = null;
        }
        this.f149c.a(androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            F.c cVar = c0007h.f156b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            F.e eVar = cVar.f226d;
            if (eVar.f()) {
                T.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = eVar.f257f.f249d.iterator();
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
            String d2 = c0007h.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            M.b bVar = c0007h.f156b.f231i;
            bVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d2);
            bVar.f331a.h("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            c0007h.f155a.getClass();
            F.c cVar = c0007h.f156b;
            if (cVar != null) {
                M.d dVar = cVar.f229g;
                dVar.a(3, dVar.f335c);
            }
        }
        this.f149c.a(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            if (c0007h.f156b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.e eVar = c0007h.f158d;
            if (eVar != null) {
                eVar.b();
            }
            Iterator it = c0007h.f156b.f241s.f726j.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.p) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            if (c0007h.f156b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            F.e eVar = c0007h.f156b.f226d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            T.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = eVar.f257f.f247b.iterator();
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
        this.f149c.a(androidx.lifecycle.d.ON_RESUME);
        if (k("onResume")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            c0007h.f156b.f224b.d();
            c0007h.f155a.getClass();
            F.c cVar = c0007h.f156b;
            if (cVar != null) {
                M.d dVar = cVar.f229g;
                dVar.a(2, dVar.f335c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            if (c0007h.f155a.j()) {
                bundle.putByteArray("framework", c0007h.f156b.f233k.f370b);
            }
            c0007h.f155a.getClass();
            Bundle bundle2 = new Bundle();
            F.e eVar = c0007h.f156b.f226d;
            if (eVar.f()) {
                T.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = eVar.f257f.f251f.iterator();
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
            if (c0007h.f155a.d() == null || c0007h.f155a.i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0007h.f155a.f147a);
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
        this.f149c.a(androidx.lifecycle.d.ON_START);
        if (k("onStart")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            if (c0007h.f155a.d() == null && !c0007h.f156b.f225c.f280g) {
                String f2 = c0007h.f155a.f();
                if (f2 == null) {
                    AbstractActivityC0004e abstractActivityC0004e = c0007h.f155a;
                    abstractActivityC0004e.getClass();
                    f2 = c0007h.d(abstractActivityC0004e.getIntent());
                    if (f2 == null) {
                        f2 = "/";
                    }
                }
                AbstractActivityC0004e abstractActivityC0004e2 = c0007h.f155a;
                abstractActivityC0004e2.getClass();
                try {
                    g2 = abstractActivityC0004e2.g();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (g2 != null) {
                    str = g2.getString("io.flutter.EntrypointUri");
                    c0007h.f155a.e();
                    c0007h.f156b.f231i.f331a.h("setInitialRoute", f2, null);
                    b2 = c0007h.f155a.b();
                    if (b2 != null || b2.isEmpty()) {
                        b2 = ((I.e) D.b.e().f99a).f327d.f316b;
                    }
                    c0007h.f156b.f225c.a(str != null ? new G.a(b2, c0007h.f155a.e()) : new G.a(b2, str, c0007h.f155a.e()), (List) c0007h.f155a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0007h.f155a.e();
                c0007h.f156b.f231i.f331a.h("setInitialRoute", f2, null);
                b2 = c0007h.f155a.b();
                if (b2 != null) {
                }
                b2 = ((I.e) D.b.e().f99a).f327d.f316b;
                c0007h.f156b.f225c.a(str != null ? new G.a(b2, c0007h.f155a.e()) : new G.a(b2, str, c0007h.f155a.e()), (List) c0007h.f155a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0007h.f165k;
            if (num != null) {
                c0007h.f157c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            c0007h.f155a.getClass();
            F.c cVar = c0007h.f156b;
            if (cVar != null) {
                M.d dVar = cVar.f229g;
                dVar.a(5, dVar.f335c);
            }
            c0007h.f165k = Integer.valueOf(c0007h.f157c.getVisibility());
            c0007h.f157c.setVisibility(8);
            F.c cVar2 = c0007h.f156b;
            if (cVar2 != null) {
                cVar2.f224b.b(40);
            }
        }
        this.f149c.a(androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (k("onTrimMemory")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            F.c cVar = c0007h.f156b;
            if (cVar != null) {
                if (c0007h.f163i && i2 >= 10) {
                    FlutterJNI flutterJNI = cVar.f225c.f275b;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    M.c cVar2 = c0007h.f156b.f239q;
                    cVar2.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    cVar2.f332a.j(hashMap, null);
                }
                c0007h.f156b.f224b.b(i2);
                io.flutter.plugin.platform.j jVar = c0007h.f156b.f241s;
                if (i2 < 40) {
                    jVar.getClass();
                    return;
                }
                Iterator it = jVar.f726j.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.p) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (k("onUserLeaveHint")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            F.c cVar = c0007h.f156b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            F.e eVar = cVar.f226d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            T.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = eVar.f257f.f250e.iterator();
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
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (k("onWindowFocusChanged")) {
            C0007h c0007h = this.f148b;
            c0007h.c();
            c0007h.f155a.getClass();
            F.c cVar = c0007h.f156b;
            if (cVar != null) {
                M.d dVar = cVar.f229g;
                if (z) {
                    dVar.a(dVar.f333a, true);
                } else {
                    dVar.a(dVar.f333a, false);
                }
            }
        }
    }
}
