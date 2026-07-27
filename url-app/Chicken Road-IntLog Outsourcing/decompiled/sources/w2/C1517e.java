package w2;

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
import x2.C1543f;
import x2.C1545h;
import x2.InterfaceC1539b;
import y2.C1556a;

/* renamed from: w2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1517e {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC1515c f12133a;

    /* renamed from: b, reason: collision with root package name */
    public FlutterEngine f12134b;

    /* renamed from: c, reason: collision with root package name */
    public m f12135c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.f f12136d;

    /* renamed from: e, reason: collision with root package name */
    public B3.d f12137e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC1516d f12138f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12139g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12140h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12142j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f12143k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f12144l = new io.flutter.embedding.engine.renderer.a(1, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f12141i = false;

    public C1517e(AbstractActivityC1515c abstractActivityC1515c) {
        this.f12133a = abstractActivityC1515c;
    }

    public final void a(C1543f c1543f) {
        String a6 = this.f12133a.a();
        if (a6 == null || a6.isEmpty()) {
            a6 = (String) ((B2.e) B4.i.K().f311b).f255e.f241c;
        }
        C1556a c1556a = new C1556a(a6, this.f12133a.d());
        String e3 = this.f12133a.e();
        if (e3 == null) {
            AbstractActivityC1515c abstractActivityC1515c = this.f12133a;
            abstractActivityC1515c.getClass();
            e3 = d(abstractActivityC1515c.getIntent());
            if (e3 == null) {
                e3 = "/";
            }
        }
        c1543f.f12291b = c1556a;
        c1543f.f12292c = e3;
        c1543f.f12293d = (List) this.f12133a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f12133a.h()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f12133a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC1515c abstractActivityC1515c = this.f12133a;
        abstractActivityC1515c.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC1515c + " connection to the engine " + abstractActivityC1515c.f12128b.f12134b + " evicted by another attaching activity");
        C1517e c1517e = abstractActivityC1515c.f12128b;
        if (c1517e != null) {
            c1517e.e();
            abstractActivityC1515c.f12128b.f();
        }
    }

    public final void c() {
        if (this.f12133a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z;
        Uri data;
        AbstractActivityC1515c abstractActivityC1515c = this.f12133a;
        abstractActivityC1515c.getClass();
        try {
            Bundle f3 = abstractActivityC1515c.f();
            z = (f3 == null || !f3.containsKey("flutter_deeplinking_enabled")) ? true : f3.getBoolean("flutter_deeplinking_enabled");
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
        if (this.f12138f != null) {
            this.f12135c.getViewTreeObserver().removeOnPreDrawListener(this.f12138f);
            this.f12138f = null;
        }
        m mVar = this.f12135c;
        if (mVar != null) {
            mVar.a();
            m mVar2 = this.f12135c;
            mVar2.f12176g.remove(this.f12144l);
        }
    }

    public final void f() {
        if (this.f12142j) {
            c();
            this.f12133a.getClass();
            this.f12133a.getClass();
            AbstractActivityC1515c abstractActivityC1515c = this.f12133a;
            abstractActivityC1515c.getClass();
            if (abstractActivityC1515c.isChangingConfigurations()) {
                U.b bVar = this.f12134b.f10085d;
                if (bVar.f()) {
                    O2.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        bVar.f3035a = true;
                        Iterator it = ((HashMap) bVar.f3040f).values().iterator();
                        while (it.hasNext()) {
                            ((E2.a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        bVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f12134b.f10085d.c();
            }
            io.flutter.plugin.platform.f fVar = this.f12136d;
            if (fVar != null) {
                fVar.f10216b.f147c = null;
                this.f12136d = null;
            }
            B3.d dVar = this.f12137e;
            if (dVar != null) {
                ((B1.g) dVar.f278d).f215b = null;
                dVar.f277c = null;
                this.f12137e = null;
            }
            this.f12133a.getClass();
            FlutterEngine flutterEngine = this.f12134b;
            if (flutterEngine != null) {
                G2.b bVar2 = flutterEngine.f10088g;
                bVar2.a(1, bVar2.f929c);
            }
            if (this.f12133a.h()) {
                FlutterEngine flutterEngine2 = this.f12134b;
                Iterator it2 = flutterEngine2.f10103v.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1539b) it2.next()).a();
                }
                U.b bVar3 = flutterEngine2.f10085d;
                bVar3.e();
                HashMap hashMap = (HashMap) bVar3.f3036b;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    D2.b bVar4 = (D2.b) hashMap.get(cls);
                    if (bVar4 != null) {
                        O2.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar4 instanceof E2.a) {
                                if (bVar3.f()) {
                                    ((E2.a) bVar4).onDetachedFromActivity();
                                }
                                ((HashMap) bVar3.f3040f).remove(cls);
                            }
                            bVar4.onDetachedFromEngine((D2.a) bVar3.f3039e);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.m mVar = flutterEngine2.f10100s;
                    SparseArray sparseArray = mVar.f10245k;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    mVar.f10255u.r(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.l lVar = flutterEngine2.f10101t;
                    SparseArray sparseArray2 = lVar.f10227g;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    lVar.f10234n.C(sparseArray2.keyAt(0));
                }
                flutterEngine2.f10084c.f12346a.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = flutterEngine2.f10082a;
                flutterJNI.removeEngineLifecycleListener(flutterEngine2.f10105x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                B4.i.K().getClass();
                FlutterEngine.z.remove(Long.valueOf(flutterEngine2.f10104w));
                if (this.f12133a.c() != null) {
                    if (C1545h.f12298c == null) {
                        C1545h.f12298c = new C1545h(3);
                    }
                    C1545h c1545h = C1545h.f12298c;
                    c1545h.f12299a.remove(this.f12133a.c());
                }
                this.f12134b = null;
            }
            this.f12142j = false;
        }
    }
}
