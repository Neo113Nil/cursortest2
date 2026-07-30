package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class dm {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(dm.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = n51.a;
        c = unsafe.objectFieldOffset(dm.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(dm.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(dm.class.getDeclaredField("_prev$volatile"));
    }

    public dm(e81 e81Var) {
        this._prev$volatile = e81Var;
    }

    public final void a() {
        b.getClass();
        n51.a.putObjectVolatile(this, d, (Object) null);
    }

    public final dm b() {
        dm e = e();
        while (e != null && e.f()) {
            b.getClass();
            e = (dm) n51.a.getObjectVolatile(e, d);
        }
        return e;
    }

    public final dm c() {
        Object d2 = d();
        if (d2 == yr1.h) {
            return null;
        }
        return (dm) d2;
    }

    public final Object d() {
        a.getClass();
        return n51.a.getObjectVolatile(this, c);
    }

    public final dm e() {
        b.getClass();
        return (dm) n51.a.getObjectVolatile(this, d);
    }

    public abstract boolean f();

    public final boolean g() {
        fv fvVar = yr1.h;
        while (true) {
            a.getClass();
            Unsafe unsafe = n51.a;
            long j = c;
            dm dmVar = this;
            if (unsafe.compareAndSwapObject(dmVar, j, (Object) null, fvVar)) {
                return true;
            }
            if (unsafe.getObjectVolatile(dmVar, j) != null) {
                return false;
            }
            this = dmVar;
        }
    }

    public final void h() {
        dm dmVar;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            dm b2 = b();
            dm c2 = c();
            c2.getClass();
            do {
                dmVar = c2;
                if (!dmVar.f()) {
                    break;
                } else {
                    c2 = dmVar.c();
                }
            } while (c2 != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = n51.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(dmVar, j);
                dm dmVar2 = ((dm) objectVolatile) == null ? null : b2;
                do {
                    unsafe = n51.a;
                    if (unsafe.compareAndSwapObject(dmVar, d, objectVolatile, dmVar2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(dmVar, j) == objectVolatile);
            }
            if (b2 != null) {
                a.getClass();
                unsafe.putObjectVolatile(b2, c, dmVar);
            }
            if (!dmVar.f() || dmVar.c() == null) {
                if (b2 == null || !b2.f()) {
                    return;
                }
            }
        }
    }

    public final boolean i(e81 e81Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = n51.a;
            long j = c;
            dm dmVar = this;
            e81 e81Var2 = e81Var;
            if (unsafe.compareAndSwapObject(dmVar, j, (Object) null, e81Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(dmVar, j) != null) {
                return false;
            }
            this = dmVar;
            e81Var = e81Var2;
        }
    }
}
