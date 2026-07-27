package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class M1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f5079a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f5080b;

    /* renamed from: c, reason: collision with root package name */
    public static final L1 f5081c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5082d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5083e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5084f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5085g;

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(17:(1:64)(1:(1:66))|4|(7:42|43|44|45|46|(4:50|51|(1:53)|56)|(14:49|7|(14:35|36|37|38|10|11|12|(3:25|26|(6:30|(1:18)|19|(1:21)|22|23))|14|(2:16|18)|19|(0)|22|23)|9|10|11|12|(0)|14|(0)|19|(0)|22|23))|6|7|(0)|9|10|11|12|(0)|14|(0)|19|(0)|22|23)|3|4|(0)|6|7|(0)|9|10|11|12|(0)|14|(0)|19|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0152, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0077, code lost:
    
        if (r0.getType() == java.lang.Long.TYPE) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004d  */
    static {
        L1 j12;
        Field field;
        boolean z;
        L1 l12;
        boolean z5;
        Field field2;
        Field field3;
        L1 l13;
        Unsafe j2 = j();
        f5079a = j2;
        int i2 = U0.f5108a;
        f5080b = Memory.class;
        Class cls = Long.TYPE;
        boolean s2 = s(cls);
        boolean s4 = s(Integer.TYPE);
        if (j2 != null) {
            if (s2) {
                j12 = new K1(j2);
            } else if (s4) {
                j12 = new J1(j2);
            }
            f5081c = j12;
            if (j12 != null) {
                try {
                    Class<?> cls2 = j12.f5077a.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls);
                    try {
                        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        field = null;
                    }
                    if (field == null) {
                        try {
                            field = Buffer.class.getDeclaredField("address");
                        } catch (Throwable unused2) {
                            field = null;
                        }
                        if (field != null) {
                        }
                        field = null;
                    }
                } catch (Throwable th) {
                    Logger.getLogger(M1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }
                if (field != null) {
                    z = true;
                    f5082d = z;
                    l12 = f5081c;
                    if (l12 != null) {
                        try {
                            Class<?> cls3 = l12.f5077a.getClass();
                            cls3.getMethod("objectFieldOffset", Field.class);
                            cls3.getMethod("arrayBaseOffset", Class.class);
                            cls3.getMethod("arrayIndexScale", Class.class);
                            Class cls4 = Long.TYPE;
                            cls3.getMethod("getInt", Object.class, cls4);
                            cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                            cls3.getMethod("getLong", Object.class, cls4);
                            cls3.getMethod("putLong", Object.class, cls4, cls4);
                            cls3.getMethod("getObject", Object.class, cls4);
                            cls3.getMethod("putObject", Object.class, cls4, Object.class);
                            z5 = true;
                        } catch (Throwable th2) {
                            Logger.getLogger(M1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                        f5083e = z5;
                        f5084f = u(byte[].class);
                        u(boolean[].class);
                        a(boolean[].class);
                        u(int[].class);
                        a(int[].class);
                        u(long[].class);
                        a(long[].class);
                        u(float[].class);
                        a(float[].class);
                        u(double[].class);
                        a(double[].class);
                        u(Object[].class);
                        a(Object[].class);
                        int i3 = U0.f5108a;
                        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                        if (field2 == null) {
                            try {
                                field2 = Buffer.class.getDeclaredField("address");
                            } catch (Throwable unused3) {
                                field2 = null;
                            }
                            if (field2 == null || field2.getType() != Long.TYPE) {
                                field3 = null;
                                if (field3 != null && (l13 = f5081c) != null) {
                                    l13.f5077a.objectFieldOffset(field3);
                                }
                                f5085g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                            }
                        }
                        field3 = field2;
                        if (field3 != null) {
                            l13.f5077a.objectFieldOffset(field3);
                        }
                        f5085g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                    z5 = false;
                    f5083e = z5;
                    f5084f = u(byte[].class);
                    u(boolean[].class);
                    a(boolean[].class);
                    u(int[].class);
                    a(int[].class);
                    u(long[].class);
                    a(long[].class);
                    u(float[].class);
                    a(float[].class);
                    u(double[].class);
                    a(double[].class);
                    u(Object[].class);
                    a(Object[].class);
                    int i32 = U0.f5108a;
                    field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    if (field2 == null) {
                    }
                    field3 = field2;
                    if (field3 != null) {
                    }
                    f5085g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
            }
            z = false;
            f5082d = z;
            l12 = f5081c;
            if (l12 != null) {
            }
            z5 = false;
            f5083e = z5;
            f5084f = u(byte[].class);
            u(boolean[].class);
            a(boolean[].class);
            u(int[].class);
            a(int[].class);
            u(long[].class);
            a(long[].class);
            u(float[].class);
            a(float[].class);
            u(double[].class);
            a(double[].class);
            u(Object[].class);
            a(Object[].class);
            int i322 = U0.f5108a;
            field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field2 == null) {
            }
            field3 = field2;
            if (field3 != null) {
            }
            f5085g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        j12 = null;
        f5081c = j12;
        if (j12 != null) {
        }
        z = false;
        f5082d = z;
        l12 = f5081c;
        if (l12 != null) {
        }
        z5 = false;
        f5083e = z5;
        f5084f = u(byte[].class);
        u(boolean[].class);
        a(boolean[].class);
        u(int[].class);
        a(int[].class);
        u(long[].class);
        a(long[].class);
        u(float[].class);
        a(float[].class);
        u(double[].class);
        a(double[].class);
        u(Object[].class);
        a(Object[].class);
        int i3222 = U0.f5108a;
        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field2 == null) {
        }
        field3 = field2;
        if (field3 != null) {
        }
        f5085g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f5083e) {
            f5081c.f5077a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j2, byte b6) {
        L1 l12 = f5081c;
        long j6 = (-4) & j2;
        int i2 = l12.f5077a.getInt(obj, j6);
        int i3 = ((~((int) j2)) & 3) << 3;
        l12.f5077a.putInt(obj, j6, ((255 & b6) << i3) | (i2 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i3))));
    }

    public static void c(Object obj, long j2, byte b6) {
        L1 l12 = f5081c;
        long j6 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        l12.f5077a.putInt(obj, j6, ((255 & b6) << i2) | (l12.f5077a.getInt(obj, j6) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    public static double d(long j2, Object obj) {
        return f5081c.a(j2, obj);
    }

    public static float e(long j2, Object obj) {
        return f5081c.b(j2, obj);
    }

    public static int f(long j2, Object obj) {
        return f5081c.f5077a.getInt(obj, j2);
    }

    public static long g(long j2, Object obj) {
        return f5081c.f5077a.getLong(obj, j2);
    }

    public static Object h(Class cls) {
        try {
            return f5079a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static Object i(long j2, Object obj) {
        return f5081c.f5077a.getObject(obj, j2);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new I1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j2, boolean z) {
        f5081c.c(obj, j2, z);
    }

    public static void l(Object obj, long j2, double d6) {
        f5081c.e(obj, j2, d6);
    }

    public static void m(Object obj, long j2, float f3) {
        f5081c.f(obj, j2, f3);
    }

    public static void n(Object obj, long j2, int i2) {
        f5081c.f5077a.putInt(obj, j2, i2);
    }

    public static void o(Object obj, long j2, long j6) {
        f5081c.f5077a.putLong(obj, j2, j6);
    }

    public static void p(long j2, Object obj, Object obj2) {
        f5081c.f5077a.putObject(obj, j2, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean q(long j2, Object obj) {
        return ((byte) ((f5081c.f5077a.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean r(long j2, Object obj) {
        return ((byte) ((f5081c.f5077a.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean s(Class cls) {
        int i2 = U0.f5108a;
        try {
            Class cls2 = f5080b;
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

    public static boolean t(long j2, Object obj) {
        return f5081c.g(j2, obj);
    }

    public static int u(Class cls) {
        if (f5083e) {
            return f5081c.f5077a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
