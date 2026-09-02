package E3;

import D3.AbstractActivityC0117e;
import D3.C0121i;
import D3.M;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.C0255w;
import com.onesignal.debug.internal.crash.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import u0.C0689s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f624a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f625b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f626c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f627d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f628e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f629f;

    /* renamed from: g, reason: collision with root package name */
    public Object f630g;

    /* renamed from: h, reason: collision with root package name */
    public Object f631h;

    public d(Context context, c cVar, I3.c cVar2) {
        this.f625b = new HashMap();
        this.f626c = new HashMap();
        this.f624a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f627d = cVar;
        this.f628e = cVar2;
        F3.b bVar = cVar.f602c;
        j jVar = cVar.f618s.f4575f;
        this.f629f = new K3.a(context, cVar, bVar);
    }

    public void a(K3.b bVar) {
        HashMap hashMap = (HashMap) this.f625b;
        T3.a.d("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            if (hashMap.containsKey(bVar.getClass())) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((c) this.f627d) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((K3.a) this.f629f);
            if (bVar instanceof L3.a) {
                L3.a aVar = (L3.a) bVar;
                ((HashMap) this.f626c).put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((D0.h) this.f631h);
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

    public void b(AbstractActivityC0117e abstractActivityC0117e, C0255w c0255w) {
        this.f631h = new D0.h(abstractActivityC0117e, c0255w);
        Intent intent = abstractActivityC0117e.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            String str = f.f642h.f633b;
        } else {
            boolean z5 = ((I3.c) this.f628e).f1191a;
        }
        c cVar = (c) this.f627d;
        cVar.f618s.getClass();
        C0689s c0689s = cVar.f620u;
        io.flutter.embedding.engine.renderer.h hVar = cVar.f601b;
        F3.b bVar = cVar.f602c;
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) c0689s.f6034f;
        if (lVar.f4576g != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        lVar.f4576g = abstractActivityC0117e;
        lVar.f4579j = hVar;
        lVar.f4581l = new J1.c(bVar, 17);
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) c0689s.f6035g;
        if (kVar.f4562g != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        kVar.f4562g = abstractActivityC0117e;
        M m4 = new M(bVar, 13);
        kVar.f4565j = m4;
        m4.f401g = kVar.f4574s;
        lVar.f4581l.f1289g = c0689s;
        for (L3.a aVar : ((HashMap) this.f626c).values()) {
            if (this.f624a) {
                aVar.onReattachedToActivityForConfigChanges((D0.h) this.f631h);
            } else {
                aVar.onAttachedToActivity((D0.h) this.f631h);
            }
        }
        this.f624a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        T3.a.d("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f626c).values().iterator();
            while (it.hasNext()) {
                ((L3.a) it.next()).onDetachedFromActivity();
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
        c cVar = (c) this.f627d;
        io.flutter.plugin.platform.l lVar = cVar.f618s;
        J1.c cVar2 = lVar.f4581l;
        if (cVar2 != null) {
            cVar2.f1289g = null;
        }
        lVar.b();
        lVar.f4581l = null;
        lVar.f4576g = null;
        lVar.f4579j = null;
        io.flutter.plugin.platform.k kVar = cVar.f619t;
        M m4 = kVar.f4565j;
        if (m4 != null) {
            m4.f401g = null;
        }
        Surface surface = kVar.f4571p;
        if (surface != null) {
            surface.release();
            kVar.f4571p = null;
            kVar.f4572q = null;
        }
        kVar.f4565j = null;
        kVar.f4562g = null;
        this.f630g = null;
        this.f631h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0121i) this.f630g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((P.d) this.f626c).l();
            return null;
        }
    }

    public void h(final int i7, final Serializable serializable) {
        ((Executor) this.f625b).execute(new Runnable() { // from class: P.a
            @Override // java.lang.Runnable
            public final void run() {
                ((d) E3.d.this.f626c).m(i7, serializable);
            }
        });
    }

    public d(AssetManager assetManager, Executor executor, P.d dVar, String str, File file) {
        this.f624a = false;
        this.f625b = executor;
        this.f626c = dVar;
        this.f629f = str;
        this.f628e = file;
        int i7 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i7 <= 34) {
            switch (i7) {
                case 25:
                    bArr = P.e.f1856h;
                    break;
                case r.MIN_SDK_VERSION /* 26 */:
                    bArr = P.e.f1855g;
                    break;
                case 27:
                    bArr = P.e.f1854f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = P.e.f1853e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = P.e.f1852d;
                    break;
            }
        }
        this.f627d = bArr;
    }
}
