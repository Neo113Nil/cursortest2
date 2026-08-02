package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239l0 extends AbstractC0216d1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f2875b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2876c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2877d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2878e;
    public static final long f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f2879g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0236k0());
        }
        try {
            f2877d = unsafe.objectFieldOffset(AbstractC0245n0.class.getDeclaredField("c"));
            f2876c = unsafe.objectFieldOffset(AbstractC0245n0.class.getDeclaredField("b"));
            f2878e = unsafe.objectFieldOffset(AbstractC0245n0.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(C0242m0.class.getDeclaredField("a"));
            f2879g = unsafe.objectFieldOffset(C0242m0.class.getDeclaredField("b"));
            f2875b = unsafe;
        } catch (NoSuchFieldException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final boolean D(AbstractC0245n0 abstractC0245n0, Object obj, Object obj2) {
        return AbstractC0254q0.a(f2875b, abstractC0245n0, f2878e, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final boolean F(AbstractC0245n0 abstractC0245n0, C0242m0 c0242m0, C0242m0 c0242m02) {
        return AbstractC0254q0.a(f2875b, abstractC0245n0, f2877d, c0242m0, c0242m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final C0221f0 d(AbstractC0245n0 abstractC0245n0) {
        C0221f0 c0221f0;
        C0221f0 c0221f02 = C0221f0.f2855d;
        do {
            c0221f0 = abstractC0245n0.f2891b;
            if (c0221f02 == c0221f0) {
                break;
            }
        } while (!z(abstractC0245n0, c0221f0, c0221f02));
        return c0221f0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final C0242m0 o(AbstractC0245n0 abstractC0245n0) {
        C0242m0 c0242m0;
        C0242m0 c0242m02 = C0242m0.f2883c;
        do {
            c0242m0 = abstractC0245n0.f2892c;
            if (c0242m02 == c0242m0) {
                break;
            }
        } while (!F(abstractC0245n0, c0242m0, c0242m02));
        return c0242m0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final void s(C0242m0 c0242m0, C0242m0 c0242m02) {
        f2875b.putObject(c0242m0, f2879g, c0242m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final void u(C0242m0 c0242m0, Thread thread) {
        f2875b.putObject(c0242m0, f, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final boolean z(AbstractC0245n0 abstractC0245n0, C0221f0 c0221f0, C0221f0 c0221f02) {
        return AbstractC0254q0.a(f2875b, abstractC0245n0, f2876c, c0221f0, c0221f02);
    }
}
