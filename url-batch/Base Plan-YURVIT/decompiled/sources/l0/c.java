package l0;

import B0.C0008i;
import N.P;
import a.AbstractC0086a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.datastore.preferences.protobuf.k0;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import o0.C0211b;
import p0.C0220e;
import u0.C0229a;
import u0.C0230b;
import u0.C0231c;
import u0.C0232d;
import u0.n;
import w0.C0248b;
import y0.C0278a;

/* loaded from: classes.dex */
public final class c implements C0.b {

    /* renamed from: y, reason: collision with root package name */
    public static long f2773y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f2774z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2775a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f2776b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.b f2777c;

    /* renamed from: d, reason: collision with root package name */
    public final d f2778d;

    /* renamed from: e, reason: collision with root package name */
    public final C0248b f2779e;

    /* renamed from: f, reason: collision with root package name */
    public final C0008i f2780f;

    /* renamed from: g, reason: collision with root package name */
    public final C0232d f2781g;

    /* renamed from: h, reason: collision with root package name */
    public final C0211b f2782h;

    /* renamed from: i, reason: collision with root package name */
    public final C0230b f2783i;

    /* renamed from: j, reason: collision with root package name */
    public final C0230b f2784j;

    /* renamed from: k, reason: collision with root package name */
    public final u0.l f2785k;

    /* renamed from: l, reason: collision with root package name */
    public final P f2786l;

    /* renamed from: m, reason: collision with root package name */
    public final C0211b f2787m;

    /* renamed from: n, reason: collision with root package name */
    public final C0211b f2788n;

    /* renamed from: o, reason: collision with root package name */
    public final n f2789o;

    /* renamed from: p, reason: collision with root package name */
    public final C0211b f2790p;

    /* renamed from: q, reason: collision with root package name */
    public final C0231c f2791q;

    /* renamed from: r, reason: collision with root package name */
    public final P f2792r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.l f2793s;
    public final io.flutter.plugin.platform.k t;

    /* renamed from: u, reason: collision with root package name */
    public final P f2794u;

    /* renamed from: w, reason: collision with root package name */
    public final long f2796w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f2795v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final C0198a f2797x = new C0198a(this);

    public c(Context context, FlutterJNI flutterJNI, io.flutter.plugin.platform.l lVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j2 = f2773y;
        f2773y = 1 + j2;
        this.f2796w = j2;
        f2774z.put(Long.valueOf(j2), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        C0008i A2 = C0008i.A();
        if (flutterJNI == null) {
            Object obj = A2.f85g;
            flutterJNI = new FlutterJNI();
        }
        this.f2775a = flutterJNI;
        m0.b bVar = new m0.b(flutterJNI, assets, this.f2796w);
        this.f2777c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f2860h);
        C0008i.A().getClass();
        this.f2780f = new C0008i(bVar, flutterJNI);
        new C0229a(bVar);
        this.f2781g = new C0232d(bVar);
        P p2 = new P(bVar, 17);
        this.f2782h = new C0211b(bVar, 6);
        this.f2783i = new C0230b(bVar, 1);
        this.f2784j = new C0230b(bVar, 0);
        this.f2786l = new P(bVar, 18);
        P p3 = new P(bVar, context.getPackageManager());
        this.f2785k = new u0.l(bVar, z3);
        this.f2787m = new C0211b(bVar, 15);
        this.f2788n = new C0211b(bVar, 17);
        n nVar = new n(bVar);
        this.f2789o = nVar;
        this.f2790p = new C0211b(bVar, 19);
        this.f2791q = new C0231c(bVar);
        this.f2792r = new P(bVar, 21);
        C0248b c0248b = new C0248b(context, p2);
        this.f2779e = c0248b;
        C0220e c0220e = (C0220e) A2.f84f;
        if (!flutterJNI.isAttached()) {
            c0220e.c(context.getApplicationContext());
            c0220e.a(context, null);
        }
        io.flutter.plugin.platform.k kVar = new io.flutter.plugin.platform.k();
        kVar.f2467e = lVar.f2480e;
        kVar.f2470h = flutterJNI;
        lVar.f2483h = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f2797x);
        flutterJNI.setPlatformViewsController(lVar);
        flutterJNI.setPlatformViewsController2(kVar);
        flutterJNI.setLocalizationPlugin(c0248b);
        A2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(nVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f2776b = new io.flutter.embedding.engine.renderer.i(flutterJNI);
        this.f2793s = lVar;
        this.t = kVar;
        P p4 = new P(11, false);
        p4.f698f = lVar;
        p4.f699g = kVar;
        this.f2794u = p4;
        d dVar = new d(context.getApplicationContext(), this);
        this.f2778d = dVar;
        c0248b.b(context.getResources().getConfiguration());
        if (z2 && c0220e.f2941d.f2933e) {
            k0.C(this);
        }
        AbstractC0086a.e(context, this);
        dVar.a(new C0278a(p3));
    }
}
