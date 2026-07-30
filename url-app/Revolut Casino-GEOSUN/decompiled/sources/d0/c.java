package d0;

import L.C0026b;
import L.Q;
import a.AbstractC0069a;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import c0.AbstractActivityC0104f;
import e0.C0114b;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import m0.C0191a;
import m0.C0192b;
import m0.C0193c;
import m0.C0194d;
import m0.C0202l;
import m0.C0204n;
import o0.C0214a;
import q0.C0219a;
import t0.InterfaceC0237b;

/* loaded from: classes.dex */
public final class c implements InterfaceC0237b {

    /* renamed from: y, reason: collision with root package name */
    public static long f1786y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f1787z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f1788a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f1789b;

    /* renamed from: c, reason: collision with root package name */
    public final C0114b f1790c;

    /* renamed from: d, reason: collision with root package name */
    public final J.b f1791d;

    /* renamed from: e, reason: collision with root package name */
    public final C0214a f1792e;

    /* renamed from: f, reason: collision with root package name */
    public final C0026b f1793f;

    /* renamed from: g, reason: collision with root package name */
    public final C0194d f1794g;

    /* renamed from: h, reason: collision with root package name */
    public final C0193c f1795h;

    /* renamed from: i, reason: collision with root package name */
    public final C0191a f1796i;

    /* renamed from: j, reason: collision with root package name */
    public final C0191a f1797j;

    /* renamed from: k, reason: collision with root package name */
    public final C0202l f1798k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f1799l;

    /* renamed from: m, reason: collision with root package name */
    public final C0193c f1800m;

    /* renamed from: n, reason: collision with root package name */
    public final C0193c f1801n;

    /* renamed from: o, reason: collision with root package name */
    public final C0204n f1802o;

    /* renamed from: p, reason: collision with root package name */
    public final C0193c f1803p;

    /* renamed from: q, reason: collision with root package name */
    public final C0192b f1804q;
    public final Q r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f1805s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f1806t;

    /* renamed from: u, reason: collision with root package name */
    public final Q f1807u;

    /* renamed from: w, reason: collision with root package name */
    public final long f1809w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f1808v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final C0111a f1810x = new C0111a(this);

    public c(AbstractActivityC0104f abstractActivityC0104f, FlutterJNI flutterJNI, io.flutter.plugin.platform.k kVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j2 = f1786y;
        f1786y = 1 + j2;
        this.f1809w = j2;
        f1787z.put(Long.valueOf(j2), this);
        try {
            assets = abstractActivityC0104f.createPackageContext(abstractActivityC0104f.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0104f.getAssets();
        }
        C0026b C2 = C0026b.C();
        if (flutterJNI == null) {
            ((E.a) C2.f520f).getClass();
            flutterJNI = new FlutterJNI();
        }
        this.f1788a = flutterJNI;
        C0114b c0114b = new C0114b(flutterJNI, assets, this.f1809w);
        this.f1790c = c0114b;
        flutterJNI.setPlatformMessageHandler(c0114b.f1854h);
        C0026b.C().getClass();
        this.f1793f = new C0026b(c0114b, flutterJNI);
        new E.a(c0114b);
        this.f1794g = new C0194d(c0114b);
        Q q2 = new Q(c0114b, 14);
        this.f1795h = new C0193c(c0114b, 3);
        this.f1796i = new C0191a(c0114b, 1);
        this.f1797j = new C0191a(c0114b, 0);
        this.f1799l = new Q(c0114b, 15);
        Q q3 = new Q(c0114b, abstractActivityC0104f.getPackageManager());
        this.f1798k = new C0202l(c0114b, z3);
        this.f1800m = new C0193c(c0114b, 12);
        this.f1801n = new C0193c(c0114b, 14);
        C0204n c0204n = new C0204n(c0114b);
        this.f1802o = c0204n;
        this.f1803p = new C0193c(c0114b, 16);
        this.f1804q = new C0192b(c0114b);
        this.r = new Q(c0114b, 18);
        C0214a c0214a = new C0214a(abstractActivityC0104f, q2);
        this.f1792e = c0214a;
        h0.d dVar = (h0.d) C2.f521g;
        if (!flutterJNI.isAttached()) {
            dVar.d(abstractActivityC0104f.getApplicationContext());
            dVar.a(abstractActivityC0104f, null);
        }
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        jVar.f2464e = kVar.f2477e;
        jVar.f2467h = flutterJNI;
        kVar.f2480h = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f1810x);
        flutterJNI.setPlatformViewsController(kVar);
        flutterJNI.setPlatformViewsController2(jVar);
        flutterJNI.setLocalizationPlugin(c0214a);
        C2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(c0204n);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f1789b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f1805s = kVar;
        this.f1806t = jVar;
        Q q4 = new Q(12, false);
        q4.f515f = kVar;
        q4.f516g = jVar;
        this.f1807u = q4;
        J.b bVar = new J.b(abstractActivityC0104f.getApplicationContext(), this, dVar);
        this.f1791d = bVar;
        c0214a.b(abstractActivityC0104f.getResources().getConfiguration());
        if (z2 && dVar.f2340e.f2331e) {
            AbstractC0069a.C(this);
        }
        o.g.b(abstractActivityC0104f, this);
        bVar.a(new C0219a(q3));
    }
}
