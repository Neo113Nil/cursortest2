package e0;

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

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public f f154a;

    /* renamed from: b, reason: collision with root package name */
    public f0.c f155b;

    /* renamed from: c, reason: collision with root package name */
    public u f156c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f157d;

    /* renamed from: e, reason: collision with root package name */
    public r0.a f158e;

    /* renamed from: f, reason: collision with root package name */
    public h f159f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f160g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f161h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f163j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f164k;

    /* renamed from: l, reason: collision with root package name */
    public final g f165l = new g(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f162i = false;

    public i(f fVar) {
        this.f154a = fVar;
    }

    public final void a(f0.i iVar) {
        String b2 = this.f154a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = ((j0.d) c0.a.y().f66c).f657e.f645b;
        }
        g0.a aVar = new g0.a(b2, this.f154a.e());
        String f2 = this.f154a.f();
        if (f2 == null) {
            f fVar = this.f154a;
            fVar.getClass();
            f2 = d(fVar.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        iVar.f321b = aVar;
        iVar.f322c = f2;
        iVar.f323d = (List) this.f154a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        boolean i2 = this.f154a.i();
        f fVar = this.f154a;
        if (i2) {
            throw new AssertionError("The internal FlutterEngine created by " + fVar + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        fVar.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + fVar + " connection to the engine " + fVar.f144b.f155b + " evicted by another attaching activity");
        i iVar = fVar.f144b;
        if (iVar != null) {
            iVar.e();
            fVar.f144b.f();
        }
    }

    public final void c() {
        if (this.f154a != null) {
            return;
        }
        f0.l.b("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        f fVar = this.f154a;
        fVar.getClass();
        try {
            Bundle g2 = fVar.g();
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
        if (this.f159f != null) {
            this.f156c.getViewTreeObserver().removeOnPreDrawListener(this.f159f);
            this.f159f = null;
        }
        u uVar = this.f156c;
        if (uVar != null) {
            uVar.a();
            u uVar2 = this.f156c;
            uVar2.f217g.remove(this.f165l);
        }
    }

    public final void f() {
        if (this.f163j) {
            c();
            this.f154a.getClass();
            this.f154a.getClass();
            f fVar = this.f154a;
            fVar.getClass();
            boolean isChangingConfigurations = fVar.isChangingConfigurations();
            f0.c cVar = this.f155b;
            if (isChangingConfigurations) {
                f0.e eVar = cVar.f271d;
                if (eVar.e()) {
                    s0.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        eVar.f301g = true;
                        for (q0.a aVar : eVar.f298d.values()) {
                            aVar.f1086b.f291c.remove(aVar);
                            aVar.f1086b = null;
                        }
                        eVar.c();
                        Trace.endSection();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                cVar.f271d.b();
            }
            io.flutter.plugin.platform.e eVar2 = this.f157d;
            if (eVar2 != null) {
                eVar2.f495b.f67d = null;
                this.f157d = null;
            }
            r0.a aVar2 = this.f158e;
            if (aVar2 != null) {
                aVar2.f1144c.f40c = null;
                aVar2.f1142a = null;
                this.f158e = null;
            }
            this.f154a.getClass();
            f0.c cVar2 = this.f155b;
            if (cVar2 != null) {
                m0.c cVar3 = cVar2.f274g;
                cVar3.a(1, cVar3.f770c);
            }
            if (this.f154a.i()) {
                f0.c cVar4 = this.f155b;
                FlutterJNI flutterJNI = cVar4.f268a;
                Iterator it = cVar4.v.iterator();
                while (it.hasNext()) {
                    ((f0.b) it.next()).b();
                }
                f0.e eVar3 = cVar4.f271d;
                eVar3.d();
                HashMap hashMap = eVar3.f295a;
                Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    q0.a aVar3 = (q0.a) hashMap.get(cls);
                    if (aVar3 != null) {
                        s0.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (eVar3.e()) {
                                aVar3.f1086b.f291c.remove(aVar3);
                                aVar3.f1086b = null;
                            }
                            eVar3.f298d.remove(cls);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                            try {
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                }
                hashMap.clear();
                io.flutter.plugin.platform.j jVar = cVar4.f285s;
                SparseArray sparseArray = jVar.f523l;
                while (sparseArray.size() > 0) {
                    jVar.v.m(sparseArray.keyAt(0));
                }
                io.flutter.plugin.platform.i iVar = cVar4.f286t;
                SparseArray sparseArray2 = iVar.f506h;
                while (sparseArray2.size() > 0) {
                    iVar.f512o.m(sparseArray2.keyAt(0));
                }
                cVar4.f270c.f334b.setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(cVar4.f288x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                c0.a.y().getClass();
                f0.c.f267z.remove(Long.valueOf(cVar4.f287w));
                if (this.f154a.d() != null) {
                    if (f0.k.f328c == null) {
                        f0.k.f328c = new f0.k(1);
                    }
                    f0.k kVar = f0.k.f328c;
                    kVar.f329a.remove(this.f154a.d());
                }
                this.f155b = null;
            }
            this.f163j = false;
        }
    }
}
