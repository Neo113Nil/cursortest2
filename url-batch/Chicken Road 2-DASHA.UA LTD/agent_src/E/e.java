package E;

import D.AbstractActivityC0005f;
import D.C0008i;
import D.u;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public final c f178b;

    /* renamed from: c, reason: collision with root package name */
    public final B.a f179c;

    /* renamed from: e, reason: collision with root package name */
    public C0008i f181e;

    /* renamed from: f, reason: collision with root package name */
    public d f182f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f177a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f180d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f183g = false;

    public e(Context context, c cVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f178b = cVar;
        F.b bVar = cVar.f150c;
        i iVar = cVar.f166s.f665b;
        this.f179c = new B.a(3, context, bVar);
    }

    public final void a(K.a aVar) {
        T.a.b("FlutterEngineConnectionRegistry#add ".concat(aVar.getClass().getSimpleName()));
        try {
            Class<?> cls = aVar.getClass();
            HashMap hashMap = this.f177a;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f178b + ").");
                Trace.endSection();
                return;
            }
            aVar.toString();
            hashMap.put(aVar.getClass(), aVar);
            aVar.a(this.f179c);
            if (aVar instanceof Q.a) {
                Q.a aVar2 = (Q.a) aVar;
                this.f180d.put(aVar.getClass(), aVar2);
                if (f()) {
                    d dVar = this.f182f;
                    aVar2.f359b = dVar;
                    dVar.f173c.add(aVar2);
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

    public final void b(AbstractActivityC0005f abstractActivityC0005f, androidx.lifecycle.j jVar) {
        this.f182f = new d(abstractActivityC0005f, jVar);
        if (abstractActivityC0005f.getIntent() != null) {
            abstractActivityC0005f.getIntent().getBooleanExtra("enable-software-rendering", false);
        }
        c cVar = this.f178b;
        cVar.f166s.getClass();
        B.a aVar = cVar.u;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) aVar.f3c;
        if (kVar.f666c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        kVar.f666c = abstractActivityC0005f;
        kVar.f669f = cVar.f149b;
        F.b bVar = cVar.f150c;
        kVar.f671h = new u(bVar, 16);
        io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) aVar.f4d;
        if (jVar2.f653c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar2.f653c = abstractActivityC0005f;
        u uVar = new u(bVar, 15);
        jVar2.f656f = uVar;
        uVar.f111c = jVar2.f664n;
        kVar.f671h.f111c = aVar;
        for (Q.a aVar2 : this.f180d.values()) {
            if (this.f183g) {
                d dVar = this.f182f;
                aVar2.f359b = dVar;
                dVar.f173c.add(aVar2);
            } else {
                d dVar2 = this.f182f;
                aVar2.f359b = dVar2;
                dVar2.f173c.add(aVar2);
            }
        }
        this.f183g = false;
    }

    public final void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        T.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (Q.a aVar : this.f180d.values()) {
                aVar.f359b.f173c.remove(aVar);
                aVar.f359b = null;
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
        c cVar = this.f178b;
        io.flutter.plugin.platform.k kVar = cVar.f166s;
        u uVar = kVar.f671h;
        if (uVar != null) {
            uVar.f111c = null;
        }
        kVar.c();
        kVar.f671h = null;
        kVar.f666c = null;
        kVar.f669f = null;
        io.flutter.plugin.platform.j jVar = cVar.f167t;
        u uVar2 = jVar.f656f;
        if (uVar2 != null) {
            uVar2.f111c = null;
        }
        Surface surface = jVar.f662l;
        if (surface != null) {
            surface.release();
            jVar.f662l = null;
            jVar.f663m = null;
        }
        jVar.f656f = null;
        jVar.f653c = null;
        this.f181e = null;
        this.f182f = null;
    }

    public final void e() {
        if (f()) {
            c();
        }
    }

    public final boolean f() {
        return this.f181e != null;
    }
}
