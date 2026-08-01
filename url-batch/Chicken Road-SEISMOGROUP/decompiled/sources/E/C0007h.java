package E;

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

/* renamed from: E.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0004e f155a;

    /* renamed from: b, reason: collision with root package name */
    public F.c f156b;

    /* renamed from: c, reason: collision with root package name */
    public v f157c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f158d;

    /* renamed from: e, reason: collision with root package name */
    public B.n f159e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0006g f160f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f161g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f162h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f164j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f165k;

    /* renamed from: l, reason: collision with root package name */
    public final C0005f f166l = new C0005f(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f163i = false;

    public C0007h(AbstractActivityC0004e abstractActivityC0004e) {
        this.f155a = abstractActivityC0004e;
    }

    public final void a(F.g gVar) {
        String b2 = this.f155a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = ((I.e) D.b.e().f99a).f327d.f316b;
        }
        G.a aVar = new G.a(b2, this.f155a.e());
        String f2 = this.f155a.f();
        if (f2 == null) {
            AbstractActivityC0004e abstractActivityC0004e = this.f155a;
            abstractActivityC0004e.getClass();
            f2 = d(abstractActivityC0004e.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        gVar.f262b = aVar;
        gVar.f263c = f2;
        gVar.f264d = (List) this.f155a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f155a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f155a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0004e abstractActivityC0004e = this.f155a;
        abstractActivityC0004e.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0004e + " connection to the engine " + abstractActivityC0004e.f148b.f156b + " evicted by another attaching activity");
        C0007h c0007h = abstractActivityC0004e.f148b;
        if (c0007h != null) {
            c0007h.e();
            abstractActivityC0004e.f148b.f();
        }
    }

    public final void c() {
        if (this.f155a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z;
        Uri data;
        AbstractActivityC0004e abstractActivityC0004e = this.f155a;
        abstractActivityC0004e.getClass();
        try {
            Bundle g2 = abstractActivityC0004e.g();
            z = (g2 == null || !g2.containsKey("flutter_deeplinking_enabled")) ? true : g2.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        if (!z || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f160f != null) {
            this.f157c.getViewTreeObserver().removeOnPreDrawListener(this.f160f);
            this.f160f = null;
        }
        v vVar = this.f157c;
        if (vVar != null) {
            vVar.a();
            v vVar2 = this.f157c;
            vVar2.f195f.remove(this.f166l);
        }
    }

    public final void f() {
        if (this.f164j) {
            c();
            this.f155a.getClass();
            this.f155a.getClass();
            AbstractActivityC0004e abstractActivityC0004e = this.f155a;
            abstractActivityC0004e.getClass();
            if (abstractActivityC0004e.isChangingConfigurations()) {
                F.e eVar = this.f156b.f226d;
                if (eVar.f()) {
                    T.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        eVar.f258g = true;
                        for (Q.a aVar : eVar.f255d.values()) {
                            aVar.f417c.f248c.remove(aVar);
                            aVar.f417c = null;
                        }
                        eVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f156b.f226d.c();
            }
            io.flutter.plugin.platform.e eVar2 = this.f158d;
            if (eVar2 != null) {
                eVar2.f701b.f4d = null;
                this.f158d = null;
            }
            B.n nVar = this.f159e;
            if (nVar != null) {
                ((B.k) nVar.f54c).f44c = null;
                nVar.f53b = null;
                this.f159e = null;
            }
            this.f155a.getClass();
            F.c cVar = this.f156b;
            if (cVar != null) {
                M.d dVar = cVar.f229g;
                dVar.a(1, dVar.f335c);
            }
            if (this.f155a.i()) {
                F.c cVar2 = this.f156b;
                Iterator it = cVar2.f243v.iterator();
                while (it.hasNext()) {
                    ((F.b) it.next()).b();
                }
                F.e eVar3 = cVar2.f226d;
                eVar3.e();
                HashMap hashMap = eVar3.f252a;
                Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    K.a aVar2 = (K.a) hashMap.get(cls);
                    if (aVar2 != null) {
                        T.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (aVar2 instanceof Q.a) {
                                if (eVar3.f()) {
                                    Q.a aVar3 = (Q.a) aVar2;
                                    aVar3.f417c.f248c.remove(aVar3);
                                    aVar3.f417c = null;
                                }
                                eVar3.f255d.remove(cls);
                            }
                            aVar2.b(eVar3.f254c);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.j jVar = cVar2.f241s;
                    SparseArray sparseArray = jVar.f728l;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    jVar.f737v.g(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.i iVar = cVar2.t;
                    SparseArray sparseArray2 = iVar.f711h;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    iVar.f717n.g(sparseArray2.keyAt(0));
                }
                cVar2.f225c.f275b.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = cVar2.f223a;
                flutterJNI.removeEngineLifecycleListener(cVar2.f245x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                D.b.e().getClass();
                F.c.z.remove(Long.valueOf(cVar2.f244w));
                if (this.f155a.d() != null) {
                    if (F.i.f269c == null) {
                        F.i.f269c = new F.i(1);
                    }
                    F.i iVar2 = F.i.f269c;
                    iVar2.f270a.remove(this.f155a.d());
                }
                this.f156b = null;
            }
            this.f164j = false;
        }
    }
}
