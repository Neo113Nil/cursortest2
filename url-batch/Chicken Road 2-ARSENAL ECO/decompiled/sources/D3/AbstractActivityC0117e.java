package D3;

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
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0248o;
import androidx.lifecycle.C0255w;
import androidx.lifecycle.EnumC0246m;
import androidx.lifecycle.InterfaceC0253u;
import com.strategylink.Row.Five.MainActivity;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m1.AbstractC0521b;
import u0.C0675e;
import u0.C0682l;
import u0.C0689s;

/* renamed from: D3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0117e extends Activity implements InterfaceC0120h, InterfaceC0253u {

    /* renamed from: j, reason: collision with root package name */
    public static final int f416j = View.generateViewId();

    /* renamed from: f, reason: collision with root package name */
    public boolean f417f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0121i f418g;

    /* renamed from: h, reason: collision with root package name */
    public final C0255w f419h;

    /* renamed from: i, reason: collision with root package name */
    public final OnBackInvokedCallback f420i;

    public AbstractActivityC0117e() {
        int i7 = Build.VERSION.SDK_INT;
        this.f420i = i7 < 33 ? null : i7 >= 34 ? new C0116d(this) : new C0115c(0, this);
        this.f419h = new C0255w(this);
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

    public final void g(boolean z5) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z5 && !this.f417f) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f420i);
                this.f417f = true;
                return;
            }
            return;
        }
        if (z5 || !this.f417f || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f420i);
        this.f417f = false;
    }

    @Override // androidx.lifecycle.InterfaceC0253u
    public final AbstractC0248o getLifecycle() {
        return this.f419h;
    }

    public final boolean h() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (c() != null || this.f418g.f431g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean i() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : c() == null;
    }

    public final boolean j(String str) {
        C0121i c0121i = this.f418g;
        if (c0121i == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0121i.f434j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (j("onActivityResult")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            if (c0121i.f426b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            E3.d dVar = c0121i.f426b.f603d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            T3.a.d("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                ((D0.h) dVar.f631h).j(i7, i8, intent);
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
        if (j("onBackPressed")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                cVar.f608i.f1680a.q("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:139|140|(1:142)|143|144|(1:146)|147|(1:149)(1:282)|150|(2:152|(1:154)(2:155|(1:157)(1:158)))|159|(4:161|162|163|(1:165)(2:266|(2:268|269)(2:270|271)))(1:281)|166|(1:168)|169|(1:171)|(1:173)(1:265)|174|(3:176|(1:178)(1:259)|179)(3:260|(1:262)(1:264)|263)|180|(8:182|(1:184)|185|(2:187|(3:189|(1:191)|192)(2:193|194))|195|(1:197)|198|199)|200|(1:202)|203|204|205|206|(1:208)|209|(2:(1:255)(1:213)|214)(1:256)|215|(2:218|216)|219|220|(3:223|(1:225)(3:226|227|228)|221)|229|230|(5:232|(3:235|(1:237)(3:238|239|240)|233)|241|242|(2:244|(8:246|(1:248)|185|(0)|195|(0)|198|199)(2:249|250))(2:251|252))(2:253|254)) */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04f8, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x068a  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        ?? r02;
        int i7;
        try {
            Bundle f7 = f();
            if (f7 != null && (i7 = f7.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i7);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            g(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0121i c0121i = new C0121i(this);
        this.f418g = c0121i;
        c0121i.c();
        if (c0121i.f426b == null) {
            String c7 = c0121i.f425a.c();
            if (c7 != null) {
                if (J1.c.f1287i == null) {
                    J1.c.f1287i = new J1.c(4);
                }
                E3.c cVar = (E3.c) ((HashMap) J1.c.f1287i.f1289g).get(c7);
                c0121i.f426b = cVar;
                c0121i.f431g = true;
                if (cVar == null) {
                    throw new IllegalStateException(W4.o.e("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", c7, "'"));
                }
            } else {
                c0121i.f425a.getClass();
                c0121i.f426b = null;
                String stringExtra = c0121i.f425a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (E3.j.f658b == null) {
                        synchronized (E3.j.class) {
                            try {
                                if (E3.j.f658b == null) {
                                    E3.j.f658b = new E3.j(0);
                                }
                            } finally {
                            }
                        }
                    }
                    E3.i iVar = (E3.i) E3.j.f658b.f659a.get(stringExtra);
                    if (iVar == null) {
                        throw new IllegalStateException(W4.o.e("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", stringExtra, "'"));
                    }
                    AbstractActivityC0117e abstractActivityC0117e = c0121i.f425a;
                    abstractActivityC0117e.getClass();
                    E3.h hVar = new E3.h(abstractActivityC0117e);
                    c0121i.a(hVar);
                    c0121i.f426b = iVar.a(hVar);
                    c0121i.f431g = false;
                } else {
                    AbstractActivityC0117e abstractActivityC0117e2 = c0121i.f425a;
                    abstractActivityC0117e2.getClass();
                    Intent intent = abstractActivityC0117e2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            E3.e a7 = E3.f.a(str);
                            if (a7 == null) {
                                a7 = E3.f.a("--".concat(str));
                            }
                            if (a7 == null) {
                                a7 = E3.f.a("--" + str + "=");
                            }
                            if (a7 != null) {
                                break;
                            }
                        }
                    }
                    AbstractActivityC0117e abstractActivityC0117e3 = c0121i.f425a;
                    abstractActivityC0117e3.getClass();
                    Intent intent2 = c0121i.f425a.getIntent();
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
                    E3.i iVar2 = new E3.i(abstractActivityC0117e3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0117e abstractActivityC0117e4 = c0121i.f425a;
                    abstractActivityC0117e4.getClass();
                    E3.h hVar2 = new E3.h(abstractActivityC0117e4);
                    hVar2.f655e = false;
                    hVar2.f656f = c0121i.f425a.i();
                    c0121i.a(hVar2);
                    c0121i.f426b = iVar2.a(hVar2);
                    c0121i.f431g = false;
                }
            }
        }
        c0121i.f425a.getClass();
        E3.d dVar = c0121i.f426b.f603d;
        C0255w c0255w = c0121i.f425a.f419h;
        dVar.getClass();
        T3.a.d("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0121i c0121i2 = (C0121i) dVar.f630g;
            if (c0121i2 != null) {
                c0121i2.b();
            }
            dVar.e();
            dVar.f630g = c0121i;
            AbstractActivityC0117e abstractActivityC0117e5 = c0121i.f425a;
            abstractActivityC0117e5.getClass();
            dVar.b(abstractActivityC0117e5, c0255w);
            Trace.endSection();
            AbstractActivityC0117e abstractActivityC0117e6 = c0121i.f425a;
            abstractActivityC0117e6.getClass();
            AbstractActivityC0117e abstractActivityC0117e7 = c0121i.f425a;
            E3.c cVar2 = c0121i.f426b;
            abstractActivityC0117e7.getClass();
            c0121i.f428d = new io.flutter.plugin.platform.f(abstractActivityC0117e7, cVar2.f611l, abstractActivityC0117e7);
            AbstractActivityC0117e abstractActivityC0117e8 = c0121i.f425a;
            E3.c cVar3 = c0121i.f426b;
            abstractActivityC0117e8.getClass();
            int i8 = f416j;
            c0121i.f429e = new D1.b(i8, abstractActivityC0117e6, cVar3.f613n);
            AbstractActivityC0117e abstractActivityC0117e9 = c0121i.f425a;
            E3.c flutterEngine = c0121i.f426b;
            MainActivity mainActivity = (MainActivity) abstractActivityC0117e9;
            mainActivity.getClass();
            kotlin.jvm.internal.i.e(flutterEngine, "flutterEngine");
            if (!mainActivity.f418g.f431g) {
                AbstractC0521b.C(flutterEngine);
            }
            new B0.c(flutterEngine.f602c.f716j, mainActivity.f3934k).C(new B0.b(1, mainActivity));
            c0121i.f434j = true;
            C0121i c0121i3 = this.f418g;
            c0121i3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                r02 = bundle.getByteArray("framework");
            } else {
                r02 = 0;
            }
            if (c0121i3.f425a.i()) {
                N3.k kVar = c0121i3.f426b.f610k;
                kVar.f1722c = true;
                N3.j jVar = (N3.j) kVar.f1726g;
                if (jVar != null) {
                    jVar.d(N3.k.a(r02));
                    kVar.f1726g = null;
                    kVar.f1724e = r02;
                } else if (kVar.f1723d) {
                    ((B0.c) kVar.f1725f).q("push", N3.k.a(r02), new N3.j(kVar, 0, r02));
                } else {
                    kVar.f1724e = r02;
                }
            }
            c0121i3.f425a.getClass();
            E3.d dVar2 = c0121i3.f426b.f603d;
            if (dVar2.f()) {
                T3.a.d("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((D0.h) dVar2.f631h).f335g).iterator();
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
            this.f419h.e(EnumC0246m.ON_CREATE);
            if (b() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0121i c0121i4 = this.f418g;
            boolean z5 = (b() == 1 ? (char) 1 : (char) 2) == 1;
            c0121i4.c();
            if (c0121i4.f425a.b() == 1) {
                AbstractActivityC0117e abstractActivityC0117e10 = c0121i4.f425a;
                abstractActivityC0117e10.getClass();
                C0124l c0124l = new C0124l(abstractActivityC0117e10, c0121i4.f425a.b() != 1);
                c0121i4.f425a.getClass();
                AbstractActivityC0117e abstractActivityC0117e11 = c0121i4.f425a;
                abstractActivityC0117e11.getClass();
                c0121i4.f427c = new t(abstractActivityC0117e11, c0124l);
            } else {
                AbstractActivityC0117e abstractActivityC0117e12 = c0121i4.f425a;
                abstractActivityC0117e12.getClass();
                C0126n c0126n = new C0126n(abstractActivityC0117e12);
                c0126n.setOpaque(c0121i4.f425a.b() == 1);
                c0121i4.f425a.getClass();
                AbstractActivityC0117e abstractActivityC0117e13 = c0121i4.f425a;
                abstractActivityC0117e13.getClass();
                c0121i4.f427c = new t(abstractActivityC0117e13, c0126n);
            }
            c0121i4.f427c.f477l.add(c0121i4.f436l);
            c0121i4.f425a.getClass();
            t tVar = c0121i4.f427c;
            E3.c cVar4 = c0121i4.f426b;
            C0118f c0118f = tVar.f466C;
            Objects.toString(cVar4);
            if (tVar.c()) {
                if (cVar4 != tVar.f479n) {
                    tVar.a();
                }
                c0121i4.f427c.setId(i8);
                if (z5) {
                    t tVar2 = c0121i4.f427c;
                    if (c0121i4.f425a.b() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0121i4.f430f != null) {
                        tVar2.getViewTreeObserver().removeOnPreDrawListener(c0121i4.f430f);
                    }
                    c0121i4.f430f = new ViewTreeObserverOnPreDrawListenerC0119g(c0121i4, tVar2);
                    tVar2.getViewTreeObserver().addOnPreDrawListener(c0121i4.f430f);
                }
                setContentView(c0121i4.f427c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            tVar.f479n = cVar4;
            io.flutter.embedding.engine.renderer.h hVar3 = cVar4.f601b;
            tVar.f478m = hVar3.f4488c;
            tVar.f475j.c(hVar3);
            hVar3.a(c0118f);
            if (tVar.f471f) {
                hVar3.f4486a.addResizingFlutterUiListener(tVar.f465B);
            }
            tVar.f481p = new C0675e(tVar, tVar.f479n.f607h);
            E3.c cVar5 = tVar.f479n;
            tVar.f482q = new io.flutter.plugin.editing.i(tVar, cVar5.f617r, cVar5.f612m, cVar5.f618s, cVar5.f619t);
            TextServicesManager textServicesManager = (TextServicesManager) tVar.getContext().getSystemService("textservices");
            tVar.f488w = textServicesManager;
            tVar.f483r = new io.flutter.plugin.editing.g(textServicesManager, tVar.f479n.f615p);
            InputMethodManager inputMethodManager = tVar.f482q.f4534b;
            J1.c cVar6 = tVar.f479n.f612m;
            C0682l c0682l = new C0682l();
            if (Build.VERSION.SDK_INT >= 33) {
                tVar.setAutoHandwritingEnabled(false);
            }
            c0682l.f5990g = tVar;
            c0682l.f5989f = inputMethodManager;
            cVar6.f1289g = c0682l;
            tVar.f484s = tVar.f479n.f604e;
            tVar.f485t = new B0.c(tVar);
            tVar.f486u = new C0113a(tVar.f479n.f601b, false);
            io.flutter.view.i iVar3 = new io.flutter.view.i(tVar, cVar4.f605f, (AccessibilityManager) tVar.getContext().getSystemService("accessibility"), tVar.getContext().getContentResolver(), cVar4.f620u);
            tVar.f487v = iVar3;
            iVar3.f4713r = tVar.f490z;
            boolean isEnabled = iVar3.f4698c.isEnabled();
            boolean isTouchExplorationEnabled = tVar.f487v.f4698c.isTouchExplorationEnabled();
            if (tVar.f479n.f601b.f4486a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
            } else {
                tVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            E3.c cVar7 = tVar.f479n;
            cVar7.f618s.f4582m.f4549a = tVar.f487v;
            new C0113a(cVar7.f601b, true);
            E3.c cVar8 = tVar.f479n;
            cVar8.f619t.f4566k.f4549a = tVar.f487v;
            new C0113a(cVar8.f601b, true);
            tVar.f482q.f4534b.restartInput(tVar);
            tVar.d();
            tVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, tVar.f464A);
            tVar.e();
            io.flutter.plugin.platform.l lVar = cVar4.f618s;
            SparseArray sparseArray = lVar.f4585p;
            SparseArray sparseArray2 = lVar.f4586q;
            SparseArray sparseArray3 = lVar.f4588s;
            lVar.f4577h = tVar;
            for (int i9 = 0; i9 < sparseArray3.size(); i9++) {
                lVar.f4577h.addView((io.flutter.plugin.platform.h) sparseArray3.valueAt(i9));
            }
            for (int i10 = 0; i10 < sparseArray2.size(); i10++) {
                if (sparseArray2.valueAt(i10) != null) {
                    throw new ClassCastException();
                }
                lVar.f4577h.addView(null);
            }
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                throw new ClassCastException();
            }
            io.flutter.plugin.platform.k kVar2 = cVar4.f619t;
            SparseArray sparseArray4 = kVar2.f4567l;
            SparseArray sparseArray5 = kVar2.f4568m;
            kVar2.f4563h = tVar;
            for (int i11 = 0; i11 < sparseArray5.size(); i11++) {
                if (sparseArray5.valueAt(i11) != null) {
                    throw new ClassCastException();
                }
                kVar2.f4563h.addView(null);
            }
            if (sparseArray4.size() > 0) {
                sparseArray4.valueAt(0).getClass();
                throw new ClassCastException();
            }
            Iterator it2 = tVar.f480o.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            if (tVar.f478m) {
                c0118f.b();
            }
            c0121i4.f427c.setId(i8);
            if (z5) {
            }
            setContentView(c0121i4.f427c);
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
            this.f418g.e();
            this.f418g.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f420i);
            this.f417f = false;
        }
        C0121i c0121i = this.f418g;
        if (c0121i != null) {
            c0121i.f425a = null;
            c0121i.f426b = null;
            c0121i.f427c = null;
            c0121i.f428d = null;
            c0121i.f429e = null;
            this.f418g = null;
        }
        this.f419h.e(EnumC0246m.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (j("onNewIntent")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            E3.c cVar = c0121i.f426b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            E3.d dVar = cVar.f603d;
            if (dVar.f()) {
                T3.a.d("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((D0.h) dVar.f631h).f333e).iterator();
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
            String d7 = c0121i.d(intent);
            if (d7 == null || d7.isEmpty()) {
                return;
            }
            N3.b bVar = c0121i.f426b.f608i;
            bVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d7);
            bVar.f1680a.q("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (j("onPause")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            c0121i.f425a.getClass();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                N3.c cVar2 = cVar.f606g;
                cVar2.a(3, cVar2.f1683c);
            }
        }
        this.f419h.e(EnumC0246m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (j("onPostResume")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            if (c0121i.f426b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.f fVar = c0121i.f428d;
            if (fVar != null) {
                fVar.b();
            }
            Iterator it = c0121i.f426b.f618s.f4583n.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.r) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (j("onRequestPermissionsResult")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            if (c0121i.f426b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            E3.d dVar = c0121i.f426b.f603d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            T3.a.d("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((D0.h) dVar.f631h).f331c).iterator();
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
        this.f419h.e(EnumC0246m.ON_RESUME);
        if (j("onResume")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            c0121i.f426b.f601b.d();
            c0121i.f425a.getClass();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                N3.c cVar2 = cVar.f606g;
                cVar2.a(2, cVar2.f1683c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (j("onSaveInstanceState")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            if (c0121i.f425a.i()) {
                bundle.putByteArray("framework", (byte[]) c0121i.f426b.f610k.f1724e);
            }
            c0121i.f425a.getClass();
            Bundle bundle2 = new Bundle();
            E3.d dVar = c0121i.f426b.f603d;
            if (dVar.f()) {
                T3.a.d("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((D0.h) dVar.f631h).f335g).iterator();
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
            if (c0121i.f425a.c() == null || c0121i.f425a.h()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0121i.f425a.f417f);
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
        this.f419h.e(EnumC0246m.ON_START);
        if (j("onStart")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            if (c0121i.f425a.c() == null && !c0121i.f426b.f602c.f717k) {
                String e4 = c0121i.f425a.e();
                if (e4 == null) {
                    AbstractActivityC0117e abstractActivityC0117e = c0121i.f425a;
                    abstractActivityC0117e.getClass();
                    e4 = c0121i.d(abstractActivityC0117e.getIntent());
                    if (e4 == null) {
                        e4 = "/";
                    }
                }
                AbstractActivityC0117e abstractActivityC0117e2 = c0121i.f425a;
                abstractActivityC0117e2.getClass();
                try {
                    f7 = abstractActivityC0117e2.f();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (f7 != null) {
                    str = f7.getString("io.flutter.EntrypointUri");
                    c0121i.f425a.d();
                    c0121i.f426b.f608i.f1680a.q("setInitialRoute", e4, null);
                    a7 = c0121i.f425a.a();
                    if (a7 != null || a7.isEmpty()) {
                        a7 = (String) ((I3.c) C0689s.t().f6034f).f1195e.f1211c;
                    }
                    c0121i.f426b.f602c.a(str != null ? new F3.a(a7, c0121i.f425a.d()) : new F3.a(a7, str, c0121i.f425a.d()), (List) c0121i.f425a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0121i.f425a.d();
                c0121i.f426b.f608i.f1680a.q("setInitialRoute", e4, null);
                a7 = c0121i.f425a.a();
                if (a7 != null) {
                }
                a7 = (String) ((I3.c) C0689s.t().f6034f).f1195e.f1211c;
                c0121i.f426b.f602c.a(str != null ? new F3.a(a7, c0121i.f425a.d()) : new F3.a(a7, str, c0121i.f425a.d()), (List) c0121i.f425a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0121i.f435k;
            if (num != null) {
                c0121i.f427c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (j("onStop")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            c0121i.f425a.getClass();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                N3.c cVar2 = cVar.f606g;
                cVar2.a(5, cVar2.f1683c);
            }
            c0121i.f435k = Integer.valueOf(c0121i.f427c.getVisibility());
            c0121i.f427c.setVisibility(8);
            E3.c cVar3 = c0121i.f426b;
            if (cVar3 != null) {
                cVar3.f601b.b(40);
            }
        }
        this.f419h.e(EnumC0246m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        if (j("onTrimMemory")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                if (c0121i.f433i && i7 >= 10) {
                    FlutterJNI flutterJNI = cVar.f602c.f712f;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    M m4 = c0121i.f426b.f616q;
                    m4.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, "memoryPressure");
                    ((B0.c) m4.f401g).z(hashMap, null);
                }
                c0121i.f426b.f601b.b(i7);
                io.flutter.plugin.platform.l lVar = c0121i.f426b.f618s;
                if (i7 < 40) {
                    lVar.getClass();
                    return;
                }
                Iterator it = lVar.f4583n.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.r) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (j("onUserLeaveHint")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            E3.c cVar = c0121i.f426b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            E3.d dVar = cVar.f603d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            T3.a.d("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((D0.h) dVar.f631h).f334f).iterator();
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
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        if (j("onWindowFocusChanged")) {
            C0121i c0121i = this.f418g;
            c0121i.c();
            c0121i.f425a.getClass();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                N3.c cVar2 = cVar.f606g;
                if (z5) {
                    cVar2.a(cVar2.f1681a, true);
                } else {
                    cVar2.a(cVar2.f1681a, false);
                }
            }
        }
    }
}
