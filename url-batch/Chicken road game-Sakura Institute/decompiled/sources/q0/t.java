package q0;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final r6.l f7454a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7456c;

    /* renamed from: g, reason: collision with root package name */
    public e5.a f7460g;

    /* renamed from: h, reason: collision with root package name */
    public s f7461h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f7455b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final a2.a f7457d = new a2.a(13, this);

    /* renamed from: e, reason: collision with root package name */
    public final c1.a f7458e = new c1.a(24, this);

    /* renamed from: f, reason: collision with root package name */
    public final i0.d f7459f = new i0.d(new s[16]);

    /* renamed from: i, reason: collision with root package name */
    public long f7462i = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public t(q6.c cVar) {
        this.f7454a = (r6.l) cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(t tVar) {
        boolean z8;
        Set set;
        Set set2;
        synchronized (tVar.f7459f) {
            z8 = tVar.f7456c;
        }
        if (z8) {
            return false;
        }
        boolean z9 = false;
        while (true) {
            AtomicReference atomicReference = tVar.f7455b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                r4 = null;
                List list = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        g0.d.x("Unexpected notification");
                        throw null;
                    }
                    List list2 = (List) obj;
                    set2 = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        list = list2.get(1);
                    } else if (list2.size() > 2) {
                        list = list2.subList(1, list2.size());
                    }
                }
                List list3 = list;
                while (!atomicReference.compareAndSet(obj, list3)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z9;
            }
            synchronized (tVar.f7459f) {
                i0.d dVar = tVar.f7459f;
                int i7 = dVar.f4842h;
                if (i7 > 0) {
                    Object[] objArr = dVar.f4840f;
                    int i8 = 0;
                    do {
                        z9 = ((s) objArr[i8]).b(set) || z9;
                        i8++;
                    } while (i8 < i7);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f7459f) {
            i0.d dVar = this.f7459f;
            int i7 = dVar.f4842h;
            if (i7 > 0) {
                Object[] objArr = dVar.f4840f;
                int i8 = 0;
                do {
                    s sVar = (s) objArr[i8];
                    ((i.x) sVar.f7446e.f1394g).a();
                    sVar.f7447f.a();
                    ((i.x) sVar.f7452k.f1394g).a();
                    sVar.f7453l.clear();
                    i8++;
                } while (i8 < i7);
            }
        }
    }

    public final void c(Object obj, q6.c cVar, q6.a aVar) {
        Object obj2;
        s sVar;
        synchronized (this.f7459f) {
            i0.d dVar = this.f7459f;
            int i7 = dVar.f4842h;
            if (i7 > 0) {
                Object[] objArr = dVar.f4840f;
                int i8 = 0;
                do {
                    obj2 = objArr[i8];
                    if (((s) obj2).f7442a == cVar) {
                        break;
                    } else {
                        i8++;
                    }
                } while (i8 < i7);
            }
            obj2 = null;
            sVar = (s) obj2;
            if (sVar == null) {
                r6.k.d(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                r6.y.d(1, cVar);
                sVar = new s(cVar);
                dVar.b(sVar);
            }
        }
        s sVar2 = this.f7461h;
        long j8 = this.f7462i;
        if (j8 == -1 || j8 == g0.d.z()) {
            try {
                this.f7461h = sVar;
                this.f7462i = g0.d.z();
                sVar.a(obj, this.f7458e, aVar);
                return;
            } finally {
                this.f7461h = sVar2;
                this.f7462i = j8;
            }
        }
        g0.d.R("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j8 + "), currentThread={id=" + g0.d.z() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        a2.a aVar = this.f7457d;
        b1.b bVar = n.f7426a;
        n.f(m.f7424i);
        synchronized (n.f7427b) {
            n.f7432g = e6.l.q0(n.f7432g, aVar);
        }
        this.f7460g = new e5.a(4, aVar);
    }
}
