package e0;

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

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class f extends Activity implements androidx.lifecycle.i {

    /* renamed from: e, reason: collision with root package name */
    public static final int f142e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f143a = false;

    /* renamed from: b, reason: collision with root package name */
    public i f144b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j f145c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f146d;

    public f() {
        int i2 = Build.VERSION.SDK_INT;
        this.f146d = i2 < 33 ? null : i2 >= 34 ? new e(this) : new OnBackInvokedCallback() { // from class: e0.d
            public final void onBackInvoked() {
                f.this.onBackPressed();
            }
        };
        this.f145c = new androidx.lifecycle.j(this);
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.j a() {
        return this.f145c;
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
        if (z2 && !this.f143a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f146d);
                this.f143a = true;
                return;
            }
            return;
        }
        if (z2 || !this.f143a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f146d);
        this.f143a = false;
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (d() != null || this.f144b.f160g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : d() == null;
    }

    public final boolean k(String str) {
        i iVar = this.f144b;
        if (iVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (iVar.f163j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (k("onActivityResult")) {
            i iVar = this.f144b;
            iVar.c();
            if (iVar.f155b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            f0.e eVar = iVar.f155b.f271d;
            if (!eVar.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            s0.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                eVar.f300f.a(i2, i3, intent);
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
            i iVar = this.f144b;
            iVar.c();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                cVar.f276i.f766a.d("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:139|140|(1:142)|143|144|(1:146)|147|(1:149)(1:279)|150|(2:152|(1:154)(2:155|(1:157)(1:158)))|159|(4:161|162|163|(1:165)(2:263|(2:265|266)(2:267|268)))(1:278)|166|(1:168)|169|(1:171)|(1:173)(1:262)|174|(3:176|(1:178)(1:256)|179)(3:257|(1:259)(1:261)|260)|180|(8:182|(1:184)|185|(2:187|(3:189|(1:191)|192)(2:193|194))|195|(1:197)|198|199)|200|(1:202)|203|204|205|206|(2:(1:252)(1:210)|211)(1:253)|212|(2:215|213)|216|217|(3:220|(1:222)(3:223|224|225)|218)|226|227|(5:229|(3:232|(1:234)(3:235|236|237)|230)|238|239|(2:241|(8:243|(1:245)|185|(0)|195|(0)|198|199)(2:246|247))(2:248|249))(2:250|251)) */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04e6, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0665  */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
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
        i iVar = new i(this);
        this.f144b = iVar;
        iVar.c();
        if (iVar.f155b == null) {
            String d2 = iVar.f154a.d();
            if (d2 != null) {
                if (f0.k.f328c == null) {
                    f0.k.f328c = new f0.k(1);
                }
                f0.c cVar = (f0.c) f0.k.f328c.f329a.get(d2);
                iVar.f155b = cVar;
                iVar.f160g = true;
                if (cVar == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + d2 + "'");
                }
            } else {
                iVar.f154a.getClass();
                iVar.f155b = null;
                String stringExtra = iVar.f154a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (f0.k.f327b == null) {
                        synchronized (f0.k.class) {
                            try {
                                if (f0.k.f327b == null) {
                                    f0.k.f327b = new f0.k(0);
                                }
                            } finally {
                            }
                        }
                    }
                    f0.j jVar = (f0.j) f0.k.f327b.f329a.get(stringExtra);
                    if (jVar == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    f fVar = iVar.f154a;
                    fVar.getClass();
                    f0.i iVar2 = new f0.i(fVar);
                    iVar.a(iVar2);
                    iVar.f155b = jVar.a(iVar2);
                    iVar.f160g = false;
                } else {
                    f fVar2 = iVar.f154a;
                    fVar2.getClass();
                    Intent intent = fVar2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            f0.f a2 = f0.g.a(str);
                            if (a2 == null) {
                                a2 = f0.g.a("--".concat(str));
                            }
                            if (a2 == null) {
                                a2 = f0.g.a("--" + str + "=");
                            }
                            if (a2 != null) {
                                break;
                            }
                        }
                    }
                    f fVar3 = iVar.f154a;
                    fVar3.getClass();
                    Intent intent2 = iVar.f154a.getIntent();
                    ArrayList arrayList = new ArrayList();
                    if (intent2.getBooleanExtra("trace-startup", false)) {
                        arrayList.add("--trace-startup");
                    }
                    if (intent2.getBooleanExtra("start-paused", false)) {
                        arrayList.add("--start-paused");
                    }
                    int intExtra = intent2.getIntExtra("vm-service-port", 0);
                    if (intExtra > 0) {
                        arrayList.add("--vm-service-port=" + intExtra);
                    }
                    if (intent2.getBooleanExtra("disable-service-auth-codes", false)) {
                        arrayList.add("--disable-service-auth-codes");
                    }
                    if (intent2.getBooleanExtra("endless-trace-buffer", false)) {
                        arrayList.add("--endless-trace-buffer");
                    }
                    if (intent2.getBooleanExtra("use-test-fonts", false)) {
                        arrayList.add("--use-test-fonts");
                    }
                    if (intent2.getBooleanExtra("enable-dart-profiling", false)) {
                        arrayList.add("--enable-dart-profiling");
                    }
                    if (intent2.getBooleanExtra("profile-startup", false)) {
                        arrayList.add("--profile-startup");
                    }
                    if (intent2.getBooleanExtra("enable-software-rendering", false)) {
                        arrayList.add("--enable-software-rendering");
                    }
                    if (intent2.getBooleanExtra("skia-deterministic-rendering", false)) {
                        arrayList.add("--skia-deterministic-rendering");
                    }
                    if (intent2.getBooleanExtra("trace-skia", false)) {
                        arrayList.add("--trace-skia");
                    }
                    String stringExtra2 = intent2.getStringExtra("trace-skia-allowlist");
                    if (stringExtra2 != null) {
                        arrayList.add("--trace-skia-allowlist=".concat(stringExtra2));
                    }
                    if (intent2.getBooleanExtra("trace-systrace", false)) {
                        arrayList.add("--trace-systrace");
                    }
                    if (intent2.hasExtra("trace-to-file")) {
                        arrayList.add("--trace-to-file=" + intent2.getStringExtra("trace-to-file"));
                    }
                    if (intent2.hasExtra("profile-microtasks")) {
                        arrayList.add("--profile-microtasks");
                    }
                    if (intent2.hasExtra("enable-impeller")) {
                        if (intent2.getBooleanExtra("enable-impeller", false)) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (intent2.getBooleanExtra("enable-vulkan-validation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (intent2.hasExtra("enable-hcpp-and-surface-control")) {
                        if (intent2.getBooleanExtra("enable-hcpp-and-surface-control", false)) {
                            arrayList.add("--enable-hcpp-and-surface-control=true");
                        } else {
                            arrayList.add("--enable-hcpp-and-surface-control=false");
                        }
                    }
                    if (intent2.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
                        arrayList.add("--dump-skp-on-shader-compilation");
                    }
                    if (intent2.getBooleanExtra("cache-sksl", false)) {
                        arrayList.add("--cache-sksl");
                    }
                    if (intent2.getBooleanExtra("purge-persistent-cache", false)) {
                        arrayList.add("--purge-persistent-cache");
                    }
                    if (intent2.getBooleanExtra("verbose-logging", false)) {
                        arrayList.add("--verbose-logging");
                    }
                    if (intent2.hasExtra("dart-flags")) {
                        arrayList.add("--dart-flags=" + intent2.getStringExtra("dart-flags"));
                    }
                    HashSet hashSet = new HashSet(arrayList);
                    f0.j jVar2 = new f0.j(fVar3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    f fVar4 = iVar.f154a;
                    fVar4.getClass();
                    f0.i iVar3 = new f0.i(fVar4);
                    iVar3.f324e = false;
                    iVar3.f325f = iVar.f154a.j();
                    iVar.a(iVar3);
                    iVar.f155b = jVar2.a(iVar3);
                    iVar.f160g = false;
                }
            }
        }
        iVar.f154a.getClass();
        f0.e eVar = iVar.f155b.f271d;
        androidx.lifecycle.j jVar3 = iVar.f154a.f145c;
        eVar.getClass();
        s0.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            i iVar4 = eVar.f299e;
            if (iVar4 != null) {
                iVar4.b();
            }
            eVar.d();
            eVar.f299e = iVar;
            f fVar5 = iVar.f154a;
            fVar5.getClass();
            eVar.a(fVar5, jVar3);
            Trace.endSection();
            f fVar6 = iVar.f154a;
            fVar6.getClass();
            f fVar7 = iVar.f154a;
            f0.c cVar2 = iVar.f155b;
            fVar7.getClass();
            iVar.f157d = new io.flutter.plugin.platform.e(fVar7, cVar2.f279l, fVar7);
            f fVar8 = iVar.f154a;
            f0.c cVar3 = iVar.f155b;
            fVar8.getClass();
            int i3 = f142e;
            iVar.f158e = new r0.a(i3, fVar6, cVar3.f280n);
            f fVar9 = iVar.f154a;
            f0.c cVar4 = iVar.f155b;
            if (!fVar9.f144b.f160g) {
                a.a.w(cVar4);
            }
            iVar.f163j = true;
            i iVar5 = this.f144b;
            iVar5.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (iVar5.f154a.j()) {
                m0.l lVar = iVar5.f155b.f278k;
                lVar.f813e = true;
                m0.k kVar = lVar.f812d;
                if (kVar != null) {
                    kVar.d(m0.l.a(bArr));
                    lVar.f812d = null;
                    lVar.f810b = bArr;
                } else if (lVar.f814f) {
                    lVar.f811c.d("push", m0.l.a(bArr), new m0.k(0, lVar, bArr));
                } else {
                    lVar.f810b = bArr;
                }
            }
            iVar5.f154a.getClass();
            f0.e eVar2 = iVar5.f155b.f271d;
            if (eVar2.e()) {
                s0.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = eVar2.f300f.f294f.iterator();
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
            this.f145c.a(androidx.lifecycle.d.ON_CREATE);
            if (c() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            i iVar6 = this.f144b;
            boolean z2 = (c() == 1 ? (char) 1 : (char) 2) == 1;
            iVar6.c();
            if (iVar6.f154a.c() == 1) {
                f fVar10 = iVar6.f154a;
                fVar10.getClass();
                m mVar = new m(fVar10, iVar6.f154a.c() != 1);
                iVar6.f154a.getClass();
                f fVar11 = iVar6.f154a;
                fVar11.getClass();
                iVar6.f156c = new u(fVar11, mVar);
            } else {
                f fVar12 = iVar6.f154a;
                fVar12.getClass();
                o oVar = new o(fVar12);
                oVar.setOpaque(iVar6.f154a.c() == 1);
                iVar6.f154a.getClass();
                f fVar13 = iVar6.f154a;
                fVar13.getClass();
                iVar6.f156c = new u(fVar13, oVar);
            }
            iVar6.f156c.f217g.add(iVar6.f165l);
            iVar6.f154a.getClass();
            u uVar = iVar6.f156c;
            f0.c cVar5 = iVar6.f155b;
            g gVar = uVar.f231x;
            Objects.toString(cVar5);
            if (uVar.c()) {
                if (cVar5 != uVar.f219i) {
                    uVar.a();
                }
                iVar6.f156c.setId(i3);
                if (z2) {
                    u uVar2 = iVar6.f156c;
                    if (iVar6.f154a.c() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (iVar6.f159f != null) {
                        uVar2.getViewTreeObserver().removeOnPreDrawListener(iVar6.f159f);
                    }
                    iVar6.f159f = new h(iVar6, uVar2);
                    uVar2.getViewTreeObserver().addOnPreDrawListener(iVar6.f159f);
                }
                setContentView(iVar6.f156c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            uVar.f219i = cVar5;
            io.flutter.embedding.engine.renderer.h hVar = cVar5.f269b;
            uVar.f218h = hVar.f424c;
            uVar.f215e.a(hVar);
            hVar.a(gVar);
            if (uVar.f211a) {
                hVar.f422a.addResizingFlutterUiListener(uVar.f230w);
            }
            uVar.f221k = new c0.a(uVar, uVar.f219i.f275h);
            f0.c cVar6 = uVar.f219i;
            uVar.f222l = new io.flutter.plugin.editing.n(uVar, cVar6.f284r, cVar6.m, cVar6.f285s, cVar6.f286t);
            TextServicesManager textServicesManager = (TextServicesManager) uVar.getContext().getSystemService("textservices");
            uVar.f227r = textServicesManager;
            uVar.m = new io.flutter.plugin.editing.i(textServicesManager, uVar.f219i.f282p);
            new c0.a(uVar, uVar.f222l.f474b, uVar.f219i.m);
            uVar.f223n = uVar.f219i.f272e;
            uVar.f224o = new h0(uVar);
            uVar.f225p = new b(uVar.f219i.f269b, false);
            io.flutter.view.i iVar7 = new io.flutter.view.i(uVar, cVar5.f273f, (AccessibilityManager) uVar.getContext().getSystemService("accessibility"), uVar.getContext().getContentResolver(), cVar5.u);
            uVar.f226q = iVar7;
            iVar7.f617r = uVar.u;
            boolean isEnabled = iVar7.f603c.isEnabled();
            boolean isTouchExplorationEnabled = uVar.f226q.f603c.isTouchExplorationEnabled();
            if (uVar.f219i.f269b.f422a.getIsSoftwareRenderingEnabled()) {
                uVar.setWillNotDraw(false);
            } else {
                uVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            f0.c cVar7 = uVar.f219i;
            cVar7.f285s.f520i.f488a = uVar.f226q;
            new b(cVar7.f269b, true);
            f0.c cVar8 = uVar.f219i;
            cVar8.f286t.f505g.f488a = uVar.f226q;
            new b(cVar8.f269b, true);
            uVar.f222l.f474b.restartInput(uVar);
            uVar.d();
            uVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, uVar.v);
            uVar.e();
            io.flutter.plugin.platform.j jVar4 = cVar5.f285s;
            SparseArray sparseArray = jVar4.f523l;
            SparseArray sparseArray2 = jVar4.m;
            SparseArray sparseArray3 = jVar4.f525o;
            jVar4.f515d = uVar;
            for (int i4 = 0; i4 < sparseArray3.size(); i4++) {
                jVar4.f515d.addView((io.flutter.plugin.platform.g) sparseArray3.valueAt(i4));
            }
            for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
                if (sparseArray2.valueAt(i5) != null) {
                    f0.l.a();
                    return;
                }
                jVar4.f515d.addView(null);
            }
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                f0.l.a();
                return;
            }
            io.flutter.plugin.platform.i iVar8 = cVar5.f286t;
            SparseArray sparseArray4 = iVar8.f506h;
            SparseArray sparseArray5 = iVar8.f507i;
            iVar8.f502d = uVar;
            for (int i6 = 0; i6 < sparseArray5.size(); i6++) {
                if (sparseArray5.valueAt(i6) != null) {
                    f0.l.a();
                    return;
                }
                iVar8.f502d.addView(null);
            }
            if (sparseArray4.size() > 0) {
                sparseArray4.valueAt(0).getClass();
                f0.l.a();
                return;
            }
            Iterator it2 = uVar.f220j.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                f0.l.a();
                return;
            }
            if (uVar.f218h) {
                gVar.b();
            }
            iVar6.f156c.setId(i3);
            if (z2) {
            }
            setContentView(iVar6.f156c);
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
            this.f144b.e();
            this.f144b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f146d);
            this.f143a = false;
        }
        i iVar = this.f144b;
        if (iVar != null) {
            iVar.f154a = null;
            iVar.f155b = null;
            iVar.f156c = null;
            iVar.f157d = null;
            iVar.f158e = null;
            this.f144b = null;
        }
        this.f145c.a(androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            i iVar = this.f144b;
            iVar.c();
            f0.c cVar = iVar.f155b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            f0.e eVar = cVar.f271d;
            if (eVar.e()) {
                s0.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = eVar.f300f.f292d.iterator();
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
            String d2 = iVar.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            m0.a aVar = iVar.f155b.f276i;
            aVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d2);
            aVar.f766a.d("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            i iVar = this.f144b;
            iVar.c();
            iVar.f154a.getClass();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                m0.c cVar2 = cVar.f274g;
                cVar2.a(3, cVar2.f770c);
            }
        }
        this.f145c.a(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            i iVar = this.f144b;
            iVar.c();
            if (iVar.f155b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.e eVar = iVar.f157d;
            if (eVar != null) {
                eVar.b();
            }
            Iterator it = iVar.f155b.f285s.f521j.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.p) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            i iVar = this.f144b;
            iVar.c();
            if (iVar.f155b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            f0.e eVar = iVar.f155b.f271d;
            if (!eVar.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            s0.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = eVar.f300f.f290b.iterator();
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
        this.f145c.a(androidx.lifecycle.d.ON_RESUME);
        if (k("onResume")) {
            i iVar = this.f144b;
            iVar.c();
            iVar.f155b.f269b.d();
            iVar.f154a.getClass();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                m0.c cVar2 = cVar.f274g;
                cVar2.a(2, cVar2.f770c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            i iVar = this.f144b;
            iVar.c();
            if (iVar.f154a.j()) {
                bundle.putByteArray("framework", iVar.f155b.f278k.f810b);
            }
            iVar.f154a.getClass();
            Bundle bundle2 = new Bundle();
            f0.e eVar = iVar.f155b.f271d;
            if (eVar.e()) {
                s0.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = eVar.f300f.f294f.iterator();
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
            if (iVar.f154a.d() == null || iVar.f154a.i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", iVar.f154a.f143a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        String b2;
        Bundle g2;
        super.onStart();
        this.f145c.a(androidx.lifecycle.d.ON_START);
        if (k("onStart")) {
            i iVar = this.f144b;
            iVar.c();
            if (iVar.f154a.d() == null && !iVar.f155b.f270c.f339g) {
                String f2 = iVar.f154a.f();
                if (f2 == null) {
                    f fVar = iVar.f154a;
                    fVar.getClass();
                    f2 = iVar.d(fVar.getIntent());
                    if (f2 == null) {
                        f2 = "/";
                    }
                }
                f fVar2 = iVar.f154a;
                fVar2.getClass();
                try {
                    g2 = fVar2.g();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (g2 != null) {
                    str = g2.getString("io.flutter.EntrypointUri");
                    iVar.f154a.e();
                    iVar.f155b.f276i.f766a.d("setInitialRoute", f2, null);
                    b2 = iVar.f154a.b();
                    if (b2 != null || b2.isEmpty()) {
                        b2 = ((j0.d) c0.a.y().f66c).f657e.f645b;
                    }
                    f fVar3 = iVar.f154a;
                    iVar.f155b.f270c.a(str != null ? new g0.a(b2, fVar3.e()) : new g0.a(b2, str, fVar3.e()), (List) iVar.f154a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                iVar.f154a.e();
                iVar.f155b.f276i.f766a.d("setInitialRoute", f2, null);
                b2 = iVar.f154a.b();
                if (b2 != null) {
                }
                b2 = ((j0.d) c0.a.y().f66c).f657e.f645b;
                f fVar32 = iVar.f154a;
                iVar.f155b.f270c.a(str != null ? new g0.a(b2, fVar32.e()) : new g0.a(b2, str, fVar32.e()), (List) iVar.f154a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = iVar.f164k;
            if (num != null) {
                iVar.f156c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            i iVar = this.f144b;
            iVar.c();
            iVar.f154a.getClass();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                m0.c cVar2 = cVar.f274g;
                cVar2.a(5, cVar2.f770c);
            }
            iVar.f164k = Integer.valueOf(iVar.f156c.getVisibility());
            iVar.f156c.setVisibility(8);
            f0.c cVar3 = iVar.f155b;
            if (cVar3 != null) {
                cVar3.f269b.b(40);
            }
        }
        this.f145c.a(androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (k("onTrimMemory")) {
            i iVar = this.f144b;
            iVar.c();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                if (iVar.f162i && i2 >= 10) {
                    FlutterJNI flutterJNI = cVar.f270c.f334b;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    m0.b bVar = iVar.f155b.f283q;
                    bVar.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    bVar.f767a.g(hashMap, null);
                }
                iVar.f155b.f269b.b(i2);
                io.flutter.plugin.platform.j jVar = iVar.f155b.f285s;
                if (i2 < 40) {
                    jVar.getClass();
                    return;
                }
                Iterator it = jVar.f521j.values().iterator();
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
            i iVar = this.f144b;
            iVar.c();
            f0.c cVar = iVar.f155b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            f0.e eVar = cVar.f271d;
            if (!eVar.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            s0.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = eVar.f300f.f293e.iterator();
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
            i iVar = this.f144b;
            iVar.c();
            iVar.f154a.getClass();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                m0.c cVar2 = cVar.f274g;
                if (z2) {
                    cVar2.a(cVar2.f768a, true);
                } else {
                    cVar2.a(cVar2.f768a, false);
                }
            }
        }
    }
}
