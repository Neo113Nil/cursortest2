package Q;

import A.g0;
import A0.C0030a;
import B1.C0097d;
import G.C0192d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final M2.p f3790a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3792c;

    /* renamed from: g, reason: collision with root package name */
    public C0273i f3796g;

    /* renamed from: h, reason: collision with root package name */
    public z f3797h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f3791b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final C0030a f3793d = new C0030a(5, this);

    /* renamed from: e, reason: collision with root package name */
    public final g0 f3794e = new g0(7, this);

    /* renamed from: f, reason: collision with root package name */
    public final I.d f3795f = new I.d(new z[16]);

    /* renamed from: i, reason: collision with root package name */
    public long f3798i = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public A(Function1 function1) {
        this.f3790a = (M2.p) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(A a4) {
        boolean z4;
        Set set;
        synchronized (a4.f3795f) {
            z4 = a4.f3792c;
        }
        if (z4) {
            return false;
        }
        boolean z5 = false;
        while (true) {
            AtomicReference atomicReference = a4.f3791b;
            Object obj = atomicReference.get();
            Set set2 = null;
            r5 = null;
            List list = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C0192d.x("Unexpected notification");
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
                return z5;
            }
            synchronized (a4.f3795f) {
                try {
                    I.d dVar = a4.f3795f;
                    int i2 = dVar.f3332i;
                    if (i2 > 0) {
                        Object[] objArr = dVar.f3330d;
                        int i4 = 0;
                        do {
                            if (!((z) objArr[i4]).b(set2) && !z5) {
                                z5 = false;
                                i4++;
                            }
                            z5 = true;
                            i4++;
                        } while (i4 < i2);
                    }
                    Unit unit = Unit.f7487a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f3795f) {
            try {
                I.d dVar = this.f3795f;
                int i2 = dVar.f3332i;
                if (i2 > 0) {
                    Object[] objArr = dVar.f3330d;
                    int i4 = 0;
                    do {
                        z zVar = (z) objArr[i4];
                        ((i.y) zVar.f3909e.f11388d).a();
                        zVar.f3910f.a();
                        ((i.y) zVar.f3915k.f11388d).a();
                        zVar.f3916l.clear();
                        i4++;
                    } while (i4 < i2);
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        z zVar;
        synchronized (this.f3795f) {
            I.d dVar = this.f3795f;
            int i2 = dVar.f3332i;
            if (i2 > 0) {
                Object[] objArr = dVar.f3330d;
                int i4 = 0;
                do {
                    obj2 = objArr[i4];
                    if (((z) obj2).f3905a == function1) {
                        break;
                    } else {
                        i4++;
                    }
                } while (i4 < i2);
            }
            obj2 = null;
            zVar = (z) obj2;
            if (zVar == null) {
                Intrinsics.d(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                M2.J.d(1, function1);
                zVar = new z(function1);
                dVar.b(zVar);
            }
        }
        z zVar2 = this.f3797h;
        long j4 = this.f3798i;
        if (j4 == -1 || j4 == C0192d.A()) {
            try {
                this.f3797h = zVar;
                this.f3798i = C0192d.A();
                zVar.a(obj, this.f3794e, function0);
                return;
            } finally {
                this.f3797h = zVar2;
                this.f3798i = j4;
            }
        }
        C0192d.S("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j4 + "), currentThread={id=" + C0192d.A() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        C0030a c0030a = this.f3793d;
        C0097d c0097d = q.f3877a;
        q.f(p.f3875i);
        synchronized (q.f3878b) {
            q.f3883g = C1403G.A(q.f3883g, c0030a);
            Unit unit = Unit.f7487a;
        }
        this.f3796g = new C0273i(c0030a);
    }
}
