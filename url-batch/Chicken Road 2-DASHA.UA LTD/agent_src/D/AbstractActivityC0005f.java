package D;

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

/* renamed from: D.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0005f extends Activity implements androidx.lifecycle.i {

    /* renamed from: e, reason: collision with root package name */
    public static final int f68e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f69a = false;

    /* renamed from: b, reason: collision with root package name */
    public C0008i f70b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j f71c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f72d;

    public AbstractActivityC0005f() {
        int i2 = Build.VERSION.SDK_INT;
        this.f72d = i2 < 33 ? null : i2 >= 34 ? new C0004e(this) : new OnBackInvokedCallback() { // from class: D.d
            public final void onBackInvoked() {
                AbstractActivityC0005f.this.onBackPressed();
            }
        };
        this.f71c = new androidx.lifecycle.j(this);
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.j a() {
        return this.f71c;
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
        if (z2 && !this.f69a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f72d);
                this.f69a = true;
                return;
            }
            return;
        }
        if (z2 || !this.f69a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f72d);
        this.f69a = false;
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (d() != null || this.f70b.f83g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : d() == null;
    }

    public final boolean k(String str) {
        C0008i c0008i = this.f70b;
        if (c0008i == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0008i.f86j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (k("onActivityResult")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            if (c0008i.f78b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            E.e eVar = c0008i.f78b.f151d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            T.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                eVar.f182f.a(i2, i3, intent);
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
            C0008i c0008i = this.f70b;
            c0008i.c();
            E.c cVar = c0008i.f78b;
            if (cVar != null) {
                cVar.f156i.f266a.f("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:117|118|(1:120)|121|122|(1:124)|125|(1:127)(1:257)|128|(2:130|(1:132)(2:133|(1:135)(1:136)))|137|(4:139|140|141|(1:143)(2:242|(1:244)(2:245|246)))(1:256)|144|(1:146)|147|(1:149)(1:241)|(1:151)(1:240)|152|(3:154|(1:156)(1:234)|157)(3:235|(1:237)(1:239)|238)|158|(8:160|(1:162)|163|(2:165|(3:167|(1:169)|170)(2:171|172))|173|(1:175)|176|177)|178|(1:180)|181|182|183|184|(2:(1:230)(1:188)|189)(1:231)|190|(2:191|(1:193)(1:194))|195|(2:196|(2:198|(1:200)(3:201|202|203))(3:204|205|(2:207|(2:208|(2:210|(1:212)(3:213|214|215))(3:216|217|(2:219|(2:221|(1:223))(2:224|225))(2:226|227))))(2:228|229)))|163|(0)|173|(0)|176|177) */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x048b, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0642  */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
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
        C0008i c0008i = new C0008i(this);
        this.f70b = c0008i;
        c0008i.c();
        if (c0008i.f78b == null) {
            String d2 = c0008i.f77a.d();
            if (d2 != null) {
                if (E.i.f194c == null) {
                    E.i.f194c = new E.i(1);
                }
                E.c cVar = (E.c) E.i.f194c.f195a.get(d2);
                c0008i.f78b = cVar;
                c0008i.f83g = true;
                if (cVar == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + d2 + "'");
                }
            } else {
                c0008i.f77a.getClass();
                c0008i.f78b = null;
                String stringExtra = c0008i.f77a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (E.i.f193b == null) {
                        synchronized (E.i.class) {
                            try {
                                if (E.i.f193b == null) {
                                    E.i.f193b = new E.i(0);
                                }
                            } finally {
                            }
                        }
                    }
                    E.h hVar = (E.h) E.i.f193b.f195a.get(stringExtra);
                    if (hVar == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    AbstractActivityC0005f abstractActivityC0005f = c0008i.f77a;
                    abstractActivityC0005f.getClass();
                    E.g gVar = new E.g(abstractActivityC0005f);
                    c0008i.a(gVar);
                    c0008i.f78b = hVar.a(gVar);
                    c0008i.f83g = false;
                } else {
                    AbstractActivityC0005f abstractActivityC0005f2 = c0008i.f77a;
                    abstractActivityC0005f2.getClass();
                    Intent intent = c0008i.f77a.getIntent();
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
                    E.h hVar2 = new E.h(abstractActivityC0005f2, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0005f abstractActivityC0005f3 = c0008i.f77a;
                    abstractActivityC0005f3.getClass();
                    E.g gVar2 = new E.g(abstractActivityC0005f3);
                    gVar2.f190e = false;
                    gVar2.f191f = c0008i.f77a.j();
                    c0008i.a(gVar2);
                    c0008i.f78b = hVar2.a(gVar2);
                    c0008i.f83g = false;
                }
            }
        }
        c0008i.f77a.getClass();
        E.e eVar = c0008i.f78b.f151d;
        androidx.lifecycle.j jVar = c0008i.f77a.f71c;
        eVar.getClass();
        T.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0008i c0008i2 = eVar.f181e;
            if (c0008i2 != null) {
                c0008i2.b();
            }
            eVar.e();
            eVar.f181e = c0008i;
            AbstractActivityC0005f abstractActivityC0005f4 = c0008i.f77a;
            abstractActivityC0005f4.getClass();
            eVar.b(abstractActivityC0005f4, jVar);
            Trace.endSection();
            AbstractActivityC0005f abstractActivityC0005f5 = c0008i.f77a;
            abstractActivityC0005f5.getClass();
            AbstractActivityC0005f abstractActivityC0005f6 = c0008i.f77a;
            E.c cVar2 = c0008i.f78b;
            abstractActivityC0005f6.getClass();
            c0008i.f80d = new io.flutter.plugin.platform.f(abstractActivityC0005f6, cVar2.f159l, abstractActivityC0005f6);
            AbstractActivityC0005f abstractActivityC0005f7 = c0008i.f77a;
            E.c cVar3 = c0008i.f78b;
            abstractActivityC0005f7.getClass();
            c0008i.f81e = new R.a(f68e, abstractActivityC0005f5, cVar3.f161n);
            AbstractActivityC0005f abstractActivityC0005f8 = c0008i.f77a;
            E.c cVar4 = c0008i.f78b;
            if (!abstractActivityC0005f8.f70b.f83g) {
                a.a.x(cVar4);
            }
            c0008i.f86j = true;
            C0008i c0008i3 = this.f70b;
            c0008i3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0008i3.f77a.j()) {
                M.l lVar = c0008i3.f78b.f158k;
                lVar.f315e = true;
                M.k kVar = lVar.f314d;
                if (kVar != null) {
                    kVar.c(M.l.a(bArr));
                    lVar.f314d = null;
                    lVar.f312b = bArr;
                } else if (lVar.f316f) {
                    lVar.f313c.f("push", M.l.a(bArr), new M.k(0, lVar, bArr));
                } else {
                    lVar.f312b = bArr;
                }
            }
            c0008i3.f77a.getClass();
            E.e eVar2 = c0008i3.f78b.f151d;
            if (eVar2.f()) {
                T.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = eVar2.f182f.f176f.iterator();
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
            this.f71c.a(androidx.lifecycle.d.ON_CREATE);
            if (c() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0008i c0008i4 = this.f70b;
            boolean z2 = c() == 1 ? true : 2;
            c0008i4.c();
            if (c0008i4.f77a.c() == 1) {
                AbstractActivityC0005f abstractActivityC0005f9 = c0008i4.f77a;
                abstractActivityC0005f9.getClass();
                C0014o c0014o = new C0014o(abstractActivityC0005f9, c0008i4.f77a.c() != 1);
                c0008i4.f77a.getClass();
                AbstractActivityC0005f abstractActivityC0005f10 = c0008i4.f77a;
                abstractActivityC0005f10.getClass();
                c0008i4.f79c = new y(abstractActivityC0005f10, c0014o);
            } else {
                AbstractActivityC0005f abstractActivityC0005f11 = c0008i4.f77a;
                abstractActivityC0005f11.getClass();
                C0016q c0016q = new C0016q(abstractActivityC0005f11);
                c0016q.setOpaque(c0008i4.f77a.c() == 1);
                c0008i4.f77a.getClass();
                AbstractActivityC0005f abstractActivityC0005f12 = c0008i4.f77a;
                abstractActivityC0005f12.getClass();
                c0008i4.f79c = new y(abstractActivityC0005f12, c0016q);
            }
            c0008i4.f79c.f127h.add(c0008i4.f88l);
            c0008i4.f77a.getClass();
            y yVar = c0008i4.f79c;
            E.c cVar5 = c0008i4.f78b;
            yVar.getClass();
            Objects.toString(cVar5);
            if (yVar.c()) {
                if (cVar5 != yVar.f129j) {
                    yVar.a();
                }
                c0008i4.f79c.setId(f68e);
                if (z2) {
                    y yVar2 = c0008i4.f79c;
                    if (c0008i4.f77a.c() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0008i4.f82f != null) {
                        yVar2.getViewTreeObserver().removeOnPreDrawListener(c0008i4.f82f);
                    }
                    c0008i4.f82f = new ViewTreeObserverOnPreDrawListenerC0007h(c0008i4, yVar2);
                    yVar2.getViewTreeObserver().addOnPreDrawListener(c0008i4.f82f);
                }
                setContentView(c0008i4.f79c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            yVar.f129j = cVar5;
            io.flutter.embedding.engine.renderer.h hVar3 = cVar5.f149b;
            yVar.f128i = hVar3.f572c;
            yVar.f125f.a(hVar3);
            C0006g c0006g = yVar.f143y;
            hVar3.a(c0006g);
            if (yVar.f121b) {
                hVar3.f570a.addResizingFlutterUiListener(yVar.f142x);
            }
            yVar.f131l = new B.a(yVar, yVar.f129j.f155h);
            E.c cVar6 = yVar.f129j;
            yVar.f132m = new io.flutter.plugin.editing.l(yVar, cVar6.f165r, cVar6.f160m, cVar6.f166s, cVar6.f167t);
            TextServicesManager textServicesManager = (TextServicesManager) yVar.getContext().getSystemService("textservices");
            yVar.f138s = textServicesManager;
            yVar.f133n = new io.flutter.plugin.editing.g(textServicesManager, yVar.f129j.f163p);
            new B.a(yVar, yVar.f132m.f624b, yVar.f129j.f160m);
            yVar.f134o = yVar.f129j.f152e;
            C.b bVar = new C.b();
            bVar.f14b = new HashSet();
            bVar.f15c = yVar;
            bVar.f13a = new J[]{new F(yVar.getBinaryMessenger()), new B.a(new M.c(yVar.getBinaryMessenger()))};
            new u(yVar.getBinaryMessenger()).f111c = bVar;
            yVar.f135p = bVar;
            yVar.f136q = new C0001b(yVar.f129j.f149b, false);
            io.flutter.view.h hVar4 = new io.flutter.view.h(yVar, cVar5.f153f, (AccessibilityManager) yVar.getContext().getSystemService("accessibility"), yVar.getContext().getContentResolver(), cVar5.u);
            yVar.f137r = hVar4;
            hVar4.f795r = yVar.f140v;
            boolean isEnabled = hVar4.f780c.isEnabled();
            boolean isTouchExplorationEnabled = yVar.f137r.f780c.isTouchExplorationEnabled();
            if (yVar.f129j.f149b.f570a.getIsSoftwareRenderingEnabled()) {
                yVar.setWillNotDraw(false);
            } else {
                yVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            E.c cVar7 = yVar.f129j;
            cVar7.f166s.f672i.f639a = yVar.f137r;
            new C0001b(cVar7.f149b, true);
            E.c cVar8 = yVar.f129j;
            cVar8.f167t.f657g.f639a = yVar.f137r;
            new C0001b(cVar8.f149b, true);
            yVar.f132m.f624b.restartInput(yVar);
            yVar.d();
            yVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, yVar.f141w);
            yVar.e();
            io.flutter.plugin.platform.k kVar2 = cVar5.f166s;
            kVar2.f667d = yVar;
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = kVar2.f678o;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                kVar2.f667d.addView((io.flutter.plugin.platform.h) sparseArray.valueAt(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                SparseArray sparseArray2 = kVar2.f676m;
                if (i4 >= sparseArray2.size()) {
                    SparseArray sparseArray3 = kVar2.f675l;
                    if (sparseArray3.size() > 0) {
                        sparseArray3.valueAt(0).getClass();
                        throw new ClassCastException();
                    }
                    io.flutter.plugin.platform.j jVar2 = cVar5.f167t;
                    jVar2.f654d = yVar;
                    int i5 = 0;
                    while (true) {
                        SparseArray sparseArray4 = jVar2.f659i;
                        if (i5 >= sparseArray4.size()) {
                            SparseArray sparseArray5 = jVar2.f658h;
                            if (sparseArray5.size() > 0) {
                                sparseArray5.valueAt(0).getClass();
                                throw new ClassCastException();
                            }
                            Iterator it2 = yVar.f130k.iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw new ClassCastException();
                            }
                            if (yVar.f128i) {
                                c0006g.a();
                            }
                        } else {
                            if (sparseArray4.valueAt(i5) != null) {
                                throw new ClassCastException();
                            }
                            jVar2.f654d.addView(null);
                            i5++;
                        }
                    }
                } else {
                    if (sparseArray2.valueAt(i4) != null) {
                        throw new ClassCastException();
                    }
                    kVar2.f667d.addView(null);
                    i4++;
                }
            }
            c0008i4.f79c.setId(f68e);
            if (z2) {
            }
            setContentView(c0008i4.f79c);
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
            this.f70b.e();
            this.f70b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f72d);
            this.f69a = false;
        }
        C0008i c0008i = this.f70b;
        if (c0008i != null) {
            c0008i.f77a = null;
            c0008i.f78b = null;
            c0008i.f79c = null;
            c0008i.f80d = null;
            c0008i.f81e = null;
            this.f70b = null;
        }
        this.f71c.a(androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            E.c cVar = c0008i.f78b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            E.e eVar = cVar.f151d;
            if (eVar.f()) {
                T.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = eVar.f182f.f174d.iterator();
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
            String d2 = c0008i.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            M.b bVar = c0008i.f78b.f156i;
            bVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d2);
            bVar.f266a.f("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            c0008i.f77a.getClass();
            E.c cVar = c0008i.f78b;
            if (cVar != null) {
                M.d dVar = cVar.f154g;
                dVar.a(3, dVar.f270c);
            }
        }
        this.f71c.a(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            if (c0008i.f78b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.f fVar = c0008i.f80d;
            if (fVar != null) {
                fVar.b();
            }
            Iterator it = c0008i.f78b.f166s.f673j.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.q) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            if (c0008i.f78b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            E.e eVar = c0008i.f78b.f151d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            T.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = eVar.f182f.f172b.iterator();
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
        this.f71c.a(androidx.lifecycle.d.ON_RESUME);
        if (k("onResume")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            c0008i.f78b.f149b.d();
            c0008i.f77a.getClass();
            E.c cVar = c0008i.f78b;
            if (cVar != null) {
                M.d dVar = cVar.f154g;
                dVar.a(2, dVar.f270c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            if (c0008i.f77a.j()) {
                bundle.putByteArray("framework", c0008i.f78b.f158k.f312b);
            }
            c0008i.f77a.getClass();
            Bundle bundle2 = new Bundle();
            E.e eVar = c0008i.f78b.f151d;
            if (eVar.f()) {
                T.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = eVar.f182f.f176f.iterator();
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
            if (c0008i.f77a.d() == null || c0008i.f77a.i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0008i.f77a.f69a);
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
        this.f71c.a(androidx.lifecycle.d.ON_START);
        if (k("onStart")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            if (c0008i.f77a.d() == null && !c0008i.f78b.f150c.f205g) {
                String f2 = c0008i.f77a.f();
                if (f2 == null) {
                    AbstractActivityC0005f abstractActivityC0005f = c0008i.f77a;
                    abstractActivityC0005f.getClass();
                    f2 = c0008i.d(abstractActivityC0005f.getIntent());
                    if (f2 == null) {
                        f2 = "/";
                    }
                }
                AbstractActivityC0005f abstractActivityC0005f2 = c0008i.f77a;
                abstractActivityC0005f2.getClass();
                try {
                    g2 = abstractActivityC0005f2.g();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (g2 != null) {
                    str = g2.getString("io.flutter.EntrypointUri");
                    c0008i.f77a.e();
                    c0008i.f78b.f156i.f266a.f("setInitialRoute", f2, null);
                    b2 = c0008i.f77a.b();
                    if (b2 != null || b2.isEmpty()) {
                        b2 = ((I.e) C.b.e().f13a).f262d.f251b;
                    }
                    c0008i.f78b.f150c.c(str != null ? new F.a(b2, c0008i.f77a.e()) : new F.a(b2, str, c0008i.f77a.e()), (List) c0008i.f77a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0008i.f77a.e();
                c0008i.f78b.f156i.f266a.f("setInitialRoute", f2, null);
                b2 = c0008i.f77a.b();
                if (b2 != null) {
                }
                b2 = ((I.e) C.b.e().f13a).f262d.f251b;
                c0008i.f78b.f150c.c(str != null ? new F.a(b2, c0008i.f77a.e()) : new F.a(b2, str, c0008i.f77a.e()), (List) c0008i.f77a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0008i.f87k;
            if (num != null) {
                c0008i.f79c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            c0008i.f77a.getClass();
            E.c cVar = c0008i.f78b;
            if (cVar != null) {
                M.d dVar = cVar.f154g;
                dVar.a(5, dVar.f270c);
            }
            c0008i.f87k = Integer.valueOf(c0008i.f79c.getVisibility());
            c0008i.f79c.setVisibility(8);
            E.c cVar2 = c0008i.f78b;
            if (cVar2 != null) {
                cVar2.f149b.b(40);
            }
        }
        this.f71c.a(androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (k("onTrimMemory")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            E.c cVar = c0008i.f78b;
            if (cVar != null) {
                if (c0008i.f85i && i2 >= 10) {
                    FlutterJNI flutterJNI = cVar.f150c.f200b;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    M.c cVar2 = c0008i.f78b.f164q;
                    cVar2.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    cVar2.f267a.g(hashMap, null);
                }
                c0008i.f78b.f149b.b(i2);
                io.flutter.plugin.platform.k kVar = c0008i.f78b.f166s;
                if (i2 < 40) {
                    kVar.getClass();
                    return;
                }
                Iterator it = kVar.f673j.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.q) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (k("onUserLeaveHint")) {
            C0008i c0008i = this.f70b;
            c0008i.c();
            E.c cVar = c0008i.f78b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            E.e eVar = cVar.f151d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            T.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = eVar.f182f.f175e.iterator();
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
            C0008i c0008i = this.f70b;
            c0008i.c();
            c0008i.f77a.getClass();
            E.c cVar = c0008i.f78b;
            if (cVar != null) {
                M.d dVar = cVar.f154g;
                if (z2) {
                    dVar.a(dVar.f268a, true);
                } else {
                    dVar.a(dVar.f268a, false);
                }
            }
        }
    }
}
