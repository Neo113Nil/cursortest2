package l0;

import N.P;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import e0.C0125d;
import java.util.HashMap;
import java.util.Iterator;
import k0.AbstractActivityC0187d;
import k0.C0190g;
import o0.C0211b;
import r0.InterfaceC0225a;
import s0.InterfaceC0227a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final c f2799b;

    /* renamed from: c, reason: collision with root package name */
    public final P f2800c;

    /* renamed from: e, reason: collision with root package name */
    public C0190g f2802e;

    /* renamed from: f, reason: collision with root package name */
    public C0125d f2803f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2798a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2801d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f2804g = false;

    public d(Context context, c cVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f2799b = cVar;
        m0.b bVar = cVar.f2777c;
        h hVar = cVar.f2793s.f2480e;
        this.f2800c = new P(15, context, bVar);
    }

    public final void a(InterfaceC0225a interfaceC0225a) {
        HashMap hashMap = this.f2798a;
        C0.a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC0225a.getClass().getSimpleName()));
        try {
            if (hashMap.containsKey(interfaceC0225a.getClass())) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0225a + ") but it was already registered with this FlutterEngine (" + this.f2799b + ").");
                Trace.endSection();
                return;
            }
            interfaceC0225a.toString();
            hashMap.put(interfaceC0225a.getClass(), interfaceC0225a);
            interfaceC0225a.c(this.f2800c);
            if (interfaceC0225a instanceof InterfaceC0227a) {
                InterfaceC0227a interfaceC0227a = (InterfaceC0227a) interfaceC0225a;
                this.f2801d.put(interfaceC0225a.getClass(), interfaceC0227a);
                if (f()) {
                    interfaceC0227a.d(this.f2803f);
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

    public final void b(AbstractActivityC0187d abstractActivityC0187d, androidx.lifecycle.j jVar) {
        this.f2803f = new C0125d(abstractActivityC0187d, jVar);
        if (abstractActivityC0187d.getIntent() != null) {
            abstractActivityC0187d.getIntent().getBooleanExtra("enable-software-rendering", false);
        }
        c cVar = this.f2799b;
        cVar.f2793s.getClass();
        P p2 = cVar.f2794u;
        io.flutter.embedding.engine.renderer.i iVar = cVar.f2776b;
        m0.b bVar = cVar.f2777c;
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) p2.f698f;
        if (lVar.f2481f != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        lVar.f2481f = abstractActivityC0187d;
        lVar.f2484i = iVar;
        lVar.f2486k = new C0211b(bVar, 11);
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) p2.f699g;
        if (kVar.f2468f != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        kVar.f2468f = abstractActivityC0187d;
        C0211b c0211b = new C0211b(bVar, 10);
        kVar.f2471i = c0211b;
        c0211b.f2915f = kVar.f2479q;
        lVar.f2486k.f2915f = p2;
        for (InterfaceC0227a interfaceC0227a : this.f2801d.values()) {
            if (this.f2804g) {
                interfaceC0227a.b(this.f2803f);
            } else {
                interfaceC0227a.d(this.f2803f);
            }
        }
        this.f2804g = false;
    }

    public final void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        C0.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f2801d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0227a) it.next()).a();
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
        c cVar = this.f2799b;
        io.flutter.plugin.platform.l lVar = cVar.f2793s;
        C0211b c0211b = lVar.f2486k;
        if (c0211b != null) {
            c0211b.f2915f = null;
        }
        lVar.c();
        lVar.f2486k = null;
        lVar.f2481f = null;
        lVar.f2484i = null;
        io.flutter.plugin.platform.k kVar = cVar.t;
        C0211b c0211b2 = kVar.f2471i;
        if (c0211b2 != null) {
            c0211b2.f2915f = null;
        }
        Surface surface = kVar.f2477o;
        if (surface != null) {
            surface.release();
            kVar.f2477o = null;
            kVar.f2478p = null;
        }
        kVar.f2471i = null;
        kVar.f2468f = null;
        this.f2802e = null;
        this.f2803f = null;
    }

    public final void e() {
        if (f()) {
            c();
        }
    }

    public final boolean f() {
        return this.f2802e != null;
    }
}
