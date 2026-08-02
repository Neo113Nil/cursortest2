package F1;

import E1.AbstractActivityC0029e;
import E1.C0032h;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.o;
import b0.C0178i;
import f0.C0322a;
import io.appmetrica.analytics.impl.C0642l9;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f491a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f492b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f493c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f494d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f495e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f496g;

    /* renamed from: h, reason: collision with root package name */
    public Object f497h;

    public d(Context context, FlutterEngine flutterEngine, J1.d dVar) {
        this.f492b = new HashMap();
        this.f493c = new HashMap();
        this.f491a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f494d = flutterEngine;
        this.f495e = dVar;
        this.f = new L1.a(context, flutterEngine.f9101c, flutterEngine.f9115s.f9295a, new C0178i(4, dVar));
    }

    public void a(L1.b bVar) {
        Z1.a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            Class<?> cls = bVar.getClass();
            HashMap hashMap = (HashMap) this.f492b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((FlutterEngine) this.f494d) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((L1.a) this.f);
            if (bVar instanceof M1.a) {
                M1.a aVar = (M1.a) bVar;
                ((HashMap) this.f493c).put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((c) this.f497h);
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

    public void b(AbstractActivityC0029e abstractActivityC0029e, o oVar) {
        c cVar = new c();
        cVar.f487b = new HashSet();
        cVar.f488c = new HashSet();
        cVar.f489d = new HashSet();
        cVar.f490e = new HashSet();
        new HashSet();
        cVar.f = new HashSet();
        cVar.f486a = abstractActivityC0029e;
        new HiddenLifecycleReference(oVar);
        this.f497h = cVar;
        Intent intent = abstractActivityC0029e.getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false;
        if (booleanExtra) {
            String str = f.f507h.f499b;
        } else {
            booleanExtra = ((J1.d) this.f495e).f639a;
        }
        FlutterEngine flutterEngine = (FlutterEngine) this.f494d;
        flutterEngine.f9115s.v = booleanExtra;
        C0322a c0322a = flutterEngine.f9117u;
        r rVar = (r) c0322a.f4977b;
        if (rVar.f9297c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        rVar.f9297c = abstractActivityC0029e;
        rVar.f = flutterEngine.f9100b;
        G1.b bVar = flutterEngine.f9101c;
        rVar.f9301h = new V0.e(bVar, 18);
        q qVar = (q) c0322a.f4978c;
        if (qVar.f9281c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        qVar.f9281c = abstractActivityC0029e;
        V0.e eVar = new V0.e(bVar, 17);
        qVar.f9284g = eVar;
        eVar.f1600c = qVar.f9293q;
        rVar.f9301h.f1600c = c0322a;
        for (M1.a aVar : ((HashMap) this.f493c).values()) {
            if (this.f491a) {
                aVar.onReattachedToActivityForConfigChanges((c) this.f497h);
            } else {
                aVar.onAttachedToActivity((c) this.f497h);
            }
        }
        this.f491a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        Z1.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f493c).values().iterator();
            while (it.hasNext()) {
                ((M1.a) it.next()).onDetachedFromActivity();
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
        FlutterEngine flutterEngine = (FlutterEngine) this.f494d;
        r rVar = flutterEngine.f9115s;
        V0.e eVar = rVar.f9301h;
        if (eVar != null) {
            eVar.f1600c = null;
        }
        rVar.d();
        rVar.f9301h = null;
        rVar.f9297c = null;
        rVar.f = null;
        q qVar = flutterEngine.f9116t;
        V0.e eVar2 = qVar.f9284g;
        if (eVar2 != null) {
            eVar2.f1600c = null;
        }
        Surface surface = qVar.f9291n;
        if (surface != null) {
            surface.release();
            qVar.f9291n = null;
            qVar.o = null;
        }
        qVar.f9284g = null;
        qVar.f9281c = null;
        this.f496g = null;
        this.f497h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0032h) this.f496g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((S.d) this.f493c).l();
            return null;
        }
    }

    public void h(int i3, Serializable serializable) {
        ((Executor) this.f492b).execute(new S.a(this, i3, serializable, 0));
    }

    public d(AssetManager assetManager, Executor executor, S.d dVar, String str, File file) {
        this.f491a = false;
        this.f492b = executor;
        this.f493c = dVar;
        this.f = str;
        this.f495e = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 <= 34) {
            switch (i3) {
                case C0642l9.f7780F /* 25 */:
                    bArr = S.e.f1311h;
                    break;
                case C0642l9.f7781G /* 26 */:
                    bArr = S.e.f1310g;
                    break;
                case C0642l9.f7782H /* 27 */:
                    bArr = S.e.f;
                    break;
                case 28:
                case C0642l9.f7783I /* 29 */:
                case 30:
                    bArr = S.e.f1309e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = S.e.f1308d;
                    break;
            }
        }
        this.f494d = bArr;
    }
}
