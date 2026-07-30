package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f895a;

    public q1(Unsafe unsafe) {
        this.f895a = unsafe;
    }

    public final int a(Class cls) {
        return this.f895a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f895a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j8, Object obj);

    public abstract byte d(long j8, Object obj);

    public abstract double e(long j8, Object obj);

    public abstract float f(long j8, Object obj);

    public final int g(long j8, Object obj) {
        return this.f895a.getInt(obj, j8);
    }

    public final long h(long j8, Object obj) {
        return this.f895a.getLong(obj, j8);
    }

    public final Object i(long j8, Object obj) {
        return this.f895a.getObject(obj, j8);
    }

    public final long j(Field field) {
        return this.f895a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j8, boolean z8);

    public abstract void l(Object obj, long j8, byte b9);

    public abstract void m(Object obj, long j8, double d8);

    public abstract void n(Object obj, long j8, float f9);

    public final void o(int i7, long j8, Object obj) {
        this.f895a.putInt(obj, j8, i7);
    }

    public final void p(Object obj, long j8, long j9) {
        this.f895a.putLong(obj, j8, j9);
    }

    public final void q(long j8, Object obj, Object obj2) {
        this.f895a.putObject(obj, j8, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f895a;
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
            r1.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
