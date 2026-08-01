package F;

import E.AbstractActivityC0004e;
import a.AbstractC0016a;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements T.b {

    /* renamed from: y, reason: collision with root package name */
    public static long f222y = 1;
    public static final HashMap z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f223a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f224b;

    /* renamed from: c, reason: collision with root package name */
    public final G.b f225c;

    /* renamed from: d, reason: collision with root package name */
    public final e f226d;

    /* renamed from: e, reason: collision with root package name */
    public final O.a f227e;

    /* renamed from: f, reason: collision with root package name */
    public final D.b f228f;

    /* renamed from: g, reason: collision with root package name */
    public final M.d f229g;

    /* renamed from: h, reason: collision with root package name */
    public final B.k f230h;

    /* renamed from: i, reason: collision with root package name */
    public final M.b f231i;

    /* renamed from: j, reason: collision with root package name */
    public final M.b f232j;

    /* renamed from: k, reason: collision with root package name */
    public final M.k f233k;

    /* renamed from: l, reason: collision with root package name */
    public final A.a f234l;

    /* renamed from: m, reason: collision with root package name */
    public final B.k f235m;

    /* renamed from: n, reason: collision with root package name */
    public final B.k f236n;

    /* renamed from: o, reason: collision with root package name */
    public final M.m f237o;

    /* renamed from: p, reason: collision with root package name */
    public final B.k f238p;

    /* renamed from: q, reason: collision with root package name */
    public final M.c f239q;

    /* renamed from: r, reason: collision with root package name */
    public final A.a f240r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f241s;
    public final io.flutter.plugin.platform.i t;

    /* renamed from: u, reason: collision with root package name */
    public final A.a f242u;

    /* renamed from: w, reason: collision with root package name */
    public final long f244w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f243v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final a f245x = new a(this);

    public c(AbstractActivityC0004e abstractActivityC0004e, FlutterJNI flutterJNI, io.flutter.plugin.platform.j jVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j2 = f222y;
        f222y = 1 + j2;
        this.f244w = j2;
        z.put(Long.valueOf(j2), this);
        try {
            assets = abstractActivityC0004e.createPackageContext(abstractActivityC0004e.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0004e.getAssets();
        }
        D.b e2 = D.b.e();
        if (flutterJNI == null) {
            ((A.b) e2.f100b).getClass();
            flutterJNI = new FlutterJNI();
        }
        this.f223a = flutterJNI;
        G.b bVar = new G.b(flutterJNI, assets, this.f244w);
        this.f225c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f278e);
        D.b.e().getClass();
        D.b bVar2 = new D.b();
        B.k kVar = new B.k(7, bVar2);
        A.e eVar = new A.e(bVar, "flutter/accessibility", N.m.f408a, null);
        bVar2.f99a = eVar;
        eVar.k(kVar);
        bVar2.f100b = flutterJNI;
        this.f228f = bVar2;
        new A.b(bVar);
        this.f229g = new M.d(bVar);
        A.a aVar = new A.a(bVar, 5);
        this.f230h = new B.k(bVar, 12);
        this.f231i = new M.b(bVar, 1);
        this.f232j = new M.b(bVar, 0);
        this.f234l = new A.a(bVar, 6);
        A.a aVar2 = new A.a(bVar, abstractActivityC0004e.getPackageManager());
        this.f233k = new M.k(bVar, z3);
        this.f235m = new B.k(bVar, 21);
        this.f236n = new B.k(bVar, 23);
        this.f237o = new M.m(bVar);
        this.f238p = new B.k(bVar, 25);
        this.f239q = new M.c(bVar);
        this.f240r = new A.a(bVar, 9);
        O.a aVar3 = new O.a(abstractActivityC0004e, aVar);
        this.f227e = aVar3;
        I.e eVar2 = (I.e) e2.f99a;
        if (!flutterJNI.isAttached()) {
            eVar2.c(abstractActivityC0004e.getApplicationContext());
            eVar2.a(abstractActivityC0004e, null);
        }
        io.flutter.plugin.platform.i iVar = new io.flutter.plugin.platform.i();
        iVar.f705b = jVar.f718b;
        iVar.f708e = flutterJNI;
        jVar.f721e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f245x);
        flutterJNI.setPlatformViewsController(jVar);
        flutterJNI.setPlatformViewsController2(iVar);
        flutterJNI.setLocalizationPlugin(aVar3);
        e2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f224b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f241s = jVar;
        this.t = iVar;
        A.a aVar4 = new A.a(16, false);
        aVar4.f3c = jVar;
        aVar4.f4d = iVar;
        this.f242u = aVar4;
        e eVar3 = new e(abstractActivityC0004e.getApplicationContext(), this);
        this.f226d = eVar3;
        aVar3.b(abstractActivityC0004e.getResources().getConfiguration());
        if (z2 && eVar2.f327d.f319e) {
            AbstractC0016a.A(this);
        }
        AbstractC0016a.d(abstractActivityC0004e, this);
        eVar3.a(new Q.a(aVar2));
    }
}
