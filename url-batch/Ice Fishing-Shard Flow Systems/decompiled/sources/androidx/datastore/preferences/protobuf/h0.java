package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f3509a;

    public h0(Unsafe unsafe) {
        this.f3509a = unsafe;
    }

    public final int a(Class cls) {
        return this.f3509a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f3509a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract double d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public final int f(long j, Object obj) {
        return this.f3509a.getInt(obj, j);
    }

    public final long g(long j, Object obj) {
        return this.f3509a.getLong(obj, j);
    }

    public final Object h(long j, Object obj) {
        return this.f3509a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f3509a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z7);

    public abstract void k(Object obj, long j, byte b7);

    public abstract void l(Object obj, long j, double d7);

    public abstract void m(Object obj, long j, float f7);

    public final void n(Object obj, long j, int i2) {
        this.f3509a.putInt(obj, j, i2);
    }

    public final void o(Object obj, long j, long j7) {
        this.f3509a.putLong(obj, j, j7);
    }

    public final void p(long j, Object obj, Object obj2) {
        this.f3509a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f3509a;
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
            i0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
