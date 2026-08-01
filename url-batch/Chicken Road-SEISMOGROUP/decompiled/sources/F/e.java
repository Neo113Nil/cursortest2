package F;

import E.AbstractActivityC0004e;
import E.C0007h;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public final c f253b;

    /* renamed from: c, reason: collision with root package name */
    public final A.a f254c;

    /* renamed from: e, reason: collision with root package name */
    public C0007h f256e;

    /* renamed from: f, reason: collision with root package name */
    public d f257f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f252a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f255d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f258g = false;

    public e(Context context, c cVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f253b = cVar;
        G.b bVar = cVar.f225c;
        i iVar = cVar.f241s.f718b;
        this.f254c = new A.a(3, context, bVar);
    }

    public final void a(K.a aVar) {
        T.a.b("FlutterEngineConnectionRegistry#add ".concat(aVar.getClass().getSimpleName()));
        try {
            Class<?> cls = aVar.getClass();
            HashMap hashMap = this.f252a;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f253b + ").");
                Trace.endSection();
                return;
            }
            aVar.toString();
            hashMap.put(aVar.getClass(), aVar);
            aVar.a(this.f254c);
            if (aVar instanceof Q.a) {
                Q.a aVar2 = (Q.a) aVar;
                this.f255d.put(aVar.getClass(), aVar2);
                if (f()) {
                    d dVar = this.f257f;
                    aVar2.f417c = dVar;
                    dVar.f248c.add(aVar2);
                }
            }
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

    public final void b(AbstractActivityC0004e abstractActivityC0004e, androidx.lifecycle.j jVar) {
        this.f257f = new d(abstractActivityC0004e, jVar);
        if (abstractActivityC0004e.getIntent() != null) {
            abstractActivityC0004e.getIntent().getBooleanExtra("enable-software-rendering", false);
        }
        c cVar = this.f253b;
        cVar.f241s.getClass();
        A.a aVar = cVar.f242u;
        io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) aVar.f3c;
        if (jVar2.f719c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar2.f719c = abstractActivityC0004e;
        jVar2.f722f = cVar.f224b;
        G.b bVar = cVar.f225c;
        jVar2.f724h = new B.k(bVar, 17);
        io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) aVar.f4d;
        if (iVar.f706c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        iVar.f706c = abstractActivityC0004e;
        B.k kVar = new B.k(bVar, 16);
        iVar.f709f = kVar;
        kVar.f44c = iVar.f717n;
        jVar2.f724h.f44c = aVar;
        for (Q.a aVar2 : this.f255d.values()) {
            if (this.f258g) {
                d dVar = this.f257f;
                aVar2.f417c = dVar;
                dVar.f248c.add(aVar2);
            } else {
                d dVar2 = this.f257f;
                aVar2.f417c = dVar2;
                dVar2.f248c.add(aVar2);
            }
        }
        this.f258g = false;
    }

    public final void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        T.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (Q.a aVar : this.f255d.values()) {
                aVar.f417c.f248c.remove(aVar);
                aVar.f417c = null;
            }
            d();
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

    public final void d() {
        c cVar = this.f253b;
        io.flutter.plugin.platform.j jVar = cVar.f241s;
        B.k kVar = jVar.f724h;
        if (kVar != null) {
            kVar.f44c = null;
        }
        jVar.c();
        jVar.f724h = null;
        jVar.f719c = null;
        jVar.f722f = null;
        io.flutter.plugin.platform.i iVar = cVar.t;
        B.k kVar2 = iVar.f709f;
        if (kVar2 != null) {
            kVar2.f44c = null;
        }
        Surface surface = iVar.f715l;
        if (surface != null) {
            surface.release();
            iVar.f715l = null;
            iVar.f716m = null;
        }
        iVar.f709f = null;
        iVar.f706c = null;
        this.f256e = null;
        this.f257f = null;
    }

    public final void e() {
        if (f()) {
            c();
        }
    }

    public final boolean f() {
        return this.f256e != null;
    }
}
