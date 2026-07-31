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
    public static final Unsafe f5124a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f5125b;

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f5126c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5127d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5128e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5129f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5130g;

    static {
        Unsafe m3 = m();
        f5124a = m3;
        f5125b = AbstractC0249c.f5051a;
        boolean f3 = f(Long.TYPE);
        boolean f4 = f(Integer.TYPE);
        r0 r0Var = null;
        if (m3 != null) {
            if (!AbstractC0249c.a()) {
                r0Var = new q0(m3);
            } else if (f3) {
                r0Var = new p0(m3, 1);
            } else if (f4) {
                r0Var = new p0(m3, 0);
            }
        }
        f5126c = r0Var;
        f5127d = r0Var == null ? false : r0Var.s();
        f5128e = r0Var == null ? false : r0Var.r();
        f5129f = c(byte[].class);
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
        Field e3 = e();
        if (e3 != null && r0Var != null) {
            r0Var.j(e3);
        }
        f5130g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(s0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f5124a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int c(Class cls) {
        if (f5128e) {
            return f5126c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f5128e) {
            f5126c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (AbstractC0249c.a()) {
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
        if (!AbstractC0249c.a()) {
            return false;
        }
        try {
            Class cls2 = f5125b;
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

    public static byte g(byte[] bArr, long j3) {
        return f5126c.d(f5129f + j3, bArr);
    }

    public static byte h(long j3, Object obj) {
        return (byte) ((f5126c.g((-4) & j3, obj) >>> ((int) (((~j3) & 3) << 3))) & 255);
    }

    public static byte i(long j3, Object obj) {
        return (byte) ((f5126c.g((-4) & j3, obj) >>> ((int) ((j3 & 3) << 3))) & 255);
    }

    public static int j(AbstractC0267v abstractC0267v, long j3) {
        return f5126c.g(j3, abstractC0267v);
    }

    public static long k(AbstractC0267v abstractC0267v, long j3) {
        return f5126c.h(j3, abstractC0267v);
    }

    public static Object l(AbstractC0267v abstractC0267v, long j3) {
        return f5126c.i(j3, abstractC0267v);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(byte[] bArr, long j3, byte b3) {
        f5126c.l(bArr, f5129f + j3, b3);
    }

    public static void o(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int g3 = f5126c.g(j4, obj);
        int i3 = ((~((int) j3)) & 3) << 3;
        q(((255 & b3) << i3) | (g3 & (~(255 << i3))), j4, obj);
    }

    public static void p(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        q(((255 & b3) << i3) | (f5126c.g(j4, obj) & (~(255 << i3))), j4, obj);
    }

    public static void q(int i3, long j3, Object obj) {
        f5126c.o(i3, j3, obj);
    }

    public static void r(Object obj, long j3, long j4) {
        f5126c.p(obj, j3, j4);
    }

    public static void s(long j3, Object obj, Object obj2) {
        f5126c.q(j3, obj, obj2);
    }
}
