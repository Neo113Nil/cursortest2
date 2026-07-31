package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f710a;

    public j1(Unsafe unsafe) {
        this.f710a = unsafe;
    }

    public final int a(Class cls) {
        return this.f710a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f710a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j7, Object obj);

    public abstract double d(long j7, Object obj);

    public abstract float e(long j7, Object obj);

    public final int f(long j7, Object obj) {
        return this.f710a.getInt(obj, j7);
    }

    public final long g(long j7, Object obj) {
        return this.f710a.getLong(obj, j7);
    }

    public final Object h(long j7, Object obj) {
        return this.f710a.getObject(obj, j7);
    }

    public final long i(Field field) {
        return this.f710a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j7, boolean z3);

    public abstract void k(Object obj, long j7, byte b8);

    public abstract void l(Object obj, long j7, double d8);

    public abstract void m(Object obj, long j7, float f6);

    public final void n(Object obj, long j7, int i) {
        this.f710a.putInt(obj, j7, i);
    }

    public final void o(Object obj, long j7, long j8) {
        this.f710a.putLong(obj, j7, j8);
    }

    public final void p(Object obj, long j7, Object obj2) {
        this.f710a.putObject(obj, j7, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f710a;
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
            k1.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
