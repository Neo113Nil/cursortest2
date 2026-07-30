package c0;

import L.C0026b;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import e0.C0113a;
import io.flutter.embedding.engine.FlutterJNI;
import j0.C0177a;
import j0.InterfaceC0178b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k0.InterfaceC0180a;
import m0.C0194d;
import r0.C0220a;
import t0.AbstractC0236a;

/* renamed from: c0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107i {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0104f f1701a;

    /* renamed from: b, reason: collision with root package name */
    public d0.c f1702b;

    /* renamed from: c, reason: collision with root package name */
    public r f1703c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f1704d;

    /* renamed from: e, reason: collision with root package name */
    public C0220a f1705e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0106h f1706f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1707g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1708h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1710j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f1711k;

    /* renamed from: l, reason: collision with root package name */
    public final C0105g f1712l = new C0105g(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f1709i = false;

    public C0107i(AbstractActivityC0104f abstractActivityC0104f) {
        this.f1701a = abstractActivityC0104f;
    }

    public final void a(d0.h hVar) {
        String b2 = this.f1701a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = ((h0.d) C0026b.C().f521g).f2340e.f2328b;
        }
        C0113a c0113a = new C0113a(b2, this.f1701a.e());
        String f2 = this.f1701a.f();
        if (f2 == null) {
            AbstractActivityC0104f abstractActivityC0104f = this.f1701a;
            abstractActivityC0104f.getClass();
            f2 = d(abstractActivityC0104f.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        hVar.f1837b = c0113a;
        hVar.f1838c = f2;
        hVar.f1839d = (List) this.f1701a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f1701a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f1701a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0104f abstractActivityC0104f = this.f1701a;
        abstractActivityC0104f.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0104f + " connection to the engine " + abstractActivityC0104f.f1694f.f1702b + " evicted by another attaching activity");
        C0107i c0107i = abstractActivityC0104f.f1694f;
        if (c0107i != null) {
            c0107i.e();
            abstractActivityC0104f.f1694f.f();
        }
    }

    public final void c() {
        if (this.f1701a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0104f abstractActivityC0104f = this.f1701a;
        abstractActivityC0104f.getClass();
        try {
            Bundle g2 = abstractActivityC0104f.g();
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
        if (this.f1706f != null) {
            this.f1703c.getViewTreeObserver().removeOnPreDrawListener(this.f1706f);
            this.f1706f = null;
        }
        r rVar = this.f1703c;
        if (rVar != null) {
            rVar.a();
            r rVar2 = this.f1703c;
            rVar2.f1748k.remove(this.f1712l);
        }
    }

    public final void f() {
        if (this.f1710j) {
            c();
            this.f1701a.getClass();
            this.f1701a.getClass();
            AbstractActivityC0104f abstractActivityC0104f = this.f1701a;
            abstractActivityC0104f.getClass();
            if (abstractActivityC0104f.isChangingConfigurations()) {
                J.b bVar = this.f1702b.f1791d;
                if (bVar.f()) {
                    AbstractC0236a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        bVar.f419a = true;
                        Iterator it = ((HashMap) bVar.f424f).values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC0180a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        bVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f1702b.f1791d.c();
            }
            io.flutter.plugin.platform.e eVar = this.f1704d;
            if (eVar != null) {
                eVar.f2459b.f516g = null;
                this.f1704d = null;
            }
            C0220a c0220a = this.f1705e;
            if (c0220a != null) {
                c0220a.f2836c.f2706f = null;
                c0220a.f2834a = null;
                this.f1705e = null;
            }
            this.f1701a.getClass();
            d0.c cVar = this.f1702b;
            if (cVar != null) {
                C0194d c0194d = cVar.f1794g;
                c0194d.a(1, c0194d.f2709c);
            }
            if (this.f1701a.i()) {
                d0.c cVar2 = this.f1702b;
                Iterator it2 = cVar2.f1808v.iterator();
                while (it2.hasNext()) {
                    ((d0.b) it2.next()).b();
                }
                J.b bVar2 = cVar2.f1791d;
                bVar2.e();
                HashMap hashMap = (HashMap) bVar2.f420b;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    InterfaceC0178b interfaceC0178b = (InterfaceC0178b) hashMap.get(cls);
                    if (interfaceC0178b != null) {
                        AbstractC0236a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (interfaceC0178b instanceof InterfaceC0180a) {
                                if (bVar2.f()) {
                                    ((InterfaceC0180a) interfaceC0178b).onDetachedFromActivity();
                                }
                                ((HashMap) bVar2.f424f).remove(cls);
                            }
                            interfaceC0178b.onDetachedFromEngine((C0177a) bVar2.f423e);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.k kVar = cVar2.f1805s;
                    SparseArray sparseArray = kVar.f2487o;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    kVar.f2496y.v(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.j jVar = cVar2.f1806t;
                    SparseArray sparseArray2 = jVar.f2470k;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    jVar.r.v(sparseArray2.keyAt(0));
                }
                cVar2.f1790c.f1851e.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = cVar2.f1788a;
                flutterJNI.removeEngineLifecycleListener(cVar2.f1810x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0026b.C().getClass();
                d0.c.f1787z.remove(Long.valueOf(cVar2.f1809w));
                if (this.f1701a.d() != null) {
                    if (d0.j.f1844c == null) {
                        d0.j.f1844c = new d0.j(1);
                    }
                    d0.j jVar2 = d0.j.f1844c;
                    jVar2.f1845a.remove(this.f1701a.d());
                }
                this.f1702b = null;
            }
            this.f1710j = false;
        }
    }
}
