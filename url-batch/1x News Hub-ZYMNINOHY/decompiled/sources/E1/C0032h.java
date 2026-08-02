package E1;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: E1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032h {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0029e f346a;

    /* renamed from: b, reason: collision with root package name */
    public FlutterEngine f347b;

    /* renamed from: c, reason: collision with root package name */
    public t f348c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.f f349d;

    /* renamed from: e, reason: collision with root package name */
    public T1.a f350e;
    public ViewTreeObserverOnPreDrawListenerC0031g f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f351g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f352h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f354j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f355k;

    /* renamed from: l, reason: collision with root package name */
    public final C0030f f356l = new C0030f(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f353i = false;

    public C0032h(AbstractActivityC0029e abstractActivityC0029e) {
        this.f346a = abstractActivityC0029e;
    }

    public final void a(F1.h hVar) {
        String c3 = this.f346a.c();
        if (c3 == null || c3.isEmpty()) {
            c3 = ((J1.d) A0.f.H().f23b).f643e.f630b;
        }
        G1.a aVar = new G1.a(c3, this.f346a.g());
        String h3 = this.f346a.h();
        if (h3 == null) {
            AbstractActivityC0029e abstractActivityC0029e = this.f346a;
            abstractActivityC0029e.getClass();
            h3 = d(abstractActivityC0029e.getIntent());
            if (h3 == null) {
                h3 = "/";
            }
        }
        hVar.f517b = aVar;
        hVar.f518c = h3;
        hVar.f519d = (List) this.f346a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f346a.k()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f346a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0029e abstractActivityC0029e = this.f346a;
        abstractActivityC0029e.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0029e + " connection to the engine " + abstractActivityC0029e.f339b.f347b + " evicted by another attaching activity");
        C0032h c0032h = abstractActivityC0029e.f339b;
        if (c0032h != null) {
            c0032h.e();
            abstractActivityC0029e.f339b.f();
        }
    }

    public final void c() {
        if (this.f346a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z;
        Uri data;
        AbstractActivityC0029e abstractActivityC0029e = this.f346a;
        abstractActivityC0029e.getClass();
        try {
            Bundle i3 = abstractActivityC0029e.i();
            z = (i3 == null || !i3.containsKey("flutter_deeplinking_enabled")) ? true : i3.getBoolean("flutter_deeplinking_enabled");
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
        if (this.f != null) {
            this.f348c.getViewTreeObserver().removeOnPreDrawListener(this.f);
            this.f = null;
        }
        t tVar = this.f348c;
        if (tVar != null) {
            tVar.a();
            t tVar2 = this.f348c;
            tVar2.f390g.remove(this.f356l);
        }
    }

    public final void f() {
        if (this.f354j) {
            c();
            this.f346a.getClass();
            this.f346a.getClass();
            AbstractActivityC0029e abstractActivityC0029e = this.f346a;
            abstractActivityC0029e.getClass();
            if (abstractActivityC0029e.isChangingConfigurations()) {
                F1.d dVar = this.f347b.f9102d;
                if (dVar.f()) {
                    Z1.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        dVar.f491a = true;
                        Iterator it = ((HashMap) dVar.f493c).values().iterator();
                        while (it.hasNext()) {
                            ((M1.a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        dVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f347b.f9102d.c();
            }
            io.flutter.plugin.platform.f fVar = this.f349d;
            if (fVar != null) {
                fVar.f9252b.f1600c = null;
                this.f349d = null;
            }
            T1.a aVar = this.f350e;
            if (aVar != null) {
                ((C0.e) aVar.f1345c).f201b = null;
                aVar.f1344b = null;
                this.f350e = null;
            }
            this.f346a.getClass();
            FlutterEngine flutterEngine = this.f347b;
            if (flutterEngine != null) {
                O1.a aVar2 = flutterEngine.f9104g;
                aVar2.a(1, aVar2.f1137c);
            }
            if (this.f346a.k()) {
                FlutterEngine flutterEngine2 = this.f347b;
                Iterator it2 = flutterEngine2.v.iterator();
                while (it2.hasNext()) {
                    ((F1.b) it2.next()).a();
                }
                F1.d dVar2 = flutterEngine2.f9102d;
                dVar2.e();
                HashMap hashMap = (HashMap) dVar2.f492b;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    L1.b bVar = (L1.b) hashMap.get(cls);
                    if (bVar != null) {
                        Z1.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar instanceof M1.a) {
                                if (dVar2.f()) {
                                    ((M1.a) bVar).onDetachedFromActivity();
                                }
                                ((HashMap) dVar2.f493c).remove(cls);
                            }
                            bVar.onDetachedFromEngine((L1.a) dVar2.f);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.r rVar = flutterEngine2.f9115s;
                    SparseArray sparseArray = rVar.f9305l;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    rVar.f9314w.o(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.q qVar = flutterEngine2.f9116t;
                    SparseArray sparseArray2 = qVar.f9286i;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    qVar.f9293q.o(sparseArray2.keyAt(0));
                }
                flutterEngine2.f9101c.f534a.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = flutterEngine2.f9099a;
                flutterJNI.removeEngineLifecycleListener(flutterEngine2.f9119x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                A0.f.H().getClass();
                FlutterEngine.z.remove(Long.valueOf(flutterEngine2.f9118w));
                if (this.f346a.f() != null) {
                    if (F1.j.f523c == null) {
                        F1.j.f523c = new F1.j(1);
                    }
                    F1.j jVar = F1.j.f523c;
                    jVar.f524a.remove(this.f346a.f());
                }
                this.f347b = null;
            }
            this.f354j = false;
        }
    }
}
