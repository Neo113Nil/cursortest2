package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class q0 extends r0 {
    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(long j4, Object obj) {
        return this.f5395a.getBoolean(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final byte d(long j4, Object obj) {
        return this.f5395a.getByte(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final double e(long j4, Object obj) {
        return this.f5395a.getDouble(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final float f(long j4, Object obj) {
        return this.f5395a.getFloat(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void k(Object obj, long j4, boolean z4) {
        this.f5395a.putBoolean(obj, j4, z4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(Object obj, long j4, byte b4) {
        this.f5395a.putByte(obj, j4, b4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void m(Object obj, long j4, double d4) {
        this.f5395a.putDouble(obj, j4, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void n(Object obj, long j4, float f4) {
        this.f5395a.putFloat(obj, j4, f4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f5395a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            s0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean s() {
        Unsafe unsafe = this.f5395a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (s0.e() != null) {
                    try {
                        Class<?> cls3 = this.f5395a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        s0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                s0.a(th2);
            }
        }
        return false;
    }
}
