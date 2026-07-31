package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f715a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f716b;

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f717c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f718d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f719e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f720f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f721g;

    static {
        Unsafe i = i();
        f715a = i;
        f716b = c.f664a;
        boolean h8 = h(Long.TYPE);
        boolean h9 = h(Integer.TYPE);
        j1 j1Var = null;
        if (i != null) {
            if (!c.a()) {
                j1Var = new i1(i);
            } else if (h8) {
                j1Var = new h1(i, 1);
            } else if (h9) {
                j1Var = new h1(i, 0);
            }
        }
        f717c = j1Var;
        f718d = j1Var == null ? false : j1Var.r();
        f719e = j1Var == null ? false : j1Var.q();
        f720f = e(byte[].class);
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
        Field g3 = g();
        if (g3 != null && j1Var != null) {
            j1Var.i(g3);
        }
        f721g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(k1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j7, Object obj) {
        return ((byte) ((f717c.f((-4) & j7, obj) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j7, Object obj) {
        return ((byte) ((f717c.f((-4) & j7, obj) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f715a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static int e(Class cls) {
        if (f719e) {
            return f717c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f719e) {
            f717c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (c.a()) {
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
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f716b;
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
            return (Unsafe) AccessController.doPrivileged(new g1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j7, byte b8) {
        f717c.k(bArr, f720f + j7, b8);
    }

    public static void k(Object obj, long j7, byte b8) {
        long j8 = (-4) & j7;
        int f6 = f717c.f(j8, obj);
        int i = ((~((int) j7)) & 3) << 3;
        m(obj, j8, ((255 & b8) << i) | (f6 & (~(255 << i))));
    }

    public static void l(Object obj, long j7, byte b8) {
        long j8 = (-4) & j7;
        int i = (((int) j7) & 3) << 3;
        m(obj, j8, ((255 & b8) << i) | (f717c.f(j8, obj) & (~(255 << i))));
    }

    public static void m(Object obj, long j7, int i) {
        f717c.n(obj, j7, i);
    }

    public static void n(Object obj, long j7, long j8) {
        f717c.o(obj, j7, j8);
    }

    public static void o(Object obj, long j7, Object obj2) {
        f717c.p(obj, j7, obj2);
    }
}
