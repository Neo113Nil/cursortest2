package J;

import L.Q;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import c0.AbstractActivityC0104f;
import c0.C0107i;
import e0.C0114b;
import j0.C0177a;
import j0.InterfaceC0178b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import k0.InterfaceC0180a;
import m0.C0193c;
import t0.AbstractC0236a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f419a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f420b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f421c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f422d;

    /* renamed from: e, reason: collision with root package name */
    public Object f423e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f424f;

    /* renamed from: g, reason: collision with root package name */
    public Object f425g;

    /* renamed from: h, reason: collision with root package name */
    public Object f426h;

    public b(Context context, d0.c cVar, h0.d dVar) {
        this.f420b = new HashMap();
        this.f424f = new HashMap();
        this.f419a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f421c = cVar;
        this.f422d = dVar;
        C0114b c0114b = cVar.f1790c;
        d0.j jVar = cVar.f1805s.f2477e;
        this.f423e = new C0177a(context, cVar, c0114b);
    }

    public void a(InterfaceC0178b interfaceC0178b) {
        AbstractC0236a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC0178b.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC0178b.getClass();
            HashMap hashMap = (HashMap) this.f420b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0178b + ") but it was already registered with this FlutterEngine (" + ((d0.c) this.f421c) + ").");
                Trace.endSection();
                return;
            }
            interfaceC0178b.toString();
            hashMap.put(interfaceC0178b.getClass(), interfaceC0178b);
            interfaceC0178b.onAttachedToEngine((C0177a) this.f423e);
            if (interfaceC0178b instanceof InterfaceC0180a) {
                InterfaceC0180a interfaceC0180a = (InterfaceC0180a) interfaceC0178b;
                ((HashMap) this.f424f).put(interfaceC0178b.getClass(), interfaceC0180a);
                if (f()) {
                    interfaceC0180a.onAttachedToActivity((d0.d) this.f426h);
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

    public void b(AbstractActivityC0104f abstractActivityC0104f, androidx.lifecycle.j jVar) {
        this.f426h = new d0.d(abstractActivityC0104f, jVar);
        Intent intent = abstractActivityC0104f.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            String str = d0.f.f1827h.f1818b;
        } else {
            boolean z2 = ((h0.d) this.f422d).f2336a;
        }
        d0.c cVar = (d0.c) this.f421c;
        cVar.f1805s.getClass();
        Q q2 = cVar.f1807u;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) q2.f515f;
        if (kVar.f2478f != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        kVar.f2478f = abstractActivityC0104f;
        kVar.f2481i = cVar.f1789b;
        C0114b c0114b = cVar.f1790c;
        kVar.f2483k = new C0193c(c0114b, 8);
        io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) q2.f516g;
        if (jVar2.f2465f != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar2.f2465f = abstractActivityC0104f;
        C0193c c0193c = new C0193c(c0114b, 7);
        jVar2.f2468i = c0193c;
        c0193c.f2706f = jVar2.r;
        kVar.f2483k.f2706f = q2;
        for (InterfaceC0180a interfaceC0180a : ((HashMap) this.f424f).values()) {
            if (this.f419a) {
                interfaceC0180a.onReattachedToActivityForConfigChanges((d0.d) this.f426h);
            } else {
                interfaceC0180a.onAttachedToActivity((d0.d) this.f426h);
            }
        }
        this.f419a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        AbstractC0236a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f424f).values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0180a) it.next()).onDetachedFromActivity();
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

    public void d() {
        d0.c cVar = (d0.c) this.f421c;
        io.flutter.plugin.platform.k kVar = cVar.f1805s;
        C0193c c0193c = kVar.f2483k;
        if (c0193c != null) {
            c0193c.f2706f = null;
        }
        kVar.d();
        kVar.f2483k = null;
        kVar.f2478f = null;
        kVar.f2481i = null;
        io.flutter.plugin.platform.j jVar = cVar.f1806t;
        C0193c c0193c2 = jVar.f2468i;
        if (c0193c2 != null) {
            c0193c2.f2706f = null;
        }
        Surface surface = jVar.f2474o;
        if (surface != null) {
            surface.release();
            jVar.f2474o = null;
            jVar.f2475p = null;
        }
        jVar.f2468i = null;
        jVar.f2465f = null;
        this.f425g = null;
        this.f426h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0107i) this.f425g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((e) this.f421c).h();
            }
            return null;
        }
    }

    public void h(final int i2, final Serializable serializable) {
        ((Executor) this.f420b).execute(new Runnable() { // from class: J.a
            @Override // java.lang.Runnable
            public final void run() {
                ((e) b.this.f421c).g(i2, serializable);
            }
        });
    }

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f419a = false;
        this.f420b = executor;
        this.f421c = eVar;
        this.f425g = str;
        this.f424f = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 25:
                    bArr = f.f443h;
                    break;
                case 26:
                    bArr = f.f442g;
                    break;
                case 27:
                    bArr = f.f441f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f440e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.f439d;
                    break;
            }
        }
        this.f422d = bArr;
    }
}
