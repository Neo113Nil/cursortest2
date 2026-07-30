package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h51 implements dn, un {
    private static final g51 e = new g51(null);
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(h51.class, Object.class, "result");
    public static final /* synthetic */ long h = n51.a.objectFieldOffset(h51.class.getDeclaredField("result"));
    public final dn d;
    private volatile Object result;

    public h51(dn dnVar) {
        tn tnVar = tn.d;
        dnVar.getClass();
        this.d = dnVar;
        this.result = tnVar;
    }

    @Override // defpackage.un
    public final un c() {
        dn dnVar = this.d;
        if (dnVar instanceof un) {
            return (un) dnVar;
        }
        return null;
    }

    @Override // defpackage.dn
    public final CoroutineContext g() {
        return this.d.g();
    }

    @Override // defpackage.dn
    public final void l(Object obj) {
        h51 h51Var;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            tn tnVar = tn.e;
            if (obj3 == tnVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = n51.a;
                    long j2 = h;
                    h51Var = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(h51Var, j2, tnVar, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(h51Var, j2) != tnVar) {
                        break;
                    }
                    this = h51Var;
                    obj = obj2;
                }
            } else {
                h51Var = this;
                obj2 = obj;
                tn tnVar2 = tn.d;
                if (obj3 != tnVar2) {
                    dd0.j("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
                tn tnVar3 = tn.g;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = n51.a;
                    j = h;
                    if (unsafe.compareAndSwapObject(h51Var, j, tnVar2, tnVar3)) {
                        h51Var.d.l(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(h51Var, j) == tnVar2);
            }
            this = h51Var;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.d;
    }
}
