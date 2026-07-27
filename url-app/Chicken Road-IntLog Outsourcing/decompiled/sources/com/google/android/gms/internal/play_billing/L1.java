package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class L1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f5077a;

    public L1(Unsafe unsafe) {
        this.f5077a = unsafe;
    }

    public abstract double a(long j2, Object obj);

    public abstract float b(long j2, Object obj);

    public abstract void c(Object obj, long j2, boolean z);

    public abstract void d(Object obj, long j2, byte b6);

    public abstract void e(Object obj, long j2, double d6);

    public abstract void f(Object obj, long j2, float f3);

    public abstract boolean g(long j2, Object obj);
}
