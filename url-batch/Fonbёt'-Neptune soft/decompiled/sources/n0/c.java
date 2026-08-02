package n0;

import B0.C0031i;
import P.O;
import a.AbstractC0132a;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.o;
import java.util.HashSet;
import m0.AbstractActivityC0264d;
import q0.C0287d;
import u0.AbstractC0310a;
import v0.C0311a;
import v0.C0312b;
import v0.C0313c;
import x0.C0332a;
import z0.C0335a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f3263a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.l f3264b;

    /* renamed from: c, reason: collision with root package name */
    public final o0.b f3265c;

    /* renamed from: d, reason: collision with root package name */
    public final e f3266d;

    /* renamed from: e, reason: collision with root package name */
    public final C0332a f3267e;

    /* renamed from: f, reason: collision with root package name */
    public final C0031i f3268f;

    /* renamed from: g, reason: collision with root package name */
    public final C0313c f3269g;

    /* renamed from: h, reason: collision with root package name */
    public final d f3270h;

    /* renamed from: i, reason: collision with root package name */
    public final C0311a f3271i;

    /* renamed from: j, reason: collision with root package name */
    public final C0311a f3272j;

    /* renamed from: k, reason: collision with root package name */
    public final v0.j f3273k;

    /* renamed from: l, reason: collision with root package name */
    public final O f3274l;

    /* renamed from: m, reason: collision with root package name */
    public final d f3275m;

    /* renamed from: n, reason: collision with root package name */
    public final v0.l f3276n;

    /* renamed from: o, reason: collision with root package name */
    public final d f3277o;

    /* renamed from: p, reason: collision with root package name */
    public final C0312b f3278p;

    /* renamed from: q, reason: collision with root package name */
    public final O f3279q;

    /* renamed from: r, reason: collision with root package name */
    public final o f3280r;

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f3281s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final a f3282t = new a(this);

    public c(AbstractActivityC0264d abstractActivityC0264d, FlutterJNI flutterJNI, o oVar, boolean z2, boolean z3) {
        AssetManager assets;
        try {
            assets = abstractActivityC0264d.createPackageContext(abstractActivityC0264d.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0264d.getAssets();
        }
        C0031i G2 = C0031i.G();
        if (flutterJNI == null) {
            Object obj = G2.f155g;
            flutterJNI = new FlutterJNI();
        }
        this.f3263a = flutterJNI;
        o0.b bVar = new o0.b(flutterJNI, assets);
        this.f3265c = bVar;
        flutterJNI.setPlatformMessageHandler((o0.j) bVar.f3331h);
        C0031i.G().getClass();
        this.f3268f = new C0031i(bVar, flutterJNI);
        new t.k(bVar);
        this.f3269g = new C0313c(bVar);
        O o2 = new O(bVar, 15);
        this.f3270h = new d(bVar, 10);
        this.f3271i = new C0311a(bVar, 1);
        this.f3272j = new C0311a(bVar, 0);
        this.f3274l = new O(bVar, 16);
        O o3 = new O(bVar, abstractActivityC0264d.getPackageManager());
        this.f3273k = new v0.j(bVar, z3);
        this.f3275m = new d(bVar, 16);
        this.f3276n = new v0.l(bVar);
        this.f3277o = new d(bVar, 18);
        this.f3278p = new C0312b(bVar);
        this.f3279q = new O(bVar, 20);
        C0332a c0332a = new C0332a(abstractActivityC0264d, o2);
        this.f3267e = c0332a;
        C0287d c0287d = (C0287d) G2.f154f;
        if (!flutterJNI.isAttached()) {
            c0287d.b(abstractActivityC0264d.getApplicationContext());
            c0287d.a(abstractActivityC0264d, null);
        }
        flutterJNI.addEngineLifecycleListener(this.f3282t);
        flutterJNI.setPlatformViewsController(oVar);
        flutterJNI.setLocalizationPlugin(c0332a);
        G2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f3264b = new io.flutter.embedding.engine.renderer.l(flutterJNI);
        this.f3280r = oVar;
        e eVar = new e(abstractActivityC0264d.getApplicationContext(), this, c0287d);
        this.f3266d = eVar;
        c0332a.b(abstractActivityC0264d.getResources().getConfiguration());
        if (z2 && c0287d.f3382d.f3328e) {
            AbstractC0310a.f(this);
        }
        AbstractC0132a.e(abstractActivityC0264d, this);
        eVar.a(new C0335a(o3));
    }
}
