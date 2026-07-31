package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l5.f;
import l5.g;
import l5.h;
import l5.i;
import l5.l;
import l5.m;
import l5.n;
import l5.o;
import l5.p;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f17205a;

    /* renamed from: b, reason: collision with root package name */
    private final k5.a f17206b;

    /* renamed from: c, reason: collision with root package name */
    private final a5.a f17207c;

    /* renamed from: d, reason: collision with root package name */
    private final c f17208d;

    /* renamed from: e, reason: collision with root package name */
    private final n5.a f17209e;

    /* renamed from: f, reason: collision with root package name */
    private final l5.a f17210f;

    /* renamed from: g, reason: collision with root package name */
    private final l5.b f17211g;

    /* renamed from: h, reason: collision with root package name */
    private final l5.e f17212h;

    /* renamed from: i, reason: collision with root package name */
    private final f f17213i;

    /* renamed from: j, reason: collision with root package name */
    private final g f17214j;

    /* renamed from: k, reason: collision with root package name */
    private final h f17215k;

    /* renamed from: l, reason: collision with root package name */
    private final l f17216l;

    /* renamed from: m, reason: collision with root package name */
    private final i f17217m;

    /* renamed from: n, reason: collision with root package name */
    private final m f17218n;

    /* renamed from: o, reason: collision with root package name */
    private final n f17219o;

    /* renamed from: p, reason: collision with root package name */
    private final o f17220p;

    /* renamed from: q, reason: collision with root package name */
    private final p f17221q;

    /* renamed from: r, reason: collision with root package name */
    private final io.flutter.plugin.platform.o f17222r;

    /* renamed from: s, reason: collision with root package name */
    private final Set<b> f17223s;

    /* renamed from: t, reason: collision with root package name */
    private final b f17224t;

    /* renamed from: io.flutter.embedding.engine.a$a, reason: collision with other inner class name */
    class C0071a implements b {
        C0071a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            z4.b.e("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.this.f17223s.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
            a.this.f17222r.Z();
            a.this.f17216l.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, c5.d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.o oVar, String[] strArr, boolean z6) {
        this(context, dVar, flutterJNI, oVar, strArr, z6, false);
    }

    public a(Context context, c5.d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.o oVar, String[] strArr, boolean z6, boolean z7) {
        AssetManager assets;
        this.f17223s = new HashSet();
        this.f17224t = new C0071a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        z4.a e7 = z4.a.e();
        flutterJNI = flutterJNI == null ? e7.d().a() : flutterJNI;
        this.f17205a = flutterJNI;
        a5.a aVar = new a5.a(flutterJNI, assets);
        this.f17207c = aVar;
        aVar.o();
        b5.a a7 = z4.a.e().a();
        this.f17210f = new l5.a(aVar, flutterJNI);
        l5.b bVar = new l5.b(aVar);
        this.f17211g = bVar;
        this.f17212h = new l5.e(aVar);
        f fVar = new f(aVar);
        this.f17213i = fVar;
        this.f17214j = new g(aVar);
        this.f17215k = new h(aVar);
        this.f17217m = new i(aVar);
        this.f17216l = new l(aVar, z7);
        this.f17218n = new m(aVar);
        this.f17219o = new n(aVar);
        this.f17220p = new o(aVar);
        this.f17221q = new p(aVar);
        if (a7 != null) {
            a7.b(bVar);
        }
        n5.a aVar2 = new n5.a(context, fVar);
        this.f17209e = aVar2;
        dVar = dVar == null ? e7.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.m(context.getApplicationContext());
            dVar.e(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f17224t);
        flutterJNI.setPlatformViewsController(oVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        flutterJNI.setDeferredComponentManager(e7.a());
        if (!flutterJNI.isAttached()) {
            e();
        }
        this.f17206b = new k5.a(flutterJNI);
        this.f17222r = oVar;
        oVar.T();
        this.f17208d = new c(context.getApplicationContext(), this, dVar);
        aVar2.d(context.getResources().getConfiguration());
        if (z6 && dVar.d()) {
            j5.a.a(this);
        }
    }

    public a(Context context, c5.d dVar, FlutterJNI flutterJNI, String[] strArr, boolean z6) {
        this(context, dVar, flutterJNI, new io.flutter.plugin.platform.o(), strArr, z6);
    }

    public a(Context context, String[] strArr) {
        this(context, null, null, strArr, true);
    }

    public a(Context context, String[] strArr, boolean z6, boolean z7) {
        this(context, null, null, new io.flutter.plugin.platform.o(), strArr, z6, z7);
    }

    private void e() {
        z4.b.e("FlutterEngine", "Attaching to JNI.");
        this.f17205a.attachToNative();
        if (!w()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean w() {
        return this.f17205a.isAttached();
    }

    public void d(b bVar) {
        this.f17223s.add(bVar);
    }

    public void f() {
        z4.b.e("FlutterEngine", "Destroying.");
        Iterator<b> it = this.f17223s.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f17208d.l();
        this.f17222r.V();
        this.f17207c.p();
        this.f17205a.removeEngineLifecycleListener(this.f17224t);
        this.f17205a.setDeferredComponentManager(null);
        this.f17205a.detachFromNativeAndReleaseResources();
        if (z4.a.e().a() != null) {
            z4.a.e().a().destroy();
            this.f17211g.c(null);
        }
    }

    public l5.a g() {
        return this.f17210f;
    }

    public f5.b h() {
        return this.f17208d;
    }

    public a5.a i() {
        return this.f17207c;
    }

    public l5.e j() {
        return this.f17212h;
    }

    public n5.a k() {
        return this.f17209e;
    }

    public g l() {
        return this.f17214j;
    }

    public h m() {
        return this.f17215k;
    }

    public i n() {
        return this.f17217m;
    }

    public io.flutter.plugin.platform.o o() {
        return this.f17222r;
    }

    public e5.b p() {
        return this.f17208d;
    }

    public k5.a q() {
        return this.f17206b;
    }

    public l r() {
        return this.f17216l;
    }

    public m s() {
        return this.f17218n;
    }

    public n t() {
        return this.f17219o;
    }

    public o u() {
        return this.f17220p;
    }

    public p v() {
        return this.f17221q;
    }
}
