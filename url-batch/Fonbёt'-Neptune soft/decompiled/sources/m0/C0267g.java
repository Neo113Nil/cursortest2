package m0;

import B0.C0031i;
import P.O;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o0.C0279a;
import q0.C0287d;
import s0.InterfaceC0304a;
import t0.InterfaceC0308a;
import v0.C0313c;

/* renamed from: m0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267g {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0264d f3151a;

    /* renamed from: b, reason: collision with root package name */
    public n0.c f3152b;

    /* renamed from: c, reason: collision with root package name */
    public q f3153c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.f f3154d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0266f f3155e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3156f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3157g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3159i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f3160j;

    /* renamed from: k, reason: collision with root package name */
    public final C0265e f3161k = new C0265e(0, this);

    /* renamed from: h, reason: collision with root package name */
    public boolean f3158h = false;

    public C0267g(AbstractActivityC0264d abstractActivityC0264d) {
        this.f3151a = abstractActivityC0264d;
    }

    public final void a(n0.g gVar) {
        String b2 = this.f3151a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = (String) ((C0287d) C0031i.G().f154f).f3382d.f3330g;
        }
        C0279a c0279a = new C0279a(b2, this.f3151a.e());
        String f2 = this.f3151a.f();
        if (f2 == null) {
            AbstractActivityC0264d abstractActivityC0264d = this.f3151a;
            abstractActivityC0264d.getClass();
            f2 = d(abstractActivityC0264d.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        gVar.f3295b = c0279a;
        gVar.f3296c = f2;
        gVar.f3297d = (List) this.f3151a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f3151a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f3151a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0264d abstractActivityC0264d = this.f3151a;
        abstractActivityC0264d.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0264d + " connection to the engine " + abstractActivityC0264d.f3144f.f3152b + " evicted by another attaching activity");
        C0267g c0267g = abstractActivityC0264d.f3144f;
        if (c0267g != null) {
            c0267g.e();
            abstractActivityC0264d.f3144f.f();
        }
    }

    public final void c() {
        if (this.f3151a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0264d abstractActivityC0264d = this.f3151a;
        abstractActivityC0264d.getClass();
        try {
            Bundle g2 = abstractActivityC0264d.g();
            z2 = (g2 == null || !g2.containsKey("flutter_deeplinking_enabled")) ? true : g2.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z2 = false;
        }
        if (!z2 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f3155e != null) {
            this.f3153c.getViewTreeObserver().removeOnPreDrawListener(this.f3155e);
            this.f3155e = null;
        }
        q qVar = this.f3153c;
        if (qVar != null) {
            qVar.a();
            q qVar2 = this.f3153c;
            qVar2.f3188j.remove(this.f3161k);
        }
    }

    public final void f() {
        if (this.f3159i) {
            c();
            this.f3151a.getClass();
            this.f3151a.getClass();
            AbstractActivityC0264d abstractActivityC0264d = this.f3151a;
            abstractActivityC0264d.getClass();
            if (abstractActivityC0264d.isChangingConfigurations()) {
                n0.e eVar = this.f3152b.f3266d;
                if (eVar.e()) {
                    E0.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        eVar.f3291g = true;
                        Iterator it = eVar.f3288d.values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC0308a) it.next()).d();
                        }
                        io.flutter.plugin.platform.o oVar = eVar.f3286b.f3280r;
                        O o2 = oVar.f2661g;
                        if (o2 != null) {
                            o2.f876g = null;
                        }
                        oVar.c();
                        oVar.f2661g = null;
                        oVar.f2657c = null;
                        oVar.f2659e = null;
                        eVar.f3289e = null;
                        eVar.f3290f = null;
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f3152b.f3266d.c();
            }
            io.flutter.plugin.platform.f fVar = this.f3154d;
            if (fVar != null) {
                fVar.f2630b.f876g = null;
                this.f3154d = null;
            }
            this.f3151a.getClass();
            n0.c cVar = this.f3152b;
            if (cVar != null) {
                C0313c c0313c = cVar.f3269g;
                c0313c.a(1, c0313c.f3478c);
            }
            if (this.f3151a.i()) {
                n0.c cVar2 = this.f3152b;
                Iterator it2 = cVar2.f3281s.iterator();
                while (it2.hasNext()) {
                    ((n0.b) it2.next()).b();
                }
                n0.e eVar2 = cVar2.f3266d;
                eVar2.d();
                HashMap hashMap = eVar2.f3285a;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    InterfaceC0304a interfaceC0304a = (InterfaceC0304a) hashMap.get(cls);
                    if (interfaceC0304a != null) {
                        E0.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (interfaceC0304a instanceof InterfaceC0308a) {
                                if (eVar2.e()) {
                                    ((InterfaceC0308a) interfaceC0304a).c();
                                }
                                eVar2.f3288d.remove(cls);
                            }
                            interfaceC0304a.k(eVar2.f3287c);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.o oVar2 = cVar2.f3280r;
                    SparseArray sparseArray = oVar2.f2665k;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    oVar2.v.e(sparseArray.keyAt(0));
                }
                ((FlutterJNI) cVar2.f3265c.f3329f).setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = cVar2.f3263a;
                flutterJNI.removeEngineLifecycleListener(cVar2.f3282t);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0031i.G().getClass();
                if (this.f3151a.d() != null) {
                    if (n0.i.f3302c == null) {
                        n0.i.f3302c = new n0.i(1);
                    }
                    n0.i iVar = n0.i.f3302c;
                    iVar.f3303a.remove(this.f3151a.d());
                }
                this.f3152b = null;
            }
            this.f3159i = false;
        }
    }
}
