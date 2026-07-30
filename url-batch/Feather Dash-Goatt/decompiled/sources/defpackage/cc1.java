package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cc1 {
    public final t3 a;
    public boolean c;
    public m2 h;
    public bc1 i;
    public final AtomicReference b = new AtomicReference(null);
    public final jl d = new jl(10, this);
    public final l e = new l(22, this);
    public final eo0 f = new eo0(new bc1[16]);
    public final Object g = new Object();
    public long j = -1;

    public cc1(t3 t3Var) {
        this.a = t3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
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
                        kl.b("Unexpected notification");
                        throw new kc0();
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
                return z2;
            }
            synchronized (this.g) {
                eo0 eo0Var = this.f;
                Object[] objArr = eo0Var.d;
                int i = eo0Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((bc1) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    public final void b(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        bc1 bc1Var;
        boolean z;
        ln0 ln0Var;
        ib1 cj1Var;
        ib1 j;
        Object obj3;
        Object obj4;
        long[] jArr;
        int i;
        long[] jArr2;
        long j2;
        synchronized (this.g) {
            eo0 eo0Var = this.f;
            Object[] objArr = eo0Var.d;
            int i2 = eo0Var.g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((bc1) obj2).a == function1) {
                    break;
                } else {
                    i3++;
                }
            }
            bc1Var = (bc1) obj2;
            z = true;
            if (bc1Var == null) {
                function1.getClass();
                tj1.b(1, function1);
                bc1Var = new bc1(function1);
                eo0Var.b(bc1Var);
            }
        }
        bc1 bc1Var2 = this.i;
        long j3 = this.j;
        if (j3 != -1 && j3 != t90.l()) {
            cy0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + t90.l() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = bc1Var;
            this.j = t90.l();
            l lVar = this.e;
            Object obj5 = bc1Var.b;
            ln0 ln0Var2 = bc1Var.c;
            int i4 = bc1Var.d;
            bc1Var.b = obj;
            bc1Var.c = (ln0) bc1Var.f.g(obj);
            if (bc1Var.d == -1) {
                bc1Var.d = Long.hashCode(pb1.j().g());
            }
            gl glVar = bc1Var.i;
            eo0 n = gb0.n();
            try {
                n.b(glVar);
                if (lVar == null) {
                    function0.invoke();
                    ln0Var = ln0Var2;
                } else {
                    ib1 ib1Var = (ib1) pb1.b.get();
                    if (ib1Var instanceof cj1) {
                        ln0Var = ln0Var2;
                        if (((cj1) ib1Var).t == t90.l()) {
                            Function1 function12 = ((cj1) ib1Var).r;
                            Function1 function13 = ((cj1) ib1Var).s;
                            try {
                                ((cj1) ib1Var).r = pb1.k(lVar, function12, true);
                                ((cj1) ib1Var).s = function13;
                                function0.invoke();
                                ((cj1) ib1Var).r = function12;
                                ((cj1) ib1Var).s = function13;
                            } catch (Throwable th) {
                                ((cj1) ib1Var).r = function12;
                                ((cj1) ib1Var).s = function13;
                                throw th;
                            }
                        }
                    } else {
                        ln0Var = ln0Var2;
                    }
                    try {
                        try {
                            if (ib1Var != null && !(ib1Var instanceof zn0)) {
                                cj1Var = ib1Var.u(lVar);
                                j = cj1Var.j();
                                function0.invoke();
                                ib1.q(j);
                                cj1Var.c();
                            }
                            function0.invoke();
                            ib1.q(j);
                            cj1Var.c();
                        } catch (Throwable th2) {
                            try {
                                ib1.q(j);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    cj1Var.c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    n.k(n.g - 1);
                                    throw th;
                                }
                            }
                        }
                        j = cj1Var.j();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    cj1Var = new cj1(ib1Var instanceof zn0 ? (zn0) ib1Var : null, lVar, null, true, false);
                }
                n.k(n.g - 1);
                Object obj6 = bc1Var.b;
                obj6.getClass();
                int i5 = bc1Var.d;
                ln0 ln0Var3 = bc1Var.c;
                if (ln0Var3 != null) {
                    long[] jArr3 = ln0Var3.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j4 = jArr3[i6];
                            boolean z2 = z;
                            obj4 = obj5;
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j4 & 255) < 128) {
                                        i = i8;
                                        int i9 = (i6 << 3) + i;
                                        jArr2 = jArr3;
                                        Object obj7 = ln0Var3.b[i9];
                                        j2 = j4;
                                        boolean z3 = ln0Var3.c[i9] != i5 ? z2 : false;
                                        if (z3) {
                                            bc1Var.c(obj6, obj7);
                                        }
                                        if (z3) {
                                            ln0Var3.f(i9);
                                        }
                                    } else {
                                        i = i8;
                                        jArr2 = jArr3;
                                        j2 = j4;
                                    }
                                    j4 = j2 >> 8;
                                    i8 = i + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i7 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i6 == length) {
                                break;
                            }
                            i6++;
                            z = z2;
                            obj5 = obj4;
                            jArr3 = jArr;
                        }
                        obj3 = obj4;
                        bc1Var.b = obj3;
                        bc1Var.c = ln0Var;
                        bc1Var.d = i4;
                        this.i = bc1Var2;
                        this.j = j3;
                    }
                }
                obj3 = obj5;
                bc1Var.b = obj3;
                bc1Var.c = ln0Var;
                bc1Var.d = i4;
                this.i = bc1Var2;
                this.j = j3;
            } catch (Throwable th6) {
                th = th6;
                n.k(n.g - 1);
                throw th;
            }
        } finally {
            this.i = bc1Var2;
            this.j = j3;
        }
    }
}
