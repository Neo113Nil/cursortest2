package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f1548a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f1549b;

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f1550c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1551d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1552e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f1553f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f1554g;

    static {
        Unsafe i2 = i();
        f1548a = i2;
        f1549b = AbstractC0091c.f1511a;
        boolean h2 = h(Long.TYPE);
        boolean h3 = h(Integer.TYPE);
        i0 i0Var = null;
        if (i2 != null) {
            if (!AbstractC0091c.a()) {
                i0Var = new h0(i2);
            } else if (h2) {
                i0Var = new g0(i2, 1);
            } else if (h3) {
                i0Var = new g0(i2, 0);
            }
        }
        f1550c = i0Var;
        f1551d = i0Var == null ? false : i0Var.r();
        f1552e = i0Var == null ? false : i0Var.q();
        f1553f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g2 = g();
        if (g2 != null && i0Var != null) {
            i0Var.i(g2);
        }
        f1554g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(j0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j2, Object obj) {
        return ((byte) ((f1550c.f((-4) & j2, obj) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j2, Object obj) {
        return ((byte) ((f1550c.f((-4) & j2, obj) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f1548a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(Class cls) {
        if (f1552e) {
            return f1550c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f1552e) {
            f1550c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0091c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        if (!AbstractC0091c.a()) {
            return false;
        }
        try {
            Class cls2 = f1549b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new f0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j2, byte b2) {
        f1550c.k(bArr, f1553f + j2, b2);
    }

    public static void k(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int f2 = f1550c.f(j3, obj);
        int i2 = ((~((int) j2)) & 3) << 3;
        m(obj, j3, ((255 & b2) << i2) | (f2 & (~(255 << i2))));
    }

    public static void l(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        m(obj, j3, ((255 & b2) << i2) | (f1550c.f(j3, obj) & (~(255 << i2))));
    }

    public static void m(Object obj, long j2, int i2) {
        f1550c.n(obj, j2, i2);
    }

    public static void n(Object obj, long j2, long j3) {
        f1550c.o(obj, j2, j3);
    }

    public static void o(Object obj, long j2, Object obj2) {
        f1550c.p(obj, j2, obj2);
    }
}
