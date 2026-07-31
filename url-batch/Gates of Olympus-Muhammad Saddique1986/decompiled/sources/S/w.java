package S;

import C0.C0025a;
import I.C0143d;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import j.C0550x;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final f2.k f4271a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4273c;

    /* renamed from: g, reason: collision with root package name */
    public L1.g f4277g;

    /* renamed from: h, reason: collision with root package name */
    public v f4278h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f4272b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final C0025a f4274d = new C0025a(6, this);

    /* renamed from: e, reason: collision with root package name */
    public final A0.l f4275e = new A0.l(11, this);

    /* renamed from: f, reason: collision with root package name */
    public final K.d f4276f = new K.d(new v[16]);

    /* renamed from: i, reason: collision with root package name */
    public long f4279i = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public w(InterfaceC0424c interfaceC0424c) {
        this.f4271a = (f2.k) interfaceC0424c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(w wVar) {
        boolean z3;
        Set set;
        synchronized (wVar.f4276f) {
            z3 = wVar.f4273c;
        }
        if (z3) {
            return false;
        }
        boolean z4 = false;
        while (true) {
            AtomicReference atomicReference = wVar.f4272b;
            Object obj = atomicReference.get();
            Set set2 = null;
            r4 = null;
            List list = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C0143d.x("Unexpected notification");
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
            synchronized (wVar.f4276f) {
                K.d dVar = wVar.f4276f;
                int i3 = dVar.f3216f;
                if (i3 > 0) {
                    Object[] objArr = dVar.f3214d;
                    int i4 = 0;
                    do {
                        z4 = ((v) objArr[i4]).b(set2) || z4;
                        i4++;
                    } while (i4 < i3);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f4276f) {
            K.d dVar = this.f4276f;
            int i3 = dVar.f3216f;
            if (i3 > 0) {
                Object[] objArr = dVar.f3214d;
                int i4 = 0;
                do {
                    v vVar = (v) objArr[i4];
                    ((C0550x) vVar.f4263e.f334d).a();
                    vVar.f4264f.a();
                    ((C0550x) vVar.f4269k.f334d).a();
                    vVar.f4270l.clear();
                    i4++;
                } while (i4 < i3);
            }
        }
    }

    public final void c(Object obj, InterfaceC0424c interfaceC0424c, InterfaceC0422a interfaceC0422a) {
        Object obj2;
        v vVar;
        synchronized (this.f4276f) {
            K.d dVar = this.f4276f;
            int i3 = dVar.f3216f;
            if (i3 > 0) {
                Object[] objArr = dVar.f3214d;
                int i4 = 0;
                do {
                    obj2 = objArr[i4];
                    if (((v) obj2).f4259a == interfaceC0424c) {
                        break;
                    } else {
                        i4++;
                    }
                } while (i4 < i3);
            }
            obj2 = null;
            vVar = (v) obj2;
            if (vVar == null) {
                f2.j.d(interfaceC0424c, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                f2.x.d(1, interfaceC0424c);
                vVar = new v(interfaceC0424c);
                dVar.b(vVar);
            }
        }
        v vVar2 = this.f4278h;
        long j3 = this.f4279i;
        if (j3 == -1 || j3 == C0143d.A()) {
            try {
                this.f4278h = vVar;
                this.f4279i = C0143d.A();
                vVar.a(obj, this.f4275e, interfaceC0422a);
                return;
            } finally {
                this.f4278h = vVar2;
                this.f4279i = j3;
            }
        }
        C0143d.S("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + C0143d.A() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        C0025a c0025a = this.f4274d;
        G1.m mVar = p.f4240a;
        p.f(o.f4238g);
        synchronized (p.f4241b) {
            p.f4246g = S1.l.T0(p.f4246g, c0025a);
        }
        this.f4277g = new L1.g(c0025a);
    }
}
