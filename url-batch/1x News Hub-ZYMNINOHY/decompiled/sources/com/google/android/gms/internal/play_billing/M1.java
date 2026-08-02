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
    public static final Unsafe f2764a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f2765b;

    /* renamed from: c, reason: collision with root package name */
    public static final L1 f2766c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2767d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2768e;
    public static final long f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2769g;

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(18:(1:65)(1:(1:67))|4|(7:43|44|45|46|47|(4:51|52|(1:54)|57)|(14:50|8|(14:36|37|38|39|11|12|13|(3:26|27|(6:31|(1:19)|20|(1:22)|23|24))|15|(2:17|19)|20|(0)|23|24)|10|11|12|13|(0)|15|(0)|20|(0)|23|24))|6|7|8|(0)|10|11|12|13|(0)|15|(0)|20|(0)|23|24)|3|4|(0)|6|7|8|(0)|10|11|12|13|(0)|15|(0)|20|(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0157, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (r0.getType() == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    static {
        L1 j12;
        Class cls;
        Field field;
        boolean z;
        L1 l12;
        boolean z2;
        Field field2;
        Field field3;
        L1 l13;
        Unsafe h3 = h();
        f2764a = h3;
        int i3 = U0.f2792a;
        f2765b = Memory.class;
        Class<?> cls2 = Long.TYPE;
        boolean n3 = n(cls2);
        Class cls3 = Integer.TYPE;
        boolean n4 = n(cls3);
        if (h3 != null) {
            if (n3) {
                j12 = new K1(h3);
            } else if (n4) {
                j12 = new J1(h3);
            }
            f2766c = j12;
            if (j12 != null) {
                try {
                    Class<?> cls4 = j12.f2760a.getClass();
                    cls4.getMethod("objectFieldOffset", Field.class);
                    cls4.getMethod("getLong", Object.class, cls2);
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
                    cls = Class.class;
                    Logger.getLogger(M1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }
                if (field != null) {
                    cls = Class.class;
                    z = true;
                    f2767d = z;
                    l12 = f2766c;
                    if (l12 != null) {
                        try {
                            Class<?> cls5 = l12.f2760a.getClass();
                            cls5.getMethod("objectFieldOffset", Field.class);
                            cls5.getMethod("arrayBaseOffset", cls);
                            cls5.getMethod("arrayIndexScale", cls);
                            cls5.getMethod("getInt", Object.class, cls2);
                            cls5.getMethod("putInt", Object.class, cls2, cls3);
                            cls5.getMethod("getLong", Object.class, cls2);
                            cls5.getMethod("putLong", Object.class, cls2, cls2);
                            cls5.getMethod("getObject", Object.class, cls2);
                            cls5.getMethod("putObject", Object.class, cls2, Object.class);
                            z2 = true;
                        } catch (Throwable th2) {
                            Logger.getLogger(M1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                        f2768e = z2;
                        f = o(byte[].class);
                        o(boolean[].class);
                        a(boolean[].class);
                        o(int[].class);
                        a(int[].class);
                        o(long[].class);
                        a(long[].class);
                        o(float[].class);
                        a(float[].class);
                        o(double[].class);
                        a(double[].class);
                        o(Object[].class);
                        a(Object[].class);
                        int i4 = U0.f2792a;
                        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                        if (field2 == null) {
                            try {
                                field2 = Buffer.class.getDeclaredField("address");
                            } catch (Throwable unused3) {
                                field2 = null;
                            }
                            if (field2 == null || field2.getType() != cls2) {
                                field3 = null;
                                if (field3 != null && (l13 = f2766c) != null) {
                                    l13.f2760a.objectFieldOffset(field3);
                                }
                                f2769g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                            }
                        }
                        field3 = field2;
                        if (field3 != null) {
                            l13.f2760a.objectFieldOffset(field3);
                        }
                        f2769g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                    z2 = false;
                    f2768e = z2;
                    f = o(byte[].class);
                    o(boolean[].class);
                    a(boolean[].class);
                    o(int[].class);
                    a(int[].class);
                    o(long[].class);
                    a(long[].class);
                    o(float[].class);
                    a(float[].class);
                    o(double[].class);
                    a(double[].class);
                    o(Object[].class);
                    a(Object[].class);
                    int i42 = U0.f2792a;
                    field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    if (field2 == null) {
                    }
                    field3 = field2;
                    if (field3 != null) {
                    }
                    f2769g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
            }
            cls = Class.class;
            z = false;
            f2767d = z;
            l12 = f2766c;
            if (l12 != null) {
            }
            z2 = false;
            f2768e = z2;
            f = o(byte[].class);
            o(boolean[].class);
            a(boolean[].class);
            o(int[].class);
            a(int[].class);
            o(long[].class);
            a(long[].class);
            o(float[].class);
            a(float[].class);
            o(double[].class);
            a(double[].class);
            o(Object[].class);
            a(Object[].class);
            int i422 = U0.f2792a;
            field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field2 == null) {
            }
            field3 = field2;
            if (field3 != null) {
            }
            f2769g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        j12 = null;
        f2766c = j12;
        if (j12 != null) {
        }
        cls = Class.class;
        z = false;
        f2767d = z;
        l12 = f2766c;
        if (l12 != null) {
        }
        z2 = false;
        f2768e = z2;
        f = o(byte[].class);
        o(boolean[].class);
        a(boolean[].class);
        o(int[].class);
        a(int[].class);
        o(long[].class);
        a(long[].class);
        o(float[].class);
        a(float[].class);
        o(double[].class);
        a(double[].class);
        o(Object[].class);
        a(Object[].class);
        int i4222 = U0.f2792a;
        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field2 == null) {
        }
        field3 = field2;
        if (field3 != null) {
        }
        f2769g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f2768e) {
            f2766c.f2760a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j3, byte b3) {
        L1 l12 = f2766c;
        long j4 = (-4) & j3;
        int i3 = l12.f2760a.getInt(obj, j4);
        int i4 = ((~((int) j3)) & 3) << 3;
        l12.f2760a.putInt(obj, j4, ((255 & b3) << i4) | (i3 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i4))));
    }

    public static void c(Object obj, long j3, byte b3) {
        L1 l12 = f2766c;
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        l12.f2760a.putInt(obj, j4, ((255 & b3) << i3) | (l12.f2760a.getInt(obj, j4) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i3))));
    }

    public static int d(long j3, Object obj) {
        return f2766c.f2760a.getInt(obj, j3);
    }

    public static long e(long j3, Object obj) {
        return f2766c.f2760a.getLong(obj, j3);
    }

    public static Object f(Class cls) {
        try {
            return f2764a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static Object g(long j3, Object obj) {
        return f2766c.f2760a.getObject(obj, j3);
    }

    public static Unsafe h() {
        try {
            return (Unsafe) AccessController.doPrivileged(new I1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(Object obj, long j3, int i3) {
        f2766c.f2760a.putInt(obj, j3, i3);
    }

    public static void j(Object obj, long j3, long j4) {
        f2766c.f2760a.putLong(obj, j3, j4);
    }

    public static void k(long j3, Object obj, Object obj2) {
        f2766c.f2760a.putObject(obj, j3, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean l(long j3, Object obj) {
        return ((byte) ((f2766c.f2760a.getInt(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean m(long j3, Object obj) {
        return ((byte) ((f2766c.f2760a.getInt(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean n(Class cls) {
        int i3 = U0.f2792a;
        try {
            Class cls2 = f2765b;
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

    public static int o(Class cls) {
        if (f2768e) {
            return f2766c.f2760a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
