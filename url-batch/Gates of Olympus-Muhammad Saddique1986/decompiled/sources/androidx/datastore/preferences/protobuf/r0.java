package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f5121a;

    public r0(Unsafe unsafe) {
        this.f5121a = unsafe;
    }

    public final int a(Class cls) {
        return this.f5121a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f5121a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j3, Object obj);

    public abstract byte d(long j3, Object obj);

    public abstract double e(long j3, Object obj);

    public abstract float f(long j3, Object obj);

    public final int g(long j3, Object obj) {
        return this.f5121a.getInt(obj, j3);
    }

    public final long h(long j3, Object obj) {
        return this.f5121a.getLong(obj, j3);
    }

    public final Object i(long j3, Object obj) {
        return this.f5121a.getObject(obj, j3);
    }

    public final long j(Field field) {
        return this.f5121a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j3, boolean z3);

    public abstract void l(Object obj, long j3, byte b3);

    public abstract void m(Object obj, long j3, double d3);

    public abstract void n(Object obj, long j3, float f3);

    public final void o(int i3, long j3, Object obj) {
        this.f5121a.putInt(obj, j3, i3);
    }

    public final void p(Object obj, long j3, long j4) {
        this.f5121a.putLong(obj, j3, j4);
    }

    public final void q(long j3, Object obj, Object obj2) {
        this.f5121a.putObject(obj, j3, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f5121a;
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
