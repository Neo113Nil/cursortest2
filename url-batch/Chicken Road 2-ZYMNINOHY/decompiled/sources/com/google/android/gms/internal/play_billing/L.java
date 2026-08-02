package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class L extends O3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f5866a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f5867b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f5868c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f5869d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f5870e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5871f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e4) {
                throw new RuntimeException("Could not initialize intrinsics", e4.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new Q());
        }
        try {
            f5868c = unsafe.objectFieldOffset(N.class.getDeclaredField("c"));
            f5867b = unsafe.objectFieldOffset(N.class.getDeclaredField("b"));
            f5869d = unsafe.objectFieldOffset(N.class.getDeclaredField("a"));
            f5870e = unsafe.objectFieldOffset(M.class.getDeclaredField("a"));
            f5871f = unsafe.objectFieldOffset(M.class.getDeclaredField("b"));
            f5866a = unsafe;
        } catch (NoSuchFieldException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // O3.d
    public final H K(Z z) {
        H h2;
        H h4 = H.f5845d;
        do {
            h2 = z.f5892b;
            if (h4 == h2) {
                break;
            }
        } while (!Q(z, h2, h4));
        return h2;
    }

    @Override // O3.d
    public final M M(Z z) {
        M m4;
        M m5 = M.f5873c;
        do {
            m4 = z.f5893c;
            if (m5 == m4) {
                break;
            }
        } while (!S(z, m4, m5));
        return m4;
    }

    @Override // O3.d
    public final void O(M m4, M m5) {
        f5866a.putObject(m4, f5871f, m5);
    }

    @Override // O3.d
    public final void P(M m4, Thread thread) {
        f5866a.putObject(m4, f5870e, thread);
    }

    @Override // O3.d
    public final boolean Q(Z z, H h2, H h4) {
        return P.a(f5866a, z, f5867b, h2, h4);
    }

    @Override // O3.d
    public final boolean R(N n, Object obj, Object obj2) {
        return P.a(f5866a, n, f5869d, obj, obj2);
    }

    @Override // O3.d
    public final boolean S(N n, M m4, M m5) {
        return P.a(f5866a, n, f5868c, m4, m5);
    }
}
