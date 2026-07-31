package k0;

import B0.C0008i;
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
import p0.C0220e;
import r0.InterfaceC0225a;
import s0.InterfaceC0227a;
import u0.C0232d;
import z0.C0291a;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190g {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0187d f2678a;

    /* renamed from: b, reason: collision with root package name */
    public l0.c f2679b;

    /* renamed from: c, reason: collision with root package name */
    public o f2680c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f2681d;

    /* renamed from: e, reason: collision with root package name */
    public C0291a f2682e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0188e f2683f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2684g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2685h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2687j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f2688k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f2689l = new io.flutter.embedding.engine.renderer.a(1, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f2686i = false;

    public C0190g(AbstractActivityC0187d abstractActivityC0187d) {
        this.f2678a = abstractActivityC0187d;
    }

    public final void a(l0.f fVar) {
        String b2 = this.f2678a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = ((C0220e) C0008i.A().f84f).f2941d.f2930b;
        }
        m0.a aVar = new m0.a(b2, this.f2678a.e());
        String f2 = this.f2678a.f();
        if (f2 == null) {
            AbstractActivityC0187d abstractActivityC0187d = this.f2678a;
            abstractActivityC0187d.getClass();
            f2 = d(abstractActivityC0187d.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        fVar.f2808b = aVar;
        fVar.f2809c = f2;
        fVar.f2810d = (List) this.f2678a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f2678a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f2678a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0187d abstractActivityC0187d = this.f2678a;
        abstractActivityC0187d.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0187d + " connection to the engine " + abstractActivityC0187d.f2673f.f2679b + " evicted by another attaching activity");
        C0190g c0190g = abstractActivityC0187d.f2673f;
        if (c0190g != null) {
            c0190g.e();
            abstractActivityC0187d.f2673f.f();
        }
    }

    public final void c() {
        if (this.f2678a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0187d abstractActivityC0187d = this.f2678a;
        abstractActivityC0187d.getClass();
        try {
            Bundle g2 = abstractActivityC0187d.g();
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
        if (this.f2683f != null) {
            this.f2680c.getViewTreeObserver().removeOnPreDrawListener(this.f2683f);
            this.f2683f = null;
        }
        o oVar = this.f2680c;
        if (oVar != null) {
            oVar.a();
            o oVar2 = this.f2680c;
            oVar2.f2726l.remove(this.f2689l);
        }
    }

    public final void f() {
        if (this.f2687j) {
            c();
            this.f2678a.getClass();
            this.f2678a.getClass();
            AbstractActivityC0187d abstractActivityC0187d = this.f2678a;
            abstractActivityC0187d.getClass();
            if (abstractActivityC0187d.isChangingConfigurations()) {
                l0.d dVar = this.f2679b.f2778d;
                if (dVar.f()) {
                    C0.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        dVar.f2804g = true;
                        Iterator it = dVar.f2801d.values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC0227a) it.next()).e();
                        }
                        dVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f2679b.f2778d.c();
            }
            io.flutter.plugin.platform.e eVar = this.f2681d;
            if (eVar != null) {
                eVar.f2463b.f699g = null;
                this.f2681d = null;
            }
            C0291a c0291a = this.f2682e;
            if (c0291a != null) {
                c0291a.f3180c.f2915f = null;
                c0291a.f3178a = null;
                this.f2682e = null;
            }
            this.f2678a.getClass();
            l0.c cVar = this.f2679b;
            if (cVar != null) {
                C0232d c0232d = cVar.f2781g;
                c0232d.a(1, c0232d.f2990c);
            }
            if (this.f2678a.i()) {
                l0.c cVar2 = this.f2679b;
                FlutterJNI flutterJNI = cVar2.f2775a;
                Iterator it2 = cVar2.f2795v.iterator();
                while (it2.hasNext()) {
                    ((l0.b) it2.next()).a();
                }
                l0.d dVar2 = cVar2.f2778d;
                dVar2.e();
                HashMap hashMap = dVar2.f2798a;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    InterfaceC0225a interfaceC0225a = (InterfaceC0225a) hashMap.get(cls);
                    if (interfaceC0225a != null) {
                        C0.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (interfaceC0225a instanceof InterfaceC0227a) {
                                if (dVar2.f()) {
                                    ((InterfaceC0227a) interfaceC0225a).a();
                                }
                                dVar2.f2801d.remove(cls);
                            }
                            interfaceC0225a.i(dVar2.f2800c);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                io.flutter.plugin.platform.l lVar = cVar2.f2793s;
                SparseArray sparseArray = lVar.f2490o;
                while (sparseArray.size() > 0) {
                    lVar.f2499y.s(sparseArray.keyAt(0));
                }
                io.flutter.plugin.platform.k kVar = cVar2.t;
                SparseArray sparseArray2 = kVar.f2473k;
                while (sparseArray2.size() > 0) {
                    kVar.f2479q.s(sparseArray2.keyAt(0));
                }
                cVar2.f2777c.f2857e.setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(cVar2.f2797x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0008i.A().getClass();
                l0.c.f2774z.remove(Long.valueOf(cVar2.f2796w));
                if (this.f2678a.d() != null) {
                    if (l0.h.f2815c == null) {
                        l0.h.f2815c = new l0.h(2);
                    }
                    l0.h hVar = l0.h.f2815c;
                    hVar.f2816a.remove(this.f2678a.d());
                }
                this.f2679b = null;
            }
            this.f2687j = false;
        }
    }
}
