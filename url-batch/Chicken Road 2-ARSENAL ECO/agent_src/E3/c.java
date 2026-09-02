package E3;

import D3.M;
import a1.AbstractC0223a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import m1.AbstractC0521b;
import u0.C0675e;
import u0.C0682l;
import u0.C0689s;
import y1.C0760d;

/* loaded from: classes.dex */
public final class c implements T3.b {
    public static long y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f599z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f600a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f601b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.b f602c;

    /* renamed from: d, reason: collision with root package name */
    public final d f603d;

    /* renamed from: e, reason: collision with root package name */
    public final P3.a f604e;

    /* renamed from: f, reason: collision with root package name */
    public final B0.c f605f;

    /* renamed from: g, reason: collision with root package name */
    public final N3.c f606g;

    /* renamed from: h, reason: collision with root package name */
    public final J1.c f607h;

    /* renamed from: i, reason: collision with root package name */
    public final N3.b f608i;

    /* renamed from: j, reason: collision with root package name */
    public final N3.b f609j;

    /* renamed from: k, reason: collision with root package name */
    public final N3.k f610k;

    /* renamed from: l, reason: collision with root package name */
    public final C0682l f611l;

    /* renamed from: m, reason: collision with root package name */
    public final J1.c f612m;

    /* renamed from: n, reason: collision with root package name */
    public final J1.c f613n;

    /* renamed from: o, reason: collision with root package name */
    public final N3.m f614o;

    /* renamed from: p, reason: collision with root package name */
    public final J1.c f615p;

    /* renamed from: q, reason: collision with root package name */
    public final M f616q;

    /* renamed from: r, reason: collision with root package name */
    public final C0675e f617r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.l f618s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f619t;

    /* renamed from: u, reason: collision with root package name */
    public final C0689s f620u;

    /* renamed from: w, reason: collision with root package name */
    public final long f622w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f621v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final a f623x = new a(this);

    public c(Context context, FlutterJNI flutterJNI, io.flutter.plugin.platform.l lVar, boolean z5, boolean z6) {
        AssetManager assets;
        long j4 = y;
        y = 1 + j4;
        this.f622w = j4;
        f599z.put(Long.valueOf(j4), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        C0689s t6 = C0689s.t();
        if (flutterJNI == null) {
            Object obj = t6.f6035g;
            flutterJNI = new FlutterJNI();
        }
        this.f600a = flutterJNI;
        F3.b bVar = new F3.b(flutterJNI, assets, this.f622w);
        this.f602c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f715i);
        C0689s.t().getClass();
        this.f605f = new B0.c(bVar, flutterJNI);
        new B0.c((Object) bVar, "flutter/deferredcomponent", (Object) O3.m.f1774a, 12).C(new C0760d());
        C0689s.t().getClass();
        new HashMap();
        this.f606g = new N3.c(bVar);
        C0675e c0675e = new C0675e(bVar, 4);
        this.f607h = new J1.c(bVar, 14);
        this.f608i = new N3.b(bVar, 1);
        this.f609j = new N3.b(bVar, 0);
        C0682l c0682l = new C0682l();
        J1.c cVar = new J1.c(15, c0682l);
        int i7 = 12;
        B0.c cVar2 = new B0.c((Object) bVar, "flutter/platform", (Object) O3.g.f1770b, i7);
        c0682l.f5989f = cVar2;
        cVar2.C(cVar);
        this.f611l = c0682l;
        PackageManager packageManager = context.getPackageManager();
        C0689s c0689s = new C0689s();
        M m4 = new M(14, c0689s);
        c0689s.f6034f = packageManager;
        new B0.c((Object) bVar, "flutter/processtext", (Object) O3.m.f1774a, i7).C(m4);
        this.f610k = new N3.k(bVar, z6);
        this.f612m = new J1.c(bVar, 19);
        this.f613n = new J1.c(bVar, 20);
        N3.m mVar = new N3.m(bVar);
        this.f614o = mVar;
        this.f615p = new J1.c(bVar, 21);
        this.f616q = new M(bVar, 18);
        this.f617r = new C0675e(bVar, 5);
        P3.a aVar = new P3.a(context, c0675e);
        this.f604e = aVar;
        I3.c cVar3 = (I3.c) t6.f6034f;
        if (!flutterJNI.isAttached()) {
            cVar3.d(context.getApplicationContext());
            cVar3.a(context, null);
        }
        io.flutter.plugin.platform.k kVar = new io.flutter.plugin.platform.k();
        kVar.f4561f = lVar.f4575f;
        kVar.f4564i = flutterJNI;
        lVar.f4578i = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f623x);
        flutterJNI.setPlatformViewsController(lVar);
        flutterJNI.setPlatformViewsController2(kVar);
        flutterJNI.setLocalizationPlugin(aVar);
        t6.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(mVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f601b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f618s = lVar;
        this.f619t = kVar;
        C0689s c0689s2 = new C0689s();
        c0689s2.f6034f = lVar;
        c0689s2.f6035g = kVar;
        this.f620u = c0689s2;
        d dVar = new d(context.getApplicationContext(), this, cVar3);
        this.f603d = dVar;
        aVar.b(context.getResources().getConfiguration());
        if (z5 && cVar3.f1195e.f1209a) {
            AbstractC0521b.C(this);
        }
        AbstractC0223a.a(context, this);
        dVar.a(new R3.a(c0689s));
    }
}
