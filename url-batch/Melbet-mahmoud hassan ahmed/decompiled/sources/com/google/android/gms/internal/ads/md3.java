package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class md3 {

    /* renamed from: a, reason: collision with root package name */
    private final bl3 f8502a;

    private md3(bl3 bl3Var) {
        this.f8502a = bl3Var;
    }

    static final md3 a(bl3 bl3Var) {
        if (bl3Var == null || bl3Var.F() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new md3(bl3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <P> P b(Class<P> cls) {
        Class<?> e7 = ee3.e(cls);
        if (e7 == null) {
            String name = cls.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        fe3.b(this.f8502a);
        ud3 c7 = ud3.c(e7);
        for (al3 al3Var : this.f8502a.J()) {
            if (al3Var.J() == 3) {
                rd3 a7 = c7.a(ee3.f(al3Var.G(), e7), al3Var);
                if (al3Var.F() == this.f8502a.G()) {
                    c7.e(a7);
                }
            }
        }
        return (P) ee3.i(c7, cls);
    }

    public final String toString() {
        return fe3.a(this.f8502a).toString();
    }
}
