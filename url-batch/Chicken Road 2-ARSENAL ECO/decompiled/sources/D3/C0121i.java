package D3;

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
import u0.C0689s;

/* renamed from: D3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121i {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0117e f425a;

    /* renamed from: b, reason: collision with root package name */
    public E3.c f426b;

    /* renamed from: c, reason: collision with root package name */
    public t f427c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.f f428d;

    /* renamed from: e, reason: collision with root package name */
    public D1.b f429e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0119g f430f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f431g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f432h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f434j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f435k;

    /* renamed from: l, reason: collision with root package name */
    public final C0118f f436l = new C0118f(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f433i = false;

    public C0121i(AbstractActivityC0117e abstractActivityC0117e) {
        this.f425a = abstractActivityC0117e;
    }

    public final void a(E3.h hVar) {
        String a7 = this.f425a.a();
        if (a7 == null || a7.isEmpty()) {
            a7 = (String) ((I3.c) C0689s.t().f6034f).f1195e.f1211c;
        }
        F3.a aVar = new F3.a(a7, this.f425a.d());
        String e4 = this.f425a.e();
        if (e4 == null) {
            AbstractActivityC0117e abstractActivityC0117e = this.f425a;
            abstractActivityC0117e.getClass();
            e4 = d(abstractActivityC0117e.getIntent());
            if (e4 == null) {
                e4 = "/";
            }
        }
        hVar.f652b = aVar;
        hVar.f653c = e4;
        hVar.f654d = (List) this.f425a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f425a.h()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f425a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0117e abstractActivityC0117e = this.f425a;
        abstractActivityC0117e.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0117e + " connection to the engine " + abstractActivityC0117e.f418g.f426b + " evicted by another attaching activity");
        C0121i c0121i = abstractActivityC0117e.f418g;
        if (c0121i != null) {
            c0121i.e();
            abstractActivityC0117e.f418g.f();
        }
    }

    public final void c() {
        if (this.f425a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z5;
        Uri data;
        AbstractActivityC0117e abstractActivityC0117e = this.f425a;
        abstractActivityC0117e.getClass();
        try {
            Bundle f7 = abstractActivityC0117e.f();
            z5 = (f7 == null || !f7.containsKey("flutter_deeplinking_enabled")) ? true : f7.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z5 = false;
        }
        if (!z5 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f430f != null) {
            this.f427c.getViewTreeObserver().removeOnPreDrawListener(this.f430f);
            this.f430f = null;
        }
        t tVar = this.f427c;
        if (tVar != null) {
            tVar.a();
            t tVar2 = this.f427c;
            tVar2.f477l.remove(this.f436l);
        }
    }

    public final void f() {
        if (this.f434j) {
            c();
            this.f425a.getClass();
            this.f425a.getClass();
            AbstractActivityC0117e abstractActivityC0117e = this.f425a;
            abstractActivityC0117e.getClass();
            if (abstractActivityC0117e.isChangingConfigurations()) {
                E3.d dVar = this.f426b.f603d;
                if (dVar.f()) {
                    T3.a.d("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        dVar.f624a = true;
                        Iterator it = ((HashMap) dVar.f626c).values().iterator();
                        while (it.hasNext()) {
                            ((L3.a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        dVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f426b.f603d.c();
            }
            io.flutter.plugin.platform.f fVar = this.f428d;
            if (fVar != null) {
                fVar.f4556b.f5990g = null;
                this.f428d = null;
            }
            D1.b bVar = this.f429e;
            if (bVar != null) {
                ((J1.c) bVar.f370d).f1289g = null;
                bVar.f369c = null;
                this.f429e = null;
            }
            this.f425a.getClass();
            E3.c cVar = this.f426b;
            if (cVar != null) {
                N3.c cVar2 = cVar.f606g;
                cVar2.a(1, cVar2.f1683c);
            }
            if (this.f425a.h()) {
                E3.c cVar3 = this.f426b;
                FlutterJNI flutterJNI = cVar3.f600a;
                Iterator it2 = cVar3.f621v.iterator();
                while (it2.hasNext()) {
                    ((E3.b) it2.next()).a();
                }
                E3.d dVar2 = cVar3.f603d;
                dVar2.e();
                HashMap hashMap = (HashMap) dVar2.f625b;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    K3.b bVar2 = (K3.b) hashMap.get(cls);
                    if (bVar2 != null) {
                        T3.a.d("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar2 instanceof L3.a) {
                                if (dVar2.f()) {
                                    ((L3.a) bVar2).onDetachedFromActivity();
                                }
                                ((HashMap) dVar2.f626c).remove(cls);
                            }
                            bVar2.onDetachedFromEngine((K3.a) dVar2.f629f);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                io.flutter.plugin.platform.l lVar = cVar3.f618s;
                SparseArray sparseArray = lVar.f4585p;
                while (sparseArray.size() > 0) {
                    lVar.f4594z.n(sparseArray.keyAt(0));
                }
                io.flutter.plugin.platform.k kVar = cVar3.f619t;
                SparseArray sparseArray2 = kVar.f4567l;
                while (sparseArray2.size() > 0) {
                    kVar.f4574s.d(sparseArray2.keyAt(0));
                }
                cVar3.f602c.f712f.setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(cVar3.f623x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0689s.t().getClass();
                E3.c.f599z.remove(Long.valueOf(cVar3.f622w));
                if (this.f425a.c() != null) {
                    if (J1.c.f1287i == null) {
                        J1.c.f1287i = new J1.c(4);
                    }
                    J1.c cVar4 = J1.c.f1287i;
                    ((HashMap) cVar4.f1289g).remove(this.f425a.c());
                }
                this.f426b = null;
            }
            this.f434j = false;
        }
    }
}
