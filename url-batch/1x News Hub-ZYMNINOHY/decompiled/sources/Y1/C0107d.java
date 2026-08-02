package Y1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: Y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107d {

    /* renamed from: a, reason: collision with root package name */
    public final C0.e f1829a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f1830b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1831c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1832d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f1833e = new ReferenceQueue();
    public final HashMap f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1834g;

    /* renamed from: h, reason: collision with root package name */
    public final B0.n f1835h;

    /* renamed from: i, reason: collision with root package name */
    public long f1836i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1837j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1838k;

    public C0107d(C0.e eVar) {
        this.f1829a = eVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f1834g = handler;
        B0.n nVar = new B0.n(3, this);
        this.f1835h = nVar;
        this.f1836i = 65536L;
        this.f1838k = 3000L;
        handler.postDelayed(nVar, 3000L);
    }

    public final void a(long j3, Object instance) {
        kotlin.jvm.internal.j.e(instance, "instance");
        f();
        c(j3, instance);
    }

    public final long b(Object instance) {
        kotlin.jvm.internal.j.e(instance, "instance");
        f();
        if (!d(instance)) {
            long j3 = this.f1836i;
            this.f1836i = 1 + j3;
            c(j3, instance);
            return j3;
        }
        throw new IllegalArgumentException(("Instance of " + instance.getClass() + " has already been added.").toString());
    }

    public final void c(long j3, Object obj) {
        if (j3 < 0) {
            throw new IllegalArgumentException(("Identifier must be >= 0: " + j3).toString());
        }
        HashMap hashMap = this.f1831c;
        if (hashMap.containsKey(Long.valueOf(j3))) {
            throw new IllegalArgumentException(("Identifier has already been added: " + j3).toString());
        }
        C0106c c0106c = new C0106c(obj, this.f1833e);
        this.f1830b.put(c0106c, Long.valueOf(j3));
        hashMap.put(Long.valueOf(j3), c0106c);
        this.f.put(c0106c, Long.valueOf(j3));
        this.f1832d.put(Long.valueOf(j3), obj);
    }

    public final boolean d(Object obj) {
        f();
        return obj != null && this.f1830b.containsKey(new C0106c(obj));
    }

    public final Object e(long j3) {
        f();
        C0106c c0106c = (C0106c) this.f1831c.get(Long.valueOf(j3));
        if (c0106c != null) {
            return c0106c.get();
        }
        return null;
    }

    public final void f() {
        if (this.f1837j) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
