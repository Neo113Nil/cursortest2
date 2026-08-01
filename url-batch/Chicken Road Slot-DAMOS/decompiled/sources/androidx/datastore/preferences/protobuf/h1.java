package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h1 extends i1 {
    @Override // androidx.datastore.preferences.protobuf.i1
    public final boolean c(long j, Object obj) {
        return this.f563a.getBoolean(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final double d(long j, Object obj) {
        return this.f563a.getDouble(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final float e(long j, Object obj) {
        return this.f563a.getFloat(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final void j(Object obj, long j, boolean z10) {
        this.f563a.putBoolean(obj, j, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final void k(Object obj, long j, byte b10) {
        this.f563a.putByte(obj, j, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final void l(Object obj, long j, double d10) {
        this.f563a.putDouble(obj, j, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final void m(Object obj, long j, float f3) {
        this.f563a.putFloat(obj, j, f3);
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f563a.getClass();
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
            j1.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final boolean r() {
        Unsafe unsafe = this.f563a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (j1.g() != null) {
                    try {
                        Class<?> cls3 = this.f563a.getClass();
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
                        j1.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                j1.a(th2);
            }
        }
        return false;
    }
}
