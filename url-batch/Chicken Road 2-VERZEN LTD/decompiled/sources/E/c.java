package E;

import D.AbstractActivityC0005f;
import D.u;
import M.n;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements T.b {

    /* renamed from: y, reason: collision with root package name */
    public static long f146y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f147z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f148a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f149b;

    /* renamed from: c, reason: collision with root package name */
    public final F.b f150c;

    /* renamed from: d, reason: collision with root package name */
    public final e f151d;

    /* renamed from: e, reason: collision with root package name */
    public final O.a f152e;

    /* renamed from: f, reason: collision with root package name */
    public final C.b f153f;

    /* renamed from: g, reason: collision with root package name */
    public final M.d f154g;

    /* renamed from: h, reason: collision with root package name */
    public final u f155h;

    /* renamed from: i, reason: collision with root package name */
    public final M.b f156i;

    /* renamed from: j, reason: collision with root package name */
    public final M.b f157j;

    /* renamed from: k, reason: collision with root package name */
    public final M.l f158k;

    /* renamed from: l, reason: collision with root package name */
    public final B.a f159l;

    /* renamed from: m, reason: collision with root package name */
    public final u f160m;

    /* renamed from: n, reason: collision with root package name */
    public final u f161n;

    /* renamed from: o, reason: collision with root package name */
    public final n f162o;

    /* renamed from: p, reason: collision with root package name */
    public final u f163p;

    /* renamed from: q, reason: collision with root package name */
    public final M.c f164q;

    /* renamed from: r, reason: collision with root package name */
    public final B.a f165r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f166s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f167t;
    public final B.a u;

    /* renamed from: w, reason: collision with root package name */
    public final long f169w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f168v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final a f170x = new a(this);

    public c(AbstractActivityC0005f abstractActivityC0005f, FlutterJNI flutterJNI, io.flutter.plugin.platform.k kVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j2 = f146y;
        f146y = 1 + j2;
        this.f169w = j2;
        f147z.put(Long.valueOf(j2), this);
        try {
            assets = abstractActivityC0005f.createPackageContext(abstractActivityC0005f.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0005f.getAssets();
        }
        C.b e2 = C.b.e();
        if (flutterJNI == null) {
            ((B.b) e2.f14b).getClass();
            flutterJNI = new FlutterJNI();
        }
        this.f148a = flutterJNI;
        F.b bVar = new F.b(flutterJNI, assets, this.f169w);
        this.f150c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f203e);
        C.b.e().getClass();
        C.b bVar2 = new C.b();
        u uVar = new u(6, bVar2);
        B.e eVar = new B.e(bVar, "flutter/accessibility", N.m.f350a, null);
        bVar2.f13a = eVar;
        eVar.h(uVar);
        bVar2.f14b = flutterJNI;
        this.f153f = bVar2;
        new B.b(bVar);
        this.f154g = new M.d(bVar);
        B.a aVar = new B.a(bVar, 5);
        this.f155h = new u(bVar, 11);
        this.f156i = new M.b(bVar, 1);
        this.f157j = new M.b(bVar, 0);
        this.f159l = new B.a(bVar, 6);
        B.a aVar2 = new B.a(bVar, abstractActivityC0005f.getPackageManager());
        this.f158k = new M.l(bVar, z3);
        this.f160m = new u(bVar, 20);
        this.f161n = new u(bVar, 22);
        n nVar = new n(bVar);
        this.f162o = nVar;
        this.f163p = new u(bVar, 24);
        this.f164q = new M.c(bVar);
        this.f165r = new B.a(bVar, 9);
        O.a aVar3 = new O.a(abstractActivityC0005f, aVar);
        this.f152e = aVar3;
        I.e eVar2 = (I.e) e2.f13a;
        if (!flutterJNI.isAttached()) {
            eVar2.c(abstractActivityC0005f.getApplicationContext());
            eVar2.a(abstractActivityC0005f, null);
        }
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        jVar.f652b = kVar.f665b;
        jVar.f655e = flutterJNI;
        kVar.f668e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f170x);
        flutterJNI.setPlatformViewsController(kVar);
        flutterJNI.setPlatformViewsController2(jVar);
        flutterJNI.setLocalizationPlugin(aVar3);
        e2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(nVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f149b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f166s = kVar;
        this.f167t = jVar;
        B.a aVar4 = new B.a(16, false);
        aVar4.f3c = kVar;
        aVar4.f4d = jVar;
        this.u = aVar4;
        e eVar3 = new e(abstractActivityC0005f.getApplicationContext(), this);
        this.f151d = eVar3;
        aVar3.b(abstractActivityC0005f.getResources().getConfiguration());
        if (z2 && eVar2.f262d.f254e) {
            a.a.x(this);
        }
        a.a.c(abstractActivityC0005f, this);
        eVar3.a(new Q.a(aVar2));
    }
}
