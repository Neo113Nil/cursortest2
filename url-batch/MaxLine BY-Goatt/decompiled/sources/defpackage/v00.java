package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class v00 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(v00.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = hd2.a;
        c = unsafe.objectFieldOffset(v00.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(v00.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(v00.class.getDeclaredField("_prev$volatile"));
    }

    public v00(vg2 vg2Var) {
        this._prev$volatile = vg2Var;
    }

    public final void a() {
        b.getClass();
        hd2.a.putObjectVolatile(this, d, (Object) null);
    }

    public final v00 b() {
        v00 e = e();
        while (e != null && e.f()) {
            b.getClass();
            e = (v00) hd2.a.getObjectVolatile(e, d);
        }
        return e;
    }

    public final v00 c() {
        Object d2 = d();
        if (d2 == tk3.f) {
            return null;
        }
        return (v00) d2;
    }

    public final Object d() {
        a.getClass();
        return hd2.a.getObjectVolatile(this, c);
    }

    public final v00 e() {
        b.getClass();
        return (v00) hd2.a.getObjectVolatile(this, d);
    }

    public abstract boolean f();

    public final boolean g() {
        ng0 ng0Var = tk3.f;
        while (true) {
            a.getClass();
            Unsafe unsafe = hd2.a;
            long j = c;
            v00 v00Var = this;
            if (unsafe.compareAndSwapObject(v00Var, j, (Object) null, ng0Var)) {
                return true;
            }
            if (unsafe.getObjectVolatile(v00Var, j) != null) {
                return false;
            }
            this = v00Var;
        }
    }

    public final void h() {
        v00 v00Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            v00 b2 = b();
            v00 c2 = c();
            c2.getClass();
            do {
                v00Var = c2;
                if (!v00Var.f()) {
                    break;
                } else {
                    c2 = v00Var.c();
                }
            } while (c2 != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = hd2.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(v00Var, j);
                v00 v00Var2 = ((v00) objectVolatile) == null ? null : b2;
                do {
                    unsafe = hd2.a;
                    if (unsafe.compareAndSwapObject(v00Var, d, objectVolatile, v00Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(v00Var, j) == objectVolatile);
            }
            if (b2 != null) {
                a.getClass();
                unsafe.putObjectVolatile(b2, c, v00Var);
            }
            if (!v00Var.f() || v00Var.c() == null) {
                if (b2 == null || !b2.f()) {
                    return;
                }
            }
        }
    }

    public final boolean i(vg2 vg2Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = hd2.a;
            long j = c;
            v00 v00Var = this;
            vg2 vg2Var2 = vg2Var;
            if (unsafe.compareAndSwapObject(v00Var, j, (Object) null, vg2Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(v00Var, j) != null) {
                return false;
            }
            this = v00Var;
            vg2Var = vg2Var2;
        }
    }
}
