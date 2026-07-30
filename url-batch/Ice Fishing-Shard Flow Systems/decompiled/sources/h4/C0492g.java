package h4;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import e0.C0370a;
import i4.C0547c;
import i4.C0551g;
import i4.C0553i;
import i4.InterfaceC0546b;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.C0560f;
import j4.C0572a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m4.C0690c;
import p4.InterfaceC0828a;

/* renamed from: h4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492g {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0488c f5198a;

    /* renamed from: b, reason: collision with root package name */
    public C0547c f5199b;

    /* renamed from: c, reason: collision with root package name */
    public p f5200c;

    /* renamed from: d, reason: collision with root package name */
    public C0560f f5201d;

    /* renamed from: e, reason: collision with root package name */
    public B6.o f5202e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0490e f5203f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5204g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5205h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f5207k;

    /* renamed from: l, reason: collision with root package name */
    public final C0489d f5208l = new C0489d(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f5206i = false;

    public C0492g(AbstractActivityC0488c abstractActivityC0488c) {
        this.f5198a = abstractActivityC0488c;
    }

    public final void a(C0551g c0551g) {
        String a7 = this.f5198a.a();
        if (a7 == null || a7.isEmpty()) {
            a7 = (String) ((C0690c) D0.j.Q().f330e).f6538e.f7206c;
        }
        C0572a c0572a = new C0572a(a7, this.f5198a.d());
        String e7 = this.f5198a.e();
        if (e7 == null) {
            AbstractActivityC0488c abstractActivityC0488c = this.f5198a;
            abstractActivityC0488c.getClass();
            e7 = d(abstractActivityC0488c.getIntent());
            if (e7 == null) {
                e7 = "/";
            }
        }
        c0551g.f5543b = c0572a;
        c0551g.f5544c = e7;
        c0551g.f5545d = (List) this.f5198a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f5198a.h()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f5198a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0488c abstractActivityC0488c = this.f5198a;
        abstractActivityC0488c.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0488c + " connection to the engine " + abstractActivityC0488c.f5191e.f5199b + " evicted by another attaching activity");
        C0492g c0492g = abstractActivityC0488c.f5191e;
        if (c0492g != null) {
            c0492g.e();
            abstractActivityC0488c.f5191e.f();
        }
    }

    public final void c() {
        if (this.f5198a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z7;
        Uri data;
        AbstractActivityC0488c abstractActivityC0488c = this.f5198a;
        abstractActivityC0488c.getClass();
        try {
            Bundle f7 = abstractActivityC0488c.f();
            z7 = (f7 == null || !f7.containsKey("flutter_deeplinking_enabled")) ? true : f7.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z7 = false;
        }
        if (!z7 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f5203f != null) {
            this.f5200c.getViewTreeObserver().removeOnPreDrawListener(this.f5203f);
            this.f5203f = null;
        }
        p pVar = this.f5200c;
        if (pVar != null) {
            pVar.a();
            p pVar2 = this.f5200c;
            pVar2.f5248o.remove(this.f5208l);
        }
    }

    public final void f() {
        if (this.j) {
            c();
            this.f5198a.getClass();
            this.f5198a.getClass();
            AbstractActivityC0488c abstractActivityC0488c = this.f5198a;
            abstractActivityC0488c.getClass();
            if (abstractActivityC0488c.isChangingConfigurations()) {
                C0370a c0370a = this.f5199b.f5504d;
                if (c0370a.f()) {
                    A4.a.d("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        c0370a.f4666a = true;
                        Iterator it = ((HashMap) c0370a.f4671f).values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC0828a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        c0370a.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f5199b.f5504d.c();
            }
            C0560f c0560f = this.f5201d;
            if (c0560f != null) {
                c0560f.f5698b.f2195i = null;
                this.f5201d = null;
            }
            B6.o oVar = this.f5202e;
            if (oVar != null) {
                ((l4.b) oVar.f231d).f6272e = null;
                oVar.f230c = null;
                this.f5202e = null;
            }
            this.f5198a.getClass();
            C0547c c0547c = this.f5199b;
            if (c0547c != null) {
                r4.c cVar = c0547c.f5507g;
                cVar.a(1, cVar.f7464c);
            }
            if (this.f5198a.h()) {
                C0547c c0547c2 = this.f5199b;
                FlutterJNI flutterJNI = c0547c2.f5501a;
                Iterator it2 = c0547c2.f5521v.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC0546b) it2.next()).a();
                }
                C0370a c0370a2 = c0547c2.f5504d;
                c0370a2.e();
                HashMap hashMap = (HashMap) c0370a2.f4667b;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    o4.c cVar2 = (o4.c) hashMap.get(cls);
                    if (cVar2 != null) {
                        A4.a.d("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (cVar2 instanceof InterfaceC0828a) {
                                if (c0370a2.f()) {
                                    ((InterfaceC0828a) cVar2).onDetachedFromActivity();
                                }
                                ((HashMap) c0370a2.f4671f).remove(cls);
                            }
                            cVar2.onDetachedFromEngine((o4.b) c0370a2.f4670e);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                io.flutter.plugin.platform.u uVar = c0547c2.f5518s;
                SparseArray sparseArray = uVar.f5764t;
                while (sparseArray.size() > 0) {
                    uVar.f5752E.s(sparseArray.keyAt(0));
                }
                io.flutter.plugin.platform.t tVar = c0547c2.f5519t;
                SparseArray sparseArray2 = tVar.f5738q;
                while (sparseArray2.size() > 0) {
                    tVar.f5746y.s(sparseArray2.keyAt(0));
                }
                ((FlutterJNI) c0547c2.f5503c.f5957i).setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(c0547c2.f5523x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                D0.j.Q().getClass();
                C0547c.f5500z.remove(Long.valueOf(c0547c2.f5522w));
                if (this.f5198a.c() != null) {
                    if (C0553i.f5550c == null) {
                        C0553i.f5550c = new C0553i(1);
                    }
                    C0553i c0553i = C0553i.f5550c;
                    c0553i.f5551a.remove(this.f5198a.c());
                }
                this.f5199b = null;
            }
            this.j = false;
        }
    }
}
