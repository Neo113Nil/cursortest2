package i4;

import P0.s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import e0.C0370a;
import i.C0511M;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.t;
import io.flutter.plugin.platform.u;
import j4.C0573b;
import j4.C0580i;
import java.util.HashMap;
import java.util.HashSet;
import m4.C0690c;
import r4.n;
import s4.q;
import s4.w;
import v4.C0974a;

/* renamed from: i4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547c implements A4.d {

    /* renamed from: y, reason: collision with root package name */
    public static long f5499y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f5500z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f5501a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f5502b;

    /* renamed from: c, reason: collision with root package name */
    public final C0573b f5503c;

    /* renamed from: d, reason: collision with root package name */
    public final C0370a f5504d;

    /* renamed from: e, reason: collision with root package name */
    public final t4.a f5505e;

    /* renamed from: f, reason: collision with root package name */
    public final D0.j f5506f;

    /* renamed from: g, reason: collision with root package name */
    public final r4.c f5507g;

    /* renamed from: h, reason: collision with root package name */
    public final l4.b f5508h;

    /* renamed from: i, reason: collision with root package name */
    public final r4.a f5509i;
    public final r4.a j;

    /* renamed from: k, reason: collision with root package name */
    public final A6.j f5510k;

    /* renamed from: l, reason: collision with root package name */
    public final P0.e f5511l;

    /* renamed from: m, reason: collision with root package name */
    public final l4.b f5512m;

    /* renamed from: n, reason: collision with root package name */
    public final l4.b f5513n;

    /* renamed from: o, reason: collision with root package name */
    public final n f5514o;

    /* renamed from: p, reason: collision with root package name */
    public final l4.b f5515p;

    /* renamed from: q, reason: collision with root package name */
    public final C0511M f5516q;

    /* renamed from: r, reason: collision with root package name */
    public final P0.l f5517r;

    /* renamed from: s, reason: collision with root package name */
    public final u f5518s;

    /* renamed from: t, reason: collision with root package name */
    public final t f5519t;

    /* renamed from: u, reason: collision with root package name */
    public final s f5520u;

    /* renamed from: w, reason: collision with root package name */
    public final long f5522w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f5521v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final C0545a f5523x = new C0545a(this);

    public C0547c(Context context, FlutterJNI flutterJNI, u uVar, boolean z7, boolean z8) {
        AssetManager assets;
        long j = f5499y;
        f5499y = 1 + j;
        this.f5522w = j;
        f5500z.put(Long.valueOf(j), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        D0.j Q = D0.j.Q();
        if (flutterJNI == null) {
            Object obj = Q.f331i;
            flutterJNI = new FlutterJNI();
        }
        this.f5501a = flutterJNI;
        C0573b c0573b = new C0573b(flutterJNI, assets, this.f5522w);
        this.f5503c = c0573b;
        flutterJNI.setPlatformMessageHandler((C0580i) c0573b.f5959m);
        D0.j.Q().getClass();
        this.f5506f = new D0.j(c0573b, flutterJNI);
        new q(c0573b, "flutter/deferredcomponent", w.f7775a).b(new q1.h(29, new r4.b()));
        D0.j.Q().getClass();
        new HashMap();
        this.f5507g = new r4.c(c0573b);
        P0.c cVar = new P0.c(c0573b);
        this.f5508h = new l4.b(c0573b, 9);
        this.f5509i = new r4.a(c0573b, 1);
        this.j = new r4.a(c0573b, 0);
        this.f5511l = new P0.e(c0573b);
        P0.c cVar2 = new P0.c(c0573b, context.getPackageManager());
        this.f5510k = new A6.j(c0573b, z8);
        this.f5512m = new l4.b(c0573b, 13);
        this.f5513n = new l4.b(c0573b, 14);
        n nVar = new n(c0573b);
        this.f5514o = nVar;
        this.f5515p = new l4.b(c0573b, 15);
        this.f5516q = new C0511M(c0573b);
        this.f5517r = new P0.l(c0573b, 11);
        t4.a aVar = new t4.a(context, cVar);
        this.f5505e = aVar;
        C0690c c0690c = (C0690c) Q.f330e;
        if (!flutterJNI.isAttached()) {
            c0690c.d(context.getApplicationContext());
            c0690c.a(context, null);
        }
        t tVar = new t();
        tVar.f5730d = uVar.f5753d;
        tVar.f5734m = flutterJNI;
        uVar.f5757m = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f5523x);
        flutterJNI.setPlatformViewsController(uVar);
        flutterJNI.setPlatformViewsController2(tVar);
        flutterJNI.setLocalizationPlugin(aVar);
        Q.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(nVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f5502b = new io.flutter.embedding.engine.renderer.j(flutterJNI);
        this.f5518s = uVar;
        this.f5519t = tVar;
        s sVar = new s();
        sVar.f2251d = uVar;
        sVar.f2252e = tVar;
        this.f5520u = sVar;
        C0370a c0370a = new C0370a(context.getApplicationContext(), this, c0690c);
        this.f5504d = c0370a;
        aVar.b(context.getResources().getConfiguration());
        if (z7 && c0690c.f6538e.f7204a) {
            d4.c.I(this);
        }
        O6.g.z(context, this);
        c0370a.a(new C0974a(cVar2));
    }
}
