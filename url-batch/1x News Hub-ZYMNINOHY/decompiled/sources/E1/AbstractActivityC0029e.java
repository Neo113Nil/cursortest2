package E1;

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
import androidx.lifecycle.EnumC0165g;
import b0.C0178i;
import f0.C0322a;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import w0.AbstractC1234c;

/* renamed from: E1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0029e extends Activity implements androidx.lifecycle.m {

    /* renamed from: e, reason: collision with root package name */
    public static final int f337e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f338a = false;

    /* renamed from: b, reason: collision with root package name */
    public C0032h f339b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.o f340c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f341d;

    public AbstractActivityC0029e() {
        int i3 = Build.VERSION.SDK_INT;
        this.f341d = i3 < 33 ? null : i3 >= 34 ? new C0028d(this) : new C0027c(0, this);
        this.f340c = new androidx.lifecycle.o(this);
    }

    public final String c() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int d() {
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

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.o e() {
        return this.f340c;
    }

    public final String f() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String g() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle i3 = i();
            String string = i3 != null ? i3.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String h() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle i3 = i();
            if (i3 != null) {
                return i3.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle i() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void j(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z && !this.f338a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f341d);
                this.f338a = true;
                return;
            }
            return;
        }
        if (z || !this.f338a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f341d);
        this.f338a = false;
    }

    public final boolean k() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (f() != null || this.f339b.f351g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean l() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : f() == null;
    }

    public final boolean m(String str) {
        C0032h c0032h = this.f339b;
        if (c0032h == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0032h.f354j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (m("onActivityResult")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            if (c0032h.f347b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            F1.d dVar = c0032h.f347b.f9102d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            Z1.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                F1.c cVar = (F1.c) dVar.f497h;
                cVar.getClass();
                Iterator it = new HashSet((HashSet) cVar.f488c).iterator();
                while (true) {
                    boolean z = false;
                    while (it.hasNext()) {
                        if (((P1.q) it.next()).a(i3, i4, intent) || z) {
                            z = true;
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
        if (m("onBackPressed")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine != null) {
                ((P1.o) flutterEngine.f9106i.f2532b).a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:138|139|(1:141)|142|143|(1:145)|146|(1:148)(1:268)|149|(2:151|(1:153)(2:154|(1:156)(1:157)))|158|(4:160|161|162|(1:164)(2:253|(1:255)(2:256|257)))(1:267)|165|(1:167)|168|(1:170)|(1:172)(1:252)|173|(3:175|(1:177)(1:246)|178)(3:247|(1:249)(1:251)|250)|179|(8:181|(1:183)|184|(2:186|(3:188|(1:190)|191)(2:192|193))|194|(1:196)|197|198)|199|(1:201)|202|203|204|205|(2:(1:242)(1:209)|210)(1:243)|211|(2:212|(1:214)(1:215))|216|(2:217|(1:219)(1:220))|221|(2:222|(1:224)(1:225))|226|(2:227|(1:229)(1:230))|(2:231|(1:233)(1:234))|235|(8:237|(1:239)|184|(0)|194|(0)|197|198)(2:240|241)) */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04df, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0677  */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i3;
        try {
            Bundle i4 = i();
            if (i4 != null && (i3 = i4.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i3);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            j(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0032h c0032h = new C0032h(this);
        this.f339b = c0032h;
        c0032h.c();
        int i5 = 0;
        if (c0032h.f347b == null) {
            String f = c0032h.f346a.f();
            if (f != null) {
                if (F1.j.f523c == null) {
                    F1.j.f523c = new F1.j(1);
                }
                FlutterEngine flutterEngine = (FlutterEngine) F1.j.f523c.f524a.get(f);
                c0032h.f347b = flutterEngine;
                c0032h.f351g = true;
                if (flutterEngine == null) {
                    throw new IllegalStateException(AbstractC1234c.a("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", f, "'"));
                }
            } else {
                c0032h.f346a.getClass();
                c0032h.f347b = null;
                String stringExtra = c0032h.f346a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (F1.j.f522b == null) {
                        synchronized (F1.j.class) {
                            try {
                                if (F1.j.f522b == null) {
                                    F1.j.f522b = new F1.j(0);
                                }
                            } finally {
                            }
                        }
                    }
                    F1.i iVar = (F1.i) F1.j.f522b.f524a.get(stringExtra);
                    if (iVar == null) {
                        throw new IllegalStateException(AbstractC1234c.a("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", stringExtra, "'"));
                    }
                    AbstractActivityC0029e abstractActivityC0029e = c0032h.f346a;
                    abstractActivityC0029e.getClass();
                    F1.h hVar = new F1.h(abstractActivityC0029e);
                    c0032h.a(hVar);
                    c0032h.f347b = iVar.a(hVar);
                    c0032h.f351g = false;
                } else {
                    AbstractActivityC0029e abstractActivityC0029e2 = c0032h.f346a;
                    abstractActivityC0029e2.getClass();
                    Intent intent = abstractActivityC0029e2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            F1.e a3 = F1.f.a(str);
                            if (a3 == null) {
                                a3 = F1.f.a("--".concat(str));
                            }
                            if (a3 == null) {
                                a3 = F1.f.a("--" + str + "=");
                            }
                            if (a3 != null) {
                                break;
                            }
                        }
                    }
                    AbstractActivityC0029e abstractActivityC0029e3 = c0032h.f346a;
                    abstractActivityC0029e3.getClass();
                    Intent intent2 = c0032h.f346a.getIntent();
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
                    F1.i iVar2 = new F1.i(abstractActivityC0029e3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0029e abstractActivityC0029e4 = c0032h.f346a;
                    abstractActivityC0029e4.getClass();
                    F1.h hVar2 = new F1.h(abstractActivityC0029e4);
                    hVar2.f520e = false;
                    hVar2.f = c0032h.f346a.l();
                    c0032h.a(hVar2);
                    c0032h.f347b = iVar2.a(hVar2);
                    c0032h.f351g = false;
                }
            }
        }
        c0032h.f346a.getClass();
        F1.d dVar = c0032h.f347b.f9102d;
        androidx.lifecycle.o oVar = c0032h.f346a.f340c;
        dVar.getClass();
        Z1.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0032h c0032h2 = (C0032h) dVar.f496g;
            if (c0032h2 != null) {
                c0032h2.b();
            }
            dVar.e();
            dVar.f496g = c0032h;
            AbstractActivityC0029e abstractActivityC0029e5 = c0032h.f346a;
            abstractActivityC0029e5.getClass();
            dVar.b(abstractActivityC0029e5, oVar);
            Trace.endSection();
            AbstractActivityC0029e abstractActivityC0029e6 = c0032h.f346a;
            abstractActivityC0029e6.getClass();
            AbstractActivityC0029e abstractActivityC0029e7 = c0032h.f346a;
            FlutterEngine flutterEngine2 = c0032h.f347b;
            abstractActivityC0029e7.getClass();
            c0032h.f349d = new io.flutter.plugin.platform.f(abstractActivityC0029e7, flutterEngine2.f9109l, abstractActivityC0029e7);
            AbstractActivityC0029e abstractActivityC0029e8 = c0032h.f346a;
            FlutterEngine flutterEngine3 = c0032h.f347b;
            abstractActivityC0029e8.getClass();
            C0.e eVar = flutterEngine3.f9111n;
            int i6 = f337e;
            T1.a aVar = new T1.a();
            aVar.f1344b = abstractActivityC0029e6;
            aVar.f1343a = i6;
            aVar.f1345c = eVar;
            eVar.f201b = aVar;
            c0032h.f350e = aVar;
            AbstractActivityC0029e abstractActivityC0029e9 = c0032h.f346a;
            FlutterEngine flutterEngine4 = c0032h.f347b;
            if (!abstractActivityC0029e9.f339b.f351g) {
                S0.a.A(flutterEngine4);
            }
            c0032h.f354j = true;
            C0032h c0032h3 = this.f339b;
            c0032h3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0032h3.f346a.l()) {
                O1.k kVar = c0032h3.f347b.f9108k;
                kVar.f1181b = true;
                O1.j jVar = (O1.j) kVar.f;
                if (jVar != null) {
                    jVar.success(O1.k.b(bArr));
                    kVar.f = null;
                    kVar.f1183d = bArr;
                } else if (kVar.f1182c) {
                    ((P1.o) kVar.f1184e).a("push", O1.k.b(bArr), new O1.j(kVar, 0, bArr));
                } else {
                    kVar.f1183d = bArr;
                }
            }
            c0032h3.f346a.getClass();
            F1.d dVar2 = c0032h3.f347b.f9102d;
            if (dVar2.f()) {
                Z1.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((F1.c) dVar2.f497h).f).iterator();
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
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f340c.e(EnumC0165g.ON_CREATE);
            if (d() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0032h c0032h4 = this.f339b;
            boolean z = (d() == 1 ? (char) 1 : (char) 2) == 1;
            c0032h4.c();
            if (c0032h4.f346a.d() == 1) {
                AbstractActivityC0029e abstractActivityC0029e10 = c0032h4.f346a;
                abstractActivityC0029e10.getClass();
                C0036l c0036l = new C0036l(abstractActivityC0029e10, c0032h4.f346a.d() != 1);
                c0032h4.f346a.getClass();
                AbstractActivityC0029e abstractActivityC0029e11 = c0032h4.f346a;
                abstractActivityC0029e11.getClass();
                c0032h4.f348c = new t(abstractActivityC0029e11, c0036l);
            } else {
                AbstractActivityC0029e abstractActivityC0029e12 = c0032h4.f346a;
                abstractActivityC0029e12.getClass();
                n nVar = new n(abstractActivityC0029e12);
                nVar.setOpaque(c0032h4.f346a.d() == 1);
                c0032h4.f346a.getClass();
                AbstractActivityC0029e abstractActivityC0029e13 = c0032h4.f346a;
                abstractActivityC0029e13.getClass();
                c0032h4.f348c = new t(abstractActivityC0029e13, nVar);
            }
            c0032h4.f348c.f390g.add(c0032h4.f356l);
            c0032h4.f346a.getClass();
            t tVar = c0032h4.f348c;
            FlutterEngine flutterEngine5 = c0032h4.f347b;
            tVar.getClass();
            Objects.toString(flutterEngine5);
            if (tVar.c()) {
                if (flutterEngine5 != tVar.f392i) {
                    tVar.a();
                }
                c0032h4.f348c.setId(f337e);
                if (z) {
                    t tVar2 = c0032h4.f348c;
                    if (c0032h4.f346a.d() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0032h4.f != null) {
                        tVar2.getViewTreeObserver().removeOnPreDrawListener(c0032h4.f);
                    }
                    c0032h4.f = new ViewTreeObserverOnPreDrawListenerC0031g(c0032h4, tVar2);
                    tVar2.getViewTreeObserver().addOnPreDrawListener(c0032h4.f);
                }
                setContentView(c0032h4.f348c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            tVar.f392i = flutterEngine5;
            io.flutter.embedding.engine.renderer.j jVar2 = flutterEngine5.f9100b;
            tVar.f391h = jVar2.f9165d;
            tVar.f389e.d(jVar2);
            C0030f c0030f = tVar.f405x;
            jVar2.a(c0030f);
            if (tVar.f385a) {
                jVar2.f9162a.addResizingFlutterUiListener(tVar.f404w);
            }
            tVar.f394k = new V0.e(tVar, tVar.f392i.f9105h);
            FlutterEngine flutterEngine6 = tVar.f392i;
            tVar.f395l = new io.flutter.plugin.editing.k(tVar, flutterEngine6.f9114r, flutterEngine6.f9110m, flutterEngine6.f9115s, flutterEngine6.f9116t);
            TextServicesManager textServicesManager = (TextServicesManager) tVar.getContext().getSystemService("textservices");
            tVar.f400r = textServicesManager;
            tVar.f396m = new io.flutter.plugin.editing.h(textServicesManager, tVar.f392i.f9112p);
            new C0322a(tVar, tVar.f395l.f9214b, tVar.f392i.f9110m);
            tVar.f397n = tVar.f392i.f9103e;
            tVar.o = new A0.f(tVar);
            tVar.f398p = new C0025a(tVar.f392i.f9100b, false);
            io.flutter.view.i iVar3 = new io.flutter.view.i(tVar, flutterEngine5.f, (AccessibilityManager) tVar.getContext().getSystemService("accessibility"), tVar.getContext().getContentResolver(), flutterEngine5.f9117u);
            tVar.f399q = iVar3;
            iVar3.f9438s = tVar.f403u;
            boolean isEnabled = iVar3.f9424c.isEnabled();
            boolean isTouchExplorationEnabled = tVar.f399q.f9424c.isTouchExplorationEnabled();
            if (tVar.f392i.f9100b.f9162a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
            } else {
                tVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            FlutterEngine flutterEngine7 = tVar.f392i;
            io.flutter.plugin.platform.r rVar = flutterEngine7.f9115s;
            rVar.f9302i.f9244a = tVar.f399q;
            rVar.f9296b = new C0025a(flutterEngine7.f9100b, true);
            FlutterEngine flutterEngine8 = tVar.f392i;
            io.flutter.plugin.platform.q qVar = flutterEngine8.f9116t;
            qVar.f9285h.f9244a = tVar.f399q;
            qVar.f9280b = new C0025a(flutterEngine8.f9100b, true);
            tVar.f395l.f9214b.restartInput(tVar);
            tVar.d();
            tVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, tVar.v);
            tVar.e();
            io.flutter.plugin.platform.r rVar2 = flutterEngine5.f9115s;
            rVar2.f9298d = tVar;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = rVar2.o;
                if (i7 >= sparseArray.size()) {
                    break;
                }
                rVar2.f9298d.addView((io.flutter.plugin.platform.j) sparseArray.valueAt(i7));
                i7++;
            }
            int i8 = 0;
            while (true) {
                SparseArray sparseArray2 = rVar2.f9306m;
                if (i8 >= sparseArray2.size()) {
                    break;
                }
                rVar2.f9298d.addView((K1.b) sparseArray2.valueAt(i8));
                i8++;
            }
            int i9 = 0;
            while (true) {
                SparseArray sparseArray3 = rVar2.f9305l;
                if (i9 >= sparseArray3.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray3.valueAt(i9)).onFlutterViewAttached(rVar2.f9298d);
                i9++;
            }
            io.flutter.plugin.platform.q qVar2 = flutterEngine5.f9116t;
            qVar2.f9282d = tVar;
            int i10 = 0;
            while (true) {
                SparseArray sparseArray4 = qVar2.f9287j;
                if (i10 >= sparseArray4.size()) {
                    break;
                }
                qVar2.f9282d.addView((K1.b) sparseArray4.valueAt(i10));
                i10++;
            }
            while (true) {
                SparseArray sparseArray5 = qVar2.f9286i;
                if (i5 >= sparseArray5.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray5.valueAt(i5)).onFlutterViewAttached(qVar2.f9282d);
                i5++;
            }
            Iterator it2 = tVar.f393j.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            if (tVar.f391h) {
                c0030f.b();
            }
            c0032h4.f348c.setId(f337e);
            if (z) {
            }
            setContentView(c0032h4.f348c);
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 35) {
            }
            window2.getDecorView().setSystemUiVisibility(1280);
        } catch (Throwable th3) {
            try {
                Trace.endSection();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (m("onDestroy")) {
            this.f339b.e();
            this.f339b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f341d);
            this.f338a = false;
        }
        C0032h c0032h = this.f339b;
        if (c0032h != null) {
            c0032h.f346a = null;
            c0032h.f347b = null;
            c0032h.f348c = null;
            c0032h.f349d = null;
            c0032h.f350e = null;
            this.f339b = null;
        }
        this.f340c.e(EnumC0165g.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m("onNewIntent")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            F1.d dVar = flutterEngine.f9102d;
            if (dVar.f()) {
                Z1.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((F1.c) dVar.f497h).f489d).iterator();
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
            String d3 = c0032h.d(intent);
            if (d3 == null || d3.isEmpty()) {
                return;
            }
            C0178i c0178i = c0032h.f347b.f9106i;
            c0178i.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d3);
            ((P1.o) c0178i.f2532b).a("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (m("onPause")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            c0032h.f346a.getClass();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine != null) {
                O1.a aVar = flutterEngine.f9104g;
                aVar.a(3, aVar.f1137c);
            }
        }
        this.f340c.e(EnumC0165g.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (m("onPostResume")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            if (c0032h.f347b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.f fVar = c0032h.f349d;
            if (fVar != null) {
                fVar.b();
            }
            c0032h.f347b.f9115s.k();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (m("onRequestPermissionsResult")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            if (c0032h.f347b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            F1.d dVar = c0032h.f347b.f9102d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            Z1.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((F1.c) dVar.f497h).f487b).iterator();
                while (true) {
                    boolean z = false;
                    while (it.hasNext()) {
                        if (((P1.r) it.next()).b(i3, strArr, iArr) || z) {
                            z = true;
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
    public final void onResume() {
        super.onResume();
        this.f340c.e(EnumC0165g.ON_RESUME);
        if (m("onResume")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            c0032h.f347b.f9100b.i();
            c0032h.f346a.getClass();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine != null) {
                O1.a aVar = flutterEngine.f9104g;
                aVar.a(2, aVar.f1137c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m("onSaveInstanceState")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            if (c0032h.f346a.l()) {
                bundle.putByteArray("framework", (byte[]) c0032h.f347b.f9108k.f1183d);
            }
            c0032h.f346a.getClass();
            Bundle bundle2 = new Bundle();
            F1.d dVar = c0032h.f347b.f9102d;
            if (dVar.f()) {
                Z1.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((F1.c) dVar.f497h).f).iterator();
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
            if (c0032h.f346a.f() == null || c0032h.f346a.k()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0032h.f346a.f338a);
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
        String c3;
        Bundle i3;
        super.onStart();
        this.f340c.e(EnumC0165g.ON_START);
        if (m("onStart")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            if (c0032h.f346a.f() == null && !c0032h.f347b.f9101c.f) {
                String h3 = c0032h.f346a.h();
                if (h3 == null) {
                    AbstractActivityC0029e abstractActivityC0029e = c0032h.f346a;
                    abstractActivityC0029e.getClass();
                    h3 = c0032h.d(abstractActivityC0029e.getIntent());
                    if (h3 == null) {
                        h3 = "/";
                    }
                }
                AbstractActivityC0029e abstractActivityC0029e2 = c0032h.f346a;
                abstractActivityC0029e2.getClass();
                try {
                    i3 = abstractActivityC0029e2.i();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (i3 != null) {
                    str = i3.getString("io.flutter.EntrypointUri");
                    c0032h.f346a.g();
                    ((P1.o) c0032h.f347b.f9106i.f2532b).a("setInitialRoute", h3, null);
                    c3 = c0032h.f346a.c();
                    if (c3 != null || c3.isEmpty()) {
                        c3 = ((J1.d) A0.f.H().f23b).f643e.f630b;
                    }
                    c0032h.f347b.f9101c.a(str != null ? new G1.a(c3, c0032h.f346a.g()) : new G1.a(c3, str, c0032h.f346a.g()), (List) c0032h.f346a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0032h.f346a.g();
                ((P1.o) c0032h.f347b.f9106i.f2532b).a("setInitialRoute", h3, null);
                c3 = c0032h.f346a.c();
                if (c3 != null) {
                }
                c3 = ((J1.d) A0.f.H().f23b).f643e.f630b;
                c0032h.f347b.f9101c.a(str != null ? new G1.a(c3, c0032h.f346a.g()) : new G1.a(c3, str, c0032h.f346a.g()), (List) c0032h.f346a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0032h.f355k;
            if (num != null) {
                c0032h.f348c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (m("onStop")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            c0032h.f346a.getClass();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine != null) {
                O1.a aVar = flutterEngine.f9104g;
                aVar.a(5, aVar.f1137c);
            }
            c0032h.f355k = Integer.valueOf(c0032h.f348c.getVisibility());
            c0032h.f348c.setVisibility(8);
            FlutterEngine flutterEngine2 = c0032h.f347b;
            if (flutterEngine2 != null) {
                flutterEngine2.f9100b.f(40);
            }
        }
        this.f340c.e(EnumC0165g.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (m("onTrimMemory")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine != null) {
                if (c0032h.f353i && i3 >= 10) {
                    FlutterJNI flutterJNI = flutterEngine.f9101c.f534a;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0178i c0178i = c0032h.f347b.f9113q;
                    c0178i.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    ((B0.p) c0178i.f2532b).h(hashMap, null);
                }
                c0032h.f347b.f9100b.f(i3);
                io.flutter.plugin.platform.r rVar = c0032h.f347b.f9115s;
                if (i3 < 40) {
                    rVar.getClass();
                    return;
                }
                Iterator it = rVar.f9303j.values().iterator();
                while (it.hasNext()) {
                    ((io.flutter.plugin.platform.D) it.next()).f9241h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (m("onUserLeaveHint")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            F1.d dVar = flutterEngine.f9102d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            Z1.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((F1.c) dVar.f497h).f490e).iterator();
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
        if (m("onWindowFocusChanged")) {
            C0032h c0032h = this.f339b;
            c0032h.c();
            c0032h.f346a.getClass();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine != null) {
                O1.a aVar = flutterEngine.f9104g;
                if (z) {
                    aVar.a(aVar.f1135a, true);
                } else {
                    aVar.a(aVar.f1135a, false);
                }
            }
        }
    }
}
