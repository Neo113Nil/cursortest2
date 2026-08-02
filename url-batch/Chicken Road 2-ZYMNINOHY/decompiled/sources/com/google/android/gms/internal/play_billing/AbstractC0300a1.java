package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0300a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f5931a;

    public AbstractC0300a1(Unsafe unsafe) {
        this.f5931a = unsafe;
    }

    public abstract double a(long j4, Object obj);

    public abstract float b(long j4, Object obj);

    public abstract void c(Object obj, long j4, boolean z);

    public abstract void d(Object obj, long j4, byte b4);

    public abstract void e(Object obj, long j4, double d4);

    public abstract void f(Object obj, long j4, float f4);

    public abstract boolean g(long j4, Object obj);
}
