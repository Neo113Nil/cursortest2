package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f3033a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f3034b;

    /* renamed from: c, reason: collision with root package name */
    public static final y2 f3035c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3036d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f3037e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f3038f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    static {
        boolean z10;
        Field a9;
        y2 y2Var;
        Unsafe l10 = l();
        f3033a = l10;
        int i3 = q0.f2690a;
        f3034b = Memory.class;
        Class cls = Long.TYPE;
        boolean m10 = m(cls);
        Class cls2 = Integer.TYPE;
        boolean m11 = m(cls2);
        y2 y2Var2 = null;
        if (l10 != null) {
            if (m10) {
                y2Var2 = new x2(l10);
            } else if (m11) {
                y2Var2 = new w2(l10);
            }
        }
        f3035c = y2Var2;
        if (y2Var2 != null) {
            try {
                Class<?> cls3 = ((Unsafe) y2Var2.f3003a).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th) {
                Logger.getLogger(z2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        y2 y2Var3 = f3035c;
        if (y2Var3 != null) {
            try {
                Class<?> cls4 = ((Unsafe) y2Var3.f3003a).getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z10 = true;
            } catch (Throwable th2) {
                Logger.getLogger(z2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
            f3036d = z10;
            f3037e = p(byte[].class);
            p(boolean[].class);
            q(boolean[].class);
            p(int[].class);
            q(int[].class);
            p(long[].class);
            q(long[].class);
            p(float[].class);
            q(float[].class);
            p(double[].class);
            q(double[].class);
            p(Object[].class);
            q(Object[].class);
            a9 = a();
            if (a9 != null && (y2Var = f3035c) != null) {
                ((Unsafe) y2Var.f3003a).objectFieldOffset(a9);
            }
            f3038f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        z10 = false;
        f3036d = z10;
        f3037e = p(byte[].class);
        p(boolean[].class);
        q(boolean[].class);
        p(int[].class);
        q(int[].class);
        p(long[].class);
        q(long[].class);
        p(float[].class);
        q(float[].class);
        p(double[].class);
        q(double[].class);
        p(Object[].class);
        q(Object[].class);
        a9 = a();
        if (a9 != null) {
            ((Unsafe) y2Var.f3003a).objectFieldOffset(a9);
        }
        f3038f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Field a() {
        Field field;
        Field field2;
        int i3 = q0.f2690a;
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

    public static void b(Object obj, long j, byte b10) {
        Unsafe unsafe = (Unsafe) f3035c.f3003a;
        long j3 = (-4) & j;
        int i3 = unsafe.getInt(obj, j3);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b10) << i10) | (i3 & (~(255 << i10))));
    }

    public static void c(Object obj, long j, byte b10) {
        Unsafe unsafe = (Unsafe) f3035c.f3003a;
        long j3 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b10) << i3) | (unsafe.getInt(obj, j3) & (~(255 << i3))));
    }

    public static Object d(Class cls) {
        try {
            return f3033a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(long j, Object obj) {
        return ((Unsafe) f3035c.f3003a).getInt(obj, j);
    }

    public static void f(Object obj, long j, int i3) {
        ((Unsafe) f3035c.f3003a).putInt(obj, j, i3);
    }

    public static long g(long j, Object obj) {
        return ((Unsafe) f3035c.f3003a).getLong(obj, j);
    }

    public static void h(Object obj, long j, long j3) {
        ((Unsafe) f3035c.f3003a).putLong(obj, j, j3);
    }

    public static Object i(long j, Object obj) {
        return ((Unsafe) f3035c.f3003a).getObject(obj, j);
    }

    public static void j(long j, Object obj, Object obj2) {
        ((Unsafe) f3035c.f3003a).putObject(obj, j, obj2);
    }

    public static void k(byte[] bArr, long j, byte b10) {
        f3035c.b(bArr, f3037e + j, b10);
    }

    public static Unsafe l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new v2());
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
            Logger.getLogger(z2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean m(Class cls) {
        int i3 = q0.f2690a;
        try {
            Class cls2 = f3034b;
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

    public static /* synthetic */ boolean n(long j, Object obj) {
        return ((byte) ((((Unsafe) f3035c.f3003a).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean o(long j, Object obj) {
        return ((byte) ((((Unsafe) f3035c.f3003a).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int p(Class cls) {
        if (f3036d) {
            return ((Unsafe) f3035c.f3003a).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void q(Class cls) {
        if (f3036d) {
            ((Unsafe) f3035c.f3003a).arrayIndexScale(cls);
        }
    }
}
