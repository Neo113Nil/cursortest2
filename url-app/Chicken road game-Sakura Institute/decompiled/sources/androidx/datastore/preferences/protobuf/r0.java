package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f5395a;

    public r0(Unsafe unsafe) {
        this.f5395a = unsafe;
    }

    public final int a(Class cls) {
        return this.f5395a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f5395a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j4, Object obj);

    public abstract byte d(long j4, Object obj);

    public abstract double e(long j4, Object obj);

    public abstract float f(long j4, Object obj);

    public final int g(long j4, Object obj) {
        return this.f5395a.getInt(obj, j4);
    }

    public final long h(long j4, Object obj) {
        return this.f5395a.getLong(obj, j4);
    }

    public final Object i(long j4, Object obj) {
        return this.f5395a.getObject(obj, j4);
    }

    public final long j(Field field) {
        return this.f5395a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j4, boolean z4);

    public abstract void l(Object obj, long j4, byte b4);

    public abstract void m(Object obj, long j4, double d4);

    public abstract void n(Object obj, long j4, float f4);

    public final void o(int i2, long j4, Object obj) {
        this.f5395a.putInt(obj, j4, i2);
    }

    public final void p(Object obj, long j4, long j5) {
        this.f5395a.putLong(obj, j4, j5);
    }

    public final void q(long j4, Object obj, Object obj2) {
        this.f5395a.putObject(obj, j4, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f5395a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            s0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
