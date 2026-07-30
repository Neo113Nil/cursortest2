package defpackage;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class sp3 {
    public static final Unsafe a;
    public static final Class b;
    public static final rp3 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    static {
        boolean z;
        rp3 rp3Var;
        boolean z2;
        Field b2;
        rp3 rp3Var2;
        Unsafe l = l();
        a = l;
        int i = cm3.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean m = m(cls);
        Class cls2 = Integer.TYPE;
        boolean m2 = m(cls2);
        rp3 rp3Var3 = null;
        if (l != null) {
            if (m) {
                rp3Var3 = new pp3(l);
            } else if (m2) {
                rp3Var3 = new op3(l);
            }
        }
        c = rp3Var3;
        if (rp3Var3 != null) {
            try {
                Class<?> cls3 = ((Unsafe) rp3Var3.m).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                Logger.getLogger(sp3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
            if (b() != null) {
                z = true;
                d = z;
                rp3Var = c;
                if (rp3Var != null) {
                    try {
                        Class<?> cls4 = ((Unsafe) rp3Var.m).getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        Logger.getLogger(sp3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                    }
                    e = z2;
                    f = p(byte[].class);
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
                    b2 = b();
                    if (b2 != null && (rp3Var2 = c) != null) {
                        ((Unsafe) rp3Var2.m).objectFieldOffset(b2);
                    }
                    g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                e = z2;
                f = p(byte[].class);
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
                b2 = b();
                if (b2 != null) {
                    ((Unsafe) rp3Var2.m).objectFieldOffset(b2);
                }
                g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        d = z;
        rp3Var = c;
        if (rp3Var != null) {
        }
        z2 = false;
        e = z2;
        f = p(byte[].class);
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
        b2 = b();
        if (b2 != null) {
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (e) {
            ((Unsafe) c.m).arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i = cm3.a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = (Unsafe) c.m;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void d(Object obj, long j, byte b2) {
        Unsafe unsafe = (Unsafe) c.m;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static Object e(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int f(long j, Object obj) {
        return ((Unsafe) c.m).getInt(obj, j);
    }

    public static void g(int i, long j, Object obj) {
        ((Unsafe) c.m).putInt(obj, j, i);
    }

    public static long h(long j, Object obj) {
        return ((Unsafe) c.m).getLong(obj, j);
    }

    public static void i(Object obj, long j, long j2) {
        ((Unsafe) c.m).putLong(obj, j, j2);
    }

    public static Object j(long j, Object obj) {
        return ((Unsafe) c.m).getObject(obj, j);
    }

    public static void k(long j, Object obj, Object obj2) {
        ((Unsafe) c.m).putObject(obj, j, obj2);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new mp3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean m(Class cls) {
        int i = cm3.a;
        try {
            Class cls2 = b;
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
        return ((byte) ((((Unsafe) c.m).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean o(long j, Object obj) {
        return ((byte) ((((Unsafe) c.m).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int p(Class cls) {
        if (e) {
            return ((Unsafe) c.m).arrayBaseOffset(cls);
        }
        return -1;
    }
}
