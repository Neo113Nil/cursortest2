package f0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import e0.h0;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: y, reason: collision with root package name */
    public static long f266y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f267z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f268a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f269b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.b f270c;

    /* renamed from: d, reason: collision with root package name */
    public final e f271d;

    /* renamed from: e, reason: collision with root package name */
    public final o0.b f272e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f273f;

    /* renamed from: g, reason: collision with root package name */
    public final m0.c f274g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.n f275h;

    /* renamed from: i, reason: collision with root package name */
    public final m0.a f276i;

    /* renamed from: j, reason: collision with root package name */
    public final m0.a f277j;

    /* renamed from: k, reason: collision with root package name */
    public final m0.l f278k;

    /* renamed from: l, reason: collision with root package name */
    public final c0.a f279l;
    public final androidx.lifecycle.n m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.n f280n;

    /* renamed from: o, reason: collision with root package name */
    public final m0.n f281o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.n f282p;

    /* renamed from: q, reason: collision with root package name */
    public final m0.b f283q;

    /* renamed from: r, reason: collision with root package name */
    public final c0.a f284r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f285s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.i f286t;
    public final c0.a u;

    /* renamed from: w, reason: collision with root package name */
    public final long f287w;
    public final HashSet v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final a f288x = new a(this);

    public c(Context context, FlutterJNI flutterJNI, io.flutter.plugin.platform.j jVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j2 = f266y;
        f266y = 1 + j2;
        this.f287w = j2;
        f267z.put(Long.valueOf(j2), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        c0.a y2 = c0.a.y();
        if (flutterJNI == null) {
            Object obj = y2.f67d;
            flutterJNI = new FlutterJNI();
        }
        this.f268a = flutterJNI;
        g0.b bVar = new g0.b(flutterJNI, assets, this.f287w);
        this.f270c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f337e);
        c0.a.y().getClass();
        this.f273f = new h0(bVar, flutterJNI);
        new c0.b(bVar);
        this.f274g = new m0.c(bVar);
        c0.a aVar = new c0.a(bVar, 7);
        this.f275h = new androidx.lifecycle.n(bVar, 14);
        this.f276i = new m0.a(bVar, 1);
        this.f277j = new m0.a(bVar, 0);
        this.f279l = new c0.a(bVar, 8);
        c0.a aVar2 = new c0.a(bVar, context.getPackageManager());
        this.f278k = new m0.l(bVar, z3);
        this.m = new androidx.lifecycle.n(bVar, 23);
        this.f280n = new androidx.lifecycle.n(bVar, 25);
        m0.n nVar = new m0.n(bVar);
        this.f281o = nVar;
        this.f282p = new androidx.lifecycle.n(bVar, 27);
        this.f283q = new m0.b(bVar);
        this.f284r = new c0.a(bVar, 11);
        o0.b bVar2 = new o0.b(context, aVar);
        this.f272e = bVar2;
        j0.d dVar = (j0.d) y2.f66c;
        if (!flutterJNI.isAttached()) {
            dVar.d(context.getApplicationContext());
            dVar.a(context, null);
        }
        io.flutter.plugin.platform.i iVar = new io.flutter.plugin.platform.i();
        iVar.f500b = jVar.f513b;
        iVar.f503e = flutterJNI;
        jVar.f516e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f288x);
        flutterJNI.setPlatformViewsController(jVar);
        flutterJNI.setPlatformViewsController2(iVar);
        flutterJNI.setLocalizationPlugin(bVar2);
        y2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(nVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f269b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f285s = jVar;
        this.f286t = iVar;
        c0.a aVar3 = new c0.a(5, false);
        aVar3.f66c = jVar;
        aVar3.f67d = iVar;
        this.u = aVar3;
        context.getApplicationContext();
        e eVar = new e(this, dVar);
        this.f271d = eVar;
        bVar2.b(context.getResources().getConfiguration());
        if (z2 && dVar.f657e.f648e) {
            a.a.w(this);
        }
        a.a.c(context, this);
        q0.a aVar4 = new q0.a(aVar2);
        HashMap hashMap = eVar.f295a;
        s0.a.b("FlutterEngineConnectionRegistry#add ".concat(q0.a.class.getSimpleName()));
        try {
            if (hashMap.containsKey(q0.a.class)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar4 + ") but it was already registered with this FlutterEngine (" + eVar.f296b + ").");
            } else {
                hashMap.put(q0.a.class, aVar4);
                eVar.f298d.put(q0.a.class, aVar4);
                if (eVar.e()) {
                    d dVar2 = eVar.f300f;
                    aVar4.f1086b = dVar2;
                    dVar2.f291c.add(aVar4);
                }
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
    }
}
