package D;

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

/* renamed from: D.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008i {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0005f f77a;

    /* renamed from: b, reason: collision with root package name */
    public E.c f78b;

    /* renamed from: c, reason: collision with root package name */
    public y f79c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.f f80d;

    /* renamed from: e, reason: collision with root package name */
    public R.a f81e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0007h f82f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f83g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f84h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f86j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f87k;

    /* renamed from: l, reason: collision with root package name */
    public final C0006g f88l = new C0006g(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f85i = false;

    public C0008i(AbstractActivityC0005f abstractActivityC0005f) {
        this.f77a = abstractActivityC0005f;
    }

    public final void a(E.g gVar) {
        String b2 = this.f77a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = ((I.e) C.b.e().f13a).f262d.f251b;
        }
        F.a aVar = new F.a(b2, this.f77a.e());
        String f2 = this.f77a.f();
        if (f2 == null) {
            AbstractActivityC0005f abstractActivityC0005f = this.f77a;
            abstractActivityC0005f.getClass();
            f2 = d(abstractActivityC0005f.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        gVar.f187b = aVar;
        gVar.f188c = f2;
        gVar.f189d = (List) this.f77a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f77a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f77a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0005f abstractActivityC0005f = this.f77a;
        abstractActivityC0005f.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0005f + " connection to the engine " + abstractActivityC0005f.f70b.f78b + " evicted by another attaching activity");
        C0008i c0008i = abstractActivityC0005f.f70b;
        if (c0008i != null) {
            c0008i.e();
            abstractActivityC0005f.f70b.f();
        }
    }

    public final void c() {
        if (this.f77a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0005f abstractActivityC0005f = this.f77a;
        abstractActivityC0005f.getClass();
        try {
            Bundle g2 = abstractActivityC0005f.g();
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
        if (this.f82f != null) {
            this.f79c.getViewTreeObserver().removeOnPreDrawListener(this.f82f);
            this.f82f = null;
        }
        y yVar = this.f79c;
        if (yVar != null) {
            yVar.a();
            y yVar2 = this.f79c;
            yVar2.f127h.remove(this.f88l);
        }
    }

    public final void f() {
        if (this.f86j) {
            c();
            this.f77a.getClass();
            this.f77a.getClass();
            AbstractActivityC0005f abstractActivityC0005f = this.f77a;
            abstractActivityC0005f.getClass();
            if (abstractActivityC0005f.isChangingConfigurations()) {
                E.e eVar = this.f78b.f151d;
                if (eVar.f()) {
                    T.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        eVar.f183g = true;
                        for (Q.a aVar : eVar.f180d.values()) {
                            aVar.f359b.f173c.remove(aVar);
                            aVar.f359b = null;
                        }
                        eVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f78b.f151d.c();
            }
            io.flutter.plugin.platform.f fVar = this.f80d;
            if (fVar != null) {
                fVar.f648b.f4d = null;
                this.f80d = null;
            }
            R.a aVar2 = this.f81e;
            if (aVar2 != null) {
                aVar2.f364c.f111c = null;
                aVar2.f362a = null;
                this.f81e = null;
            }
            this.f77a.getClass();
            E.c cVar = this.f78b;
            if (cVar != null) {
                M.d dVar = cVar.f154g;
                dVar.a(1, dVar.f270c);
            }
            if (this.f77a.i()) {
                E.c cVar2 = this.f78b;
                Iterator it = cVar2.f168v.iterator();
                while (it.hasNext()) {
                    ((E.b) it.next()).b();
                }
                E.e eVar2 = cVar2.f151d;
                eVar2.e();
                HashMap hashMap = eVar2.f177a;
                Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    K.a aVar3 = (K.a) hashMap.get(cls);
                    if (aVar3 != null) {
                        T.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (aVar3 instanceof Q.a) {
                                if (eVar2.f()) {
                                    Q.a aVar4 = (Q.a) aVar3;
                                    aVar4.f359b.f173c.remove(aVar4);
                                    aVar4.f359b = null;
                                }
                                eVar2.f180d.remove(cls);
                            }
                            aVar3.b(eVar2.f179c);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.k kVar = cVar2.f166s;
                    SparseArray sparseArray = kVar.f675l;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    kVar.f684v.g(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.j jVar = cVar2.f167t;
                    SparseArray sparseArray2 = jVar.f658h;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    jVar.f664n.g(sparseArray2.keyAt(0));
                }
                cVar2.f150c.f200b.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = cVar2.f148a;
                flutterJNI.removeEngineLifecycleListener(cVar2.f170x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C.b.e().getClass();
                E.c.f147z.remove(Long.valueOf(cVar2.f169w));
                if (this.f77a.d() != null) {
                    if (E.i.f194c == null) {
                        E.i.f194c = new E.i(1);
                    }
                    E.i iVar = E.i.f194c;
                    iVar.f195a.remove(this.f77a.d());
                }
                this.f78b = null;
            }
            this.f86j = false;
        }
    }
}
