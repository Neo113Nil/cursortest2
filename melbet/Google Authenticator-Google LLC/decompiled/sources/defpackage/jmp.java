package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmp {
    static final boolean a;
    private static final Unsafe b;
    private static final Class c;
    private static final boolean d;
    private static final jmo e;
    private static final boolean f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x012d  */
    static {
        boolean z;
        Field g;
        jmo jmoVar;
        Unsafe h = h();
        b = h;
        c = Memory.class;
        boolean r = r(Long.TYPE);
        d = r;
        boolean r2 = r(Integer.TYPE);
        jmo jmoVar2 = null;
        if (h != null) {
            if (r) {
                jmoVar2 = new jmn(h);
            } else if (r2) {
                jmoVar2 = new jmm(h);
            }
        }
        e = jmoVar2;
        if (jmoVar2 != null) {
            try {
                Class<?> cls = jmoVar2.a.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                g();
            } catch (Throwable th) {
                i(th);
            }
        }
        jmo jmoVar3 = e;
        if (jmoVar3 != null) {
            try {
                Class<?> cls2 = jmoVar3.a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("arrayBaseOffset", Class.class);
                cls2.getMethod("arrayIndexScale", Class.class);
                cls2.getMethod("getInt", Object.class, Long.TYPE);
                cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls2.getMethod("getLong", Object.class, Long.TYPE);
                Class<?> cls3 = Long.TYPE;
                cls2.getMethod("putLong", Object.class, cls3, cls3);
                cls2.getMethod("getObject", Object.class, Long.TYPE);
                cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                z = true;
            } catch (Throwable th2) {
                i(th2);
            }
            f = z;
            x(byte[].class);
            x(boolean[].class);
            w(boolean[].class);
            x(int[].class);
            w(int[].class);
            x(long[].class);
            w(long[].class);
            x(float[].class);
            w(float[].class);
            x(double[].class);
            w(double[].class);
            x(Object[].class);
            w(Object[].class);
            g = g();
            if (g != null && (jmoVar = e) != null) {
                jmoVar.a.objectFieldOffset(g);
            }
            a = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        z = false;
        f = z;
        x(byte[].class);
        x(boolean[].class);
        w(boolean[].class);
        x(int[].class);
        w(int[].class);
        x(long[].class);
        w(long[].class);
        x(float[].class);
        w(float[].class);
        x(double[].class);
        w(double[].class);
        x(Object[].class);
        w(Object[].class);
        g = g();
        if (g != null) {
            jmoVar.a.objectFieldOffset(g);
        }
        a = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private jmp() {
    }

    static double a(Object obj, long j) {
        return e.a(obj, j);
    }

    static float b(Object obj, long j) {
        return e.b(obj, j);
    }

    static int c(Object obj, long j) {
        return e.g(obj, j);
    }

    static long d(Object obj, long j) {
        return e.h(obj, j);
    }

    static Object e(Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object f(Object obj, long j) {
        return e.a.getObject(obj, j);
    }

    public static Field g() {
        Field v = v(Buffer.class, "effectiveDirectAddress");
        if (v != null) {
            return v;
        }
        Field v2 = v(Buffer.class, "address");
        if (v2 == null || v2.getType() != Long.TYPE) {
            return null;
        }
        return v2;
    }

    static Unsafe h() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new jml());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(jmp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void i(Throwable th) {
        Logger.getLogger(jmp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void j(Object obj, long j, boolean z) {
        e.c(obj, j, z);
    }

    public static void k(Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        int i2 = b2 << i;
        o(obj, j2, i2 | ((~(255 << i)) & c(obj, j2)));
    }

    public static void l(Object obj, long j, byte b2) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        int i2 = b2 << i;
        o(obj, j2, i2 | ((~(255 << i)) & c(obj, j2)));
    }

    static void m(Object obj, long j, double d2) {
        e.d(obj, j, d2);
    }

    static void n(Object obj, long j, float f2) {
        e.e(obj, j, f2);
    }

    static void o(Object obj, long j, int i) {
        e.i(obj, j, i);
    }

    static void p(Object obj, long j, long j2) {
        e.j(obj, j, j2);
    }

    public static void q(Object obj, long j, Object obj2) {
        e.a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean r(Class cls) {
        try {
            Class cls2 = c;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            Class cls3 = Integer.TYPE;
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls3, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean s(Object obj, long j) {
        return e.f(obj, j);
    }

    public static boolean t(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean u(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    private static Field v(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void w(Class cls) {
        if (f) {
            e.a.arrayIndexScale(cls);
        }
    }

    private static void x(Class cls) {
        if (f) {
            e.a.arrayBaseOffset(cls);
        }
    }
}
