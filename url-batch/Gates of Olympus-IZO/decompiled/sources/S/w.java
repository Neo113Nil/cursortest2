package S;

import D1.C0014b;
import F.C0036e;
import F.C0047j0;
import I.C0089d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Z1.j f3262a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3264c;

    /* renamed from: g, reason: collision with root package name */
    public D1.h f3268g;

    /* renamed from: h, reason: collision with root package name */
    public v f3269h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f3263b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final C0036e f3265d = new C0036e(6, this);

    /* renamed from: e, reason: collision with root package name */
    public final C0047j0 f3266e = new C0047j0(11, this);

    /* renamed from: f, reason: collision with root package name */
    public final K.d f3267f = new K.d(new v[16]);

    /* renamed from: i, reason: collision with root package name */
    public long f3270i = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Y1.c cVar) {
        this.f3262a = (Z1.j) cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(w wVar) {
        boolean z3;
        Set set;
        synchronized (wVar.f3267f) {
            z3 = wVar.f3264c;
        }
        if (z3) {
            return false;
        }
        boolean z4 = false;
        while (true) {
            AtomicReference atomicReference = wVar.f3263b;
            Object obj = atomicReference.get();
            Set set2 = null;
            r4 = null;
            List list = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C0089d.x("Unexpected notification");
                        throw null;
                    }
                    List list2 = (List) obj;
                    set = (Set) list2.get(0);
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
                set2 = set;
            }
            if (set2 == null) {
                return z4;
            }
            synchronized (wVar.f3267f) {
                K.d dVar = wVar.f3267f;
                int i3 = dVar.f2642f;
                if (i3 > 0) {
                    Object[] objArr = dVar.f2640d;
                    int i4 = 0;
                    do {
                        z4 = ((v) objArr[i4]).b(set2) || z4;
                        i4++;
                    } while (i4 < i3);
                }
            }
        }
    }

    public final void b(Object obj, Y1.c cVar, Y1.a aVar) {
        Object obj2;
        v vVar;
        synchronized (this.f3267f) {
            K.d dVar = this.f3267f;
            int i3 = dVar.f2642f;
            if (i3 > 0) {
                Object[] objArr = dVar.f2640d;
                int i4 = 0;
                do {
                    obj2 = objArr[i4];
                    if (((v) obj2).f3250a == cVar) {
                        break;
                    } else {
                        i4++;
                    }
                } while (i4 < i3);
            }
            obj2 = null;
            vVar = (v) obj2;
            if (vVar == null) {
                Z1.i.d(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                Z1.w.d(1, cVar);
                vVar = new v(cVar);
                dVar.b(vVar);
            }
        }
        v vVar2 = this.f3269h;
        long j3 = this.f3270i;
        if (j3 == -1 || j3 == C0089d.A()) {
            try {
                this.f3269h = vVar;
                this.f3270i = C0089d.A();
                vVar.a(obj, this.f3266e, aVar);
                return;
            } finally {
                this.f3269h = vVar2;
                this.f3270i = j3;
            }
        }
        C0089d.R("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + C0089d.A() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void c() {
        C0036e c0036e = this.f3265d;
        C0014b c0014b = q.f3234a;
        q.f(o.f3230g);
        synchronized (q.f3235b) {
            q.f3240g = M1.l.v0(q.f3240g, c0036e);
        }
        this.f3268g = new D1.h(c0036e);
    }
}
