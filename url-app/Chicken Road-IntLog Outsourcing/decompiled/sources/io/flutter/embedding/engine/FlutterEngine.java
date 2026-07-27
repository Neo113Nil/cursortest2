package io.flutter.embedding.engine;

import B0.c;
import B0.e;
import B0.f;
import B1.g;
import G2.j;
import G2.l;
import H2.o;
import H2.s;
import I2.a;
import O2.b;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import h2.C0482c;
import io.flutter.embedding.engine.renderer.i;
import io.flutter.plugin.platform.m;
import java.util.HashMap;
import java.util.HashSet;
import t0.C1423b;
import w2.AbstractActivityC1515c;
import x2.C1538a;
import y2.C1557b;

/* loaded from: classes.dex */
public class FlutterEngine implements b {

    /* renamed from: y, reason: collision with root package name */
    public static long f10081y = 1;
    public static final HashMap z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f10082a;

    /* renamed from: b, reason: collision with root package name */
    public final i f10083b;

    /* renamed from: c, reason: collision with root package name */
    public final C1557b f10084c;

    /* renamed from: d, reason: collision with root package name */
    public final U.b f10085d;

    /* renamed from: e, reason: collision with root package name */
    public final a f10086e;

    /* renamed from: f, reason: collision with root package name */
    public final B4.i f10087f;

    /* renamed from: g, reason: collision with root package name */
    public final G2.b f10088g;

    /* renamed from: h, reason: collision with root package name */
    public final g f10089h;

    /* renamed from: i, reason: collision with root package name */
    public final C0482c f10090i;

    /* renamed from: j, reason: collision with root package name */
    public final g f10091j;

    /* renamed from: k, reason: collision with root package name */
    public final j f10092k;

    /* renamed from: l, reason: collision with root package name */
    public final e f10093l;

    /* renamed from: m, reason: collision with root package name */
    public final g f10094m;

    /* renamed from: n, reason: collision with root package name */
    public final g f10095n;

    /* renamed from: o, reason: collision with root package name */
    public final l f10096o;

    /* renamed from: p, reason: collision with root package name */
    public final g f10097p;

    /* renamed from: q, reason: collision with root package name */
    public final C0482c f10098q;

    /* renamed from: r, reason: collision with root package name */
    public final x1.e f10099r;

    /* renamed from: s, reason: collision with root package name */
    public final m f10100s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.l f10101t;

    /* renamed from: u, reason: collision with root package name */
    public final e f10102u;

    /* renamed from: w, reason: collision with root package name */
    public final long f10104w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f10103v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final C1538a f10105x = new C1538a(this);

    public FlutterEngine(AbstractActivityC1515c abstractActivityC1515c, FlutterJNI flutterJNI, m mVar, boolean z5, boolean z6) {
        AssetManager assets;
        long j2 = f10081y;
        f10081y = 1 + j2;
        this.f10104w = j2;
        z.put(Long.valueOf(j2), this);
        try {
            assets = abstractActivityC1515c.createPackageContext(abstractActivityC1515c.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC1515c.getAssets();
        }
        B4.i K5 = B4.i.K();
        if (flutterJNI == null) {
            ((C1423b) K5.f312c).getClass();
            flutterJNI = new FlutterJNI();
        }
        this.f10082a = flutterJNI;
        C1557b c1557b = new C1557b(flutterJNI, assets, this.f10104w);
        this.f10084c = c1557b;
        flutterJNI.setPlatformMessageHandler(c1557b.f12349d);
        B4.i.K().getClass();
        this.f10087f = new B4.i(c1557b, flutterJNI);
        new o(c1557b, "flutter/deferredcomponent", s.f1151b).b(new C0482c(8, new W1.e()));
        B4.i.K().getClass();
        new HashMap();
        this.f10088g = new G2.b(c1557b);
        c cVar = new c(c1557b);
        this.f10089h = new g(c1557b, 9);
        this.f10090i = new C0482c(c1557b, 11);
        this.f10091j = new g(c1557b, 6);
        this.f10093l = new e(c1557b);
        B0.l lVar = new B0.l(c1557b, abstractActivityC1515c.getPackageManager());
        this.f10092k = new j(c1557b, z6);
        this.f10094m = new g(c1557b, 14);
        this.f10095n = new g(c1557b, 15);
        l lVar2 = new l(c1557b);
        this.f10096o = lVar2;
        this.f10097p = new g(c1557b, 16);
        this.f10098q = new C0482c(c1557b, 18);
        x1.e eVar = new x1.e();
        g gVar = new g(17, eVar);
        o oVar = new o(c1557b, "flutter/textinput", H2.j.f1145a);
        eVar.f12265a = oVar;
        oVar.b(gVar);
        this.f10099r = eVar;
        a aVar = new a(abstractActivityC1515c, cVar);
        this.f10086e = aVar;
        B2.e eVar2 = (B2.e) K5.f311b;
        if (!flutterJNI.isAttached()) {
            eVar2.d(abstractActivityC1515c.getApplicationContext());
            eVar2.a(abstractActivityC1515c, null);
        }
        io.flutter.plugin.platform.l lVar3 = new io.flutter.plugin.platform.l();
        lVar3.f10221a = mVar.f10235a;
        lVar3.f10224d = flutterJNI;
        mVar.f10238d = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f10105x);
        flutterJNI.setPlatformViewsController(mVar);
        flutterJNI.setPlatformViewsController2(lVar3);
        flutterJNI.setLocalizationPlugin(aVar);
        K5.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(lVar2);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f10083b = new i(flutterJNI);
        this.f10100s = mVar;
        this.f10101t = lVar3;
        e eVar3 = new e(9);
        eVar3.f146b = mVar;
        eVar3.f147c = lVar3;
        this.f10102u = eVar3;
        U.b bVar = new U.b(abstractActivityC1515c.getApplicationContext(), this, eVar2);
        this.f10085d = bVar;
        aVar.b(abstractActivityC1515c.getResources().getConfiguration());
        if (z5 && eVar2.f255e.f239a) {
            f.I(this);
        }
        f.e(abstractActivityC1515c, this);
        bVar.a(new K2.a(lVar));
    }
}
