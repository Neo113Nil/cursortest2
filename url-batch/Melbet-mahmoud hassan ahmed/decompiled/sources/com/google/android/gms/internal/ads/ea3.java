package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class ea3 extends u93 {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f4542a;

    /* renamed from: b, reason: collision with root package name */
    static final long f4543b;

    /* renamed from: c, reason: collision with root package name */
    static final long f4544c;

    /* renamed from: d, reason: collision with root package name */
    static final long f4545d;

    /* renamed from: e, reason: collision with root package name */
    static final long f4546e;

    /* renamed from: f, reason: collision with root package name */
    static final long f4547f;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        public static final Unsafe a() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e7) {
                throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            f4544c = unsafe.objectFieldOffset(ga3.class.getDeclaredField("h"));
            f4543b = unsafe.objectFieldOffset(ga3.class.getDeclaredField("g"));
            f4545d = unsafe.objectFieldOffset(ga3.class.getDeclaredField("f"));
            f4546e = unsafe.objectFieldOffset(fa3.class.getDeclaredField("a"));
            f4547f = unsafe.objectFieldOffset(fa3.class.getDeclaredField("b"));
            f4542a = unsafe;
        } catch (Exception e8) {
            d53.b(e8);
            throw new RuntimeException(e8);
        }
    }

    /* synthetic */ ea3(ia3 ia3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final void a(fa3 fa3Var, fa3 fa3Var2) {
        f4542a.putObject(fa3Var, f4547f, fa3Var2);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final void b(fa3 fa3Var, Thread thread) {
        f4542a.putObject(fa3Var, f4546e, thread);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final boolean c(ga3<?> ga3Var, x93 x93Var, x93 x93Var2) {
        return da3.a(f4542a, ga3Var, f4543b, x93Var, x93Var2);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final boolean d(ga3<?> ga3Var, Object obj, Object obj2) {
        return da3.a(f4542a, ga3Var, f4545d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final boolean e(ga3<?> ga3Var, fa3 fa3Var, fa3 fa3Var2) {
        return da3.a(f4542a, ga3Var, f4544c, fa3Var, fa3Var2);
    }
}
