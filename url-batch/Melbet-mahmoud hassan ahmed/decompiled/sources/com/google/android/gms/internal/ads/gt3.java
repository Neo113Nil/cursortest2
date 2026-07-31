package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class gt3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f5756a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f5757b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f5758c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f5759d;

    /* renamed from: e, reason: collision with root package name */
    private static final ft3 f5760e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f5761f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f5762g;

    /* renamed from: h, reason: collision with root package name */
    static final long f5763h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f5764i;

    /* renamed from: j, reason: collision with root package name */
    static final boolean f5765j;

    /* JADX WARN: Removed duplicated region for block: B:15:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0141  */
    static {
        Unsafe unsafe;
        boolean z6;
        ft3 ft3Var;
        Unsafe unsafe2;
        boolean z7;
        Field e7;
        long j7;
        ft3 ft3Var2;
        Unsafe q7 = q();
        f5756a = q7;
        f5757b = do3.a();
        Class<?> cls = Long.TYPE;
        boolean G = G(cls);
        f5758c = G;
        boolean G2 = G(Integer.TYPE);
        f5759d = G2;
        ft3 ft3Var3 = null;
        if (q7 != null) {
            if (G) {
                ft3Var3 = new et3(q7);
            } else if (G2) {
                ft3Var3 = new dt3(q7);
            }
        }
        f5760e = ft3Var3;
        if (ft3Var3 != null && (unsafe = ft3Var3.f5218a) != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                r(th);
            }
            if (e() != null) {
                z6 = true;
                f5761f = z6;
                ft3Var = f5760e;
                if (ft3Var != null && (unsafe2 = ft3Var.f5218a) != null) {
                    try {
                        Class<?> cls3 = unsafe2.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        Class<?> cls4 = Long.TYPE;
                        cls3.getMethod("getInt", Object.class, cls4);
                        cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                        cls3.getMethod("getLong", Object.class, cls4);
                        cls3.getMethod("putLong", Object.class, cls4, cls4);
                        cls3.getMethod("getObject", Object.class, cls4);
                        cls3.getMethod("putObject", Object.class, cls4, Object.class);
                        z7 = true;
                    } catch (Throwable th2) {
                        r(th2);
                    }
                    f5762g = z7;
                    f5763h = c(byte[].class);
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
                    e7 = e();
                    j7 = -1;
                    if (e7 != null && (ft3Var2 = f5760e) != null) {
                        j7 = ft3Var2.n(e7);
                    }
                    f5764i = j7;
                    f5765j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z7 = false;
                f5762g = z7;
                f5763h = c(byte[].class);
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
                e7 = e();
                j7 = -1;
                if (e7 != null) {
                    j7 = ft3Var2.n(e7);
                }
                f5764i = j7;
                f5765j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z6 = false;
        f5761f = z6;
        ft3Var = f5760e;
        if (ft3Var != null) {
            Class<?> cls32 = unsafe2.getClass();
            cls32.getMethod("objectFieldOffset", Field.class);
            cls32.getMethod("arrayBaseOffset", Class.class);
            cls32.getMethod("arrayIndexScale", Class.class);
            Class<?> cls42 = Long.TYPE;
            cls32.getMethod("getInt", Object.class, cls42);
            cls32.getMethod("putInt", Object.class, cls42, Integer.TYPE);
            cls32.getMethod("getLong", Object.class, cls42);
            cls32.getMethod("putLong", Object.class, cls42, cls42);
            cls32.getMethod("getObject", Object.class, cls42);
            cls32.getMethod("putObject", Object.class, cls42, Object.class);
            z7 = true;
            f5762g = z7;
            f5763h = c(byte[].class);
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
            e7 = e();
            j7 = -1;
            if (e7 != null) {
            }
            f5764i = j7;
            f5765j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        z7 = false;
        f5762g = z7;
        f5763h = c(byte[].class);
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
        e7 = e();
        j7 = -1;
        if (e7 != null) {
        }
        f5764i = j7;
        f5765j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private gt3() {
    }

    static void A(Object obj, long j7, float f7) {
        f5760e.h(obj, j7, f7);
    }

    static void B(Object obj, long j7, int i7) {
        f5760e.p(obj, j7, i7);
    }

    static void C(Object obj, long j7, long j8) {
        f5760e.q(obj, j7, j8);
    }

    static void D(Object obj, long j7, Object obj2) {
        f5760e.r(obj, j7, obj2);
    }

    static /* bridge */ /* synthetic */ boolean E(Object obj, long j7) {
        return ((byte) ((f5760e.l(obj, (-4) & j7) >>> ((int) (((j7 ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean F(Object obj, long j7) {
        return ((byte) ((f5760e.l(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }

    static boolean G(Class<?> cls) {
        int i7 = do3.f4265a;
        try {
            Class<?> cls2 = f5757b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    static boolean H(Object obj, long j7) {
        return f5760e.i(obj, j7);
    }

    static boolean a() {
        return f5762g;
    }

    static boolean b() {
        return f5761f;
    }

    private static int c(Class<?> cls) {
        if (f5762g) {
            return f5760e.j(cls);
        }
        return -1;
    }

    private static int d(Class<?> cls) {
        if (f5762g) {
            return f5760e.k(cls);
        }
        return -1;
    }

    private static Field e() {
        int i7 = do3.f4265a;
        Field f7 = f(Buffer.class, "effectiveDirectAddress");
        if (f7 != null) {
            return f7;
        }
        Field f8 = f(Buffer.class, "address");
        if (f8 == null || f8.getType() != Long.TYPE) {
            return null;
        }
        return f8;
    }

    private static Field f(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        ft3 ft3Var = f5760e;
        int i7 = ((((int) j7) ^ (-1)) & 3) << 3;
        ft3Var.p(obj, j8, ((255 & b7) << i7) | (ft3Var.l(obj, j8) & ((255 << i7) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        ft3 ft3Var = f5760e;
        int i7 = (((int) j7) & 3) << 3;
        ft3Var.p(obj, j8, ((255 & b7) << i7) | (ft3Var.l(obj, j8) & ((255 << i7) ^ (-1))));
    }

    static byte i(long j7) {
        return f5760e.a(j7);
    }

    static double j(Object obj, long j7) {
        return f5760e.b(obj, j7);
    }

    static float k(Object obj, long j7) {
        return f5760e.c(obj, j7);
    }

    static int l(Object obj, long j7) {
        return f5760e.l(obj, j7);
    }

    static long m(ByteBuffer byteBuffer) {
        return f5760e.m(byteBuffer, f5764i);
    }

    static long n(Object obj, long j7) {
        return f5760e.m(obj, j7);
    }

    static <T> T o(Class<T> cls) {
        try {
            return (T) f5756a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    static Object p(Object obj, long j7) {
        return f5760e.o(obj, j7);
    }

    static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ct3());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void r(Throwable th) {
        Logger.getLogger(gt3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void w(long j7, byte[] bArr, long j8, long j9) {
        f5760e.d(j7, bArr, j8, j9);
    }

    static void x(Object obj, long j7, boolean z6) {
        f5760e.e(obj, j7, z6);
    }

    static void y(byte[] bArr, long j7, byte b7) {
        f5760e.f(bArr, f5763h + j7, b7);
    }

    static void z(Object obj, long j7, double d7) {
        f5760e.g(obj, j7, d7);
    }
}
