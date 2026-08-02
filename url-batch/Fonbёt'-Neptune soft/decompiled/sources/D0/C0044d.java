package D0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: D0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044d {

    /* renamed from: a, reason: collision with root package name */
    public final B.m f326a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f327b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f328c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f329d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f330e = new ReferenceQueue();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f331f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Handler f332g;

    /* renamed from: h, reason: collision with root package name */
    public final RunnableC0043c f333h;

    /* renamed from: i, reason: collision with root package name */
    public long f334i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f335j;

    /* renamed from: k, reason: collision with root package name */
    public final long f336k;

    public C0044d(B.m mVar) {
        this.f326a = mVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f332g = handler;
        RunnableC0043c runnableC0043c = new RunnableC0043c(0, this);
        this.f333h = runnableC0043c;
        this.f334i = 65536L;
        this.f336k = 3000L;
        handler.postDelayed(runnableC0043c, 3000L);
    }

    public final void a(long j2, Object obj) {
        Q0.h.e(obj, "instance");
        f();
        c(j2, obj);
    }

    public final long b(Object obj) {
        Q0.h.e(obj, "instance");
        f();
        if (!d(obj)) {
            long j2 = this.f334i;
            this.f334i = 1 + j2;
            c(j2, obj);
            return j2;
        }
        throw new IllegalArgumentException(("Instance of " + obj.getClass() + " has already been added.").toString());
    }

    public final void c(long j2, Object obj) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("Identifier must be >= 0: " + j2).toString());
        }
        HashMap hashMap = this.f328c;
        if (hashMap.containsKey(Long.valueOf(j2))) {
            throw new IllegalArgumentException(("Identifier has already been added: " + j2).toString());
        }
        WeakReference weakReference = new WeakReference(obj, this.f330e);
        this.f327b.put(obj, Long.valueOf(j2));
        hashMap.put(Long.valueOf(j2), weakReference);
        this.f331f.put(weakReference, Long.valueOf(j2));
        this.f329d.put(Long.valueOf(j2), obj);
    }

    public final boolean d(Object obj) {
        f();
        return this.f327b.containsKey(obj);
    }

    public final Object e(long j2) {
        f();
        WeakReference weakReference = (WeakReference) this.f328c.get(Long.valueOf(j2));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void f() {
        if (this.f335j) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
