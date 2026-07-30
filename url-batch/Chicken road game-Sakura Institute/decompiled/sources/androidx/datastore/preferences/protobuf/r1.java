package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f901a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f902b;

    /* renamed from: c, reason: collision with root package name */
    public static final q1 f903c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f904d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f905e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f906f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f907g;

    static {
        Unsafe j8 = j();
        f901a = j8;
        f902b = c.f796a;
        boolean f9 = f(Long.TYPE);
        boolean f10 = f(Integer.TYPE);
        q1 q1Var = null;
        if (j8 != null) {
            if (!c.a()) {
                q1Var = new p1(j8);
            } else if (f9) {
                q1Var = new o1(j8, 1);
            } else if (f10) {
                q1Var = new o1(j8, 0);
            }
        }
        f903c = q1Var;
        f904d = q1Var == null ? false : q1Var.s();
        f905e = q1Var == null ? false : q1Var.r();
        f906f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e9 = e();
        if (e9 != null && q1Var != null) {
            q1Var.j(e9);
        }
        f907g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(r1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f901a.allocateInstance(cls);
        } catch (InstantiationException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static int c(Class cls) {
        if (f905e) {
            return f903c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f905e) {
            f903c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (c.a()) {
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

    public static boolean f(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f902b;
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

    public static byte g(byte[] bArr, long j8) {
        return f903c.d(f906f + j8, bArr);
    }

    public static byte h(long j8, Object obj) {
        return (byte) ((f903c.g((-4) & j8, obj) >>> ((int) (((~j8) & 3) << 3))) & 255);
    }

    public static byte i(long j8, Object obj) {
        return (byte) ((f903c.g((-4) & j8, obj) >>> ((int) ((j8 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new n1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j8, byte b9) {
        f903c.l(bArr, f906f + j8, b9);
    }

    public static void l(Object obj, long j8, byte b9) {
        long j9 = (-4) & j8;
        int g9 = f903c.g(j9, obj);
        int i7 = ((~((int) j8)) & 3) << 3;
        n(((255 & b9) << i7) | (g9 & (~(255 << i7))), j9, obj);
    }

    public static void m(Object obj, long j8, byte b9) {
        long j9 = (-4) & j8;
        int i7 = (((int) j8) & 3) << 3;
        n(((255 & b9) << i7) | (f903c.g(j9, obj) & (~(255 << i7))), j9, obj);
    }

    public static void n(int i7, long j8, Object obj) {
        f903c.o(i7, j8, obj);
    }

    public static void o(Object obj, long j8, long j9) {
        f903c.p(obj, j8, j9);
    }

    public static void p(long j8, Object obj, Object obj2) {
        f903c.q(j8, obj, obj2);
    }
}
