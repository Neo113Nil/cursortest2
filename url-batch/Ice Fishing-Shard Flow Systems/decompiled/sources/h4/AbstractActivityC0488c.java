package h4;

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
import androidx.lifecycle.AbstractC0250p;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.InterfaceC0256w;
import e0.C0370a;
import i.C0511M;
import i4.AbstractC0549e;
import i4.C0547c;
import i4.C0548d;
import i4.C0551g;
import i4.C0552h;
import i4.C0553i;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.C0560f;
import io.flutter.plugin.platform.InterfaceC0561g;
import j4.C0572a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m4.C0690c;
import n4.C0758a;

/* renamed from: h4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0488c extends Activity implements InterfaceC0491f, InterfaceC0256w {

    /* renamed from: m, reason: collision with root package name */
    public static final int f5189m = View.generateViewId();

    /* renamed from: d, reason: collision with root package name */
    public boolean f5190d = false;

    /* renamed from: e, reason: collision with root package name */
    public C0492g f5191e;

    /* renamed from: i, reason: collision with root package name */
    public final C0258y f5192i;

    /* renamed from: l, reason: collision with root package name */
    public final OnBackInvokedCallback f5193l;

    public AbstractActivityC0488c() {
        int i2 = Build.VERSION.SDK_INT;
        this.f5193l = i2 < 33 ? null : i2 >= 34 ? new C0487b(this) : new d.t(1, this);
        this.f5192i = new C0258y(this);
    }

    public final String a() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int b() {
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

    public final String c() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String d() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle f7 = f();
            String string = f7 != null ? f7.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String e() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle f7 = f();
            if (f7 != null) {
                return f7.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle f() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void g(boolean z7) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z7 && !this.f5190d) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f5193l);
                this.f5190d = true;
                return;
            }
            return;
        }
        if (z7 || !this.f5190d || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f5193l);
        this.f5190d = false;
    }

    @Override // androidx.lifecycle.InterfaceC0256w
    public final AbstractC0250p getLifecycle() {
        return this.f5192i;
    }

    public final boolean h() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (c() != null || this.f5191e.f5204g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean i() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : c() == null;
    }

    public final boolean j(String str) {
        C0492g c0492g = this.f5191e;
        if (c0492g == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0492g.j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i5, Intent intent) {
        if (j("onActivityResult")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            if (c0492g.f5199b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            C0370a c0370a = c0492g.f5199b.f5504d;
            if (!c0370a.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            A4.a.d("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                D6.z zVar = (D6.z) c0370a.f4673h;
                zVar.getClass();
                Iterator it = new HashSet((HashSet) zVar.f641d).iterator();
                while (true) {
                    boolean z7 = false;
                    while (it.hasNext()) {
                        if (((s4.s) it.next()).onActivityResult(i2, i5, intent) || z7) {
                            z7 = true;
                        }
                    }
                    Trace.endSection();
                    return;
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
    public final void onBackPressed() {
        if (j("onBackPressed")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                c0547c.f5509i.f7461a.a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:139|140|(1:142)|143|144|(1:146)|147|(1:149)(1:270)|150|(2:152|(1:154)(2:155|(1:157)(1:158)))|159|(4:161|162|163|(1:165)(2:254|(2:256|257)(2:258|259)))(1:269)|166|(1:168)|169|(1:171)|(1:173)(1:253)|174|(3:176|(1:178)(1:247)|179)(3:248|(1:250)(1:252)|251)|180|(8:182|(1:184)|185|(2:187|(3:189|(1:191)|192)(2:193|194))|195|(1:197)|198|199)|200|(1:202)|203|204|205|206|(2:(1:243)(1:210)|211)(1:244)|212|(2:215|213)|216|217|(2:220|218)|221|222|(2:225|223)|226|227|(2:230|228)|231|(2:234|232)|235|236|(8:238|(1:240)|185|(0)|195|(0)|198|199)(2:241|242)) */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04d8, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x066e  */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i2;
        try {
            Bundle f7 = f();
            if (f7 != null && (i2 = f7.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            g(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0492g c0492g = new C0492g(this);
        this.f5191e = c0492g;
        c0492g.c();
        if (c0492g.f5199b == null) {
            String c7 = c0492g.f5198a.c();
            if (c7 != null) {
                if (C0553i.f5550c == null) {
                    C0553i.f5550c = new C0553i(1);
                }
                C0547c c0547c = (C0547c) C0553i.f5550c.f5551a.get(c7);
                c0492g.f5199b = c0547c;
                c0492g.f5204g = true;
                if (c0547c == null) {
                    throw new IllegalStateException(r4.f.d("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", c7, "'"));
                }
            } else {
                c0492g.f5198a.getClass();
                c0492g.f5199b = null;
                String stringExtra = c0492g.f5198a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (C0553i.f5549b == null) {
                        synchronized (C0553i.class) {
                            try {
                                if (C0553i.f5549b == null) {
                                    C0553i.f5549b = new C0553i(0);
                                }
                            } finally {
                            }
                        }
                    }
                    C0552h c0552h = (C0552h) C0553i.f5549b.f5551a.get(stringExtra);
                    if (c0552h == null) {
                        throw new IllegalStateException(r4.f.d("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", stringExtra, "'"));
                    }
                    AbstractActivityC0488c abstractActivityC0488c = c0492g.f5198a;
                    abstractActivityC0488c.getClass();
                    C0551g c0551g = new C0551g(abstractActivityC0488c);
                    c0492g.a(c0551g);
                    c0492g.f5199b = c0552h.a(c0551g);
                    c0492g.f5204g = false;
                } else {
                    AbstractActivityC0488c abstractActivityC0488c2 = c0492g.f5198a;
                    abstractActivityC0488c2.getClass();
                    Intent intent = abstractActivityC0488c2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            C0548d a7 = AbstractC0549e.a(str);
                            if (a7 == null) {
                                a7 = AbstractC0549e.a("--".concat(str));
                            }
                            if (a7 == null) {
                                a7 = AbstractC0549e.a("--" + str + "=");
                            }
                            if (a7 != null) {
                                break;
                            }
                        }
                    }
                    AbstractActivityC0488c abstractActivityC0488c3 = c0492g.f5198a;
                    abstractActivityC0488c3.getClass();
                    Intent intent2 = c0492g.f5198a.getIntent();
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
                    C0552h c0552h2 = new C0552h(abstractActivityC0488c3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0488c abstractActivityC0488c4 = c0492g.f5198a;
                    abstractActivityC0488c4.getClass();
                    C0551g c0551g2 = new C0551g(abstractActivityC0488c4);
                    c0551g2.f5546e = false;
                    c0551g2.f5547f = c0492g.f5198a.i();
                    c0492g.a(c0551g2);
                    c0492g.f5199b = c0552h2.a(c0551g2);
                    c0492g.f5204g = false;
                }
            }
        }
        c0492g.f5198a.getClass();
        C0370a c0370a = c0492g.f5199b.f5504d;
        C0258y c0258y = c0492g.f5198a.f5192i;
        c0370a.getClass();
        A4.a.d("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0492g c0492g2 = (C0492g) c0370a.f4672g;
            if (c0492g2 != null) {
                c0492g2.b();
            }
            c0370a.e();
            c0370a.f4672g = c0492g;
            AbstractActivityC0488c abstractActivityC0488c5 = c0492g.f5198a;
            abstractActivityC0488c5.getClass();
            c0370a.b(abstractActivityC0488c5, c0258y);
            Trace.endSection();
            AbstractActivityC0488c abstractActivityC0488c6 = c0492g.f5198a;
            abstractActivityC0488c6.getClass();
            AbstractActivityC0488c abstractActivityC0488c7 = c0492g.f5198a;
            C0547c c0547c2 = c0492g.f5199b;
            abstractActivityC0488c7.getClass();
            c0492g.f5201d = new C0560f(abstractActivityC0488c7, c0547c2.f5511l, abstractActivityC0488c7);
            AbstractActivityC0488c abstractActivityC0488c8 = c0492g.f5198a;
            C0547c c0547c3 = c0492g.f5199b;
            abstractActivityC0488c8.getClass();
            int i5 = f5189m;
            c0492g.f5202e = new B6.o(i5, abstractActivityC0488c6, c0547c3.f5513n);
            AbstractActivityC0488c abstractActivityC0488c9 = c0492g.f5198a;
            C0547c c0547c4 = c0492g.f5199b;
            if (!abstractActivityC0488c9.f5191e.f5204g) {
                d4.c.I(c0547c4);
            }
            c0492g.j = true;
            C0492g c0492g3 = this.f5191e;
            c0492g3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0492g3.f5198a.i()) {
                A6.j jVar = c0492g3.f5199b.f5510k;
                jVar.f115c = true;
                r4.l lVar = (r4.l) jVar.f119g;
                if (lVar != null) {
                    lVar.success(A6.j.d(bArr));
                    jVar.f119g = null;
                    jVar.f117e = bArr;
                } else if (jVar.f116d) {
                    ((s4.q) jVar.f118f).a("push", A6.j.d(bArr), new r4.l(jVar, 0, bArr));
                } else {
                    jVar.f117e = bArr;
                }
            }
            c0492g3.f5198a.getClass();
            C0370a c0370a2 = c0492g3.f5199b.f5504d;
            if (c0370a2.f()) {
                A4.a.d("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((D6.z) c0370a2.f4673h).f644g).iterator();
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
            this.f5192i.e(EnumC0248n.ON_CREATE);
            if (b() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0492g c0492g4 = this.f5191e;
            boolean z7 = (b() == 1 ? (char) 1 : (char) 2) == 1;
            c0492g4.c();
            if (c0492g4.f5198a.b() == 1) {
                AbstractActivityC0488c abstractActivityC0488c10 = c0492g4.f5198a;
                abstractActivityC0488c10.getClass();
                k kVar = new k(abstractActivityC0488c10, c0492g4.f5198a.b() != 1);
                c0492g4.f5198a.getClass();
                AbstractActivityC0488c abstractActivityC0488c11 = c0492g4.f5198a;
                abstractActivityC0488c11.getClass();
                c0492g4.f5200c = new p(abstractActivityC0488c11, kVar);
            } else {
                AbstractActivityC0488c abstractActivityC0488c12 = c0492g4.f5198a;
                abstractActivityC0488c12.getClass();
                m mVar = new m(abstractActivityC0488c12);
                mVar.setOpaque(c0492g4.f5198a.b() == 1);
                c0492g4.f5198a.getClass();
                AbstractActivityC0488c abstractActivityC0488c13 = c0492g4.f5198a;
                abstractActivityC0488c13.getClass();
                c0492g4.f5200c = new p(abstractActivityC0488c13, mVar);
            }
            c0492g4.f5200c.f5248o.add(c0492g4.f5208l);
            c0492g4.f5198a.getClass();
            p pVar = c0492g4.f5200c;
            C0547c c0547c5 = c0492g4.f5199b;
            C0489d c0489d = pVar.f5237F;
            Objects.toString(c0547c5);
            if (pVar.c()) {
                if (c0547c5 != pVar.f5250q) {
                    pVar.a();
                }
                c0492g4.f5200c.setId(i5);
                if (z7) {
                    p pVar2 = c0492g4.f5200c;
                    if (c0492g4.f5198a.b() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0492g4.f5203f != null) {
                        pVar2.getViewTreeObserver().removeOnPreDrawListener(c0492g4.f5203f);
                    }
                    c0492g4.f5203f = new ViewTreeObserverOnPreDrawListenerC0490e(c0492g4, pVar2);
                    pVar2.getViewTreeObserver().addOnPreDrawListener(c0492g4.f5203f);
                }
                setContentView(c0492g4.f5200c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            pVar.f5250q = c0547c5;
            io.flutter.embedding.engine.renderer.j jVar2 = c0547c5.f5502b;
            pVar.f5249p = jVar2.f5601d;
            pVar.f5246m.c(jVar2);
            jVar2.a(c0489d);
            if (pVar.f5242d) {
                jVar2.f5598a.addResizingFlutterUiListener(pVar.f5236E);
            }
            pVar.f5252s = new P0.c(pVar, pVar.f5250q.f5508h);
            C0547c c0547c6 = pVar.f5250q;
            pVar.f5253t = new io.flutter.plugin.editing.i(pVar, c0547c6.f5517r, c0547c6.f5512m, c0547c6.f5518s, c0547c6.f5519t);
            TextServicesManager textServicesManager = (TextServicesManager) pVar.getContext().getSystemService("textservices");
            pVar.f5259z = textServicesManager;
            pVar.f5254u = new io.flutter.plugin.editing.g(textServicesManager, pVar.f5250q.f5515p);
            new P0.l(pVar, pVar.f5253t.f5654b, pVar.f5250q.f5512m);
            pVar.f5255v = pVar.f5250q.f5505e;
            pVar.f5256w = new D0.j(pVar);
            pVar.f5257x = new C0486a(pVar.f5250q.f5502b, false);
            io.flutter.view.g gVar = new io.flutter.view.g(pVar, c0547c5.f5506f, (AccessibilityManager) pVar.getContext().getSystemService("accessibility"), pVar.getContext().getContentResolver(), c0547c5.f5520u);
            pVar.f5258y = gVar;
            gVar.f5896s = pVar.f5234C;
            boolean isEnabled = gVar.f5881c.isEnabled();
            boolean isTouchExplorationEnabled = pVar.f5258y.f5881c.isTouchExplorationEnabled();
            if (pVar.f5250q.f5502b.f5598a.getIsSoftwareRenderingEnabled()) {
                pVar.setWillNotDraw(false);
            } else {
                pVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            C0547c c0547c7 = pVar.f5250q;
            io.flutter.plugin.platform.u uVar = c0547c7.f5518s;
            uVar.f5761q.f5690a = pVar.f5258y;
            uVar.f5754e = new C0486a(c0547c7.f5502b, true);
            C0547c c0547c8 = pVar.f5250q;
            io.flutter.plugin.platform.t tVar = c0547c8.f5519t;
            tVar.f5737p.f5690a = pVar.f5258y;
            tVar.f5731e = new C0486a(c0547c8.f5502b, true);
            pVar.f5253t.f5654b.restartInput(pVar);
            pVar.d();
            pVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, pVar.f5235D);
            pVar.e();
            io.flutter.plugin.platform.u uVar2 = c0547c5.f5518s;
            SparseArray sparseArray = uVar2.f5764t;
            SparseArray sparseArray2 = uVar2.f5765u;
            SparseArray sparseArray3 = uVar2.f5767w;
            uVar2.f5756l = pVar;
            for (int i7 = 0; i7 < sparseArray3.size(); i7++) {
                uVar2.f5756l.addView((io.flutter.plugin.platform.l) sparseArray3.valueAt(i7));
            }
            for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
                uVar2.f5756l.addView((C0758a) sparseArray2.valueAt(i8));
            }
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                ((InterfaceC0561g) sparseArray.valueAt(i9)).onFlutterViewAttached(uVar2.f5756l);
            }
            io.flutter.plugin.platform.t tVar2 = c0547c5.f5519t;
            SparseArray sparseArray4 = tVar2.f5738q;
            SparseArray sparseArray5 = tVar2.f5739r;
            tVar2.f5733l = pVar;
            for (int i10 = 0; i10 < sparseArray5.size(); i10++) {
                tVar2.f5733l.addView((C0758a) sparseArray5.valueAt(i10));
            }
            for (int i11 = 0; i11 < sparseArray4.size(); i11++) {
                ((InterfaceC0561g) sparseArray4.valueAt(i11)).onFlutterViewAttached(tVar2.f5733l);
            }
            Iterator it2 = pVar.f5251r.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            if (pVar.f5249p) {
                c0489d.b();
            }
            c0492g4.f5200c.setId(i5);
            if (z7) {
            }
            setContentView(c0492g4.f5200c);
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
        if (j("onDestroy")) {
            this.f5191e.e();
            this.f5191e.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f5193l);
            this.f5190d = false;
        }
        C0492g c0492g = this.f5191e;
        if (c0492g != null) {
            c0492g.f5198a = null;
            c0492g.f5199b = null;
            c0492g.f5200c = null;
            c0492g.f5201d = null;
            c0492g.f5202e = null;
            this.f5191e = null;
        }
        this.f5192i.e(EnumC0248n.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (j("onNewIntent")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C0370a c0370a = c0547c.f5504d;
            if (c0370a.f()) {
                A4.a.d("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((D6.z) c0370a.f4673h).f642e).iterator();
                    while (it.hasNext()) {
                        ((s4.t) it.next()).onNewIntent(intent);
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
            String d7 = c0492g.d(intent);
            if (d7 == null || d7.isEmpty()) {
                return;
            }
            r4.a aVar = c0492g.f5199b.f5509i;
            aVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d7);
            aVar.f7461a.a("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (j("onPause")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            c0492g.f5198a.getClass();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                r4.c cVar = c0547c.f5507g;
                cVar.a(3, cVar.f7464c);
            }
        }
        this.f5192i.e(EnumC0248n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (j("onPostResume")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            if (c0492g.f5199b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C0560f c0560f = c0492g.f5201d;
            if (c0560f != null) {
                c0560f.b();
            }
            c0492g.f5199b.f5518s.i();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (j("onRequestPermissionsResult")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            if (c0492g.f5199b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            C0370a c0370a = c0492g.f5199b.f5504d;
            if (!c0370a.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            A4.a.d("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((D6.z) c0370a.f4673h).f639b).iterator();
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
        this.f5192i.e(EnumC0248n.ON_RESUME);
        if (j("onResume")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            c0492g.f5199b.f5502b.i();
            c0492g.f5198a.getClass();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                r4.c cVar = c0547c.f5507g;
                cVar.a(2, cVar.f7464c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (j("onSaveInstanceState")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            if (c0492g.f5198a.i()) {
                bundle.putByteArray("framework", (byte[]) c0492g.f5199b.f5510k.f117e);
            }
            c0492g.f5198a.getClass();
            Bundle bundle2 = new Bundle();
            C0370a c0370a = c0492g.f5199b.f5504d;
            if (c0370a.f()) {
                A4.a.d("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((D6.z) c0370a.f4673h).f644g).iterator();
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
            if (c0492g.f5198a.c() == null || c0492g.f5198a.h()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0492g.f5198a.f5190d);
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
        String a7;
        Bundle f7;
        super.onStart();
        this.f5192i.e(EnumC0248n.ON_START);
        if (j("onStart")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            if (c0492g.f5198a.c() == null && !c0492g.f5199b.f5503c.f5956e) {
                String e7 = c0492g.f5198a.e();
                if (e7 == null) {
                    AbstractActivityC0488c abstractActivityC0488c = c0492g.f5198a;
                    abstractActivityC0488c.getClass();
                    e7 = c0492g.d(abstractActivityC0488c.getIntent());
                    if (e7 == null) {
                        e7 = "/";
                    }
                }
                AbstractActivityC0488c abstractActivityC0488c2 = c0492g.f5198a;
                abstractActivityC0488c2.getClass();
                try {
                    f7 = abstractActivityC0488c2.f();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (f7 != null) {
                    str = f7.getString("io.flutter.EntrypointUri");
                    c0492g.f5198a.d();
                    c0492g.f5199b.f5509i.f7461a.a("setInitialRoute", e7, null);
                    a7 = c0492g.f5198a.a();
                    if (a7 != null || a7.isEmpty()) {
                        a7 = (String) ((C0690c) D0.j.Q().f330e).f6538e.f7206c;
                    }
                    c0492g.f5199b.f5503c.c(str != null ? new C0572a(a7, c0492g.f5198a.d()) : new C0572a(a7, str, c0492g.f5198a.d()), (List) c0492g.f5198a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0492g.f5198a.d();
                c0492g.f5199b.f5509i.f7461a.a("setInitialRoute", e7, null);
                a7 = c0492g.f5198a.a();
                if (a7 != null) {
                }
                a7 = (String) ((C0690c) D0.j.Q().f330e).f6538e.f7206c;
                c0492g.f5199b.f5503c.c(str != null ? new C0572a(a7, c0492g.f5198a.d()) : new C0572a(a7, str, c0492g.f5198a.d()), (List) c0492g.f5198a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0492g.f5207k;
            if (num != null) {
                c0492g.f5200c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (j("onStop")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            c0492g.f5198a.getClass();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                r4.c cVar = c0547c.f5507g;
                cVar.a(5, cVar.f7464c);
            }
            c0492g.f5207k = Integer.valueOf(c0492g.f5200c.getVisibility());
            c0492g.f5200c.setVisibility(8);
            C0547c c0547c2 = c0492g.f5199b;
            if (c0547c2 != null) {
                c0547c2.f5502b.f(40);
            }
        }
        this.f5192i.e(EnumC0248n.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (j("onTrimMemory")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                if (c0492g.f5206i && i2 >= 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) c0547c.f5503c.f5957i;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0511M c0511m = c0492g.f5199b.f5516q;
                    c0511m.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put(com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_KEY, "memoryPressure");
                    ((P0.i) c0511m.f5381e).l(hashMap, null);
                }
                c0492g.f5199b.f5502b.f(i2);
                io.flutter.plugin.platform.u uVar = c0492g.f5199b.f5518s;
                if (i2 < 40) {
                    uVar.getClass();
                    return;
                }
                Iterator it = uVar.f5762r.values().iterator();
                while (it.hasNext()) {
                    ((io.flutter.plugin.platform.G) it.next()).f5687h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (j("onUserLeaveHint")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C0370a c0370a = c0547c.f5504d;
            if (!c0370a.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            A4.a.d("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((D6.z) c0370a.f4673h).f643f).iterator();
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
    public final void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (j("onWindowFocusChanged")) {
            C0492g c0492g = this.f5191e;
            c0492g.c();
            c0492g.f5198a.getClass();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                r4.c cVar = c0547c.f5507g;
                if (z7) {
                    cVar.a(cVar.f7462a, true);
                } else {
                    cVar.a(cVar.f7462a, false);
                }
            }
        }
    }
}
