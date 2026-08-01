package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f563a;

    public i1(Unsafe unsafe) {
        this.f563a = unsafe;
    }

    public final int a(Class cls) {
        return this.f563a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f563a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract double d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public final int f(long j, Object obj) {
        return this.f563a.getInt(obj, j);
    }

    public final long g(long j, Object obj) {
        return this.f563a.getLong(obj, j);
    }

    public final Object h(long j, Object obj) {
        return this.f563a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f563a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z10);

    public abstract void k(Object obj, long j, byte b10);

    public abstract void l(Object obj, long j, double d10);

    public abstract void m(Object obj, long j, float f3);

    public final void n(Object obj, long j, int i3) {
        this.f563a.putInt(obj, j, i3);
    }

    public final void o(Object obj, long j, long j3) {
        this.f563a.putLong(obj, j, j3);
    }

    public final void p(long j, Object obj, Object obj2) {
        this.f563a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f563a;
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
            j1.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
