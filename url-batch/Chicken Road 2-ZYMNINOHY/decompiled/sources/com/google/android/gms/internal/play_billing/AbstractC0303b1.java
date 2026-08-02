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

/* renamed from: com.google.android.gms.internal.play_billing.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0303b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f5933a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f5934b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0300a1 f5935c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5936d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5937e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5938f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5939g;

    /* JADX WARN: Removed duplicated region for block: B:15:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    static {
        boolean z;
        AbstractC0300a1 abstractC0300a1;
        boolean z4;
        Field b4;
        AbstractC0300a1 abstractC0300a12;
        Unsafe i4 = i();
        f5933a = i4;
        int i5 = AbstractC0326j0.f5958a;
        f5934b = Memory.class;
        Class cls = Long.TYPE;
        boolean o = o(cls);
        Class cls2 = Integer.TYPE;
        boolean o4 = o(cls2);
        AbstractC0300a1 abstractC0300a13 = null;
        if (i4 != null) {
            if (o) {
                abstractC0300a13 = new Z0(i4);
            } else if (o4) {
                abstractC0300a13 = new Y0(i4);
            }
        }
        f5935c = abstractC0300a13;
        if (abstractC0300a13 != null) {
            try {
                Class<?> cls3 = abstractC0300a13.f5931a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                Logger.getLogger(AbstractC0303b1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
            if (b() != null) {
                z = true;
                f5936d = z;
                abstractC0300a1 = f5935c;
                if (abstractC0300a1 != null) {
                    try {
                        Class<?> cls4 = abstractC0300a1.f5931a.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z4 = true;
                    } catch (Throwable th2) {
                        Logger.getLogger(AbstractC0303b1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                    }
                    f5937e = z4;
                    f5938f = p(byte[].class);
                    p(boolean[].class);
                    a(boolean[].class);
                    p(int[].class);
                    a(int[].class);
                    p(long[].class);
                    a(long[].class);
                    p(float[].class);
                    a(float[].class);
                    p(double[].class);
                    a(double[].class);
                    p(Object[].class);
                    a(Object[].class);
                    b4 = b();
                    if (b4 != null && (abstractC0300a12 = f5935c) != null) {
                        abstractC0300a12.f5931a.objectFieldOffset(b4);
                    }
                    f5939g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z4 = false;
                f5937e = z4;
                f5938f = p(byte[].class);
                p(boolean[].class);
                a(boolean[].class);
                p(int[].class);
                a(int[].class);
                p(long[].class);
                a(long[].class);
                p(float[].class);
                a(float[].class);
                p(double[].class);
                a(double[].class);
                p(Object[].class);
                a(Object[].class);
                b4 = b();
                if (b4 != null) {
                    abstractC0300a12.f5931a.objectFieldOffset(b4);
                }
                f5939g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        f5936d = z;
        abstractC0300a1 = f5935c;
        if (abstractC0300a1 != null) {
        }
        z4 = false;
        f5937e = z4;
        f5938f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        b4 = b();
        if (b4 != null) {
        }
        f5939g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f5937e) {
            f5935c.f5931a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i4 = AbstractC0326j0.f5958a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j4, byte b4) {
        Unsafe unsafe = f5935c.f5931a;
        long j5 = (-4) & j4;
        int i4 = unsafe.getInt(obj, j5);
        int i5 = ((~((int) j4)) & 3) << 3;
        unsafe.putInt(obj, j5, ((255 & b4) << i5) | (i4 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i5))));
    }

    public static void d(Object obj, long j4, byte b4) {
        Unsafe unsafe = f5935c.f5931a;
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        unsafe.putInt(obj, j5, ((255 & b4) << i4) | (unsafe.getInt(obj, j5) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i4))));
    }

    public static int e(long j4, Object obj) {
        return f5935c.f5931a.getInt(obj, j4);
    }

    public static long f(long j4, Object obj) {
        return f5935c.f5931a.getLong(obj, j4);
    }

    public static Object g(Class cls) {
        try {
            return f5933a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Object h(long j4, Object obj) {
        return f5935c.f5931a.getObject(obj, j4);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new X0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(long j4, Object obj, int i4) {
        f5935c.f5931a.putInt(obj, j4, i4);
    }

    public static void k(Object obj, long j4, long j5) {
        f5935c.f5931a.putLong(obj, j4, j5);
    }

    public static void l(long j4, Object obj, Object obj2) {
        f5935c.f5931a.putObject(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(long j4, Object obj) {
        return ((byte) ((f5935c.f5931a.getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(long j4, Object obj) {
        return ((byte) ((f5935c.f5931a.getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean o(Class cls) {
        int i4 = AbstractC0326j0.f5958a;
        try {
            Class cls2 = f5934b;
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

    public static int p(Class cls) {
        if (f5937e) {
            return f5935c.f5931a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
