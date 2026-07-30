package f0;

import android.content.Intent;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.HashMap;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public final c f296b;

    /* renamed from: c, reason: collision with root package name */
    public final j0.d f297c;

    /* renamed from: e, reason: collision with root package name */
    public e0.i f299e;

    /* renamed from: f, reason: collision with root package name */
    public d f300f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f295a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f298d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f301g = false;

    public e(c cVar, j0.d dVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f296b = cVar;
        this.f297c = dVar;
        k kVar = cVar.f285s.f513b;
    }

    public final void a(e0.f fVar, androidx.lifecycle.f fVar2) {
        this.f300f = new d(fVar, fVar2);
        Intent intent = fVar.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            String str = g.f312h.f303b;
        } else {
            boolean z2 = this.f297c.f653a;
        }
        c cVar = this.f296b;
        cVar.f285s.getClass();
        c0.a aVar = cVar.u;
        io.flutter.embedding.engine.renderer.h hVar = cVar.f269b;
        g0.b bVar = cVar.f270c;
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) aVar.f66c;
        if (jVar.f514c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar.f514c = fVar;
        jVar.f517f = hVar;
        jVar.f519h = new androidx.lifecycle.n(bVar, 19);
        io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) aVar.f67d;
        if (iVar.f501c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        iVar.f501c = fVar;
        androidx.lifecycle.n nVar = new androidx.lifecycle.n(bVar, 18);
        iVar.f504f = nVar;
        nVar.f40c = iVar.f512o;
        jVar.f519h.f40c = aVar;
        for (q0.a aVar2 : this.f298d.values()) {
            boolean z3 = this.f301g;
            d dVar = this.f300f;
            if (z3) {
                aVar2.f1086b = dVar;
                dVar.f291c.add(aVar2);
            } else {
                aVar2.f1086b = dVar;
                dVar.f291c.add(aVar2);
            }
        }
        this.f301g = false;
    }

    public final void b() {
        if (!e()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        s0.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (q0.a aVar : this.f298d.values()) {
                aVar.f1086b.f291c.remove(aVar);
                aVar.f1086b = null;
            }
            c();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        c cVar = this.f296b;
        io.flutter.plugin.platform.j jVar = cVar.f285s;
        androidx.lifecycle.n nVar = jVar.f519h;
        if (nVar != null) {
            nVar.f40c = null;
        }
        jVar.c();
        jVar.f519h = null;
        jVar.f514c = null;
        jVar.f517f = null;
        io.flutter.plugin.platform.i iVar = cVar.f286t;
        androidx.lifecycle.n nVar2 = iVar.f504f;
        if (nVar2 != null) {
            nVar2.f40c = null;
        }
        Surface surface = iVar.f510l;
        if (surface != null) {
            surface.release();
            iVar.f510l = null;
            iVar.m = null;
        }
        iVar.f504f = null;
        iVar.f501c = null;
        this.f299e = null;
        this.f300f = null;
    }

    public final void d() {
        if (e()) {
            b();
        }
    }

    public final boolean e() {
        return this.f299e != null;
    }
}
