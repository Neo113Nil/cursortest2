package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i1 extends j1 {
    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean c(long j7, Object obj) {
        return this.f710a.getBoolean(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final double d(long j7, Object obj) {
        return this.f710a.getDouble(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final float e(long j7, Object obj) {
        return this.f710a.getFloat(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void j(Object obj, long j7, boolean z3) {
        this.f710a.putBoolean(obj, j7, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void k(Object obj, long j7, byte b8) {
        this.f710a.putByte(obj, j7, b8);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void l(Object obj, long j7, double d8) {
        this.f710a.putDouble(obj, j7, d8);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void m(Object obj, long j7, float f6) {
        this.f710a.putFloat(obj, j7, f6);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f710a.getClass();
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
            k1.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean r() {
        Unsafe unsafe = this.f710a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (k1.g() != null) {
                    try {
                        Class<?> cls3 = this.f710a.getClass();
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
                        k1.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                k1.a(th2);
            }
        }
        return false;
    }
}
