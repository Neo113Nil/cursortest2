package w0;

import b6.j0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m0.p1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final p6.c f7559a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7561c;

    /* renamed from: h, reason: collision with root package name */
    public b.q f7566h;
    public r i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f7560b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final j0 f7562d = new j0(11, this);

    /* renamed from: e, reason: collision with root package name */
    public final a0.t f7563e = new a0.t(26, this);

    /* renamed from: f, reason: collision with root package name */
    public final o0.e f7564f = new o0.e(new r[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Object f7565g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public long f7567j = -1;

    public s(p6.c cVar) {
        this.f7559a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        boolean z3;
        Set set;
        Set set2;
        synchronized (this.f7565g) {
            z3 = this.f7561c;
        }
        if (z3) {
            return false;
        }
        boolean z7 = false;
        while (true) {
            AtomicReference atomicReference = this.f7560b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        m0.t.d("Unexpected notification");
                        throw new a5.c();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z7;
            }
            synchronized (this.f7565g) {
                o0.e eVar = this.f7564f;
                Object[] objArr = eVar.f5578d;
                int i = eVar.f5580f;
                for (int i8 = 0; i8 < i; i8++) {
                    z7 = ((r) objArr[i8]).b(set) || z7;
                }
            }
        }
    }

    public final void b(Object obj, p6.c cVar, p6.a aVar) {
        Object obj2;
        r rVar;
        synchronized (this.f7565g) {
            o0.e eVar = this.f7564f;
            Object[] objArr = eVar.f5578d;
            int i = eVar.f5580f;
            int i8 = 0;
            while (true) {
                if (i8 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i8];
                if (((r) obj2).f7548a == cVar) {
                    break;
                } else {
                    i8++;
                }
            }
            rVar = (r) obj2;
            if (rVar == null) {
                q6.i.c(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                q6.v.c(1, cVar);
                rVar = new r(cVar);
                eVar.b(rVar);
            }
        }
        r rVar2 = this.i;
        long j7 = this.f7567j;
        if (j7 != -1 && j7 != u0.h.b()) {
            p1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j7 + "), currentThread={id=" + u0.h.b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = rVar;
            this.f7567j = u0.h.b();
            rVar.a(obj, this.f7563e, aVar);
        } finally {
            this.i = rVar2;
            this.f7567j = j7;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void c() {
        j0 j0Var = this.f7562d;
        m.f(m.f7535a);
        synchronized (m.f7537c) {
            m.f7542h = d6.m.a0(m.f7542h, j0Var);
        }
        this.f7566h = new b.q(j0Var);
    }
}
