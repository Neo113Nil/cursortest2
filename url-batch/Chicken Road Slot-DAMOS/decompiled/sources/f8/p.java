package f8;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends i7.a {
    public static final Unsafe g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f4160h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f4161i;
    public static final long j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4162k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f4163l;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new o());
            }
            try {
                f4161i = unsafe.objectFieldOffset(r.class.getDeclaredField("i"));
                f4160h = unsafe.objectFieldOffset(r.class.getDeclaredField("e"));
                j = unsafe.objectFieldOffset(r.class.getDeclaredField("d"));
                f4162k = unsafe.objectFieldOffset(q.class.getDeclaredField(yb.a.PUSH_ADDITIONAL_DATA_KEY));
                f4163l = unsafe.objectFieldOffset(q.class.getDeclaredField("b"));
                g = unsafe;
            } catch (Exception e2) {
                Object obj = a8.q.f367a;
                if (!(e2 instanceof RuntimeException)) {
                    throw new RuntimeException(e2);
                }
                throw ((RuntimeException) e2);
            }
        } catch (PrivilegedActionException e9) {
            throw new RuntimeException("Could not initialize intrinsics", e9.getCause());
        }
    }

    @Override // i7.a
    public final f L(r rVar) {
        f fVar;
        f fVar2 = f.f4136d;
        do {
            fVar = rVar.f4175e;
            if (fVar2 == fVar) {
                break;
            }
        } while (!q(rVar, fVar, fVar2));
        return fVar;
    }

    @Override // i7.a
    public final q M(r rVar) {
        q qVar;
        q qVar2 = q.f4165c;
        do {
            qVar = rVar.f4176i;
            if (qVar2 == qVar) {
                break;
            }
        } while (!s(rVar, qVar, qVar2));
        return qVar;
    }

    @Override // i7.a
    public final void Y(q qVar, q qVar2) {
        g.putObject(qVar, f4163l, qVar2);
    }

    @Override // i7.a
    public final void Z(q qVar, Thread thread) {
        g.putObject(qVar, f4162k, thread);
    }

    @Override // i7.a
    public final boolean q(r rVar, f fVar, f fVar2) {
        return m.a(g, rVar, f4160h, fVar, fVar2);
    }

    @Override // i7.a
    public final boolean r(r rVar, Object obj, Object obj2) {
        return n.a(g, rVar, j, obj, obj2);
    }

    @Override // i7.a
    public final boolean s(r rVar, q qVar, q qVar2) {
        return l.a(g, rVar, f4161i, qVar, qVar2);
    }
}
