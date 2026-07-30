package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f3517a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f3518b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f3519c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3520d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f3521e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f3522f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f3523g;

    static {
        Unsafe i2 = i();
        f3517a = i2;
        f3518b = AbstractC0187c.f3483a;
        boolean h7 = h(Long.TYPE);
        boolean h8 = h(Integer.TYPE);
        h0 h0Var = null;
        if (i2 != null) {
            if (!AbstractC0187c.a()) {
                h0Var = new g0(i2);
            } else if (h7) {
                h0Var = new f0(i2, 1);
            } else if (h8) {
                h0Var = new f0(i2, 0);
            }
        }
        f3519c = h0Var;
        f3520d = h0Var == null ? false : h0Var.r();
        f3521e = h0Var == null ? false : h0Var.q();
        f3522f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g7 = g();
        if (g7 != null && h0Var != null) {
            h0Var.i(g7);
        }
        f3523g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        return ((byte) ((f3519c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j, Object obj) {
        return ((byte) ((f3519c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f3517a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int e(Class cls) {
        if (f3521e) {
            return f3519c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f3521e) {
            f3519c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0187c.a()) {
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

    public static boolean h(Class cls) {
        if (!AbstractC0187c.a()) {
            return false;
        }
        try {
            Class cls2 = f3518b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, byte b7, long j) {
        f3519c.k(bArr, f3522f + j, b7);
    }

    public static void k(Object obj, long j, byte b7) {
        long j7 = (-4) & j;
        int f7 = f3519c.f(j7, obj);
        int i2 = ((~((int) j)) & 3) << 3;
        m(obj, j7, ((255 & b7) << i2) | (f7 & (~(255 << i2))));
    }

    public static void l(Object obj, long j, byte b7) {
        long j7 = (-4) & j;
        int i2 = (((int) j) & 3) << 3;
        m(obj, j7, ((255 & b7) << i2) | (f3519c.f(j7, obj) & (~(255 << i2))));
    }

    public static void m(Object obj, long j, int i2) {
        f3519c.n(obj, j, i2);
    }

    public static void n(Object obj, long j, long j7) {
        f3519c.o(obj, j, j7);
    }

    public static void o(long j, Object obj, Object obj2) {
        f3519c.p(j, obj, obj2);
    }
}
