package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hn2 {
    public final Function1 a;
    public boolean c;
    public k4 h;
    public gn2 i;
    public final AtomicReference b = new AtomicReference(null);
    public final ia d = new ia(8, this);
    public final a0 e = new a0(15, this);
    public final eo1 f = new eo1(new gn2[16]);
    public final Object g = new Object();
    public long j = -1;

    public hn2(Function1 function1) {
        this.a = function1;
    }

    public final void a() {
        synchronized (this.g) {
            try {
                eo1 eo1Var = this.f;
                Object[] objArr = eo1Var.m;
                int i = eo1Var.o;
                for (int i2 = 0; i2 < i; i2++) {
                    gn2 gn2Var = (gn2) objArr[i2];
                    gn2Var.e.a();
                    gn2Var.f.a();
                    gn2Var.k.a();
                    gn2Var.l.clear();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
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
                        b00.d("Unexpected notification");
                        throw new k81();
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
                try {
                    eo1 eo1Var = this.f;
                    Object[] objArr = eo1Var.m;
                    int i = eo1Var.o;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (!((gn2) objArr[i2]).b(set) && !z2) {
                            z2 = false;
                        }
                        z2 = true;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        gn2 gn2Var;
        synchronized (this.g) {
            eo1 eo1Var = this.f;
            Object[] objArr = eo1Var.m;
            int i = eo1Var.o;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i2];
                if (((gn2) obj2).a == function1) {
                    break;
                } else {
                    i2++;
                }
            }
            gn2Var = (gn2) obj2;
            if (gn2Var == null) {
                function1.getClass();
                s03.f(1, function1);
                gn2Var = new gn2(function1);
                eo1Var.b(gn2Var);
            }
        }
        gn2 gn2Var2 = this.i;
        long j = this.j;
        if (j != -1 && j != ij2.c()) {
            v32.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + ij2.c() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = gn2Var;
            this.j = ij2.c();
            gn2Var.a(obj, this.e, function0);
        } finally {
            this.i = gn2Var2;
            this.j = j;
        }
    }

    public final void d() {
        ia iaVar = this.d;
        tm2.f(tm2.a);
        synchronized (tm2.c) {
            tm2.h = zv.F(tm2.h, iaVar);
            Unit unit = Unit.a;
        }
        this.h = new k4(13, iaVar);
    }
}
