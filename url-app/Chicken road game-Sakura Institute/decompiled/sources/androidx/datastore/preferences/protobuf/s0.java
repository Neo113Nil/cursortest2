package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f5398a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f5399b;

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f5400c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5401d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5402e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5403f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5404g;

    static {
        Unsafe m4 = m();
        f5398a = m4;
        f5399b = AbstractC0438c.f5325a;
        boolean f4 = f(Long.TYPE);
        boolean f5 = f(Integer.TYPE);
        r0 r0Var = null;
        if (m4 != null) {
            if (!AbstractC0438c.a()) {
                r0Var = new q0(m4);
            } else if (f4) {
                r0Var = new p0(m4, 1);
            } else if (f5) {
                r0Var = new p0(m4, 0);
            }
        }
        f5400c = r0Var;
        f5401d = r0Var == null ? false : r0Var.s();
        f5402e = r0Var == null ? false : r0Var.r();
        f5403f = c(byte[].class);
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
        Field e4 = e();
        if (e4 != null && r0Var != null) {
            r0Var.j(e4);
        }
        f5404g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(s0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f5398a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int c(Class cls) {
        if (f5402e) {
            return f5400c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f5402e) {
            f5400c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (AbstractC0438c.a()) {
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
        if (!AbstractC0438c.a()) {
            return false;
        }
        try {
            Class cls2 = f5399b;
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

    public static byte g(byte[] bArr, long j4) {
        return f5400c.d(f5403f + j4, bArr);
    }

    public static byte h(long j4, Object obj) {
        return (byte) ((f5400c.g((-4) & j4, obj) >>> ((int) (((~j4) & 3) << 3))) & 255);
    }

    public static byte i(long j4, Object obj) {
        return (byte) ((f5400c.g((-4) & j4, obj) >>> ((int) ((j4 & 3) << 3))) & 255);
    }

    public static int j(AbstractC0456v abstractC0456v, long j4) {
        return f5400c.g(j4, abstractC0456v);
    }

    public static long k(AbstractC0456v abstractC0456v, long j4) {
        return f5400c.h(j4, abstractC0456v);
    }

    public static Object l(AbstractC0456v abstractC0456v, long j4) {
        return f5400c.i(j4, abstractC0456v);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(byte[] bArr, byte b4, long j4) {
        f5400c.l(bArr, f5403f + j4, b4);
    }

    public static void o(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int g4 = f5400c.g(j5, obj);
        int i2 = ((~((int) j4)) & 3) << 3;
        q(((255 & b4) << i2) | (g4 & (~(255 << i2))), j5, obj);
    }

    public static void p(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int i2 = (((int) j4) & 3) << 3;
        q(((255 & b4) << i2) | (f5400c.g(j5, obj) & (~(255 << i2))), j5, obj);
    }

    public static void q(int i2, long j4, Object obj) {
        f5400c.o(i2, j4, obj);
    }

    public static void r(Object obj, long j4, long j5) {
        f5400c.p(obj, j4, j5);
    }

    public static void s(long j4, Object obj, Object obj2) {
        f5400c.q(j4, obj, obj2);
    }
}
