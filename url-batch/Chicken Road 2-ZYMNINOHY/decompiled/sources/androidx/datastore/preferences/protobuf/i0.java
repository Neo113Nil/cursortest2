package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f4655a;

    public i0(Unsafe unsafe) {
        this.f4655a = unsafe;
    }

    public final int a(Class cls) {
        return this.f4655a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f4655a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j4, Object obj);

    public abstract double d(long j4, Object obj);

    public abstract float e(long j4, Object obj);

    public final int f(long j4, Object obj) {
        return this.f4655a.getInt(obj, j4);
    }

    public final long g(long j4, Object obj) {
        return this.f4655a.getLong(obj, j4);
    }

    public final Object h(long j4, Object obj) {
        return this.f4655a.getObject(obj, j4);
    }

    public final long i(Field field) {
        return this.f4655a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j4, boolean z);

    public abstract void k(Object obj, long j4, byte b4);

    public abstract void l(Object obj, long j4, double d4);

    public abstract void m(Object obj, long j4, float f4);

    public final void n(long j4, Object obj, int i4) {
        this.f4655a.putInt(obj, j4, i4);
    }

    public final void o(Object obj, long j4, long j5) {
        this.f4655a.putLong(obj, j4, j5);
    }

    public final void p(long j4, Object obj, Object obj2) {
        this.f4655a.putObject(obj, j4, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f4655a;
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
            j0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
