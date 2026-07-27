package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class g0 extends h0 {
    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(long j2, Object obj) {
        return this.f4447a.getBoolean(obj, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(long j2, Object obj) {
        return this.f4447a.getDouble(obj, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(long j2, Object obj) {
        return this.f4447a.getFloat(obj, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j2, boolean z) {
        this.f4447a.putBoolean(obj, j2, z);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j2, byte b6) {
        this.f4447a.putByte(obj, j2, b6);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j2, double d6) {
        this.f4447a.putDouble(obj, j2, d6);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j2, float f3) {
        this.f4447a.putFloat(obj, j2, f3);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f4447a.getClass();
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
            i0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        Unsafe unsafe = this.f4447a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (i0.g() != null) {
                    try {
                        Class<?> cls3 = this.f4447a.getClass();
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
                        i0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                i0.a(th2);
            }
        }
        return false;
    }
}
