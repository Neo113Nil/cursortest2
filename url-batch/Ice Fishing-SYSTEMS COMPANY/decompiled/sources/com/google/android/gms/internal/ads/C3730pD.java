package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.pD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3730pD extends AbstractC3406jD {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f33347a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f33348b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f33349c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f33350d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f33351e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f33352f;

    static {
        Unsafe p6;
        try {
            try {
                p6 = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    p6 = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, C3891sD.f34214a);
                } catch (Exception unused2) {
                    p6 = p();
                    Unsafe unsafe = p6;
                }
            }
            try {
                f33349c = p6.objectFieldOffset(AbstractC3837rD.class.getDeclaredField("v"));
                f33348b = p6.objectFieldOffset(AbstractC3837rD.class.getDeclaredField("u"));
                f33350d = p6.objectFieldOffset(AbstractC3837rD.class.getDeclaredField("n"));
                f33351e = p6.objectFieldOffset(C3784qD.class.getDeclaredField("a"));
                f33352f = p6.objectFieldOffset(C3784qD.class.getDeclaredField("b"));
                f33347a = p6;
            } catch (NoSuchFieldException e6) {
                throw new RuntimeException(e6);
            }
        } catch (Exception e9) {
            throw new RuntimeException("Could not initialize intrinsics", e9);
        }
    }

    public static /* synthetic */ Unsafe p() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final void e(C3784qD c3784qD, Thread thread) {
        f33347a.putObject(c3784qD, f33351e, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final void g(C3784qD c3784qD, C3784qD c3784qD2) {
        f33347a.putObject(c3784qD, f33352f, c3784qD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final boolean i(AbstractC3837rD abstractC3837rD, C3784qD c3784qD, C3784qD c3784qD2) {
        return AbstractC3676oD.a(f33347a, abstractC3837rD, f33349c, c3784qD, c3784qD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final boolean k(AbstractC3354iD abstractC3354iD, C3191fD c3191fD, C3191fD c3191fD2) {
        return AbstractC3568mD.a(f33347a, abstractC3354iD, f33348b, c3191fD, c3191fD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final C3784qD l(AbstractC3354iD abstractC3354iD) {
        C3784qD c3784qD;
        C3784qD c3784qD2 = C3784qD.f33669c;
        do {
            c3784qD = abstractC3354iD.f33994v;
            if (c3784qD2 == c3784qD) {
                break;
            }
        } while (!i(abstractC3354iD, c3784qD, c3784qD2));
        return c3784qD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final C3191fD n(AbstractC3354iD abstractC3354iD) {
        C3191fD c3191fD;
        C3191fD c3191fD2 = C3191fD.f30633d;
        do {
            c3191fD = abstractC3354iD.f33993u;
            if (c3191fD2 == c3191fD) {
                break;
            }
        } while (!k(abstractC3354iD, c3191fD, c3191fD2));
        return c3191fD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final boolean o(AbstractC3837rD abstractC3837rD, Object obj, Object obj2) {
        return AbstractC3622nD.a(f33347a, abstractC3837rD, f33350d, obj, obj2);
    }
}
