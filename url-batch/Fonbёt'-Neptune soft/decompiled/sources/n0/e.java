package n0;

import I.C0079n;
import P.O;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.n;
import io.flutter.plugin.platform.o;
import j.C0239o;
import java.util.HashMap;
import java.util.Iterator;
import m0.AbstractActivityC0264d;
import m0.C0267g;
import q0.C0287d;
import s0.InterfaceC0304a;
import t0.InterfaceC0308a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public final c f3286b;

    /* renamed from: c, reason: collision with root package name */
    public final C0079n f3287c;

    /* renamed from: e, reason: collision with root package name */
    public C0267g f3289e;

    /* renamed from: f, reason: collision with root package name */
    public C0239o f3290f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3285a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3288d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f3291g = false;

    public e(Context context, c cVar, C0287d c0287d) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f3286b = cVar;
        this.f3287c = new C0079n(context, cVar.f3265c, cVar.f3280r.f2655a, new d(0, c0287d));
    }

    public final void a(InterfaceC0304a interfaceC0304a) {
        E0.a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC0304a.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC0304a.getClass();
            HashMap hashMap = this.f3285a;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0304a + ") but it was already registered with this FlutterEngine (" + this.f3286b + ").");
                Trace.endSection();
                return;
            }
            interfaceC0304a.toString();
            hashMap.put(interfaceC0304a.getClass(), interfaceC0304a);
            interfaceC0304a.j(this.f3287c);
            if (interfaceC0304a instanceof InterfaceC0308a) {
                InterfaceC0308a interfaceC0308a = (InterfaceC0308a) interfaceC0304a;
                this.f3288d.put(interfaceC0304a.getClass(), interfaceC0308a);
                if (e()) {
                    interfaceC0308a.a(this.f3290f);
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

    public final void b(AbstractActivityC0264d abstractActivityC0264d, n nVar) {
        this.f3290f = new C0239o(abstractActivityC0264d, nVar);
        boolean booleanExtra = abstractActivityC0264d.getIntent() != null ? abstractActivityC0264d.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        c cVar = this.f3286b;
        o oVar = cVar.f3280r;
        oVar.f2675u = booleanExtra;
        if (oVar.f2657c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        oVar.f2657c = abstractActivityC0264d;
        oVar.f2659e = cVar.f3264b;
        O o2 = new O(cVar.f3265c, 17);
        oVar.f2661g = o2;
        o2.f876g = oVar.v;
        for (InterfaceC0308a interfaceC0308a : this.f3288d.values()) {
            if (this.f3291g) {
                interfaceC0308a.b(this.f3290f);
            } else {
                interfaceC0308a.a(this.f3290f);
            }
        }
        this.f3291g = false;
    }

    public final void c() {
        if (!e()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        E0.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f3288d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0308a) it.next()).c();
            }
            o oVar = this.f3286b.f3280r;
            O o2 = oVar.f2661g;
            if (o2 != null) {
                o2.f876g = null;
            }
            oVar.c();
            oVar.f2661g = null;
            oVar.f2657c = null;
            oVar.f2659e = null;
            this.f3289e = null;
            this.f3290f = null;
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
        if (e()) {
            c();
        }
    }

    public final boolean e() {
        return this.f3289e != null;
    }
}
