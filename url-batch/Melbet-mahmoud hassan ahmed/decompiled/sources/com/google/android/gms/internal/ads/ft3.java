package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class ft3 {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f5218a;

    ft3(Unsafe unsafe) {
        this.f5218a = unsafe;
    }

    public abstract byte a(long j7);

    public abstract double b(Object obj, long j7);

    public abstract float c(Object obj, long j7);

    public abstract void d(long j7, byte[] bArr, long j8, long j9);

    public abstract void e(Object obj, long j7, boolean z6);

    public abstract void f(Object obj, long j7, byte b7);

    public abstract void g(Object obj, long j7, double d7);

    public abstract void h(Object obj, long j7, float f7);

    public abstract boolean i(Object obj, long j7);

    public final int j(Class<?> cls) {
        return this.f5218a.arrayBaseOffset(cls);
    }

    public final int k(Class<?> cls) {
        return this.f5218a.arrayIndexScale(cls);
    }

    public final int l(Object obj, long j7) {
        return this.f5218a.getInt(obj, j7);
    }

    public final long m(Object obj, long j7) {
        return this.f5218a.getLong(obj, j7);
    }

    public final long n(Field field) {
        return this.f5218a.objectFieldOffset(field);
    }

    public final Object o(Object obj, long j7) {
        return this.f5218a.getObject(obj, j7);
    }

    public final void p(Object obj, long j7, int i7) {
        this.f5218a.putInt(obj, j7, i7);
    }

    public final void q(Object obj, long j7, long j8) {
        this.f5218a.putLong(obj, j7, j8);
    }

    public final void r(Object obj, long j7, Object obj2) {
        this.f5218a.putObject(obj, j7, obj2);
    }
}
