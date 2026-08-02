package io.flutter.embedding.engine;

import A0.f;
import C0.e;
import E1.AbstractActivityC0029e;
import F1.d;
import O1.k;
import O1.m;
import P1.o;
import P1.u;
import Q1.a;
import Z1.b;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import b0.C0178i;
import f0.C0322a;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class FlutterEngine implements b {

    /* renamed from: y, reason: collision with root package name */
    public static long f9098y = 1;
    public static final HashMap z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f9099a;

    /* renamed from: b, reason: collision with root package name */
    public final j f9100b;

    /* renamed from: c, reason: collision with root package name */
    public final G1.b f9101c;

    /* renamed from: d, reason: collision with root package name */
    public final d f9102d;

    /* renamed from: e, reason: collision with root package name */
    public final a f9103e;
    public final f f;

    /* renamed from: g, reason: collision with root package name */
    public final O1.a f9104g;

    /* renamed from: h, reason: collision with root package name */
    public final e f9105h;

    /* renamed from: i, reason: collision with root package name */
    public final C0178i f9106i;

    /* renamed from: j, reason: collision with root package name */
    public final e f9107j;

    /* renamed from: k, reason: collision with root package name */
    public final k f9108k;

    /* renamed from: l, reason: collision with root package name */
    public final V0.e f9109l;

    /* renamed from: m, reason: collision with root package name */
    public final e f9110m;

    /* renamed from: n, reason: collision with root package name */
    public final e f9111n;
    public final m o;

    /* renamed from: p, reason: collision with root package name */
    public final e f9112p;

    /* renamed from: q, reason: collision with root package name */
    public final C0178i f9113q;

    /* renamed from: r, reason: collision with root package name */
    public final V0.e f9114r;

    /* renamed from: s, reason: collision with root package name */
    public final r f9115s;

    /* renamed from: t, reason: collision with root package name */
    public final q f9116t;

    /* renamed from: u, reason: collision with root package name */
    public final C0322a f9117u;

    /* renamed from: w, reason: collision with root package name */
    public final long f9118w;
    public final HashSet v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final F1.a f9119x = new F1.a(this);

    public FlutterEngine(AbstractActivityC0029e abstractActivityC0029e, FlutterJNI flutterJNI, r rVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j3 = f9098y;
        f9098y = 1 + j3;
        this.f9118w = j3;
        z.put(Long.valueOf(j3), this);
        try {
            assets = abstractActivityC0029e.createPackageContext(abstractActivityC0029e.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0029e.getAssets();
        }
        f H2 = f.H();
        if (flutterJNI == null) {
            Object obj = H2.f24c;
            flutterJNI = new FlutterJNI();
        }
        this.f9099a = flutterJNI;
        G1.b bVar = new G1.b(flutterJNI, assets, this.f9118w);
        this.f9101c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f537d);
        f.H().getClass();
        this.f = new f(bVar, flutterJNI);
        new K0.j(bVar);
        this.f9104g = new O1.a(bVar);
        V0.e eVar = new V0.e(bVar, 15);
        this.f9105h = new e(bVar, 13);
        this.f9106i = new C0178i(bVar, 14);
        this.f9107j = new e(bVar, 10);
        this.f9109l = new V0.e(bVar, 16);
        V0.e eVar2 = new V0.e(bVar, abstractActivityC0029e.getPackageManager());
        o oVar = new o(bVar, "flutter/restoration", u.f1272b, null);
        k kVar = new k();
        kVar.f1181b = false;
        kVar.f1182c = false;
        e eVar3 = new e(16, kVar);
        kVar.f1184e = oVar;
        kVar.f1180a = z3;
        oVar.b(eVar3);
        this.f9108k = kVar;
        this.f9110m = new e(bVar, 17);
        this.f9111n = new e(bVar, 18);
        m mVar = new m(bVar);
        this.o = mVar;
        this.f9112p = new e(bVar, 19);
        this.f9113q = new C0178i(bVar, 20);
        this.f9114r = new V0.e(bVar, 21);
        a aVar = new a(abstractActivityC0029e, eVar);
        this.f9103e = aVar;
        J1.d dVar = (J1.d) H2.f23b;
        if (!flutterJNI.isAttached()) {
            dVar.d(abstractActivityC0029e.getApplicationContext());
            dVar.a(abstractActivityC0029e, null);
        }
        q qVar = new q();
        qVar.f9279a = rVar.f9295a;
        qVar.f9283e = flutterJNI;
        rVar.f9299e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f9119x);
        flutterJNI.setPlatformViewsController(rVar);
        flutterJNI.setPlatformViewsController2(qVar);
        flutterJNI.setLocalizationPlugin(aVar);
        H2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(mVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f9100b = new j(flutterJNI);
        this.f9115s = rVar;
        this.f9116t = qVar;
        C0322a c0322a = new C0322a(2);
        c0322a.f4977b = rVar;
        c0322a.f4978c = qVar;
        this.f9117u = c0322a;
        d dVar2 = new d(abstractActivityC0029e.getApplicationContext(), this, dVar);
        this.f9102d = dVar2;
        aVar.b(abstractActivityC0029e.getResources().getConfiguration());
        if (z2 && dVar.f643e.f633e) {
            S0.a.A(this);
        }
        android.support.v4.media.session.a.e(abstractActivityC0029e, this);
        dVar2.a(new S1.a(eVar2));
    }
}
